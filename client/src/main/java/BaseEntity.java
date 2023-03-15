import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class BaseEntity {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIBLclient!wm;)Z")
	public abstract boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) RasteriserBase arg2);

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
	public abstract void method6069();

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!wm;B)V")
	public abstract void method6070(@OriginalArg(0) RasteriserBase arg0);

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	public abstract Class12_Sub4 method6073(@OriginalArg(0) RasteriserBase arg0);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	public abstract void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RasteriserBase arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5);

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)Z")
	public abstract boolean method6076();
}
