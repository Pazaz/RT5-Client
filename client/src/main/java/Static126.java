import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_12 = new Class155(52);

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_23 = new Class345(91, 8);

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)V")
	public static void method2226(@OriginalArg(1) int arg0) {
		if (Static96.anInt10171 == 0) {
			Static581.aClass2_Sub6_Sub1_3.method916(arg0);
		} else {
			Static24.anInt595 = arg0;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ha;IIIIIBI)V")
	public static void method2227(@OriginalArg(0) Class19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		Static74.aClass19_4 = arg0;
		Static420.aClass73_7 = Static74.aClass19_4.method7953();
		Static203.aClass73_4 = Static74.aClass19_4.method7953();
		Static712.aClass73_11 = Static74.aClass19_4.method7953();
		Static437.anInt6628 = arg2;
		Static116.anInt2268 = 2;
		Static448.anInt6796 = 1;
		Static482.anInt7265 = 0;
		Static632.anInt9503 = 0;
		Static464.anInt7013 = 2;
		Static714.anInt10802 = arg3;
		Static450.anInterface9_1 = null;
		Static388.method5454(arg4, arg1);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public static void method2228() {
		Static179.anInt2984 = 0;
		Static480.anInt7206 = 0;
		Static577.anInt8587 = 0;
		Static606.anInt8954 = 0;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public static void method2229() {
		@Pc(1) Class82 local1 = Static354.aClass82_120;
		synchronized (Static354.aClass82_120) {
			Static354.aClass82_120.method2151();
		}
	}
}
