import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class230 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "[I")
	private int[] anIntArray440;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray60;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray61;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!ad;")
	private Class4 aClass4_134;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	public int anInt6454 = -1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!bt;I)V")
	private void method5832(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString64 = arg0.method4856();
		} else if (arg1 == 2) {
			this.aString63 = arg0.method4856();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method4815();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method4829();
					this.anIntArrayArray55[local31][1] = arg0.method4836();
					this.anIntArrayArray55[local31][2] = arg0.method4836();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method4815();
				this.anIntArrayArray57 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method4829();
					this.anIntArrayArray57[local31][1] = arg0.method4836();
					this.anIntArrayArray57[local31][2] = arg0.method4836();
				}
			} else if (arg1 == 5) {
				arg0.method4829();
			} else if (arg1 == 6) {
				arg0.method4815();
			} else if (arg1 == 7) {
				arg0.method4815();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4815();
				} else if (arg1 == 10) {
					local24 = arg0.method4815();
					this.anIntArray436 = new int[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray436[local31] = arg0.method4836();
					}
				} else if (arg1 == 12) {
					arg0.method4836();
				} else if (arg1 == 13) {
					local24 = arg0.method4815();
					this.anIntArray443 = new int[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray443[local31] = arg0.method4829();
					}
				} else if (arg1 == 14) {
					local24 = arg0.method4815();
					this.anIntArrayArray56 = new int[local24][2];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArrayArray56[local31][0] = arg0.method4815();
						this.anIntArrayArray56[local31][1] = arg0.method4815();
					}
				} else if (arg1 == 15) {
					arg0.method4829();
				} else if (arg1 == 17) {
					this.anInt6454 = arg0.method4829();
				} else if (arg1 == 18) {
					local24 = arg0.method4815();
					this.anIntArray437 = new int[local24];
					this.anIntArray440 = new int[local24];
					this.anIntArray442 = new int[local24];
					this.aStringArray61 = new String[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray442[local31] = arg0.method4836();
						this.anIntArray440[local31] = arg0.method4836();
						this.anIntArray437[local31] = arg0.method4836();
						this.aStringArray61[local31] = arg0.method4809();
					}
				} else if (arg1 == 19) {
					local24 = arg0.method4815();
					this.anIntArray441 = new int[local24];
					this.aStringArray60 = new String[local24];
					this.anIntArray439 = new int[local24];
					this.anIntArray438 = new int[local24];
					for (local31 = 0; local31 < local24; local31++) {
						this.anIntArray439[local31] = arg0.method4836();
						this.anIntArray438[local31] = arg0.method4836();
						this.anIntArray441[local31] = arg0.method4836();
						this.aStringArray60[local31] = arg0.method4809();
					}
				} else if (arg1 == 249) {
					local24 = arg0.method4815();
					if (this.aClass4_134 == null) {
						local31 = Static162.method2977(local24);
						this.aClass4_134 = new Class4(local31);
					}
					for (local31 = 0; local31 < local24; local31++) {
						@Pc(329) boolean local329 = arg0.method4815() == 1;
						@Pc(333) int local333 = arg0.method4833();
						@Pc(342) Class2 local342;
						if (local329) {
							local342 = new Class2_Sub40(arg0.method4809());
						} else {
							local342 = new Class2_Sub39(arg0.method4836());
						}
						this.aClass4_134.method87(local342, (long) local333);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public void method5834() {
		if (this.aString63 == null) {
			this.aString63 = this.aString64;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!bt;)V")
	public void method5836(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4815();
			if (local13 == 0) {
				return;
			}
			this.method5832(arg0, local13);
		}
	}
}