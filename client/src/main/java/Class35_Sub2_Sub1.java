import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class35_Sub2_Sub1 extends Class35_Sub2 {

	@OriginalMember(owner = "client!kba", name = "M", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V")
	public Class35_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method5813(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray52[local10] = -1;
		@Pc(22) int local22 = arg1 & 0xFF;
		this.aByteArray52[local11] = (byte) (local22 * 3 >> 5);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIII)[B")
	public byte[] method4596() {
		this.aByteArray52 = new byte[524288];
		this.method5806();
		return this.aByteArray52;
	}
}
