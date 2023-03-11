import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public int anInt5883;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "B")
	public final byte aByte63;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[S")
	public final short[] aShortArray116;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "[B")
	public final byte[] aByteArray76;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class12_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte62 = (byte) arg0;
		this.aByte61 = (byte) arg1;
		this.anInt5883 = arg2;
		this.aByte63 = (byte) arg3;
		this.aByte64 = (byte) arg4;
		this.aShortArray116 = arg5;
		this.aByteArray76 = arg6;
	}
}
