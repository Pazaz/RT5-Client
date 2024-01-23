import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public abstract class Class57 {

	@OriginalMember(owner = "client!q", name = "n", descriptor = "[I")
	public static final int[] fadeCurves = new int[4096];

	static {
		for (@Pc(11) int local11 = 0; local11 < 4096; local11++) {
			fadeCurves[local11] = fade(local11);
		}
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "[S")
	private short[] powerOfTwo;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	private int yFactor = 4;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "I")
	private int zFactor = 4;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	private int seed = 0;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "I")
	private int xFactor = 4;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "[S")
	private final short[] pImp = new short[512];

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	protected int factorsOfTwo = 4;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIII)V")
	protected Class57(@OriginalArg(0) int seed, @OriginalArg(1) int factorsOfTwo, @OriginalArg(2) int xFactor, @OriginalArg(3) int yFactor, @OriginalArg(4) int zFactor) {
		this.xFactor = xFactor;
		this.yFactor = yFactor;
		this.seed = seed;
		this.factorsOfTwo = factorsOfTwo;
		this.zFactor = zFactor;
		this.initPerlin1();
		this.initPerlin2();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIII)I")
	private static int grad(@OriginalArg(0) int z, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int hash) {
		@Pc(7) int h = hash & 0xF;
		@Pc(16) int u = h < 8 ? x : y;
		@Pc(40) int v = h < 4 ? y : (h == 12 || h == 14 ? x : z);
		return ((h & 0x2) == 0 ? v : -v) + ((h & 0x1) == 0 ? u : -u);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)I")
	private static int fade(@OriginalArg(0) int t) {
		@Pc(13) int depth = t * (t * t >> 12) >> 12;
		@Pc(19) int x = t * 6 - 61440;
		@Pc(32) int y = (t * x >> 12) + 40960;
		return y * depth >> 12;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	protected abstract void apply(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	private void initPerlin1() {
		this.powerOfTwo = new short[this.factorsOfTwo];
		for (@Pc(12) int local12 = 0; local12 < this.factorsOfTwo; local12++) {
			this.powerOfTwo[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIBI)V")
	protected final void noise() {
		@Pc(12) int[] widths = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			widths[local17] = (local17 << 12) / 128;
		}
		@Pc(38) int[] local38 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local15[local40] = (local40 << 12) / 128;
		}
		for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
			local38[local60] = (local60 << 12) / 16;
		}
		this.setup();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int x = 0; x < 128; x++) {
					for (@Pc(91) int index = 0; index < this.factorsOfTwo; index++) {
						@Pc(100) int factorOfTwo = this.powerOfTwo[index] << 12;
						@Pc(107) int maxZ = factorOfTwo * this.zFactor >> 12;
						@Pc(114) int maxY = factorOfTwo * this.yFactor >> 12;
						@Pc(121) int maxX = this.xFactor * factorOfTwo >> 12;
						@Pc(129) int local129 = widths[x] * factorOfTwo >> 12;
						@Pc(137) int local137 = factorOfTwo * local15[local83] >> 12;
						@Pc(145) int local145 = local38[local79] * factorOfTwo >> 12;
						@Pc(150) int local150 = local137 * this.yFactor;
						@Pc(155) int local155 = local145 * this.zFactor;
						@Pc(160) int xo = local129 * this.xFactor;
						@Pc(164) int x0 = xo >> 12;
						@Pc(168) int x1 = x0 + 1;
						@Pc(172) int x0u = x0 & 0xFF;
						@Pc(176) int y0 = local150 >> 12;
						@Pc(180) int y1 = y0 + 1;
						@Pc(184) int y0u = y0 & 0xFF;
						@Pc(188) int z0 = local155 >> 12;
						@Pc(192) int z1 = z0 + 1;
						if (x1 >= maxX) {
							x1 = 0;
						} else {
							x1 &= 0xFF;
						}
						if (maxY > y1) {
							y1 &= 0xFF;
						} else {
							y1 = 0;
						}
						z0 &= 0xFF;
						if (z1 >= maxZ) {
							z1 = 0;
						} else {
							z1 &= 0xFF;
						}
						local145 = local155 & 0xFFF;
						local137 = local150 & 0xFFF;
						local129 = xo & 0xFFF;
						@Pc(249) int local249 = local137 - 4096;
						@Pc(253) int local253 = local145 - 4096;
						@Pc(258) short local258 = this.pImp[z0];
						@Pc(262) int w = fadeCurves[local145];
						@Pc(266) int local266 = fadeCurves[local137];
						@Pc(271) short local271 = this.pImp[z1];
						@Pc(275) int local275 = fadeCurves[local129];
						@Pc(279) int local279 = local129 - 4096;
						@Pc(287) short local287 = this.pImp[y1 + local258];
						@Pc(294) short local294 = this.pImp[local271 + y1];
						@Pc(302) short local302 = this.pImp[y0u + local271];
						@Pc(309) short local309 = this.pImp[y0u + local258];
						@Pc(321) int local321 = grad(local145, local129, local137, this.pImp[local309 + x0u]);
						@Pc(333) int local333 = grad(local145, local279, local137, this.pImp[x1 + local309]);
						@Pc(344) int local344 = local321 + (local275 * (local333 - local321) >> 12);
						@Pc(356) int local356 = grad(local145, local129, local249, this.pImp[x0u + local287]);
						@Pc(368) int local368 = grad(local145, local279, local249, this.pImp[local287 + x1]);
						@Pc(379) int local379 = ((local368 - local356) * local275 >> 12) + local356;
						@Pc(390) int local390 = (local266 * (local379 - local344) >> 12) + local344;
						@Pc(402) int local402 = grad(local253, local129, local137, this.pImp[x0u + local302]);
						@Pc(415) int local415 = grad(local253, local279, local137, this.pImp[x1 + local302]);
						@Pc(426) int local426 = (local275 * (local415 - local402) >> 12) + local402;
						@Pc(438) int local438 = grad(local253, local129, local249, this.pImp[local294 + x0u]);
						@Pc(450) int local450 = grad(local253, local279, local249, this.pImp[local294 + x1]);
						@Pc(461) int local461 = (local275 * (local450 - local438) >> 12) + local438;
						@Pc(473) int local473 = local426 + (local266 * (local461 - local426) >> 12);
						this.apply(index, local390 + (w * (local473 - local390) >> 12));
					}
					this.add();
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
	private void initPerlin2() {
		@Pc(12) Random local12 = new Random((long) this.seed);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.pImp[local14] = (short) local14;
		}
		for (@Pc(39) int local39 = 0; local39 < 255; local39++) {
			@Pc(46) int local46 = 255 - local39;
			@Pc(51) int local51 = Static382.method6361(local46, local12);
			@Pc(56) short local56 = this.pImp[local51];
			this.pImp[local51] = this.pImp[local46];
			this.pImp[local46] = this.pImp[local46 + 256] = local56;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	protected abstract void setup();

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	protected abstract void add();
}
