import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class39_Sub5 extends Class39 {

	@OriginalMember(owner = "client!fka", name = "k", descriptor = "I")
	private final int anInt3000;

	@OriginalMember(owner = "client!fka", name = "m", descriptor = "I")
	private final int anInt2996;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub5(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt3000 = arg0.method7382();
		this.anInt2996 = arg0.method7349();
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static323.anInt5120 = Static399.anInt6215;
		Static493.anInt7370 = Static186.anInt3059;
		Static582.anInt8628 = Static337.anInt5556;
		Static4.anInt84 = this.anInt3000 + Static333.anInt5455;
		Static201.anInt8407 = Static622.anInt7737;
		Static115.anInt2259 = Static333.anInt5455;
		Static622.anInt7737 = this.anInt2996 & 0xFF;
		Static337.anInt5556 = this.anInt2996 >>> 16 & 0xFF;
		Static399.anInt6215 = this.anInt2996 >>> 24;
		Static186.anInt3059 = this.anInt2996 >>> 8 & 0xFF;
	}
}
