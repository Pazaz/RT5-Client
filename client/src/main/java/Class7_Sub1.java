import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	public int anInt7034;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "S")
	public short aShort93;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	public int anInt7032;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Z")
	public final boolean aBoolean505;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public int anInt7031;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	public int anInt7027;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort93 = (short) arg4;
		this.aByte73 = arg9;
		this.anInt7032 = (short) arg3;
		this.aBoolean505 = arg8;
		this.aByte72 = (byte) arg0;
		this.aShort92 = (short) arg5;
		this.aShort91 = (short) arg6;
		this.aShort90 = (short) arg7;
		this.anInt7031 = (short) arg2;
		this.anInt7027 = (short) arg1;
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)I")
	public abstract int method5961();

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(B)V")
	public void method5963() {
	}
}
