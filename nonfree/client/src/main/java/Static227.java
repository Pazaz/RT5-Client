import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!sia;")
	public static Class339 aClass339_18 = new Class339();

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt3694 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public static void method3354() {
		for (@Pc(1) int local1 = 0; local1 < Static226.aClass46Array7.length; local1++) {
			Static226.aClass46Array7[local1].method1101();
		}
		Static226.aClass46Array7 = null;
	}
}
