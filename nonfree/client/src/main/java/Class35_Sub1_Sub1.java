import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class35_Sub1_Sub1 extends Class35_Sub1 {

	@OriginalMember(owner = "client!bda", name = "G", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
	public Class35_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method5435(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg0 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray10[local27] = local20;
		this.aByteArray10[local28] = local20;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIII)[B")
	public byte[] method979() {
		this.aByteArray10 = new byte[524288];
		this.method5806();
		return this.aByteArray10;
	}
}
