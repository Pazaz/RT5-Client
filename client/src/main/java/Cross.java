import org.openrs2.deob.annotation.OriginalMember;

public class Cross {

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
	public static int ms = 0;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	public static int type = 0;

}
