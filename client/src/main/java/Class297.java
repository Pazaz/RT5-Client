import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public abstract class Class297 {

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
	public int anInt7561;

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
	public int anInt7563;

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
	public int anInt7564;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)Z")
	public final boolean method6706() {
		return (this.anInt7563 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)Z")
	public final boolean method6708() {
		return (this.anInt7563 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)Z")
	public final boolean method6709() {
		return (this.anInt7563 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(Z)Z")
	public final boolean method6712() {
		return (this.anInt7563 & 0x8) != 0;
	}
}
