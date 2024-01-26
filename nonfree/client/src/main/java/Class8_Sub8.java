import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public int anInt8268;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	private int anInt8272;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	private int anInt8273;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	private int anInt8274;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	private int anInt8275;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
	private int anInt8276;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
	private int anInt8277;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
	private int anInt8278;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
	private int anInt8264 = 0;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Z")
	public boolean aBoolean630 = false;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!iea;")
	public Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!iea;")
	private Class177 aClass177_2 = new Class177();

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "Z")
	private boolean aBoolean631 = false;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Lclient!rv;")
	public final Class328 aClass328_1;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "J")
	private final long aLong254;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!hv;")
	public final Class8_Sub5 aClass8_Sub5_6;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Lclient!vaa;")
	public Class379 aClass379_1;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!fla;")
	public final Class130 aClass130_11;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!ha;Lclient!rv;Lclient!hv;J)V")
	public Class8_Sub8(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) Class8_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass328_1 = arg1;
		this.aLong254 = arg3;
		this.aClass8_Sub5_6 = arg2;
		this.aClass379_1 = this.aClass328_1.method7547();
		if (!arg0.method7937() && this.aClass379_1.anInt9880 != -1) {
			this.aClass379_1 = Static444.method5994(this.aClass379_1.anInt9880);
		}
		this.aClass130_11 = new Class130();
		this.anInt8264 = (int) ((double) this.anInt8264 + Math.random() * 64.0D);
		this.method7264();
		this.aClass177_2.anInt4281 = this.aClass177_1.anInt4281;
		this.aClass177_2.anInt4280 = this.aClass177_1.anInt4280;
		this.aClass177_2.anInt4277 = this.aClass177_1.anInt4277;
		this.aClass177_2.anInt4269 = this.aClass177_1.anInt4269;
		this.aClass177_2.anInt4283 = this.aClass177_1.anInt4283;
		this.aClass177_2.anInt4275 = this.aClass177_1.anInt4275;
		this.aClass177_2.anInt4270 = this.aClass177_1.anInt4270;
		this.aClass177_2.anInt4276 = this.aClass177_1.anInt4276;
		this.aClass177_2.anInt4279 = this.aClass177_1.anInt4279;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBZJLclient!ha;)V")
	public void method7261(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class19 arg3) {
		@Pc(46) int local46;
		if (this.aBoolean630) {
			arg1 = false;
		} else if (this.aClass379_1.anInt9896 > Static507.anInt7618) {
			arg1 = false;
		} else if (Static164.anIntArray246[Static507.anInt7618] < Static452.anInt6869) {
			arg1 = false;
		} else if (this.aBoolean631) {
			arg1 = false;
		} else if (this.aClass379_1.anInt9921 != -1) {
			local46 = (int) (arg2 - this.aLong254);
			if (this.aClass379_1.aBoolean762 || this.aClass379_1.anInt9921 >= local46) {
				local46 %= this.aClass379_1.anInt9921;
			} else {
				arg1 = false;
			}
			if (!this.aClass379_1.aBoolean761 && local46 < this.aClass379_1.anInt9885) {
				arg1 = false;
			}
			if (this.aClass379_1.aBoolean761 && this.aClass379_1.anInt9885 <= local46) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static424.anInt6459++;
			local46 = (this.aClass177_1.anInt4276 + this.aClass177_1.anInt4279 + this.aClass177_1.anInt4281) / 3;
			@Pc(147) int local147 = (this.aClass177_1.anInt4269 + this.aClass177_1.anInt4280 + this.aClass177_1.anInt4283) / 3;
			@Pc(162) int local162 = (this.aClass177_1.anInt4277 + this.aClass177_1.anInt4270 + this.aClass177_1.anInt4275) / 3;
			@Pc(210) int local210;
			@Pc(218) int local218;
			@Pc(226) int local226;
			@Pc(235) int local235;
			@Pc(244) int local244;
			@Pc(252) int local252;
			@Pc(362) int local362;
			@Pc(414) int local414;
			@Pc(435) int local435;
			if (local46 != this.aClass177_1.anInt4271 || local147 != this.aClass177_1.anInt4278 || this.aClass177_1.anInt4273 != local162) {
				this.aClass177_1.anInt4278 = local147;
				this.aClass177_1.anInt4273 = local162;
				this.aClass177_1.anInt4271 = local46;
				local210 = this.aClass177_1.anInt4281 - this.aClass177_1.anInt4279;
				local218 = this.aClass177_1.anInt4283 - this.aClass177_1.anInt4280;
				local226 = this.aClass177_1.anInt4277 - this.aClass177_1.anInt4270;
				local235 = this.aClass177_1.anInt4276 - this.aClass177_1.anInt4279;
				local244 = this.aClass177_1.anInt4269 - this.aClass177_1.anInt4280;
				local252 = this.aClass177_1.anInt4275 - this.aClass177_1.anInt4270;
				this.anInt8278 = local210 * local244 - local218 * local235;
				this.anInt8275 = local218 * local252 - local226 * local244;
				this.anInt8277 = local235 * local226 - local252 * local210;
				while (true) {
					if (this.anInt8275 <= 32767 && this.anInt8277 <= 32767 && this.anInt8278 <= 32767 && this.anInt8275 >= -32767 && this.anInt8277 >= -32767 && this.anInt8278 >= -32767) {
						local362 = (int) Math.sqrt((double) (this.anInt8275 * this.anInt8275 + this.anInt8277 * this.anInt8277 + this.anInt8278 * this.anInt8278));
						if (local362 <= 0) {
							local362 = 1;
						}
						this.anInt8277 = this.anInt8277 * 32767 / local362;
						this.anInt8275 = this.anInt8275 * 32767 / local362;
						this.anInt8278 = this.anInt8278 * 32767 / local362;
						if (this.aClass379_1.aShort125 > 0 || this.aClass379_1.aShort126 > 0) {
							local414 = (int) (Math.atan2((double) this.anInt8278, (double) this.anInt8275) * 2607.5945876176133D);
							local435 = (int) (Math.atan2((double) this.anInt8277, Math.sqrt((double) (this.anInt8275 * this.anInt8275 + this.anInt8278 * this.anInt8278))) * 2607.5945876176133D);
							this.anInt8273 = this.aClass379_1.aShort125 - this.aClass379_1.aShort124;
							this.anInt8272 = this.aClass379_1.aShort124 + local414 - (this.anInt8273 >> 1);
							this.anInt8274 = this.aClass379_1.aShort126 - this.aClass379_1.aShort127;
							this.anInt8276 = this.aClass379_1.aShort127 + local435 - (this.anInt8274 >> 1);
						}
						break;
					}
					this.anInt8278 >>= 0x1;
					this.anInt8275 >>= 0x1;
					this.anInt8277 >>= 0x1;
				}
			}
			this.anInt8264 += (int) (((double) this.aClass379_1.anInt9933 + Math.random() * (double) (this.aClass379_1.anInt9898 - this.aClass379_1.anInt9933)) * (double) arg0);
			if (this.anInt8264 > 63) {
				local210 = this.anInt8264 >> 6;
				this.anInt8264 &= 0x3F;
				for (local244 = 0; local244 < local210; local244++) {
					@Pc(577) int local577;
					@Pc(581) int local581;
					if (this.aClass379_1.aShort125 <= 0 && this.aClass379_1.aShort126 <= 0) {
						local218 = this.anInt8275;
						local235 = this.anInt8278;
						local226 = this.anInt8277;
					} else {
						local252 = (int) ((double) this.anInt8273 * Math.random()) + this.anInt8272;
						local252 &= 0x3FFF;
						local362 = Class361.anIntArray741[local252];
						local414 = Class361.anIntArray740[local252];
						local435 = this.anInt8276 + (int) ((double) this.anInt8274 * Math.random());
						local435 &= 0x1FFF;
						local577 = Class361.anIntArray741[local435];
						local581 = Class361.anIntArray740[local435];
						local218 = local414 * local577 >> 13;
						local226 = (local581 << 1) * -1;
						local235 = local577 * local362 >> 13;
					}
					@Pc(615) float local615 = (float) Math.random();
					@Pc(618) float local618 = (float) Math.random();
					if (local618 + local615 > 1.0F) {
						local615 = 1.0F - local615;
						local618 = 1.0F - local618;
					}
					@Pc(639) float local639 = 1.0F - local618 - local615;
					local435 = (int) ((float) this.aClass177_1.anInt4276 * local639 + (float) this.aClass177_1.anInt4281 * local618 + local615 * (float) this.aClass177_1.anInt4279);
					local577 = (int) ((float) this.aClass177_1.anInt4283 * local618 + local615 * (float) this.aClass177_1.anInt4280 + local639 * (float) this.aClass177_1.anInt4269);
					local581 = (int) ((float) this.aClass177_1.anInt4270 * local615 + (float) this.aClass177_1.anInt4277 * local618 + local639 * (float) this.aClass177_1.anInt4275);
					@Pc(727) int local727 = (int) (local639 * (float) this.aClass177_2.anInt4276 + (float) this.aClass177_2.anInt4281 * local618 + (float) this.aClass177_2.anInt4279 * local615);
					@Pc(749) int local749 = (int) (local639 * (float) this.aClass177_2.anInt4269 + local618 * (float) this.aClass177_2.anInt4283 + local615 * (float) this.aClass177_2.anInt4280);
					@Pc(771) int local771 = (int) (local618 * (float) this.aClass177_2.anInt4277 + (float) this.aClass177_2.anInt4270 * local615 + (float) this.aClass177_2.anInt4275 * local639);
					@Pc(776) int local776 = local435 - local727;
					@Pc(780) int local780 = local577 - local749;
					@Pc(785) int local785 = local581 - local771;
					@Pc(794) int local794 = (int) ((double) local776 * Math.random() + (double) local727);
					@Pc(803) int local803 = (int) ((double) local749 + (double) local780 * Math.random());
					@Pc(812) int local812 = (int) ((double) local771 + Math.random() * (double) local785);
					@Pc(828) int local828 = (int) (Math.random() * (double) (this.aClass379_1.anInt9888 - this.aClass379_1.anInt9894)) + this.aClass379_1.anInt9894;
					@Pc(845) int local845 = (int) (Math.random() * (double) (this.aClass379_1.anInt9902 - this.aClass379_1.anInt9912)) + this.aClass379_1.anInt9912;
					@Pc(862) int local862 = (int) (Math.random() * (double) (this.aClass379_1.anInt9918 - this.aClass379_1.anInt9884)) + this.aClass379_1.anInt9884;
					@Pc(926) int local926;
					if (this.aClass379_1.aBoolean763) {
						@Pc(868) double local868 = Math.random();
						local926 = (int) ((double) this.aClass379_1.anInt9903 + (double) this.aClass379_1.anInt9913 * local868) | (int) ((double) this.aClass379_1.anInt9914 + local868 * (double) this.aClass379_1.anInt9911) << 8 | (int) ((double) this.aClass379_1.anInt9899 + (double) this.aClass379_1.anInt9929 * local868) << 16 | (int) (Math.random() * (double) this.aClass379_1.anInt9878 + (double) this.aClass379_1.anInt9906) << 24;
					} else {
						local926 = (int) ((double) this.aClass379_1.anInt9903 + Math.random() * (double) this.aClass379_1.anInt9913) | (int) ((double) this.aClass379_1.anInt9914 + Math.random() * (double) this.aClass379_1.anInt9911) << 8 | (int) (Math.random() * (double) this.aClass379_1.anInt9929 + (double) this.aClass379_1.anInt9899) << 16 | (int) ((double) this.aClass379_1.anInt9906 + (double) this.aClass379_1.anInt9878 * Math.random()) << 24;
					}
					@Pc(990) int local990 = this.aClass379_1.anInt9905;
					if (!arg3.method7937() && !this.aClass379_1.aBoolean755) {
						local990 = -1;
					}
					if (Static600.anInt8880 == Static559.anInt8410) {
						new Class8_Sub4_Sub2_Sub1(this, local794, local803, local812, local218, local226, local235, local828, local845, local926, local862, local990, this.aClass379_1.aBoolean760, this.aClass379_1.aBoolean758);
					} else {
						@Pc(1032) Class8_Sub4_Sub2_Sub1 local1032 = Static538.aClass8_Sub4_Sub2_Sub1Array2[Static600.anInt8880];
						Static600.anInt8880 = Static600.anInt8880 + 1 & 0x3FF;
						local1032.method6696(this, local794, local803, local812, local218, local226, local235, local828, local845, local926, local862, local990, this.aClass379_1.aBoolean760, this.aClass379_1.aBoolean758);
					}
				}
			}
		}
		if (!this.aClass177_1.method3860(this.aClass177_2)) {
			@Pc(1078) Class177 local1078 = this.aClass177_2;
			this.aClass177_2 = this.aClass177_1;
			this.aClass177_1 = local1078;
			this.aClass177_1.anInt4275 = this.aClass328_1.anInt8520;
			this.aClass177_1.anInt4276 = this.aClass328_1.anInt8512;
			this.aClass177_1.anInt4283 = this.aClass328_1.anInt8507;
			this.aClass177_1.anInt4281 = this.aClass328_1.anInt8516;
			this.aClass177_1.anInt4270 = this.aClass328_1.anInt8504;
			this.aClass177_1.anInt4280 = this.aClass328_1.anInt8502;
			this.aClass177_1.anInt4277 = this.aClass328_1.anInt8509;
			this.aClass177_1.anInt4278 = this.aClass177_2.anInt4278;
			this.aClass177_1.anInt4273 = this.aClass177_2.anInt4273;
			this.aClass177_1.anInt4279 = this.aClass328_1.anInt8518;
			this.aClass177_1.anInt4271 = this.aClass177_2.anInt4271;
			this.aClass177_1.anInt4269 = this.aClass328_1.anInt8503;
		}
		this.anInt8268 = 0;
		for (@Pc(1171) Class8_Sub4_Sub2_Sub1 local1171 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2790(); local1171 != null; local1171 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2785()) {
			local1171.method6694(arg2, arg0);
			this.anInt8268++;
		}
		Static530.anInt8093 += this.anInt8268;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(JLclient!ha;I)V")
	public void method7263(@OriginalArg(0) long arg0, @OriginalArg(1) Class19 arg1) {
		for (@Pc(11) Class8_Sub4_Sub2_Sub1 local11 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2790(); local11 != null; local11 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2785()) {
			local11.method6695(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public void method7264() {
		this.aClass177_1.anInt4283 = this.aClass328_1.anInt8507;
		this.aClass177_1.anInt4275 = this.aClass328_1.anInt8520;
		this.aClass177_1.anInt4276 = this.aClass328_1.anInt8512;
		this.aClass177_1.anInt4280 = this.aClass328_1.anInt8502;
		this.aClass177_1.anInt4281 = this.aClass328_1.anInt8516;
		this.aClass177_1.anInt4270 = this.aClass328_1.anInt8504;
		this.aClass177_1.anInt4277 = this.aClass328_1.anInt8509;
		this.aClass177_1.anInt4279 = this.aClass328_1.anInt8518;
		this.aClass177_1.anInt4269 = this.aClass328_1.anInt8503;
		if (this.aClass177_1.anInt4281 == this.aClass177_1.anInt4279 && this.aClass177_1.anInt4276 == this.aClass177_1.anInt4281 && this.aClass177_1.anInt4280 == this.aClass177_1.anInt4283 && this.aClass177_1.anInt4283 == this.aClass177_1.anInt4269 && this.aClass177_1.anInt4270 == this.aClass177_1.anInt4277 && this.aClass177_1.anInt4275 == this.aClass177_1.anInt4277) {
			this.aBoolean631 = true;
		} else if (this.aBoolean631) {
			this.aClass177_2.anInt4280 = this.aClass177_1.anInt4280;
			this.aClass177_2.anInt4270 = this.aClass177_1.anInt4270;
			this.aClass177_2.anInt4279 = this.aClass177_1.anInt4279;
			this.aClass177_2.anInt4283 = this.aClass177_1.anInt4283;
			this.aClass177_2.anInt4277 = this.aClass177_1.anInt4277;
			this.aClass177_2.anInt4269 = this.aClass177_1.anInt4269;
			this.aClass177_2.anInt4275 = this.aClass177_1.anInt4275;
			this.aBoolean631 = false;
			this.aClass177_2.anInt4276 = this.aClass177_1.anInt4276;
			this.aClass177_2.anInt4281 = this.aClass177_1.anInt4281;
		}
	}
}
