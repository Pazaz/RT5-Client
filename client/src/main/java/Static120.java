import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Lclient!qj;")
	public static Class162 aClass162_103;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Z")
	public static boolean aBoolean201;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "Lclient!qj;")
	public static Class162 aClass162_104;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!ro;")
	public static Class177 aClass177_7 = null;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	public static int anInt3021 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Lclient!hl;")
	public static Class7_Sub4 method2586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class154 local7 = Static241.aClass154ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class7_Sub4 local14 = local7.aClass7_Sub4_1;
			local7.aClass7_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/awt/Component;Lclient!ud;IBI)Lclient!wi;")
	public static Class37 method2587(@OriginalArg(0) Component arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static80.anInt2184 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class37 local35 = (Class37) Class.forName("Class37_Sub2").getDeclaredConstructor().newInstance();
			local35.anInt6902 = arg2;
			local35.anIntArray558 = new int[(Class1_Sub2_Sub1_Sub1.lb ? 2 : 1) * 256];
			local35.method5861(arg0);
			local35.anInt6905 = (arg2 & 0xFFFFFC00) + 1024;
			if (local35.anInt6905 > 16384) {
				local35.anInt6905 = 16384;
			}
			local35.method5862(local35.anInt6905);
			if (Static156.anInt3874 > 0 && Static328.aClass125_1 == null) {
				Static328.aClass125_1 = new Class125();
				Static328.aClass125_1.aClass199_10 = arg1;
				arg1.method5482(Static328.aClass125_1, Static156.anInt3874);
			}
			if (Static328.aClass125_1 != null) {
				if (Static328.aClass125_1.aClass37Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static328.aClass125_1.aClass37Array1[arg3] = local35;
			}
			return local35;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class37_Sub1 local114 = new Class37_Sub1(arg1, arg3);
				local114.anInt6902 = arg2;
				local114.anIntArray558 = new int[(Class1_Sub2_Sub1_Sub1.lb ? 2 : 1) * 256];
				local114.method5861(arg0);
				local114.anInt6905 = 16384;
				local114.method5862(local114.anInt6905);
				if (Static156.anInt3874 > 0 && Static328.aClass125_1 == null) {
					Static328.aClass125_1 = new Class125();
					Static328.aClass125_1.aClass199_10 = arg1;
					arg1.method5482(Static328.aClass125_1, Static156.anInt3874);
				}
				if (Static328.aClass125_1 != null) {
					if (Static328.aClass125_1.aClass37Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static328.aClass125_1.aClass37Array1[arg3] = local114;
				}
				return local114;
			} catch (@Pc(178) Throwable local178) {
				return new Class37();
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZIILclient!fg;II)V")
	public static void method2588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class7_Sub1_Sub1 arg2, @OriginalArg(5) int arg3) {
		Static19.method472(arg1, arg2.anInt7032, arg2.anInt7027, arg0, 0, arg3);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLclient!af;)V")
	public static void method2590(@OriginalArg(1) Class1_Sub3 arg0) {
		arg0.aBoolean361 = false;
		if (arg0.aClass1_Sub13_5 != null) {
			arg0.aClass1_Sub13_5.anInt4948 = 0;
		}
		for (@Pc(18) Class1_Sub3 local18 = arg0.method4453(); local18 != null; local18 = arg0.method4451()) {
			method2590(local18);
		}
	}
}
