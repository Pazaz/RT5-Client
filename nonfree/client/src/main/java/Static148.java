import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!el", name = "E", descriptor = "[[I")
	public static int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!el", name = "R", descriptor = "[[Lclient!hda;")
	public static Class158[][] aClass158ArrayArray1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!el", name = "Z", descriptor = "Ljava/lang/Class;")
	private static Class aClass7;

	@OriginalMember(owner = "client!el", name = "T", descriptor = "Z")
	public static final boolean aBoolean215 = false;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public static void method2429() {
		try {
			@Pc(26) Method local26 = (aClass7 == null ? (aClass7 = Class105.a("java.lang.Runtime")) : aClass7).getMethod("availableProcessors");
			if (local26 != null) {
				try {
					@Pc(30) Runtime local30 = Runtime.getRuntime();
					@Pc(36) Integer local36 = (Integer) local26.invoke(local30, (Object[]) null);
					Static495.anInt7422 = local36;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}
}
