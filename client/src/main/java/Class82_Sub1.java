import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!he", name = "x", descriptor = "I")
	private int anInt3139;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "I")
	private int anInt3140;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "[I")
	private final int[] anIntArray230 = new int[this.anInt3130];

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class82_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt3130; local15++) {
			this.anIntArray230[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method2665() {
		this.anInt3140 = Math.abs(this.anInt3140);
		if (this.anInt3140 >= 4096) {
			this.anInt3140 = 4095;
		}
		this.method2666(this.anInt3139++, (byte) (this.anInt3140 >> 4));
		this.anInt3140 = 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3140 += this.anIntArray230[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	protected void method2666(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray28[this.anInt3139++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	@Override
	protected final void method2657() {
		this.anInt3139 = 0;
		this.anInt3140 = 0;
	}
}
