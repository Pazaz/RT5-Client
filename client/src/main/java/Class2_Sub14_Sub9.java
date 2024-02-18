import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class2_Sub14_Sub9 extends Class2_Sub14 {

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
	private int anInt6815;

	@OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
	private int anInt6816;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
	private int anInt6818;

	@OriginalMember(owner = "client!oda", name = "o", descriptor = "I")
	private int anInt6820;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.method3493(this.anInt6818, this.anInt6820, this.anInt6816, this.anInt6815);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Class2_Sub21 arg0) {
		this.anInt6815 = arg0.method7349();
		this.anInt6816 = arg0.method7349();
		this.anInt6820 = arg0.method7396();
		this.anInt6818 = arg0.method7396();
	}
}
