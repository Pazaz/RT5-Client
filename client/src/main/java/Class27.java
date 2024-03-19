import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class27 {

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public int anInt927;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public int anInt929;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	public int anInt931;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)Z")
	public final boolean method691() {
		return (this.anInt929 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Z")
	public final boolean method692() {
		return (this.anInt929 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Z")
	public final boolean method696() {
		return (this.anInt929 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)Z")
	public final boolean method697() {
		return (this.anInt929 & 0x4) != 0;
	}
}
