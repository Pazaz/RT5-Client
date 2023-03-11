import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class148 {

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "[B")
	public static final byte[] aByteArray39;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public int anInt3756;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!fl;")
	public Class72 aClass72_4;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public int anInt3764 = 127;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Z")
	public boolean aBoolean246 = true;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int anInt3766 = 16;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
	public boolean aBoolean244 = true;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public int anInt3759 = -1;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public int anInt3763 = 128;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public int anInt3771 = 1190717;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int anInt3769 = 0;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
	public int anInt3772 = 8;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public int anInt3757 = -1;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public int anInt3762 = -1;

	static {
		@Pc(20) int local20 = 0;
		aByteArray39 = new byte[32896];
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			for (@Pc(28) int local28 = 0; local28 <= local25; local28++) {
				aByteArray39[local20++] = (byte) (255.0D / Math.sqrt((double) ((float) (local25 * local25 + local28 * local28 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!bt;Z)V")
	private void method3715(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 1) {
			this.anInt3769 = Static97.method2101(arg1.ig3());
		} else if (arg0 == 2) {
			this.anInt3762 = arg1.g1();
		} else if (arg0 == 3) {
			this.anInt3762 = arg1.g2();
			if (this.anInt3762 == 65535) {
				this.anInt3762 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean244 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt3757 = Static97.method2101(arg1.ig3());
		} else if (arg0 == 8) {
			this.aClass72_4.anInt2060 = this.anInt3756;
			return;
		} else if (arg0 == 9) {
			this.anInt3763 = arg1.g2();
			return;
		} else if (arg0 == 10) {
			this.aBoolean246 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt3772 = arg1.g1();
			return;
		} else if (arg0 == 12) {
			this.aBoolean245 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt3771 = arg1.ig3();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt3766 = arg1.g1();
			} else if (arg0 == 15) {
				this.anInt3759 = arg1.g2();
				if (this.anInt3759 == 65535) {
					this.anInt3759 = -1;
					return;
				}
			} else if (arg0 == 16) {
				this.anInt3764 = arg1.g1();
				return;
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method3716() {
		if (this.anInt3759 == -1) {
			this.anInt3759 = this.anInt3762;
		}
		this.anInt3772 = this.anInt3756 | this.anInt3772 << 8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!bt;)V")
	public void method3718(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method3715(local5, arg0);
		}
	}
}
