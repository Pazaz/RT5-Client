import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class104 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Ljava/lang/String;")
	private String aString130;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "Lclient!sf;")
	private Class183 aClass183_14;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "Ljava/lang/String;")
	private String aString131;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray24;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public int anInt3671 = -1;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
	public void method3224() {
		if (this.aString130 == null) {
			this.aString130 = this.aString131;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BILclient!il;)V")
	private void method3226(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aString131 = arg1.method5727();
		} else if (arg0 == 2) {
			this.aString130 = arg1.method5727();
		} else {
			@Pc(40) int local40;
			@Pc(47) int local47;
			if (arg0 == 3) {
				local40 = arg1.method5761();
				this.anIntArrayArray20 = new int[local40][3];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArrayArray20[local47][0] = arg1.method5749();
					this.anIntArrayArray20[local47][1] = arg1.method5730();
					this.anIntArrayArray20[local47][2] = arg1.method5730();
				}
			} else if (arg0 == 4) {
				local40 = arg1.method5761();
				this.anIntArrayArray22 = new int[local40][3];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArrayArray22[local47][0] = arg1.method5749();
					this.anIntArrayArray22[local47][1] = arg1.method5730();
					this.anIntArrayArray22[local47][2] = arg1.method5730();
				}
			} else if (arg0 == 5) {
				arg1.method5749();
			} else if (arg0 == 6) {
				arg1.method5761();
				return;
			} else if (arg0 == 7) {
				arg1.method5761();
				return;
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5761();
					return;
				}
				if (arg0 == 10) {
					local40 = arg1.method5761();
					this.anIntArray264 = new int[local40];
					for (local47 = 0; local47 < local40; local47++) {
						this.anIntArray264[local47] = arg1.method5730();
					}
					return;
				}
				if (arg0 == 12) {
					arg1.method5730();
					return;
				}
				if (arg0 != 13) {
					if (arg0 == 14) {
						local40 = arg1.method5761();
						this.anIntArrayArray21 = new int[local40][2];
						for (local47 = 0; local47 < local40; local47++) {
							this.anIntArrayArray21[local47][0] = arg1.method5761();
							this.anIntArrayArray21[local47][1] = arg1.method5761();
						}
						return;
					}
					if (arg0 != 15) {
						if (arg0 == 17) {
							this.anInt3671 = arg1.method5749();
							return;
						}
						if (arg0 == 18) {
							local40 = arg1.method5761();
							this.anIntArray263 = new int[local40];
							this.anIntArray266 = new int[local40];
							this.anIntArray262 = new int[local40];
							this.aStringArray24 = new String[local40];
							for (local47 = 0; local47 < local40; local47++) {
								this.anIntArray263[local47] = arg1.method5730();
								this.anIntArray262[local47] = arg1.method5730();
								this.anIntArray266[local47] = arg1.method5730();
								this.aStringArray24[local47] = arg1.method5776();
							}
							return;
						}
						if (arg0 == 19) {
							local40 = arg1.method5761();
							this.aStringArray23 = new String[local40];
							this.anIntArray260 = new int[local40];
							this.anIntArray268 = new int[local40];
							this.anIntArray261 = new int[local40];
							for (local47 = 0; local47 < local40; local47++) {
								this.anIntArray268[local47] = arg1.method5730();
								this.anIntArray260[local47] = arg1.method5730();
								this.anIntArray261[local47] = arg1.method5730();
								this.aStringArray23[local47] = arg1.method5776();
							}
						} else if (arg0 == 249) {
							local40 = arg1.method5761();
							if (this.aClass183_14 == null) {
								local47 = Static162.method3414(local40);
								this.aClass183_14 = new Class183(local47);
							}
							for (local47 = 0; local47 < local40; local47++) {
								@Pc(303) boolean local303 = arg1.method5761() == 1;
								@Pc(307) int local307 = arg1.method5755();
								@Pc(316) Class1 local316;
								if (local303) {
									local316 = new Class1_Sub31(arg1.method5776());
								} else {
									local316 = new Class1_Sub26(arg1.method5730());
								}
								this.aClass183_14.method5055((long) local307, local316);
							}
							return;
						}
						return;
					}
					arg1.method5749();
					return;
				}
				local40 = arg1.method5761();
				this.anIntArray267 = new int[local40];
				for (local47 = 0; local47 < local40; local47++) {
					this.anIntArray267[local47] = arg1.method5749();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!il;I)V")
	public void method3227(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method3226(local5, arg0);
		}
	}
}
