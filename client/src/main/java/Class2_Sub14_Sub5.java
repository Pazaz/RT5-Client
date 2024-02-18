import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class2_Sub14_Sub5 extends Class2_Sub14 {

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "B")
	private byte aByte72;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
	private int anInt4361 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.method3489(this.aByte72, this.anInt4361);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Class2_Sub21 arg0) {
		this.anInt4361 = arg0.method7382();
		this.aByte72 = arg0.method7377();
	}
}
