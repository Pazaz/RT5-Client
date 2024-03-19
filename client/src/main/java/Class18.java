import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class18 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	private int anInt658;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	private int anInt659;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	private int anInt656 = 2;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[I")
	private int[] anIntArray46 = new int[2];

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "[I")
	private int[] anIntArray45 = new int[2];

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class18() {
		this.anIntArray46[0] = 0;
		this.anIntArray46[1] = 65535;
		this.anIntArray45[0] = 0;
		this.anIntArray45[1] = 65535;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!il;)V")
	public void method461(@OriginalArg(0) Class1_Sub16 arg0) {
		this.anInt656 = arg0.method5761();
		this.anIntArray46 = new int[this.anInt656];
		this.anIntArray45 = new int[this.anInt656];
		for (@Pc(16) int local16 = 0; local16 < this.anInt656; local16++) {
			this.anIntArray46[local16] = arg0.method5749();
			this.anIntArray45[local16] = arg0.method5749();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()V")
	public void method462() {
		this.anInt660 = 0;
		this.anInt659 = 0;
		this.anInt661 = 0;
		this.anInt657 = 0;
		this.anInt658 = 0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lclient!il;)V")
	public void method463(@OriginalArg(0) Class1_Sub16 arg0) {
		this.anInt653 = arg0.method5761();
		this.anInt654 = arg0.method5730();
		this.anInt655 = arg0.method5730();
		this.method461(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
	public int method464(@OriginalArg(0) int arg0) {
		if (this.anInt658 >= this.anInt660) {
			this.anInt657 = this.anIntArray45[this.anInt659++] << 15;
			if (this.anInt659 >= this.anInt656) {
				this.anInt659 = this.anInt656 - 1;
			}
			this.anInt660 = (int) ((double) this.anIntArray46[this.anInt659] / 65536.0D * (double) arg0);
			if (this.anInt660 > this.anInt658) {
				this.anInt661 = ((this.anIntArray45[this.anInt659] << 15) - this.anInt657) / (this.anInt660 - this.anInt658);
			}
		}
		this.anInt657 += this.anInt661;
		this.anInt658++;
		return this.anInt657 - this.anInt661 >> 15;
	}
}
