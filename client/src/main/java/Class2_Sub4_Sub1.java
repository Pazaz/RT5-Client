import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class2_Sub4_Sub1 extends Buffer {

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(FI)V")
	public void method3058(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.data[this.pos++] = (byte) local6;
		this.data[this.pos++] = (byte) (local6 >> 8);
		this.data[this.pos++] = (byte) (local6 >> 16);
		this.data[this.pos++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(FI)V")
	public void method3059(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.data[this.pos++] = (byte) (local2 >> 24);
		this.data[this.pos++] = (byte) (local2 >> 16);
		this.data[this.pos++] = (byte) (local2 >> 8);
		this.data[this.pos++] = (byte) local2;
	}
}
