import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class110 {

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
	public int anInt2643;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
	public int anInt2645;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	public int anInt2653;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIIIIII)Z")
	public boolean method2458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 1) {
			if (arg2 == arg0 && arg5 == arg3) {
				return true;
			}
		} else if (arg2 >= arg0 && arg6 + arg0 - 1 >= arg2 && arg3 <= arg3 && arg3 <= arg6 + arg3 - 1) {
			return true;
		}
		@Pc(59) int local59 = arg3 - this.anInt2645;
		@Pc(64) int local64 = arg5 - this.anInt2645;
		@Pc(69) int local69 = arg0 - this.anInt2647;
		@Pc(74) int local74 = arg2 - this.anInt2647;
		if (arg6 == 1) {
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local74 + 1 == local69 && local59 == local64 && (this.anIntArrayArray65[local69][local64] & 0x80) == 0) {
						return true;
					}
					if (local69 == local74 && local64 == local59 - 1 && (this.anIntArrayArray65[local69][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local69 == local74 - 1 && local59 == local64 && (this.anIntArrayArray65[local69][local64] & 0x8) == 0) {
						return true;
					}
					if (local74 == local69 && local59 - 1 == local64 && (this.anIntArrayArray65[local69][local64] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 - 1 == local69 && local64 == local59 && (this.anIntArrayArray65[local69][local64] & 0x8) == 0) {
						return true;
					}
					if (local74 == local69 && local64 == local59 + 1 && (this.anIntArrayArray65[local69][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local69 == local74 + 1 && local59 == local64 && (this.anIntArrayArray65[local69][local64] & 0x80) == 0) {
						return true;
					}
					if (local74 == local69 && local59 + 1 == local64 && (this.anIntArrayArray65[local69][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local74 == local69 && local59 + 1 == local64 && (this.anIntArrayArray65[local69][local64] & 0x20) == 0) {
					return true;
				}
				if (local74 == local69 && local59 - 1 == local64 && (this.anIntArrayArray65[local69][local64] & 0x2) == 0) {
					return true;
				}
				if (local74 - 1 == local69 && local64 == local59 && (this.anIntArrayArray65[local69][local64] & 0x8) == 0) {
					return true;
				}
				if (local69 == local74 + 1 && local59 == local64 && (this.anIntArrayArray65[local69][local64] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(512) int local512 = arg6 + local69 - 1;
			@Pc(518) int local518 = local64 + arg6 - 1;
			if (arg1 == 6 || arg1 == 7) {
				if (arg1 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (local69 == local74 + 1 && local64 <= local59 && local518 >= local59 && (this.anIntArrayArray65[local69][local59] & 0x80) == 0) {
						return true;
					}
					if (local69 <= local74 && local74 <= local512 && local59 - arg6 == local64 && (this.anIntArrayArray65[local74][local518] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local69 == local74 - arg6 && local64 <= local59 && local59 <= local518 && (this.anIntArrayArray65[local512][local59] & 0x8) == 0) {
						return true;
					}
					if (local74 >= local69 && local74 <= local512 && local64 == local59 - arg6 && (this.anIntArrayArray65[local74][local518] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local74 - arg6 == local69 && local64 <= local59 && local59 <= local518 && (this.anIntArrayArray65[local512][local59] & 0x8) == 0) {
						return true;
					}
					if (local69 <= local74 && local74 <= local512 && local64 == local59 + 1 && (this.anIntArrayArray65[local74][local64] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local74 + 1 == local69 && local59 >= local64 && local59 <= local518 && (this.anIntArrayArray65[local69][local59] & 0x80) == 0) {
						return true;
					}
					if (local74 >= local69 && local74 <= local512 && local64 == local59 + 1 && (this.anIntArrayArray65[local74][local64] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 8) {
				if (local74 >= local69 && local74 <= local512 && local59 + 1 == local64 && (this.anIntArrayArray65[local74][local64] & 0x20) == 0) {
					return true;
				}
				if (local69 <= local74 && local74 <= local512 && local64 == local59 - arg6 && (this.anIntArrayArray65[local74][local518] & 0x2) == 0) {
					return true;
				}
				if (local69 == local74 - arg6 && local59 >= local64 && local59 <= local518 && (this.anIntArrayArray65[local512][local59] & 0x8) == 0) {
					return true;
				}
				if (local69 == local74 + 1 && local59 >= local64 && local518 >= local59 && (this.anIntArrayArray65[local69][local59] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIZ)V")
	private void method2459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray65[arg2][arg0] &= ~arg1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBIIIIIII)Z")
	public boolean method2460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg3;
		@Pc(11) int local11 = arg2 + arg7;
		@Pc(23) int local23 = arg8 + arg4;
		@Pc(27) int local27 = arg6 + arg1;
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (arg3 == local23 && (arg5 & 0x2) == 0) {
			local75 = arg1 < arg7 ? arg7 : arg1;
			local83 = local11 >= local27 ? local27 : local11;
			while (local75 < local83) {
				if ((this.anIntArrayArray65[local23 - this.anInt2647 - 1][local75 - this.anInt2645] & 0x8) == 0) {
					return true;
				}
				local75++;
			}
		} else if (arg4 == local7 && (arg5 & 0x8) == 0) {
			local75 = arg7 <= arg1 ? arg1 : arg7;
			local83 = local11 >= local27 ? local27 : local11;
			while (local83 > local75) {
				if ((this.anIntArrayArray65[arg4 - this.anInt2647][local75 - this.anInt2645] & 0x80) == 0) {
					return true;
				}
				local75++;
			}
		} else if (local27 == arg7 && (arg5 & 0x1) == 0) {
			local75 = arg3 <= arg4 ? arg4 : arg3;
			local83 = local23 <= local7 ? local23 : local7;
			while (local75 < local83) {
				if ((this.anIntArrayArray65[local75 - this.anInt2647][local27 - this.anInt2645 - 1] & 0x2) == 0) {
					return true;
				}
				local75++;
			}
		} else if (local11 == arg1 && (arg5 & 0x4) == 0) {
			local75 = arg4 < arg3 ? arg3 : arg4;
			local83 = local23 <= local7 ? local23 : local7;
			while (local83 > local75) {
				if ((this.anIntArrayArray65[local75 - this.anInt2647][arg1 - this.anInt2645] & 0x20) == 0) {
					return true;
				}
				local75++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZZIIII)V")
	public void method2462(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 - this.anInt2645;
		@Pc(13) int local13 = arg5 - this.anInt2647;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method2471(local13, local8, 128);
				this.method2471(local13 - 1, local8, 8);
			}
			if (arg3 == 1) {
				this.method2471(local13, local8, 2);
				this.method2471(local13, local8 + 1, 32);
			}
			if (arg3 == 2) {
				this.method2471(local13, local8, 8);
				this.method2471(local13 + 1, local8, 128);
			}
			if (arg3 == 3) {
				this.method2471(local13, local8, 32);
				this.method2471(local13, local8 - 1, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method2471(local13, local8, 1);
				this.method2471(local13 - 1, local8 - -1, 16);
			}
			if (arg3 == 1) {
				this.method2471(local13, local8, 4);
				this.method2471(local13 + 1, local8 + 1, 64);
			}
			if (arg3 == 2) {
				this.method2471(local13, local8, 16);
				this.method2471(local13 + 1, local8 + -1, 1);
			}
			if (arg3 == 3) {
				this.method2471(local13, local8, 64);
				this.method2471(local13 - 1, local8 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method2471(local13, local8, 130);
				this.method2471(local13 - 1, local8, 8);
				this.method2471(local13, local8 + 1, 32);
			}
			if (arg3 == 1) {
				this.method2471(local13, local8, 10);
				this.method2471(local13, local8 + 1, 32);
				this.method2471(local13 + 1, local8, 128);
			}
			if (arg3 == 2) {
				this.method2471(local13, local8, 40);
				this.method2471(local13 + 1, local8, 128);
				this.method2471(local13, local8 - 1, 2);
			}
			if (arg3 == 3) {
				this.method2471(local13, local8, 160);
				this.method2471(local13, local8 - 1, 2);
				this.method2471(local13 - 1, local8, 8);
			}
		}
		if (arg0) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method2471(local13, local8, 65536);
					this.method2471(local13 - 1, local8, 4096);
				}
				if (arg3 == 1) {
					this.method2471(local13, local8, 1024);
					this.method2471(local13, local8 + 1, 16384);
				}
				if (arg3 == 2) {
					this.method2471(local13, local8, 4096);
					this.method2471(local13 + 1, local8, 65536);
				}
				if (arg3 == 3) {
					this.method2471(local13, local8, 16384);
					this.method2471(local13, local8 - 1, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method2471(local13, local8, 512);
					this.method2471(local13 - 1, local8 + 1, 8192);
				}
				if (arg3 == 1) {
					this.method2471(local13, local8, 2048);
					this.method2471(local13 + 1, local8 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method2471(local13, local8, 8192);
					this.method2471(local13 + 1, local8 + -1, 512);
				}
				if (arg3 == 3) {
					this.method2471(local13, local8, 32768);
					this.method2471(local13 - 1, local8 + -1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method2471(local13, local8, 66560);
					this.method2471(local13 - 1, local8, 4096);
					this.method2471(local13, local8 + 1, 16384);
				}
				if (arg3 == 1) {
					this.method2471(local13, local8, 5120);
					this.method2471(local13, local8 + 1, 16384);
					this.method2471(local13 + 1, local8, 65536);
				}
				if (arg3 == 2) {
					this.method2471(local13, local8, 20480);
					this.method2471(local13 + 1, local8, 65536);
					this.method2471(local13, local8 - 1, 1024);
				}
				if (arg3 == 3) {
					this.method2471(local13, local8, 81920);
					this.method2471(local13, local8 - 1, 1024);
					this.method2471(local13 - 1, local8, 4096);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method2471(local13, local8, 536870912);
				this.method2471(local13 - 1, local8, 33554432);
			}
			if (arg3 == 1) {
				this.method2471(local13, local8, 8388608);
				this.method2471(local13, local8 + 1, 134217728);
			}
			if (arg3 == 2) {
				this.method2471(local13, local8, 33554432);
				this.method2471(local13 + 1, local8, 536870912);
			}
			if (arg3 == 3) {
				this.method2471(local13, local8, 134217728);
				this.method2471(local13, local8 - 1, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method2471(local13, local8, 4194304);
				this.method2471(local13 - 1, local8 + 1, 67108864);
			}
			if (arg3 == 1) {
				this.method2471(local13, local8, 16777216);
				this.method2471(local13 + 1, local8 - -1, 268435456);
			}
			if (arg3 == 2) {
				this.method2471(local13, local8, 67108864);
				this.method2471(local13 + 1, local8 + -1, 4194304);
			}
			if (arg3 == 3) {
				this.method2471(local13, local8, 268435456);
				this.method2471(local13 - 1, local8 + -1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method2471(local13, local8, 545259520);
			this.method2471(local13 - 1, local8, 33554432);
			this.method2471(local13, local8 + 1, 134217728);
		}
		if (arg3 == 1) {
			this.method2471(local13, local8, 41943040);
			this.method2471(local13, local8 + 1, 134217728);
			this.method2471(local13 + 1, local8, 536870912);
		}
		if (arg3 == 2) {
			this.method2471(local13, local8, 167772160);
			this.method2471(local13 + 1, local8, 536870912);
			this.method2471(local13, local8 - 1, 8388608);
		}
		if (arg3 == 3) {
			this.method2471(local13, local8, 671088640);
			this.method2471(local13, local8 - 1, 8388608);
			this.method2471(local13 - 1, local8, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIBZIZ)V")
	public void method2463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(4) int local4 = arg4 - this.anInt2647;
		@Pc(17) int local17 = arg0 - this.anInt2645;
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2459(local17, 128, local4);
				this.method2459(local17, 8, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2459(local17, 2, local4);
				this.method2459(local17 + 1, 32, local4);
			}
			if (arg1 == 2) {
				this.method2459(local17, 8, local4);
				this.method2459(local17, 128, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2459(local17, 32, local4);
				this.method2459(local17 - 1, 2, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2459(local17, 1, local4);
				this.method2459(local17 + 1, 16, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2459(local17, 4, local4);
				this.method2459(local17 + 1, 64, local4 + 1);
			}
			if (arg1 == 2) {
				this.method2459(local17, 16, local4);
				this.method2459(local17 - 1, 1, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2459(local17, 64, local4);
				this.method2459(local17 - 1, 4, local4 - 1);
			}
		}
		if (arg2 == 2) {
			if (arg1 == 0) {
				this.method2459(local17, 130, local4);
				this.method2459(local17, 8, local4 - 1);
				this.method2459(local17 + 1, 32, local4);
			}
			if (arg1 == 1) {
				this.method2459(local17, 10, local4);
				this.method2459(local17 + 1, 32, local4);
				this.method2459(local17, 128, local4 + 1);
			}
			if (arg1 == 2) {
				this.method2459(local17, 40, local4);
				this.method2459(local17, 128, local4 + 1);
				this.method2459(local17 - 1, 2, local4);
			}
			if (arg1 == 3) {
				this.method2459(local17, 160, local4);
				this.method2459(local17 - 1, 2, local4);
				this.method2459(local17, 8, local4 - 1);
			}
		}
		if (arg5) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					this.method2459(local17, 65536, local4);
					this.method2459(local17, 4096, local4 - 1);
				}
				if (arg1 == 1) {
					this.method2459(local17, 1024, local4);
					this.method2459(local17 + 1, 16384, local4);
				}
				if (arg1 == 2) {
					this.method2459(local17, 4096, local4);
					this.method2459(local17, 65536, local4 + 1);
				}
				if (arg1 == 3) {
					this.method2459(local17, 16384, local4);
					this.method2459(local17 - 1, 1024, local4);
				}
			}
			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					this.method2459(local17, 512, local4);
					this.method2459(local17 + 1, 8192, local4 - 1);
				}
				if (arg1 == 1) {
					this.method2459(local17, 2048, local4);
					this.method2459(local17 + 1, 32768, local4 + 1);
				}
				if (arg1 == 2) {
					this.method2459(local17, 8192, local4);
					this.method2459(local17 - 1, 512, local4 + 1);
				}
				if (arg1 == 3) {
					this.method2459(local17, 32768, local4);
					this.method2459(local17 - 1, 2048, local4 - 1);
				}
			}
			if (arg2 == 2) {
				if (arg1 == 0) {
					this.method2459(local17, 66560, local4);
					this.method2459(local17, 4096, local4 - 1);
					this.method2459(local17 + 1, 16384, local4);
				}
				if (arg1 == 1) {
					this.method2459(local17, 5120, local4);
					this.method2459(local17 + 1, 16384, local4);
					this.method2459(local17, 65536, local4 + 1);
				}
				if (arg1 == 2) {
					this.method2459(local17, 20480, local4);
					this.method2459(local17, 65536, local4 + 1);
					this.method2459(local17 - 1, 1024, local4);
				}
				if (arg1 == 3) {
					this.method2459(local17, 81920, local4);
					this.method2459(local17 - 1, 1024, local4);
					this.method2459(local17, 4096, local4 - 1);
				}
			}
		}
		if (!arg3) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 == 0) {
				this.method2459(local17, 536870912, local4);
				this.method2459(local17, 33554432, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2459(local17, 8388608, local4);
				this.method2459(local17 + 1, 134217728, local4);
			}
			if (arg1 == 2) {
				this.method2459(local17, 33554432, local4);
				this.method2459(local17, 536870912, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2459(local17, 134217728, local4);
				this.method2459(local17 - 1, 8388608, local4);
			}
		}
		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				this.method2459(local17, 4194304, local4);
				this.method2459(local17 + 1, 67108864, local4 - 1);
			}
			if (arg1 == 1) {
				this.method2459(local17, 16777216, local4);
				this.method2459(local17 + 1, 268435456, local4 + 1);
			}
			if (arg1 == 2) {
				this.method2459(local17, 67108864, local4);
				this.method2459(local17 - 1, 4194304, local4 + 1);
			}
			if (arg1 == 3) {
				this.method2459(local17, 268435456, local4);
				this.method2459(local17 - 1, 16777216, local4 - 1);
			}
		}
		if (arg2 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.method2459(local17, 545259520, local4);
			this.method2459(local17, 33554432, local4 - 1);
			this.method2459(local17 + 1, 134217728, local4);
		}
		if (arg1 == 1) {
			this.method2459(local17, 41943040, local4);
			this.method2459(local17 + 1, 134217728, local4);
			this.method2459(local17, 536870912, local4 + 1);
		}
		if (arg1 == 2) {
			this.method2459(local17, 167772160, local4);
			this.method2459(local17, 536870912, local4 + 1);
			this.method2459(local17 - 1, 8388608, local4);
		}
		if (arg1 == 3) {
			this.method2459(local17, 671088640, local4);
			this.method2459(local17 - 1, 8388608, local4);
			this.method2459(local17, 33554432, local4 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method2464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 > 1) {
			return Static275.method3979(arg2, arg4, arg3, arg6, arg5, arg7, arg0, arg4) ? true : this.method2460(arg4, arg0, arg4, arg3, arg2, arg1, arg5, arg7, arg6);
		}
		@Pc(53) int local53 = arg6 + arg2 - 1;
		@Pc(59) int local59 = arg5 + arg0 - 1;
		if (arg2 <= arg3 && local53 >= arg3 && arg0 <= arg7 && arg7 <= local59) {
			return true;
		} else if (arg3 == arg2 - 1 && arg7 >= arg0 && arg7 <= local59 && (this.anIntArrayArray65[arg3 - this.anInt2647][arg7 - this.anInt2645] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		} else if (arg3 == local53 + 1 && arg0 <= arg7 && local59 >= arg7 && (this.anIntArrayArray65[arg3 - this.anInt2647][arg7 - this.anInt2645] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		} else if (arg0 - 1 == arg7 && arg3 >= arg2 && arg3 <= local53 && (this.anIntArrayArray65[arg3 - this.anInt2647][arg7 - this.anInt2645] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		} else {
			return arg7 == local59 + 1 && arg3 >= arg2 && arg3 <= local53 && (this.anIntArrayArray65[arg3 - this.anInt2647][arg7 - this.anInt2645] & 0x20) == 0 && (arg1 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method2465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == 1) {
			if (arg5 == arg4 && arg3 == arg2) {
				return true;
			}
		} else if (arg5 >= arg4 && arg5 <= arg4 + arg0 - 1 && arg2 >= arg2 && arg2 + arg0 - 1 >= arg2) {
			return true;
		}
		@Pc(68) int local68 = arg4 - this.anInt2647;
		@Pc(73) int local73 = arg2 - this.anInt2645;
		@Pc(78) int local78 = arg5 - this.anInt2647;
		@Pc(83) int local83 = arg3 - this.anInt2645;
		if (arg0 == 1) {
			if (arg1 == 0) {
				if (arg6 == 0) {
					if (local68 == local78 - 1 && local83 == local73) {
						return true;
					}
					if (local68 == local78 && local73 + 1 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local68 && local83 == local73 - 1 && (this.anIntArrayArray65[local68][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local78 == local68 && local73 + 1 == local83) {
						return true;
					}
					if (local78 - 1 == local68 && local83 == local73 && (this.anIntArrayArray65[local68][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local78 + 1 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local68 == local78 + 1 && local83 == local73) {
						return true;
					}
					if (local78 == local68 && local83 == local73 + 1 && (this.anIntArrayArray65[local68][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 == local68 && local73 - 1 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local78 == local68 && local83 == local73 - 1) {
						return true;
					}
					if (local68 == local78 - 1 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local78 + 1 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg6 == 0) {
					if (local68 == local78 - 1 && local73 == local83) {
						return true;
					}
					if (local78 == local68 && local83 == local73 + 1) {
						return true;
					}
					if (local68 == local78 + 1 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local68 && local73 - 1 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local68 == local78 - 1 && local83 == local73 && (this.anIntArrayArray65[local68][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local78 && local83 == local73 + 1) {
						return true;
					}
					if (local68 == local78 + 1 && local83 == local73) {
						return true;
					}
					if (local78 == local68 && local83 == local73 - 1 && (this.anIntArrayArray65[local68][local83] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local78 - 1 == local68 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 == local68 && local73 + 1 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local68 && local83 == local73) {
						return true;
					}
					if (local78 == local68 && local73 - 1 == local83) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local78 - 1 == local68 && local83 == local73) {
						return true;
					}
					if (local68 == local78 && local83 == local73 + 1 && (this.anIntArrayArray65[local68][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local78 + 1 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 == local68 && local73 - 1 == local83) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local78 == local68 && local73 + 1 == local83 && (this.anIntArrayArray65[local68][local83] & 0x20) == 0) {
					return true;
				}
				if (local78 == local68 && local73 - 1 == local83 && (this.anIntArrayArray65[local68][local83] & 0x2) == 0) {
					return true;
				}
				if (local78 - 1 == local68 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x8) == 0) {
					return true;
				}
				if (local78 + 1 == local68 && local73 == local83 && (this.anIntArrayArray65[local68][local83] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(100) int local100 = arg0 + local68 - 1;
			@Pc(106) int local106 = arg0 + local83 - 1;
			if (arg1 == 0) {
				if (arg6 == 0) {
					if (local78 - arg0 == local68 && local73 >= local83 && local73 <= local106) {
						return true;
					}
					if (local78 >= local68 && local100 >= local78 && local73 + 1 == local83 && (this.anIntArrayArray65[local78][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 >= local68 && local100 >= local78 && local73 - arg0 == local83 && (this.anIntArrayArray65[local78][local106] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local78 >= local68 && local100 >= local78 && local73 + 1 == local83) {
						return true;
					}
					if (local68 == local78 - arg0 && local73 >= local83 && local73 <= local106 && (this.anIntArrayArray65[local100][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 + 1 == local68 && local73 >= local83 && local106 >= local73 && (this.anIntArrayArray65[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local78 + 1 == local68 && local83 <= local73 && local73 <= local106) {
						return true;
					}
					if (local78 >= local68 && local78 <= local100 && local83 == local73 + 1 && (this.anIntArrayArray65[local78][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 <= local78 && local100 >= local78 && local73 - arg0 == local83 && (this.anIntArrayArray65[local78][local106] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local78 >= local68 && local78 <= local100 && local83 == local73 - arg0) {
						return true;
					}
					if (local68 == local78 - arg0 && local73 >= local83 && local73 <= local106 && (this.anIntArrayArray65[local100][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local68 == local78 + 1 && local83 <= local73 && local106 >= local73 && (this.anIntArrayArray65[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg1 == 2) {
				if (arg6 == 0) {
					if (local78 - arg0 == local68 && local83 <= local73 && local73 <= local106) {
						return true;
					}
					if (local78 >= local68 && local100 >= local78 && local83 == local73 + 1) {
						return true;
					}
					if (local68 == local78 + 1 && local73 >= local83 && local73 <= local106 && (this.anIntArrayArray65[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local78 >= local68 && local78 <= local100 && local83 == local73 - arg0 && (this.anIntArrayArray65[local78][local106] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 1) {
					if (local68 == local78 - arg0 && local83 <= local73 && local73 <= local106 && (this.anIntArrayArray65[local100][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 >= local68 && local100 >= local78 && local83 == local73 + 1) {
						return true;
					}
					if (local78 + 1 == local68 && local83 <= local73 && local106 >= local73) {
						return true;
					}
					if (local68 <= local78 && local100 >= local78 && local73 - arg0 == local83 && (this.anIntArrayArray65[local78][local106] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg6 == 2) {
					if (local68 == local78 - arg0 && local73 >= local83 && local106 >= local73 && (this.anIntArrayArray65[local100][local73] & 0x2C0108) == 0) {
						return true;
					}
					if (local78 >= local68 && local78 <= local100 && local73 + 1 == local83 && (this.anIntArrayArray65[local78][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local78 + 1 == local68 && local73 >= local83 && local106 >= local73) {
						return true;
					}
					if (local78 >= local68 && local100 >= local78 && local83 == local73 - arg0) {
						return true;
					}
				} else if (arg6 == 3) {
					if (local78 - arg0 == local68 && local73 >= local83 && local106 >= local73) {
						return true;
					}
					if (local68 <= local78 && local100 >= local78 && local83 == local73 + 1 && (this.anIntArrayArray65[local78][local83] & 0x2C0120) == 0) {
						return true;
					}
					if (local68 == local78 + 1 && local83 <= local73 && local73 <= local106 && (this.anIntArrayArray65[local68][local73] & 0x2C0180) == 0) {
						return true;
					}
					if (local68 <= local78 && local78 <= local100 && local83 == local73 - arg0) {
						return true;
					}
				}
			}
			if (arg1 == 9) {
				if (local68 <= local78 && local78 <= local100 && local73 + 1 == local83 && (this.anIntArrayArray65[local78][local83] & 0x2C0120) == 0) {
					return true;
				}
				if (local78 >= local68 && local100 >= local78 && local73 - arg0 == local83 && (this.anIntArrayArray65[local78][local106] & 0x2C0102) == 0) {
					return true;
				}
				if (local68 == local78 - arg0 && local73 >= local83 && local106 >= local73 && (this.anIntArrayArray65[local100][local73] & 0x2C0108) == 0) {
					return true;
				}
				if (local78 + 1 == local68 && local83 <= local73 && local106 >= local73 && (this.anIntArrayArray65[local68][local73] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	public void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 - this.anInt2647;
		@Pc(20) int local20 = arg0 - this.anInt2645;
		this.anIntArrayArray65[local15][local20] |= 0x200000;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public void method2467() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt2643; local5++) {
			for (@Pc(8) int local8 = 0; local8 < this.anInt2653; local8++) {
				if (local5 == 0 || local8 == 0 || local5 >= this.anInt2643 - 5 || this.anInt2653 - 5 <= local8) {
					this.anIntArrayArray65[local5][local8] = -1;
				} else {
					this.anIntArrayArray65[local5][local8] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZBIIIII)V")
	public void method2468(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg6 - this.anInt2645;
		@Pc(23) int local23 = arg2 - this.anInt2647;
		@Pc(35) int local35;
		if (arg5 == 1 || arg5 == 3) {
			local35 = arg3;
			arg3 = arg4;
			arg4 = local35;
		}
		if (arg1) {
			local7 |= 0x40000000;
		}
		for (local35 = local23; local35 < arg3 + local23; local35++) {
			if (local35 >= 0 && this.anInt2643 > local35) {
				for (@Pc(69) int local69 = local18; local69 < local18 + arg4; local69++) {
					if (local69 >= 0 && local69 < this.anInt2653) {
						this.method2459(local69, local7, local35);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)V")
	public void method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 - this.anInt2645;
		@Pc(20) int local20 = arg1 - this.anInt2647;
		this.anIntArrayArray65[local20][local11] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
	public void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt2647;
		@Pc(13) int local13 = arg0 - this.anInt2645;
		this.anIntArrayArray65[local8][local13] |= 0x40000;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)V")
	private void method2471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArrayArray65[arg0][arg1] |= arg2;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZIZ)V")
	public void method2472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(5) int local5 = 256;
		if (arg5) {
			local5 = 131328;
		}
		if (arg3) {
			local5 |= 0x40000000;
		}
		@Pc(22) int local22 = arg2 - this.anInt2645;
		@Pc(32) int local32 = arg0 - this.anInt2647;
		for (@Pc(34) int local34 = local32; local34 < local32 + arg4; local34++) {
			if (local34 >= 0 && this.anInt2643 > local34) {
				for (@Pc(52) int local52 = local22; local52 < arg1 + local22; local52++) {
					if (local52 >= 0 && this.anInt2653 > local52) {
						this.method2471(local34, local52, local5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZI)V")
	public void method2473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = arg0 - this.anInt2645;
		@Pc(25) int local25 = arg1 - this.anInt2647;
		this.anIntArrayArray65[local25][local20] &= 0xFFFBFFFF;
	}
}
