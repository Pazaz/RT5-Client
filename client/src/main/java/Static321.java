import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	public static int anInt6612;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!qa;")
	public static Class29 aClass29_22;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "Lclient!dr;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "S")
	public static short aShort88 = 320;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "I")
	public static int anInt6613 = 0;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Lclient!op;")
	public static final Class143 aClass143_12 = new Class143(128);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method5629(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZILclient!sm;Z)V")
	public static void method5630(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub35 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt6079;
		@Pc(12) int local12 = (int) arg1.aLong235;
		arg1.method6172();
		if (arg0) {
			Static309.method5428(local8);
		}
		Static204.method4067(local8);
		@Pc(32) Class177 local32 = Static298.method5252(local12);
		if (local32 != null) {
			Static145.method3188(local32);
		}
		Static83.method1847();
		if (!arg2 && Static295.anInt6177 != -1) {
			Static13.method5500(Static295.anInt6177, 1);
		}
		@Pc(54) Class24 local54 = new Class24(Static135.aClass183_33);
		for (@Pc(59) Class1_Sub35 local59 = (Class1_Sub35) local54.method660(); local59 != null; local59 = (Class1_Sub35) local54.method659()) {
			if (!local59.method6169()) {
				local59 = (Class1_Sub35) local54.method660();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt6078 == 3) {
				@Pc(81) int local81 = (int) local59.aLong235;
				if (local8 == local81 >>> 16) {
					method5630(true, local59, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZBIIIII)V")
	public static void method5631(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static246.anInt6529 = arg3;
		Static64.anInt1763 = arg4;
		Static62.anInt1703 = arg1;
		Static151.anInt3704 = arg5;
		Static329.anInt6732 = arg2;
		if (arg0 && Static64.anInt1763 >= 100) {
			Static3.anInt92 = Static246.anInt6529 * 128 + 64;
			Static88.anInt2339 = Static151.anInt3704 * 128 + 64;
			Static138.anInt3429 = Static309.method5429(Static88.anInt2339, Static3.anInt92, Static39.anInt1215) - Static329.anInt6732;
		}
		Static303.anInt6342 = 2;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I")
	public static int method5633() {
		@Pc(7) Class40 local7 = Static221.aClass40_6;
		@Pc(9) boolean local9 = false;
		if (Static130.anInt6754 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static211.method2701(0, null, local18, 0, null);
		}
		@Pc(37) long local37 = Static325.method5658();
		for (@Pc(39) int local39 = 0; local39 < 10000; local39++) {
			local7.method2763();
		}
		@Pc(74) int local74 = (int) (Static325.method5658() - local37);
		local7.method2745(100, 100, 0, 0, -16777216);
		if (local9) {
			local7.method2711();
		}
		return local74;
	}
}
