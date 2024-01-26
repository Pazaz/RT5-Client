import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class8_Sub10 extends Class8 {

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "B")
	public final byte aByte138;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "B")
	public final byte aByte139;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
	public int anInt9770;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "B")
	public final byte aByte137;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "B")
	public final byte aByte136;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[S")
	public final short[] aShortArray133;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "[B")
	public final byte[] aByteArray104;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIII[S[B)V")
	public Class8_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte138 = (byte) arg0;
		this.aByte139 = (byte) arg1;
		this.anInt9770 = arg2;
		this.aByte137 = (byte) arg3;
		this.aByte136 = (byte) arg4;
		this.aShortArray133 = arg5;
		this.aByteArray104 = arg6;
	}
}
