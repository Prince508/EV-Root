package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.lifecycle.InterfaceC0342c;
import androidx.lifecycle.l;
import androidx.lifecycle.u;
import c.InterfaceC0370a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f7562a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f7564c;

    /* renamed from: h, reason: collision with root package name */
    public final j f7569h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f7563b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f7565d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f7566e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final Set f7567f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final List f7568g = new ArrayList();

    @InterfaceC0370a
    @TargetApi(29)
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        private TextureRegistry.SurfaceProducer.a callback;
        private final long id;
        private boolean released;
        private boolean ignoringFence = VERBOSE_LOGS;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<b> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, b> perImageReaders = new HashMap<>();
        private a lastDequeuedImage = null;
        private b lastReaderDequeuedFrom = null;

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final Image f7570a;

            /* renamed from: b, reason: collision with root package name */
            public final long f7571b;

            public a(Image image, long j3) {
                this.f7570a = image;
                this.f7571b = j3;
            }
        }

        public class b {

            /* renamed from: a, reason: collision with root package name */
            public final ImageReader f7573a;

            /* renamed from: b, reason: collision with root package name */
            public final ArrayDeque f7574b = new ArrayDeque();

            /* renamed from: c, reason: collision with root package name */
            public boolean f7575c = ImageReaderSurfaceProducer.VERBOSE_LOGS;

            public b(ImageReader imageReader) {
                this.f7573a = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.i
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.b.a(FlutterRenderer.ImageReaderSurfaceProducer.b.this, imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            public static /* synthetic */ void a(b bVar, ImageReader imageReader) {
                Image image;
                bVar.getClass();
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e3) {
                    W1.b.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e3);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || bVar.f7575c) {
                    image.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                }
            }

            public boolean c() {
                if (!this.f7574b.isEmpty() || ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom == this) {
                    return ImageReaderSurfaceProducer.VERBOSE_LOGS;
                }
                return true;
            }

            public void d() {
                this.f7575c = true;
                this.f7573a.close();
                this.f7574b.clear();
            }

            public a e() {
                if (this.f7574b.isEmpty()) {
                    return null;
                }
                return (a) this.f7574b.removeFirst();
            }

            public a f(Image image) {
                if (this.f7575c) {
                    return null;
                }
                a aVar = ImageReaderSurfaceProducer.this.new a(image, System.nanoTime());
                this.f7574b.add(aVar);
                while (this.f7574b.size() > 2) {
                    ((a) this.f7574b.removeFirst()).f7570a.close();
                }
                return aVar;
            }
        }

        public ImageReaderSurfaceProducer(long j3) {
            this.id = j3;
        }

        public static /* synthetic */ TextureRegistry.SurfaceProducer.a access$200(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            imageReaderSurfaceProducer.getClass();
            return null;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (b bVar : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == bVar) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        bVar.d();
                    }
                    this.perImageReaders.clear();
                    a aVar = this.lastDequeuedImage;
                    if (aVar != null) {
                        aVar.f7570a.close();
                        this.lastDequeuedImage = null;
                    }
                    b bVar2 = this.lastReaderDequeuedFrom;
                    if (bVar2 != null) {
                        bVar2.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader() {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33) {
                return createImageReader33();
            }
            if (i3 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            ImageReader newInstance;
            newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
            return newInstance;
        }

        @TargetApi(33)
        private ImageReader createImageReader33() {
            ImageReader build;
            h.a();
            ImageReader.Builder a3 = io.flutter.embedding.engine.renderer.g.a(this.requestedWidth, this.requestedHeight);
            a3.setMaxImages(5);
            a3.setImageFormat(34);
            a3.setUsage(256L);
            build = a3.build();
            return build;
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        return this.imageReaderQueue.peekLast();
                    }
                    this.createNewReader = VERBOSE_LOGS;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                W1.b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.f7568g.remove(this);
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            a dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.f7570a);
            return dequeueImage.f7570a;
        }

        public double deltaMillis(long j3) {
            return j3 / 1000000.0d;
        }

        public a dequeueImage() {
            a aVar;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    aVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b next = it.next();
                        a e3 = next.e();
                        if (e3 == null) {
                            aVar = e3;
                        } else {
                            a aVar2 = this.lastDequeuedImage;
                            if (aVar2 != null) {
                                aVar2.f7570a.close();
                            }
                            this.lastDequeuedImage = e3;
                            this.lastReaderDequeuedFrom = next;
                            aVar = e3;
                        }
                    }
                    pruneImageReaderQueue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.f7566e.post(new f(this.id, FlutterRenderer.this.f7562a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        public b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = this.perImageReaders.get(imageReader);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(imageReader);
            this.perImageReaders.put(imageReader, bVar2);
            this.imageReaderQueue.add(bVar2);
            return bVar2;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().f7573a.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i3;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        i3 += it.next().f7574b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i3;
        }

        public int numTrims() {
            int i3;
            synchronized (this.lock) {
                i3 = this.numTrims;
            }
            return i3;
        }

        public void onImage(ImageReader imageReader, Image image) {
            a f3;
            synchronized (this.lock) {
                f3 = getOrCreatePerImageReader(imageReader).f(image);
            }
            if (f3 == null) {
                return;
            }
            FlutterRenderer.this.m();
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i3) {
            if (i3 < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            cleanup();
            this.createNewReader = true;
        }

        public void pruneImageReaderQueue() {
            b peekFirst;
            while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null && peekFirst.c()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.f7573a);
                peekFirst.d();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.t(this.id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.m();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i3, int i4) {
            int max = Math.max(1, i3);
            int max2 = Math.max(1, i4);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }

    @InterfaceC0370a
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j3) {
            this.id = j3;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                W1.b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f7566e.post(new f(this.id, FlutterRenderer.this.f7562a));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                W1.b.b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.m();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.t(this.id);
        }
    }

    public class a implements j {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
            FlutterRenderer.this.f7565d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            FlutterRenderer.this.f7565d = true;
        }
    }

    public class b implements InterfaceC0342c {
        public b() {
        }

        @Override // androidx.lifecycle.InterfaceC0342c
        public void a(l lVar) {
            W1.b.f("FlutterRenderer", "onResume called; notifying SurfaceProducers");
            Iterator it = FlutterRenderer.this.f7568g.iterator();
            while (it.hasNext()) {
                ImageReaderSurfaceProducer.access$200((ImageReaderSurfaceProducer) it.next());
            }
        }
    }

    public enum d {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* renamed from: e, reason: collision with root package name */
        public final int f7586e;

        d(int i3) {
            this.f7586e = i3;
        }
    }

    public enum e {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* renamed from: e, reason: collision with root package name */
        public final int f7592e;

        e(int i3) {
            this.f7592e = i3;
        }
    }

    public static final class f implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final long f7593e;

        /* renamed from: f, reason: collision with root package name */
        public final FlutterJNI f7594f;

        public f(long j3, FlutterJNI flutterJNI) {
            this.f7593e = j3;
            this.f7594f = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7594f.isAttached()) {
                W1.b.f("FlutterRenderer", "Releasing a Texture (" + this.f7593e + ").");
                this.f7594f.unregisterTexture(this.f7593e);
            }
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public float f7595a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        public int f7596b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f7597c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f7598d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f7599e = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f7600f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f7601g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f7602h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f7603i = 0;

        /* renamed from: j, reason: collision with root package name */
        public int f7604j = 0;

        /* renamed from: k, reason: collision with root package name */
        public int f7605k = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f7606l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f7607m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f7608n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f7609o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f7610p = -1;

        /* renamed from: q, reason: collision with root package name */
        public List f7611q = new ArrayList();

        public boolean a() {
            return this.f7596b > 0 && this.f7597c > 0 && this.f7595a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f7569h = aVar;
        this.f7562a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        u.o().h().a(new b());
    }

    public void g(j jVar) {
        this.f7562a.addIsDisplayingFlutterUiListener(jVar);
        if (this.f7565d) {
            jVar.f();
        }
    }

    public void h(ByteBuffer byteBuffer, int i3) {
        this.f7562a.dispatchPointerDataPacket(byteBuffer, i3);
    }

    public boolean i() {
        return this.f7565d;
    }

    public boolean j() {
        return this.f7562a.getIsSoftwareRenderingEnabled();
    }

    public void k(int i3) {
        Iterator it = this.f7567f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = (TextureRegistry.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public void l(j jVar) {
        this.f7562a.removeIsDisplayingFlutterUiListener(jVar);
    }

    public final void m() {
        this.f7562a.scheduleFrame();
    }

    public void n(boolean z3) {
        this.f7562a.setSemanticsEnabled(z3);
    }

    public void o(g gVar) {
        if (gVar.a()) {
            W1.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f7596b + " x " + gVar.f7597c + "\nPadding - L: " + gVar.f7601g + ", T: " + gVar.f7598d + ", R: " + gVar.f7599e + ", B: " + gVar.f7600f + "\nInsets - L: " + gVar.f7605k + ", T: " + gVar.f7602h + ", R: " + gVar.f7603i + ", B: " + gVar.f7604j + "\nSystem Gesture Insets - L: " + gVar.f7609o + ", T: " + gVar.f7606l + ", R: " + gVar.f7607m + ", B: " + gVar.f7607m + "\nDisplay Features: " + gVar.f7611q.size());
            int[] iArr = new int[gVar.f7611q.size() * 4];
            int[] iArr2 = new int[gVar.f7611q.size()];
            int[] iArr3 = new int[gVar.f7611q.size()];
            for (int i3 = 0; i3 < gVar.f7611q.size(); i3++) {
                c cVar = (c) gVar.f7611q.get(i3);
                int i4 = i3 * 4;
                Rect rect = cVar.f7579a;
                iArr[i4] = rect.left;
                iArr[i4 + 1] = rect.top;
                iArr[i4 + 2] = rect.right;
                iArr[i4 + 3] = rect.bottom;
                iArr2[i3] = cVar.f7580b.f7592e;
                iArr3[i3] = cVar.f7581c.f7586e;
            }
            this.f7562a.setViewportMetrics(gVar.f7595a, gVar.f7596b, gVar.f7597c, gVar.f7598d, gVar.f7599e, gVar.f7600f, gVar.f7601g, gVar.f7602h, gVar.f7603i, gVar.f7604j, gVar.f7605k, gVar.f7606l, gVar.f7607m, gVar.f7608n, gVar.f7609o, gVar.f7610p, iArr, iArr2, iArr3);
        }
    }

    public void p(Surface surface, boolean z3) {
        if (!z3) {
            q();
        }
        this.f7564c = surface;
        if (z3) {
            this.f7562a.onSurfaceWindowChanged(surface);
        } else {
            this.f7562a.onSurfaceCreated(surface);
        }
    }

    public void q() {
        if (this.f7564c != null) {
            this.f7562a.onSurfaceDestroyed();
            if (this.f7565d) {
                this.f7569h.b();
            }
            this.f7565d = false;
            this.f7564c = null;
        }
    }

    public void r(int i3, int i4) {
        this.f7562a.onSurfaceChanged(i3, i4);
    }

    public void s(Surface surface) {
        this.f7564c = surface;
        this.f7562a.onSurfaceWindowChanged(surface);
    }

    public final void t(long j3) {
        this.f7562a.unregisterTexture(j3);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f7579a;

        /* renamed from: b, reason: collision with root package name */
        public final e f7580b;

        /* renamed from: c, reason: collision with root package name */
        public final d f7581c;

        public c(Rect rect, e eVar, d dVar) {
            this.f7579a = rect;
            this.f7580b = eVar;
            this.f7581c = dVar;
        }

        public c(Rect rect, e eVar) {
            this.f7579a = rect;
            this.f7580b = eVar;
            this.f7581c = d.UNKNOWN;
        }
    }
}
