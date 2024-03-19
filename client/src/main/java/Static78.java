import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Z")
	public static boolean aBoolean142;

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "[I")
	public static final int[] anIntArray137 = new int[2500];

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString80 = "glow1:";

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)I")
	public static int method1782(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!qj;Lclient!qj;)V")
	public static void method1783(@OriginalArg(1) Class162 arg0, @OriginalArg(2) Class162 arg1) {
		Static222.aClass162_181 = arg1;
		Static344.aClass162_237 = arg0;
		Static222.aClass162_181.method4640(36);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ai;II)V")
	public static void method1784(@OriginalArg(1) Class7_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt7046 == arg1 && arg1 != -1) {
			@Pc(75) Class165 local75 = Static231.method4385(arg1);
			@Pc(78) int local78 = local75.anInt5575;
			if (local78 == 1) {
				arg0.anInt7099 = 0;
				arg0.anInt7057 = 1;
				arg0.anInt7055 = arg2;
				arg0.anInt7037 = 0;
				arg0.anInt7047 = 0;
				Static209.method4128(arg0.anInt7027, false, arg0.anInt7047, arg0.anInt7032, local75);
			}
			if (local78 == 2) {
				arg0.anInt7099 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt7046 == -1 || Static231.method4385(arg1).anInt5568 >= Static231.method4385(arg0.anInt7046).anInt5568) {
			arg0.anInt7055 = arg2;
			arg0.anInt7046 = arg1;
			arg0.anInt7111 = arg0.anInt7113;
			arg0.anInt7099 = 0;
			arg0.anInt7057 = 1;
			arg0.anInt7037 = 0;
			arg0.anInt7047 = 0;
			if (arg0.anInt7046 != -1) {
				Static209.method4128(arg0.anInt7027, false, arg0.anInt7047, arg0.anInt7032, Static231.method4385(arg0.anInt7046));
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	public static void method1785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static84.anInt2246 == 0 || arg3 == 0 || Static88.anInt2333 >= 50 || arg2 == -1) {
			return;
		}
		Static246.anIntArray499[Static88.anInt2333] = arg2;
		Static101.anIntArray161[Static88.anInt2333] = arg3;
		Static187.anIntArray311[Static88.anInt2333] = arg1;
		Static114.aClass19Array2[Static88.anInt2333] = null;
		Static183.anIntArray308[Static88.anInt2333] = 0;
		Static308.anIntArray494[Static88.anInt2333] = arg0;
		Static88.anInt2333++;
	}
}
