import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public abstract class Timer {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lclient!as;")
	public static Timer create() {
		try {
			return new JagmiscTimer();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Timer) Class.forName("NanoTimer").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new MillisTimer();
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
	public abstract long method4405();

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public abstract void method4408();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)I")
	public abstract int sleep(@OriginalArg(1) int arg0);
}
