import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!fd;")
	private Class62 aClass62_2;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class13_Sub4(@OriginalArg(0) Class40_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean220) {
			@Pc(12) opengl local12 = this.aClass40_Sub2_32.anOpengl1;
			this.aClass62_2 = new Class62(arg0, 2);
			this.aClass62_2.method1787(0);
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2849(34165, 7681);
			this.aClass40_Sub2_32.method2833(2, 34168, 770);
			this.aClass40_Sub2_32.method2812(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass40_Sub2_32.method2815(0);
			this.aClass62_2.method1788();
			this.aClass62_2.method1787(1);
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2849(8448, 8448);
			this.aClass40_Sub2_32.method2833(2, 34166, 770);
			this.aClass40_Sub2_32.method2812(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass40_Sub2_32.method2815(0);
			this.aClass62_2.method1788();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	@Override
	public void method4591(@OriginalArg(0) boolean arg0) {
		this.aClass40_Sub2_32.method2849(8448, 7681);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	@Override
	public void method4589(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
	@Override
	public void method4588() {
		if (this.aBoolean178) {
			this.aClass62_2.method1789('\u0001');
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2882(null);
			this.aClass40_Sub2_32.method2815(0);
		} else {
			this.aClass40_Sub2_32.method2812(0, 5890);
		}
		this.aClass40_Sub2_32.method2849(8448, 8448);
		this.aBoolean178 = false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!dg;)V")
	@Override
	public void method4590(@OriginalArg(0) Class44 arg0) {
		this.aClass40_Sub2_32.method2882(arg0);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
	@Override
	public boolean method4592() {
		return true;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
	@Override
	public void method4593(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class44_Sub3 local3 = this.aClass40_Sub2_32.method2858();
		if (this.aClass62_2 == null || local3 == null || !arg0) {
			this.aClass40_Sub2_32.method2812(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass40_Sub2_32.anOpengl1;
		this.aClass62_2.method1789('\u0000');
		this.aClass40_Sub2_32.method2815(1);
		this.aClass40_Sub2_32.method2882(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass40_Sub2_32.aClass11_Sub1_1.method1260(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass40_Sub2_32.method2815(0);
		this.aBoolean178 = true;
	}
}
