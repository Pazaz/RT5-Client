import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString10 = "Loading config - ";

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method228(@OriginalArg(1) Class162 arg0) {
		Static212.aClass162_245 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLjava/lang/String;III)V")
	public static void method230(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class177 local13 = Static183.method3720(arg3, arg1);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray33 != null) {
			@Pc(23) Class1_Sub15 local23 = new Class1_Sub15();
			local23.aString111 = arg0;
			local23.aClass177_9 = local13;
			local23.anObjectArray4 = local13.anObjectArray33;
			local23.anInt3113 = arg2;
			Static267.method4825(local23);
		}
		@Pc(40) boolean local40 = true;
		if (local13.anInt5819 > 0) {
			local40 = Static344.method6049(local13);
		}
		if (!local40 || !Static37.method930(local13).method5618(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static150.aClass1_Sub16_Sub2_2.method5793(216);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 2) {
			Static150.aClass1_Sub16_Sub2_2.method5793(19);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 3) {
			Static150.aClass1_Sub16_Sub2_2.method5793(193);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 4) {
			Static150.aClass1_Sub16_Sub2_2.method5793(76);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 5) {
			Static150.aClass1_Sub16_Sub2_2.method5793(173);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 6) {
			Static150.aClass1_Sub16_Sub2_2.method5793(89);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 7) {
			Static150.aClass1_Sub16_Sub2_2.method5793(221);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 8) {
			Static150.aClass1_Sub16_Sub2_2.method5793(137);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 9) {
			Static150.aClass1_Sub16_Sub2_2.method5793(63);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
		if (arg2 == 10) {
			Static150.aClass1_Sub16_Sub2_2.method5793(3);
			Static150.aClass1_Sub16_Sub2_2.method5768(arg1);
			Static150.aClass1_Sub16_Sub2_2.method5757(arg3);
		}
	}
}
