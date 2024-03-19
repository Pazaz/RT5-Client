import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class12_Sub2 extends Class12 implements Interface2 {

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	private int anInt4127;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class12_Sub2(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4127 = arg1;
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!ih;ILjava/nio/ByteBuffer;Z)V")
	public Class12_Sub2(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt4127 = arg1;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(Lclient!am;)V")
	@Override
	public void method3541(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_22.anOpengl1.glColorPointer(arg0.aByte8, arg0.aShort13, this.anInt4127, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "()I")
	@Override
	public int method6093() {
		return super.method6093();
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Lclient!am;)V")
	@Override
	public void method3540(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_22.anOpengl1.glNormalPointer(arg0.aShort13, this.anInt4127, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()V")
	@Override
	protected void method3535() {
		this.aClass40_Sub2_22.method2813(this);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!am;)V")
	@Override
	public void method3538(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_22.anOpengl1.glVertexPointer(arg0.aByte8, arg0.aShort13, this.anInt4127, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lclient!am;)V")
	@Override
	public void method3539(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_22.anOpengl1.glTexCoordPointer(arg0.aByte8, arg0.aShort13, this.anInt4127, (long) arg0.aByte9);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method3536(arg1, arg2);
		this.anInt4127 = arg0;
	}
}
