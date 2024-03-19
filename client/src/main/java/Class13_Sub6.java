import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!rj;")
	private final Class174 aClass174_3;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Lclient!fd;")
	private final Class62 aClass62_5;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!ih;Lclient!rj;)V")
	public Class13_Sub6(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Class174 arg1) {
		super(arg0);
		this.aClass174_3 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass62_5 = new Class62(arg0, 2);
		this.aClass62_5.method1787(0);
		this.aClass40_Sub2_32.method2815(1);
		if (this.aClass174_3.aBoolean397) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass40_Sub2_32.method2815(0);
		this.aClass62_5.method1788();
		this.aClass62_5.method1787(1);
		this.aClass40_Sub2_32.method2815(1);
		if (this.aClass174_3.aBoolean397) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass40_Sub2_32.method2815(0);
		this.aClass62_5.method1788();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!dg;)V")
	@Override
	public void method4590(@OriginalArg(0) Class44 arg0) {
		this.aClass40_Sub2_32.method2882(arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
	@Override
	public void method4588() {
		this.aClass62_5.method1789('\u0001');
		this.aClass40_Sub2_32.method2815(1);
		this.aClass40_Sub2_32.method2882(null);
		this.aClass40_Sub2_32.method2815(0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	@Override
	public void method4591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	@Override
	public void method4589(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass40_Sub2_32.anOpengl1;
		this.aClass40_Sub2_32.method2815(1);
		if (local35) {
			Static217.aFloatArray19[0] = local27;
			Static217.aFloatArray19[1] = 0.0F;
			Static217.aFloatArray19[2] = 0.0F;
			Static217.aFloatArray19[3] = 0.0F;
		} else {
			Static217.aFloatArray19[0] = 0.0F;
			Static217.aFloatArray19[1] = 0.0F;
			Static217.aFloatArray19[2] = local27;
			Static217.aFloatArray19[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static217.aFloatArray19, 0);
		Static217.aFloatArray19[0] = 0.0F;
		Static217.aFloatArray19[1] = local27;
		Static217.aFloatArray19[2] = 0.0F;
		Static217.aFloatArray19[3] = (float) this.aClass40_Sub2_32.anInt3200 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static217.aFloatArray19, 0);
		if (this.aClass174_3.aBoolean397) {
			Static217.aFloatArray19[0] = 0.0F;
			Static217.aFloatArray19[1] = 0.0F;
			Static217.aFloatArray19[2] = 0.0F;
			Static217.aFloatArray19[3] = (float) this.aClass40_Sub2_32.anInt3200 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static217.aFloatArray19, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass40_Sub2_32.anInt3200 * 16.0F);
			this.aClass40_Sub2_32.method2882(this.aClass174_3.aClass44_Sub1Array4[local127 % 16]);
		}
		this.aClass40_Sub2_32.method2815(0);
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
	@Override
	public void method4593(@OriginalArg(0) boolean arg0) {
		this.aClass62_5.method1789('\u0000');
		if (this.aClass174_3.aBoolean397) {
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2882(this.aClass174_3.aClass44_Sub2_1);
			this.aClass40_Sub2_32.method2815(0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()Z")
	@Override
	public boolean method4592() {
		return true;
	}
}
