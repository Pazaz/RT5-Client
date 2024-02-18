import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class159 {

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!aa;")
	public final Class1 aClass1_1;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
	public final int[] anIntArray302;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
	public final int[] anIntArray303;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public final int anInt3833;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public final int anInt3836;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public final int anInt3832;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II[I[ILclient!aa;I)V")
	public Class159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5) {
		this.aClass1_1 = arg4;
		this.anIntArray302 = arg2;
		this.anIntArray303 = arg3;
		this.anInt3833 = arg1;
		this.anInt3836 = arg5;
		this.anInt3832 = arg0;
	}
}
