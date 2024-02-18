import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Callback_Sub1 extends Callback {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
	private volatile int anInt7154;

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
	private volatile int anInt7155;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
	private int anInt7156;

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "Z")
	private volatile boolean aBoolean540 = true;

	@OriginalMember(owner = "client!ow", name = "callback", descriptor = "(IIII)I")
	private synchronized int callback(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		if (this.anInt7155 != arg0) {
			local7 = User32.GetWindowLong(arg0, -4);
			return User32.CallWindowProc(local7, arg0, arg1, arg2, arg3);
		}
		if (arg1 == 32) {
			local7 = arg3 & 0xFFFF;
			if (local7 == 1) {
				User32.SetCursor(this.aBoolean540 ? this.anInt7156 : 0);
				return 0;
			}
		}
		if (arg1 == 101024) {
			User32.SetCursor(this.aBoolean540 ? this.anInt7156 : 0);
			return 0;
		}
		if (arg1 == 1) {
			this.anInt7155 = 0;
			this.aBoolean540 = true;
		}
		return User32.CallWindowProc(this.anInt7154, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)V")
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		User32.SetCursorPos(arg0, arg1);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLjava/awt/Component;B)V")
	public void method6432(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1) {
		try {
			Method getPeer = Component.class.getDeclaredMethod("getPeer");
			getPeer.setAccessible(true);
			@Pc(3) WComponentPeer local3 = (WComponentPeer) getPeer.invoke(arg1);
			@Pc(6) int local6 = local3.getTopHwnd();
			if (local6 == this.anInt7155 && arg0 == this.aBoolean540) {
				return;
			}
			if (!this.aBoolean541) {
				this.anInt7156 = User32.LoadCursor(0, 32512);
				Root.alloc(this);
				this.aBoolean541 = true;
			}
			if (this.anInt7155 != local6) {
				if (this.anInt7155 != 0) {
					this.aBoolean540 = true;
					User32.SendMessage(local6, 101024, 0, 0);
					synchronized (this) {
						User32.SetWindowLong(this.anInt7155, -4, this.anInt7154);
					}
				}
				synchronized (this) {
					this.anInt7155 = local6;
					this.anInt7154 = User32.SetWindowLong(this.anInt7155, -4, this);
				}
			}
			this.aBoolean540 = arg0;
			User32.SendMessage(local6, 101024, 0, 0);
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
			throw new RuntimeException(ex);
		}
	}
}
