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
public final class client extends GameShell {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static188.method3465("argument count");
			}
			Static177.anInt3372 = Integer.parseInt(arg0[0]);
			Static121.aClass127_4 = Static231.aClass127_7;
			if (arg0[1].equals("live")) {
				Static202.aClass209_2 = Static232.aClass209_3;
			} else if (arg0[1].equals("rc")) {
				Static202.aClass209_2 = Static175.aClass209_1;
			} else if (arg0[1].equals("wip")) {
				Static202.aClass209_2 = Static359.aClass209_4;
			} else {
				Static188.method3465("modewhat");
			}
			Static295.anInt5581 = Static25.method860(arg0[2]);
			if (Static295.anInt5581 == -1) {
				if (arg0[2].equals("english")) {
					Static295.anInt5581 = 0;
				} else if (arg0[2].equals("german")) {
					Static295.anInt5581 = 1;
				} else {
					Static188.method3465("language");
				}
			}
			Static237.aBoolean298 = false;
			Static276.aBoolean375 = false;
			if (arg0[3].equals("game0")) {
				Static343.aClass50_4 = Static249.aClass50_3;
			} else if (arg0[3].equals("game1")) {
				Static343.aClass50_4 = Static106.aClass50_1;
			} else {
				Static188.method3465("game");
			}
			Static320.anInt6007 = 0;
			Static31.aBoolean68 = true;
			Static381.aBoolean482 = true;
			Static74.aString17 = "";
			Static165.anInt3149 = 0;
			Static64.anInt1555 = Static343.aClass50_4.anInt1553;
			@Pc(131) client local131 = new client();
			Static144.aClient1 = local131;
			local131.method1383(Static343.aClass50_4.aString15, Static202.aClass209_2.method5282() + 32);
			Static222.aFrame1.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static262.method6253(local154, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1397(@OriginalArg(0) int arg0) {
		Static287.aClass183_3.anInt5062 = arg0;
		Static211.aClass32_8 = null;
		Static103.aClass111_1 = null;
		Static309.anInt5800 = 0;
		Static287.aClass183_3.anInt5063++;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1385() {
		if (Static347.anInt6442 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static307.method5257() / 1000000L - Static154.aLong89;
		Static154.aLong89 = Static307.method5257() / 1000000L;
		@Pc(31) boolean local31 = Static196.method3310();
		if (local31 && Static393.aBoolean486 && Static303.aClass221_2 != null) {
			Static303.aClass221_2.method6317();
		}
		if (Static347.anInt6442 == 30 || Static347.anInt6442 == 10) {
			if (Static338.aLong214 != 0L && Static338.aLong214 < MonotonicClock.currentTimeMillis()) {
				Static143.method2677(Static218.aClass177_Sub1_2.anInt4893, Static144.method2692(), false, Static218.aClass177_Sub1_2.anInt4884);
			} else if (Static190.aClass19_8.method2859() && Static122.aBoolean176) {
				Static353.method5883();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static363.aFrame2 == null) {
			@Pc(84) Container local84;
			if (Static222.aFrame1 == null) {
				local84 = Static328.aClass152_5.applet;
			} else {
				local84 = Static222.aFrame1;
			}
			local92 = local84.getSize().width;
			local96 = local84.getSize().height;
			if (local84 == Static222.aFrame1) {
				@Pc(102) Insets local102 = Static222.aFrame1.getInsets();
				local92 -= local102.right + local102.left;
				local96 -= local102.top + local102.bottom;
			}
			if (Static142.anInt2663 != local92 || local96 != Static178.anInt2319) {
				if (Static190.aClass19_8 == null || Static190.aClass19_8.method2840()) {
					Static352.method5877();
				} else {
					Static142.anInt2663 = local92;
					Static178.anInt2319 = local96;
				}
				Static338.aLong214 = MonotonicClock.currentTimeMillis() + 500L;
			}
		}
		if (Static363.aFrame2 != null && !Static242.aBoolean306 && (Static347.anInt6442 == 30 || Static347.anInt6442 == 10)) {
			Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static328.aBoolean412) {
			Static328.aBoolean412 = false;
			local169 = true;
		}
		if (local169) {
			Static372.method6260();
		}
		if (Static190.aClass19_8 != null && Static190.aClass19_8.method2812() || Static144.method2692() != 1) {
			Static98.method2107();
		}
		if (Static347.anInt6442 == 0) {
			Static172.method3290(Static291.aColorArray4[Static64.anInt1555], local169, Static141.anInt2650, Static56.aString13, Static286.aColorArray3[Static64.anInt1555], Static174.aColorArray2[Static64.anInt1555]);
		} else if (Static347.anInt6442 == 5) {
			Static193.method3512(Static286.aColorArray3[Static64.anInt1555].getRGB(), Static190.aClass19_8, Static52.aClass130_1, Static190.aClass19_8.method2812() | local169, Static291.aColorArray4[Static64.anInt1555].getRGB(), Static174.aColorArray2[Static64.anInt1555].getRGB());
		} else if (Static347.anInt6442 == 10) {
			Static337.method5709();
		} else if (Static347.anInt6442 == 25 || Static347.anInt6442 == 28) {
			if (Static246.anInt4505 == 1) {
				if (Static65.anInt1588 < Static144.anInt2694) {
					Static65.anInt1588 = Static144.anInt2694;
				}
				local92 = (Static65.anInt1588 - Static144.anInt2694) * 50 / Static65.anInt1588;
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(Static295.anInt5581) + "<br>(" + local92 + "%)");
			} else if (Static246.anInt4505 == 2) {
				if (Static190.anInt3541 < Static305.anInt5742) {
					Static190.anInt3541 = Static305.anInt5742;
				}
				local92 = (Static190.anInt3541 - Static305.anInt5742) * 50 / Static190.anInt3541 + 50;
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(Static295.anInt5581) + "<br>(" + local92 + "%)");
			} else {
				Static351.method5857(Static276.aClass130_4, true, Static256.aClass79_102.method2267(Static295.anInt5581));
			}
		} else if (Static347.anInt6442 == 30) {
			Static133.method2503(local18);
		} else if (Static347.anInt6442 == 40) {
			Static351.method5857(Static276.aClass130_4, true, Static357.aClass79_137.method2267(Static295.anInt5581) + "<br>" + Static84.aClass79_40.method2267(Static295.anInt5581));
		}
		if (Static154.anInt2807 == 3) {
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				@Pc(398) Rectangle local398 = Class55.aRectangleArray1[local92];
				if (Static20.aBooleanArray6[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996553985, local398.width);
				} else if (Static375.aBooleanArray64[local92]) {
					Static190.aClass19_8.method2868(local398.height, local398.x, local398.y, -1996554240, local398.width);
				}
			}
		}
		if (Static333.method6318()) {
			Static279.method4725(Static190.aClass19_8);
		}
		if ((Static347.anInt6442 == 30 || Static347.anInt6442 == 10) && Static154.anInt2807 == 0 && Static144.method2692() == 1 && !local169 && SignedLink.javaVersion.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static154.anInt2806; local96++) {
				if (Static375.aBooleanArray64[local96]) {
					Static375.aBooleanArray64[local96] = false;
					Static281.aRectangleArray2[local92++] = Class55.aRectangleArray1[local96];
				}
			}
			Static190.aClass19_8.method2842(Static281.aRectangleArray2, local92);
		} else if (Static347.anInt6442 != 0) {
			Static190.aClass19_8.method2883();
			for (local92 = 0; local92 < Static154.anInt2806; local92++) {
				Static375.aBooleanArray64[local92] = false;
			}
		}
		if (Static218.aClass177_Sub1_2.anInt4881 == 0) {
			Static231.method4023(15L);
		} else if (Static218.aClass177_Sub1_2.anInt4881 == 1) {
			Static231.method4023(10L);
		} else if (Static218.aClass177_Sub1_2.anInt4881 == 2) {
			Static231.method4023(5L);
		} else if (Static218.aClass177_Sub1_2.anInt4881 == 3) {
			Static231.method4023(2L);
		}
		if (Static352.aBoolean446) {
			Static2.method29();
		}
		if (Static218.aClass177_Sub1_2.aBoolean362 && Static347.anInt6442 == 10 && Static139.anInt2595 != -1) {
			Static218.aClass177_Sub1_2.aBoolean362 = false;
			Static218.aClass177_Sub1_2.method4497(Static328.aClass152_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1388()) {
			return;
		}
		Static177.anInt3372 = Integer.parseInt(this.getParameter("worldid"));
		Static121.aClass127_4 = Static238.method4120(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static274.method4638(Static121.aClass127_4) && Static189.aClass127_6 != Static121.aClass127_4) {
			Static121.aClass127_4 = Static189.aClass127_6;
		}
		Static202.aClass209_2 = Static132.method2484(Integer.parseInt(this.getParameter("modewhat")));
		if (Static359.aClass209_4 != Static202.aClass209_2 && Static175.aClass209_1 != Static202.aClass209_2 && Static232.aClass209_3 != Static202.aClass209_2) {
			Static202.aClass209_2 = Static232.aClass209_3;
		}
		try {
			Static295.anInt5581 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static295.anInt5581 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static237.aBoolean298 = true;
		} else {
			Static237.aBoolean298 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static276.aBoolean375 = true;
		} else {
			Static276.aBoolean375 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static132.aBoolean180 = true;
		} else {
			Static132.aBoolean180 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static343.aClass50_4 = Static106.aClass50_1;
		} else {
			Static343.aClass50_4 = Static249.aClass50_3;
		}
		try {
			Static165.anInt3149 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static165.anInt3149 = 0;
		}
		Static307.aString57 = this.getParameter("quiturl");
		Static74.aString17 = this.getParameter("settings");
		if (Static74.aString17 == null) {
			Static74.aString17 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static320.anInt6007 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static320.anInt6007 = 0;
			}
		}
		Static64.anInt1555 = Integer.parseInt(this.getParameter("colourid"));
		if (Static64.anInt1555 < 0 || Static64.anInt1555 >= Static174.aColorArray2.length) {
			Static64.anInt1555 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static31.aBoolean68 = true;
			Static381.aBoolean482 = true;
		}
		Static144.aClient1 = this;
		if (Static343.aClass50_4 == Static249.aClass50_3) {
			Static263.anInt4834 = 503;
			Static254.anInt4701 = 765;
		} else if (Static343.aClass50_4 == Static106.aClass50_1) {
			Static263.anInt4834 = 480;
			Static254.anInt4701 = 640;
		}
		this.method1394(Static254.anInt4701, Static202.aClass209_2.method5282() + 32, Static263.anInt4834);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1384() {
		if (Static347.anInt6442 == 1000) {
			return;
		}
		Static114.anInt2348++;
		if (Static114.anInt2348 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static283.anInt5352 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static61.aRandom1.setSeed((long) Static283.anInt5352);
		}
		if (Static114.anInt2348 % 50 == 0) {
			Static207.anInt3746 = Static175.anInt3348;
			Static298.anInt2437 = Static301.anInt5697;
			Static175.anInt3348 = 0;
			Static301.anInt5697 = 0;
		}
		this.method1412();
		if (Static54.aClass154_1 != null) {
			Static54.aClass154_1.method3877();
		}
		Static388.method6438();
		Static37.method1135();
		Static174.aClass123_2.method3337();
		Static226.aClass119_1.method3307();
		if (Static337.aClass131_1 != null) {
			@Pc(81) int local81 = Static337.aClass131_1.method3693();
			Static323.anInt6063 = local81;
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2848((int) MonotonicClock.currentTimeMillis());
		}
		Static56.method1614();
		Static6.anInt159 = 0;
		for (@Pc(103) Class37 local103 = Static174.aClass123_2.method3342(); local103 != null && Static6.anInt159 < 128; local103 = Static174.aClass123_2.method3342()) {
			if (local103.method1460() != 1) {
				@Pc(114) char local114 = local103.method1456();
				if (!Static355.method5934() || local114 != '`' && local114 != '§') {
					Static156.aClass37Array1[Static6.anInt159] = local103;
					Static6.anInt159++;
				} else if (Static333.method6318()) {
					Static321.method5478();
				} else {
					Static129.method2440();
				}
			}
		}
		Static370.aClass2_Sub24_1 = null;
		for (@Pc(163) Class2_Sub24 local163 = Static226.aClass119_1.method3308(); local163 != null; local163 = Static226.aClass119_1.method3308()) {
			@Pc(169) int local169 = local163.method5247();
			if (local169 == -1) {
				Static277.aClass135_31.method3540(local163);
			} else if (Static330.method5654(local169)) {
				Static370.aClass2_Sub24_1 = local163;
			}
		}
		if (Static333.method6318()) {
			Static105.method2209();
		}
		if (Static347.anInt6442 == 0) {
			this.method1411();
			Static142.method2662();
		} else if (Static347.anInt6442 == 5) {
			this.method1411();
			Static142.method2662();
		} else if (Static347.anInt6442 == 25 || Static347.anInt6442 == 28) {
			Static322.method5483();
		}
		if (Static347.anInt6442 == 10) {
			this.method1405();
			Static142.method2663();
			Static164.method3148();
			Static91.method1961();
		} else if (Static347.anInt6442 == 30) {
			Static137.method2549();
		} else if (Static347.anInt6442 == 40) {
			Static91.method1961();
			if (Static41.anInt1046 != -3 && Static41.anInt1046 != 2 && Static41.anInt1046 != 15) {
				Static99.method2144();
			}
		}
		Static318.method5429(Static190.aClass19_8);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1389() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1402() {
		if (Static284.anInt5362 < Static287.aClass183_3.anInt5063) {
			Static311.anInt5811 = 5 * 50 * (Static287.aClass183_3.anInt5063 - 1);
			if (Static85.anInt1843 == Static16.anInt4758) {
				Static85.anInt1843 = Static330.anInt6193;
			} else {
				Static85.anInt1843 = Static16.anInt4758;
			}
			if (Static311.anInt5811 > 3000) {
				Static311.anInt5811 = 3000;
			}
			if (Static287.aClass183_3.anInt5063 >= 2 && Static287.aClass183_3.anInt5062 == 6) {
				this.method1392("js5connect_outofdate");
				Static347.anInt6442 = 1000;
				return;
			}
			if (Static287.aClass183_3.anInt5063 >= 4 && Static287.aClass183_3.anInt5062 == -1) {
				this.method1392("js5crc");
				Static347.anInt6442 = 1000;
				return;
			}
			if (Static287.aClass183_3.anInt5063 >= 4 && (Static347.anInt6442 == 0 || Static347.anInt6442 == 5)) {
				if (Static287.aClass183_3.anInt5062 == 7 || Static287.aClass183_3.anInt5062 == 9) {
					this.method1392("js5connect_full");
				} else if (Static287.aClass183_3.anInt5062 > 0) {
					this.method1392("js5connect");
				} else {
					this.method1392("js5io");
				}
				Static347.anInt6442 = 1000;
				return;
			}
		}
		Static284.anInt5362 = Static287.aClass183_3.anInt5063;
		if (Static311.anInt5811 > 0) {
			Static311.anInt5811--;
			return;
		}
		try {
			if (Static309.anInt5800 == 0) {
				Static211.aClass32_8 = Static328.aClass152_5.openSocket(Static216.aString36, Static85.anInt1843);
				Static309.anInt5800++;
			}
			if (Static309.anInt5800 == 1) {
				if (Static211.aClass32_8.status == 2) {
					this.method1397(1000);
					return;
				}
				if (Static211.aClass32_8.status == 1) {
					Static309.anInt5800++;
				}
			}
			if (Static309.anInt5800 == 2) {
				Static103.aClass111_1 = new Class111((Socket) Static211.aClass32_8.result, Static328.aClass152_5);
				@Pc(186) Class2_Sub4 local186 = new Class2_Sub4(5);
				local186.method4842(Static43.aClass242_2.anInt7038);
				local186.method4813(578);
				Static103.aClass111_1.method2797(5, local186.aByteArray73);
				Static309.anInt5800++;
				Static371.aLong220 = MonotonicClock.currentTimeMillis();
			}
			if (Static309.anInt5800 == 3) {
				if (Static347.anInt6442 == 0 || Static347.anInt6442 == 5 || Static103.aClass111_1.method2795() > 0) {
					@Pc(245) int local245 = Static103.aClass111_1.method2800();
					if (local245 != 0) {
						this.method1397(local245);
						return;
					}
					Static309.anInt5800++;
				} else if (MonotonicClock.currentTimeMillis() - Static371.aLong220 > 30000L) {
					this.method1397(1001);
					return;
				}
			}
			if (Static309.anInt5800 == 4) {
				@Pc(278) boolean local278 = Static347.anInt6442 == 5 || Static347.anInt6442 == 10 || Static347.anInt6442 == 28;
				Static287.aClass183_3.method4639(Static103.aClass111_1, !local278);
				Static211.aClass32_8 = null;
				Static309.anInt5800 = 0;
				Static103.aClass111_1 = null;
			}
		} catch (@Pc(295) IOException local295) {
			this.method1397(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1405() {
		Static165.anInt3148++;
		Static374.method6274(-1, null, -1);
		Static65.method1735(-1, null, -1);
		Static309.method5278();
		Static88.anInt1876++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class11_Sub5_Sub2_Sub2 local33 = Static365.aClass11_Sub5_Sub2_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass71_1.aByte16;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4328();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt4643 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(96) int local96 = local74 + local33.anIntArray316[0];
							if (local96 < 0) {
								local96 = 0;
							} else if (Static373.anInt7033 - local50 - 1 < local96) {
								local96 = Static373.anInt7033 - local50 - 1;
							}
							@Pc(128) int local128 = local33.anIntArray317[0] + local82;
							if (local128 < 0) {
								local128 = 0;
							} else if (Static242.anInt4449 - local50 - 1 < local128) {
								local128 = Static242.anInt4449 - local50 - 1;
							}
							@Pc(179) int local179 = Static141.method2654(true, Static52.anIntArray99, local50, -1, 0, 0, Static171.aClass46Array1[local33.aByte78], local33.anIntArray316[0], local50, local96, Static59.anIntArray105, local50, local128, local33.anIntArray317[0]);
							if (local179 > 0) {
								if (local179 > 9) {
									local179 = 9;
								}
								for (@Pc(190) int local190 = 0; local190 < local179; local190++) {
									local33.anIntArray316[local190] = Static52.anIntArray99[local179 - local190 - 1];
									local33.anIntArray317[local190] = Static59.anIntArray105[local179 - local190 - 1];
									local33.aByteArray51[local190] = 1;
								}
								local33.anInt4643 = local179;
							}
						}
					}
					Static317.method5548(local33, true);
					local74 = Static71.method6019(local33);
					Static100.method2160(local74, Static16.anInt4756, Static170.anInt3229, local33);
					Static173.method3315(local33);
				}
			}
		}
		if (Static347.anInt6441 == 0 && Static141.anInt2652 == 0) {
			if (Static314.anInt5911 == 2) {
				Static222.method3917();
			} else {
				Static199.method5249();
			}
			if (Static136.anInt6778 >> 7 < 14 || Static136.anInt6778 >> 7 >= Static373.anInt7033 - 14 || Static211.anInt3777 >> 7 < 14 || Static211.anInt3777 >> 7 >= Static242.anInt4449 - 14) {
				Static262.method6254();
			}
		}
		while (true) {
			@Pc(298) Class2_Sub13 local298;
			@Pc(303) Class161 local303;
			@Pc(311) Class161 local311;
			do {
				local298 = (Class2_Sub13) Static378.aClass135_43.method3549();
				if (local298 == null) {
					while (true) {
						do {
							local298 = (Class2_Sub13) Static207.aClass135_25.method3549();
							if (local298 == null) {
								while (true) {
									do {
										local298 = (Class2_Sub13) Static274.aClass135_30.method3549();
										if (local298 == null) {
											if (Static375.aClass161_14 != null) {
												Static122.method2398();
											}
											if (Static114.anInt2348 % 1500 == 0) {
												Static322.method5485();
											}
											Static259.method4428();
											if (Static273.aBoolean374 && Static375.aLong221 < MonotonicClock.currentTimeMillis() - 60000L) {
												Static340.method5765();
												return;
											}
											return;
										}
										local303 = local298.aClass161_3;
										if (local303.anInt4297 < 0) {
											break;
										}
										local311 = Static6.method140(local303.anInt4275);
									} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local303 != local311.aClass161Array2[local303.anInt4297]);
									Static198.method3591(local298);
								}
							}
							local303 = local298.aClass161_3;
							if (local303.anInt4297 < 0) {
								break;
							}
							local311 = Static6.method140(local303.anInt4275);
						} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4297] != local303);
						Static198.method3591(local298);
					}
				}
				local303 = local298.aClass161_3;
				if (local303.anInt4297 < 0) {
					break;
				}
				local311 = Static6.method140(local303.anInt4275);
			} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4297 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4297] != local303);
			Static198.method3591(local298);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1406(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class2_Sub4 local14 = new Class2_Sub4(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.method4815();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(109) int[] local109 = Static209.anIntArray228 = new int[6];
						local109[0] = local14.method4829();
						local109[1] = local14.method4829();
						local109[2] = local14.method4829();
						local109[3] = local14.method4829();
						local109[4] = local14.method4829();
						local109[5] = local14.method4829();
					} else {
						@Pc(38) int local38;
						@Pc(33) int local33;
						if (local18 == 4) {
							local33 = local14.method4815();
							Static117.anIntArray150 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static117.anIntArray150[local38] = local14.method4829();
								if (Static117.anIntArray150[local38] == 65535) {
									Static117.anIntArray150[local38] = -1;
								}
							}
						} else if (local18 == 5) {
							local33 = local14.method4815();
							Static324.anIntArray412 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static324.anIntArray412[local38] = local14.method4829();
								if (Static324.anIntArray412[local38] == 65535) {
									Static324.anIntArray412[local38] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1387() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static352.method5877();
		Static1.aClass206_1 = new Class206(Static328.aClass152_5);
		Static287.aClass183_3 = new Class183();
		if (Static121.aClass127_4 != Static189.aClass127_6) {
			Static26.aByteArrayArray3 = new byte[50][];
		}
		Static218.aClass177_Sub1_2 = new Class177_Sub1(Static328.aClass152_5);
		if (Static121.aClass127_4 == Static189.aClass127_6) {
			Static61.aString14 = this.getCodeBase().getHost();
			Static392.anInt7225 = 43594;
			Static35.anInt920 = 443;
		} else if (Static274.method4638(Static121.aClass127_4)) {
			Static61.aString14 = this.getCodeBase().getHost();
			Static392.anInt7225 = Static177.anInt3372 + 40000;
			Static35.anInt920 = Static177.anInt3372 + 50000;
		} else if (Static231.aClass127_7 == Static121.aClass127_4) {
			Static392.anInt7225 = Static177.anInt3372 + 40000;
			Static35.anInt920 = Static177.anInt3372 + 50000;
			Static61.aString14 = "127.0.0.1";
		}
		Static16.anInt4758 = Static392.anInt7225;
		Static216.aString36 = Static61.aString14;
		Static278.anInt5154 = Static392.anInt7225;
		Static330.anInt6193 = Static35.anInt920;
		Static257.aShortArray79 = Static223.aShortArray78 = Static258.aShortArray95 = Static147.aShortArray54 = new short[256];
		Static85.anInt1843 = Static278.anInt5154;
		if (Static215.anInt3795 == 3) {
			Static120.anInt2385 = Static177.anInt3372;
		}
		if (Static343.aClass50_4 == Static106.aClass50_1) {
			Static186.aShortArrayArray6 = Static30.aShortArrayArray3;
			Static28.anInt686 = 16777215;
			Static148.aBoolean192 = true;
			Static43.aShortArray20 = Static113.aShortArray46;
			Static279.anInt5161 = 0;
			Static10.aShortArray1 = Static25.aShortArray4;
			Static353.aShortArrayArray7 = Static201.aShortArrayArray5;
		} else {
			Static43.aShortArray20 = Static131.aShortArray65;
			Static10.aShortArray1 = Static78.aShortArray123;
			Static353.aShortArrayArray7 = Static25.aShortArrayArray2;
			Static186.aShortArrayArray6 = Static386.aShortArrayArray9;
		}
		Static174.aClass123_2 = Static18.method556(Static21.aCanvas1);
		Static226.aClass119_1 = Static31.method948(Static21.aCanvas1);
		Static337.aClass131_1 = Static63.method1702();
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3692(Static21.aCanvas1);
		}
		Static367.anInt6878 = Static215.anInt3795;
		try {
			if (Static328.aClass152_5.cacheData != null) {
				Static110.aClass205_1 = new Class205(Static328.aClass152_5.cacheData, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Static185.aClass205Array1[local171] = new Class205(Static328.aClass152_5.cacheIndexes[local171], 6000, 0);
				}
				Static150.aClass205_2 = new Class205(Static328.aClass152_5.cacheMasterIndex, 6000, 0);
				Static18.aClass207_1 = new Class207(255, Static110.aClass205_1, Static150.aClass205_2, 500000);
				Static317.aClass205_6 = new Class205(Static328.aClass152_5.uid, 24, 0);
				Static328.aClass152_5.uid = null;
				Static328.aClass152_5.cacheMasterIndex = null;
				Static328.aClass152_5.cacheIndexes = null;
				Static328.aClass152_5.cacheData = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static150.aClass205_2 = null;
			Static110.aClass205_1 = null;
			Static317.aClass205_6 = null;
			Static18.aClass207_1 = null;
		}
		if (Static189.aClass127_6 != Static121.aClass127_4) {
			Static356.aBoolean456 = true;
		}
		Static290.aString56 = (Static249.aClass50_3 == Static343.aClass50_4 ? Static221.aClass79_99 : Static221.aClass79_98).method2267(Static295.anInt5581);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1411() {
		@Pc(6) int local6;
		if (!Static218.aClass177_Sub1_2.aBoolean362) {
			for (local6 = 0; local6 < Static6.anInt159; local6++) {
				if (Static156.aClass37Array1[local6].method1456() == 's' || Static156.aClass37Array1[local6].method1456() == 'S') {
					Static218.aClass177_Sub1_2.aBoolean362 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static309.anInt5801 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local55 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(60) long local60 = MonotonicClock.currentTimeMillis();
			if (Static5.aLong11 == 0L) {
				Static5.aLong11 = local60;
			}
			if (local55 > 16384 && local60 - Static5.aLong11 < 5000L) {
				if (local60 - Static29.aLong22 > 1000L) {
					System.gc();
					Static29.aLong22 = local60;
				}
				Static56.aString13 = Static311.aClass79_122.method2267(Static295.anInt5581);
				Static141.anInt2650 = 5;
			} else {
				Static56.aString13 = Static146.aClass79_63.method2267(Static295.anInt5581);
				Static141.anInt2650 = 5;
				Static309.anInt5801 = 10;
			}
		} else if (Static309.anInt5801 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static171.aClass46Array1[local6] = Static24.method853(Static242.anInt4449, Static373.anInt7033);
			}
			Static56.aString13 = Static109.aClass79_46.method2267(Static295.anInt5581);
			Static309.anInt5801 = 20;
			Static141.anInt2650 = 10;
		} else if (Static309.anInt5801 == 20) {
			if (Static54.aClass154_1 == null) {
				Static54.aClass154_1 = new Class154(Static287.aClass183_3, Static1.aClass206_1);
			}
			if (Static54.aClass154_1.method3872()) {
				Static342.aClass197_77 = Static163.method3101(true, 0, false);
				Static34.aClass197_67 = Static163.method3101(true, 1, false);
				Static289.aClass197_71 = Static163.method3101(true, 2, false);
				Static354.aClass197_9 = Static163.method3101(true, 3, false);
				Static85.aClass197_21 = Static163.method3101(true, 4, false);
				Static288.aClass197_70 = Static163.method3101(true, 5, true);
				Static101.aClass197_23 = Static163.method3101(false, 6, true);
				Static237.aClass197_63 = Static163.method3101(true, 7, false);
				Static30.aClass197_5 = Static163.method3101(true, 8, false);
				Static324.aClass197_86 = Static163.method3101(true, 9, false);
				Static75.aClass197_18 = Static163.method3101(true, 10, false);
				Static216.aClass197_58 = Static163.method3101(true, 11, false);
				Static195.aClass197_54 = Static163.method3101(true, 12, false);
				Static255.aClass197_64 = Static163.method3101(true, 13, false);
				Static133.aClass197_32 = Static163.method3101(false, 14, false);
				Static120.aClass197_28 = Static163.method3101(true, 15, false);
				Static391.aClass197_96 = Static163.method3101(true, 16, false);
				Static226.aClass197_61 = Static163.method3101(true, 17, false);
				Static216.aClass197_57 = Static163.method3101(true, 18, false);
				Static61.aClass197_12 = Static163.method3101(true, 19, false);
				Static139.aClass197_35 = Static163.method3101(true, 20, false);
				Static173.aClass197_45 = Static163.method3101(true, 21, false);
				Static294.aClass197_75 = Static163.method3101(true, 22, false);
				Static389.aClass197_66 = Static163.method3101(true, 23, true);
				Static385.aClass197_94 = Static163.method3101(true, 24, false);
				Static139.aClass197_34 = Static163.method3101(true, 25, false);
				Static235.aClass197_47 = Static163.method3101(true, 26, true);
				Static61.aClass197_11 = Static163.method3101(true, 27, false);
				Static85.aClass197_20 = Static163.method3101(true, 28, true);
				Static56.aString13 = Static118.aClass79_76.method2267(Static295.anInt5581);
				Static309.anInt5801 = 30;
				Static141.anInt2650 = 15;
			} else {
				Static56.aString13 = Static193.aClass79_78.method2267(Static295.anInt5581);
				Static141.anInt2650 = 12;
			}
		} else if (Static309.anInt5801 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 29; local55++) {
				local6 += Static374.aClass25_Sub1Array2[local55].method896() * Static278.anIntArray362[local55] / 100;
			}
			if (local6 == 100) {
				Static56.aString13 = Static226.aClass79_89.method2267(Static295.anInt5581);
				Static141.anInt2650 = 20;
				Static62.method2390(Static30.aClass197_5);
				Static44.method1359(Static30.aClass197_5);
				Static309.anInt5801 = 40;
			} else {
				if (local6 != 0) {
					Static56.aString13 = Static117.aClass79_47.method2267(Static295.anInt5581) + local6 + "%";
				}
				Static141.anInt2650 = 20;
			}
		} else if (Static309.anInt5801 == 40) {
			if (Static85.aClass197_20.method5073()) {
				this.method1406(Static85.aClass197_20.method5082(1));
				Static56.aString13 = Static117.aClass79_48.method2267(Static295.anInt5581);
				Static141.anInt2650 = 25;
				Static309.anInt5801 = 50;
			} else {
				Static56.aString13 = Static26.aClass79_18.method2267(Static295.anInt5581) + Static85.aClass197_20.method5091() + "%";
				Static141.anInt2650 = 25;
			}
		} else if (Static309.anInt5801 == 50) {
			Static84.method1909(Static218.aClass177_Sub1_2.aBoolean352);
			Static385.aClass2_Sub12_Sub3_3 = new Class2_Sub12_Sub3();
			Static385.aClass2_Sub12_Sub3_3.method4296();
			Static303.aClass221_2 = Static381.method6347(0, Static328.aClass152_5, Static21.aCanvas1, 22050);
			Static303.aClass221_2.method6330(Static385.aClass2_Sub12_Sub3_3);
			Static180.method3369(Static133.aClass197_32, Static120.aClass197_28, Static85.aClass197_21, Static385.aClass2_Sub12_Sub3_3);
			Static190.aClass221_1 = Static381.method6347(1, Static328.aClass152_5, Static21.aCanvas1, 2048);
			Static227.aClass2_Sub12_Sub2_2 = new Class2_Sub12_Sub2();
			Static190.aClass221_1.method6330(Static227.aClass2_Sub12_Sub2_2);
			Static300.aClass249_1 = new Class249(22050, Static356.anInt6643);
			Static97.anInt2049 = Static101.aClass197_23.method5075("scape main");
			Static56.aString13 = Static369.aClass79_144.method2267(Static295.anInt5581);
			Static141.anInt2650 = 30;
			Static309.anInt5801 = 60;
		} else if (Static309.anInt5801 == 60) {
			local6 = Static64.method1707(Static255.aClass197_64, Static30.aClass197_5);
			local55 = Static218.method1090();
			if (local55 > local6) {
				Static56.aString13 = Static276.aClass79_109.method2267(Static295.anInt5581) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 35;
			} else {
				Static56.aString13 = Static121.aClass79_53.method2267(Static295.anInt5581);
				Static309.anInt5801 = 70;
				Static141.anInt2650 = 35;
			}
		} else if (Static309.anInt5801 == 70) {
			local6 = Static333.method6333(Static30.aClass197_5);
			local55 = Static32.method991();
			if (local6 < local55) {
				Static56.aString13 = Static279.aClass79_111.method2267(Static295.anInt5581) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 40;
			} else {
				Static56.aString13 = Static201.aClass79_80.method2267(Static295.anInt5581);
				Static309.anInt5801 = 80;
				Static141.anInt2650 = 40;
			}
		} else if (Static309.anInt5801 == 80) {
			if (Static235.aClass197_47.method5073()) {
				Static128.anInterface2_4 = new Class99(Static235.aClass197_47, Static324.aClass197_86, Static30.aClass197_5);
				Static56.aString13 = Static312.aClass79_123.method2267(Static295.anInt5581);
				Static141.anInt2650 = 45;
				Static309.anInt5801 = 90;
			} else {
				Static56.aString13 = Static118.aClass79_77.method2267(Static295.anInt5581) + Static235.aClass197_47.method5091() + "%";
				Static141.anInt2650 = 45;
			}
		} else if (Static309.anInt5801 == 90) {
			Static56.aString13 = Static252.aClass79_100.method2267(Static295.anInt5581);
			Static309.anInt5801 = 95;
			Static141.anInt2650 = 50;
		} else if (Static309.anInt5801 == 95) {
			if (Static218.aClass177_Sub1_2.aBoolean362) {
				Static218.aClass177_Sub1_2.anInt4894 = 1;
				Static218.aClass177_Sub1_2.anInt4878 = 0;
				Static218.aClass177_Sub1_2.anInt4885 = 0;
				Static218.aClass177_Sub1_2.anInt4883 = 0;
				Static218.aClass177_Sub1_2.anInt4891 = 0;
			}
			Static218.aClass177_Sub1_2.aBoolean362 = true;
			Static218.aClass177_Sub1_2.method4497(Static328.aClass152_5);
			Static252.method4365(false, Static218.aClass177_Sub1_2.anInt4878);
			Static56.aString13 = Static357.aClass79_138.method2267(Static295.anInt5581);
			Static141.anInt2650 = 55;
			Static309.anInt5801 = 100;
		} else if (Static309.anInt5801 == 100) {
			Static236.method4102(Static30.aClass197_5, Static255.aClass197_64, Static190.aClass19_8);
			Static56.aString13 = Static179.aClass79_73.method2267(Static295.anInt5581);
			Static141.anInt2650 = 60;
			Static336.method5705(5);
			Static309.anInt5801 = 110;
		} else if (Static309.anInt5801 == 110) {
			Static289.aClass197_71.method5073();
			local6 = Static289.aClass197_71.method5091();
			Static391.aClass197_96.method5073();
			local6 += Static391.aClass197_96.method5091();
			Static226.aClass197_61.method5073();
			local6 += Static226.aClass197_61.method5091();
			Static216.aClass197_57.method5073();
			local6 += Static216.aClass197_57.method5091();
			Static61.aClass197_12.method5073();
			local6 += Static61.aClass197_12.method5091();
			Static139.aClass197_35.method5073();
			local6 += Static139.aClass197_35.method5091();
			Static173.aClass197_45.method5073();
			local6 += Static173.aClass197_45.method5091();
			Static294.aClass197_75.method5073();
			local6 += Static294.aClass197_75.method5091();
			Static385.aClass197_94.method5073();
			local6 += Static385.aClass197_94.method5091();
			Static139.aClass197_34.method5073();
			local6 += Static139.aClass197_34.method5091();
			Static61.aClass197_11.method5073();
			local6 += Static61.aClass197_11.method5091();
			if (local6 < 1100) {
				Static56.aString13 = Static36.aClass79_22.method2267(Static295.anInt5581) + local6 / 11 + "%";
				Static141.anInt2650 = 65;
			} else {
				Static363.aClass18_2 = new Class18(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static59.aClass7_1 = new Class7(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static221.aClass150_3 = new Class150(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71, Static30.aClass197_5);
				Static140.aClass109_1 = new Class109(Static343.aClass50_4, Static295.anInt5581, Static226.aClass197_61);
				Static39.aClass72_3 = new Class72(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static336.aClass241_5 = new Class241(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static21.aClass55_1 = new Class55(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71, Static237.aClass197_63);
				Static178.aClass51_3 = new Class51(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static90.aClass190_3 = new Class190(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static359.aClass202_4 = new Class202(Static343.aClass50_4, Static295.anInt5581, true, Static391.aClass197_96, Static237.aClass197_63);
				Static236.aClass125_1 = new Class125(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71, Static30.aClass197_5);
				Static320.aClass104_2 = new Class104(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71, Static30.aClass197_5);
				Static6.aClass219_1 = new Class219(Static343.aClass50_4, Static295.anInt5581, true, Static216.aClass197_57, Static237.aClass197_63);
				Static313.aClass107_2 = new Class107(Static343.aClass50_4, Static295.anInt5581, true, Static363.aClass18_2, Static61.aClass197_12, Static237.aClass197_63);
				Static287.aClass233_1 = new Class233(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static39.aClass85_1 = new Class85(Static343.aClass50_4, Static295.anInt5581, Static139.aClass197_35, Static342.aClass197_77, Static34.aClass197_67);
				Static9.aClass213_1 = new Class213(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static278.aClass160_1 = new Class160(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static322.aClass211_2 = new Class211(Static343.aClass50_4, Static295.anInt5581, Static173.aClass197_45, Static237.aClass197_63);
				Static367.aClass132_1 = new Class132(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static183.aClass193_2 = new Class193(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static162.aClass45_1 = new Class45(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static322.aClass128_1 = new Class128(Static343.aClass50_4, Static295.anInt5581, Static294.aClass197_75);
				Static56.aClass199_1 = new Class199(Static343.aClass50_4, Static295.anInt5581, Static289.aClass197_71);
				Static126.method5702(Static255.aClass197_64, Static237.aClass197_63, Static354.aClass197_9, Static30.aClass197_5);
				Static325.method5544(new Class83(), Static385.aClass197_94, Static139.aClass197_34);
				Static117.method2366(Static385.aClass197_94, Static139.aClass197_34);
				Static56.aString13 = Static336.aClass79_130.method2267(Static295.anInt5581);
				Static141.anInt2650 = 65;
				Static156.method2798();
				Static359.aClass202_4.method5160(!Static218.aClass177_Sub1_2.method4495(Static77.anInt1762));
				Static214.aClass226_1 = new Class226();
				Static174.method1506();
				Static382.method6362(Static61.aClass197_11);
				Static292.method5037(Static128.anInterface2_4, Static237.aClass197_63);
				Static309.anInt5801 = 120;
			}
		} else if (Static309.anInt5801 == 120) {
			local6 = Static134.method2509(Static30.aClass197_5);
			local55 = Static254.method4375();
			if (local55 > local6) {
				Static56.aString13 = Static117.aClass79_49.method2267(Static295.anInt5581) + local6 * 100 / local55 + "%";
				Static141.anInt2650 = 70;
			} else {
				Static44.method1358(Static190.aClass19_8, Static30.aClass197_5);
				Static144.method2691(Static124.aClass13Array27);
				Static56.aString13 = Static235.aClass79_72.method2267(Static295.anInt5581);
				Static309.anInt5801 = 130;
				Static141.anInt2650 = 70;
			}
		} else if (Static309.anInt5801 == 130) {
			if (Static75.aClass197_18.method5098("huffman", "")) {
				@Pc(1242) Class140 local1242 = new Class140(Static75.aClass197_18.method5084("huffman", ""));
				Static334.method5687(local1242);
				Static56.aString13 = Static134.aClass79_59.method2267(Static295.anInt5581);
				Static309.anInt5801 = 140;
				Static141.anInt2650 = 75;
			} else {
				Static56.aString13 = Static307.aClass79_121.method2267(Static295.anInt5581) + "0%";
				Static141.anInt2650 = 75;
			}
		} else if (Static309.anInt5801 == 140) {
			if (Static354.aClass197_9.method5073()) {
				Static56.aString13 = Static78.aClass79_128.method2267(Static295.anInt5581);
				Static309.anInt5801 = 150;
				Static141.anInt2650 = 80;
			} else {
				Static56.aString13 = Static227.aClass79_90.method2267(Static295.anInt5581) + Static354.aClass197_9.method5091() + "%";
				Static141.anInt2650 = 80;
			}
		} else if (Static309.anInt5801 == 150) {
			if (Static195.aClass197_54.method5073()) {
				Static56.aString13 = Static347.aClass79_134.method2267(Static295.anInt5581);
				Static141.anInt2650 = 82;
				Static309.anInt5801 = 160;
			} else {
				Static56.aString13 = Static67.aClass79_35.method2267(Static295.anInt5581) + Static195.aClass197_54.method5091() + "%";
				Static141.anInt2650 = 82;
			}
		} else if (Static309.anInt5801 == 160) {
			if (Static255.aClass197_64.method5073()) {
				Static56.aString13 = Static325.aClass79_126.method2267(Static295.anInt5581);
				Static141.anInt2650 = 85;
				Static309.anInt5801 = 170;
			} else {
				Static56.aString13 = Static325.aClass79_126.method2267(Static295.anInt5581) + Static255.aClass197_64.method5091() + "%";
				Static141.anInt2650 = 85;
			}
		} else if (Static309.anInt5801 == 170) {
			if (Static389.aClass197_66.method5072("details")) {
				Static344.method5512(Static389.aClass197_66, Static39.aClass72_3, Static336.aClass241_5, Static359.aClass202_4, Static236.aClass125_1, Static320.aClass104_2, Static214.aClass226_1);
				Static56.aString13 = Static300.aClass79_118.method2267(Static295.anInt5581);
				Static309.anInt5801 = 180;
				Static141.anInt2650 = 89;
			} else {
				Static56.aString13 = Static163.aClass79_68.method2267(Static295.anInt5581) + Static389.aClass197_66.method5085("details") + "%";
				Static141.anInt2650 = 87;
			}
		} else if (Static309.anInt5801 == 180) {
			local6 = Static319.method5430();
			if (local6 == -1) {
				Static56.aString13 = Static294.aClass79_117.method2267(Static295.anInt5581);
				Static141.anInt2650 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method1392("worldlistfull");
				Static336.method5705(1000);
			} else if (Static70.aBoolean130) {
				Static56.aString13 = Static340.aClass79_133.method2267(Static295.anInt5581);
				Static141.anInt2650 = 90;
				Static309.anInt5801 = 190;
			} else {
				this.method1392("worldlistio_" + local6);
				Static336.method5705(1000);
			}
		} else if (Static309.anInt5801 == 190) {
			Static89.aBooleanArray18 = new boolean[Static162.aClass45_1.anInt1466];
			Static75.aStringArray11 = new String[Static183.aClass193_2.anInt5494];
			Static75.anIntArray117 = new int[Static162.aClass45_1.anInt1466];
			for (local6 = 0; local6 < Static162.aClass45_1.anInt1466; local6++) {
				if (Static162.aClass45_1.method1623(local6).anInt1258 == 0) {
					Static89.aBooleanArray18[local6] = true;
					Static112.anInt2294++;
				}
				Static75.anIntArray117[local6] = -1;
			}
			Static318.method5425();
			Static391.anInt7216 = Static354.aClass197_9.method5075("loginscreen");
			Static288.aClass197_70.method5070(false);
			Static101.aClass197_23.method5070(true);
			Static30.aClass197_5.method5070(true);
			Static255.aClass197_64.method5070(true);
			Static75.aClass197_18.method5070(true);
			Static354.aClass197_9.method5070(true);
			Static352.aBoolean446 = true;
			Static289.aClass197_71.anInt5558 = 2;
			Static226.aClass197_61.anInt5558 = 2;
			Static391.aClass197_96.anInt5558 = 2;
			Static216.aClass197_57.anInt5558 = 2;
			Static61.aClass197_12.anInt5558 = 2;
			Static139.aClass197_35.anInt5558 = 2;
			Static173.aClass197_45.anInt5558 = 2;
			Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
			Static56.aString13 = Static70.aClass79_36.method2267(Static295.anInt5581);
			Static309.anInt5801 = 200;
			Static141.anInt2650 = 95;
		} else if (Static309.anInt5801 == 200) {
			Static50.method1525(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1412() {
		@Pc(21) boolean local21 = Static287.aClass183_3.method4640();
		if (!local21) {
			this.method1402();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1386() {
		if (Static273.aBoolean374) {
			Static340.method5765();
		}
		if (Static190.aClass19_8 != null) {
			Static190.aClass19_8.method2825();
		}
		if (Static363.aFrame2 != null) {
			Static17.method4215(Static363.aFrame2, Static328.aClass152_5);
			Static363.aFrame2 = null;
		}
		if (Static335.aClass111_4 != null) {
			Static335.aClass111_4.method2799();
			Static335.aClass111_4 = null;
		}
		if (Static337.aClass131_1 != null) {
			Static337.aClass131_1.method3691(Static21.aCanvas1);
		}
		Static337.aClass131_1 = null;
		if (Static303.aClass221_2 != null) {
			Static303.aClass221_2.method6326();
		}
		if (Static190.aClass221_1 != null) {
			Static190.aClass221_1.method6326();
		}
		Static287.aClass183_3.method4645();
		Static1.aClass206_1.method5228();
		if (Static4.aClass162_1 != null) {
			Static4.aClass162_1.method4115();
			Static4.aClass162_1 = null;
		}
	}
}
