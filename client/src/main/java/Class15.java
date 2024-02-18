import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.com._Guid;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class15 implements IEnumModesCallback {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lcom/ms/directX/DirectDraw;")
	private final DirectDraw aDirectDraw1 = new DirectDraw();

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class15() {
		this.aDirectDraw1.initialize((_Guid) null);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
	public void method248(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			arg0.setVisible(true);
			Method getPeer = Frame.class.getDeclaredMethod("getPeer");
			getPeer.setAccessible(true);
			@Pc(6) WComponentPeer local6 = (WComponentPeer) getPeer.invoke(arg0);
			@Pc(9) int local9 = local6.getHwnd();
			User32.SetWindowLong(local9, -16, Integer.MIN_VALUE);
			User32.SetWindowLong(local9, -20, 8);
			this.aDirectDraw1.setCooperativeLevel(arg0, 17);
			this.aDirectDraw1.setDisplayMode(arg4, arg3, arg1, arg2, 0);
			arg0.setBounds(0, 0, arg4, arg3);
			arg0.toFront();
			arg0.requestFocus();
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
			throw new RuntimeException(ex);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	public void method249(@OriginalArg(0) Frame arg0) {
		this.aDirectDraw1.restoreDisplayMode();
		this.aDirectDraw1.setCooperativeLevel(arg0, 8);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)[I")
	public int[] method250() {
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		Static17.anIntArray28 = new int[Static17.anInt240];
		Static17.anInt240 = 0;
		this.aDirectDraw1.enumDisplayModes(0, (DDSurfaceDesc) null, (IUnknown) null, this);
		@Pc(20) int[] local20 = Static17.anIntArray28;
		Static17.anIntArray28 = null;
		Static17.anInt240 = 0;
		return local20;
	}

	@OriginalMember(owner = "client!ak", name = "callbackEnumModes", descriptor = "(Lcom/ms/directX/DDSurfaceDesc;Lcom/ms/com/IUnknown;)V")
	private void callbackEnumModes(@OriginalArg(0) DDSurfaceDesc arg0, @OriginalArg(1) IUnknown arg1) {
		if (Static17.anIntArray28 == null) {
			Static17.anInt240 += 4;
		} else {
			Static17.anIntArray28[Static17.anInt240++] = arg0.width;
			Static17.anIntArray28[Static17.anInt240++] = arg0.height;
			Static17.anIntArray28[Static17.anInt240++] = arg0.rgbBitCount;
			Static17.anIntArray28[Static17.anInt240++] = arg0.refreshRate;
		}
	}
}
