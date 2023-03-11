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
public final class Class123_Sub1 extends Class123 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_2;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_3;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Lclient!co;")
	private Class37_Sub1 aClass37_Sub1_4;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[Z")
	private final boolean[] aBooleanArray32 = new boolean[112];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class123_Sub1(@OriginalArg(0) Component arg0) {
		Static119.method2378();
		this.method3350(arg0);
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
		local7.aLong36 = Static204.method3685();
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
		} else if (local8 >= 0 && Static239.anIntArray285.length > local8) {
			local8 = Static239.anIntArray285[local8];
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
		this.aComponent2 = arg0;
		@Pc(11) Method local11 = Static215.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent2, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3337() {
		for (@Pc(14) Class37_Sub1 local14 = this.aClass37_Sub1_3; local14 != null; local14 = local14.aClass37_Sub1_1) {
			if (local14.anInt1250 == 0) {
				if (local14.anInt1245 >= 0) {
					local14.aBoolean101 = !this.aBooleanArray32[local14.anInt1245];
				}
				this.aBooleanArray32[local14.anInt1245] = true;
			} else if (local14.anInt1250 == 1) {
				this.aBooleanArray32[local14.anInt1245] = false;
			} else if (local14.anInt1250 == -1) {
				for (@Pc(52) int local52 = 0; local52 < 112; local52++) {
					this.aBooleanArray32[local52] = false;
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
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(22) int local22 = 0; local22 < 112; local22++) {
			this.aBooleanArray32[local22] = false;
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
	public boolean method3343(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray32[arg0] : false;
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
