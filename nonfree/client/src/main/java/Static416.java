import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "J")
	public static long aLong207;

	@OriginalMember(owner = "client!nca", name = "s", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_165 = new Class225(58, 6);

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
	public static int anInt6378 = 0;

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "J")
	public static long aLong208 = 0L;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
	public static void method5705() {
		for (@Pc(5) int local5 = 0; local5 < Static444.anInt6751; local5++) {
			Static607.aClass75Array4[local5] = null;
		}
		Static444.anInt6751 = 0;
		@Pc(25) int local25;
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static299.anInt4824; local22++) {
			for (local25 = 0; local25 < Static619.anInt1566; local25++) {
				for (local28 = 0; local28 < Static662.anInt9843; local28++) {
					@Pc(37) Class291 local37 = Static334.aClass291ArrayArrayArray1[local22][local28][local25];
					if (local37 != null) {
						if (local37.aShort83 > 0) {
							local37.aShort83 = (short) (local37.aShort83 * -1);
						}
						if (local37.aShort84 > 0) {
							local37.aShort84 = (short) (local37.aShort84 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static299.anInt4824; local25++) {
			for (local28 = 0; local28 < Static619.anInt1566; local28++) {
				for (@Pc(92) int local92 = 0; local92 < Static662.anInt9843; local92++) {
					@Pc(101) Class291 local101 = Static334.aClass291ArrayArrayArray1[local25][local92][local28];
					if (local101 != null) {
						@Pc(129) boolean local129 = Static334.aClass291ArrayArrayArray1[0][local92][local28] != null && Static334.aClass291ArrayArrayArray1[0][local92][local28].aClass291_1 != null;
						@Pc(137) int local137;
						@Pc(139) int local139;
						@Pc(153) Class291 local153;
						@Pc(161) int local161;
						@Pc(328) int local328;
						@Pc(343) int local343;
						@Pc(350) int local350;
						@Pc(367) int local367;
						@Pc(375) int local375;
						@Pc(379) int local379;
						@Pc(383) int local383;
						@Pc(389) int local389;
						@Pc(428) int local428;
						@Pc(431) int local431;
						if (local101.aShort84 < 0) {
							local137 = local28;
							local139 = local28;
							local153 = Static334.aClass291ArrayArrayArray1[local25][local92][local28 - 1];
							local161 = Static706.aClass178Array3[local25].method7869(local28, local92);
							while (local137 > 0 && local153 != null && local153.aShort84 < 0 && local101.aShort84 == local153.aShort84 && local101.aShort86 == local153.aShort86 && Static706.aClass178Array3[local25].method7869(local137 - 1, local92) == local161 && (local137 - 1 <= 0 || local161 == Static706.aClass178Array3[local25].method7869(local137 - 2, local92))) {
								local137--;
								local153 = Static334.aClass291ArrayArrayArray1[local25][local92][local137 - 1];
							}
							for (local153 = Static334.aClass291ArrayArrayArray1[local25][local92][local28 + 1]; Static662.anInt9843 > local139 && local153 != null && local153.aShort84 < 0 && local101.aShort84 == local153.aShort84 && local101.aShort86 == local153.aShort86 && local161 == Static706.aClass178Array3[local25].method7869(local139 + 1, local92) && (Static662.anInt9843 <= local139 + 1 || local161 == Static706.aClass178Array3[local25].method7869(local139 + 2, local92)); local153 = Static334.aClass291ArrayArrayArray1[local25][local92][local139 + 1]) {
								local139++;
							}
							local328 = local25 + 1 - local25;
							local343 = Static706.aClass178Array3[local129 ? local25 + 1 : local25].method7869(local137, local92);
							local350 = local343 + local101.aShort84 * local328;
							local367 = Static706.aClass178Array3[local129 ? local25 + 1 : local25].method7869(local139 + 1, local92);
							local375 = local367 + local101.aShort84 * local328;
							local379 = local92 << Static52.anInt1066;
							local383 = local137 << Static52.anInt1066;
							local389 = (local139 << Static52.anInt1066) + Static340.anInt5586;
							Static607.aClass75Array4[Static444.anInt6751++] = new Class75(1, local25, local101.aShort86 + local379, local379 - -local101.aShort86, local101.aShort86 + local379, local101.aShort86 + local379, local343, local367, local375, local350, local383, local389, local389, local383);
							for (local428 = local25; local428 <= local25; local428++) {
								for (local431 = local137; local431 <= local139; local431++) {
									Static334.aClass291ArrayArrayArray1[local428][local92][local431].aShort84 = (short) (Static334.aClass291ArrayArrayArray1[local428][local92][local431].aShort84 * -1);
								}
							}
						}
						if (local101.aShort83 < 0) {
							local137 = local92;
							local139 = local92;
							local153 = Static334.aClass291ArrayArrayArray1[local25][local92 - 1][local28];
							local161 = Static706.aClass178Array3[local25].method7869(local28, local92);
							while (local137 > 0 && local153 != null && local153.aShort83 < 0 && local153.aShort83 == local101.aShort83 && local153.aShort85 == local101.aShort85 && local161 == Static706.aClass178Array3[local25].method7869(local28, local137 - 1) && (local137 - 1 <= 0 || local161 == Static706.aClass178Array3[local25].method7869(local28, local137 - 2))) {
								local137--;
								local153 = Static334.aClass291ArrayArrayArray1[local25][local137 - 1][local28];
							}
							for (local153 = Static334.aClass291ArrayArrayArray1[local25][local92 + 1][local28]; local139 < Static619.anInt1566 && local153 != null && local153.aShort83 < 0 && local101.aShort83 == local153.aShort83 && local101.aShort85 == local153.aShort85 && Static706.aClass178Array3[local25].method7869(local28, local139 + 1) == local161 && (local139 + 1 >= Static619.anInt1566 || local161 == Static706.aClass178Array3[local25].method7869(local28, local139 + 2)); local153 = Static334.aClass291ArrayArrayArray1[local25][local139 + 1][local28]) {
								local139++;
							}
							local328 = local25 + 1 - local25;
							local343 = Static706.aClass178Array3[local129 ? local25 + 1 : local25].method7869(local28, local137);
							local350 = local328 * local101.aShort83 + local343;
							local367 = Static706.aClass178Array3[local129 ? local25 + 1 : local25].method7869(local28, local139 + 1);
							local375 = local101.aShort83 * local328 + local367;
							local379 = local137 << Static52.anInt1066;
							local383 = Static340.anInt5586 + (local139 << Static52.anInt1066);
							local389 = local28 << Static52.anInt1066;
							Static607.aClass75Array4[Static444.anInt6751++] = new Class75(2, local25, local379, local383, local383, local379, local343, local367, local375, local350, local389 + local101.aShort85, local101.aShort85 + local389, local101.aShort85 + local389, local101.aShort85 + local389);
							for (local428 = local25; local428 <= local25; local428++) {
								for (local431 = local137; local431 <= local139; local431++) {
									Static334.aClass291ArrayArrayArray1[local428][local431][local28].aShort83 = (short) (Static334.aClass291ArrayArrayArray1[local428][local431][local28].aShort83 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static442.aBoolean499 = true;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZIJIILjava/lang/String;IZILjava/lang/String;JBZ)V")
	public static void method5707(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(10) long arg10, @OriginalArg(12) boolean arg11) {
		if (!Static400.aBoolean622 && Static594.anInt8777 < 500) {
			@Pc(20) int local20 = arg8 == -1 ? Static442.anInt6699 : arg8;
			@Pc(36) Class2_Sub2_Sub16 local36 = new Class2_Sub2_Sub16(arg5, arg9, local20, arg6, arg1, arg2, arg3, arg4, arg7, arg0, arg10, arg11);
			Static84.method1662(local36);
		}
	}
}
