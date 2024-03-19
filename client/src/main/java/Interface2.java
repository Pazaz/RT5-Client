import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public interface Interface2 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[BI)V")
	void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "()I")
	int method6093();

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!am;)V")
	void method3538(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(Lclient!am;)V")
	void method3539(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(Lclient!am;)V")
	void method3540(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(Lclient!am;)V")
	void method3541(@OriginalArg(0) Class9 arg0);
}
