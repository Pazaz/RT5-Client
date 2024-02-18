import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	private final int anInt1832;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "Ljava/lang/String;")
	private final String aString15;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	private final int anInt1834;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
	private final int anInt1833;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub2(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt1832 = arg0.method7382();
		this.aString15 = arg0.method7358();
		this.anInt1834 = arg0.method7349();
		this.anInt1833 = arg0.method7382();
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static219.aClass236Array1[this.anInt1832].method5363().method9313(this.anInt1833, this.aString15, 0, this.anInt1834);
	}
}
