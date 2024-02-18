import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fp", name = "U", descriptor = "I")
	private int anInt3078;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
	private int anInt3080;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
	private int anInt3084;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
	private int anInt3086;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "client!fp", name = "W", descriptor = "I")
	private int anInt3090;

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
	private int anInt3087 = 0;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
	private int anInt3092 = 0;

	@OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
	private int anInt3079 = 0;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt3092 = arg1.g2s();
		} else if (arg2 == 1) {
			this.anInt3087 = (arg1.g1b() << 12) / 100;
		} else if (arg2 == 2) {
			this.anInt3079 = (arg1.g1b() << 12) / 100;
		}
		if (arg0) {
			this.anInt3086 = -61;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIII)V")
	private void method2841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : (arg1 + 4096) * arg2 >> 12;
		if (local31 <= 0) {
			this.anInt3086 = this.anInt3084 = this.anInt3090 = arg2;
			return;
		}
		@Pc(37) int local37 = arg0 * 6;
		@Pc(44) int local44 = arg2 + arg2 - local31;
		@Pc(52) int local52 = (local31 - local44 << 12) / local31;
		@Pc(56) int local56 = local37 >> 12;
		@Pc(63) int local63 = local37 - (local56 << 12);
		@Pc(71) int local71 = local31 * local52 >> 12;
		@Pc(77) int local77 = local63 * local71 >> 12;
		@Pc(82) int local82 = local44 + local77;
		@Pc(87) int local87 = local31 - local77;
		if (local56 == 0) {
			this.anInt3086 = local31;
			this.anInt3084 = local82;
			this.anInt3090 = local44;
			return;
		}
		if (local56 == 1) {
			this.anInt3086 = local87;
			this.anInt3090 = local44;
			this.anInt3084 = local31;
			return;
		}
		if (local56 == 2) {
			this.anInt3090 = local82;
			this.anInt3084 = local31;
			this.anInt3086 = local44;
			return;
		}
		if (local56 == 3) {
			this.anInt3090 = local31;
			this.anInt3086 = local44;
			this.anInt3084 = local87;
			return;
		}
		if (local56 == 4) {
			this.anInt3086 = local82;
			this.anInt3090 = local31;
			this.anInt3084 = local44;
			return;
		}
		if (local56 == 5) {
			this.anInt3086 = local31;
			this.anInt3090 = local87;
			this.anInt3084 = local44;
			return;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBII)V")
	private void method2845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg2 < arg0 ? arg0 : arg2;
		@Pc(25) int local25 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(33) int local33 = arg1 > local17 ? arg1 : local17;
		@Pc(45) int local45 = arg1 >= local25 ? local25 : arg1;
		this.anInt3080 = (local33 + local45) / 2;
		@Pc(57) int local57 = local33 - local45;
		if (local57 > 0) {
			@Pc(76) int local76 = (local33 - arg0 << 12) / local57;
			@Pc(85) int local85 = (local33 - arg2 << 12) / local57;
			@Pc(94) int local94 = (local33 - arg1 << 12) / local57;
			if (local33 == arg0) {
				this.anInt3088 = arg2 == local45 ? local94 + 20480 : -local85 + 4096;
			} else if (local33 == arg2) {
				this.anInt3088 = local45 == arg1 ? local76 + 4096 : -local94 + 12288;
			} else {
				this.anInt3088 = local45 == arg0 ? local85 + 12288 : -local76 + 20480;
			}
			this.anInt3088 /= 6;
		} else {
			this.anInt3088 = 0;
		}
		if (this.anInt3080 > 0 && this.anInt3080 < 4096) {
			this.anInt3078 = (local57 << 12) / (this.anInt3080 > 2048 ? 8192 - this.anInt3080 * 2 : this.anInt3080 * 2);
		} else {
			this.anInt3078 = 0;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(22) int[][] local22 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(32) int[][] local32 = this.method9413(0, arg0);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local22[0];
			@Pc(52) int[] local52 = local22[1];
			@Pc(56) int[] local56 = local22[2];
			for (@Pc(58) int local58 = 0; local58 < Static608.anInt9289; local58++) {
				this.method2845(local36[local58], local44[local58], local40[local58]);
				this.anInt3080 += this.anInt3079;
				this.anInt3078 += this.anInt3087;
				for (this.anInt3088 += this.anInt3092; this.anInt3088 < 0; this.anInt3088 += 4096) {
				}
				while (this.anInt3088 > 4096) {
					this.anInt3088 -= 4096;
				}
				if (this.anInt3078 < 0) {
					this.anInt3078 = 0;
				}
				if (this.anInt3080 < 0) {
					this.anInt3080 = 0;
				}
				if (this.anInt3078 > 4096) {
					this.anInt3078 = 4096;
				}
				if (this.anInt3080 > 4096) {
					this.anInt3080 = 4096;
				}
				this.method2841(this.anInt3088, this.anInt3078, this.anInt3080);
				local48[local58] = this.anInt3086;
				local52[local58] = this.anInt3084;
				local56[local58] = this.anInt3090;
			}
		}
		return local22;
	}
}
