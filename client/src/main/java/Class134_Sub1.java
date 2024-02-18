import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class134_Sub1 extends Class134 implements Interface12 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
	private int anInt3102;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!qha;I[BI)V")
	public Class134_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3102 = arg1;
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!qha;ILclient!jaclib/memory/Buffer;)V")
	public Class134_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt3102 = arg1;
	}

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I")
	@Override
	public int method5001() {
		return this.anInt3102;
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)J")
	@Override
	public long method5003() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)I")
	@Override
	public int method5004() {
		return 0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method5002(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method9351(arg0, arg1);
		this.anInt3102 = arg2;
	}
}
