import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
	public int anInt3122;

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
	public int anInt3124;

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
	public int anInt3125;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
	public int anInt3130;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
	public int anInt3131 = -1;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20(@OriginalArg(0) int arg0) {
		this.anInt3131 = arg0;
	}
}
