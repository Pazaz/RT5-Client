import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public interface Interface22 {

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)I")
	int method8460();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	void method8461();

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)I")
	int method8462();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZJ)Z")
	boolean method8463(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	void method8464();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZB)V")
	void method8465(@OriginalArg(0) boolean arg0);
}
