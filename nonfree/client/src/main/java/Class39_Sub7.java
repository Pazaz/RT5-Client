import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class39_Sub7 extends Class39 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	private final int anInt3415;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	private final int anInt3414;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub7(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt3415 = arg0.method7382();
		this.anInt3414 = arg0.method7346();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		@Pc(8) Class394 local8 = Static507.aClass394Array1[this.anInt3415];
		Static198.method2953(local8.anInt10416, local8.anInt10422, local8.anInt10415, this.anInt3414, local8.anInt10419, local8.anInt10412, Static461.anIntArray555[local8.anInt10415]);
	}
}
