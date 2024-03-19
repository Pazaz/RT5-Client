import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class22 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
	public int anInt710;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZIIIBZ)V")
	public void method507(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		@Pc(18) int local18 = arg3 - this.anInt719;
		if (arg5) {
			local7 |= 0x40000000;
		}
		@Pc(29) int local29 = arg4 - this.anInt729;
		for (@Pc(39) int local39 = local18; local39 < arg0 + local18; local39++) {
			if (local39 >= 0 && this.anInt725 > local39) {
				for (@Pc(52) int local52 = local29; local52 < local29 + arg2; local52++) {
					if (local52 >= 0 && local52 < this.anInt710) {
						this.method525(local52, local39, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZBIIII)V")
	public void method508(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4 = arg5 - this.anInt729;
		@Pc(13) int local13 = arg2 - this.anInt719;
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method525(local4, local13, 128);
				this.method525(local4, local13 - 1, 8);
			}
			if (arg3 == 1) {
				this.method525(local4, local13, 2);
				this.method525(local4 + 1, local13, 32);
			}
			if (arg3 == 2) {
				this.method525(local4, local13, 8);
				this.method525(local4, local13 + 1, 128);
			}
			if (arg3 == 3) {
				this.method525(local4, local13, 32);
				this.method525(local4 - 1, local13, 2);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method525(local4, local13, 1);
				this.method525(local4 + 1, local13 - 1, 16);
			}
			if (arg3 == 1) {
				this.method525(local4, local13, 4);
				this.method525(local4 + 1, local13 + 1, 64);
			}
			if (arg3 == 2) {
				this.method525(local4, local13, 16);
				this.method525(local4 - 1, local13 - -1, 1);
			}
			if (arg3 == 3) {
				this.method525(local4, local13, 64);
				this.method525(local4 - 1, local13 + -1, 4);
			}
		}
		if (arg4 == 2) {
			if (arg3 == 0) {
				this.method525(local4, local13, 130);
				this.method525(local4, local13 - 1, 8);
				this.method525(local4 + 1, local13, 32);
			}
			if (arg3 == 1) {
				this.method525(local4, local13, 10);
				this.method525(local4 + 1, local13, 32);
				this.method525(local4, local13 + 1, 128);
			}
			if (arg3 == 2) {
				this.method525(local4, local13, 40);
				this.method525(local4, local13 + 1, 128);
				this.method525(local4 - 1, local13, 2);
			}
			if (arg3 == 3) {
				this.method525(local4, local13, 160);
				this.method525(local4 - 1, local13, 2);
				this.method525(local4, local13 - 1, 8);
			}
		}
		if (arg1) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					this.method525(local4, local13, 65536);
					this.method525(local4, local13 - 1, 4096);
				}
				if (arg3 == 1) {
					this.method525(local4, local13, 1024);
					this.method525(local4 + 1, local13, 16384);
				}
				if (arg3 == 2) {
					this.method525(local4, local13, 4096);
					this.method525(local4, local13 + 1, 65536);
				}
				if (arg3 == 3) {
					this.method525(local4, local13, 16384);
					this.method525(local4 - 1, local13, 1024);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					this.method525(local4, local13, 512);
					this.method525(local4 + 1, local13 + -1, 8192);
				}
				if (arg3 == 1) {
					this.method525(local4, local13, 2048);
					this.method525(local4 + 1, local13 + 1, 32768);
				}
				if (arg3 == 2) {
					this.method525(local4, local13, 8192);
					this.method525(local4 - 1, local13 + 1, 512);
				}
				if (arg3 == 3) {
					this.method525(local4, local13, 32768);
					this.method525(local4 - 1, local13 - 1, 2048);
				}
			}
			if (arg4 == 2) {
				if (arg3 == 0) {
					this.method525(local4, local13, 66560);
					this.method525(local4, local13 - 1, 4096);
					this.method525(local4 + 1, local13, 16384);
				}
				if (arg3 == 1) {
					this.method525(local4, local13, 5120);
					this.method525(local4 + 1, local13, 16384);
					this.method525(local4, local13 + 1, 65536);
				}
				if (arg3 == 2) {
					this.method525(local4, local13, 20480);
					this.method525(local4, local13 + 1, 65536);
					this.method525(local4 - 1, local13, 1024);
				}
				if (arg3 == 3) {
					this.method525(local4, local13, 81920);
					this.method525(local4 - 1, local13, 1024);
					this.method525(local4, local13 - 1, 4096);
				}
			}
		}
		if (!arg0) {
			return;
		}
		if (arg4 == 0) {
			if (arg3 == 0) {
				this.method525(local4, local13, 536870912);
				this.method525(local4, local13 - 1, 33554432);
			}
			if (arg3 == 1) {
				this.method525(local4, local13, 8388608);
				this.method525(local4 + 1, local13, 134217728);
			}
			if (arg3 == 2) {
				this.method525(local4, local13, 33554432);
				this.method525(local4, local13 + 1, 536870912);
			}
			if (arg3 == 3) {
				this.method525(local4, local13, 134217728);
				this.method525(local4 - 1, local13, 8388608);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				this.method525(local4, local13, 4194304);
				this.method525(local4 + 1, local13 + -1, 67108864);
			}
			if (arg3 == 1) {
				this.method525(local4, local13, 16777216);
				this.method525(local4 + 1, local13 + 1, 268435456);
			}
			if (arg3 == 2) {
				this.method525(local4, local13, 67108864);
				this.method525(local4 - 1, local13 - -1, 4194304);
			}
			if (arg3 == 3) {
				this.method525(local4, local13, 268435456);
				this.method525(local4 - 1, local13 - 1, 16777216);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg3 == 0) {
			this.method525(local4, local13, 545259520);
			this.method525(local4, local13 - 1, 33554432);
			this.method525(local4 + 1, local13, 134217728);
		}
		if (arg3 == 1) {
			this.method525(local4, local13, 41943040);
			this.method525(local4 + 1, local13, 134217728);
			this.method525(local4, local13 + 1, 536870912);
		}
		if (arg3 == 2) {
			this.method525(local4, local13, 167772160);
			this.method525(local4, local13 + 1, 536870912);
			this.method525(local4 - 1, local13, 8388608);
		}
		if (arg3 == 3) {
			this.method525(local4, local13, 671088640);
			this.method525(local4 - 1, local13, 8388608);
			this.method525(local4, local13 - 1, 33554432);
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZII)V")
	private void method509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIZZ)V")
	public void method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) int local8 = arg2 - this.anInt729;
		@Pc(13) int local13 = arg3 - this.anInt719;
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method509(128, local8, local13);
				this.method509(8, local8, local13 - 1);
			}
			if (arg0 == 1) {
				this.method509(2, local8, local13);
				this.method509(32, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method509(8, local8, local13);
				this.method509(128, local8, local13 + 1);
			}
			if (arg0 == 3) {
				this.method509(32, local8, local13);
				this.method509(2, local8 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method509(1, local8, local13);
				this.method509(16, local8 + 1, local13 - 1);
			}
			if (arg0 == 1) {
				this.method509(4, local8, local13);
				this.method509(64, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method509(16, local8, local13);
				this.method509(1, local8 - 1, local13 - -1);
			}
			if (arg0 == 3) {
				this.method509(64, local8, local13);
				this.method509(4, local8 - 1, local13 + -1);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.method509(130, local8, local13);
				this.method509(8, local8, local13 - 1);
				this.method509(32, local8 + 1, local13);
			}
			if (arg0 == 1) {
				this.method509(10, local8, local13);
				this.method509(32, local8 + 1, local13);
				this.method509(128, local8, local13 + 1);
			}
			if (arg0 == 2) {
				this.method509(40, local8, local13);
				this.method509(128, local8, local13 + 1);
				this.method509(2, local8 - 1, local13);
			}
			if (arg0 == 3) {
				this.method509(160, local8, local13);
				this.method509(2, local8 - 1, local13);
				this.method509(8, local8, local13 - 1);
			}
		}
		if (arg5) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					this.method509(65536, local8, local13);
					this.method509(4096, local8, local13 - 1);
				}
				if (arg0 == 1) {
					this.method509(1024, local8, local13);
					this.method509(16384, local8 + 1, local13);
				}
				if (arg0 == 2) {
					this.method509(4096, local8, local13);
					this.method509(65536, local8, local13 + 1);
				}
				if (arg0 == 3) {
					this.method509(16384, local8, local13);
					this.method509(1024, local8 - 1, local13);
				}
			}
			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					this.method509(512, local8, local13);
					this.method509(8192, local8 + 1, local13 - 1);
				}
				if (arg0 == 1) {
					this.method509(2048, local8, local13);
					this.method509(32768, local8 + 1, local13 - -1);
				}
				if (arg0 == 2) {
					this.method509(8192, local8, local13);
					this.method509(512, local8 - 1, local13 - -1);
				}
				if (arg0 == 3) {
					this.method509(32768, local8, local13);
					this.method509(2048, local8 - 1, local13 + -1);
				}
			}
			if (arg1 == 2) {
				if (arg0 == 0) {
					this.method509(66560, local8, local13);
					this.method509(4096, local8, local13 - 1);
					this.method509(16384, local8 + 1, local13);
				}
				if (arg0 == 1) {
					this.method509(5120, local8, local13);
					this.method509(16384, local8 + 1, local13);
					this.method509(65536, local8, local13 + 1);
				}
				if (arg0 == 2) {
					this.method509(20480, local8, local13);
					this.method509(65536, local8, local13 + 1);
					this.method509(1024, local8 - 1, local13);
				}
				if (arg0 == 3) {
					this.method509(81920, local8, local13);
					this.method509(1024, local8 - 1, local13);
					this.method509(4096, local8, local13 - 1);
				}
			}
		}
		if (!arg4) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.method509(536870912, local8, local13);
				this.method509(33554432, local8, local13 - 1);
			}
			if (arg0 == 1) {
				this.method509(8388608, local8, local13);
				this.method509(134217728, local8 + 1, local13);
			}
			if (arg0 == 2) {
				this.method509(33554432, local8, local13);
				this.method509(536870912, local8, local13 + 1);
			}
			if (arg0 == 3) {
				this.method509(134217728, local8, local13);
				this.method509(8388608, local8 - 1, local13);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.method509(4194304, local8, local13);
				this.method509(67108864, local8 + 1, local13 + -1);
			}
			if (arg0 == 1) {
				this.method509(16777216, local8, local13);
				this.method509(268435456, local8 + 1, local13 + 1);
			}
			if (arg0 == 2) {
				this.method509(67108864, local8, local13);
				this.method509(4194304, local8 - 1, local13 + 1);
			}
			if (arg0 == 3) {
				this.method509(268435456, local8, local13);
				this.method509(16777216, local8 - 1, local13 - 1);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method509(545259520, local8, local13);
			this.method509(33554432, local8, local13 - 1);
			this.method509(134217728, local8 + 1, local13);
		}
		if (arg0 == 1) {
			this.method509(41943040, local8, local13);
			this.method509(134217728, local8 + 1, local13);
			this.method509(536870912, local8, local13 + 1);
		}
		if (arg0 == 2) {
			this.method509(167772160, local8, local13);
			this.method509(536870912, local8, local13 + 1);
			this.method509(8388608, local8 - 1, local13);
		}
		if (arg0 == 3) {
			this.method509(671088640, local8, local13);
			this.method509(8388608, local8 - 1, local13);
			this.method509(33554432, local8, local13 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIZIIIII)Z")
	public boolean method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > 1) {
			return Static224.method4550(arg4, arg7, arg0, arg1, arg5, arg5, arg6, arg2) ? true : this.method515(arg7, arg5, arg3, arg4, arg0, arg6, arg2, arg1, arg5);
		}
		@Pc(38) int local38 = arg1 + arg7 - 1;
		@Pc(44) int local44 = arg6 + arg2 - 1;
		if (arg0 >= arg7 && local38 >= arg0 && arg4 >= arg2 && local44 >= arg4) {
			return true;
		} else if (arg7 - 1 == arg0 && arg4 >= arg2 && local44 >= arg4 && (this.anIntArrayArray3[arg0 - this.anInt719][arg4 - this.anInt729] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		} else if (local38 + 1 == arg0 && arg2 <= arg4 && arg4 <= local44 && (this.anIntArrayArray3[arg0 - this.anInt719][arg4 - this.anInt729] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		} else if (arg4 == arg2 - 1 && arg7 <= arg0 && arg0 <= local38 && (this.anIntArrayArray3[arg0 - this.anInt719][arg4 - this.anInt729] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		} else {
			return local44 + 1 == arg4 && arg7 <= arg0 && local38 >= arg0 && (this.anIntArrayArray3[arg0 - this.anInt719][arg4 - this.anInt729] & 0x20) == 0 && (arg3 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public void method514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt719;
		@Pc(13) int local13 = arg0 - this.anInt729;
		this.anIntArrayArray3[local8][local13] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg8 + arg4;
		@Pc(20) int local20 = arg3 + arg1;
		@Pc(24) int local24 = arg7 + arg0;
		@Pc(28) int local28 = arg5 + arg6;
		@Pc(49) int local49;
		@Pc(56) int local56;
		if (arg4 == local24 && (arg2 & 0x2) == 0) {
			local49 = arg3 <= arg6 ? arg6 : arg3;
			local56 = local20 < local28 ? local20 : local28;
			while (local56 > local49) {
				if ((this.anIntArrayArray3[local24 - this.anInt719 - 1][local49 - this.anInt729] & 0x8) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local15 == arg0 && (arg2 & 0x8) == 0) {
			local49 = arg3 > arg6 ? arg3 : arg6;
			local56 = local28 <= local20 ? local28 : local20;
			while (local56 > local49) {
				if ((this.anIntArrayArray3[arg0 - this.anInt719][local49 - this.anInt729] & 0x80) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local28 == arg3 && (arg2 & 0x1) == 0) {
			local49 = arg4 <= arg0 ? arg0 : arg4;
			local56 = local24 > local15 ? local15 : local24;
			while (local49 < local56) {
				if ((this.anIntArrayArray3[local49 - this.anInt719][local28 - this.anInt729 - 1] & 0x2) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg6 == local20 && (arg2 & 0x4) == 0) {
			local49 = arg0 < arg4 ? arg4 : arg0;
			local56 = local15 >= local24 ? local24 : local15;
			while (local49 < local56) {
				if ((this.anIntArrayArray3[local49 - this.anInt719][arg6 - this.anInt729] & 0x20) == 0) {
					return true;
				}
				local49++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZZIIIII)V")
	public void method516(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg1) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg3 - this.anInt719;
		@Pc(32) int local32;
		if (arg6 == 1 || arg6 == 3) {
			local32 = arg4;
			arg4 = arg0;
			arg0 = local32;
		}
		@Pc(41) int local41 = arg5 - this.anInt729;
		for (local32 = local24; local32 < arg4 + local24; local32++) {
			if (local32 >= 0 && this.anInt725 > local32) {
				for (@Pc(60) int local60 = local41; local60 < local41 + arg0; local60++) {
					if (local60 >= 0 && local60 < this.anInt710) {
						this.method509(local7, local60, local32);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	public void method517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - this.anInt719;
		@Pc(21) int local21 = arg0 - this.anInt729;
		this.anIntArrayArray3[local4][local21] |= 0x200000;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZII)V")
	public void method520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt719;
		@Pc(17) int local17 = arg1 - this.anInt729;
		this.anIntArrayArray3[local4][local17] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == 1) {
			if (arg6 == arg5 && arg0 == arg4) {
				return true;
			}
		} else if (arg5 >= arg6 && arg5 <= arg6 + arg2 - 1 && arg4 >= arg4 && arg4 <= arg2 + arg4 - 1) {
			return true;
		}
		@Pc(60) int local60 = arg5 - this.anInt719;
		@Pc(65) int local65 = arg4 - this.anInt729;
		@Pc(70) int local70 = arg6 - this.anInt719;
		@Pc(75) int local75 = arg0 - this.anInt729;
		if (arg2 == 1) {
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local70 == local60 + 1 && local65 == local75 && (this.anIntArrayArray3[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local70 == local60 && local65 - 1 == local75 && (this.anIntArrayArray3[local70][local75] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local70 == local60 - 1 && local75 == local65 && (this.anIntArrayArray3[local70][local75] & 0x8) == 0) {
						return true;
					}
					if (local70 == local60 && local65 - 1 == local75 && (this.anIntArrayArray3[local70][local75] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local60 - 1 == local70 && local65 == local75 && (this.anIntArrayArray3[local70][local75] & 0x8) == 0) {
						return true;
					}
					if (local70 == local60 && local65 + 1 == local75 && (this.anIntArrayArray3[local70][local75] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local60 + 1 == local70 && local65 == local75 && (this.anIntArrayArray3[local70][local75] & 0x80) == 0) {
						return true;
					}
					if (local70 == local60 && local65 + 1 == local75 && (this.anIntArrayArray3[local70][local75] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local60 == local70 && local75 == local65 + 1 && (this.anIntArrayArray3[local70][local75] & 0x20) == 0) {
					return true;
				}
				if (local70 == local60 && local75 == local65 - 1 && (this.anIntArrayArray3[local70][local75] & 0x2) == 0) {
					return true;
				}
				if (local70 == local60 - 1 && local65 == local75 && (this.anIntArrayArray3[local70][local75] & 0x8) == 0) {
					return true;
				}
				if (local60 + 1 == local70 && local65 == local75 && (this.anIntArrayArray3[local70][local75] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(396) int local396 = local70 + arg2 - 1;
			@Pc(402) int local402 = local75 + arg2 - 1;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg1 = arg1 + 2 & 0x3;
				}
				if (arg1 == 0) {
					if (local70 == local60 + 1 && local75 <= local65 && local65 <= local402 && (this.anIntArrayArray3[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local70 <= local60 && local396 >= local60 && local75 == local65 - arg2 && (this.anIntArrayArray3[local60][local402] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 1) {
					if (local60 - arg2 == local70 && local75 <= local65 && local402 >= local65 && (this.anIntArrayArray3[local396][local65] & 0x8) == 0) {
						return true;
					}
					if (local60 >= local70 && local396 >= local60 && local65 - arg2 == local75 && (this.anIntArrayArray3[local60][local402] & 0x2) == 0) {
						return true;
					}
				} else if (arg1 == 2) {
					if (local60 - arg2 == local70 && local75 <= local65 && local65 <= local402 && (this.anIntArrayArray3[local396][local65] & 0x8) == 0) {
						return true;
					}
					if (local60 >= local70 && local396 >= local60 && local65 + 1 == local75 && (this.anIntArrayArray3[local60][local75] & 0x20) == 0) {
						return true;
					}
				} else if (arg1 == 3) {
					if (local70 == local60 + 1 && local65 >= local75 && local65 <= local402 && (this.anIntArrayArray3[local70][local65] & 0x80) == 0) {
						return true;
					}
					if (local60 >= local70 && local60 <= local396 && local75 == local65 + 1 && (this.anIntArrayArray3[local60][local75] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (local60 >= local70 && local60 <= local396 && local75 == local65 + 1 && (this.anIntArrayArray3[local60][local75] & 0x20) == 0) {
					return true;
				}
				if (local70 <= local60 && local60 <= local396 && local75 == local65 - arg2 && (this.anIntArrayArray3[local60][local402] & 0x2) == 0) {
					return true;
				}
				if (local70 == local60 - arg2 && local65 >= local75 && local402 >= local65 && (this.anIntArrayArray3[local396][local65] & 0x8) == 0) {
					return true;
				}
				if (local60 + 1 == local70 && local75 <= local65 && local402 >= local65 && (this.anIntArrayArray3[local70][local65] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V")
	public void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt729;
		@Pc(13) int local13 = arg0 - this.anInt719;
		this.anIntArrayArray3[local13][local8] |= 0x40000;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIBII)Z")
	public boolean method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg5 == arg3 && arg0 == arg6) {
				return true;
			}
		} else if (arg5 <= arg3 && arg3 <= arg1 + arg5 - 1 && arg0 >= arg0 && arg0 + arg1 - 1 >= arg0) {
			return true;
		}
		@Pc(51) int local51 = arg3 - this.anInt719;
		@Pc(56) int local56 = arg0 - this.anInt729;
		@Pc(61) int local61 = arg5 - this.anInt719;
		@Pc(66) int local66 = arg6 - this.anInt729;
		if (arg1 == 1) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local51 - 1 == local61 && local56 == local66) {
						return true;
					}
					if (local61 == local51 && local56 + 1 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local51 == local61 && local66 == local56 - 1 && (this.anIntArrayArray3[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local61 == local51 && local66 == local56 + 1) {
						return true;
					}
					if (local51 - 1 == local61 && local56 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local51 + 1 && local56 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local51 + 1 == local61 && local56 == local66) {
						return true;
					}
					if (local61 == local51 && local66 == local56 + 1 && (this.anIntArrayArray3[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local51 == local61 && local56 - 1 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local61 == local51 && local56 - 1 == local66) {
						return true;
					}
					if (local51 - 1 == local61 && local56 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local51 + 1 == local61 && local56 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local61 == local51 - 1 && local66 == local56) {
						return true;
					}
					if (local51 == local61 && local66 == local56 + 1) {
						return true;
					}
					if (local61 == local51 + 1 && local56 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local51 && local56 - 1 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local61 == local51 - 1 && local66 == local56 && (this.anIntArrayArray3[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local51 && local56 + 1 == local66) {
						return true;
					}
					if (local61 == local51 + 1 && local66 == local56) {
						return true;
					}
					if (local51 == local61 && local56 - 1 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local61 == local51 - 1 && local66 == local56 && (this.anIntArrayArray3[local61][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local51 && local56 + 1 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local51 + 1 && local56 == local66) {
						return true;
					}
					if (local61 == local51 && local66 == local56 - 1) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local51 - 1 == local61 && local56 == local66) {
						return true;
					}
					if (local61 == local51 && local56 + 1 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 == local51 + 1 && local56 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 == local51 && local66 == local56 - 1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local51 == local61 && local66 == local56 + 1 && (this.anIntArrayArray3[local61][local66] & 0x20) == 0) {
					return true;
				}
				if (local61 == local51 && local56 - 1 == local66 && (this.anIntArrayArray3[local61][local66] & 0x2) == 0) {
					return true;
				}
				if (local51 - 1 == local61 && local66 == local56 && (this.anIntArrayArray3[local61][local66] & 0x8) == 0) {
					return true;
				}
				if (local61 == local51 + 1 && local66 == local56 && (this.anIntArrayArray3[local61][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(784) int local784 = local61 + arg1 - 1;
			@Pc(791) int local791 = local66 + arg1 - 1;
			if (arg4 == 0) {
				if (arg2 == 0) {
					if (local61 == local51 - arg1 && local56 >= local66 && local791 >= local56) {
						return true;
					}
					if (local51 >= local61 && local51 <= local784 && local66 == local56 + 1 && (this.anIntArrayArray3[local51][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local61 <= local51 && local784 >= local51 && local66 == local56 - arg1 && (this.anIntArrayArray3[local51][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local61 <= local51 && local51 <= local784 && local66 == local56 + 1) {
						return true;
					}
					if (local61 == local51 - arg1 && local56 >= local66 && local791 >= local56 && (this.anIntArrayArray3[local784][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local51 + 1 == local61 && local66 <= local56 && local56 <= local791 && (this.anIntArrayArray3[local61][local56] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local51 + 1 == local61 && local66 <= local56 && local56 <= local791) {
						return true;
					}
					if (local61 <= local51 && local784 >= local51 && local56 + 1 == local66 && (this.anIntArrayArray3[local51][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local51 >= local61 && local51 <= local784 && local66 == local56 - arg1 && (this.anIntArrayArray3[local51][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local51 >= local61 && local51 <= local784 && local66 == local56 - arg1) {
						return true;
					}
					if (local51 - arg1 == local61 && local56 >= local66 && local56 <= local791 && (this.anIntArrayArray3[local784][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 == local51 + 1 && local66 <= local56 && local56 <= local791 && (this.anIntArrayArray3[local61][local56] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 2) {
				if (arg2 == 0) {
					if (local61 == local51 - arg1 && local56 >= local66 && local791 >= local56) {
						return true;
					}
					if (local51 >= local61 && local51 <= local784 && local56 + 1 == local66) {
						return true;
					}
					if (local61 == local51 + 1 && local56 >= local66 && local791 >= local56 && (this.anIntArrayArray3[local61][local56] & 0x2C0180) == 0) {
						return true;
					}
					if (local61 <= local51 && local51 <= local784 && local66 == local56 - arg1 && (this.anIntArrayArray3[local51][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 1) {
					if (local61 == local51 - arg1 && local56 >= local66 && local791 >= local56 && (this.anIntArrayArray3[local784][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local61 <= local51 && local784 >= local51 && local66 == local56 + 1) {
						return true;
					}
					if (local61 == local51 + 1 && local56 >= local66 && local791 >= local56) {
						return true;
					}
					if (local61 <= local51 && local51 <= local784 && local66 == local56 - arg1 && (this.anIntArrayArray3[local51][local791] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg2 == 2) {
					if (local61 == local51 - arg1 && local56 >= local66 && local56 <= local791 && (this.anIntArrayArray3[local784][local56] & 0x2C0108) == 0) {
						return true;
					}
					if (local51 >= local61 && local51 <= local784 && local66 == local56 + 1 && (this.anIntArrayArray3[local51][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local51 + 1 == local61 && local66 <= local56 && local56 <= local791) {
						return true;
					}
					if (local61 <= local51 && local51 <= local784 && local56 - arg1 == local66) {
						return true;
					}
				} else if (arg2 == 3) {
					if (local61 == local51 - arg1 && local56 >= local66 && local56 <= local791) {
						return true;
					}
					if (local61 <= local51 && local51 <= local784 && local56 + 1 == local66 && (this.anIntArrayArray3[local51][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local51 + 1 == local61 && local66 <= local56 && local56 <= local791 && (this.anIntArrayArray3[local61][local56] & 0x2C0180) == 0) {
						return true;
					}
					if (local51 >= local61 && local784 >= local51 && local66 == local56 - arg1) {
						return true;
					}
				}
			}
			if (arg4 == 9) {
				if (local51 >= local61 && local784 >= local51 && local56 + 1 == local66 && (this.anIntArrayArray3[local51][local66] & 0x2C0120) == 0) {
					return true;
				}
				if (local61 <= local51 && local784 >= local51 && local66 == local56 - arg1 && (this.anIntArrayArray3[local51][local791] & 0x2C0102) == 0) {
					return true;
				}
				if (local51 - arg1 == local61 && local56 >= local66 && local56 <= local791 && (this.anIntArrayArray3[local784][local56] & 0x2C0108) == 0) {
					return true;
				}
				if (local61 == local51 + 1 && local66 <= local56 && local56 <= local791 && (this.anIntArrayArray3[local61][local56] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIII)V")
	private void method525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray3[arg1][arg0] |= arg2;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public void method526() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt725; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt710; local15++) {
				if (local11 == 0 || local15 == 0 || local11 >= this.anInt725 - 5 || local15 >= this.anInt710 - 5) {
					this.anIntArrayArray3[local11][local15] = -1;
				} else {
					this.anIntArrayArray3[local11][local15] = 2097152;
				}
			}
		}
	}
}
