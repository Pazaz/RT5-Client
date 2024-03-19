import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	private int anInt3686;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "I")
	public int anInt3687;

	@OriginalMember(owner = "client!js", name = "l", descriptor = "I")
	private int anInt3688;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	private int anInt3689;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "I")
	private int anInt3691;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "I")
	private int anInt3692;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "I")
	public int anInt3693;

	@OriginalMember(owner = "client!js", name = "s", descriptor = "I")
	private int anInt3694;

	@OriginalMember(owner = "client!js", name = "t", descriptor = "I")
	private int anInt3695;

	@OriginalMember(owner = "client!js", name = "u", descriptor = "I")
	private int anInt3696;

	@OriginalMember(owner = "client!js", name = "y", descriptor = "I")
	private int anInt3699;

	@OriginalMember(owner = "client!js", name = "z", descriptor = "I")
	public int anInt3700;

	@OriginalMember(owner = "client!js", name = "D", descriptor = "I")
	private int anInt3702;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "I")
	private int anInt3703;

	@OriginalMember(owner = "client!js", name = "H", descriptor = "I")
	private int anInt3706;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "I")
	private int anInt3707;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "I")
	private int anInt3708;

	@OriginalMember(owner = "client!js", name = "K", descriptor = "I")
	private int anInt3709;

	@OriginalMember(owner = "client!js", name = "M", descriptor = "I")
	public int anInt3710;

	@OriginalMember(owner = "client!js", name = "N", descriptor = "I")
	private int anInt3711;

	@OriginalMember(owner = "client!js", name = "v", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!js", name = "C", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!js", name = "G", descriptor = "I")
	private int anInt3705 = 0;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "Lclient!qp;")
	public final Class2_Sub7 aClass2_Sub7_5;

	@OriginalMember(owner = "client!js", name = "B", descriptor = "Lclient!dn;")
	public final Class49 aClass49_2;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "J")
	private final long aLong108;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "Lclient!cr;")
	public Class39 aClass39_1;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "Lclient!ep;")
	public final Class58 aClass58_5;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!nr;Lclient!dn;Lclient!qp;J)V")
	public Class2_Sub4(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class2_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass2_Sub7_5 = arg2;
		this.aClass49_2 = arg1;
		this.aLong108 = arg3;
		this.aClass39_1 = Static77.method1754(this.aClass49_2.anInt1605);
		if (!arg0.method2764() && this.aClass39_1.anInt1322 != -1) {
			this.aClass39_1 = Static77.method1754(this.aClass39_1.anInt1322);
		}
		this.aClass58_5 = new Class58();
		this.anInt3705 = (int) ((double) this.anInt3705 + Math.random() * 64.0D);
		this.method3236();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(JI)V")
	public void method3235(@OriginalArg(0) long arg0) {
		for (@Pc(7) Class2_Sub2_Sub1_Sub1 local7 = (Class2_Sub2_Sub1_Sub1) this.aClass58_5.method1672(); local7 != null; local7 = (Class2_Sub2_Sub1_Sub1) this.aClass58_5.method1675()) {
			local7.method5093(arg0);
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public void method3236() {
		this.anInt3689 = this.aClass49_2.anInt1621;
		this.anInt3686 = this.aClass49_2.anInt1604;
		this.anInt3691 = this.aClass49_2.anInt1614;
		this.anInt3711 = this.aClass49_2.anInt1603;
		this.anInt3694 = this.aClass49_2.anInt1616;
		this.anInt3709 = this.aClass49_2.anInt1609;
		this.anInt3706 = this.aClass49_2.anInt1611;
		this.anInt3688 = this.aClass49_2.anInt1620;
		this.anInt3699 = this.aClass49_2.anInt1606;
		if (this.anInt3706 == this.anInt3686 && this.anInt3706 == this.anInt3711 && this.anInt3709 == this.anInt3699 && this.anInt3699 == this.anInt3689 && this.anInt3691 == this.anInt3694 && this.anInt3691 == this.anInt3688) {
			this.aBoolean260 = true;
			return;
		}
		this.aBoolean260 = false;
		@Pc(107) int local107 = (this.anInt3706 + this.anInt3686 + this.anInt3711) / 3;
		@Pc(118) int local118 = (this.anInt3699 + this.anInt3709 + this.anInt3689) / 3;
		@Pc(130) int local130 = (this.anInt3694 + this.anInt3691 + this.anInt3688) / 3;
		if (local107 == this.anInt3710 && this.anInt3687 == local118 && local130 == this.anInt3700) {
			return;
		}
		this.anInt3700 = local130;
		this.anInt3710 = local107;
		this.anInt3687 = local118;
		@Pc(162) int local162 = this.anInt3706 - this.anInt3686;
		@Pc(168) int local168 = this.anInt3699 - this.anInt3709;
		@Pc(175) int local175 = this.anInt3691 - this.anInt3694;
		@Pc(182) int local182 = this.anInt3711 - this.anInt3686;
		@Pc(189) int local189 = this.anInt3689 - this.anInt3709;
		@Pc(196) int local196 = this.anInt3688 - this.anInt3694;
		this.anInt3692 = local175 * local182 - local196 * local162;
		this.anInt3696 = local196 * local168 - local175 * local189;
		for (this.anInt3703 = local189 * local162 - local182 * local168; this.anInt3696 > 32767 || this.anInt3692 > 32767 || this.anInt3703 > 32767 || this.anInt3696 < -32767 || this.anInt3692 < -32767 || this.anInt3703 < -32767; this.anInt3703 >>= 0x1) {
			this.anInt3696 >>= 0x1;
			this.anInt3692 >>= 0x1;
		}
		@Pc(292) int local292 = (int) Math.sqrt((double) (this.anInt3692 * this.anInt3692 + this.anInt3696 * this.anInt3696 + this.anInt3703 * this.anInt3703));
		if (local292 <= 0) {
			local292 = 1;
		}
		this.anInt3692 = this.anInt3692 * 32767 / local292;
		this.anInt3703 = this.anInt3703 * 32767 / local292;
		this.anInt3696 = this.anInt3696 * 32767 / local292;
		if (this.aClass39_1.aShort19 <= 0 && this.aClass39_1.aShort20 <= 0) {
			return;
		}
		@Pc(342) int local342 = (int) (Math.atan2((double) this.anInt3703, (double) this.anInt3696) * 2607.5945876176133D);
		@Pc(363) int local363 = (int) (Math.atan2((double) this.anInt3692, Math.sqrt((double) (this.anInt3703 * this.anInt3703 + this.anInt3696 * this.anInt3696))) * 2607.5945876176133D);
		this.anInt3708 = this.aClass39_1.aShort19 - this.aClass39_1.aShort18;
		this.anInt3707 = this.aClass39_1.aShort20 - this.aClass39_1.aShort21;
		this.anInt3695 = local342 + this.aClass39_1.aShort18 - (this.anInt3708 >> 1);
		this.anInt3702 = this.aClass39_1.aShort21 + local363 - (this.anInt3707 >> 1);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!nr;IZJI)V")
	public void method3237(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		@Pc(46) int local46;
		if (this.aBoolean259) {
			arg2 = false;
		} else if (this.aClass39_1.anInt1356 > Static134.anInt3395) {
			arg2 = false;
		} else if (Static188.anInt1584 > Static100.anIntArray352[Static134.anInt3395]) {
			arg2 = false;
		} else if (this.aBoolean260) {
			arg2 = false;
		} else if (this.aClass39_1.anInt1350 != -1) {
			local46 = (int) (arg3 - this.aLong108);
			if (this.aClass39_1.aBoolean82 || local46 <= this.aClass39_1.anInt1350) {
				local46 %= this.aClass39_1.anInt1350;
			} else {
				arg2 = false;
			}
			if (!this.aClass39_1.aBoolean84 && local46 < this.aClass39_1.anInt1338) {
				arg2 = false;
			}
			if (this.aClass39_1.aBoolean84 && local46 >= this.aClass39_1.anInt1338) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt3705 += (int) (((double) this.aClass39_1.anInt1368 + Math.random() * (double) (this.aClass39_1.anInt1360 - this.aClass39_1.anInt1368)) * (double) arg1);
			if (this.anInt3705 > 63) {
				local46 = this.anInt3705 >> 6;
				this.anInt3705 &= 0x3F;
				for (@Pc(148) int local148 = 0; local148 < local46; local148++) {
					@Pc(167) int local167;
					@Pc(164) int local164;
					@Pc(161) int local161;
					@Pc(179) int local179;
					@Pc(187) int local187;
					@Pc(191) int local191;
					@Pc(202) int local202;
					@Pc(210) int local210;
					@Pc(214) int local214;
					if (this.aClass39_1.aShort19 <= 0 && this.aClass39_1.aShort20 <= 0) {
						local161 = this.anInt3703;
						local164 = this.anInt3692;
						local167 = this.anInt3696;
					} else {
						local179 = (int) (Math.random() * (double) this.anInt3708) + this.anInt3695;
						@Pc(183) int local183 = local179 & 0x3FFF;
						local187 = Class39.anIntArray88[local183];
						local191 = Class39.anIntArray87[local183];
						local202 = this.anInt3702 + (int) ((double) this.anInt3707 * Math.random());
						@Pc(206) int local206 = local202 & 0x1FFF;
						local210 = Class39.anIntArray88[local206];
						local214 = Class39.anIntArray87[local206];
						local167 = local191 * local210 >> 15;
						local164 = local214 * -1;
						local161 = local187 * local210 >> 15;
					}
					local179 = (int) (Math.random() * 65535.0D);
					local187 = (int) (Math.random() * 65535.0D);
					if (local179 + local187 > 65535) {
						local179 = 65535 - local179;
						local187 = 65535 - local187;
					}
					local191 = 65535 - local179 - local187;
					local202 = local179 * this.anInt3686 + this.anInt3706 * local187 + local191 * this.anInt3711 >> 16;
					local210 = local191 * this.anInt3689 + this.anInt3709 * local179 + local187 * this.anInt3699 >> 16;
					local214 = local191 * this.anInt3688 + this.anInt3691 * local187 + local179 * this.anInt3694 >> 16;
					@Pc(334) int local334 = this.aClass39_1.anInt1370 + (int) ((double) (this.aClass39_1.anInt1369 - this.aClass39_1.anInt1370) * Math.random());
					@Pc(352) int local352 = this.aClass39_1.anInt1333 + (int) (Math.random() * (double) (this.aClass39_1.anInt1351 - this.aClass39_1.anInt1333));
					@Pc(369) int local369 = this.aClass39_1.anInt1345 + (int) ((double) (this.aClass39_1.anInt1320 - this.aClass39_1.anInt1345) * Math.random());
					@Pc(431) int local431;
					if (this.aClass39_1.aBoolean81) {
						@Pc(435) double local435 = Math.random();
						local431 = (int) ((double) this.aClass39_1.anInt1336 * local435 + (double) this.aClass39_1.anInt1337) | (int) ((double) this.aClass39_1.anInt1335 * local435 + (double) this.aClass39_1.anInt1352) << 8 | (int) ((double) this.aClass39_1.anInt1347 + local435 * (double) this.aClass39_1.anInt1329) << 16 | (int) ((double) this.aClass39_1.anInt1361 + (double) this.aClass39_1.anInt1358 * local435) << 24;
					} else {
						local431 = (int) ((double) this.aClass39_1.anInt1358 * Math.random() + (double) this.aClass39_1.anInt1361) << 24 | (int) ((double) this.aClass39_1.anInt1337 + (double) this.aClass39_1.anInt1336 * Math.random()) | (int) ((double) this.aClass39_1.anInt1347 + (double) this.aClass39_1.anInt1329 * Math.random()) << 16 | (int) ((double) this.aClass39_1.anInt1335 * Math.random() + (double) this.aClass39_1.anInt1352) << 8;
					}
					@Pc(497) int local497 = this.aClass39_1.anInt1321;
					if (!arg0.method2764() && !this.aClass39_1.aBoolean86) {
						local497 = -1;
					}
					if (Static176.anInt4151 == Static248.anInt5405) {
						new Class2_Sub2_Sub1_Sub1(this, local202, local210, local214, local167, local164, local161, local334, local352, local431, local369, local497, this.aClass39_1.aBoolean85);
					} else {
						@Pc(513) Class2_Sub2_Sub1_Sub1 local513 = Static297.aClass2_Sub2_Sub1_Sub1Array2[Static176.anInt4151];
						Static176.anInt4151 = Static176.anInt4151 + 1 & 0x3FF;
						local513.method5092(this, local202, local210, local214, local167, local164, local161, local334, local352, local431, local369, local497, this.aClass39_1.aBoolean85);
					}
				}
			}
		}
		this.anInt3693 = 0;
		for (@Pc(576) Class2_Sub2_Sub1_Sub1 local576 = (Class2_Sub2_Sub1_Sub1) this.aClass58_5.method1672(); local576 != null; local576 = (Class2_Sub2_Sub1_Sub1) this.aClass58_5.method1675()) {
			local576.method5091(arg3, arg1);
			this.anInt3693++;
		}
		Static164.anInt3992 += this.anInt3693;
	}
}
