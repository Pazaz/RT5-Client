import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
	public static int anInt3992;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "F")
	public static float aFloat50 = 0.0F;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString147 = "Loaded input handler";

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString148 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString149 = " is already on your ignore list.";

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
	public static volatile int anInt3993 = 0;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "[I")
	public static final int[] anIntArray281 = new int[13];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)I")
	public static int method3434(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)I")
	public static int method3435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static13.anIntArray498[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)I")
	public static int method3437() {
		if (Static112.aFrame1 == null) {
			return Static137.aBoolean238 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!fg;I)I")
	public static int method3438(@OriginalArg(0) Class7_Sub1_Sub1 arg0) {
		if (arg0.anInt7100 == 0) {
			return 0;
		}
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (arg0.anInt7054 != -1 && arg0.anInt7054 < 32768) {
			@Pc(28) Class7_Sub1_Sub1_Sub1 local28 = Static84.aClass7_Sub1_Sub1_Sub1Array1[arg0.anInt7054];
			if (local28 != null) {
				local36 = arg0.anInt7027 - local28.anInt7027;
				local43 = arg0.anInt7032 - local28.anInt7032;
				if (local36 != 0 || local43 != 0) {
					arg0.method5985((int) (Math.atan2((double) local36, (double) local43) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt7054 >= 32768) {
			local71 = arg0.anInt7054 - 32768;
			if (local71 == Static172.anInt6634) {
				local71 = 2047;
			}
			@Pc(84) Class7_Sub1_Sub1_Sub2 local84 = Static168.aClass7_Sub1_Sub1_Sub2Array1[local71];
			if (local84 != null) {
				local43 = arg0.anInt7027 - local84.anInt7027;
				@Pc(99) int local99 = arg0.anInt7032 - local84.anInt7032;
				if (local43 != 0 || local99 != 0) {
					arg0.method5985((int) (Math.atan2((double) local43, (double) local99) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt7045 != 0 || arg0.anInt7091 != 0) && (arg0.anInt7113 == 0 || arg0.anInt7106 > 0)) {
			local71 = arg0.anInt7027 - (arg0.anInt7045 - Static149.anInt3667 - Static149.anInt3667) * 64;
			local36 = arg0.anInt7032 - (arg0.anInt7091 - Static96.anInt2446 - Static96.anInt2446) * 64;
			if (local71 != 0 || local36 != 0) {
				arg0.method5985((int) (Math.atan2((double) local71, (double) local36) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt7045 = 0;
			arg0.anInt7091 = 0;
		}
		return arg0.method5968();
	}
}
