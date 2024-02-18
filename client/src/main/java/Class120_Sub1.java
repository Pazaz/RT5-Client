import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class120_Sub1 extends Class120 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	private int anInt4132;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
	private int anInt4133;

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
	private int anInt4134;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
	private int anInt4135;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	private int anInt4136;

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
	private int anInt4137;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "Lclient!sia;")
	private Class339 aClass339_20 = new Class339();

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "Lclient!sia;")
	private Class339 aClass339_21 = new Class339();

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	private Class120_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3629(-30273, arg0);
		this.aBoolean321 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)I")
	@Override
	public int method8854() {
		return this.anInt4134;
	}

	@OriginalMember(owner = "client!ht", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3630(arg0);
		if ((this.anInt4135 & local4) == 0) {
			local4 = this.anInt4135;
		}
		if ((local4 & 0x1) != 0) {
			this.method3627(arg0.getY(), arg0.getX(), 3, arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method3627(arg0.getY(), arg0.getX(), 5, arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method3627(arg0.getY(), arg0.getX(), 4, arg0.getClickCount());
		}
		this.anInt4135 &= ~local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIII)V")
	private void method3627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class2_Sub9_Sub1 local3 = new Class2_Sub9_Sub1();
		local3.anInt1889 = arg1;
		local3.anInt1888 = arg2;
		local3.anInt1887 = arg0;
		local3.aLong68 = Static588.method7715();
		local3.anInt1890 = arg3;
		this.aClass339_21.method7711(local3);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZII)V")
	private void method3628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4137 = arg1;
		this.anInt4136 = arg0;
		if (this.aBoolean321) {
			this.method3627(arg0, arg1, -1, 0);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)Lclient!bv;")
	@Override
	public Class2_Sub9 method8851() {
		return (Class2_Sub9) this.aClass339_20.method7705();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method3629(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1) {
		if (arg0 != -30273) {
			return;
		}
		this.method3631();
		this.aComponent1 = arg1;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I")
	private int method3630(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V")
	private void method3631() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aClass339_21 = null;
		this.anInt4132 = this.anInt4134 = this.anInt4133 = 0;
		this.aClass339_20 = null;
		this.anInt4137 = this.anInt4136 = this.anInt4135 = 0;
		this.aComponent1 = null;
	}

	@OriginalMember(owner = "client!ht", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method3627(local5, local2, 6, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ht", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method3628(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ht", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3628(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8842() {
		return (this.anInt4133 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(B)I")
	@Override
	public int method8853() {
		return this.anInt4132;
	}

	@OriginalMember(owner = "client!ht", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method3630(arg0);
		if (local4 == 1) {
			this.method3627(arg0.getY(), arg0.getX(), 0, arg0.getClickCount());
		} else if (local4 == 4) {
			this.method3627(arg0.getY(), arg0.getX(), 2, arg0.getClickCount());
		} else if (local4 == 2) {
			this.method3627(arg0.getY(), arg0.getX(), 1, arg0.getClickCount());
		}
		this.anInt4135 |= local4;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
	@Override
	public synchronized void method8841() {
		this.anInt4133 = this.anInt4135;
		this.anInt4132 = this.anInt4137;
		this.anInt4134 = this.anInt4136;
		@Pc(23) Class339 local23 = this.aClass339_20;
		this.aClass339_20 = this.aClass339_21;
		this.aClass339_21 = local23;
		this.aClass339_21.method7700();
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8843() {
		return (this.anInt4133 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ht", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3628(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	@Override
	public void method8848() {
		this.method3631();
	}

	@OriginalMember(owner = "client!ht", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3628(arg0.getY(), arg0.getX());
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8847() {
		return (this.anInt4133 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ht", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
