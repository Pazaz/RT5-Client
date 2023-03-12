import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!jd;")
	public static Sprite aClass13_6;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!rn;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!s;")
	public static final Class210 aClass210_5 = new Class210(3, -1);

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!mc;")
	public static final ClientProt aClass145_84 = new ClientProt(3, 7);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ml;I)[Lclient!oi;")
	public static Class169[] method2265(@OriginalArg(0) Signlink arg0) {
		if (!arg0.method3765()) {
			return new Class169[0];
		}
		@Pc(21) PrivilegedRequest local21 = arg0.getDisplayModes();
		while (local21.status == 0) {
			ThreadUtils.sleep(10L);
		}
		if (local21.status == 2) {
			return new Class169[0];
		}
		@Pc(45) int[] local45 = (int[]) local21.result;
		@Pc(51) Class169[] local51 = new Class169[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class169 local59 = new Class169();
			local51[local53] = local59;
			local59.anInt4685 = local45[local53 << 2];
			local59.anInt4684 = local45[(local53 << 2) + 1];
			local59.anInt4687 = local45[(local53 << 2) + 2];
			local59.anInt4682 = local45[(local53 << 2) + 3];
		}
		return local51;
	}
}
