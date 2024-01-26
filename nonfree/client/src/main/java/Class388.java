import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class388 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
	public static final int[] anIntArray819 = new int[256];

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "[I")
	public int[] anIntArray818;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
	public int[] anIntArray820;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
	public int[] anIntArray821;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
	public int anInt10300 = -1;

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	public int anInt10301 = -1;

	static {
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			@Pc(46) int local46 = local43;
			for (@Pc(48) int local48 = 0; local48 < 8; local48++) {
				if ((local46 & 0x1) == 1) {
					local46 = local46 >>> 1 ^ 0xEDB88320;
				} else {
					local46 >>>= 0x1;
				}
			}
			anIntArray819[local43] = local46;
		}
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class388(@OriginalArg(0) Class330 arg0) {
		@Pc(12) byte[] local12 = arg0.method7589(6);
		this.method8929(new Class2_Sub21(local12));
		if (this.anIntArray821 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	private Class388() {
		this.anIntArray821 = new int[0];
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!ge;)V")
	private void method8929(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7396();
			if (local12 == 0) {
				return;
			}
			@Pc(29) int local29;
			if (local12 == 1) {
				local29 = arg0.method7396();
				this.anIntArray821 = new int[local29];
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray821.length; local35++) {
					this.anIntArray821[local35] = arg0.method7396();
				}
			} else if (local12 == 3) {
				this.anInt10301 = arg0.method7396();
			} else if (local12 == 4) {
				this.anInt10300 = arg0.method7396();
			} else if (local12 == 5) {
				this.anIntArray818 = new int[arg0.method7396()];
				for (local29 = 0; local29 < this.anIntArray818.length; local29++) {
					this.anIntArray818[local29] = arg0.method7396();
				}
			} else if (local12 == 6) {
				this.anIntArray820 = new int[arg0.method7396()];
				for (local29 = 0; local29 < this.anIntArray820.length; local29++) {
					this.anIntArray820[local29] = arg0.method7396();
				}
			}
		}
	}
}
