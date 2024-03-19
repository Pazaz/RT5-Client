import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!go", name = "W", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!go", name = "V", descriptor = "I")
	private int anInt2549 = 0;

	@OriginalMember(owner = "client!go", name = "S", descriptor = "I")
	private int anInt2546 = 10;

	@OriginalMember(owner = "client!go", name = "X", descriptor = "I")
	private int anInt2550 = 2048;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(24) int local24 = Static60.anIntArray455[arg0];
			@Pc(34) int local34;
			if (this.anInt2549 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt2546; local34++) {
					if (this.anIntArray165[local34] <= local24 && local24 < this.anIntArray165[local34 + 1]) {
						if (this.anIntArray164[local34] > local24) {
							local32 = 4096;
						}
						break;
					}
				}
				Static360.method2012(local16, 0, Static64.anInt1755, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static64.anInt1755; local78++) {
					local34 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static207.anIntArray360[local78];
					@Pc(91) int local91 = this.anInt2549;
					if (local91 == 1) {
						local34 = local88;
					} else if (local91 == 2) {
						local34 = (local24 + local88 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local34 = (local88 - local24 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt2546; local91++) {
						if (this.anIntArray165[local91] <= local34 && this.anIntArray165[local91 + 1] > local34) {
							if (this.anIntArray164[local91] > local34) {
								local84 = 4096;
							}
							break;
						}
					}
					local16[local78] = local84;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(B)V")
	private void method2125() {
		this.anIntArray164 = new int[this.anInt2546 + 1];
		this.anIntArray165 = new int[this.anInt2546 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt2546;
		@Pc(33) int local33 = local26 * this.anInt2550 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2546; local35++) {
			this.anIntArray165[local35] = local21;
			this.anIntArray164[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray165[this.anInt2546] = 4096;
		this.anIntArray164[this.anInt2546] = this.anIntArray164[0] + 4096;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		this.method2125();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt2546 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt2550 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt2549 = arg1.method5761();
		}
	}
}
