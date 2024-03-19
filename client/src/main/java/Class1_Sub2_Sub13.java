import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
	private int anInt2129 = 585;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt2129 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(24) int local24 = Static60.anIntArray455[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static64.anInt1755; local26++) {
				@Pc(32) int local32 = Static207.anIntArray360[local26];
				@Pc(63) int local63;
				if (this.anInt2129 < local32 && 4096 - this.anInt2129 > local32 && local24 > 2048 - this.anInt2129 && this.anInt2129 + 2048 > local24) {
					local63 = 2048 - local32;
					local63 = local63 < 0 ? -local63 : local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt2129;
					local16[local26] = 4096 - local63;
				} else if (local32 > 2048 - this.anInt2129 && this.anInt2129 + 2048 > local32) {
					local63 = local24 - 2048;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 -= this.anInt2129;
					local63 <<= 0xC;
					local16[local26] = local63 / (2048 - this.anInt2129);
				} else if (this.anInt2129 > local24 || 4096 - this.anInt2129 < local24) {
					local63 = local32 - 2048;
					@Pc(165) int local165 = local63 < 0 ? -local63 : local63;
					@Pc(170) int local170 = local165 - this.anInt2129;
					@Pc(174) int local174 = local170 << 12;
					local16[local26] = local174 / (2048 - this.anInt2129);
				} else if (local32 >= this.anInt2129 && 4096 - this.anInt2129 >= local32) {
					local16[local26] = 0;
				} else {
					local63 = 2048 - local24;
					local63 = local63 >= 0 ? local63 : -local63;
					local63 <<= 0xC;
					local63 /= 2048 - this.anInt2129;
					local16[local26] = 4096 - local63;
				}
			}
		}
		return local16;
	}
}
