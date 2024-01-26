package jaclib.hardware_info;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/hardware_info/HardwareInfo")
public final class HardwareInfo {

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getDXDiagDisplayDevicesProps", descriptor = "()[[Ljava/lang/String;")
	private static native String[][] getDXDiagDisplayDevicesProps();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getOpenGLProps", descriptor = "()[Ljava/lang/String;")
	private static native String[] getOpenGLProps();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getDXDiagSystemProps", descriptor = "()[Ljava/lang/String;")
	private static native String[] getDXDiagSystemProps();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getCPUInfo", descriptor = "()[I")
	public static native int[] getCPUInfo();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "<init>", descriptor = "()V")
	private HardwareInfo() {
	}
}
