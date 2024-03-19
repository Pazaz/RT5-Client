import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "[I")
	public static final int[] anIntArray554 = new int[32];

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public int anInt6726;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
	public int anInt6728;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	public int anInt6729;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	public int anInt6730;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
	public int anInt6734;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
	public int anInt6735;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
	public int anInt6736;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
	public int anInt6738;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
	public int anInt6739;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
	public int anInt6740;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
	public int anInt6741;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray554[local8] = local6 - 1;
			local6 += local6;
		}
	}
}
