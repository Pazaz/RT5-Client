import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "()V")
	public static void method2182() {
		@Pc(11) byte[] local11;
		if (aByteBuffer1 == null) {
			@Pc(5) Class57_Sub2_Sub1 local5 = new Class57_Sub2_Sub1();
			local11 = local5.generate();
			aByteBuffer1 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer1.position(0);
			aByteBuffer1.put(local11);
			aByteBuffer1.flip();
		}
		if (aByteBuffer2 != null) {
			return;
		}
		@Pc(32) Class57_Sub1_Sub1 local32 = new Class57_Sub1_Sub1();
		local11 = local32.generate();
		aByteBuffer2 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer2.position(0);
		aByteBuffer2.put(local11);
		aByteBuffer2.flip();
	}
}
