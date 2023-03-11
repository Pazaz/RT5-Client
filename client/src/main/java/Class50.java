import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class50 {

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public final int anInt1553;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class50(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString15 = arg0;
		this.anInt1553 = arg1;
	}

	@OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
