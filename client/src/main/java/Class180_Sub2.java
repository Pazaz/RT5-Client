import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class180_Sub2 extends Class180 implements Interface4 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	private int anInt6773;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	private int anInt6774;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!bf;I[BI)V")
	public Class180_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6773 = arg1;
		this.anInt6774 = this.aClass19_Sub1_39.method798(this.anInt6773);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	@Override
	public void method6065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass19_Sub1_39.anOpengl1.glDrawElements(GL.GL_TRIANGLES, arg1, this.anInt6773, this.aByteBuffer7.position(arg0 * this.anInt6774));
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
	@Override
	public int method6066() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method6067(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6064(arg0, arg1);
		this.anInt6773 = 5123;
		this.anInt6774 = this.aClass19_Sub1_39.method798(this.anInt6773);
	}
}
