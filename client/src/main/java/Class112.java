import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class112 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	private int anInt2871;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	private int anInt2872;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	private int anInt2874;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	private int anInt2875;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!jd;")
	private Sprite aClass13_11;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public int anInt2880;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	private final int anInt2878;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	private final int anInt2873;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	private final int anInt2881;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Z")
	private final boolean aBoolean203;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	private final int anInt2876;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	private final int anInt2882;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	private final int anInt2879;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	private final int anInt2877;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2878 = arg2;
		this.anInt2873 = arg3;
		this.anInt2881 = arg4;
		this.aBoolean203 = arg7;
		this.anInt2876 = arg1;
		this.anInt2882 = arg6;
		this.anInt2879 = arg5;
		this.anInt2877 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!wm;IIIIII)V")
	public void method2916(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass13_11 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2875 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2871 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2872) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2872) / 2;
		if (local38 < arg4 && local38 + this.anInt2872 > 0 && local51 < arg3 && local51 + this.anInt2872 > 0) {
			this.aClass13_11.method6388(local51 + arg1, local38 + arg2, this.anInt2872, this.anInt2872);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!wm;Lclient!ja;)V")
	private void method2918(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		Static157.method2923(arg0);
		Static157.method2925(arg0);
		arg0.method2851(Static157.anIntArray180);
		arg0.method2895(0, 0, this.anInt2874, this.anInt2874);
		arg0.method2819();
		arg0.method2901(0, 0, this.anInt2874, this.anInt2874, this.anInt2882 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean203) {
				local31 = -arg1.anInt2878;
				local33 = -arg1.anInt2873;
				local35 = -arg1.anInt2881;
			} else {
				local31 = arg1.anInt2878 - this.anInt2878;
				local33 = arg1.anInt2873 - this.anInt2873;
				local35 = arg1.anInt2881 - this.anInt2881;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2875 != 0) {
			local79 = Class19.anIntArray178[this.anInt2875];
			local84 = Class19.anIntArray177[this.anInt2875];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt2871 != 0) {
			local79 = Class19.anIntArray178[this.anInt2871];
			local84 = Class19.anIntArray177[this.anInt2871];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Model local147 = Static157.aClass31_4.method3800((byte) 0, 25600, true);
		if (arg0.method2829()) {
			local147.method3816((short) 0, (short) this.anInt2876);
		} else {
			local147.method3838((short) 127, Static274.anInterface2_7.method2658(this.anInt2876).aShort87);
			local147.method3816((short) 0, (short) -1);
		}
		arg0.method2838(1.0F);
		arg0.method2832(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2874 * 1024 / (local147.method3822() - local147.method3806());
		if (this.anInt2882 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2821(this.anInt2874 / 2, this.anInt2874 / 2, local84, local84);
		arg0.method2896(arg0.method2897());
		@Pc(223) Class14 local223 = arg0.method2897();
		local223.method3922(0, 0, arg0.method2814() - local147.method3812());
		local147.method3844(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2874 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2874 - local245) / 2;
		Static157.aClass13_10.method6395(local252, local252, local245, local245, 1, this.anInt2882 | 0xFF000000, 1);
		this.aClass13_11 = arg0.method2818(0, 0, this.anInt2874, this.anInt2874, true);
		arg0.method2819();
		arg0.method2901(0, 0, this.anInt2874, this.anInt2874, 0, 0);
		Static157.aClass13_9.method6395(0, 0, this.anInt2874, this.anInt2874, 0, 0, 0);
		this.aClass13_11.method6392(0);
		arg0.method2895(Static157.anIntArray180[0], Static157.anIntArray180[1], Static157.anIntArray180[2], Static157.anIntArray180[3]);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lclient!wm;Lclient!ja;)V")
	private void method2919(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		@Pc(6) Class185 local6 = Static298.method2426(Static336.aClass197_90, this.anInt2876);
		if (local6 == null) {
			return;
		}
		arg0.method2851(Static157.anIntArray180);
		arg0.method2895(0, 0, this.anInt2874, this.anInt2874);
		arg0.method2901(0, 0, this.anInt2874, this.anInt2874, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean203) {
				local32 = -arg1.anInt2878;
				local34 = -arg1.anInt2873;
				local36 = -arg1.anInt2881;
			} else {
				local32 = this.anInt2878 - arg1.anInt2878;
				local34 = this.anInt2873 - arg1.anInt2873;
				local36 = this.anInt2881 - arg1.anInt2881;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2875 != 0) {
			local81 = -this.anInt2875 & 0x3FFF;
			local85 = Class19.anIntArray178[local81];
			local89 = Class19.anIntArray177[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt2871 != 0) {
			local81 = -this.anInt2871 & 0x3FFF;
			local85 = Class19.anIntArray178[local81];
			local89 = Class19.anIntArray177[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method2838(1.0F);
		arg0.method2832(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Model local172 = arg0.method2864(local6, 1024, 0, 64, 768);
		local85 = local172.method3822() - local172.method3806();
		local89 = local172.method3817() - local172.method3802();
		local99 = local172.method3806() + local85 / 2;
		@Pc(198) int local198 = local172.method3802() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2821(local99, local198, local205, local205);
		arg0.method2896(arg0.method2897());
		@Pc(218) Class14 local218 = arg0.method2808();
		local218.method3922(0, 0, arg0.method2814() - local172.method3812());
		local172.method3844(local218, null, arg0.method2814());
		this.aClass13_11 = arg0.method2818(0, 0, this.anInt2874, this.anInt2874, true);
		this.aClass13_11.method6392(3);
		arg0.method2895(Static157.anIntArray180[0], Static157.anIntArray180[1], Static157.anIntArray180[2], Static157.anIntArray180[3]);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
	public void method2921() {
		this.aClass13_11 = null;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Lclient!wm;Lclient!ja;)Z")
	private boolean method2922(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		if (this.aClass13_11 == null) {
			if (this.anInt2877 == 0) {
				if (Static274.anInterface2_7.method2657(this.anInt2876)) {
					@Pc(23) int[] local23 = Static274.anInterface2_7.method2656(0.7F, this.anInt2874, this.anInt2874, this.anInt2876);
					this.aClass13_11 = arg0.method2884(local23, this.anInt2874, this.anInt2874, this.anInt2874);
				}
			} else if (this.anInt2877 == 2) {
				this.method2919(arg0, arg1);
			} else if (this.anInt2877 == 1) {
				this.method2918(arg0, arg1);
			}
		}
		return this.aClass13_11 != null;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(Lclient!wm;Lclient!ja;)Z")
	public boolean method2924(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class112 arg1) {
		return this.aClass13_11 != null || this.method2922(arg0, arg1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)Z")
	public boolean method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean203) {
			this.anInt2880 = 1073741823;
			local7 = this.anInt2878;
			local12 = this.anInt2873;
			local17 = this.anInt2881;
		} else {
			local7 = this.anInt2878 - arg0;
			local12 = this.anInt2873 - arg1;
			local17 = this.anInt2881 - arg2;
			this.anInt2880 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2880 == 0) {
				this.anInt2880 = 1;
			}
			local7 = (local7 << 8) / this.anInt2880;
			local12 = (local12 << 8) / this.anInt2880;
			local17 = (local17 << 8) / this.anInt2880;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2872 = this.anInt2879 * arg3 / (this.aBoolean203 ? 1024 : this.anInt2880);
		} else {
			this.anInt2872 = 0;
		}
		if (this.anInt2872 < 8) {
			this.aClass13_11 = null;
			return false;
		}
		@Pc(143) int local143 = Static162.method2977(this.anInt2872);
		if (local143 > arg3) {
			local143 = Static351.method5855(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2874) {
			this.anInt2874 = local143;
		}
		this.anInt2875 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt2871 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass13_11 = null;
		return true;
	}
}
