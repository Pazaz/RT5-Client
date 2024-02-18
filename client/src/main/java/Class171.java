import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class171 {

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
	public int anInt4032;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	public int anInt4033;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	public int anInt4034;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	public int anInt4035;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "B")
	private byte aByte69;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public int anInt4040;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class171() {
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class171(@OriginalArg(0) Packet arg0) {
		this.aByte69 = arg0.g1b();
		this.anInt4033 = arg0.g2();
		this.anInt4040 = arg0.g4();
		this.anInt4034 = arg0.g4();
		this.anInt4035 = arg0.g4();
		this.anInt4032 = arg0.g4();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)I")
	public int method3547() {
		return (this.aByte69 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	public int method3548() {
		return this.aByte69 & 0x7;
	}
}
