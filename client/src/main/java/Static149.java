import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ema", name = "k", descriptor = "I")
	public static int anInt2623;

	@OriginalMember(owner = "client!ema", name = "f", descriptor = "J")
	public static volatile long aLong96 = 0L;

	@OriginalMember(owner = "client!ema", name = "c", descriptor = "Lclient!fla;")
	public static final Class130 aClass130_4 = new Class130();

	@OriginalMember(owner = "client!ema", name = "i", descriptor = "I")
	public static final int anInt2630 = 1408;

	@OriginalMember(owner = "client!ema", name = "o", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!ema", name = "j", descriptor = "Lclient!kh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2449(@OriginalArg(0) Class19 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (Static137.aBoolean210) {
			local5 = Static130.method2283();
			local7 = Static422.method5771();
		}
		@Pc(19) int local19 = Static71.anInt1576 + local5;
		@Pc(23) int local23 = local7 + Static84.anInt1775;
		@Pc(25) int local25 = Static682.anInt10295;
		@Pc(29) int local29 = Static407.anInt6288 - 3;
		Static87.method1693(Static682.anInt10295, Static407.anInt6288, Static32.aClass32_24.method877(Static51.anInt1052), arg0, local7 + Static84.anInt1775, Static71.anInt1576 - -local5);
		@Pc(55) int local55 = Static189.aClass120_1.method8853() + local5;
		@Pc(66) int local66 = local7 + Static189.aClass120_1.method8854();
		@Pc(70) int local70;
		@Pc(77) Class2_Sub2_Sub4 local77;
		@Pc(89) int local89;
		@Pc(202) int local202;
		@Pc(281) Class2_Sub2_Sub16 local281;
		@Pc(190) Class2_Sub2_Sub16 local190;
		if (Static236.aBoolean304) {
			local70 = 0;
			for (local77 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4352(); local77 != null; local77 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4350()) {
				local89 = local23 + local70 * 16 + 13 + 20;
				if (local55 > local5 + Static71.anInt1576 && local55 < local5 + Static71.anInt1576 + Static682.anInt10295 && local66 > local89 - 13 && local66 < local89 + 4 && (local77.anInt1534 > 1 || ((Class2_Sub2_Sub16) local77.aClass192_3.aClass2_Sub2_36.aClass2_Sub2_66).aBoolean552)) {
					arg0.aa(local5 + Static71.anInt1576, local89 + -12, Static682.anInt10295, 16, 255 - Static405.anInt6255 << 24 | Static183.anInt3022, 1);
				}
				local70++;
			}
			if (Static139.aClass2_Sub2_Sub4_1 != null) {
				Static87.method1693(Static85.anInt10675, Static25.anInt598, Static139.aClass2_Sub2_Sub4_1.aString10, arg0, Static493.anInt7364, Static692.anInt10375);
				local70 = 0;
				for (local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass192_3.method4352(); local190 != null; local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass192_3.method4350()) {
					local202 = Static493.anInt7364 + local70 * 16 + 13 + 20;
					if (Static692.anInt10375 < local55 && Static692.anInt10375 + Static85.anInt10675 > local55 && local66 > local202 - 13 && local66 < local202 + 4 && local190.aBoolean552) {
						arg0.aa(Static692.anInt10375, local202 - 12, Static85.anInt10675, 16, 255 - Static405.anInt6255 << 24 | Static183.anInt3022, 1);
					}
					local70++;
				}
				Static292.method4604(Static493.anInt7364, arg0, Static692.anInt10375, Static85.anInt10675, Static25.anInt598);
			}
		} else {
			local70 = 0;
			for (local281 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7699(65280); local281 != null; local281 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7706()) {
				local89 = (Static594.anInt8777 - local70 - 1) * 16 + local23 + 33;
				local70++;
				if (local5 + Static71.anInt1576 < local55 && local5 + Static71.anInt1576 + Static682.anInt10295 > local55 && local66 > local89 - 13 && local89 + 4 > local66 && local281.aBoolean552) {
					arg0.aa(local5 + Static71.anInt1576, local89 + -12, Static682.anInt10295, 16, Static183.anInt3022 | 255 - Static405.anInt6255 << 24, 1);
				}
			}
		}
		Static292.method4604(local7 + Static84.anInt1775, arg0, Static71.anInt1576 + local5, Static682.anInt10295, Static407.anInt6288);
		if (Static236.aBoolean304) {
			local70 = 0;
			for (local77 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4352(); local77 != null; local77 = (Class2_Sub2_Sub4) Static350.aClass192_8.method4350()) {
				local89 = local70 * 16 + local7 + Static84.anInt1775 + 33;
				if (local77.anInt1534 == 1) {
					Static232.method3387(arg0, Static682.anInt10295, Static407.anInt6288, Static84.anInt1775 + local7, local89, Static634.anInt9510 | 0xFF000000, (Class2_Sub2_Sub16) local77.aClass192_3.aClass2_Sub2_36.aClass2_Sub2_66, Static563.anInt8455 | 0xFF000000, local66, Static71.anInt1576 + local5, local55);
				} else {
					Static515.method6799(local66, Static682.anInt10295, local89, Static634.anInt9510 | 0xFF000000, arg0, local55, Static563.anInt8455 | 0xFF000000, local7 + Static84.anInt1775, local5 + Static71.anInt1576, Static407.anInt6288, local77);
				}
				local70++;
			}
			if (Static139.aClass2_Sub2_Sub4_1 != null) {
				local70 = 0;
				for (local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass192_3.method4352(); local190 != null; local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass192_3.method4350()) {
					local202 = Static493.anInt7364 + local70 * 16 + 20 + 13;
					Static232.method3387(arg0, Static85.anInt10675, Static25.anInt598, Static493.anInt7364, local202, Static634.anInt9510 | 0xFF000000, local190, Static563.anInt8455 | 0xFF000000, local66, Static692.anInt10375, local55);
					local70++;
				}
				Static422.method5773(Static692.anInt10375, Static493.anInt7364, Static85.anInt10675, Static25.anInt598);
			}
		} else {
			local70 = 0;
			for (local281 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7699(65280); local281 != null; local281 = (Class2_Sub2_Sub16) Static693.aClass339_79.method7706()) {
				local89 = local23 + (-local70 + -1 + Static594.anInt8777) * 16 + 13 + 20;
				local70++;
				Static232.method3387(arg0, local25, local29, local23, local89, Static634.anInt9510 | 0xFF000000, local281, Static563.anInt8455 | 0xFF000000, local66, local19, local55);
			}
		}
		Static422.method5773(Static71.anInt1576 + local5, Static84.anInt1775 - -local7, Static682.anInt10295, Static407.anInt6288);
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(I)V")
	public static void method2450() {
		Static186.aClass82_67.method2151();
	}
}
