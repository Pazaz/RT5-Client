import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class228 implements Interface8 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	private int anInt6403;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	private int anInt6404;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	private int anInt6405;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lclient!aq;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_37;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	private final int anInt6406;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class228(@OriginalArg(0) Class19_Sub1 arg0) {
		if (!arg0.aBoolean36) {
			throw new IllegalStateException("");
		}
		this.aClass19_Sub1_37 = arg0;
		this.aClass19_Sub1_37.gl.glGenFramebuffersEXT(1, Static346.anIntArray433, 0);
		this.anInt6406 = Static346.anIntArray433[0];
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!al;)V")
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1) {
		this.method5797(arg0, arg1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!qd;II)V")
	private void method5795(@OriginalArg(1) Class8_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6405 & 0xFFFFFFFE) == 0) {
			this.anInt6404 = arg0.anInt5167;
			this.anInt6403 = arg0.anInt5167;
		} else if (arg0.anInt5167 != this.anInt6404 || arg0.anInt5167 != this.anInt6403) {
			throw new RuntimeException();
		}
		arg0.method4740(Static346.anIntArray434[0], arg1);
		this.anInterface1Array1[0] = arg0;
		this.anInt6405 |= 0x1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method5796(@OriginalArg(0) int arg0) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		this.aClass19_Sub1_37.gl.glDrawBuffer(Static346.anIntArray434[arg0]);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!al;I)V")
	private void method5797(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt6405 & ~local12) == 0) {
			this.anInt6404 = arg1.anInt3684;
			this.anInt6403 = arg1.anInt3685;
		} else if (arg1.anInt3684 != this.anInt6404 || arg1.anInt3685 != this.anInt6403) {
			throw new RuntimeException();
		}
		arg1.method3639(Static346.anIntArray434[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt6405 |= local12;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	@Override
	public void method5791() {
		this.aClass19_Sub1_37.gl.glBindFramebufferEXT(GL.GL_FRAMEBUFFER, this.anInt6406);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
	@Override
	public void method5792() {
		this.aClass19_Sub1_37.gl.glBindFramebufferEXT(GL.GL_FRAMEBUFFER, 0);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public void method5798(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method6152();
		}
		this.anInt6405 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()Z")
	public boolean method5799() {
		@Pc(5) int local5 = this.aClass19_Sub1_37.gl.glCheckFramebufferStatusEXT(GL.GL_FRAMEBUFFER);
		return local5 == GL.GL_FRAMEBUFFER_COMPLETE;
	}

	@OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub1_37.method822(this.anInt6406);
		super.finalize();
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()I")
	@Override
	public int method5793() {
		return this.anInt6403;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!pq;)V")
	public void method5800(@OriginalArg(1) Class184 arg0) {
		if (this.aClass19_Sub1_37.method821() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6405 & 0xFFFFFEFF) == 0) {
			this.anInt6404 = arg0.anInt5067;
			this.anInt6403 = arg0.anInt5065;
		} else if (arg0.anInt5067 != this.anInt6404 || arg0.anInt5065 != this.anInt6403) {
			throw new RuntimeException();
		}
		arg0.method4649(Static346.anIntArray434[8]);
		this.anInterface1Array1[8] = arg0;
		this.anInt6405 |= 0x100;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!qd;I)V")
	public void method5801(@OriginalArg(1) Class8_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method5795(arg0, arg1);
	}
}
