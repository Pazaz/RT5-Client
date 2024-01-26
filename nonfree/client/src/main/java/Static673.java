import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "B")
	public static byte aByte140;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "Lclient!ul;")
	public static final Class377 aClass377_8 = new Class377("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	public static int anInt10079 = -1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!vq;Z)[Lclient!oga;")
	public static Class273[] method8787(@OriginalArg(0) Class390 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0.method8990()) {
			return new Class273[0];
		}
		@Pc(15) Class270 local15 = arg0.method8984();
		while (local15.anInt6789 == 0) {
			Static638.method8395(10L);
		}
		if (local15.anInt6789 == 2) {
			return new Class273[0];
		}
		@Pc(38) int[] local38 = (int[]) local15.anObject13;
		@Pc(44) Class273[] local44 = new Class273[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(51) Class273 local51 = new Class273();
			local44[local46] = local51;
			local51.anInt6918 = local38[local46 << 2];
			local51.anInt6912 = local38[(local46 << 2) + 1];
			local51.anInt6913 = local38[(local46 << 2) + 2];
			local51.anInt6911 = local38[(local46 << 2) + 3];
		}
		return arg1 ? local44 : null;
	}
}
