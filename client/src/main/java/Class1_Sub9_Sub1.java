import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "Z")
	public boolean aBoolean322;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
	private int anInt4586;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	private int anInt4593;

	@OriginalMember(owner = "client!nd", name = "Q", descriptor = "Z")
	public boolean aBoolean323;

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
	private int anInt4594;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	public int anInt4598;

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
	private int anInt4600;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	private Class1_Sub9_Sub1() {
		if (Static334.anIntArray563 == null) {
			Static54.method1387();
		}
		this.method3964();
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) Class1_Sub16 arg0) {
		if (Static334.anIntArray563 == null) {
			Static54.method1387();
		}
		this.anInt4587 = arg0.method5761();
		this.aBoolean323 = (this.anInt4587 & 0x10) != 0;
		this.aBoolean322 = (this.anInt4587 & 0x8) != 0;
		this.anInt4587 &= 0x7;
		super.anInt4580 = arg0.method5749();
		super.anInt4576 = arg0.method5749();
		super.anInt4572 = arg0.method5749();
		super.anInt4577 = arg0.method5761();
		@Pc(68) int local68 = super.anInt4577 * 2 + 1;
		this.aShortArray88 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray88.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method5749();
			@Pc(85) int local85 = local81 >>> 8;
			if (local68 <= local85) {
				local85 = local68 - 1;
			}
			@Pc(100) int local100 = local81 & 0xFF;
			if (local100 > local68 - local85) {
				local100 = local68 - local85;
			}
			this.aShortArray88[local74] = (short) (local85 << 8 | local100);
		}
		super.anInt4577 = (super.anInt4577 << 7) + 64;
		if (Static336.anIntArray571 == null) {
			super.anInt4574 = Static139.anIntArray247[Static192.method3828(arg0.method5749()) & 0xFFFF];
		} else {
			super.anInt4574 = Static336.anIntArray571[arg0.method5749()];
		}
		@Pc(161) int local161 = arg0.method5761();
		this.anInt4598 = local161 & 0x1F;
		this.anInt4593 = (local161 & 0xE0) << 3;
		if (this.anInt4598 != 31) {
			this.method3964();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V")
	public void method3959(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(60) int local60;
		if (arg0) {
			local60 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt4593 + this.anInt4600 * arg1 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt4594;
			if (local27 == 1) {
				local60 = (Class39.anIntArray88[local24 << 3] >> 5) + 1024;
			} else if (local27 == 3) {
				local60 = Static334.anIntArray563[local24] >> 1;
			} else if (local27 == 4) {
				local60 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local60 = local24;
			} else if (local27 == 5) {
				local60 = (local24 < 1024 ? local24 : 2048 - local24) << 1;
			} else {
				local60 = 2048;
			}
		}
		super.aFloat59 = (float) (this.anInt4586 + (local60 * this.anInt4588 >> 11)) / 2048.0F;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
	public void method3960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4586 = arg1;
		this.anInt4588 = arg2;
		this.anInt4594 = arg0;
		this.anInt4600 = arg3;
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
	private void method3964() {
		@Pc(8) int local8 = this.anInt4598;
		if (local8 == 2) {
			this.anInt4588 = 2048;
			this.anInt4594 = 1;
			this.anInt4586 = 0;
			this.anInt4600 = 2048;
		} else if (local8 == 3) {
			this.anInt4594 = 1;
			this.anInt4588 = 2048;
			this.anInt4586 = 0;
			this.anInt4600 = 4096;
		} else if (local8 == 4) {
			this.anInt4600 = 2048;
			this.anInt4594 = 4;
			this.anInt4586 = 0;
			this.anInt4588 = 2048;
		} else if (local8 == 5) {
			this.anInt4588 = 2048;
			this.anInt4594 = 4;
			this.anInt4586 = 0;
			this.anInt4600 = 8192;
		} else if (local8 == 12) {
			this.anInt4600 = 2048;
			this.anInt4588 = 2048;
			this.anInt4586 = 0;
			this.anInt4594 = 2;
		} else if (local8 == 13) {
			this.anInt4588 = 2048;
			this.anInt4600 = 8192;
			this.anInt4586 = 0;
			this.anInt4594 = 2;
		} else if (local8 == 10) {
			this.anInt4588 = 512;
			this.anInt4594 = 3;
			this.anInt4586 = 1536;
			this.anInt4600 = 2048;
		} else if (local8 == 11) {
			this.anInt4600 = 4096;
			this.anInt4594 = 3;
			this.anInt4586 = 1536;
			this.anInt4588 = 512;
		} else if (local8 == 6) {
			this.anInt4588 = 768;
			this.anInt4586 = 1280;
			this.anInt4600 = 2048;
			this.anInt4594 = 3;
		} else if (local8 == 7) {
			this.anInt4594 = 3;
			this.anInt4586 = 1280;
			this.anInt4600 = 4096;
			this.anInt4588 = 768;
		} else if (local8 == 8) {
			this.anInt4594 = 3;
			this.anInt4588 = 1024;
			this.anInt4600 = 2048;
			this.anInt4586 = 1024;
		} else if (local8 == 9) {
			this.anInt4586 = 1024;
			this.anInt4588 = 1024;
			this.anInt4600 = 4096;
			this.anInt4594 = 3;
		} else if (local8 == 14) {
			this.anInt4600 = 2048;
			this.anInt4594 = 1;
			this.anInt4588 = 768;
			this.anInt4586 = 1280;
		} else if (local8 == 15) {
			this.anInt4588 = 512;
			this.anInt4586 = 1536;
			this.anInt4594 = 1;
			this.anInt4600 = 4096;
		} else if (local8 == 16) {
			this.anInt4588 = 256;
			this.anInt4594 = 1;
			this.anInt4586 = 1792;
			this.anInt4600 = 8192;
		} else {
			this.anInt4586 = 0;
			this.anInt4594 = 0;
			this.anInt4588 = 2048;
			this.anInt4600 = 2048;
		}
	}
}
