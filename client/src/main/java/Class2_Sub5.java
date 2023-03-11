import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
	public final int anInt1007;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
	public final boolean aBoolean82;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
	public final int anInt1008;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public int anInt1005;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
	public final int anInt1009;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
	public final boolean aBoolean83;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
	public final int anInt1006;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "J")
	public final long aLong30;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
	public Class2_Sub5(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		this.anInt1007 = arg2;
		this.aBoolean82 = arg9;
		this.anInt1008 = arg4;
		this.anInt1005 = arg3;
		this.aString10 = arg0;
		this.anInt1009 = arg7;
		this.aBoolean83 = arg8;
		this.anInt1006 = arg6;
		this.aString11 = arg1;
		this.aLong30 = arg5;
	}
}
