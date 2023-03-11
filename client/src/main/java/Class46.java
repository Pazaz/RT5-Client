import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class46 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public int anInt1472;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	public int anInt1484;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	public int anInt1487;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZIIIII)V")
	public void method1625(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 - this.anInt1468;
		@Pc(21) int local21 = arg3 - this.anInt1484;
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method1635(128, local21, local8);
				this.method1635(8, local21, local8 - 1);
			}
			if (arg4 == 1) {
				this.method1635(2, local21, local8);
				this.method1635(32, local21 + 1, local8);
			}
			if (arg4 == 2) {
				this.method1635(8, local21, local8);
				this.method1635(128, local21, local8 + 1);
			}
			if (arg4 == 3) {
				this.method1635(32, local21, local8);
				this.method1635(2, local21 - 1, local8);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method1635(1, local21, local8);
				this.method1635(16, local21 + 1, local8 - 1);
			}
			if (arg4 == 1) {
				this.method1635(4, local21, local8);
				this.method1635(64, local21 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method1635(16, local21, local8);
				this.method1635(1, local21 - 1, local8 + 1);
			}
			if (arg4 == 3) {
				this.method1635(64, local21, local8);
				this.method1635(4, local21 - 1, local8 + -1);
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				this.method1635(130, local21, local8);
				this.method1635(8, local21, local8 - 1);
				this.method1635(32, local21 + 1, local8);
			}
			if (arg4 == 1) {
				this.method1635(10, local21, local8);
				this.method1635(32, local21 + 1, local8);
				this.method1635(128, local21, local8 + 1);
			}
			if (arg4 == 2) {
				this.method1635(40, local21, local8);
				this.method1635(128, local21, local8 + 1);
				this.method1635(2, local21 - 1, local8);
			}
			if (arg4 == 3) {
				this.method1635(160, local21, local8);
				this.method1635(2, local21 - 1, local8);
				this.method1635(8, local21, local8 - 1);
			}
		}
		if (arg0) {
			if (arg5 == 0) {
				if (arg4 == 0) {
					this.method1635(65536, local21, local8);
					this.method1635(4096, local21, local8 - 1);
				}
				if (arg4 == 1) {
					this.method1635(1024, local21, local8);
					this.method1635(16384, local21 + 1, local8);
				}
				if (arg4 == 2) {
					this.method1635(4096, local21, local8);
					this.method1635(65536, local21, local8 + 1);
				}
				if (arg4 == 3) {
					this.method1635(16384, local21, local8);
					this.method1635(1024, local21 - 1, local8);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg4 == 0) {
					this.method1635(512, local21, local8);
					this.method1635(8192, local21 + 1, local8 + -1);
				}
				if (arg4 == 1) {
					this.method1635(2048, local21, local8);
					this.method1635(32768, local21 + 1, local8 + 1);
				}
				if (arg4 == 2) {
					this.method1635(8192, local21, local8);
					this.method1635(512, local21 - 1, local8 - -1);
				}
				if (arg4 == 3) {
					this.method1635(32768, local21, local8);
					this.method1635(2048, local21 - 1, local8 + -1);
				}
			}
			if (arg5 == 2) {
				if (arg4 == 0) {
					this.method1635(66560, local21, local8);
					this.method1635(4096, local21, local8 - 1);
					this.method1635(16384, local21 + 1, local8);
				}
				if (arg4 == 1) {
					this.method1635(5120, local21, local8);
					this.method1635(16384, local21 + 1, local8);
					this.method1635(65536, local21, local8 + 1);
				}
				if (arg4 == 2) {
					this.method1635(20480, local21, local8);
					this.method1635(65536, local21, local8 + 1);
					this.method1635(1024, local21 - 1, local8);
				}
				if (arg4 == 3) {
					this.method1635(81920, local21, local8);
					this.method1635(1024, local21 - 1, local8);
					this.method1635(4096, local21, local8 - 1);
				}
			}
		}
		if (!arg1) {
			return;
		}
		if (arg5 == 0) {
			if (arg4 == 0) {
				this.method1635(536870912, local21, local8);
				this.method1635(33554432, local21, local8 - 1);
			}
			if (arg4 == 1) {
				this.method1635(8388608, local21, local8);
				this.method1635(134217728, local21 + 1, local8);
			}
			if (arg4 == 2) {
				this.method1635(33554432, local21, local8);
				this.method1635(536870912, local21, local8 + 1);
			}
			if (arg4 == 3) {
				this.method1635(134217728, local21, local8);
				this.method1635(8388608, local21 - 1, local8);
			}
		}
		if (arg5 == 1 || arg5 == 3) {
			if (arg4 == 0) {
				this.method1635(4194304, local21, local8);
				this.method1635(67108864, local21 + 1, local8 - 1);
			}
			if (arg4 == 1) {
				this.method1635(16777216, local21, local8);
				this.method1635(268435456, local21 + 1, local8 + 1);
			}
			if (arg4 == 2) {
				this.method1635(67108864, local21, local8);
				this.method1635(4194304, local21 - 1, local8 - -1);
			}
			if (arg4 == 3) {
				this.method1635(268435456, local21, local8);
				this.method1635(16777216, local21 - 1, local8 + -1);
			}
		}
		if (arg5 != 2) {
			return;
		}
		if (arg4 == 0) {
			this.method1635(545259520, local21, local8);
			this.method1635(33554432, local21, local8 - 1);
			this.method1635(134217728, local21 + 1, local8);
		}
		if (arg4 == 1) {
			this.method1635(41943040, local21, local8);
			this.method1635(134217728, local21 + 1, local8);
			this.method1635(536870912, local21, local8 + 1);
		}
		if (arg4 == 2) {
			this.method1635(167772160, local21, local8);
			this.method1635(536870912, local21, local8 + 1);
			this.method1635(8388608, local21 - 1, local8);
		}
		if (arg4 == 3) {
			this.method1635(671088640, local21, local8);
			this.method1635(8388608, local21 - 1, local8);
			this.method1635(33554432, local21, local8 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method1626() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1472; local3++) {
			for (@Pc(9) int local9 = 0; local9 < this.anInt1487; local9++) {
				if (local3 == 0 || local9 == 0 || this.anInt1472 - 5 <= local3 || this.anInt1487 - 5 <= local9) {
					this.anIntArrayArray14[local3][local9] = -1;
				} else {
					this.anIntArrayArray14[local3][local9] = 2097152;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public void method1627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - this.anInt1484;
		@Pc(21) int local21 = arg0 - this.anInt1468;
		this.anIntArrayArray14[local21][local8] &= 0xFFDFFFFF;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
	public void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 - this.anInt1484;
		@Pc(16) int local16 = arg0 - this.anInt1468;
		this.anIntArrayArray14[local16][local11] &= 0xFFFBFFFF;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZIIIII)Z")
	public boolean method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 1) {
			if (arg1 == arg6 && arg5 == arg3) {
				return true;
			}
		} else if (arg6 <= arg1 && arg6 + arg0 - 1 >= arg1 && arg3 >= arg3 && arg3 + arg0 - 1 >= arg3) {
			return true;
		}
		@Pc(61) int local61 = arg3 - this.anInt1484;
		@Pc(66) int local66 = arg5 - this.anInt1484;
		@Pc(71) int local71 = arg6 - this.anInt1468;
		@Pc(76) int local76 = arg1 - this.anInt1468;
		if (arg0 == 1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					if (local76 - 1 == local71 && local61 == local66) {
						return true;
					}
					if (local76 == local71 && local66 == local61 + 1 && (this.anIntArrayArray14[local71][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local71 && local66 == local61 - 1 && (this.anIntArrayArray14[local71][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local71 == local76 && local61 + 1 == local66) {
						return true;
					}
					if (local71 == local76 - 1 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 + 1 == local71 && local61 == local66 && (this.anIntArrayArray14[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local71 == local76 + 1 && local61 == local66) {
						return true;
					}
					if (local76 == local71 && local61 + 1 == local66 && (this.anIntArrayArray14[local71][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 == local71 && local61 - 1 == local66 && (this.anIntArrayArray14[local71][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local76 && local66 == local61 - 1) {
						return true;
					}
					if (local76 - 1 == local71 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 + 1 == local71 && local61 == local66 && (this.anIntArrayArray14[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					if (local76 - 1 == local71 && local61 == local66) {
						return true;
					}
					if (local76 == local71 && local61 + 1 == local66) {
						return true;
					}
					if (local71 == local76 + 1 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local71 == local76 && local61 - 1 == local66 && (this.anIntArrayArray14[local71][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local71 == local76 - 1 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local76 && local61 + 1 == local66) {
						return true;
					}
					if (local76 + 1 == local71 && local66 == local61) {
						return true;
					}
					if (local71 == local76 && local61 - 1 == local66 && (this.anIntArrayArray14[local71][local66] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local76 - 1 == local71 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 == local76 && local66 == local61 + 1 && (this.anIntArrayArray14[local71][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 + 1 == local71 && local66 == local61) {
						return true;
					}
					if (local76 == local71 && local66 == local61 - 1) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 == local76 - 1 && local61 == local66) {
						return true;
					}
					if (local76 == local71 && local66 == local61 + 1 && (this.anIntArrayArray14[local71][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local76 + 1 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x2C0180) == 0) {
						return true;
					}
					if (local76 == local71 && local61 - 1 == local66) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local76 == local71 && local61 + 1 == local66 && (this.anIntArrayArray14[local71][local66] & 0x20) == 0) {
					return true;
				}
				if (local76 == local71 && local61 - 1 == local66 && (this.anIntArrayArray14[local71][local66] & 0x2) == 0) {
					return true;
				}
				if (local71 == local76 - 1 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x8) == 0) {
					return true;
				}
				if (local76 + 1 == local71 && local66 == local61 && (this.anIntArrayArray14[local71][local66] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(769) int local769 = arg0 + local71 - 1;
			@Pc(776) int local776 = local66 + arg0 - 1;
			if (arg2 == 0) {
				if (arg4 == 0) {
					if (local71 == local76 - arg0 && local66 <= local61 && local61 <= local776) {
						return true;
					}
					if (local71 <= local76 && local76 <= local769 && local61 + 1 == local66 && (this.anIntArrayArray14[local76][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 <= local76 && local769 >= local76 && local61 - arg0 == local66 && (this.anIntArrayArray14[local76][local776] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local76 >= local71 && local76 <= local769 && local61 + 1 == local66) {
						return true;
					}
					if (local76 - arg0 == local71 && local61 >= local66 && local61 <= local776 && (this.anIntArrayArray14[local769][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 + 1 == local71 && local61 >= local66 && local776 >= local61 && (this.anIntArrayArray14[local71][local61] & 0x2C0180) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local76 + 1 == local71 && local66 <= local61 && local776 >= local61) {
						return true;
					}
					if (local76 >= local71 && local76 <= local769 && local61 + 1 == local66 && (this.anIntArrayArray14[local76][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 >= local71 && local76 <= local769 && local61 - arg0 == local66 && (this.anIntArrayArray14[local76][local776] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local71 <= local76 && local769 >= local76 && local61 - arg0 == local66) {
						return true;
					}
					if (local71 == local76 - arg0 && local61 >= local66 && local61 <= local776 && (this.anIntArrayArray14[local769][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 + 1 == local71 && local61 >= local66 && local776 >= local61 && (this.anIntArrayArray14[local71][local61] & 0x2C0180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg4 == 0) {
					if (local76 - arg0 == local71 && local66 <= local61 && local61 <= local776) {
						return true;
					}
					if (local71 <= local76 && local769 >= local76 && local61 + 1 == local66) {
						return true;
					}
					if (local76 + 1 == local71 && local66 <= local61 && local61 <= local776 && (this.anIntArrayArray14[local71][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local76 >= local71 && local76 <= local769 && local66 == local61 - arg0 && (this.anIntArrayArray14[local76][local776] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (local76 - arg0 == local71 && local61 >= local66 && local776 >= local61 && (this.anIntArrayArray14[local769][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local76 >= local71 && local769 >= local76 && local66 == local61 + 1) {
						return true;
					}
					if (local71 == local76 + 1 && local66 <= local61 && local776 >= local61) {
						return true;
					}
					if (local71 <= local76 && local769 >= local76 && local66 == local61 - arg0 && (this.anIntArrayArray14[local76][local776] & 0x2C0102) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (local71 == local76 - arg0 && local66 <= local61 && local61 <= local776 && (this.anIntArrayArray14[local769][local61] & 0x2C0108) == 0) {
						return true;
					}
					if (local71 <= local76 && local76 <= local769 && local66 == local61 + 1 && (this.anIntArrayArray14[local76][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local76 + 1 == local71 && local66 <= local61 && local776 >= local61) {
						return true;
					}
					if (local71 <= local76 && local76 <= local769 && local66 == local61 - arg0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (local76 - arg0 == local71 && local61 >= local66 && local61 <= local776) {
						return true;
					}
					if (local71 <= local76 && local76 <= local769 && local66 == local61 + 1 && (this.anIntArrayArray14[local76][local66] & 0x2C0120) == 0) {
						return true;
					}
					if (local71 == local76 + 1 && local61 >= local66 && local776 >= local61 && (this.anIntArrayArray14[local71][local61] & 0x2C0180) == 0) {
						return true;
					}
					if (local76 >= local71 && local76 <= local769 && local66 == local61 - arg0) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (local71 <= local76 && local76 <= local769 && local66 == local61 + 1 && (this.anIntArrayArray14[local76][local66] & 0x2C0120) == 0) {
					return true;
				}
				if (local76 >= local71 && local76 <= local769 && local66 == local61 - arg0 && (this.anIntArrayArray14[local76][local776] & 0x2C0102) == 0) {
					return true;
				}
				if (local76 - arg0 == local71 && local66 <= local61 && local776 >= local61 && (this.anIntArrayArray14[local769][local61] & 0x2C0108) == 0) {
					return true;
				}
				if (local76 + 1 == local71 && local66 <= local61 && local61 <= local776 && (this.anIntArrayArray14[local71][local61] & 0x2C0180) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)Z")
	public boolean method1630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == 1) {
			if (arg3 == arg6 && arg2 == arg5) {
				return true;
			}
		} else if (arg6 >= arg3 && arg6 <= arg3 + arg1 - 1 && arg5 <= arg5 && arg1 + arg5 - 1 >= arg5) {
			return true;
		}
		@Pc(52) int local52 = arg2 - this.anInt1484;
		@Pc(63) int local63 = arg5 - this.anInt1484;
		@Pc(68) int local68 = arg3 - this.anInt1468;
		@Pc(73) int local73 = arg6 - this.anInt1468;
		if (arg1 == 1) {
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local68 == local73 + 1 && local52 == local63 && (this.anIntArrayArray14[local68][local52] & 0x80) == 0) {
						return true;
					}
					if (local73 == local68 && local52 == local63 - 1 && (this.anIntArrayArray14[local68][local52] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local68 == local73 - 1 && local52 == local63 && (this.anIntArrayArray14[local68][local52] & 0x8) == 0) {
						return true;
					}
					if (local73 == local68 && local63 - 1 == local52 && (this.anIntArrayArray14[local68][local52] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local68 == local73 - 1 && local52 == local63 && (this.anIntArrayArray14[local68][local52] & 0x8) == 0) {
						return true;
					}
					if (local68 == local73 && local52 == local63 + 1 && (this.anIntArrayArray14[local68][local52] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local68 == local73 + 1 && local52 == local63 && (this.anIntArrayArray14[local68][local52] & 0x80) == 0) {
						return true;
					}
					if (local68 == local73 && local63 + 1 == local52 && (this.anIntArrayArray14[local68][local52] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local68 == local73 && local63 + 1 == local52 && (this.anIntArrayArray14[local68][local52] & 0x20) == 0) {
					return true;
				}
				if (local73 == local68 && local63 - 1 == local52 && (this.anIntArrayArray14[local68][local52] & 0x2) == 0) {
					return true;
				}
				if (local73 - 1 == local68 && local63 == local52 && (this.anIntArrayArray14[local68][local52] & 0x8) == 0) {
					return true;
				}
				if (local68 == local73 + 1 && local63 == local52 && (this.anIntArrayArray14[local68][local52] & 0x80) == 0) {
					return true;
				}
			}
		} else {
			@Pc(82) int local82 = arg1 + local68 - 1;
			@Pc(88) int local88 = local52 + arg1 - 1;
			if (arg4 == 6 || arg4 == 7) {
				if (arg4 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (local68 == local73 + 1 && local63 >= local52 && local88 >= local63 && (this.anIntArrayArray14[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local82 && local63 - arg1 == local52 && (this.anIntArrayArray14[local73][local88] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (local68 == local73 - arg1 && local63 >= local52 && local63 <= local88 && (this.anIntArrayArray14[local82][local63] & 0x8) == 0) {
						return true;
					}
					if (local73 >= local68 && local82 >= local73 && local63 - arg1 == local52 && (this.anIntArrayArray14[local73][local88] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (local73 - arg1 == local68 && local63 >= local52 && local63 <= local88 && (this.anIntArrayArray14[local82][local63] & 0x8) == 0) {
						return true;
					}
					if (local68 <= local73 && local82 >= local73 && local52 == local63 + 1 && (this.anIntArrayArray14[local73][local52] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (local68 == local73 + 1 && local63 >= local52 && local88 >= local63 && (this.anIntArrayArray14[local68][local63] & 0x80) == 0) {
						return true;
					}
					if (local73 >= local68 && local73 <= local82 && local52 == local63 + 1 && (this.anIntArrayArray14[local73][local52] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg4 == 8) {
				if (local68 <= local73 && local73 <= local82 && local63 + 1 == local52 && (this.anIntArrayArray14[local73][local52] & 0x20) == 0) {
					return true;
				}
				if (local68 <= local73 && local82 >= local73 && local52 == local63 - arg1 && (this.anIntArrayArray14[local73][local88] & 0x2) == 0) {
					return true;
				}
				if (local68 == local73 - arg1 && local52 <= local63 && local63 <= local88 && (this.anIntArrayArray14[local82][local63] & 0x8) == 0) {
					return true;
				}
				if (local73 + 1 == local68 && local52 <= local63 && local88 >= local63 && (this.anIntArrayArray14[local68][local63] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
	private void method1633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg0][arg2] |= arg1;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(III)V")
	public void method1634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1484;
		@Pc(9) int local9 = arg1 - this.anInt1468;
		this.anIntArrayArray14[local9][local4] |= 0x40000;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBII)V")
	private void method1635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArrayArray14[arg2][arg1] &= ~arg0;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(III)V")
	public void method1636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg0 - this.anInt1484;
		@Pc(9) int local9 = arg1 - this.anInt1468;
		this.anIntArrayArray14[local9][local4] |= 0x200000;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIII)Z")
	public boolean method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 + arg7;
		@Pc(13) int local13 = arg6 + arg3;
		@Pc(23) int local23 = arg5 + arg8;
		@Pc(28) int local28 = arg2 + arg0;
		@Pc(49) int local49;
		@Pc(56) int local56;
		if (arg1 == local23 && (arg4 & 0x2) == 0) {
			local49 = arg2 >= arg6 ? arg2 : arg6;
			local56 = local28 <= local13 ? local28 : local13;
			while (local49 < local56) {
				if ((this.anIntArrayArray14[local23 - this.anInt1468 - 1][local49 - this.anInt1484] & 0x8) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local9 == arg5 && (arg4 & 0x8) == 0) {
			local49 = arg2 < arg6 ? arg6 : arg2;
			local56 = local28 <= local13 ? local28 : local13;
			while (local49 < local56) {
				if ((this.anIntArrayArray14[arg5 - this.anInt1468][local49 - this.anInt1484] & 0x80) == 0) {
					return true;
				}
				local49++;
			}
		} else if (arg6 == local28 && (arg4 & 0x1) == 0) {
			local49 = arg1 <= arg5 ? arg5 : arg1;
			local56 = local23 <= local9 ? local23 : local9;
			while (local56 > local49) {
				if ((this.anIntArrayArray14[local49 - this.anInt1468][local28 - this.anInt1484 - 1] & 0x2) == 0) {
					return true;
				}
				local49++;
			}
		} else if (local13 == arg2 && (arg4 & 0x4) == 0) {
			local49 = arg5 < arg1 ? arg1 : arg5;
			local56 = local23 <= local9 ? local23 : local9;
			while (local56 > local49) {
				if ((this.anIntArrayArray14[local49 - this.anInt1468][arg2 - this.anInt1484] & 0x20) == 0) {
					return true;
				}
				local49++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIZIZB)V")
	public void method1638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(4) int local4 = arg2 - this.anInt1468;
		@Pc(9) int local9 = arg1 - this.anInt1484;
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method1633(local4, 128, local9);
				this.method1633(local4 - 1, 8, local9);
			}
			if (arg0 == 1) {
				this.method1633(local4, 2, local9);
				this.method1633(local4, 32, local9 + 1);
			}
			if (arg0 == 2) {
				this.method1633(local4, 8, local9);
				this.method1633(local4 + 1, 128, local9);
			}
			if (arg0 == 3) {
				this.method1633(local4, 32, local9);
				this.method1633(local4, 2, local9 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method1633(local4, 1, local9);
				this.method1633(local4 - 1, 16, local9 + 1);
			}
			if (arg0 == 1) {
				this.method1633(local4, 4, local9);
				this.method1633(local4 + 1, 64, local9 + 1);
			}
			if (arg0 == 2) {
				this.method1633(local4, 16, local9);
				this.method1633(local4 + 1, 1, local9 - 1);
			}
			if (arg0 == 3) {
				this.method1633(local4, 64, local9);
				this.method1633(local4 - 1, 4, local9 - 1);
			}
		}
		if (arg4 == 2) {
			if (arg0 == 0) {
				this.method1633(local4, 130, local9);
				this.method1633(local4 - 1, 8, local9);
				this.method1633(local4, 32, local9 + 1);
			}
			if (arg0 == 1) {
				this.method1633(local4, 10, local9);
				this.method1633(local4, 32, local9 + 1);
				this.method1633(local4 + 1, 128, local9);
			}
			if (arg0 == 2) {
				this.method1633(local4, 40, local9);
				this.method1633(local4 + 1, 128, local9);
				this.method1633(local4, 2, local9 - 1);
			}
			if (arg0 == 3) {
				this.method1633(local4, 160, local9);
				this.method1633(local4, 2, local9 - 1);
				this.method1633(local4 - 1, 8, local9);
			}
		}
		if (arg3) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					this.method1633(local4, 65536, local9);
					this.method1633(local4 - 1, 4096, local9);
				}
				if (arg0 == 1) {
					this.method1633(local4, 1024, local9);
					this.method1633(local4, 16384, local9 + 1);
				}
				if (arg0 == 2) {
					this.method1633(local4, 4096, local9);
					this.method1633(local4 + 1, 65536, local9);
				}
				if (arg0 == 3) {
					this.method1633(local4, 16384, local9);
					this.method1633(local4, 1024, local9 - 1);
				}
			}
			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					this.method1633(local4, 512, local9);
					this.method1633(local4 - 1, 8192, local9 + 1);
				}
				if (arg0 == 1) {
					this.method1633(local4, 2048, local9);
					this.method1633(local4 + 1, 32768, local9 + 1);
				}
				if (arg0 == 2) {
					this.method1633(local4, 8192, local9);
					this.method1633(local4 + 1, 512, local9 - 1);
				}
				if (arg0 == 3) {
					this.method1633(local4, 32768, local9);
					this.method1633(local4 - 1, 2048, local9 - 1);
				}
			}
			if (arg4 == 2) {
				if (arg0 == 0) {
					this.method1633(local4, 66560, local9);
					this.method1633(local4 - 1, 4096, local9);
					this.method1633(local4, 16384, local9 + 1);
				}
				if (arg0 == 1) {
					this.method1633(local4, 5120, local9);
					this.method1633(local4, 16384, local9 + 1);
					this.method1633(local4 + 1, 65536, local9);
				}
				if (arg0 == 2) {
					this.method1633(local4, 20480, local9);
					this.method1633(local4 + 1, 65536, local9);
					this.method1633(local4, 1024, local9 - 1);
				}
				if (arg0 == 3) {
					this.method1633(local4, 81920, local9);
					this.method1633(local4, 1024, local9 - 1);
					this.method1633(local4 - 1, 4096, local9);
				}
			}
		}
		if (!arg5) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 == 0) {
				this.method1633(local4, 536870912, local9);
				this.method1633(local4 - 1, 33554432, local9);
			}
			if (arg0 == 1) {
				this.method1633(local4, 8388608, local9);
				this.method1633(local4, 134217728, local9 + 1);
			}
			if (arg0 == 2) {
				this.method1633(local4, 33554432, local9);
				this.method1633(local4 + 1, 536870912, local9);
			}
			if (arg0 == 3) {
				this.method1633(local4, 134217728, local9);
				this.method1633(local4, 8388608, local9 - 1);
			}
		}
		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				this.method1633(local4, 4194304, local9);
				this.method1633(local4 - 1, 67108864, local9 + 1);
			}
			if (arg0 == 1) {
				this.method1633(local4, 16777216, local9);
				this.method1633(local4 + 1, 268435456, local9 + 1);
			}
			if (arg0 == 2) {
				this.method1633(local4, 67108864, local9);
				this.method1633(local4 + 1, 4194304, local9 - 1);
			}
			if (arg0 == 3) {
				this.method1633(local4, 268435456, local9);
				this.method1633(local4 - 1, 16777216, local9 - 1);
			}
		}
		if (arg4 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.method1633(local4, 545259520, local9);
			this.method1633(local4 - 1, 33554432, local9);
			this.method1633(local4, 134217728, local9 + 1);
		}
		if (arg0 == 1) {
			this.method1633(local4, 41943040, local9);
			this.method1633(local4, 134217728, local9 + 1);
			this.method1633(local4 + 1, 536870912, local9);
		}
		if (arg0 == 2) {
			this.method1633(local4, 167772160, local9);
			this.method1633(local4 + 1, 536870912, local9);
			this.method1633(local4, 8388608, local9 - 1);
		}
		if (arg0 == 3) {
			this.method1633(local4, 671088640, local9);
			this.method1633(local4, 8388608, local9 - 1);
			this.method1633(local4 - 1, 33554432, local9);
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIZIZI)V")
	public void method1639(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 256;
		if (arg0) {
			local7 = 131328;
		}
		@Pc(23) int local23 = arg4 - this.anInt1484;
		if (arg3) {
			local7 |= 0x40000000;
		}
		@Pc(34) int local34 = arg2 - this.anInt1468;
		for (@Pc(36) int local36 = local34; local36 < arg5 + local34; local36++) {
			if (local36 >= 0 && local36 < this.anInt1472) {
				for (@Pc(50) int local50 = local23; local50 < arg1 + local23; local50++) {
					if (local50 >= 0 && this.anInt1487 > local50) {
						this.method1633(local36, local7, local50);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIII)Z")
	public boolean method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > 1) {
			return Static24.method856(arg2, arg6, arg4, arg3, arg1, arg7, arg5, arg7) ? true : this.method1637(arg2, arg3, arg4, arg7, arg0, arg1, arg6, arg7, arg5);
		}
		@Pc(51) int local51 = arg5 + arg1 - 1;
		@Pc(57) int local57 = arg2 + arg4 - 1;
		if (arg1 <= arg3 && arg3 <= local51 && arg6 >= arg4 && arg6 <= local57) {
			return true;
		} else if (arg1 - 1 == arg3 && arg4 <= arg6 && arg6 <= local57 && (this.anIntArrayArray14[arg3 - this.anInt1468][arg6 - this.anInt1484] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		} else if (arg3 == local51 + 1 && arg4 <= arg6 && local57 >= arg6 && (this.anIntArrayArray14[arg3 - this.anInt1468][arg6 - this.anInt1484] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		} else if (arg6 == arg4 - 1 && arg1 <= arg3 && local51 >= arg3 && (this.anIntArrayArray14[arg3 - this.anInt1468][arg6 - this.anInt1484] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		} else {
			return local57 + 1 == arg6 && arg3 >= arg1 && arg3 <= local51 && (this.anIntArrayArray14[arg3 - this.anInt1468][arg6 - this.anInt1484] & 0x20) == 0 && (arg0 & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZZBIII)V")
	public void method1641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 256;
		if (arg3) {
			local7 = 131328;
		}
		if (arg2) {
			local7 |= 0x40000000;
		}
		@Pc(24) int local24 = arg5 - this.anInt1484;
		@Pc(29) int local29 = arg4 - this.anInt1468;
		@Pc(39) int local39;
		if (arg0 == 1 || arg0 == 3) {
			local39 = arg1;
			arg1 = arg6;
			arg6 = local39;
		}
		for (local39 = local29; local39 < local29 + arg1; local39++) {
			if (local39 >= 0 && local39 < this.anInt1472) {
				for (@Pc(64) int local64 = local24; local64 < local24 + arg6; local64++) {
					if (local64 >= 0 && this.anInt1487 > local64) {
						this.method1635(local7, local64, local39);
					}
				}
			}
		}
	}
}
