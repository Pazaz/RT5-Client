import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class j extends Class23 implements Interface5 {

	@OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
	public long nativeid;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!oa;II)V")
	public j(@OriginalArg(0) oa arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.EA(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!oa;[IIIIIZ)V")
	public j(@OriginalArg(0) oa arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.ua(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!oa;[I[B[BIIII)V")
	public j(@OriginalArg(0) oa arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.ma(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!oa;IIIIZ)V")
	public j(@OriginalArg(0) oa arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.h(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8194(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.UA(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, 1, ((na) arg6).nativeid, arg7, arg8);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.RA(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
	@Override
	public int method8182() {
		return this.I(this.nativeid);
	}

	@OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
	private native void A(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
	@Override
	public void w(@OriginalArg(0) boolean arg0) {
		this.R(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(Lclient!oa;IIIIZ)V")
	private native void h(@OriginalArg(0) oa arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
	private native void V(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.P(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
	@Override
	public void method8193(@OriginalArg(0) int[] arg0) {
		this.CA(this.nativeid, arg0);
	}

	@OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
	private native void RA(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
	private native void b(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10);

	@OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
	private native int JA(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!j", name = "ma", descriptor = "(Lclient!oa;[I[B[BIIII)V")
	private native void ma(@OriginalArg(0) oa arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
	private native void N(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
	private native int M(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
	@Override
	public int method8199() {
		return this.M(this.nativeid);
	}

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.nativeid != 0L) {
			Static307.method4477(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.b(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 1, 1);
	}

	@OriginalMember(owner = "client!j", name = "ua", descriptor = "(Lclient!oa;[IIIIIZ)V")
	private native void ua(@OriginalArg(0) oa arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
	private native int wa(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
	private native void P(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
	private native void R(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
	@Override
	public int method8203() {
		return this.wa(this.nativeid);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.W(this.nativeid, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V")
	@Override
	public void method8184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.A(this.nativeid, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
	private native void CA(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.YA(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!j", name = "EA", descriptor = "(Lclient!oa;II)V")
	private native void EA(@OriginalArg(0) oa arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
	private native void UA(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10);

	@OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
	private native void YA(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	@Override
	public int method8192() {
		return this.JA(this.nativeid);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	@Override
	public void method8196() {
		this.N(this.nativeid, 0, 0, 3);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.V(this.nativeid, arg0, arg1, ((na) arg2).nativeid, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
	private native int I(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
	private native void W(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
