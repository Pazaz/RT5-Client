import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	protected int anInt197;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "[I")
	protected int[] anIntArray7;

	@OriginalMember(owner = "client!ei", name = "eb", descriptor = "I")
	protected int anInt202;

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
	private int anInt201 = -1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public final void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt201 = arg1.method5749();
		}
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)Z")
	protected final boolean method145() {
		if (this.anIntArray7 != null) {
			return true;
		} else if (this.anInt201 >= 0) {
			@Pc(25) Class133 local25 = Static167.anInt4042 < 0 ? Static363.method3881(Static66.aClass162_63, this.anInt201) : Static363.method3886(Static66.aClass162_63, Static167.anInt4042, this.anInt201);
			local25.method3884();
			this.anIntArray7 = local25.method3892();
			this.anInt197 = local25.anInt4518;
			this.anInt202 = local25.anInt4515;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)I")
	@Override
	public final int method6075() {
		return this.anInt201;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	@Override
	public final void method6079() {
		super.method6079();
		this.anIntArray7 = null;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157 && this.method145()) {
			@Pc(25) int[] local25 = local13[0];
			@Pc(29) int[] local29 = local13[1];
			@Pc(33) int[] local33 = local13[2];
			@Pc(49) int local49 = (this.anInt202 == Static53.anInt1598 ? arg0 : this.anInt202 * arg0 / Static53.anInt1598) * this.anInt197;
			@Pc(55) int local55;
			@Pc(64) int local64;
			if (Static64.anInt1755 == this.anInt197) {
				for (local55 = 0; local55 < Static64.anInt1755; local55++) {
					local64 = this.anIntArray7[local49++];
					local33[local55] = (local64 & 0xFF) << 4;
					local29[local55] = local64 >> 4 & 0xFF0;
					local25[local55] = local64 >> 12 & 0xFF0;
				}
			} else {
				for (local55 = 0; local55 < Static64.anInt1755; local55++) {
					local64 = this.anInt197 * local55 / Static64.anInt1755;
					@Pc(72) int local72 = this.anIntArray7[local49 + local64];
					local33[local55] = (local72 & 0xFF) << 4;
					local29[local55] = local72 >> 4 & 0xFF0;
					local25[local55] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}
}
