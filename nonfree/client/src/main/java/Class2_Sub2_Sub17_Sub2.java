import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class2_Sub2_Sub17_Sub2 extends Class2_Sub2_Sub17 {

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
	public int anInt10352;

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "Lclient!af;")
	public Class9 aClass9_4;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "[B")
	public byte[] aByteArray109;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)I")
	@Override
	public int method8972() {
		return super.aBoolean778 ? 0 : 100;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method8971() {
		if (super.aBoolean778) {
			throw new RuntimeException();
		}
		return this.aByteArray109;
	}
}
