package kotlin.coroutines.jvm.internal;

import A1.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  EasyVictory_Root_1.4.6.apk:assets/data:DebugProbesKt.bin
 */
/* compiled from: DebugProbes.kt */
@Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"��\u0012\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010��\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b��\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H��\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H��¨\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlinx-coroutines-integration-testing_debugAgentTest"})
/* loaded from: EasyVictory_Root_1.4.6.apk:DebugProbesKt.bin */
public final class DebugProbesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Continuation<T> probeCoroutineCreated(@NotNull Continuation<? super T> continuation) {
        a.<clinit>();
        return (Continuation<T>) DebugProbesImpl.INSTANCE.a(continuation);
    }

    public static final void probeCoroutineResumed(@NotNull Continuation<?> continuation) {
        a.<clinit>();
        DebugProbesImpl.INSTANCE.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [B.a, B.j, float, kotlinx.coroutines.debug.internal.DebugProbesImpl] */
    public static final void probeCoroutineSuspended(@NotNull Continuation<?> continuation) {
        a.<clinit>();
        ?? r02 = DebugProbesImpl.INSTANCE;
        r02.n(continuation, r02, r02, r02);
    }
}
