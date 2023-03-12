import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class180_Sub1 extends Class180 implements Interface5 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	private int anInt5024;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!bf;ILjava/nio/ByteBuffer;)V")
	public Class180_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2) {
		super(arg0, arg2);
		this.anInt5024 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!bf;I[BI)V")
	public Class180_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5024 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4603(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_39.gl.glNormalPointer(arg0.aShort39, this.anInt5024, this.aByteBuffer7.position(arg0.aByte28));
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()I")
	@Override
	public int method6066() {
		return 0;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4601(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_39.gl.glTexCoordPointer(arg0.aByte29, arg0.aShort39, this.anInt5024, this.aByteBuffer7.position(arg0.aByte28));
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4598(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_39.gl.glVertexPointer(arg0.aByte29, arg0.aShort39, this.anInt5024, this.aByteBuffer7.position(arg0.aByte28));
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4600(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_39.gl.glColorPointer(arg0.aByte29, arg0.aShort39, this.anInt5024, this.aByteBuffer7.position(arg0.aByte28));
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method6064(arg1, arg2);
		this.anInt5024 = arg0;
	}
}
