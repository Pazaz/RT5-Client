import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class Class223 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/Robot;")
	private final Robot aRobot1 = new Robot();

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class223() throws Exception {
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IZLjava/awt/Component;)V")
	public void method6182(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1) {
		if (arg0) {
			arg1 = null;
		} else if (arg1 == null) {
			throw new NullPointerException();
		}
		if (this.aComponent2 == arg1) {
			return;
		}
		if (this.aComponent2 != null) {
			this.aComponent2.setCursor(null);
			this.aComponent2 = null;
		}
		if (arg1 != null) {
			arg1.setCursor(arg1.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
			this.aComponent2 = arg1;
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(III)V")
	public void method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aRobot1.mouseMove(arg0, arg1);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/awt/Point;B[IILjava/awt/Component;I)V")
	public void method6184(@OriginalArg(0) Point arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			arg3.setCursor(null);
		} else {
			@Pc(20) BufferedImage local20 = new BufferedImage(arg2, arg4, 2);
			local20.setRGB(0, 0, arg2, arg4, arg1, 0, arg2);
			arg3.setCursor(arg3.getToolkit().createCustomCursor(local20, arg0, null));
		}
	}
}
