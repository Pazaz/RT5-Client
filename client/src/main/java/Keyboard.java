import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Keyboard extends KeyboardBase implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!nn", name = "W", descriptor = "[I")
	public static final int[] CODE_MAP = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Lclient!nj;")
	public static KeyboardBase instance;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_2;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_3;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Ljava/awt/Component;")
	private Component component;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_4;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[Z")
	private final boolean[] pressedKeys = new boolean[112];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Keyboard(@OriginalArg(0) Component arg0) {
		method2378();
		this.method3350(arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public static void method2378() {
		if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			CODE_MAP[191] = 73;
			CODE_MAP[221] = 43;
			CODE_MAP[222] = 59;
			CODE_MAP[188] = 71;
			CODE_MAP[186] = 57;
			CODE_MAP[219] = 42;
			CODE_MAP[189] = 26;
			CODE_MAP[223] = 28;
			CODE_MAP[190] = 72;
			CODE_MAP[187] = 27;
			CODE_MAP[192] = 58;
			CODE_MAP[220] = 74;
			return;
		}
		CODE_MAP[59] = 57;
		CODE_MAP[45] = 26;
		CODE_MAP[47] = 73;
		CODE_MAP[93] = 43;
		CODE_MAP[46] = 72;
		CODE_MAP[44] = 71;
		CODE_MAP[91] = 42;
		if (Signlink.setFocusTraversalKeysEnabled == null) {
			CODE_MAP[192] = 58;
			CODE_MAP[222] = 59;
		} else {
			CODE_MAP[520] = 59;
			CODE_MAP[222] = 58;
			CODE_MAP[192] = 28;
		}
		CODE_MAP[92] = 74;
		CODE_MAP[61] = 27;
	}

	@OriginalMember(owner = "client!ke", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static84.method1908(local6)) {
			this.method3345(local6, -1, 2);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BCII)V")
	private void method3345(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class37_Sub1 local7 = new Class37_Sub1();
		local7.anInt1245 = arg1;
		local7.anInt1250 = arg2;
		local7.aChar1 = arg0;
		local7.aLong36 = MonotonicClock.currentTimeMillis();
		if (this.aClass37_Sub1_4 == null) {
			this.aClass37_Sub1_3 = local7;
		} else {
			this.aClass37_Sub1_4.aClass37_Sub1_1 = local7;
		}
		this.aClass37_Sub1_4 = local7;
	}

	@OriginalMember(owner = "client!ke", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method3348(arg0, 0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	private void method3348(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && CODE_MAP.length > local8) {
			local8 = CODE_MAP[local8];
			if (arg1 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method3345('\u0000', local8, arg1);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	@Override
	public void method3338() {
		this.method3351();
	}

	@OriginalMember(owner = "client!ke", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	private void method3350(@OriginalArg(0) Component arg0) {
		this.method3351();
		this.component = arg0;
		@Pc(11) Method local11 = Signlink.setFocusTraversalKeysEnabled;
		if (local11 != null) {
			try {
				local11.invoke(this.component, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.component.addKeyListener(this);
		this.component.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void mainLogic() {
		for (@Pc(14) Class37_Sub1 local14 = this.aClass37_Sub1_3; local14 != null; local14 = local14.aClass37_Sub1_1) {
			if (local14.anInt1250 == 0) {
				if (local14.anInt1245 >= 0) {
					local14.aBoolean101 = !this.pressedKeys[local14.anInt1245];
				}
				this.pressedKeys[local14.anInt1245] = true;
			} else if (local14.anInt1250 == 1) {
				this.pressedKeys[local14.anInt1245] = false;
			} else if (local14.anInt1250 == -1) {
				for (@Pc(52) int local52 = 0; local52 < 112; local52++) {
					this.pressedKeys[local52] = false;
				}
			}
		}
		this.aClass37_Sub1_2 = this.aClass37_Sub1_3;
		this.aClass37_Sub1_3 = null;
		this.aClass37_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!ke", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method3348(arg0, 1);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	private void method3351() {
		if (this.component == null) {
			return;
		}
		this.component.removeKeyListener(this);
		this.component.removeFocusListener(this);
		this.component = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.pressedKeys[local22] = false;
		}
		this.aClass37_Sub1_3 = null;
		this.aClass37_Sub1_2 = null;
		this.aClass37_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!ke", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method3345('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean isPressed(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.pressedKeys[arg0] : false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lclient!rk;")
	@Override
	public Class37 method3342() {
		@Pc(13) Class37_Sub1 local13;
		for (local13 = this.aClass37_Sub1_2; local13 != null && local13.anInt1250 == -1; local13 = local13.aClass37_Sub1_1) {
		}
		if (local13 == null) {
			this.aClass37_Sub1_2 = null;
		} else {
			this.aClass37_Sub1_2 = local13.aClass37_Sub1_1;
		}
		return local13;
	}
}
