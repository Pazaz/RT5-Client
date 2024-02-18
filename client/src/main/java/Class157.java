import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class157 {

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	private final int anInt3722;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!wda;")
	private final Class397 aClass397_6;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	public final int anInt3729;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public final int anInt3732;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IILclient!wda;)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class397 arg2) {
		this.anInt3722 = arg1;
		this.aClass397_6 = arg2;
		this.anInt3729 = arg0;
		this.anInt3732 = this.anInt3722 * this.aClass397_6.anInt10568;
		if (this.anInt3729 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
