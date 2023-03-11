import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class3 {

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	public int flags;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public int country;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int players;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
	public final boolean isPvp() {
		return (this.flags & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z")
	public final boolean isLootShare() {
		return (this.flags & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z")
	public final boolean isMembers() {
		return (this.flags & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)Z")
	public final boolean isQuickChat() {
		return (this.flags & 0x2) != 0;
	}
}
