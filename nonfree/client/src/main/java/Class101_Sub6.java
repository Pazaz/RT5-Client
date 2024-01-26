import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class101_Sub6 extends Class101 {

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!nia", name = "j", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "Z")
	private boolean aBoolean486 = false;

	@OriginalMember(owner = "client!nia", name = "s", descriptor = "Lclient!cn;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!nia", name = "u", descriptor = "Lclient!cn;")
	private Class71 aClass71_2;

	@OriginalMember(owner = "client!nia", name = "t", descriptor = "Lclient!cn;")
	private Class71 aClass71_3;

	@OriginalMember(owner = "client!nia", name = "q", descriptor = "Lclient!cn;")
	private Class71 aClass71_4;

	@OriginalMember(owner = "client!nia", name = "w", descriptor = "Z")
	private final boolean aBoolean483;

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "Lclient!rq;")
	private Class93_Sub2 aClass93_Sub2_3;

	static {
		new Class242("", 73);
	}

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class101_Sub6(@OriginalArg(0) Class19_Sub3 arg0) {
		super(arg0);
		if (super.aClass19_Sub3_42.aBoolean608) {
			this.aClass71_1 = Static622.method6854("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, super.aClass19_Sub3_42, (byte) 101);
			this.aClass71_2 = Static622.method6854("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, super.aClass19_Sub3_42, (byte) 106);
			this.aClass71_3 = Static622.method6854("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, super.aClass19_Sub3_42, (byte) 110);
			this.aClass71_4 = Static622.method6854("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, super.aClass19_Sub3_42, (byte) 116);
			if (this.aClass71_4 != null & this.aClass71_2 != null & this.aClass71_1 != null & this.aClass71_3 != null) {
				this.aClass93_Sub2_3 = new Class93_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass93_Sub2_3.method2946(false, false);
				this.aBoolean483 = true;
			} else {
				this.aBoolean483 = false;
			}
		} else {
			this.aBoolean483 = false;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9426(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean486) {
				super.aClass19_Sub3_42.method7021(5890, 768, 0);
				super.aClass19_Sub3_42.method7029(0, 5890);
				this.aBoolean486 = false;
			}
			super.aClass19_Sub3_42.method7001(arg0);
			super.aClass19_Sub3_42.method6991(arg1);
		} else if (!this.aBoolean486) {
			super.aClass19_Sub3_42.method7001(super.aClass19_Sub3_42.aClass93_Sub2_5);
			super.aClass19_Sub3_42.method6991(1);
			super.aClass19_Sub3_42.method7021(34168, 768, 0);
			super.aClass19_Sub3_42.method7029(0, 34168);
			this.aBoolean486 = true;
		}
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9432(@OriginalArg(0) boolean arg0) {
		this.aBoolean484 = arg0;
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001(this.aClass93_Sub2_3);
		super.aClass19_Sub3_42.method7031(7681, 34165);
		super.aClass19_Sub3_42.method7021(34166, 768, 0);
		super.aClass19_Sub3_42.method7021(5890, 770, 2);
		super.aClass19_Sub3_42.method7029(0, 34168);
		super.aClass19_Sub3_42.method7014(0);
		this.method5797();
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V")
	@Override
	public void method9427() {
		if (this.aBoolean485) {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0);
			OpenGL.glDisable(OpenGL.GL_FRAGMENT_PROGRAM_ARB);
			OpenGL.glDisable(OpenGL.GL_VERTEX_PROGRAM_ARB);
			this.aBoolean485 = false;
		}
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method7001((Class93) null);
		super.aClass19_Sub3_42.method7031(8448, 8448);
		super.aClass19_Sub3_42.method7021(5890, 768, 0);
		super.aClass19_Sub3_42.method7021(34166, 770, 2);
		super.aClass19_Sub3_42.method7029(0, 5890);
		super.aClass19_Sub3_42.method7014(0);
		if (this.aBoolean486) {
			super.aClass19_Sub3_42.method7021(5890, 768, 0);
			super.aClass19_Sub3_42.method7029(0, 5890);
			this.aBoolean486 = false;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9429(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V")
	public void method5797() {
		@Pc(14) Class73_Sub3 local14 = super.aClass19_Sub3_42.aClass73_Sub3_4;
		if (this.aBoolean484) {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, super.aClass19_Sub3_42.anInt8006 == Integer.MAX_VALUE ? this.aClass71_2.anInt1805 : this.aClass71_4.anInt1805);
		} else {
			OpenGL.glBindProgramARB(OpenGL.GL_VERTEX_PROGRAM_ARB, super.aClass19_Sub3_42.anInt8006 == Integer.MAX_VALUE ? this.aClass71_1.anInt1805 : this.aClass71_3.anInt1805);
		}
		local14.method7143(0.0F, (float) super.aClass19_Sub3_42.anInt8006, -1.0F, 0.0F, Static319.aFloatArray26);
		OpenGL.glProgramLocalParameter4fARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 1, Static319.aFloatArray26[0], Static319.aFloatArray26[1], Static319.aFloatArray26[2], Static319.aFloatArray26[3]);
		OpenGL.glEnable(OpenGL.GL_VERTEX_PROGRAM_ARB);
		this.aBoolean485 = true;
		this.method5798();
	}

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)V")
	public void method5798() {
		if (!this.aBoolean485) {
			return;
		}
		@Pc(19) int local19 = super.aClass19_Sub3_42.XA();
		@Pc(23) int local23 = super.aClass19_Sub3_42.i();
		@Pc(34) float local34 = (float) local19 - (float) (local19 - local23) * 0.125F;
		@Pc(46) float local46 = -((float) (local19 - local23) * 0.25F) + (float) local19;
		OpenGL.glProgramLocalParameter4fARB(OpenGL.GL_VERTEX_PROGRAM_ARB, 0, local46, local34, 1.0F / (float) super.aClass19_Sub3_42.anInt8013, (float) super.aClass19_Sub3_42.anInt8029 / 255.0F);
		super.aClass19_Sub3_42.method7014(1);
		super.aClass19_Sub3_42.method6985(super.aClass19_Sub3_42.anInt8026);
		super.aClass19_Sub3_42.method7014(0);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(III)V")
	@Override
	public void method9428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9431() {
		return this.aBoolean483;
	}
}
