import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public final class Class2_Sub2_Sub17_Sub1 extends Class2_Sub2_Sub17 {

	@OriginalMember(owner = "client!rja", name = "H", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!rja", name = "z", descriptor = "I")
	public int anInt8331;

	@OriginalMember(owner = "client!rja", name = "A", descriptor = "Lclient!ge;")
	public Packet aPacket_15;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method8971() {
		if (super.aBoolean778 || this.aPacket_15.data.length - this.aByte129 > this.aPacket_15.pos) {
			throw new RuntimeException();
		}
		return this.aPacket_15.data;
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(B)I")
	@Override
	public int method8972() {
		return this.aPacket_15 == null ? 0 : this.aPacket_15.pos * 100 / (this.aPacket_15.data.length - this.aByte129);
	}
}
