import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class12_Sub8 extends ParticleNode {

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	private int anInt6237;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	private int anInt6239;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	private int anInt6240;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public int anInt6241;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	private int anInt6243;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	private int anInt6245;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	private int anInt6246;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "I")
	private int anInt6247;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "I")
	private int anInt6248;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	private int anInt6249;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "I")
	private int anInt6250;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "I")
	private int anInt6252;

	@OriginalMember(owner = "client!th", name = "E", descriptor = "I")
	public int anInt6253;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "I")
	public int anInt6254;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "I")
	private int anInt6256;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	private int anInt6257;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "I")
	private int anInt6258;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	private int anInt6259;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	private int anInt6260;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	private int anInt6244 = 0;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
	public boolean aBoolean422 = false;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "Lclient!jf;")
	public final Class114 aClass114_2;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "J")
	private final long aLong198;

	@OriginalMember(owner = "client!th", name = "J", descriptor = "Lclient!oh;")
	public final ParticleSystem aClass12_Sub5_6;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Lclient!uo;")
	public Class235 aClass235_1;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!cm;")
	public final Class36 aClass36_8;

	static {
		new LocalizedString("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!wm;Lclient!jf;Lclient!oh;J)V")
	public Class12_Sub8(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) ParticleSystem arg2, @OriginalArg(3) long arg3) {
		this.aClass114_2 = arg1;
		this.aLong198 = arg3;
		this.aClass12_Sub5_6 = arg2;
		this.aClass235_1 = Static330.method5655(this.aClass114_2.anInt2930);
		if (!arg0.method2813() && this.aClass235_1.anInt6608 != -1) {
			this.aClass235_1 = Static330.method5655(this.aClass235_1.anInt6608);
		}
		this.aClass36_8 = new Class36();
		this.anInt6244 = (int) ((double) this.anInt6244 + Math.random() * 64.0D);
		this.method5689();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JBLclient!wm;IZ)V")
	public void method5686(@OriginalArg(0) long arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(54) int local54;
		if (this.aBoolean422) {
			arg3 = false;
		} else if (this.aClass235_1.anInt6578 > Static153.anInt2794) {
			arg3 = false;
		} else if (Static336.anInt6313 > Static360.anIntArray421[Static153.anInt2794]) {
			arg3 = false;
		} else if (this.aBoolean423) {
			arg3 = false;
		} else if (this.aClass235_1.anInt6601 != -1) {
			local54 = (int) (arg0 - this.aLong198);
			if (this.aClass235_1.aBoolean451 || local54 <= this.aClass235_1.anInt6601) {
				local54 %= this.aClass235_1.anInt6601;
			} else {
				arg3 = false;
			}
			if (!this.aClass235_1.aBoolean454 && local54 < this.aClass235_1.anInt6597) {
				arg3 = false;
			}
			if (this.aClass235_1.aBoolean454 && this.aClass235_1.anInt6597 <= local54) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6244 += (int) (((double) this.aClass235_1.anInt6566 + (double) (this.aClass235_1.anInt6573 - this.aClass235_1.anInt6566) * Math.random()) * (double) arg2);
			if (this.anInt6244 > 63) {
				local54 = this.anInt6244 >> 6;
				this.anInt6244 &= 0x3F;
				for (@Pc(147) int local147 = 0; local147 < local54; local147++) {
					@Pc(207) int local207;
					@Pc(217) int local217;
					@Pc(213) int local213;
					@Pc(167) int local167;
					@Pc(175) int local175;
					@Pc(179) int local179;
					@Pc(189) int local189;
					@Pc(197) int local197;
					@Pc(201) int local201;
					if (this.aClass235_1.aShort95 <= 0 && this.aClass235_1.aShort96 <= 0) {
						local207 = this.anInt6239;
						local217 = this.anInt6246;
						local213 = this.anInt6256;
					} else {
						local167 = (int) (Math.random() * (double) this.anInt6250) + this.anInt6247;
						@Pc(171) int local171 = local167 & 0x3FFF;
						local175 = Class19.anIntArray178[local171];
						local179 = Class19.anIntArray177[local171];
						local189 = (int) ((double) this.anInt6237 * Math.random()) + this.anInt6260;
						@Pc(193) int local193 = local189 & 0x1FFF;
						local197 = Class19.anIntArray178[local193];
						local201 = Class19.anIntArray177[local193];
						local207 = local197 * local179 >> 15;
						local213 = local197 * local175 >> 15;
						local217 = local201 * -1;
					}
					local167 = (int) (Math.random() * 65535.0D);
					local175 = (int) (Math.random() * 65535.0D);
					if (local167 + local175 > 65535) {
						local167 = 65535 - local167;
						local175 = 65535 - local175;
					}
					local179 = 65535 - local167 - local175;
					local189 = local167 * this.anInt6249 + this.anInt6259 * local175 + local179 * this.anInt6243 >> 16;
					local197 = local179 * this.anInt6245 + this.anInt6258 * local167 + local175 * this.anInt6257 >> 16;
					local201 = local175 * this.anInt6248 + this.anInt6240 * local167 + this.anInt6252 * local179 >> 16;
					@Pc(334) int local334 = this.aClass235_1.anInt6612 + (int) ((double) (this.aClass235_1.anInt6616 - this.aClass235_1.anInt6612) * Math.random());
					@Pc(351) int local351 = (int) (Math.random() * (double) (this.aClass235_1.anInt6570 - this.aClass235_1.anInt6586)) + this.aClass235_1.anInt6586;
					@Pc(368) int local368 = (int) ((double) (this.aClass235_1.anInt6610 - this.aClass235_1.anInt6598) * Math.random()) + this.aClass235_1.anInt6598;
					@Pc(430) int local430;
					if (this.aClass235_1.aBoolean449) {
						@Pc(434) double local434 = Math.random();
						local430 = (int) ((double) this.aClass235_1.anInt6615 + Math.random() * (double) this.aClass235_1.anInt6599) << 24 | (int) ((double) this.aClass235_1.anInt6605 + local434 * (double) this.aClass235_1.anInt6583) << 8 | (int) (local434 * (double) this.aClass235_1.anInt6575 + (double) this.aClass235_1.anInt6620) << 16 | (int) (local434 * (double) this.aClass235_1.anInt6582 + (double) this.aClass235_1.anInt6590);
					} else {
						local430 = (int) ((double) this.aClass235_1.anInt6590 + Math.random() * (double) this.aClass235_1.anInt6582) | (int) ((double) this.aClass235_1.anInt6620 + (double) this.aClass235_1.anInt6575 * Math.random()) << 16 | (int) ((double) this.aClass235_1.anInt6605 + Math.random() * (double) this.aClass235_1.anInt6583) << 8 | (int) ((double) this.aClass235_1.anInt6615 + (double) this.aClass235_1.anInt6599 * Math.random()) << 24;
					}
					@Pc(496) int local496 = this.aClass235_1.anInt6576;
					if (!arg1.method2813() && !this.aClass235_1.aBoolean453) {
						local496 = -1;
					}
					if (Static82.anInt1835 == Static146.anInt2706) {
						new Class12_Sub1_Sub1_Sub1(this, local189, local197, local201, local207, local217, local213, local334, local351, local430, local368, local496, this.aClass235_1.aBoolean452, this.aClass235_1.aBoolean450);
					} else {
						@Pc(536) Class12_Sub1_Sub1_Sub1 local536 = Static98.aClass12_Sub1_Sub1_Sub1Array1[Static146.anInt2706];
						Static146.anInt2706 = Static146.anInt2706 + 1 & 0x3FF;
						local536.method4218(this, local189, local197, local201, local207, local217, local213, local334, local351, local430, local368, local496, this.aClass235_1.aBoolean452, this.aClass235_1.aBoolean450);
					}
				}
			}
		}
		this.anInt6253 = 0;
		for (@Pc(583) Class12_Sub1_Sub1_Sub1 local583 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1415(); local583 != null; local583 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1420()) {
			local583.method4219(arg0, arg2);
			this.anInt6253++;
		}
		Static311.anInt5809 += this.anInt6253;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IJ)V")
	public void method5688(@OriginalArg(1) long arg0) {
		for (@Pc(7) Class12_Sub1_Sub1_Sub1 local7 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1415(); local7 != null; local7 = (Class12_Sub1_Sub1_Sub1) this.aClass36_8.method1420()) {
			local7.method4216(arg0);
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
	public void method5689() {
		this.anInt6240 = this.aClass114_2.anInt2922;
		this.anInt6259 = this.aClass114_2.anInt2925;
		this.anInt6258 = this.aClass114_2.anInt2916;
		this.anInt6245 = this.aClass114_2.anInt2915;
		this.anInt6249 = this.aClass114_2.anInt2919;
		this.anInt6252 = this.aClass114_2.anInt2921;
		this.anInt6243 = this.aClass114_2.anInt2924;
		this.anInt6257 = this.aClass114_2.anInt2928;
		this.anInt6248 = this.aClass114_2.anInt2929;
		if (this.anInt6259 == this.anInt6249 && this.anInt6243 == this.anInt6259 && this.anInt6258 == this.anInt6257 && this.anInt6245 == this.anInt6257 && this.anInt6248 == this.anInt6240 && this.anInt6248 == this.anInt6252) {
			this.aBoolean423 = true;
			return;
		}
		this.aBoolean423 = false;
		@Pc(111) int local111 = (this.anInt6249 + this.anInt6259 + this.anInt6243) / 3;
		@Pc(123) int local123 = (this.anInt6245 + this.anInt6258 + this.anInt6257) / 3;
		@Pc(134) int local134 = (this.anInt6252 + this.anInt6248 + this.anInt6240) / 3;
		if (local111 == this.anInt6254 && this.anInt6261 == local123 && local134 == this.anInt6241) {
			return;
		}
		this.anInt6254 = local111;
		this.anInt6261 = local123;
		this.anInt6241 = local134;
		@Pc(167) int local167 = this.anInt6259 - this.anInt6249;
		@Pc(174) int local174 = this.anInt6257 - this.anInt6258;
		@Pc(180) int local180 = this.anInt6248 - this.anInt6240;
		@Pc(187) int local187 = this.anInt6243 - this.anInt6249;
		@Pc(194) int local194 = this.anInt6245 - this.anInt6258;
		@Pc(201) int local201 = this.anInt6252 - this.anInt6240;
		this.anInt6256 = local194 * local167 - local174 * local187;
		this.anInt6239 = local201 * local174 - local180 * local194;
		this.anInt6246 = local187 * local180 - local201 * local167;
		while (this.anInt6239 > 32767 || this.anInt6246 > 32767 || this.anInt6256 > 32767 || this.anInt6239 < -32767 || this.anInt6246 < -32767 || this.anInt6256 < -32767) {
			this.anInt6239 >>= 0x1;
			this.anInt6246 >>= 0x1;
			this.anInt6256 >>= 0x1;
		}
		@Pc(299) int local299 = (int) Math.sqrt((double) (this.anInt6239 * this.anInt6239 + this.anInt6246 * this.anInt6246 + this.anInt6256 * this.anInt6256));
		if (local299 <= 0) {
			local299 = 1;
		}
		this.anInt6246 = this.anInt6246 * 32767 / local299;
		this.anInt6256 = this.anInt6256 * 32767 / local299;
		this.anInt6239 = this.anInt6239 * 32767 / local299;
		if (this.aClass235_1.aShort95 <= 0 && this.aClass235_1.aShort96 <= 0) {
			return;
		}
		@Pc(355) int local355 = (int) (Math.atan2((double) this.anInt6256, (double) this.anInt6239) * 2607.5945876176133D);
		@Pc(376) int local376 = (int) (Math.atan2((double) this.anInt6246, Math.sqrt((double) (this.anInt6256 * this.anInt6256 + this.anInt6239 * this.anInt6239))) * 2607.5945876176133D);
		this.anInt6250 = this.aClass235_1.aShort95 - this.aClass235_1.aShort93;
		this.anInt6247 = this.aClass235_1.aShort93 + local355 - (this.anInt6250 >> 1);
		this.anInt6237 = this.aClass235_1.aShort96 - this.aClass235_1.aShort94;
		this.anInt6260 = local376 + this.aClass235_1.aShort94 - (this.anInt6237 >> 1);
	}
}
