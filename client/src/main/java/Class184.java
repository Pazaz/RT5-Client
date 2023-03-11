import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class184 implements Interface1 {

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	private int anInt5069 = -1;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_30;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public final int anInt5067;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	public final int anInt5065;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	private final int anInt5066;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	private int anInt5068;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	private final int anInt5064;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!bf;III)V")
	public Class184(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass19_Sub1_30 = arg0;
		this.anInt5067 = arg2;
		this.anInt5065 = arg3;
		this.anInt5066 = arg1;
		@Pc(20) opengl local20 = this.aClass19_Sub1_30.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static275.anIntArray353, 0);
		this.anInt5068 = Static275.anIntArray353[0];
		local20.glBindRenderbufferEXT(GL.GL_RENDERBUFFER, this.anInt5068);
		local20.glRenderbufferStorageEXT(GL.GL_RENDERBUFFER, this.anInt5066, this.anInt5067, this.anInt5065);
		this.anInt5064 = this.anInt5067 * this.anInt5065 * this.aClass19_Sub1_30.method778(this.anInt5066);
	}

	@OriginalMember(owner = "client!pq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4650();
		super.finalize();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
	public void method4649(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_30.anOpengl1.glFramebufferRenderbufferEXT(GL.GL_FRAMEBUFFER, arg0, GL.GL_RENDERBUFFER, this.anInt5068);
		this.anInt5069 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()V")
	@Override
	public void method6152() {
		this.aClass19_Sub1_30.anOpengl1.glFramebufferRenderbufferEXT(GL.GL_FRAMEBUFFER, this.anInt5069, GL.GL_RENDERBUFFER, 0);
		this.anInt5069 = -1;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "()V")
	public void method4650() {
		if (this.anInt5068 > 0) {
			this.aClass19_Sub1_30.method785(this.anInt5068, this.anInt5064);
			this.anInt5068 = 0;
		}
	}
}
