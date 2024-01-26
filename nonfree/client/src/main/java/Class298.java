import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class298 {

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public final int anInt7577;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	public final int anInt7575;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "S")
	public final short aShort99;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
	public final int anInt7573;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "B")
	public final byte aByte123;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
	public final int anInt7576;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "S")
	public final short aShort98;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	public final int anInt7574;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "Z")
	public final boolean aBoolean577;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort100 = (short) arg6;
		this.anInt7577 = arg3;
		this.anInt7575 = arg0;
		this.aShort99 = (short) arg4;
		this.anInt7573 = arg1;
		this.aByte123 = (byte) arg8;
		this.anInt7576 = arg11;
		this.aShort98 = (short) arg5;
		this.anInt7574 = arg2;
		this.aBoolean577 = arg10;
	}
}
