import org.openrs2.deob.annotation.OriginalMember;

public class Mouse {

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!lh;")
	public static Class119 instance;

	@OriginalMember(owner = "client!vn", name = "V", descriptor = "Lclient!lm;")
	public static MouseRecorder clickButton;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "J")
	public static long prevClickTime = -1L;

}
