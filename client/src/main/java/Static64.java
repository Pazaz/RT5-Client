import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!nk;")
	public static Class161 aClass161_2;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
	public static int anInt1555 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
	public static boolean method1704() {
		return Static235.anInt3365 == 0 ? Static91.aClass2_Sub12_Sub3_1.method4270() : true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!r;Lclient!r;)I")
	public static int method1707(@OriginalArg(1) Class197 arg0, @OriginalArg(2) Class197 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method5087(Static183.anInt80)) {
			local5++;
		}
		if (arg1.method5087(Static371.anInt7014)) {
			local5++;
		}
		if (arg1.method5087(Static80.anInt6679)) {
			local5++;
		}
		if (arg0.method5087(Static183.anInt80)) {
			local5++;
		}
		if (arg0.method5087(Static371.anInt7014)) {
			local5++;
		}
		if (arg0.method5087(Static80.anInt6679)) {
			local5++;
		}
		return local5;
	}
}
