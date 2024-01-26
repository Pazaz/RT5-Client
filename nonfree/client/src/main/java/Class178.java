import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class178 {

	@OriginalMember(owner = "client!s", name = "w", descriptor = "[Lclient!hja;")
	private static final Class167[] aClass167Array5 = new Class167[32];

	@OriginalMember(owner = "client!s", name = "t", descriptor = "I")
	public final int anInt8894;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public final int anInt8892;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public final int anInt8888;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public final int anInt8895;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[[I")
	public final int[][] anIntArrayArray226;

	static {
		@Pc(140) Class167[] local140 = Static254.method3604();
		for (@Pc(142) int local142 = 0; local142 < local140.length; local142++) {
			aClass167Array5[local140[local142].anInt3973] = local140[local142];
		}
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt8894 = arg0;
		this.anInt8892 = arg1;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			local11++;
			arg2 >>= 0x1;
		}
		this.anInt8888 = 0x1 << local11;
		this.anInt8895 = local11;
		this.anIntArrayArray226 = arg3;
	}

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!lca;[I)V")
	public abstract void method7868(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I")
	public final int method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray226[arg1][arg0];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method7870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7873(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method7874(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class2_Sub2_Sub9 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub9 arg2);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method7875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method7877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public final int method7878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 >> this.anInt8895;
		@Pc(13) int local13 = arg0 >> this.anInt8895;
		if (local8 < 0 || local13 < 0 || this.anInt8894 - 1 < local8 || this.anInt8892 - 1 < local13) {
			return 0;
		}
		@Pc(52) int local52 = this.anInt8888 - 1 & arg1;
		@Pc(70) int local70 = this.anInt8888 - 1 & arg0;
		@Pc(96) int local96 = local52 * this.anIntArrayArray226[local8 + 1][local13] + (this.anInt8888 - local52) * this.anIntArrayArray226[local8][local13] >> this.anInt8895;
		@Pc(128) int local128 = this.anIntArrayArray226[local8][local13 + 1] * (this.anInt8888 - local52) + local52 * this.anIntArrayArray226[local8 + 1][local13 + 1] >> this.anInt8895;
		return (this.anInt8888 - local70) * local96 + local70 * local128 >> this.anInt8895;
	}
}
