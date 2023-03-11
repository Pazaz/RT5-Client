import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt5968 = -2;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!cf;)Ljava/lang/String;")
	public static String method5421(@OriginalArg(1) Class2_Sub5 arg0) {
		return arg0.aString11 == null || arg0.aString11.length() <= 0 ? arg0.aString10 : arg0.aString10 + Static161.aClass79_67.method2267(Static295.anInt5581) + arg0.aString11;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public static void method5425() {
		@Pc(12) Class204 local12 = null;
		try {
			@Pc(16) Class32 local16 = Static328.aClass152_5.method3756();
			while (local16.anInt993 == 0) {
				Static231.method4023(1L);
			}
			if (local16.anInt993 == 1) {
				local12 = (Class204) local16.anObject2;
				@Pc(40) byte[] local40 = new byte[(int) local12.method5196()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local12.method5194(local40.length - local42, local42, local40);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static180.method3368(new Class2_Sub4(local40));
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local12 != null) {
				local12.method5193();
			}
		} catch (@Pc(89) Exception local89) {
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
	public static void method5428(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static316.method5413(9, arg0);
		local13.method2312();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method5429(@OriginalArg(1) Class19 arg0) {
		if (Static142.aClass135_21.method3543() == 0) {
			return;
		}
		@Pc(50) Class2_Sub17 local50;
		if (Static77.anInt1762 == 0) {
			for (local50 = (Class2_Sub17) Static142.aClass135_21.method3551(); local50 != null; local50 = (Class2_Sub17) Static142.aClass135_21.method3552()) {
				Static313.aClass107_2.method2769(local50.anInt2541, Static200.aClass130_3, local50.anInt2539, arg0, false, local50.anInt2535, false, local50.aBoolean183 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null, local50.anInt2537, arg0, local50.anInt2538);
				local50.method6468();
			}
			Static98.method2107();
			return;
		}
		if (Static179.aClass19_5 == null) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(36, 32);
			Static179.aClass19_5 = Static387.method2822(0, Static328.aClass152_5, Static128.anInterface2_4, local18, 0);
			Static76.aClass130_2 = Static179.aClass19_5.method2857(Static101.method2165(Static183.anInt80, Static255.aClass197_64), Static396.method1688(Static30.aClass197_5, Static183.anInt80));
		}
		for (local50 = (Class2_Sub17) Static142.aClass135_21.method3551(); local50 != null; local50 = (Class2_Sub17) Static142.aClass135_21.method3552()) {
			Static313.aClass107_2.method2769(local50.anInt2541, Static76.aClass130_2, local50.anInt2539, arg0, false, local50.anInt2535, false, local50.aBoolean183 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null, local50.anInt2537, Static179.aClass19_5, local50.anInt2538);
			local50.method6468();
		}
	}
}
