import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public static int anInt3003;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_34 = new Class345(39, 12);

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	public static int anInt3006 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z")
	public static boolean method2778(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg4 && arg1 == arg0 && arg3 == arg8 && arg6 == arg5) {
			Static409.method5658(arg4, arg8, arg2, arg6, arg0);
			return;
		}
		@Pc(51) int local51 = arg4;
		@Pc(53) int local53 = arg0;
		@Pc(57) int local57 = arg4 * 3;
		@Pc(61) int local61 = arg0 * 3;
		@Pc(65) int local65 = arg7 * 3;
		@Pc(69) int local69 = arg1 * 3;
		@Pc(73) int local73 = arg3 * 3;
		@Pc(77) int local77 = arg5 * 3;
		@Pc(87) int local87 = local65 + arg8 - local73 - arg4;
		@Pc(97) int local97 = local69 + arg6 - arg0 - local77;
		@Pc(106) int local106 = local57 + local73 - local65 - local65;
		@Pc(116) int local116 = local61 + local77 - local69 - local69;
		@Pc(121) int local121 = local65 - local57;
		@Pc(126) int local126 = local69 - local61;
		for (@Pc(128) int local128 = 128; local128 <= 4096; local128 += 128) {
			@Pc(136) int local136 = local128 * local128 >> 12;
			@Pc(142) int local142 = local128 * local136 >> 12;
			@Pc(146) int local146 = local142 * local87;
			@Pc(150) int local150 = local97 * local142;
			@Pc(154) int local154 = local136 * local106;
			@Pc(158) int local158 = local136 * local116;
			@Pc(162) int local162 = local128 * local121;
			@Pc(166) int local166 = local128 * local126;
			@Pc(176) int local176 = arg4 + (local146 + local154 + local162 >> 12);
			@Pc(188) int local188 = arg0 + (local150 + local158 + local166 >> 12);
			Static409.method5658(local51, local176, arg2, local188, local53);
			local53 = local188;
			local51 = local176;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public static void method2781() {
		Static632.anInt9503 = 0;
		Static482.anInt7265 = 0;
		for (@Pc(27) int local27 = 0; local27 < Static617.anInt9434; local27++) {
			@Pc(33) int local33 = Static211.anInt5574 * local27;
			for (@Pc(35) int local35 = 0; local35 < Static211.anInt5574; local35++) {
				@Pc(41) int local41 = local35 + local33;
				Static651.anInterface9Array1[local41].method9039(local35 * Static437.anInt6628, Static714.anInt10802 * local27, Static437.anInt6628, Static714.anInt10802, true);
			}
		}
	}
}
