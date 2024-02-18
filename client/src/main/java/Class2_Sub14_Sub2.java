import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class2_Sub14_Sub2 extends Class2_Sub14 {

	@OriginalMember(owner = "client!df", name = "t", descriptor = "J")
	private long aLong78 = -1L;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Ljava/lang/String;")
	private String aString17 = null;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.method3477(this.aString17, this.aLong78, 0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Class2_Sub21 arg0) {
		if (arg0.method7396() != 255) {
			arg0.anInt8388--;
			this.aLong78 = arg0.method7398();
		}
		this.aString17 = arg0.method7403();
		if (Static148.aBoolean215) {
			System.out.println("memberhash:" + this.aLong78 + " membername:" + this.aString17);
		}
	}
}
