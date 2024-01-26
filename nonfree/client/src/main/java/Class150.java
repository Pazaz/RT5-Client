import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class150 {

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "J")
	public long aLong119;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class150(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray286 = arg1;
		this.aShortArray53 = arg2;
		this.aShortArray54 = arg3;
		this.aLong119 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	private Class150() {
	}
}
