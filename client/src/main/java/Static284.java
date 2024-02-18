import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "Lclient!vq;")
	public static Class390 aClass390_4;

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_116 = new Class225(65, 6);

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	public static int anInt4583 = -2;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZILclient!sb;Ljava/lang/String;)Lclient!nc;")
	public static Class255 method4103(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class330 arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.method7590(arg2);
		if (local8 == -1) {
			return new Class255(0);
		}
		@Pc(24) int[] local24 = arg1.method7603(local8);
		@Pc(30) Class255 local30 = new Class255(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local30.anInt6373 > local32) {
				@Pc(47) Packet local47 = new Packet(arg1.method7595(local24[local34++], local8));
				@Pc(51) int local51 = local47.g4();
				@Pc(57) int local57 = local47.g2();
				@Pc(61) int local61 = local47.g1();
				if (!arg0 && local61 == 1) {
					local30.anInt6373--;
				} else {
					local30.anIntArray495[local32] = local51;
					local30.anIntArray496[local32] = local57;
					local32++;
				}
			}
			return local30;
		}
	}
}
