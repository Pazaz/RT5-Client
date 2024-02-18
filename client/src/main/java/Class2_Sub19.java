import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!ss;")
	public Class345 aClass345_32;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt2986;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Lclient!rka;")
	public PacketBit aPacketBit_1;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public void method2768() {
		if (Static76.anInt1604 < Static372.aClass2_Sub19Array1.length) {
			Static372.aClass2_Sub19Array1[Static76.anInt1604++] = this;
		}
	}
}
