import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class PlayerSkillXpTable {

	@OriginalMember(owner = "client!ek", name = "ab", descriptor = "[I")
	public static final int[] experience = new int[25];

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
	public static final int[] baseLevels = new int[25];

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
	public static final int[] boostedLevels = new int[25];

	@OriginalMember(owner = "client!at", name = "L", descriptor = "[I")
	public static final int[] xpLevelLookup = new int[99];

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 99; local14++) {
			@Pc(19) int local19 = local14 + 1;
			@Pc(32) int local32 = (int) (Math.pow(2.0D, (double) local19 / 7.0D) * 300.0D + (double) local19);
			local12 += local32;
			xpLevelLookup[local14] = local12 / 4;
		}
	}

}
