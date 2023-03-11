import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class Class25 {

	static {
		new Class79("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	protected Class25() {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Lclient!ra;")
	public abstract Class198 method884();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	public abstract void method885(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)I")
	public abstract int method887(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[B")
	public abstract byte[] method889(@OriginalArg(0) int arg0);
}
