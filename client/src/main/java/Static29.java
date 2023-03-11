import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
	public static int anInt721 = -1;

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "J")
	public static long aLong22 = 0L;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V")
	public static void method937() {
		if (Static150.anIntArray173 != null && Static181.anIntArray203 != null) {
			return;
		}
		Static150.anIntArray173 = new int[256];
		Static181.anIntArray203 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static150.anIntArray173[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static181.anIntArray203[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!el;)V")
	public static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3) {
		@Pc(4) Class67 local4 = Static266.method4500(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub2_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIII)V")
	public static void method939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static218.aClass177_Sub1_2.anInt4888 == 0 || arg0 == 0 || Static243.anInt4503 >= 50 || arg3 == -1) {
			return;
		}
		Static256.anIntArray321[Static243.anInt4503] = arg3;
		Static329.anIntArray419[Static243.anInt4503] = arg0;
		Static237.anIntArray283[Static243.anInt4503] = arg2;
		Static196.aClass247Array2[Static243.anInt4503] = null;
		Static162.anIntArray188[Static243.anInt4503] = 0;
		Static223.anIntArray256[Static243.anInt4503] = arg1;
		Static243.anInt4503++;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
	public static int method941(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local14 & 0x33333333) + ((local14 & 0xCCCCCCCD) >>> 2);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
