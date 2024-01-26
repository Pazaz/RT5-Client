import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface Interface24 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!uq;)Z")
	boolean method7432(@OriginalArg(1) Interface24 arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)J")
	long method7433();
}
