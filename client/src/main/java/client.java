import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[[I")
	public static final int[][] lb = new int[128][128];

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static140.method3080("argument count");
			}
			Static150.anInt3681 = Integer.parseInt(arg0[0]);
			Static312.anInt6002 = 2;
			if (arg0[1].equals("live")) {
				Static344.anInt7238 = 0;
			} else if (arg0[1].equals("rc")) {
				Static344.anInt7238 = 1;
			} else if (arg0[1].equals("wip")) {
				Static344.anInt7238 = 2;
			} else {
				Static140.method3080("modewhat");
			}
			Static60.anInt6011 = Static303.method5308(arg0[2]);
			if (Static60.anInt6011 == -1) {
				if (arg0[2].equals("english")) {
					Static60.anInt6011 = 0;
				} else if (arg0[2].equals("german")) {
					Static60.anInt6011 = 1;
				} else {
					Static140.method3080("language");
				}
			}
			Static263.method4777(Static60.anInt6011);
			Static208.aBoolean333 = false;
			Static174.aBoolean294 = false;
			if (arg0[3].equals("game0")) {
				Static199.anInt4559 = 0;
			} else if (arg0[3].equals("game1")) {
				Static199.anInt4559 = 1;
			} else {
				Static140.method3080("game");
			}
			Static339.anInt7353 = 0;
			Static155.anInt3850 = Static199.anInt4559;
			Static192.anInt4459 = 0;
			Static327.aString256 = "";
			@Pc(122) client local122 = new client();
			Static345.aClient1 = local122;
			local122.method903(Static344.anInt7238 + 32, Static199.anInt4559 == 1 ? "stellardawn" : "runescape");
			Static252.aFrame2.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static58.method1402(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method920() {
		if (Static244.anInt2611 < Static59.aClass182_5.anInt5977) {
			if (Static272.anInt5743 == Static56.anInt1631) {
				Static272.anInt5743 = Static124.anInt3119;
			} else {
				Static272.anInt5743 = Static56.anInt1631;
			}
			Static87.anInt2330 = (Static59.aClass182_5.anInt5977 * 50 - 50) * 5;
			if (Static87.anInt2330 > 3000) {
				Static87.anInt2330 = 3000;
			}
			if (Static59.aClass182_5.anInt5977 >= 2 && Static59.aClass182_5.anInt5978 == 6) {
				this.method910("js5connect_outofdate");
				Static214.anInt4865 = 1000;
				return;
			}
			if (Static59.aClass182_5.anInt5977 >= 4 && Static59.aClass182_5.anInt5978 == -1) {
				this.method910("js5crc");
				Static214.anInt4865 = 1000;
				return;
			}
			if (Static59.aClass182_5.anInt5977 >= 4 && (Static214.anInt4865 == 0 || Static214.anInt4865 == 5)) {
				if (Static59.aClass182_5.anInt5978 == 7 || Static59.aClass182_5.anInt5978 == 9) {
					this.method910("js5connect_full");
				} else if (Static59.aClass182_5.anInt5978 > 0) {
					this.method910("js5connect");
				} else {
					this.method910("js5io");
				}
				Static214.anInt4865 = 1000;
				return;
			}
		}
		Static244.anInt2611 = Static59.aClass182_5.anInt5977;
		if (Static87.anInt2330 > 0) {
			Static87.anInt2330--;
			return;
		}
		try {
			if (Static241.anInt5344 == 0) {
				Static62.aClass145_4 = Static184.aClass199_12.method5471(Static300.aString235, Static272.anInt5743);
				Static241.anInt5344++;
			}
			if (Static241.anInt5344 == 1) {
				if (Static62.aClass145_4.anInt5065 == 2) {
					this.method924(1000);
					return;
				}
				if (Static62.aClass145_4.anInt5065 == 1) {
					Static241.anInt5344++;
				}
			}
			if (Static241.anInt5344 == 2) {
				Static107.aClass42_2 = new Class42((Socket) Static62.aClass145_4.anObject6, Static184.aClass199_12);
				@Pc(182) Class1_Sub16 local182 = new Class1_Sub16(5);
				local182.method5771(15);
				local182.method5768(562);
				Static107.aClass42_2.method1273(5, local182.aByteArray86);
				Static241.anInt5344++;
				Static61.aLong54 = Static325.method5658();
			}
			if (Static241.anInt5344 == 3) {
				if (Static214.anInt4865 == 0 || Static214.anInt4865 == 5 || Static107.aClass42_2.method1269() > 0) {
					@Pc(242) int local242 = Static107.aClass42_2.method1263();
					if (local242 != 0) {
						this.method924(local242);
						return;
					}
					Static241.anInt5344++;
				} else if (Static325.method5658() - Static61.aLong54 > 30000L) {
					this.method924(1001);
					return;
				}
			}
			if (Static241.anInt5344 == 4) {
				@Pc(277) boolean local277 = Static214.anInt4865 == 5 || Static214.anInt4865 == 10 || Static214.anInt4865 == 28;
				Static59.aClass182_5.method5043(Static107.aClass42_2, !local277);
				Static241.anInt5344 = 0;
				Static107.aClass42_2 = null;
				Static62.aClass145_4 = null;
			}
		} catch (@Pc(294) IOException local294) {
			this.method924(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method914() {
		@Pc(15) Frame local15 = new Frame("Jagex");
		local15.pack();
		local15.dispose();
		Static137.method3046();
		Static342.aClass99_3 = new Class99(Static184.aClass199_12);
		Static59.aClass182_5 = new Class182();
		if (Static344.anInt7238 != 0) {
			Static346.aByteArrayArray58 = new byte[50][];
		}
		Static171.method3505(Static184.aClass199_12);
		if (Static312.anInt6002 == 0) {
			Static64.aString62 = this.getCodeBase().getHost();
			Static146.anInt3618 = 443;
			Static353.anInt7369 = 43594;
		} else if (Static312.anInt6002 == 1) {
			Static64.aString62 = this.getCodeBase().getHost();
			Static353.anInt7369 = Static150.anInt3681 + 40000;
			Static146.anInt3618 = Static150.anInt3681 + 50000;
		} else if (Static312.anInt6002 == 2) {
			Static146.anInt3618 = Static150.anInt3681 + 50000;
			Static353.anInt7369 = Static150.anInt3681 + 40000;
			Static64.aString62 = "127.0.0.1";
		}
		Static124.anInt3119 = Static146.anInt3618;
		Static237.anInt5290 = Static353.anInt7369;
		Static56.anInt1631 = Static353.anInt7369;
		Static300.aString235 = Static64.aString62;
		Static272.anInt5743 = Static237.anInt5290;
		if (Static199.anInt4559 == 1) {
			Static104.aShortArrayArray2 = Static309.aShortArrayArray6;
			Static125.anInt3170 = 16777215;
			Static210.anInt4841 = 0;
			Static8.aShortArray1 = Static111.aShortArray39;
			Static229.aShortArray90 = Static99.aShortArray27;
			Static95.aShortArrayArray1 = Static118.aShortArrayArray3;
			Static326.aBoolean478 = true;
		} else {
			Static104.aShortArrayArray2 = Static292.aShortArrayArray5;
			Static95.aShortArrayArray1 = Static345.aShortArrayArray7;
			Static8.aShortArray1 = Static166.aShortArray61;
			Static229.aShortArray90 = Static22.aShortArray9;
		}
		Static253.aShortArray91 = Static275.aShortArray38 = Static301.aShortArray97 = Static257.aShortArray92 = new short[256];
		if (Static313.anInt6481 == 3) {
			Static154.anInt3814 = Static150.anInt3681;
		}
		Static256.method4727();
		Static12.method346(Static86.aCanvas2);
		Static167.method3465(Static86.aCanvas2);
		Static262.aClass28_1 = Static37.method921();
		if (Static262.aClass28_1 != null) {
			Static262.aClass28_1.method709(Static86.aCanvas2);
		}
		Static2.anInt6836 = Static313.anInt6481;
		try {
			if (Static184.aClass199_12.aClass10_4 != null) {
				Static330.aClass167_7 = new Class167(Static184.aClass199_12.aClass10_4, 5200, 0);
				for (@Pc(169) int local169 = 0; local169 < 29; local169++) {
					Static262.aClass167Array1[local169] = new Class167(Static184.aClass199_12.aClass10Array1[local169], 6000, 0);
				}
				Static289.aClass167_6 = new Class167(Static184.aClass199_12.aClass10_2, 6000, 0);
				Static58.aClass96_1 = new Class96(255, Static330.aClass167_7, Static289.aClass167_6, 500000);
				Static124.aClass167_1 = new Class167(Static184.aClass199_12.aClass10_3, 24, 0);
				Static184.aClass199_12.aClass10Array1 = null;
				Static184.aClass199_12.aClass10_4 = null;
				Static184.aClass199_12.aClass10_2 = null;
				Static184.aClass199_12.aClass10_3 = null;
			}
		} catch (@Pc(225) IOException local225) {
			Static58.aClass96_1 = null;
			Static124.aClass167_1 = null;
			Static289.aClass167_6 = null;
			Static330.aClass167_7 = null;
		}
		if (Static312.anInt6002 != 0) {
			Static263.aBoolean395 = true;
		}
		if (Static199.anInt4559 == 0) {
			Static185.aString160 = Static290.aString227;
		} else if (Static199.anInt4559 == 1) {
			Static185.aString160 = Static21.aString28;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method923() {
		Static30.anInt3904 = 0;
		while (Static242.method4553() && Static30.anInt3904 < 128) {
			if (!Static229.method4363() || Static143.aChar2 != '`' && Static143.aChar2 != '§') {
				Static64.anIntArray117[Static30.anInt3904] = Static15.anInt634;
				Static93.anIntArray151[Static30.anInt3904] = Static143.aChar2;
				Static30.anInt3904++;
			} else if (Static216.method4220()) {
				Static118.method2582();
			} else {
				Static239.method4515();
			}
		}
		if (Static216.method4220()) {
			Static91.method1997();
		}
		Static55.anInt1622++;
		Static93.method2011(-1, null, -1);
		Static346.method6109(null, -1, -1);
		Static215.method4208();
		Class7_Sub5.anInt3948++;
		for (@Pc(84) int local84 = 0; local84 < 32768; local84++) {
			@Pc(90) Class7_Sub1_Sub1_Sub1 local90 = Static84.aClass7_Sub1_Sub1_Sub1Array1[local84];
			if (local90 != null) {
				@Pc(96) byte local96 = local90.aClass75_1.aByte32;
				if ((local96 & 0x1) != 0) {
					@Pc(107) int local107 = local90.method5973();
					@Pc(134) int local134;
					if ((local96 & 0x2) != 0 && local90.anInt7113 == 0 && Math.random() * 1000.0D < 10.0D) {
						local134 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(142) int local142 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local134 != 0 || local142 != 0) {
							@Pc(153) int local153 = local134 + local90.anIntArray578[0];
							@Pc(160) int local160 = local142 + local90.anIntArray579[0];
							if (local153 < 0) {
								local153 = 0;
							} else if (local153 > Static25.anInt850 - local107 - 1) {
								local153 = Static25.anInt850 - local107 - 1;
							}
							if (local160 < 0) {
								local160 = 0;
							} else if (local160 > Static219.anInt4987 - local107 - 1) {
								local160 = Static219.anInt4987 - local107 - 1;
							}
							@Pc(242) int local242 = Static228.method4349(local90.anIntArray579[0], 0, local90.anIntArray578[0], 0, Static132.anIntArray245, true, Static208.anIntArray361, local107, local107, local160, -1, local153, local107, Static66.aClass22Array1[local90.aByte72]);
							if (local242 > 0) {
								if (local242 > 9) {
									local242 = 9;
								}
								for (@Pc(251) int local251 = 0; local251 < local242; local251++) {
									local90.anIntArray578[local251] = Static132.anIntArray245[local242 - local251 - 1];
									local90.anIntArray579[local251] = Static208.anIntArray361[local242 - local251 - 1];
									local90.aByteArray96[local251] = 1;
								}
								local90.anInt7113 = local242;
							}
						}
					}
					Static146.method3194(local90, true);
					local134 = Static164.method3438(local90);
					Static21.method524(local90, local134, Static355.anInt4214, Static285.anInt6032);
					Static118.method2580(local90);
				}
			}
		}
		if (Static118.anInt3015 == 0 && Static277.anInt5863 == 0) {
			if (Static303.anInt6342 == 2) {
				Static27.method658();
			} else {
				Static101.method2097();
			}
			if (Static3.anInt92 >> 7 < 14 || Static3.anInt92 >> 7 >= Static25.anInt850 - 14 || Static88.anInt2339 >> 7 < 14 || Static219.anInt4987 - 14 <= Static88.anInt2339 >> 7) {
				Static179.method3635();
			}
		}
		while (true) {
			@Pc(362) Class1_Sub15 local362;
			@Pc(367) Class177 local367;
			@Pc(378) Class177 local378;
			do {
				local362 = (Class1_Sub15) Static273.aClass130_36.method3747();
				if (local362 == null) {
					while (true) {
						do {
							local362 = (Class1_Sub15) Static208.aClass130_31.method3747();
							if (local362 == null) {
								while (true) {
									do {
										local362 = (Class1_Sub15) Static138.aClass130_20.method3747();
										if (local362 == null) {
											if (Static158.aClass177_11 != null) {
												Static211.method2744();
											}
											if (Static197.anInt4521 % 1500 == 0) {
												Static223.method4330();
											}
											Static253.method4652();
											if (Static69.aBoolean134 && Static49.aLong47 < Static325.method5658() - 60000L) {
												Static329.method5714();
												return;
											}
											return;
										}
										local367 = local362.aClass177_9;
										if (local367.anInt5776 < 0) {
											break;
										}
										local378 = Static298.method5252(local367.anInt5829);
									} while (local378 == null || local378.aClass177Array8 == null || local378.aClass177Array8.length <= local367.anInt5776 || local367 != local378.aClass177Array8[local367.anInt5776]);
									Static267.method4825(local362);
								}
							}
							local367 = local362.aClass177_9;
							if (local367.anInt5776 < 0) {
								break;
							}
							local378 = Static298.method5252(local367.anInt5829);
						} while (local378 == null || local378.aClass177Array8 == null || local367.anInt5776 >= local378.aClass177Array8.length || local367 != local378.aClass177Array8[local367.anInt5776]);
						Static267.method4825(local362);
					}
				}
				local367 = local362.aClass177_9;
				if (local367.anInt5776 < 0) {
					break;
				}
				local378 = Static298.method5252(local367.anInt5829);
			} while (local378 == null || local378.aClass177Array8 == null || local378.aClass177Array8.length <= local367.anInt5776 || local378.aClass177Array8[local367.anInt5776] != local367);
			Static267.method4825(local362);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method907() {
		if (Static69.aBoolean134) {
			Static329.method5714();
		}
		if (Static221.aClass40_6 != null) {
			Static221.aClass40_6.method2711();
		}
		if (Static112.aFrame1 != null) {
			Static36.method876(Static184.aClass199_12, Static112.aFrame1);
			Static112.aFrame1 = null;
		}
		if (Static10.aClass64_1 != null) {
			Static10.aClass64_1.aBoolean155 = false;
		}
		Static10.aClass64_1 = null;
		if (Static31.aClass42_1 != null) {
			Static31.aClass42_1.method1271();
			Static31.aClass42_1 = null;
		}
		Static158.method3369(Static86.aCanvas2);
		Static320.method5624(Static86.aCanvas2);
		if (Static262.aClass28_1 != null) {
			Static262.aClass28_1.method712(Static86.aCanvas2);
		}
		Static216.method4217();
		Static12.method347();
		Static262.aClass28_1 = null;
		if (Static305.aClass37_2 != null) {
			Static305.aClass37_2.method5864();
		}
		if (Static37.aClass37_1 != null) {
			Static37.aClass37_1.method5864();
		}
		Static59.aClass182_5.method5047();
		Static342.aClass99_3.method3061();
		if (Static64.aClass170_1 != null) {
			Static64.aClass170_1.method4786();
			Static64.aClass170_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method924(@OriginalArg(1) int arg0) {
		Static62.aClass145_4 = null;
		Static107.aClass42_2 = null;
		Static59.aClass182_5.anInt5977++;
		Static241.anInt5344 = 0;
		Static59.aClass182_5.anInt5978 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method906() {
		if (Static214.anInt4865 == 1000) {
			return;
		}
		Static197.anInt4521++;
		if (Static197.anInt4521 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static294.anInt6162 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static51.aRandom1.setSeed((long) Static294.anInt6162);
		}
		this.method927();
		if (Static47.aClass180_1 != null) {
			Static47.aClass180_1.method4938();
		}
		Static243.method4562();
		Static56.method1395();
		Static117.method2571();
		Static147.method3211();
		if (Static221.aClass40_6 != null) {
			Static221.aClass40_6.method2773((int) Static325.method5658());
		}
		if (Static262.aClass28_1 != null) {
			@Pc(84) int local84 = Static262.aClass28_1.method713();
			Static91.anInt2408 = local84;
		}
		Static74.method1736();
		if (Static214.anInt4865 == 0) {
			this.method938();
			Static160.method6132();
		} else if (Static214.anInt4865 == 5) {
			this.method938();
			Static160.method6132();
		} else if (Static214.anInt4865 == 25 || Static214.anInt4865 == 28) {
			Static318.method5595();
		}
		if (Static214.anInt4865 == 10) {
			this.method923();
			Static125.method2688();
			Static311.method4435();
			Static209.method4124();
		} else if (Static214.anInt4865 == 30) {
			Static202.method4038();
		} else if (Static214.anInt4865 == 40) {
			Static209.method4124();
			if (Static6.anInt211 != -3) {
				if (Static6.anInt211 == 15) {
					Static54.method1386();
				} else if (Static6.anInt211 != 2) {
					Static54.method1385();
				}
			}
		}
		Static6.method172(Static221.aClass40_6);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method927() {
		@Pc(12) boolean local12 = Static59.aClass182_5.method5033();
		if (!local12) {
			this.method920();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method915()) {
			return;
		}
		Static150.anInt3681 = Integer.parseInt(this.getParameter("worldid"));
		Static312.anInt6002 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static312.anInt6002 < 0 || Static312.anInt6002 > 1) {
			Static312.anInt6002 = 0;
		}
		Static344.anInt7238 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static344.anInt7238 < 0 || Static344.anInt7238 > 2) {
			Static344.anInt7238 = 0;
		}
		try {
			Static60.anInt6011 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(52) Exception local52) {
			Static60.anInt6011 = 0;
		}
		Static263.method4777(Static60.anInt6011);
		@Pc(61) String local61 = this.getParameter("objecttag");
		if (local61 != null && local61.equals("1")) {
			Static174.aBoolean294 = true;
		} else {
			Static174.aBoolean294 = false;
		}
		@Pc(77) String local77 = this.getParameter("js");
		if (local77 != null && local77.equals("1")) {
			Static208.aBoolean333 = true;
		} else {
			Static208.aBoolean333 = false;
		}
		@Pc(93) String local93 = this.getParameter("game");
		if (local93 != null && local93.equals("1")) {
			Static199.anInt4559 = 1;
		} else {
			Static199.anInt4559 = 0;
		}
		try {
			Static192.anInt4459 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(112) Exception local112) {
			Static192.anInt4459 = 0;
		}
		Static257.aString202 = this.getParameter("quiturl");
		Static327.aString256 = this.getParameter("settings");
		if (Static327.aString256 == null) {
			Static327.aString256 = "";
		}
		@Pc(130) String local130 = this.getParameter("country");
		if (local130 != null) {
			try {
				Static339.anInt7353 = Integer.parseInt(local130);
			} catch (@Pc(137) Exception local137) {
				Static339.anInt7353 = 0;
			}
		}
		Static155.anInt3850 = Integer.parseInt(this.getParameter("colourid"));
		if (Static155.anInt3850 < 0 || Static41.aColorArray1.length <= Static155.anInt3850) {
			Static155.anInt3850 = 0;
		}
		Static345.aClient1 = this;
		this.method899(Static344.anInt7238 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method911() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method937(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class1_Sub16 local14 = new Class1_Sub16(arg0);
		while (true) {
			@Pc(18) int local18;
			do {
				while (true) {
					local18 = local14.method5761();
					if (local18 == 0) {
						return;
					}
					if (local18 != 1) {
						break;
					}
					@Pc(71) int[] local71 = Static170.anIntArray285 = new int[6];
					local71[0] = local14.method5749();
					local71[1] = local14.method5749();
					local71[2] = local14.method5749();
					local71[3] = local14.method5749();
					local71[4] = local14.method5749();
					local71[5] = local14.method5749();
				}
			} while (local18 != 4);
			@Pc(38) int local38 = local14.method5761();
			Static167.anIntArray284 = new int[local38];
			for (@Pc(43) int local43 = 0; local43 < local38; local43++) {
				Static167.anIntArray284[local43] = local14.method5749();
				if (Static167.anIntArray284[local43] == 65535) {
					Static167.anIntArray284[local43] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method938() {
		if (!Static123.aBoolean203) {
			label222: while (true) {
				do {
					if (!Static242.method4553()) {
						break label222;
					}
				} while (Static143.aChar2 != 's' && Static143.aChar2 != 'S');
				Static123.aBoolean203 = true;
			}
		}
		@Pc(39) int local39;
		if (Static1.anInt86 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(42) long local42 = Static325.method5658();
			if (Static159.aLong137 == 0L) {
				Static159.aLong137 = local42;
			}
			if (local39 > 16384 && local42 - Static159.aLong137 < 5000L) {
				if (local42 - Static312.aLong186 > 1000L) {
					System.gc();
					Static312.aLong186 = local42;
				}
				Static12.anInt529 = 5;
				Static124.aString112 = Static38.aString50;
			} else {
				Static124.aString112 = Static190.aString191;
				Static12.anInt529 = 5;
				Static1.anInt86 = 10;
			}
			return;
		}
		@Pc(90) int local90;
		if (Static1.anInt86 == 10) {
			for (local90 = 0; local90 < 4; local90++) {
				Static66.aClass22Array1[local90] = Static309.method5430(Static25.anInt850, Static219.anInt4987);
			}
			Static12.anInt529 = 10;
			Static1.anInt86 = 20;
			Static124.aString112 = Static159.aString169;
		} else if (Static1.anInt86 == 20) {
			if (Static47.aClass180_1 == null) {
				Static47.aClass180_1 = new Class180(Static59.aClass182_5, Static342.aClass99_3);
			}
			if (Static47.aClass180_1.method4940()) {
				Static320.aClass162_225 = Static273.method4901(0, true, false);
				Static38.aClass162_51 = Static273.method4901(1, true, false);
				Static180.aClass162_146 = Static273.method4901(2, true, false);
				Static31.aClass162_48 = Static273.method4901(3, true, false);
				Static218.aClass162_175 = Static273.method4901(4, true, false);
				Static50.aClass162_56 = Static273.method4901(5, true, true);
				Static250.aClass162_193 = Static273.method4901(6, false, true);
				Static88.aClass162_81 = Static273.method4901(7, true, false);
				Static203.aClass162_47 = Static273.method4901(8, true, false);
				Static22.aClass162_34 = Static273.method4901(9, true, false);
				Static237.aClass162_188 = Static273.method4901(10, true, false);
				Static134.aClass162_119 = Static273.method4901(11, true, false);
				Static257.aClass162_198 = Static273.method4901(12, true, false);
				Static251.aClass162_194 = Static273.method4901(13, true, false);
				Static262.aClass162_199 = Static273.method4901(14, false, false);
				Static7.aClass162_22 = Static273.method4901(15, true, false);
				Static191.aClass162_153 = Static273.method4901(16, true, false);
				Static205.aClass162_166 = Static273.method4901(17, true, false);
				Static339.aClass162_244 = Static273.method4901(18, true, false);
				Static4.aClass162_14 = Static273.method4901(19, true, false);
				Static171.aClass162_138 = Static273.method4901(20, true, false);
				Static25.aClass162_40 = Static273.method4901(21, true, false);
				Static9.aClass162_24 = Static273.method4901(22, true, false);
				Static139.aClass162_120 = Static273.method4901(23, true, true);
				Static197.aClass162_157 = Static273.method4901(24, true, false);
				Static27.aClass162_42 = Static273.method4901(25, true, false);
				Static236.aClass162_187 = Static273.method4901(26, true, true);
				Static18.aClass162_31 = Static273.method4901(27, true, false);
				Static28.aClass162_43 = Static273.method4901(28, true, true);
				Static124.aString112 = Static49.aString56;
				Static1.anInt86 = 30;
				Static12.anInt529 = 15;
			} else {
				Static12.anInt529 = 12;
				Static124.aString112 = Static301.aString236;
			}
		} else if (Static1.anInt86 == 30) {
			local90 = 0;
			for (local39 = 0; local39 < 29; local39++) {
				local90 += Static265.aClass26_Sub1Array1[local39].method3368() * Static253.anIntArray402[local39] / 100;
			}
			if (local90 == 100) {
				Static12.anInt529 = 20;
				Static124.aString112 = Static21.aString27;
				Static328.method5705(Static203.aClass162_47);
				Static73.method1721(Static203.aClass162_47);
				Static1.anInt86 = 40;
			} else {
				if (local90 != 0) {
					Static124.aString112 = Static199.aString165 + local90 + "%";
				}
				Static12.anInt529 = 20;
			}
		} else if (Static1.anInt86 == 40) {
			if (Static28.aClass162_43.method4623()) {
				this.method937(Static28.aClass162_43.method4630(1));
				Static1.anInt86 = 50;
				Static124.aString112 = Static92.aString90;
				Static12.anInt529 = 25;
			} else {
				Static124.aString112 = Static214.aString174 + Static28.aClass162_43.method4627() + "%";
				Static12.anInt529 = 25;
			}
		} else if (Static1.anInt86 == 50) {
			Static73.method1726(Static90.aBoolean156);
			Static334.aClass1_Sub3_Sub1_3 = new Class1_Sub3_Sub1();
			Static334.aClass1_Sub3_Sub1_3.method2228();
			Static305.aClass37_2 = Static120.method2587(Static86.aCanvas2, Static184.aClass199_12, 22050, 0);
			Static305.aClass37_2.method5871(Static334.aClass1_Sub3_Sub1_3);
			Static86.method1934(Static334.aClass1_Sub3_Sub1_3, Static7.aClass162_22, Static262.aClass162_199, Static218.aClass162_175);
			Static37.aClass37_1 = Static120.method2587(Static86.aCanvas2, Static184.aClass199_12, 2048, 1);
			Static127.aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3();
			Static37.aClass37_1.method5871(Static127.aClass1_Sub3_Sub3_1);
			Static70.aClass81_1 = new Class81(22050, Static80.anInt2184);
			Static226.anInt5077 = Static250.aClass162_193.method4631("scape main");
			Static1.anInt86 = 60;
			Static12.anInt529 = 30;
			Static124.aString112 = Static66.aString65;
		} else if (Static1.anInt86 == 60) {
			local90 = Static134.method3033(Static251.aClass162_194, Static203.aClass162_47);
			local39 = Static240.method4521();
			if (local90 < local39) {
				Static12.anInt529 = 35;
				Static124.aString112 = Static235.aString193 + local90 * 100 / local39 + "%";
			} else {
				Static12.anInt529 = 35;
				Static124.aString112 = Static116.aString108;
				Static1.anInt86 = 70;
			}
		} else if (Static1.anInt86 == 70) {
			local90 = Static212.method6170(Static203.aClass162_47);
			local39 = Static177.method3611();
			if (local90 < local39) {
				Static124.aString112 = Static80.aString83 + local90 * 100 / local39 + "%";
				Static12.anInt529 = 40;
			} else {
				Static1.anInt86 = 80;
				Static124.aString112 = Static307.aString240;
				Static12.anInt529 = 40;
			}
		} else if (Static1.anInt86 == 80) {
			if (Static236.aClass162_187.method4623()) {
				Static65.anInterface4_2 = new Class5(Static236.aClass162_187, Static22.aClass162_34, Static203.aClass162_47);
				Static12.anInt529 = 45;
				Static1.anInt86 = 90;
				Static124.aString112 = Static67.aString5;
			} else {
				Static124.aString112 = Static256.aString199 + Static236.aClass162_187.method4627() + "%";
				Static12.anInt529 = 45;
			}
		} else if (Static1.anInt86 == 90) {
			Static1.anInt86 = 95;
			Static124.aString112 = Static314.aString250;
			Static12.anInt529 = 50;
		} else if (Static1.anInt86 == 95) {
			if (Static123.aBoolean203) {
				Static74.anInt2054 = 0;
				Static146.anInt3619 = 1;
				Static355.anInt4211 = 0;
				Static4.anInt207 = 0;
				Static226.anInt5071 = 0;
			}
			Static123.aBoolean203 = true;
			Static263.method4776(Static184.aClass199_12);
			Static239.method4516();
			Static209.method4129(Static4.anInt207, false);
			Static12.anInt529 = 55;
			Static1.anInt86 = 100;
			Static124.aString112 = Static160.aString273;
		} else if (Static1.anInt86 == 100) {
			Static186.method3744(Static203.aClass162_47, Static251.aClass162_194, Static221.aClass40_6);
			Static12.anInt529 = 60;
			Static124.aString112 = Static290.aString226;
			Static276.method4934(5);
			Static1.anInt86 = 110;
		} else if (Static1.anInt86 == 110) {
			Static180.aClass162_146.method4623();
			local90 = Static180.aClass162_146.method4627();
			Static191.aClass162_153.method4623();
			local90 += Static191.aClass162_153.method4627();
			Static205.aClass162_166.method4623();
			local90 += Static205.aClass162_166.method4627();
			Static339.aClass162_244.method4623();
			local90 += Static339.aClass162_244.method4627();
			Static4.aClass162_14.method4623();
			local90 += Static4.aClass162_14.method4627();
			Static171.aClass162_138.method4623();
			local90 += Static171.aClass162_138.method4627();
			Static25.aClass162_40.method4623();
			local90 += Static25.aClass162_40.method4627();
			Static9.aClass162_24.method4623();
			local90 += Static9.aClass162_24.method4627();
			Static197.aClass162_157.method4623();
			local90 += Static197.aClass162_157.method4627();
			Static27.aClass162_42.method4623();
			local90 += Static27.aClass162_42.method4627();
			Static18.aClass162_31.method4623();
			local90 += Static18.aClass162_31.method4627();
			if (local90 < 1100) {
				Static124.aString112 = Static8.aString10 + local90 / 11 + "%";
				Static12.anInt529 = 65;
			} else {
				Static290.method5135(Static180.aClass162_146);
				Static168.method3493(Static180.aClass162_146);
				Static243.method4559(Static180.aClass162_146);
				Static248.method4598(Static180.aClass162_146, Static88.aClass162_81);
				Static58.method1401(Static88.aClass162_81, Static191.aClass162_153);
				Static206.method4107(Static88.aClass162_81, Static339.aClass162_244);
				Static177.method3609(Static4.aClass162_14, Static88.aClass162_81);
				Static69.method1645(Static180.aClass162_146);
				Static124.method2654(Static320.aClass162_225, Static38.aClass162_51, Static171.aClass162_138);
				Static265.method4791(Static180.aClass162_146);
				Static41.method1009(Static25.aClass162_40, Static88.aClass162_81);
				Static124.method2652(Static9.aClass162_24);
				Static18.method470(Static180.aClass162_146);
				Static88.method1943(Static88.aClass162_81, Static31.aClass162_48, Static251.aClass162_194, Static203.aClass162_47);
				Static8.method228(Static180.aClass162_146);
				Static32.method5953(Static205.aClass162_166);
				Static219.method4283(Static27.aClass162_42, Static197.aClass162_157, new Class121());
				Static17.method460(Static197.aClass162_157, Static27.aClass162_42);
				Static37.method925(Static180.aClass162_146);
				Static232.method4425(Static180.aClass162_146);
				Static56.method1396(Static180.aClass162_146);
				Static104.method2156(Static180.aClass162_146, Static203.aClass162_47);
				Static219.method4282(Static180.aClass162_146, Static203.aClass162_47);
				Static11.method6088(Static180.aClass162_146);
				Static78.method1783(Static203.aClass162_47, Static180.aClass162_146);
				Static21.method513(Static180.aClass162_146);
				Static96.method2038(Static180.aClass162_146);
				Static124.aString112 = Static44.aString45;
				Static12.anInt529 = 65;
				Static43.method1261();
				Static1.anInt86 = 120;
			}
		} else if (Static1.anInt86 == 120) {
			local90 = Static324.method5656(Static203.aClass162_47);
			local39 = Static264.method4779();
			if (local39 > local90) {
				Static124.aString112 = Static213.aString72 + local90 * 100 / local39 + "%";
				Static12.anInt529 = 70;
			} else {
				Static264.method4778(Static221.aClass40_6, Static203.aClass162_47);
				Static210.method4144(Static316.aClass29Array15);
				Static12.anInt529 = 70;
				Static124.aString112 = Static272.aString209;
				Static1.anInt86 = 130;
			}
		} else if (Static1.anInt86 == 130) {
			Static10.aClass64_1 = new Class64();
			Static184.aClass199_12.method5482(Static10.aClass64_1, 10);
			Static12.anInt529 = 75;
			Static1.anInt86 = 140;
			Static124.aString112 = Static164.aString147;
		} else if (Static1.anInt86 == 140) {
			if (Static237.aClass162_188.method4635("", "huffman")) {
				@Pc(1036) Class87 local1036 = new Class87(Static237.aClass162_188.method4642("huffman", ""));
				Static74.method1739(local1036);
				Static12.anInt529 = 80;
				Static1.anInt86 = 150;
				Static124.aString112 = Static115.aString105;
			} else {
				Static124.aString112 = Static245.aString113 + "0%";
				Static12.anInt529 = 80;
			}
		} else if (Static1.anInt86 == 150) {
			if (!Static31.aClass162_48.method4623()) {
				Static124.aString112 = Static320.aString253 + Static31.aClass162_48.method4627() * 3 / 4 + "%";
				Static12.anInt529 = 85;
			} else if (!Static257.aClass162_198.method4623()) {
				Static124.aString112 = Static320.aString253 + (Static257.aClass162_198.method4627() / 10 + 75) + "%";
				Static12.anInt529 = 85;
			} else if (!Static251.aClass162_194.method4623()) {
				Static124.aString112 = Static320.aString253 + (Static251.aClass162_194.method4627() / 20 + 85) + "%";
				Static12.anInt529 = 85;
			} else if (Static139.aClass162_120.method4617("details")) {
				Static201.method3678(Static139.aClass162_120);
				Static283.method5059(Static18.aClass162_31);
				Static161.method3406(Static88.aClass162_81, Static65.anInterface4_2);
				Static1.anInt86 = 160;
				Static124.aString112 = Static26.aString38;
				Static12.anInt529 = 85;
			} else {
				Static124.aString112 = Static320.aString253 + (Static139.aClass162_120.method4634("details") / 10 + 90) + "%";
				Static12.anInt529 = 85;
			}
		} else if (Static1.anInt86 == 160) {
			local90 = Static311.method4432();
			if (local90 == -1) {
				Static12.anInt529 = 90;
				Static124.aString112 = Static28.aString39;
			} else if (local90 == 7 || local90 == 9) {
				this.method910("worldlistfull");
				Static276.method4934(1000);
			} else if (Static29.aBoolean461) {
				Static124.aString112 = Static69.aString73;
				Static1.anInt86 = 170;
				Static12.anInt529 = 90;
			} else {
				this.method910("worldlistio_" + local90);
				Static276.method4934(1000);
			}
		} else if (Static1.anInt86 == 170) {
			Static119.aStringArray17 = new String[Static307.anInt6424];
			Static294.anIntArray469 = new int[Static49.anInt1560];
			Static56.aBooleanArray5 = new boolean[Static49.anInt1560];
			for (local90 = 0; local90 < Static49.anInt1560; local90++) {
				if (Static75.method1742(local90).anInt3536 == 0) {
					Static56.aBooleanArray5[local90] = true;
					Static88.anInt2334++;
				}
				Static294.anIntArray469[local90] = -1;
			}
			Static221.method4304();
			Static173.anInt4123 = Static31.aClass162_48.method4631("loginscreen");
			Static50.aClass162_56.method4620(false);
			Static250.aClass162_193.method4620(true);
			Static203.aClass162_47.method4620(true);
			Static251.aClass162_194.method4620(true);
			Static237.aClass162_188.method4620(true);
			Static31.aClass162_48.method4620(true);
			Static180.aClass162_146.anInt5438 = 2;
			Static61.aBoolean118 = true;
			Static205.aClass162_166.anInt5438 = 2;
			Static191.aClass162_153.anInt5438 = 2;
			Static339.aClass162_244.anInt5438 = 2;
			Static4.aClass162_14.anInt5438 = 2;
			Static171.aClass162_138.anInt5438 = 2;
			Static25.aClass162_40.anInt5438 = 2;
			Static238.method4510(Static146.anInt3619, -1, -1, false);
			Static1.anInt86 = 180;
			Static12.anInt529 = 95;
			Static124.aString112 = Static273.aString210;
		} else if (Static1.anInt86 == 180) {
			Static76.method1751(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	protected void method912() {
		if (Static214.anInt4865 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static235.method4610() / 1000000L - Static328.aLong211;
		Static328.aLong211 = Static235.method4610() / 1000000L;
		@Pc(33) boolean local33 = Static109.method2264();
		if (local33 && Static46.aBoolean484 && Static305.aClass37_2 != null) {
			Static305.aClass37_2.method5858();
		}
		if (Static214.anInt4865 == 30 || Static214.anInt4865 == 10) {
			if (Static26.aLong34 != 0L && Static325.method5658() > Static26.aLong34) {
				Static238.method4510(Static164.method3437(), Static144.anInt3575, Static17.anInt652, false);
			} else if (Static221.aClass40_6.method2707() && Static11.aBoolean516) {
				Static89.method1973();
			}
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static112.aFrame1 == null) {
			@Pc(86) Container local86;
			if (Static252.aFrame2 == null) {
				local86 = Static184.aClass199_12.anApplet1;
			} else {
				local86 = Static252.aFrame2;
			}
			local94 = local86.getSize().width;
			local98 = local86.getSize().height;
			if (local86 == Static252.aFrame2) {
				@Pc(104) Insets local104 = Static252.aFrame2.getInsets();
				local94 -= local104.right + local104.left;
				local98 -= local104.top + local104.bottom;
			}
			if (local94 != Static264.anInt5603 || local98 != Static222.anInt5038) {
				if (Static221.aClass40_6 == null || Static221.aClass40_6.method2714()) {
					Static137.method3046();
				} else {
					Static222.anInt5038 = local98;
					Static264.anInt5603 = local94;
				}
				Static26.aLong34 = Static325.method5658() + 500L;
			}
		}
		if (Static112.aFrame1 != null && !Static120.aBoolean201 && (Static214.anInt4865 == 30 || Static214.anInt4865 == 10)) {
			Static238.method4510(Static146.anInt3619, -1, -1, false);
		}
		@Pc(169) boolean local169 = false;
		if (Static243.aBoolean376) {
			Static243.aBoolean376 = false;
			local169 = true;
		}
		if (local169) {
			Static11.method6076();
		}
		if (Static221.aClass40_6 != null && Static221.aClass40_6.method2750() || Static164.method3437() != 1) {
			Static102.method2127();
		}
		if (Static214.anInt4865 == 0) {
			Static295.method5215(Static41.aColorArray1[Static155.anInt3850], Static324.aColorArray4[Static155.anInt3850], Static60.aColorArray3[Static155.anInt3850], Static12.anInt529, local169, Static124.aString112);
		} else if (Static214.anInt4865 == 5) {
			Static6.method171(Static60.aColorArray3[Static155.anInt3850].getRGB(), Static150.aClass30_2, local169 | Static221.aClass40_6.method2750(), Static41.aColorArray1[Static155.anInt3850].getRGB(), Static221.aClass40_6, Static324.aColorArray4[Static155.anInt3850].getRGB());
		} else if (Static214.anInt4865 == 10) {
			Static231.method4390();
		} else if (Static214.anInt4865 == 25 || Static214.anInt4865 == 28) {
			if (Static200.anInt4589 == 1) {
				if (Static138.anInt3431 > Static265.anInt5622) {
					Static265.anInt5622 = Static138.anInt3431;
				}
				local94 = (Static265.anInt5622 - Static138.anInt3431) * 50 / Static265.anInt5622;
				Static104.method2158(true, Static17.aString24 + "<br>(" + local94 + "%)", Static290.aClass30_3);
			} else if (Static200.anInt4589 == 2) {
				if (Static157.anInt3901 < Static1.anInt87) {
					Static157.anInt3901 = Static1.anInt87;
				}
				local94 = (Static157.anInt3901 - Static1.anInt87) * 50 / Static157.anInt3901 + 50;
				Static104.method2158(true, Static17.aString24 + "<br>(" + local94 + "%)", Static290.aClass30_3);
			} else {
				Static104.method2158(true, Static17.aString24, Static290.aClass30_3);
			}
		} else if (Static214.anInt4865 == 30) {
			Static338.method6022(local18);
		} else if (Static214.anInt4865 == 40) {
			Static104.method2158(true, Static352.aString275 + "<br>" + Static231.aString181, Static290.aClass30_3);
		}
		if (Static73.anInt2040 == 3) {
			for (local94 = 0; local94 < Static266.anInt5654; local94++) {
				@Pc(384) Rectangle local384 = Class111.aRectangleArray2[local94];
				if (Static323.aBooleanArray26[local94]) {
					Static221.aClass40_6.method2745(local384.width, local384.height, local384.x, local384.y, -1996553985);
				} else if (Static31.aBooleanArray2[local94]) {
					Static221.aClass40_6.method2745(local384.width, local384.height, local384.x, local384.y, -1996554240);
				}
			}
		}
		if (Static216.method4220()) {
			Static89.method1967(Static221.aClass40_6);
		}
		if ((Static214.anInt4865 == 30 || Static214.anInt4865 == 10) && Static73.anInt2040 == 0 && Static164.method3437() == 1 && !local169 && Static313.aString249.equals("1.1")) {
			local94 = 0;
			for (local98 = 0; local98 < Static266.anInt5654; local98++) {
				if (Static31.aBooleanArray2[local98]) {
					Static31.aBooleanArray2[local98] = false;
					Static92.aRectangleArray1[local94++] = Class111.aRectangleArray2[local98];
				}
			}
			Static221.aClass40_6.method2755(Static92.aRectangleArray1, local94);
		} else if (Static214.anInt4865 != 0) {
			Static221.aClass40_6.method2710();
			for (local94 = 0; local94 < Static266.anInt5654; local94++) {
				Static31.aBooleanArray2[local94] = false;
			}
		}
		if (Static61.aBoolean118) {
			Static312.method5080();
		}
		if (Static123.aBoolean203 && Static214.anInt4865 == 10 && Static295.anInt6177 != -1) {
			Static123.aBoolean203 = false;
			Static263.method4776(Static184.aClass199_12);
		}
	}
}
