package r2;

import java.util.AbstractList;
import java.util.List;

/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0691d extends AbstractList implements List {
    public abstract int i();

    public abstract Object j(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i3) {
        return j(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return i();
    }
}
