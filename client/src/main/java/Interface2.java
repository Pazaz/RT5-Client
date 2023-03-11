import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public interface Interface2 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(FIIZII)[I")
	int[] method2656(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Z")
	boolean method2657(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Lclient!uc;")
	Class229 method2658(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIIFI)[I")
	int[] method2659(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BZIIFI)[F")
	float[] method2660(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);
}
