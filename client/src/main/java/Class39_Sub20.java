import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class39_Sub20 extends Class39 {

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
	private final int anInt8594;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub20(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt8594 = arg0.method7382();
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static219.aClass236Array1[this.anInt8594].method5361();
	}
}
