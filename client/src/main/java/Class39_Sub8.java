import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class39_Sub8 extends Class39 {

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString39;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	private final int anInt3635;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub8(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.aString39 = arg0.method7358();
		this.anInt3635 = arg0.method7382();
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		if (Static717.anInt10817 != -1) {
			Static472.method6427(Static717.anInt10817, this.aString39, this.anInt3635);
		}
	}
}
