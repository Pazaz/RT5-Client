import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class35 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!cn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		if (Static332.aClass35_1 != null) {
			@Pc(4) char local4 = arg0.getKeyChar();
			if (local4 != '\u0000' && local4 != '\uffff' && Static44.method710(local4)) {
				@Pc(24) int local24 = Static38.anInt1197 + 1 & 0x7F;
				if (Static321.anInt6613 != local24) {
					Static26.anIntArray55[Static38.anInt1197] = -1;
					Static238.aCharArray16[Static38.anInt1197] = local4;
					Static38.anInt1197 = local24;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static332.aClass35_1 != null) {
			Static62.anInt1707 = -1;
		}
	}

	@OriginalMember(owner = "client!cn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static332.aClass35_1 == null) {
			return;
		}
		Static342.anInt7214 = 0;
		@Pc(10) int local10 = arg0.getKeyCode();
		if (local10 >= 0 && Static232.anIntArray383.length > local10) {
			local10 = Static232.anIntArray383[local10];
			if ((local10 & 0x80) != 0) {
				local10 = -1;
			}
		} else {
			local10 = -1;
		}
		if (Static62.anInt1707 >= 0 && local10 >= 0) {
			Static16.anIntArray39[Static62.anInt1707] = local10;
			Static62.anInt1707 = Static62.anInt1707 + 1 & 0x7F;
			if (Static62.anInt1707 == Static15.anInt627) {
				Static62.anInt1707 = -1;
			}
		}
		@Pc(64) int local64;
		if (local10 >= 0) {
			local64 = Static38.anInt1197 + 1 & 0x7F;
			if (local64 != Static321.anInt6613) {
				Static26.anIntArray55[Static38.anInt1197] = local10;
				Static238.aCharArray16[Static38.anInt1197] = '\u0000';
				Static38.anInt1197 = local64;
			}
		}
		local64 = arg0.getModifiers();
		if ((local64 & 0xA) != 0 || local10 == 85 || local10 == 10) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!cn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static332.aClass35_1 != null) {
			Static342.anInt7214 = 0;
			@Pc(6) int local6 = arg0.getKeyCode();
			if (local6 >= 0 && Static232.anIntArray383.length > local6) {
				local6 = Static232.anIntArray383[local6] & 0xFFFFFF7F;
			} else {
				local6 = -1;
			}
			if (Static62.anInt1707 >= 0 && local6 >= 0) {
				Static16.anIntArray39[Static62.anInt1707] = ~local6;
				Static62.anInt1707 = Static62.anInt1707 + 1 & 0x7F;
				if (Static62.anInt1707 == Static15.anInt627) {
					Static62.anInt1707 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!cn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}
}
