import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class TextureOp15 extends TextureOp {

	@OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
	private int anInt3261 = 0;

	@OriginalMember(owner = "client!jt", name = "R", descriptor = "[S")
	private short[] aShortArray55 = new short[512];

	@OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
	private int anInt3257 = 2048;

	@OriginalMember(owner = "client!jt", name = "W", descriptor = "[B")
	private byte[] aByteArray34 = new byte[512];

	@OriginalMember(owner = "client!jt", name = "Y", descriptor = "I")
	private int anInt3263 = 5;

	@OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
	private int anInt3256 = 1;

	@OriginalMember(owner = "client!jt", name = "ab", descriptor = "I")
	private int anInt3265 = 5;

	@OriginalMember(owner = "client!jt", name = "Z", descriptor = "I")
	private int anInt3264 = 2;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public TextureOp15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!bt;I)V")
	@Override
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 0) {
			this.anInt3263 = this.anInt3265 = arg1.g1();
		} else if (arg0 == 1) {
			this.anInt3261 = arg1.g1();
		} else if (arg0 == 2) {
			this.anInt3257 = arg1.g2();
		} else if (arg0 == 3) {
			this.anInt3264 = arg1.g1();
		} else if (arg0 == 4) {
			this.anInt3256 = arg1.g1();
		} else if (arg0 == 5) {
			this.anInt3263 = arg1.g1();
		} else if (arg0 == 6) {
			this.anInt3265 = arg1.g1();
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
	private void method3259() {
		@Pc(12) Random local12 = new Random((long) this.anInt3261);
		this.aShortArray55 = new short[512];
		if (this.anInt3257 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray55[local24] = (short) Static382.method6361(this.anInt3257, local12);
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(arg0);
		if (super.monochromeImageCache.invalid) {
			@Pc(30) int local30 = this.anInt3265 * Texture.heightFractions[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Texture.width; local40++) {
				Static41.anInt1052 = Integer.MAX_VALUE;
				Static367.anInt6879 = Integer.MAX_VALUE;
				Static378.anInt7079 = Integer.MAX_VALUE;
				Static65.anInt1584 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Texture.widthFractions[local40] * this.anInt3263 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(156) int local156;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray34[(this.anInt3265 > local71 ? local71 : local71 - this.anInt3265) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(129) int local129 = (this.aByteArray34[local96 + (this.anInt3263 <= local100 ? local100 - this.anInt3263 : local100) & 0xFF] & 0xFF) * 2;
						@Pc(134) int local134 = local129 + 1;
						@Pc(142) int local142 = local59 - this.aShortArray55[local129] - (local100 << 12);
						@Pc(153) int local153 = local30 - (local71 << 12) - this.aShortArray55[local134];
						local156 = this.anInt3256;
						@Pc(183) int local183;
						if (local156 == 1) {
							local183 = local142 * local142 + local153 * local153 >> 12;
						} else if (local156 == 3) {
							local153 = local153 < 0 ? -local153 : local153;
							local142 = local142 < 0 ? -local142 : local142;
							local183 = local142 > local153 ? local142 : local153;
						} else if (local156 == 4) {
							local142 = (int) (Math.sqrt((double) ((float) (local142 >= 0 ? local142 : -local142) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 >= 0 ? local153 : -local153) / 4096.0F)) * 4096.0D);
							local183 = local153 + local142;
							local183 = local183 * local183 >> 12;
						} else if (local156 == 5) {
							local153 *= local153;
							local142 *= local142;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local142 + local153) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local183 = (local153 < 0 ? -local153 : local153) + (local142 < 0 ? -local142 : local142);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local142 * local142) / 1.6777216E7F)) * 4096.0D);
						}
						if (local183 < Static65.anInt1584) {
							Static41.anInt1052 = Static367.anInt6879;
							Static367.anInt6879 = Static378.anInt7079;
							Static378.anInt7079 = Static65.anInt1584;
							Static65.anInt1584 = local183;
						} else if (Static378.anInt7079 > local183) {
							Static41.anInt1052 = Static367.anInt6879;
							Static367.anInt6879 = Static378.anInt7079;
							Static378.anInt7079 = local183;
						} else if (local183 < Static367.anInt6879) {
							Static41.anInt1052 = Static367.anInt6879;
							Static367.anInt6879 = local183;
						} else if (Static41.anInt1052 > local183) {
							Static41.anInt1052 = local183;
						}
					}
				}
				local156 = this.anInt3264;
				if (local156 == 0) {
					local11[local40] = Static65.anInt1584;
				} else if (local156 == 1) {
					local11[local40] = Static378.anInt7079;
				} else if (local156 == 3) {
					local11[local40] = Static367.anInt6879;
				} else if (local156 == 4) {
					local11[local40] = Static41.anInt1052;
				} else if (local156 == 2) {
					local11[local40] = Static378.anInt7079 - Static65.anInt1584;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
	@Override
	public void postDecode() {
		this.aByteArray34 = Static116.method2364(this.anInt3261);
		this.method3259();
	}
}
