import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "[J")
	public static final long[] recentMessages = new long[100];

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
	public static int anInt6550 = -1;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public static void method5888() {
		PlayerList.anInt751 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static231.aClass2_Sub4Array1[local14] = null;
			Static335.aByteArray92[local14] = 1;
		}
	}
}
