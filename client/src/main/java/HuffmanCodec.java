import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class HuffmanCodec {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[I")
	private final int[] anIntArray217;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([B)V")
	public HuffmanCodec(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray217 = new int[local6];
		this.aByteArray38 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray218 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray217[local24] = local46;
				@Pc(61) int local61;
				@Pc(67) int local67;
				@Pc(73) int local73;
				@Pc(85) int local85;
				if ((local46 & local42) == 0) {
					for (local67 = local30 - 1; local67 >= 1; local67--) {
						local73 = local16[local67];
						if (local73 != local46) {
							break;
						}
						local85 = 0x1 << 32 - local67;
						if ((local85 & local73) != 0) {
							local16[local67] = local16[local67 - 1];
							break;
						}
						local16[local67] = local73 | local85;
					}
					local61 = local46 | local42;
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local67 = local30 + 1; local67 <= 32; local67++) {
					if (local16[local67] == local46) {
						local16[local67] = local61;
					}
				}
				local73 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(152) int local152 = Integer.MIN_VALUE >>> local85;
					if ((local152 & local46) == 0) {
						local73++;
					} else {
						if (this.anIntArray218[local73] == 0) {
							this.anIntArray218[local73] = local22;
						}
						local73 = this.anIntArray218[local73];
					}
					if (this.anIntArray218.length <= local73) {
						@Pc(194) int[] local194 = new int[this.anIntArray218.length * 2];
						for (@Pc(196) int local196 = 0; local196 < this.anIntArray218.length; local196++) {
							local194[local196] = this.anIntArray218[local196];
						}
						this.anIntArray218 = local194;
					}
				}
				if (local22 <= local73) {
					local22 = local73 + 1;
				}
				this.anIntArray218[local73] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([B[BIIII)I")
	public int method3648(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(15) int local15 = arg3 << 3;
		while (arg2 < local11) {
			@Pc(23) int local23 = arg1[arg2] & 0xFF;
			@Pc(28) int local28 = this.anIntArray217[local23];
			@Pc(33) byte local33 = this.aByteArray38[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(71) int local71 = (local33 + local54 - 1 >> 3) + local50;
			@Pc(72) int local72 = local54 + 24;
			arg0[local50] = (byte) (local7 |= local28 >>> local72);
			if (local71 > local50) {
				local54 = local72 - 8;
				local50++;
				arg0[local50] = (byte) (local7 = local28 >>> local54);
				if (local50 < local71) {
					local54 -= 8;
					local50++;
					arg0[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local71) {
						local54 -= 8;
						local50++;
						arg0[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local71) {
							local54 -= 8;
							local50++;
							arg0[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			local15 += local33;
			arg2++;
		}
		return (local15 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[BIII[B)I")
	public int method3651(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg3;
		while (true) {
			@Pc(24) byte local24 = arg4[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local43;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(82) int local82;
			if ((local82 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local82;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(124) int local124;
			if ((local124 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local124;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(163) int local163;
			if ((local163 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local163;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(202) int local202;
			if ((local202 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local202;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(238) int local238;
			if ((local238 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local238;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local273;
				if (arg2 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray218[local18];
			}
			@Pc(308) int local308;
			if ((local308 = this.anIntArray218[local18]) < 0) {
				arg1[arg2++] = (byte) ~local308;
				if (local16 <= arg2) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg3;
	}
}
