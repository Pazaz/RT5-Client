import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	protected int anInt3486;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	protected final int anInt3484;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
	public final int anInt3482;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	protected int anInt3485;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIII)V")
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3486 = arg0;
		this.anInt3484 = arg1;
		this.anInt3482 = arg3;
		this.anInt3485 = arg2;
	}
}
