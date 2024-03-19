import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString202;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public static int anInt5552;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "Lclient!qj;")
	public static Class162 aClass162_198;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
	public static int anInt5551 = 0;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString203 = "shake:";

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[S")
	public static short[] aShortArray92 = new short[256];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!nr;)V")
	public static void method4730(@OriginalArg(0) Class40 arg0) {
		for (@Pc(1) int local1 = Static75.anInt2068; local1 < Static214.anInt4867; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static328.anInt6717; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static200.anInt4590; local7++) {
					@Pc(16) Class154 local16 = Static241.aClass154ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class7_Sub2 local21 = local16.aClass7_Sub2_1;
						@Pc(24) Class7_Sub2 local24 = local16.aClass7_Sub2_2;
						if (local21 != null && local21.method5952()) {
							Static28.method663(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5952()) {
								Static28.method663(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5956(arg0, 0, 0, false, local21, 0);
								local24.method5958();
							}
							local21.method5958();
						}
						for (@Pc(70) Class93 local70 = local16.aClass93_3; local70 != null; local70 = local70.aClass93_2) {
							@Pc(74) Class7_Sub1 local74 = local70.aClass7_Sub1_1;
							if (local74 != null && local74.method5952()) {
								Static28.method663(arg0, local74, local1, local4, local7, local74.aShort92 + 1 - local74.aShort93, local74.aShort90 - local74.aShort91 + 1);
								local74.method5958();
							}
						}
						@Pc(111) Class7_Sub5 local111 = local16.aClass7_Sub5_1;
						if (local111 != null && local111.method5952()) {
							Static183.method3718(arg0, local111, local1, local4, local7);
							local111.method5958();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V")
	public static void method4731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static150.aClass1_Sub16_Sub2_2.method5793(147);
		Static150.aClass1_Sub16_Sub2_2.method5734(arg1);
		Static150.aClass1_Sub16_Sub2_2.method5780(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
	public static void method4732(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static45.aBoolean96) {
			Static45.aBoolean96 = arg0;
			Static127.method2885();
		}
	}
}
