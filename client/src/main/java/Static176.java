import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!qj;")
	public static Class162 aClass162_142;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!qa;")
	public static Class29 aClass29_14;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Lclient!qj;")
	public static Class162 aClass162_143;

	@OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
	public static int anInt4160;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "[[B")
	public static final byte[][] aByteArrayArray37 = new byte[1000][];

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	public static int anInt4151 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!qj;BIZII)V")
	public static void method3563(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(6) int arg2) {
		Static221.anInt5014 = arg0;
		Static254.aClass162_195 = arg1;
		Static135.aBoolean514 = false;
		Static220.anInt4995 = arg2;
		anInt4160 = 0;
		Static288.anInt6077 = 2;
		Static344.anInt7239 = 1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!nr;ILclient!ro;)V")
	public static void method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(4) Class177 arg3) {
		if (arg3.anInt5838 == 2) {
			for (@Pc(62) int local62 = arg1; local62 <= arg0; local62++) {
				@Pc(71) int local71 = arg3.anIntArray439[local62] - 1;
				if (local71 != -1) {
					@Pc(113) boolean local113;
					if (Static234.anInt5231 == 1 && local62 == Static326.anInt6657 && Static285.anInt6031 == arg3.anInt5828) {
						local113 = Static318.method5596(arg2, local71, 0, null, arg3.anIntArray441[local62], arg3.anInt5840, 2) == null;
						if (local113) {
							Static17.aClass130_3.method3760(new Class1_Sub24(local71, arg3.anIntArray441[local62], 2, 0, arg3.anInt5840, false));
						}
					} else {
						local113 = Static318.method5596(arg2, local71, -13623264, null, arg3.anIntArray441[local62], arg3.anInt5840, 1) == null;
						if (local113) {
							Static17.aClass130_3.method3760(new Class1_Sub24(local71, arg3.anIntArray441[local62], 1, -13623264, arg3.anInt5840, false));
						}
					}
				}
			}
		} else if (arg3.anInt5838 == 5) {
			@Pc(36) boolean local36 = Static318.method5596(arg2, arg3.anInt5808, arg3.anInt5765 | 0xFF000000, arg3.aBoolean409 ? Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2 : null, arg3.anInt5754, arg3.anInt5840, arg3.anInt5814) == null;
			if (local36) {
				Static17.aClass130_3.method3760(new Class1_Sub24(arg3.anInt5808, arg3.anInt5754, arg3.anInt5814, arg3.anInt5765 | 0xFF000000, arg3.anInt5840, arg3.aBoolean409));
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)I")
	public static int method3566(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local10 >>> 2 & 0xB3333333) + (local10 & 0x33333333);
		@Pc(44) int local44 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(50) int local50 = local44 + (local44 >>> 8);
		@Pc(56) int local56 = local50 + (local50 >>> 16);
		return local56 & 0xFF;
	}
}
