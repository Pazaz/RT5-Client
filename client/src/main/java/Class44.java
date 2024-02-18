import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class44 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
	private final int[] anIntArray78;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
	private final int[] anIntArray84;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
	private final int[] anIntArray79;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
	private final int[] anIntArray83;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "[[I")
	private final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	private final int anInt1004;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "[I")
	private final int[] anIntArray81;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class44() {
		@Pc(4) int local4 = Static650.method8500(16);
		if (local4 != 1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = Static650.method8500(5);
		@Pc(17) int local17 = 0;
		this.anIntArray78 = new int[local15];
		@Pc(27) int local27;
		for (@Pc(23) int local23 = 0; local23 < local15; local23++) {
			local27 = Static650.method8500(4);
			this.anIntArray78[local23] = local27;
			if (local27 >= local17) {
				local17 = local27 + 1;
			}
		}
		this.anIntArray84 = new int[local17];
		this.anIntArray79 = new int[local17];
		this.anIntArray83 = new int[local17];
		this.anIntArrayArray22 = new int[local17][];
		@Pc(78) int local78;
		@Pc(102) int local102;
		for (local27 = 0; local27 < local17; local27++) {
			this.anIntArray84[local27] = Static650.method8500(3) + 1;
			local78 = this.anIntArray79[local27] = Static650.method8500(2);
			if (local78 != 0) {
				this.anIntArray83[local27] = Static650.method8500(8);
			}
			local78 = 0x1 << local78;
			@Pc(95) int[] local95 = new int[local78];
			this.anIntArrayArray22[local27] = local95;
			for (local102 = 0; local102 < local78; local102++) {
				local95[local102] = Static650.method8500(8) - 1;
			}
		}
		this.anInt1004 = Static650.method8500(2) + 1;
		local78 = Static650.method8500(4);
		@Pc(131) int local131 = 2;
		for (local102 = 0; local102 < local15; local102++) {
			local131 += this.anIntArray84[this.anIntArray78[local102]];
		}
		this.anIntArray81 = new int[local131];
		this.anIntArray81[0] = 0;
		this.anIntArray81[1] = 0x1 << local78;
		local131 = 2;
		for (@Pc(168) int local168 = 0; local168 < local15; local168++) {
			@Pc(174) int local174 = this.anIntArray78[local168];
			for (@Pc(176) int local176 = 0; local176 < this.anIntArray84[local174]; local176++) {
				this.anIntArray81[local131++] = Static650.method8500(local78);
			}
		}
		if (Static47.anIntArray80 == null || Static47.anIntArray80.length < local131) {
			Static47.anIntArray80 = new int[local131];
			Static47.anIntArray82 = new int[local131];
			Static47.aBooleanArray1 = new boolean[local131];
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([FI)V")
	public void method1086(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.anIntArray81.length;
		@Pc(10) int local10 = Static47.anIntArray77[this.anInt1004 - 1];
		Static47.aBooleanArray1[0] = Static47.aBooleanArray1[1] = true;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		for (@Pc(20) int local20 = 2; local20 < local3; local20++) {
			local25 = Static47.method1085(Static47.anIntArray80, local20);
			local29 = Static47.method1087(Static47.anIntArray80, local20);
			local47 = this.method1088(Static47.anIntArray80[local25], Static47.anIntArray82[local25], Static47.anIntArray80[local29], Static47.anIntArray82[local29], Static47.anIntArray80[local20]);
			local51 = Static47.anIntArray82[local20];
			local55 = local10 - local47;
			@Pc(67) int local67 = (local55 < local47 ? local55 : local47) << 1;
			if (local51 == 0) {
				Static47.aBooleanArray1[local20] = false;
				Static47.anIntArray82[local20] = local47;
			} else {
				Static47.aBooleanArray1[local25] = Static47.aBooleanArray1[local29] = true;
				Static47.aBooleanArray1[local20] = true;
				if (local51 >= local67) {
					Static47.anIntArray82[local20] = local55 > local47 ? local51 + local47 - local47 : local47 - local51 + local55 - 1;
				} else {
					Static47.anIntArray82[local20] = (local51 & 0x1) == 0 ? local47 + local51 / 2 : local47 - (local51 + 1) / 2;
				}
			}
		}
		this.method1092(0, local3 - 1);
		local25 = 0;
		local29 = Static47.anIntArray82[0] * this.anInt1004;
		for (local47 = 1; local47 < local3; local47++) {
			if (Static47.aBooleanArray1[local47]) {
				local51 = Static47.anIntArray80[local47];
				local55 = Static47.anIntArray82[local47] * this.anInt1004;
				this.method1091(local25, local29, local51, local55, arg0, arg1);
				if (local51 >= arg1) {
					return;
				}
				local25 = local51;
				local29 = local55;
			}
		}
		@Pc(201) float local201 = Static47.aFloatArray11[local29];
		for (local55 = local25; local55 < arg1; local55++) {
			arg0[local55] *= local201;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII)I")
	private int method1088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(15) int local15 = local3 < 0 ? -local3 : local3;
		@Pc(21) int local21 = local15 * (arg4 - arg0);
		@Pc(25) int local25 = local21 / local7;
		return local3 < 0 ? arg1 - local25 : arg1 + local25;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()Z")
	public boolean method1089() {
		@Pc(6) boolean local6 = Static650.method8509() != 0;
		if (!local6) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray81.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			Static47.anIntArray80[local17] = this.anIntArray81[local17];
		}
		@Pc(36) int local36 = Static47.anIntArray77[this.anInt1004 - 1];
		@Pc(42) int local42 = Static434.method5853(local36 - 1);
		Static47.anIntArray82[0] = Static650.method8500(local42);
		Static47.anIntArray82[1] = Static650.method8500(local42);
		@Pc(54) int local54 = 2;
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray78.length; local56++) {
			@Pc(62) int local62 = this.anIntArray78[local56];
			@Pc(67) int local67 = this.anIntArray84[local62];
			@Pc(72) int local72 = this.anIntArray79[local62];
			@Pc(78) int local78 = (0x1 << local72) - 1;
			@Pc(80) int local80 = 0;
			if (local72 > 0) {
				local80 = Static650.aClass271Array1[this.anIntArray83[local62]].method6111();
			}
			for (@Pc(92) int local92 = 0; local92 < local67; local92++) {
				@Pc(102) int local102 = this.anIntArrayArray22[local62][local80 & local78];
				local80 >>>= local72;
				Static47.anIntArray82[local54++] = local102 >= 0 ? Static650.aClass271Array1[local102].method6111() : 0;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII[FI)V")
	private void method1091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(15) int local15 = local3 < 0 ? -local3 : local3;
		@Pc(19) int local19 = local3 / local7;
		@Pc(21) int local21 = arg1;
		@Pc(23) int local23 = 0;
		@Pc(34) int local34 = local3 < 0 ? local19 - 1 : local19 + 1;
		@Pc(46) int local46 = local15 - (local19 < 0 ? -local19 : local19) * local7;
		arg4[arg0] *= Static47.aFloatArray11[arg1];
		if (arg2 > arg5) {
			arg2 = arg5;
		}
		for (@Pc(64) int local64 = arg0 + 1; local64 < arg2; local64++) {
			local23 += local46;
			if (local23 >= local7) {
				local23 -= local7;
				local21 += local34;
			} else {
				local21 += local19;
			}
			arg4[local64] *= Static47.aFloatArray11[local21];
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	private void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(6) int local6 = arg0;
		@Pc(10) int local10 = Static47.anIntArray80[arg0];
		@Pc(14) int local14 = Static47.anIntArray82[arg0];
		@Pc(18) boolean local18 = Static47.aBooleanArray1[arg0];
		for (@Pc(22) int local22 = arg0 + 1; local22 <= arg1; local22++) {
			@Pc(27) int local27 = Static47.anIntArray80[local22];
			if (local27 < local10) {
				Static47.anIntArray80[local6] = local27;
				Static47.anIntArray82[local6] = Static47.anIntArray82[local22];
				Static47.aBooleanArray1[local6] = Static47.aBooleanArray1[local22];
				local6++;
				Static47.anIntArray80[local22] = Static47.anIntArray80[local6];
				Static47.anIntArray82[local22] = Static47.anIntArray82[local6];
				Static47.aBooleanArray1[local22] = Static47.aBooleanArray1[local6];
			}
		}
		Static47.anIntArray80[local6] = local10;
		Static47.anIntArray82[local6] = local14;
		Static47.aBooleanArray1[local6] = local18;
		this.method1092(arg0, local6 - 1);
		this.method1092(local6 + 1, arg1);
	}
}
