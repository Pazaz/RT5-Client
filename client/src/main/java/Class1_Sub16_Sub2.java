import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub16_Sub2 extends Class1_Sub16 {

	@OriginalMember(owner = "client!vg", name = "Hb", descriptor = "I")
	private int anInt6821;

	@OriginalMember(owner = "client!vg", name = "Ib", descriptor = "Lclient!om;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(IB)I")
	public int method5789(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6821;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III[B)V")
	public void method5791(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray86[super.anInt6813++] - this.aClass141_1.method4291());
		}
	}

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "(I)V")
	public void method5792() {
		super.anInt6813 = (this.anInt6821 + 7) / 8;
	}

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "(II)V")
	public void method5793(@OriginalArg(1) int arg0) {
		super.aByteArray86[super.anInt6813++] = (byte) (arg0 + this.aClass141_1.method4291());
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([II)V")
	public void method5794(@OriginalArg(0) int[] arg0) {
		this.aClass141_1 = new Class141(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "(I)I")
	public int method5797() {
		return super.aByteArray86[super.anInt6813++] - this.aClass141_1.method4291() & 0xFF;
	}

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "(I)V")
	public void method5798() {
		this.anInt6821 = super.anInt6813 * 8;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(IZ)I")
	public int method5800(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt6821 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt6821 & 0x7);
		this.anInt6821 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local23) {
			local31 += (Static11.anIntArray585[local23] & super.aByteArray86[local10++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local31 += super.aByteArray86[local10] & Static11.anIntArray585[local23];
		} else {
			local31 += super.aByteArray86[local10] >> local23 - arg0 & Static11.anIntArray585[arg0];
		}
		return local31;
	}
}
