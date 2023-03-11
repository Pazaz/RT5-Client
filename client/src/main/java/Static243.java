import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
	public static int anInt4495;

	@OriginalMember(owner = "client!nt", name = "O", descriptor = "I")
	public static int anInt4502;

	@OriginalMember(owner = "client!nt", name = "B", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[8];

	@OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
	public static final int anInt4496 = 1339;

	@OriginalMember(owner = "client!nt", name = "P", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_162 = new Class145(76, -1);

	@OriginalMember(owner = "client!nt", name = "Q", descriptor = "I")
	public static int anInt4503 = 0;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZII)I")
	public static int method4238(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub41 local13 = Static374.method6275(arg1, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray488.length) {
			return local13.anIntArray488[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method4239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static365.aClass6Array4 == null) {
			return;
		}
		@Pc(27) Class11_Sub5_Sub2 local27;
		@Pc(18) int local18;
		if (arg8 < 0) {
			local18 = -arg8 - 1;
			if (Static234.anInt4226 == local18) {
				local27 = Static17.aClass11_Sub5_Sub2_Sub1_3;
			} else {
				local27 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local18];
			}
		} else {
			local18 = arg8 - 1;
			local27 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local18];
		}
		if (local27 == null) {
			return;
		}
		@Pc(51) Class41 local51 = Static359.aClass202_4.method5163(arg1);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg10 == 1 || arg10 == 3) {
			local62 = local51.anInt1327;
			local65 = local51.anInt1356;
		} else {
			local62 = local51.anInt1356;
			local65 = local51.anInt1327;
		}
		@Pc(79) int local79 = (local62 >> 1) + arg0;
		@Pc(96) int local96 = arg0 + (local62 + 1 >> 1);
		@Pc(102) int local102 = (local65 >> 1) + arg11;
		@Pc(110) int local110 = (local65 + 1 >> 1) + arg11;
		@Pc(114) Class6 local114 = Static365.aClass6Array4[arg12];
		@Pc(138) int local138 = local114.method5719(local79, local102) + local114.method5719(local96, local102) + local114.method5719(local79, local110) + local114.method5719(local96, local110) >> 2;
		@Pc(142) Class2_Sub6 local142 = new Class2_Sub6();
		local142.anInt1110 = local27.aByte78;
		local142.anInt1118 = arg3 + Static114.anInt2348;
		local142.anInt1100 = Static114.anInt2348 + arg7;
		local142.anInt1117 = arg0;
		local142.anInt1109 = arg11;
		local142.anInt1112 = arg1;
		@Pc(170) int local170;
		if (arg5 < arg4) {
			local170 = arg4;
			arg4 = arg5;
			arg5 = local170;
		}
		local142.anInt1116 = arg9;
		local142.anInt1111 = arg10;
		if (arg6 > arg2) {
			local170 = arg6;
			arg6 = arg2;
			arg2 = local170;
		}
		local142.anInt1108 = arg0 + arg4;
		local142.anInt1107 = arg5 + arg0;
		local142.anInt1104 = (local142.anInt1117 << 7) + (local62 << 6);
		local142.anInt1102 = arg6 + arg11;
		local142.anInt1101 = (local65 << 6) + (local142.anInt1109 << 7);
		local142.anInt1113 = arg11 + arg2;
		local142.anInt1114 = local138;
		Static366.aClass135_40.method3540(local142);
		local27.aClass2_Sub6_3 = local142;
	}
}
