import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Z")
	public static boolean aBoolean514;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "[I")
	public static int[] anIntArray583;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public static int anInt7217 = 0;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!sf;")
	public static Class183 aClass183_33 = new Class183(8);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!il;)V")
	public static void method6045(@OriginalArg(1) Class1_Sub16 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static141.anInt3505; local3++) {
			@Pc(14) int local14 = arg0.method5744();
			@Pc(18) int local18 = arg0.method5749();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static302.aClass27_Sub1Array1[local14] != null) {
				Static302.aClass27_Sub1Array1[local14].anInt927 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
	public static void method6047() {
		Static234.aClass215_72.method6063(5);
	}
}
