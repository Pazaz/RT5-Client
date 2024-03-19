import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class Class77 {

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	public final int anInt4630;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
	public final int anInt4625;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(II)V")
	protected Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4630 = arg0;
		this.anInt4625 = arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!oc;IIIIZ)V")
	public abstract void method3983(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3984(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method3985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)I")
	public abstract int method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
	public abstract void method3987();

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(Lclient!oc;IIIIZ)Z")
	public abstract boolean method3988(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	public abstract void method3989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!fe;[I)V")
	public abstract void method3993(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
	public abstract int method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(Lclient!oc;IIIIZ)V")
	public abstract void method3995(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method3997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)V")
	public abstract void method4001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!oc;)Lclient!oc;")
	public abstract Class1_Sub1_Sub6 method4002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub6 arg2);
}
