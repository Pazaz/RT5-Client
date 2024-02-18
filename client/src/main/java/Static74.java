import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "Lclient!wp;")
	public static Class407 aClass407_1;

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "Lclient!ha;")
	public static Class19 aClass19_4;

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "Lclient!pu;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Lclient!gm;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIILclient!sb;)Lclient!ve;")
	public static Class381 method1535(@OriginalArg(2) int arg0, @OriginalArg(3) Class330 arg1) {
		@Pc(17) byte[] local17 = arg1.method7595(0, arg0);
		return local17 == null ? null : new Class381(local17);
	}
}
