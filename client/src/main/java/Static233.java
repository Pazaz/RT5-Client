import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "Lclient!qa;")
	public static Class29 aClass29_16;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public static int anInt5203 = 0;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public static int anInt5206 = -1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg4);
		@Pc(19) int local19 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg1);
		@Pc(25) int local25 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3);
		@Pc(33) int local33 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg5);
		@Pc(44) int local44 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg4 + arg0);
		@Pc(57) int local57 = Static283.method5049(Static197.anInt4520, Static180.anInt4240, arg1 - arg0);
		for (@Pc(59) int local59 = local11; local59 < local44; local59++) {
			Static12.method349(local33, Static87.anIntArrayArray9[local59], arg6, local25);
		}
		for (@Pc(77) int local77 = local19; local77 > local57; local77--) {
			Static12.method349(local33, Static87.anIntArrayArray9[local77], arg6, local25);
		}
		@Pc(99) int local99 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg3 + arg0);
		@Pc(108) int local108 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg5 - arg0);
		for (@Pc(110) int local110 = local44; local110 <= local57; local110++) {
			@Pc(116) int[] local116 = Static87.anIntArrayArray9[local110];
			Static12.method349(local99, local116, arg6, local25);
			Static12.method349(local108, local116, arg2, local99);
			Static12.method349(local33, local116, arg6, local108);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
	public static void method4439(@OriginalArg(0) int arg0) {
		Static243.anInt5366 = 100;
		Static263.anInt5600 = arg0;
		Static259.anInt4933 = -1;
		Static74.anInt2057 = 3;
	}
}
