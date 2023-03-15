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

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void findQuickChatPhrases(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static361.anInt6769 : Static21.anInt554) + local19;
		for (@Pc(34) int local34 = local19; local34 < local27; local34++) {
			@Pc(40) QuickChatPhraseType local40 = QuickChatPhraseTypeList.get(local34);
			if (local40.aBoolean413 && local40.getText().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					results = null;
					index = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local34;
			}
		}
		index = local13;
		size = 0;
		results = local11;
		@Pc(112) String[] local112 = new String[index];
		for (@Pc(114) int local114 = 0; local114 < index; local114++) {
			local112[local114] = QuickChatPhraseTypeList.get(local11[local114]).getText();
		}
		Static135.method2534(local112, results);
	}

}
