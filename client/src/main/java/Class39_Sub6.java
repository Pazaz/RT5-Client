import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class39_Sub6 extends Class39 {

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	private final int anInt3025;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	private final int anInt3020;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Ljava/lang/String;")
	private final String aString33;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	private final int anInt3026;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	private final int anInt3021;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub6(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt3025 = arg0.g2();
		this.anInt3020 = arg0.g2();
		this.aString33 = arg0.gjstr();
		this.anInt3026 = arg0.g4();
		this.anInt3021 = arg0.g2();
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		Static540.method6539(Static394.anInt6176, this.anInt3021, this.aString33, this.anInt3026, Static102.method2025(Static394.anInt6176, -29754, this.anInt3020, this.anInt3025), this.anInt3025, this.anInt3020);
	}
}
