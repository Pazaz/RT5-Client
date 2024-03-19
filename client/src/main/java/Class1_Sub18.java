import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
	public final int anInt3662;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
	public final int anInt3659;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
	public final int[] anIntArray258;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "[Z")
	public final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "[I")
	public final int[] anIntArray259;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3662 = arg0;
		@Pc(11) Class1_Sub16 local11 = new Class1_Sub16(arg1);
		this.anInt3659 = local11.method5761();
		this.anIntArray258 = new int[this.anInt3659];
		this.anIntArrayArray19 = new int[this.anInt3659][];
		this.aBooleanArray9 = new boolean[this.anInt3659];
		this.anIntArray259 = new int[this.anInt3659];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3659; local38++) {
			this.anIntArray259[local38] = local11.method5761();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt3659; local58++) {
			this.aBooleanArray9[local58] = local11.method5761() == 1;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt3659; local81++) {
			this.anIntArray258[local81] = local11.method5749();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt3659; local101++) {
			this.anIntArrayArray19[local101] = new int[local11.method5761()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt3659; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray19[local118].length; local122++) {
				this.anIntArrayArray19[local118][local122] = local11.method5761();
			}
		}
	}
}
