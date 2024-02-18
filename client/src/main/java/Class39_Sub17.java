import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class39_Sub17 extends Class39 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	private final int anInt7622;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[I")
	private final int[] anIntArray611;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	private final int anInt7624;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	private final int anInt7625;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub17(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt7622 = arg0.g2();
		this.anIntArray611 = new int[4];
		this.anInt7624 = arg0.gSmart2or4null();
		Static734.method7690(this.anIntArray611, 0, this.anIntArray611.length, this.anInt7624);
		this.anInt7625 = arg0.g4();
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	@Override
	public void method9161() {
		@Pc(10) Class8_Sub2_Sub1_Sub2 local10 = Static219.aClass236Array1[this.anInt7622].method5363();
		if (this.anInt7625 == 0) {
			Static651.method8515(this.anIntArray611, 0, false, local10);
		} else {
			Static310.method4505(new int[] { this.anInt7625 }, new int[] { this.anInt7624 }, new int[1], local10);
		}
	}
}
