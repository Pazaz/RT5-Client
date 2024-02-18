import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class377 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString114;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public final int anInt9720;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class377(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aString114 = arg0;
		this.anInt9720 = arg2;
	}

	@OriginalMember(owner = "client!ul", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
