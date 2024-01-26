import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class2_Sub14_Sub6 extends Class2_Sub14 {

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!ku", name = "r", descriptor = "Z")
	private boolean aBoolean430;

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "B")
	private byte aByte92;

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "B")
	private byte aByte93;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.aBoolean307 = this.aBoolean430;
		arg0.aByte67 = this.aByte90;
		arg0.aByte66 = this.aByte93;
		arg0.aByte65 = this.aByte91;
		arg0.aByte68 = this.aByte92;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Class2_Sub21 arg0) {
		this.aBoolean430 = arg0.method7396() == 1;
		this.aByte92 = arg0.method7377();
		this.aByte90 = arg0.method7377();
		this.aByte93 = arg0.method7377();
		this.aByte91 = arg0.method7377();
	}
}
