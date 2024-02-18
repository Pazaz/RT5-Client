import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
	private final int[] anIntArray146 = new int[512];

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class59_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray146[local13] = this.anIntArray146[local13 + 256] = local13;
		}
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(40) int local40 = local11.nextInt() & 0xFF;
			@Pc(45) int local45 = this.anIntArray146[local40];
			this.anIntArray146[local40] = this.anIntArray146[local40 + 256] = this.anIntArray146[local34];
			this.anIntArray146[local34] = this.anIntArray146[local34 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(FFI[FIFIFIBI)V")
	@Override
	public void method1509(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(13) int local13 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(33) int local33 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(37) int local37 = local33 & 0xFF;
		@Pc(45) int local45 = (int) ((float) 16 * arg4 - 1.0F);
		@Pc(49) int local49 = local45 & 0xFF;
		@Pc(54) float local54 = (float) arg5 * arg4;
		@Pc(57) int local57 = (int) local54;
		@Pc(61) int local61 = local57 + 1;
		@Pc(66) float local66 = local54 - (float) local57;
		@Pc(71) float local71 = 1.0F - local66;
		@Pc(75) int local75 = local57 & local49;
		@Pc(79) float local79 = Static272.method3936(local66);
		@Pc(83) int local83 = local61 & local49;
		@Pc(88) int local88 = this.anIntArray146[local75];
		@Pc(93) int local93 = this.anIntArray146[local83];
		for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
			@Pc(102) float local102 = arg0 * (float) local95;
			@Pc(105) int local105 = (int) local102;
			@Pc(109) int local109 = local105 + 1;
			@Pc(114) float local114 = local102 - (float) local105;
			@Pc(118) float local118 = 1.0F - local114;
			@Pc(122) float local122 = Static272.method3936(local114);
			@Pc(126) int local126 = local105 & local37;
			@Pc(130) int local130 = local109 & local37;
			@Pc(137) int local137 = this.anIntArray146[local88 + local126];
			@Pc(144) int local144 = this.anIntArray146[local88 + local130];
			@Pc(152) int local152 = this.anIntArray146[local126 + local93];
			@Pc(160) int local160 = this.anIntArray146[local130 + local93];
			for (@Pc(162) int local162 = 0; local162 < 128; local162++) {
				@Pc(169) float local169 = (float) local162 * arg6;
				@Pc(172) int local172 = (int) local169;
				@Pc(176) int local176 = local172 + 1;
				@Pc(182) float local182 = (float) -local172 + local169;
				@Pc(186) float local186 = 1.0F - local182;
				@Pc(190) int local190 = local176 & local17;
				@Pc(194) int local194 = local172 & local17;
				@Pc(198) float local198 = Static272.method3936(local182);
				arg2[arg3++] = arg1 * Static226.method7999(Static226.method7999(Static226.method7999(Static282.method3978(local66, local182, local114, this.anIntArray146[local190 + local160] & 0x7), Static282.method3978(local66, local186, local114, this.anIntArray146[local194 + local160] & 0x7), local198), Static226.method7999(Static282.method3978(local66, local182, local118, this.anIntArray146[local152 + local190] & 0x7), Static282.method3978(local66, local186, local118, this.anIntArray146[local194 + local152] & 0x7), local198), local122), Static226.method7999(Static226.method7999(Static282.method3978(local71, local182, local114, this.anIntArray146[local144 + local190] & 0x7), Static282.method3978(local71, local186, local114, this.anIntArray146[local144 + local194] & 0x7), local198), Static226.method7999(Static282.method3978(local71, local182, local118, this.anIntArray146[local137 + local190] & 0x7), Static282.method3978(local71, local186, local118, this.anIntArray146[local194 + local137] & 0x7), local198), local122), local79);
			}
		}
	}
}
