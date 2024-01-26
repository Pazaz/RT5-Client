import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
	public static int anInt6751;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_145 = new Class82(4);

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "Lclient!jg;")
	public static final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_169 = new Class225(42, -1);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!sb;Lclient!sb;Lclient!sb;BLclient!sb;)V")
	public static void method5987(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(4) Class330 arg3) {
		Static262.aClass330_56 = arg2;
		Static666.aClass330_118 = arg0;
		Static607.aClass330_113 = arg3;
		Static453.aClass158ArrayArray2 = new Class158[Static666.aClass330_118.method7597()][];
		Static132.aBooleanArray5 = new boolean[Static666.aClass330_118.method7597()];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method5988() {
		@Pc(13) Class2_Sub2_Sub2 local13 = Static440.method5963(15, 0L);
		local13.method205();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!vaa;")
	public static Class379 method5994(@OriginalArg(1) int arg0) {
		@Pc(10) Class379 local10 = (Class379) Static289.aClass82_100.method2156((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static409.aClass330_85.method7595(arg0, 0);
		local10 = new Class379();
		if (local21 != null) {
			local10.method8656(new Class2_Sub21(local21));
		}
		local10.method8654();
		Static289.aClass82_100.method2150(local10, (long) arg0);
		return local10;
	}
}
