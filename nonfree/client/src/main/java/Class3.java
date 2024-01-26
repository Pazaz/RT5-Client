import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class3 {

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "[[S")
	public short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "[[[S")
	public short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
	public int anInt88;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "Z")
	public boolean aBoolean5 = true;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "[I")
	public int[] anIntArray14 = null;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
	public int anInt81 = -1;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
	public int anInt86 = 4;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
	public int anInt85 = 2;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "[I")
	public int[] anIntArray16 = null;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
	public int anInt87 = 3;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class3(@OriginalArg(0) Class330 arg0) {
		@Pc(30) byte[] local30 = arg0.method7589(3);
		this.method93(new Class2_Sub21(local30));
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!ge;I)V")
	private void method93(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(7) boolean local7 = false;
		while (true) {
			while (true) {
				@Pc(13) int local13;
				@Pc(93) int local93;
				label95: do {
					while (true) {
						while (true) {
							while (true) {
								local13 = arg0.method7396();
								if (local13 == 0) {
									if (!local7) {
										if (this.anIntArray16 == null) {
											this.anIntArray14 = new int[4];
											this.anIntArray16 = new int[4];
											this.anInt86 = 4;
										}
										for (local13 = 0; local13 < this.anIntArray16.length; local13++) {
											this.anIntArray16[local13] = 0;
											this.anIntArray14[local13] = local13 * 20;
										}
									}
									return;
								}
								if (local13 == 1) {
									if (this.anIntArray16 == null) {
										this.anIntArray16 = new int[4];
										this.anIntArray14 = new int[4];
										this.anInt86 = 4;
									}
									local7 = true;
									for (local93 = 0; local93 < this.anIntArray16.length; local93++) {
										this.anIntArray16[local93] = arg0.method7356();
										this.anIntArray14[local93] = arg0.method7356();
									}
								} else if (local13 == 2) {
									this.anInt81 = arg0.method7382();
								} else {
									if (local13 != 3) {
										continue label95;
									}
									this.anInt86 = arg0.method7396();
									this.anIntArray14 = new int[this.anInt86];
									this.anIntArray16 = new int[this.anInt86];
								}
							}
						}
					}
				} while (local13 == 4);
				if (local13 == 5) {
					this.anInt88 = arg0.method7383();
				} else if (local13 == 6) {
					this.anInt82 = arg0.method7383();
				} else if (local13 == 7) {
					this.aShortArrayArrayArray1 = new short[10][4][];
					this.aShortArrayArray1 = new short[10][4];
					for (local93 = 0; local93 < 10; local93++) {
						for (@Pc(97) int local97 = 0; local97 < 4; local97++) {
							@Pc(103) int local103 = arg0.method7382();
							if (local103 == 65535) {
								local103 = -1;
							}
							this.aShortArrayArray1[local93][local97] = (short) local103;
							@Pc(122) int local122 = arg0.method7382();
							this.aShortArrayArrayArray1[local93][local97] = new short[local122];
							for (@Pc(132) int local132 = 0; local132 < local122; local132++) {
								@Pc(140) int local140 = arg0.method7382();
								if (local140 == 65535) {
									local140 = -1;
								}
								this.aShortArrayArrayArray1[local93][local97][local132] = (short) local140;
							}
						}
					}
				} else if (local13 == 8) {
					this.aBoolean5 = false;
				} else if (local13 == 9) {
					this.anInt85 = arg0.method7396();
				} else if (local13 == 10) {
					this.aBoolean6 = false;
				} else if (local13 == 11) {
					this.anInt87 = arg0.method7396();
				}
			}
		}
	}
}
