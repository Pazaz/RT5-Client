import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ByteArray {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
	public static byte[] unwrap(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static371.method6258(local13) : local13;
		} else if (arg1 instanceof Class212) {
			@Pc(27) Class212 local27 = (Class212) arg1;
			return local27.method5546();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object wrap(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static141.aBoolean189) {
			try {
				@Pc(18) Class212 local18 = (Class212) Class.forName("Class212_Sub1").getDeclaredConstructor().newInstance();
				local18.method5547(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static141.aBoolean189 = true;
			}
		}
		return arg0;
	}

}
