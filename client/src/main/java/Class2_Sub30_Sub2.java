import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class2_Sub30_Sub2 extends Class2_Sub30 {

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "B")
	private byte aByte94;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "B")
	private byte aByte95;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!rfa;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class2_Sub47 arg0) {
		if (this.aString56 != null) {
			arg0.aByte127 = this.aByte95;
			arg0.aByte128 = this.aByte94;
		}
		arg0.aString101 = this.aString56;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ge;I)V")
	@Override
	public void method7647(@OriginalArg(0) Class2_Sub21 arg0) {
		this.aString56 = arg0.method7403();
		if (this.aString56 != null) {
			arg0.method7396();
			this.aByte94 = arg0.method7377();
			this.aByte95 = arg0.method7377();
		}
	}
}
