import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class52 {

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
	public final int[] anIntArray100 = new int[2];

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
	public final int[] anIntArray98 = new int[2];

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
	public final int[] anIntArray97 = new int[3];

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[I")
	public final int[] anIntArray99 = new int[3];

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!vfa;)V")
	public Class52(@OriginalArg(0) Class382 arg0) {
		this.anIntArray97[0] = arg0.anInt10084;
		this.anIntArray97[1] = arg0.anInt10102;
		this.anIntArray97[2] = arg0.anInt10095;
		this.anIntArray99[0] = arg0.anInt10104;
		this.anIntArray99[1] = arg0.anInt10106;
		this.anIntArray99[2] = arg0.anInt10135;
		this.anIntArray98[0] = arg0.anInt10133;
		this.anIntArray98[1] = arg0.anInt10111;
		this.anIntArray100[0] = arg0.anInt10092;
		this.anIntArray100[1] = arg0.anInt10119;
		if (arg0.aShortArray136 != null) {
			this.aShortArray11 = new short[arg0.aShortArray136.length];
			Static734.method7692(arg0.aShortArray136, 0, this.aShortArray11, 0, this.aShortArray11.length);
		}
		if (arg0.aShortArray137 != null) {
			this.aShortArray10 = new short[arg0.aShortArray137.length];
			Static734.method7692(arg0.aShortArray137, 0, this.aShortArray10, 0, this.aShortArray10.length);
		}
	}
}
