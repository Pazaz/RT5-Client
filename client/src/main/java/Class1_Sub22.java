import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	public final int anInt4307;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	public int anInt4308;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Ljava/lang/String;")
	public String aString159;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "J")
	public final long aLong126;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public final int anInt4304;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public final int anInt4310;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString158;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class1_Sub22(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4307 = arg6;
		this.anInt4308 = arg3;
		this.aString159 = arg1;
		this.aLong126 = arg4;
		this.anInt4304 = arg2;
		this.anInt4310 = arg5;
		this.aString158 = arg0;
	}
}
