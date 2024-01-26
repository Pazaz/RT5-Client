import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public interface Interface18 extends Interface17 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BII[IIII)V")
	void method9044(@OriginalArg(3) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)I")
	int method9045();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FI)F")
	float method9046(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I")
	int method9047();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([IIIIIIII)V")
	void method9048(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
	boolean method9049();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FB)F")
	float method9050(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII[BILclient!eba;II)V")
	void method9051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) Class92 arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZZZ)V")
	void method9052(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);
}
