import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Z")
	public static boolean showocc = false;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
	public static final int[] anIntArray186 = new int[500];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Z")
	public static boolean method2953(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static66.anInt1624; local1 < Scene.anInt1914; local1++) {
			@Pc(6) Class67[][] local6 = Scene.aClass67ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Scene.anInt3788; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static248.anInt4650 + local9;
				@Pc(18) int local18 = Static248.anInt4650 - local9;
				if (local14 >= Static162.anInt2960 || local18 < Static221.anInt4637) {
					for (@Pc(27) int local27 = -Scene.anInt3788; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static211.anInt3780 + local27;
						@Pc(36) int local36 = Static211.anInt3780 - local27;
						@Pc(48) Class67 local48;
						if (local14 >= Static162.anInt2960) {
							if (local32 >= Static222.anInt3949) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean138) {
									Static79.aBoolean131 = arg0;
									Scene.aClass15_1.method1583(local48);
									Scene.aClass15_1.method1586();
								}
							}
							if (local36 < Static29.anInt722) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean138) {
									Static79.aBoolean131 = arg0;
									Scene.aClass15_1.method1583(local48);
									Scene.aClass15_1.method1586();
								}
							}
						}
						if (local18 < Static221.anInt4637) {
							if (local32 >= Static222.anInt3949) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean138) {
									Static79.aBoolean131 = arg0;
									Scene.aClass15_1.method1583(local48);
									Scene.aClass15_1.method1586();
								}
							}
							if (local36 < Static29.anInt722) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean138) {
									Static79.aBoolean131 = arg0;
									Scene.aClass15_1.method1583(local48);
									Scene.aClass15_1.method1586();
								}
							}
						}
						if (Static386.anInt6737 == 0) {
							if (Static161.aBoolean208) {
								Scene.aClass15_1.method1578(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(CB)Z")
	public static boolean method2954(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (StringUtils.isAlphanumeric(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Static201.aCharArray3;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (arg0 == local34) {
					return true;
				}
			}
			@Pc(54) char[] local54 = Static12.aCharArray1;
			for (@Pc(56) int local56 = 0; local56 < local54.length; local56++) {
				@Pc(62) char local62 = local54[local56];
				if (arg0 == local62) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!ml;ILclient!ci;II)Lclient!wm;")
	public static RasteriserBase method2955(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Signlink arg1, @OriginalArg(3) TextureProviderInterface arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Class local6 = Class.forName("Class19_Sub1");
			@Pc(58) Constructor local58 = local6.getConstructor(Canvas.class, TextureProviderInterface.class, Integer.TYPE, Integer.TYPE, Signlink.class);
			return (RasteriserBase) local58.newInstance(arg0, arg2, Integer.valueOf(arg4), new Integer(arg3), arg1);
		} catch (@Pc(91) Exception local91) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method2956() {
		Static268.anInt4959 = 0;
		Static129.aClass135_19.clear();
		Static375.aBoolean477 = false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method2957(@OriginalArg(1) int arg0) {
		if (!Static222.method3916(arg0)) {
			return;
		}
		@Pc(14) Component[] local14 = Static26.aClass161ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Component local22 = local14[local16];
			if (local22 != null) {
				local22.anInt4247 = 0;
				local22.anInt4283 = 0;
				local22.anInt4316 = 1;
			}
		}
	}
}
