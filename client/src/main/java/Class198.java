import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class198 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt6466;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	private int anInt6467;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public int anInt6471;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	private int anInt6472;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!qa;")
	private Class29 aClass29_21;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "I")
	private final int anInt6473;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private final int anInt6464;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	private final int anInt6469;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
	private final boolean aBoolean467;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "I")
	private final int anInt6468;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "I")
	private final int anInt6475;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	private final int anInt6470;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	private final int anInt6474;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6473 = arg2;
		this.anInt6464 = arg3;
		this.anInt6469 = arg4;
		this.aBoolean467 = arg7;
		this.anInt6468 = arg1;
		this.anInt6475 = arg6;
		this.anInt6470 = arg5;
		this.anInt6474 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!nr;Lclient!u;)V")
	private void method5435(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class198 arg1) {
		@Pc(6) Class126 local6 = Static216.method4218(this.anInt6468, Static238.aClass162_189);
		if (local6 == null) {
			return;
		}
		arg0.method2772(Static310.anIntArray496);
		arg0.method2732(0, 0, this.anInt6466, this.anInt6466);
		arg0.method2717(0, 0, this.anInt6466, this.anInt6466, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean467) {
				local32 = -arg1.anInt6473;
				local34 = -arg1.anInt6464;
				local36 = -arg1.anInt6469;
			} else {
				local32 = this.anInt6473 - arg1.anInt6473;
				local34 = this.anInt6464 - arg1.anInt6464;
				local36 = this.anInt6469 - arg1.anInt6469;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6472 != 0) {
			local81 = -this.anInt6472 & 0x3FFF;
			local85 = Class39.anIntArray88[local81];
			local89 = Class39.anIntArray87[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt6467 != 0) {
			local81 = -this.anInt6467 & 0x3FFF;
			local85 = Class39.anIntArray88[local81];
			local89 = Class39.anIntArray87[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method2705(1.0F);
		arg0.method2776(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class86 local172 = arg0.method2762(local6, 1024, 0, 64, 768);
		local85 = local172.method5545() - local172.method5543();
		local89 = local172.method5536() - local172.method5534();
		local99 = local172.method5543() + local85 / 2;
		@Pc(198) int local198 = local172.method5534() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2737(local99, local198, local205, local205);
		arg0.method2804(arg0.method2801());
		@Pc(218) Class11 local218 = arg0.method2782();
		local218.method5496(0, 0, arg0.method2805() - local172.method5541());
		local172.method5523(local218, null, arg0.method2805());
		this.aClass29_21 = arg0.method2807(0, 0, this.anInt6466, this.anInt6466, true);
		this.aClass29_21.method5833(3);
		arg0.method2732(Static310.anIntArray496[0], Static310.anIntArray496[1], Static310.anIntArray496[2], Static310.anIntArray496[3]);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Lclient!nr;Lclient!u;)Z")
	private boolean method5437(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class198 arg1) {
		if (this.aClass29_21 == null) {
			if (this.anInt6474 == 0) {
				if (Static115.anInterface4_4.method166(this.anInt6468)) {
					@Pc(23) int[] local23 = Static115.anInterface4_4.method167(this.anInt6466, this.anInt6468, 0.7F, this.anInt6466);
					this.aClass29_21 = arg0.method2791(local23, this.anInt6466, this.anInt6466, this.anInt6466);
				}
			} else if (this.anInt6474 == 2) {
				this.method5435(arg0, arg1);
			} else if (this.anInt6474 == 1) {
				this.method5441(arg0, arg1);
			}
		}
		return this.aClass29_21 != null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)Z")
	public boolean method5438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean467) {
			this.anInt6471 = 1073741823;
			local7 = this.anInt6473;
			local12 = this.anInt6464;
			local17 = this.anInt6469;
		} else {
			local7 = this.anInt6473 - arg0;
			local12 = this.anInt6464 - arg1;
			local17 = this.anInt6469 - arg2;
			this.anInt6471 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6471 == 0) {
				this.anInt6471 = 1;
			}
			local7 = (local7 << 8) / this.anInt6471;
			local12 = (local12 << 8) / this.anInt6471;
			local17 = (local17 << 8) / this.anInt6471;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6465 = this.anInt6470 * arg3 / (this.aBoolean467 ? 1024 : this.anInt6471);
		} else {
			this.anInt6465 = 0;
		}
		if (this.anInt6465 < 8) {
			this.aClass29_21 = null;
			return false;
		}
		@Pc(143) int local143 = Static162.method3414(this.anInt6465);
		if (local143 > arg3) {
			local143 = Static229.method4360(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6466) {
			this.anInt6466 = local143;
		}
		this.anInt6472 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt6467 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass29_21 = null;
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!nr;IIIIII)V")
	public void method5440(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass29_21 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6472 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6467 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6465) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6465) / 2;
		if (local38 < arg4 && local38 + this.anInt6465 > 0 && local51 < arg3 && local51 + this.anInt6465 > 0) {
			this.aClass29_21.method5834(local51 + arg1, local38 + arg2, this.anInt6465, this.anInt6465);
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(Lclient!nr;Lclient!u;)V")
	private void method5441(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class198 arg1) {
		Static310.method5443(arg0);
		Static310.method5444(arg0);
		arg0.method2772(Static310.anIntArray496);
		arg0.method2732(0, 0, this.anInt6466, this.anInt6466);
		arg0.method2713();
		arg0.method2717(0, 0, this.anInt6466, this.anInt6466, this.anInt6475 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean467) {
				local31 = -arg1.anInt6473;
				local33 = -arg1.anInt6464;
				local35 = -arg1.anInt6469;
			} else {
				local31 = arg1.anInt6473 - this.anInt6473;
				local33 = arg1.anInt6464 - this.anInt6464;
				local35 = arg1.anInt6469 - this.anInt6469;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6472 != 0) {
			local79 = Class39.anIntArray88[this.anInt6472];
			local84 = Class39.anIntArray87[this.anInt6472];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt6467 != 0) {
			local79 = Class39.anIntArray88[this.anInt6467];
			local84 = Class39.anIntArray87[this.anInt6467];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class86 local147 = Static310.aClass86_6.method5565((byte) 0, 25600, true);
		if (arg0.method2741()) {
			local147.method5559((short) 0, (short) this.anInt6468);
		} else {
			local147.method5538((short) 127, Static115.anInterface4_4.method165(this.anInt6468).aShort27);
			local147.method5559((short) 0, (short) -1);
		}
		arg0.method2705(1.0F);
		arg0.method2776(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6466 * 1024 / (local147.method5545() - local147.method5543());
		if (this.anInt6475 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2737(this.anInt6466 / 2, this.anInt6466 / 2, local84, local84);
		arg0.method2804(arg0.method2801());
		@Pc(223) Class11 local223 = arg0.method2801();
		local223.method5496(0, 0, arg0.method2805() - local147.method5541());
		local147.method5523(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6466 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6466 - local245) / 2;
		Static310.aClass29_19.method5835(local252, local252, local245, local245, 1, this.anInt6475 | 0xFF000000, 1);
		this.aClass29_21 = arg0.method2807(0, 0, this.anInt6466, this.anInt6466, true);
		arg0.method2713();
		arg0.method2717(0, 0, this.anInt6466, this.anInt6466, 0, 0);
		Static310.aClass29_20.method5835(0, 0, this.anInt6466, this.anInt6466, 0, 0, 0);
		this.aClass29_21.method5833(0);
		arg0.method2732(Static310.anIntArray496[0], Static310.anIntArray496[1], Static310.anIntArray496[2], Static310.anIntArray496[3]);
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
	public void method5442() {
		this.aClass29_21 = null;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(Lclient!nr;Lclient!u;)Z")
	public boolean method5445(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class198 arg1) {
		return this.aClass29_21 != null || this.method5437(arg0, arg1);
	}
}
