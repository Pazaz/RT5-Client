import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface4 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method6813();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method6814(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIZZI)[I")
	int[] method6815(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFBIZ)[F")
	float[] method6816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!fa;")
	Class118 method6817(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIBF)[I")
	int[] method6818(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4);
}
