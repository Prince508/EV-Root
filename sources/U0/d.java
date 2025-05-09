package U0;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public abstract class d {
    public static c a(RandomAccessFile randomAccessFile, long j3, long j4) {
        return c(randomAccessFile.getChannel(), j3, j4);
    }

    public static c b(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        return new R0.a(byteBuffer);
    }

    public static c c(FileChannel fileChannel, long j3, long j4) {
        fileChannel.getClass();
        return new R0.g(fileChannel, j3, j4);
    }
}
