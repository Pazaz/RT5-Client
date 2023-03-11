import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class26 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class26() {
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!bn;)V")
	public Class26(@OriginalArg(0) Class26 arg0) {
		this.anInt733 = arg0.anInt733;
		this.anInt730 = arg0.anInt730;
		this.anInt731 = arg0.anInt731;
		this.anInt732 = arg0.anInt732;
	}
}
