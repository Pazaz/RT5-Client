import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!vca", name = "r", descriptor = "Lclient!lja;")
	public static Class229 aClass229_5;

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "Lclient!sb;")
	public static Class330 aClass330_119;

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_16 = new Class287(12, 7);

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray244 = new int[128][128];

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
	public static void method8700(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static30.aClass2_Sub2_Sub13_3 != null) {
			Static357.anInt6504 = Static30.aClass2_Sub2_Sub13_3.anInt4563;
		} else {
			Static357.anInt6504 = -1;
		}
		Static551.aClass339_54 = null;
		Static210.aClass158_4 = null;
		Static30.aClass2_Sub2_Sub13_3 = null;
		Static273.anInt4403 = 0;
		Static30.method5070();
		Static30.aClass339_31.method7700();
		Static359.aClass327_3 = null;
		Static484.aClass327_6 = null;
		Static30.aClass255_3 = null;
		Static651.aClass327_8 = null;
		Static180.anInt3001 = -1;
		Static13.aClass23_4 = null;
		Static142.aClass327_1 = null;
		Static390.aClass327_5 = null;
		Static559.aClass327_7 = null;
		Static364.aClass327_4 = null;
		Static275.aClass327_2 = null;
		Static558.anInt3181 = -1;
		if (Static30.aClass246_3 != null) {
			Static30.aClass246_3.method5586();
			Static30.aClass246_3.method5583(128, 64);
		}
		if (Static30.aClass363_3 != null) {
			Static30.aClass363_3.method8365(64, 64);
		}
		if (Static30.aClass142_3 != null) {
			Static30.aClass142_3.method3062(64);
		}
		Static529.aClass161_1.method3420(64);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)Lclient!gw;")
	public static Class153 method8701() {
		return Static620.method8321(Static283.anInt4574) ? Static405.aClass153_1 : Static405.aClass153_2;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)I")
	public static int method8702(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	public static void method8703() {
		if (Static566.anInt8472 < 102) {
			Static566.anInt8472 += 6;
		}
		@Pc(26) int local26;
		if (Static523.anInt3885 != -1 && Static305.aLong157 < Static588.method7715()) {
			for (local26 = Static523.anInt3885; local26 < Static144.aStringArray7.length; local26++) {
				if (Static144.aStringArray7[local26].startsWith("pause")) {
					@Pc(40) int local40 = 5;
					try {
						local40 = Integer.parseInt(Static144.aStringArray7[local26].substring(6));
					} catch (@Pc(49) Exception local49) {
					}
					Static79.method1579("Pausing for " + local40 + " seconds...");
					Static523.anInt3885 = local26 + 1;
					Static305.aLong157 = (long) (local40 * 1000) + Static588.method7715();
					return;
				}
				Static110.aString19 = Static144.aStringArray7[local26];
				Static270.method3920(false);
			}
			Static523.anInt3885 = -1;
		}
		if (Static611.anInt9341 != 0) {
			Static213.anInt3471 -= Static611.anInt9341 * 5;
			if (Static213.anInt3471 >= Static512.anInt7664) {
				Static213.anInt3471 = Static512.anInt7664 - 1;
			}
			Static611.anInt9341 = 0;
			if (Static213.anInt3471 < 0) {
				Static213.anInt3471 = 0;
			}
		}
		for (local26 = 0; local26 < Static671.anInt10026; local26++) {
			@Pc(147) Interface27 local147 = Static194.anInterface27Array1[local26];
			@Pc(151) int local151 = local147.method2664();
			@Pc(155) char local155 = local147.method2666();
			@Pc(159) int local159 = local147.method2667();
			if (local151 == 84) {
				Static270.method3920(false);
			}
			if (local151 == 80) {
				Static270.method3920(true);
			} else if (local151 == 66 && (local159 & 0x4) != 0) {
				if (Static175.aClipboard1 != null) {
					@Pc(467) String local467 = "";
					for (@Pc(472) int local472 = Static393.aStringArray32.length - 1; local472 >= 0; local472--) {
						if (Static393.aStringArray32[local472] != null && Static393.aStringArray32[local472].length() > 0) {
							local467 = local467 + Static393.aStringArray32[local472] + '\n';
						}
					}
					Static175.aClipboard1.setContents(new StringSelection(local467), (ClipboardOwner) null);
				}
			} else if (local151 == 67 && (local159 & 0x4) != 0) {
				if (Static175.aClipboard1 != null) {
					try {
						@Pc(207) Transferable local207 = Static175.aClipboard1.getContents((Object) null);
						if (local207 != null) {
							@Pc(214) String local214 = (String) local207.getTransferData(DataFlavor.stringFlavor);
							if (local214 != null) {
								@Pc(221) String[] local221 = Static189.method2861(local214, '\n');
								Static363.method6234(local221);
							}
						}
					} catch (@Pc(226) Exception local226) {
					}
				}
			} else if (local151 == 85 && Static594.anInt8776 > 0) {
				Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8776 - 1) + Static110.aString19.substring(Static594.anInt8776);
				Static594.anInt8776--;
			} else if (local151 == 101 && Static594.anInt8776 < Static110.aString19.length()) {
				Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8776) + Static110.aString19.substring(Static594.anInt8776 + 1);
			} else if (local151 == 96 && Static594.anInt8776 > 0) {
				Static594.anInt8776--;
			} else if (local151 == 97 && Static594.anInt8776 < Static110.aString19.length()) {
				Static594.anInt8776++;
			} else if (local151 == 102) {
				Static594.anInt8776 = 0;
			} else if (local151 == 103) {
				Static594.anInt8776 = Static110.aString19.length();
			} else if (local151 == 104 && Static393.aStringArray32.length > Static625.anInt9472) {
				Static625.anInt9472++;
				Static344.method5046();
				Static594.anInt8776 = Static110.aString19.length();
			} else if (local151 == 105 && Static625.anInt9472 > 0) {
				Static625.anInt9472--;
				Static344.method5046();
				Static594.anInt8776 = Static110.aString19.length();
			} else if (Static596.method7815(local155) || "\\/.:, _-+[]~@".indexOf(local155) != -1) {
				Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8776) + Static194.anInterface27Array1[local26].method2666() + Static110.aString19.substring(Static594.anInt8776);
				Static594.anInt8776++;
			}
		}
		Static216.anInt3530 = 0;
		Static671.anInt10026 = 0;
		Static469.method6362();
	}
}
