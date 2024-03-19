import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "[Lclient!ja;")
	public static Class95[] aClass95Array1;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!qj;")
	public static Class162 aClass162_51;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Lclient!qj;")
	public static Class162 aClass162_52;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public static int anInt1205;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public static int anInt1197 = 0;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString50 = "Allocating memory";

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method941() {
		@Pc(5) Class215 local5 = Static124.aClass215_49;
		synchronized (Static124.aClass215_49) {
			Static124.aClass215_49.method6060();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Lclient!fp;")
	public static Class65 method942(@OriginalArg(1) int arg0) {
		@Pc(5) Class215 local5 = Static84.aClass215_35;
		@Pc(16) Class65 local16;
		synchronized (Static84.aClass215_35) {
			local16 = (Class65) Static84.aClass215_35.method6057((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(32) byte[] local32 = Static351.aClass162_242.method4636(arg0, 16);
		local16 = new Class65();
		if (local32 != null) {
			local16.method1948(new Class1_Sub16(local32));
		}
		@Pc(61) Class215 local61 = Static84.aClass215_35;
		synchronized (Static84.aClass215_35) {
			Static84.aClass215_35.method6050(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static239.anInt5299 && arg4 <= Static179.anInt4229 && arg8 >= Static239.anInt5299 && arg8 <= Static179.anInt4229 && arg3 >= Static239.anInt5299 && arg3 <= Static179.anInt4229 && arg6 >= Static239.anInt5299 && arg6 <= Static179.anInt4229 && arg5 >= Static180.anInt4240 && arg5 <= Static197.anInt4520 && Static180.anInt4240 <= arg1 && Static197.anInt4520 >= arg1 && Static180.anInt4240 <= arg2 && arg2 <= Static197.anInt4520 && Static180.anInt4240 <= arg7 && Static197.anInt4520 >= arg7) {
			Static347.method5856(arg3, arg0, arg5, arg1, arg2, arg4, arg6, arg8, arg7);
		} else {
			Static305.method5381(arg1, arg4, arg5, arg7, arg6, arg8, arg2, arg0, arg3);
		}
	}
}
