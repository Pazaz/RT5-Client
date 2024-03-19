import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 implements Interface4 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "[I")
	public static final int[] anIntArray10 = new int[4096];

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!op;")
	private final Class143 aClass143_1 = new Class143(256);

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!qj;")
	private final Class162 aClass162_16;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!qj;")
	private final Class162 aClass162_15;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "[Lclient!dp;")
	private final Class50[] aClass50Array1;

	static {
		for (@Pc(11) int local11 = 0; local11 < 4096; local11++) {
			anIntArray10[local11] = Static148.method3221(local11);
		}
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!qj;Lclient!qj;Lclient!qj;)V")
	public Class5(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) Class162 arg2) {
		this.aClass162_16 = arg1;
		this.aClass162_15 = arg2;
		@Pc(24) Class1_Sub16 local24 = new Class1_Sub16(arg0.method4636(0, 0));
		@Pc(28) int local28 = local24.method5749();
		this.aClass50Array1 = new Class50[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5761() == 1) {
				this.aClass50Array1[local34] = new Class50();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass50Array1[local58] != null) {
				this.aClass50Array1[local58].aBoolean108 = local24.method5761() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < local28; local87++) {
			if (this.aClass50Array1[local87] != null) {
				this.aClass50Array1[local87].aBoolean109 = local24.method5761() == 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < local28; local113++) {
			if (this.aClass50Array1[local113] != null) {
				this.aClass50Array1[local113].aBoolean112 = local24.method5761() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local28; local139++) {
			if (this.aClass50Array1[local139] != null) {
				this.aClass50Array1[local139].aBoolean114 = local24.method5761() == 1;
			}
		}
		for (@Pc(171) int local171 = 0; local171 < local28; local171++) {
			if (this.aClass50Array1[local171] != null) {
				this.aClass50Array1[local171].aByte22 = local24.method5772();
			}
		}
		for (@Pc(192) int local192 = 0; local192 < local28; local192++) {
			if (this.aClass50Array1[local192] != null) {
				this.aClass50Array1[local192].aByte20 = local24.method5772();
			}
		}
		for (@Pc(213) int local213 = 0; local213 < local28; local213++) {
			if (this.aClass50Array1[local213] != null) {
				this.aClass50Array1[local213].aByte21 = local24.method5772();
			}
		}
		for (@Pc(238) int local238 = 0; local238 < local28; local238++) {
			if (this.aClass50Array1[local238] != null) {
				this.aClass50Array1[local238].aByte18 = local24.method5772();
			}
		}
		for (@Pc(263) int local263 = 0; local263 < local28; local263++) {
			if (this.aClass50Array1[local263] != null) {
				this.aClass50Array1[local263].aShort27 = (short) local24.method5749();
			}
		}
		for (@Pc(289) int local289 = 0; local289 < local28; local289++) {
			if (this.aClass50Array1[local289] != null) {
				this.aClass50Array1[local289].aByte19 = local24.method5772();
			}
		}
		for (@Pc(310) int local310 = 0; local310 < local28; local310++) {
			if (this.aClass50Array1[local310] != null) {
				this.aClass50Array1[local310].aByte16 = local24.method5772();
			}
		}
		for (@Pc(335) int local335 = 0; local335 < local28; local335++) {
			if (this.aClass50Array1[local335] != null) {
				this.aClass50Array1[local335].aBoolean110 = local24.method5761() == 1;
			}
		}
		for (@Pc(363) int local363 = 0; local363 < local28; local363++) {
			if (this.aClass50Array1[local363] != null) {
				this.aClass50Array1[local363].aBoolean115 = local24.method5761() == 1;
			}
		}
		for (@Pc(395) int local395 = 0; local395 < local28; local395++) {
			if (this.aClass50Array1[local395] != null) {
				this.aClass50Array1[local395].aByte17 = local24.method5772();
			}
		}
		for (@Pc(416) int local416 = 0; local416 < local28; local416++) {
			if (this.aClass50Array1[local416] != null) {
				this.aClass50Array1[local416].aBoolean111 = local24.method5761() == 1;
			}
		}
		for (@Pc(446) int local446 = 0; local446 < local28; local446++) {
			if (this.aClass50Array1[local446] != null) {
				this.aClass50Array1[local446].aBoolean113 = local24.method5761() == 1;
			}
		}
		for (@Pc(474) int local474 = 0; local474 < local28; local474++) {
			if (this.aClass50Array1[local474] != null) {
				this.aClass50Array1[local474].aBoolean116 = local24.method5761() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method166(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub20 local8 = this.method174(arg0);
		return local8 != null && local8.method6112(this, this.aClass162_15);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FIIIZZ)[I")
	@Override
	public int[] method169(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method174(arg2).method6114(arg1, (double) arg0, arg3, this.aClass162_15, this, this.aClass50Array1[arg2].aBoolean115, arg4);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZIFI)[I")
	@Override
	public int[] method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method174(arg1).method6108(arg0, this, this.aClass50Array1[arg1].aBoolean115, (double) arg2, arg3, this.aClass162_15);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!dp;")
	@Override
	public Class50 method165(@OriginalArg(1) int arg0) {
		return this.aClass50Array1[arg0];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBZFII)[F")
	@Override
	public float[] method168(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method174(arg2).method6110(this.aClass162_15, arg3, this, arg0, this.aClass50Array1[arg2].aBoolean115);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lclient!wh;")
	private Class1_Sub1_Sub20 method174(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1 local10 = this.aClass143_1.method4323((long) arg0);
		if (local10 != null) {
			return (Class1_Sub1_Sub20) local10;
		}
		@Pc(27) byte[] local27 = this.aClass162_16.method4630(arg0);
		if (local27 == null) {
			return null;
		} else {
			@Pc(39) Class1_Sub1_Sub20 local39 = new Class1_Sub1_Sub20(new Class1_Sub16(local27));
			this.aClass143_1.method4322(local39, (long) arg0);
			return local39;
		}
	}
}
