import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class206 {

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "[I")
	private static final int[] anIntArray541 = new int[32768];

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "[I")
	private static final int[] anIntArray542;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "Lclient!bd;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Lclient!bd;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!bd;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "Lclient!bd;")
	private Class18 aClass18_4;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!sp;")
	private Class187 aClass187_1;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Lclient!bd;")
	private Class18 aClass18_5;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "Lclient!bd;")
	private Class18 aClass18_6;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "Lclient!bd;")
	private Class18 aClass18_7;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "Lclient!bd;")
	private Class18 aClass18_8;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "Lclient!bd;")
	private Class18 aClass18_9;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
	private int anInt6619 = 100;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
	public int anInt6620 = 0;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "[I")
	private final int[] anIntArray540 = new int[5];

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
	private int anInt6618 = 0;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "[I")
	private final int[] anIntArray543 = new int[5];

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "[I")
	private final int[] anIntArray548 = new int[5];

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
	public int anInt6621 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray541[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray542 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray542[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!il;)V")
	public void method5635(@OriginalArg(0) Class1_Sub16 arg0) {
		this.aClass18_2 = new Class18();
		this.aClass18_2.method463(arg0);
		this.aClass18_7 = new Class18();
		this.aClass18_7.method463(arg0);
		@Pc(21) int local21 = arg0.method5761();
		if (local21 != 0) {
			arg0.anInt6813--;
			this.aClass18_4 = new Class18();
			this.aClass18_4.method463(arg0);
			this.aClass18_8 = new Class18();
			this.aClass18_8.method463(arg0);
		}
		local21 = arg0.method5761();
		if (local21 != 0) {
			arg0.anInt6813--;
			this.aClass18_1 = new Class18();
			this.aClass18_1.method463(arg0);
			this.aClass18_3 = new Class18();
			this.aClass18_3.method463(arg0);
		}
		local21 = arg0.method5761();
		if (local21 != 0) {
			arg0.anInt6813--;
			this.aClass18_9 = new Class18();
			this.aClass18_9.method463(arg0);
			this.aClass18_5 = new Class18();
			this.aClass18_5.method463(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5744();
			if (local114 == 0) {
				break;
			}
			this.anIntArray548[local109] = local114;
			this.anIntArray540[local109] = arg0.method5781();
			this.anIntArray543[local109] = arg0.method5744();
		}
		this.anInt6618 = arg0.method5744();
		this.anInt6619 = arg0.method5744();
		this.anInt6621 = arg0.method5749();
		this.anInt6620 = arg0.method5749();
		this.aClass187_1 = new Class187();
		this.aClass18_6 = new Class18();
		this.aClass187_1.method5142(arg0, this.aClass18_6);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I")
	public int[] method5636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static360.method2017(Static322.anIntArray539, 0, arg0);
		if (arg1 < 10) {
			return Static322.anIntArray539;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass18_2.method462();
		this.aClass18_7.method462();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass18_4 != null) {
			this.aClass18_4.method462();
			this.aClass18_8.method462();
			local24 = (int) ((double) (this.aClass18_4.anInt655 - this.aClass18_4.anInt654) * 32.768D / local16);
			local26 = (int) ((double) this.aClass18_4.anInt654 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass18_1 != null) {
			this.aClass18_1.method462();
			this.aClass18_3.method462();
			local63 = (int) ((double) (this.aClass18_1.anInt655 - this.aClass18_1.anInt654) * 32.768D / local16);
			local65 = (int) ((double) this.aClass18_1.anInt654 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray548[local102] != 0) {
				Static322.anIntArray545[local102] = 0;
				Static322.anIntArray549[local102] = (int) ((double) this.anIntArray543[local102] * local16);
				Static322.anIntArray546[local102] = (this.anIntArray548[local102] << 14) / 100;
				Static322.anIntArray547[local102] = (int) ((double) (this.aClass18_2.anInt655 - this.aClass18_2.anInt654) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray540[local102]) / local16);
				Static322.anIntArray544[local102] = (int) ((double) this.aClass18_2.anInt654 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass18_2.method464(arg0);
			local187 = this.aClass18_7.method464(arg0);
			if (this.aClass18_4 != null) {
				local195 = this.aClass18_4.method464(arg0);
				local200 = this.aClass18_8.method464(arg0);
				local182 += this.method5637(local28, local200, this.aClass18_4.anInt653) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass18_1 != null) {
				local195 = this.aClass18_1.method464(arg0);
				local200 = this.aClass18_3.method464(arg0);
				local187 = local187 * ((this.method5637(local67, local200, this.aClass18_1.anInt653) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray548[local195] != 0) {
					local200 = local176 + Static322.anIntArray549[local195];
					if (local200 < arg0) {
						Static322.anIntArray539[local200] += this.method5637(Static322.anIntArray545[local195], local187 * Static322.anIntArray546[local195] >> 15, this.aClass18_2.anInt653);
						Static322.anIntArray545[local195] += (local182 * Static322.anIntArray547[local195] >> 16) + Static322.anIntArray544[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass18_9 != null) {
			this.aClass18_9.method462();
			this.aClass18_5.method462();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass18_9.method464(arg0);
				local352 = this.aClass18_5.method464(arg0);
				if (local339) {
					local187 = this.aClass18_9.anInt654 + ((this.aClass18_9.anInt655 - this.aClass18_9.anInt654) * local347 >> 8);
				} else {
					local187 = this.aClass18_9.anInt654 + ((this.aClass18_9.anInt655 - this.aClass18_9.anInt654) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static322.anIntArray539[local200] = 0;
				}
			}
		}
		if (this.anInt6618 > 0 && this.anInt6619 > 0) {
			local182 = (int) ((double) this.anInt6618 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static322.anIntArray539[local187] += Static322.anIntArray539[local187 - local182] * this.anInt6619 / 100;
			}
		}
		if (this.aClass187_1.anIntArray466[0] > 0 || this.aClass187_1.anIntArray466[1] > 0) {
			this.aClass18_6.method462();
			local182 = this.aClass18_6.method464(arg0 + 1);
			local187 = this.aClass187_1.method5138(0, (float) local182 / 65536.0F);
			local195 = this.aClass187_1.method5138(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static322.anIntArray539[local200 + local187] * (long) Static291.anInt6085 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static322.anIntArray539[local200 + local187 - local519 - 1] * (long) Static291.anIntArrayArray40[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static322.anIntArray539[local200 - local549 - 1] * (long) Static291.anIntArrayArray40[1][local549] >> 16);
					}
					Static322.anIntArray539[local200] = local352;
					local182 = this.aClass18_6.method464(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static322.anIntArray539[local200 + local187] * (long) Static291.anInt6085 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static322.anIntArray539[local200 + local187 - local519 - 1] * (long) Static291.anIntArrayArray40[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static322.anIntArray539[local200 - local549 - 1] * (long) Static291.anIntArrayArray40[1][local549] >> 16);
						}
						Static322.anIntArray539[local200] = local352;
						local182 = this.aClass18_6.method464(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static322.anIntArray539[local200 + local187 - local519 - 1] * (long) Static291.anIntArrayArray40[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static322.anIntArray539[local200 - local549 - 1] * (long) Static291.anIntArrayArray40[1][local549] >> 16);
							}
							Static322.anIntArray539[local200] = local352;
							this.aClass18_6.method464(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass187_1.method5138(0, (float) local182 / 65536.0F);
					local195 = this.aClass187_1.method5138(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static322.anIntArray539[local182] < -32768) {
				Static322.anIntArray539[local182] = -32768;
			}
			if (Static322.anIntArray539[local182] > 32767) {
				Static322.anIntArray539[local182] = 32767;
			}
		}
		return Static322.anIntArray539;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)I")
	private int method5637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray542[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray541[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
