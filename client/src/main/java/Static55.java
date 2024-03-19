import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dp", name = "s", descriptor = "Lclient!ep;")
	public static Class58 aClass58_4;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
	public static int anInt1627;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
	public static int anInt1622 = 0;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[8];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method1389() {
		Static181.aClass215_60.method6060();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILclient!vp;I)V")
	public static void method1390(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13;
		if ((arg0 & 0x800) != 0) {
			local13 = Static299.aClass1_Sub16_Sub2_3.method5758();
			arg1.anInt7088 = Static299.aClass1_Sub16_Sub2_3.method5738();
			arg1.anInt7058 = Static299.aClass1_Sub16_Sub2_3.method5729();
			arg1.aBoolean509 = (local13 & 0x8000) != 0;
			arg1.anInt7094 = local13 & 0x7FFF;
			arg1.lb = arg1.anInt7088 + Static197.anInt4521 + arg1.anInt7094;
		}
		if ((arg0 & 0x20) != 0) {
			arg1.aString265 = Static299.aClass1_Sub16_Sub2_3.method5776();
			if (arg1.aString265.charAt(0) == '~') {
				arg1.aString265 = arg1.aString265.substring(1);
				Static4.method149(arg1.method5991(), 2, arg1.method5993(), 0, arg1.aString265);
			} else if (arg1 == Static264.aClass7_Sub1_Sub1_Sub2_2) {
				Static4.method149(arg1.method5991(), 2, arg1.method5993(), 0, arg1.aString265);
			}
			arg1.anInt7072 = 150;
			arg1.anInt7093 = 0;
			arg1.anInt7077 = 0;
		}
		@Pc(129) int local129;
		if ((arg0 & 0x4) != 0) {
			local13 = Static299.aClass1_Sub16_Sub2_3.method5744();
			local129 = Static299.aClass1_Sub16_Sub2_3.method5738();
			arg1.method5975(local13, local129, Static197.anInt4521);
			arg1.anInt7068 = Static197.anInt4521 + 300;
			arg1.anInt7073 = Static299.aClass1_Sub16_Sub2_3.method5766();
		}
		if ((arg0 & 0x80) != 0) {
			arg1.anInt7054 = Static299.aClass1_Sub16_Sub2_3.method5749();
			if (arg1.anInt7054 == 65535) {
				arg1.anInt7054 = -1;
			}
		}
		if ((arg0 & 0x10) != 0) {
			local13 = Static299.aClass1_Sub16_Sub2_3.method5761();
			@Pc(175) byte[] local175 = new byte[local13];
			@Pc(180) Class1_Sub16 local180 = new Class1_Sub16(local175);
			Static299.aClass1_Sub16_Sub2_3.method5743(local175, local13);
			Static83.aClass1_Sub16Array1[arg2] = local180;
			arg1.method5987(local180);
		}
		if ((arg0 & 0x2) != 0) {
			arg1.anInt7045 = Static299.aClass1_Sub16_Sub2_3.method5748();
			arg1.anInt7091 = Static299.aClass1_Sub16_Sub2_3.method5758();
		}
		@Pc(239) int local239;
		if ((arg0 & 0x200) != 0) {
			local13 = Static299.aClass1_Sub16_Sub2_3.method5761();
			@Pc(225) int[] local225 = new int[local13];
			@Pc(228) int[] local228 = new int[local13];
			@Pc(231) int[] local231 = new int[local13];
			for (@Pc(233) int local233 = 0; local233 < local13; local233++) {
				local239 = Static299.aClass1_Sub16_Sub2_3.method5769();
				if (local239 == 65535) {
					local239 = -1;
				}
				local225[local233] = local239;
				local228[local233] = Static299.aClass1_Sub16_Sub2_3.method5738();
				local231[local233] = Static299.aClass1_Sub16_Sub2_3.method5769();
			}
			Static134.method3032(arg1, local225, local231, local228);
		}
		if ((arg0 & 0x8) != 0) {
			local13 = Static299.aClass1_Sub16_Sub2_3.method5769();
			if (local13 == 65535) {
				local13 = -1;
			}
			local129 = Static299.aClass1_Sub16_Sub2_3.method5729();
			Static259.method4233(local13, local129, arg1);
		}
		@Pc(465) int local465;
		if ((arg0 & 0x100) != 0) {
			local13 = Static299.aClass1_Sub16_Sub2_3.method5749();
			if (local13 == 65535) {
				local13 = -1;
			}
			local129 = Static299.aClass1_Sub16_Sub2_3.method5746();
			@Pc(320) boolean local320 = true;
			@Pc(348) Class165 local348;
			if (local13 != -1 && arg1.anInt7052 != -1) {
				@Pc(336) Class122 local336;
				if (local13 == arg1.anInt7052) {
					local336 = Static243.method4561(local13);
					if (local336.aBoolean295 && local336.anInt4135 != -1) {
						local348 = Static231.method4385(local336.anInt4135);
						local239 = local348.anInt5575;
						if (local239 == 0) {
							local320 = false;
						} else if (local239 == 1) {
							local320 = true;
						} else if (local239 == 2) {
							arg1.anInt7099 = 0;
							local320 = false;
						}
					}
				} else {
					local336 = Static243.method4561(local13);
					@Pc(383) Class122 local383 = Static243.method4561(arg1.anInt7052);
					if (local336.anInt4135 != -1 && local383.anInt4135 != -1) {
						@Pc(398) Class165 local398 = Static231.method4385(local336.anInt4135);
						@Pc(403) Class165 local403 = Static231.method4385(local383.anInt4135);
						if (local398.anInt5568 < local403.anInt5568) {
							local320 = false;
						}
					}
				}
			}
			if (local320) {
				arg1.anInt7082 = 0;
				arg1.anInt7050 = 1;
				arg1.anInt7081 = Static197.anInt4521 + (local129 & 0xFFFF);
				arg1.anInt7080 = local129 >> 16;
				arg1.anInt7060 = 0;
				arg1.anInt7052 = local13;
				if (Static197.anInt4521 < arg1.anInt7081) {
					arg1.anInt7060 = -1;
				}
				if (arg1.anInt7052 != -1 && Static197.anInt4521 == arg1.anInt7081) {
					local465 = Static243.method4561(arg1.anInt7052).anInt4135;
					if (local465 != -1) {
						local348 = Static231.method4385(local465);
						if (local348 != null && local348.anIntArray407 != null) {
							Static209.method4128(arg1.anInt7027, Static264.aClass7_Sub1_Sub1_Sub2_2 == arg1, 0, arg1.anInt7032, local348);
						}
					}
				}
			}
		}
		if ((arg0 & 0x1000) != 0) {
			arg1.anInt7075 = Static299.aClass1_Sub16_Sub2_3.method5766();
			arg1.anInt7048 = Static299.aClass1_Sub16_Sub2_3.method5761();
			arg1.anInt7067 = Static299.aClass1_Sub16_Sub2_3.method5766();
			arg1.anInt7064 = Static299.aClass1_Sub16_Sub2_3.method5761();
			arg1.anInt7098 = Static299.aClass1_Sub16_Sub2_3.method5749() + Static197.anInt4521;
			arg1.anInt7044 = Static299.aClass1_Sub16_Sub2_3.method5769() + Static197.anInt4521;
			arg1.anInt7065 = Static299.aClass1_Sub16_Sub2_3.method5738();
			arg1.anInt7113 = 1;
			arg1.anInt7111 = 0;
		}
		if ((arg0 & 0x400) != 0) {
			local13 = Static299.aClass1_Sub16_Sub2_3.method5744();
			local129 = Static299.aClass1_Sub16_Sub2_3.method5761();
			arg1.method5975(local13, local129, Static197.anInt4521);
		}
		if ((arg0 & 0x40) == 0) {
			return;
		}
		local13 = Static299.aClass1_Sub16_Sub2_3.method5758();
		local129 = Static299.aClass1_Sub16_Sub2_3.method5738();
		@Pc(584) int local584 = Static299.aClass1_Sub16_Sub2_3.method5729();
		local465 = Static299.aClass1_Sub16_Sub2_3.anInt6813;
		@Pc(598) boolean local598 = (local13 & 0x8000) != 0;
		if (arg1.aString266 != null && arg1.aClass190_2 != null) {
			@Pc(606) boolean local606 = false;
			if (local129 <= 1) {
				if (!local598 && (Static166.aBoolean286 && !Static93.aBoolean158 || Static221.aBoolean352)) {
					local606 = true;
				} else if (Static344.method6064(arg1.aString266)) {
					local606 = true;
				}
			}
			if (!local606 && Static319.anInt6579 == 0) {
				Static109.aClass1_Sub16_2.anInt6813 = 0;
				Static299.aClass1_Sub16_Sub2_3.method5774(local584, Static109.aClass1_Sub16_2.aByteArray86);
				Static109.aClass1_Sub16_2.anInt6813 = 0;
				@Pc(647) int local647 = -1;
				@Pc(666) String local666;
				if (local598) {
					local13 &= 0x7FFF;
					@Pc(657) Class123 local657 = Static124.method2655(Static109.aClass1_Sub16_2);
					local647 = local657.anInt4141;
					local666 = local657.aClass1_Sub1_Sub12_1.method2692(Static109.aClass1_Sub16_2);
				} else {
					local666 = Static179.method3632(Static334.method5893(Static162.method3412(Static109.aClass1_Sub16_2)));
				}
				arg1.aString265 = local666.trim();
				arg1.anInt7072 = 150;
				arg1.anInt7093 = local13 >> 8;
				arg1.anInt7077 = local13 & 0xFF;
				@Pc(707) int local707;
				if (local129 == 1 || local129 == 2) {
					local707 = local598 ? 17 : 1;
				} else {
					local707 = local598 ? 17 : 2;
				}
				if (local129 == 2) {
					Static85.method1902("<img=1>" + arg1.method5993(), "<img=1>" + arg1.method5991(), local707, local666, 0, null, local647);
				} else if (local129 == 1) {
					Static85.method1902("<img=0>" + arg1.method5993(), "<img=0>" + arg1.method5991(), local707, local666, 0, null, local647);
				} else {
					Static85.method1902(arg1.method5993(), arg1.method5991(), local707, local666, 0, null, local647);
				}
			}
		}
		Static299.aClass1_Sub16_Sub2_3.anInt6813 = local584 + local465;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
	public static void method1391() {
		Static318.anInt6552 = 0;
		Static15.anInt631 = 0;
		Static100.method3992();
		Static307.method5402();
		Static223.method4325();
		Static32.method5955();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static15.anInt631; local23++) {
			local29 = Static305.anIntArray489[local23];
			if (Static168.aClass7_Sub1_Sub1_Sub2Array1[local29].anInt7079 != Static197.anInt4521) {
				if (Static168.aClass7_Sub1_Sub1_Sub2Array1[local29].anInt7135 > 0) {
					Static94.method2021(Static168.aClass7_Sub1_Sub1_Sub2Array1[local29]);
				}
				Static168.aClass7_Sub1_Sub1_Sub2Array1[local29] = null;
			}
		}
		if (Static299.aClass1_Sub16_Sub2_3.anInt6813 != Static200.anInt4591) {
			throw new RuntimeException("gpp1 pos:" + Static299.aClass1_Sub16_Sub2_3.anInt6813 + " psize:" + Static200.anInt4591);
		}
		for (local29 = 0; local29 < Static329.anInt6733; local29++) {
			if (Static168.aClass7_Sub1_Sub1_Sub2Array1[Static238.anIntArray389[local29]] == null) {
				throw new RuntimeException("gpp2 pos:" + local29 + " size:" + Static329.anInt6733);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1393(@OriginalArg(1) String arg0) {
		Static327.aString256 = arg0;
		if (Static184.aClass199_12.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static184.aClass199_12.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static184.aClass199_12.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static124.method2656(Static325.method5658() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static358.method1002("document.cookie=\"" + local39 + "\"", Static184.aClass199_12.anApplet1);
		} catch (@Pc(90) Throwable local90) {
		}
	}
}
