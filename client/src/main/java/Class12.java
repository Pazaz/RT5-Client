import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public abstract class Class12 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!ih;")
	protected final Class40_Sub2 aClass40_Sub2_22;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	private final int anInt4124;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	private int anInt4125;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
	private final boolean aBoolean292;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	private final int anInt4126;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class12(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass40_Sub2_22 = arg0;
		this.anInt4124 = arg1;
		this.anInt4125 = arg3;
		this.aBoolean292 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static281.anIntArray289, 0);
		this.anInt4126 = Static281.anIntArray289[0];
		this.method3535();
		local16.glBufferDataARB(arg1, this.anInt4125, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt4125), this.aBoolean292 ? 35040 : 35044);
		this.aClass40_Sub2_22.anInt3195 += this.anInt4125;
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ih;ILjava/nio/ByteBuffer;Z)V")
	public Class12(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass40_Sub2_22 = arg0;
		this.anInt4124 = arg1;
		this.anInt4125 = arg2.limit();
		this.aBoolean292 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static281.anIntArray289, 0);
		this.anInt4126 = Static281.anIntArray289[0];
		this.method3535();
		local17.glBufferDataARB(arg1, this.anInt4125, arg2, this.aBoolean292 ? 35040 : 35044);
		this.aClass40_Sub2_22.anInt3195 += this.anInt4125;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
	public int method6093() {
		return this.anInt4126;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	protected abstract void method3535();

	@OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass40_Sub2_22.method2839(this.anInt4126, this.anInt4125);
		super.finalize();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V")
	protected final void method3536(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3535();
		if (arg1 > this.anInt4125) {
			this.aClass40_Sub2_22.anOpengl1.glBufferDataARB(this.anInt4124, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean292 ? 35040 : 35044);
			this.aClass40_Sub2_22.anInt3195 += arg1 - this.anInt4125;
			this.anInt4125 = arg1;
		} else {
			this.aClass40_Sub2_22.anOpengl1.glBufferSubDataARB(this.anInt4124, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}
}
