import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class2_Sub14_Sub7 extends Class2_Sub14 {

	@OriginalMember(owner = "client!lda", name = "s", descriptor = "Ljava/lang/String;")
	private String aString57 = null;

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
	private int anInt5770 = 0;

	@OriginalMember(owner = "client!lda", name = "p", descriptor = "J")
	private long aLong176 = -1L;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8617(@OriginalArg(0) Class164 arg0) {
		arg0.method3477(this.aString57, this.aLong176, this.anInt5770);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8615(@OriginalArg(1) Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos--;
			this.aLong176 = arg0.g8();
		}
		this.aString57 = arg0.fastgjstr();
		this.anInt5770 = arg0.g2();
		if (Static148.aBoolean215) {
			System.out.println("memberhash:" + this.aLong176 + " membername:" + this.aString57);
		}
	}
}
