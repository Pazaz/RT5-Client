import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class137 {

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Lclient!ag;")
	private Node aClass2_132;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	private int anInt3614 = 0;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!ad;")
	private final HashTable aClass4_79;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class137(@OriginalArg(0) HashTable arg0) {
		this.aClass4_79 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)Lclient!ag;")
	public Node method3560() {
		@Pc(23) Node local23;
		if (this.anInt3614 > 0 && this.aClass2_132 != this.aClass4_79.aClass2Array1[this.anInt3614 - 1]) {
			local23 = this.aClass2_132;
			this.aClass2_132 = local23.next;
			return local23;
		}
		while (this.anInt3614 < this.aClass4_79.anInt97) {
			local23 = this.aClass4_79.aClass2Array1[this.anInt3614++].next;
			if (this.aClass4_79.aClass2Array1[this.anInt3614 - 1] != local23) {
				this.aClass2_132 = local23.next;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lclient!ag;")
	public Node method3561() {
		this.anInt3614 = 0;
		return this.method3560();
	}
}
