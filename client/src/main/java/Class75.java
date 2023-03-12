import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class75 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!ag;")
	private Node aClass2_69;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Lclient!ld;")
	private LinkedList aClass135_18;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class75() {
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!ld;)V")
	public Class75(@OriginalArg(0) LinkedList arg0) {
		this.aClass135_18 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Lclient!ag;")
	public Node method2178() {
		@Pc(6) Node local6 = this.aClass2_69;
		if (this.aClass135_18.aClass2_130 == local6) {
			this.aClass2_69 = null;
			return null;
		} else {
			this.aClass2_69 = local6.next;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ld;I)V")
	public void method2180(@OriginalArg(0) LinkedList arg0) {
		this.aClass135_18 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)Lclient!ag;")
	public Node method2181() {
		@Pc(8) Node local8 = this.aClass135_18.aClass2_130.next;
		if (this.aClass135_18.aClass2_130 == local8) {
			this.aClass2_69 = null;
			return null;
		} else {
			this.aClass2_69 = local8.next;
			return local8;
		}
	}
}
