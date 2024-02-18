import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static711 {

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
	public static int anInt10684;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IBI)V")
	public static void method9271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static577.method7615(arg1, arg0);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V")
	public static void method9272() {
		if (Static236.aClass270_2 == null) {
			return;
		}
		if (Static236.aClass270_2.anInt6789 == 1) {
			Static236.aClass270_2 = null;
			return;
		}
		if (Static236.aClass270_2.anInt6789 == 2) {
			Static637.method8382(Static340.aString53, 2, Static272.aClass390_3);
			Static236.aClass270_2 = null;
			return;
		}
	}
}
