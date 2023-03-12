import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public static final int anInt2895 = 1;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "Lclient!ij;")
	public static final Class105 aClass105_1 = new Class105();

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	public static int anInt2911 = -1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method2939(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static361.anInt6770;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(27) Class230 local27 = client.aClass233_1.method5885(arg0[local13]);
			if (local27.anInt6454 != -1) {
				@Pc(39) Sprite local39 = (Sprite) Static210.aClass98_31.get((long) local27.anInt6454);
				if (local39 == null) {
					@Pc(47) Class48 local47 = Static396.method1682(client.jsArchive8, local27.anInt6454, 0);
					if (local47 != null) {
						local39 = Static190.aClass19_8.method2891(local47);
						Static210.aClass98_31.put((long) local27.anInt6454, local39);
					}
				}
				if (local39 != null) {
					Static134.aClass13Array12[local11] = local39;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method2943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class67 local7 = Scene.aClass67ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class67 local28 = Scene.aClass67ArrayArrayArray3[local9][arg0][arg1] = Scene.aClass67ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte10--;
				for (@Pc(40) Class22 local40 = local28.aClass22_2; local40 != null; local40 = local40.aClass22_1) {
					@Pc(44) Entity local44 = local40.aClass11_Sub5_1;
					if (local44.aShort103 == arg0 && local44.aShort101 == arg1) {
						local44.aByte78--;
					}
				}
			}
		}
		if (Scene.aClass67ArrayArrayArray3[0][arg0][arg1] == null) {
			Scene.aClass67ArrayArrayArray3[0][arg0][arg1] = new Class67(0, arg0, arg1);
			Scene.aClass67ArrayArrayArray3[0][arg0][arg1].aByte7 = 1;
		}
		Scene.aClass67ArrayArrayArray3[0][arg0][arg1].aClass67_1 = local7;
		Scene.aClass67ArrayArrayArray3[3][arg0][arg1] = null;
	}

}
