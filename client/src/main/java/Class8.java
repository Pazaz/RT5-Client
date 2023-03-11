import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public abstract class Class8 implements Interface1 {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Z")
	private boolean aBoolean468 = false;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!bf;")
	protected final Class19_Sub1 aClass19_Sub1_40;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
	public final int anInt6882;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
	protected final int anInt6883;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	private final int anInt6884;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
	protected int anInt6881;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!bf;IIIZ)V")
	protected Class8(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass19_Sub1_40 = arg0;
		this.anInt6882 = arg1;
		this.anInt6883 = arg2;
		this.aBoolean467 = arg4;
		this.anInt6884 = arg3;
		this.aClass19_Sub1_40.anOpengl1.glGenTextures(1, Static187.anIntArray478, 0);
		this.anInt6881 = Static187.anIntArray478[0];
		this.method6154(0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	private void method6154(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_40.anInt585 -= arg0;
		this.aClass19_Sub1_40.anInt585 += this.method6162();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
	public final void method6156() {
		if (this.anInt6881 > 0) {
			this.aClass19_Sub1_40.method803(this.anInt6881, this.method6162());
			this.anInt6881 = 0;
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()I")
	public final int method6158() {
		return this.anInt6881;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "()Z")
	public final boolean method6159() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.anOpengl1;
		if (!this.aClass19_Sub1_40.aBoolean36) {
			return false;
		}
		@Pc(10) int local10 = this.method6162();
		this.aClass19_Sub1_40.method848(this);
		local3.glGenerateMipmapEXT(this.anInt6882);
		this.aBoolean467 = true;
		this.method6161();
		this.method6154(local10);
		return true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public final void method6160(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean468 != arg0) {
			this.aBoolean468 = arg0;
			this.method6161();
		}
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "()V")
	private void method6161() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_40.anOpengl1;
		this.aClass19_Sub1_40.method848(this);
		if (this.aBoolean468) {
			local3.glTexParameteri(this.anInt6882, GL.GL_TEXTURE_MIN_FILTER, this.aBoolean467 ? GL.GL_LINEAR_MIPMAP_LINEAR : GL.GL_LINEAR);
			local3.glTexParameteri(this.anInt6882, GL.GL_TEXTURE_MAG_FILTER, GL.GL_LINEAR);
		} else {
			local3.glTexParameteri(this.anInt6882, GL.GL_TEXTURE_MIN_FILTER, this.aBoolean467 ? GL.GL_NEAREST_MIPMAP_NEAREST : GL.GL_NEAREST);
			local3.glTexParameteri(this.anInt6882, GL.GL_TEXTURE_MAG_FILTER, GL.GL_NEAREST);
		}
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "()I")
	private int method6162() {
		@Pc(8) int local8 = this.aClass19_Sub1_40.method778(this.anInt6883) * this.anInt6884;
		return this.aBoolean467 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6156();
		super.finalize();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)V")
	protected final void method6165(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean467 != arg0) {
			@Pc(6) int local6 = this.method6162();
			this.aBoolean467 = true;
			this.method6161();
			this.method6154(local6);
		}
	}
}
