import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	public static int anInt2184;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "[B")
	public static final byte[] aByteArray12 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "Lclient!we;")
	public static final Class215 aClass215_34 = new Class215(30);

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "S")
	public static short aShort28 = 256;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString83 = "Loading title screen - ";

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method1829(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static69.anInt1955 : Static156.anInt3873) + local19;
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(35) Class1_Sub1_Sub12 local35 = Static17.method457(local29);
			if (local35.aBoolean205 && local35.method2693().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static194.anInt4478 = -1;
					Static220.aShortArray89 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(67) short[] local67 = new short[local11.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local13; local69++) {
						local67[local69] = local11[local69];
					}
					local11 = local67;
				}
				local11[local13++] = (short) local29;
			}
		}
		Static194.anInt4478 = local13;
		Static139.anInt3448 = 0;
		Static220.aShortArray89 = local11;
		@Pc(106) String[] local106 = new String[Static194.anInt4478];
		for (@Pc(108) int local108 = 0; local108 < Static194.anInt4478; local108++) {
			local106[local108] = Static17.method457(local11[local108]).method2693();
		}
		Static153.method3290(Static220.aShortArray89, local106);
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)Lclient!gg;")
	public static Class72 method1830(@OriginalArg(1) int arg0) {
		@Pc(10) Class72 local10 = (Class72) Static150.aClass215_55.method6057((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static156.aClass162_132.method4636(arg0, 29);
		local10 = new Class72();
		if (local25 != null) {
			local10.method2027(new Class1_Sub16(local25), arg0);
		}
		Static150.aClass215_55.method6050(local10, (long) arg0);
		return local10;
	}
}
