import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
	public int anInt2813;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
	private int anInt2816;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
	private int anInt2817;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
	public int anInt2821;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
	private final int anInt2814;

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
	private final int anInt2822;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
	private int anInt2815;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
	private int anInt2819;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	private int anInt2810;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
	public int anInt2820;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ok;II)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class1_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub13_5 = arg0;
		this.anInt2814 = arg0.anInt4951;
		this.anInt2822 = arg0.anInt4949;
		this.aBoolean188 = arg0.aBoolean343;
		this.anInt2815 = arg1;
		this.anInt2819 = arg2;
		this.anInt2810 = 8192;
		this.anInt2820 = 0;
		this.method2332();
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ok;III)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class1_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub13_5 = arg0;
		this.anInt2814 = arg0.anInt4951;
		this.anInt2822 = arg0.anInt4949;
		this.aBoolean188 = arg0.aBoolean343;
		this.anInt2815 = arg1;
		this.anInt2819 = arg2;
		this.anInt2810 = arg3;
		this.anInt2820 = 0;
		this.method2332();
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "()I")
	@Override
	public int method4456() {
		return this.anInt2819 == 0 && this.anInt2816 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "()V")
	private void method2332() {
		this.anInt2821 = this.anInt2819;
		this.anInt2813 = Static362.method2342(this.anInt2819, this.anInt2810);
		this.anInt2811 = Static362.method2340(this.anInt2819, this.anInt2810);
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "()Z")
	public boolean method2333() {
		return this.anInt2816 != 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII)I")
	private int method2336(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2816 <= 0) {
				if (this.anInt2815 == -256 && (this.anInt2820 & 0xFF) == 0) {
					if (Class1_Sub2_Sub1_Sub1.lb) {
						return Static362.method2367(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, arg3, arg2, this);
					}
					return Static362.method2331(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, arg3, arg2, this);
				}
				if (Class1_Sub2_Sub1_Sub1.lb) {
					return Static362.method2344(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, arg3, arg2, this, this.anInt2815, arg4);
				}
				return Static362.method2360(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, arg3, arg2, this, this.anInt2815, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2816;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2816 += arg1;
			if (this.anInt2815 == -256 && (this.anInt2820 & 0xFF) == 0) {
				if (Class1_Sub2_Sub1_Sub1.lb) {
					arg1 = Static362.method2369(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, this.anInt2818, this.anInt2812, local5, arg2, this);
				} else {
					arg1 = Static362.method2341(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, this.anInt2809, local5, arg2, this);
				}
			} else if (Class1_Sub2_Sub1_Sub1.lb) {
				arg1 = Static362.method2334(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, this.anInt2818, this.anInt2812, local5, arg2, this, this.anInt2815, arg4);
			} else {
				arg1 = Static362.method2357(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, this.anInt2809, local5, arg2, this, this.anInt2815, arg4);
			}
			this.anInt2816 -= arg1;
			if (this.anInt2816 != 0) {
				return arg1;
			}
		} while (!this.method2359());
		return arg3;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
	public synchronized void method2337() {
		this.anInt2815 = (this.anInt2815 ^ this.anInt2815 >> 31) + (this.anInt2815 >>> 31);
		this.anInt2815 = -this.anInt2815;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "()I")
	@Override
	public int method4455() {
		@Pc(6) int local6 = this.anInt2821 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt2817 == 0) {
			local6 -= local6 * this.anInt2820 / (((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68.length << 8);
		} else if (this.anInt2817 >= 0) {
			local6 -= local6 * this.anInt2814 / ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
	private synchronized void method2338() {
		this.method2356(0, this.method2339());
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "()I")
	public synchronized int method2339() {
		return this.anInt2810 < 0 ? -1 : this.anInt2810;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "()Lclient!af;")
	@Override
	public Class1_Sub3 method4453() {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2819 == 0 && this.anInt2816 == 0) {
			this.method4454(arg2);
			return;
		}
		@Pc(13) Class1_Sub13_Sub1 local13 = (Class1_Sub13_Sub1) super.aClass1_Sub13_5;
		@Pc(18) int local18 = this.anInt2814 << 8;
		@Pc(23) int local23 = this.anInt2822 << 8;
		@Pc(29) int local29 = local13.aByteArray68.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt2817 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt2820 < 0) {
			if (this.anInt2815 <= 0) {
				this.method2350();
				this.method6172();
				return;
			}
			this.anInt2820 = 0;
		}
		if (this.anInt2820 >= local29) {
			if (this.anInt2815 >= 0) {
				this.method2350();
				this.method6172();
				return;
			}
			this.anInt2820 = local29 - 1;
		}
		if (this.anInt2817 >= 0) {
			if (this.anInt2817 > 0) {
				if (this.aBoolean188) {
					label130: {
						if (this.anInt2815 < 0) {
							local40 = this.method2336(arg0, arg1, local18, local44, local13.aByteArray68[this.anInt2814]);
							if (this.anInt2820 >= local18) {
								return;
							}
							this.anInt2820 = local18 + local18 - this.anInt2820 - 1;
							this.anInt2815 = -this.anInt2815;
							if (--this.anInt2817 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method2365(arg0, local40, local23, local44, local13.aByteArray68[this.anInt2822 - 1]);
							if (this.anInt2820 < local23) {
								return;
							}
							this.anInt2820 = local23 + local23 - this.anInt2820 - 1;
							this.anInt2815 = -this.anInt2815;
							if (--this.anInt2817 == 0) {
								break;
							}
							local40 = this.method2336(arg0, local40, local18, local44, local13.aByteArray68[this.anInt2814]);
							if (this.anInt2820 >= local18) {
								return;
							}
							this.anInt2820 = local18 + local18 - this.anInt2820 - 1;
							this.anInt2815 = -this.anInt2815;
						} while (--this.anInt2817 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt2815 < 0) {
						while (true) {
							local40 = this.method2336(arg0, local40, local18, local44, local13.aByteArray68[this.anInt2822 - 1]);
							if (this.anInt2820 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt2820 - 1) / local33;
							if (local416 >= this.anInt2817) {
								this.anInt2820 += local33 * this.anInt2817;
								this.anInt2817 = 0;
								break;
							}
							this.anInt2820 += local33 * local416;
							this.anInt2817 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method2365(arg0, local40, local23, local44, local13.aByteArray68[this.anInt2814]);
							if (this.anInt2820 < local23) {
								return;
							}
							local416 = (this.anInt2820 - local18) / local33;
							if (local416 >= this.anInt2817) {
								this.anInt2820 -= local33 * this.anInt2817;
								this.anInt2817 = 0;
								break;
							}
							this.anInt2820 -= local33 * local416;
							this.anInt2817 -= local416;
						}
					}
				}
			}
			if (this.anInt2815 < 0) {
				this.method2336(arg0, local40, 0, local44, 0);
				if (this.anInt2820 < 0) {
					this.anInt2820 = -1;
					this.method2350();
					this.method6172();
					return;
				}
			} else {
				this.method2365(arg0, local40, local29, local44, 0);
				if (this.anInt2820 >= local29) {
					this.anInt2820 = local29;
					this.method2350();
					this.method6172();
				}
			}
		} else if (this.aBoolean188) {
			if (this.anInt2815 < 0) {
				local40 = this.method2336(arg0, arg1, local18, local44, local13.aByteArray68[this.anInt2814]);
				if (this.anInt2820 >= local18) {
					return;
				}
				this.anInt2820 = local18 + local18 - this.anInt2820 - 1;
				this.anInt2815 = -this.anInt2815;
			}
			while (true) {
				local40 = this.method2365(arg0, local40, local23, local44, local13.aByteArray68[this.anInt2822 - 1]);
				if (this.anInt2820 < local23) {
					return;
				}
				this.anInt2820 = local23 + local23 - this.anInt2820 - 1;
				this.anInt2815 = -this.anInt2815;
				local40 = this.method2336(arg0, local40, local18, local44, local13.aByteArray68[this.anInt2814]);
				if (this.anInt2820 >= local18) {
					return;
				}
				this.anInt2820 = local18 + local18 - this.anInt2820 - 1;
				this.anInt2815 = -this.anInt2815;
			}
		} else if (this.anInt2815 < 0) {
			while (true) {
				local40 = this.method2336(arg0, local40, local18, local44, local13.aByteArray68[this.anInt2822 - 1]);
				if (this.anInt2820 >= local18) {
					return;
				}
				this.anInt2820 = local23 - (local23 - 1 - this.anInt2820) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method2365(arg0, local40, local23, local44, local13.aByteArray68[this.anInt2814]);
				if (this.anInt2820 < local23) {
					return;
				}
				this.anInt2820 = local18 + (this.anInt2820 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "()I")
	public synchronized int method2343() {
		return this.anInt2815 < 0 ? -this.anInt2815 : this.anInt2815;
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "()Z")
	public boolean method2345() {
		return this.anInt2820 < 0 || this.anInt2820 >= ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68.length << 8;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
	public synchronized void method2347(@OriginalArg(0) int arg0) {
		this.method2356(arg0 << 6, this.method2339());
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
	public synchronized void method2348(@OriginalArg(0) int arg0) {
		if (this.anInt2815 < 0) {
			this.anInt2815 = -arg0;
		} else {
			this.anInt2815 = arg0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)V")
	public synchronized void method2349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method2355(arg0, arg1, this.method2339());
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "()V")
	private void method2350() {
		if (this.anInt2816 == 0) {
			return;
		}
		if (this.anInt2819 == Integer.MIN_VALUE) {
			this.anInt2819 = 0;
		}
		this.anInt2816 = 0;
		this.method2332();
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	public synchronized void method2353(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt2820 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public synchronized void method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method2356(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static362.method2342(arg1, arg2);
		@Pc(14) int local14 = Static362.method2340(arg1, arg2);
		if (this.anInt2813 == local10 && this.anInt2811 == local14) {
			this.anInt2816 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt2821;
		if (this.anInt2821 - arg1 > local31) {
			local31 = this.anInt2821 - arg1;
		}
		if (local10 - this.anInt2813 > local31) {
			local31 = local10 - this.anInt2813;
		}
		if (this.anInt2813 - local10 > local31) {
			local31 = this.anInt2813 - local10;
		}
		if (local14 - this.anInt2811 > local31) {
			local31 = local14 - this.anInt2811;
		}
		if (this.anInt2811 - local14 > local31) {
			local31 = this.anInt2811 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt2816 = arg0;
		this.anInt2819 = arg1;
		this.anInt2810 = arg2;
		this.anInt2809 = (arg1 - this.anInt2821) / arg0;
		this.anInt2818 = (local10 - this.anInt2813) / arg0;
		this.anInt2812 = (local14 - this.anInt2811) / arg0;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(II)V")
	private synchronized void method2356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2819 = arg0;
		this.anInt2810 = arg1;
		this.anInt2816 = 0;
		this.method2332();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "()Lclient!af;")
	@Override
	public Class1_Sub3 method4451() {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "()Z")
	private boolean method2359() {
		@Pc(2) int local2 = this.anInt2819;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static362.method2342(local2, this.anInt2810);
			local8 = Static362.method2340(local2, this.anInt2810);
		}
		if (this.anInt2821 != local2 || this.anInt2813 != local10 || this.anInt2811 != local8) {
			if (this.anInt2821 < local2) {
				this.anInt2809 = 1;
				this.anInt2816 = local2 - this.anInt2821;
			} else if (this.anInt2821 > local2) {
				this.anInt2809 = -1;
				this.anInt2816 = this.anInt2821 - local2;
			} else {
				this.anInt2809 = 0;
			}
			if (this.anInt2813 < local10) {
				this.anInt2818 = 1;
				if (this.anInt2816 == 0 || this.anInt2816 > local10 - this.anInt2813) {
					this.anInt2816 = local10 - this.anInt2813;
				}
			} else if (this.anInt2813 > local10) {
				this.anInt2818 = -1;
				if (this.anInt2816 == 0 || this.anInt2816 > this.anInt2813 - local10) {
					this.anInt2816 = this.anInt2813 - local10;
				}
			} else {
				this.anInt2818 = 0;
			}
			if (this.anInt2811 < local8) {
				this.anInt2812 = 1;
				if (this.anInt2816 == 0 || this.anInt2816 > local8 - this.anInt2811) {
					this.anInt2816 = local8 - this.anInt2811;
				}
			} else if (this.anInt2811 > local8) {
				this.anInt2812 = -1;
				if (this.anInt2816 == 0 || this.anInt2816 > this.anInt2811 - local8) {
					this.anInt2816 = this.anInt2811 - local8;
				}
			} else {
				this.anInt2812 = 0;
			}
			return false;
		} else if (this.anInt2819 == Integer.MIN_VALUE) {
			this.anInt2819 = 0;
			this.anInt2821 = this.anInt2813 = this.anInt2811 = 0;
			this.method6172();
			return true;
		} else {
			this.method2332();
			return false;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4454(@OriginalArg(0) int arg0) {
		if (this.anInt2816 > 0) {
			if (arg0 >= this.anInt2816) {
				if (this.anInt2819 == Integer.MIN_VALUE) {
					this.anInt2819 = 0;
					this.anInt2821 = this.anInt2813 = this.anInt2811 = 0;
					this.method6172();
					arg0 = this.anInt2816;
				}
				this.anInt2816 = 0;
				this.method2332();
			} else {
				this.anInt2821 += this.anInt2809 * arg0;
				this.anInt2813 += this.anInt2818 * arg0;
				this.anInt2811 += this.anInt2812 * arg0;
				this.anInt2816 -= arg0;
			}
		}
		@Pc(71) Class1_Sub13_Sub1 local71 = (Class1_Sub13_Sub1) super.aClass1_Sub13_5;
		@Pc(76) int local76 = this.anInt2814 << 8;
		@Pc(81) int local81 = this.anInt2822 << 8;
		@Pc(87) int local87 = local71.aByteArray68.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt2817 = 0;
		}
		if (this.anInt2820 < 0) {
			if (this.anInt2815 <= 0) {
				this.method2350();
				this.method6172();
				return;
			}
			this.anInt2820 = 0;
		}
		if (this.anInt2820 >= local87) {
			if (this.anInt2815 >= 0) {
				this.method2350();
				this.method6172();
				return;
			}
			this.anInt2820 = local87 - 1;
		}
		this.anInt2820 += this.anInt2815 * arg0;
		if (this.anInt2817 >= 0) {
			if (this.anInt2817 > 0) {
				if (this.aBoolean188) {
					label125: {
						if (this.anInt2815 < 0) {
							if (this.anInt2820 >= local76) {
								return;
							}
							this.anInt2820 = local76 + local76 - this.anInt2820 - 1;
							this.anInt2815 = -this.anInt2815;
							if (--this.anInt2817 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt2820 < local81) {
								return;
							}
							this.anInt2820 = local81 + local81 - this.anInt2820 - 1;
							this.anInt2815 = -this.anInt2815;
							if (--this.anInt2817 == 0) {
								break;
							}
							if (this.anInt2820 >= local76) {
								return;
							}
							this.anInt2820 = local76 + local76 - this.anInt2820 - 1;
							this.anInt2815 = -this.anInt2815;
						} while (--this.anInt2817 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt2815 < 0) {
						if (this.anInt2820 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt2820 - 1) / local91;
						if (local361 < this.anInt2817) {
							this.anInt2820 += local91 * local361;
							this.anInt2817 -= local361;
							return;
						}
						this.anInt2820 += local91 * this.anInt2817;
						this.anInt2817 = 0;
					} else if (this.anInt2820 >= local81) {
						local361 = (this.anInt2820 - local76) / local91;
						if (local361 < this.anInt2817) {
							this.anInt2820 -= local91 * local361;
							this.anInt2817 -= local361;
							return;
						}
						this.anInt2820 -= local91 * this.anInt2817;
						this.anInt2817 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2815 < 0) {
				if (this.anInt2820 < 0) {
					this.anInt2820 = -1;
					this.method2350();
					this.method6172();
					return;
				}
			} else if (this.anInt2820 >= local87) {
				this.anInt2820 = local87;
				this.method2350();
				this.method6172();
			}
		} else if (this.aBoolean188) {
			if (this.anInt2815 < 0) {
				if (this.anInt2820 >= local76) {
					return;
				}
				this.anInt2820 = local76 + local76 - this.anInt2820 - 1;
				this.anInt2815 = -this.anInt2815;
			}
			while (this.anInt2820 >= local81) {
				this.anInt2820 = local81 + local81 - this.anInt2820 - 1;
				this.anInt2815 = -this.anInt2815;
				if (this.anInt2820 >= local76) {
					return;
				}
				this.anInt2820 = local76 + local76 - this.anInt2820 - 1;
				this.anInt2815 = -this.anInt2815;
			}
		} else if (this.anInt2815 < 0) {
			if (this.anInt2820 < local76) {
				this.anInt2820 = local81 - (local81 - 1 - this.anInt2820) % local91 - 1;
			}
		} else if (this.anInt2820 >= local81) {
			this.anInt2820 = local76 + (this.anInt2820 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
	public synchronized void method2361(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2338();
			this.method6172();
		} else if (this.anInt2813 == 0 && this.anInt2811 == 0) {
			this.anInt2816 = 0;
			this.anInt2819 = 0;
			this.anInt2821 = 0;
			this.method6172();
		} else {
			@Pc(31) int local31 = -this.anInt2821;
			if (this.anInt2821 > local31) {
				local31 = this.anInt2821;
			}
			if (-this.anInt2813 > local31) {
				local31 = -this.anInt2813;
			}
			if (this.anInt2813 > local31) {
				local31 = this.anInt2813;
			}
			if (-this.anInt2811 > local31) {
				local31 = -this.anInt2811;
			}
			if (this.anInt2811 > local31) {
				local31 = this.anInt2811;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt2816 = arg0;
			this.anInt2819 = Integer.MIN_VALUE;
			this.anInt2809 = -this.anInt2821 / arg0;
			this.anInt2818 = -this.anInt2813 / arg0;
			this.anInt2812 = -this.anInt2811 / arg0;
		}
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
	public synchronized void method2364(@OriginalArg(0) int arg0) {
		this.anInt2817 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "([IIIII)I")
	private int method2365(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt2816 <= 0) {
				if (this.anInt2815 == 256 && (this.anInt2820 & 0xFF) == 0) {
					if (Class1_Sub2_Sub1_Sub1.lb) {
						return Static362.method2358(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, arg3, arg2, this);
					}
					return Static362.method2368(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, arg3, arg2, this);
				}
				if (Class1_Sub2_Sub1_Sub1.lb) {
					return Static362.method2335(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, arg3, arg2, this, this.anInt2815, arg4);
				}
				return Static362.method2351(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, arg3, arg2, this, this.anInt2815, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt2816;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt2816 += arg1;
			if (this.anInt2815 == 256 && (this.anInt2820 & 0xFF) == 0) {
				if (Class1_Sub2_Sub1_Sub1.lb) {
					arg1 = Static362.method2354(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, this.anInt2818, this.anInt2812, local5, arg2, this);
				} else {
					arg1 = Static362.method2362(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, this.anInt2809, local5, arg2, this);
				}
			} else if (Class1_Sub2_Sub1_Sub1.lb) {
				arg1 = Static362.method2363(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2813, this.anInt2811, this.anInt2818, this.anInt2812, local5, arg2, this, this.anInt2815, arg4);
			} else {
				arg1 = Static362.method2346(((Class1_Sub13_Sub1) super.aClass1_Sub13_5).aByteArray68, arg0, this.anInt2820, arg1, this.anInt2821, this.anInt2809, local5, arg2, this, this.anInt2815, arg4);
			}
			this.anInt2816 -= arg1;
			if (this.anInt2816 != 0) {
				return arg1;
			}
		} while (!this.method2359());
		return arg3;
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "()I")
	public synchronized int method2366() {
		return this.anInt2819 == Integer.MIN_VALUE ? 0 : this.anInt2819;
	}
}
