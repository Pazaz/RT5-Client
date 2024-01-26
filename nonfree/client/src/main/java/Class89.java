import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class89 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "[Lclient!ng;")
	private final Class258[] aClass258Array1 = new Class258[10];

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
	private int anInt2381;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	private int anInt2382;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class89(@OriginalArg(0) Class2_Sub21 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method7396();
			if (local12 != 0) {
				arg0.anInt8388--;
				this.aClass258Array1[local7] = new Class258();
				this.aClass258Array1[local7].method5775(arg0);
			}
		}
		this.anInt2381 = arg0.method7382();
		this.anInt2382 = arg0.method7382();
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	private Class89() {
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "()[B")
	private byte[] method2246() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass258Array1[local3] != null && this.aClass258Array1[local3].anInt6454 + this.aClass258Array1[local3].anInt6455 > local1) {
				local1 = this.aClass258Array1[local3].anInt6454 + this.aClass258Array1[local3].anInt6455;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass258Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass258Array1[local54].anInt6454 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass258Array1[local54].anInt6455 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass258Array1[local54].method5776(local70, this.aClass258Array1[local54].anInt6454);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "()Lclient!sq;")
	public Class2_Sub49_Sub1 method2247() {
		@Pc(2) byte[] local2 = this.method2246();
		return new Class2_Sub49_Sub1(22050, local2, this.anInt2381 * 22050 / 1000, this.anInt2382 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "()I")
	public int method2248() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass258Array1[local3] != null && this.aClass258Array1[local3].anInt6455 / 20 < local1) {
				local1 = this.aClass258Array1[local3].anInt6455 / 20;
			}
		}
		if (this.anInt2381 < this.anInt2382 && this.anInt2381 / 20 < local1) {
			local1 = this.anInt2381 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass258Array1[local55] != null) {
				this.aClass258Array1[local55].anInt6455 -= local1 * 20;
			}
		}
		if (this.anInt2381 < this.anInt2382) {
			this.anInt2381 -= local1 * 20;
			this.anInt2382 -= local1 * 20;
		}
		return local1;
	}
}
