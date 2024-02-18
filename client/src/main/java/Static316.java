import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame8;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	public static boolean aBoolean644;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[100];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static180.anInt2995 && arg0 <= Static111.anInt2219 && Static180.anInt2995 <= arg8 && Static111.anInt2219 >= arg8 && arg4 >= Static180.anInt2995 && arg4 <= Static111.anInt2219 && Static180.anInt2995 <= arg7 && arg7 <= Static111.anInt2219 && arg6 >= Static724.anInt10930 && arg6 <= Static273.anInt4395 && arg1 >= Static724.anInt10930 && Static273.anInt4395 >= arg1 && arg2 >= Static724.anInt10930 && arg2 <= Static273.anInt4395 && arg5 >= Static724.anInt10930 && arg5 <= Static273.anInt4395) {
			Static181.method2780(arg6, arg1, arg3, arg4, arg0, arg2, arg5, arg8, arg7);
		} else {
			Static188.method2856(arg6, arg3, arg5, arg2, arg4, arg1, arg8, arg0, arg7);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[Ljava/lang/String;[III)V")
	public static void method7500(@OriginalArg(1) String[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(16) int local16 = (arg3 + arg2) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) String local22 = arg0[local16];
		arg0[local16] = arg0[arg2];
		arg0[arg2] = local22;
		@Pc(36) int local36 = arg1[local16];
		arg1[local16] = arg1[arg2];
		arg1[arg2] = local36;
		for (@Pc(48) int local48 = arg3; local48 < arg2; local48++) {
			if (local22 == null || arg0[local48] != null && (local48 & 0x1) > arg0[local48].compareTo(local22)) {
				@Pc(72) String local72 = arg0[local48];
				arg0[local48] = arg0[local18];
				arg0[local18] = local72;
				@Pc(86) int local86 = arg1[local48];
				arg1[local48] = arg1[local18];
				arg1[local18++] = local86;
			}
		}
		arg0[arg2] = arg0[local18];
		arg0[local18] = local22;
		arg1[arg2] = arg1[local18];
		arg1[local18] = local36;
		method7500(arg0, arg1, local18 - 1, arg3);
		method7500(arg0, arg1, arg2, local18 + 1);
	}
}
