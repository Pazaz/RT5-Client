import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class35_Sub1_Sub2 extends Class35_Sub1 {

	@OriginalMember(owner = "client!mba", name = "H", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	public Class35_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method5435(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(22) byte local22 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(26) int local26 = arg0 * 2;
		@Pc(29) int local29 = local26;
		@Pc(30) int local30 = local26 + 1;
		this.aByteArray64[local29] = local22;
		this.aByteArray64[local30] = local22;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)[B")
	public byte[] method5438() {
		this.aByteArray64 = new byte[524288];
		this.method5806();
		return this.aByteArray64;
	}
}
