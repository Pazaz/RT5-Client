import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class13_Sub5 extends Class13 {

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!fd;")
	private Class62 aClass62_4;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[Lclient!sg;")
	private Class44_Sub3[] aClass44_Sub3Array1;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class13_Sub5(@OriginalArg(0) Class40_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean220) {
			this.aBoolean296 = arg0.anInt3206 < 3;
			@Pc(24) int local24 = this.aBoolean296 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(57) float local57 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(99) float local99;
						if (local91 == 0) {
							local99 = -local85;
						} else if (local91 == 1) {
							local99 = local85;
						} else if (local91 == 2) {
							local99 = local89;
						} else if (local91 == 3) {
							local99 = -local89;
						} else if (local91 == 4) {
							local99 = local81;
						} else {
							local99 = -local81;
						}
						@Pc(141) int local141;
						@Pc(150) int local150;
						@Pc(159) int local159;
						if (local99 > 0.0F) {
							local141 = (int) (Math.pow((double) local99, 96.0D) * (double) local24);
							local150 = (int) (Math.pow((double) local99, 36.0D) * (double) local24);
							local159 = (int) (Math.pow((double) local99, 12.0D) * (double) local24);
						} else {
							local159 = 0;
							local150 = 0;
							local141 = 0;
						}
						local32[local91][local38] = (byte) local141;
						local36[local91][local38] = (byte) local150;
						local28[local91][local38] = (byte) local159;
					}
					local38++;
				}
			}
			this.aClass44_Sub3Array1 = new Class44_Sub3[3];
			this.aClass44_Sub3Array1[0] = new Class44_Sub3(this.aClass40_Sub2_32, 6406, 64, false, local32, 6406);
			this.aClass44_Sub3Array1[1] = new Class44_Sub3(this.aClass40_Sub2_32, 6406, 64, false, local36, 6406);
			this.aClass44_Sub3Array1[2] = new Class44_Sub3(this.aClass40_Sub2_32, 6406, 64, false, local28, 6406);
			this.method3555();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	@Override
	public void method4589(@OriginalArg(0) int arg0) {
		if (this.aBoolean297) {
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2882(this.aClass44_Sub3Array1[arg0 - 1]);
			this.aClass40_Sub2_32.method2815(0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V")
	@Override
	public void method4593(@OriginalArg(0) boolean arg0) {
		if (this.aClass62_4 == null || !arg0) {
			this.aClass40_Sub2_32.method2812(0, 34168);
			return;
		}
		if (!this.aBoolean296) {
			this.aClass40_Sub2_32.method2815(2);
			this.aClass40_Sub2_32.method2882(this.aClass40_Sub2_32.aClass44_Sub1_2);
			this.aClass40_Sub2_32.method2815(0);
		}
		this.aClass62_4.method1789('\u0000');
		this.aBoolean297 = true;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()V")
	private void method3555() {
		@Pc(3) opengl local3 = this.aClass40_Sub2_32.anOpengl1;
		this.aClass62_4 = new Class62(this.aClass40_Sub2_32, 2);
		this.aClass62_4.method1787(0);
		this.aClass40_Sub2_32.method2815(1);
		local3.glTexGeni(8192, 9472, 34065);
		local3.glTexGeni(8193, 9472, 34065);
		local3.glTexGeni(8194, 9472, 34065);
		local3.glEnable(3168);
		local3.glEnable(3169);
		local3.glEnable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		local3.glMatrixMode(5888);
		if (this.aBoolean296) {
			this.aClass40_Sub2_32.method2849(260, 7681);
			this.aClass40_Sub2_32.method2833(0, 5890, 770);
			this.aClass40_Sub2_32.method2812(0, 34167);
		} else {
			this.aClass40_Sub2_32.method2849(7681, 8448);
			this.aClass40_Sub2_32.method2833(0, 34168, 768);
			this.aClass40_Sub2_32.method2815(2);
			this.aClass40_Sub2_32.method2849(260, 7681);
			this.aClass40_Sub2_32.method2833(0, 34168, 768);
			this.aClass40_Sub2_32.method2833(1, 34168, 770);
			this.aClass40_Sub2_32.method2812(0, 34167);
		}
		this.aClass40_Sub2_32.method2815(0);
		this.aClass62_4.method1788();
		this.aClass62_4.method1787(1);
		this.aClass40_Sub2_32.method2815(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean296) {
			this.aClass40_Sub2_32.method2849(8448, 8448);
			this.aClass40_Sub2_32.method2833(0, 5890, 768);
			this.aClass40_Sub2_32.method2812(0, 5890);
		} else {
			this.aClass40_Sub2_32.method2849(8448, 8448);
			this.aClass40_Sub2_32.method2833(0, 5890, 768);
			this.aClass40_Sub2_32.method2815(2);
			this.aClass40_Sub2_32.method2849(8448, 8448);
			this.aClass40_Sub2_32.method2833(0, 5890, 768);
			this.aClass40_Sub2_32.method2833(1, 34168, 768);
			this.aClass40_Sub2_32.method2812(0, 5890);
		}
		this.aClass40_Sub2_32.method2815(0);
		this.aClass62_4.method1788();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
	@Override
	public void method4588() {
		if (this.aBoolean297) {
			if (!this.aBoolean296) {
				this.aClass40_Sub2_32.method2815(2);
				this.aClass40_Sub2_32.method2882(null);
			}
			this.aClass40_Sub2_32.method2815(1);
			this.aClass40_Sub2_32.method2882(null);
			this.aClass40_Sub2_32.method2815(0);
			this.aClass62_4.method1789('\u0001');
			this.aBoolean297 = false;
		} else {
			this.aClass40_Sub2_32.method2812(0, 5890);
		}
		this.aClass40_Sub2_32.method2849(8448, 8448);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!dg;)V")
	@Override
	public void method4590(@OriginalArg(0) Class44 arg0) {
		this.aClass40_Sub2_32.method2882(arg0);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	@Override
	public void method4591(@OriginalArg(0) boolean arg0) {
		this.aClass40_Sub2_32.method2849(8448, 7681);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()Z")
	@Override
	public boolean method4592() {
		return true;
	}
}
