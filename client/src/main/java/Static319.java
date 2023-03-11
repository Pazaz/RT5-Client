import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	public static final int anInt5977 = 50;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "[I")
	public static final int[] anIntArray397 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
	public static final int[] anIntArray398 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
	public static final int[] anIntArray399 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "[I")
	public static final int[] anIntArray400 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[200];

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray55 = new String[anInt5977];

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
	public static final int[] anIntArray401 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
	public static final int[] anIntArray402 = new int[anInt5977];

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
	public static final int[] anIntArray403 = new int[13];

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Lclient!h;")
	public static final Class89 aClass89_211 = new Class89(32, -2);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
	public static int method5430() {
		try {
			if (Static77.anInt1751 == 0) {
				if (Static349.aLong200 > Static204.method3685() - 5000L) {
					return 0;
				}
				Static158.aClass32_7 = Static328.aClass152_5.method3751(Static61.aString14, Static278.anInt5154);
				Static284.aLong157 = Static204.method3685();
				Static77.anInt1751 = 1;
			}
			if (Static204.method3685() > Static284.aLong157 + 30000L) {
				return Static101.method2166(1000);
			}
			@Pc(114) int local114;
			if (Static77.anInt1751 == 1) {
				if (Static158.aClass32_7.anInt993 == 2) {
					return Static101.method2166(1001);
				}
				if (Static158.aClass32_7.anInt993 != 1) {
					return -1;
				}
				Static335.aClass111_4 = new Class111((Socket) Static158.aClass32_7.anObject2, Static328.aClass152_5);
				Static158.aClass32_7 = null;
				@Pc(76) int local76 = 0;
				Static257.aClass2_Sub4_Sub2_4.anInt5300 = 0;
				if (Static70.aBoolean130) {
					local76 = Static361.anInt6767;
				}
				Static257.aClass2_Sub4_Sub2_4.method4842(Static43.aClass242_9.anInt7038);
				Static257.aClass2_Sub4_Sub2_4.method4813(local76);
				Static335.aClass111_4.method2797(Static257.aClass2_Sub4_Sub2_4.anInt5300, Static257.aClass2_Sub4_Sub2_4.aByteArray73);
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6325();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6325();
				}
				local114 = Static335.aClass111_4.method2800();
				if (Static303.aClass221_2 != null) {
					Static303.aClass221_2.method6325();
				}
				if (Static190.aClass221_1 != null) {
					Static190.aClass221_1.method6325();
				}
				if (local114 != 0) {
					return Static101.method2166(local114);
				}
				Static77.anInt1751 = 2;
			}
			if (Static77.anInt1751 == 2) {
				if (Static335.aClass111_4.method2795() < 2) {
					return -1;
				}
				Static290.anInt5496 = Static335.aClass111_4.method2800();
				Static290.anInt5496 <<= 0x8;
				Static290.anInt5496 += Static335.aClass111_4.method2800();
				Static298.aByteArray27 = new byte[Static290.anInt5496];
				Static218.anInt914 = 0;
				Static77.anInt1751 = 3;
			}
			if (Static77.anInt1751 != 3) {
				return -1;
			}
			local114 = Static335.aClass111_4.method2795();
			if (local114 < 1) {
				return -1;
			}
			if (local114 > Static290.anInt5496 - Static218.anInt914) {
				local114 = Static290.anInt5496 - Static218.anInt914;
			}
			Static335.aClass111_4.method2793(Static298.aByteArray27, local114, Static218.anInt914);
			Static218.anInt914 += local114;
			if (Static290.anInt5496 > Static218.anInt914) {
				return -1;
			} else if (Static158.method2944(Static298.aByteArray27)) {
				Static300.aClass3_Sub1Array2 = new Class3_Sub1[Static299.anInt5643];
				@Pc(234) int local234 = 0;
				for (@Pc(236) int local236 = Static375.anInt7042; local236 <= Static312.anInt5843; local236++) {
					@Pc(242) Class3_Sub1 local242 = Static7.method6467(local236);
					if (local242 != null) {
						Static300.aClass3_Sub1Array2[local234++] = local242;
					}
				}
				Static279.aClass2_Sub16_1 = null;
				Static92.anInt1913 = 0;
				Static335.aClass111_4.method2799();
				Static77.anInt1751 = 0;
				Static12.anInt270 = 0;
				Static298.aByteArray27 = null;
				Static335.aClass111_4 = null;
				Static349.aLong200 = Static204.method3685();
				return 0;
			} else {
				return Static101.method2166(1002);
			}
		} catch (@Pc(274) IOException local274) {
			return Static101.method2166(1003);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
	public static int method5431(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(10) Class2_Sub2_Sub7 local10 = Static316.method5413(3, arg0);
		local10.method2311();
		local10.aString21 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIILjava/lang/String;)I")
	public static int method5433(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local46 >= '0' && local46 <= '9') {
				local78 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local78 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local78 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local78) {
				throw new NumberFormatException();
			}
			if (local26) {
				local78 = -local78;
			}
			@Pc(130) int local130 = local78 + arg0 * local30;
			if (local130 / arg0 != local30) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local130;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	public static void method5435() {
		if (Static347.anInt6441 == 5) {
			Static347.anInt6441 = 6;
		}
	}
}
