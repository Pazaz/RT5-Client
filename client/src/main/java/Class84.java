import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class84 {

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString22;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "J")
	public final long aLong91;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public final int anInt2331;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString21;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
	public final int anInt2329;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		this.aString22 = arg1;
		this.aLong91 = arg4;
		this.anInt2331 = arg2;
		this.aString21 = arg3;
		this.anInt2329 = arg0;
	}
}
