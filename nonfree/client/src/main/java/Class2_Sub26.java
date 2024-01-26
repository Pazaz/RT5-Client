import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "[I")
	public final int[] anIntArray318;

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString47;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub26(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anIntArray318 = new int[arg1];
		this.aString47 = arg0;
	}
}
