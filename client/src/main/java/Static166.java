import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_122 = new ClientProt(40, 7);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZBI)V")
	public static void method3186(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub41 local8 = Static374.method6275(arg0, arg1);
		if (local8 != null) {
			local8.unlink();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Lclient!da;")
	public static Class11_Sub4 method3190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub4 local14 = local7.aClass11_Sub4_1;
			local7.aClass11_Sub4_1 = null;
			return local14;
		}
	}
}
