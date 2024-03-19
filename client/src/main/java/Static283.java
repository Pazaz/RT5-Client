import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lclient!me;")
	public static Class7_Sub1[] aClass7_Sub1Array3;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	public static int anInt5980 = 0;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString221 = "Attack";

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)I")
	public static int method5049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg0 >= arg2) {
			return arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIII)V")
	public static void method5056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static350.anIntArrayArray58 != null) {
			Static350.anIntArrayArray58[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(IIII)I")
	public static int method5058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return ((arg2 >> 2 & 0x3F) << 10) + ((arg0 >> 5 << 7) + (arg1 >> 1));
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method5059(@OriginalArg(0) Class162 arg0) {
		Static248.anInt5405 = 0;
		Static176.anInt4151 = 0;
		Static55.aClass58_4 = new Class58();
		Static297.aClass2_Sub2_Sub1_Sub1Array2 = new Class2_Sub2_Sub1_Sub1[1024];
		Static181.method3695(arg0);
		Static172.method5651(arg0);
	}
}
