import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "Lclient!h;")
	public static final Class89 aClass89_27 = new Class89(76, -1);

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "F")
	public static float aFloat28 = 1024.0F;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	public static int anInt751 = 0;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public static int anInt752 = -1;

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "[I")
	public static final int[] anIntArray39 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V")
	public static void method944() {
		@Pc(5) Class98 local5 = Static92.aClass98_9;
		synchronized (Static92.aClass98_9) {
			Static92.aClass98_9.method2615(5);
		}
		local5 = Static349.aClass98_58;
		synchronized (Static349.aClass98_58) {
			Static349.aClass98_58.method2615(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!lh;")
	public static Class119 method948(@OriginalArg(1) Component arg0) {
		return new Class119_Sub1(arg0, true);
	}
}
