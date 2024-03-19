import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	private Class1_Sub5() {
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub5(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString32 = arg0;
	}
}
