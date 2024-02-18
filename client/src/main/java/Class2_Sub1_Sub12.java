import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
	private int anInt4855 = 1;

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
	private int anInt4850 = 1;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(30) int local30 = this.anInt4855 + this.anInt4855 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt4850 + this.anInt4850 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local30][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(55) int local55 = arg0 - this.anInt4855; local55 <= arg0 + this.anInt4855; local55++) {
				@Pc(67) int[][] local67 = this.method9413(0, Static489.anInt7343 & local55);
				@Pc(71) int[][] local71 = new int[3][Static608.anInt9289];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt4850; local93 <= this.anInt4850; local93++) {
					@Pc(101) int local101 = local93 & Static576.anInt8580;
					local77 += local89[local101];
					local73 += local81[local101];
					local75 += local85[local101];
				}
				@Pc(132) int[] local132 = local71[0];
				@Pc(136) int[] local136 = local71[1];
				@Pc(140) int[] local140 = local71[2];
				@Pc(144) int local144 = 0;
				while (Static608.anInt9289 > local144) {
					local132[local144] = local73 * local46 >> 16;
					local136[local144] = local75 * local46 >> 16;
					local140[local144] = local46 * local77 >> 16;
					@Pc(180) int local180 = Static576.anInt8580 & local144 - this.anInt4850;
					local144++;
					local75 -= local85[local180];
					local77 -= local89[local180];
					local73 -= local81[local180];
					@Pc(206) int local206 = Static576.anInt8580 & local144 + this.anInt4850;
					local73 += local81[local206];
					local77 += local89[local206];
					local75 += local85[local206];
				}
				local49[this.anInt4855 + local55 - arg0] = local71;
			}
			@Pc(256) int[] local256 = local11[0];
			@Pc(260) int[] local260 = local11[1];
			@Pc(266) int[] local266 = local11[2];
			for (local75 = 0; local75 < Static608.anInt9289; local75++) {
				local77 = 0;
				@Pc(274) int local274 = 0;
				@Pc(276) int local276 = 0;
				for (@Pc(278) int local278 = 0; local278 < local30; local278++) {
					@Pc(284) int[][] local284 = local49[local278];
					local77 += local284[0][local75];
					local274 += local284[1][local75];
					local276 += local284[2][local75];
				}
				local256[local75] = local34 * local77 >> 16;
				local260[local75] = local34 * local274 >> 16;
				local266[local75] = local276 * local34 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(23) int local23 = this.anInt4855 + this.anInt4855 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt4850 + this.anInt4850 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg1 - this.anInt4855; local48 <= arg1 + this.anInt4855; local48++) {
				@Pc(58) int[] local58 = this.method9422(local48 & Static489.anInt7343, 0);
				@Pc(61) int[] local61 = new int[Static608.anInt9289];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt4850; local67 <= this.anInt4850; local67++) {
					local63 += local58[local67 & Static576.anInt8580];
				}
				@Pc(84) int local84 = 0;
				while (local84 < Static608.anInt9289) {
					local61[local84] = local39 * local63 >> 16;
					local63 -= local58[Static576.anInt8580 & local84 - this.anInt4850];
					local84++;
					local63 += local58[local84 + this.anInt4850 & Static576.anInt8580];
				}
				local42[local48 + this.anInt4855 - arg1] = local61;
			}
			for (@Pc(146) int local146 = 0; local146 < Static608.anInt9289; local146++) {
				@Pc(150) int local150 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local150 += local42[local63][local146];
				}
				local11[local146] = local150 * local27 >> 16;
			}
		}
		if (arg0 < 107) {
			this.method9411(-16, 56);
		}
		return local11;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			return;
		}
		if (arg2 == 0) {
			this.anInt4850 = arg1.g1();
		} else if (arg2 == 1) {
			this.anInt4855 = arg1.g1();
		} else if (arg2 == 2) {
			super.aBoolean824 = arg1.g1() == 1;
		}
	}
}
