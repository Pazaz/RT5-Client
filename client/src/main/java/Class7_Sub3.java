import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class Class7_Sub3 extends Class7 implements Interface6 {

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	public final int anInt6679;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	public int anInt6685;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public final int anInt6678;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "I")
	public int anInt6684;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public int anInt6683;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	protected final int anInt6681;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	public int anInt6680;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class7_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6679 = arg3;
		this.anInt6685 = arg2;
		this.anInt6678 = arg6;
		this.anInt6684 = arg4;
		this.anInt6683 = arg0;
		this.anInt6681 = arg1;
		this.anInt6680 = arg5;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public final void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method5952() {
		return false;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	@Override
	public final void method5958() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)I")
	public abstract int method5680();
}
