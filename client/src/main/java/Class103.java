import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class103 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZI)I")
	public int method2416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(26) int local26 = Static380.anInt5979 > arg0 ? Static380.anInt5979 : arg0;
		if (Static520.aClass103_13 == this) {
			return 0;
		} else if (Static488.aClass103_12 == this) {
			return local26 - arg1;
		} else if (Static130.aClass103_2 == this) {
			return (local26 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
