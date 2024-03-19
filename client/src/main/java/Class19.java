import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class19 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "[Lclient!uo;")
	private final Class206[] aClass206Array1 = new Class206[10];

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class19(@OriginalArg(0) Class1_Sub16 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5761();
			if (local12 != 0) {
				arg0.anInt6813--;
				this.aClass206Array1[local7] = new Class206();
				this.aClass206Array1[local7].method5635(arg0);
			}
		}
		this.anInt662 = arg0.method5749();
		this.anInt663 = arg0.method5749();
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "()[B")
	private byte[] method465() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass206Array1[local3] != null && this.aClass206Array1[local3].anInt6621 + this.aClass206Array1[local3].anInt6620 > local1) {
				local1 = this.aClass206Array1[local3].anInt6621 + this.aClass206Array1[local3].anInt6620;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass206Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass206Array1[local54].anInt6621 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass206Array1[local54].anInt6620 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass206Array1[local54].method5636(local70, this.aClass206Array1[local54].anInt6621);
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

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()I")
	public int method466() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass206Array1[local3] != null && this.aClass206Array1[local3].anInt6620 / 20 < local1) {
				local1 = this.aClass206Array1[local3].anInt6620 / 20;
			}
		}
		if (this.anInt662 < this.anInt663 && this.anInt662 / 20 < local1) {
			local1 = this.anInt662 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass206Array1[local55] != null) {
				this.aClass206Array1[local55].anInt6620 -= local1 * 20;
			}
		}
		if (this.anInt662 < this.anInt663) {
			this.anInt662 -= local1 * 20;
			this.anInt663 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()Lclient!ok;")
	public Class1_Sub13_Sub1 method467() {
		@Pc(2) byte[] local2 = this.method465();
		return new Class1_Sub13_Sub1(22050, local2, this.anInt662 * 22050 / 1000, this.anInt663 * 22050 / 1000);
	}
}
