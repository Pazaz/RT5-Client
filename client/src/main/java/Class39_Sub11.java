import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class39_Sub11 extends Class39 {

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	private final int anInt4254;

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
	private final int anInt4253;

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
	private final int anInt4252;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
	private final int anInt4250;

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
	private final int anInt4251;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub11(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt4254 = arg0.g2();
		this.anInt4253 = arg0.g2();
		this.anInt4252 = arg0.g2();
		this.anInt4250 = arg0.g2();
		this.anInt4251 = arg0.g2();
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static319.method4595(this.anInt4254, false, 100, this.anInt4253, this.anInt4252, 100);
		Static471.method6408(this.anInt4251, this.anInt4250);
		Static421.aBoolean480 = true;
	}
}
