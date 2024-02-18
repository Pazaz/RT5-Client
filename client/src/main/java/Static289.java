import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_100 = new Class82(64);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_19 = new Class155(1);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIII)V")
	public static void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static724.anInt10930 <= arg1 && arg1 <= Static273.anInt4395) {
			@Pc(26) int local26 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg3);
			@Pc(32) int local32 = Static670.method8732(Static180.anInt2995, Static111.anInt2219, arg0);
			Static297.method4371(arg1, local32, arg2, local26);
		}
	}
}
