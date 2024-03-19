import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!fd;")
	private Class62 aClass62_6;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!rj;")
	private final Class174 aClass174_4;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!ua;")
	private final Class44_Sub4 aClass44_Sub4_1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ih;Lclient!rj;)V")
	public Class13_Sub7(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Class174 arg1) {
		super(arg0);
		this.aClass174_4 = arg1;
		this.method4594();
		this.aClass44_Sub4_1 = new Class44_Sub4(this.aClass40_Sub2_32, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass44_Sub4_1.method5460();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
	@Override
	public void method4593(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass40_Sub2_32.anOpengl1;
		if (this.aClass40_Sub2_32.anInt3208 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass40_Sub2_32.anInt3208;
			this.aClass40_Sub2_32.method2815(1);
			Static247.aFloatArray20[0] = 0.0F;
			Static247.aFloatArray20[1] = 0.0F;
			Static247.aFloatArray20[2] = local14;
			Static247.aFloatArray20[3] = this.aClass40_Sub2_32.aFloat44 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static247.aFloatArray20, 0);
			local3.glPopMatrix();
			this.aClass40_Sub2_32.method2855(0.5F, (float) this.aClass40_Sub2_32.anInt3208);
			this.aClass40_Sub2_32.method2882(this.aClass44_Sub4_1);
			this.aClass40_Sub2_32.method2815(0);
		}
		this.aClass62_6.method1789('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public void method4589(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass174_4.aBoolean397) {
				this.aClass40_Sub2_32.method2882(this.aClass174_4.aClass44_Sub2_2);
				Static247.aFloatArray20[0] = 0.0F;
				Static247.aFloatArray20[1] = 0.0F;
				Static247.aFloatArray20[2] = 0.0F;
				Static247.aFloatArray20[3] = (float) (this.aClass40_Sub2_32.anInt3200 % 4000) / 4000.0F;
				this.aClass40_Sub2_32.anOpengl1.glTexGenfv(8194, 9473, Static247.aFloatArray20, 0);
			} else {
				@Pc(56) int local56 = this.aClass40_Sub2_32.anInt3200 % 4000 * 16 / 4000;
				this.aClass40_Sub2_32.method2882(this.aClass174_4.aClass44_Sub1Array3[local56]);
			}
		} else if (this.aClass174_4.aBoolean397) {
			this.aClass40_Sub2_32.method2882(this.aClass174_4.aClass44_Sub2_2);
			Static247.aFloatArray20[0] = 0.0F;
			Static247.aFloatArray20[1] = 0.0F;
			Static247.aFloatArray20[2] = 0.0F;
			Static247.aFloatArray20[3] = 0.0F;
			this.aClass40_Sub2_32.anOpengl1.glTexGenfv(8194, 9473, Static247.aFloatArray20, 0);
		} else {
			this.aClass40_Sub2_32.method2882(this.aClass174_4.aClass44_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	@Override
	public void method4591(@OriginalArg(0) boolean arg0) {
		this.aClass40_Sub2_32.method2849(260, 8448);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!dg;)V")
	@Override
	public void method4590(@OriginalArg(0) Class44 arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
	@Override
	public void method4588() {
		@Pc(3) opengl local3 = this.aClass40_Sub2_32.anOpengl1;
		this.aClass62_6.method1789('\u0001');
		if (this.aClass40_Sub2_32.anInt3208 > 0) {
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2882(null);
			this.aClass40_Sub2_32.method2855(1.0F, 0.0F);
			this.aClass40_Sub2_32.method2815(0);
		}
		this.aClass40_Sub2_32.method2849(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
	private void method4594() {
		@Pc(3) opengl local3 = this.aClass40_Sub2_32.anOpengl1;
		this.aClass62_6 = new Class62(this.aClass40_Sub2_32, 2);
		this.aClass62_6.method1787(0);
		this.aClass40_Sub2_32.method2815(1);
		this.aClass40_Sub2_32.method2849(7681, 260);
		this.aClass40_Sub2_32.method2833(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass40_Sub2_32.method2815(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass174_4.aBoolean397) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass62_6.method1788();
		this.aClass62_6.method1787(1);
		this.aClass40_Sub2_32.method2815(1);
		this.aClass40_Sub2_32.method2849(8448, 8448);
		this.aClass40_Sub2_32.method2833(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass40_Sub2_32.method2815(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass174_4.aBoolean397) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass62_6.method1788();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()Z")
	@Override
	public boolean method4592() {
		return true;
	}
}
