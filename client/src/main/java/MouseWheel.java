import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class MouseWheel {

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!kp;")
	public static MouseWheel instance;
	@OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
	public static int wheelRotation = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void stop(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void start(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I")
	public abstract int getRotation();
}
