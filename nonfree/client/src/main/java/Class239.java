import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class239 {

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public final int anInt6139;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	public final int anInt6140;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Z")
	public final boolean aBoolean464;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "S")
	public final short aShort73;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt6139 = arg0;
		this.aShort72 = (short) arg6;
		this.aByte97 = (byte) arg8;
		this.aByte98 = (byte) arg7;
		this.anInt6140 = arg10;
		this.aBoolean464 = arg9;
		this.aShort71 = (short) arg4;
		this.aShort73 = (short) arg5;
	}
}
