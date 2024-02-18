import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class292 {

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "[I")
	public int[] anIntArray595;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "[I")
	public int[] anIntArray596;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "[Lclient!eha;")
	public Class100[] aClass100Array1;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray185;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	public int anInt7366;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
	public int[] anIntArray597;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public int anInt7367;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
	public int[] anIntArray598;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	public int anInt7368;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "[[B")
	public byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "[I")
	public int[] anIntArray600;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!eha;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray186;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public final int anInt7365;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([BI[B)V")
	public Class292(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt7365 = Static591.method7758(arg0.length, arg0);
		if (arg1 != this.anInt7365) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray86 = Static607.method8161(arg0, arg0.length, 0);
			for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
				if (arg2[local45] != this.aByteArray86[local45]) {
					throw new RuntimeException();
				}
			}
		}
		this.method6568(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([BZ)V")
	private void method6568(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub21 local12 = new Class2_Sub21(Static590.method7744(arg0));
		@Pc(16) int local16 = local12.method7396();
		if (local16 < 5 || local16 > 7) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt7366 = local12.method7349();
		} else {
			this.anInt7366 = 0;
		}
		@Pc(54) int local54 = local12.method7396();
		@Pc(63) boolean local63 = (local54 & 0x1) != 0;
		@Pc(75) boolean local75 = (local54 & 0x2) != 0;
		if (local16 >= 7) {
			this.anInt7367 = local12.method7364();
		} else {
			this.anInt7367 = local12.method7382();
		}
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = -1;
		this.anIntArray600 = new int[this.anInt7367];
		@Pc(115) int local115;
		if (local16 >= 7) {
			for (local115 = 0; local115 < this.anInt7367; local115++) {
				this.anIntArray600[local115] = local101 += local12.method7364();
				if (this.anIntArray600[local115] > local103) {
					local103 = this.anIntArray600[local115];
				}
			}
		} else {
			for (local115 = 0; local115 < this.anInt7367; local115++) {
				this.anIntArray600[local115] = local101 += local12.method7382();
				if (local103 < this.anIntArray600[local115]) {
					local103 = this.anIntArray600[local115];
				}
			}
		}
		this.anInt7368 = local103 + 1;
		this.anIntArray599 = new int[this.anInt7368];
		if (local75) {
			this.aByteArrayArray24 = new byte[this.anInt7368][];
		}
		this.anIntArray597 = new int[this.anInt7368];
		this.anIntArray595 = new int[this.anInt7368];
		this.anIntArray598 = new int[this.anInt7368];
		this.anIntArrayArray185 = new int[this.anInt7368][];
		@Pc(265) int local265;
		if (local63) {
			this.anIntArray596 = new int[this.anInt7368];
			for (local115 = 0; local115 < this.anInt7368; local115++) {
				this.anIntArray596[local115] = -1;
			}
			for (local265 = 0; local265 < this.anInt7367; local265++) {
				this.anIntArray596[this.anIntArray600[local265]] = local12.method7349();
			}
			this.aClass100_1 = new Class100(this.anIntArray596);
		}
		for (local115 = 0; local115 < this.anInt7367; local115++) {
			this.anIntArray599[this.anIntArray600[local115]] = local12.method7349();
		}
		if (local75) {
			for (local265 = 0; local265 < this.anInt7367; local265++) {
				@Pc(339) byte[] local339 = new byte[64];
				local12.method7344(0, 64, local339);
				this.aByteArrayArray24[this.anIntArray600[local265]] = local339;
			}
		}
		for (local265 = 0; local265 < this.anInt7367; local265++) {
			this.anIntArray597[this.anIntArray600[local265]] = local12.method7349();
		}
		@Pc(423) int local423;
		@Pc(432) int local432;
		@Pc(439) int local439;
		@Pc(441) int local441;
		@Pc(449) int local449;
		@Pc(466) int local466;
		@Pc(398) int local398;
		if (local16 < 7) {
			for (local398 = 0; local398 < this.anInt7367; local398++) {
				this.anIntArray598[this.anIntArray600[local398]] = local12.method7382();
			}
			for (local423 = 0; local423 < this.anInt7367; local423++) {
				local432 = this.anIntArray600[local423];
				local101 = 0;
				local439 = this.anIntArray598[local432];
				local441 = -1;
				this.anIntArrayArray185[local432] = new int[local439];
				for (local449 = 0; local449 < local439; local449++) {
					local466 = this.anIntArrayArray185[local432][local449] = local101 += local12.method7382();
					if (local441 < local466) {
						local441 = local466;
					}
				}
				this.anIntArray595[local432] = local441 + 1;
				if (local439 == local441 + 1) {
					this.anIntArrayArray185[local432] = null;
				}
			}
		} else {
			for (local398 = 0; local398 < this.anInt7367; local398++) {
				this.anIntArray598[this.anIntArray600[local398]] = local12.method7364();
			}
			for (local423 = 0; local423 < this.anInt7367; local423++) {
				local432 = this.anIntArray600[local423];
				local439 = this.anIntArray598[local432];
				local101 = 0;
				local441 = -1;
				this.anIntArrayArray185[local432] = new int[local439];
				for (local449 = 0; local449 < local439; local449++) {
					local466 = this.anIntArrayArray185[local432][local449] = local101 += local12.method7364();
					if (local466 > local441) {
						local441 = local466;
					}
				}
				this.anIntArray595[local432] = local441 + 1;
				if (local441 + 1 == local439) {
					this.anIntArrayArray185[local432] = null;
				}
			}
		}
		if (!local63) {
			return;
		}
		this.aClass100Array1 = new Class100[local103 + 1];
		this.anIntArrayArray186 = new int[local103 + 1][];
		for (local398 = 0; local398 < this.anInt7367; local398++) {
			local423 = this.anIntArray600[local398];
			local432 = this.anIntArray598[local423];
			this.anIntArrayArray186[local423] = new int[this.anIntArray595[local423]];
			for (local439 = 0; local439 < this.anIntArray595[local423]; local439++) {
				this.anIntArrayArray186[local423][local439] = -1;
			}
			for (local441 = 0; local441 < local432; local441++) {
				if (this.anIntArrayArray185[local423] == null) {
					local449 = local441;
				} else {
					local449 = this.anIntArrayArray185[local423][local441];
				}
				this.anIntArrayArray186[local423][local449] = local12.method7349();
			}
			this.aClass100Array1[local423] = new Class100(this.anIntArrayArray186[local423]);
		}
	}
}
