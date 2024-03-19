import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class Class46 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!ih;")
	protected final Class40_Sub2 aClass40_Sub2_41;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!ih;[BI)V")
	protected Class46(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass40_Sub2_41 = arg0;
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer7.put(arg1, 0, arg2);
		}
		this.aByteBuffer7.flip();
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!ih;Ljava/nio/ByteBuffer;)V")
	protected Class46(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass40_Sub2_41 = arg0;
		this.aByteBuffer7 = arg1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([BI)V")
	protected final void method6092(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer7 == null || this.aByteBuffer7.capacity() < arg1) {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer7.clear();
		}
		this.aByteBuffer7.put(arg0, 0, arg1);
		this.aByteBuffer7.flip();
	}
}
