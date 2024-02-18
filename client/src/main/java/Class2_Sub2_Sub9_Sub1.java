import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class2_Sub2_Sub9_Sub1 extends Class2_Sub2_Sub9 {

	@OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
	public int anInt2320;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
	public int anInt2325;

	@OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
	public int anInt2328;

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!am;II)V")
	public Class2_Sub2_Sub9_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray22 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZI)Z")
	public boolean method2192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray22.length;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII)V")
	public void method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2326 = arg3;
		this.anInt2325 = arg1 - arg0;
		this.anInt2320 = arg2 - arg3;
		this.anInt2328 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	public void method2196() {
		@Pc(11) int local11 = -1;
		@Pc(17) int local17 = this.aByteArray22.length - 8;
		while (local11 < local17) {
			local11++;
			this.aByteArray22[local11] = 0;
			local11++;
			this.aByteArray22[local11] = 0;
			local11++;
			this.aByteArray22[local11] = 0;
			local11++;
			this.aByteArray22[local11] = 0;
			local11++;
			this.aByteArray22[local11] = 0;
			local11++;
			this.aByteArray22[local11] = 0;
			local11++;
			this.aByteArray22[local11] = 0;
			local11++;
			this.aByteArray22[local11] = 0;
		}
		while (this.aByteArray22.length - 1 > local11) {
			local11++;
			this.aByteArray22[local11] = 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)V")
	public void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg3) {
			local7 = (arg1 - arg2 << 16) / (arg3 - arg4);
		}
		@Pc(23) int local23 = 0;
		if (arg3 != arg5) {
			local23 = (arg0 - arg1 << 16) / (arg5 - arg3);
		}
		@Pc(44) int local44 = 0;
		if (arg5 != arg4) {
			local44 = (arg2 - arg0 << 16) / (arg4 - arg5);
		}
		if (arg4 <= arg3 && arg4 <= arg5) {
			if (arg3 < arg5) {
				arg0 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local44 * arg4;
					arg2 -= arg4 * local7;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local23;
					arg3 = 0;
				}
				if (arg3 != arg4 && local44 < local7 || arg3 == arg4 && local23 < local44) {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt2320 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static368.method5270(arg0 >> 16, this.aByteArray22, arg4, arg1 >> 16);
								arg0 += local44;
								arg1 += local23;
								arg4 += this.anInt2320;
							}
						}
						Static368.method5270(arg0 >> 16, this.aByteArray22, arg4, arg2 >> 16);
						arg4 += this.anInt2320;
						arg0 += local44;
						arg2 += local7;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt2320 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static368.method5270(arg1 >> 16, this.aByteArray22, arg4, arg0 >> 16);
								arg4 += this.anInt2320;
								arg0 += local44;
								arg1 += local23;
							}
						}
						Static368.method5270(arg2 >> 16, this.aByteArray22, arg4, arg0 >> 16);
						arg2 += local7;
						arg4 += this.anInt2320;
						arg0 += local44;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= local7 * arg4;
					arg1 -= local44 * arg4;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local23;
					arg5 = 0;
				}
				if ((arg4 == arg5 || local7 <= local44) && (arg4 != arg5 || local23 <= local7)) {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt2320 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static368.method5270(arg2 >> 16, this.aByteArray22, arg4, arg0 >> 16);
								arg0 += local23;
								arg2 += local7;
								arg4 += this.anInt2320;
							}
						}
						Static368.method5270(arg2 >> 16, this.aByteArray22, arg4, arg1 >> 16);
						arg4 += this.anInt2320;
						arg2 += local7;
						arg1 += local44;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt2320;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static368.method5270(arg0 >> 16, this.aByteArray22, arg4, arg2 >> 16);
								arg0 += local23;
								arg4 += this.anInt2320;
								arg2 += local7;
							}
						}
						Static368.method5270(arg1 >> 16, this.aByteArray22, arg4, arg2 >> 16);
						arg1 += local44;
						arg2 += local7;
						arg4 += this.anInt2320;
					}
				}
			}
		} else if (arg5 >= arg3) {
			if (arg4 > arg5) {
				arg2 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local23 * arg3;
					arg2 -= arg3 * local7;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local44;
					arg5 = 0;
				}
				if (arg5 != arg3 && local7 < local23 || arg5 == arg3 && local44 < local7) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt2320 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static368.method5270(arg2 >> 16, this.aByteArray22, arg3, arg0 >> 16);
								arg2 += local7;
								arg0 += local44;
								arg3 += this.anInt2320;
							}
						}
						Static368.method5270(arg2 >> 16, this.aByteArray22, arg3, arg1 >> 16);
						arg2 += local7;
						arg1 += local23;
						arg3 += this.anInt2320;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt2320 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static368.method5270(arg0 >> 16, this.aByteArray22, arg3, arg2 >> 16);
								arg0 += local44;
								arg2 += local7;
								arg3 += this.anInt2320;
							}
						}
						Static368.method5270(arg1 >> 16, this.aByteArray22, arg3, arg2 >> 16);
						arg1 += local23;
						arg3 += this.anInt2320;
						arg2 += local7;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local23 * arg3;
					arg0 -= arg3 * local7;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg2 -= arg4 * local44;
					arg4 = 0;
				}
				if (local7 < local23) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt2320 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static368.method5270(arg2 >> 16, this.aByteArray22, arg3, arg1 >> 16);
								arg1 += local23;
								arg3 += this.anInt2320;
								arg2 += local44;
							}
						}
						Static368.method5270(arg0 >> 16, this.aByteArray22, arg3, arg1 >> 16);
						arg3 += this.anInt2320;
						arg0 += local7;
						arg1 += local23;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt2320;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static368.method5270(arg1 >> 16, this.aByteArray22, arg3, arg2 >> 16);
								arg1 += local23;
								arg2 += local44;
								arg3 += this.anInt2320;
							}
						}
						Static368.method5270(arg1 >> 16, this.aByteArray22, arg3, arg0 >> 16);
						arg0 += local7;
						arg1 += local23;
						arg3 += this.anInt2320;
					}
				}
			}
		} else if (arg3 > arg4) {
			arg1 = arg0 <<= 0x10;
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= local44 * arg5;
				arg1 -= local23 * arg5;
				arg5 = 0;
			}
			if (arg4 < 0) {
				arg2 -= arg4 * local7;
				arg4 = 0;
			}
			if (local44 > local23) {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt2320 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static368.method5270(arg1 >> 16, this.aByteArray22, arg5, arg2 >> 16);
							arg5 += this.anInt2320;
							arg2 += local7;
							arg1 += local23;
						}
					}
					Static368.method5270(arg1 >> 16, this.aByteArray22, arg5, arg0 >> 16);
					arg1 += local23;
					arg0 += local44;
					arg5 += this.anInt2320;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 *= this.anInt2320;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static368.method5270(arg2 >> 16, this.aByteArray22, arg5, arg1 >> 16);
							arg2 += local7;
							arg1 += local23;
							arg5 += this.anInt2320;
						}
					}
					Static368.method5270(arg0 >> 16, this.aByteArray22, arg5, arg1 >> 16);
					arg5 += this.anInt2320;
					arg1 += local23;
					arg0 += local44;
				}
			}
		} else {
			arg2 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= local23 * arg5;
				arg0 -= arg5 * local44;
				arg5 = 0;
			}
			if (arg3 < 0) {
				arg1 -= arg3 * local7;
				arg3 = 0;
			}
			if (local44 <= local23) {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 = this.anInt2320 * arg5;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static368.method5270(arg0 >> 16, this.aByteArray22, arg5, arg1 >> 16);
							arg1 += local7;
							arg5 += this.anInt2320;
							arg0 += local44;
						}
					}
					Static368.method5270(arg0 >> 16, this.aByteArray22, arg5, arg2 >> 16);
					arg0 += local44;
					arg2 += local23;
					arg5 += this.anInt2320;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 = this.anInt2320 * arg5;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static368.method5270(arg1 >> 16, this.aByteArray22, arg5, arg0 >> 16);
							arg5 += this.anInt2320;
							arg0 += local44;
							arg1 += local7;
						}
					}
					Static368.method5270(arg2 >> 16, this.aByteArray22, arg5, arg0 >> 16);
					arg5 += this.anInt2320;
					arg2 += local23;
					arg0 += local44;
				}
			}
		}
	}
}
