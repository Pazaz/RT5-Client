import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class349 {

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class349(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method8180(arg1, arg0);
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
	public void method8178() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(-92);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(-116);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(58);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IB)I")
	public int method8179() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;Lclient!jagdx/IDirect3DSwapChain;B)V")
	public void method8180(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(1) IDirect3DSwapChain arg1) {
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface1 = arg0;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)Z")
	public boolean method8181() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
