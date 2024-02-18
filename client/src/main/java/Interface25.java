import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public interface Interface25 {

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)I")
	int method6855(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
	void method6856();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ha;I)V")
	void method6857(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)I")
	int method6858();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	int method6859(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)Z")
	boolean method6860(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(Lclient!ha;I)V")
	void method6861(@OriginalArg(0) Class19 arg0);
}
