import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	public static void method4208() {
		if (Static295.anInt6177 == -1) {
			return;
		}
		@Pc(14) int local14 = Static229.anInt5102;
		@Pc(16) int local16 = Static85.anInt2268;
		if (Static195.anInt4494 != 0) {
			local16 = Static121.anInt3045;
			local14 = Static324.anInt6648;
		}
		Static228.method4358(0, 0, 0, 0, Static350.anInt7318, local16, Static107.anInt2674, local14, Static295.anInt6177);
		if (Static244.aClass177_6 != null) {
			Static260.method4754(local16, local14);
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	public static void method4211() {
		@Pc(5) Class215 local5 = Static274.aClass215_83;
		synchronized (Static274.aClass215_83) {
			Static274.aClass215_83.method6063(5);
		}
		local5 = Static245.aClass215_50;
		synchronized (Static245.aClass215_50) {
			Static245.aClass215_50.method6063(5);
		}
		local5 = Static256.aClass215_78;
		synchronized (Static256.aClass215_78) {
			Static256.aClass215_78.method6063(5);
		}
		local5 = Static301.aClass215_89;
		synchronized (Static301.aClass215_89) {
			Static301.aClass215_89.method6063(5);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!pp;)V")
	public static void method4213(@OriginalArg(1) int arg0, @OriginalArg(2) Class157 arg1) {
		if (Static160.aBoolean518) {
			Static160.aBoolean518 = false;
			arg0 = 0;
		}
		if (Static146.aClass157_1 != null && Static146.aClass157_1.method4519(arg1)) {
			return;
		}
		Static146.aClass157_1 = arg1;
		Static2.aLong214 = Static325.method5658();
		Static318.anInt6553 = arg0;
		Static259.anInt4934 = arg0;
		if (Static259.anInt4934 == 0) {
			Static64.method1500();
			return;
		}
		Static101.aFloat19 = Static350.aFloat77;
		Static156.aFloat48 = Static137.aFloat45;
		Static38.anInt1205 = Static179.anInt4232;
		Static295.aFloat75 = Static239.aFloat64;
		Static274.anInt5833 = Static173.anInt4118;
		Static248.aClass94_3 = Static307.aClass94_4;
		Static330.aFloat76 = Static353.aFloat78;
		Static262.aFloat71 = Static276.aFloat73;
		Static214.aFloat62 = Static278.aFloat49;
		Static26.anInt888 = Static219.anInt4983;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BI)Lclient!dl;")
	public static Class48 method4215(@OriginalArg(1) int arg0) {
		@Pc(5) Class215 local5 = Static218.aClass215_68;
		@Pc(14) Class48 local14;
		synchronized (Static218.aClass215_68) {
			local14 = (Class48) Static218.aClass215_68.method6057((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static38.aClass162_52.method4636(arg0, 3);
		local14 = new Class48();
		if (local30 != null) {
			local14.method1365(new Class1_Sub16(local30));
		}
		@Pc(50) Class215 local50 = Static218.aClass215_68;
		synchronized (Static218.aClass215_68) {
			Static218.aClass215_68.method6050(local14, (long) arg0);
			return local14;
		}
	}
}
