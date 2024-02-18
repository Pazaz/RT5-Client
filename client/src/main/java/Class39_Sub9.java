import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class39_Sub9 extends Class39 {

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private final int anInt3695;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private final int anInt3692;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub9(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt3695 = arg0.g2();
		this.anInt3692 = arg0.g1();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static482.method6481(this.anInt3692, this.anInt3695, 0);
	}
}
