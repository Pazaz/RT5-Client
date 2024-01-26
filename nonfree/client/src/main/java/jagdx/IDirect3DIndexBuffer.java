package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DIndexBuffer")
public final class IDirect3DIndexBuffer extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DIndexBuffer", name = "<init>", descriptor = "(Lclient!jaclib/peer/ti;)V")
	public IDirect3DIndexBuffer(@OriginalArg(0) ti arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DIndexBuffer", name = "a", descriptor = "()J")
	@Override
	protected long a() {
		return super.a();
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DIndexBuffer", name = "_Update", descriptor = "(JII)Z")
	private native boolean _Update(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DIndexBuffer", name = "Lock", descriptor = "(IIILclient!jagdx/GeometryBuffer;)I")
	public native int Lock(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) GeometryBuffer arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DIndexBuffer", name = "Unlock", descriptor = "()I")
	public native int Unlock();
}
