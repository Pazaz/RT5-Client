import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class378 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	public int anInt9744;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public int anInt9745;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public int anInt9746;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public int anInt9747;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class378() {
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class378(@OriginalArg(0) Class378 arg0) {
		this.anInt9746 = arg0.anInt9746;
		this.anInt9747 = arg0.anInt9747;
		this.anInt9745 = arg0.anInt9745;
		this.anInt9744 = arg0.anInt9744;
	}
}
