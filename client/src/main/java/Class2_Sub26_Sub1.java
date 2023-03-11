import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class2_Sub26_Sub1 extends Class2_Sub26 {

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
	private int anInt4375;

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "Z")
	public final boolean aBoolean300;

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
	public final int anInt4376;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
	private int anInt4377;

	@OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
	public int anInt4380;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "Z")
	public final boolean aBoolean301;

	@OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
	private int anInt4382;

	@OriginalMember(owner = "client!nn", name = "Q", descriptor = "[S")
	public final short[] aShortArray92;

	@OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
	private final int anInt4385;

	@OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
	private int anInt4386;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class2_Sub26_Sub1(@OriginalArg(0) Buffer arg0) {
		if (Static202.anIntArray220 == null) {
			Static241.method4194();
		}
		this.anInt4380 = arg0.g1();
		this.aBoolean301 = (this.anInt4380 & 0x8) != 0;
		this.aBoolean300 = (this.anInt4380 & 0x10) != 0;
		this.anInt4380 &= 0x7;
		super.anInt4370 = arg0.method4829();
		super.anInt4371 = arg0.method4829();
		super.anInt4368 = arg0.method4829();
		super.anInt4374 = arg0.g1();
		@Pc(65) int local65 = super.anInt4374 * 2 + 1;
		this.aShortArray92 = new short[local65];
		for (@Pc(71) int local71 = 0; local71 < this.aShortArray92.length; local71++) {
			@Pc(78) short local78 = (short) arg0.method4829();
			@Pc(82) int local82 = local78 >>> 8;
			if (local65 <= local82) {
				local82 = local65 - 1;
			}
			@Pc(97) int local97 = local78 & 0xFF;
			if (local97 > local65 - local82) {
				local97 = local65 - local82;
			}
			this.aShortArray92[local71] = (short) (local97 | local82 << 8);
		}
		super.anInt4374 = (super.anInt4374 << Static322.anInt6029) + Static253.anInt4693;
		if (Static59.anIntArray107 == null) {
			super.anInt4372 = Static181.anIntArray204[Static26.method863(arg0.method4829()) & 0xFFFF];
		} else {
			super.anInt4372 = Static59.anIntArray107[arg0.method4829()];
		}
		@Pc(158) int local158 = arg0.g1();
		this.anInt4385 = (local158 & 0xE0) << 3;
		this.anInt4376 = local158 & 0x1F;
		if (this.anInt4376 != 31) {
			this.method4155();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZZ)V")
	public void method4153(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = arg0 * this.anInt4375 / 50 + this.anInt4385 & 0x7FF;
			@Pc(26) int local26 = this.anInt4377;
			if (local26 == 1) {
				local9 = (Class19.anIntArray178[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static202.anIntArray220[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 >= 1024 ? 2048 - local23 : local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		super.aFloat65 = (float) ((local9 * this.anInt4382 >> 11) + this.anInt4386) / 2048.0F;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIII)V")
	public void method4154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4382 = arg1;
		this.anInt4377 = arg2;
		this.anInt4386 = arg0;
		this.anInt4375 = arg3;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
	private void method4155() {
		@Pc(4) int local4 = this.anInt4376;
		if (local4 == 2) {
			this.anInt4377 = 1;
			this.anInt4386 = 0;
			this.anInt4375 = 2048;
			this.anInt4382 = 2048;
		} else if (local4 == 3) {
			this.anInt4377 = 1;
			this.anInt4375 = 4096;
			this.anInt4386 = 0;
			this.anInt4382 = 2048;
		} else if (local4 == 4) {
			this.anInt4382 = 2048;
			this.anInt4386 = 0;
			this.anInt4377 = 4;
			this.anInt4375 = 2048;
		} else if (local4 == 5) {
			this.anInt4382 = 2048;
			this.anInt4377 = 4;
			this.anInt4375 = 8192;
			this.anInt4386 = 0;
		} else if (local4 == 12) {
			this.anInt4375 = 2048;
			this.anInt4377 = 2;
			this.anInt4382 = 2048;
			this.anInt4386 = 0;
		} else if (local4 == 13) {
			this.anInt4377 = 2;
			this.anInt4386 = 0;
			this.anInt4375 = 8192;
			this.anInt4382 = 2048;
		} else if (local4 == 10) {
			this.anInt4382 = 512;
			this.anInt4377 = 3;
			this.anInt4386 = 1536;
			this.anInt4375 = 2048;
		} else if (local4 == 11) {
			this.anInt4382 = 512;
			this.anInt4375 = 4096;
			this.anInt4377 = 3;
			this.anInt4386 = 1536;
		} else if (local4 == 6) {
			this.anInt4377 = 3;
			this.anInt4375 = 2048;
			this.anInt4386 = 1280;
			this.anInt4382 = 768;
		} else if (local4 == 7) {
			this.anInt4375 = 4096;
			this.anInt4382 = 768;
			this.anInt4386 = 1280;
			this.anInt4377 = 3;
		} else if (local4 == 8) {
			this.anInt4377 = 3;
			this.anInt4375 = 2048;
			this.anInt4382 = 1024;
			this.anInt4386 = 1024;
		} else if (local4 == 9) {
			this.anInt4382 = 1024;
			this.anInt4386 = 1024;
			this.anInt4377 = 3;
			this.anInt4375 = 4096;
		} else if (local4 == 14) {
			this.anInt4382 = 768;
			this.anInt4375 = 2048;
			this.anInt4377 = 1;
			this.anInt4386 = 1280;
		} else if (local4 == 15) {
			this.anInt4386 = 1536;
			this.anInt4377 = 1;
			this.anInt4382 = 512;
			this.anInt4375 = 4096;
		} else if (local4 == 16) {
			this.anInt4386 = 1792;
			this.anInt4377 = 1;
			this.anInt4382 = 256;
			this.anInt4375 = 8192;
		} else {
			this.anInt4377 = 0;
			this.anInt4375 = 2048;
			this.anInt4382 = 2048;
			this.anInt4386 = 0;
		}
	}
}
