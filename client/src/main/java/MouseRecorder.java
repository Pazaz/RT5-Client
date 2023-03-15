import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class MouseRecorder extends Node {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!ld;")
	public static final LinkedList samples = new LinkedList();
	@OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
	public static int mouseRecorderPrevX = -1;
	@OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
	public static int mouseRecorderPrevY = -1;
	@OriginalMember(owner = "client!vl", name = "X", descriptor = "J")
	public static long mouseRecorderPrevTime = -1L;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I")
	public abstract int getX();

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
	public abstract int getY();

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)I")
	public abstract int method5247();

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)J")
	public abstract long getTime();
}
