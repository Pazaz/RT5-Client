import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class2_Sub17 extends Node {

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
	public final int anInt2535;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
	public final int anInt2539;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "Z")
	public final boolean aBoolean183;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
	public final int anInt2537;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
	public final int anInt2538;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
	public final int anInt2541;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt2535 = arg3;
		this.anInt2539 = arg1;
		this.aBoolean183 = arg5;
		this.anInt2537 = arg4;
		this.anInt2538 = arg2;
		this.anInt2541 = arg0;
	}
}
