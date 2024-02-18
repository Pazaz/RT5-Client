import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class39 {

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	public final int anInt10553;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39(@OriginalArg(0) Packet arg0) {
		this.anInt10553 = arg0.g2();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)Z")
	public boolean method9158() {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	public abstract void method9161();
}
