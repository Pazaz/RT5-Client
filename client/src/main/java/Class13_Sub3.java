import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!fd;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	private int anInt2555;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!rj;")
	private final Class174 aClass174_1;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!ch;")
	private Class33 aClass33_5;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
	private FloatBuffer aFloatBuffer1;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!ih;Lclient!rj;)V")
	public Class13_Sub3(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Class174 arg1) {
		super(arg0);
		this.aClass174_1 = arg1;
		if (this.aClass40_Sub2_32.aBoolean224 && this.aClass40_Sub2_32.anInt3206 >= 2) {
			this.aClass33_5 = Static35.method833(this.aClass40_Sub2_32, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
			if (this.aClass33_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Static206.method4108(0.4F);
			@Pc(47) int[][] local47 = Static206.method4108(0.4F);
			@Pc(52) Class1_Sub16_Sub1 local52 = new Class1_Sub16_Sub1(262144);
			for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
				@Pc(61) int[] local61 = local36[local54];
				@Pc(65) int[] local65 = local47[local54];
				for (@Pc(67) int local67 = 0; local67 < 64; local67++) {
					if (this.aClass40_Sub2_32.aBoolean216) {
						local52.method5027((float) local61[local67] / 4096.0F);
						local52.method5027((float) local65[local67] / 4096.0F);
						local52.method5027(1.0F);
						local52.method5027(1.0F);
					} else {
						local52.method5026((float) local61[local67] / 4096.0F);
						local52.method5026((float) local65[local67] / 4096.0F);
						local52.method5026(1.0F);
						local52.method5026(1.0F);
					}
				}
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(local52.anInt6813).order(ByteOrder.nativeOrder());
			local137.put(local52.aByteArray86, 0, local52.anInt6813);
			local137.flip();
			this.aFloatBuffer1 = local137.asFloatBuffer().asReadOnlyBuffer();
			this.method2135();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)V")
	@Override
	public void method4593(@OriginalArg(0) boolean arg0) {
		if (this.aClass62_1 == null) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass40_Sub2_32.anOpengl1;
		this.aClass62_1.method1789('\u0000');
		this.aClass40_Sub2_32.method2815(1);
		local7.glMatrixMode(5890);
		local7.glLoadMatrixf(this.aClass40_Sub2_32.aClass11_Sub1_1.method1258(), 0);
		local7.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local7.glMatrixMode(5888);
		this.aClass40_Sub2_32.method2815(0);
		if (this.anInt2555 == this.aClass40_Sub2_32.anInt3200) {
			return;
		}
		@Pc(55) int local55 = this.aClass40_Sub2_32.anInt3200 % 5120 * 256 / 5120;
		local55 *= 256;
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			this.aFloatBuffer1.position(local55);
			local7.glProgramLocalParameter4fvARB(34336, local61, this.aFloatBuffer1);
			local55 += 4;
		}
		if (this.aClass174_1.aBoolean397) {
			@Pc(91) float local91 = (float) (this.aClass40_Sub2_32.anInt3200 % 4000) / 4000.0F;
			local7.glProgramLocalParameter4fARB(34336, 65, local91, 0.0F, 0.0F, 1.0F);
		} else {
			local7.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt2555 = this.aClass40_Sub2_32.anInt3200;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "()Z")
	@Override
	public boolean method4592() {
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
	@Override
	public void method4588() {
		if (this.aClass62_1 != null) {
			this.aClass62_1.method1789('\u0001');
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2882(null);
			this.aClass40_Sub2_32.method2815(0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!dg;)V")
	@Override
	public void method4590(@OriginalArg(0) Class44 arg0) {
		this.aClass40_Sub2_32.method2882(arg0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	@Override
	public void method4589(@OriginalArg(0) int arg0) {
		if (this.aClass62_1 == null) {
			return;
		}
		this.aClass40_Sub2_32.method2815(1);
		if ((arg0 & 0x80) != 0) {
			this.aClass40_Sub2_32.method2882(null);
		} else if (this.aClass174_1.aBoolean397) {
			this.aClass40_Sub2_32.method2882(this.aClass174_1.aClass44_Sub2_2);
		} else {
			@Pc(25) int local25 = this.aClass40_Sub2_32.anInt3200 % 4000 * 16 / 4000;
			this.aClass40_Sub2_32.method2882(this.aClass174_1.aClass44_Sub1Array3[local25]);
		}
		this.aClass40_Sub2_32.method2815(0);
		@Pc(53) opengl local53 = this.aClass40_Sub2_32.anOpengl1;
		if ((arg0 & 0x40) == 0) {
			local53.glGetFloatv(2899, Static103.aFloatArray6, 0);
			local53.glProgramLocalParameter4fvARB(34336, 66, Static103.aFloatArray6, 0);
		} else {
			local53.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		@Pc(81) int local81 = arg0 & 0x3;
		if (local81 == 2) {
			local53.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local81 == 3) {
			local53.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			local53.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)V")
	@Override
	public void method4591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "()V")
	private void method2135() {
		@Pc(3) opengl local3 = this.aClass40_Sub2_32.anOpengl1;
		this.aClass62_1 = new Class62(this.aClass40_Sub2_32, 2);
		this.aClass62_1.method1787(0);
		this.aClass40_Sub2_32.method2815(1);
		this.aClass40_Sub2_32.method2849(260, 7681);
		this.aClass40_Sub2_32.method2812(0, 34168);
		this.aClass40_Sub2_32.method2815(0);
		local3.glBindProgramARB(34336, this.aClass33_5.anInt1059);
		local3.glEnable(34336);
		this.aClass62_1.method1788();
		this.aClass62_1.method1787(1);
		this.aClass40_Sub2_32.method2815(1);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		this.aClass40_Sub2_32.method2877(1);
		this.aClass40_Sub2_32.method2812(0, 5890);
		this.aClass40_Sub2_32.method2815(0);
		local3.glBindProgramARB(34336, 0);
		local3.glDisable(34336);
		local3.glDisable(34820);
		this.aClass62_1.method1788();
	}
}
