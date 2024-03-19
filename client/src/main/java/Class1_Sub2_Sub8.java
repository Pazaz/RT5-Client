import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "[S")
	private final short[] aShortArray21 = new short[257];

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
	private int anInt1758 = 0;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	private void method1501() {
		@Pc(12) int[] local12 = this.anIntArrayArray7[0];
		@Pc(17) int[] local17 = this.anIntArrayArray7[1];
		@Pc(26) int[] local26 = this.anIntArrayArray7[this.anIntArrayArray7.length - 2];
		@Pc(35) int[] local35 = this.anIntArrayArray7[this.anIntArrayArray7.length - 1];
		this.anIntArray115 = new int[] { local12[0] + local12[0] - local17[0], local12[1] + -local17[1] + local12[1] };
		this.anIntArray116 = new int[] { local26[0] + local26[0] - local35[0], local26[1] - (-local26[1] + local35[1]) };
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)[I")
	private int[] method1502(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray115;
		} else if (this.anIntArrayArray7.length <= arg0) {
			return this.anIntArray116;
		} else {
			return this.anIntArrayArray7[arg0];
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		if (this.anIntArrayArray7 == null) {
			this.anIntArrayArray7 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray7.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt1758 == 2) {
			this.method1501();
		}
		Static166.method3459();
		this.method1504();
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(26) int[] local26 = this.method6078(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static64.anInt1755; local28++) {
				@Pc(36) int local36 = local26[local28] >> 4;
				if (local36 < 0) {
					local36 = 0;
				}
				if (local36 > 256) {
					local36 = 256;
				}
				local11[local28] = this.aShortArray21[local36];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(B)V")
	private void method1504() {
		@Pc(8) int local8 = this.anInt1758;
		@Pc(26) int local26;
		@Pc(24) int local24;
		@Pc(57) int[] local57;
		@Pc(62) int[] local62;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; this.anIntArrayArray7.length - 1 > local26 && this.anIntArrayArray7[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray7[local26 - 1];
				local62 = this.anIntArrayArray7[local26];
				local71 = this.method1502(local26 - 2)[1];
				local75 = local57[1];
				local79 = local62[1];
				local88 = this.method1502(local26 + 1)[1];
				@Pc(105) int local105 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				@Pc(111) int local111 = local105 * local105 >> 12;
				@Pc(121) int local121 = local75 + local88 - local71 - local79;
				@Pc(128) int local128 = local71 - local121 - local75;
				@Pc(133) int local133 = local79 - local71;
				@Pc(145) int local145 = local111 * (local105 * local121 >> 12) >> 12;
				@Pc(151) int local151 = local111 * local128 >> 12;
				@Pc(157) int local157 = local105 * local133 >> 12;
				@Pc(167) int local167 = local151 + local145 + local157 + local75;
				if (local167 <= -32768) {
					local167 = -32767;
				}
				if (local167 >= 32768) {
					local167 = 32767;
				}
				this.aShortArray21[local8] = (short) local167;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; local26 < this.anIntArrayArray7.length - 1 && this.anIntArrayArray7[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray7[local26 - 1];
				local62 = this.anIntArrayArray7[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - Static110.anIntArray232[local71 >> 5 & 0xFF] >> 1;
				local79 = 4096 - local75;
				local88 = local62[1] * local75 + local79 * local57[1] >> 12;
				if (local88 <= -32768) {
					local88 = -32767;
				}
				if (local88 >= 32768) {
					local88 = 32767;
				}
				this.aShortArray21[local8] = (short) local88;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local24 = local8 << 4;
				for (local26 = 1; this.anIntArrayArray7.length - 1 > local26 && this.anIntArrayArray7[local26][0] <= local24; local26++) {
				}
				local57 = this.anIntArrayArray7[local26 - 1];
				local62 = this.anIntArrayArray7[local26];
				local71 = (local24 - local57[0] << 12) / (local62[0] - local57[0]);
				local75 = 4096 - local71;
				local79 = local57[1] * local75 + local71 * local62[1] >> 12;
				if (local79 <= -32768) {
					local79 = -32767;
				}
				if (local79 >= 32768) {
					local79 = 32767;
				}
				this.aShortArray21[local8] = (short) local79;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt1758 = arg1.method5761();
		this.anIntArrayArray7 = new int[arg1.method5761()][2];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArrayArray7.length; local22++) {
			this.anIntArrayArray7[local22][0] = arg1.method5749();
			this.anIntArrayArray7[local22][1] = arg1.method5749();
		}
	}
}
