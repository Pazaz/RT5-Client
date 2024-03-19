import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "Ljava/lang/String;")
	public static final String aString133 = "flash3:";

	@OriginalMember(owner = "client!k", name = "S", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[128][128];

	@OriginalMember(owner = "client!k", name = "T", descriptor = "I")
	public static int anInt3743 = -2;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "I")
	public static int anInt3744 = -1;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
	public static void method3263() {
		@Pc(13) Class215 local13 = Static28.aClass215_16;
		synchronized (Static28.aClass215_16) {
			Static28.aClass215_16.method6060();
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(II)V")
	public static void method3265(@OriginalArg(0) int arg0) {
		@Pc(5) Class202 local5 = Static199.aClass202_1;
		synchronized (Static199.aClass202_1) {
			Static301.anInt6298 = arg0;
		}
	}
}
