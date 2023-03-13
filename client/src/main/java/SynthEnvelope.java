import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class SynthEnvelope {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public int anInt6459;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public int anInt6460;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	private int anInt6463;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private int anInt6464;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	private int anInt6466;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int anInt6467;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	private int anInt6461 = 2;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
	private int[] anIntArray445 = new int[2];

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
	private int[] anIntArray446 = new int[2];

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public SynthEnvelope() {
		this.anIntArray445[0] = 0;
		this.anIntArray445[1] = 65535;
		this.anIntArray446[0] = 0;
		this.anIntArray446[1] = 65535;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
	public int method5840(@OriginalArg(0) int arg0) {
		if (this.anInt6466 >= this.anInt6463) {
			this.anInt6465 = this.anIntArray446[this.anInt6467++] << 15;
			if (this.anInt6467 >= this.anInt6461) {
				this.anInt6467 = this.anInt6461 - 1;
			}
			this.anInt6463 = (int) ((double) this.anIntArray445[this.anInt6467] / 65536.0D * (double) arg0);
			if (this.anInt6463 > this.anInt6466) {
				this.anInt6464 = ((this.anIntArray446[this.anInt6467] << 15) - this.anInt6465) / (this.anInt6463 - this.anInt6466);
			}
		}
		this.anInt6465 += this.anInt6464;
		this.anInt6466++;
		return this.anInt6465 - this.anInt6464 >> 15;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!bt;)V")
	public void method5841(@OriginalArg(0) Buffer arg0) {
		this.anInt6459 = arg0.g1();
		this.anInt6462 = arg0.g4();
		this.anInt6460 = arg0.g4();
		this.method5843(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public void method5842() {
		this.anInt6463 = 0;
		this.anInt6467 = 0;
		this.anInt6464 = 0;
		this.anInt6465 = 0;
		this.anInt6466 = 0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!bt;)V")
	public void method5843(@OriginalArg(0) Buffer arg0) {
		this.anInt6461 = arg0.g1();
		this.anIntArray445 = new int[this.anInt6461];
		this.anIntArray446 = new int[this.anInt6461];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6461; local16++) {
			this.anIntArray445[local16] = arg0.g2();
			this.anIntArray446[local16] = arg0.g2();
		}
	}
}
