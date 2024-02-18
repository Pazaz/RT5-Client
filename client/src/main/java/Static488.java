import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "Lclient!ek;")
	public static final Class103 aClass103_12 = new Class103();

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_33 = new Class155(51);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!fba;I)I")
	public static int method6521(@OriginalArg(0) Class121 arg0) {
		if (arg0 == Static185.aClass121_3) {
			return 7681;
		} else if (arg0 == Static209.aClass121_4) {
			return 8448;
		} else if (arg0 == Static725.aClass121_6) {
			return 34165;
		} else if (arg0 == Static438.aClass121_5) {
			return 260;
		} else if (Static329.aClass121_2 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V")
	public static void method6522() {
		Static329.method1636();
		Static400.aBoolean622 = false;
		Static585.method7670(Static682.anInt10295, Static71.anInt1576, Static407.anInt6288, Static84.anInt1775);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method6524(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Lclient!fj;")
	public static Class2_Sub2_Sub10 method6525(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub10 local10 = (Class2_Sub2_Sub10) Static480.aClass361_2.method8342((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static31.aClass330_6.method7595(0, arg0);
		if (local21 == null || local21.length <= 1) {
			return null;
		}
		try {
			local10 = Static48.method1097(local21);
		} catch (@Pc(38) Exception local38) {
			throw new RuntimeException(local38.getMessage() + " S: " + arg0);
		}
		Static480.aClass361_2.method8341(local10, (long) arg0);
		return local10;
	}
}
