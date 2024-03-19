import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class191 {

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	public int anInt6235 = 0;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public int anInt6234 = -1;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Z")
	public boolean aBoolean445 = true;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public int anInt6242 = 128;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
	public boolean aBoolean446 = true;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public int anInt6239 = 16;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	public int anInt6244 = 1190717;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public int anInt6233 = -1;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Z")
	public boolean aBoolean447 = false;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
	public int anInt6243 = -1;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
	public int anInt6245 = 8;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
	public void method5238(@OriginalArg(0) int arg0) {
		if (this.anInt6234 == -1) {
			this.anInt6234 = this.anInt6233;
		}
		this.anInt6245 = this.anInt6245 << 8 | arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!il;II)V")
	public void method5240(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method5761();
			if (local17 == 0) {
				return;
			}
			this.method5242(arg0, arg1, local17);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!il;III)V")
	private void method5242(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt6235 = Static133.method3025(arg0.method5755());
		} else if (arg2 == 2) {
			this.anInt6233 = arg0.method5761();
		} else if (arg2 == 3) {
			this.anInt6233 = arg0.method5749();
			if (this.anInt6233 == 65535) {
				this.anInt6233 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean445 = false;
		} else if (arg2 == 7) {
			this.anInt6243 = Static133.method3025(arg0.method5755());
		} else if (arg2 == 8) {
			Static168.anInt4070 = arg1;
		} else if (arg2 == 9) {
			this.anInt6242 = arg0.method5749();
		} else if (arg2 == 10) {
			this.aBoolean446 = false;
		} else if (arg2 == 11) {
			this.anInt6245 = arg0.method5761();
		} else if (arg2 == 12) {
			this.aBoolean447 = true;
		} else if (arg2 == 13) {
			this.anInt6244 = arg0.method5755();
		} else if (arg2 == 14) {
			this.anInt6239 = arg0.method5761();
		} else if (arg2 == 15) {
			this.anInt6234 = arg0.method5749();
			if (this.anInt6234 == 65535) {
				this.anInt6234 = -1;
			}
		}
	}
}
