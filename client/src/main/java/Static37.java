import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	public static int anInt949 = 1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([[II)V")
	public static void method1133(@OriginalArg(0) int[][] arg0) {
		Static357.anIntArrayArray58 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "(I)V")
	public static void method1135() {
		if (client.soundChannel != null) {
			client.soundChannel.method6316();
		}
		if (client.musicChannel != null) {
			client.musicChannel.method6316();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
	public static void method1136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static249.method4149(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg5;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg4;
		@Pc(24) int local24 = -arg4;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(42) int[] local42 = Static357.anIntArrayArray58[arg3];
		@Pc(47) int local47 = arg1 - local15;
		Static101.method2163(local47, local42, arg2, arg1 - arg4);
		@Pc(61) int local61 = arg1 + local15;
		Static101.method2163(local61, local42, arg0, local47);
		Static101.method2163(arg4 + arg1, local42, arg2, local61);
		while (local10 < local21) {
			local31 += 2;
			local33 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				Static305.anIntArray386[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(127) int[] local127;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(152) int local152;
			@Pc(157) int local157;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local15 > local21) {
					local127 = Static357.anIntArrayArray58[local21 + arg3];
					local134 = Static357.anIntArrayArray58[arg3 - local21];
					local138 = Static305.anIntArray386[local21];
					local142 = arg1 + local10;
					local147 = arg1 - local10;
					local152 = arg1 + local138;
					local157 = arg1 - local138;
					Static101.method2163(local157, local127, arg2, local147);
					Static101.method2163(local152, local127, arg0, local157);
					Static101.method2163(local142, local127, arg2, local152);
					Static101.method2163(local157, local134, arg2, local147);
					Static101.method2163(local152, local134, arg0, local157);
					Static101.method2163(local142, local134, arg2, local152);
				} else {
					local127 = Static357.anIntArrayArray58[arg3 + local21];
					local134 = Static357.anIntArrayArray58[arg3 - local21];
					local138 = local10 + arg1;
					local142 = arg1 - local10;
					Static101.method2163(local138, local127, arg2, local142);
					Static101.method2163(local138, local134, arg2, local142);
				}
			}
			local127 = Static357.anIntArrayArray58[local10 + arg3];
			local134 = Static357.anIntArrayArray58[arg3 - local10];
			local138 = local21 + arg1;
			local142 = arg1 - local21;
			if (local15 > local10) {
				local147 = local26 >= local10 ? local26 : Static305.anIntArray386[local10];
				local152 = local147 + arg1;
				local157 = arg1 - local147;
				Static101.method2163(local157, local127, arg2, local142);
				Static101.method2163(local152, local127, arg0, local157);
				Static101.method2163(local138, local127, arg2, local152);
				Static101.method2163(local157, local134, arg2, local142);
				Static101.method2163(local152, local134, arg0, local157);
				Static101.method2163(local138, local134, arg2, local152);
			} else {
				Static101.method2163(local138, local127, arg2, local142);
				Static101.method2163(local138, local134, arg2, local142);
			}
		}
	}
}
