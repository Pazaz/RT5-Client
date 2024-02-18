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

@OriginalClass("client!ui")
public final class Class319_Sub1 extends Class319 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!sia;")
	private final Class339 aClass339_70 = new Class339();

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "Lclient!sia;")
	private final Class339 aClass339_71 = new Class339();

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray31 = new boolean[112];

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class319_Sub1(@OriginalArg(0) Component arg0) {
		Static664.method8657();
		this.method8488(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I")
	private int method8484() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray31[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray31[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray31[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(CIII)V")
	private void method8485(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub18 local7 = new Class2_Sub18();
		local7.aChar4 = arg0;
		local7.anInt2881 = arg1;
		local7.anInt2886 = arg2;
		local7.aLong99 = Static588.method7715();
		this.aClass339_71.method7711(local7);
	}

	@OriginalMember(owner = "client!ui", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lclient!wka;")
	@Override
	public Interface27 method8478() {
		return (Interface27) this.aClass339_70.method7705();
	}

	@OriginalMember(owner = "client!ui", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method8487(1, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	@Override
	public void method8482() {
		this.method8489();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	@Override
	public synchronized void method8481() {
		this.aClass339_70.method7700();
		for (@Pc(22) Class2_Sub18 local22 = (Class2_Sub18) this.aClass339_71.method7705(); local22 != null; local22 = (Class2_Sub18) this.aClass339_71.method7705()) {
			local22.anInt2885 = this.method8484();
			if (local22.anInt2886 == 0) {
				if (!this.aBooleanArray31[local22.anInt2881]) {
					@Pc(152) Class2_Sub18 local152 = new Class2_Sub18();
					local152.aChar4 = '\u0000';
					local152.anInt2881 = local22.anInt2881;
					local152.anInt2886 = 0;
					local152.anInt2885 = local22.anInt2885;
					local152.aLong99 = local22.aLong99;
					this.aClass339_70.method7711(local152);
					this.aBooleanArray31[local22.anInt2881] = true;
				}
				local22.anInt2886 = 2;
				this.aClass339_70.method7711(local22);
			} else if (local22.anInt2886 == 1) {
				if (this.aBooleanArray31[local22.anInt2881]) {
					this.aClass339_70.method7711(local22);
					this.aBooleanArray31[local22.anInt2881] = false;
				}
			} else if (local22.anInt2886 == -1) {
				for (@Pc(65) int local65 = 0; local65 < 112; local65++) {
					if (this.aBooleanArray31[local65]) {
						@Pc(78) Class2_Sub18 local78 = new Class2_Sub18();
						local78.anInt2881 = local65;
						local78.anInt2885 = local22.anInt2885;
						local78.aChar4 = '\u0000';
						local78.anInt2886 = 1;
						local78.aLong99 = local22.aLong99;
						this.aClass339_70.method7711(local78);
						this.aBooleanArray31[local65] = false;
					}
				}
			} else if (local22.anInt2886 == 3) {
				this.aClass339_70.method7711(local22);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method8487(0, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
	private void method8487(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(8) int local8 = arg1.getKeyCode();
		if (local8 == 0) {
			local8 = 0;
		} else if (local8 >= 0 && local8 < Static471.anIntArray577.length) {
			local8 = Static471.anIntArray577[local8];
			if (arg0 == 0 && (local8 & 0x80) != 0) {
				local8 = 0;
			} else {
				local8 &= 0xFFFFFF7F;
			}
		} else {
			local8 = 0;
		}
		if (local8 != 0) {
			this.method8485('\u0000', local8, arg0);
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method8488(@OriginalArg(1) Component arg0) {
		this.method8489();
		this.aComponent4 = arg0;
		@Pc(11) Method local11 = Static689.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
	private void method8489() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray31[local26] = false;
		}
		this.aClass339_70.method7700();
		this.aClass339_71.method7700();
	}

	@OriginalMember(owner = "client!ui", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method8485('\u0000', 0, -1);
	}

	@OriginalMember(owner = "client!ui", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static189.method2862(local6)) {
			this.method8485(local6, -1, 3);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8479(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray31[arg0] : false;
	}
}
