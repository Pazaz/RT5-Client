import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class83 {

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	public int anInt2825 = -1;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public int anInt2827 = -1;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "[I")
	private int[] anIntArray201 = null;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
	public int anInt2834 = 0;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public int anInt2831 = -1;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public int anInt2828 = -1;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	public int anInt2833 = -1;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public int anInt2832 = -1;

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
	public int anInt2838 = 0;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
	public int anInt2844 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public int anInt2823 = -1;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	public int anInt2830 = 0;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
	public int anInt2843 = -1;

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "[I")
	private int[] anIntArray202 = null;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public int anInt2826 = -1;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public int anInt2851 = -1;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	public int anInt2853 = -1;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
	public int anInt2835 = -1;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	public int anInt2839 = -1;

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
	public int anInt2848 = -1;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
	public int anInt2846 = 0;

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
	public int anInt2847 = -1;

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	public int anInt2856 = 0;

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
	public int anInt2850 = -1;

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	public int anInt2855 = -1;

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
	public int anInt2849 = 0;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
	public int anInt2837 = -1;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
	public int anInt2836 = -1;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
	public int anInt2854 = -1;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
	public int anInt2860 = 0;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	public int anInt2829 = -1;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
	public int anInt2857 = -1;

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
	public int anInt2845 = -1;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
	public int anInt2841 = 0;

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
	private int anInt2862 = 0;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
	public int anInt2858 = -1;

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
	public int anInt2861 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
	public int method2370() {
		if (this.anInt2843 != -1) {
			return this.anInt2843;
		} else if (this.anIntArray202 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt2862 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray201[local30]; local30++) {
				local28 -= this.anIntArray201[local30];
			}
			return this.anIntArray202[local30];
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!il;II)V")
	private void method2371(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2843 = arg0.method5749();
			this.anInt2836 = arg0.method5749();
			if (this.anInt2843 == 65535) {
				this.anInt2843 = -1;
			}
			if (this.anInt2836 == 65535) {
				this.anInt2836 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2845 = arg0.method5749();
		} else if (arg1 == 3) {
			this.anInt2855 = arg0.method5749();
		} else if (arg1 == 4) {
			this.anInt2854 = arg0.method5749();
		} else if (arg1 == 5) {
			this.anInt2848 = arg0.method5749();
		} else if (arg1 == 6) {
			this.anInt2847 = arg0.method5749();
		} else if (arg1 == 7) {
			this.anInt2833 = arg0.method5749();
		} else if (arg1 == 8) {
			this.anInt2853 = arg0.method5749();
		} else if (arg1 == 9) {
			this.anInt2831 = arg0.method5749();
		} else if (arg1 == 26) {
			this.anInt2844 = (short) (arg0.method5761() * 4);
			this.anInt2846 = (short) (arg0.method5761() * 4);
		} else {
			@Pc(105) int local105;
			@Pc(113) int local113;
			if (arg1 == 27) {
				if (this.anIntArrayArray14 == null) {
					this.anIntArrayArray14 = new int[12][];
				}
				local105 = arg0.method5761();
				this.anIntArrayArray14[local105] = new int[6];
				for (local113 = 0; local113 < 6; local113++) {
					this.anIntArrayArray14[local105][local113] = arg0.method5762();
				}
			} else if (arg1 == 28) {
				this.anIntArray203 = new int[12];
				for (local105 = 0; local105 < 12; local105++) {
					this.anIntArray203[local105] = arg0.method5761();
					if (this.anIntArray203[local105] == 255) {
						this.anIntArray203[local105] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt2860 = arg0.method5761();
			} else if (arg1 == 30) {
				this.anInt2849 = arg0.method5749();
			} else if (arg1 == 31) {
				this.anInt2856 = arg0.method5761();
			} else if (arg1 == 32) {
				this.anInt2834 = arg0.method5749();
			} else if (arg1 == 33) {
				this.anInt2830 = arg0.method5762();
			} else if (arg1 == 34) {
				this.anInt2861 = arg0.method5761();
			} else if (arg1 == 35) {
				this.anInt2841 = arg0.method5749();
			} else if (arg1 == 36) {
				this.anInt2838 = arg0.method5762();
			} else if (arg1 == 37) {
				this.anInt2825 = arg0.method5761();
			} else if (arg1 == 38) {
				this.anInt2832 = arg0.method5749();
			} else if (arg1 == 39) {
				this.anInt2828 = arg0.method5749();
			} else if (arg1 == 40) {
				this.anInt2823 = arg0.method5749();
			} else if (arg1 == 41) {
				this.anInt2827 = arg0.method5749();
			} else if (arg1 == 42) {
				this.anInt2850 = arg0.method5749();
			} else if (arg1 == 43) {
				arg0.method5749();
			} else if (arg1 == 44) {
				this.anInt2829 = arg0.method5749();
			} else if (arg1 == 45) {
				this.anInt2837 = arg0.method5749();
			} else if (arg1 == 46) {
				this.anInt2851 = arg0.method5749();
			} else if (arg1 == 47) {
				this.anInt2839 = arg0.method5749();
			} else if (arg1 == 48) {
				this.anInt2857 = arg0.method5749();
			} else if (arg1 == 49) {
				this.anInt2826 = arg0.method5749();
			} else if (arg1 == 50) {
				this.anInt2858 = arg0.method5749();
			} else if (arg1 == 51) {
				this.anInt2835 = arg0.method5749();
			} else if (arg1 == 52) {
				local105 = arg0.method5761();
				this.anIntArray201 = new int[local105];
				this.anIntArray202 = new int[local105];
				for (local113 = 0; local113 < local105; local113++) {
					this.anIntArray202[local113] = arg0.method5749();
					@Pc(332) int local332 = arg0.method5761();
					this.anIntArray201[local113] = local332;
					this.anInt2862 += local332;
				}
			} else if (arg1 == 53) {
				this.aBoolean189 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z")
	public boolean method2373(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt2843 == arg0) {
			return true;
		} else {
			if (this.anIntArray202 != null) {
				for (@Pc(25) int local25 = 0; local25 < this.anIntArray202.length; local25++) {
					if (this.anIntArray202[local25] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method2374() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!il;)V")
	public void method2375(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method2371(arg0, local5);
		}
	}
}
