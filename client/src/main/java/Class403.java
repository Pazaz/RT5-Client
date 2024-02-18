import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class403 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I")
	public int method9332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static680.anInt10289 > arg0 ? Static680.anInt10289 : arg0;
		if (Static555.aClass403_14 == this) {
			return 0;
		} else if (Static169.aClass403_1 == this) {
			return local15 - arg1;
		} else if (Static710.aClass403_13 == this) {
			return (local15 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
