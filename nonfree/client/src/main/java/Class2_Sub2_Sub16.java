import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "J")
	public final long aLong233;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Z")
	public final boolean aBoolean552;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
	public final int anInt7318;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	public final int anInt7317;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
	public final int anInt7313;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
	public int anInt7314;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "J")
	public final long aLong234;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
	public final int anInt7316;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "Z")
	public final boolean aBoolean553;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "Z")
	public final boolean aBoolean551;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	public Class2_Sub2_Sub16(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aLong233 = arg5;
		this.aBoolean552 = arg8;
		this.anInt7318 = arg2;
		this.anInt7317 = arg4;
		this.anInt7313 = arg7;
		this.anInt7314 = arg3;
		this.aString87 = arg0;
		this.aLong234 = arg10;
		this.aString86 = arg1;
		this.anInt7316 = arg6;
		this.aBoolean553 = arg9;
		this.aBoolean551 = arg11;
	}
}
