import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class69 {

	@OriginalMember(owner = "client!cka", name = "v", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!cka", name = "y", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!cka", name = "z", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!cka", name = "k", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!cka", name = "t", descriptor = "I")
	public int anInt1650;

	@OriginalMember(owner = "client!cka", name = "m", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!cka", name = "B", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "I")
	public int anInt1640 = -1;

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
	public int anInt1646 = 2;

	@OriginalMember(owner = "client!cka", name = "w", descriptor = "I")
	public int anInt1642 = -1;

	@OriginalMember(owner = "client!cka", name = "u", descriptor = "I")
	public int anInt1647 = 99;

	@OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
	public int anInt1649 = 5;

	@OriginalMember(owner = "client!cka", name = "j", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "I")
	public int anInt1651 = -1;

	@OriginalMember(owner = "client!cka", name = "n", descriptor = "I")
	public int anInt1652 = -1;

	@OriginalMember(owner = "client!cka", name = "C", descriptor = "I")
	public int anInt1654 = -1;

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)V")
	public void method1584() {
		if (this.anInt1654 == -1) {
			if (this.aBooleanArray3 == null) {
				this.anInt1654 = 0;
			} else {
				this.anInt1654 = 2;
			}
		}
		if (this.anInt1642 != -1) {
			return;
		}
		if (this.aBooleanArray3 == null) {
			this.anInt1642 = 0;
		} else {
			this.anInt1642 = 2;
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method1585(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7396();
			if (local3 == 0) {
				return;
			}
			this.method1588(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IBLclient!ge;)V")
	private void method1588(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(44) int local44;
		@Pc(58) int local58;
		if (arg0 == 1) {
			local20 = arg1.method7382();
			this.anIntArray157 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray157[local26] = arg1.method7382();
			}
			this.anIntArray159 = new int[local20];
			for (local44 = 0; local44 < local20; local44++) {
				this.anIntArray159[local44] = arg1.method7382();
			}
			for (local58 = 0; local58 < local20; local58++) {
				this.anIntArray159[local58] = (arg1.method7382() << 16) + this.anIntArray159[local58];
			}
		} else if (arg0 == 2) {
			this.anInt1640 = arg1.method7382();
		} else if (arg0 == 3) {
			this.aBooleanArray3 = new boolean[256];
			local20 = arg1.method7396();
			for (local26 = 0; local26 < local20; local26++) {
				this.aBooleanArray3[arg1.method7396()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt1649 = arg1.method7396();
		} else if (arg0 == 6) {
			this.anInt1652 = arg1.method7382();
		} else if (arg0 == 7) {
			this.anInt1651 = arg1.method7382();
		} else if (arg0 == 8) {
			this.anInt1647 = arg1.method7396();
		} else if (arg0 == 9) {
			this.anInt1642 = arg1.method7396();
		} else if (arg0 == 10) {
			this.anInt1654 = arg1.method7396();
		} else if (arg0 == 11) {
			this.anInt1646 = arg1.method7396();
		} else if (arg0 == 12) {
			local20 = arg1.method7396();
			this.anIntArray158 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray158[local26] = arg1.method7382();
			}
			for (local44 = 0; local44 < local20; local44++) {
				this.anIntArray158[local44] += arg1.method7382() << 16;
			}
		} else if (arg0 == 13) {
			local20 = arg1.method7382();
			this.anIntArrayArray38 = new int[local20][];
			for (local26 = 0; local26 < local20; local26++) {
				local44 = arg1.method7396();
				if (local44 > 0) {
					this.anIntArrayArray38[local26] = new int[local44];
					this.anIntArrayArray38[local26][0] = arg1.method7383();
					for (local58 = 1; local58 < local44; local58++) {
						this.anIntArrayArray38[local26][local58] = arg1.method7382();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean140 = true;
		} else if (arg0 == 15) {
			this.aBoolean142 = true;
		} else if (arg0 != 16) {
			if (arg0 == 18) {
				this.aBoolean141 = true;
			} else if (arg0 == 19) {
				if (this.anIntArray156 == null) {
					this.anIntArray156 = new int[this.anIntArrayArray38.length];
					for (local20 = 0; local20 < this.anIntArrayArray38.length; local20++) {
						this.anIntArray156[local20] = 255;
					}
				}
				this.anIntArray156[arg1.method7396()] = arg1.method7396();
				return;
			} else if (arg0 == 20) {
				if (this.anIntArray154 == null || this.anIntArray155 == null) {
					this.anIntArray154 = new int[this.anIntArrayArray38.length];
					this.anIntArray155 = new int[this.anIntArrayArray38.length];
					for (local20 = 0; local20 < this.anIntArrayArray38.length; local20++) {
						this.anIntArray154[local20] = 256;
						this.anIntArray155[local20] = 256;
					}
				}
				local20 = arg1.method7396();
				this.anIntArray154[local20] = arg1.method7382();
				this.anIntArray155[local20] = arg1.method7382();
				return;
			}
			return;
		}
	}
}
