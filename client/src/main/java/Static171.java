import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!qj;")
	public static Class162 aClass162_138;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
	public static final int[] anIntArray287 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3502(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method3505(@OriginalArg(1) Class199 arg0) {
		Static216.anInt4909 = 3;
		Static211.method2798(true);
		Static355.anInt4211 = 0;
		Static166.aBoolean285 = true;
		Static146.aBoolean257 = true;
		Static271.anInt5700 = 1;
		Static84.anInt2246 = 127;
		Static200.aBoolean321 = true;
		Static183.anInt4317 = 127;
		Static102.anInt2545 = 2;
		Static218.aBoolean342 = true;
		Static17.anInt652 = 0;
		Static307.aBoolean465 = true;
		Static90.aBoolean156 = true;
		Static288.aBoolean423 = true;
		Static289.aBoolean360 = true;
		Static265.aBoolean396 = true;
		Static144.anInt3575 = 0;
		Static190.aBoolean378 = true;
		Static340.anInt7187 = 255;
		Static74.anInt2054 = 0;
		if (Static207.anInt4798 >= 96) {
			Static346.method6111(2);
		} else {
			Static346.method6111(0);
		}
		Static146.anInt3619 = 2;
		Static52.aBoolean106 = true;
		Static123.aBoolean203 = false;
		Static226.anInt5071 = 0;
		Static122.aBoolean202 = true;
		Static308.anInt6435 = 0;
		Static4.anInt207 = 2;
		Static280.aBoolean419 = false;
		Static69.aBoolean133 = false;
		@Pc(81) Class10 local81 = null;
		try {
			@Pc(85) Class145 local85 = arg0.method5485();
			while (local85.anInt5065 == 0) {
				Static295.method5212(1L);
			}
			if (local85.anInt5065 == 1) {
				local81 = (Class10) local85.anObject6;
				@Pc(112) byte[] local112 = new byte[(int) local81.method355()];
				@Pc(127) int local127;
				for (@Pc(114) int local114 = 0; local114 < local112.length; local114 += local127) {
					local127 = local81.method354(local112.length - local114, local112, local114);
					if (local127 == -1) {
						throw new IOException("EOF");
					}
				}
				Static109.method2260(new Class1_Sub16(local112));
			}
		} catch (@Pc(156) Exception local156) {
		}
		try {
			if (local81 != null) {
				local81.method356();
			}
		} catch (@Pc(163) Exception local163) {
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
	public static void method3507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static239.anInt5299 <= arg0 && Static179.anInt4229 >= arg0) {
			@Pc(27) int local27 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg3);
			@Pc(35) int local35 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg1);
			Static49.method1352(local35, arg0, local27, arg2);
		}
	}
}
