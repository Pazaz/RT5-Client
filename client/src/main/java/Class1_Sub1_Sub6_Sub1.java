import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub1_Sub6_Sub1 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
	public int anInt1929;

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
	public int anInt1930;

	@OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
	public int anInt1931;

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
	public int anInt1932;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class1_Sub1_Sub6_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray10 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIII)V")
	public void method1625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1930 = arg2;
		this.anInt1932 = arg3 - arg2;
		this.anInt1929 = arg0 - arg1;
		this.anInt1931 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZI)Z")
	public boolean method1626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray10.length;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	public void method1628() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray10.length - 8;
		while (local19 > local13) {
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
			local13++;
			this.aByteArray10[local13] = 0;
		}
		while (this.aByteArray10.length - 1 > local13) {
			local13++;
			this.aByteArray10[local13] = 0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII)V")
	public void method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg2 != arg3) {
			local1 = (arg5 - arg1 << 16) / (arg3 - arg2);
		}
		@Pc(22) int local22 = 0;
		if (arg3 != arg4) {
			local22 = (arg0 - arg5 << 16) / (arg4 - arg3);
		}
		@Pc(43) int local43 = 0;
		if (arg4 != arg2) {
			local43 = (arg1 - arg0 << 16) / (arg2 - arg4);
		}
		if (arg3 >= arg2 && arg4 >= arg2) {
			if (arg4 <= arg3) {
				arg5 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= arg2 * local43;
					arg1 -= local1 * arg2;
					arg2 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local22 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg2 && local43 < local1 || arg4 == arg2 && local1 < local22) {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 *= this.anInt1932;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg2, arg0 >> 16, arg1 >> 16);
								arg1 += local1;
								arg0 += local22;
								arg2 += this.anInt1932;
							}
						}
						Static359.method1627(this.aByteArray10, arg2, arg5 >> 16, arg1 >> 16);
						arg2 += this.anInt1932;
						arg1 += local1;
						arg5 += local43;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg2;
					arg2 = this.anInt1932 * arg2;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg2, arg1 >> 16, arg0 >> 16);
								arg0 += local22;
								arg1 += local1;
								arg2 += this.anInt1932;
							}
						}
						Static359.method1627(this.aByteArray10, arg2, arg1 >> 16, arg5 >> 16);
						arg5 += local43;
						arg2 += this.anInt1932;
						arg1 += local1;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local43;
					arg1 -= arg2 * local1;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg5 -= local22 * arg3;
					arg3 = 0;
				}
				if (arg2 != arg3 && local43 < local1 || arg3 == arg2 && local43 > local22) {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt1932 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg2, arg0 >> 16, arg5 >> 16);
								arg2 += this.anInt1932;
								arg5 += local22;
								arg0 += local43;
							}
						}
						Static359.method1627(this.aByteArray10, arg2, arg0 >> 16, arg1 >> 16);
						arg1 += local1;
						arg0 += local43;
						arg2 += this.anInt1932;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt1932;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg2, arg5 >> 16, arg0 >> 16);
								arg0 += local43;
								arg5 += local22;
								arg2 += this.anInt1932;
							}
						}
						Static359.method1627(this.aByteArray10, arg2, arg1 >> 16, arg0 >> 16);
						arg1 += local1;
						arg0 += local43;
						arg2 += this.anInt1932;
					}
				}
			}
		} else if (arg3 <= arg4) {
			if (arg4 < arg2) {
				arg1 = arg5 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local22 * arg3;
					arg1 -= local1 * arg3;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg0 -= arg4 * local43;
					arg4 = 0;
				}
				if (arg3 != arg4 && local22 > local1 || arg4 == arg3 && local43 < local1) {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt1932;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg3, arg1 >> 16, arg0 >> 16);
								arg3 += this.anInt1932;
								arg0 += local43;
								arg1 += local1;
							}
						}
						Static359.method1627(this.aByteArray10, arg3, arg1 >> 16, arg5 >> 16);
						arg3 += this.anInt1932;
						arg5 += local22;
						arg1 += local1;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt1932;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg3, arg0 >> 16, arg1 >> 16);
								arg0 += local43;
								arg3 += this.anInt1932;
								arg1 += local1;
							}
						}
						Static359.method1627(this.aByteArray10, arg3, arg5 >> 16, arg1 >> 16);
						arg1 += local1;
						arg5 += local22;
						arg3 += this.anInt1932;
					}
				}
			} else {
				arg0 = arg5 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local1;
					arg5 -= arg3 * local22;
					arg3 = 0;
				}
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local43 * arg2;
					arg2 = 0;
				}
				if (local1 < local22) {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt1932 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg3, arg1 >> 16, arg5 >> 16);
								arg5 += local22;
								arg1 += local43;
								arg3 += this.anInt1932;
							}
						}
						Static359.method1627(this.aByteArray10, arg3, arg0 >> 16, arg5 >> 16);
						arg3 += this.anInt1932;
						arg5 += local22;
						arg0 += local1;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt1932;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static359.method1627(this.aByteArray10, arg3, arg5 >> 16, arg1 >> 16);
								arg3 += this.anInt1932;
								arg1 += local43;
								arg5 += local22;
							}
						}
						Static359.method1627(this.aByteArray10, arg3, arg5 >> 16, arg0 >> 16);
						arg0 += local1;
						arg3 += this.anInt1932;
						arg5 += local22;
					}
				}
			}
		} else if (arg2 >= arg3) {
			arg1 = arg0 <<= 0x10;
			arg5 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local22;
				arg0 -= local43 * arg4;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg5 -= local1 * arg3;
				arg3 = 0;
			}
			if (local22 < local43) {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt1932;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static359.method1627(this.aByteArray10, arg4, arg5 >> 16, arg0 >> 16);
							arg4 += this.anInt1932;
							arg0 += local43;
							arg5 += local1;
						}
					}
					Static359.method1627(this.aByteArray10, arg4, arg1 >> 16, arg0 >> 16);
					arg4 += this.anInt1932;
					arg0 += local43;
					arg1 += local22;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt1932 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static359.method1627(this.aByteArray10, arg4, arg0 >> 16, arg5 >> 16);
							arg0 += local43;
							arg4 += this.anInt1932;
							arg5 += local1;
						}
					}
					Static359.method1627(this.aByteArray10, arg4, arg0 >> 16, arg1 >> 16);
					arg4 += this.anInt1932;
					arg0 += local43;
					arg1 += local22;
				}
			}
		} else {
			arg5 = arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= local43 * arg4;
				arg5 -= local22 * arg4;
				arg4 = 0;
			}
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= arg2 * local1;
				arg2 = 0;
			}
			if (local43 > local22) {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 *= this.anInt1932;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static359.method1627(this.aByteArray10, arg4, arg5 >> 16, arg1 >> 16);
							arg4 += this.anInt1932;
							arg5 += local22;
							arg1 += local1;
						}
					}
					Static359.method1627(this.aByteArray10, arg4, arg5 >> 16, arg0 >> 16);
					arg4 += this.anInt1932;
					arg0 += local43;
					arg5 += local22;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg4;
				arg4 = this.anInt1932 * arg4;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static359.method1627(this.aByteArray10, arg4, arg1 >> 16, arg5 >> 16);
							arg4 += this.anInt1932;
							arg5 += local22;
							arg1 += local1;
						}
					}
					Static359.method1627(this.aByteArray10, arg4, arg0 >> 16, arg5 >> 16);
					arg5 += local22;
					arg4 += this.anInt1932;
					arg0 += local43;
				}
			}
		}
	}
}
