import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class162 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public final int anInt3922;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class162(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3922 = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)I")
	public int method3469() {
		return this.anInt3922;
	}

	@OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
