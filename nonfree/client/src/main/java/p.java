import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class p extends Class2 implements Interface5 {

	@OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
	private long nativeid;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Ljava/awt/Canvas;")
	public Canvas aCanvas9;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	public int anInt7161;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public int anInt7162;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!oa;Ljava/awt/Canvas;II)V")
	public p(@OriginalArg(0) oa arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aCanvas9 = arg1;
		this.anInt7161 = arg2;
		this.anInt7162 = arg3;
		this.sa(arg0, this.aCanvas9, arg2, arg3);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			synchronized (this.aCanvas9.getTreeLock()) {
				@Pc(9) Dimension local9 = this.aCanvas9.getSize();
				this.H(arg0, arg1, local9.width, local9.height);
				Static474.aBoolean542 = false;
			}
		} catch (@Pc(26) Exception local26) {
			this.method6440(local26);
		}
	}

	@OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
	private native void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
	private native void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public void method6439(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7161 = arg1;
		this.anInt7162 = arg2;
		this.oa(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
	private void method6440(@OriginalArg(0) Exception arg0) {
		if (!Static474.aBoolean542) {
			Static474.aLong229 = Static588.method7715();
			Static474.aBoolean542 = true;
		} else if (Static588.method7715() - Static474.aLong229 < 30000L) {
			this.aCanvas9.repaint();
		} else {
			throw new RuntimeException(arg0.getMessage());
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public void method6441(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			synchronized (this.aCanvas9.getTreeLock()) {
				for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
					@Pc(12) Rectangle local12 = arg0[local7];
					if (local12.width > 0 && local12.height > 0) {
						this.K(local12.x, local12.y, local12.width, local12.height, arg2, arg3);
					}
				}
				Static474.aBoolean542 = false;
			}
		} catch (@Pc(47) Exception local47) {
			this.method6440(local47);
		}
	}

	@OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
	public native void w(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!p", name = "sa", descriptor = "(Lclient!oa;Ljava/awt/Canvas;II)V")
	private native void sa(@OriginalArg(0) oa arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static307.method4477(this);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public void method6442() {
		this.w(true);
		this.nativeid = 0L;
		this.aCanvas9 = null;
	}

	@OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
	private native void oa(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
