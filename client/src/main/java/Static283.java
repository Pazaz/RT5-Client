import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt5351;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Z")
	public static boolean aBoolean383;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	public static int anInt5352;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!r;")
	public static Class197 aClass197_68;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)V")
	public static void method4875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub2_Sub7 local16 = Static316.method5413(15, 0);
		local16.method2311();
		local16.anInt2290 = arg1;
		local16.anInt2289 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ml;Ljava/lang/Object;I)V")
	public static void method4876(@OriginalArg(0) SignedLink arg0, @OriginalArg(1) Object arg1) {
		if (arg0.eventQueue == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.eventQueue.peekEvent() != null; local11++) {
			Static231.method4023(1L);
		}
		if (arg1 != null) {
			arg0.eventQueue.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
