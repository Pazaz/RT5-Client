import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eha")
public final class Class100 {

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "[I")
	private final int[] anIntArray224;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "([I)V")
	public Class100(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray224 = new int[local5 + local5];
		for (@Pc(34) int local34 = 0; local34 < local5 + local5; local34++) {
			this.anIntArray224[local34] = -1;
		}
		@Pc(52) int local52 = 0;
		while (local52 < arg0.length) {
			@Pc(64) int local64;
			for (local64 = local5 - 1 & arg0[local52]; this.anIntArray224[local64 + local64 + 1] != -1; local64 = local5 - 1 & local64 - -1) {
			}
			this.anIntArray224[local64 + local64] = arg0[local52];
			this.anIntArray224[local64 + local64 + 1] = local52++;
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)I")
	public int method2382(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = (this.anIntArray224.length >> 1) - 1;
		@Pc(15) int local15 = local11 & arg0;
		while (true) {
			@Pc(25) int local25 = this.anIntArray224[local15 + local15 + 1];
			if (local25 == -1) {
				return -1;
			}
			if (arg0 == this.anIntArray224[local15 + local15]) {
				return local25;
			}
			local15 = local11 & local15 + 1;
		}
	}
}
