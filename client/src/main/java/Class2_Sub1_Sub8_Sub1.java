import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class2_Sub1_Sub8_Sub1 extends Class2_Sub1_Sub8 {

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737 && this.method7238()) {
			@Pc(34) int[] local34 = local20[0];
			@Pc(38) int[] local38 = local20[1];
			@Pc(42) int[] local42 = local20[2];
			@Pc(50) int local50 = super.anInt8231 * (arg0 % super.anInt8231);
			for (@Pc(52) int local52 = 0; local52 < Static608.anInt9289; local52++) {
				@Pc(64) int local64 = super.anIntArray641[local52 % super.anInt8228 + local50];
				local42[local52] = (local64 & 0xFF) << 4;
				local38[local52] = local64 >> 4 & 0xFF0;
				local34[local52] = local64 >> 12 & 0xFF0;
			}
		}
		return local20;
	}
}
