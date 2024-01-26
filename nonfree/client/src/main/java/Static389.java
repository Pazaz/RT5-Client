import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!lga;")
	public static Class225 aClass225_157 = new Class225(121, 6);

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)Z")
	public static boolean method5474(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLclient!hda;I)V")
	public static void method5476(@OriginalArg(0) int arg0, @OriginalArg(2) Class158 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray14 != null) {
			@Pc(14) Class2_Sub42 local14 = new Class2_Sub42();
			local14.aClass158_14 = arg1;
			local14.anObjectArray36 = arg1.anObjectArray14;
			Static472.method6420(local14);
		}
		Static162.anInt2799 = arg1.anInt3760;
		Static450.anInt6819 = arg1.anInt3812;
		Static156.aBoolean223 = true;
		Static610.anInt9329 = arg2;
		Static369.anInt4263 = arg1.anInt3749;
		Static77.anInt1614 = arg1.anInt3741;
		Static442.anInt6699 = arg1.anInt3819;
		Static717.anInt10822 = arg0;
		Static178.method2729(arg1);
	}
}
