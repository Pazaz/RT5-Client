import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!lja", name = "l", descriptor = "I")
	public static int anInt5852 = -1;

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "I")
	public static int anInt5858 = 0;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BC)Ljava/lang/String;")
	public static String method5261(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(14) int local14 = arg0.length();
		@Pc(17) int local17 = arg1.length();
		@Pc(19) int local19 = local14;
		@Pc(23) int local23 = local17 - 1;
		if (local23 != 0) {
			@Pc(27) int local27 = 0;
			while (true) {
				local27 = arg0.indexOf(13, local27);
				if (local27 < 0) {
					break;
				}
				local19 += local23;
				local27++;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local19);
		@Pc(50) int local50 = 0;
		while (true) {
			@Pc(55) int local55 = arg0.indexOf(13, local50);
			if (local55 < 0) {
				local48.append(arg0.substring(local50));
				return local48.toString();
			}
			local48.append(arg0.substring(local50, local55));
			local50 = local55 + 1;
			local48.append(arg1);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(II)Z")
	public static boolean method5262(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(BI[BI)Ljava/lang/String;")
	public static String method5264(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg2;
		@Pc(22) int local22 = arg0 + arg2;
		while (local22 > local18) {
			@Pc(31) int local31 = arg1[local18++] & 0xFF;
			@Pc(45) int local45;
			if (local31 < 128) {
				if (local31 == 0) {
					local45 = 65533;
				} else {
					local45 = local31;
				}
			} else if (local31 < 192) {
				local45 = 65533;
			} else if (local31 >= 224) {
				if (local31 >= 240) {
					if (local31 >= 248) {
						local45 = 65533;
					} else if (local18 + 2 < local22 && (arg1[local18] & 0xC0) == 128 && (arg1[local18 + 1] & 0xC0) == 128 && (arg1[local18 + 2] & 0xC0) == 128) {
						local45 = (arg1[local18++] & 0x3F) << 12 | (local31 & 0x7) << 18 | (arg1[local18++] & 0x3F) << 6 | arg1[local18++] & 0x3F;
						if (local45 >= 65536 && local45 <= 1114111) {
							local45 = 65533;
						} else {
							local45 = 65533;
						}
					} else {
						local45 = 65533;
					}
				} else if (local22 > local18 + 1 && (arg1[local18] & 0xC0) == 128 && (arg1[local18 + 1] & 0xC0) == 128) {
					local45 = (local31 & 0xF) << 12 | (arg1[local18++] & 0x3F) << 6 | arg1[local18++] & 0x3F;
					if (local45 < 2048) {
						local45 = 65533;
					}
				} else {
					local45 = 65533;
				}
			} else if (local18 < local22 && (arg1[local18] & 0xC0) == 128) {
				local45 = (local31 & 0x1F) << 6 | arg1[local18++] & 0x3F;
				if (local45 < 128) {
					local45 = 65533;
				}
			} else {
				local45 = 65533;
			}
			local8[local10++] = (char) local45;
		}
		return new String(local8, 0, local10);
	}
}
