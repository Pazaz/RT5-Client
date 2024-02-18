import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class216 {

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
	private int anInt5627;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	public int anInt5631;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!st;")
	private Class23 aClass23_24;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
	private int anInt5638;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
	private int anInt5639;

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
	private final int anInt5635;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	private final int anInt5626;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
	private final int anInt5630;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
	private final boolean aBoolean429;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	private final int anInt5633;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
	private final int anInt5634;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	private final int anInt5637;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
	private final int anInt5640;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
	private final int anInt5632;

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
	private final int anInt5629;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	private final int anInt5636;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt5635 = arg2;
		this.anInt5626 = arg3;
		this.anInt5630 = arg4;
		this.aBoolean429 = arg7;
		this.anInt5633 = arg1;
		this.anInt5634 = arg6;
		this.anInt5637 = arg5;
		this.anInt5640 = arg0;
		this.anInt5632 = arg8;
		this.anInt5629 = arg9;
		this.anInt5636 = arg10;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(Lclient!ha;Lclient!ks;)Z")
	public boolean method5050(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class216 arg1) {
		return this.aClass23_24 != null || this.method5057(arg0, arg1);
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(Lclient!ha;Lclient!ks;)V")
	private void method5052(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class216 arg1) {
		Static345.method5051(arg0);
		Static345.method5058(arg0);
		arg0.K(Static345.anIntArray418);
		arg0.KA(0, 0, this.anInt5638, this.anInt5638);
		arg0.ya();
		arg0.aa(0, 0, this.anInt5638, this.anInt5638, this.anInt5634 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean429) {
				local31 = -arg1.anInt5635;
				local33 = -arg1.anInt5626;
				local35 = -arg1.anInt5630;
			} else {
				local31 = arg1.anInt5635 - this.anInt5635;
				local33 = arg1.anInt5626 - this.anInt5626;
				local35 = arg1.anInt5630 - this.anInt5630;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt5639 != 0) {
			local79 = Class361.anIntArray741[this.anInt5639];
			local84 = Class361.anIntArray740[this.anInt5639];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt5628 != 0) {
			local79 = Class361.anIntArray741[this.anInt5628];
			local84 = Class361.anIntArray740[this.anInt5628];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class114 local147 = Static345.aClass114_6.method7495((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt5633);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt5638 * 1024 / (local147.RA() - local147.V());
		if (this.anInt5634 != 0) {
			local84 = local84 * 13 / 16;
		}
		@Pc(190) int[] local190 = arg0.Y();
		arg0.DA(this.anInt5638 / 2, this.anInt5638 / 2, local84, local84);
		arg0.method8000(arg0.method7953());
		@Pc(209) Class73 local209 = arg0.method7953();
		local209.method7125(0, 0, arg0.i() - local147.HA());
		local147.method7484(local209, (Class8_Sub6) null, 1024, 1);
		@Pc(231) int local231 = this.anInt5638 * 13 / 16;
		@Pc(238) int local238 = (this.anInt5638 - local231) / 2;
		Static345.aClass23_23.method8205(local238, local238, local231, local231, 0, this.anInt5634 | 0xFF000000, 1);
		this.aClass23_24 = arg0.method7964(0, 0, this.anInt5638, this.anInt5638, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt5638, this.anInt5638, 0, 0);
		Static345.aClass23_25.method8205(0, 0, this.anInt5638, this.anInt5638, 1, 0, 0);
		this.aClass23_24.method8196();
		arg0.DA(local190[0], local190[1], local190[2], local190[3]);
		arg0.KA(Static345.anIntArray418[0], Static345.anIntArray418[1], Static345.anIntArray418[2], Static345.anIntArray418[3]);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ha;Lclient!ks;)V")
	private void method5054(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class216 arg1) {
		@Pc(6) Class88 local6 = Static121.method2201(this.anInt5633, Static386.aClass330_80);
		if (local6 == null) {
			return;
		}
		arg0.K(Static345.anIntArray418);
		arg0.KA(0, 0, this.anInt5638, this.anInt5638);
		arg0.ya();
		arg0.aa(0, 0, this.anInt5638, this.anInt5638, 0, 0);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean429) {
				local34 = -arg1.anInt5635;
				local36 = -arg1.anInt5626;
				local38 = -arg1.anInt5630;
			} else {
				local34 = this.anInt5635 - arg1.anInt5635;
				local36 = this.anInt5626 - arg1.anInt5626;
				local38 = this.anInt5630 - arg1.anInt5630;
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(101) int local101;
		if (this.anInt5639 != 0) {
			local83 = -this.anInt5639 & 0x3FFF;
			local87 = Class361.anIntArray741[local83];
			local91 = Class361.anIntArray740[local83];
			local101 = local36 * local91 - local38 * local87 >> 14;
			local38 = local36 * local87 + local38 * local91 >> 14;
			local36 = local101;
		}
		if (this.anInt5628 != 0) {
			local83 = -this.anInt5628 & 0x3FFF;
			local87 = Class361.anIntArray741[local83];
			local91 = Class361.anIntArray740[local83];
			local101 = local38 * local87 + local34 * local91 >> 14;
			local38 = local38 * local91 - local34 * local87 >> 14;
			local34 = local101;
		}
		arg0.xa(1.0F);
		arg0.ZA(this.anInt5634, 1.0F, 1.0F, (float) local34, (float) local36, (float) local38);
		local6.method2236(this.anInt5636 & 0x3FFF, this.anInt5632 & 0x3FFF, this.anInt5629 & 0x3FFF);
		@Pc(190) Class114 local190 = arg0.method7952(local6, 2048, 0, 64, 768);
		local87 = local190.RA() - local190.V();
		local91 = local190.EA() - local190.fa();
		local101 = local87 > local91 ? local87 : local91;
		@Pc(216) int local216 = this.anInt5638 * 1024 / local101;
		@Pc(219) int[] local219 = arg0.Y();
		arg0.DA(this.anInt5638 / 2, this.anInt5638 / 2, local216, local216);
		arg0.method8000(arg0.method7953());
		@Pc(238) Class73 local238 = arg0.method7985();
		local238.method7125(0, 0, arg0.i() - local190.HA());
		local190.method7484(local238, (Class8_Sub6) null, arg0.i(), 1);
		this.aClass23_24 = arg0.method7964(0, 0, this.anInt5638, this.anInt5638, true);
		this.aClass23_24.method8196();
		arg0.DA(local219[0], local219[1], local219[2], local219[3]);
		arg0.KA(Static345.anIntArray418[0], Static345.anIntArray418[1], Static345.anIntArray418[2], Static345.anIntArray418[3]);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ha;IIIIIIIIII)V")
	public void method5055(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass23_24 == null) {
			return;
		}
		@Pc(6) int[] local6 = new int[3];
		@Pc(14) int local14 = -(this.anInt5635 - arg7 << 16);
		@Pc(21) int local21 = this.anInt5626 - arg8 << 15;
		@Pc(29) int local29 = -(this.anInt5630 - arg9 << 16);
		@Pc(32) Class73 local32 = arg0.method8017();
		local32.method7124(0, 0, 0, local6);
		@Pc(44) int local44 = local14 + local6[0];
		@Pc(50) int local50 = local21 + local6[1];
		@Pc(56) int local56 = local29 + local6[2];
		arg0.H(local44, local50, local56, local6);
		if (local6[2] < 0) {
			return;
		}
		@Pc(75) int local75 = local6[0] - this.anInt5627 / 2;
		@Pc(84) int local84 = local6[1] - this.anInt5627 / 2;
		if (local84 < arg4 && local84 + this.anInt5627 > 0 && local75 < arg3 && local75 + this.anInt5627 > 0) {
			this.aClass23_24.method8205(local75, local84, this.anInt5627, this.anInt5627, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIII)Z")
	public boolean method5056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean429) {
			this.anInt5631 = 1073741823;
			local7 = this.anInt5635;
			local12 = this.anInt5626;
			local17 = this.anInt5630;
		} else {
			local7 = this.anInt5635 - arg0;
			local12 = this.anInt5626 - arg1;
			local17 = this.anInt5630 - arg2;
			this.anInt5631 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5631 == 0) {
				this.anInt5631 = 1;
			}
			local7 = (local7 << 8) / this.anInt5631;
			local12 = (local12 << 8) / this.anInt5631;
			local17 = (local17 << 8) / this.anInt5631;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5627 = this.anInt5637 * arg3 / (this.aBoolean429 ? 1024 : this.anInt5631);
		} else {
			this.anInt5627 = 0;
		}
		if (this.anInt5627 < 8) {
			this.aClass23_24 = null;
			return false;
		}
		@Pc(143) int local143 = Static440.method5962(this.anInt5627);
		if (local143 > arg3) {
			local143 = Static402.method5587(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt5638) {
			this.anInt5638 = local143;
		}
		this.anInt5639 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt5628 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass23_24 = null;
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!ha;Lclient!ks;)Z")
	private boolean method5057(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class216 arg1) {
		if (this.aClass23_24 == null) {
			if (this.anInt5640 == 0) {
				if (Static708.anInterface4_12.method6814(this.anInt5633)) {
					@Pc(23) int[] local23 = Static708.anInterface4_12.method6815(0.7F, this.anInt5633, this.anInt5638, this.anInt5638);
					this.aClass23_24 = arg0.method7946(this.anInt5638, this.anInt5638, this.anInt5638, local23);
				}
			} else if (this.anInt5640 == 2) {
				this.method5054(arg0, arg1);
			} else if (this.anInt5640 == 1) {
				this.method5052(arg0, arg1);
			}
		}
		return this.aClass23_24 != null;
	}
}
