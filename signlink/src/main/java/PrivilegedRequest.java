import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!cc")
public final class PrivilegedRequest {

	@OriginalMember(owner = "loader!cc", name = "g", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "loader!cc", name = "b", descriptor = "Lloader!cc;")
	public PrivilegedRequest next;

	@OriginalMember(owner = "loader!cc", name = "c", descriptor = "I")
	public int type;

	@OriginalMember(owner = "loader!cc", name = "a", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "loader!cc", name = "e", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "loader!cc", name = "d", descriptor = "Ljava/lang/Object;")
	public Object objectArg;

	@OriginalMember(owner = "loader!cc", name = "f", descriptor = "I")
	public volatile int status = 0;
}
