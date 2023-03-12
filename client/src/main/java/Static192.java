import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static int anInt3545;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_5 = new Class16("", 11);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_139 = new Class145(16, -1);

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!nk;")
	public static Class161 aClass161_8 = null;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIB)I")
	public static int method3506(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub41 local10 = Static374.method6275(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray488.length; local32++) {
				if (arg2 == local10.anIntArray489[local32]) {
					local22 += local10.anIntArray488[local32];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method3508() {
		Static233.aClass98_37.method2614();
	}
}
