import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_15 = new Class155(42);

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_80 = new Class225(84, 6);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZB)V")
	public static void method3089(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class2_Sub22 local10 = Static556.method7303(arg0, arg1);
		if (local10 != null) {
			for (@Pc(16) int local16 = 0; local16 < local10.anIntArray278.length; local16++) {
				local10.anIntArray278[local16] = -1;
				local10.anIntArray279[local16] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIIIIII)V")
	public static void method3091(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(17) Class8_Sub3 local17 = (Class8_Sub3) Static422.aClass130_9.method2790(); local17 != null; local17 = (Class8_Sub3) Static422.aClass130_9.method2785()) {
			if (local17.anInt953 <= Static333.anInt5455) {
				local17.method9274();
			} else {
				Static143.method3573(local17.anInt956 * 2, (local17.anInt959 << 9) + 256, arg0 >> 1, (local17.anInt954 << 9) + 256, local17.anInt958, arg1 >> 1);
				Static180.aClass14_3.method8828(0, Static215.anIntArray284[0] + arg3, local17.aString3, Static215.anIntArray284[1] + arg2, local17.anInt957 | 0xFF000000);
			}
		}
	}
}
