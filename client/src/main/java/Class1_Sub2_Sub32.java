import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
	private int anInt6115 = 1;

	@OriginalMember(owner = "client!sq", name = "Z", descriptor = "I")
	private int anInt6123 = 1;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(27) int local27 = this.anInt6115 + this.anInt6115 + 1;
			@Pc(31) int local31 = 65536 / local27;
			@Pc(39) int local39 = this.anInt6123 + this.anInt6123 + 1;
			@Pc(43) int local43 = 65536 / local39;
			@Pc(46) int[][][] local46 = new int[local27][][];
			@Pc(70) int local70;
			@Pc(72) int local72;
			for (@Pc(52) int local52 = arg0 - this.anInt6115; local52 <= arg0 + this.anInt6115; local52++) {
				@Pc(62) int[][] local62 = this.method6082(0, Static128.anInt3242 & local52);
				@Pc(66) int[][] local66 = new int[3][Static64.anInt1755];
				@Pc(68) int local68 = 0;
				local70 = 0;
				local72 = 0;
				@Pc(76) int[] local76 = local62[0];
				@Pc(80) int[] local80 = local62[1];
				@Pc(84) int[] local84 = local62[2];
				for (@Pc(88) int local88 = -this.anInt6123; local88 <= this.anInt6123; local88++) {
					@Pc(94) int local94 = Static145.anInt3608 & local88;
					local70 += local80[local94];
					local68 += local76[local94];
					local72 += local84[local94];
				}
				@Pc(121) int[] local121 = local66[0];
				@Pc(125) int[] local125 = local66[1];
				@Pc(129) int[] local129 = local66[2];
				@Pc(131) int local131 = 0;
				while (local131 < Static64.anInt1755) {
					local121[local131] = local43 * local68 >> 16;
					local125[local131] = local70 * local43 >> 16;
					local129[local131] = local43 * local72 >> 16;
					@Pc(164) int local164 = Static145.anInt3608 & local131 - this.anInt6123;
					local68 -= local76[local164];
					local131++;
					local70 -= local80[local164];
					local72 -= local84[local164];
					@Pc(190) int local190 = Static145.anInt3608 & this.anInt6123 + local131;
					local68 += local76[local190];
					local72 += local84[local190];
					local70 += local80[local190];
				}
				local46[local52 + this.anInt6115 - arg0] = local66;
			}
			@Pc(232) int[] local232 = local11[0];
			@Pc(236) int[] local236 = local11[1];
			@Pc(240) int[] local240 = local11[2];
			for (local70 = 0; local70 < Static64.anInt1755; local70++) {
				local72 = 0;
				@Pc(248) int local248 = 0;
				@Pc(250) int local250 = 0;
				for (@Pc(252) int local252 = 0; local252 < local27; local252++) {
					@Pc(258) int[][] local258 = local46[local252];
					local250 += local258[2][local70];
					local72 += local258[0][local70];
					local248 += local258[1][local70];
				}
				local232[local70] = local72 * local31 >> 16;
				local236[local70] = local31 * local248 >> 16;
				local240[local70] = local31 * local250 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt6123 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt6115 = arg1.method5761();
		} else if (arg0 == 2) {
			super.aBoolean515 = arg1.method5761() == 1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(30) int local30 = this.anInt6115 + this.anInt6115 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt6123 + this.anInt6123 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local30][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt6115; local55 <= this.anInt6115 + arg0; local55++) {
				@Pc(65) int[] local65 = this.method6078(0, Static128.anInt3242 & local55);
				@Pc(68) int[] local68 = new int[Static64.anInt1755];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt6123; local74 <= this.anInt6123; local74++) {
					local70 += local65[Static145.anInt3608 & local74];
				}
				@Pc(95) int local95 = 0;
				while (local95 < Static64.anInt1755) {
					local68[local95] = local46 * local70 >> 16;
					local70 -= local65[local95 - this.anInt6123 & Static145.anInt3608];
					local95++;
					local70 += local65[local95 + this.anInt6123 & Static145.anInt3608];
				}
				local49[local55 + this.anInt6115 - arg0] = local68;
			}
			for (@Pc(156) int local156 = 0; local156 < Static64.anInt1755; local156++) {
				@Pc(160) int local160 = 0;
				for (local70 = 0; local70 < local30; local70++) {
					local160 += local49[local70][local156];
				}
				local18[local156] = local34 * local160 >> 16;
			}
		}
		return local18;
	}
}
