import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class157 {

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "F")
	public float aFloat66 = 1.0F;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "F")
	public float aFloat68 = 0.25F;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "F")
	public float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	public final int anInt5310;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	public final int anInt5306;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	public final int anInt5307;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public final int anInt5304;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!j;")
	public final Class94 aClass94_2;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "F")
	public final float aFloat67;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "F")
	public final float aFloat69;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public final int anInt5308;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
	public final int anInt5303;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "F")
	public final float aFloat70;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class157() {
		this.anInt5310 = -60;
		this.anInt5306 = -50;
		this.anInt5307 = Static210.anInt4841;
		this.anInt5304 = -50;
		this.aClass94_2 = Static139.aClass94_1;
		this.aFloat67 = 1.2F;
		this.aFloat69 = 1.1523438F;
		this.anInt5308 = 0;
		this.anInt5303 = Static125.anInt3170;
		this.aFloat70 = 0.69921875F;
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class157(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(16) int local16 = arg0.method5761();
		if (Static265.aBoolean396 && Static344.aClass40_9.method2709() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt5303 = Static125.anInt3170;
			} else {
				this.anInt5303 = arg0.method5730();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat69 = 1.1523438F;
			} else {
				this.aFloat69 = (float) arg0.method5749() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat70 = 0.69921875F;
			} else {
				this.aFloat70 = (float) arg0.method5749() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat67 = 1.2F;
			} else {
				this.aFloat67 = (float) arg0.method5749() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5730();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5749();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5749();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5749();
			}
			this.aFloat67 = 1.2F;
			this.aFloat70 = 0.69921875F;
			this.anInt5303 = Static125.anInt3170;
			this.aFloat69 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt5304 = -50;
			this.anInt5310 = -60;
			this.anInt5306 = -50;
		} else {
			this.anInt5304 = arg0.method5762();
			this.anInt5310 = arg0.method5762();
			this.anInt5306 = arg0.method5762();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt5307 = Static210.anInt4841;
		} else {
			this.anInt5307 = arg0.method5730();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt5308 = 0;
		} else {
			this.anInt5308 = arg0.method5749();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass94_2 = Static139.aClass94_1;
		} else {
			this.aClass94_2 = Static218.method4245(arg0.method5749(), arg0.method5749(), arg0.method5749(), arg0.method5749(), arg0.method5749(), arg0.method5749());
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!pp;B)Z")
	public boolean method4519(@OriginalArg(0) Class157 arg0) {
		return arg0.anInt5303 == this.anInt5303 && arg0.aFloat69 == this.aFloat69 && arg0.aFloat70 == this.aFloat70 && arg0.aFloat67 == this.aFloat67 && this.aFloat68 == arg0.aFloat68 && arg0.aFloat66 == this.aFloat66 && arg0.aFloat65 == this.aFloat65 && this.anInt5307 == arg0.anInt5307 && this.anInt5308 == arg0.anInt5308 && arg0.aClass94_2 == this.aClass94_2;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!il;)V")
	public void method4520(@OriginalArg(1) Class1_Sub16 arg0) {
		this.aFloat66 = (float) (arg0.method5761() * 8) / 255.0F;
		this.aFloat68 = (float) (arg0.method5761() * 8) / 255.0F;
		this.aFloat65 = (float) (arg0.method5761() * 8) / 255.0F;
	}
}
