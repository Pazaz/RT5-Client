import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fn", name = "Q", descriptor = "I")
	private int anInt2311 = 0;

	@OriginalMember(owner = "client!fn", name = "T", descriptor = "I")
	private int anInt2313 = 1;

	@OriginalMember(owner = "client!fn", name = "R", descriptor = "[B")
	private byte[] aByteArray14 = new byte[512];

	@OriginalMember(owner = "client!fn", name = "Y", descriptor = "I")
	private int anInt2318 = 5;

	@OriginalMember(owner = "client!fn", name = "P", descriptor = "[S")
	private short[] aShortArray22 = new short[512];

	@OriginalMember(owner = "client!fn", name = "ab", descriptor = "I")
	private int anInt2319 = 2;

	@OriginalMember(owner = "client!fn", name = "U", descriptor = "I")
	private int anInt2314 = 2048;

	@OriginalMember(owner = "client!fn", name = "cb", descriptor = "I")
	private int anInt2321 = 5;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt2321 = this.anInt2318 = arg1.method5761();
		} else if (arg0 == 1) {
			this.anInt2311 = arg1.method5761();
		} else if (arg0 == 2) {
			this.anInt2314 = arg1.method5749();
		} else if (arg0 == 3) {
			this.anInt2319 = arg1.method5761();
		} else if (arg0 == 4) {
			this.anInt2313 = arg1.method5761();
		} else if (arg0 == 5) {
			this.anInt2321 = arg1.method5761();
		} else if (arg0 == 6) {
			this.anInt2318 = arg1.method5761();
		}
	}

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "(B)V")
	private void method1935() {
		@Pc(12) Random local12 = new Random((long) this.anInt2311);
		this.aShortArray22 = new short[512];
		if (this.anInt2314 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray22[local28] = (short) Static228.method4354(local12, this.anInt2314);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		this.aByteArray14 = Static88.method1947(this.anInt2311);
		this.method1935();
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(32) int local32 = this.anInt2318 * Static60.anIntArray455[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static64.anInt1755; local42++) {
				Static311.anInt5202 = Integer.MAX_VALUE;
				Static55.anInt1627 = Integer.MAX_VALUE;
				Static334.anInt6946 = Integer.MAX_VALUE;
				Static101.anInt2512 = Integer.MAX_VALUE;
				@Pc(62) int local62 = Static207.anIntArray360[local42] * this.anInt2321 + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(156) int local156;
				for (@Pc(74) int local74 = local36 - 1; local74 <= local40; local74++) {
					@Pc(99) int local99 = this.aByteArray14[(this.anInt2318 > local74 ? local74 : local74 - this.anInt2318) & 0xFF] & 0xFF;
					for (@Pc(103) int local103 = local66 - 1; local103 <= local70; local103++) {
						@Pc(128) int local128 = (this.aByteArray14[(this.anInt2321 <= local103 ? local103 - this.anInt2321 : local103) + local99 & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = local128 + 1;
						@Pc(141) int local141 = local62 - this.aShortArray22[local128] - (local103 << 12);
						@Pc(153) int local153 = local32 - (local74 << 12) - this.aShortArray22[local133];
						local156 = this.anInt2313;
						@Pc(189) int local189;
						if (local156 == 1) {
							local189 = local141 * local141 + local153 * local153 >> 12;
						} else if (local156 == 3) {
							local141 = local141 < 0 ? -local141 : local141;
							local153 = local153 >= 0 ? local153 : -local153;
							local189 = local141 <= local153 ? local153 : local141;
						} else if (local156 == 4) {
							local141 = (int) (Math.sqrt((double) ((float) (local141 >= 0 ? local141 : -local141) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 < 0 ? -local153 : local153) / 4096.0F)) * 4096.0D);
							local189 = local153 + local141;
							local189 = local189 * local189 >> 12;
						} else if (local156 == 5) {
							local141 *= local141;
							local153 *= local153;
							local189 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local153 + local141) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local189 = (local153 >= 0 ? local153 : -local153) + (local141 < 0 ? -local141 : local141);
						} else {
							local189 = (int) (Math.sqrt((double) ((float) (local141 * local141 + local153 * local153) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static101.anInt2512 > local189) {
							Static311.anInt5202 = Static55.anInt1627;
							Static55.anInt1627 = Static334.anInt6946;
							Static334.anInt6946 = Static101.anInt2512;
							Static101.anInt2512 = local189;
						} else if (Static334.anInt6946 > local189) {
							Static311.anInt5202 = Static55.anInt1627;
							Static55.anInt1627 = Static334.anInt6946;
							Static334.anInt6946 = local189;
						} else if (Static55.anInt1627 > local189) {
							Static311.anInt5202 = Static55.anInt1627;
							Static55.anInt1627 = local189;
						} else if (local189 < Static311.anInt5202) {
							Static311.anInt5202 = local189;
						}
					}
				}
				local156 = this.anInt2319;
				if (local156 == 0) {
					local11[local42] = Static101.anInt2512;
				} else if (local156 == 1) {
					local11[local42] = Static334.anInt6946;
				} else if (local156 == 3) {
					local11[local42] = Static55.anInt1627;
				} else if (local156 == 4) {
					local11[local42] = Static311.anInt5202;
				} else if (local156 == 2) {
					local11[local42] = Static334.anInt6946 - Static101.anInt2512;
				}
			}
		}
		return local11;
	}
}
