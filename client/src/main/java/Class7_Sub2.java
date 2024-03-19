import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!br", name = "s", descriptor = "I")
	protected final int anInt6407;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	protected int anInt6405;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	public final int anInt6404;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	protected int anInt6403;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(IIII)V")
	protected Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6407 = arg1;
		this.anInt6405 = arg0;
		this.anInt6404 = arg3;
		this.anInt6403 = arg2;
	}
}
