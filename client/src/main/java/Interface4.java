import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public interface Interface4 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!dp;")
	Class50 method165(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)Z")
	boolean method166(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZIFI)[I")
	int[] method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBZFII)[F")
	float[] method168(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(FIIIZZ)[I")
	int[] method169(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4);
}
