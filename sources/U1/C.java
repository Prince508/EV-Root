package U1;

import T1.b;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class C extends T1.b {

    /* renamed from: h, reason: collision with root package name */
    public volatile int f2098h;

    /* renamed from: i, reason: collision with root package name */
    public final Process f2099i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2100j;

    /* renamed from: k, reason: collision with root package name */
    public final a f2101k;

    /* renamed from: l, reason: collision with root package name */
    public final a f2102l;

    /* renamed from: m, reason: collision with root package name */
    public final ReentrantLock f2103m;

    /* renamed from: n, reason: collision with root package name */
    public final Condition f2104n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f2105o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2106p;

    public static class b extends FilterOutputStream {
        public b(OutputStream outputStream) {
            super(outputStream instanceof BufferedOutputStream ? outputStream : new BufferedOutputStream(outputStream));
        }

        public void a() {
            super.close();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ((FilterOutputStream) this).out.flush();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) {
            ((FilterOutputStream) this).out.write(bArr, i3, i4);
        }
    }

    public C(C0291c c0291c, Process process) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f2103m = reentrantLock;
        this.f2104n = reentrantLock.newCondition();
        this.f2105o = new ArrayDeque();
        this.f2106p = false;
        this.f2098h = -1;
        this.f2099i = process;
        this.f2100j = new b(process.getOutputStream());
        this.f2101k = new a(process.getInputStream());
        this.f2102l = new a(process.getErrorStream());
        FutureTask futureTask = new FutureTask(new Callable() { // from class: U1.A
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer k3;
                k3 = C.this.k();
                return k3;
            }
        });
        T1.b.f2056e.execute(futureTask);
        try {
            try {
                this.f2098h = ((Integer) futureTask.get(c0291c.f2116a, TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException e3) {
                throw new IOException("Shell check interrupted", e3);
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof IOException)) {
                    throw new IOException("Unknown ExecutionException", cause);
                }
                throw ((IOException) cause);
            } catch (TimeoutException e5) {
                throw new IOException("Shell check timeout", e5);
            }
        } catch (IOException e6) {
            j();
            throw e6;
        }
    }

    @Override // T1.b
    public void a(b.c cVar) {
        this.f2103m.lock();
        try {
            if (this.f2106p) {
                c cVar2 = new c(this.f2103m.newCondition());
                this.f2105o.offer(cVar2);
                cVar2.c();
            }
            this.f2106p = true;
            this.f2103m.unlock();
            g(cVar);
            h(true);
        } catch (Throwable th) {
            this.f2103m.unlock();
            throw th;
        }
    }

    @Override // T1.b
    public int c() {
        return this.f2098h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2098h < 0) {
            return;
        }
        j();
    }

    public final synchronized void g(b.c cVar) {
        if (this.f2098h < 0) {
            cVar.b();
            return;
        }
        T1.c.a(this.f2101k);
        T1.c.a(this.f2102l);
        try {
            this.f2100j.write(10);
            this.f2100j.flush();
            cVar.a(this.f2100j, this.f2101k, this.f2102l);
        } catch (IOException unused) {
            j();
            cVar.b();
        }
    }

    public final b.c h(boolean z3) {
        this.f2103m.lock();
        try {
            b.c cVar = (b.c) this.f2105o.poll();
            if (cVar == null) {
                this.f2106p = false;
                this.f2104n.signalAll();
                return null;
            }
            if (cVar instanceof c) {
                ((c) cVar).d();
                return null;
            }
            if (!z3) {
                return cVar;
            }
            this.f2105o.offerFirst(cVar);
            this.f2103m.unlock();
            T1.b.f2056e.execute(new Runnable() { // from class: U1.B
                @Override // java.lang.Runnable
                public final void run() {
                    C.this.i();
                }
            });
            return null;
        } finally {
            this.f2103m.unlock();
        }
    }

    public final void i() {
        while (true) {
            b.c h3 = h(false);
            if (h3 == null) {
                return;
            } else {
                try {
                    g(h3);
                } catch (IOException unused) {
                }
            }
        }
    }

    public final void j() {
        this.f2098h = -1;
        try {
            this.f2100j.a();
        } catch (IOException unused) {
        }
        try {
            this.f2102l.a();
        } catch (IOException unused2) {
        }
        try {
            this.f2101k.a();
        } catch (IOException unused3) {
        }
        this.f2099i.destroy();
    }

    public final Integer k() {
        int i3;
        try {
            this.f2099i.exitValue();
            throw new IOException("Created process has terminated");
        } catch (IllegalThreadStateException unused) {
            T1.c.a(this.f2101k);
            T1.c.a(this.f2102l);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f2101k));
            try {
                b bVar = this.f2100j;
                Charset charset = StandardCharsets.UTF_8;
                bVar.write("echo SHELL_TEST\n".getBytes(charset));
                this.f2100j.flush();
                String readLine = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine) || !readLine.contains("SHELL_TEST")) {
                    throw new IOException("Created process is not a shell");
                }
                this.f2100j.write("id\n".getBytes(charset));
                this.f2100j.flush();
                String readLine2 = bufferedReader.readLine();
                if (TextUtils.isEmpty(readLine2) || !readLine2.contains("uid=0")) {
                    i3 = 0;
                } else {
                    i3 = 1;
                    F.k(true);
                    String b3 = T1.c.b(System.getProperty("user.dir"));
                    this.f2100j.write(("cd " + b3 + "\n").getBytes(charset));
                    this.f2100j.flush();
                }
                bufferedReader.close();
                return Integer.valueOf(i3);
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        public void a() {
            ((FilterInputStream) this).in.close();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static final class c implements b.c {

        /* renamed from: a, reason: collision with root package name */
        public final Condition f2107a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2108b = false;

        public c(Condition condition) {
            this.f2107a = condition;
        }

        public void c() {
            while (!this.f2108b) {
                try {
                    this.f2107a.await();
                } catch (InterruptedException unused) {
                }
            }
        }

        public void d() {
            this.f2108b = true;
            this.f2107a.signal();
        }

        @Override // T1.b.c
        public void a(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        }
    }
}
