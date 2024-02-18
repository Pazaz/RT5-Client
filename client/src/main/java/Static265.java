import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!iea", name = "o", descriptor = "[Lclient!th;")
	public static Class353[] aClass353Array1;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "[I")
	public static final int[] anIntArray328 = new int[32];

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "[B")
	public static byte[] aByteArray44 = null;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIZIIIFI)[I")
	public static int[] method3857(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub1_Sub27 local10 = new Class2_Sub1_Sub27();
		local10.anInt8799 = (int) (arg0 * 4096.0F);
		local10.aBoolean667 = true;
		local10.anInt8809 = 35;
		local10.anInt8805 = 8;
		local10.anInt8810 = 8;
		local10.anInt8803 = 4;
		local10.method9421(7);
		Static132.method2313(1, 2048);
		local10.method7809(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIII)V")
	public static void method3858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(17) int local17 = -arg2;
		Static696.method9037(arg2 + arg0, arg1, arg0 - arg2, Static723.anIntArrayArray266[arg3]);
		@Pc(31) int local31 = -1;
		while (local7 < local14) {
			local31 += 2;
			local17 += local31;
			local7++;
			if (local17 >= 0) {
				local14--;
				local17 -= local14 << 1;
				@Pc(57) int[] local57 = Static723.anIntArrayArray266[local14 + arg3];
				@Pc(64) int[] local64 = Static723.anIntArrayArray266[arg3 - local14];
				@Pc(68) int local68 = local7 + arg0;
				@Pc(73) int local73 = arg0 - local7;
				Static696.method9037(local68, arg1, local73, local57);
				Static696.method9037(local68, arg1, local73, local64);
			}
			@Pc(91) int local91 = local14 + arg0;
			@Pc(96) int local96 = arg0 - local14;
			@Pc(102) int[] local102 = Static723.anIntArrayArray266[local7 + arg3];
			@Pc(109) int[] local109 = Static723.anIntArrayArray266[arg3 - local7];
			Static696.method9037(local91, arg1, local96, local102);
			Static696.method9037(local91, arg1, local96, local109);
		}
	}
}
