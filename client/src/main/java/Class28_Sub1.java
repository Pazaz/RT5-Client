import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class28_Sub1 extends Class28 implements MouseWheelListener {

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	private int anInt948 = 0;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method712(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method709(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ca", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt948 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
	@Override
	public synchronized int method713() {
		@Pc(8) int local8 = this.anInt948;
		this.anInt948 = 0;
		return local8;
	}
}
