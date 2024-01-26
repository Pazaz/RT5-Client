import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static544 {

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	public static boolean aBoolean624 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!hma;ZI)V")
	public static void method7214(@OriginalArg(0) Class2_Sub25 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt4002 < 0 || Static235.method3424(arg0.anInt4002, arg0.anInt4009)) {
				if (arg1) {
					Static706.method9220(arg0.anInt4011, (Class150) null, arg0.anInt4006, arg0.anInt4010, arg0.anInt4016);
				} else {
					Static235.method3421(arg0.anInt4006, arg0.anInt4009, arg0.anInt4015, arg0.anInt4016, -1, arg0.anInt4011, arg0.anInt4010, arg0.anInt4002);
				}
				arg0.method9457();
			}
		} else if (arg0.aBoolean310 && arg0.anInt4016 >= 1 && arg0.anInt4006 >= 1 && Static720.anInt10859 - 2 >= arg0.anInt4016 && Static501.anInt7568 - 2 >= arg0.anInt4006 && (arg0.anInt4014 < 0 || Static235.method3424(arg0.anInt4014, arg0.anInt4013))) {
			if (arg1) {
				Static706.method9220(arg0.anInt4011, arg0.aClass150_1, arg0.anInt4006, arg0.anInt4010, arg0.anInt4016);
			} else {
				Static235.method3421(arg0.anInt4006, arg0.anInt4013, arg0.anInt4012, arg0.anInt4016, -1, arg0.anInt4011, arg0.anInt4010, arg0.anInt4014);
			}
			arg0.aBoolean310 = false;
			if (!arg1 && arg0.anInt4002 == arg0.anInt4014 && arg0.anInt4002 == -1) {
				arg0.method9457();
			} else if (!arg1 && arg0.anInt4002 == arg0.anInt4014 && arg0.anInt4012 == arg0.anInt4015 && arg0.anInt4013 == arg0.anInt4009) {
				arg0.method9457();
			}
		}
	}
}
