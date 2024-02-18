import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class184 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "I")
	public final int anInt4573;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public final int anInt4575;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "I")
	public final int anInt4577;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	public final int anInt4576;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIII)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4573 = arg3;
		this.anInt4575 = arg0;
		this.anInt4577 = arg2;
		this.anInt4576 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
