import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class119_Sub1 extends Class119 implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	private int anInt3323;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "I")
	private int anInt3333;

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	private int anInt3343;

	@OriginalMember(owner = "client!k", name = "K", descriptor = "I")
	private int anInt3345;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "I")
	private int anInt3346;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "I")
	private int anInt3347;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!ld;")
	private LinkedList aClass135_22 = new LinkedList();

	@OriginalMember(owner = "client!k", name = "N", descriptor = "Lclient!ld;")
	private LinkedList aClass135_23 = new LinkedList();

	@OriginalMember(owner = "client!k", name = "O", descriptor = "Z")
	private final boolean aBoolean224;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
	public Class119_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method3319(arg0);
		this.aBoolean224 = arg1;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
	@Override
	public void method3312() {
		this.method3321();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V")
	private void method3314(@OriginalArg(1) MouseEvent arg0) {
		this.anInt3346 = arg0.getX();
		this.anInt3345 = arg0.getY();
		if (this.aBoolean224) {
			this.method3317(-1, arg0.getX(), arg0.getY());
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method3314(arg0);
	}

	@OriginalMember(owner = "client!k", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
	private void method3317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub24_Sub1 local7 = new Class2_Sub24_Sub1();
		local7.anInt5770 = arg1;
		local7.anInt5764 = arg0;
		local7.anInt5766 = arg2;
		local7.aLong175 = MonotonicClock.currentTimeMillis();
		this.aClass135_23.addTail(local7);
	}

	@OriginalMember(owner = "client!k", name = "h", descriptor = "(I)I")
	@Override
	public int method3313() {
		return this.anInt3323;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)Z")
	@Override
	protected boolean method3309() {
		return (this.anInt3333 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I")
	@Override
	public int method3304() {
		return this.anInt3343;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	private void method3319(@OriginalArg(0) Component arg0) {
		this.method3321();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
	}

	@OriginalMember(owner = "client!k", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method3314(arg0);
	}

	@OriginalMember(owner = "client!k", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt3345 = -1;
		this.anInt3346 = -1;
	}

	@OriginalMember(owner = "client!k", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method3314(arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
	private int method3320(@OriginalArg(0) MouseEvent arg0) {
		@Pc(6) int local6 = arg0.getModifiers();
		@Pc(17) boolean local17 = (local6 & 0x10) != 0;
		@Pc(25) boolean local25 = (local6 & 0x8) != 0;
		@Pc(33) boolean local33 = (local6 & 0x4) != 0;
		if (local25 && (local17 || local33)) {
			local25 = false;
		}
		if (local17 && local33) {
			return 4;
		} else if (local17) {
			return 1;
		} else if (local25) {
			return 2;
		} else if (local33) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!k", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(8) int local8 = this.method3320(arg0);
		if ((this.anInt3347 & local8) == 0) {
			local8 = this.anInt3347;
		}
		if ((local8 & 0x1) != 0) {
			this.method3317(3, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x4) != 0) {
			this.method3317(5, arg0.getX(), arg0.getY());
		}
		if ((local8 & 0x2) != 0) {
			this.method3317(4, arg0.getX(), arg0.getY());
		}
		this.anInt3347 &= ~local8;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(B)V")
	private void method3321() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aClass135_23 = null;
		this.aComponent1 = null;
		this.anInt3343 = this.anInt3323 = this.anInt3333 = 0;
		this.aClass135_22 = null;
		this.anInt3346 = this.anInt3345 = this.anInt3347 = 0;
	}

	@OriginalMember(owner = "client!k", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(10) int local10 = this.method3320(arg0);
		if (local10 == 1) {
			this.method3317(0, arg0.getX(), arg0.getY());
		} else if (local10 == 4) {
			this.method3317(2, arg0.getX(), arg0.getY());
		} else if (local10 == 2) {
			this.method3317(1, arg0.getX(), arg0.getY());
		}
		this.anInt3347 |= local10;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z")
	@Override
	protected boolean method3303() {
		return (this.anInt3333 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3307() {
		this.anInt3323 = this.anInt3345;
		this.anInt3343 = this.anInt3346;
		this.anInt3333 = this.anInt3347;
		@Pc(25) LinkedList local25 = this.aClass135_22;
		this.aClass135_22 = this.aClass135_23;
		this.aClass135_23 = local25;
		this.aClass135_23.clear();
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method3311() {
		return (this.anInt3333 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)Lclient!lm;")
	@Override
	public Class2_Sub24 method3308() {
		return (Class2_Sub24) this.aClass135_22.method3549();
	}
}
