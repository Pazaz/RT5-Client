import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class2_Sub6_Sub2 extends Class2_Sub6 {

	@OriginalMember(owner = "client!haa", name = "A", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!haa", name = "w", descriptor = "I")
	public int anInt3677;

	@OriginalMember(owner = "client!haa", name = "C", descriptor = "I")
	public int anInt3678;

	@OriginalMember(owner = "client!haa", name = "s", descriptor = "I")
	public int anInt3680;

	@OriginalMember(owner = "client!haa", name = "r", descriptor = "I")
	public int anInt3683;

	@OriginalMember(owner = "client!haa", name = "q", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
	public int anInt3687;

	@OriginalMember(owner = "client!haa", name = "B", descriptor = "I")
	private int anInt3688;

	@OriginalMember(owner = "client!haa", name = "z", descriptor = "I")
	private final int anInt3681;

	@OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
	private final int anInt3675;

	@OriginalMember(owner = "client!haa", name = "v", descriptor = "Z")
	private final boolean aBoolean281;

	@OriginalMember(owner = "client!haa", name = "u", descriptor = "I")
	private int anInt3679;

	@OriginalMember(owner = "client!haa", name = "x", descriptor = "I")
	private int anInt3685;

	@OriginalMember(owner = "client!haa", name = "t", descriptor = "I")
	private int anInt3682;

	@OriginalMember(owner = "client!haa", name = "y", descriptor = "I")
	public int anInt3686;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!sq;III)V")
	public Class2_Sub6_Sub2(@OriginalArg(0) Class2_Sub49_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub49_6 = arg0;
		this.anInt3681 = arg0.anInt8819;
		this.anInt3675 = arg0.anInt8820;
		this.aBoolean281 = arg0.aBoolean668;
		this.anInt3679 = arg1;
		this.anInt3685 = arg2;
		this.anInt3682 = arg3;
		this.anInt3686 = 0;
		this.method3314();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([IIIII)I")
	private int method3309(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3684 <= 0) {
				if (this.anInt3679 == -256 && (this.anInt3686 & 0xFF) == 0) {
					if (Static316.aBoolean644) {
						return Static730.method3334(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, arg3, arg2, this);
					}
					return Static730.method3343(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, arg3, arg2, this);
				}
				if (Static316.aBoolean644) {
					return Static730.method3324(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, arg3, arg2, this, this.anInt3679, arg4);
				}
				return Static730.method3339(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, arg3, arg2, this, this.anInt3679, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3684;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3684 += arg1;
			if (this.anInt3679 == -256 && (this.anInt3686 & 0xFF) == 0) {
				if (Static316.aBoolean644) {
					arg1 = Static730.method3342(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, this.anInt3683, this.anInt3687, local5, arg2, this);
				} else {
					arg1 = Static730.method3332(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, this.anInt3678, local5, arg2, this);
				}
			} else if (Static316.aBoolean644) {
				arg1 = Static730.method3326(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, this.anInt3683, this.anInt3687, local5, arg2, this, this.anInt3679, arg4);
			} else {
				arg1 = Static730.method3347(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, this.anInt3678, local5, arg2, this, this.anInt3679, arg4);
			}
			this.anInt3684 -= arg1;
			if (this.anInt3684 != 0) {
				return arg1;
			}
		} while (!this.method3345());
		return arg3;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9131(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3685 == 0 && this.anInt3684 == 0) {
			this.method9130(arg2);
			return;
		}
		@Pc(13) Class2_Sub49_Sub1 local13 = (Class2_Sub49_Sub1) super.aClass2_Sub49_6;
		@Pc(18) int local18 = this.anInt3681 << 8;
		@Pc(23) int local23 = this.anInt3675 << 8;
		@Pc(29) int local29 = local13.aByteArray98.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt3688 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt3686 < 0) {
			if (this.anInt3679 <= 0) {
				this.method3335();
				this.method9457();
				return;
			}
			this.anInt3686 = 0;
		}
		if (this.anInt3686 >= local29) {
			if (this.anInt3679 >= 0) {
				this.method3335();
				this.method9457();
				return;
			}
			this.anInt3686 = local29 - 1;
		}
		if (this.anInt3688 >= 0) {
			if (this.anInt3688 > 0) {
				if (this.aBoolean281) {
					label130: {
						if (this.anInt3679 < 0) {
							local40 = this.method3309(arg0, arg1, local18, local44, local13.aByteArray98[this.anInt3681]);
							if (this.anInt3686 >= local18) {
								return;
							}
							this.anInt3686 = local18 + local18 - this.anInt3686 - 1;
							this.anInt3679 = -this.anInt3679;
							if (--this.anInt3688 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3317(arg0, local40, local23, local44, local13.aByteArray98[this.anInt3675 - 1]);
							if (this.anInt3686 < local23) {
								return;
							}
							this.anInt3686 = local23 + local23 - this.anInt3686 - 1;
							this.anInt3679 = -this.anInt3679;
							if (--this.anInt3688 == 0) {
								break;
							}
							local40 = this.method3309(arg0, local40, local18, local44, local13.aByteArray98[this.anInt3681]);
							if (this.anInt3686 >= local18) {
								return;
							}
							this.anInt3686 = local18 + local18 - this.anInt3686 - 1;
							this.anInt3679 = -this.anInt3679;
						} while (--this.anInt3688 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt3679 < 0) {
						while (true) {
							local40 = this.method3309(arg0, local40, local18, local44, local13.aByteArray98[this.anInt3675 - 1]);
							if (this.anInt3686 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt3686 - 1) / local33;
							if (local416 >= this.anInt3688) {
								this.anInt3686 += local33 * this.anInt3688;
								this.anInt3688 = 0;
								break;
							}
							this.anInt3686 += local33 * local416;
							this.anInt3688 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3317(arg0, local40, local23, local44, local13.aByteArray98[this.anInt3681]);
							if (this.anInt3686 < local23) {
								return;
							}
							local416 = (this.anInt3686 - local18) / local33;
							if (local416 >= this.anInt3688) {
								this.anInt3686 -= local33 * this.anInt3688;
								this.anInt3688 = 0;
								break;
							}
							this.anInt3686 -= local33 * local416;
							this.anInt3688 -= local416;
						}
					}
				}
			}
			if (this.anInt3679 < 0) {
				this.method3309(arg0, local40, 0, local44, 0);
				if (this.anInt3686 < 0) {
					this.anInt3686 = -1;
					this.method3335();
					this.method9457();
					return;
				}
			} else {
				this.method3317(arg0, local40, local29, local44, 0);
				if (this.anInt3686 >= local29) {
					this.anInt3686 = local29;
					this.method3335();
					this.method9457();
				}
			}
		} else if (this.aBoolean281) {
			if (this.anInt3679 < 0) {
				local40 = this.method3309(arg0, arg1, local18, local44, local13.aByteArray98[this.anInt3681]);
				if (this.anInt3686 >= local18) {
					return;
				}
				this.anInt3686 = local18 + local18 - this.anInt3686 - 1;
				this.anInt3679 = -this.anInt3679;
			}
			while (true) {
				local40 = this.method3317(arg0, local40, local23, local44, local13.aByteArray98[this.anInt3675 - 1]);
				if (this.anInt3686 < local23) {
					return;
				}
				this.anInt3686 = local23 + local23 - this.anInt3686 - 1;
				this.anInt3679 = -this.anInt3679;
				local40 = this.method3309(arg0, local40, local18, local44, local13.aByteArray98[this.anInt3681]);
				if (this.anInt3686 >= local18) {
					return;
				}
				this.anInt3686 = local18 + local18 - this.anInt3686 - 1;
				this.anInt3679 = -this.anInt3679;
			}
		} else if (this.anInt3679 < 0) {
			while (true) {
				local40 = this.method3309(arg0, local40, local18, local44, local13.aByteArray98[this.anInt3675 - 1]);
				if (this.anInt3686 >= local18) {
					return;
				}
				this.anInt3686 = local23 - (local23 - 1 - this.anInt3686) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3317(arg0, local40, local23, local44, local13.aByteArray98[this.anInt3681]);
				if (this.anInt3686 < local23) {
					return;
				}
				this.anInt3686 = local18 + (this.anInt3686 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "()Z")
	public boolean method3311() {
		return this.anInt3686 < 0 || this.anInt3686 >= ((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98.length << 8;
	}

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "()V")
	private void method3314() {
		this.anInt3676 = this.anInt3685;
		this.anInt3680 = Static730.method3330(this.anInt3685, this.anInt3682);
		this.anInt3677 = Static730.method3328(this.anInt3685, this.anInt3682);
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(II)V")
	public synchronized void method3315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3338(arg0, arg1, this.method3348());
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "([IIIII)I")
	private int method3317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt3684 <= 0) {
				if (this.anInt3679 == 256 && (this.anInt3686 & 0xFF) == 0) {
					if (Static316.aBoolean644) {
						return Static730.method3329(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, arg3, arg2, this);
					}
					return Static730.method3310(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, arg3, arg2, this);
				}
				if (Static316.aBoolean644) {
					return Static730.method3312(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, arg3, arg2, this, this.anInt3679, arg4);
				}
				return Static730.method3316(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, arg3, arg2, this, this.anInt3679, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt3684;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt3684 += arg1;
			if (this.anInt3679 == 256 && (this.anInt3686 & 0xFF) == 0) {
				if (Static316.aBoolean644) {
					arg1 = Static730.method3325(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, this.anInt3683, this.anInt3687, local5, arg2, this);
				} else {
					arg1 = Static730.method3321(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, this.anInt3678, local5, arg2, this);
				}
			} else if (Static316.aBoolean644) {
				arg1 = Static730.method3313(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3680, this.anInt3677, this.anInt3683, this.anInt3687, local5, arg2, this, this.anInt3679, arg4);
			} else {
				arg1 = Static730.method3331(((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98, arg0, this.anInt3686, arg1, this.anInt3676, this.anInt3678, local5, arg2, this, this.anInt3679, arg4);
			}
			this.anInt3684 -= arg1;
			if (this.anInt3684 != 0) {
				return arg1;
			}
		} while (!this.method3345());
		return arg3;
	}

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "(I)V")
	public synchronized void method3318(@OriginalArg(0) int arg0) {
		this.anInt3688 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "(I)V")
	public synchronized void method3319(@OriginalArg(0) int arg0) {
		if (this.anInt3679 < 0) {
			this.anInt3679 = -arg0;
		} else {
			this.anInt3679 = arg0;
		}
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V")
	public synchronized void method3320(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3322();
			this.method9457();
		} else if (this.anInt3680 == 0 && this.anInt3677 == 0) {
			this.anInt3684 = 0;
			this.anInt3685 = 0;
			this.anInt3676 = 0;
			this.method9457();
		} else {
			@Pc(31) int local31 = -this.anInt3676;
			if (this.anInt3676 > local31) {
				local31 = this.anInt3676;
			}
			if (-this.anInt3680 > local31) {
				local31 = -this.anInt3680;
			}
			if (this.anInt3680 > local31) {
				local31 = this.anInt3680;
			}
			if (-this.anInt3677 > local31) {
				local31 = -this.anInt3677;
			}
			if (this.anInt3677 > local31) {
				local31 = this.anInt3677;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt3684 = arg0;
			this.anInt3685 = Integer.MIN_VALUE;
			this.anInt3678 = -this.anInt3676 / arg0;
			this.anInt3683 = -this.anInt3680 / arg0;
			this.anInt3687 = -this.anInt3677 / arg0;
		}
	}

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "(I)V")
	private synchronized void method3322() {
		this.method3337(0, this.method3348());
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
	public synchronized void method3323() {
		this.anInt3679 = (this.anInt3679 ^ this.anInt3679 >> 31) + (this.anInt3679 >>> 31);
		this.anInt3679 = -this.anInt3679;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method9133() {
		return null;
	}

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)V")
	public synchronized void method3327(@OriginalArg(0) int arg0) {
		this.method3337(arg0 << 6, this.method3348());
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)V")
	public synchronized void method3333(@OriginalArg(0) int arg0) {
		this.method3337(this.method3341(), arg0);
	}

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "()V")
	private void method3335() {
		if (this.anInt3684 == 0) {
			return;
		}
		if (this.anInt3685 == Integer.MIN_VALUE) {
			this.anInt3685 = 0;
		}
		this.anInt3684 = 0;
		this.method3314();
	}

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "()Z")
	public boolean method3336() {
		return this.anInt3684 != 0;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(II)V")
	private synchronized void method3337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3685 = arg0;
		this.anInt3682 = arg1;
		this.anInt3684 = 0;
		this.method3314();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)V")
	public synchronized void method3338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3337(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static730.method3330(arg1, arg2);
		@Pc(14) int local14 = Static730.method3328(arg1, arg2);
		if (this.anInt3680 == local10 && this.anInt3677 == local14) {
			this.anInt3684 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt3676;
		if (this.anInt3676 - arg1 > local31) {
			local31 = this.anInt3676 - arg1;
		}
		if (local10 - this.anInt3680 > local31) {
			local31 = local10 - this.anInt3680;
		}
		if (this.anInt3680 - local10 > local31) {
			local31 = this.anInt3680 - local10;
		}
		if (local14 - this.anInt3677 > local31) {
			local31 = local14 - this.anInt3677;
		}
		if (this.anInt3677 - local14 > local31) {
			local31 = this.anInt3677 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt3684 = arg0;
		this.anInt3685 = arg1;
		this.anInt3682 = arg2;
		this.anInt3678 = (arg1 - this.anInt3676) / arg0;
		this.anInt3683 = (local10 - this.anInt3680) / arg0;
		this.anInt3687 = (local14 - this.anInt3677) / arg0;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "()I")
	@Override
	public int method9132() {
		return this.anInt3685 == 0 && this.anInt3684 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "()I")
	public synchronized int method3340() {
		return this.anInt3679 < 0 ? -this.anInt3679 : this.anInt3679;
	}

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "()I")
	public synchronized int method3341() {
		return this.anInt3685 == Integer.MIN_VALUE ? 0 : this.anInt3685;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9130(@OriginalArg(0) int arg0) {
		if (this.anInt3684 > 0) {
			if (arg0 >= this.anInt3684) {
				if (this.anInt3685 == Integer.MIN_VALUE) {
					this.anInt3685 = 0;
					this.anInt3676 = this.anInt3680 = this.anInt3677 = 0;
					this.method9457();
					arg0 = this.anInt3684;
				}
				this.anInt3684 = 0;
				this.method3314();
			} else {
				this.anInt3676 += this.anInt3678 * arg0;
				this.anInt3680 += this.anInt3683 * arg0;
				this.anInt3677 += this.anInt3687 * arg0;
				this.anInt3684 -= arg0;
			}
		}
		@Pc(71) Class2_Sub49_Sub1 local71 = (Class2_Sub49_Sub1) super.aClass2_Sub49_6;
		@Pc(76) int local76 = this.anInt3681 << 8;
		@Pc(81) int local81 = this.anInt3675 << 8;
		@Pc(87) int local87 = local71.aByteArray98.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt3688 = 0;
		}
		if (this.anInt3686 < 0) {
			if (this.anInt3679 <= 0) {
				this.method3335();
				this.method9457();
				return;
			}
			this.anInt3686 = 0;
		}
		if (this.anInt3686 >= local87) {
			if (this.anInt3679 >= 0) {
				this.method3335();
				this.method9457();
				return;
			}
			this.anInt3686 = local87 - 1;
		}
		this.anInt3686 += this.anInt3679 * arg0;
		if (this.anInt3688 >= 0) {
			if (this.anInt3688 > 0) {
				if (this.aBoolean281) {
					label125: {
						if (this.anInt3679 < 0) {
							if (this.anInt3686 >= local76) {
								return;
							}
							this.anInt3686 = local76 + local76 - this.anInt3686 - 1;
							this.anInt3679 = -this.anInt3679;
							if (--this.anInt3688 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt3686 < local81) {
								return;
							}
							this.anInt3686 = local81 + local81 - this.anInt3686 - 1;
							this.anInt3679 = -this.anInt3679;
							if (--this.anInt3688 == 0) {
								break;
							}
							if (this.anInt3686 >= local76) {
								return;
							}
							this.anInt3686 = local76 + local76 - this.anInt3686 - 1;
							this.anInt3679 = -this.anInt3679;
						} while (--this.anInt3688 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt3679 < 0) {
						if (this.anInt3686 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt3686 - 1) / local91;
						if (local361 < this.anInt3688) {
							this.anInt3686 += local91 * local361;
							this.anInt3688 -= local361;
							return;
						}
						this.anInt3686 += local91 * this.anInt3688;
						this.anInt3688 = 0;
					} else if (this.anInt3686 >= local81) {
						local361 = (this.anInt3686 - local76) / local91;
						if (local361 < this.anInt3688) {
							this.anInt3686 -= local91 * local361;
							this.anInt3688 -= local361;
							return;
						}
						this.anInt3686 -= local91 * this.anInt3688;
						this.anInt3688 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt3679 < 0) {
				if (this.anInt3686 < 0) {
					this.anInt3686 = -1;
					this.method3335();
					this.method9457();
					return;
				}
			} else if (this.anInt3686 >= local87) {
				this.anInt3686 = local87;
				this.method3335();
				this.method9457();
			}
		} else if (this.aBoolean281) {
			if (this.anInt3679 < 0) {
				if (this.anInt3686 >= local76) {
					return;
				}
				this.anInt3686 = local76 + local76 - this.anInt3686 - 1;
				this.anInt3679 = -this.anInt3679;
			}
			while (this.anInt3686 >= local81) {
				this.anInt3686 = local81 + local81 - this.anInt3686 - 1;
				this.anInt3679 = -this.anInt3679;
				if (this.anInt3686 >= local76) {
					return;
				}
				this.anInt3686 = local76 + local76 - this.anInt3686 - 1;
				this.anInt3679 = -this.anInt3679;
			}
		} else if (this.anInt3679 < 0) {
			if (this.anInt3686 < local76) {
				this.anInt3686 = local81 - (local81 - 1 - this.anInt3686) % local91 - 1;
			}
		} else if (this.anInt3686 >= local81) {
			this.anInt3686 = local76 + (this.anInt3686 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
	public synchronized void method3344(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt3686 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method9135() {
		return null;
	}

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "()Z")
	private boolean method3345() {
		@Pc(2) int local2 = this.anInt3685;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static730.method3330(local2, this.anInt3682);
			local8 = Static730.method3328(local2, this.anInt3682);
		}
		if (this.anInt3676 != local2 || this.anInt3680 != local10 || this.anInt3677 != local8) {
			if (this.anInt3676 < local2) {
				this.anInt3678 = 1;
				this.anInt3684 = local2 - this.anInt3676;
			} else if (this.anInt3676 > local2) {
				this.anInt3678 = -1;
				this.anInt3684 = this.anInt3676 - local2;
			} else {
				this.anInt3678 = 0;
			}
			if (this.anInt3680 < local10) {
				this.anInt3683 = 1;
				if (this.anInt3684 == 0 || this.anInt3684 > local10 - this.anInt3680) {
					this.anInt3684 = local10 - this.anInt3680;
				}
			} else if (this.anInt3680 > local10) {
				this.anInt3683 = -1;
				if (this.anInt3684 == 0 || this.anInt3684 > this.anInt3680 - local10) {
					this.anInt3684 = this.anInt3680 - local10;
				}
			} else {
				this.anInt3683 = 0;
			}
			if (this.anInt3677 < local8) {
				this.anInt3687 = 1;
				if (this.anInt3684 == 0 || this.anInt3684 > local8 - this.anInt3677) {
					this.anInt3684 = local8 - this.anInt3677;
				}
			} else if (this.anInt3677 > local8) {
				this.anInt3687 = -1;
				if (this.anInt3684 == 0 || this.anInt3684 > this.anInt3677 - local8) {
					this.anInt3684 = this.anInt3677 - local8;
				}
			} else {
				this.anInt3687 = 0;
			}
			return false;
		} else if (this.anInt3685 == Integer.MIN_VALUE) {
			this.anInt3685 = 0;
			this.anInt3676 = this.anInt3680 = this.anInt3677 = 0;
			this.method9457();
			return true;
		} else {
			this.method3314();
			return false;
		}
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "()I")
	@Override
	public int method9136() {
		@Pc(6) int local6 = this.anInt3676 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt3688 == 0) {
			local6 -= local6 * this.anInt3686 / (((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98.length << 8);
		} else if (this.anInt3688 >= 0) {
			local6 -= local6 * this.anInt3681 / ((Class2_Sub49_Sub1) super.aClass2_Sub49_6).aByteArray98.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "()I")
	public synchronized int method3348() {
		return this.anInt3682 < 0 ? -1 : this.anInt3682;
	}
}
