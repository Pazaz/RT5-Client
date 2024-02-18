package jagdx;

import jaclib.peer.os;
import jaclib.peer.ti;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DLIGHT")
public final class D3DLIGHT extends os {

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "<init>", descriptor = "(Lclient!jaclib/peer/ti;)V")
	public D3DLIGHT(@OriginalArg(0) ti arg0) {
		super(arg0);
		this.Init();
	}

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetSpotParams", descriptor = "(FFF)V")
	private native void SetSpotParams(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetPosition", descriptor = "(FFF)V")
	public native void SetPosition(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetRange", descriptor = "(F)V")
	public native void SetRange(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetSpecular", descriptor = "(FFFF)V")
	private native void SetSpecular(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "Init", descriptor = "()V")
	private native void Init();

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetDiffuse", descriptor = "(FFFF)V")
	public native void SetDiffuse(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetType", descriptor = "(I)V")
	public native void SetType(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetAttenuation", descriptor = "(FFF)V")
	public native void SetAttenuation(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetAmbient", descriptor = "(FFFF)V")
	public native void SetAmbient(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jagdx/D3DLIGHT", name = "SetDirection", descriptor = "(FFF)V")
	public native void SetDirection(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);
}
