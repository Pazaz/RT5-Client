import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!ro;")
	private static Class177 aClass177_16;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray34;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
	private static int[] anIntArray418;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!ro;")
	private static Class177 aClass177_17;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!lm;")
	private static Class123 aClass123_1;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray35 = new String[1000];

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	private static int anInt5658 = 0;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
	private static final int[] anIntArray419 = new int[1000];

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "[[I")
	private static final int[][] anIntArrayArray38 = new int[5][5000];

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "[Lclient!dq;")
	private static final Class51[] aClass51Array1 = new Class51[50];

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "[I")
	private static final int[] anIntArray420 = new int[5];

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "[I")
	private static final int[] anIntArray421 = new int[3];

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "Lclient!we;")
	public static final Class215 aClass215_80 = new Class215(4);

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray36 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public static void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub1_Sub17 local5 = Static320.method5615(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray418 = new int[local5.anInt5041];
		aStringArray34 = new String[local5.anInt5042];
		if (local5.anInt5037 == 15 || local5.anInt5037 == 17 || local5.anInt5037 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static244.aClass177_6 != null) {
				local30 = Static244.aClass177_6.anInt5820;
				local32 = Static244.aClass177_6.anInt5772;
			}
			anIntArray418[0] = Static229.anInt5102 - local30;
			anIntArray418[1] = Static85.anInt2268 - local32;
		}
		method4823(local5, 200000);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public static void method4821(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static199.method3942(arg0)) {
			return;
		}
		@Pc(12) Class177[] local12 = Class1_Sub2_Sub10.lb[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class177 local19 = local12[local14];
			if (local19.anObjectArray26 != null) {
				@Pc(26) Class1_Sub15 local26 = new Class1_Sub15();
				local26.aClass177_9 = local19;
				local26.anObjectArray4 = local19.anObjectArray26;
				method4824(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!oo;I)V")
	private static void method4823(@OriginalArg(0) Class1_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray374;
		@Pc(11) int[] local11 = arg0.anIntArray373;
		@Pc(13) byte local13 = -1;
		anInt5658 = 0;
		@Pc(536) int local536;
		@Pc(1699) String local1699;
		try {
			@Pc(17) int local17 = 0;
			label4416: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				@Pc(541) int local541;
				@Pc(391) int local391;
				@Pc(410) int local410;
				@Pc(348) String local348;
				if (local31 < 100) {
					if (local31 == 0) {
						anIntArray419[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray419[local1++] = Static78.anIntArray137[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static157.method3359(local51, anIntArray419[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray35[local3++] = arg0.aStringArray30[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray419[local1] != anIntArray419[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray419[local1] == anIntArray419[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray419[local1] < anIntArray419[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray419[local1] > anIntArray419[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt5658 == 0) {
							return;
						}
						@Pc(190) Class51 local190 = aClass51Array1[--anInt5658];
						arg0 = local190.aClass1_Sub1_Sub17_1;
						local8 = arg0.anIntArray374;
						local11 = arg0.anIntArray373;
						local5 = local190.anInt1628;
						anIntArray418 = local190.anIntArray103;
						aStringArray34 = local190.aStringArray13;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray419[local1++] = Static95.method2034(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static95.method2032(anIntArray419[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray419[local1] <= anIntArray419[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray419[local1] >= anIntArray419[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray419[local1++] = anIntArray418[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray418[local299] = anIntArray419[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray35[local3++] = aStringArray34[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray34[local299] = aStringArray35[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static141.method3113(local3, aStringArray35, local51);
						aStringArray35[local3++] = local348;
						continue;
					}
					if (local31 == 38) {
						local1--;
						continue;
					}
					if (local31 == 39) {
						local3--;
						continue;
					}
					if (local31 == 40) {
						local51 = local11[local5];
						@Pc(375) Class1_Sub1_Sub17 local375 = Static208.method4121(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt5041];
						@Pc(389) String[] local389 = new String[local375.anInt5042];
						for (local391 = 0; local391 < local375.anInt5045; local391++) {
							local385[local391] = anIntArray419[local1 + local391 - local375.anInt5045];
						}
						for (local410 = 0; local410 < local375.anInt5040; local410++) {
							local389[local410] = aStringArray35[local3 + local410 - local375.anInt5040];
						}
						local1 -= local375.anInt5045;
						local3 -= local375.anInt5040;
						@Pc(441) Class51 local441 = new Class51();
						local441.aClass1_Sub1_Sub17_1 = arg0;
						local441.anInt1628 = local5;
						local441.anIntArray103 = anIntArray418;
						local441.aStringArray13 = aStringArray34;
						if (anInt5658 >= aClass51Array1.length) {
							throw new RuntimeException();
						}
						aClass51Array1[anInt5658++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray374;
						local11 = local375.anIntArray373;
						local5 = -1;
						anIntArray418 = local385;
						aStringArray34 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray419[local1++] = Static294.anIntArray469[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static294.anIntArray469[local51] = anIntArray419[local1];
						Static297.method5237(local51);
						Static69.aBoolean134 |= Static56.aBooleanArray5[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray419[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray420[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4416;
								}
								anIntArrayArray38[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray419[local1];
						if (local536 >= 0 && local536 < anIntArray420[local51]) {
							anIntArray419[local1++] = anIntArrayArray38[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray419[local1];
						if (local536 >= 0 && local536 < anIntArray420[local51]) {
							anIntArrayArray38[local51][local536] = anIntArray419[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static119.aStringArray17[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray35[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static119.aStringArray17[local51] = aStringArray35[local3];
						Static115.method2522(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class183 local689 = arg0.aClass183Array1[local11[local5]];
						local1--;
						@Pc(699) Class1_Sub26 local699 = (Class1_Sub26) local689.method5053((long) anIntArray419[local1]);
						if (local699 != null) {
							local5 += local699.anInt4811;
						}
						continue;
					}
				}
				@Pc(714) boolean local714;
				if (local11[local5] == 1) {
					local714 = true;
				} else {
					local714 = false;
				}
				@Pc(740) int local740;
				@Pc(771) int local771;
				@Pc(855) Class177 local855;
				@Pc(750) Class177 local750;
				@Pc(922) Class177 local922;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray419[local1];
						local541 = anIntArray419[local1 + 1];
						local740 = anIntArray419[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static298.method5252(local536);
						if (local750.aClass177Array8 == null) {
							local750.aClass177Array8 = new Class177[local740 + 1];
						}
						if (local750.aClass177Array8.length <= local740) {
							@Pc(769) Class177[] local769 = new Class177[local740 + 1];
							for (local771 = 0; local771 < local750.aClass177Array8.length; local771++) {
								local769[local771] = local750.aClass177Array8[local771];
							}
							local750.aClass177Array8 = local769;
						}
						if (local740 > 0 && local750.aClass177Array8[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class177 local814 = new Class177();
						local814.anInt5838 = local541;
						local814.anInt5829 = local814.anInt5828 = local750.anInt5828;
						local814.anInt5776 = local740;
						local814.aBoolean404 = true;
						local750.aClass177Array8[local740] = local814;
						if (local714) {
							aClass177_16 = local814;
						} else {
							aClass177_17 = local814;
						}
						Static145.method3188(local750);
						continue;
					}
					@Pc(876) Class177 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass177_16 : aClass177_17;
						if (local855.anInt5776 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static298.method5252(local855.anInt5828);
						local876.aClass177Array8[local855.anInt5776] = null;
						Static145.method3188(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static298.method5252(anIntArray419[local1]);
						local855.aClass177Array8 = null;
						Static145.method3188(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray419[local1];
						local541 = anIntArray419[local1 + 1];
						local922 = Static183.method3720(local541, local536);
						if (local922 != null && local541 != -1) {
							anIntArray419[local1++] = 1;
							if (local714) {
								aClass177_16 = local922;
							} else {
								aClass177_17 = local922;
							}
							continue;
						}
						anIntArray419[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray419[local1];
						local876 = Static298.method5252(local536);
						if (local876 == null) {
							anIntArray419[local1++] = 0;
						} else {
							anIntArray419[local1++] = 1;
							if (local714) {
								aClass177_16 = local876;
							} else {
								aClass177_17 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray419[local1];
							local541 = anIntArray419[local1 + 1];
							for (local740 = 0; local740 < Static354.anIntArray604.length; local740++) {
								if (Static354.anIntArray604[local740] == local536) {
									Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2.method5225(local740, local541);
									continue label4416;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static275.anIntArray200.length) {
									continue label4416;
								}
								if (Static275.anIntArray200[local391] == local536) {
									Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2.method5225(local391, local541);
									continue label4416;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray419[local1];
							local541 = anIntArray419[local1 + 1];
							Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2.method5226(local541, local536);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray419[local1] != 0;
							Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2.method5223(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static298.method5252(anIntArray419[local1]);
							} else {
								local855 = local714 ? aClass177_16 : aClass177_17;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt5823 = anIntArray419[local1];
								local855.anInt5813 = anIntArray419[local1 + 1];
								local541 = anIntArray419[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray419[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte56 = (byte) local541;
								local855.aByte53 = (byte) local740;
								Static145.method3188(local855);
								Static330.method5799(local855);
								if (local855.anInt5776 == -1) {
									Static173.method3532(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt5818 = anIntArray419[local1];
								local855.anInt5763 = anIntArray419[local1 + 1];
								local855.anInt5809 = 0;
								local855.anInt5799 = 0;
								local541 = anIntArray419[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray419[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte55 = (byte) local541;
								local855.aByte54 = (byte) local740;
								Static145.method3188(local855);
								Static330.method5799(local855);
								if (local855.anInt5838 == 0) {
									Static140.method3081(local855, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray419[local1] == 1;
								if (local855.aBoolean411 != local1266) {
									local855.aBoolean411 = local1266;
									Static145.method3188(local855);
								}
								if (local855.anInt5776 == -1) {
									Static11.method6089(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt5817 = anIntArray419[local1];
								local855.anInt5797 = anIntArray419[local1 + 1];
								Static145.method3188(local855);
								Static330.method5799(local855);
								if (local855.anInt5838 == 0) {
									Static140.method3081(local855, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean415 = anIntArray419[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static298.method5252(anIntArray419[local1]);
							} else {
								local855 = local714 ? aClass177_16 : aClass177_17;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt5811 = anIntArray419[local1];
								if (local855.anInt5811 > local855.anInt5822 - local855.anInt5803) {
									local855.anInt5811 = local855.anInt5822 - local855.anInt5803;
								}
								if (local855.anInt5811 < 0) {
									local855.anInt5811 = 0;
								}
								local855.anInt5806 = anIntArray419[local1 + 1];
								if (local855.anInt5806 > local855.anInt5842 - local855.anInt5816) {
									local855.anInt5806 = local855.anInt5842 - local855.anInt5816;
								}
								if (local855.anInt5806 < 0) {
									local855.anInt5806 = 0;
								}
								Static145.method3188(local855);
								if (local855.anInt5776 == -1) {
									Static97.method2069(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt5836 = anIntArray419[local1];
								Static145.method3188(local855);
								if (local855.anInt5776 == -1) {
									Static21.method512(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean406 = anIntArray419[local1] == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt5782 = anIntArray419[local1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt5839 = anIntArray419[local1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray419[local1];
								if (local855.anInt5788 != local541) {
									local855.anInt5788 = local541;
									Static145.method3188(local855);
								}
								if (local855.anInt5776 == -1) {
									Static232.method4421(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt5790 = anIntArray419[local1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean416 = anIntArray419[local1] == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt5807 = 1;
								local1--;
								local855.lb = anIntArray419[local1];
								Static145.method3188(local855);
								if (local855.anInt5776 == -1) {
									Static274.method4918(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt5804 = anIntArray419[local1];
								local855.anInt5795 = anIntArray419[local1 + 1];
								local855.anInt5834 = anIntArray419[local1 + 2];
								local855.anInt5845 = anIntArray419[local1 + 3];
								local855.anInt5756 = anIntArray419[local1 + 4];
								local855.anInt5800 = anIntArray419[local1 + 5];
								Static145.method3188(local855);
								if (local855.anInt5776 == -1) {
									Static331.method5804(local855.anInt5828);
									Static4.method150(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray419[local1];
								if (local855.anInt5821 != local541) {
									local855.anInt5821 = local541;
									local855.anInt5846 = 0;
									local855.anInt5844 = 1;
									local855.anInt5769 = 0;
									Static145.method3188(local855);
								}
								if (local855.anInt5776 == -1) {
									Static199.method3938(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean418 = anIntArray419[local1] == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray35[local3];
								if (!local1699.equals(local855.aString214)) {
									local855.aString214 = local1699;
									Static145.method3188(local855);
								}
								if (local855.anInt5776 == -1) {
									Static132.method3020(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt5786 = anIntArray419[local1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt5758 = anIntArray419[local1];
								local855.anInt5748 = anIntArray419[local1 + 1];
								local855.anInt5780 = anIntArray419[local1 + 2];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean405 = anIntArray419[local1] == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt5814 = anIntArray419[local1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt5765 = anIntArray419[local1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean413 = anIntArray419[local1] == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean402 = anIntArray419[local1] == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt5822 = anIntArray419[local1];
								local855.anInt5842 = anIntArray419[local1 + 1];
								Static145.method3188(local855);
								if (local855.anInt5838 == 0) {
									Static140.method3081(local855, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort70 = (short) anIntArray419[local1];
								local855.aShort71 = (short) anIntArray419[local1 + 1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean414 = anIntArray419[local1] == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt5800 = anIntArray419[local1];
								Static145.method3188(local855);
								if (local855.anInt5776 == -1) {
									Static331.method5804(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray419[local1];
								local855.aBoolean401 = local541 == 1;
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt5843 = anIntArray419[local1];
								local855.anInt5832 = anIntArray419[local1 + 1];
								Static145.method3188(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static298.method5252(anIntArray419[local1]);
							} else {
								local855 = local714 ? aClass177_16 : aClass177_17;
							}
							Static145.method3188(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray419[local1];
								local740 = anIntArray419[local1 + 1];
								if (local855.anInt5776 == -1) {
									Static43.method1264(local855.anInt5828);
									Static331.method5804(local855.anInt5828);
									Static4.method150(local855.anInt5828);
								}
								if (local541 == -1) {
									local855.anInt5807 = 1;
									local855.lb = -1;
									local855.anInt5808 = -1;
									continue;
								}
								local855.anInt5808 = local541;
								local855.anInt5754 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean409 = true;
								} else {
									local855.aBoolean409 = false;
								}
								@Pc(2081) Class36 local2081 = Static165.method3446(local541);
								local855.anInt5834 = local2081.anInt1230;
								local855.anInt5845 = local2081.anInt1218;
								local855.anInt5756 = local2081.anInt1261;
								local855.anInt5804 = local2081.anInt1266;
								local855.anInt5795 = local2081.anInt1264;
								local855.anInt5800 = local2081.anInt1245;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt5840 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt5840 = 1;
								} else {
									local855.anInt5840 = 2;
								}
								if (local855.anInt5809 > 0) {
									local855.anInt5800 = local855.anInt5800 * 32 / local855.anInt5809;
								} else if (local855.anInt5818 > 0) {
									local855.anInt5800 = local855.anInt5800 * 32 / local855.anInt5818;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt5807 = 2;
								local1--;
								local855.lb = anIntArray419[local1];
								if (local855.anInt5776 == -1) {
									Static274.method4918(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt5807 = 3;
								local855.lb = -1;
								if (local855.anInt5776 == -1) {
									Static274.method4918(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt5807 = 6;
								local1--;
								local855.lb = anIntArray419[local1];
								if (local855.anInt5776 == -1) {
									Static274.method4918(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt5807 = 5;
								local1--;
								local855.lb = anIntArray419[local1];
								if (local855.anInt5776 == -1) {
									Static274.method4918(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt5827 = anIntArray419[local1];
								local855.anInt5831 = anIntArray419[local1 + 1];
								local855.anInt5791 = anIntArray419[local1 + 2];
								local855.anInt5759 = anIntArray419[local1 + 3];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt5802 = anIntArray419[local1];
								local855.anInt5750 = anIntArray419[local1 + 1];
								Static145.method3188(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.lb = anIntArray419[local1];
								local855.anInt5830 = anIntArray419[local1 + 1];
								if (anIntArray419[local1 + 2] == 1) {
									local855.anInt5807 = 9;
								} else {
									local855.anInt5807 = 8;
								}
								if (anIntArray419[local1 + 3] == 1) {
									local855.aBoolean409 = true;
								} else {
									local855.aBoolean409 = false;
								}
								if (local855.anInt5776 == -1) {
									Static274.method4918(local855.anInt5828);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt5807 = 5;
								local855.lb = 2047;
								local855.anInt5830 = 0;
								if (local855.anInt5776 == -1) {
									Static274.method4918(local855.anInt5828);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static298.method5252(anIntArray419[local1]);
							} else {
								local855 = local714 ? aClass177_16 : aClass177_17;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray419[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method4914(aStringArray35[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray419[local1];
								local740 = anIntArray419[local1 + 1];
								local855.aClass177_18 = Static183.method3720(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean417 = anIntArray419[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt5768 = anIntArray419[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt5760 = anIntArray419[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString216 = aStringArray35[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString217 = aStringArray35[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray38 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt5785 = anIntArray419[local1];
								local1--;
								local855.anInt5752 = anIntArray419[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray419[local1];
								local1--;
								local740 = anIntArray419[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method4908(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString212 = aStringArray35[local3];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static298.method5252(anIntArray419[local1]);
								} else {
									local855 = local714 ? aClass177_16 : aClass177_17;
								}
								local3--;
								local1699 = aStringArray35[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray419[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray419[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray35[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray419[local1]);
									}
								}
								local1--;
								local771 = anIntArray419[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray11 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray31 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray12 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray19 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray27 = local2638;
									local855.anIntArray444 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray9 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray33 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray30 = local2638;
									local855.anIntArray445 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray25 = local2638;
									local855.anIntArray435 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray24 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray16 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray29 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray32 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray35 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray34 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray21 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray15 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray18 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray7 = local2638;
									local855.anIntArray438 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray6 = local2638;
									local855.anIntArray430 = local2592;
								}
								local855.aBoolean403 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass177_16 : aClass177_17;
								if (local31 == 1500) {
									anIntArray419[local1++] = local855.anInt5820;
									continue;
								}
								if (local31 == 1501) {
									anIntArray419[local1++] = local855.anInt5772;
									continue;
								}
								if (local31 == 1502) {
									anIntArray419[local1++] = local855.anInt5803;
									continue;
								}
								if (local31 == 1503) {
									anIntArray419[local1++] = local855.anInt5816;
									continue;
								}
								if (local31 == 1504) {
									anIntArray419[local1++] = local855.aBoolean411 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray419[local1++] = local855.anInt5829;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass177_16 : aClass177_17;
								if (local31 == 1600) {
									anIntArray419[local1++] = local855.anInt5811;
									continue;
								}
								if (local31 == 1601) {
									anIntArray419[local1++] = local855.anInt5806;
									continue;
								}
								if (local31 == 1602) {
									aStringArray35[local3++] = local855.aString214;
									continue;
								}
								if (local31 == 1603) {
									anIntArray419[local1++] = local855.anInt5822;
									continue;
								}
								if (local31 == 1604) {
									anIntArray419[local1++] = local855.anInt5842;
									continue;
								}
								if (local31 == 1605) {
									anIntArray419[local1++] = local855.anInt5800;
									continue;
								}
								if (local31 == 1606) {
									anIntArray419[local1++] = local855.anInt5834;
									continue;
								}
								if (local31 == 1607) {
									anIntArray419[local1++] = local855.anInt5756;
									continue;
								}
								if (local31 == 1608) {
									anIntArray419[local1++] = local855.anInt5845;
									continue;
								}
								if (local31 == 1609) {
									anIntArray419[local1++] = local855.anInt5782;
									continue;
								}
								if (local31 == 1610) {
									anIntArray419[local1++] = local855.anInt5804;
									continue;
								}
								if (local31 == 1611) {
									anIntArray419[local1++] = local855.anInt5795;
									continue;
								}
								if (local31 == 1612) {
									anIntArray419[local1++] = local855.anInt5788;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass177_16 : aClass177_17;
								if (local31 == 1700) {
									anIntArray419[local1++] = local855.anInt5808;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt5808 == -1) {
										anIntArray419[local1++] = 0;
									} else {
										anIntArray419[local1++] = local855.anInt5754;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray419[local1++] = local855.anInt5776;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass177_16 : aClass177_17;
								if (local31 == 1800) {
									anIntArray419[local1++] = Static37.method930(local855).method5626();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray419[local1];
									local541--;
									if (local855.aStringArray38 != null && local541 < local855.aStringArray38.length && local855.aStringArray38[local541] != null) {
										aStringArray35[local3++] = local855.aStringArray38[local541];
										continue;
									}
									aStringArray35[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString216 == null) {
										aStringArray35[local3++] = "";
									} else {
										aStringArray35[local3++] = local855.aString216;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static298.method5252(anIntArray419[local1]);
								if (local31 == 2500) {
									anIntArray419[local1++] = local855.anInt5820;
									continue;
								}
								if (local31 == 2501) {
									anIntArray419[local1++] = local855.anInt5772;
									continue;
								}
								if (local31 == 2502) {
									anIntArray419[local1++] = local855.anInt5803;
									continue;
								}
								if (local31 == 2503) {
									anIntArray419[local1++] = local855.anInt5816;
									continue;
								}
								if (local31 == 2504) {
									anIntArray419[local1++] = local855.aBoolean411 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray419[local1++] = local855.anInt5829;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static298.method5252(anIntArray419[local1]);
								if (local31 == 2600) {
									anIntArray419[local1++] = local855.anInt5811;
									continue;
								}
								if (local31 == 2601) {
									anIntArray419[local1++] = local855.anInt5806;
									continue;
								}
								if (local31 == 2602) {
									aStringArray35[local3++] = local855.aString214;
									continue;
								}
								if (local31 == 2603) {
									anIntArray419[local1++] = local855.anInt5822;
									continue;
								}
								if (local31 == 2604) {
									anIntArray419[local1++] = local855.anInt5842;
									continue;
								}
								if (local31 == 2605) {
									anIntArray419[local1++] = local855.anInt5800;
									continue;
								}
								if (local31 == 2606) {
									anIntArray419[local1++] = local855.anInt5834;
									continue;
								}
								if (local31 == 2607) {
									anIntArray419[local1++] = local855.anInt5756;
									continue;
								}
								if (local31 == 2608) {
									anIntArray419[local1++] = local855.anInt5845;
									continue;
								}
								if (local31 == 2609) {
									anIntArray419[local1++] = local855.anInt5782;
									continue;
								}
								if (local31 == 2610) {
									anIntArray419[local1++] = local855.anInt5804;
									continue;
								}
								if (local31 == 2611) {
									anIntArray419[local1++] = local855.anInt5795;
									continue;
								}
								if (local31 == 2612) {
									anIntArray419[local1++] = local855.anInt5788;
									continue;
								}
							} else {
								@Pc(3610) Class1_Sub35 local3610;
								@Pc(3526) Class1_Sub35 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static298.method5252(anIntArray419[local1]);
										anIntArray419[local1++] = local855.anInt5808;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static298.method5252(anIntArray419[local1]);
										if (local855.anInt5808 == -1) {
											anIntArray419[local1++] = 0;
										} else {
											anIntArray419[local1++] = local855.anInt5754;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray419[local1];
										local3526 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local536);
										if (local3526 == null) {
											anIntArray419[local1++] = 0;
										} else {
											anIntArray419[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static298.method5252(anIntArray419[local1]);
										if (local855.aClass177Array8 == null) {
											anIntArray419[local1++] = 0;
											continue;
										}
										local541 = local855.aClass177Array8.length;
										for (local740 = 0; local740 < local855.aClass177Array8.length; local740++) {
											if (local855.aClass177Array8[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray419[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local3610 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local536);
										if (local3610 != null && local3610.anInt6079 == local541) {
											anIntArray419[local1++] = 1;
										} else {
											anIntArray419[local1++] = 0;
										}
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static298.method5252(anIntArray419[local1]);
									if (local31 == 2800) {
										anIntArray419[local1++] = Static37.method930(local855).method5626();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray419[local1];
										local541--;
										if (local855.aStringArray38 != null && local541 < local855.aStringArray38.length && local855.aStringArray38[local541] != null) {
											aStringArray35[local3++] = local855.aStringArray38[local541];
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString216 == null) {
											aStringArray35[local3++] = "";
										} else {
											aStringArray35[local3++] = local855.aString216;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray35[local3];
										Static293.method5172(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static259.method4233(anIntArray419[local1], anIntArray419[local1 + 1], Static264.aClass7_Sub1_Sub1_Sub2_2);
										continue;
									}
									if (local31 == 3103) {
										Static11.method6077(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray35[local3];
										local541 = 0;
										if (Static304.method5337(local348)) {
											local541 = Static260.method4756(local348);
										}
										Static150.aClass1_Sub16_Sub2_2.method5793(206);
										Static150.aClass1_Sub16_Sub2_2.method5768(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray35[local3];
										Static150.aClass1_Sub16_Sub2_2.method5793(172);
										Static150.aClass1_Sub16_Sub2_2.method5771(local348.length() + 1);
										Static150.aClass1_Sub16_Sub2_2.method5726(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray35[local3];
										Static150.aClass1_Sub16_Sub2_2.method5793(197);
										Static150.aClass1_Sub16_Sub2_2.method5771(local348.length() + 1);
										Static150.aClass1_Sub16_Sub2_2.method5726(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray419[local1];
										local3--;
										local1699 = aStringArray35[local3];
										Static36.method875(local536, local1699);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local740 = anIntArray419[local1 + 2];
										local750 = Static298.method5252(local740);
										Static91.method2001(local750, local536, local541);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local922 = local714 ? aClass177_16 : aClass177_17;
										Static91.method2001(local922, local536, local541);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray419[local1];
										Static150.aClass1_Sub16_Sub2_2.method5793(139);
										Static150.aClass1_Sub16_Sub2_2.method5757(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local3610 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local536);
										if (local3610 != null) {
											Static321.method5630(local3610.anInt6079 != local541, local3610, true);
										}
										Static74.method1738(local541, 3, true, local536);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray419[local1];
										local3526 = (Class1_Sub35) Static135.aClass183_33.method5053((long) local536);
										if (local3526 != null && local3526.anInt6078 == 3) {
											Static321.method5630(true, local3526, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static78.method1785(255, anIntArray419[local1 + 2], anIntArray419[local1], anIntArray419[local1 + 1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static173.method3533(anIntArray419[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static218.method4246(anIntArray419[local1], 255, anIntArray419[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray419[local1++] = Static197.anInt4521;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static179.method3634(local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static177.method3612(local536, local541);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static304.method5334(local541, local536);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static166.method3462(local536).anInt3098;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static3.anIntArray1[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static241.anIntArray391[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static4.anIntArray9[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static39.anInt1215;
										local541 = (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7) + Static149.anInt3667;
										local740 = (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7) + Static96.anInt2446;
										anIntArray419[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray419[local1++] = Static109.aBoolean184 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray419[local1] + 32768;
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static179.method3634(local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray419[local1] + 32768;
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static177.method3612(local536, local541);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray419[local1] + 32768;
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static304.method5334(local541, local536);
										continue;
									}
									if (local31 == 3316) {
										if (Static87.anInt2332 >= 2) {
											anIntArray419[local1++] = Static87.anInt2332;
										} else {
											anIntArray419[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray419[local1++] = Static257.anInt5551;
										continue;
									}
									if (local31 == 3318) {
										anIntArray419[local1++] = Static154.anInt3814;
										continue;
									}
									if (local31 == 3321) {
										anIntArray419[local1++] = Static221.anInt5016;
										continue;
									}
									if (local31 == 3322) {
										anIntArray419[local1++] = Static67.anInt203;
										continue;
									}
									if (local31 == 3323) {
										if (Static168.anInt4074 >= 5 && Static168.anInt4074 <= 9) {
											anIntArray419[local1++] = 1;
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static168.anInt4074 >= 5 && Static168.anInt4074 <= 9) {
											anIntArray419[local1++] = Static168.anInt4074;
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray419[local1++] = Static15.aBoolean44 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray419[local1++] = Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7133;
										continue;
									}
									if (local31 == 3327) {
										anIntArray419[local1++] = Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2.aBoolean444 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray419[local1++] = Static166.aBoolean286 && !Static93.aBoolean158 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray419[local1++] = Static221.aBoolean352 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static312.method5081(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static276.method4931(local541, local536, false);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = Static276.method4931(local541, local536, true);
										continue;
									}
									if (local31 == 3333) {
										anIntArray419[local1++] = Static144.anInt3574;
										continue;
									}
									if (local31 == 3335) {
										anIntArray419[local1++] = Static60.anInt6011;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local740 = anIntArray419[local1 + 2];
										local391 = anIntArray419[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray419[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray419[local1++] = Static192.anInt4459;
										continue;
									}
									if (local31 == 3338) {
										anIntArray419[local1++] = Static321.method5633();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class1_Sub1_Sub16 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local4695 = Static260.method4759(local536);
										aStringArray35[local3++] = local4695.method4212(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local740 = anIntArray419[local1 + 2];
										local391 = anIntArray419[local1 + 3];
										@Pc(4734) Class1_Sub1_Sub16 local4734 = Static260.method4759(local740);
										if (local4734.aChar3 == local536 && local4734.aChar4 == local541) {
											if (local541 == 115) {
												aStringArray35[local3++] = local4734.method4212(local391);
											} else {
												anIntArray419[local1++] = local4734.method4216(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local740 = anIntArray419[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class1_Sub1_Sub16 local4800 = Static260.method4759(local541);
										if (local4800.aChar4 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray419[local1++] = local4800.method4210(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray419[local1];
										local3--;
										local1699 = aStringArray35[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static260.method4759(local536);
										if (local4695.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray419[local1++] = local4695.method4206(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray419[local1];
										@Pc(4881) Class1_Sub1_Sub16 local4881 = Static260.method4759(local536);
										anIntArray419[local1++] = local4881.aClass183_27.method5054();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static98.anInt1150 == 0) {
											anIntArray419[local1++] = -2;
										} else if (Static98.anInt1150 == 1) {
											anIntArray419[local1++] = -1;
										} else {
											anIntArray419[local1++] = Static43.anInt1459;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static98.anInt1150 == 2 && local536 < Static43.anInt1459) {
											aStringArray35[local3++] = Static46.aStringArray42[local536];
											if (Static210.aStringArray29[local536] == null) {
												aStringArray35[local3++] = "";
											} else {
												aStringArray35[local3++] = Static210.aStringArray29[local536];
											}
											continue;
										}
										aStringArray35[local3++] = "";
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static98.anInt1150 == 2 && local536 < Static43.anInt1459) {
											anIntArray419[local1++] = Static228.anIntArray381[local536];
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static98.anInt1150 == 2 && local536 < Static43.anInt1459) {
											anIntArray419[local1++] = Static27.anIntArray56[local536];
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray35[local3];
										local1--;
										local541 = anIntArray419[local1];
										Static208.method4120(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray35[local3];
										Static71.method1666(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray35[local3];
										Static67.method144(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray35[local3];
										Static262.method4771(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray35[local3];
										Static165.method3448(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray35[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray419[local1++] = Static9.method329(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static98.anInt1150 == 2 && local536 < Static43.anInt1459) {
											aStringArray35[local3++] = Static140.aStringArray22[local536];
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static302.aString237 == null) {
											aStringArray35[local3++] = "";
										} else {
											aStringArray35[local3++] = Static30.method3365(Static302.aString237);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static302.aString237 == null) {
											anIntArray419[local1++] = 0;
										} else {
											anIntArray419[local1++] = Static112.anInt2867;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static302.aString237 != null && local536 < Static112.anInt2867) {
											aStringArray35[local3++] = Static129.aClass186Array1[local536].aString228;
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static302.aString237 != null && local536 < Static112.anInt2867) {
											anIntArray419[local1++] = Static129.aClass186Array1[local536].anInt6084;
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static302.aString237 != null && local536 < Static112.anInt2867) {
											anIntArray419[local1++] = Static129.aClass186Array1[local536].aByte59;
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray419[local1++] = Static324.aByte67;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray35[local3];
										Static50.method1360(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray419[local1++] = Static137.aByte34;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray35[local3];
										Static279.method4948(local348);
										continue;
									}
									if (local31 == 3620) {
										Static259.method4235();
										continue;
									}
									if (local31 == 3621) {
										if (Static98.anInt1150 == 0) {
											anIntArray419[local1++] = -1;
										} else {
											anIntArray419[local1++] = Static186.anInt4356;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static98.anInt1150 != 0 && local536 < Static186.anInt4356) {
											aStringArray35[local3++] = Static140.aStringArray21[local536];
											if (Static189.aStringArray27[local536] == null) {
												aStringArray35[local3++] = "";
											} else {
												aStringArray35[local3++] = Static189.aStringArray27[local536];
											}
											continue;
										}
										aStringArray35[local3++] = "";
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray35[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray419[local1++] = Static344.method6064(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static129.aClass186Array1 != null && local536 < Static112.anInt2867 && Static129.aClass186Array1[local536].aString225.equalsIgnoreCase(Static264.aClass7_Sub1_Sub1_Sub2_2.aString266)) {
											anIntArray419[local1++] = 1;
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static255.aString197 == null) {
											aStringArray35[local3++] = "";
										} else {
											aStringArray35[local3++] = Static255.aString197;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static302.aString237 != null && local536 < Static112.anInt2867) {
											aStringArray35[local3++] = Static129.aClass186Array1[local536].aString229;
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static98.anInt1150 == 2 && local536 >= 0 && local536 < Static43.anInt1459) {
											anIntArray419[local1++] = Static221.aBooleanArray15[local536] ? 1 : 0;
											continue;
										}
										anIntArray419[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray35[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray419[local1++] = Static95.method2025(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray419[local1++] = Static339.anInt7353;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray35[local3];
										Static262.method4771(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static173.aBooleanArray10[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static302.aString237 != null && local536 < Static112.anInt2867) {
											aStringArray35[local3++] = Static129.aClass186Array1[local536].aString225;
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray419[local1];
										if (Static98.anInt1150 != 0 && local536 < Static186.anInt4356) {
											aStringArray35[local3++] = Static19.aStringArray5[local536];
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static29.aClass60Array3[local536].method1750();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static29.aClass60Array3[local536].anInt2079;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static29.aClass60Array3[local536].anInt2077;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static29.aClass60Array3[local536].anInt2083;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static29.aClass60Array3[local536].anInt2087;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = Static29.aClass60Array3[local536].anInt2081;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray419[local1];
										local541 = Static29.aClass60Array3[local536].method1749();
										anIntArray419[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray419[local1];
										local541 = Static29.aClass60Array3[local536].method1749();
										anIntArray419[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray419[local1];
										local541 = Static29.aClass60Array3[local536].method1749();
										anIntArray419[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray419[local1];
										local541 = Static29.aClass60Array3[local536].method1749();
										anIntArray419[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray419[local1];
										anIntArray419[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										local740 = anIntArray419[local1 + 2];
										local391 = anIntArray419[local1 + 3];
										local410 = anIntArray419[local1 + 4];
										anIntArray419[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray419[local1];
										local6055 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										if (local536 == 0) {
											anIntArray419[local1++] = 0;
										} else {
											anIntArray419[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										if (local536 == 0) {
											anIntArray419[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray419[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray419[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray419[local1];
										local541 = anIntArray419[local1 + 1];
										anIntArray419[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray419[local1];
										local6055 = anIntArray419[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray419[local1 + 2];
										anIntArray419[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray35[local3];
											local1--;
											local541 = anIntArray419[local1];
											aStringArray35[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1699 = aStringArray35[local3 + 1];
											aStringArray35[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray35[local3];
											local1--;
											local541 = anIntArray419[local1];
											aStringArray35[local3++] = local348 + Static326.method5661(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray35[local3];
											aStringArray35[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray419[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar2.setTime(new Date(local6487));
											local391 = aCalendar2.get(5);
											local410 = aCalendar2.get(2);
											local771 = aCalendar2.get(1);
											aStringArray35[local3++] = local391 + "-" + aStringArray36[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1699 = aStringArray35[local3 + 1];
											if (Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2 != null && Static264.aClass7_Sub1_Sub1_Sub2_2.aClass190_2.aBoolean444) {
												aStringArray35[local3++] = local1699;
												continue;
											}
											aStringArray35[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray419[local1];
											aStringArray35[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray419[local1++] = Static81.method5967(aStringArray35[local3], Static60.anInt6011, aStringArray35[local3 + 1]);
											continue;
										}
										@Pc(6619) Class63 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray419[local1];
											local740 = anIntArray419[local1 + 1];
											local6619 = Static230.method4379(Static251.aClass162_194, local740);
											anIntArray419[local1++] = local6619.method1844(local348, local541, Static316.aClass29Array15);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray419[local1];
											local740 = anIntArray419[local1 + 1];
											local6619 = Static230.method4379(Static251.aClass162_194, local740);
											anIntArray419[local1++] = local6619.method1845(local541, local348, Static316.aClass29Array15);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1699 = aStringArray35[local3 + 1];
											local1--;
											if (anIntArray419[local1] == 1) {
												aStringArray35[local3++] = local348;
											} else {
												aStringArray35[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray35[local3];
											aStringArray35[local3++] = Static179.method3632(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray35[local3];
											local1--;
											local541 = anIntArray419[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray35[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray419[local1];
											anIntArray419[local1++] = Static224.method4552((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray419[local1];
											anIntArray419[local1++] = Static95.method2028((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray419[local1];
											anIntArray419[local1++] = Static209.method4131((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray419[local1];
											anIntArray419[local1++] = Static221.method4302((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray35[local3];
											if (local348 == null) {
												anIntArray419[local1++] = 0;
											} else {
												anIntArray419[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray419[local1];
											local740 = anIntArray419[local1 + 1];
											aStringArray35[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray35[local3];
											@Pc(6898) StringBuffer local6898 = new StringBuffer(local348.length());
											local6900 = false;
											for (local391 = 0; local391 < local348.length(); local391++) {
												@Pc(6907) char local6907 = local348.charAt(local391);
												if (local6907 == '<') {
													local6900 = true;
												} else if (local6907 == '>') {
													local6900 = false;
												} else if (!local6900) {
													local6898.append(local6907);
												}
											}
											aStringArray35[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray419[local1];
											local740 = anIntArray419[local1 + 1];
											anIntArray419[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1699 = aStringArray35[local3 + 1];
											local1--;
											local740 = anIntArray419[local1];
											anIntArray419[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray419[local1];
											anIntArray419[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray419[local1];
											anIntArray419[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray419[local1] != 0;
											local1--;
											local541 = anIntArray419[local1];
											aStringArray35[local3++] = Static265.method4789(local1070, (long) local541, Static60.anInt6011, 0);
											continue;
										}
									} else {
										@Pc(7311) Class1_Sub1_Sub18 local7311;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray419[local1];
												aStringArray35[local3++] = Static165.method3446(local536).aString51;
												continue;
											}
											@Pc(7092) Class36 local7092;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local7092 = Static165.method3446(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray7[local541 - 1] != null) {
													aStringArray35[local3++] = local7092.aStringArray7[local541 - 1];
													continue;
												}
												aStringArray35[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local7092 = Static165.method3446(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray6[local541 - 1] != null) {
													aStringArray35[local3++] = local7092.aStringArray6[local541 - 1];
													continue;
												}
												aStringArray35[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray419[local1];
												anIntArray419[local1++] = Static165.method3446(local536).anInt1213;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray419[local1];
												anIntArray419[local1++] = Static165.method3446(local536).anInt1219 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7221) Class36 local7221;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray419[local1];
												local7221 = Static165.method3446(local536);
												if (local7221.anInt1231 == -1 && local7221.anInt1209 >= 0) {
													anIntArray419[local1++] = local7221.anInt1209;
													continue;
												}
												anIntArray419[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray419[local1];
												local7221 = Static165.method3446(local536);
												if (local7221.anInt1231 >= 0 && local7221.anInt1209 >= 0) {
													anIntArray419[local1++] = local7221.anInt1209;
													continue;
												}
												anIntArray419[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray419[local1];
												anIntArray419[local1++] = Static165.method3446(local536).aBoolean76 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local7311 = Static231.method4389(local541);
												if (local7311.method4378()) {
													aStringArray35[local3++] = Static165.method3446(local536).method952(local541, local7311.aString180);
												} else {
													anIntArray419[local1++] = Static165.method3446(local536).method957(local7311.anInt5129, local541);
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray35[local3];
												local1--;
												local541 = anIntArray419[local1];
												Static136.method3039(local348, local541 == 1);
												anIntArray419[local1++] = Static194.anInt4478;
												continue;
											}
											if (local31 == 4211) {
												if (Static220.aShortArray89 != null && Static139.anInt3448 < Static194.anInt4478) {
													anIntArray419[local1++] = Static220.aShortArray89[Static139.anInt3448++] & 0xFFFF;
													continue;
												}
												anIntArray419[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static139.anInt3448 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local7311 = Static231.method4389(local541);
												if (local7311.method4378()) {
													aStringArray35[local3++] = Static123.method2640(local536).method2065(local7311.aString180, local541);
												} else {
													anIntArray419[local1++] = Static123.method2640(local536).method2059(local541, local7311.anInt5129);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local7311 = Static231.method4389(local541);
												if (local7311.method4378()) {
													aStringArray35[local3++] = Static83.method1840(local536).method5217(local541, local7311.aString180);
												} else {
													anIntArray419[local1++] = Static83.method1840(local536).method5209(local541, local7311.anInt5129);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local7311 = Static231.method4389(local541);
												if (local7311.method4378()) {
													aStringArray35[local3++] = Static338.method6021(local536).method6166(local541, local7311.aString180);
												} else {
													anIntArray419[local1++] = Static338.method6021(local536).method6164(local7311.anInt5129, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray419[local1];
												anIntArray419[local1++] = Static104.method2159(local536).anInt2843;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray419[local1++] = Static104.anInt2577;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static104.anInt2577 = anIntArray419[local1];
												Static231.anInt5141 = anIntArray419[local1 + 1];
												Static20.anInt709 = anIntArray419[local1 + 2];
												Static150.aClass1_Sub16_Sub2_2.method5793(59);
												Static150.aClass1_Sub16_Sub2_2.method5771(Static104.anInt2577);
												Static150.aClass1_Sub16_Sub2_2.method5771(Static231.anInt5141);
												Static150.aClass1_Sub16_Sub2_2.method5771(Static20.anInt709);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray35[local3];
												local1 -= 2;
												local541 = anIntArray419[local1];
												local740 = anIntArray419[local1 + 1];
												Static150.aClass1_Sub16_Sub2_2.method5793(118);
												Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(local348) + 2);
												Static150.aClass1_Sub16_Sub2_2.method5726(local348);
												Static150.aClass1_Sub16_Sub2_2.method5771(local541 - 1);
												Static150.aClass1_Sub16_Sub2_2.method5771(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray419[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static236.aStringArray31[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray35[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray419[local1];
												local541 = -1;
												if (local536 < 100 && Static236.aStringArray31[local536] != null) {
													local541 = Static122.anIntArray225[local536];
												}
												anIntArray419[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray419[local1++] = Static231.anInt5141;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray35[local3];
												if (Static87.anInt2332 == 0 && (Static166.aBoolean286 && !Static93.aBoolean158 || Static221.aBoolean352)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7764) byte local7764 = 0;
												if (local1699.startsWith(Static355.aString154)) {
													local7764 = 0;
													local348 = local348.substring(Static355.aString154.length());
												} else if (local1699.startsWith(Static138.aString119)) {
													local7764 = 1;
													local348 = local348.substring(Static138.aString119.length());
												} else if (local1699.startsWith(Static74.aString76)) {
													local7764 = 2;
													local348 = local348.substring(Static74.aString76.length());
												} else if (local1699.startsWith(Static45.aString53)) {
													local7764 = 3;
													local348 = local348.substring(Static45.aString53.length());
												} else if (local1699.startsWith(Static287.aString223)) {
													local7764 = 4;
													local348 = local348.substring(Static287.aString223.length());
												} else if (local1699.startsWith(Static241.aString189)) {
													local7764 = 5;
													local348 = local348.substring(Static241.aString189.length());
												} else if (local1699.startsWith(Static155.aString143)) {
													local7764 = 6;
													local348 = local348.substring(Static155.aString143.length());
												} else if (local1699.startsWith(Static287.aString224)) {
													local7764 = 7;
													local348 = local348.substring(Static287.aString224.length());
												} else if (local1699.startsWith(Static152.aString133)) {
													local7764 = 8;
													local348 = local348.substring(Static152.aString133.length());
												} else if (local1699.startsWith(Static351.aString274)) {
													local7764 = 9;
													local348 = local348.substring(Static351.aString274.length());
												} else if (local1699.startsWith(Static160.aString272)) {
													local7764 = 10;
													local348 = local348.substring(Static160.aString272.length());
												} else if (local1699.startsWith(Static170.aString152)) {
													local7764 = 11;
													local348 = local348.substring(Static170.aString152.length());
												} else if (Static60.anInt6011 != 0) {
													if (local1699.startsWith(Static32.aString264)) {
														local7764 = 0;
														local348 = local348.substring(Static32.aString264.length());
													} else if (local1699.startsWith(Static30.aString144)) {
														local7764 = 1;
														local348 = local348.substring(Static30.aString144.length());
													} else if (local1699.startsWith(Static277.aString219)) {
														local7764 = 2;
														local348 = local348.substring(Static277.aString219.length());
													} else if (local1699.startsWith(Static141.aString122)) {
														local7764 = 3;
														local348 = local348.substring(Static141.aString122.length());
													} else if (local1699.startsWith(Static350.aString271)) {
														local7764 = 4;
														local348 = local348.substring(Static350.aString271.length());
													} else if (local1699.startsWith(Static97.aString93)) {
														local7764 = 5;
														local348 = local348.substring(Static97.aString93.length());
													} else if (local1699.startsWith(Static57.aString206)) {
														local7764 = 6;
														local348 = local348.substring(Static57.aString206.length());
													} else if (local1699.startsWith(Static115.aString106)) {
														local7764 = 7;
														local348 = local348.substring(Static115.aString106.length());
													} else if (local1699.startsWith(Static153.aString140)) {
														local7764 = 8;
														local348 = local348.substring(Static153.aString140.length());
													} else if (local1699.startsWith(Static78.aString80)) {
														local7764 = 9;
														local348 = local348.substring(Static78.aString80.length());
													} else if (local1699.startsWith(Static104.aString95)) {
														local7764 = 10;
														local348 = local348.substring(Static104.aString95.length());
													} else if (local1699.startsWith(Static17.aString23)) {
														local7764 = 11;
														local348 = local348.substring(Static17.aString23.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8058) byte local8058 = 0;
												if (local1699.startsWith(Static355.aString155)) {
													local8058 = 1;
													local348 = local348.substring(Static355.aString155.length());
												} else if (local1699.startsWith(Static256.aString201)) {
													local8058 = 2;
													local348 = local348.substring(Static256.aString201.length());
												} else if (local1699.startsWith(Static257.aString203)) {
													local8058 = 3;
													local348 = local348.substring(Static257.aString203.length());
												} else if (local1699.startsWith(Static143.aString125)) {
													local8058 = 4;
													local348 = local348.substring(Static143.aString125.length());
												} else if (local1699.startsWith(Static25.aString35)) {
													local8058 = 5;
													local348 = local348.substring(Static25.aString35.length());
												} else if (Static60.anInt6011 != 0) {
													if (local1699.startsWith(Static271.aString207)) {
														local8058 = 1;
														local348 = local348.substring(Static271.aString207.length());
													} else if (local1699.startsWith(Static162.aString146)) {
														local8058 = 2;
														local348 = local348.substring(Static162.aString146.length());
													} else if (local1699.startsWith(Static250.aString194)) {
														local8058 = 3;
														local348 = local348.substring(Static250.aString194.length());
													} else if (local1699.startsWith(Static172.aString254)) {
														local8058 = 4;
														local348 = local348.substring(Static172.aString254.length());
													} else if (local1699.startsWith(Static248.aString190)) {
														local8058 = 5;
														local348 = local348.substring(Static248.aString190.length());
													}
												}
												Static150.aClass1_Sub16_Sub2_2.method5793(182);
												Static150.aClass1_Sub16_Sub2_2.method5771(0);
												local410 = Static150.aClass1_Sub16_Sub2_2.anInt6813;
												Static150.aClass1_Sub16_Sub2_2.method5771(local7764);
												Static150.aClass1_Sub16_Sub2_2.method5771(local8058);
												Static156.method3341(Static150.aClass1_Sub16_Sub2_2, local348);
												Static150.aClass1_Sub16_Sub2_2.method5733(Static150.aClass1_Sub16_Sub2_2.anInt6813 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray35[local3];
												local1699 = aStringArray35[local3 + 1];
												if (Static87.anInt2332 != 0 || (!Static166.aBoolean286 || Static93.aBoolean158) && !Static221.aBoolean352) {
													Static150.aClass1_Sub16_Sub2_2.method5793(123);
													Static150.aClass1_Sub16_Sub2_2.method5771(0);
													local740 = Static150.aClass1_Sub16_Sub2_2.anInt6813;
													Static150.aClass1_Sub16_Sub2_2.method5726(local348);
													Static156.method3341(Static150.aClass1_Sub16_Sub2_2, local1699);
													Static150.aClass1_Sub16_Sub2_2.method5733(Static150.aClass1_Sub16_Sub2_2.anInt6813 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray419[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static89.aStringArray15[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray35[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray419[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static174.aStringArray26[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray35[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray419[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static104.anIntArray168[local536];
												}
												anIntArray419[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static264.aClass7_Sub1_Sub1_Sub2_2 == null || Static264.aClass7_Sub1_Sub1_Sub2_2.aString267 == null) {
													local348 = Static96.aString91;
												} else {
													local348 = Static264.aClass7_Sub1_Sub1_Sub2_2.method5993();
												}
												aStringArray35[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray419[local1++] = Static20.anInt709;
												continue;
											}
											if (local31 == 5017) {
												anIntArray419[local1++] = Static92.anInt2419;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray419[local1];
												local541 = 0;
												if (local536 < 100 && Static236.aStringArray31[local536] != null) {
													local541 = Static122.anIntArray225[local536];
												}
												anIntArray419[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray419[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static255.aStringArray33[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray35[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static264.aClass7_Sub1_Sub1_Sub2_2 == null || Static264.aClass7_Sub1_Sub1_Sub2_2.aString267 == null) {
													local348 = Static96.aString91;
												} else {
													local348 = Static264.aClass7_Sub1_Sub1_Sub2_2.method5991();
												}
												aStringArray35[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray419[local1];
												aStringArray35[local3++] = Static222.method4319(local536).aString88;
												continue;
											}
											@Pc(8492) Class1_Sub1_Sub8 local8492;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray419[local1];
												local8492 = Static222.method4319(local536);
												if (local8492.anIntArray148 == null) {
													anIntArray419[local1++] = 0;
												} else {
													anIntArray419[local1++] = local8492.anIntArray148.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												@Pc(8527) Class1_Sub1_Sub8 local8527 = Static222.method4319(local536);
												local391 = local8527.anIntArray148[local541];
												anIntArray419[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray419[local1];
												local8492 = Static222.method4319(local536);
												if (local8492.anIntArray149 == null) {
													anIntArray419[local1++] = 0;
												} else {
													anIntArray419[local1++] = local8492.anIntArray149.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												anIntArray419[local1++] = Static222.method4319(local536).anIntArray149[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray419[local1];
												aStringArray35[local3++] = Static17.method457(local536).method2693();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray419[local1];
												@Pc(8622) Class1_Sub1_Sub12 local8622 = Static17.method457(local536);
												if (local8622.anIntArray233 == null) {
													anIntArray419[local1++] = 0;
												} else {
													anIntArray419[local1++] = local8622.anIntArray233.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												anIntArray419[local1++] = Static17.method457(local536).anIntArray233[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass123_1 = new Class123();
												local1--;
												aClass123_1.anInt4141 = anIntArray419[local1];
												aClass123_1.aClass1_Sub1_Sub12_1 = Static17.method457(aClass123_1.anInt4141);
												aClass123_1.anIntArray291 = new int[aClass123_1.aClass1_Sub1_Sub12_1.method2685()];
												continue;
											}
											if (local31 == 5059) {
												Static150.aClass1_Sub16_Sub2_2.method5793(68);
												Static150.aClass1_Sub16_Sub2_2.method5771(0);
												local536 = Static150.aClass1_Sub16_Sub2_2.anInt6813;
												Static150.aClass1_Sub16_Sub2_2.method5771(0);
												Static150.aClass1_Sub16_Sub2_2.method5757(aClass123_1.anInt4141);
												aClass123_1.aClass1_Sub1_Sub12_1.method2691(aClass123_1.anIntArray291, Static150.aClass1_Sub16_Sub2_2);
												Static150.aClass1_Sub16_Sub2_2.method5733(Static150.aClass1_Sub16_Sub2_2.anInt6813 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray35[local3];
												Static150.aClass1_Sub16_Sub2_2.method5793(62);
												Static150.aClass1_Sub16_Sub2_2.method5771(0);
												local541 = Static150.aClass1_Sub16_Sub2_2.anInt6813;
												Static150.aClass1_Sub16_Sub2_2.method5726(local348);
												Static150.aClass1_Sub16_Sub2_2.method5757(aClass123_1.anInt4141);
												aClass123_1.aClass1_Sub1_Sub12_1.method2691(aClass123_1.anIntArray291, Static150.aClass1_Sub16_Sub2_2);
												Static150.aClass1_Sub16_Sub2_2.method5733(Static150.aClass1_Sub16_Sub2_2.anInt6813 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static150.aClass1_Sub16_Sub2_2.method5793(68);
												Static150.aClass1_Sub16_Sub2_2.method5771(0);
												local536 = Static150.aClass1_Sub16_Sub2_2.anInt6813;
												Static150.aClass1_Sub16_Sub2_2.method5771(1);
												Static150.aClass1_Sub16_Sub2_2.method5757(aClass123_1.anInt4141);
												aClass123_1.aClass1_Sub1_Sub12_1.method2691(aClass123_1.anIntArray291, Static150.aClass1_Sub16_Sub2_2);
												Static150.aClass1_Sub16_Sub2_2.method5733(Static150.aClass1_Sub16_Sub2_2.anInt6813 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												anIntArray419[local1++] = Static222.method4319(local536).aCharArray9[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												anIntArray419[local1++] = Static222.method4319(local536).aCharArray8[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												if (local541 == -1) {
													anIntArray419[local1++] = -1;
												} else {
													anIntArray419[local1++] = Static222.method4319(local536).method1974((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												if (local541 == -1) {
													anIntArray419[local1++] = -1;
												} else {
													anIntArray419[local1++] = Static222.method4319(local536).method1971((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray419[local1];
												anIntArray419[local1++] = Static17.method457(local536).method2685();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local740 = Static17.method457(local536).method2687(local541);
												anIntArray419[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												aClass123_1.anIntArray291[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												aClass123_1.anIntArray291[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray419[local1];
												local541 = anIntArray419[local1 + 1];
												local740 = anIntArray419[local1 + 2];
												@Pc(9051) Class1_Sub1_Sub12 local9051 = Static17.method457(local536);
												if (local9051.method2687(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray419[local1++] = local9051.method2686(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray35[local3];
												local1--;
												local1266 = anIntArray419[local1] == 1;
												Static80.method1829(local1266, local348);
												anIntArray419[local1++] = Static194.anInt4478;
												continue;
											}
											if (local31 == 5072) {
												if (Static220.aShortArray89 != null && Static139.anInt3448 < Static194.anInt4478) {
													anIntArray419[local1++] = Static220.aShortArray89[Static139.anInt3448++] & 0xFFFF;
													continue;
												}
												anIntArray419[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static139.anInt3448 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static345.aBooleanArray30[86]) {
													anIntArray419[local1++] = 1;
												} else {
													anIntArray419[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static345.aBooleanArray30[82]) {
													anIntArray419[local1++] = 1;
												} else {
													anIntArray419[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static345.aBooleanArray30[81]) {
													anIntArray419[local1++] = 1;
												} else {
													anIntArray419[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9571) boolean local9571;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static244.method2182(anIntArray419[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray419[local1++] = Static304.method5338();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static309.method5433(-1, false, -1, anIntArray419[local1]);
													continue;
												}
												@Pc(9247) Class1_Sub1_Sub3 local9247;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray419[local1];
													local9247 = Static201.method3689(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9247 == null) {
														anIntArray419[local1++] = -1;
													} else {
														anIntArray419[local1++] = local9247.anInt580;
													}
													continue;
												}
												@Pc(9271) Class1_Sub1_Sub3 local9271;
												if (local31 == 5207) {
													local1--;
													local9271 = Static201.method3694(anIntArray419[local1]);
													if (local9271 != null && local9271.aString19 != null) {
														aStringArray35[local3++] = local9271.aString19;
														continue;
													}
													aStringArray35[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray419[local1++] = Static298.anInt6269;
													anIntArray419[local1++] = Static16.anInt641;
													continue;
												}
												if (local31 == 5209) {
													anIntArray419[local1++] = Static286.anInt6050 + Static201.anInt4281;
													anIntArray419[local1++] = Static311.anInt5198 + Static201.anInt4283;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray419[local1];
													local9247 = Static201.method3694(local536);
													if (local9247 == null) {
														anIntArray419[local1++] = 0;
														anIntArray419[local1++] = 0;
													} else {
														anIntArray419[local1++] = local9247.anInt589 >> 14 & 0x3FFF;
														anIntArray419[local1++] = local9247.anInt589 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray419[local1];
													local9247 = Static201.method3694(local536);
													if (local9247 == null) {
														anIntArray419[local1++] = 0;
														anIntArray419[local1++] = 0;
													} else {
														anIntArray419[local1++] = local9247.anInt590 - local9247.anInt583;
														anIntArray419[local1++] = local9247.anInt577 - local9247.anInt584;
													}
													continue;
												}
												@Pc(9413) Class1_Sub21 local9413;
												if (local31 == 5212) {
													local9413 = Static347.method5868();
													if (local9413 == null) {
														anIntArray419[local1++] = -1;
														anIntArray419[local1++] = -1;
													} else {
														anIntArray419[local1++] = local9413.anInt4155;
														local541 = local9413.anInt4159 << 28 | local9413.anInt4150 + Static201.anInt4281 << 14 | local9413.anInt4154 + Static201.anInt4283;
														anIntArray419[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9413 = Static197.method3897();
													if (local9413 == null) {
														anIntArray419[local1++] = -1;
														anIntArray419[local1++] = -1;
													} else {
														anIntArray419[local1++] = local9413.anInt4155;
														local541 = local9413.anInt4159 << 28 | local9413.anInt4150 + Static201.anInt4281 << 14 | local9413.anInt4154 + Static201.anInt4283;
														anIntArray419[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray419[local1];
													local9247 = Static183.method3711();
													if (local9247 != null) {
														local6900 = local9247.method412(local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF, anIntArray421);
														if (local6900) {
															Static91.method1995(anIntArray421[1], anIntArray421[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray419[local1];
													local541 = anIntArray419[local1 + 1];
													@Pc(9569) Class179 local9569 = Static201.method3675(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9571 = false;
													for (@Pc(9576) Class1_Sub1_Sub3 local9576 = (Class1_Sub1_Sub3) local9569.method4935(); local9576 != null; local9576 = (Class1_Sub1_Sub3) local9569.method4932()) {
														if (local9576.anInt580 == local541) {
															local9571 = true;
															break;
														}
													}
													if (local9571) {
														anIntArray419[local1++] = 1;
													} else {
														anIntArray419[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray419[local1];
													local9247 = Static201.method3694(local536);
													if (local9247 == null) {
														anIntArray419[local1++] = -1;
													} else {
														anIntArray419[local1++] = local9247.anInt592;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray419[local1++] = Static335.anInt6981 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray419[local1];
													Static91.method1995(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9271 = Static183.method3711();
													if (local9271 == null) {
														anIntArray419[local1++] = -1;
														anIntArray419[local1++] = -1;
													} else {
														local1266 = local9271.method418(Static286.anInt6050 + Static201.anInt4281, anIntArray421, Static311.anInt5198 + Static201.anInt4283);
														if (local1266) {
															anIntArray419[local1++] = anIntArray421[1];
															anIntArray419[local1++] = anIntArray421[2];
														} else {
															anIntArray419[local1++] = -1;
															anIntArray419[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray419[local1];
													local541 = anIntArray419[local1 + 1];
													Static309.method5433(local541 & 0x3FFF, false, local541 >> 14 & 0x3FFF, local536);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray419[local1];
													local9247 = Static183.method3711();
													if (local9247 == null) {
														anIntArray419[local1++] = -1;
														anIntArray419[local1++] = -1;
													} else {
														local6900 = local9247.method412(local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF, anIntArray421);
														if (local6900) {
															anIntArray419[local1++] = anIntArray421[1];
															anIntArray419[local1++] = anIntArray421[2];
														} else {
															anIntArray419[local1++] = -1;
															anIntArray419[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray419[local1];
													local9247 = Static183.method3711();
													if (local9247 == null) {
														anIntArray419[local1++] = -1;
														anIntArray419[local1++] = -1;
													} else {
														local6900 = local9247.method418(local536 >> 14 & 0x3FFF, anIntArray421, local536 & 0x3FFF);
														if (local6900) {
															anIntArray419[local1++] = anIntArray421[1];
															anIntArray419[local1++] = anIntArray421[2];
														} else {
															anIntArray419[local1++] = -1;
															anIntArray419[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static233.method4439(anIntArray419[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray419[local1];
													local541 = anIntArray419[local1 + 1];
													Static309.method5433(local541 & 0x3FFF, true, local541 >> 14 & 0x3FFF, local536);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static218.aBoolean341 = anIntArray419[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray419[local1++] = Static218.aBoolean341 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray419[local1];
													Static123.method2642(local536);
													continue;
												}
												@Pc(9987) Class1 local9987;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray419[local1];
													local1266 = anIntArray419[local1 + 1] == 1;
													if (Static10.aClass183_2 == null) {
														continue;
													}
													local9987 = Static10.aClass183_2.method5053((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method6172();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class1();
														Static10.aClass183_2.method5055((long) local536, local9987);
													}
													continue;
												}
												@Pc(10026) Class1 local10026;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray419[local1];
													if (Static10.aClass183_2 == null) {
														anIntArray419[local1++] = 0;
													} else {
														local10026 = Static10.aClass183_2.method5053((long) local536);
														anIntArray419[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray419[local1];
													local1266 = anIntArray419[local1 + 1] == 1;
													if (Static4.aClass183_1 == null) {
														continue;
													}
													local9987 = Static4.aClass183_1.method5053((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method6172();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class1();
														Static4.aClass183_1.method5055((long) local536, local9987);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray419[local1];
													if (Static4.aClass183_1 == null) {
														anIntArray419[local1++] = 0;
													} else {
														local10026 = Static4.aClass183_1.method5053((long) local536);
														anIntArray419[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray419[local1++] = Static201.aClass1_Sub1_Sub3_2 == null ? -1 : Static201.aClass1_Sub1_Sub3_2.anInt580;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray419[local1];
													local541 = anIntArray419[local1 + 1];
													Static238.method4510(3, local536, local541, false);
													anIntArray419[local1++] = Static112.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static112.aFrame1 != null) {
														Static238.method4510(Static146.anInt3619, -1, -1, false);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10189) Class47[] local10189 = Static47.method1321();
													anIntArray419[local1++] = local10189.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray419[local1];
													@Pc(10207) Class47[] local10207 = Static47.method1321();
													anIntArray419[local1++] = local10207[local536].anInt1566;
													anIntArray419[local1++] = local10207[local536].anInt1569;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static144.anInt3575;
													local541 = Static17.anInt652;
													local740 = -1;
													@Pc(10236) Class47[] local10236 = Static47.method1321();
													for (local410 = 0; local410 < local10236.length; local410++) {
														@Pc(10243) Class47 local10243 = local10236[local410];
														if (local10243.anInt1566 == local536 && local10243.anInt1569 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray419[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray419[local1++] = Static164.method3437();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray419[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static238.method4510(local536, -1, -1, false);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray419[local1++] = Static146.anInt3619;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray419[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static146.anInt3619 = local536;
														Static263.method4776(Static184.aClass199_12);
													}
													continue;
												}
											} else {
												@Pc(10698) String local10698;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray35[local3];
														local1699 = aStringArray35[local3 + 1];
														local1--;
														local740 = anIntArray419[local1];
														Static150.aClass1_Sub16_Sub2_2.method5793(228);
														Static150.aClass1_Sub16_Sub2_2.method5771(Static279.method4951(local348) + Static279.method4951(local1699) + 1);
														Static150.aClass1_Sub16_Sub2_2.method5726(local348);
														Static150.aClass1_Sub16_Sub2_2.method5726(local1699);
														Static150.aClass1_Sub16_Sub2_2.method5771(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static253.aShortArray91[anIntArray419[local1]] = (short) Static295.method5220(anIntArray419[local1 + 1]);
														Static309.method5427();
														Static145.method3187();
														Static275.method2311();
														Static172.method5653();
														Static102.method2127();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static89.anIntArrayArrayArray1[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1] << 1;
														local740 = anIntArray419[local1 + 2];
														local391 = anIntArray419[local1 + 3];
														local410 = anIntArray419[local1 + 4];
														local771 = anIntArray419[local1 + 5];
														@Pc(10484) int local10484 = anIntArray419[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static89.anIntArrayArrayArray1[local536] != null && local541 >= 0 && local541 < Static89.anIntArrayArrayArray1[local536].length) {
															Static89.anIntArrayArrayArray1[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10484 };
															Static89.anIntArrayArrayArray1[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static89.anIntArrayArrayArray1[anIntArray419[local1]].length >> 1;
														anIntArray419[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static112.aFrame1 != null) {
															Static238.method4510(Static146.anInt3619, -1, -1, false);
														}
														if (Static252.aFrame2 == null) {
															local348 = Static257.aString202 == null ? Static25.method626() : Static257.aString202;
															Static268.method4826(local348, Static130.anInt6754 == 1, Static184.aClass199_12, false);
														} else {
															Static329.method5714();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static221.aClass145_7 != null) {
															if (Static221.aClass145_7.anObject6 == null) {
																local348 = Static321.method5629(Static221.aClass145_7.anInt5066);
															} else {
																local348 = (String) Static221.aClass145_7.anObject6;
															}
														}
														aStringArray35[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray419[local1++] = Static313.anInt6481 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static112.aFrame1 != null) {
															Static238.method4510(Static146.anInt3619, -1, -1, false);
														}
														local3--;
														local348 = aStringArray35[local3];
														local1--;
														local1266 = anIntArray419[local1] == 1;
														local10698 = Static25.method626() + local348;
														Static268.method4826(local10698, Static130.anInt6754 == 1, Static184.aClass199_12, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray35[local3];
														local1699 = aStringArray35[local3 + 1];
														local1--;
														local740 = anIntArray419[local1];
														if (local348.length() > 0) {
															if (Static248.aStringArray32 == null) {
																Static248.aStringArray32 = new String[Static27.anIntArray57[Static199.anInt4559]];
															}
															Static248.aStringArray32[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static276.aStringArray39 == null) {
																Static276.aStringArray39 = new String[Static27.anIntArray57[Static199.anInt4559]];
															}
															Static276.aStringArray39[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray35[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static342.anInt7209 = anIntArray419[local1];
														Static259.anInt4931 = anIntArray419[local1 + 1];
														Static230.anInt5133 = anIntArray419[local1 + 2];
														Static75.anInt2064 = anIntArray419[local1 + 3];
														Static315.anInt6515 = anIntArray419[local1 + 4];
														Static335.anInt6984 = anIntArray419[local1 + 5];
														Static210.anInt4839 = anIntArray419[local1 + 6];
														Static264.anInt5617 = anIntArray419[local1 + 7];
														Static36.anInt1094 = anIntArray419[local1 + 8];
														Static290.anInt6083 = anIntArray419[local1 + 9];
														Static26.anInt889 = anIntArray419[local1 + 10];
														Static203.aClass162_47.method4615(Static315.anInt6515);
														Static203.aClass162_47.method4615(Static335.anInt6984);
														Static203.aClass162_47.method4615(Static210.anInt4839);
														Static203.aClass162_47.method4615(Static264.anInt5617);
														Static203.aClass162_47.method4615(Static36.anInt1094);
														Static23.aClass29_4 = null;
														Static90.aClass29_9 = null;
														Static56.aClass29_8 = null;
														Static57.aClass29_17 = null;
														Static124.aClass29_10 = null;
														Static344.aClass29_24 = null;
														Static321.aClass29_22 = null;
														Static188.aClass29_7 = null;
														Static236.aBoolean367 = true;
														continue;
													}
													if (local31 == 5425) {
														Static84.method1870();
														Static236.aBoolean367 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static77.anInt2093 = anIntArray419[local1];
														Static183.anInt4318 = anIntArray419[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static350.anInt7317 = anIntArray419[local1];
														Static192.anInt4458 = anIntArray419[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														anIntArray419[local1++] = Static162.method3413(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static256.method4726(false, aStringArray35[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														local391 = anIntArray419[local1 + 3];
														Static321.method5631(false, local740, local541, (local536 >> 14 & 0x3FFF) - Static149.anInt3667, local391, (local536 & 0x3FFF) - Static96.anInt2446);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														local391 = anIntArray419[local1 + 3];
														Static166.method3461((local536 & 0x3FFF) - Static96.anInt2446, local541, local391, (local536 >> 14 & 0x3FFF) - Static149.anInt3667, local740);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray419[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static94.anInt2428 = local536;
														local541 = anIntArray419[local1 + 1];
														if (local541 + 1 >= Static89.anIntArrayArrayArray1[Static94.anInt2428].length >> 1) {
															throw new RuntimeException();
														}
														Static159.anInt4621 = local541;
														Static283.anInt5980 = 0;
														Static100.anInt4628 = anIntArray419[local1 + 2];
														Static105.anInt2619 = anIntArray419[local1 + 3];
														local740 = anIntArray419[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static168.anInt4073 = local740;
														local391 = anIntArray419[local1 + 5];
														if (local391 + 1 >= Static89.anIntArrayArrayArray1[Static168.anInt4073].length >> 1) {
															throw new RuntimeException();
														}
														Static189.anInt4387 = local391;
														Static303.anInt6342 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static298.method5250();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static354.method6174(anIntArray419[local1], anIntArray419[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray419[local1++] = (int) Static189.aFloat55 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray419[local1++] = (int) Static188.aFloat17 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static353.method6160();
														continue;
													}
													if (local31 == 5508) {
														Static144.method3168();
														continue;
													}
													if (local31 == 5509) {
														Static112.method2381();
														continue;
													}
													if (local31 == 5510) {
														Static44.method714();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray419[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static149.anInt3667;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static25.anInt850) {
															local541 = Static25.anInt850;
														}
														local740 -= Static96.anInt2446;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static219.anInt4987) {
															local740 = Static219.anInt4987;
														}
														Static327.anInt6692 = local541 * 128 + 64;
														Static72.anInt1985 = local740 * 128 + 64;
														Static303.anInt6342 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static326.method5660();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray35[local3];
														local1699 = aStringArray35[local3 + 1];
														local1--;
														local740 = anIntArray419[local1];
														if (Static214.anInt4865 == 10 && Static222.anInt5043 == 0 && Static118.anInt3015 == 0 && Static277.anInt5863 == 0 && Static97.anInt2479 == 0) {
															Static286.method5111(local1699, local740, local348);
														}
														continue;
													}
													if (local31 == 5601) {
														Static271.method4868();
														continue;
													}
													if (local31 == 5602) {
														if (Static118.anInt3015 == 0) {
															Static6.anInt211 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static214.anInt4865 == 10 && Static222.anInt5043 == 0 && Static118.anInt3015 == 0 && Static277.anInt5863 == 0 && Static97.anInt2479 == 0) {
															Static179.method3630(anIntArray419[local1 + 3], anIntArray419[local1], anIntArray419[local1 + 2], anIntArray419[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static214.anInt4865 == 10 && Static222.anInt5043 == 0 && Static118.anInt3015 == 0 && Static277.anInt5863 == 0 && Static97.anInt2479 == 0) {
															Static137.method3043(Static274.method4904(aStringArray35[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static214.anInt4865 == 10 && Static222.anInt5043 == 0 && Static118.anInt3015 == 0 && Static277.anInt5863 == 0 && Static97.anInt2479 == 0) {
															Static223.method4329(aStringArray35[local3 + 2], anIntArray419[local1 + 2], aStringArray35[local3 + 1], Static274.method4904(aStringArray35[local3]), anIntArray419[local1 + 1], anIntArray419[local1 + 3], anIntArray419[local1 + 5] == 1, anIntArray419[local1], anIntArray419[local1 + 6] == 1, anIntArray419[local1 + 4] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static277.anInt5863 == 0) {
															Static152.anInt3743 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray419[local1++] = Static6.anInt211;
														continue;
													}
													if (local31 == 5608) {
														anIntArray419[local1++] = Static6.anInt219;
														continue;
													}
													if (local31 == 5609) {
														anIntArray419[local1++] = Static152.anInt3743;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray35[local3++] = Static41.aStringArray10.length > local536 ? Static30.method3365(Static41.aStringArray10[local536]) : "";
														}
														Static41.aStringArray10 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray419[local1++] = Static207.anInt4792;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static216.anInt4909 = local536;
														Static139.method3060();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static211.method2798(anIntArray419[local1] == 1);
														Static168.method3494();
														Static139.method3060();
														Static316.method5517();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static146.aBoolean257 = anIntArray419[local1] == 1;
														Static316.method5517();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static218.aBoolean342 = anIntArray419[local1] == 1;
														Static139.method3060();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static289.aBoolean360 = anIntArray419[local1] == 1;
														Static221.aClass40_6.method2715(!Static289.aBoolean360);
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static271.anInt5700 = anIntArray419[local1];
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static288.aBoolean423 = anIntArray419[local1] == 1;
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static166.aBoolean285 = anIntArray419[local1] == 1;
														Static139.method3060();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static190.aBoolean378 = anIntArray419[local1] == 1;
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static102.anInt2545 = local536;
														Static139.method3060();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static265.aBoolean396 = anIntArray419[local1] == 1;
														Static239.method4516();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static307.aBoolean465 = anIntArray419[local1] == 1;
														Static139.method3060();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static200.aBoolean321 = anIntArray419[local1] == 1;
														Static139.method3060();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static355.anInt4211 = local536;
														Static89.method1973();
														Static263.method4776(Static184.aClass199_12);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static90.aBoolean156 = anIntArray419[local1] == 1;
														Static315.method5516();
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static84.anInt2246 = local536;
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static340.anInt7187) {
															if (Static340.anInt7187 == 0 && Static67.anInt204 != -1) {
																Static179.method3629(Static67.anInt204, local536, Static250.aClass162_193);
																Static46.aBoolean484 = false;
															} else if (local536 == 0) {
																Static59.method5605();
																Static46.aBoolean484 = false;
															} else {
																Static15.method450(local536);
															}
															Static340.anInt7187 = local536;
														}
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static183.anInt4317 = local536;
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static96.aBoolean159 = anIntArray419[local1] == 1;
														Static316.method5517();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray419[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static207.anInt4798 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static346.method6111(local536);
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														anIntArray419[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static74.anInt2054 = local536;
														Static263.method4776(Static184.aClass199_12);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static226.anInt5071 = local536;
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static59.method5599(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static52.aBoolean106 = anIntArray419[local1] != 0;
														Static263.method4776(Static184.aClass199_12);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static271.anInt5700 = anIntArray419[local1];
														Static263.method4776(Static184.aClass199_12);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static122.aBoolean202 = anIntArray419[local1] != 0;
														Static263.method4776(Static184.aClass199_12);
														Static139.method3060();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static338.method6024(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray419[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static4.anInt207 = local536;
														Static263.method4776(Static184.aClass199_12);
														Static329.aBoolean490 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray419[local1++] = Static216.anInt4909;
														continue;
													}
													if (local31 == 6102) {
														anIntArray419[local1++] = Static13.method5497() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray419[local1++] = Static146.aBoolean257 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray419[local1++] = Static218.aBoolean342 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray419[local1++] = Static289.aBoolean360 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray419[local1++] = Static271.anInt5700;
														continue;
													}
													if (local31 == 6108) {
														anIntArray419[local1++] = Static288.aBoolean423 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray419[local1++] = Static166.aBoolean285 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray419[local1++] = Static190.aBoolean378 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray419[local1++] = Static102.anInt2545;
														continue;
													}
													if (local31 == 6112) {
														anIntArray419[local1++] = Static265.aBoolean396 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray419[local1++] = Static307.aBoolean465 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray419[local1++] = Static200.aBoolean321 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray419[local1++] = Static355.anInt4211;
														continue;
													}
													if (local31 == 6117) {
														anIntArray419[local1++] = Static90.aBoolean156 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray419[local1++] = Static84.anInt2246;
														continue;
													}
													if (local31 == 6119) {
														anIntArray419[local1++] = Static340.anInt7187;
														continue;
													}
													if (local31 == 6120) {
														anIntArray419[local1++] = Static183.anInt4317;
														continue;
													}
													if (local31 == 6121) {
														anIntArray419[local1++] = Static221.aClass40_6.method2789() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray419[local1++] = Static293.method5173();
														continue;
													}
													if (local31 == 6124) {
														anIntArray419[local1++] = Static74.anInt2054;
														continue;
													}
													if (local31 == 6125) {
														anIntArray419[local1++] = Static226.anInt5071;
														continue;
													}
													if (local31 == 6126) {
														anIntArray419[local1++] = Static221.aClass40_6.method2757() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray419[local1++] = Static280.aBoolean419 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray419[local1++] = Static52.aBoolean106 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray419[local1++] = Static271.anInt5700;
														continue;
													}
													if (local31 == 6130) {
														anIntArray419[local1++] = Static122.aBoolean202 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray419[local1++] = Static130.anInt6754;
														continue;
													}
													if (local31 == 6132) {
														anIntArray419[local1++] = Static4.anInt207;
														continue;
													}
													if (local31 == 6133) {
														anIntArray419[local1++] = Static313.anInt6481 == 1 || Static313.anInt6481 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static142.aShort50 = (short) anIntArray419[local1];
														if (Static142.aShort50 <= 0) {
															Static142.aShort50 = 256;
														}
														Static95.aShort37 = (short) anIntArray419[local1 + 1];
														if (Static95.aShort37 <= 0) {
															Static95.aShort37 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static80.aShort28 = (short) anIntArray419[local1];
														if (Static80.aShort28 <= 0) {
															Static80.aShort28 = 256;
														}
														Static321.aShort88 = (short) anIntArray419[local1 + 1];
														if (Static321.aShort88 <= 0) {
															Static321.aShort88 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static117.aShort49 = (short) anIntArray419[local1];
														if (Static117.aShort49 <= 0) {
															Static117.aShort49 = 1;
														}
														Static29.aShort79 = (short) anIntArray419[local1 + 1];
														if (Static29.aShort79 <= 0) {
															Static29.aShort79 = 32767;
														} else if (Static29.aShort79 < Static117.aShort49) {
															Static29.aShort79 = Static117.aShort49;
														}
														Static15.aShort14 = (short) anIntArray419[local1 + 2];
														if (Static15.aShort14 <= 0) {
															Static15.aShort14 = 1;
														}
														Static145.aShort55 = (short) anIntArray419[local1 + 3];
														if (Static145.aShort55 <= 0) {
															Static145.aShort55 = 32767;
														} else if (Static145.aShort55 < Static15.aShort14) {
															Static145.aShort55 = Static15.aShort14;
														}
														continue;
													}
													if (local31 == 6203) {
														Static110.method2669(Static206.aClass177_14.anInt5816, Static206.aClass177_14.anInt5803, 0, false, 0);
														anIntArray419[local1++] = Static108.anInt2686;
														anIntArray419[local1++] = Static292.anInt6121;
														continue;
													}
													if (local31 == 6204) {
														anIntArray419[local1++] = Static80.aShort28;
														anIntArray419[local1++] = Static321.aShort88;
														continue;
													}
													if (local31 == 6205) {
														anIntArray419[local1++] = Static142.aShort50;
														anIntArray419[local1++] = Static95.aShort37;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray419[local1++] = (int) (Static325.method5658() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray419[local1++] = (int) (Static325.method5658() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														aCalendar2.clear();
														aCalendar2.set(11, 12);
														aCalendar2.set(local740, local541, local536);
														anIntArray419[local1++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(Static325.method5658()));
														anIntArray419[local1++] = aCalendar2.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray419[local1];
														local1266 = true;
														if (local536 < 0) {
															local1266 = (local536 + 1) % 4 == 0;
														} else if (local536 < 1582) {
															local1266 = local536 % 4 == 0;
														} else if (local536 % 4 != 0) {
															local1266 = false;
														} else if (local536 % 100 != 0) {
															local1266 = true;
														} else if (local536 % 400 != 0) {
															local1266 = false;
														}
														anIntArray419[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray419[local1++] = Static296.method5227() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray419[local1++] = Static98.method916() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static214.anInt4865 == 10 && Static222.anInt5043 == 0 && Static118.anInt3015 == 0 && Static277.anInt5863 == 0) {
															anIntArray419[local1++] = Static311.method4432() == -1 ? 0 : 1;
															continue;
														}
														anIntArray419[local1++] = 1;
														continue;
													}
													@Pc(12964) Class95 local12964;
													@Pc(12940) Class27_Sub1 local12940;
													if (local31 == 6501) {
														local12940 = Static284.method5098();
														if (local12940 == null) {
															anIntArray419[local1++] = -1;
															anIntArray419[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray419[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray419[local1++] = 0;
															anIntArray419[local1++] = 0;
														} else {
															anIntArray419[local1++] = local12940.anInt936;
															anIntArray419[local1++] = local12940.anInt929;
															aStringArray35[local3++] = local12940.aString43;
															local12964 = local12940.method701();
															anIntArray419[local1++] = local12964.anInt3403;
															aStringArray35[local3++] = local12964.aString118;
															anIntArray419[local1++] = local12940.anInt927;
															anIntArray419[local1++] = local12940.anInt934;
														}
														continue;
													}
													if (local31 == 6502) {
														local12940 = Static318.method5598();
														if (local12940 == null) {
															anIntArray419[local1++] = -1;
															anIntArray419[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray419[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray419[local1++] = 0;
															anIntArray419[local1++] = 0;
														} else {
															anIntArray419[local1++] = local12940.anInt936;
															anIntArray419[local1++] = local12940.anInt929;
															aStringArray35[local3++] = local12940.aString43;
															local12964 = local12940.method701();
															anIntArray419[local1++] = local12964.anInt3403;
															aStringArray35[local3++] = local12964.aString118;
															anIntArray419[local1++] = local12940.anInt927;
															anIntArray419[local1++] = local12940.anInt934;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray419[local1];
														if (Static214.anInt4865 == 10 && Static222.anInt5043 == 0 && Static118.anInt3015 == 0 && Static277.anInt5863 == 0) {
															anIntArray419[local1++] = Static282.method5037(local536) ? 1 : 0;
															continue;
														}
														anIntArray419[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static308.anInt6435 = anIntArray419[local1];
														Static263.method4776(Static184.aClass199_12);
														continue;
													}
													if (local31 == 6505) {
														anIntArray419[local1++] = Static308.anInt6435;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray419[local1];
														@Pc(13184) Class27_Sub1 local13184 = Static94.method2020(local536);
														if (local13184 == null) {
															anIntArray419[local1++] = -1;
															aStringArray35[local3++] = "";
															anIntArray419[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray419[local1++] = 0;
															anIntArray419[local1++] = 0;
														} else {
															anIntArray419[local1++] = local13184.anInt929;
															aStringArray35[local3++] = local13184.aString43;
															@Pc(13202) Class95 local13202 = local13184.method701();
															anIntArray419[local1++] = local13202.anInt3403;
															aStringArray35[local3++] = local13202.aString118;
															anIntArray419[local1++] = local13184.anInt927;
															anIntArray419[local1++] = local13184.anInt934;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray419[local1];
														local1266 = anIntArray419[local1 + 1] == 1;
														local740 = anIntArray419[local1 + 2];
														local9571 = anIntArray419[local1 + 3] == 1;
														Static119.method1991(local9571, local1266, local740, local536);
														continue;
													}
													if (local31 == 6508) {
														Static254.method4680();
														continue;
													}
													if (local31 == 6509) {
														if (Static214.anInt4865 == 10) {
															local1--;
															if (anIntArray419[local1] == 1) {
																if (Static64.aClass170_1 == null) {
																	Static64.aClass170_1 = new Class170();
																}
															} else if (Static64.aClass170_1 != null) {
																Static64.aClass170_1.method4786();
																Static64.aClass170_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static69.aBoolean133 = anIntArray419[local1] == 1;
														Static263.method4776(Static184.aClass199_12);
														continue;
													}
													if (local31 == 6601) {
														anIntArray419[local1++] = Static69.aBoolean133 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static344.anInt7238 == 2) {
													if (local31 == 6700) {
														local536 = Static135.aClass183_33.method5054();
														if (Static295.anInt6177 != -1) {
															local536++;
														}
														anIntArray419[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray419[local1];
														if (Static295.anInt6177 != -1) {
															if (local536 == 0) {
																anIntArray419[local1++] = Static295.anInt6177;
																continue;
															}
															local536--;
														}
														local3526 = (Class1_Sub35) Static135.aClass183_33.method5052();
														while (local536-- > 0) {
															local3526 = (Class1_Sub35) Static135.aClass183_33.method5050();
														}
														anIntArray419[local1++] = local3526.anInt6079;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray419[local1];
														if (Class1_Sub2_Sub10.lb[local536] == null) {
															aStringArray35[local3++] = "";
														} else {
															local1699 = Class1_Sub2_Sub10.lb[local536][0].aString218;
															if (local1699 == null) {
																aStringArray35[local3++] = "";
															} else {
																aStringArray35[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray419[local1];
														if (Class1_Sub2_Sub10.lb[local536] == null) {
															anIntArray419[local1++] = 0;
														} else {
															anIntArray419[local1++] = Class1_Sub2_Sub10.lb[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														if (Class1_Sub2_Sub10.lb[local536] == null) {
															aStringArray35[local3++] = "";
														} else {
															local10698 = Class1_Sub2_Sub10.lb[local536][local541].aString218;
															if (local10698 == null) {
																aStringArray35[local3++] = "";
															} else {
																aStringArray35[local3++] = local10698;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														if (Class1_Sub2_Sub10.lb[local536] == null) {
															anIntArray419[local1++] = 0;
														} else {
															anIntArray419[local1++] = Class1_Sub2_Sub10.lb[local536][local541].anInt5771;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 1, local740);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 2, local740);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 3, local740);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 4, local740);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 5, local740);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 6, local740);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 7, local740);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 8, local740);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 9, local740);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														Static8.method230("", local536 << 16 | local541, 10, local740);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray419[local1];
														local541 = anIntArray419[local1 + 1];
														local740 = anIntArray419[local1 + 2];
														local750 = Static183.method3720(local740, local536 << 16 | local541);
														Static95.method2033();
														@Pc(13929) Class1_Sub39 local13929 = Static37.method930(local750);
														Static307.method5404(local13929.anInt6605, local750.anInt5785, local740, local750.anInt5752, local13929.method5626(), local536 << 16 | local541);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13962) Class107 local13962;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray419[local1];
														local13962 = Static292.method5169(local536);
														if (local13962.aString138 == null) {
															aStringArray35[local3++] = "";
														} else {
															aStringArray35[local3++] = local13962.aString138;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray419[local1];
														local13962 = Static292.method5169(local536);
														anIntArray419[local1++] = local13962.anInt3793;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray419[local1];
														local13962 = Static292.method5169(local536);
														anIntArray419[local1++] = local13962.anInt3783;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray419[local1];
														local13962 = Static292.method5169(local536);
														anIntArray419[local1++] = local13962.anInt3789;
														continue;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14041) Exception local14041) {
			@Pc(14059) StringBuffer local14059;
			if (arg0.aString177 == null) {
				local14059 = new StringBuffer(30);
				local14059.append("CS2: ").append(arg0.aLong235).append(" ");
				for (local536 = anInt5658 - 1; local536 >= 0; local536--) {
					local14059.append("v: ").append(aClass51Array1[local536].aClass1_Sub1_Sub17_1.aLong235).append(" ");
				}
				local14059.append("op: ").append(local13);
				Static58.method1402(local14059.toString(), local14041);
			} else {
				Static293.method5172("Clientscript error in: " + arg0.aString177);
				local14059 = new StringBuffer(30);
				local14059.append("Clientscript error in: ").append(arg0.aString177).append("\n");
				for (local536 = anInt5658 - 1; local536 >= 0; local536--) {
					local14059.append("via: ").append(aClass51Array1[local536].aClass1_Sub1_Sub17_1.aString177).append("\n");
				}
				local14059.append("Op: ").append(local13).append("\n");
				local1699 = local14041.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14059.append("Message: ").append(local1699).append("\n");
				}
				Static58.method1402(local14059.toString(), local14041);
				Static86.method1931(local14059.toString());
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ic;I)V")
	private static void method4824(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub1_Sub17 local12 = Static208.method4121(local8);
		if (local12 == null) {
			return;
		}
		anIntArray418 = new int[local12.anInt5041];
		@Pc(21) int local21 = 0;
		aStringArray34 = new String[local12.anInt5042];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3114;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3117;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass177_9 == null ? -1 : arg0.aClass177_9.anInt5828;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3113;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass177_9 == null ? -1 : arg0.aClass177_9.anInt5776;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass177_10 == null ? -1 : arg0.aClass177_10.anInt5828;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass177_10 == null ? -1 : arg0.aClass177_10.anInt5776;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3122;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3115;
				}
				anIntArray418[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString111;
				}
				aStringArray34[local27++] = local135;
			}
		}
		method4823(local12, arg1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ic;)V")
	public static void method4825(@OriginalArg(0) Class1_Sub15 arg0) {
		method4824(arg0, 200000);
	}
}
