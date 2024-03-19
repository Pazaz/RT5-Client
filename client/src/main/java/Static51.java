import java.util.Random;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public static int anInt1571;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Lclient!nm;")
	public static Class2_Sub5 method1362() {
		@Pc(13) Class2_Sub5 local13 = (Class2_Sub5) Static160.aClass58_11.method1674();
		if (local13 == null) {
			return new Class2_Sub5();
		} else {
			Static275.anInt2790--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
	public static void method1364() {
		@Pc(5) Class215 local5 = Static84.aClass215_35;
		synchronized (Static84.aClass215_35) {
			Static84.aClass215_35.method6063(5);
		}
	}
}
