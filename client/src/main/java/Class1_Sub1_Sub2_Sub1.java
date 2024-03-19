import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "Lclient!il;")
	public Class1_Sub16 aClass1_Sub16_1;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	public int anInt284;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)I")
	@Override
	public int method3605() {
		return this.aClass1_Sub16_1 == null ? 0 : this.aClass1_Sub16_1.anInt6813 * 100 / (this.aClass1_Sub16_1.aByteArray86.length - this.aByte1);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method3603() {
		if (super.aBoolean300 || this.aClass1_Sub16_1.anInt6813 < this.aClass1_Sub16_1.aByteArray86.length - this.aByte1) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub16_1.aByteArray86;
	}
}
