import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!qj;")
	public static Class162 aClass162_202;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
	public static int anInt5647 = 0;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
	public static int anInt5651 = 0;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	public static int anInt5654 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	public static void method4816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub10 local8 = Static122.method2624(12, arg0);
		local8.method2539();
		local8.anInt2960 = arg1;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
	public static void method4817() {
		Static352.aClass215_102.method6063(5);
		Static11.aClass215_99.method6063(5);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!il;II)V")
	public static void method4818(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (Static124.aClass167_1 == null) {
			return;
		}
		try {
			Static124.aClass167_1.method4761(0L);
			Static124.aClass167_1.method4768(arg0.aByteArray86, 24, arg1);
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ud;I)[Lclient!dk;")
	public static Class47[] method4819(@OriginalArg(0) Class199 arg0) {
		if (!arg0.method5472()) {
			return new Class47[0];
		}
		@Pc(16) Class145 local16 = arg0.method5488();
		while (local16.anInt5065 == 0) {
			Static295.method5212(10L);
		}
		if (local16.anInt5065 == 2) {
			return new Class47[0];
		}
		@Pc(38) int[] local38 = (int[]) local16.anObject6;
		@Pc(44) Class47[] local44 = new Class47[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(52) Class47 local52 = new Class47();
			local44[local46] = local52;
			local52.anInt1566 = local38[local46 << 2];
			local52.anInt1569 = local38[(local46 << 2) + 1];
			local52.anInt1570 = local38[(local46 << 2) + 2];
			local52.anInt1567 = local38[(local46 << 2) + 3];
		}
		return local44;
	}
}
