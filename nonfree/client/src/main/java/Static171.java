import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
	public static int anInt2882;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "F")
	public static float aFloat64 = 0.0F;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	public static int anInt2880 = -2;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "[I")
	public static final int[] anIntArray250 = new int[1];

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
	public static int anInt2887 = 1;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	public static int method2670(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCE) >>> 2);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(45) int local45 = local39 + (local39 >>> 16);
		return local45 & 0xFF;
	}
}
