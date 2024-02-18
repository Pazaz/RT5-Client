import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!fw", name = "D", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_74 = new Class225(10, 0);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)V")
	public static void method2897(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class2 local11 = Static291.aClass28_24.method736(); local11 != null; local11 = Static291.aClass28_24.method740()) {
			if ((long) arg0 == (local11.aLong328 >> 48 & 0xFFFFL)) {
				local11.method9457();
			}
		}
	}
}
