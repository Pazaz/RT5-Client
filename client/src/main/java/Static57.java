import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public static int anInt1464;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[Lclient!nk;")
	public static Class161[] aClass161Array1;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
	public static final int[] anIntArray104 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!kb;III[Z)Z")
	public static boolean method1619(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Scene.aClass6Array4 != Scene.aClass6Array2) {
			@Pc(11) int local11 = Scene.aClass6Array3[arg1].method5728(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class6 local18 = Scene.aClass6Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5728(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5731(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5725(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1620() {
		if (Static215.anInt3795 == 2) {
			GameShell.maxMemory = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = Runtime.class.getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					GameShell.maxMemory = (int) (local39 / 1048576L) + 1;
					return;
				} catch (@Pc(49) Throwable local49) {
					return;
				}
			}
		} catch (@Pc(51) Exception local51) {
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)V")
	public static void method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static28.anInt675 && Static82.anInt1837 >= arg1 && arg2 >= Static365.anInt6832 && arg0 <= Static161.anInt2954) {
			Static391.method6456(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static172.method3284(arg3, arg1, arg0, arg2, arg4);
		}
	}
}
