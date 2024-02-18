package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jagdx/IDirect3DDevice")
public final class IDirect3DDevice extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "c", descriptor = "[F")
	private static final float[] c = new float[4];

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "Lclient!jaclib/peer/ti;")
	private final ti b;

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "<init>", descriptor = "(Lclient!jaclib/peer/ti;)V")
	public IDirect3DDevice(@OriginalArg(0) ti arg0) {
		super(arg0);
		this.b = arg0;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetLight", descriptor = "(ILclient!jagdx/D3DLIGHT;)I")
	public native int SetLight(@OriginalArg(0) int arg0, @OriginalArg(1) D3DLIGHT arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetPixelShaderConstantF", descriptor = "(I[FI)I")
	private native int SetPixelShaderConstantF(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetDepthStencilSurface", descriptor = "(Lclient!jagdx/IDirect3DSurface;)I")
	private native int _GetDepthStencilSurface(@OriginalArg(0) IDirect3DSurface arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "([B)Lclient!jagdx/IDirect3DPixelShader;")
	public IDirect3DPixelShader a(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(10) IDirect3DPixelShader local10 = new IDirect3DPixelShader(this.b);
		@Pc(15) int local15 = this._CreatePixelShader(arg0, local10);
		if (lh.a(local15, true)) {
			throw new sja(String.valueOf(local15));
		}
		return local10;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTextureStageState", descriptor = "(III)I")
	public native int SetTextureStageState(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateEventQuery", descriptor = "(Lclient!jagdx/IDirect3DEventQuery;)I")
	private native int _CreateEventQuery(@OriginalArg(0) IDirect3DEventQuery arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateDepthStencilSurface", descriptor = "(IIIIIZLclient!jagdx/IDirect3DSurface;)I")
	private native int _CreateDepthStencilSurface(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) IDirect3DSurface arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIILclient!jagdx/IDirect3DVertexBuffer;)Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) IDirect3DVertexBuffer arg4) {
		if (arg4 == null) {
			arg4 = new IDirect3DVertexBuffer(this.b);
		} else {
			arg4.a(-117);
		}
		@Pc(22) int local22 = this._CreateVertexBuffer(arg0, arg1, arg2, arg3, arg4);
		if (lh.a(local22, true)) {
			throw new sja(String.valueOf(local22));
		}
		arg4.b = arg0;
		return arg4;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetSwapChain", descriptor = "(ILclient!jagdx/IDirect3DSwapChain;)I")
	private native int _GetSwapChain(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3DSwapChain arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IF)I")
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.SetRenderStatef(arg0, arg1);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "c", descriptor = "()Lclient!jagdx/IDirect3DSurface;")
	public IDirect3DSurface c() {
		@Pc(5) IDirect3DSurface local5 = new IDirect3DSurface(this.b);
		@Pc(9) int local9 = this._GetDepthStencilSurface(local5);
		if (lh.a(local9, true)) {
			throw new sja(String.valueOf(local9));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderState", descriptor = "(II)I")
	public native int SetRenderState(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIIII)Lclient!jagdx/IDirect3DTexture;")
	public IDirect3DTexture a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) IDirect3DTexture local5 = new IDirect3DTexture(this.b);
		@Pc(15) int local15 = this._CreateTexture(arg0, arg1, arg2, arg3, arg4, arg5, local5);
		if (lh.a(local15, true)) {
			throw new sja(String.valueOf(local15));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "LightEnable", descriptor = "(IZ)Z")
	public native boolean LightEnable(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTransform", descriptor = "(I[F)I")
	public native int SetTransform(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetBackBuffer", descriptor = "(IIILclient!jagdx/IDirect3DSurface;)I")
	private native int _GetBackBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) IDirect3DSurface arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIII)Lclient!jagdx/IDirect3DCubeTexture;")
	public IDirect3DCubeTexture a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) IDirect3DCubeTexture local5 = new IDirect3DCubeTexture(this.b);
		@Pc(14) int local14 = this._CreateCubeTexture(arg0, arg1, arg2, arg3, arg4, local5);
		if (lh.a(local14, true)) {
			throw new sja(String.valueOf(local14));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateIndexBuffer", descriptor = "(IIIILclient!jagdx/IDirect3DIndexBuffer;)I")
	private native int _CreateIndexBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) IDirect3DIndexBuffer arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderStatef", descriptor = "(IF)I")
	private native int SetRenderStatef(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "DrawIndexedPrimitive", descriptor = "(IIIIII)I")
	public native int DrawIndexedPrimitive(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateTexture", descriptor = "(IIIIIILclient!jagdx/IDirect3DTexture;)I")
	private native int _CreateTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) IDirect3DTexture arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIIIII)Lclient!jagdx/IDirect3DVolumeTexture;")
	public IDirect3DVolumeTexture a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) IDirect3DVolumeTexture local5 = new IDirect3DVolumeTexture(this.b);
		@Pc(16) int local16 = this._CreateVolumeTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6, local5);
		if (lh.a(local16, true)) {
			throw new sja(String.valueOf(local16));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetSamplerState", descriptor = "(III)I")
	public native int SetSamplerState(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IFFFF)I")
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		c[1] = arg2;
		c[2] = arg3;
		c[0] = arg1;
		c[3] = arg4;
		return this.SetVertexShaderConstantF(arg0, c, 1);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderStateb", descriptor = "(IZ)I")
	private native int SetRenderStateb(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreatePixelShader", descriptor = "([BLclient!jagdx/IDirect3DPixelShader;)I")
	private native int _CreatePixelShader(@OriginalArg(0) byte[] arg0, @OriginalArg(1) IDirect3DPixelShader arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexShaderConstantF", descriptor = "(I[FI)I")
	public native int SetVertexShaderConstantF(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "Reset", descriptor = "(Lclient!jagdx/D3DPRESENT_PARAMETERS;)I")
	public native int Reset(@OriginalArg(0) D3DPRESENT_PARAMETERS arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetStreamSource", descriptor = "(ILclient!jagdx/IDirect3DVertexBuffer;II)I")
	public native int SetStreamSource(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3DVertexBuffer arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "()Lclient!jagdx/IDirect3DEventQuery;")
	public IDirect3DEventQuery b() {
		@Pc(5) IDirect3DEventQuery local5 = new IDirect3DEventQuery(this.b);
		if (lh.a((byte) 68, this._CreateEventQuery(local5))) {
			return local5.a((byte) -127) ? local5 : null;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "BeginScene", descriptor = "()I")
	public native int BeginScene();

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexShader", descriptor = "(Lclient!jagdx/IDirect3DVertexShader;)I")
	public native int SetVertexShader(@OriginalArg(0) IDirect3DVertexShader arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "TestCooperativeLevel", descriptor = "()I")
	public native int TestCooperativeLevel();

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "(IFFFF)I")
	public int b(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		c[0] = arg1;
		c[2] = arg3;
		c[1] = arg2;
		c[3] = arg4;
		return this.SetPixelShaderConstantF(arg0, c, 1);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DSurface;")
	public IDirect3DSurface c(@OriginalArg(0) int arg0) {
		@Pc(5) IDirect3DSurface local5 = new IDirect3DSurface(this.b);
		@Pc(10) int local10 = this._GetRenderTarget(arg0, local5);
		if (lh.a(local10, true)) {
			throw new sja(String.valueOf(local10));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "([B)Lclient!jagdx/IDirect3DVertexShader;")
	public IDirect3DVertexShader b(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) IDirect3DVertexShader local11 = new IDirect3DVertexShader(this.b);
		@Pc(16) int local16 = this._CreateVertexShader(arg0, local11);
		if (lh.a(local16, true)) {
			throw new sja(String.valueOf(local16));
		}
		return local11;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_GetRenderTarget", descriptor = "(ILclient!jagdx/IDirect3DSurface;)I")
	private native int _GetRenderTarget(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3DSurface arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(Lclient!jagdx/VertexElementCollection;Lclient!jagdx/IDirect3DVertexDeclaration;)Lclient!jagdx/IDirect3DVertexDeclaration;")
	public IDirect3DVertexDeclaration a(@OriginalArg(0) VertexElementCollection arg0, @OriginalArg(1) IDirect3DVertexDeclaration arg1) {
		if (arg1 == null) {
			arg1 = new IDirect3DVertexDeclaration(this.b);
		} else {
			arg1.a(-109);
		}
		@Pc(19) int local19 = this._CreateVertexDeclaration(arg0, arg1);
		if (lh.a(local19, true)) {
			throw new sja(String.valueOf(local19));
		}
		return arg1;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetViewport", descriptor = "(IIIIFF)I")
	public native int SetViewport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DSwapChain;")
	public IDirect3DSwapChain b(@OriginalArg(0) int arg0) {
		@Pc(5) IDirect3DSwapChain local5 = new IDirect3DSwapChain(this.b);
		@Pc(10) int local10 = this._GetSwapChain(arg0, local5);
		if (lh.a(local10, true)) {
			throw new sja(String.valueOf(local10));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "DrawPrimitive", descriptor = "(III)I")
	public native int DrawPrimitive(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVertexBuffer", descriptor = "(IIIILclient!jagdx/IDirect3DVertexBuffer;)I")
	private native int _CreateVertexBuffer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) IDirect3DVertexBuffer arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIILclient!jagdx/IDirect3DIndexBuffer;)Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) IDirect3DIndexBuffer arg4) {
		if (arg4 == null) {
			arg4 = new IDirect3DIndexBuffer(this.b);
		} else {
			arg4.a(47);
		}
		@Pc(22) int local22 = this._CreateIndexBuffer(arg0, arg1, arg2, arg3, arg4);
		if (lh.a(local22, true)) {
			throw new sja(String.valueOf(local22));
		}
		return arg4;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTexture", descriptor = "(ILclient!jagdx/IDirect3DBaseTexture;)I")
	public native int SetTexture(@OriginalArg(0) int arg0, @OriginalArg(1) IDirect3DBaseTexture arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "StretchRect", descriptor = "(Lclient!jagdx/IDirect3DSurface;IIIILclient!jagdx/IDirect3DSurface;IIIII)I")
	public native int StretchRect(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) IDirect3DSurface arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVertexDeclaration", descriptor = "(Lclient!jagdx/VertexElementCollection;Lclient!jagdx/IDirect3DVertexDeclaration;)I")
	private native int _CreateVertexDeclaration(@OriginalArg(0) VertexElementCollection arg0, @OriginalArg(1) IDirect3DVertexDeclaration arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateRenderTarget", descriptor = "(IIIIIZLclient!jagdx/IDirect3DSurface;)I")
	private native int _CreateRenderTarget(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) IDirect3DSurface arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetFVF", descriptor = "(I)I")
	private native int SetFVF(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetScissorRect", descriptor = "(IIII)I")
	public native int SetScissorRect(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateOffscreenPlainSurface", descriptor = "(IIIILclient!jagdx/IDirect3DSurface;)I")
	private native int _CreateOffscreenPlainSurface(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) IDirect3DSurface arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(I[F)I")
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		return this.SetVertexShaderConstantF(arg0, arg1, arg1.length / 4);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexDeclaration", descriptor = "(Lclient!jagdx/IDirect3DVertexDeclaration;)I")
	public native int SetVertexDeclaration(@OriginalArg(0) IDirect3DVertexDeclaration arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IZ)I")
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return this.SetRenderStateb(arg0, arg1);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "Clear", descriptor = "(IIFI)I")
	public native int Clear(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateCubeTexture", descriptor = "(IIIIILclient!jagdx/IDirect3DCubeTexture;)I")
	private native int _CreateCubeTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) IDirect3DCubeTexture arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetIndices", descriptor = "(Lclient!jagdx/IDirect3DIndexBuffer;)I")
	public native int SetIndices(@OriginalArg(0) IDirect3DIndexBuffer arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "a", descriptor = "(IIIIIZ)Lclient!jagdx/IDirect3DSurface;")
	public IDirect3DSurface a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(5) IDirect3DSurface local5 = new IDirect3DSurface(this.b);
		@Pc(15) int local15 = this._CreateRenderTarget(arg0, arg1, arg2, arg3, arg4, arg5, local5);
		if (lh.a(local15, true)) {
			throw new sja(String.valueOf(local15));
		}
		return local5;
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "EndScene", descriptor = "()I")
	public native int EndScene();

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVertexShader", descriptor = "([BLclient!jagdx/IDirect3DVertexShader;)I")
	private native int _CreateVertexShader(@OriginalArg(0) byte[] arg0, @OriginalArg(1) IDirect3DVertexShader arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetPixelShader", descriptor = "(Lclient!jagdx/IDirect3DPixelShader;)I")
	public native int SetPixelShader(@OriginalArg(0) IDirect3DPixelShader arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "_CreateVolumeTexture", descriptor = "(IIIIIIILclient!jagdx/IDirect3DVolumeTexture;)I")
	private native int _CreateVolumeTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) IDirect3DVolumeTexture arg7);
}
