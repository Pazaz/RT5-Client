import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class177 {

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	public int anInt4269;

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
	public int anInt4271;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public int anInt4273;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	public int anInt4275;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	public int anInt4276;

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
	public int anInt4277;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
	public int anInt4279;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	public int anInt4280;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
	public int anInt4281;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	public int anInt4283;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!iea;)Z")
	public boolean method3860(@OriginalArg(1) Class177 arg0) {
		return arg0.anInt4271 == this.anInt4271 && arg0.anInt4278 == this.anInt4278 && arg0.anInt4273 == this.anInt4273;
	}
}
