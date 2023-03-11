import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class3 {

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	public int anInt74;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public int anInt76;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int anInt78;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
	public final boolean method66() {
		return (this.anInt74 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z")
	public final boolean method67() {
		return (this.anInt74 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z")
	public final boolean method69() {
		return (this.anInt74 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)Z")
	public final boolean method71() {
		return (this.anInt74 & 0x2) != 0;
	}
}
