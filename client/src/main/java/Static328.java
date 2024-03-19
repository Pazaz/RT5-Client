import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt6714;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public static int anInt6717;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!ls;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "J")
	public static long aLong211 = 0L;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
	public static final int[] anIntArray553 = new int[13];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIIIZ)Z")
	public static boolean method5704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(24) int local24 = Static228.method4349(arg6, arg2, arg5, arg7, Static132.anIntArray245, arg9, Static208.anIntArray361, arg4, Static264.aClass7_Sub1_Sub1_Sub2_2.method5973(), arg3, arg0, arg1, arg8, Static66.aClass22Array1[Static39.anInt1215]);
		if (local24 < 1) {
			return false;
		}
		Static47.anInt1523 = Static132.anIntArray245[local24 - 1];
		Static268.anInt5668 = Static208.anIntArray361[local24 - 1];
		Static127.aBoolean231 = false;
		Static239.method4514();
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method5705(@OriginalArg(1) Class162 arg0) {
		Static292.anInt6119 = arg0.method4631("p11_full");
		Static203.anInt926 = arg0.method4631("p12_full");
		Static202.anInt4679 = arg0.method4631("b12_full");
		Static148.anInt3664 = arg0.method4631("hitmarks");
		Static319.anInt6576 = arg0.method4631("hitbar_default");
		Static137.anInt3409 = arg0.method4631("timerbar_default");
		Static83.anInt2189 = arg0.method4631("headicons_pk");
		Static147.anInt3641 = arg0.method4631("headicons_prayer");
		Static57.anInt5676 = arg0.method4631("hint_headicons");
		Static286.anInt6047 = arg0.method4631("hint_mapmarkers");
		Static150.anInt3680 = arg0.method4631("mapflag");
		Static112.anInt2873 = arg0.method4631("cross");
		Static326.anInt6667 = arg0.method4631("mapdots");
		Static66.anInt1845 = arg0.method4631("scrollbar");
		Static168.anInt4067 = arg0.method4631("name_icons");
		Static182.anInt4302 = arg0.method4631("floorshadows");
		Static104.anInt2582 = arg0.method4631("compass");
		Static211.anInt3180 = arg0.method4631("hint_mapedge");
	}
}
