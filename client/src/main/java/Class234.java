import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class234 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public int anInt6562;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public int anInt6563;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public int anInt6564;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class234() {
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class234(@OriginalArg(0) Class234 arg0) {
		this.anInt6564 = arg0.anInt6564;
		this.anInt6562 = arg0.anInt6562;
		this.anInt6563 = arg0.anInt6563;
	}
}
