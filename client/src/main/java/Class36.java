import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public final class Class36 {

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
	private final int anInt923;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lclient!qha;I)V")
	public Class36(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt923 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)V")
	public void method1002(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt923 + arg0, OpenGL.GL_COMPILE);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)V")
	public void method1004() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(CB)V")
	public void method1005(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt923);
	}
}
