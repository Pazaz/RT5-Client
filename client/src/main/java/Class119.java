import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class119 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public int anInt4095;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public int anInt4097;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	public int anInt4098;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public int anInt4100;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public int anInt4096 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Z")
	public boolean aBoolean290 = true;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	private int anInt4104 = 0;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public int anInt4102 = 128;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILclient!il;)V")
	private void method3501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt4104 = arg2.method5755();
			this.method3504(this.anInt4104);
		} else if (arg1 == 2) {
			this.anInt4096 = arg2.method5749();
			if (this.anInt4096 == 65535) {
				this.anInt4096 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt4102 = arg2.method5749();
		} else if (arg1 == 4) {
			this.aBoolean290 = false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!il;IZ)V")
	public void method3503(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method3501(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	private void method3504(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local76 < 0.5D) {
				local70 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local68 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local68 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local68 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local70 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		this.anInt4097 = (int) (local70 * 256.0D);
		this.anInt4098 = (int) (local76 * 256.0D);
		local68 /= 6.0D;
		if (local76 > 0.5D) {
			this.anInt4100 = (int) (local70 * 512.0D * (1.0D - local76));
		} else {
			this.anInt4100 = (int) (local70 * local76 * 512.0D);
		}
		if (this.anInt4098 < 0) {
			this.anInt4098 = 0;
		} else if (this.anInt4098 > 255) {
			this.anInt4098 = 255;
		}
		if (this.anInt4097 < 0) {
			this.anInt4097 = 0;
		} else if (this.anInt4097 > 255) {
			this.anInt4097 = 255;
		}
		if (this.anInt4100 < 1) {
			this.anInt4100 = 1;
		}
		this.anInt4095 = (int) ((double) this.anInt4100 * local68);
	}
}
