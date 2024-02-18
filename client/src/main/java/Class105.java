import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class105 {

	@OriginalMember(owner = "client!el", name = "B", descriptor = "I")
	private int anInt2582;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!el", name = "z", descriptor = "Lclient!av;")
	private Class28 aClass28_14;

	@OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
	public int anInt2590;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	public int anInt2592;

	@OriginalMember(owner = "client!el", name = "I", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	public int anInt2600;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "I")
	private int anInt2601;

	@OriginalMember(owner = "client!el", name = "M", descriptor = "Lclient!ml;")
	public Class246 aClass246_2;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt2605;

	@OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
	private int anInt2606;

	@OriginalMember(owner = "client!el", name = "G", descriptor = "I")
	public int anInt2608;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	public int anInt2610;

	@OriginalMember(owner = "client!el", name = "Y", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!el", name = "W", descriptor = "I")
	private int anInt2612;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	public int anInt2617;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "I")
	private int anInt2584 = -1;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public int anInt2587 = -1;

	@OriginalMember(owner = "client!el", name = "H", descriptor = "I")
	private int anInt2586 = -1;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	public int anInt2596 = -1;

	@OriginalMember(owner = "client!el", name = "A", descriptor = "I")
	public int anInt2594 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public int anInt2591 = -1;

	@OriginalMember(owner = "client!el", name = "K", descriptor = "Z")
	public boolean aBoolean214 = true;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	private int anInt2599 = -1;

	@OriginalMember(owner = "client!el", name = "X", descriptor = "I")
	public int anInt2588 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "L", descriptor = "I")
	public int anInt2597 = -1;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	public int anInt2589 = -1;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt2603 = -1;

	@OriginalMember(owner = "client!el", name = "U", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!el", name = "D", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public int anInt2598 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!el", name = "C", descriptor = "I")
	public int anInt2614 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	private int anInt2616 = -1;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	public int anInt2607 = -1;

	@OriginalMember(owner = "client!el", name = "w", descriptor = "I")
	private int anInt2618 = -1;

	@OriginalMember(owner = "client!el", name = "N", descriptor = "I")
	public int anInt2615 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!ge;)V")
	public void method2423(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 == 0) {
				return;
			}
			this.method2432(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!uk;)Z")
	public boolean method2425(@OriginalArg(1) Interface23 arg0) {
		@Pc(31) int local31;
		if (this.anInt2616 == -1) {
			if (this.anInt2599 == -1) {
				return true;
			}
			local31 = arg0.method6864(this.anInt2599);
		} else {
			local31 = arg0.method6865(this.anInt2616);
		}
		if (local31 < this.anInt2612 || local31 > this.anInt2582) {
			return false;
		}
		@Pc(78) int local78;
		if (this.anInt2584 == -1) {
			if (this.anInt2586 == -1) {
				return true;
			}
			local78 = arg0.method6864(this.anInt2586);
		} else {
			local78 = arg0.method6865(this.anInt2584);
		}
		return this.anInt2606 <= local78 && this.anInt2601 >= local78;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2426(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass28_14 == null) {
			return arg1;
		} else {
			@Pc(17) Class2_Sub24 local17 = (Class2_Sub24) this.aClass28_14.method738((long) arg0);
			return local17 == null ? arg1 : local17.aString46;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I")
	public int method2427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass28_14 == null) {
			return arg0;
		} else {
			@Pc(27) Class2_Sub38 local27 = (Class2_Sub38) this.aClass28_14.method738((long) arg1);
			return local27 == null ? arg0 : local27.anInt6379;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!ha;)Lclient!st;")
	public Class23 method2428(@OriginalArg(1) Class19 arg0) {
		@Pc(28) Class23 local28 = (Class23) this.aClass246_2.aClass82_135.method2156((long) (this.anInt2618 | 0x20000 | arg0.anInt8962 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass246_2.aClass330_83.method7581(this.anInt2618);
		@Pc(49) Class407 local49 = Static735.method9382(this.aClass246_2.aClass330_83, this.anInt2618, 0);
		if (local49 != null) {
			local28 = arg0.method7948(local49, true);
			this.aClass246_2.aClass82_135.method2150(local28, (long) (this.anInt2618 | 0x20000 | arg0.anInt8962 << 29));
		}
		return local28;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V")
	public void method2430() {
		if (this.anIntArray228 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray228.length; local16 += 2) {
			if (this.anIntArray228[local16] < this.anInt2598) {
				this.anInt2598 = this.anIntArray228[local16];
			} else if (this.anInt2614 < this.anIntArray228[local16]) {
				this.anInt2614 = this.anIntArray228[local16];
			}
			if (this.anInt2588 > this.anIntArray228[local16 + 1]) {
				this.anInt2588 = this.anIntArray228[local16 + 1];
			} else if (this.anInt2594 < this.anIntArray228[local16 + 1]) {
				this.anInt2594 = this.anIntArray228[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZBLclient!ha;)Lclient!st;")
	public Class23 method2431(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(22) int local22 = arg0 ? this.anInt2591 : this.anInt2596;
		@Pc(29) int local29 = arg1.anInt8962 << 29 | local22;
		@Pc(38) Class23 local38 = (Class23) this.aClass246_2.aClass82_135.method2156((long) local29);
		if (local38 != null) {
			return local38;
		} else if (this.aClass246_2.aClass330_83.method7581(local22)) {
			@Pc(60) Class407 local60 = Static735.method9382(this.aClass246_2.aClass330_83, local22, 0);
			if (local60 != null) {
				local38 = arg1.method7948(local60, true);
				this.aClass246_2.aClass82_135.method2150(local38, (long) local29);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!ge;I)V")
	private void method2432(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2596 = arg0.g2();
		} else if (arg1 == 2) {
			this.anInt2591 = arg0.g2();
		} else if (arg1 == 3) {
			this.aString25 = arg0.gjstr();
		} else if (arg1 == 4) {
			this.anInt2592 = arg0.g3();
		} else if (arg1 == 5) {
			this.anInt2589 = arg0.g3();
		} else if (arg1 == 6) {
			this.anInt2615 = arg0.g1();
		} else {
			@Pc(74) int local74;
			if (arg1 == 7) {
				local74 = arg0.g1();
				if ((local74 & 0x1) == 0) {
					this.aBoolean214 = false;
				}
				if ((local74 & 0x2) == 2) {
					this.aBoolean218 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean216 = arg0.g1() == 1;
			} else if (arg1 == 9) {
				this.anInt2599 = arg0.g2();
				if (this.anInt2599 == 65535) {
					this.anInt2599 = -1;
				}
				this.anInt2616 = arg0.g2();
				if (this.anInt2616 == 65535) {
					this.anInt2616 = -1;
				}
				this.anInt2612 = arg0.g4();
				this.anInt2582 = arg0.g4();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(291) int local291;
				@Pc(314) int local314;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean217 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString24 = arg0.gjstr();
					} else if (arg1 == 18) {
						this.anInt2618 = arg0.g2();
						return;
					} else if (arg1 == 19) {
						this.anInt2597 = arg0.g2();
						return;
					} else if (arg1 == 20) {
						this.anInt2586 = arg0.g2();
						if (this.anInt2586 == 65535) {
							this.anInt2586 = -1;
						}
						this.anInt2584 = arg0.g2();
						if (this.anInt2584 == 65535) {
							this.anInt2584 = -1;
						}
						this.anInt2606 = arg0.g4();
						this.anInt2601 = arg0.g4();
						return;
					} else if (arg1 == 21) {
						this.anInt2608 = arg0.g4();
						return;
					} else if (arg1 == 22) {
						this.anInt2605 = arg0.g4();
						return;
					} else if (arg1 == 23) {
						this.anInt2603 = arg0.g1();
						this.anInt2587 = arg0.g1();
						this.anInt2607 = arg0.g1();
						return;
					} else if (arg1 == 24) {
						this.anInt2600 = arg0.g2s();
						this.anInt2617 = arg0.g2s();
						return;
					} else if (arg1 == 249) {
						local74 = arg0.g1();
						if (this.aClass28_14 == null) {
							local291 = Static440.method5962(local74);
							this.aClass28_14 = new Class28(local291);
						}
						for (local291 = 0; local291 < local74; local291++) {
							@Pc(310) boolean local310 = arg0.g1() == 1;
							local314 = arg0.g3();
							@Pc(323) Class2 local323;
							if (local310) {
								local323 = new Class2_Sub24(arg0.gjstr());
							} else {
								local323 = new Class2_Sub38(arg0.g4());
							}
							this.aClass28_14.method735((long) local314, local323);
						}
						return;
					}
					return;
				}
				local74 = arg0.g1();
				this.anIntArray228 = new int[local74 * 2];
				for (local291 = 0; local291 < local74 * 2; local291++) {
					this.anIntArray228[local291] = arg0.g2s();
				}
				this.anInt2610 = arg0.g4();
				@Pc(389) int local389 = arg0.g1();
				this.anIntArray229 = new int[local389];
				for (local314 = 0; local314 < this.anIntArray229.length; local314++) {
					this.anIntArray229[local314] = arg0.g4();
				}
				this.aByteArray31 = new byte[local74];
				for (@Pc(419) int local419 = 0; local419 < local74; local419++) {
					this.aByteArray31[local419] = arg0.g1b();
				}
				return;
			} else {
				this.aStringArray9[arg1 - 10] = arg0.gjstr();
				return;
			}
		}
	}
}
