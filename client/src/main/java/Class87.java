import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class87 {

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "[B")
	private final byte[] aByteArray27;

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
	private final int[] anIntArray222;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "([B)V")
	public Class87(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray27 = arg0;
		this.anIntArray222 = new int[local6];
		this.anIntArray221 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local20[local30];
				this.anIntArray222[local24] = local42;
				@Pc(104) int local104;
				@Pc(55) int local55;
				@Pc(61) int local61;
				@Pc(73) int local73;
				if ((local42 & local38) == 0) {
					for (local55 = local30 - 1; local55 >= 1; local55--) {
						local61 = local20[local55];
						if (local42 != local61) {
							break;
						}
						local73 = 0x1 << 32 - local55;
						if ((local73 & local61) != 0) {
							local20[local55] = local20[local55 - 1];
							break;
						}
						local20[local55] = local61 | local73;
					}
					local104 = local38 | local42;
				} else {
					local104 = local20[local30 - 1];
				}
				local20[local30] = local104;
				for (local55 = local30 + 1; local55 <= 32; local55++) {
					if (local42 == local20[local55]) {
						local20[local55] = local104;
					}
				}
				local61 = 0;
				for (local73 = 0; local73 < local30; local73++) {
					@Pc(145) int local145 = Integer.MIN_VALUE >>> local73;
					if ((local42 & local145) == 0) {
						local61++;
					} else {
						if (this.anIntArray221[local61] == 0) {
							this.anIntArray221[local61] = local22;
						}
						local61 = this.anIntArray221[local61];
					}
					if (this.anIntArray221.length <= local61) {
						@Pc(186) int[] local186 = new int[this.anIntArray221.length * 2];
						for (@Pc(188) int local188 = 0; local188 < this.anIntArray221.length; local188++) {
							local186[local188] = this.anIntArray221[local188];
						}
						this.anIntArray221 = local186;
					}
				}
				this.anIntArray221[local61] = ~local24;
				if (local22 <= local61) {
					local22 = local61 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B[BI[BII)I")
	public int method2583(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(25) int local25 = arg3;
		while (true) {
			@Pc(29) byte local29 = arg2[local25];
			if (local29 >= 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(48) int local48;
			if ((local48 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local48;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x40) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local83;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x20) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(121) int local121;
			if ((local121 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local121;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x10) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(156) int local156;
			if ((local156 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local156;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x8) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(192) int local192;
			if ((local192 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local192;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x4) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(227) int local227;
			if ((local227 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local227;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x2) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(262) int local262;
			if ((local262 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local262;
				if (local18 <= arg4) {
					break;
				}
				local14 = 0;
			}
			if ((local29 & 0x1) == 0) {
				local14++;
			} else {
				local14 = this.anIntArray221[local14];
			}
			@Pc(300) int local300;
			if ((local300 = this.anIntArray221[local14]) < 0) {
				arg0[arg4++] = (byte) ~local300;
				if (arg4 >= local18) {
					break;
				}
				local14 = 0;
			}
			local25++;
		}
		return local25 + 1 - arg3;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III[BI[B)I")
	public int method2585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg1;
		@Pc(15) int local15 = arg0 << 3;
		while (arg3 < local11) {
			@Pc(28) int local28 = arg4[arg3] & 0xFF;
			@Pc(33) int local33 = this.anIntArray222[local28];
			@Pc(38) byte local38 = this.aByteArray27[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local15 >> 3;
			@Pc(59) int local59 = local15 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(77) int local77 = (local59 + local38 - 1 >> 3) + local55;
			local15 += local38;
			@Pc(82) int local82 = local59 + 24;
			arg2[local55] = (byte) (local7 |= local33 >>> local82);
			if (local77 > local55) {
				local59 = local82 - 8;
				local55++;
				arg2[local55] = (byte) (local7 = local33 >>> local59);
				if (local55 < local77) {
					local59 -= 8;
					local55++;
					arg2[local55] = (byte) (local7 = local33 >>> local59);
					if (local55 < local77) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local7 = local33 >>> local59);
						if (local77 > local55) {
							local55++;
							local59 -= 8;
							arg2[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			arg3++;
		}
		return (local15 + 7 >> 3) - arg0;
	}
}
