import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public abstract class Class82 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt3124 = 4;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	private int anInt3128 = 4;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[S")
	private final short[] aShortArray53 = new short[512];

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	protected int anInt3130 = 4;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt3123 = 4;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	private int anInt3136 = 0;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIII)V")
	protected Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3123 = arg4;
		this.anInt3128 = arg3;
		this.anInt3130 = arg1;
		this.anInt3124 = arg2;
		this.anInt3136 = arg0;
		this.method2658();
		this.method2660();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	protected abstract void method2657();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	private void method2658() {
		this.aShortArray54 = new short[this.anInt3130];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3130; local12++) {
			this.aShortArray54[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	private void method2660() {
		@Pc(12) Random local12 = new Random((long) this.anInt3136);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray53[local14] = (short) local14;
		}
		for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
			@Pc(40) int local40 = 255 - local33;
			@Pc(45) int local45 = Static228.method4354(local12, local40);
			@Pc(50) short local50 = this.aShortArray53[local45];
			this.aShortArray53[local45] = this.aShortArray53[local40];
			this.aShortArray53[local40] = this.aShortArray53[local40 + 256] = local50;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZII)V")
	protected final void method2663() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local14[local52] = (local52 << 12) / 16;
		}
		this.method2657();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt3130; local87++) {
						@Pc(96) int local96 = this.aShortArray54[local87] << 12;
						@Pc(104) int local104 = local14[local75] * local96 >> 12;
						@Pc(111) int local111 = local96 * this.anInt3123 >> 12;
						@Pc(118) int local118 = local96 * this.anInt3124 >> 12;
						@Pc(125) int local125 = this.anInt3128 * local96 >> 12;
						@Pc(133) int local133 = local8[local83] * local96 >> 12;
						@Pc(141) int local141 = local11[local79] * local96 >> 12;
						@Pc(146) int local146 = local141 * this.anInt3128;
						@Pc(151) int local151 = local104 * this.anInt3123;
						@Pc(156) int local156 = local133 * this.anInt3124;
						@Pc(160) int local160 = local156 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local146 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local168 & 0xFF;
						@Pc(184) int local184 = local151 >> 12;
						@Pc(188) int local188 = local184 + 1;
						@Pc(192) int local192 = local146 & 0xFFF;
						if (local176 < local125) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						local184 &= 0xFF;
						if (local188 < local111) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						if (local164 < local118) {
							local164 &= 0xFF;
						} else {
							local164 = 0;
						}
						local104 = local151 & 0xFFF;
						local133 = local156 & 0xFFF;
						@Pc(249) int local249 = local104 - 4096;
						@Pc(254) short local254 = this.aShortArray53[local188];
						@Pc(258) int local258 = Class5.anIntArray10[local133];
						@Pc(262) int local262 = Class5.anIntArray10[local104];
						@Pc(267) short local267 = this.aShortArray53[local184];
						@Pc(271) int local271 = Class5.anIntArray10[local192];
						@Pc(275) int local275 = local133 - 4096;
						@Pc(279) int local279 = local192 - 4096;
						@Pc(286) short local286 = this.aShortArray53[local180 + local267];
						@Pc(294) short local294 = this.aShortArray53[local180 + local254];
						@Pc(301) short local301 = this.aShortArray53[local267 + local176];
						@Pc(309) short local309 = this.aShortArray53[local176 + local254];
						@Pc(321) int local321 = Static88.method1946(local133, local192, this.aShortArray53[local286 + local172], local104);
						@Pc(333) int local333 = Static88.method1946(local275, local192, this.aShortArray53[local286 + local164], local104);
						@Pc(344) int local344 = (local258 * (local333 - local321) >> 12) + local321;
						@Pc(356) int local356 = Static88.method1946(local133, local279, this.aShortArray53[local301 + local172], local104);
						@Pc(368) int local368 = Static88.method1946(local275, local279, this.aShortArray53[local164 + local301], local104);
						@Pc(380) int local380 = local356 + (local258 * (local368 - local356) >> 12);
						@Pc(391) int local391 = ((local380 - local344) * local271 >> 12) + local344;
						@Pc(403) int local403 = Static88.method1946(local133, local192, this.aShortArray53[local294 + local172], local249);
						@Pc(415) int local415 = Static88.method1946(local275, local192, this.aShortArray53[local294 + local164], local249);
						@Pc(426) int local426 = (local258 * (local415 - local403) >> 12) + local403;
						@Pc(438) int local438 = Static88.method1946(local133, local279, this.aShortArray53[local309 + local172], local249);
						@Pc(450) int local450 = Static88.method1946(local275, local279, this.aShortArray53[local309 + local164], local249);
						@Pc(461) int local461 = local438 + (local258 * (local450 - local438) >> 12);
						@Pc(473) int local473 = local426 + (local271 * (local461 - local426) >> 12);
						this.method2664(local391 + ((local473 - local391) * local262 >> 12), local87);
					}
					this.method2665();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	protected abstract void method2664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
	protected abstract void method2665();
}
