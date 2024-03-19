import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	public static int anInt3641;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
	public static int anInt3639 = -1;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString129 = " has logged in.";

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "[I")
	public static final int[] anIntArray256 = new int[13];

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "[I")
	public static final int[] anIntArray257 = new int[4096];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!fg;I)V")
	public static void method3210(@OriginalArg(0) Class7_Sub1_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt7098 - Static197.anInt4521;
		@Pc(25) int local25 = arg0.anInt7075 * 128 + arg0.method5973() * 64;
		@Pc(36) int local36 = arg0.anInt7048 * 128 + arg0.method5973() * 64;
		arg0.anInt7106 = 0;
		arg0.anInt7032 += (local36 - arg0.anInt7032) / local13;
		arg0.anInt7027 += (local25 - arg0.anInt7027) / local13;
		if (arg0.anInt7065 == 0) {
			arg0.method5985(8192);
		}
		if (arg0.anInt7065 == 1) {
			arg0.method5985(12288);
		}
		if (arg0.anInt7065 == 2) {
			arg0.method5985(0);
		}
		if (arg0.anInt7065 == 3) {
			arg0.method5985(4096);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method3211() {
		@Pc(1) Class202 local1 = Static199.aClass202_1;
		synchronized (Static199.aClass202_1) {
			Static237.anInt5288 = Static89.anInt2373;
			Static301.anInt6298++;
			Static229.anInt5102 = Static272.anInt5742;
			Static85.anInt2268 = Static206.anInt4785;
			Static195.anInt4494 = Static37.anInt1171;
			Static324.anInt6648 = Static335.anInt6982;
			Static121.anInt3045 = Static164.anInt3993;
			Static202.aLong139 = Static327.aLong207;
			Static37.anInt1171 = 0;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!e;")
	public static Class53 method3213(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class53_Sub2");
			@Pc(10) Class53 local10 = (Class53) local6.getDeclaredConstructor().newInstance();
			local10.method5603(arg0);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class53_Sub1 local29 = new Class53_Sub1();
			local29.method5603(arg0);
			return local29;
		}
	}
}
