import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class131_Sub1 extends Class131 implements MouseWheelListener {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	private int anInt3732 = 0;

	@OriginalMember(owner = "client!m", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		this.anInt3732 += arg0.getWheelRotation();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/awt/Component;)V")
	@Override
	public void method3692(@OriginalArg(1) Component arg0) {
		arg0.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;)V")
	@Override
	public void method3691(@OriginalArg(1) Component arg0) {
		arg0.removeMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
	@Override
	public synchronized int method3693() {
		@Pc(2) int local2 = this.anInt3732;
		this.anInt3732 = 0;
		return local2;
	}
}
