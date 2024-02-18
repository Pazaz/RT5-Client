import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	private int anInt6516;

	@OriginalMember(owner = "client!hga", name = "D", descriptor = "I")
	private int anInt6520;

	@OriginalMember(owner = "client!hga", name = "w", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!hga", name = "z", descriptor = "I")
	private int anInt6522;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	private int anInt6523;

	@OriginalMember(owner = "client!hga", name = "B", descriptor = "I")
	private final int anInt6521;

	@OriginalMember(owner = "client!hga", name = "E", descriptor = "I")
	private final int anInt6517;

	@OriginalMember(owner = "client!hga", name = "x", descriptor = "I")
	private final int anInt6515;

	@OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
	private int anInt6513;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6521 = (int) (arg6 * 4096.0F);
		this.anInt6517 = (int) (arg7 * 4096.0F);
		this.anInt6513 = this.anInt6515 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBB)V")
	protected void method5813(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray77[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6523 = this.anInt6521 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt6522 = 4096;
			this.anInt6523 = this.anInt6523 * this.anInt6523 >> 12;
			this.anInt6516 = this.anInt6523;
			return;
		}
		this.anInt6522 = this.anInt6523 * this.anInt6517 >> 12;
		this.anInt6523 = this.anInt6521 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt6522 < 0) {
			this.anInt6522 = 0;
		} else if (this.anInt6522 > 4096) {
			this.anInt6522 = 4096;
		}
		this.anInt6523 = this.anInt6523 * this.anInt6523 >> 12;
		this.anInt6523 = this.anInt6523 * this.anInt6522 >> 12;
		this.anInt6516 += this.anInt6513 * this.anInt6523 >> 12;
		this.anInt6513 = this.anInt6515 * this.anInt6513 >> 12;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5808() {
		this.anInt6513 = this.anInt6515;
		this.anInt6516 >>= 0x4;
		if (this.anInt6516 < 0) {
			this.anInt6516 = 0;
		} else if (this.anInt6516 > 255) {
			this.anInt6516 = 255;
		}
		this.method5813(this.anInt6520++, (byte) this.anInt6516);
		this.anInt6516 = 0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5812() {
		this.anInt6516 = 0;
		this.anInt6520 = 0;
	}
}
