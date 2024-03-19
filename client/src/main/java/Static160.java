import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Lclient!qj;")
	public static Class162 aClass162_241;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!we;")
	public static Class215 aClass215_100 = new Class215(64);

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public static int anInt7325 = 0;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Lclient!ep;")
	public static final Class58 aClass58_11 = new Class58();

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString272 = "glow2:";

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Z")
	public static boolean aBoolean518 = false;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString273 = "Started 3d Library";

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method6127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public static void method6130() {
		Static9.aClass215_7.method6052();
		Static3.aClass215_1.method6052();
		Static74.aClass215_31.method6052();
		Static134.aClass215_52.method6052();
		Static326.aClass215_93.method6052();
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	public static void method6132() {
		Static150.aClass106_1.method6129();
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			Static264.aLongArray7[local17] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static229.aLongArray6[local29] = 0L;
		}
		Static234.anInt5229 = 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I")
	public static int method6133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	public static void method6134() {
		for (@Pc(12) int local12 = -1; local12 < Static329.anInt6733; local12++) {
			@Pc(19) int local19;
			if (local12 == -1) {
				local19 = 2047;
			} else {
				local19 = Static238.anIntArray389[local12];
			}
			@Pc(29) Class7_Sub1_Sub1_Sub2 local29 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local19];
			if (local29 != null) {
				Static116.method2544(local29.method5973(), local29);
			}
		}
	}
}
