import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!a")
public abstract class Class261 {

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "Z")
	private static boolean aBoolean494;

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "([BZ)Ljava/lang/Object;")
	public static Object method6559(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !aBoolean494) {
			try {
				@Pc(14) Class261 local14 = (Class261) Class.forName("d").getDeclaredConstructor().newInstance();
				local14.method6563(arg0);
				return local14;
			} catch (@Pc(20) Throwable local20) {
				aBoolean494 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "(Ljava/lang/Object;Z)[B")
	public static byte[] method6560(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(9) byte[] local9 = (byte[]) arg0;
			return arg1 ? method6561(local9) : local9;
		} else if (arg0 instanceof Class261) {
			@Pc(22) Class261 local22 = (Class261) arg0;
			return local22.method6562();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "([B)[B")
	private static byte[] method6561(@OriginalArg(0) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(5) byte[] local5 = new byte[local2];
		Class271.method6597(arg0, 0, local5, 0, local2);
		return local5;
	}

	@OriginalMember(owner = "unpackclass!a", name = "a", descriptor = "()[B")
	protected abstract byte[] method6562();

	@OriginalMember(owner = "unpackclass!a", name = "b", descriptor = "([B)V")
	protected abstract void method6563(@OriginalArg(0) byte[] arg0);
}
