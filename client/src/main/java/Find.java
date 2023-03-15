import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Find {

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	public static int index;
	@OriginalMember(owner = "client!ke", name = "F", descriptor = "[S")
	public static short[] results;
	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public static int size;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void search(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		client.jsArchive19.discardUnpacked = 1;
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(21) short[] local21 = new short[16];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < client.ObjTypes.capacity; local25++) {
			@Pc(34) ObjType local34 = client.ObjTypes.get(local25);
			if ((!arg1 || local34.aBoolean381) && local34.certtemplate == -1 && local34.anInt5235 == -1 && local34.anInt5214 == 0 && local34.name.toLowerCase().indexOf(local18) != -1) {
				if (local23 >= 250) {
					index = -1;
					results = null;
					return;
				}
				if (local21.length <= local23) {
					@Pc(84) short[] local84 = new short[local21.length * 2];
					for (@Pc(86) int local86 = 0; local86 < local23; local86++) {
						local84[local86] = local21[local86];
					}
					local21 = local84;
				}
				local21[local23++] = (short) local25;
			}
		}
		size = 0;
		results = local21;
		index = local23;
		@Pc(128) String[] local128 = new String[index];
		for (@Pc(130) int local130 = 0; local130 < index; local130++) {
			local128[local130] = client.ObjTypes.get(local21[local130]).name;
		}
		Static135.method2534(local128, results);
		client.jsArchive19.discardUnpacked();
		client.jsArchive19.discardUnpacked = 2;
	}

}
