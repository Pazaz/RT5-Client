import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class2_Sub3_Sub28 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "[I")
	public static final int[] anIntArray368 = new int[32];

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
	private int anInt5401 = 0;

	@OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
	private int anInt5408 = 0;

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	private int anInt5404 = 12288;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	private int anInt5402 = 4096;

	@OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
	private int anInt5416 = 2048;

	@OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
	private int anInt5412 = 2048;

	@OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
	private int anInt5403 = 8192;

	static {
		@Pc(7) int local7 = 2;
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			anIntArray368[local9] = local7 - 1;
			local7 += local7;
		}
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	@Override
	public void method6480() {
		Static29.method937();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt5416 = arg1.g2();
		} else if (arg0 == 1) {
			this.anInt5401 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt5408 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt5412 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt5404 = arg1.g2();
		} else if (arg0 == 5) {
			this.anInt5402 = arg1.g2();
		} else if (arg0 == 6) {
			this.anInt5403 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIB)Z")
	private boolean method4924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt5404 * (arg1 + arg0) >> 12;
		@Pc(23) int local23 = Static181.anIntArray203[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5404;
		@Pc(37) int local37 = (local30 << 12) / this.anInt5403;
		@Pc(44) int local44 = this.anInt5402 * local37 >> 12;
		return local44 > arg1 - arg0 && arg1 - arg0 > -local44;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method6485(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3996(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(26) int local26 = Static16.anIntArray322[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static227.anInt4036; local28++) {
				@Pc(36) int local36 = Static334.anIntArray424[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt5416;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(59) int local59 = local50 <= 2048 ? local50 : local50 - 4096;
				@Pc(64) int local64 = local26 + this.anInt5401;
				@Pc(75) int local75 = local64 >= -2048 ? local64 : local64 + 4096;
				@Pc(84) int local84 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(89) int local89 = this.anInt5408 + local36;
				@Pc(98) int local98 = local89 >= -2048 ? local89 : local89 + 4096;
				@Pc(107) int local107 = local98 <= 2048 ? local98 : local98 - 4096;
				@Pc(113) int local113 = local26 + this.anInt5412;
				@Pc(124) int local124 = local113 >= -2048 ? local113 : local113 + 4096;
				@Pc(135) int local135 = local124 <= 2048 ? local124 : local124 - 4096;
				local11[local28] = this.method4926(local59, local84) || this.method4924(local107, local135) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)Z")
	private boolean method4926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt5404 >> 12;
		@Pc(34) int local34 = Static181.anIntArray203[local13 * 255 >> 12 & 0xFF];
		@Pc(41) int local41 = (local34 << 12) / this.anInt5404;
		@Pc(48) int local48 = (local41 << 12) / this.anInt5403;
		@Pc(55) int local55 = local48 * this.anInt5402 >> 12;
		return local55 > arg1 + arg0 && -local55 < arg0 + arg1;
	}
}
