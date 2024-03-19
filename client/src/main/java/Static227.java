import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt5079 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([BZ)[B")
	public static byte[] method4343(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static360.method2013(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!mb;)I")
	public static int method4344(@OriginalArg(1) Class1_Sub22 arg0) {
		@Pc(14) String local14 = Static37.method928(arg0);
		@Pc(16) int[] local16 = null;
		if (Static137.method3041(arg0.anInt4308)) {
			local16 = Static165.method3446((int) arg0.aLong126).anIntArray78;
		} else if (Static114.method5269(arg0.anInt4308)) {
			@Pc(61) Class7_Sub1_Sub1_Sub1 local61 = Static84.aClass7_Sub1_Sub1_Sub1Array1[(int) arg0.aLong126];
			if (local61 != null) {
				local16 = local61.aClass75_1.anIntArray157;
			}
		} else if (Static91.method1996(arg0.anInt4308)) {
			if (arg0.anInt4308 == 1009) {
				local16 = Static83.method1840((int) arg0.aLong126).anIntArray471;
			} else {
				local16 = Static83.method1840((int) (arg0.aLong126 >>> 32 & 0x7FFFFFFFL)).anIntArray471;
			}
		}
		if (local16 != null) {
			local14 = local14 + Static118.method2581(local16);
		}
		return Static140.aClass63_4.method1842(Static265.aClass29Array12, local14);
	}
}
