import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "U", descriptor = "I")
	public static int anInt45;

	@OriginalMember(owner = "client!aaa", name = "I", descriptor = "I")
	public static int anInt53;

	@OriginalMember(owner = "client!aaa", name = "L", descriptor = "Lclient!taa;")
	public static Class306_Sub1 aClass306_Sub1_1;

	@OriginalMember(owner = "client!aaa", name = "T", descriptor = "Lclient!tka;")
	public static Class355 aClass355_1;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(III)V")
	public static void method62(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5963(6, (long) arg1);
		local9.method202();
		local9.anInt197 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IBIILclient!cv;)V")
	public static void method63(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub15 arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg0 << 28 | arg2);
		@Pc(22) Class2_Sub17 local22 = (Class2_Sub17) Static497.aClass28_35.method738(local16);
		if (local22 == null) {
			local22 = new Class2_Sub17();
			Static497.aClass28_35.method735(local16, local22);
			local22.aClass339_12.method7711(arg3);
			return;
		}
		@Pc(45) Class382 local45 = Static419.aClass112_1.method2486(arg3.anInt1958);
		@Pc(48) int local48 = local45.anInt10142;
		if (local45.anInt10115 == 1) {
			local48 *= arg3.anInt1959 + 1;
		}
		for (@Pc(65) Class2_Sub15 local65 = (Class2_Sub15) local22.aClass339_12.method7699(65280); local65 != null; local65 = (Class2_Sub15) local22.aClass339_12.method7706()) {
			local45 = Static419.aClass112_1.method2486(local65.anInt1958);
			@Pc(78) int local78 = local45.anInt10142;
			if (local45.anInt10115 == 1) {
				local78 *= local65.anInt1959 + 1;
			}
			if (local48 > local78) {
				Static201.method7368(local65, arg3);
				return;
			}
		}
		if (-108 == -108) {
			local22.aClass339_12.method7711(arg3);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(II)V")
	public static void method65(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static30.aFloat106 = 3.0F;
		} else if (arg0 == 50) {
			Static30.aFloat106 = 4.0F;
		} else if (arg0 == 75) {
			Static30.aFloat106 = 6.0F;
		} else if (arg0 == 100) {
			Static30.aFloat106 = 8.0F;
		} else if (arg0 == 200) {
			Static30.aFloat106 = 16.0F;
		}
		Static558.anInt3181 = -1;
		Static558.anInt3181 = -1;
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(III)Z")
	public static boolean method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x37) != 0;
	}
}
