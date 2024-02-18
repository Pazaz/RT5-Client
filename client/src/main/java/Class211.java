import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class211 {

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public int anInt5475;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int anInt5476;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	public int anInt5477;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	private int anInt5478;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	private int anInt5479;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	private int anInt5480;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	private int anInt5481;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	private int anInt5482;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	private int anInt5474 = 2;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
	private int[] anIntArray407 = new int[2];

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
	private int[] anIntArray408 = new int[2];

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class211() {
		this.anIntArray407[0] = 0;
		this.anIntArray407[1] = 65535;
		this.anIntArray408[0] = 0;
		this.anIntArray408[1] = 65535;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ge;)V")
	public void method4949(@OriginalArg(0) Class2_Sub21 arg0) {
		this.anInt5474 = arg0.method7396();
		this.anIntArray407 = new int[this.anInt5474];
		this.anIntArray408 = new int[this.anInt5474];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5474; local16++) {
			this.anIntArray407[local16] = arg0.method7382();
			this.anIntArray408[local16] = arg0.method7382();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public void method4950() {
		this.anInt5480 = 0;
		this.anInt5478 = 0;
		this.anInt5482 = 0;
		this.anInt5479 = 0;
		this.anInt5481 = 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	public int method4951(@OriginalArg(0) int arg0) {
		if (this.anInt5481 >= this.anInt5480) {
			this.anInt5479 = this.anIntArray408[this.anInt5478++] << 15;
			if (this.anInt5478 >= this.anInt5474) {
				this.anInt5478 = this.anInt5474 - 1;
			}
			this.anInt5480 = (int) ((double) this.anIntArray407[this.anInt5478] / 65536.0D * (double) arg0);
			if (this.anInt5480 > this.anInt5481) {
				this.anInt5482 = ((this.anIntArray408[this.anInt5478] << 15) - this.anInt5479) / (this.anInt5480 - this.anInt5481);
			}
		}
		this.anInt5479 += this.anInt5482;
		this.anInt5481++;
		return this.anInt5479 - this.anInt5482 >> 15;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lclient!ge;)V")
	public void method4952(@OriginalArg(0) Class2_Sub21 arg0) {
		this.anInt5477 = arg0.method7396();
		this.anInt5475 = arg0.method7349();
		this.anInt5476 = arg0.method7349();
		this.method4949(arg0);
	}
}
