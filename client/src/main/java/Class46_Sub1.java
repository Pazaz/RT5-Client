import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class46_Sub1 extends Class46 implements Interface2 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ih;ILjava/nio/ByteBuffer;)V")
	public Class46_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt3174 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ih;I[BI)V")
	public Class46_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3174 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(Lclient!am;)V")
	@Override
	public void method3541(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_41.anOpengl1.glColorPointer(arg0.aByte8, arg0.aShort13, this.anInt3174, this.aByteBuffer7.position(arg0.aByte9));
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!am;)V")
	@Override
	public void method3539(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_41.anOpengl1.glTexCoordPointer(arg0.aByte8, arg0.aShort13, this.anInt3174, this.aByteBuffer7.position(arg0.aByte9));
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method6092(arg1, arg2);
		this.anInt3174 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!am;)V")
	@Override
	public void method3538(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_41.anOpengl1.glVertexPointer(arg0.aByte8, arg0.aShort13, this.anInt3174, this.aByteBuffer7.position(arg0.aByte9));
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Lclient!am;)V")
	@Override
	public void method3540(@OriginalArg(0) Class9 arg0) {
		this.aClass40_Sub2_41.anOpengl1.glNormalPointer(arg0.aShort13, this.anInt3174, this.aByteBuffer7.position(arg0.aByte9));
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
	@Override
	public int method6093() {
		return 0;
	}
}
