import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Lclient!ml;")
	public static Class246 aClass246_4;

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "[Lclient!eq;")
	public static final Class110[] aClass110Array1 = new Class110[4];

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
	public static int anInt8587 = 0;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)V")
	public static void method7615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static96.anInt10171 != 0) {
			if (arg1 >= 0) {
				Static286.anIntArray358[arg1] = arg0;
			} else {
				for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
					Static286.anIntArray358[local23] = arg0;
				}
			}
		}
		Static581.aClass2_Sub6_Sub1_3.method926(arg0, arg1);
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(III)Z")
	public static boolean method7616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static119.method2175(arg1, arg0) || Static42.method1054(arg1, arg0);
	}
}
