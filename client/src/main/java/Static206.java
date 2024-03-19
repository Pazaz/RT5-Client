import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "Lclient!ro;")
	public static Class177 aClass177_14 = null;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
	public static volatile int anInt4785 = -1;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	public static void method4105() {
		Static160.aBoolean518 = true;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V")
	public static void method4106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2 + arg0);
		@Pc(32) int local32 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2 - arg0);
		Static12.method349(local23, Static87.anIntArrayArray9[arg3], arg1, local32);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(70) int local70;
			@Pc(93) int local93;
			@Pc(102) int local102;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg3 - local9;
				local70 = arg3 + local9;
				if (local70 >= Static180.anInt4240 && local65 <= Static197.anInt4520) {
					local93 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2 + local7);
					local102 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2 - local7);
					if (local70 <= Static197.anInt4520) {
						Static12.method349(local93, Static87.anIntArrayArray9[local70], arg1, local102);
					}
					if (Static180.anInt4240 <= local65) {
						Static12.method349(local93, Static87.anIntArrayArray9[local65], arg1, local102);
					}
				}
			}
			local7++;
			local65 = arg3 - local7;
			local70 = arg3 + local7;
			if (Static180.anInt4240 <= local70 && local65 <= Static197.anInt4520) {
				local93 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2 + local9);
				local102 = Static283.method5049(Static179.anInt4229, Static239.anInt5299, arg2 - local9);
				if (local70 <= Static197.anInt4520) {
					Static12.method349(local93, Static87.anIntArrayArray9[local70], arg1, local102);
				}
				if (Static180.anInt4240 <= local65) {
					Static12.method349(local93, Static87.anIntArrayArray9[local65], arg1, local102);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!qj;Lclient!qj;IZ)V")
	public static void method4107(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class162 arg1) {
		Static9.aClass162_23 = arg1;
		Static85.aClass162_79 = arg0;
		Static45.aBoolean96 = true;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIFIZIII)[[I")
	public static int[][] method4108(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub2_Sub17 local13 = new Class1_Sub2_Sub17();
		local13.anInt3004 = (int) (arg0 * 4096.0F);
		local13.anInt2993 = 4;
		local13.anInt3000 = 3;
		local13.aBoolean200 = false;
		local13.anInt3003 = 8;
		local13.method6090();
		Static184.method5962(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method2574(local9[local47], local47);
		}
		return local9;
	}
}
