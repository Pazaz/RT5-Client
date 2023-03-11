import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class CursorManager {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public CursorManager() throws Exception {
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IIB)V")
	public void method6491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "([IIIILjava/awt/Point;Ljava/awt/Component;)V")
	public void method6492(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Point arg3, @OriginalArg(5) Component arg4) {
		if (arg0 == null) {
			arg4.setCursor(null);
		} else {
			@Pc(17) BufferedImage local17 = new BufferedImage(arg1, arg2, 2);
			local17.setRGB(0, 0, arg1, arg2, arg0, 0, arg1);
			arg4.setCursor(arg4.getToolkit().createCustomCursor(local17, arg3, null));
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BZLjava/awt/Component;)V")
	public void method6493(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (arg1 == this.aComponent4) {
			return;
		}
		if (this.aComponent4 != null) {
			this.aComponent4.setCursor(null);
			this.aComponent4 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent4 = arg1;
		}
	}
}
