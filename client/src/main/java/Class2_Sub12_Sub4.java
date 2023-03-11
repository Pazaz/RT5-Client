import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class2_Sub12_Sub4 extends Class2_Sub12 {

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public int anInt5480;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	public int anInt5481;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
	public int anInt5482;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
	private int anInt5483;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
	public int anInt5484;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
	public int anInt5485;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
	private int anInt5486;

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
	public int anInt5488;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
	private final int anInt5478;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
	private final int anInt5487;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Z")
	private final boolean aBoolean390;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	private int anInt5489;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
	private int anInt5479;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
	private int anInt5477;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
	public int anInt5490;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!jn;II)V")
	public Class2_Sub12_Sub4(@OriginalArg(0) Class2_Sub21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub21_5 = arg0;
		this.anInt5478 = arg0.anInt3178;
		this.anInt5487 = arg0.anInt3177;
		this.aBoolean390 = arg0.aBoolean219;
		this.anInt5489 = arg1;
		this.anInt5479 = arg2;
		this.anInt5477 = 8192;
		this.anInt5490 = 0;
		this.method4985();
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!jn;III)V")
	public Class2_Sub12_Sub4(@OriginalArg(0) Class2_Sub21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub21_5 = arg0;
		this.anInt5478 = arg0.anInt3178;
		this.anInt5487 = arg0.anInt3177;
		this.aBoolean390 = arg0.aBoolean219;
		this.anInt5489 = arg1;
		this.anInt5479 = arg2;
		this.anInt5477 = arg3;
		this.anInt5490 = 0;
		this.method4985();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	public synchronized void method4979(@OriginalArg(0) int arg0) {
		this.method5010(arg0 << 6, this.method4986());
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public synchronized void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4994(arg0, arg1, this.method4986());
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "()I")
	public synchronized int method4982() {
		return this.anInt5489 < 0 ? -this.anInt5489 : this.anInt5489;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()I")
	@Override
	public int method4976() {
		@Pc(6) int local6 = this.anInt5488 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt5486 == 0) {
			local6 -= local6 * this.anInt5490 / (((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length << 8);
		} else if (this.anInt5486 >= 0) {
			local6 -= local6 * this.anInt5478 / ((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V")
	public synchronized void method4984(@OriginalArg(0) int arg0) {
		this.anInt5486 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "()V")
	private void method4985() {
		this.anInt5488 = this.anInt5479;
		this.anInt5481 = Static406.method5000(this.anInt5479, this.anInt5477);
		this.anInt5482 = Static406.method5016(this.anInt5479, this.anInt5477);
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "()I")
	public synchronized int method4986() {
		return this.anInt5477 < 0 ? -1 : this.anInt5477;
	}

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "()Z")
	private boolean method4988() {
		@Pc(2) int local2 = this.anInt5479;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static406.method5000(local2, this.anInt5477);
			local8 = Static406.method5016(local2, this.anInt5477);
		}
		if (this.anInt5488 != local2 || this.anInt5481 != local10 || this.anInt5482 != local8) {
			if (this.anInt5488 < local2) {
				this.anInt5480 = 1;
				this.anInt5483 = local2 - this.anInt5488;
			} else if (this.anInt5488 > local2) {
				this.anInt5480 = -1;
				this.anInt5483 = this.anInt5488 - local2;
			} else {
				this.anInt5480 = 0;
			}
			if (this.anInt5481 < local10) {
				this.anInt5484 = 1;
				if (this.anInt5483 == 0 || this.anInt5483 > local10 - this.anInt5481) {
					this.anInt5483 = local10 - this.anInt5481;
				}
			} else if (this.anInt5481 > local10) {
				this.anInt5484 = -1;
				if (this.anInt5483 == 0 || this.anInt5483 > this.anInt5481 - local10) {
					this.anInt5483 = this.anInt5481 - local10;
				}
			} else {
				this.anInt5484 = 0;
			}
			if (this.anInt5482 < local8) {
				this.anInt5485 = 1;
				if (this.anInt5483 == 0 || this.anInt5483 > local8 - this.anInt5482) {
					this.anInt5483 = local8 - this.anInt5482;
				}
			} else if (this.anInt5482 > local8) {
				this.anInt5485 = -1;
				if (this.anInt5483 == 0 || this.anInt5483 > this.anInt5482 - local8) {
					this.anInt5483 = this.anInt5482 - local8;
				}
			} else {
				this.anInt5485 = 0;
			}
			return false;
		} else if (this.anInt5479 == Integer.MIN_VALUE) {
			this.anInt5479 = 0;
			this.anInt5488 = this.anInt5481 = this.anInt5482 = 0;
			this.method6468();
			return true;
		} else {
			this.method4985();
			return false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "()Z")
	public boolean method4989() {
		return this.anInt5483 != 0;
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	public synchronized void method4990(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5018();
			this.method6468();
		} else if (this.anInt5481 == 0 && this.anInt5482 == 0) {
			this.anInt5483 = 0;
			this.anInt5479 = 0;
			this.anInt5488 = 0;
			this.method6468();
		} else {
			@Pc(31) int local31 = -this.anInt5488;
			if (this.anInt5488 > local31) {
				local31 = this.anInt5488;
			}
			if (-this.anInt5481 > local31) {
				local31 = -this.anInt5481;
			}
			if (this.anInt5481 > local31) {
				local31 = this.anInt5481;
			}
			if (-this.anInt5482 > local31) {
				local31 = -this.anInt5482;
			}
			if (this.anInt5482 > local31) {
				local31 = this.anInt5482;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5483 = arg0;
			this.anInt5479 = Integer.MIN_VALUE;
			this.anInt5480 = -this.anInt5488 / arg0;
			this.anInt5484 = -this.anInt5481 / arg0;
			this.anInt5485 = -this.anInt5482 / arg0;
		}
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
	public synchronized void method4991(@OriginalArg(0) int arg0) {
		if (this.anInt5489 < 0) {
			this.anInt5489 = -arg0;
		} else {
			this.anInt5489 = arg0;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4973(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5479 == 0 && this.anInt5483 == 0) {
			this.method4974(arg2);
			return;
		}
		@Pc(13) Class2_Sub21_Sub1 local13 = (Class2_Sub21_Sub1) super.aClass2_Sub21_5;
		@Pc(18) int local18 = this.anInt5478 << 8;
		@Pc(23) int local23 = this.anInt5487 << 8;
		@Pc(29) int local29 = local13.aByteArray31.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt5486 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt5490 < 0) {
			if (this.anInt5489 <= 0) {
				this.method5007();
				this.method6468();
				return;
			}
			this.anInt5490 = 0;
		}
		if (this.anInt5490 >= local29) {
			if (this.anInt5489 >= 0) {
				this.method5007();
				this.method6468();
				return;
			}
			this.anInt5490 = local29 - 1;
		}
		if (this.anInt5486 >= 0) {
			if (this.anInt5486 > 0) {
				if (this.aBoolean390) {
					label130: {
						if (this.anInt5489 < 0) {
							local40 = this.method4995(arg0, arg1, local18, local44, local13.aByteArray31[this.anInt5478]);
							if (this.anInt5490 >= local18) {
								return;
							}
							this.anInt5490 = local18 + local18 - this.anInt5490 - 1;
							this.anInt5489 = -this.anInt5489;
							if (--this.anInt5486 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5014(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5487 - 1]);
							if (this.anInt5490 < local23) {
								return;
							}
							this.anInt5490 = local23 + local23 - this.anInt5490 - 1;
							this.anInt5489 = -this.anInt5489;
							if (--this.anInt5486 == 0) {
								break;
							}
							local40 = this.method4995(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5478]);
							if (this.anInt5490 >= local18) {
								return;
							}
							this.anInt5490 = local18 + local18 - this.anInt5490 - 1;
							this.anInt5489 = -this.anInt5489;
						} while (--this.anInt5486 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt5489 < 0) {
						while (true) {
							local40 = this.method4995(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5487 - 1]);
							if (this.anInt5490 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt5490 - 1) / local33;
							if (local416 >= this.anInt5486) {
								this.anInt5490 += local33 * this.anInt5486;
								this.anInt5486 = 0;
								break;
							}
							this.anInt5490 += local33 * local416;
							this.anInt5486 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5014(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5478]);
							if (this.anInt5490 < local23) {
								return;
							}
							local416 = (this.anInt5490 - local18) / local33;
							if (local416 >= this.anInt5486) {
								this.anInt5490 -= local33 * this.anInt5486;
								this.anInt5486 = 0;
								break;
							}
							this.anInt5490 -= local33 * local416;
							this.anInt5486 -= local416;
						}
					}
				}
			}
			if (this.anInt5489 < 0) {
				this.method4995(arg0, local40, 0, local44, 0);
				if (this.anInt5490 < 0) {
					this.anInt5490 = -1;
					this.method5007();
					this.method6468();
					return;
				}
			} else {
				this.method5014(arg0, local40, local29, local44, 0);
				if (this.anInt5490 >= local29) {
					this.anInt5490 = local29;
					this.method5007();
					this.method6468();
				}
			}
		} else if (this.aBoolean390) {
			if (this.anInt5489 < 0) {
				local40 = this.method4995(arg0, arg1, local18, local44, local13.aByteArray31[this.anInt5478]);
				if (this.anInt5490 >= local18) {
					return;
				}
				this.anInt5490 = local18 + local18 - this.anInt5490 - 1;
				this.anInt5489 = -this.anInt5489;
			}
			while (true) {
				local40 = this.method5014(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5487 - 1]);
				if (this.anInt5490 < local23) {
					return;
				}
				this.anInt5490 = local23 + local23 - this.anInt5490 - 1;
				this.anInt5489 = -this.anInt5489;
				local40 = this.method4995(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5478]);
				if (this.anInt5490 >= local18) {
					return;
				}
				this.anInt5490 = local18 + local18 - this.anInt5490 - 1;
				this.anInt5489 = -this.anInt5489;
			}
		} else if (this.anInt5489 < 0) {
			while (true) {
				local40 = this.method4995(arg0, local40, local18, local44, local13.aByteArray31[this.anInt5487 - 1]);
				if (this.anInt5490 >= local18) {
					return;
				}
				this.anInt5490 = local23 - (local23 - 1 - this.anInt5490) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5014(arg0, local40, local23, local44, local13.aByteArray31[this.anInt5478]);
				if (this.anInt5490 < local23) {
					return;
				}
				this.anInt5490 = local18 + (this.anInt5490 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)V")
	public synchronized void method4994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5010(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static406.method5000(arg1, arg2);
		@Pc(14) int local14 = Static406.method5016(arg1, arg2);
		if (this.anInt5481 == local10 && this.anInt5482 == local14) {
			this.anInt5483 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt5488;
		if (this.anInt5488 - arg1 > local31) {
			local31 = this.anInt5488 - arg1;
		}
		if (local10 - this.anInt5481 > local31) {
			local31 = local10 - this.anInt5481;
		}
		if (this.anInt5481 - local10 > local31) {
			local31 = this.anInt5481 - local10;
		}
		if (local14 - this.anInt5482 > local31) {
			local31 = local14 - this.anInt5482;
		}
		if (this.anInt5482 - local14 > local31) {
			local31 = this.anInt5482 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5483 = arg0;
		this.anInt5479 = arg1;
		this.anInt5477 = arg2;
		this.anInt5480 = (arg1 - this.anInt5488) / arg0;
		this.anInt5484 = (local10 - this.anInt5481) / arg0;
		this.anInt5485 = (local14 - this.anInt5482) / arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([IIIII)I")
	private int method4995(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5483 <= 0) {
				if (this.anInt5489 == -256 && (this.anInt5490 & 0xFF) == 0) {
					if (Static354.aBoolean93) {
						return Static406.method5012(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, arg3, arg2, this);
					}
					return Static406.method4996(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, arg3, arg2, this);
				}
				if (Static354.aBoolean93) {
					return Static406.method5002(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, arg3, arg2, this, this.anInt5489, arg4);
				}
				return Static406.method4983(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, arg3, arg2, this, this.anInt5489, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5483;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5483 += arg1;
			if (this.anInt5489 == -256 && (this.anInt5490 & 0xFF) == 0) {
				if (Static354.aBoolean93) {
					arg1 = Static406.method5017(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, this.anInt5484, this.anInt5485, local5, arg2, this);
				} else {
					arg1 = Static406.method5005(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, this.anInt5480, local5, arg2, this);
				}
			} else if (Static354.aBoolean93) {
				arg1 = Static406.method5013(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, this.anInt5484, this.anInt5485, local5, arg2, this, this.anInt5489, arg4);
			} else {
				arg1 = Static406.method4999(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, this.anInt5480, local5, arg2, this, this.anInt5489, arg4);
			}
			this.anInt5483 -= arg1;
			if (this.anInt5483 != 0) {
				return arg1;
			}
		} while (!this.method4988());
		return arg3;
	}

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "()I")
	public synchronized int method4997() {
		return this.anInt5479 == Integer.MIN_VALUE ? 0 : this.anInt5479;
	}

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "()Z")
	public boolean method5001() {
		return this.anInt5490 < 0 || this.anInt5490 >= ((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length << 8;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	public synchronized void method5004() {
		this.anInt5489 = (this.anInt5489 ^ this.anInt5489 >> 31) + (this.anInt5489 >>> 31);
		this.anInt5489 = -this.anInt5489;
	}

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "()V")
	private void method5007() {
		if (this.anInt5483 == 0) {
			return;
		}
		if (this.anInt5479 == Integer.MIN_VALUE) {
			this.anInt5479 = 0;
		}
		this.anInt5483 = 0;
		this.method4985();
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4974(@OriginalArg(0) int arg0) {
		if (this.anInt5483 > 0) {
			if (arg0 >= this.anInt5483) {
				if (this.anInt5479 == Integer.MIN_VALUE) {
					this.anInt5479 = 0;
					this.anInt5488 = this.anInt5481 = this.anInt5482 = 0;
					this.method6468();
					arg0 = this.anInt5483;
				}
				this.anInt5483 = 0;
				this.method4985();
			} else {
				this.anInt5488 += this.anInt5480 * arg0;
				this.anInt5481 += this.anInt5484 * arg0;
				this.anInt5482 += this.anInt5485 * arg0;
				this.anInt5483 -= arg0;
			}
		}
		@Pc(71) Class2_Sub21_Sub1 local71 = (Class2_Sub21_Sub1) super.aClass2_Sub21_5;
		@Pc(76) int local76 = this.anInt5478 << 8;
		@Pc(81) int local81 = this.anInt5487 << 8;
		@Pc(87) int local87 = local71.aByteArray31.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt5486 = 0;
		}
		if (this.anInt5490 < 0) {
			if (this.anInt5489 <= 0) {
				this.method5007();
				this.method6468();
				return;
			}
			this.anInt5490 = 0;
		}
		if (this.anInt5490 >= local87) {
			if (this.anInt5489 >= 0) {
				this.method5007();
				this.method6468();
				return;
			}
			this.anInt5490 = local87 - 1;
		}
		this.anInt5490 += this.anInt5489 * arg0;
		if (this.anInt5486 >= 0) {
			if (this.anInt5486 > 0) {
				if (this.aBoolean390) {
					label125: {
						if (this.anInt5489 < 0) {
							if (this.anInt5490 >= local76) {
								return;
							}
							this.anInt5490 = local76 + local76 - this.anInt5490 - 1;
							this.anInt5489 = -this.anInt5489;
							if (--this.anInt5486 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt5490 < local81) {
								return;
							}
							this.anInt5490 = local81 + local81 - this.anInt5490 - 1;
							this.anInt5489 = -this.anInt5489;
							if (--this.anInt5486 == 0) {
								break;
							}
							if (this.anInt5490 >= local76) {
								return;
							}
							this.anInt5490 = local76 + local76 - this.anInt5490 - 1;
							this.anInt5489 = -this.anInt5489;
						} while (--this.anInt5486 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt5489 < 0) {
						if (this.anInt5490 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt5490 - 1) / local91;
						if (local361 < this.anInt5486) {
							this.anInt5490 += local91 * local361;
							this.anInt5486 -= local361;
							return;
						}
						this.anInt5490 += local91 * this.anInt5486;
						this.anInt5486 = 0;
					} else if (this.anInt5490 >= local81) {
						local361 = (this.anInt5490 - local76) / local91;
						if (local361 < this.anInt5486) {
							this.anInt5490 -= local91 * local361;
							this.anInt5486 -= local361;
							return;
						}
						this.anInt5490 -= local91 * this.anInt5486;
						this.anInt5486 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt5489 < 0) {
				if (this.anInt5490 < 0) {
					this.anInt5490 = -1;
					this.method5007();
					this.method6468();
					return;
				}
			} else if (this.anInt5490 >= local87) {
				this.anInt5490 = local87;
				this.method5007();
				this.method6468();
			}
		} else if (this.aBoolean390) {
			if (this.anInt5489 < 0) {
				if (this.anInt5490 >= local76) {
					return;
				}
				this.anInt5490 = local76 + local76 - this.anInt5490 - 1;
				this.anInt5489 = -this.anInt5489;
			}
			while (this.anInt5490 >= local81) {
				this.anInt5490 = local81 + local81 - this.anInt5490 - 1;
				this.anInt5489 = -this.anInt5489;
				if (this.anInt5490 >= local76) {
					return;
				}
				this.anInt5490 = local76 + local76 - this.anInt5490 - 1;
				this.anInt5489 = -this.anInt5489;
			}
		} else if (this.anInt5489 < 0) {
			if (this.anInt5490 < local76) {
				this.anInt5490 = local81 - (local81 - 1 - this.anInt5490) % local91 - 1;
			}
		} else if (this.anInt5490 >= local81) {
			this.anInt5490 = local76 + (this.anInt5490 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)V")
	private synchronized void method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5479 = arg0;
		this.anInt5477 = arg1;
		this.anInt5483 = 0;
		this.method4985();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "()I")
	@Override
	public int method4977() {
		return this.anInt5479 == 0 && this.anInt5483 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "()Lclient!ll;")
	@Override
	public Class2_Sub12 method4978() {
		return null;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "([IIIII)I")
	private int method5014(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5483 <= 0) {
				if (this.anInt5489 == 256 && (this.anInt5490 & 0xFF) == 0) {
					if (Static354.aBoolean93) {
						return Static406.method4980(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, arg3, arg2, this);
					}
					return Static406.method4993(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, arg3, arg2, this);
				}
				if (Static354.aBoolean93) {
					return Static406.method5003(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, arg3, arg2, this, this.anInt5489, arg4);
				}
				return Static406.method5008(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, arg3, arg2, this, this.anInt5489, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5483;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5483 += arg1;
			if (this.anInt5489 == 256 && (this.anInt5490 & 0xFF) == 0) {
				if (Static354.aBoolean93) {
					arg1 = Static406.method4987(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, this.anInt5484, this.anInt5485, local5, arg2, this);
				} else {
					arg1 = Static406.method5009(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, this.anInt5480, local5, arg2, this);
				}
			} else if (Static354.aBoolean93) {
				arg1 = Static406.method4992(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5481, this.anInt5482, this.anInt5484, this.anInt5485, local5, arg2, this, this.anInt5489, arg4);
			} else {
				arg1 = Static406.method5011(((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31, arg0, this.anInt5490, arg1, this.anInt5488, this.anInt5480, local5, arg2, this, this.anInt5489, arg4);
			}
			this.anInt5483 -= arg1;
			if (this.anInt5483 != 0) {
				return arg1;
			}
		} while (!this.method4988());
		return arg3;
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V")
	public synchronized void method5015(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub21_Sub1) super.aClass2_Sub21_5).aByteArray31.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt5490 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()Lclient!ll;")
	@Override
	public Class2_Sub12 method4972() {
		return null;
	}

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)V")
	private synchronized void method5018() {
		this.method5010(0, this.method4986());
	}
}
