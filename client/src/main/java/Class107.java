import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class107 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public int anInt3767;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public int anInt3768;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
	private int anInt3769;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Ljava/lang/String;")
	public String aString138;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString139;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public int anInt3775;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	private int anInt3777;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	public int anInt3781;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public int anInt3784;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt3790;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt3791;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	private int anInt3792;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public int anInt3770 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	private int anInt3766 = -1;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
	public boolean aBoolean265 = true;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	private int anInt3776 = -1;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt3773 = -1;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	public int anInt3783 = 0;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
	public boolean aBoolean267 = true;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public int anInt3786 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
	public boolean aBoolean268 = true;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public int anInt3780 = -1;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public int anInt3779 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt3789 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	private int anInt3765 = -1;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray25 = new String[5];

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	public int anInt3795 = -1;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private int anInt3785 = -1;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	public int anInt3793 = -1;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	public int anInt3794 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLclient!nr;)Lclient!qa;")
	public Class29 method3285(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt3780 : this.anInt3793;
		@Pc(18) int local18 = local11 | arg1.anInt3191 << 29;
		@Pc(25) Class29 local25 = (Class29) Static11.aClass215_99.method6057((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static344.aClass162_237.method4615(local11)) {
			@Pc(48) Class133 local48 = Static363.method3886(Static344.aClass162_237, local11, 0);
			if (local48 != null) {
				local25 = arg1.method2722(local48);
				Static11.aClass215_99.method6050(local25, (long) local18);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method3286() {
		if (this.anIntArray271 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray271.length; local6 += 2) {
			if (this.anIntArray271[local6] < this.anInt3794) {
				this.anInt3794 = this.anIntArray271[local6];
			} else if (this.anInt3770 < this.anIntArray271[local6]) {
				this.anInt3770 = this.anIntArray271[local6];
			}
			if (this.anIntArray271[local6 + 1] < this.anInt3779) {
				this.anInt3779 = this.anIntArray271[local6 + 1];
			} else if (this.anInt3786 < this.anIntArray271[local6 + 1]) {
				this.anInt3786 = this.anIntArray271[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!il;I)V")
	private void method3288(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3793 = arg0.method5749();
		} else if (arg1 == 2) {
			this.anInt3780 = arg0.method5749();
		} else if (arg1 == 3) {
			this.aString138 = arg0.method5776();
		} else if (arg1 == 4) {
			this.anInt3767 = arg0.method5755();
		} else if (arg1 == 5) {
			this.anInt3795 = arg0.method5755();
		} else if (arg1 == 6) {
			this.anInt3783 = arg0.method5761();
		} else {
			@Pc(51) int local51;
			if (arg1 == 7) {
				local51 = arg0.method5761();
				if ((local51 & 0x2) == 2) {
					this.aBoolean266 = true;
				}
				if ((local51 & 0x1) == 0) {
					this.aBoolean267 = false;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean268 = arg0.method5761() == 1;
			} else if (arg1 == 9) {
				this.anInt3773 = arg0.method5749();
				if (this.anInt3773 == 65535) {
					this.anInt3773 = -1;
				}
				this.anInt3766 = arg0.method5749();
				if (this.anInt3766 == 65535) {
					this.anInt3766 = -1;
				}
				this.anInt3777 = arg0.method5730();
				this.anInt3791 = arg0.method5730();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 == 18) {
								this.anInt3785 = arg0.method5749();
								return;
							}
							if (arg1 == 19) {
								this.anInt3789 = arg0.method5749();
								return;
							}
							if (arg1 == 20) {
								this.anInt3765 = arg0.method5749();
								if (this.anInt3765 == 65535) {
									this.anInt3765 = -1;
								}
								this.anInt3776 = arg0.method5749();
								if (this.anInt3776 == 65535) {
									this.anInt3776 = -1;
								}
								this.anInt3769 = arg0.method5730();
								this.anInt3792 = arg0.method5730();
								return;
							}
							if (arg1 == 21) {
								this.anInt3784 = arg0.method5730();
							} else if (arg1 == 22) {
								this.anInt3781 = arg0.method5730();
								return;
							}
							return;
						}
						this.aString139 = arg0.method5776();
						return;
					}
					this.aBoolean265 = false;
					return;
				}
				local51 = arg0.method5761();
				this.anIntArray271 = new int[local51 * 2];
				for (@Pc(147) int local147 = 0; local147 < local51 * 2; local147++) {
					this.anIntArray271[local147] = arg0.method5762();
				}
				this.anInt3790 = arg0.method5730();
				this.anInt3775 = arg0.method5730();
				return;
			} else {
				this.aStringArray25[arg1 - 10] = arg0.method5776();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!il;I)V")
	public void method3289(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5761();
			if (local9 == 0) {
				return;
			}
			this.method3288(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
	public boolean method3291() {
		if (this.anInt3766 == -1 && this.anInt3773 == -1) {
			return true;
		}
		@Pc(27) int local27;
		if (this.anInt3766 == -1) {
			local27 = Static95.method2034(this.anInt3773);
		} else {
			local27 = Static78.anIntArray137[this.anInt3766];
		}
		if (this.anInt3777 > local27 || local27 > this.anInt3791) {
			return false;
		} else if (this.anInt3776 == -1 && this.anInt3765 == -1) {
			return true;
		} else {
			if (this.anInt3776 == -1) {
				local27 = Static95.method2034(this.anInt3765);
			} else {
				local27 = Static78.anIntArray137[this.anInt3776];
			}
			return local27 >= this.anInt3769 && local27 <= this.anInt3792;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!nr;I)Lclient!qa;")
	public Class29 method3292(@OriginalArg(0) Class40 arg0) {
		@Pc(20) Class29 local20 = (Class29) Static11.aClass215_99.method6057((long) (this.anInt3785 | 0x20000 | arg0.anInt3191 << 29));
		if (local20 != null) {
			return local20;
		}
		Static344.aClass162_237.method4615(this.anInt3785);
		@Pc(42) Class133 local42 = Static363.method3886(Static344.aClass162_237, this.anInt3785, 0);
		if (local42 != null) {
			local20 = arg0.method2722(local42);
			Static11.aClass215_99.method6050(local20, (long) (arg0.anInt3191 << 29 | this.anInt3785 | 0x20000));
		}
		return local20;
	}
}
