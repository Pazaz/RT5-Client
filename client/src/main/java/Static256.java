import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qn", name = "eb", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!qn", name = "fb", descriptor = "[Lclient!qa;")
	public static Class29[] aClass29Array11;

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString199 = "Loading textures - ";

	@OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
	public static int anInt5542 = -60;

	@OriginalMember(owner = "client!qn", name = "Z", descriptor = "Lclient!we;")
	public static final Class215 aClass215_78 = new Class215(30);

	@OriginalMember(owner = "client!qn", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString200 = "Discard";

	@OriginalMember(owner = "client!qn", name = "cb", descriptor = "Lclient!we;")
	public static final Class215 aClass215_79 = new Class215(5);

	@OriginalMember(owner = "client!qn", name = "db", descriptor = "Ljava/lang/String;")
	public static final String aString201 = "wave2:";

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	public static void method4722() {
		Static294.aClass29Array13 = null;
		Static197.aClass29Array7 = null;
		Static67.aClass29Array2 = null;
		Static290.aClass30_3 = null;
		Static316.aClass29Array15 = null;
		Static222.aClass29Array8 = null;
		aClass29Array11 = null;
		Static321.aClass30_4 = null;
		Static305.aClass29Array14 = null;
		Static233.aClass29_16 = null;
		Static110.aClass29Array6 = null;
		Static121.aClass29Array5 = null;
		Static340.aClass29Array16 = null;
		Static39.aClass29Array3 = null;
		Static150.aClass30_2 = null;
		Static353.aClass29Array17 = null;
		Static250.aClass29Array10 = null;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!al;I)V")
	public static void method4723(@OriginalArg(0) Class1_Sub4 arg0) {
		if (Static241.aClass154ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt532 == 0) {
			local8 = (Interface6) Static56.method1394(arg0.anInt534, arg0.anInt526, arg0.anInt519);
		}
		if (arg0.anInt532 == 1) {
			local8 = (Interface6) Static169.method1651(arg0.anInt534, arg0.anInt526, arg0.anInt519);
		}
		if (arg0.anInt532 == 2) {
			local8 = (Interface6) Static95.method2029(arg0.anInt534, arg0.anInt526, arg0.anInt519, Interface6.class);
		}
		if (arg0.anInt532 == 3) {
			local8 = (Interface6) Static293.method5174(arg0.anInt534, arg0.anInt526, arg0.anInt519);
		}
		if (local8 == null) {
			arg0.anInt520 = 0;
			arg0.anInt522 = -1;
			arg0.anInt525 = 0;
		} else {
			arg0.anInt522 = local8.method5686();
			arg0.anInt525 = local8.method5684();
			arg0.anInt520 = local8.method5687();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!vp;I)I")
	public static int method4724(@OriginalArg(0) Class7_Sub1_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt7128;
		@Pc(17) Class83 local17 = arg0.method5982();
		if (arg0.aBoolean506) {
			local13 = arg0.anInt7123;
		} else if (arg0.anInt7053 == local17.anInt2847 || arg0.anInt7053 == local17.anInt2833 || arg0.anInt7053 == local17.anInt2831 || local17.anInt2853 == arg0.anInt7053) {
			local13 = arg0.anInt7134;
		} else if (arg0.anInt7053 == local17.anInt2845 || local17.anInt2855 == arg0.anInt7053 || local17.anInt2848 == arg0.anInt7053 || local17.anInt2854 == arg0.anInt7053) {
			local13 = arg0.anInt7137;
		}
		return local13;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4726(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static312.anInt6002 == 0 && Static87.anInt2332 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static263.aBoolean395 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static263.aBoolean395 = false;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static172.anInt6632 = 0;
				Static251.anInt5422 = 0;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static44.aClass58_3.method1673();
			}
			@Pc(61) int local61;
			@Pc(70) Runtime local70;
			@Pc(80) int local80;
			if (arg1.equalsIgnoreCase("gc")) {
				Static276.method4928();
				for (local61 = 0; local61 < 10; local61++) {
					System.gc();
				}
				local70 = Runtime.getRuntime();
				local80 = (int) ((local70.totalMemory() - local70.freeMemory()) / 1024L);
				Static86.method1931("mem=" + local80 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static276.method4928();
				for (local61 = 0; local61 < 10; local61++) {
					System.gc();
				}
				local70 = Runtime.getRuntime();
				local80 = (int) ((local70.totalMemory() - local70.freeMemory()) / 1024L);
				Static86.method1931("Memory before cleanup=" + local80 + "k");
				Static184.method5964();
				Static276.method4928();
				for (@Pc(137) int local137 = 0; local137 < 10; local137++) {
					System.gc();
				}
				local80 = (int) ((local70.totalMemory() - local70.freeMemory()) / 1024L);
				Static86.method1931("Memory after cleanup=" + local80 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static86.method1931("Number of player models in cache:" + Static212.method6168());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static224.method4551();
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static59.aClass182_5.method5047();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static59.aClass182_5.method5046();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static184.aClass199_12.method5486();
				Static31.aClass42_1.method1274();
				Static59.aClass182_5.method5038();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static139.method3060();
				Static15.method447();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static238.method4510(1, -1, -1, false);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static238.method4510(2, -1, -1, false);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static238.method4510(3, 1024, 768, false);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static338.method6024(0);
				Static4.anInt207 = 0;
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static338.method6024(1);
				Static4.anInt207 = 1;
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static338.method6024(2);
				Static4.anInt207 = 2;
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static338.method6024(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static166.aBoolean285 = !Static166.aBoolean285;
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
				Static139.method3060();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static122.aBoolean202 = !Static122.aBoolean202;
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
				Static139.method3060();
			}
			if (arg1.startsWith("shadows ")) {
				Static102.anInt2545 = Static260.method4756(arg1.substring(8));
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
				Static139.method3060();
			}
			if (arg1.startsWith("setba")) {
				Static226.anInt5071 = Static260.method4756(arg1.substring(6));
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static346.method6111(Static260.method4756(arg1.substring(13)));
				Static263.method4776(Static184.aClass199_12);
				Static329.aBoolean490 = false;
			}
			if (arg1.startsWith("fps ") && Static312.anInt6002 != 0) {
				Static52.method1370(Static260.method4756(arg1.substring(4)));
			}
			if (arg1.startsWith("rect_debug")) {
				Static73.anInt2040 = Static260.method4756(arg1.substring(10).trim());
				Static86.method1931("rect_debug=" + Static73.anInt2040);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static278.aBoolean279 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static58.aBoolean117 = !Static58.aBoolean117;
				Static86.method1931("clipcomponents=" + Static58.aBoolean117);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(448) boolean local448 = Static221.aClass40_6.method2719();
				if (!Static59.method5599(!local448)) {
					Static86.method1931("Failed to enable bloom");
				} else if (local448) {
					Static86.method1931("Bloom disabled");
				} else {
					Static86.method1931("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static187.aBoolean305) {
					Static187.aBoolean305 = false;
					Static86.method1931("Forced tweening disabled.");
				} else {
					Static187.aBoolean305 = true;
					Static86.method1931("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static326.aBoolean478) {
					Static86.method1931("Shift-click disabled.");
					Static326.aBoolean478 = false;
				} else {
					Static86.method1931("Shift-click ENABLED!");
					Static326.aBoolean478 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static86.method1931("x:" + (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7) + " z:" + (Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static86.method1931("Height: " + Static118.aClass77Array1[Static39.anInt1215].method3986(Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7027 >> 7, Static264.aClass7_Sub1_Sub1_Sub2_2.anInt7032 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static203.aClass162_47.method4645();
				Static203.aClass162_47.method4628();
				Static159.method3980();
				Static15.method447();
			}
			if (arg1.startsWith("mc")) {
				if (Static221.aClass40_6.method2703()) {
					local61 = Integer.parseInt(arg1.substring(3));
					if (local61 < 1) {
						local61 = 1;
					} else if (local61 > 4) {
						local61 = 4;
					}
					Static286.anInt6054 = local61;
					Static221.aClass40_6.method2733(Static286.anInt6054);
					Static221.aClass40_6.method2727(0);
					Static86.method1931("Render cores now: " + Static286.anInt6054);
				} else {
					Static86.method1931("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static86.method1931("I(s): " + Static9.aClass215_7.method6058() + "/" + Static9.aClass215_7.method6062());
				Static86.method1931("I(m): " + Static3.aClass215_1.method6058() + "/" + Static3.aClass215_1.method6062());
				Static86.method1931("O(s): " + Static299.aClass115_1.method3455() + "/" + Static299.aClass115_1.method3452());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static86.method1931("Pos: " + Static39.anInt1215 + "," + ((Static3.anInt92 >> 7) + Static149.anInt3667 >> 6) + "," + (Static96.anInt2446 + (Static88.anInt2339 >> 7) >> 6) + "," + ((Static3.anInt92 >> 7) + Static149.anInt3667 & 0x3F) + "," + ((Static88.anInt2339 >> 7) + Static96.anInt2446 & 0x3F) + " Height: " + (Static309.method5429(Static88.anInt2339, Static3.anInt92, Static39.anInt1215) - Static138.anInt3429));
				Static86.method1931("Look: " + Static39.anInt1215 + "," + (Static149.anInt3667 + Static32.anInt7023 >> 6) + "," + (Static339.anInt7358 + Static96.anInt2446 >> 6) + "," + (Static149.anInt3667 + Static32.anInt7023 & 0x3F) + "," + (Static339.anInt7358 + Static96.anInt2446 & 0x3F) + " Height: " + (Static309.method5429(Static339.anInt7358, Static32.anInt7023, Static39.anInt1215) - Static304.anInt6381));
			}
			if (arg1.equals("showocc")) {
				Static150.aBoolean258 = !Static150.aBoolean258;
				Static139.method3060();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static28.aBoolean55 = !Static28.aBoolean55;
				Static221.aClass40_6.method2729(Static28.aBoolean55);
				Static107.method2237();
			}
			if (arg1.equals("nonpcs")) {
				Static129.aBoolean232 = !Static129.aBoolean232;
			}
			if (arg1.equals("autoworld")) {
				Static254.method4680();
			}
			if (arg1.equals("heap")) {
				Static86.method1931("Heap: " + Static207.anInt4798 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static329.method5714();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local61 = 0; local61 < Static294.anIntArray469.length; local61++) {
					if (Static56.aBooleanArray5[local61]) {
						Static294.anIntArray469[local61] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static294.anIntArray469[local61] *= -1;
						}
					}
				}
				Static329.method5714();
			}
			if (arg1.equals("showcolmap")) {
				Static188.aBoolean107 = true;
				Static15.method447();
			}
			if (arg1.equals("hidecolmap")) {
				Static188.aBoolean107 = false;
				Static15.method447();
			}
			if (arg1.equals("resetcache")) {
				Static4.method147();
			}
			if (arg1.equals("profilecpu")) {
				Static86.method1931(Static321.method5633() + "ms");
			}
			if (Static214.anInt4865 == 30) {
				Static150.aClass1_Sub16_Sub2_2.method5793(171);
				Static150.aClass1_Sub16_Sub2_2.method5771(arg1.length() + 2);
				Static150.aClass1_Sub16_Sub2_2.method5771(arg0 ? 1 : 0);
				Static150.aClass1_Sub16_Sub2_2.method5726(arg1);
				return;
			}
		} catch (@Pc(966) Exception local966) {
			Static86.method1931("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(B)V")
	public static void method4727() {
		if (Static313.aString243.toLowerCase().indexOf("microsoft") != -1) {
			Static232.anIntArray383[189] = 26;
			Static232.anIntArray383[219] = 42;
			Static232.anIntArray383[220] = 74;
			Static232.anIntArray383[190] = 72;
			Static232.anIntArray383[223] = 28;
			Static232.anIntArray383[221] = 43;
			Static232.anIntArray383[222] = 59;
			Static232.anIntArray383[187] = 27;
			Static232.anIntArray383[186] = 57;
			Static232.anIntArray383[191] = 73;
			Static232.anIntArray383[188] = 71;
			Static232.anIntArray383[192] = 58;
			return;
		}
		Static232.anIntArray383[47] = 73;
		Static232.anIntArray383[44] = 71;
		Static232.anIntArray383[46] = 72;
		if (Static313.aMethod1 == null) {
			Static232.anIntArray383[222] = 59;
			Static232.anIntArray383[192] = 58;
		} else {
			Static232.anIntArray383[520] = 59;
			Static232.anIntArray383[192] = 28;
			Static232.anIntArray383[222] = 58;
		}
		Static232.anIntArray383[61] = 27;
		Static232.anIntArray383[92] = 74;
		Static232.anIntArray383[91] = 42;
		Static232.anIntArray383[59] = 57;
		Static232.anIntArray383[93] = 43;
		Static232.anIntArray383[45] = 26;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BIIIII)V")
	public static void method4728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg2 + 1;
		Static12.method349(arg1, Static87.anIntArrayArray9[arg2], arg3, arg0);
		@Pc(18) int local18 = arg4 - 1;
		Static12.method349(arg1, Static87.anIntArrayArray9[arg4], arg3, arg0);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static87.anIntArrayArray9[local25];
			local31[arg0] = local31[arg1] = arg3;
		}
	}
}
