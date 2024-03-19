import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[I")
	public int[] anIntArray224 = new int[] { -1 };

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
	public int[] anIntArray226 = new int[1];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!nr;ILclient!qr;IZIIZLclient!tb;I)Lclient!qc;")
	public Class86 method2617(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(8) Class190 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class86 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class83 local11 = null;
		if (arg3 != -1) {
			local11 = Static104.method2159(arg3);
		}
		@Pc(22) int[] local22 = this.anIntArray224;
		if (local11 != null && local11.anIntArray203 != null) {
			local22 = new int[local11.anIntArray203.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray203.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray203[local34];
				if (local41 >= 0 && this.anIntArray224.length > local41) {
					local22[local34] = this.anIntArray224[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(72) boolean local72 = false;
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) int local78 = -1;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = 0;
		@Pc(84) Class1_Sub1_Sub14 local84 = null;
		@Pc(86) Class1_Sub1_Sub14 local86 = null;
		if (arg2 != null) {
			local78 = arg2.anIntArray407[arg1];
			local9 = 1056;
			@Pc(101) int local101 = local78 >>> 16;
			local84 = Static44.method715(local101);
			local78 &= 0xFFFF;
			if (local84 != null) {
				local74 = local84.method3354(local78) | false;
				local72 = local84.method3357(local78) | false;
				local76 = arg2.aBoolean391 | false;
			}
			if ((arg2.aBoolean394 || Static187.aBoolean305) && arg5 != -1 && arg5 < arg2.anIntArray407.length) {
				local82 = arg2.anIntArray410[arg1];
				local80 = arg2.anIntArray407[arg5];
				@Pc(158) int local158 = local80 >>> 16;
				local80 &= 0xFFFF;
				if (local101 == local158) {
					local86 = local84;
				} else {
					local86 = Static44.method715(local80 >>> 16);
				}
				if (local86 != null) {
					local74 |= local86.method3354(local80);
					local72 |= local86.method3357(local80);
				}
			}
			if (local74) {
				local9 = 1184;
			}
			if (local72) {
				local9 |= 0x100;
			}
			if (local76) {
				local9 |= 0x200;
			}
		}
		@Pc(221) long local221 = this.method2620(arg6 == null ? null : arg6.anIntArray478, arg4, arg3, local22);
		if (Static309.aClass215_92 != null) {
			local7 = (Class86) Static309.aClass215_92.method6057(local221);
		}
		if (local7 == null || arg0.method2752(local7.method5531(), local9) != 0) {
			if (local7 != null) {
				local9 = arg0.method2747(local9, local7.method5531());
			}
			@Pc(247) int local247 = local9;
			@Pc(249) boolean local249 = false;
			for (@Pc(251) int local251 = 0; local251 < local22.length; local251++) {
				if (local22[local251] != -1 && !Static165.method3446(local22[local251]).method945(arg4)) {
					local249 = true;
				}
			}
			if (local249) {
				return null;
			}
			@Pc(286) Class126[] local286 = new Class126[local22.length];
			for (@Pc(288) int local288 = 0; local288 < local22.length; local288++) {
				if (local22[local288] != -1) {
					local286[local288] = Static165.method3446(local22[local288]).method947(arg4);
				}
			}
			@Pc(342) int local342;
			if (local11 != null && local11.anIntArrayArray14 != null) {
				for (@Pc(322) int local322 = 0; local322 < local11.anIntArrayArray14.length; local322++) {
					if (local11.anIntArrayArray14[local322] != null && local286[local322] != null) {
						local342 = local11.anIntArrayArray14[local322][0];
						@Pc(349) int local349 = local11.anIntArrayArray14[local322][1];
						@Pc(356) int local356 = local11.anIntArrayArray14[local322][2];
						@Pc(363) int local363 = local11.anIntArrayArray14[local322][3];
						@Pc(370) int local370 = local11.anIntArrayArray14[local322][4];
						@Pc(377) int local377 = local11.anIntArrayArray14[local322][5];
						if (local363 != 0 || local370 != 0 || local377 != 0) {
							local286[local322].method3645(local377, local370, local363);
						}
						if (local342 != 0 || local349 != 0 || local356 != 0) {
							local286[local322].method3644(local342, local356, local349);
						}
					}
				}
			}
			@Pc(424) Class126 local424 = new Class126(local286, local286.length);
			if (arg6 != null) {
				local247 = local9 | 0x2000;
			}
			local7 = arg0.method2762(local424, local247, Static14.anInt591, 64, 850);
			if (arg6 != null) {
				for (local342 = 0; local342 < 5; local342++) {
					if (Static104.aShortArrayArray2[local342].length > arg6.anIntArray478[local342]) {
						local7.method5538(Static8.aShortArray1[local342], Static104.aShortArrayArray2[local342][arg6.anIntArray478[local342]]);
					}
					if (arg6.anIntArray478[local342] < Static95.aShortArrayArray1[local342].length) {
						local7.method5538(Static229.aShortArray90[local342], Static95.aShortArrayArray1[local342][arg6.anIntArray478[local342]]);
					}
				}
			}
			if (Static309.aClass215_92 != null) {
				local7.method5526(local9);
				Static309.aClass215_92.method6050(local7, local221);
			}
		}
		if (arg2 == null || local84 == null) {
			return local7;
		} else {
			@Pc(522) Class86 local522 = local7.method5565((byte) 1, local9, true);
			local522.method5548(local80, 0, local82, arg7 - 1, local86, arg2.aBoolean391, local84, local78);
			return local522;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([IZI[II)J")
	private long method2620(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) long[] local7 = Class7_Sub5.aLongArray5;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) ((local25 ^ (long) arg2) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local46] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local46] >> 16)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg3[local46] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local46]) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local7[(int) (((long) arg0[local131] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
	}
}
