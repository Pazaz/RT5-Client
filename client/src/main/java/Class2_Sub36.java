import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public final int anInt5890;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
	public final int anInt5888;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "Z")
	public final boolean aBoolean451;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "I")
	public final int anInt5891;

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
	public final int anInt5895;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
	public final int anInt5893;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5890 = arg4;
		this.anInt5888 = arg1;
		this.aBoolean451 = arg5;
		this.anInt5891 = arg3;
		this.anInt5895 = arg0;
		this.anInt5893 = arg2;
	}
}
