import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class2_Sub3_Sub20 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kt", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!kt", name = "P", descriptor = "[I")
	private final int[] anIntArray207 = new int[257];

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V")
	@Override
	public void method6480() {
		if (this.anIntArrayArray26 == null) {
			this.method3503(1);
		}
		this.method3504();
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method6479(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass243_41.method6277(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(29) int[] local29 = this.method6473(0, arg0);
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			for (@Pc(43) int local43 = 0; local43 < Static227.anInt4036; local43++) {
				@Pc(51) int local51 = local29[local43] >> 4;
				if (local51 < 0) {
					local51 = 0;
				}
				if (local51 > 256) {
					local51 = 256;
				}
				local51 = this.anIntArray207[local51];
				local33[local43] = local51 >> 12 & 0xFF0;
				local37[local43] = local51 >> 4 & 0xFF0;
				local41[local43] = (local51 & 0xFF) << 4;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method4815();
		if (local10 != 0) {
			this.method3503(local10);
			return;
		}
		this.anIntArrayArray26 = new int[arg1.method4815()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray26.length; local21++) {
			this.anIntArrayArray26[local21][0] = arg1.method4829();
			this.anIntArrayArray26[local21][1] = arg1.method4815() << 4;
			this.anIntArrayArray26[local21][2] = arg1.method4815() << 4;
			this.anIntArrayArray26[local21][3] = arg1.method4815() << 4;
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(IB)V")
	private void method3503(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray26 = new int[2][4];
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray26 = new int[8][4];
			this.anIntArrayArray26[0][2] = 2602;
			this.anIntArrayArray26[0][1] = 2650;
			this.anIntArrayArray26[0][3] = 2361;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[1][1] = 2313;
			this.anIntArrayArray26[1][3] = 1558;
			this.anIntArrayArray26[1][2] = 1799;
			this.anIntArrayArray26[2][3] = 1413;
			this.anIntArrayArray26[2][0] = 3072;
			this.anIntArrayArray26[2][1] = 2618;
			this.anIntArrayArray26[2][2] = 1734;
			this.anIntArrayArray26[3][3] = 947;
			this.anIntArrayArray26[3][2] = 1220;
			this.anIntArrayArray26[3][1] = 2296;
			this.anIntArrayArray26[3][0] = 3276;
			this.anIntArrayArray26[4][2] = 963;
			this.anIntArrayArray26[4][1] = 2072;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[4][3] = 722;
			this.anIntArrayArray26[5][1] = 2730;
			this.anIntArrayArray26[5][2] = 2152;
			this.anIntArrayArray26[5][0] = 3686;
			this.anIntArrayArray26[5][3] = 1766;
			this.anIntArrayArray26[6][0] = 3891;
			this.anIntArrayArray26[6][2] = 1060;
			this.anIntArrayArray26[6][1] = 2232;
			this.anIntArrayArray26[6][3] = 915;
			this.anIntArrayArray26[7][0] = 4096;
			this.anIntArrayArray26[7][2] = 1413;
			this.anIntArrayArray26[7][3] = 1140;
			this.anIntArrayArray26[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray26 = new int[7][4];
			this.anIntArrayArray26[0][3] = 4096;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[1][0] = 663;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[2][0] = 1363;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[3][2] = 4096;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[3][0] = 2048;
			this.anIntArrayArray26[4][0] = 2727;
			this.anIntArrayArray26[4][2] = 0;
			this.anIntArrayArray26[4][3] = 0;
			this.anIntArrayArray26[4][1] = 4096;
			this.anIntArrayArray26[5][0] = 3411;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[5][2] = 0;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[6][2] = 0;
			this.anIntArrayArray26[6][3] = 4096;
			this.anIntArrayArray26[6][0] = 4096;
			this.anIntArrayArray26[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray26 = new int[6][4];
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][3] = 1493;
			this.anIntArrayArray26[1][0] = 1843;
			this.anIntArrayArray26[1][2] = 0;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[2][3] = 2939;
			this.anIntArrayArray26[2][2] = 0;
			this.anIntArrayArray26[2][0] = 2457;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][1] = 0;
			this.anIntArrayArray26[3][3] = 3565;
			this.anIntArrayArray26[3][2] = 1124;
			this.anIntArrayArray26[3][0] = 2781;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[4][1] = 546;
			this.anIntArrayArray26[4][3] = 4031;
			this.anIntArrayArray26[4][2] = 3084;
			this.anIntArrayArray26[5][2] = 4096;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[5][0] = 4096;
			this.anIntArrayArray26[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray26 = new int[16][4];
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][1] = 80;
			this.anIntArrayArray26[0][2] = 192;
			this.anIntArrayArray26[0][3] = 321;
			this.anIntArrayArray26[1][2] = 449;
			this.anIntArrayArray26[1][1] = 321;
			this.anIntArrayArray26[1][3] = 562;
			this.anIntArrayArray26[1][0] = 155;
			this.anIntArrayArray26[2][1] = 578;
			this.anIntArrayArray26[2][2] = 690;
			this.anIntArrayArray26[2][3] = 803;
			this.anIntArrayArray26[2][0] = 389;
			this.anIntArrayArray26[3][2] = 995;
			this.anIntArrayArray26[3][3] = 1140;
			this.anIntArrayArray26[3][0] = 671;
			this.anIntArrayArray26[3][1] = 947;
			this.anIntArrayArray26[4][1] = 1285;
			this.anIntArrayArray26[4][2] = 1397;
			this.anIntArrayArray26[4][0] = 897;
			this.anIntArrayArray26[4][3] = 1509;
			this.anIntArrayArray26[5][0] = 1175;
			this.anIntArrayArray26[5][3] = 1413;
			this.anIntArrayArray26[5][2] = 1429;
			this.anIntArrayArray26[5][1] = 1525;
			this.anIntArrayArray26[6][2] = 1461;
			this.anIntArrayArray26[6][0] = 1368;
			this.anIntArrayArray26[6][3] = 1333;
			this.anIntArrayArray26[6][1] = 1734;
			this.anIntArrayArray26[7][1] = 1413;
			this.anIntArrayArray26[7][0] = 1507;
			this.anIntArrayArray26[7][2] = 1525;
			this.anIntArrayArray26[7][3] = 1702;
			this.anIntArrayArray26[8][3] = 2056;
			this.anIntArrayArray26[8][1] = 1108;
			this.anIntArrayArray26[8][2] = 1590;
			this.anIntArrayArray26[8][0] = 1736;
			this.anIntArrayArray26[9][2] = 2056;
			this.anIntArrayArray26[9][3] = 2666;
			this.anIntArrayArray26[9][0] = 2088;
			this.anIntArrayArray26[9][1] = 1766;
			this.anIntArrayArray26[10][3] = 3276;
			this.anIntArrayArray26[10][2] = 2586;
			this.anIntArrayArray26[10][0] = 2355;
			this.anIntArrayArray26[10][1] = 2409;
			this.anIntArrayArray26[11][3] = 3228;
			this.anIntArrayArray26[11][2] = 3148;
			this.anIntArrayArray26[11][0] = 2691;
			this.anIntArrayArray26[11][1] = 3116;
			this.anIntArrayArray26[12][2] = 3710;
			this.anIntArrayArray26[12][3] = 3196;
			this.anIntArrayArray26[12][1] = 3806;
			this.anIntArrayArray26[12][0] = 3031;
			this.anIntArrayArray26[13][3] = 3019;
			this.anIntArrayArray26[13][0] = 3522;
			this.anIntArrayArray26[13][1] = 3437;
			this.anIntArrayArray26[13][2] = 3421;
			this.anIntArrayArray26[14][3] = 3228;
			this.anIntArrayArray26[14][2] = 3148;
			this.anIntArrayArray26[14][0] = 3727;
			this.anIntArrayArray26[14][1] = 3116;
			this.anIntArrayArray26[15][2] = 2505;
			this.anIntArrayArray26[15][3] = 2746;
			this.anIntArrayArray26[15][1] = 2377;
			this.anIntArrayArray26[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray26 = new int[4][4];
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[0][2] = 4096;
			this.anIntArrayArray26[0][0] = 2048;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[1][3] = 0;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[2][0] = 3276;
			this.anIntArrayArray26[2][1] = 4096;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[3][2] = 0;
			this.anIntArrayArray26[3][0] = 4096;
			this.anIntArrayArray26[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(Z)V")
	private void method3504() {
		@Pc(13) int local13 = this.anIntArrayArray26.length;
		if (local13 <= 0) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 257; local20++) {
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = local20 << 4;
			for (@Pc(30) int local30 = 0; local13 > local30 && local28 >= this.anIntArrayArray26[local30][0]; local30++) {
				local24++;
			}
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(66) int local66;
			@Pc(57) int[] local57;
			if (local24 < local13) {
				local57 = this.anIntArrayArray26[local24];
				if (local24 <= 0) {
					local66 = local57[3];
					local70 = local57[1];
					local74 = local57[2];
				} else {
					@Pc(83) int[] local83 = this.anIntArrayArray26[local24 - 1];
					@Pc(101) int local101 = (local28 - local83[0] << 12) / (local57[0] - local83[0]);
					@Pc(106) int local106 = 4096 - local101;
					local70 = local83[1] * local106 + local101 * local57[1] >> 12;
					local74 = local57[2] * local101 + local106 * local83[2] >> 12;
					local66 = local106 * local83[3] + local101 * local57[3] >> 12;
				}
			} else {
				local57 = this.anIntArrayArray26[local13 - 1];
				local70 = local57[1];
				local66 = local57[3];
				local74 = local57[2];
			}
			local66 >>= 0x4;
			local70 >>= 0x4;
			local74 >>= 0x4;
			if (local66 < 0) {
				local66 = 0;
			} else if (local66 > 255) {
				local66 = 255;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			this.anIntArray207[local20] = local74 << 8 | local70 << 16 | local66;
		}
	}
}
