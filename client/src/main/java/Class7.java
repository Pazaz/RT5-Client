import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class7 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!nr;II)Z")
	public abstract boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	public abstract Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)Z")
	public abstract boolean method5952();

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	public abstract void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!nr;I)V")
	public abstract void method5957(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	public abstract void method5958();
}
