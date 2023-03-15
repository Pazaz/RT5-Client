import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Inv {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZZI)I")
	public static int getTotalParam(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class2_Sub41 local10 = Static374.method6275(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray489.length; local18++) {
			if (local10.anIntArray489[local18] >= 0 && local10.anIntArray489[local18] < client.ObjTypes.capacity) {
				@Pc(44) ObjType local44 = client.ObjTypes.get(local10.anIntArray489[local18]);
				@Pc(54) int local54 = local44.getParam(client.ParamTypes.get(arg0).defaultInt, arg0);
				if (arg1) {
					local16 += local10.anIntArray488[local18] * local54;
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZZ)I")
	public static int getFreeSpace(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub41 local14 = Static374.method6275(false, arg0);
		if (local14 == null) {
			return client.InvTypes.get(arg0).size;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray489.length; local31++) {
			if (local14.anIntArray489[local31] == -1) {
				local29++;
			}
		}
		return local29 + client.InvTypes.get(arg0).size - local14.anIntArray489.length;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIB)I")
	public static int getSlotTotal(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub41 local10 = Static374.method6275(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray488.length; local32++) {
				if (arg2 == local10.anIntArray489[local32]) {
					local22 += local10.anIntArray488[local32];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZII)I")
	public static int getItemCount(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub41 local13 = Static374.method6275(arg1, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray488.length) {
			return local13.anIntArray488[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII)I")
	public static int getItemType(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub41 local13 = Static374.method6275(arg0, arg1);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray489.length > arg2) {
			return local13.anIntArray489[arg2];
		} else {
			return -1;
		}
	}

}
