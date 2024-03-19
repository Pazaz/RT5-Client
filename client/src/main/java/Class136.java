import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class136 {

	@OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
	private final int[] anIntArray362;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "([I)V")
	public Class136(@OriginalArg(0) int[] arg0) {
		@Pc(5) int local5;
		for (local5 = 1; local5 <= arg0.length + (arg0.length >> 1); local5 <<= 0x1) {
		}
		this.anIntArray362 = new int[local5 + local5];
		for (@Pc(30) int local30 = 0; local30 < local5 + local5; local30++) {
			this.anIntArray362[local30] = -1;
		}
		@Pc(49) int local49 = 0;
		while (arg0.length > local49) {
			@Pc(59) int local59;
			for (local59 = arg0[local49] & local5 - 1; this.anIntArray362[local59 + local59 + 1] != -1; local59 = local59 + 1 & local5 - 1) {
			}
			this.anIntArray362[local59 + local59] = arg0[local49];
			this.anIntArray362[local59 + local59 + 1] = local49++;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I")
	public int method4126(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = (this.anIntArray362.length >> 1) - 1;
		@Pc(25) int local25 = arg0 & local21;
		while (true) {
			@Pc(34) int local34 = this.anIntArray362[local25 + local25 + 1];
			if (local34 == -1) {
				return -1;
			}
			if (this.anIntArray362[local25 + local25] == arg0) {
				return local34;
			}
			local25 = local21 & local25 + 1;
		}
	}
}
