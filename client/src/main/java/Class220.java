import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class220 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "[I")
	public int[] anIntArray598;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	public int anInt7330;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "[Lclient!no;")
	public Class136[] aClass136Array1;

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	public int anInt7333;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "[I")
	public int[] anIntArray600;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "[I")
	public int[] anIntArray601;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
	public int anInt7336;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "Lclient!no;")
	public Class136 aClass136_1;

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "[I")
	public int[] anIntArray602;

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	public final int anInt7331;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "([BI)V")
	public Class220(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7331 = Static244.method2181(arg0.length, arg0);
		if (arg1 != this.anInt7331) {
			throw new RuntimeException();
		}
		this.method6143(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "([BI)V")
	private void method6143(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class1_Sub16 local12 = new Class1_Sub16(Static85.method1903(arg0));
		@Pc(18) int local18 = local12.method5761();
		if (local18 != 5 && local18 != 6) {
			throw new RuntimeException();
		}
		if (local18 < 6) {
			this.anInt7333 = 0;
		} else {
			this.anInt7333 = local12.method5730();
		}
		@Pc(51) int local51 = local12.method5761();
		this.anInt7336 = local12.method5749();
		@Pc(58) int local58 = 0;
		this.anIntArray600 = new int[this.anInt7336];
		@Pc(65) int local65 = -1;
		for (@Pc(67) int local67 = 0; local67 < this.anInt7336; local67++) {
			this.anIntArray600[local67] = local58 += local12.method5749();
			if (this.anIntArray600[local67] > local65) {
				local65 = this.anIntArray600[local67];
			}
		}
		this.anInt7330 = local65 + 1;
		this.anIntArray603 = new int[this.anInt7330];
		this.anIntArray602 = new int[this.anInt7330];
		this.anIntArrayArray60 = new int[this.anInt7330][];
		this.anIntArray598 = new int[this.anInt7330];
		this.anIntArray601 = new int[this.anInt7330];
		@Pc(144) int local144;
		@Pc(162) int local162;
		if (local51 != 0) {
			this.anIntArray599 = new int[this.anInt7330];
			for (local144 = 0; local144 < this.anInt7330; local144++) {
				this.anIntArray599[local144] = -1;
			}
			for (local162 = 0; local162 < this.anInt7336; local162++) {
				this.anIntArray599[this.anIntArray600[local162]] = local12.method5730();
			}
			this.aClass136_1 = new Class136(this.anIntArray599);
		}
		for (local144 = 0; local144 < this.anInt7336; local144++) {
			this.anIntArray603[this.anIntArray600[local144]] = local12.method5730();
		}
		for (local162 = 0; local162 < this.anInt7336; local162++) {
			this.anIntArray602[this.anIntArray600[local162]] = local12.method5730();
		}
		for (@Pc(238) int local238 = 0; local238 < this.anInt7336; local238++) {
			this.anIntArray601[this.anIntArray600[local238]] = local12.method5749();
		}
		@Pc(264) int local264;
		@Pc(269) int local269;
		@Pc(279) int local279;
		@Pc(281) int local281;
		@Pc(298) int local298;
		for (@Pc(257) int local257 = 0; local257 < this.anInt7336; local257++) {
			local264 = this.anIntArray600[local257];
			local269 = this.anIntArray601[local264];
			local58 = 0;
			this.anIntArrayArray60[local264] = new int[local269];
			local279 = -1;
			for (local281 = 0; local281 < local269; local281++) {
				local298 = this.anIntArrayArray60[local264][local281] = local58 += local12.method5749();
				if (local298 > local279) {
					local279 = local298;
				}
			}
			this.anIntArray598[local264] = local279 + 1;
			if (local279 + 1 == local269) {
				this.anIntArrayArray60[local264] = null;
			}
		}
		if (local51 == 0) {
			return;
		}
		this.anIntArrayArray59 = new int[local65 + 1][];
		this.aClass136Array1 = new Class136[local65 + 1];
		for (local264 = 0; local264 < this.anInt7336; local264++) {
			local269 = this.anIntArray600[local264];
			local279 = this.anIntArray601[local269];
			this.anIntArrayArray59[local269] = new int[this.anIntArray598[local269]];
			for (local281 = 0; local281 < this.anIntArray598[local269]; local281++) {
				this.anIntArrayArray59[local269][local281] = -1;
			}
			for (local298 = 0; local298 < local279; local298++) {
				@Pc(413) int local413;
				if (this.anIntArrayArray60[local269] == null) {
					local413 = local298;
				} else {
					local413 = this.anIntArrayArray60[local269][local298];
				}
				this.anIntArrayArray59[local269][local413] = local12.method5730();
			}
			this.aClass136Array1[local269] = new Class136(this.anIntArrayArray59[local269]);
		}
	}
}
