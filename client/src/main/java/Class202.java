import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class202 implements MouseListener, MouseMotionListener, FocusListener {

	@OriginalMember(owner = "client!uh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static199.aClass202_1 != null) {
			Static301.anInt6298 = 0;
			Static272.anInt5742 = arg0.getX();
			Static206.anInt4785 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!uh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static199.aClass202_1 != null) {
			Static89.anInt2373 = 0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!uh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static199.aClass202_1 != null) {
			Static301.anInt6298 = 0;
			Static89.anInt2373 = 0;
			@Pc(12) int local12 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static199.aClass202_1 != null) {
			Static301.anInt6298 = 0;
			Static272.anInt5742 = arg0.getX();
			Static206.anInt4785 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!uh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static199.aClass202_1 != null) {
			Static301.anInt6298 = 0;
			Static335.anInt6982 = arg0.getX();
			Static164.anInt3993 = arg0.getY();
			Static327.aLong207 = Static325.method5658();
			if (arg0.isMetaDown()) {
				Static37.anInt1171 = 2;
				Static89.anInt2373 = 2;
			} else {
				Static37.anInt1171 = 1;
				Static89.anInt2373 = 1;
			}
			@Pc(32) int local32 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!uh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static199.aClass202_1 != null) {
			Static301.anInt6298 = 0;
			Static272.anInt5742 = arg0.getX();
			Static206.anInt4785 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!uh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static199.aClass202_1 != null) {
			Static301.anInt6298 = 0;
			Static272.anInt5742 = -1;
			Static206.anInt4785 = -1;
		}
	}
}
