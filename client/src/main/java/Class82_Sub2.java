import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class Class82_Sub2 extends Class82 {

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
	private int anInt2788;

	@OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
	private int anInt2795;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
	private int anInt2796;

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!rq", name = "J", descriptor = "I")
	private int anInt2797;

	@OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
	private final int anInt2798;

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
	private final int anInt2789;

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "I")
	private final int anInt2799;

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
	private int anInt2791;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class82_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2798 = (int) (arg6 * 4096.0F);
		this.anInt2789 = (int) (arg7 * 4096.0F);
		this.anInt2791 = this.anInt2799 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2796 = this.anInt2798 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt2797 = 4096;
			this.anInt2796 = this.anInt2796 * this.anInt2796 >> 12;
			this.anInt2795 = this.anInt2796;
			return;
		}
		this.anInt2797 = this.anInt2789 * this.anInt2796 >> 12;
		if (this.anInt2797 < 0) {
			this.anInt2797 = 0;
		} else if (this.anInt2797 > 4096) {
			this.anInt2797 = 4096;
		}
		this.anInt2796 = this.anInt2798 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt2796 = this.anInt2796 * this.anInt2796 >> 12;
		this.anInt2796 = this.anInt2796 * this.anInt2797 >> 12;
		this.anInt2795 += this.anInt2791 * this.anInt2796 >> 12;
		this.anInt2791 = this.anInt2791 * this.anInt2799 >> 12;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	@Override
	protected final void method2657() {
		this.anInt2788 = 0;
		this.anInt2795 = 0;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method2665() {
		this.anInt2795 >>= 0x4;
		this.anInt2791 = this.anInt2799;
		if (this.anInt2795 < 0) {
			this.anInt2795 = 0;
		} else if (this.anInt2795 > 255) {
			this.anInt2795 = 255;
		}
		this.method2313(this.anInt2788++, (byte) this.anInt2795);
		this.anInt2795 = 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V")
	protected void method2313(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray22[arg0] = arg1;
	}
}
