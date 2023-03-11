import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class Class180 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Lclient!bf;")
	protected final Class19_Sub1 aClass19_Sub1_39;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	protected ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!bf;[BI)V")
	protected Class180(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub1_39 = arg0;
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg2);
		if (arg1 != null) {
			this.aByteBuffer7.put(arg1, 0, arg2);
		}
		this.aByteBuffer7.flip();
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!bf;Ljava/nio/ByteBuffer;)V")
	protected Class180(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) ByteBuffer arg1) {
		this.aClass19_Sub1_39 = arg0;
		this.aByteBuffer7 = arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([BI)V")
	protected final void method6064(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aByteBuffer7 == null || this.aByteBuffer7.capacity() < arg1) {
			this.aByteBuffer7 = ByteBuffer.allocateDirect(arg1);
		} else {
			this.aByteBuffer7.clear();
		}
		this.aByteBuffer7.put(arg0, 0, arg1);
		this.aByteBuffer7.flip();
	}
}
