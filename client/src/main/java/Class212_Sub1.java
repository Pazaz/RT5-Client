import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class212_Sub1 extends Class212 {

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([BZ)V")
	@Override
	public void method5547(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.put(arg0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method5546() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer5.capacity()];
		this.aByteBuffer5.position(0);
		this.aByteBuffer5.get(local10);
		return local10;
	}
}
