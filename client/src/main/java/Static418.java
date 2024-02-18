import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "[I")
	public static int[] anIntArray704;

	// $FF: synthetic field
	@OriginalMember(owner = "client!nda", name = "J", descriptor = "Ljava/lang/Class;")
	private static Class aClass21;

	@OriginalMember(owner = "client!nda", name = "F", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_41 = new Class155(17);

	@OriginalMember(owner = "client!nda", name = "G", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_42 = new Class155(33);

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "(B)V")
	public static void method7859() {
		if (Static446.aClass390_6.aBoolean779) {
			Static369.anInt4265 = 96;
			return;
		}
		try {
			@Pc(34) Method local34 = (aClass21 == null ? (aClass21 = Class.forName("java.lang.Runtime")) : aClass21).getMethod("maxMemory");
			if (local34 != null) {
				try {
					@Pc(38) Runtime local38 = Runtime.getRuntime();
					@Pc(44) Long local44 = (Long) local34.invoke(local38, (Object[]) null);
					Static369.anInt4265 = (int) (local44 / 1048576L) + 1;
				} catch (@Pc(54) Throwable local54) {
				}
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIZI)V")
	public static void method7860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg3 < 512 || arg1 < 512 || Static720.anInt10859 * 512 - 1024 < arg3 || Static501.anInt7568 * 512 - 1024 < arg1) {
			Static215.anIntArray284[0] = Static215.anIntArray284[1] = -1;
			return;
		}
		@Pc(58) int local58 = Static102.method2025(arg0, -29754, arg1, arg3) - arg2;
		if (Static137.aBoolean210) {
			Static713.method9331(true);
		} else {
			Static460.aClass73_10.method7134(arg4, 0, 0);
			Static163.aClass19_17.method8000(Static460.aClass73_10);
		}
		if (Static504.aBoolean579) {
			Static163.aClass19_17.HA(arg3, local58, arg1, Static582.anInt8627, Static215.anIntArray284);
		} else {
			Static163.aClass19_17.da(arg3, local58, arg1, Static215.anIntArray284);
		}
		if (Static137.aBoolean210) {
			Static480.method6469();
		} else {
			Static460.aClass73_10.method7134(-arg4, 0, 0);
			Static163.aClass19_17.method8000(Static460.aClass73_10);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIII)V")
	public static void method7862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static591.method7757(arg2, arg3, arg4, arg1);
			}
		} else if (local15 == 0) {
			Static289.method4184(arg0, arg4, arg3, arg2);
		} else {
			@Pc(53) int local53 = (local15 << 12) / local10;
			@Pc(62) int local62 = arg4 - (arg2 * local53 >> 12);
			@Pc(81) int local81;
			@Pc(79) int local79;
			if (arg0 < Static180.anInt2995) {
				local79 = (local53 * Static180.anInt2995 >> 12) + local62;
				local81 = Static180.anInt2995;
			} else if (arg0 > Static111.anInt2219) {
				local79 = local62 + (Static111.anInt2219 * local53 >> 12);
				local81 = Static111.anInt2219;
			} else {
				local79 = arg1;
				local81 = arg0;
			}
			@Pc(113) int local113;
			@Pc(115) int local115;
			if (arg2 < Static180.anInt2995) {
				local113 = Static180.anInt2995;
				local115 = local62 + (Static180.anInt2995 * local53 >> 12);
			} else if (Static111.anInt2219 >= arg2) {
				local113 = arg2;
				local115 = arg4;
			} else {
				local115 = local62 + (local53 * Static111.anInt2219 >> 12);
				local113 = Static111.anInt2219;
			}
			if (Static724.anInt10930 > local79) {
				local79 = Static724.anInt10930;
				local81 = (Static724.anInt10930 - local62 << 12) / local53;
			} else if (Static273.anInt4395 < local79) {
				local81 = (Static273.anInt4395 - local62 << 12) / local53;
				local79 = Static273.anInt4395;
			}
			if (local115 < Static724.anInt10930) {
				local113 = (Static724.anInt10930 - local62 << 12) / local53;
				local115 = Static724.anInt10930;
			} else if (Static273.anInt4395 < local115) {
				local113 = (Static273.anInt4395 - local62 << 12) / local53;
				local115 = Static273.anInt4395;
			}
			Static409.method5658(local113, local81, arg3, local79, local115);
		}
	}
}
