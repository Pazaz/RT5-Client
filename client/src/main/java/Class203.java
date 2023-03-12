import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class203 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_33;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	private final int anInt5702;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!bf;I)V")
	public Class203(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass19_Sub1_33 = arg0;
		this.anInt5702 = this.aClass19_Sub1_33.gl.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(C)V")
	public void method5190(@OriginalArg(0) char arg0) {
		this.aClass19_Sub1_33.gl.glCallList(this.anInt5702 + arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
	public void method5191() {
		this.aClass19_Sub1_33.gl.glEndList();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public void method5192(@OriginalArg(0) int arg0) {
		this.aClass19_Sub1_33.gl.glNewList(this.anInt5702 + arg0, GL.GL_COMPILE);
	}
}
