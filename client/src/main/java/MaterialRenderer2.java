import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class MaterialRenderer2 extends MaterialRenderer {

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	private int anInt1986;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!rj;")
	private Class203 aClass203_1;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!fs;")
	private final Class76 aClass76_1;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!kd;")
	private Class122 aClass122_1;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!bf;Lclient!fs;)V")
	public MaterialRenderer2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class76 arg1) {
		super(arg0);
		this.aClass76_1 = arg1;
		if (this.aClass19_Sub1_35.aBoolean40 && this.aClass19_Sub1_35.anInt597 >= 2) {
			this.aClass122_1 = Static176.method3326(this.aClass19_Sub1_35, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass122_1 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static225.method3956(0.4F);
			@Pc(47) int[][] local47 = Static225.method3956(0.4F);
			@Pc(52) GlPacket local52 = new GlPacket(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass19_Sub1_35.aBoolean53) {
						local52.pf((float) local61[local67] / 4096.0F);
						local52.pf((float) local65[local67] / 4096.0F);
						local52.pf(1.0F);
						local52.pf(1.0F);
					} else {
						local52.ipf((float) local61[local67] / 4096.0F);
						local52.ipf((float) local65[local67] / 4096.0F);
						local52.ipf(1.0F);
						local52.ipf(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.pos).order(ByteOrder.nativeOrder());
			local137.put(local52.data, 0, local52.pos);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method2058();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	@Override
	public void method5712(@OriginalArg(0) int arg0) {
		if (this.aClass203_1 == null) {
			return;
		}
		this.aClass19_Sub1_35.method832(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass19_Sub1_35.method848(null);
		} else if (this.aClass76_1.aBoolean160) {
			this.aClass19_Sub1_35.method848(this.aClass76_1.aClass8_Sub4_2);
		} else {
			@Pc(25) int local25 = this.aClass19_Sub1_35.anInt584 % 4000 * 16 / 4000;
			this.aClass19_Sub1_35.method848(this.aClass76_1.aClass8_Sub1Array1[local25]);
		}
		this.aClass19_Sub1_35.method832(0);
		@Pc(53) opengl local53 = this.aClass19_Sub1_35.gl;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(GL.GL_LIGHT_MODEL_AMBIENT, Static95.aFloatArray12, 0);
			local53.glProgramLocalParameter4fvARB(GL.GL_VERTEX_PROGRAM_ARB, 66, Static95.aFloatArray12, 0);
		} else {
			local53.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(81) int local81 = arg0 & 0x3;
		if (local81 == 2) {
			local53.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local81 == 3) {
			local53.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			local53.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
	@Override
	public void method5715() {
		if (this.aClass203_1 != null) {
			this.aClass203_1.method5190('\u0001');
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(null);
			this.aClass19_Sub1_35.method832(0);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	@Override
	public void method5713(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()Z")
	@Override
	public boolean method5711() {
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "()V")
	private void method2058() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.gl;
		this.aClass203_1 = new Class203(this.aClass19_Sub1_35, 2);
		this.aClass203_1.method5192(0);
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method794(260, 7681);
		this.aClass19_Sub1_35.method833(0, 34168);
		this.aClass19_Sub1_35.method832(0);
		local3.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, this.aClass122_1.anInt3352);
		local3.glEnable(GL.GL_VERTEX_PROGRAM_ARB);
		this.aClass203_1.method5191();
		this.aClass203_1.method5192(1);
		this.aClass19_Sub1_35.method832(1);
		local3.glMatrixMode(GL.GL_TEXTURE);
		local3.glLoadIdentity();
		local3.glMatrixMode(GL.GL_MODELVIEW);
		this.aClass19_Sub1_35.method792(1);
		this.aClass19_Sub1_35.method833(0, 5890);
		this.aClass19_Sub1_35.method832(0);
		local3.glBindProgramARB(GL.GL_VERTEX_PROGRAM_ARB, 0);
		local3.glDisable(GL.GL_VERTEX_PROGRAM_ARB);
		local3.glDisable(GL.GL_FRAGMENT_PROGRAM_ARB);
		this.aClass203_1.method5191();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
		if (this.aClass203_1 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass19_Sub1_35.gl;
		this.aClass203_1.method5190('\u0000');
		this.aClass19_Sub1_35.method832(1);
		local7.glMatrixMode(GL.GL_TEXTURE);
		local7.glLoadMatrixf(this.aClass19_Sub1_35.aClass14_Sub2_1.method3941(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(GL.GL_MODELVIEW);
		this.aClass19_Sub1_35.method832(0);
		if (this.anInt1986 == this.aClass19_Sub1_35.anInt584) {
			return;
		}
		@Pc(55) int local55 = this.aClass19_Sub1_35.anInt584 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(GL.GL_VERTEX_PROGRAM_ARB, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass76_1.aBoolean160) {
			@Pc(91) float local91 = (float) (this.aClass19_Sub1_35.anInt584 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(GL.GL_VERTEX_PROGRAM_ARB, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt1986 = this.aClass19_Sub1_35.anInt584;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!kq;)V")
	@Override
	public void method5710(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}
}
