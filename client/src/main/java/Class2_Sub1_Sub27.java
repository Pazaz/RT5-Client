import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!so", name = "Y", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!so", name = "P", descriptor = "[B")
	private byte[] aByteArray97 = new byte[512];

	@OriginalMember(owner = "client!so", name = "I", descriptor = "Z")
	public boolean aBoolean667 = true;

	@OriginalMember(owner = "client!so", name = "V", descriptor = "I")
	public int anInt8803 = 4;

	@OriginalMember(owner = "client!so", name = "W", descriptor = "I")
	public int anInt8805 = 4;

	@OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
	public int anInt8799 = 1638;

	@OriginalMember(owner = "client!so", name = "T", descriptor = "I")
	public int anInt8810 = 4;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	public int anInt8809 = 0;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[II)V")
	public void method7809(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(15) int local15 = this.anInt8805 * Static273.anIntArray341[arg0];
		@Pc(103) int local103;
		@Pc(117) int local117;
		@Pc(31) int local31;
		@Pc(24) short local24;
		@Pc(95) int local95;
		@Pc(37) int local37;
		@Pc(51) int local51;
		@Pc(44) int local44;
		@Pc(81) int local81;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(77) int local77;
		@Pc(90) int local90;
		if (this.anInt8803 == 1) {
			local24 = this.aShortArray127[0];
			local31 = this.aShortArray126[0] << 12;
			local37 = local15 * local31 >> 12;
			local44 = this.anInt8805 * local31 >> 12;
			local51 = this.anInt8810 * local31 >> 12;
			local55 = local37 >> 12;
			local59 = local55 + 1;
			local37 &= 0xFFF;
			if (local44 <= local59) {
				local59 = 0;
			}
			local77 = this.aByteArray97[local55 & 0xFF] & 0xFF;
			local81 = Class2_Sub2_Sub19.anIntArray768[local37];
			local90 = this.aByteArray97[local59 & 0xFF] & 0xFF;
			if (this.aBoolean667) {
				for (local95 = 0; local95 < Static608.anInt9289; local95++) {
					local103 = this.anInt8810 * Static54.anIntArray92[local95];
					local117 = this.method7812(local51, local77, local31 * local103 >> 12, local37, local81, local90);
					local117 = local117 * local24 >> 12;
					arg1[local95] = (local117 >> 1) + 2048;
				}
			} else {
				for (local95 = 0; local95 < Static608.anInt9289; local95++) {
					local103 = Static54.anIntArray92[local95] * this.anInt8810;
					local117 = this.method7812(local51, local77, local31 * local103 >> 12, local37, local81, local90);
					arg1[local95] = local117 * local24 >> 12;
				}
			}
			return;
		}
		local24 = this.aShortArray127[0];
		if (local24 > 8 || local24 < -8) {
			local31 = this.aShortArray126[0] << 12;
			local51 = local31 * this.anInt8810 >> 12;
			local37 = local31 * local15 >> 12;
			local44 = this.anInt8805 * local31 >> 12;
			local55 = local37 >> 12;
			local59 = local55 + 1;
			if (local44 <= local59) {
				local59 = 0;
			}
			local37 &= 0xFFF;
			local77 = this.aByteArray97[local55 & 0xFF] & 0xFF;
			local81 = Class2_Sub2_Sub19.anIntArray768[local37];
			local90 = this.aByteArray97[local59 & 0xFF] & 0xFF;
			for (local95 = 0; local95 < Static608.anInt9289; local95++) {
				local103 = this.anInt8810 * Static54.anIntArray92[local95];
				local117 = this.method7812(local51, local77, local103 * local31 >> 12, local37, local81, local90);
				arg1[local95] = local117 * local24 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt8803; local301++) {
			local24 = this.aShortArray127[local301];
			if (local24 > 8 || local24 < -8) {
				local31 = this.aShortArray126[local301] << 12;
				local51 = local31 * this.anInt8810 >> 12;
				local44 = local31 * this.anInt8805 >> 12;
				local37 = local31 * local15 >> 12;
				local55 = local37 >> 12;
				local59 = local55 + 1;
				local37 &= 0xFFF;
				if (local44 <= local59) {
					local59 = 0;
				}
				local90 = this.aByteArray97[local59 & 0xFF] & 0xFF;
				local81 = Class2_Sub2_Sub19.anIntArray768[local37];
				local77 = this.aByteArray97[local55 & 0xFF] & 0xFF;
				if (this.aBoolean667 && this.anInt8803 - 1 == local301) {
					for (local95 = 0; local95 < Static608.anInt9289; local95++) {
						local103 = Static54.anIntArray92[local95] * this.anInt8810;
						local117 = this.method7812(local51, local77, local103 * local31 >> 12, local37, local81, local90);
						local117 = (local117 * local24 >> 12) + arg1[local95];
						arg1[local95] = (local117 >> 1) + 2048;
					}
				} else {
					for (local95 = 0; local95 < Static608.anInt9289; local95++) {
						local103 = Static54.anIntArray92[local95] * this.anInt8810;
						local117 = this.method7812(local51, local77, local31 * local103 >> 12, local37, local81, local90);
						arg1[local95] += local117 * local24 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int[] local9 = super.aClass180_41.method3935(arg1);
		if (arg0 <= 107) {
			this.aShortArray126 = null;
		}
		if (super.aClass180_41.aBoolean338) {
			this.method7809(arg1, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	@Override
	public void method9421(@OriginalArg(0) int arg0) {
		this.aByteArray97 = Static694.method9027(this.anInt8809);
		this.method7813(arg0 - 8);
		@Pc(19) int local19 = this.anInt8803 - 1;
		if (arg0 != 7) {
			return;
		}
		while (local19 >= 1) {
			@Pc(29) short local29 = this.aShortArray127[local19];
			if (local29 > 8) {
				return;
			}
			if (local29 < -8) {
				return;
			}
			this.anInt8803--;
			local19--;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			this.method9411(17, -97);
		}
		if (arg2 == 0) {
			this.aBoolean667 = arg1.g1() == 1;
		} else if (arg2 == 1) {
			this.anInt8803 = arg1.g1();
		} else if (arg2 == 2) {
			this.anInt8799 = arg1.g2s();
			if (this.anInt8799 < 0) {
				this.aShortArray127 = new short[this.anInt8803];
				for (@Pc(103) int local103 = 0; local103 < this.anInt8803; local103++) {
					this.aShortArray127[local103] = (short) arg1.g2s();
				}
				return;
			}
		} else if (arg2 == 3) {
			this.anInt8810 = this.anInt8805 = arg1.g1();
			return;
		} else if (arg2 == 4) {
			this.anInt8809 = arg1.g1();
			return;
		} else if (arg2 == 5) {
			this.anInt8810 = arg1.g1();
			return;
		} else if (arg2 == 6) {
			this.anInt8805 = arg1.g1();
			return;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII)I")
	private int method7812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = arg2 & 0xFFF;
		if (arg0 <= local11) {
			local11 = 0;
		}
		local7 &= 0xFF;
		@Pc(32) int local32 = local15 - 4096;
		local11 &= 0xFF;
		@Pc(40) int local40 = arg3 - 4096;
		@Pc(44) int local44 = Class2_Sub2_Sub19.anIntArray768[local15];
		@Pc(63) int local63 = this.aByteArray97[arg1 + local7] & 0x3;
		@Pc(82) int local82;
		if (local63 <= 1) {
			local82 = local63 == 0 ? local15 + arg3 : -local15 + arg3;
		} else {
			local82 = local63 == 2 ? local15 - arg3 : -arg3 + -local15;
		}
		local63 = this.aByteArray97[local11 + arg1] & 0x3;
		@Pc(131) int local131;
		if (local63 > 1) {
			local131 = local63 == 2 ? local32 - arg3 : -arg3 + -local32;
		} else {
			local131 = local63 == 0 ? arg3 + local32 : -local32 + arg3;
		}
		local63 = this.aByteArray97[local7 + arg5] & 0x3;
		@Pc(164) int local164 = ((local131 - local82) * local44 >> 12) + local82;
		if (local63 <= 1) {
			local82 = local63 == 0 ? local40 + local15 : local40 + -local15;
		} else {
			local82 = local63 == 2 ? local15 - local40 : -local15 + -local40;
		}
		local63 = this.aByteArray97[arg5 + local11] & 0x3;
		if (local63 > 1) {
			local131 = local63 == 2 ? local32 - local40 : -local32 + -local40;
		} else {
			local131 = local63 == 0 ? local40 + local32 : -local32 + local40;
		}
		@Pc(259) int local259 = local82 + (local44 * (local131 - local82) >> 12);
		return (arg4 * (local259 - local164) >> 12) + local164;
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(I)V")
	private void method7813(@OriginalArg(0) int arg0) {
		@Pc(17) int local17;
		if (arg0 > ~this.anInt8799) {
			this.aShortArray126 = new short[this.anInt8803];
			this.aShortArray127 = new short[this.anInt8803];
			for (local17 = 0; local17 < this.anInt8803; local17++) {
				this.aShortArray127[local17] = (short) (int) (Math.pow((double) ((float) this.anInt8799 / 4096.0F), (double) local17) * 4096.0D);
				this.aShortArray126[local17] = (short) (int) Math.pow(2.0D, (double) local17);
			}
		} else if (this.aShortArray127 != null && this.anInt8803 == this.aShortArray127.length) {
			this.aShortArray126 = new short[this.anInt8803];
			for (local17 = 0; local17 < this.anInt8803; local17++) {
				this.aShortArray126[local17] = (short) (int) Math.pow(2.0D, (double) local17);
			}
		}
	}
}
