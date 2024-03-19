import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public int anInt4150;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	public int anInt4154;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
	public int anInt4156;

	@OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
	public int anInt4157;

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
	public int anInt4155 = -1;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V")
	public Class1_Sub21(@OriginalArg(0) int arg0) {
		this.anInt4155 = arg0;
	}
}
