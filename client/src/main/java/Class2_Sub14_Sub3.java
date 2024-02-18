import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public final class Class2_Sub14_Sub3 extends Class2_Sub14 {

	@OriginalMember(owner = "client!dga", name = "l", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.aString45 = this.aString18;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Packet arg0) {
		this.aString18 = arg0.gjstr();
		arg0.g4();
	}
}
