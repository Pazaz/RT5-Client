import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
	public int anInt4218;

	@OriginalMember(owner = "client!lq", name = "S", descriptor = "Lclient!jb;")
	public Class96 aClass96_4;

	@OriginalMember(owner = "client!lq", name = "Y", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method3603() {
		if (super.aBoolean300) {
			throw new RuntimeException();
		}
		return this.aByteArray40;
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)I")
	@Override
	public int method3605() {
		return super.aBoolean300 ? 0 : 100;
	}
}
