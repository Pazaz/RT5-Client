import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!to", name = "H", descriptor = "Lclient!j;")
	public static Class94 aClass94_4;

	@OriginalMember(owner = "client!to", name = "S", descriptor = "I")
	public static int anInt6424;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString240 = "Loaded title screen";

	@OriginalMember(owner = "client!to", name = "V", descriptor = "Z")
	public static boolean aBoolean465 = true;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(I)V")
	public static void method5402() {
		@Pc(10) int local10 = Static299.aClass1_Sub16_Sub2_3.method5800(8);
		@Pc(19) int local19;
		if (Static329.anInt6733 > local10) {
			for (local19 = local10; local19 < Static329.anInt6733; local19++) {
				Static305.anIntArray489[Static15.anInt631++] = Static238.anIntArray389[local19];
			}
		}
		if (Static329.anInt6733 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static329.anInt6733 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(58) int local58 = Static238.anIntArray389[local19];
			@Pc(62) Class7_Sub1_Sub1_Sub2 local62 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local58];
			@Pc(67) int local67 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
			if (local67 == 0) {
				Static238.anIntArray389[Static329.anInt6733++] = local58;
				local62.anInt7079 = Static197.anInt4521;
			} else {
				@Pc(87) int local87 = Static299.aClass1_Sub16_Sub2_3.method5800(2);
				if (local87 == 0) {
					Static238.anIntArray389[Static329.anInt6733++] = local58;
					local62.anInt7079 = Static197.anInt4521;
					Static31.anIntArray61[Static318.anInt6552++] = local58;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local87 == 1) {
						Static238.anIntArray389[Static329.anInt6733++] = local58;
						local62.anInt7079 = Static197.anInt4521;
						local134 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
						local62.method5977(local134, 1);
						local144 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
						if (local144 == 1) {
							Static31.anIntArray61[Static318.anInt6552++] = local58;
						}
					} else if (local87 == 2) {
						Static238.anIntArray389[Static329.anInt6733++] = local58;
						local62.anInt7079 = Static197.anInt4521;
						if (Static299.aClass1_Sub16_Sub2_3.method5800(1) == 1) {
							local134 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
							local62.method5977(local134, 2);
							local144 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
							local62.method5977(local144, 2);
						} else {
							local134 = Static299.aClass1_Sub16_Sub2_3.method5800(3);
							local62.method5977(local134, 0);
						}
						local134 = Static299.aClass1_Sub16_Sub2_3.method5800(1);
						if (local134 == 1) {
							Static31.anIntArray61[Static318.anInt6552++] = local58;
						}
					} else if (local87 == 3) {
						Static305.anIntArray489[Static15.anInt631++] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5403(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(3, arg1);
		local8.method2539();
		local8.aString107 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIZIII)V")
	public static void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class177 local8 = Static183.method3720(arg2, arg5);
		if (local8 != null && local8.anObjectArray24 != null) {
			@Pc(17) Class1_Sub15 local17 = new Class1_Sub15();
			local17.aClass177_9 = local8;
			local17.anObjectArray4 = local8.anObjectArray24;
			Static267.method4825(local17);
		}
		Static156.anInt3876 = arg2;
		Static355.anInt4215 = arg3;
		Static302.anInt6307 = arg4;
		Static161.anInt3951 = arg1;
		Static246.aBoolean472 = true;
		Static139.anInt3442 = arg5;
		Static245.anInt3134 = arg0;
		Static145.method3188(local8);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method5406(@OriginalArg(1) String arg0) {
		return Static316.method5518(arg0, 16);
	}
}
