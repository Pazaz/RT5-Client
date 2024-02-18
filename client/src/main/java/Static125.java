import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Lclient!vl;")
	public static Class388 aClass388_1;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_52 = new Class225(60, 7);

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_53 = new Class225(75, 3);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIB)Lclient!eq;")
	public static Class110 method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class110 local7 = new Class110();
		local7.anInt2647 = -1;
		local7.anInt2645 = -1;
		local7.anInt2643 = arg0 + 6;
		local7.anInt2653 = arg1 + 5 + 1;
		local7.anIntArrayArray65 = new int[local7.anInt2643][local7.anInt2653];
		local7.method2467();
		return local7;
	}
}
