import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static693 {

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "[Lclient!s;")
	public static Class178[] aClass178Array2;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
	public static int anInt10383;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_121 = new Class345(81, 8);

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "Lclient!sia;")
	public static final Class339 aClass339_79 = new Class339();

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
	public static int anInt10382 = -1;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(III)Ljava/lang/String;")
	public static String method9009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "([[BBLclient!taa;)V")
	public static void method9010(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class306_Sub1 arg1) {
		@Pc(10) int local10;
		@Pc(13) int local13;
		@Pc(22) int local22;
		@Pc(32) int local32;
		for (@Pc(5) int local5 = 0; local5 < arg1.anInt8913; local5++) {
			Static557.method7331();
			for (local10 = 0; local10 < Static720.anInt10859 >> 3; local10++) {
				for (local13 = 0; local13 < Static501.anInt7568 >> 3; local13++) {
					local22 = Static623.anIntArrayArrayArray19[local5][local10][local13];
					if (local22 != -1) {
						local32 = local22 >> 24 & 0x3;
						if (!arg1.aBoolean673 || local32 == 0) {
							@Pc(48) int local48 = local22 >> 1 & 0x3;
							@Pc(54) int local54 = local22 >> 14 & 0x3FF;
							@Pc(60) int local60 = local22 >> 3 & 0x7FF;
							@Pc(70) int local70 = local60 / 8 + (local54 / 8 << 8);
							for (@Pc(72) int local72 = 0; local72 < Static89.anIntArray169.length; local72++) {
								if (local70 == Static89.anIntArray169[local72] && arg0[local72] != null) {
									@Pc(91) Class2_Sub21 local91 = new Class2_Sub21(arg0[local72]);
									arg1.method7891(local5, local32, local10 * 8, local60, local13 * 8, local91, local48, local54, Static577.aClass110Array1);
									arg1.method7895(local10 * 8, Static163.aClass19_17, local60, local91, local5, local54, local48, local32, local13 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < arg1.anInt8913; local10++) {
			Static557.method7331();
			for (local13 = 0; local13 < Static720.anInt10859 >> 3; local13++) {
				for (local22 = 0; local22 < Static501.anInt7568 >> 3; local22++) {
					local32 = Static623.anIntArrayArrayArray19[local10][local13][local22];
					if (local32 == -1) {
						arg1.method7889(8, local22 * 8, local13 * 8, local10, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public static void method9012() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			Static572.aBooleanArray29[local1] = false;
		}
		Static179.anInt2991 = 0;
		Static374.anInt5907 = -1;
		Static314.anInt5035 = 0;
		Static197.anInt3260 = -1;
		Static511.anInt7645 = 1;
		anInt10383 = -1;
		Static692.anInt10376 = -1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V")
	public static void method9013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) Class2_Sub2_Sub2 local21 = Static440.method5963(19, (long) arg0 | (long) arg1 << 32);
		local21.method205();
	}
}
