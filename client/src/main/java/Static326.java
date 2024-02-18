import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!kf;")
	public static final Class206 aClass206_1 = new Class206();

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!kf;")
	public static final Class206 aClass206_2 = new Class206();

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!kf;")
	public static final Class206 aClass206_3 = new Class206();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!kf;")
	public static final Class206 aClass206_4 = new Class206();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ca;)I")
	public static int method4870(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt1445;
		@Pc(10) Class289 local10 = arg0.method9317();
		@Pc(15) int local15 = arg0.aClass152_10.method9114();
		if (local15 == -1 || arg0.aBoolean817) {
			local6 = arg0.anInt1455;
		} else if (local10.anInt7226 == local15 || local15 == local10.anInt7241 || local10.anInt7260 == local15 || local10.anInt7240 == local15) {
			local6 = arg0.anInt1469;
		} else if (local10.anInt7235 == local15 || local10.anInt7262 == local15 || local10.anInt7268 == local15 || local10.anInt7239 == local15) {
			local6 = arg0.anInt1459;
		}
		return local6;
	}
}
