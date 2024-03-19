import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "H", descriptor = "I")
	public static int anInt536;

	@OriginalMember(owner = "client!al", name = "I", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString17 = "Loading...";

	@OriginalMember(owner = "client!al", name = "x", descriptor = "I")
	public static int anInt529 = 10;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "Lclient!mi;")
	public static Class130 aClass130_1 = new Class130();

	@OriginalMember(owner = "client!al", name = "E", descriptor = "Lclient!vg;")
	public static final Class1_Sub16_Sub2 aClass1_Sub16_Sub2_1 = new Class1_Sub16_Sub2(5000);

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method346(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static313.aMethod1;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static332.aClass35_1);
		arg0.addFocusListener(Static332.aClass35_1);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public static void method347() {
		if (Static199.aClass202_1 != null) {
			@Pc(11) Class202 local11 = Static199.aClass202_1;
			synchronized (Static199.aClass202_1) {
				Static199.aClass202_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I[IIII)V")
	public static void method349(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(11) int local11 = arg0 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (local15 > arg3) {
			@Pc(19) int local19 = arg3 + 1;
			arg1[local19] = arg2;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg2;
			arg3 = local49 + 1;
			arg1[arg3] = arg2;
		}
		while (arg3 < local11) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}
}
