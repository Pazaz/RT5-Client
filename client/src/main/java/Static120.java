import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "Lclient!sb;")
	public static Class330 aClass330_19;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method2193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class158 local8 = Static15.method186(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(19) Class2_Sub42 local19 = new Class2_Sub42();
			local19.anObjectArray36 = local8.anObjectArray15;
			local19.anInt7219 = arg3;
			local19.aString84 = arg2;
			local19.aClass158_14 = local8;
			Static472.method6420(local19);
		}
		if (Static283.anInt4574 != 11 || !Static84.method1661(local8).method6221(arg3 - 1)) {
			return;
		}
		@Pc(64) Class2_Sub19 local64;
		if (arg3 == 1) {
			local64 = Static293.method4335(Static546.aClass345_98, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local64, arg1);
			Static405.aClass153_2.method3275(local64);
		}
		if (arg3 == 2) {
			local64 = Static293.method4335(Static323.aClass345_65, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local64, arg1);
			Static405.aClass153_2.method3275(local64);
		}
		if (arg3 == 3) {
			local64 = Static293.method4335(Static255.aClass345_54, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local64, arg1);
			Static405.aClass153_2.method3275(local64);
		}
		@Pc(148) Class2_Sub19 local148;
		if (arg3 == 4) {
			local148 = Static293.method4335(Static710.aClass345_93, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 5) {
			local148 = Static293.method4335(Static693.aClass345_121, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 6) {
			local148 = Static293.method4335(Static126.aClass345_23, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 7) {
			local148 = Static293.method4335(Static358.aClass345_124, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 8) {
			local148 = Static293.method4335(Static700.aClass345_123, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 9) {
			local148 = Static293.method4335(Static372.aClass345_69, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 10) {
			local148 = Static293.method4335(Static713.aClass345_125, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3760, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIJI)Ljava/lang/String;")
	public static String method2198(@OriginalArg(2) long arg0, @OriginalArg(3) int arg1) {
		Static356.method5196(arg0);
		@Pc(10) Calendar local10 = Static260.aCalendar1;
		@Pc(20) int local20 = local10.get(5);
		@Pc(26) int local26 = local10.get(2) + 1;
		@Pc(38) int local38 = local10.get(1);
		@Pc(42) int local42 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return Integer.toString(local20 / 10) + local20 % 10 + "/" + local26 / 10 + local26 % 10 + "/" + local38 % 100 / 10 + local38 % 10 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
