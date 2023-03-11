import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class2_Sub2_Sub10_Sub2 extends Class2_Sub2_Sub10 {

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!rq;")
	public Class207 aClass207_4;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	public int anInt6199;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I")
	@Override
	public int method5651() {
		return super.aBoolean416 ? 0 : 100;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method5648() {
		if (super.aBoolean416) {
			throw new RuntimeException();
		}
		return this.aByteArray91;
	}
}
