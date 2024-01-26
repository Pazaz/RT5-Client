import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public abstract class Class93 implements Interface3 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Z")
	private boolean aBoolean826 = false;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
	private boolean aBoolean825;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public final int anInt10912;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	private final int anInt10908;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!qha;")
	protected final Class19_Sub3 aClass19_Sub3_43;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	protected final int anInt10911;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	protected int anInt10920;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!qha;IIIZ)V")
	protected Class93(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean825 = arg4;
		this.anInt10912 = arg1;
		this.anInt10908 = arg3;
		this.aClass19_Sub3_43 = arg0;
		this.anInt10911 = arg2;
		OpenGL.glGenTextures(1, Static171.anIntArray250, 0);
		this.anInt10920 = Static171.anIntArray250[0];
		this.method9437(0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	private void method9437(@OriginalArg(1) int arg0) {
		this.aClass19_Sub3_43.anInt7994 -= arg0;
		this.aClass19_Sub3_43.anInt7994 += this.method9444();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V")
	public final void method9438(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean826 != arg0) {
			this.aBoolean826 = arg0;
			this.method9439();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	private void method9439() {
		this.aClass19_Sub3_43.method7001(this);
		if (this.aBoolean826) {
			OpenGL.glTexParameteri(this.anInt10912, OpenGL.GL_TEXTURE_MIN_FILTER, this.aBoolean825 ? OpenGL.GL_LINEAR_MIPMAP_LINEAR : OpenGL.GL_LINEAR);
			OpenGL.glTexParameteri(this.anInt10912, OpenGL.GL_TEXTURE_MAG_FILTER, OpenGL.GL_LINEAR);
		} else {
			OpenGL.glTexParameteri(this.anInt10912, OpenGL.GL_TEXTURE_MIN_FILTER, this.aBoolean825 ? OpenGL.GL_NEAREST_MIPMAP_NEAREST : OpenGL.GL_NEAREST);
			OpenGL.glTexParameteri(this.anInt10912, OpenGL.GL_TEXTURE_MAG_FILTER, OpenGL.GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	public final int method9440() {
		return this.anInt10920;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public final void method9442() {
		if (this.anInt10920 > 0) {
			this.aClass19_Sub3_43.method7030(this.anInt10920, this.method9444());
			this.anInt10920 = 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	private int method9444() {
		@Pc(21) int local21 = this.aClass19_Sub3_43.method7028(this.anInt10911) * this.anInt10908;
		return this.aBoolean825 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9442();
		super.finalize();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
	public final boolean method9446() {
		if (!this.aClass19_Sub3_43.aBoolean613) {
			return false;
		}
		@Pc(18) int local18 = this.method9444();
		this.aClass19_Sub3_43.method7001(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10912);
		this.aBoolean825 = true;
		this.method9439();
		this.method9437(local18);
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
	protected final void method9447(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean825) {
			@Pc(7) int local7 = this.method9444();
			this.aBoolean825 = true;
			this.method9439();
			this.method9437(local7);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public abstract void method9435();
}
