import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!or", name = "ab", descriptor = "I")
	private int anInt7099 = 2048;

	@OriginalMember(owner = "client!or", name = "G", descriptor = "I")
	private int anInt7104 = 2;

	@OriginalMember(owner = "client!or", name = "T", descriptor = "I")
	private int anInt7105 = 5;

	@OriginalMember(owner = "client!or", name = "I", descriptor = "[S")
	private short[] aShortArray104 = new short[512];

	@OriginalMember(owner = "client!or", name = "M", descriptor = "I")
	private int anInt7103 = 1;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "[B")
	private byte[] aByteArray84 = new byte[512];

	@OriginalMember(owner = "client!or", name = "V", descriptor = "I")
	private int anInt7110 = 5;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "I")
	private int anInt7106 = 0;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)V")
	private void method6382() {
		@Pc(12) Random local12 = new Random((long) this.anInt7106);
		this.aShortArray104 = new short[512];
		if (this.anInt7099 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray104[local31] = (short) Static623.method8326(-5208, this.anInt7099, local12);
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			return;
		}
		if (arg2 == 0) {
			this.anInt7105 = this.anInt7110 = arg1.g1();
		} else if (arg2 == 1) {
			this.anInt7106 = arg1.g1();
		} else if (arg2 == 2) {
			this.anInt7099 = arg1.g2();
		} else if (arg2 == 3) {
			this.anInt7104 = arg1.g1();
		} else if (arg2 == 4) {
			this.anInt7103 = arg1.g1();
		} else if (arg2 == 5) {
			this.anInt7105 = arg1.g1();
		} else if (arg2 == 6) {
			this.anInt7110 = arg1.g1();
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	@Override
	public void method9421(@OriginalArg(0) int arg0) {
		this.aByteArray84 = Static694.method9027(this.anInt7106);
		if (arg0 != 7) {
			this.anInt7110 = 6;
		}
		this.method6382();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (arg0 <= 107) {
			Static470.method6383((Class158) null, -42, 121, -79);
		}
		if (super.aClass180_41.aBoolean338) {
			@Pc(34) int local34 = Static273.anIntArray341[arg1] * this.anInt7110 + 2048;
			@Pc(38) int local38 = local34 >> 12;
			@Pc(42) int local42 = local38 + 1;
			for (@Pc(44) int local44 = 0; local44 < Static608.anInt9289; local44++) {
				Static162.anInt2798 = Integer.MAX_VALUE;
				Static109.anInt2178 = Integer.MAX_VALUE;
				Static417.anInt6402 = Integer.MAX_VALUE;
				Static143.anInt4056 = Integer.MAX_VALUE;
				@Pc(63) int local63 = this.anInt7105 * Static54.anIntArray92[local44] + 2048;
				@Pc(67) int local67 = local63 >> 12;
				@Pc(71) int local71 = local67 + 1;
				@Pc(163) int local163;
				for (@Pc(75) int local75 = local38 - 1; local75 <= local42; local75++) {
					@Pc(99) int local99 = this.aByteArray84[(this.anInt7110 > local75 ? local75 : local75 - this.anInt7110) & 0xFF] & 0xFF;
					for (@Pc(103) int local103 = local67 - 1; local103 <= local71; local103++) {
						@Pc(135) int local135 = (this.aByteArray84[local99 + (local103 >= this.anInt7105 ? local103 - this.anInt7105 : local103) & 0xFF] & 0xFF) * 2;
						@Pc(139) int local139 = -(local103 << 12);
						@Pc(143) int local143 = local135 + 1;
						@Pc(148) int local148 = local139 + local63 - this.aShortArray104[local135];
						@Pc(160) int local160 = local34 - (local75 << 12) - this.aShortArray104[local143];
						local163 = this.anInt7103;
						@Pc(206) int local206;
						if (local163 == 1) {
							local206 = local148 * local148 + local160 * local160 >> 12;
						} else if (local163 == 3) {
							local148 = local148 >= 0 ? local148 : -local148;
							local160 = local160 >= 0 ? local160 : -local160;
							local206 = local148 <= local160 ? local160 : local148;
						} else if (local163 == 4) {
							local148 = (int) (Math.sqrt((double) ((float) (local148 < 0 ? -local148 : local148) / 4096.0F)) * 4096.0D);
							local160 = (int) (Math.sqrt((double) ((float) (local160 < 0 ? -local160 : local160) / 4096.0F)) * 4096.0D);
							local206 = local160 + local148;
							local206 = local206 * local206 >> 12;
						} else if (local163 == 5) {
							local160 *= local160;
							local148 *= local148;
							local206 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local160 + local148) / 1.6777216E7F))) * 4096.0D);
						} else if (local163 == 2) {
							local206 = (local148 >= 0 ? local148 : -local148) + (local160 < 0 ? -local160 : local160);
						} else {
							local206 = (int) (Math.sqrt((double) ((float) (local160 * local160 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
						}
						if (local206 < Static143.anInt4056) {
							Static162.anInt2798 = Static109.anInt2178;
							Static109.anInt2178 = Static417.anInt6402;
							Static417.anInt6402 = Static143.anInt4056;
							Static143.anInt4056 = local206;
						} else if (local206 < Static417.anInt6402) {
							Static162.anInt2798 = Static109.anInt2178;
							Static109.anInt2178 = Static417.anInt6402;
							Static417.anInt6402 = local206;
						} else if (local206 < Static109.anInt2178) {
							Static162.anInt2798 = Static109.anInt2178;
							Static109.anInt2178 = local206;
						} else if (local206 < Static162.anInt2798) {
							Static162.anInt2798 = local206;
						}
					}
				}
				local163 = this.anInt7104;
				if (local163 == 0) {
					local11[local44] = Static143.anInt4056;
				} else if (local163 == 1) {
					local11[local44] = Static417.anInt6402;
				} else if (local163 == 3) {
					local11[local44] = Static109.anInt2178;
				} else if (local163 == 4) {
					local11[local44] = Static162.anInt2798;
				} else if (local163 == 2) {
					local11[local44] = Static417.anInt6402 - Static143.anInt4056;
				}
			}
		}
		return local11;
	}
}
