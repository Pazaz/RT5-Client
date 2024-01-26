import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class66 {

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "()V")
	private Class66() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method1562(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(10) Field local10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local10.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local10.get(this.aGraphicsDevice1);
			if (local20) {
				local1 = true;
				local10.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(33) Throwable local33) {
		}
		if (arg1 != 1503493474) {
			this.aDisplayMode1 = (DisplayMode) null;
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(77) Field local77 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local77.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(84) Throwable local84) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!cia", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
	private void enter(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method1562(arg0, 1503493474);
		if (arg4 == 0) {
			@Pc(31) int local31 = this.aDisplayMode1.getRefreshRate();
			@Pc(35) DisplayMode[] local35 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < local35.length; local39++) {
				if (arg1 == local35[local39].getWidth() && local35[local39].getHeight() == arg2 && local35[local39].getBitDepth() == arg3) {
					@Pc(76) int local76 = local35[local39].getRefreshRate();
					if (!local37 || Math.abs(local76 - local31) < Math.abs(arg4 - local31)) {
						arg4 = local76;
						local37 = true;
					}
				}
			}
			if (!local37) {
				arg4 = local31;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!cia", name = "listmodes", descriptor = "()[I")
	private int[] listmodes() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "client!cia", name = "exit", descriptor = "()V")
	private void exit() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method1562((Frame) null, 1503493474);
	}
}
