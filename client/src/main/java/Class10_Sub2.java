import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class10_Sub2 extends Class10 implements Interface5 {

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	private int anInt2298;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!bf;I[BIZ)V")
	public Class10_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2298 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!bf;ILjava/nio/ByteBuffer;Z)V")
	public Class10_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, 34962, arg2, arg3);
		this.anInt2298 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()I")
	@Override
	public int method6066() {
		return super.method6066();
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()V")
	@Override
	protected void method2315() {
		this.aClass19_Sub1_11.method783(this);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4598(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_11.gl.glVertexPointer(arg0.aByte29, arg0.aShort39, this.anInt2298, (long) arg0.aByte28);
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4601(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_11.gl.glTexCoordPointer(arg0.aByte29, arg0.aShort39, this.anInt2298, (long) arg0.aByte28);
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4603(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_11.gl.glNormalPointer(arg0.aShort39, this.anInt2298, (long) arg0.aByte28);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method2314(arg1, arg2);
		this.anInt2298 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lclient!kj;)V")
	@Override
	public void method4600(@OriginalArg(0) Class126 arg0) {
		this.aClass19_Sub1_11.gl.glColorPointer(arg0.aByte29, arg0.aShort39, this.anInt2298, (long) arg0.aByte28);
	}
}
