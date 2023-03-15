import org.openrs2.deob.annotation.OriginalMember;

public class PlayerSkillXpTable {

	@OriginalMember(owner = "client!ek", name = "ab", descriptor = "[I")
	public static final int[] experience = new int[25];

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[I")
	public static final int[] baseLevels = new int[25];

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
	public static final int[] boostedLevels = new int[25];

}
