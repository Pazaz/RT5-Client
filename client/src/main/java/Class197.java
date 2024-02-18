import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class197 {

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
	private final int[] anIntArray374;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[B")
	private final byte[] aByteArray50;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "([B)V")
	public Class197(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray374 = new int[local6];
		this.aByteArray50 = arg0;
		this.anIntArray373 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray374[local24] = local46;
				@Pc(62) int local62;
				@Pc(66) int local66;
				@Pc(72) int local72;
				@Pc(86) int local86;
				if ((local42 & local46) == 0) {
					local62 = local42 | local46;
					for (local66 = local30 - 1; local66 >= 1; local66--) {
						local72 = local20[local66];
						if (local46 != local72) {
							break;
						}
						local86 = 0x1 << 32 - local66;
						if ((local72 & local86) != 0) {
							local20[local66] = local20[local66 - 1];
							break;
						}
						local20[local66] = local72 | local86;
					}
				} else {
					local62 = local20[local30 - 1];
				}
				local20[local30] = local62;
				for (local66 = local30 + 1; local66 <= 32; local66++) {
					if (local20[local66] == local46) {
						local20[local66] = local62;
					}
				}
				local72 = 0;
				for (local86 = 0; local86 < local30; local86++) {
					@Pc(178) int local178 = Integer.MIN_VALUE >>> local86;
					if ((local178 & local46) == 0) {
						local72++;
					} else {
						if (this.anIntArray373[local72] == 0) {
							this.anIntArray373[local72] = local22;
						}
						local72 = this.anIntArray373[local72];
					}
					if (this.anIntArray373.length <= local72) {
						@Pc(226) int[] local226 = new int[this.anIntArray373.length * 2];
						for (@Pc(228) int local228 = 0; local228 < this.anIntArray373.length; local228++) {
							local226[local228] = this.anIntArray373[local228];
						}
						this.anIntArray373 = local226;
					}
				}
				this.anIntArray373[local72] = ~local24;
				if (local22 <= local72) {
					local22 = local72 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([BI[BIII)I")
	public int method4438(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(17) int local17 = arg2;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg3;
		while (true) {
			@Pc(25) byte local25 = arg1[local21];
			if (local25 >= 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local45;
				if (arg4 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x40) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local87;
				if (arg4 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x20) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(130) int local130;
			if ((local130 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local130;
				if (local17 <= arg4) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x10) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(172) int local172;
			if ((local172 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local172;
				if (local17 <= arg4) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x8) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(208) int local208;
			if ((local208 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local208;
				if (arg4 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x4) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(247) int local247;
			if ((local247 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local247;
				if (arg4 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x2) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(289) int local289;
			if ((local289 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local289;
				if (arg4 >= local17) {
					break;
				}
				local19 = 0;
			}
			if ((local25 & 0x1) == 0) {
				local19++;
			} else {
				local19 = this.anIntArray373[local19];
			}
			@Pc(325) int local325;
			if ((local325 = this.anIntArray373[local19]) < 0) {
				arg0[arg4++] = (byte) ~local325;
				if (local17 <= arg4) {
					break;
				}
				local19 = 0;
			}
			local21++;
		}
		return local21 + 1 - arg3;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII[B[B)I")
	public int method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg2;
		@Pc(27) int local27 = arg0 << 3;
		while (local23 > arg1) {
			@Pc(34) int local34 = arg4[arg1] & 0xFF;
			@Pc(39) int local39 = this.anIntArray374[local34];
			@Pc(44) byte local44 = this.aByteArray50[local34];
			if (local44 == 0) {
				throw new RuntimeException("No codeword for data value " + local34);
			}
			@Pc(64) int local64 = local27 >> 3;
			@Pc(68) int local68 = local27 & 0x7;
			local19 &= -local68 >> 31;
			@Pc(85) int local85 = local64 + (local68 + local44 - 1 >> 3);
			local27 += local44;
			@Pc(90) int local90 = local68 + 24;
			arg3[local64] = (byte) (local19 |= local39 >>> local90);
			if (local64 < local85) {
				local68 = local90 - 8;
				local64++;
				arg3[local64] = (byte) (local19 = local39 >>> local68);
				if (local64 < local85) {
					local64++;
					local68 -= 8;
					arg3[local64] = (byte) (local19 = local39 >>> local68);
					if (local85 > local64) {
						local68 -= 8;
						local64++;
						arg3[local64] = (byte) (local19 = local39 >>> local68);
						if (local85 > local64) {
							local64++;
							local68 -= 8;
							arg3[local64] = (byte) (local19 = local39 << -local68);
						}
					}
				}
			}
			arg1++;
		}
		return (local27 + 7 >> 3) - arg0;
	}
}
