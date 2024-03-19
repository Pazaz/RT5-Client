import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	public static int anInt6047;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
	public static int anInt6050;

	@OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
	public static int anInt6057;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
	public static int anInt6044 = 0;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
	public static final int anInt6053 = 50;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
	public static final int[] anIntArray458 = new int[anInt6053];

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "[I")
	public static final int[] anIntArray459 = new int[anInt6053];

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "[I")
	public static final int[] anIntArray460 = new int[anInt6053];

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
	public static int anInt6054 = 1;

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[anInt6053];

	@OriginalMember(owner = "client!sk", name = "B", descriptor = "[I")
	public static final int[] anIntArray461 = new int[anInt6053];

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "[I")
	public static final int[] anIntArray462 = new int[anInt6053];

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Lclient!we;")
	public static final Class215 aClass215_85 = new Class215(4);

	@OriginalMember(owner = "client!sk", name = "F", descriptor = "[I")
	public static final int[] anIntArray463 = new int[anInt6053];

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "Lclient!we;")
	public static final Class215 aClass215_86 = new Class215(5);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IJLjava/lang/String;IILjava/lang/String;II)V")
	public static void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!Static204.aBoolean329 && Static237.anInt5285 < 500) {
			@Pc(18) int local18 = arg0 == -1 ? Static161.anInt3951 : arg0;
			@Pc(29) Class1_Sub22 local29 = new Class1_Sub22(arg2, arg4, local18, arg6, arg1, arg3, arg5);
			Static97.aClass130_9.method3760(local29);
			Static237.anInt5285++;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method5111(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static144.anInt3574 = arg1;
		Static68.aString68 = arg0;
		Static96.aString91 = arg2;
		if (Static96.aString91.equals("") || Static68.aString68.equals("")) {
			Static6.anInt211 = 3;
		} else if (Static154.anInt3814 == -1) {
			Static250.anInt5421 = 0;
			Static6.anInt211 = -3;
			Static266.anInt5647 = 0;
			Static222.anInt5043 = 1;
			@Pc(40) Class1_Sub16 local40 = new Class1_Sub16(128);
			local40.method5771(10);
			local40.method5768((int) (Math.random() * 9.9999999E7D));
			local40.method5753(Static274.method4904(Static96.aString91));
			local40.method5768((int) (Math.random() * 9.9999999E7D));
			local40.method5726(Static68.aString68);
			local40.method5768((int) (Math.random() * 9.9999999E7D));
			local40.method5767(Static309.aBigInteger3, Static67.aBigInteger2);
			Static150.aClass1_Sub16_Sub2_2.anInt6813 = 0;
			Static150.aClass1_Sub16_Sub2_2.method5771(24);
			Static150.aClass1_Sub16_Sub2_2.method5771(local40.anInt6813 + 2);
			Static150.aClass1_Sub16_Sub2_2.method5757(562);
			Static150.aClass1_Sub16_Sub2_2.method5740(local40.aByteArray86, local40.anInt6813);
		} else {
			Static245.method2661();
		}
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	public static void method5113() {
		for (@Pc(12) int local12 = 0; local12 < Static49.anInt1559; local12++) {
			@Pc(18) int local18 = Static185.anIntArray309[local12];
			@Pc(22) Class7_Sub1_Sub1_Sub1 local22 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local18];
			if (local22 != null) {
				Static116.method2544(local22.aClass75_1.anInt2458, local22);
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	public static void method5114() {
		if (Static240.anInt5311 != -1) {
			Static309.method5433(-1, false, -1, Static240.anInt5311);
			Static240.anInt5311 = -1;
		}
	}
}
