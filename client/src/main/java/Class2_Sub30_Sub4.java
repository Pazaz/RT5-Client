import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class2_Sub30_Sub4 extends Class2_Sub30 {

	@OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
	private int anInt8618;

	@OriginalMember(owner = "client!sea", name = "w", descriptor = "Ljava/lang/String;")
	private String aString107;

	@OriginalMember(owner = "client!sea", name = "s", descriptor = "B")
	private byte aByte131;

	@OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
	private int anInt8616 = -1;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!ge;I)V")
	@Override
	public void method7647(@OriginalArg(0) Class2_Sub21 arg0) {
		this.anInt8616 = arg0.method7382();
		this.aByte131 = arg0.method7377();
		this.anInt8618 = arg0.method7382();
		arg0.method7398();
		this.aString107 = arg0.method7358();
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lclient!rfa;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class2_Sub47 arg0) {
		@Pc(9) Class34 local9 = arg0.aClass34Array1[this.anInt8616];
		local9.anInt783 = this.anInt8618;
		local9.aByte9 = this.aByte131;
		local9.aString2 = this.aString107;
	}
}
