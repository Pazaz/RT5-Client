import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class216 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "[I")
	private final int[] anIntArray590;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "[I")
	private final int[] anIntArray589;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "[I")
	private final int[] anIntArray595;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "[I")
	private final int[] anIntArray592;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "[[I")
	private final int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	private final int anInt7310;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
	private final int[] anIntArray594;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class216() {
		@Pc(4) int local4 = Static333.method5883(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(14) int local14 = Static333.method5883(5);
		@Pc(16) int local16 = 0;
		this.anIntArray590 = new int[local14];
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
			local26 = Static333.method5883(4);
			this.anIntArray590[local22] = local26;
			if (local26 >= local16) {
				local16 = local26 + 1;
			}
		}
		this.anIntArray589 = new int[local16];
		this.anIntArray595 = new int[local16];
		this.anIntArray592 = new int[local16];
		this.anIntArrayArray57 = new int[local16][];
		@Pc(77) int local77;
		@Pc(99) int local99;
		for (local26 = 0; local26 < local16; local26++) {
			this.anIntArray589[local26] = Static333.method5883(3) + 1;
			local77 = this.anIntArray595[local26] = Static333.method5883(2);
			if (local77 != 0) {
				this.anIntArray592[local26] = Static333.method5883(8);
			}
			local77 = 0x1 << local77;
			@Pc(92) int[] local92 = new int[local77];
			this.anIntArrayArray57[local26] = local92;
			for (local99 = 0; local99 < local77; local99++) {
				local92[local99] = Static333.method5883(8) - 1;
			}
		}
		this.anInt7310 = Static333.method5883(2) + 1;
		local77 = Static333.method5883(4);
		@Pc(126) int local126 = 2;
		for (local99 = 0; local99 < local14; local99++) {
			local126 += this.anIntArray589[this.anIntArray590[local99]];
		}
		this.anIntArray594 = new int[local126];
		this.anIntArray594[0] = 0;
		this.anIntArray594[1] = 0x1 << local77;
		local126 = 2;
		for (@Pc(163) int local163 = 0; local163 < local14; local163++) {
			@Pc(169) int local169 = this.anIntArray590[local163];
			for (@Pc(171) int local171 = 0; local171 < this.anIntArray589[local169]; local171++) {
				this.anIntArray594[local126++] = Static333.method5883(local77);
			}
		}
		if (Static348.anIntArray593 == null || Static348.anIntArray593.length < local126) {
			Static348.anIntArray593 = new int[local126];
			Static348.anIntArray596 = new int[local126];
			Static348.aBooleanArray31 = new boolean[local126];
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII[FI)V")
	private void method6115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(18) int local18 = local3 / local7;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = local3 < 0 ? local18 - 1 : local18 + 1;
		@Pc(43) int local43 = local14 - (local18 < 0 ? -local18 : local18) * local7;
		arg4[arg0] *= Static348.aFloatArray30[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(61) int local61 = arg0 + 1; local61 < arg2; local61++) {
			local22 += local43;
			if (local22 >= local7) {
				local22 -= local7;
				local20 += local32;
			} else {
				local20 += local18;
			}
			arg4[local61] *= Static348.aFloatArray30[local20];
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()Z")
	public boolean method6116() {
		@Pc(5) boolean local5 = Static333.method5889() != 0;
		if (!local5) {
			return false;
		}
		@Pc(13) int local13 = this.anIntArray594.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			Static348.anIntArray593[local15] = this.anIntArray594[local15];
		}
		@Pc(34) int local34 = Static348.anIntArray591[this.anInt7310 - 1];
		@Pc(40) int local40 = Static134.method3035(local34 - 1);
		Static348.anIntArray596[0] = Static333.method5883(local40);
		Static348.anIntArray596[1] = Static333.method5883(local40);
		@Pc(52) int local52 = 2;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray590.length; local54++) {
			@Pc(60) int local60 = this.anIntArray590[local54];
			@Pc(65) int local65 = this.anIntArray589[local60];
			@Pc(70) int local70 = this.anIntArray595[local60];
			@Pc(76) int local76 = (0x1 << local70) - 1;
			@Pc(78) int local78 = 0;
			if (local70 > 0) {
				local78 = Static333.aClass34Array1[this.anIntArray592[local60]].method834();
			}
			for (@Pc(90) int local90 = 0; local90 < local65; local90++) {
				@Pc(100) int local100 = this.anIntArrayArray57[local60][local78 & local76];
				local78 >>>= local70;
				Static348.anIntArray596[local52++] = local100 >= 0 ? Static333.aClass34Array1[local100].method834() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([FI)V")
	public void method6117(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray594.length;
		@Pc(10) int local10 = Static348.anIntArray591[this.anInt7310 - 1];
		Static348.aBooleanArray31[0] = Static348.aBooleanArray31[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static348.method6120(Static348.anIntArray593, local20);
			local29 = Static348.method6122(Static348.anIntArray593, local20);
			local47 = this.method6119(Static348.anIntArray593[local25], Static348.anIntArray596[local25], Static348.anIntArray593[local29], Static348.anIntArray596[local29], Static348.anIntArray593[local20]);
			local51 = Static348.anIntArray596[local20];
			local55 = local10 - local47;
			@Pc(66) int local66 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static348.aBooleanArray31[local20] = false;
				Static348.anIntArray596[local20] = local47;
			} else {
				Static348.aBooleanArray31[local25] = Static348.aBooleanArray31[local29] = true;
				Static348.aBooleanArray31[local20] = true;
				if (local51 >= local66) {
					Static348.anIntArray596[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static348.anIntArray596[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method6118(0, local3 - 1);
		local25 = 0;
		local29 = Static348.anIntArray596[0] * this.anInt7310;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static348.aBooleanArray31[local47]) {
				local51 = Static348.anIntArray593[local47];
				local55 = Static348.anIntArray596[local47] * this.anInt7310;
				this.method6115(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(193) float local193 = Static348.aFloatArray30[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local193;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
	private void method6118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(5) int local5 = arg0;
		@Pc(9) int local9 = Static348.anIntArray593[arg0];
		@Pc(13) int local13 = Static348.anIntArray596[arg0];
		@Pc(17) boolean local17 = Static348.aBooleanArray31[arg0];
		for (@Pc(21) int local21 = arg0 + 1; local21 <= arg1; local21++) {
			@Pc(26) int local26 = Static348.anIntArray593[local21];
			if (local26 < local9) {
				Static348.anIntArray593[local5] = local26;
				Static348.anIntArray596[local5] = Static348.anIntArray596[local21];
				Static348.aBooleanArray31[local5] = Static348.aBooleanArray31[local21];
				local5++;
				Static348.anIntArray593[local21] = Static348.anIntArray593[local5];
				Static348.anIntArray596[local21] = Static348.anIntArray596[local5];
				Static348.aBooleanArray31[local21] = Static348.aBooleanArray31[local5];
			}
		}
		Static348.anIntArray593[local5] = local9;
		Static348.anIntArray596[local5] = local13;
		Static348.aBooleanArray31[local5] = local17;
		this.method6118(arg0, local5 - 1);
		this.method6118(local5 + 1, arg1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)I")
	private int method6119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(14) int local14 = local3 < 0 ? -local3 : local3;
		@Pc(20) int local20 = local14 * (arg4 - arg0);
		@Pc(24) int local24 = local20 / local7;
		return local3 < 0 ? arg1 - local24 : arg1 + local24;
	}
}
