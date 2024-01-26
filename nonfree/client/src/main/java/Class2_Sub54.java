import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class2_Sub54 extends Class2 {

	@OriginalMember(owner = "client!v", name = "o", descriptor = "I")
	public final int anInt9846;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "I")
	public final int anInt9844;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(II)V")
	public Class2_Sub54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9846 = arg1;
		this.anInt9844 = arg0;
	}
}
