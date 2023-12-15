import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class57_Sub1_Sub1 extends Class57_Sub1 {

	@OriginalMember(owner = "client!v", name = "x", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class57_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
	@Override
	protected void method6020(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray96[local15] = local12;
		this.aByteArray96[local16] = local12;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)[B")
	public byte[] method6022() {
		this.aByteArray96 = new byte[524288];
		this.noise();
		return this.aByteArray96;
	}
}
