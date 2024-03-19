import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
	public static final int[] anIntArray453 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public static int anInt5962 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZZIZII)V")
	public static void method5030(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) Class27_Sub1 local20 = Static323.aClass27_Sub1Array2[local14];
		Static323.aClass27_Sub1Array2[local14] = Static323.aClass27_Sub1Array2[arg0];
		Static323.aClass27_Sub1Array2[arg0] = local20;
		for (@Pc(32) int local32 = arg3; local32 < arg0; local32++) {
			if (Static172.method5647(local20, arg2, arg5, arg4, Static323.aClass27_Sub1Array2[local32], arg1) <= 0) {
				@Pc(49) Class27_Sub1 local49 = Static323.aClass27_Sub1Array2[local32];
				Static323.aClass27_Sub1Array2[local32] = Static323.aClass27_Sub1Array2[local16];
				Static323.aClass27_Sub1Array2[local16++] = local49;
			}
		}
		Static323.aClass27_Sub1Array2[arg0] = Static323.aClass27_Sub1Array2[local16];
		Static323.aClass27_Sub1Array2[local16] = local20;
		method5030(local16 - 1, arg1, arg2, arg3, arg4, arg5);
		method5030(arg0, arg1, arg2, local16 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	public static void method5034(@OriginalArg(0) int arg0) {
		Static245.anIntArray228 = new int[arg0];
		Static73.anIntArray129 = new int[arg0];
		Static77.anIntArray135 = new int[arg0];
		Static249.anIntArray399 = new int[arg0];
		Static205.anIntArray358 = new int[arg0];
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Z")
	public static boolean method5037(@OriginalArg(0) int arg0) {
		@Pc(7) Class27_Sub1 local7 = Static94.method2020(arg0);
		if (local7 == null) {
			return false;
		} else if (Static313.anInt6481 == 3) {
			@Pc(41) String local41 = "";
			if (Static312.anInt6002 != 0) {
				local41 = ":" + (local7.anInt936 + 7000);
			}
			@Pc(56) String local56 = "";
			if (Static327.aString256 != null) {
				local56 = "/p=" + Static327.aString256;
			}
			@Pc(116) String local116 = "http://" + local7.aString42 + local41 + "/l=" + Static60.anInt6011 + "/a=" + Static192.anInt4459 + local56 + "/j" + (Static208.aBoolean333 ? "1" : "0") + ",o" + (Static174.aBoolean294 ? "1" : "0") + ",a2";
			try {
				Static345.aClient1.getAppletContext().showDocument(new URL(local116), "_self");
				return true;
			} catch (@Pc(126) Exception local126) {
				return false;
			}
		} else {
			Static300.aString235 = local7.aString42;
			Static154.anInt3814 = local7.anInt936;
			if (Static312.anInt6002 != 0) {
				Static124.anInt3119 = Static154.anInt3814 + 50000;
				Static56.anInt1631 = Static154.anInt3814 + 40000;
				Static272.anInt5743 = Static56.anInt1631;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
	public static void method5044() {
		@Pc(5) Class215 local5 = Static28.aClass215_16;
		synchronized (Static28.aClass215_16) {
			Static28.aClass215_16.method6063(5);
		}
	}
}
