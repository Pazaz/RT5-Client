import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class255 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class255() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(31) GraphicsDevice local31 = local15[local19];
				if (local31 != null && local31.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local31;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method6494(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(72) Field local72 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local72.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(79) Throwable local79) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(I)V")
	public void method6495() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6494(null);
	}

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "(I)[I")
	public int[] method6496() {
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
	public void method6497(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method6494(arg0);
		if (arg4 == 0) {
			@Pc(40) int local40 = this.aDisplayMode1.getRefreshRate();
			@Pc(44) DisplayMode[] local44 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(46) boolean local46 = false;
			for (@Pc(48) int local48 = 0; local48 < local44.length; local48++) {
				if (local44[local48].getWidth() == arg3 && local44[local48].getHeight() == arg1 && local44[local48].getBitDepth() == arg2) {
					@Pc(80) int local80 = local44[local48].getRefreshRate();
					if (!local46 || Math.abs(local80 - local40) < Math.abs(arg4 - local40)) {
						local46 = true;
						arg4 = local80;
					}
				}
			}
			if (!local46) {
				arg4 = local40;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg1, arg2, arg4));
	}
}
