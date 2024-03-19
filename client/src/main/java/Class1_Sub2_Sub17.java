import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ho", name = "lb", descriptor = "I")
	public static int lb = 0;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ho", name = "gb", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
	public int anInt2993 = 4;

	@OriginalMember(owner = "client!ho", name = "Z", descriptor = "[B")
	private byte[] aByteArray26 = new byte[512];

	@OriginalMember(owner = "client!ho", name = "db", descriptor = "I")
	public int anInt3003 = 4;

	@OriginalMember(owner = "client!ho", name = "ab", descriptor = "I")
	public int anInt3000 = 4;

	@OriginalMember(owner = "client!ho", name = "eb", descriptor = "I")
	public int anInt3004 = 1638;

	@OriginalMember(owner = "client!ho", name = "hb", descriptor = "I")
	public int anInt3006 = 0;

	@OriginalMember(owner = "client!ho", name = "Q", descriptor = "Z")
	public boolean aBoolean200 = true;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		this.aByteArray26 = Static88.method1947(this.anInt3006);
		this.method2572();
		for (@Pc(23) int local23 = this.anInt3000 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray51[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt3000--;
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			this.method2574(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(B)V")
	private void method2572() {
		@Pc(28) int local28;
		if (this.anInt3004 > 0) {
			this.aShortArray51 = new short[this.anInt3000];
			this.aShortArray52 = new short[this.anInt3000];
			for (local28 = 0; local28 < this.anInt3000; local28++) {
				this.aShortArray51[local28] = (short) (Math.pow((double) ((float) this.anInt3004 / 4096.0F), (double) local28) * 4096.0D);
				this.aShortArray52[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		} else if (this.aShortArray51 != null && this.anInt3000 == this.aShortArray51.length) {
			this.aShortArray52 = new short[this.anInt3000];
			for (local28 = 0; local28 < this.anInt3000; local28++) {
				this.aShortArray52[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.aBoolean200 = arg1.method5761() == 1;
		} else if (arg0 == 1) {
			this.anInt3000 = arg1.method5761();
		} else if (arg0 == 2) {
			this.anInt3004 = arg1.method5762();
			if (this.anInt3004 < 0) {
				this.aShortArray51 = new short[this.anInt3000];
				for (@Pc(67) int local67 = 0; local67 < this.anInt3000; local67++) {
					this.aShortArray51[local67] = (short) arg1.method5762();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3003 = this.anInt2993 = arg1.method5761();
		} else if (arg0 == 4) {
			this.anInt3006 = arg1.method5761();
		} else if (arg0 == 5) {
			this.anInt3003 = arg1.method5761();
		} else if (arg0 == 6) {
			this.anInt2993 = arg1.method5761();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[II)V")
	public void method2574(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt2993 * Static60.anIntArray455[arg1];
		@Pc(106) int local106;
		@Pc(120) int local120;
		@Pc(36) int local36;
		@Pc(21) short local21;
		@Pc(97) int local97;
		@Pc(56) int local56;
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(95) int local95;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(91) int local91;
		@Pc(82) int local82;
		if (this.anInt3000 == 1) {
			local21 = this.aShortArray51[0];
			local36 = this.aShortArray52[0] << 12;
			local56 = local36 * local12 >> 12;
			local50 = local36 * this.anInt2993 >> 12;
			local43 = local36 * this.anInt3003 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			if (local64 >= local50) {
				local64 = 0;
			}
			local56 &= 0xFFF;
			local91 = this.aByteArray26[local60 & 0xFF] & 0xFF;
			local95 = Class5.anIntArray10[local56];
			local82 = this.aByteArray26[local64 & 0xFF] & 0xFF;
			if (this.aBoolean200) {
				for (local97 = 0; local97 < Static64.anInt1755; local97++) {
					local106 = Static207.anIntArray360[local97] * this.anInt3003;
					local120 = this.method2577(local56, local106 * local36 >> 12, local43, local95, local91, local82);
					local120 = local120 * local21 >> 12;
					arg0[local97] = (local120 >> 1) + 2048;
				}
			} else {
				for (local97 = 0; local97 < Static64.anInt1755; local97++) {
					local106 = Static207.anIntArray360[local97] * this.anInt3003;
					local120 = this.method2577(local56, local36 * local106 >> 12, local43, local95, local91, local82);
					arg0[local97] = local120 * local21 >> 12;
				}
			}
			return;
		}
		local21 = this.aShortArray51[0];
		if (local21 > 8 || local21 < -8) {
			local36 = this.aShortArray52[0] << 12;
			local43 = local36 * this.anInt3003 >> 12;
			local50 = local36 * this.anInt2993 >> 12;
			local56 = local36 * local12 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			if (local50 <= local64) {
				local64 = 0;
			}
			local56 &= 0xFFF;
			local82 = this.aByteArray26[local64 & 0xFF] & 0xFF;
			local91 = this.aByteArray26[local60 & 0xFF] & 0xFF;
			local95 = Class5.anIntArray10[local56];
			for (local97 = 0; local97 < Static64.anInt1755; local97++) {
				local106 = Static207.anIntArray360[local97] * this.anInt3003;
				local120 = this.method2577(local56, local36 * local106 >> 12, local43, local95, local91, local82);
				arg0[local97] = local21 * local120 >> 12;
			}
		}
		for (@Pc(134) int local134 = 1; local134 < this.anInt3000; local134++) {
			local21 = this.aShortArray51[local134];
			if (local21 > 8 || local21 < -8) {
				local36 = this.aShortArray52[local134] << 12;
				local56 = local36 * local12 >> 12;
				local43 = this.anInt3003 * local36 >> 12;
				local50 = this.anInt2993 * local36 >> 12;
				local60 = local56 >> 12;
				local64 = local60 + 1;
				if (local50 <= local64) {
					local64 = 0;
				}
				local56 &= 0xFFF;
				local95 = Class5.anIntArray10[local56];
				local91 = this.aByteArray26[local60 & 0xFF] & 0xFF;
				local82 = this.aByteArray26[local64 & 0xFF] & 0xFF;
				if (this.aBoolean200 && local134 == this.anInt3000 - 1) {
					for (local97 = 0; local97 < Static64.anInt1755; local97++) {
						local106 = this.anInt3003 * Static207.anIntArray360[local97];
						local120 = this.method2577(local56, local36 * local106 >> 12, local43, local95, local91, local82);
						local120 = arg0[local97] + (local120 * local21 >> 12);
						arg0[local97] = (local120 >> 1) + 2048;
					}
				} else {
					for (local97 = 0; local97 < Static64.anInt1755; local97++) {
						local106 = this.anInt3003 * Static207.anIntArray360[local97];
						local120 = this.method2577(local56, local36 * local106 >> 12, local43, local95, local91, local82);
						arg0[local97] += local21 * local120 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBIIII)I")
	private int method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg2) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(30) int local30 = arg1 & 0xFFF;
		@Pc(34) int local34 = arg0 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = local30 - 4096;
		@Pc(46) int local46 = Class5.anIntArray10[local30];
		@Pc(56) int local56 = this.aByteArray26[local9 + arg4] & 0x3;
		@Pc(70) int local70;
		if (local56 <= 1) {
			local70 = local56 == 0 ? local30 + arg0 : arg0 + -local30;
		} else {
			local70 = local56 == 2 ? local30 - arg0 : -arg0 + -local30;
		}
		local56 = this.aByteArray26[arg4 + local13] & 0x3;
		@Pc(121) int local121;
		if (local56 > 1) {
			local121 = local56 == 2 ? local42 - arg0 : -arg0 + -local42;
		} else {
			local121 = local56 == 0 ? arg0 + local42 : arg0 - local42;
		}
		@Pc(144) int local144 = ((local121 - local70) * local46 >> 12) + local70;
		local56 = this.aByteArray26[local9 + arg5] & 0x3;
		if (local56 > 1) {
			local70 = local56 == 2 ? local30 - local34 : -local30 + -local34;
		} else {
			local70 = local56 == 0 ? local34 + local30 : -local30 + local34;
		}
		local56 = this.aByteArray26[local13 + arg5] & 0x3;
		if (local56 > 1) {
			local121 = local56 == 2 ? local42 - local34 : -local42 + -local34;
		} else {
			local121 = local56 == 0 ? local34 + local42 : local34 - local42;
		}
		@Pc(242) int local242 = local70 + (local46 * (local121 - local70) >> 12);
		return (arg3 * (local242 - local144) >> 12) + local144;
	}
}
