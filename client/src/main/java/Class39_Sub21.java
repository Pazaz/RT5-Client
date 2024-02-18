import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class39_Sub21 extends Class39 {

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
	private final int anInt8669;

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
	private final int anInt8671;

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
	private final int anInt8668;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub21(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt8669 = arg0.method7382();
		this.anInt8671 = arg0.method7382();
		this.anInt8668 = arg0.method7396();
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		@Pc(8) Class236 local8 = Static219.aClass236Array1[this.anInt8669];
		@Pc(13) Class231 local13 = Static183.aClass231Array1[this.anInt8671];
		local13.method5271(local8, this.anInt8668);
	}
}
