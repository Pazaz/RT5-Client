import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!gfa", name = "t", descriptor = "[I")
	public int[] anIntArray278 = new int[] { -1 };

	@OriginalMember(owner = "client!gfa", name = "n", descriptor = "[I")
	public int[] anIntArray279 = new int[1];

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI[I[IZ)J")
	private long method3077(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) long[] local7 = Class2_Sub2_Sub14.aLongArray21;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg1 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) ((local25 ^ (long) arg1) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 24)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg2[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg2[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg2[local41] ^ local9) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local126]) & 0xFFL)];
			}
		}
		return local7[(int) ((local9 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILclient!ha;IZLclient!gu;Lclient!ju;)Lclient!ka;")
	public Class114 method3078(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class152 arg3, @OriginalArg(6) Class201 arg4) {
		@Pc(7) Class114 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class289 local11 = null;
		if (arg0 != -1) {
			local11 = Static574.aClass310_2.method7118(arg0);
		}
		@Pc(23) int[] local23 = this.anIntArray278;
		if (local11 != null && local11.anIntArray586 != null) {
			local23 = new int[local11.anIntArray586.length];
			for (@Pc(45) int local45 = 0; local45 < local11.anIntArray586.length; local45++) {
				@Pc(52) int local52 = local11.anIntArray586[local45];
				if (local52 >= 0 && this.anIntArray278.length > local52) {
					local23[local45] = this.anIntArray278[local52];
				} else {
					local23[local45] = -1;
				}
			}
		}
		if (arg3 != null) {
			local9 = arg3.method9101() | 0x800;
		}
		@Pc(116) long local116 = this.method3077(arg2, arg0, local23, arg4 == null ? null : arg4.anIntArray380);
		if (Static166.aClass82_59 != null) {
			local7 = (Class114) Static166.aClass82_59.method2156(local116);
		}
		if (local7 == null || arg1.method7960(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method8013(local9, local7.ua());
			}
			@Pc(151) int local151 = local9;
			@Pc(153) boolean local153 = false;
			for (@Pc(155) int local155 = 0; local155 < local23.length; local155++) {
				if (local23[local155] != -1 && !Static419.aClass112_1.method2486(local23[local155]).method8802(arg2, (Class52) null)) {
					local153 = true;
				}
			}
			if (local153) {
				return null;
			}
			@Pc(203) Class88[] local203 = new Class88[local23.length];
			for (@Pc(205) int local205 = 0; local205 < local23.length; local205++) {
				if (local23[local205] != -1) {
					local203[local205] = Static419.aClass112_1.method2486(local23[local205]).method8799((Class52) null, arg2);
				}
			}
			@Pc(278) int local278;
			@Pc(285) int local285;
			if (local11 != null && local11.anIntArrayArray181 != null) {
				for (@Pc(252) int local252 = 0; local252 < local11.anIntArrayArray181.length; local252++) {
					if (local11.anIntArrayArray181[local252] != null && local203[local252] != null) {
						local278 = local11.anIntArrayArray181[local252][0];
						local285 = local11.anIntArrayArray181[local252][1];
						@Pc(292) int local292 = local11.anIntArrayArray181[local252][2];
						@Pc(299) int local299 = local11.anIntArrayArray181[local252][3];
						@Pc(306) int local306 = local11.anIntArrayArray181[local252][4];
						@Pc(313) int local313 = local11.anIntArrayArray181[local252][5];
						if (local299 != 0 || local306 != 0 || local313 != 0) {
							local203[local252].method2236(local313, local299, local306);
						}
						if (local278 != 0 || local285 != 0 || local292 != 0) {
							local203[local252].method2233(local278, local285, local292);
						}
					}
				}
			}
			@Pc(382) Class88 local382 = new Class88(local203, local203.length);
			if (arg4 != null) {
				local151 = local9 | 0x4000;
			}
			local7 = arg1.method7952(local382, local151, Static584.anInt8635, 64, 850);
			if (arg4 != null) {
				for (local278 = 0; local278 < 10; local278++) {
					for (local285 = 0; local285 < Static76.aShortArrayArray2[local278].length; local285++) {
						if (Static339.aShortArrayArrayArray2[local278][local285].length > arg4.anIntArray380[local278]) {
							local7.ia(Static76.aShortArrayArray2[local278][local285], Static339.aShortArrayArrayArray2[local278][local285][arg4.anIntArray380[local278]]);
						}
					}
				}
			}
			if (Static166.aClass82_59 != null) {
				local7.s(local9);
				Static166.aClass82_59.method2150(local7, local116);
			}
		}
		if (arg3 == null) {
			return local7;
		} else {
			@Pc(478) Class114 local478 = local7.method7495((byte) 1, local9, true);
			arg3.method9089(local478, 0);
			return local478;
		}
	}
}
