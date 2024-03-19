import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "Lclient!rs;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "I")
	public static int anInt1523 = -1;

	@OriginalMember(owner = "client!df", name = "bb", descriptor = "[I")
	public static final int[] anIntArray96 = new int[3];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!tr;")
	public static RuntimeException_Sub1 method1320(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString242 = local9.aString242 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "(B)[Lclient!dk;")
	public static Class47[] method1321() {
		if (Static203.aClass47Array2 == null) {
			@Pc(7) Class47[] local7 = Static266.method4819(Static184.aClass199_12);
			@Pc(11) Class47[] local11 = new Class47[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(59) int local59;
			@Pc(65) Class47 local65;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class47 local21 = local7[local15];
				if ((local21.anInt1570 <= 0 || local21.anInt1570 >= 24) && local21.anInt1566 >= 800 && local21.anInt1569 >= 600 && (Static207.anInt4798 >= 96 || Static130.anInt6754 != 0 || local21.anInt1566 <= 1024 && local21.anInt1569 <= 768)) {
					for (local59 = 0; local59 < local13; local59++) {
						local65 = local11[local59];
						if (local65.anInt1566 == local21.anInt1566 && local21.anInt1569 == local65.anInt1569) {
							if (local21.anInt1570 > local65.anInt1570) {
								local11[local59] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static203.aClass47Array2 = new Class47[local13];
			Static360.method2015(local11, 0, Static203.aClass47Array2, 0, local13);
			@Pc(125) int[] local125 = new int[Static203.aClass47Array2.length];
			for (local59 = 0; local59 < Static203.aClass47Array2.length; local59++) {
				local65 = Static203.aClass47Array2[local59];
				local125[local59] = local65.anInt1566 * local65.anInt1569;
			}
			Static115.method2523(local125, Static203.aClass47Array2);
		}
		return Static203.aClass47Array2;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	public static void method1322() {
		@Pc(10) Class215 local10 = Static223.aClass215_70;
		synchronized (Static223.aClass215_70) {
			Static223.aClass215_70.method6052();
		}
		local10 = Static67.aClass215_6;
		synchronized (Static67.aClass215_6) {
			Static67.aClass215_6.method6052();
		}
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public static void method1323() {
		Static304.aByteArrayArrayArray16 = null;
		Static190.aByteArrayArrayArray15 = null;
		Static105.aByteArrayArrayArray8 = null;
		Static220.anIntArrayArrayArray9 = null;
		Static159.anIntArray351 = null;
		Static135.anIntArray583 = null;
		Static139.aByteArrayArrayArray9 = null;
		Static102.anIntArray167 = null;
		Static127.anIntArray237 = null;
		Static12.anIntArray32 = null;
		Static18.aByteArrayArrayArray1 = null;
		Static194.anIntArray316 = null;
	}
}
