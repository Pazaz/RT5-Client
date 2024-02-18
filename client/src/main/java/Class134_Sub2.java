import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class134_Sub2 extends Class134 implements Interface1 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
	private int anInt10821;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!qha;I[BI)V")
	public Class134_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt10821 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
	@Override
	public int method9354() {
		return this.anInt10821;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method9355(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method9351(arg1, arg0);
		this.anInt10821 = 5123;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	@Override
	public int method9353() {
		return 0;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)J")
	@Override
	public long method9352() {
		return super.aBuffer3.getAddress();
	}
}
