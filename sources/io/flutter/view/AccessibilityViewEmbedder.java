package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import c.InterfaceC0370a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@InterfaceC0370a
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Method f7740a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f7741b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f7742c;

        /* renamed from: d, reason: collision with root package name */
        public final Method f7743d;

        /* renamed from: e, reason: collision with root package name */
        public final Field f7744e;

        /* renamed from: f, reason: collision with root package name */
        public final Method f7745f;

        public static int j(long j3) {
            return (int) (j3 >> 32);
        }

        public static boolean k(long j3, int i3) {
            return (j3 & (1 << i3)) != 0;
        }

        public static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                W1.b.g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }

        public final Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i3) {
            Method method = this.f7743d;
            if (method == null && (this.f7744e == null || this.f7745f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i3));
                } catch (IllegalAccessException e3) {
                    W1.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e3);
                } catch (InvocationTargetException e4) {
                    W1.b.h(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e4);
                }
            } else {
                try {
                    Long l3 = (Long) this.f7745f.invoke(this.f7744e.get(accessibilityNodeInfo), Integer.valueOf(i3));
                    l3.longValue();
                    return l3;
                } catch (ArrayIndexOutOfBoundsException e5) {
                    e = e5;
                    W1.b.h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (IllegalAccessException e6) {
                    W1.b.h(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e6);
                } catch (InvocationTargetException e7) {
                    e = e7;
                    W1.b.h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        public final Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f7741b;
            if (method != null) {
                try {
                    Long l3 = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                    l3.longValue();
                    return l3;
                } catch (IllegalAccessException e3) {
                    W1.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e3);
                } catch (InvocationTargetException e4) {
                    W1.b.h(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e4);
                }
            }
            return l(accessibilityNodeInfo);
        }

        public final Long h(AccessibilityRecord accessibilityRecord) {
            Method method = this.f7742c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e3) {
                W1.b.h(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                W1.b.h(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e4);
                return null;
            }
        }

        public final Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f7740a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e3) {
                W1.b.h(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                W1.b.h(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e4);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                W1.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                W1.b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            int i3 = Build.VERSION.SDK_INT;
            Class cls = Integer.TYPE;
            if (i3 > 26) {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = Class.forName("android.util.LongArray").getMethod("get", cls);
                    field = declaredField;
                    method4 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    W1.b.g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method4 = null;
                    field = null;
                }
                this.f7740a = method;
                this.f7741b = method6;
                this.f7742c = method2;
                this.f7743d = method4;
                this.f7744e = field;
                this.f7745f = method5;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                W1.b.g(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method3 = null;
            }
            try {
                method4 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
                field = null;
            } catch (NoSuchMethodException unused5) {
                W1.b.g(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method4 = null;
                field = null;
            }
            method6 = method3;
            method5 = field;
            this.f7740a = method;
            this.f7741b = method6;
            this.f7742c = method2;
            this.f7743d = method4;
            this.f7744e = field;
            this.f7745f = method5;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final View f7746a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7747b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f7747b == cVar.f7747b && this.f7746a.equals(cVar.f7746a);
        }

        public int hashCode() {
            return ((this.f7746a.hashCode() + 31) * 31) + this.f7747b;
        }

        public c(View view, int i3) {
            this.f7746a = view;
            this.f7747b = i3;
        }
    }

    public AccessibilityViewEmbedder(View view, int i3) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i3;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i3;
        for (int i4 = 0; i4 < accessibilityNodeInfo.getChildCount(); i4++) {
            Long f3 = this.reflectionAccessors.f(accessibilityNodeInfo, i4);
            if (f3 != null) {
                int j3 = b.j(f3.longValue());
                c cVar = new c(view, j3);
                if (this.originToFlutterId.containsKey(cVar)) {
                    i3 = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i5 = this.nextFlutterId;
                    this.nextFlutterId = i5 + 1;
                    cacheVirtualIdMappings(view, j3, i5);
                    i3 = i5;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i3);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i3, int i4) {
        c cVar = new c(view, i3);
        this.originToFlutterId.put(cVar, Integer.valueOf(i4));
        this.flutterIdToOrigin.put(i4, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i3, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i3);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i3);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i3 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i3 >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long g3 = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (g3 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(g3.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f7746a) || cVar.f7746a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f7746a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f7747b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i3, cVar.f7746a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long h3 = this.reflectionAccessors.h(accessibilityRecord);
        if (h3 == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(h3.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i3, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long i4 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (i4 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(i4.longValue()), i3);
        return convertToFlutterNode(createAccessibilityNodeInfo, i3, view);
    }

    public boolean onAccessibilityHoverEvent(int i3, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f7746a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i4] = pointerProperties;
            motionEvent.getPointerProperties(i4, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i4, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i4] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return cVar.f7746a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i3, int i4, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null || (accessibilityNodeProvider = cVar.f7746a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f7747b, i4, bundle);
    }

    public View platformViewOfNode(int i3) {
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null) {
            return null;
        }
        return cVar.f7746a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long h3 = this.reflectionAccessors.h(accessibilityEvent);
        if (h3 == null) {
            return false;
        }
        int j3 = b.j(h3.longValue());
        Integer num = this.originToFlutterId.get(new c(view, j3));
        if (num == null) {
            int i3 = this.nextFlutterId;
            this.nextFlutterId = i3 + 1;
            Integer valueOf = Integer.valueOf(i3);
            cacheVirtualIdMappings(view, j3, i3);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i4 = 0; i4 < obtain.getRecordCount(); i4++) {
            AccessibilityRecord record = obtain.getRecord(i4);
            Long h4 = this.reflectionAccessors.h(record);
            if (h4 == null) {
                return false;
            }
            c cVar = new c(view, b.j(h4.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
