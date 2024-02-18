import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class39_Sub15 extends Class39 {

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private final int anInt5990;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	private final int anInt5992;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	private final int anInt5993;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	private final int anInt5994;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub15(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt5990 = arg0.g2();
		this.anInt5992 = arg0.g1();
		this.anInt5993 = arg0.g1();
		this.anInt5994 = arg0.g1();
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static186.method2818(this.anInt5990, this.anInt5994, this.anInt5993, 0, this.anInt5992, false);
	}
}
