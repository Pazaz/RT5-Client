import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public static int anInt666 = 0;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	public static final int[] anIntArray35 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!di", name = "e", descriptor = "I")
	public static final int anInt667 = 1405;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method886() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static201.anInt3699 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
	public static void method890() {
		for (@Pc(1) int local1 = 0; local1 < Static378.anInt7077; local1++) {
			@Pc(6) Entity local6 = Static98.aClass11_Sub5Array1[local1];
			Static331.method5659(local6);
			Static98.aClass11_Sub5Array1[local1] = null;
		}
		Static378.anInt7077 = 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V")
	public static void method891(@OriginalArg(1) boolean arg0) {
		Static129.method2435(GameShell.canvasHeight, Static139.anInt2595, arg0, GameShell.canvasWidth);
	}
}
