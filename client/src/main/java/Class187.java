import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class187 {

	@OriginalMember(owner = "client!q", name = "n", descriptor = "[I")
	public static final int[] anIntArray360 = new int[4096];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public int anInt5105;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public int anInt5106;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public int anInt5108;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public int anInt5111;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "B")
	private byte aByte57;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	public int anInt5114;

	static {
		for (@Pc(11) int local11 = 0; local11 < 4096; local11++) {
			anIntArray360[local11] = Static271.method4567(local11);
		}
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class187() {
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class187(@OriginalArg(0) Buffer arg0) {
		this.aByte57 = arg0.g1b();
		this.anInt5105 = arg0.g2();
		this.anInt5108 = arg0.g4();
		this.anInt5111 = arg0.g4();
		this.anInt5106 = arg0.g4();
		this.anInt5114 = arg0.g4();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
	public int method4679() {
		return this.aByte57 & 0x7;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)I")
	public int method4683() {
		return (this.aByte57 & 0x8) == 8 ? 1 : 0;
	}
}
