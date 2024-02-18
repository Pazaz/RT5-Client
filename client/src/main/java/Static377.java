import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
	public static volatile int anInt5930 = -1;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] method5321(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return arg0 ? Static163.method8849(local14) : local14;
		} else if (arg1 instanceof Class175) {
			@Pc(29) Class175 local29 = (Class175) arg1;
			return local29.method3850();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
