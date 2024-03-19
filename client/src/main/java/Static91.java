import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString89 = "level: ";

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIB)V")
	public static void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static233.anInt5206 = arg1 - Static201.anInt4283;
		Static297.anInt6237 = arg0 - Static201.anInt4281;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Z")
	public static boolean method1996(@OriginalArg(0) int arg0) {
		if (arg0 == 37 || arg0 == 45 || arg0 == 47 || arg0 == 33 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 12 || arg0 == 44 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method1997() {
		if (Static136.anInt3402 < 102) {
			Static136.anInt3402 += 6;
		}
		if (anInt2408 != 0) {
			Static251.anInt5422 -= anInt2408 * 5;
			anInt2408 = 0;
			if (Static172.anInt6632 <= Static251.anInt5422) {
				Static251.anInt5422 = Static172.anInt6632 - 1;
			} else if (Static251.anInt5422 < 0) {
				Static251.anInt5422 = 0;
			}
		}
		@Pc(48) int local48;
		for (@Pc(42) int local42 = 0; local42 < Static30.anInt3904; local42++) {
			local48 = Static64.anIntArray117[local42];
			@Pc(53) char local53 = (char) Static93.anIntArray151[local42];
			if (local48 == 84) {
				Static107.method2215();
			} else if (Static345.aBooleanArray30[82] && local48 == 66) {
				if (aClipboard1 != null) {
					@Pc(73) String local73 = "";
					for (@Pc(78) int local78 = Static123.aStringArray19.length - 1; local78 >= 0; local78--) {
						if (Static123.aStringArray19[local78] != null && Static123.aStringArray19[local78].length() > 0) {
							local73 = local73 + Static123.aStringArray19[local78] + '\n';
						}
					}
					aClipboard1.setContents(new StringSelection(local73), null);
				}
			} else if (Static345.aBooleanArray30[82] && local48 == 67) {
				if (aClipboard1 != null) {
					@Pc(130) Transferable local130 = aClipboard1.getContents(null);
					if (local130 != null) {
						try {
							@Pc(137) String local137 = (String) local130.getTransferData(DataFlavor.stringFlavor);
							if (local137 != null) {
								@Pc(144) String[] local144 = Static355.method3607(local137, '\n');
								if (local144.length > 1) {
									for (@Pc(152) int local152 = 0; local152 < local144.length; local152++) {
										Static189.aString162 = local144[local152];
										Static107.method2215();
									}
								} else {
									Static189.aString162 = Static189.aString162 + local137;
								}
							}
						} catch (@Pc(182) Exception local182) {
						}
					}
				}
			} else if (local48 == 85 && Static31.anInt933 > 0) {
				Static189.aString162 = Static189.aString162.substring(0, Static31.anInt933 - 1) + Static189.aString162.substring(Static31.anInt933);
				Static31.anInt933--;
			} else if (local48 == 101 && Static31.anInt933 < Static189.aString162.length()) {
				Static189.aString162 = Static189.aString162.substring(0, Static31.anInt933) + Static189.aString162.substring(Static31.anInt933 + 1);
			} else if (local48 == 96 && Static31.anInt933 > 0) {
				Static31.anInt933--;
			} else if (local48 == 97 && Static31.anInt933 < Static189.aString162.length()) {
				Static31.anInt933++;
			} else if (local48 == 102) {
				Static31.anInt933 = 0;
			} else if (local48 == 103) {
				Static31.anInt933 = Static189.aString162.length();
			} else if (local48 == 104 && Static123.aStringArray19.length > Static89.anInt2369) {
				Static89.anInt2369++;
				Static96.method2041();
				Static31.anInt933 = Static189.aString162.length();
			} else if (local48 == 105 && Static89.anInt2369 > 0) {
				Static89.anInt2369--;
				Static96.method2041();
				Static31.anInt933 = Static189.aString162.length();
			} else if (Static95.method2028(local53) || local53 == ':' || local53 == ',' || local53 == ' ' || local53 == '_' || local53 == '-' || local53 == '+') {
				Static189.aString162 = Static189.aString162.substring(0, Static31.anInt933) + (char) Static93.anIntArray151[local42] + Static189.aString162.substring(Static31.anInt933);
				Static31.anInt933++;
			}
		}
		Static30.anInt3904 = 0;
		for (local48 = 0; local48 < 100; local48++) {
			@Pc(400) int local400;
			if (Static311.aBooleanArray18[local48]) {
				local400 = Static15.anIntArray38[local48]++;
				if (Static15.anIntArray38[local48] > 102) {
					Static311.aBooleanArray18[local48] = false;
				}
			} else {
				local400 = Static15.anIntArray38[local48]--;
				if (Static15.anIntArray38[local48] < 0) {
					Static279.anIntArray450[local48] = (int) ((double) Static107.anInt2674 * Math.random());
					Static327.anIntArray552[local48] = (int) (Math.random() * 350.0D);
					Static15.anIntArray38[local48] = 0;
					Static311.aBooleanArray18[local48] = true;
				}
			}
		}
		Static102.method2127();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static241.aClass154ArrayArrayArray2[0][arg1][arg2] != null && Static241.aClass154ArrayArrayArray2[0][arg1][arg2].aClass154_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static241.aClass154ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class154 local46 = Static241.aClass154ArrayArrayArray2[local22][arg1][arg2] = new Class154(local22, arg1, arg2);
				if (local20) {
					local46.aByte46++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!oq;III)V")
	public static void method2000(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static96.anIntArrayArrayArray3[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt5348 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass1_Sub9_Sub1Array3[arg0.anInt5348++] = Static68.aClass1_Sub9_Sub1Array1[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt5348; local19 < 4; local19++) {
			arg0.aClass1_Sub9_Sub1Array3[local19] = null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ro;III)V")
	public static void method2001(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static158.aClass177_11 != null || Static204.aBoolean329 || (arg0 == null || Static11.method6084(arg0) == null)) {
			return;
		}
		Static158.aClass177_11 = arg0;
		Static337.aClass177_21 = Static11.method6084(arg0);
		Static13.anInt6489 = 0;
		Static60.anInt6015 = arg2;
		Static309.anInt6462 = arg1;
		Static109.aBoolean183 = false;
	}
}
