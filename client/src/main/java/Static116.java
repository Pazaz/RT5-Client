import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
	public static int anInt2957 = 0;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Loaded fonts";

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIBII)V")
	public static void method2537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(8) Class98[] local8 = Static36.aClass98Array1;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class98 local16 = local8[local10];
			if (local16 != null && local16.anInt3425 == 2) {
				Static73.method1722((local16.anInt3418 - Static149.anInt3667 << 7) + local16.anInt3421, arg0 >> 1, arg2 >> 1, local16.anInt3422 * 2, local16.anInt3426 + (local16.anInt3427 - Static96.anInt2446 << 7));
				if (Static47.anIntArray96[0] > -1 && Static197.anInt4521 % 20 < 10) {
					Static305.aClass29Array14[local16.anInt3430].method5845(Static47.anIntArray96[0] + arg3 - 12, Static47.anIntArray96[1] + arg1 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIZZF)[I")
	public static int[] method2543(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub2_Sub17 local10 = new Class1_Sub2_Sub17();
		local10.anInt3006 = 35;
		local10.anInt3003 = 8;
		local10.aBoolean200 = true;
		local10.anInt3004 = (int) (arg0 * 4096.0F);
		local10.anInt2993 = 8;
		local10.anInt3000 = 4;
		local10.method6090();
		Static184.method5962(1, 2048);
		local10.method2574(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!fg;)V")
	public static void method2544(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(16) int local16 = 0;
		if (Static197.anInt4521 < arg1.anInt7098) {
			Static147.method3210(arg1);
		} else if (arg1.anInt7044 >= Static197.anInt4521) {
			Static290.method5133(arg1);
		} else {
			Static146.method3194(arg1, false);
			local16 = Static355.anInt4214;
			local7 = Static285.anInt6032;
		}
		if (arg1.anInt7027 < 128 || arg1.anInt7032 < 128 || arg1.anInt7027 >= (Static25.anInt850 - 1) * 128 || arg1.anInt7032 >= Static219.anInt4987 * 128 - 128) {
			arg1.anInt7044 = 0;
			arg1.anInt7046 = -1;
			arg1.anInt7098 = 0;
			arg1.anInt7052 = -1;
			arg1.anInt7027 = arg1.anIntArray578[0] * 128 + arg1.method5973() * 64;
			arg1.anInt7032 = arg1.anIntArray579[0] * 128 + arg1.method5973() * 64;
			arg1.method5981();
		}
		if (Static264.aClass7_Sub1_Sub1_Sub2_2 == arg1 && (arg1.anInt7027 < 1536 || arg1.anInt7032 < 1536 || Static25.anInt850 * 128 - 1536 <= arg1.anInt7027 || arg1.anInt7032 >= (Static219.anInt4987 - 12) * 128)) {
			arg1.anInt7052 = -1;
			arg1.anInt7046 = -1;
			arg1.anInt7044 = 0;
			arg1.anInt7098 = 0;
			arg1.anInt7027 = arg1.anIntArray578[0] * 128 + arg1.method5973() * 64;
			arg1.anInt7032 = arg1.anIntArray579[0] * 128 + arg1.method5973() * 64;
			arg1.method5981();
		}
		@Pc(208) int local208 = Static164.method3438(arg1);
		Static21.method524(arg1, local208, local16, local7);
		Static118.method2580(arg1);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V")
	public static void method2545(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub1_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class77 local8 = Static336.aClass77Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static200.anInt4590; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static328.anInt6717; local15++) {
						local1 = local8.method4002(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class77 local41 = Static336.aClass77Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method3986(local15, local12) - local41.method3986(local15, local12);
									@Pc(67) int local67 = local8.method3986(local15 + 1, local12) - local41.method3986(local15 + 1, local12);
									@Pc(85) int local85 = local8.method3986(local15 + 1, local12 + 1) - local41.method3986(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method3986(local15, local12 + 1) - local41.method3986(local15, local12 + 1);
									local41.method3983(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}
}
