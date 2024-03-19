import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public int anInt4950;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
	public int anInt4951;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public int anInt4949;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4950 = arg0;
		this.aByteArray68 = arg1;
		this.anInt4951 = arg2;
		this.anInt4949 = arg3;
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4950 = arg0;
		this.aByteArray68 = arg1;
		this.anInt4951 = arg2;
		this.anInt4949 = arg3;
		this.aBoolean343 = arg4;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!hc;)Lclient!ok;")
	public Class1_Sub13_Sub1 method4255(@OriginalArg(0) Class81 arg0) {
		this.aByteArray68 = arg0.method2247(this.aByteArray68);
		this.anInt4950 = arg0.method2249(this.anInt4950);
		if (this.anInt4951 == this.anInt4949) {
			this.anInt4951 = this.anInt4949 = arg0.method2251(this.anInt4951);
		} else {
			this.anInt4951 = arg0.method2251(this.anInt4951);
			this.anInt4949 = arg0.method2251(this.anInt4949);
			if (this.anInt4951 == this.anInt4949) {
				this.anInt4951--;
			}
		}
		return this;
	}
}
