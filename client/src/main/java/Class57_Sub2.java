import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	private int anInt3588;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
	private int anInt3593;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
	private int anInt3595;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	private int anInt3599;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	private final int anInt3600;

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
	private final int anInt3596;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
	private final int anInt3589;

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
	private int anInt3587;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class57_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3600 = (int) (arg7 * 4096.0F);
		this.anInt3596 = (int) (arg6 * 4096.0F);
		this.anInt3587 = this.anInt3589 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V")
	@Override
	protected final void add() {
		this.anInt3599 >>= 0x4;
		this.anInt3587 = this.anInt3589;
		if (this.anInt3599 < 0) {
			this.anInt3599 = 0;
		} else if (this.anInt3599 > 255) {
			this.anInt3599 = 255;
		}
		this.method3537(this.anInt3595++, (byte) this.anInt3599);
		this.anInt3599 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	@Override
	protected final void setup() {
		this.anInt3599 = 0;
		this.anInt3595 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V")
	@Override
	protected final void apply(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt3588 = this.anInt3596 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt3588 = this.anInt3588 * this.anInt3588 >> 12;
			this.anInt3593 = 4096;
			this.anInt3599 = this.anInt3588;
			return;
		}
		this.anInt3593 = this.anInt3588 * this.anInt3600 >> 12;
		this.anInt3588 = this.anInt3596 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt3593 < 0) {
			this.anInt3593 = 0;
		} else if (this.anInt3593 > 4096) {
			this.anInt3593 = 4096;
		}
		this.anInt3588 = this.anInt3588 * this.anInt3588 >> 12;
		this.anInt3588 = this.anInt3593 * this.anInt3588 >> 12;
		this.anInt3599 += this.anInt3587 * this.anInt3588 >> 12;
		this.anInt3587 = this.anInt3587 * this.anInt3589 >> 12;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)V")
	protected void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray36[arg0] = arg1;
	}
}
