import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(FB)V")
	public void method5026(@OriginalArg(0) float arg0) {
		@Pc(9) int local9 = Float.floatToRawIntBits(arg0);
		this.aByteArray86[this.anInt6813++] = (byte) local9;
		this.aByteArray86[this.anInt6813++] = (byte) (local9 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) (local9 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (local9 >> 24);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(FB)V")
	public void method5027(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray86[this.anInt6813++] = (byte) (local2 >> 24);
		this.aByteArray86[this.anInt6813++] = (byte) (local2 >> 16);
		this.aByteArray86[this.anInt6813++] = (byte) (local2 >> 8);
		this.aByteArray86[this.anInt6813++] = (byte) local2;
	}
}
