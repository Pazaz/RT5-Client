import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class152_Sub1 extends Class152 {

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method4436() {
		@Pc(10) byte[] local10 = new byte[this.aByteBuffer3.capacity()];
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.get(local10);
		return local10;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([BI)V")
	@Override
	public void method4434(@OriginalArg(0) byte[] arg0) {
		this.aByteBuffer3 = ByteBuffer.allocateDirect(arg0.length);
		this.aByteBuffer3.position(0);
		this.aByteBuffer3.put(arg0);
	}
}
