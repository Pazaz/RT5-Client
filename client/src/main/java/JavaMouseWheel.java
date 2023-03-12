import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class JavaMouseWheel extends MouseWheel implements MouseWheelListener {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	private int rotation = 0;

	@OriginalMember(owner = "client!m", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.rotation += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void start(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void stop(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int getRotation() {
		@Pc(2) int local2 = this.rotation;
		this.rotation = 0;
		return local2;
	}
}
