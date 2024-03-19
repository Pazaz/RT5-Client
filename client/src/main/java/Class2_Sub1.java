import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "B")
	public final byte aByte12;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "B")
	public final byte aByte13;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public int anInt1194;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "B")
	public final byte aByte10;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "B")
	public final byte aByte11;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "[S")
	public final short[] aShortArray12;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte12 = (byte) arg0;
		this.aByte13 = (byte) arg1;
		this.anInt1194 = arg2;
		this.aByte10 = (byte) arg3;
		this.aByte11 = (byte) arg4;
		this.aShortArray12 = arg5;
		this.aByteArray6 = arg6;
	}
}
