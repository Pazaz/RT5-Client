import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
	public static int anInt5036;

	@OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
	public static int anInt5038;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Lclient!qj;")
	public static Class162 aClass162_181;

	@OriginalMember(owner = "client!oo", name = "O", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array8;

	@OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
	public static int anInt5046;

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
	public static int anInt5043 = 0;

	@OriginalMember(owner = "client!oo", name = "T", descriptor = "I")
	public static int anInt5047 = -50;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)Lclient!fq;")
	public static Class1_Sub1_Sub8 method4319(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub8 local10 = (Class1_Sub1_Sub8) Static139.aClass143_5.method4323((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = Static120.aClass162_103.method4636(arg0 & 0x7FFF, 0);
		} else {
			local30 = Static266.aClass162_202.method4636(arg0, 0);
		}
		local10 = new Class1_Sub1_Sub8();
		if (local30 != null) {
			local10.method1965(new Class1_Sub16(local30));
		}
		if (arg0 >= 32768) {
			local10.method1970();
		}
		Static139.aClass143_5.method4322(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)I")
	public static int method4320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class39.anIntArray87[arg2 * 8192 / arg1] >> 1;
		return (local20 * arg3 >> 16) + ((65536 - local20) * arg0 >> 16);
	}
}
