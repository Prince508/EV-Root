package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import c.InterfaceC0370a;

/* loaded from: classes.dex */
public interface TextureRegistry {

    @InterfaceC0370a
    public interface GLTextureConsumer {
        SurfaceTexture getSurfaceTexture();
    }

    @InterfaceC0370a
    public interface ImageConsumer {
        Image acquireLatestImage();
    }

    @InterfaceC0370a
    public interface ImageTextureEntry {
        /* synthetic */ long id();

        void pushImage(Image image);

        /* synthetic */ void release();
    }

    @InterfaceC0370a
    public interface SurfaceProducer {

        public interface a {
        }

        int getHeight();

        Surface getSurface();

        int getWidth();

        /* synthetic */ long id();

        /* synthetic */ void release();

        void scheduleFrame();

        void setCallback(a aVar);

        void setSize(int i3, int i4);
    }

    @InterfaceC0370a
    public interface SurfaceTextureEntry {
        /* synthetic */ long id();

        /* synthetic */ void release();

        default void setOnFrameConsumedListener(a aVar) {
        }

        default void setOnTrimMemoryListener(b bVar) {
        }

        SurfaceTexture surfaceTexture();
    }

    public interface a {
    }

    public interface b {
        void onTrimMemory(int i3);
    }
}
