import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	public static int anInt6031;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public static int anInt6032;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!we;")
	public static Class215 aClass215_84 = new Class215(64);

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	public static int anInt6033 = -1;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString222 = "Cancel";

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!vp;I)V")
	public static void method5100(@OriginalArg(0) Class7_Sub1_Sub1_Sub2 arg0) {
		if (Static237.anInt5285 >= 400 || Static264.aClass7_Sub1_Sub1_Sub2_2 == arg0) {
			return;
		}
		@Pc(35) String local35;
		@Pc(83) int local83;
		if (arg0.anInt7120 == 0) {
			@Pc(39) boolean local39 = true;
			if (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7115 != -1 && arg0.anInt7115 != -1) {
				@Pc(58) int local58 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133 > arg0.anInt7133 ? Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133 : arg0.anInt7133;
				@Pc(73) int local73 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7115 >= arg0.anInt7115 ? arg0.anInt7115 : Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7115;
				local83 = local73 + local58 * 10 / 100 + 5;
				@Pc(89) int local89 = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133 - arg0.anInt7133;
				if (local89 < 0) {
					local89 = -local89;
				}
				if (local83 < local89) {
					local39 = false;
				}
			}
			@Pc(112) String local112 = Static199.anInt4559 == 1 ? Static59.aString251 : Static91.aString89;
			if (arg0.anInt7133 < arg0.anInt7139) {
				local35 = arg0.method5993() + (local39 ? Static160.method6127(arg0.anInt7133, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133) : "<col=ffffff>") + " (" + local112 + arg0.anInt7133 + "+" + (arg0.anInt7139 - arg0.anInt7133) + ")";
			} else {
				local35 = arg0.method5993() + (local39 ? Static160.method6127(arg0.anInt7133, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133) : "<col=ffffff>") + " (" + local112 + arg0.anInt7133 + ")";
			}
		} else {
			local35 = arg0.method5993() + " (" + Static36.aString49 + arg0.anInt7120 + ")";
		}
		if (Static234.anInt5231 == 1) {
			Static286.method5110(Static350.anInt7317, (long) arg0.anInt7070, Static252.aString195, 0, Static238.aString187 + " -> <col=ffffff>" + local35, 0, 9);
		} else if (!Static246.aBoolean472) {
			for (@Pc(227) int local227 = 7; local227 >= 0; local227--) {
				if (Static6.aStringArray2[local227] != null) {
					@Pc(235) short local235 = 0;
					if (Static199.anInt4559 == 0 && Static6.aStringArray2[local227].equalsIgnoreCase(Static283.aString221)) {
						if (arg0.anInt7133 > Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133) {
							local235 = 2000;
						}
						if (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7147 != 0 && arg0.anInt7147 != 0) {
							if (arg0.anInt7147 == Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7147) {
								local235 = 2000;
							} else {
								local235 = 0;
							}
						}
					} else if (Static55.aBooleanArray4[local227]) {
						local235 = 2000;
					}
					@Pc(296) short local296 = (short) (Static22.aShortArray8[local227] + local235);
					local83 = Static254.anIntArray405[local227] == -1 ? Static183.anInt4318 : Static254.anIntArray405[local227];
					Static286.method5110(local83, (long) arg0.anInt7070, Static6.aStringArray2[local227], 0, "<col=ffffff>" + local35, 0, local296);
				}
			}
		} else if ((Static302.anInt6307 & 0x8) != 0) {
			Static286.method5110(Static355.anInt4215, (long) arg0.anInt7070, Static49.aString57, 0, Static174.aString153 + " -> <col=ffffff>" + local35, 0, 25);
		}
		for (@Pc(375) Class1_Sub22 local375 = (Class1_Sub22) Static97.aClass130_9.method3749(); local375 != null; local375 = (Class1_Sub22) Static97.aClass130_9.method3756()) {
			if (local375.anInt4308 == 57) {
				local375.aString159 = "<col=ffffff>" + local35;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIC)I")
	public static int method5101(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
