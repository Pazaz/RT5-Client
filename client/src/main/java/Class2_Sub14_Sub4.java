import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public final class Class2_Sub14_Sub4 extends Class2_Sub14 {

	@OriginalMember(owner = "client!gka", name = "l", descriptor = "Ljava/lang/String;")
	private String aString37 = null;

	@OriginalMember(owner = "client!gka", name = "s", descriptor = "J")
	private long aLong118 = -1L;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.method3486(this.aString37, this.aLong118);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos--;
			this.aLong118 = arg0.g8();
		}
		this.aString37 = arg0.fastgjstr();
	}
}
