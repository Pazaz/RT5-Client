import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class74 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public int anInt2448;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public int anInt2449;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	public int anInt2450;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public int anInt2451;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Z")
	public boolean aBoolean160 = false;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public int anInt2447 = 0;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Z")
	public boolean aBoolean161 = true;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "[I")
	public final int[] anIntArray154 = new int[4096];

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!cs;")
	private final Class40_Sub1 aClass40_Sub1_4;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
	private final int[] anIntArray153;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private final int anInt2452;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!cs;)V")
	public Class74(@OriginalArg(0) Class40_Sub1 arg0) {
		this.aClass40_Sub1_4 = arg0;
		this.anIntArray153 = this.aClass40_Sub1_4.anIntArray90;
		this.anInt2452 = this.aClass40_Sub1_4.anInt1412;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIIII)V")
	private void method2042(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.aBoolean160) {
			if (arg4 > this.anInt2451) {
				arg4 = this.anInt2451;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(27) int local27 = arg4 - arg3 >> 2;
		@Pc(34) int local34;
		if (this.anInt2447 == 0) {
			while (true) {
				local27--;
				if (local27 < 0) {
					local27 = arg4 - arg3 & 0x3;
					while (true) {
						local27--;
						if (local27 < 0) {
							return;
						}
						arg0[arg1++] = arg2;
					}
				}
				local34 = arg1 + 1;
				arg0[arg1] = arg2;
				arg0[local34++] = arg2;
				arg0[local34++] = arg2;
				arg1 = local34 + 1;
				arg0[local34] = arg2;
			}
		} else if (this.anInt2447 != 254) {
			@Pc(133) int local133 = this.anInt2447;
			@Pc(138) int local138 = 256 - this.anInt2447;
			@Pc(158) int local158 = ((arg2 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local138 >> 8 & 0xFF00);
			while (true) {
				local27--;
				@Pc(163) int local163;
				if (local27 < 0) {
					local27 = arg4 - arg3 & 0x3;
					while (true) {
						local27--;
						if (local27 < 0) {
							return;
						}
						local163 = arg0[arg1];
						arg0[arg1++] = local158 + ((local163 & 0xFF00FF) * local133 >> 8 & 0xFF00FF) + ((local163 & 0xFF00) * local133 >> 8 & 0xFF00);
					}
				}
				local163 = arg0[arg1];
				local34 = arg1 + 1;
				arg0[arg1] = local158 + ((local163 & 0xFF00FF) * local133 >> 8 & 0xFF00FF) + ((local163 & 0xFF00) * local133 >> 8 & 0xFF00);
				@Pc(192) int local192 = arg0[local34];
				@Pc(195) int local195 = local34 + 1;
				arg0[local34] = local158 + ((local192 & 0xFF00FF) * local133 >> 8 & 0xFF00FF) + ((local192 & 0xFF00) * local133 >> 8 & 0xFF00);
				@Pc(221) int local221 = arg0[local195];
				@Pc(224) int local224 = local195 + 1;
				arg0[local195] = local158 + ((local221 & 0xFF00FF) * local133 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local133 >> 8 & 0xFF00);
				@Pc(250) int local250 = arg0[local224];
				arg1 = local224 + 1;
				arg0[local224] = local158 + ((local250 & 0xFF00FF) * local133 >> 8 & 0xFF00FF) + ((local250 & 0xFF00) * local133 >> 8 & 0xFF00);
			}
		} else if (arg4 <= this.anInt2451 - 1) {
			while (true) {
				local27--;
				if (local27 < 0) {
					local27 = arg4 - arg3 & 0x3;
					while (true) {
						local27--;
						if (local27 < 0) {
							return;
						}
						arg0[arg1++] = arg0[arg1];
					}
				}
				local34 = arg1 + 1;
				arg0[arg1] = arg0[local34];
				arg0[local34++] = arg0[local34];
				arg0[local34++] = arg0[local34];
				arg1 = local34 + 1;
				arg0[local34] = arg0[arg1];
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()I")
	public int method2043() {
		return this.anIntArray154[0] % this.anInt2452;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()I")
	public int method2044() {
		return this.anIntArray154[0] / this.anInt2452;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([I[IIIIIIIIFFFFFF)V")
	private void method2045(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12) {
		if (this.aBoolean160) {
			if (arg4 > this.anInt2451) {
				arg4 = this.anInt2451;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		@Pc(31) int local31 = arg4 - arg3;
		@Pc(162) int local162;
		@Pc(150) int local150;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(118) int local118;
		@Pc(125) int local125;
		@Pc(42) int local42;
		@Pc(136) int local136;
		@Pc(180) int local180;
		@Pc(158) int local158;
		@Pc(49) float local49;
		@Pc(56) float local56;
		@Pc(63) float local63;
		@Pc(177) int local177;
		if (this.anInt2447 == 0) {
			if (this.aBoolean162) {
				local42 = arg3 - this.anInt2449;
				local49 = arg7 + arg10 * (float) local42;
				local56 = arg8 + arg11 * (float) local42;
				local63 = arg9 + arg12 * (float) local42;
				if (local63 == 0.0F) {
					local74 = 0;
					local81 = 0;
				} else {
					local74 = (int) (local49 * 4096.0F / local63);
					local81 = (int) (local56 * 4096.0F / local63);
				}
				local49 += arg10 * (float) local31;
				local56 += arg11 * (float) local31;
				local63 += arg12 * (float) local31;
				if (local63 == 0.0F) {
					local118 = 0;
					local125 = 0;
				} else {
					local118 = (int) (local49 * 4096.0F / local63);
					local125 = (int) (local56 * 4096.0F / local63);
				}
				local136 = (local74 << 20) + local81;
				local150 = ((local118 - local74) / local31 << 20) + (local125 - local81) / local31;
				local31 >>= 0x3;
				local158 = arg6 << 3;
				local162 = arg5 >> 8;
				if (this.aBoolean163) {
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							local180 = arg2 + 1;
							arg0[arg2] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(212) int local212 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local212 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local212 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(247) int local247 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local247 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local247 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(282) int local282 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local282 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local282 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(317) int local317 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local317 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local317 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(352) int local352 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local352 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local352 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(387) int local387 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[local180++] = ((local387 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local387 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							@Pc(422) int local422 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg2 = local180 + 1;
							arg0[local180] = ((local422 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local422 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							arg5 += local158;
							local162 = arg5 >> 8;
							local31--;
						} while (local31 > 0);
					}
					local31 = arg4 - arg3 & 0x7;
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
							arg0[arg2++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local31--;
						} while (local31 > 0);
						return;
					}
					return;
				}
				if (local31 > 0) {
					do {
						@Pc(518) int local518;
						if ((local518 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[arg2] = ((local518 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local518 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180 = arg2 + 1;
						local136 += local150;
						@Pc(555) int local555;
						if ((local555 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local555 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local555 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(592) int local592;
						if ((local592 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local592 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local592 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(629) int local629;
						if ((local629 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local629 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local629 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(666) int local666;
						if ((local666 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local666 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local666 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(703) int local703;
						if ((local703 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local703 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local703 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(740) int local740;
						if ((local740 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local740 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local740 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(777) int local777;
						if ((local777 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[local180] = ((local777 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local777 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						arg2 = local180 + 1;
						local136 += local150;
						arg5 += local158;
						local162 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						@Pc(833) int local833;
						if ((local833 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
							arg0[arg2] = ((local833 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local833 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						arg2++;
						local136 += local150;
						local31--;
					} while (local31 > 0);
					return;
				}
			} else {
				local42 = arg3 - this.anInt2449;
				local49 = arg7 + arg10 * (float) local42;
				local56 = arg8 + arg11 * (float) local42;
				local63 = arg9 + arg12 * (float) local42;
				if (local63 == 0.0F) {
					local74 = 0;
					local81 = 0;
				} else {
					local74 = (int) (local49 * 16384.0F / local63);
					local81 = (int) (local56 * 16384.0F / local63);
				}
				local49 += arg10 * (float) local31;
				local56 += arg11 * (float) local31;
				local63 += arg12 * (float) local31;
				if (local63 == 0.0F) {
					local118 = 0;
					local125 = 0;
				} else {
					local118 = (int) (local49 * 16384.0F / local63);
					local125 = (int) (local56 * 16384.0F / local63);
				}
				local136 = (local74 << 18) + local81;
				local150 = ((local118 - local74) / local31 << 18) + (local125 - local81) / local31;
				local31 >>= 0x3;
				local158 = arg6 << 3;
				local162 = arg5 >> 8;
				if (this.aBoolean163) {
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							local180 = arg2 + 1;
							arg0[arg2] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[local180++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg2 = local180 + 1;
							arg0[local180] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							arg5 += local158;
							local162 = arg5 >> 8;
							local31--;
						} while (local31 > 0);
					}
					local31 = arg4 - arg3 & 0x7;
					if (local31 > 0) {
						do {
							local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
							arg0[arg2++] = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
							local136 += local150;
							local31--;
						} while (local31 > 0);
						return;
					}
				} else {
					if (local31 > 0) {
						do {
							@Pc(1344) int local1344;
							if ((local1344 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[arg2] = ((local1344 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1344 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180 = arg2 + 1;
							local136 += local150;
							@Pc(1381) int local1381;
							if ((local1381 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1381 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1381 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1418) int local1418;
							if ((local1418 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1418 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1418 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1455) int local1455;
							if ((local1455 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1455 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1455 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1492) int local1492;
							if ((local1492 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1492 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1492 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1529) int local1529;
							if ((local1529 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1529 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1529 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1566) int local1566;
							if ((local1566 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1566 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1566 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							local180++;
							local136 += local150;
							@Pc(1603) int local1603;
							if ((local1603 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
								arg0[local180] = ((local1603 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1603 & 0xFF00) * local162 & 0xFF0000) >> 8;
							}
							arg2 = local180 + 1;
							local136 += local150;
							arg5 += local158;
							local162 = arg5 >> 8;
							local31--;
						} while (local31 > 0);
					}
					local31 = arg4 - arg3 & 0x7;
					if (local31 <= 0) {
						return;
					}
					do {
						@Pc(1659) int local1659;
						if ((local1659 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							arg0[arg2] = ((local1659 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local1659 & 0xFF00) * local162 & 0xFF0000) >> 8;
						}
						arg2++;
						local136 += local150;
						local31--;
					} while (local31 > 0);
				}
			}
			return;
		}
		local74 = this.anInt2447;
		local81 = 256 - this.anInt2447;
		@Pc(1788) int local1788;
		@Pc(1834) int local1834;
		@Pc(1705) int local1705;
		if (!this.aBoolean162) {
			local1705 = arg3 - this.anInt2449;
			local49 = arg7 + arg10 * (float) local1705;
			local56 = arg8 + arg11 * (float) local1705;
			local63 = arg9 + arg12 * (float) local1705;
			if (local63 == 0.0F) {
				local118 = 0;
				local125 = 0;
			} else {
				local118 = (int) (local49 * 16384.0F / local63);
				local125 = (int) (local56 * 16384.0F / local63);
			}
			local49 += arg10 * (float) local31;
			local56 += arg11 * (float) local31;
			local63 += arg12 * (float) local31;
			if (local63 == 0.0F) {
				local42 = 0;
				local1788 = 0;
			} else {
				local42 = (int) (local49 * 16384.0F / local63);
				local1788 = (int) (local56 * 16384.0F / local63);
			}
			local136 = (local118 << 18) + local125;
			local150 = ((local42 - local118) / local31 << 18) + (local1788 - local125) / local31;
			local31 >>= 0x3;
			local158 = arg6 << 3;
			local162 = arg5 >> 8;
			if (this.aBoolean163) {
				if (local31 > 0) {
					do {
						local1834 = arg0[arg2];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						local180 = arg2 + 1;
						arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local1834 = arg0[local180];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg2 = local180 + 1;
						arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						arg5 += local158;
						local162 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						local1834 = arg0[arg2];
						local177 = arg1[(local136 & 0x3F80) + (local136 >>> 25)];
						local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
						arg0[arg2++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						local136 += local150;
						local31--;
					} while (local31 > 0);
					return;
				}
			} else {
				if (local31 > 0) {
					do {
						@Pc(3925) int local3925;
						if ((local3925 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[arg2];
							local177 = ((local3925 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local3925 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180 = arg2 + 1;
						local136 += local150;
						@Pc(3996) int local3996;
						if ((local3996 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local3996 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local3996 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4067) int local4067;
						if ((local4067 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4067 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4067 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4138) int local4138;
						if ((local4138 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4138 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4138 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4209) int local4209;
						if ((local4209 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4209 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4209 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4280) int local4280;
						if ((local4280 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4280 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4280 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4351) int local4351;
						if ((local4351 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4351 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4351 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						local180++;
						local136 += local150;
						@Pc(4422) int local4422;
						if ((local4422 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[local180];
							local177 = ((local4422 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4422 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						arg2 = local180 + 1;
						local136 += local150;
						arg5 += local158;
						local162 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						@Pc(4512) int local4512;
						if ((local4512 = arg1[(local136 & 0x3F80) + (local136 >>> 25)]) != 0) {
							local1834 = arg0[arg2];
							local177 = ((local4512 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local4512 & 0xFF00) * local162 & 0xFF0000) >> 8;
							arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
						}
						arg2++;
						local136 += local150;
						local31--;
					} while (local31 > 0);
				}
			}
			return;
		}
		local1705 = arg3 - this.anInt2449;
		local49 = arg7 + arg10 * (float) local1705;
		local56 = arg8 + arg11 * (float) local1705;
		local63 = arg9 + arg12 * (float) local1705;
		if (local63 == 0.0F) {
			local118 = 0;
			local125 = 0;
		} else {
			local118 = (int) (local49 * 4096.0F / local63);
			local125 = (int) (local56 * 4096.0F / local63);
		}
		local49 += arg10 * (float) local31;
		local56 += arg11 * (float) local31;
		local63 += arg12 * (float) local31;
		if (local63 == 0.0F) {
			local42 = 0;
			local1788 = 0;
		} else {
			local42 = (int) (local49 * 4096.0F / local63);
			local1788 = (int) (local56 * 4096.0F / local63);
		}
		local136 = (local118 << 20) + local125;
		local150 = ((local42 - local118) / local31 << 20) + (local1788 - local125) / local31;
		local31 >>= 0x3;
		local158 = arg6 << 3;
		local162 = arg5 >> 8;
		if (this.aBoolean163) {
			if (local31 > 0) {
				do {
					local1834 = arg0[arg2];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					local180 = arg2 + 1;
					arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local1834 = arg0[local180];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg2 = local180 + 1;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					arg5 += local158;
					local162 = arg5 >> 8;
					local31--;
				} while (local31 > 0);
			}
			local31 = arg4 - arg3 & 0x7;
			if (local31 > 0) {
				do {
					local1834 = arg0[arg2];
					local177 = arg1[(local136 & 0xFC0) + (local136 >>> 26)];
					local177 = ((local177 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local177 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[arg2++] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
					local136 += local150;
					local31--;
				} while (local31 > 0);
				return;
			}
			return;
		}
		if (local31 > 0) {
			do {
				@Pc(2487) int local2487;
				if ((local2487 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[arg2];
					local177 = ((local2487 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2487 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180 = arg2 + 1;
				local136 += local150;
				@Pc(2558) int local2558;
				if ((local2558 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2558 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2558 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2629) int local2629;
				if ((local2629 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2629 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2629 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2700) int local2700;
				if ((local2700 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2700 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2700 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2771) int local2771;
				if ((local2771 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2771 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2771 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2842) int local2842;
				if ((local2842 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2842 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2842 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2913) int local2913;
				if ((local2913 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2913 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2913 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				local180++;
				local136 += local150;
				@Pc(2984) int local2984;
				if ((local2984 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
					local1834 = arg0[local180];
					local177 = ((local2984 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local2984 & 0xFF00) * local162 & 0xFF0000) >> 8;
					arg0[local180] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
				}
				arg2 = local180 + 1;
				local136 += local150;
				arg5 += local158;
				local162 = arg5 >> 8;
				local31--;
			} while (local31 > 0);
		}
		local31 = arg4 - arg3 & 0x7;
		if (local31 <= 0) {
			return;
		}
		do {
			@Pc(3074) int local3074;
			if ((local3074 = arg1[(local136 & 0xFC0) + (local136 >>> 26)]) != 0) {
				local1834 = arg0[arg2];
				local177 = ((local3074 & 0xFF00FF) * local162 & 0xFF00FF00) + ((local3074 & 0xFF00) * local162 & 0xFF0000) >> 8;
				arg0[arg2] = ((local1834 & 0xFF00FF) * local74 + (local177 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local1834 & 0xFF00) * local74 + (local177 & 0xFF00) * local81 & 0xFF0000) >> 8;
			}
			arg2++;
			local136 += local150;
			local31--;
		} while (local31 > 0);
		return;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([I[IIIIIIIIIIIFFFFFF)V")
	private void method2046(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		if (this.aBoolean160) {
			if (arg4 > this.anInt2451) {
				arg4 = this.anInt2451;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		arg8 += arg9 * arg3;
		@Pc(37) int local37 = arg4 - arg3;
		@Pc(41) int local41 = arg6 << 3;
		@Pc(45) int local45 = arg5 >> 16;
		@Pc(49) int local49 = 255 - local45;
		@Pc(67) int local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
		@Pc(195) int local195;
		@Pc(183) int local183;
		@Pc(116) int local116;
		@Pc(123) int local123;
		@Pc(151) int local151;
		@Pc(158) int local158;
		@Pc(78) int local78;
		@Pc(169) int local169;
		@Pc(231) int local231;
		@Pc(191) int local191;
		@Pc(87) float local87;
		@Pc(96) float local96;
		@Pc(105) float local105;
		@Pc(210) int local210;
		if (this.anInt2447 == 0) {
			if (this.aBoolean162) {
				local78 = arg3 - this.anInt2449;
				local87 = arg10 + arg13 / 8.0F * (float) local78;
				local96 = arg11 + arg14 / 8.0F * (float) local78;
				local105 = arg12 + arg15 / 8.0F * (float) local78;
				if (local105 == 0.0F) {
					local116 = 0;
					local123 = 0;
				} else {
					local116 = (int) (local87 * 4096.0F / local105);
					local123 = (int) (local96 * 4096.0F / local105);
				}
				arg10 = local87 + arg13;
				arg11 = local96 + arg14;
				arg12 = local105 + arg15;
				if (arg12 == 0.0F) {
					local151 = 0;
					local158 = 0;
				} else {
					local151 = (int) (arg10 * 4096.0F / arg12);
					local158 = (int) (arg11 * 4096.0F / arg12);
				}
				local169 = (local116 << 20) + local123;
				local183 = (local151 - local116 >> 3 << 20) + (local158 - local123 >> 3);
				local37 >>= 0x3;
				local191 = arg9 << 3;
				local195 = arg8 >> 8;
				if (this.aBoolean163) {
					if (local37 > 0) {
						do {
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local231 = arg2 + 1;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg2 = local231 + 1;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local116 = local151;
							local123 = local158;
							arg10 += arg13;
							arg11 += arg14;
							arg12 += arg15;
							if (arg12 == 0.0F) {
								local151 = 0;
								local158 = 0;
							} else {
								local151 = (int) (arg10 * 4096.0F / arg12);
								local158 = (int) (arg11 * 4096.0F / arg12);
							}
							local169 = (local116 << 20) + local123;
							local183 = (local151 - local116 >> 3 << 20) + (local158 - local123 >> 3);
							arg8 += local191;
							local195 = arg8 >> 8;
							arg5 += local41;
							local45 = arg5 >> 16;
							local49 = 255 - local45;
							local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
							local37--;
						} while (local37 > 0);
					}
					local37 = arg4 - arg3 & 0x7;
					if (local37 > 0) {
						do {
							local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
							local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
							local169 += local183;
							local37--;
						} while (local37 > 0);
						return;
					}
					return;
				}
				if (local37 > 0) {
					do {
						@Pc(820) int local820;
						if ((local820 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local820 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local820 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231 = arg2 + 1;
						local169 += local183;
						@Pc(877) int local877;
						if ((local877 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local877 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local877 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(934) int local934;
						if ((local934 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local934 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local934 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(991) int local991;
						if ((local991 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local991 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local991 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1048) int local1048;
						if ((local1048 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1048 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1048 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1105) int local1105;
						if ((local1105 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1105 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1105 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1162) int local1162;
						if ((local1162 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1162 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1162 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(1219) int local1219;
						if ((local1219 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1219 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1219 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2 = local231 + 1;
						local116 = local151;
						local123 = local158;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local151 = 0;
							local158 = 0;
						} else {
							local151 = (int) (arg10 * 4096.0F / arg12);
							local158 = (int) (arg11 * 4096.0F / arg12);
						}
						local169 = (local116 << 20) + local123;
						local183 = (local151 - local116 >> 3 << 20) + (local158 - local123 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						@Pc(1384) int local1384;
						if ((local1384 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
							local210 = ((local1384 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local1384 & 0xFF00) * local195 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2++;
						local169 += local183;
						local37--;
					} while (local37 > 0);
					return;
				}
				return;
			}
			local78 = arg3 - this.anInt2449;
			local87 = arg10 + arg13 / 8.0F * (float) local78;
			local96 = arg11 + arg14 / 8.0F * (float) local78;
			local105 = arg12 + arg15 / 8.0F * (float) local78;
			if (local105 == 0.0F) {
				local116 = 0;
				local123 = 0;
			} else {
				local116 = (int) (local87 * 16384.0F / local105);
				local123 = (int) (local96 * 16384.0F / local105);
			}
			arg10 = local87 + arg13;
			arg11 = local96 + arg14;
			arg12 = local105 + arg15;
			if (arg12 == 0.0F) {
				local151 = 0;
				local158 = 0;
			} else {
				local151 = (int) (arg10 * 16384.0F / arg12);
				local158 = (int) (arg11 * 16384.0F / arg12);
			}
			local169 = (local116 << 18) + local123;
			local183 = (local151 - local116 >> 3 << 18) + (local158 - local123 >> 3);
			local37 >>= 0x3;
			local191 = arg9 << 3;
			local195 = arg8 >> 8;
			if (this.aBoolean163) {
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local231 = arg2 + 1;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg2 = local231 + 1;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local116 = local151;
						local123 = local158;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local151 = 0;
							local158 = 0;
						} else {
							local151 = (int) (arg10 * 16384.0F / arg12);
							local158 = (int) (arg11 * 16384.0F / arg12);
						}
						local169 = (local116 << 18) + local123;
						local183 = (local151 - local116 >> 3 << 18) + (local158 - local123 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local37--;
					} while (local37 > 0);
					return;
				}
				return;
			}
			if (local37 > 0) {
				do {
					@Pc(2181) int local2181;
					if ((local2181 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2181 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2181 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231 = arg2 + 1;
					local169 += local183;
					@Pc(2238) int local2238;
					if ((local2238 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2238 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2238 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2295) int local2295;
					if ((local2295 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2295 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2295 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2352) int local2352;
					if ((local2352 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2352 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2352 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2409) int local2409;
					if ((local2409 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2409 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2409 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2466) int local2466;
					if ((local2466 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2466 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2466 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2523) int local2523;
					if ((local2523 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2523 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2523 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					local231++;
					local169 += local183;
					@Pc(2580) int local2580;
					if ((local2580 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2580 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2580 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					arg2 = local231 + 1;
					local116 = local151;
					local123 = local158;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local151 = 0;
						local158 = 0;
					} else {
						local151 = (int) (arg10 / arg12 * 16384.0F);
						local158 = (int) (arg11 / arg12 * 16384.0F);
					}
					local169 = (local116 << 18) + local123;
					local183 = (local151 - local116 >> 3 << 18) + (local158 - local123 >> 3);
					arg8 += local191;
					local195 = arg8 >> 8;
					arg5 += local41;
					local45 = arg5 >> 16;
					local49 = 255 - local45;
					local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
					local37--;
				} while (local37 > 0);
			}
			local37 = arg4 - arg3 & 0x7;
			if (local37 > 0) {
				do {
					@Pc(2745) int local2745;
					if ((local2745 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
						local210 = ((local2745 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local2745 & 0xFF00) * local195 & 0xFF0000) >> 8;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					}
					arg2++;
					local169 += local183;
					local37--;
				} while (local37 > 0);
				return;
			}
			return;
		}
		local116 = this.anInt2447;
		local123 = 256 - this.anInt2447;
		@Pc(2891) int local2891;
		@Pc(2937) int local2937;
		@Pc(2811) int local2811;
		if (!this.aBoolean162) {
			local2811 = arg3 - this.anInt2449;
			local87 = arg10 + arg13 / 8.0F * (float) local2811;
			local96 = arg11 + arg14 / 8.0F * (float) local2811;
			local105 = arg12 + arg15 / 8.0F * (float) local2811;
			if (local105 == 0.0F) {
				local151 = 0;
				local158 = 0;
			} else {
				local151 = (int) (local87 * 16384.0F / local105);
				local158 = (int) (local96 * 16384.0F / local105);
			}
			arg10 = local87 + arg13;
			arg11 = local96 + arg14;
			arg12 = local105 + arg15;
			if (arg12 == 0.0F) {
				local78 = 0;
				local2891 = 0;
			} else {
				local78 = (int) (arg10 * 16384.0F / arg12);
				local2891 = (int) (arg11 * 16384.0F / arg12);
			}
			local169 = (local151 << 18) + local158;
			local183 = (local78 - local151 >> 3 << 18) + (local2891 - local158 >> 3);
			local37 >>= 0x3;
			local191 = arg9 << 3;
			local195 = arg8 >> 8;
			if (this.aBoolean163) {
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[arg2];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						local231 = arg2 + 1;
						arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[local231];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg2 = local231 + 1;
						arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local151 = local78;
						local158 = local2891;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local78 = 0;
							local2891 = 0;
						} else {
							local78 = (int) (arg10 * 16384.0F / arg12);
							local2891 = (int) (arg11 * 16384.0F / arg12);
						}
						local169 = (local151 << 18) + local158;
						local183 = (local78 - local151 >> 3 << 18) + (local2891 - local158 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						local210 = arg1[(local169 & 0x3F80) + (local169 >>> 25)];
						local2937 = arg0[arg2];
						local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
						local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
						arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						local169 += local183;
						local37--;
					} while (local37 > 0);
					return;
				}
			} else {
				if (local37 > 0) {
					do {
						@Pc(5832) int local5832;
						if ((local5832 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[arg2];
							local210 = ((local5832 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local5832 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231 = arg2 + 1;
						local169 += local183;
						@Pc(5923) int local5923;
						if ((local5923 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local5923 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local5923 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6014) int local6014;
						if ((local6014 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6014 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6014 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6105) int local6105;
						if ((local6105 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6105 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6105 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6196) int local6196;
						if ((local6196 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6196 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6196 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6287) int local6287;
						if ((local6287 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6287 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6287 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6378) int local6378;
						if ((local6378 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6378 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6378 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						local231++;
						local169 += local183;
						@Pc(6469) int local6469;
						if ((local6469 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[local231];
							local210 = ((local6469 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6469 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2 = local231 + 1;
						local151 = local78;
						local158 = local2891;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local78 = 0;
							local2891 = 0;
						} else {
							local78 = (int) (arg10 * 16384.0F / arg12);
							local2891 = (int) (arg11 * 16384.0F / arg12);
						}
						local169 = (local151 << 18) + local158;
						local183 = (local78 - local151 >> 3 << 18) + (local2891 - local158 >> 3);
						arg8 += local191;
						local195 = arg8 >> 8;
						arg5 += local41;
						local45 = arg5 >> 16;
						local49 = 255 - local45;
						local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
						local37--;
					} while (local37 > 0);
				}
				local37 = arg4 - arg3 & 0x7;
				if (local37 > 0) {
					do {
						@Pc(6668) int local6668;
						if ((local6668 = arg1[(local169 & 0x3F80) + (local169 >>> 25)]) != 0) {
							local2937 = arg0[arg2];
							local210 = ((local6668 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local6668 & 0xFF00) * local195 & 0xFF0000) >> 8;
							local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
							arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
						}
						arg2++;
						local169 += local183;
						local37--;
					} while (local37 > 0);
				}
			}
			return;
		}
		local2811 = arg3 - this.anInt2449;
		local87 = arg10 + arg13 / 8.0F * (float) local2811;
		local96 = arg11 + arg14 / 8.0F * (float) local2811;
		local105 = arg12 + arg15 / 8.0F * (float) local2811;
		if (local105 == 0.0F) {
			local151 = 0;
			local158 = 0;
		} else {
			local151 = (int) (local87 * 4096.0F / local105);
			local158 = (int) (local96 * 4096.0F / local105);
		}
		arg10 = local87 + arg13;
		arg11 = local96 + arg14;
		arg12 = local105 + arg15;
		if (arg12 == 0.0F) {
			local78 = 0;
			local2891 = 0;
		} else {
			local78 = (int) (arg10 * 4096.0F / arg12);
			local2891 = (int) (arg11 * 4096.0F / arg12);
		}
		local169 = (local151 << 20) + local158;
		local183 = (local78 - local151 >> 3 << 20) + (local2891 - local158 >> 3);
		local37 >>= 0x3;
		local191 = arg9 << 3;
		local195 = arg8 >> 8;
		if (this.aBoolean163) {
			if (local37 > 0) {
				do {
					local2937 = arg0[arg2];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					local231 = arg2 + 1;
					arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local2937 = arg0[local231];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg2 = local231 + 1;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local151 = local78;
					local158 = local2891;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local78 = 0;
						local2891 = 0;
					} else {
						local78 = (int) (arg10 * 4096.0F / arg12);
						local2891 = (int) (arg11 * 4096.0F / arg12);
					}
					local169 = (local151 << 20) + local158;
					local183 = (local78 - local151 >> 3 << 20) + (local2891 - local158 >> 3);
					arg8 += local191;
					local195 = arg8 >> 8;
					arg5 += local41;
					local45 = arg5 >> 16;
					local49 = 255 - local45;
					local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
					local37--;
				} while (local37 > 0);
			}
			local37 = arg4 - arg3 & 0x7;
			if (local37 > 0) {
				do {
					local2937 = arg0[arg2];
					local210 = arg1[(local169 & 0xFC0) + (local169 >>> 26)];
					local210 = ((local210 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local210 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[arg2++] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
					local169 += local183;
					local37--;
				} while (local37 > 0);
				return;
			}
			return;
		}
		if (local37 > 0) {
			do {
				@Pc(3859) int local3859;
				if ((local3859 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[arg2];
					local210 = ((local3859 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local3859 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231 = arg2 + 1;
				local169 += local183;
				@Pc(3950) int local3950;
				if ((local3950 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local3950 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local3950 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4041) int local4041;
				if ((local4041 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4041 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4041 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4132) int local4132;
				if ((local4132 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4132 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4132 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4223) int local4223;
				if ((local4223 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4223 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4223 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4314) int local4314;
				if ((local4314 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4314 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4314 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4405) int local4405;
				if ((local4405 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4405 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4405 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				local231++;
				local169 += local183;
				@Pc(4496) int local4496;
				if ((local4496 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
					local2937 = arg0[local231];
					local210 = ((local4496 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4496 & 0xFF00) * local195 & 0xFF0000) >> 8;
					local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
					arg0[local231] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
				}
				arg2 = local231 + 1;
				local151 = local78;
				local158 = local2891;
				arg10 += arg13;
				arg11 += arg14;
				arg12 += arg15;
				if (arg12 == 0.0F) {
					local78 = 0;
					local2891 = 0;
				} else {
					local78 = (int) (arg10 * 4096.0F / arg12);
					local2891 = (int) (arg11 * 4096.0F / arg12);
				}
				local169 = (local151 << 20) + local158;
				local183 = (local78 - local151 >> 3 << 20) + (local2891 - local158 >> 3);
				arg8 += local191;
				local195 = arg8 >> 8;
				arg5 += local41;
				local45 = arg5 >> 16;
				local49 = 255 - local45;
				local67 = ((arg7 & 0xFF00FF) * local45 & 0xFF00FF00 | (arg7 & 0xFF00) * local45 & 0xFF0000) >>> 8;
				local37--;
			} while (local37 > 0);
		}
		local37 = arg4 - arg3 & 0x7;
		if (local37 <= 0) {
			return;
		}
		do {
			@Pc(4695) int local4695;
			if ((local4695 = arg1[(local169 & 0xFC0) + (local169 >>> 26)]) != 0) {
				local2937 = arg0[arg2];
				local210 = ((local4695 & 0xFF00FF) * local195 & 0xFF00FF00) + ((local4695 & 0xFF00) * local195 & 0xFF0000) >> 8;
				local210 = ((local2937 & 0xFF00FF) * local116 + (local210 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local2937 & 0xFF00) * local116 + (local210 & 0xFF00) * local123 & 0xFF0000) >> 8;
				arg0[arg2] = (((local210 & 0xFF00FF) * local49 & 0xFF00FF00 | (local210 & 0xFF00) * local49 & 0xFF0000) >>> 8) + local67;
			}
			arg2++;
			local169 += local183;
			local37--;
		} while (local37 > 0);
		return;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIIII)V")
	public void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19, @OriginalArg(20) int arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22) {
		@Pc(4) int[] local4 = this.aClass40_Sub1_4.method1226(arg22);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass40_Sub1_4.method1232(arg22);
			this.method2056(arg0, arg1, arg2, arg3, arg4, arg5, Static340.method6026(local11, arg6 | arg7 << 24), Static340.method6026(local11, arg6 | arg8 << 24), Static340.method6026(local11, arg6 | arg9 << 24));
			return;
		}
		this.aBoolean162 = this.aClass40_Sub1_4.method1225(arg22);
		this.aBoolean163 = this.aClass40_Sub1_4.method1235(arg22);
		local11 = arg4 - arg3;
		@Pc(64) int local64 = arg1 - arg0;
		@Pc(68) int local68 = arg5 - arg3;
		@Pc(72) int local72 = arg2 - arg0;
		@Pc(74) int local74 = 0;
		if (arg1 != arg0) {
			local74 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(89) int local89 = 0;
		if (arg2 != arg1) {
			local89 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(104) int local104 = 0;
		if (arg2 != arg0) {
			local104 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(125) int local125 = local11 * local72 - local68 * local64;
		if (local125 == 0) {
			return;
		}
		@Pc(132) int local132 = arg8 - arg7;
		@Pc(136) int local136 = arg9 - arg7;
		@Pc(148) int local148 = (local132 * local72 - local136 * local64 << 16) / local125;
		@Pc(160) int local160 = (local136 * local11 - local132 * local68 << 16) / local125;
		@Pc(164) int local164 = arg11 - arg10;
		@Pc(168) int local168 = arg12 - arg10;
		@Pc(180) int local180 = (local164 * local72 - local168 * local64 << 9) / local125;
		@Pc(192) int local192 = (local168 * local11 - local164 * local68 << 9) / local125;
		@Pc(199) float local199 = 8.0F / (float) this.aClass40_Sub1_4.anInt1439;
		@Pc(204) float local204 = (float) this.aClass40_Sub1_4.anInt1417;
		@Pc(208) int local208 = arg13 - arg14;
		@Pc(212) int local212 = arg16 - arg17;
		@Pc(216) int local216 = arg19 - arg20;
		@Pc(220) int local220 = arg15 - arg13;
		@Pc(224) int local224 = arg18 - arg16;
		@Pc(228) int local228 = arg21 - arg19;
		@Pc(237) float local237 = (float) (local220 * arg16 - local224 * arg13);
		@Pc(248) float local248 = (float) (local224 * arg19 - local228 * arg16) * local199;
		@Pc(259) float local259 = (float) (local228 * arg13 - local220 * arg19) / local204;
		@Pc(268) float local268 = (float) (local208 * arg16 - local212 * arg13);
		@Pc(279) float local279 = (float) (local212 * arg19 - local216 * arg16) * local199;
		@Pc(290) float local290 = (float) (local216 * arg13 - local208 * arg19) / local204;
		@Pc(299) float local299 = (float) (local212 * local220 - local208 * local224);
		@Pc(310) float local310 = (float) (local216 * local224 - local212 * local228) * local199;
		@Pc(321) float local321 = (float) (local208 * local228 - local216 * local220) / local204;
		@Pc(422) int local422;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt2450) {
				if (arg1 > this.anInt2450) {
					arg1 = this.anInt2450;
				}
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				arg7 = (arg7 << 16) + local148 - local148 * arg3;
				arg10 = (arg10 << 9) + local180 - local180 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local104 * arg0;
						arg3 -= local74 * arg0;
						arg7 -= local160 * arg0;
						arg10 -= local192 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local89 * arg1;
						arg1 = 0;
					}
					local422 = arg0 - this.anInt2448;
					local237 += local259 * (float) local422;
					local268 += local290 * (float) local422;
					local299 += local321 * (float) local422;
					if (arg0 != arg1 && local104 < local74 || arg0 == arg1 && local104 > local89) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg0, arg5 >> 16, arg4 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
									arg5 += local104;
									arg4 += local89;
									arg7 += local160;
									arg10 += local192;
									arg0 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg0, arg5 >> 16, arg3 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
							arg5 += local104;
							arg3 += local74;
							arg7 += local160;
							arg10 += local192;
							arg0 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg0, arg4 >> 16, arg5 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
									arg5 += local104;
									arg4 += local89;
									arg7 += local160;
									arg10 += local192;
									arg0 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg0, arg3 >> 16, arg5 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
							arg5 += local104;
							arg3 += local74;
							arg7 += local160;
							arg10 += local192;
							arg0 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local104 * arg0;
						arg3 -= local74 * arg0;
						arg7 -= local160 * arg0;
						arg10 -= local192 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local89 * arg2;
						arg2 = 0;
					}
					local422 = arg0 - this.anInt2448;
					local237 += local259 * (float) local422;
					local268 += local290 * (float) local422;
					local299 += local321 * (float) local422;
					if ((arg0 == arg2 || local104 >= local74) && (arg0 != arg2 || local89 <= local74)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg0, arg3 >> 16, arg5 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
									arg5 += local89;
									arg3 += local74;
									arg7 += local160;
									arg10 += local192;
									arg0 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg0, arg3 >> 16, arg4 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
							arg4 += local104;
							arg3 += local74;
							arg7 += local160;
							arg10 += local192;
							arg0 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg0, arg5 >> 16, arg3 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
									arg5 += local89;
									arg3 += local74;
									arg7 += local160;
									arg10 += local192;
									arg0 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg0, arg4 >> 16, arg3 >> 16, arg7, local148, arg6, arg10, local180, local237, local268, local299, local248, local279, local310);
							arg4 += local104;
							arg3 += local74;
							arg7 += local160;
							arg10 += local192;
							arg0 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt2450) {
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				if (arg0 > this.anInt2450) {
					arg0 = this.anInt2450;
				}
				arg8 = (arg8 << 16) + local148 - local148 * arg4;
				arg11 = (arg11 << 9) + local180 - local180 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local74 * arg1;
						arg4 -= local89 * arg1;
						arg8 -= local160 * arg1;
						arg11 -= local192 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local104 * arg2;
						arg2 = 0;
					}
					local422 = arg1 - this.anInt2448;
					local237 += local259 * (float) local422;
					local268 += local290 * (float) local422;
					local299 += local321 * (float) local422;
					if (arg1 != arg2 && local74 < local89 || arg1 == arg2 && local74 > local104) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg1, arg3 >> 16, arg5 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
									arg3 += local74;
									arg5 += local104;
									arg8 += local160;
									arg11 += local192;
									arg1 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg1, arg3 >> 16, arg4 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
							arg3 += local74;
							arg4 += local89;
							arg8 += local160;
							arg11 += local192;
							arg1 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg1, arg5 >> 16, arg3 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
									arg3 += local74;
									arg5 += local104;
									arg8 += local160;
									arg11 += local192;
									arg1 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg1, arg4 >> 16, arg3 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
							arg3 += local74;
							arg4 += local89;
							arg8 += local160;
							arg11 += local192;
							arg1 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local74 * arg1;
						arg4 -= local89 * arg1;
						arg8 -= local160 * arg1;
						arg11 -= local192 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local104 * arg0;
						arg0 = 0;
					}
					local422 = arg1 - this.anInt2448;
					local237 += local259 * (float) local422;
					local268 += local290 * (float) local422;
					local299 += local321 * (float) local422;
					if (local74 < local89) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg1, arg3 >> 16, arg4 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
									arg3 += local104;
									arg4 += local89;
									arg8 += local160;
									arg11 += local192;
									arg1 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg1, arg5 >> 16, arg4 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
							arg5 += local74;
							arg4 += local89;
							arg8 += local160;
							arg11 += local192;
							arg1 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2046(this.anIntArray153, local4, arg1, arg4 >> 16, arg3 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
									arg3 += local104;
									arg4 += local89;
									arg8 += local160;
									arg11 += local192;
									arg1 += this.anInt2452;
									local237 += local259;
									local268 += local290;
									local299 += local321;
								}
							}
							this.method2046(this.anIntArray153, local4, arg1, arg4 >> 16, arg5 >> 16, arg8, local148, arg6, arg11, local180, local237, local268, local299, local248, local279, local310);
							arg5 += local74;
							arg4 += local89;
							arg8 += local160;
							arg11 += local192;
							arg1 += this.anInt2452;
							local237 += local259;
							local268 += local290;
							local299 += local321;
						}
					}
				}
			}
		} else if (arg2 < this.anInt2450) {
			if (arg0 > this.anInt2450) {
				arg0 = this.anInt2450;
			}
			if (arg1 > this.anInt2450) {
				arg1 = this.anInt2450;
			}
			arg9 = (arg9 << 16) + local148 - local148 * arg5;
			arg12 = (arg12 << 9) + local180 - local180 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local89 * arg2;
					arg5 -= local104 * arg2;
					arg9 -= local160 * arg2;
					arg12 -= local192 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local74 * arg0;
					arg0 = 0;
				}
				local422 = arg2 - this.anInt2448;
				local237 += local259 * (float) local422;
				local268 += local290 * (float) local422;
				local299 += local321 * (float) local422;
				if (local89 < local104) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2046(this.anIntArray153, local4, arg2, arg4 >> 16, arg3 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
								arg4 += local89;
								arg3 += local74;
								arg9 += local160;
								arg12 += local192;
								arg2 += this.anInt2452;
								local237 += local259;
								local268 += local290;
								local299 += local321;
							}
						}
						this.method2046(this.anIntArray153, local4, arg2, arg4 >> 16, arg5 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
						arg4 += local89;
						arg5 += local104;
						arg9 += local160;
						arg12 += local192;
						arg2 += this.anInt2452;
						local237 += local259;
						local268 += local290;
						local299 += local321;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2046(this.anIntArray153, local4, arg2, arg3 >> 16, arg4 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
								arg4 += local89;
								arg3 += local74;
								arg9 += local160;
								arg12 += local192;
								arg2 += this.anInt2452;
								local237 += local259;
								local268 += local290;
								local299 += local321;
							}
						}
						this.method2046(this.anIntArray153, local4, arg2, arg5 >> 16, arg4 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
						arg4 += local89;
						arg5 += local104;
						arg9 += local160;
						arg12 += local192;
						arg2 += this.anInt2452;
						local237 += local259;
						local268 += local290;
						local299 += local321;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local89 * arg2;
					arg5 -= local104 * arg2;
					arg9 -= local160 * arg2;
					arg12 -= local192 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local74 * arg1;
					arg1 = 0;
				}
				local422 = arg2 - this.anInt2448;
				local237 += local259 * (float) local422;
				local268 += local290 * (float) local422;
				local299 += local321 * (float) local422;
				if (local89 < local104) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2046(this.anIntArray153, local4, arg2, arg4 >> 16, arg5 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
								arg4 += local74;
								arg5 += local104;
								arg9 += local160;
								arg12 += local192;
								arg2 += this.anInt2452;
								local237 += local259;
								local268 += local290;
								local299 += local321;
							}
						}
						this.method2046(this.anIntArray153, local4, arg2, arg3 >> 16, arg5 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
						arg3 += local89;
						arg5 += local104;
						arg9 += local160;
						arg12 += local192;
						arg2 += this.anInt2452;
						local237 += local259;
						local268 += local290;
						local299 += local321;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2046(this.anIntArray153, local4, arg2, arg5 >> 16, arg4 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
								arg4 += local74;
								arg5 += local104;
								arg9 += local160;
								arg12 += local192;
								arg2 += this.anInt2452;
								local237 += local259;
								local268 += local290;
								local299 += local321;
							}
						}
						this.method2046(this.anIntArray153, local4, arg2, arg5 >> 16, arg3 >> 16, arg9, local148, arg6, arg12, local180, local237, local268, local299, local248, local279, local310);
						arg3 += local89;
						arg5 += local104;
						arg9 += local160;
						arg12 += local192;
						arg2 += this.anInt2452;
						local237 += local259;
						local268 += local290;
						local299 += local321;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V")
	public void method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt2450) {
				if (arg1 > this.anInt2450) {
					arg1 = this.anInt2450;
				}
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += this.anInt2452;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += this.anInt2452;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += this.anInt2452;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += this.anInt2452;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt2450) {
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				if (arg0 > this.anInt2450) {
					arg0 = this.anInt2450;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += this.anInt2452;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += this.anInt2452;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += this.anInt2452;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2042(this.anIntArray153, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += this.anInt2452;
								}
							}
							this.method2042(this.anIntArray153, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += this.anInt2452;
						}
					}
				}
			}
		} else if (arg2 < this.anInt2450) {
			if (arg0 > this.anInt2450) {
				arg0 = this.anInt2450;
			}
			if (arg1 > this.anInt2450) {
				arg1 = this.anInt2450;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2042(this.anIntArray153, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += this.anInt2452;
							}
						}
						this.method2042(this.anIntArray153, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += this.anInt2452;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2042(this.anIntArray153, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += this.anInt2452;
							}
						}
						this.method2042(this.anIntArray153, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += this.anInt2452;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2042(this.anIntArray153, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += this.anInt2452;
							}
						}
						this.method2042(this.anIntArray153, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += this.anInt2452;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2042(this.anIntArray153, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += this.anInt2452;
							}
						}
						this.method2042(this.anIntArray153, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += this.anInt2452;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public void method2050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = this.aClass40_Sub1_4.method1226(arg18);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass40_Sub1_4.method1232(arg18);
			this.method2055(arg0, arg1, arg2, arg3, arg4, arg5, Static361.method2048(local11, arg6), Static361.method2048(local11, arg7), Static361.method2048(local11, arg8));
			return;
		}
		this.aBoolean162 = this.aClass40_Sub1_4.method1225(arg18);
		this.aBoolean163 = this.aClass40_Sub1_4.method1235(arg18);
		local11 = arg4 - arg3;
		@Pc(49) int local49 = arg1 - arg0;
		@Pc(53) int local53 = arg5 - arg3;
		@Pc(57) int local57 = arg2 - arg0;
		@Pc(61) int local61 = arg7 - arg6;
		@Pc(65) int local65 = arg8 - arg6;
		@Pc(67) int local67 = 0;
		if (arg1 != arg0) {
			local67 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(82) int local82 = 0;
		if (arg2 != arg1) {
			local82 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(97) int local97 = 0;
		if (arg2 != arg0) {
			local97 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(118) int local118 = local11 * local57 - local53 * local49;
		if (local118 == 0) {
			return;
		}
		@Pc(133) int local133 = (local61 * local57 - local65 * local49 << 9) / local118;
		@Pc(145) int local145 = (local65 * local11 - local61 * local53 << 9) / local118;
		@Pc(152) float local152 = 1.0F / (float) this.aClass40_Sub1_4.anInt1439;
		@Pc(157) float local157 = (float) this.aClass40_Sub1_4.anInt1417;
		@Pc(161) int local161 = arg9 - arg10;
		@Pc(165) int local165 = arg12 - arg13;
		@Pc(169) int local169 = arg15 - arg16;
		@Pc(173) int local173 = arg11 - arg9;
		@Pc(177) int local177 = arg14 - arg12;
		@Pc(181) int local181 = arg17 - arg15;
		@Pc(190) float local190 = (float) (local173 * arg12 - local177 * arg9);
		@Pc(201) float local201 = (float) (local177 * arg15 - local181 * arg12) * local152;
		@Pc(212) float local212 = (float) (local181 * arg9 - local173 * arg15) / local157;
		@Pc(221) float local221 = (float) (local161 * arg12 - local165 * arg9);
		@Pc(232) float local232 = (float) (local165 * arg15 - local169 * arg12) * local152;
		@Pc(243) float local243 = (float) (local169 * arg9 - local161 * arg15) / local157;
		@Pc(252) float local252 = (float) (local165 * local173 - local161 * local177);
		@Pc(263) float local263 = (float) (local169 * local177 - local165 * local181) * local152;
		@Pc(274) float local274 = (float) (local161 * local181 - local169 * local173) / local157;
		@Pc(359) int local359;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt2450) {
				if (arg1 > this.anInt2450) {
					arg1 = this.anInt2450;
				}
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				arg6 = (arg6 << 9) + local133 - local133 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local97 * arg0;
						arg3 -= local67 * arg0;
						arg6 -= local145 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local82 * arg1;
						arg1 = 0;
					}
					local359 = arg0 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if (arg0 != arg1 && local97 < local67 || arg0 == arg1 && local97 > local82) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local97;
									arg4 += local82;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local97;
									arg4 += local82;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local97 * arg0;
						arg3 -= local67 * arg0;
						arg6 -= local145 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local82 * arg2;
						arg2 = 0;
					}
					local359 = arg0 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if ((arg0 == arg2 || local97 >= local67) && (arg0 != arg2 || local82 <= local67)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local82;
									arg3 += local67;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg4 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local82;
									arg3 += local67;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg4 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt2450) {
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				if (arg0 > this.anInt2450) {
					arg0 = this.anInt2450;
				}
				arg7 = (arg7 << 9) + local133 - local133 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local67 * arg1;
						arg4 -= local82 * arg1;
						arg7 -= local145 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local97 * arg2;
						arg2 = 0;
					}
					local359 = arg1 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if (arg1 != arg2 && local67 < local82 || arg1 == arg2 && local67 > local97) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local67;
									arg5 += local97;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg3 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local67;
									arg5 += local97;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg3 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local67 * arg1;
						arg4 -= local82 * arg1;
						arg7 -= local145 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local97 * arg0;
						arg0 = 0;
					}
					local359 = arg1 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if (local67 < local82) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local97;
									arg4 += local82;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2045(this.anIntArray153, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local97;
									arg4 += local82;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2045(this.anIntArray153, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				}
			}
		} else if (arg2 < this.anInt2450) {
			if (arg0 > this.anInt2450) {
				arg0 = this.anInt2450;
			}
			if (arg1 > this.anInt2450) {
				arg1 = this.anInt2450;
			}
			arg8 = (arg8 << 9) + local133 - local133 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local82 * arg2;
					arg5 -= local97 * arg2;
					arg8 -= local145 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local67 * arg0;
					arg0 = 0;
				}
				local359 = arg2 - this.anInt2448;
				local190 += local212 * (float) local359;
				local221 += local243 * (float) local359;
				local252 += local274 * (float) local359;
				if (local82 < local97) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2045(this.anIntArray153, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local82;
								arg3 += local67;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2045(this.anIntArray153, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg4 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2045(this.anIntArray153, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local82;
								arg3 += local67;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2045(this.anIntArray153, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg4 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local82 * arg2;
					arg5 -= local97 * arg2;
					arg8 -= local145 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local67 * arg1;
					arg1 = 0;
				}
				local359 = arg2 - this.anInt2448;
				local190 += local212 * (float) local359;
				local221 += local243 * (float) local359;
				local252 += local274 * (float) local359;
				if (local82 < local97) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2045(this.anIntArray153, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local67;
								arg5 += local97;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2045(this.anIntArray153, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg3 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2045(this.anIntArray153, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local67;
								arg5 += local97;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2045(this.anIntArray153, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg3 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIIIIII)V")
	private void method2051(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (this.aBoolean160) {
			if (arg3 > this.anInt2451) {
				arg3 = this.anInt2451;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
		}
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2 - 1;
		arg4 += arg5 * arg2;
		@Pc(106) int local106;
		@Pc(111) int local111;
		@Pc(148) int local148;
		@Pc(38) int local38;
		@Pc(53) int local53;
		if (!this.aBoolean161) {
			local38 = arg3 - arg2;
			if (this.anInt2447 == 0) {
				do {
					arg1++;
					arg0[arg1] = Static139.anIntArray247[arg4 >> 8];
					arg4 += arg5;
					local38--;
				} while (local38 > 0);
			} else {
				local106 = this.anInt2447;
				local111 = 256 - this.anInt2447;
				do {
					local53 = Static139.anIntArray247[arg4 >> 8];
					arg4 += arg5;
					@Pc(391) int local391 = ((local53 & 0xFF00FF) * local111 >> 8 & 0xFF00FF) + ((local53 & 0xFF00) * local111 >> 8 & 0xFF00);
					arg1++;
					local148 = arg0[arg1];
					arg0[arg1] = local391 + ((local148 & 0xFF00FF) * local106 >> 8 & 0xFF00FF) + ((local148 & 0xFF00) * local106 >> 8 & 0xFF00);
					local38--;
				} while (local38 > 0);
			}
			return;
		}
		local38 = arg3 - arg2 >> 2;
		@Pc(42) int local42 = arg5 << 2;
		@Pc(59) int local59;
		if (this.anInt2447 == 0) {
			if (local38 > 0) {
				do {
					local53 = Static139.anIntArray247[arg4 >> 8];
					arg4 += local42;
					local59 = arg1 + 1;
					arg0[local59] = local53;
					@Pc(64) int local64 = local59 + 1;
					arg0[local64] = local53;
					@Pc(69) int local69 = local64 + 1;
					arg0[local69] = local53;
					arg1 = local69 + 1;
					arg0[arg1] = local53;
					local38--;
				} while (local38 > 0);
			}
			local38 = arg3 - arg2 & 0x3;
			if (local38 > 0) {
				local53 = Static139.anIntArray247[arg4 >> 8];
				do {
					arg1++;
					arg0[arg1] = local53;
					local38--;
				} while (local38 > 0);
				return;
			}
			return;
		}
		local106 = this.anInt2447;
		local111 = 256 - this.anInt2447;
		if (local38 > 0) {
			do {
				local53 = Static139.anIntArray247[arg4 >> 8];
				arg4 += local42;
				local53 = ((local53 & 0xFF00FF) * local111 >> 8 & 0xFF00FF) + ((local53 & 0xFF00) * local111 >> 8 & 0xFF00);
				local59 = arg1 + 1;
				local148 = arg0[local59];
				arg0[local59] = local53 + ((local148 & 0xFF00FF) * local106 >> 8 & 0xFF00FF) + ((local148 & 0xFF00) * local106 >> 8 & 0xFF00);
				local59++;
				local148 = arg0[local59];
				arg0[local59] = local53 + ((local148 & 0xFF00FF) * local106 >> 8 & 0xFF00FF) + ((local148 & 0xFF00) * local106 >> 8 & 0xFF00);
				local59++;
				local148 = arg0[local59];
				arg0[local59] = local53 + ((local148 & 0xFF00FF) * local106 >> 8 & 0xFF00FF) + ((local148 & 0xFF00) * local106 >> 8 & 0xFF00);
				arg1 = local59 + 1;
				local148 = arg0[arg1];
				arg0[arg1] = local53 + ((local148 & 0xFF00FF) * local106 >> 8 & 0xFF00FF) + ((local148 & 0xFF00) * local106 >> 8 & 0xFF00);
				local38--;
			} while (local38 > 0);
		}
		local38 = arg3 - arg2 & 0x3;
		if (local38 <= 0) {
			return;
		}
		local53 = Static139.anIntArray247[arg4 >> 8];
		local53 = ((local53 & 0xFF00FF) * local111 >> 8 & 0xFF00FF) + ((local53 & 0xFF00) * local111 >> 8 & 0xFF00);
		do {
			arg1++;
			local148 = arg0[arg1];
			arg0[arg1] = local53 + ((local148 & 0xFF00FF) * local106 >> 8 & 0xFF00FF) + ((local148 & 0xFF00) * local106 >> 8 & 0xFF00);
			local38--;
		} while (local38 > 0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2052(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (this.aBoolean160) {
			if (arg3 > this.anInt2451) {
				arg3 = this.anInt2451;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
		}
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		arg4 += arg5 * arg2;
		arg6 += arg7 * arg2;
		arg8 += arg9 * arg2;
		@Pc(156) int local156;
		@Pc(161) int local161;
		@Pc(217) int local217;
		@Pc(48) int local48;
		@Pc(83) int local83;
		if (!this.aBoolean161) {
			local48 = arg3 - arg2;
			if (this.anInt2447 == 0) {
				do {
					arg0[arg1++] = (arg4 & 0xFF00 | 0xFF0000) << 8 | arg6 & 0xFF00 | arg8 >> 8 & 0xFF;
					arg4 += arg5;
					arg6 += arg7;
					arg8 += arg9;
					local48--;
				} while (local48 > 0);
			} else {
				local156 = this.anInt2447;
				local161 = 256 - this.anInt2447;
				do {
					local83 = (arg4 & 0xFF00 | 0xFF0000) << 8 | arg6 & 0xFF00 | arg8 >> 8 & 0xFF;
					arg4 += arg5;
					arg6 += arg7;
					arg8 += arg9;
					@Pc(513) int local513 = ((local83 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local83 & 0xFF00) * local161 >> 8 & 0xFF00);
					local217 = arg0[arg1];
					arg0[arg1++] = local513 + ((local217 & 0xFF00FF) * local156 >> 8 & 0xFF00FF) + ((local217 & 0xFF00) * local156 >> 8 & 0xFF00);
					local48--;
				} while (local48 > 0);
			}
			return;
		}
		local48 = arg3 - arg2 >> 2;
		@Pc(52) int local52 = arg5 << 2;
		@Pc(56) int local56 = arg7 << 2;
		@Pc(60) int local60 = arg9 << 2;
		@Pc(98) int local98;
		if (this.anInt2447 == 0) {
			if (local48 > 0) {
				do {
					local83 = (arg4 & 0xFF00 | 0xFF0000) << 8 | arg6 & 0xFF00 | arg8 >> 8 & 0xFF;
					arg4 += local52;
					arg6 += local56;
					arg8 += local60;
					local98 = arg1 + 1;
					arg0[arg1] = local83;
					@Pc(103) int local103 = local98 + 1;
					arg0[local98] = local83;
					@Pc(108) int local108 = local103 + 1;
					arg0[local103] = local83;
					arg1 = local108 + 1;
					arg0[local108] = local83;
					local48--;
				} while (local48 > 0);
			}
			local48 = arg3 - arg2 & 0x3;
			if (local48 > 0) {
				local83 = (arg4 & 0xFF00 | 0xFF0000) << 8 | arg6 & 0xFF00 | arg8 >> 8 & 0xFF;
				do {
					arg0[arg1++] = local83;
					local48--;
				} while (local48 > 0);
				return;
			}
			return;
		}
		local156 = this.anInt2447;
		local161 = 256 - this.anInt2447;
		if (local48 > 0) {
			do {
				local83 = (arg4 & 0xFF00 | 0xFF0000) << 8 | arg6 & 0xFF00 | arg8 >> 8 & 0xFF;
				arg4 += local52;
				arg6 += local56;
				arg8 += local60;
				local83 = ((local83 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local83 & 0xFF00) * local161 >> 8 & 0xFF00);
				local217 = arg0[arg1];
				local98 = arg1 + 1;
				arg0[arg1] = local83 + ((local217 & 0xFF00FF) * local156 >> 8 & 0xFF00FF) + ((local217 & 0xFF00) * local156 >> 8 & 0xFF00);
				local217 = arg0[local98];
				arg0[local98++] = local83 + ((local217 & 0xFF00FF) * local156 >> 8 & 0xFF00FF) + ((local217 & 0xFF00) * local156 >> 8 & 0xFF00);
				local217 = arg0[local98];
				arg0[local98++] = local83 + ((local217 & 0xFF00FF) * local156 >> 8 & 0xFF00FF) + ((local217 & 0xFF00) * local156 >> 8 & 0xFF00);
				local217 = arg0[local98];
				arg1 = local98 + 1;
				arg0[local98] = local83 + ((local217 & 0xFF00FF) * local156 >> 8 & 0xFF00FF) + ((local217 & 0xFF00) * local156 >> 8 & 0xFF00);
				local48--;
			} while (local48 > 0);
		}
		local48 = arg3 - arg2 & 0x3;
		if (local48 <= 0) {
			return;
		}
		local83 = (arg4 & 0xFF00 | 0xFF0000) << 8 | arg6 & 0xFF00 | arg8 >> 8 & 0xFF;
		local83 = ((local83 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local83 & 0xFF00) * local161 >> 8 & 0xFF00);
		do {
			local217 = arg0[arg1];
			arg0[arg1++] = local83 + ((local217 & 0xFF00FF) * local156 >> 8 & 0xFF00FF) + ((local217 & 0xFF00) * local156 >> 8 & 0xFF00);
			local48--;
		} while (local48 > 0);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "([I[IIIIIIIIFFFFFF)V")
	private void method2053(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12) {
		if (this.aBoolean160) {
			if (arg4 > this.anInt2451) {
				arg4 = this.anInt2451;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		@Pc(31) int local31 = arg4 - arg3;
		@Pc(159) int local159;
		@Pc(147) int local147;
		@Pc(80) int local80;
		@Pc(87) int local87;
		@Pc(115) int local115;
		@Pc(122) int local122;
		@Pc(42) int local42;
		@Pc(133) int local133;
		@Pc(177) int local177;
		@Pc(155) int local155;
		@Pc(51) float local51;
		@Pc(60) float local60;
		@Pc(69) float local69;
		@Pc(174) int local174;
		if (this.anInt2447 == 0) {
			if (this.aBoolean162) {
				local42 = arg3 - this.anInt2449;
				local51 = arg7 + arg10 / 8.0F * (float) local42;
				local60 = arg8 + arg11 / 8.0F * (float) local42;
				local69 = arg9 + arg12 / 8.0F * (float) local42;
				if (local69 == 0.0F) {
					local80 = 0;
					local87 = 0;
				} else {
					local80 = (int) (local51 * 4096.0F / local69);
					local87 = (int) (local60 * 4096.0F / local69);
				}
				arg7 = local51 + arg10;
				arg8 = local60 + arg11;
				arg9 = local69 + arg12;
				if (arg9 == 0.0F) {
					local115 = 0;
					local122 = 0;
				} else {
					local115 = (int) (arg7 * 4096.0F / arg9);
					local122 = (int) (arg8 * 4096.0F / arg9);
				}
				local133 = (local80 << 20) + local87;
				local147 = (local115 - local80 >> 3 << 20) + (local122 - local87 >> 3);
				local31 >>= 0x3;
				local155 = arg6 << 3;
				local159 = arg5 >> 8;
				if (this.aBoolean163) {
					if (local31 > 0) {
						do {
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							local177 = arg2 + 1;
							arg0[arg2] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg0[local177++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg0[local177++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg0[local177++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg0[local177++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg0[local177++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg0[local177++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg2 = local177 + 1;
							arg0[local177] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local80 = local115;
							local87 = local122;
							arg7 += arg10;
							arg8 += arg11;
							arg9 += arg12;
							if (arg9 == 0.0F) {
								local115 = 0;
								local122 = 0;
							} else {
								local115 = (int) (arg7 * 4096.0F / arg9);
								local122 = (int) (arg8 * 4096.0F / arg9);
							}
							local133 = (local80 << 20) + local87;
							local147 = (local115 - local80 >> 3 << 20) + (local122 - local87 >> 3);
							arg5 += local155;
							local159 = arg5 >> 8;
							local31--;
						} while (local31 > 0);
					}
					local31 = arg4 - arg3 & 0x7;
					if (local31 > 0) {
						do {
							local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
							arg0[arg2++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
							local133 += local147;
							local31--;
						} while (local31 > 0);
						return;
					}
					return;
				}
				if (local31 > 0) {
					do {
						@Pc(574) int local574;
						if ((local574 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[arg2] = ((local574 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local574 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						local177 = arg2 + 1;
						local133 += local147;
						@Pc(611) int local611;
						if ((local611 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[local177] = ((local611 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local611 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(648) int local648;
						if ((local648 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[local177] = ((local648 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local648 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(685) int local685;
						if ((local685 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[local177] = ((local685 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local685 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(722) int local722;
						if ((local722 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[local177] = ((local722 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local722 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(759) int local759;
						if ((local759 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[local177] = ((local759 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local759 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(796) int local796;
						if ((local796 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[local177] = ((local796 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local796 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(833) int local833;
						if ((local833 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[local177] = ((local833 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local833 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						arg2 = local177 + 1;
						local80 = local115;
						local87 = local122;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						if (arg9 == 0.0F) {
							local115 = 0;
							local122 = 0;
						} else {
							local115 = (int) (arg7 * 4096.0F / arg9);
							local122 = (int) (arg8 * 4096.0F / arg9);
						}
						local133 = (local80 << 20) + local87;
						local147 = (local115 - local80 >> 3 << 20) + (local122 - local87 >> 3);
						arg5 += local155;
						local159 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						@Pc(948) int local948;
						if ((local948 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
							arg0[arg2] = ((local948 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local948 & 0xFF00) * local159 & 0xFF0000) >> 8;
						}
						arg2++;
						local133 += local147;
						local31--;
					} while (local31 > 0);
					return;
				}
				return;
			}
			local42 = arg3 - this.anInt2449;
			local51 = arg7 + arg10 / 8.0F * (float) local42;
			local60 = arg8 + arg11 / 8.0F * (float) local42;
			local69 = arg9 + arg12 / 8.0F * (float) local42;
			if (local69 == 0.0F) {
				local80 = 0;
				local87 = 0;
			} else {
				local80 = (int) (local51 * 16384.0F / local69);
				local87 = (int) (local60 * 16384.0F / local69);
			}
			arg7 = local51 + arg10;
			arg8 = local60 + arg11;
			arg9 = local69 + arg12;
			if (arg9 == 0.0F) {
				local115 = 0;
				local122 = 0;
			} else {
				local115 = (int) (arg7 * 16384.0F / arg9);
				local122 = (int) (arg8 * 16384.0F / arg9);
			}
			local133 = (local80 << 18) + local87;
			local147 = (local115 - local80 >> 3 << 18) + (local122 - local87 >> 3);
			local31 >>= 0x3;
			local155 = arg6 << 3;
			local159 = arg5 >> 8;
			if (this.aBoolean163) {
				if (local31 > 0) {
					do {
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local177 = arg2 + 1;
						arg0[arg2] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						@Pc(1150) int local1150 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg0[local177++] = ((local1150 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1150 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						@Pc(1185) int local1185 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg0[local177++] = ((local1185 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1185 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						@Pc(1220) int local1220 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg0[local177++] = ((local1220 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1220 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						@Pc(1255) int local1255 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg0[local177++] = ((local1255 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1255 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						@Pc(1290) int local1290 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg0[local177++] = ((local1290 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1290 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						@Pc(1325) int local1325 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg0[local177++] = ((local1325 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1325 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						@Pc(1360) int local1360 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg2 = local177 + 1;
						arg0[local177] = ((local1360 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1360 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local80 = local115;
						local87 = local122;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						if (arg9 == 0.0F) {
							local115 = 0;
							local122 = 0;
						} else {
							local115 = (int) (arg7 * 16384.0F / arg9);
							local122 = (int) (arg8 * 16384.0F / arg9);
						}
						local133 = (local80 << 18) + local87;
						local147 = (local115 - local80 >> 3 << 18) + (local122 - local87 >> 3);
						arg5 += local155;
						local159 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						arg0[arg2++] = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local133 += local147;
						local31--;
					} while (local31 > 0);
					return;
				}
				return;
			}
			if (local31 > 0) {
				do {
					@Pc(1515) int local1515;
					if ((local1515 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[arg2] = ((local1515 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1515 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					local177 = arg2 + 1;
					local133 += local147;
					@Pc(1552) int local1552;
					if ((local1552 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[local177] = ((local1552 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1552 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					local177++;
					local133 += local147;
					@Pc(1589) int local1589;
					if ((local1589 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[local177] = ((local1589 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1589 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					local177++;
					local133 += local147;
					@Pc(1626) int local1626;
					if ((local1626 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[local177] = ((local1626 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1626 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					local177++;
					local133 += local147;
					@Pc(1663) int local1663;
					if ((local1663 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[local177] = ((local1663 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1663 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					local177++;
					local133 += local147;
					@Pc(1700) int local1700;
					if ((local1700 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[local177] = ((local1700 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1700 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					local177++;
					local133 += local147;
					@Pc(1737) int local1737;
					if ((local1737 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[local177] = ((local1737 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1737 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					local177++;
					local133 += local147;
					@Pc(1774) int local1774;
					if ((local1774 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[local177] = ((local1774 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1774 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					arg2 = local177 + 1;
					local80 = local115;
					local87 = local122;
					arg7 += arg10;
					arg8 += arg11;
					arg9 += arg12;
					if (arg9 == 0.0F) {
						local115 = 0;
						local122 = 0;
					} else {
						local115 = (int) (arg7 / arg9 * 16384.0F);
						local122 = (int) (arg8 / arg9 * 16384.0F);
					}
					local133 = (local80 << 18) + local87;
					local147 = (local115 - local80 >> 3 << 18) + (local122 - local87 >> 3);
					arg5 += local155;
					local159 = arg5 >> 8;
					local31--;
				} while (local31 > 0);
			}
			local31 = arg4 - arg3 & 0x7;
			if (local31 > 0) {
				do {
					@Pc(1889) int local1889;
					if ((local1889 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
						arg0[arg2] = ((local1889 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local1889 & 0xFF00) * local159 & 0xFF0000) >> 8;
					}
					arg2++;
					local133 += local147;
					local31--;
				} while (local31 > 0);
				return;
			}
			return;
		}
		local80 = this.anInt2447;
		local87 = 256 - this.anInt2447;
		@Pc(2015) int local2015;
		@Pc(2061) int local2061;
		@Pc(1935) int local1935;
		if (!this.aBoolean162) {
			local1935 = arg3 - this.anInt2449;
			local51 = arg7 + arg10 / 8.0F * (float) local1935;
			local60 = arg8 + arg11 / 8.0F * (float) local1935;
			local69 = arg9 + arg12 / 8.0F * (float) local1935;
			if (local69 == 0.0F) {
				local115 = 0;
				local122 = 0;
			} else {
				local115 = (int) (local51 * 16384.0F / local69);
				local122 = (int) (local60 * 16384.0F / local69);
			}
			arg7 = local51 + arg10;
			arg8 = local60 + arg11;
			arg9 = local69 + arg12;
			if (arg9 == 0.0F) {
				local42 = 0;
				local2015 = 0;
			} else {
				local42 = (int) (arg7 * 16384.0F / arg9);
				local2015 = (int) (arg8 * 16384.0F / arg9);
			}
			local133 = (local115 << 18) + local122;
			local147 = (local42 - local115 >> 3 << 18) + (local2015 - local122 >> 3);
			local31 >>= 0x3;
			local155 = arg6 << 3;
			local159 = arg5 >> 8;
			if (this.aBoolean163) {
				if (local31 > 0) {
					do {
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[arg2];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						local177 = arg2 + 1;
						arg0[arg2] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[local177];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[local177];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[local177];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[local177];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[local177];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[local177];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[local177];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg2 = local177 + 1;
						arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local115 = local42;
						local122 = local2015;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						if (arg9 == 0.0F) {
							local42 = 0;
							local2015 = 0;
						} else {
							local42 = (int) (arg7 * 16384.0F / arg9);
							local2015 = (int) (arg8 * 16384.0F / arg9);
						}
						local133 = (local115 << 18) + local122;
						local147 = (local42 - local115 >> 3 << 18) + (local2015 - local122 >> 3);
						arg5 += local155;
						local159 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						local174 = arg1[(local133 & 0x3F80) + (local133 >>> 25)];
						local2061 = arg0[arg2];
						local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
						arg0[arg2++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						local133 += local147;
						local31--;
					} while (local31 > 0);
					return;
				}
			} else {
				if (local31 > 0) {
					do {
						@Pc(4326) int local4326;
						if ((local4326 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[arg2];
							local174 = ((local4326 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4326 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[arg2] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						local177 = arg2 + 1;
						local133 += local147;
						@Pc(4397) int local4397;
						if ((local4397 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[local177];
							local174 = ((local4397 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4397 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(4468) int local4468;
						if ((local4468 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[local177];
							local174 = ((local4468 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4468 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(4539) int local4539;
						if ((local4539 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[local177];
							local174 = ((local4539 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4539 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(4610) int local4610;
						if ((local4610 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[local177];
							local174 = ((local4610 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4610 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(4681) int local4681;
						if ((local4681 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[local177];
							local174 = ((local4681 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4681 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(4752) int local4752;
						if ((local4752 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[local177];
							local174 = ((local4752 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4752 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						local177++;
						local133 += local147;
						@Pc(4823) int local4823;
						if ((local4823 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[local177];
							local174 = ((local4823 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4823 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						arg2 = local177 + 1;
						local115 = local42;
						local122 = local2015;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						if (arg9 == 0.0F) {
							local42 = 0;
							local2015 = 0;
						} else {
							local42 = (int) (arg7 * 16384.0F / arg9);
							local2015 = (int) (arg8 * 16384.0F / arg9);
						}
						local133 = (local115 << 18) + local122;
						local147 = (local42 - local115 >> 3 << 18) + (local2015 - local122 >> 3);
						arg5 += local155;
						local159 = arg5 >> 8;
						local31--;
					} while (local31 > 0);
				}
				local31 = arg4 - arg3 & 0x7;
				if (local31 > 0) {
					do {
						@Pc(4972) int local4972;
						if ((local4972 = arg1[(local133 & 0x3F80) + (local133 >>> 25)]) != 0) {
							local2061 = arg0[arg2];
							local174 = ((local4972 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local4972 & 0xFF00) * local159 & 0xFF0000) >> 8;
							arg0[arg2] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
						}
						arg2++;
						local133 += local147;
						local31--;
					} while (local31 > 0);
				}
			}
			return;
		}
		local1935 = arg3 - this.anInt2449;
		local51 = arg7 + arg10 / 8.0F * (float) local1935;
		local60 = arg8 + arg11 / 8.0F * (float) local1935;
		local69 = arg9 + arg12 / 8.0F * (float) local1935;
		if (local69 == 0.0F) {
			local115 = 0;
			local122 = 0;
		} else {
			local115 = (int) (local51 * 4096.0F / local69);
			local122 = (int) (local60 * 4096.0F / local69);
		}
		arg7 = local51 + arg10;
		arg8 = local60 + arg11;
		arg9 = local69 + arg12;
		if (arg9 == 0.0F) {
			local42 = 0;
			local2015 = 0;
		} else {
			local42 = (int) (arg7 * 4096.0F / arg9);
			local2015 = (int) (arg8 * 4096.0F / arg9);
		}
		local133 = (local115 << 20) + local122;
		local147 = (local42 - local115 >> 3 << 20) + (local2015 - local122 >> 3);
		local31 >>= 0x3;
		local155 = arg6 << 3;
		local159 = arg5 >> 8;
		if (this.aBoolean163) {
			if (local31 > 0) {
				do {
					local2061 = arg0[arg2];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					local177 = arg2 + 1;
					arg0[arg2] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local2061 = arg0[local177];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local2061 = arg0[local177];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local2061 = arg0[local177];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local2061 = arg0[local177];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local2061 = arg0[local177];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local2061 = arg0[local177];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local2061 = arg0[local177];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg2 = local177 + 1;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local115 = local42;
					local122 = local2015;
					arg7 += arg10;
					arg8 += arg11;
					arg9 += arg12;
					if (arg9 == 0.0F) {
						local42 = 0;
						local2015 = 0;
					} else {
						local42 = (int) (arg7 * 4096.0F / arg9);
						local2015 = (int) (arg8 * 4096.0F / arg9);
					}
					local133 = (local115 << 20) + local122;
					local147 = (local42 - local115 >> 3 << 20) + (local2015 - local122 >> 3);
					arg5 += local155;
					local159 = arg5 >> 8;
					local31--;
				} while (local31 > 0);
			}
			local31 = arg4 - arg3 & 0x7;
			if (local31 > 0) {
				do {
					local2061 = arg0[arg2];
					local174 = arg1[(local133 & 0xFC0) + (local133 >>> 26)];
					local174 = ((local174 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local174 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[arg2++] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
					local133 += local147;
					local31--;
				} while (local31 > 0);
				return;
			}
			return;
		}
		if (local31 > 0) {
			do {
				@Pc(2773) int local2773;
				if ((local2773 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[arg2];
					local174 = ((local2773 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local2773 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[arg2] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				local177 = arg2 + 1;
				local133 += local147;
				@Pc(2844) int local2844;
				if ((local2844 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[local177];
					local174 = ((local2844 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local2844 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				local177++;
				local133 += local147;
				@Pc(2915) int local2915;
				if ((local2915 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[local177];
					local174 = ((local2915 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local2915 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				local177++;
				local133 += local147;
				@Pc(2986) int local2986;
				if ((local2986 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[local177];
					local174 = ((local2986 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local2986 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				local177++;
				local133 += local147;
				@Pc(3057) int local3057;
				if ((local3057 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[local177];
					local174 = ((local3057 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local3057 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				local177++;
				local133 += local147;
				@Pc(3128) int local3128;
				if ((local3128 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[local177];
					local174 = ((local3128 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local3128 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				local177++;
				local133 += local147;
				@Pc(3199) int local3199;
				if ((local3199 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[local177];
					local174 = ((local3199 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local3199 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				local177++;
				local133 += local147;
				@Pc(3270) int local3270;
				if ((local3270 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
					local2061 = arg0[local177];
					local174 = ((local3270 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local3270 & 0xFF00) * local159 & 0xFF0000) >> 8;
					arg0[local177] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
				}
				arg2 = local177 + 1;
				local115 = local42;
				local122 = local2015;
				arg7 += arg10;
				arg8 += arg11;
				arg9 += arg12;
				if (arg9 == 0.0F) {
					local42 = 0;
					local2015 = 0;
				} else {
					local42 = (int) (arg7 * 4096.0F / arg9);
					local2015 = (int) (arg8 * 4096.0F / arg9);
				}
				local133 = (local115 << 20) + local122;
				local147 = (local42 - local115 >> 3 << 20) + (local2015 - local122 >> 3);
				arg5 += local155;
				local159 = arg5 >> 8;
				local31--;
			} while (local31 > 0);
		}
		local31 = arg4 - arg3 & 0x7;
		if (local31 <= 0) {
			return;
		}
		do {
			@Pc(3419) int local3419;
			if ((local3419 = arg1[(local133 & 0xFC0) + (local133 >>> 26)]) != 0) {
				local2061 = arg0[arg2];
				local174 = ((local3419 & 0xFF00FF) * local159 & 0xFF00FF00) + ((local3419 & 0xFF00) * local159 & 0xFF0000) >> 8;
				arg0[arg2] = ((local2061 & 0xFF00FF) * local80 + (local174 & 0xFF00FF) * local87 & 0xFF00FF00) + ((local2061 & 0xFF00) * local80 + (local174 & 0xFF00) * local87 & 0xFF0000) >> 8;
			}
			arg2++;
			local133 += local147;
			local31--;
		} while (local31 > 0);
		return;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public void method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(4) int[] local4 = this.aClass40_Sub1_4.method1226(arg18);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass40_Sub1_4.method1232(arg18);
			this.method2055(arg0, arg1, arg2, arg3, arg4, arg5, Static361.method2048(local11, arg6), Static361.method2048(local11, arg7), Static361.method2048(local11, arg8));
			return;
		}
		this.aBoolean162 = this.aClass40_Sub1_4.method1225(arg18);
		this.aBoolean163 = this.aClass40_Sub1_4.method1235(arg18);
		local11 = arg4 - arg3;
		@Pc(49) int local49 = arg1 - arg0;
		@Pc(53) int local53 = arg5 - arg3;
		@Pc(57) int local57 = arg2 - arg0;
		@Pc(61) int local61 = arg7 - arg6;
		@Pc(65) int local65 = arg8 - arg6;
		@Pc(67) int local67 = 0;
		if (arg1 != arg0) {
			local67 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(82) int local82 = 0;
		if (arg2 != arg1) {
			local82 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(97) int local97 = 0;
		if (arg2 != arg0) {
			local97 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(118) int local118 = local11 * local57 - local53 * local49;
		if (local118 == 0) {
			return;
		}
		@Pc(133) int local133 = (local61 * local57 - local65 * local49 << 9) / local118;
		@Pc(145) int local145 = (local65 * local11 - local61 * local53 << 9) / local118;
		@Pc(152) float local152 = 8.0F / (float) this.aClass40_Sub1_4.anInt1439;
		@Pc(157) float local157 = (float) this.aClass40_Sub1_4.anInt1417;
		@Pc(161) int local161 = arg9 - arg10;
		@Pc(165) int local165 = arg12 - arg13;
		@Pc(169) int local169 = arg15 - arg16;
		@Pc(173) int local173 = arg11 - arg9;
		@Pc(177) int local177 = arg14 - arg12;
		@Pc(181) int local181 = arg17 - arg15;
		@Pc(190) float local190 = (float) (local173 * arg12 - local177 * arg9);
		@Pc(201) float local201 = (float) (local177 * arg15 - local181 * arg12) * local152;
		@Pc(212) float local212 = (float) (local181 * arg9 - local173 * arg15) / local157;
		@Pc(221) float local221 = (float) (local161 * arg12 - local165 * arg9);
		@Pc(232) float local232 = (float) (local165 * arg15 - local169 * arg12) * local152;
		@Pc(243) float local243 = (float) (local169 * arg9 - local161 * arg15) / local157;
		@Pc(252) float local252 = (float) (local165 * local173 - local161 * local177);
		@Pc(263) float local263 = (float) (local169 * local177 - local165 * local181) * local152;
		@Pc(274) float local274 = (float) (local161 * local181 - local169 * local173) / local157;
		@Pc(359) int local359;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt2450) {
				if (arg1 > this.anInt2450) {
					arg1 = this.anInt2450;
				}
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				arg6 = (arg6 << 9) + local133 - local133 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local97 * arg0;
						arg3 -= local67 * arg0;
						arg6 -= local145 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local82 * arg1;
						arg1 = 0;
					}
					local359 = arg0 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if (arg0 != arg1 && local97 < local67 || arg0 == arg1 && local97 > local82) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local97;
									arg4 += local82;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local97;
									arg4 += local82;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local97 * arg0;
						arg3 -= local67 * arg0;
						arg6 -= local145 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local82 * arg2;
						arg2 = 0;
					}
					local359 = arg0 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if ((arg0 == arg2 || local97 >= local67) && (arg0 != arg2 || local82 <= local67)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local82;
									arg3 += local67;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg4 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
									arg5 += local82;
									arg3 += local67;
									arg6 += local145;
									arg0 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local133, local190, local221, local252, local201, local232, local263);
							arg4 += local97;
							arg3 += local67;
							arg6 += local145;
							arg0 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt2450) {
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				if (arg0 > this.anInt2450) {
					arg0 = this.anInt2450;
				}
				arg7 = (arg7 << 9) + local133 - local133 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local67 * arg1;
						arg4 -= local82 * arg1;
						arg7 -= local145 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local97 * arg2;
						arg2 = 0;
					}
					local359 = arg1 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if (arg1 != arg2 && local67 < local82 || arg1 == arg2 && local67 > local97) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local67;
									arg5 += local97;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg3 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local67;
									arg5 += local97;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg3 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local67 * arg1;
						arg4 -= local82 * arg1;
						arg7 -= local145 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local97 * arg0;
						arg0 = 0;
					}
					local359 = arg1 - this.anInt2448;
					local190 += local212 * (float) local359;
					local221 += local243 * (float) local359;
					local252 += local274 * (float) local359;
					if (local67 < local82) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local97;
									arg4 += local82;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2053(this.anIntArray153, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
									arg3 += local97;
									arg4 += local82;
									arg7 += local145;
									arg1 += this.anInt2452;
									local190 += local212;
									local221 += local243;
									local252 += local274;
								}
							}
							this.method2053(this.anIntArray153, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local133, local190, local221, local252, local201, local232, local263);
							arg5 += local67;
							arg4 += local82;
							arg7 += local145;
							arg1 += this.anInt2452;
							local190 += local212;
							local221 += local243;
							local252 += local274;
						}
					}
				}
			}
		} else if (arg2 < this.anInt2450) {
			if (arg0 > this.anInt2450) {
				arg0 = this.anInt2450;
			}
			if (arg1 > this.anInt2450) {
				arg1 = this.anInt2450;
			}
			arg8 = (arg8 << 9) + local133 - local133 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local82 * arg2;
					arg5 -= local97 * arg2;
					arg8 -= local145 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local67 * arg0;
					arg0 = 0;
				}
				local359 = arg2 - this.anInt2448;
				local190 += local212 * (float) local359;
				local221 += local243 * (float) local359;
				local252 += local274 * (float) local359;
				if (local82 < local97) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2053(this.anIntArray153, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local82;
								arg3 += local67;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2053(this.anIntArray153, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg4 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2053(this.anIntArray153, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local82;
								arg3 += local67;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2053(this.anIntArray153, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg4 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local82 * arg2;
					arg5 -= local97 * arg2;
					arg8 -= local145 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local67 * arg1;
					arg1 = 0;
				}
				local359 = arg2 - this.anInt2448;
				local190 += local212 * (float) local359;
				local221 += local243 * (float) local359;
				local252 += local274 * (float) local359;
				if (local82 < local97) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2053(this.anIntArray153, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local67;
								arg5 += local97;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2053(this.anIntArray153, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg3 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2053(this.anIntArray153, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
								arg4 += local67;
								arg5 += local97;
								arg8 += local145;
								arg2 += this.anInt2452;
								local190 += local212;
								local221 += local243;
								local252 += local274;
							}
						}
						this.method2053(this.anIntArray153, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local133, local190, local221, local252, local201, local232, local263);
						arg3 += local82;
						arg5 += local97;
						arg8 += local145;
						arg2 += this.anInt2452;
						local190 += local212;
						local221 += local243;
						local252 += local274;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(36) int local36;
		if (arg2 == arg1) {
			local36 = 0;
		} else {
			local36 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(48) int local48;
		if (arg1 == arg0) {
			local48 = 0;
		} else {
			local48 = (local3 << 16) / local7;
		}
		@Pc(60) int local60;
		if (arg2 == arg0) {
			local60 = 0;
		} else {
			local60 = (local11 << 16) / local15;
		}
		@Pc(71) int local71 = local3 * local15 - local11 * local7;
		if (local71 == 0) {
			return;
		}
		@Pc(86) int local86 = (local19 * local15 - local23 * local7 << 8) / local71;
		@Pc(98) int local98 = (local23 * local3 - local19 * local11 << 8) / local71;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt2450) {
				if (arg1 > this.anInt2450) {
					arg1 = this.anInt2450;
				}
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				arg6 = (arg6 << 8) + local86 - local86 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local36 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local60 < local48 || arg0 == arg1 && local60 > local36) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg0, arg5 >> 16, arg4 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += this.anInt2452;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg0, arg4 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += this.anInt2452;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local36 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local60 < local48 || arg0 == arg2 && local36 > local48) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg0, arg4 >> 16, arg3 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += this.anInt2452;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg0, arg3 >> 16, arg4 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += this.anInt2452;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt2450) {
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				if (arg0 > this.anInt2450) {
					arg0 = this.anInt2450;
				}
				arg7 = (arg7 << 8) + local86 - local86 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local60 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local48 >= local36) && (arg1 != arg2 || local48 <= local60)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg1, arg5 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += this.anInt2452;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg1, arg3 >> 16, arg5 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += this.anInt2452;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local60 * arg0;
						arg0 = 0;
					}
					if (local48 < local36) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg1, arg5 >> 16, arg4 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += this.anInt2452;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2051(this.anIntArray153, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += this.anInt2452;
								}
							}
							this.method2051(this.anIntArray153, arg1, arg4 >> 16, arg5 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += this.anInt2452;
						}
					}
				}
			}
		} else if (arg2 < this.anInt2450) {
			if (arg0 > this.anInt2450) {
				arg0 = this.anInt2450;
			}
			if (arg1 > this.anInt2450) {
				arg1 = this.anInt2450;
			}
			arg8 = (arg8 << 8) + local86 - local86 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local48 * arg0;
					arg0 = 0;
				}
				if (local36 < local60) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2051(this.anIntArray153, arg2, arg4 >> 16, arg3 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += this.anInt2452;
							}
						}
						this.method2051(this.anIntArray153, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += this.anInt2452;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2051(this.anIntArray153, arg2, arg3 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += this.anInt2452;
							}
						}
						this.method2051(this.anIntArray153, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += this.anInt2452;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local48 * arg1;
					arg1 = 0;
				}
				if (local36 < local60) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2051(this.anIntArray153, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += this.anInt2452;
							}
						}
						this.method2051(this.anIntArray153, arg2, arg3 >> 16, arg5 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += this.anInt2452;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2051(this.anIntArray153, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += this.anInt2452;
							}
						}
						this.method2051(this.anIntArray153, arg2, arg5 >> 16, arg3 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += this.anInt2452;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIIIIIIII)V")
	public void method2056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(25) int local25 = (arg7 & 0xFF0000) - (arg6 & 0xFF0000) >> 8;
		@Pc(35) int local35 = (arg8 & 0xFF0000) - (arg6 & 0xFF0000) >> 8;
		@Pc(43) int local43 = (arg7 & 0xFF00) - (arg6 & 0xFF00);
		@Pc(51) int local51 = (arg8 & 0xFF00) - (arg6 & 0xFF00);
		@Pc(59) int local59 = (arg7 & 0xFF) - (arg6 & 0xFF);
		@Pc(67) int local67 = (arg8 & 0xFF) - (arg6 & 0xFF);
		@Pc(80) int local80;
		if (arg2 == arg1) {
			local80 = 0;
		} else {
			local80 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(92) int local92;
		if (arg1 == arg0) {
			local92 = 0;
		} else {
			local92 = (local3 << 16) / local7;
		}
		@Pc(104) int local104;
		if (arg2 == arg0) {
			local104 = 0;
		} else {
			local104 = (local11 << 16) / local15;
		}
		@Pc(115) int local115 = local3 * local15 - local11 * local7;
		if (local115 == 0) {
			return;
		}
		@Pc(128) int local128 = (local25 * local15 - local35 * local7) / local115;
		@Pc(138) int local138 = (local35 * local3 - local25 * local11) / local115;
		@Pc(148) int local148 = (local43 * local15 - local51 * local7) / local115;
		@Pc(158) int local158 = (local51 * local3 - local43 * local11) / local115;
		@Pc(170) int local170 = (local59 * local15 - local67 * local7 << 8) / local115;
		@Pc(182) int local182 = (local67 * local3 - local59 * local11 << 8) / local115;
		@Pc(219) int local219;
		@Pc(229) int local229;
		@Pc(241) int local241;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt2450) {
				if (arg1 > this.anInt2450) {
					arg1 = this.anInt2450;
				}
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				local219 = (arg6 >> 8 & 0xFF00) + local128 - local128 * arg3;
				local229 = (arg6 & 0xFF00) + local148 - local148 * arg3;
				local241 = ((arg6 & 0xFF) << 8) + local170 - local170 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local104 * arg0;
						arg3 -= local92 * arg0;
						local219 -= local138 * arg0;
						local229 -= local158 * arg0;
						local241 -= local182 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local80 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local104 < local92 || arg0 == arg1 && local104 > local80) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg0, arg5 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
									arg5 += local104;
									arg4 += local80;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg0 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg0, arg5 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
							arg5 += local104;
							arg3 += local92;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg0 += this.anInt2452;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg0, arg4 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
									arg5 += local104;
									arg4 += local80;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg0 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg0, arg3 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
							arg5 += local104;
							arg3 += local92;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg0 += this.anInt2452;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local104 * arg0;
						arg3 -= local92 * arg0;
						local219 -= local138 * arg0;
						local229 -= local158 * arg0;
						local241 -= local182 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local80 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local104 < local92 || arg0 == arg2 && local80 > local92) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg0, arg5 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
									arg5 += local80;
									arg3 += local92;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg0 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg0, arg4 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
							arg4 += local104;
							arg3 += local92;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg0 += this.anInt2452;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray154[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg0, arg3 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
									arg5 += local80;
									arg3 += local92;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg0 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg0, arg3 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
							arg4 += local104;
							arg3 += local92;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg0 += this.anInt2452;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt2450) {
				if (arg2 > this.anInt2450) {
					arg2 = this.anInt2450;
				}
				if (arg0 > this.anInt2450) {
					arg0 = this.anInt2450;
				}
				local219 = (arg7 >> 8 & 0xFF00) + local128 - local128 * arg4;
				local229 = (arg7 & 0xFF00) + local148 - local148 * arg4;
				local241 = ((arg7 & 0xFF) << 8) + local170 - local170 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local92 * arg1;
						arg4 -= local80 * arg1;
						local219 -= local138 * arg1;
						local229 -= local158 * arg1;
						local241 -= local182 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local104 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local92 >= local80) && (arg1 != arg2 || local92 <= local104)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg1, arg5 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
									arg3 += local92;
									arg5 += local104;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg1 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg1, arg4 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
							arg3 += local92;
							arg4 += local80;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg1 += this.anInt2452;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg1, arg3 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
									arg3 += local92;
									arg5 += local104;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg1 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg1, arg3 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
							arg3 += local92;
							arg4 += local80;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg1 += this.anInt2452;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local92 * arg1;
						arg4 -= local80 * arg1;
						local219 -= local138 * arg1;
						local229 -= local158 * arg1;
						local241 -= local182 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local104 * arg0;
						arg0 = 0;
					}
					if (local92 < local80) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg1, arg3 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
									arg3 += local104;
									arg4 += local80;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg1 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg1, arg5 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
							arg5 += local92;
							arg4 += local80;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg1 += this.anInt2452;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray154[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2052(this.anIntArray153, arg1, arg4 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
									arg3 += local104;
									arg4 += local80;
									local219 += local138;
									local229 += local158;
									local241 += local182;
									arg1 += this.anInt2452;
								}
							}
							this.method2052(this.anIntArray153, arg1, arg4 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
							arg5 += local92;
							arg4 += local80;
							local219 += local138;
							local229 += local158;
							local241 += local182;
							arg1 += this.anInt2452;
						}
					}
				}
			}
		} else if (arg2 < this.anInt2450) {
			if (arg0 > this.anInt2450) {
				arg0 = this.anInt2450;
			}
			if (arg1 > this.anInt2450) {
				arg1 = this.anInt2450;
			}
			local219 = (arg8 >> 8 & 0xFF00) + local128 - local128 * arg5;
			local229 = (arg8 & 0xFF00) + local148 - local148 * arg5;
			local241 = ((arg8 & 0xFF) << 8) + local170 - local170 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local80 * arg2;
					arg5 -= local104 * arg2;
					local219 -= local138 * arg2;
					local229 -= local158 * arg2;
					local241 -= local182 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local92 * arg0;
					arg0 = 0;
				}
				if (local80 < local104) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2052(this.anIntArray153, arg2, arg4 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
								arg4 += local80;
								arg3 += local92;
								local219 += local138;
								local229 += local158;
								local241 += local182;
								arg2 += this.anInt2452;
							}
						}
						this.method2052(this.anIntArray153, arg2, arg4 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
						arg4 += local80;
						arg5 += local104;
						local219 += local138;
						local229 += local158;
						local241 += local182;
						arg2 += this.anInt2452;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2052(this.anIntArray153, arg2, arg3 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
								arg4 += local80;
								arg3 += local92;
								local219 += local138;
								local229 += local158;
								local241 += local182;
								arg2 += this.anInt2452;
							}
						}
						this.method2052(this.anIntArray153, arg2, arg5 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
						arg4 += local80;
						arg5 += local104;
						local219 += local138;
						local229 += local158;
						local241 += local182;
						arg2 += this.anInt2452;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local80 * arg2;
					arg5 -= local104 * arg2;
					local219 -= local138 * arg2;
					local229 -= local158 * arg2;
					local241 -= local182 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local92 * arg1;
					arg1 = 0;
				}
				if (local80 < local104) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2052(this.anIntArray153, arg2, arg4 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
								arg4 += local92;
								arg5 += local104;
								local219 += local138;
								local229 += local158;
								local241 += local182;
								arg2 += this.anInt2452;
							}
						}
						this.method2052(this.anIntArray153, arg2, arg3 >> 16, arg5 >> 16, local219, local128, local229, local148, local241, local170);
						arg3 += local80;
						arg5 += local104;
						local219 += local138;
						local229 += local158;
						local241 += local182;
						arg2 += this.anInt2452;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray154[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2052(this.anIntArray153, arg2, arg5 >> 16, arg4 >> 16, local219, local128, local229, local148, local241, local170);
								arg4 += local92;
								arg5 += local104;
								local219 += local138;
								local229 += local158;
								local241 += local182;
								arg2 += this.anInt2452;
							}
						}
						this.method2052(this.anIntArray153, arg2, arg5 >> 16, arg3 >> 16, local219, local128, local229, local148, local241, local170);
						arg3 += local80;
						arg5 += local104;
						local219 += local138;
						local229 += local158;
						local241 += local182;
						arg2 += this.anInt2452;
					}
				}
			}
		}
	}
}
