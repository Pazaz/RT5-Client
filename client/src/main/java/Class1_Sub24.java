import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
	public final int anInt4490;

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
	public final int anInt4493;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
	public final boolean aBoolean317;

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
	public final int anInt4491;

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
	public final int anInt4495;

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
	public final int anInt4496;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4490 = arg2;
		this.anInt4493 = arg4;
		this.aBoolean317 = arg5;
		this.anInt4491 = arg0;
		this.anInt4495 = arg3;
		this.anInt4496 = arg1;
	}
}
