import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
	private static int[] anIntArray212;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray30;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!gr;")
	private static Class86 aClass86_1;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Lclient!nk;")
	private static Class161 aClass161_9;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Lclient!nk;")
	private static Class161 aClass161_10;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	private static int anInt3650 = 0;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray29 = new String[1000];

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "[Lclient!ol;")
	private static final Class172[] aClass172Array1 = new Class172[50];

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	private static int anInt3652 = 0;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
	private static final int[] anIntArray213 = new int[1000];

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	private static int anInt3661 = 0;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "[[I")
	private static final int[][] anIntArrayArray27 = new int[5][5000];

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "[I")
	private static final int[] anIntArray214 = new int[5];

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "[I")
	private static final int[] anIntArray215 = new int[3];

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_30 = new Class98(4);

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray31 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	private static void method3590(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = Static6.method140(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class161[] local13 = Static113.aClass161ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class161[] local19 = Static26.aClass161ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static113.aClass161ArrayArray2[local9] = new Class161[local22];
			Static404.method4609(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static404.method4609(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!fn;)V")
	public static void method3591(@OriginalArg(0) Class2_Sub13 arg0) {
		method3593(arg0, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3592(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static4.anInt90 == 0 && (Static56.aBoolean123 && !Static101.aBoolean159 || Static109.aBoolean166)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static75.aClass79_38.method2267(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static75.aClass79_38.method2267(0).length());
		} else if (local11.startsWith(Static51.aClass79_28.method2267(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static51.aClass79_28.method2267(0).length());
		} else if (local11.startsWith(Static3.aClass79_1.method2267(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static3.aClass79_1.method2267(0).length());
		} else if (local11.startsWith(Static154.aClass79_66.method2267(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static154.aClass79_66.method2267(0).length());
		} else if (local11.startsWith(Static278.aClass79_110.method2267(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static278.aClass79_110.method2267(0).length());
		} else if (local11.startsWith(Static23.aClass79_17.method2267(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static23.aClass79_17.method2267(0).length());
		} else if (local11.startsWith(Static105.aClass79_45.method2267(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static105.aClass79_45.method2267(0).length());
		} else if (local11.startsWith(Static129.aClass79_57.method2267(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static129.aClass79_57.method2267(0).length());
		} else if (local11.startsWith(Static199.aClass79_120.method2267(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static199.aClass79_120.method2267(0).length());
		} else if (local11.startsWith(Static37.aClass79_24.method2267(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static37.aClass79_24.method2267(0).length());
		} else if (local11.startsWith(Static285.aClass79_113.method2267(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static285.aClass79_113.method2267(0).length());
		} else if (local11.startsWith(Static139.aClass79_62.method2267(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static139.aClass79_62.method2267(0).length());
		} else if (client.language != 0) {
			if (local11.startsWith(Static75.aClass79_38.method2267(client.language))) {
				local13 = 0;
				arg0 = arg0.substring(Static75.aClass79_38.method2267(client.language).length());
			} else if (local11.startsWith(Static51.aClass79_28.method2267(client.language))) {
				local13 = 1;
				arg0 = arg0.substring(Static51.aClass79_28.method2267(client.language).length());
			} else if (local11.startsWith(Static3.aClass79_1.method2267(client.language))) {
				local13 = 2;
				arg0 = arg0.substring(Static3.aClass79_1.method2267(client.language).length());
			} else if (local11.startsWith(Static154.aClass79_66.method2267(client.language))) {
				local13 = 3;
				arg0 = arg0.substring(Static154.aClass79_66.method2267(client.language).length());
			} else if (local11.startsWith(Static278.aClass79_110.method2267(client.language))) {
				local13 = 4;
				arg0 = arg0.substring(Static278.aClass79_110.method2267(client.language).length());
			} else if (local11.startsWith(Static23.aClass79_17.method2267(client.language))) {
				local13 = 5;
				arg0 = arg0.substring(Static23.aClass79_17.method2267(client.language).length());
			} else if (local11.startsWith(Static105.aClass79_45.method2267(client.language))) {
				local13 = 6;
				arg0 = arg0.substring(Static105.aClass79_45.method2267(client.language).length());
			} else if (local11.startsWith(Static129.aClass79_57.method2267(client.language))) {
				local13 = 7;
				arg0 = arg0.substring(Static129.aClass79_57.method2267(client.language).length());
			} else if (local11.startsWith(Static199.aClass79_120.method2267(client.language))) {
				local13 = 8;
				arg0 = arg0.substring(Static199.aClass79_120.method2267(client.language).length());
			} else if (local11.startsWith(Static37.aClass79_24.method2267(client.language))) {
				local13 = 9;
				arg0 = arg0.substring(Static37.aClass79_24.method2267(client.language).length());
			} else if (local11.startsWith(Static285.aClass79_113.method2267(client.language))) {
				local13 = 10;
				arg0 = arg0.substring(Static285.aClass79_113.method2267(client.language).length());
			} else if (local11.startsWith(Static139.aClass79_62.method2267(client.language))) {
				local13 = 11;
				arg0 = arg0.substring(Static139.aClass79_62.method2267(client.language).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static136.aClass79_141.method2267(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static136.aClass79_141.method2267(0).length());
		} else if (local11.startsWith(Static288.aClass79_114.method2267(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static288.aClass79_114.method2267(0).length());
		} else if (local11.startsWith(Static76.aClass79_39.method2267(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static76.aClass79_39.method2267(0).length());
		} else if (local11.startsWith(Static196.aClass79_70.method2267(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static196.aClass79_70.method2267(0).length());
		} else if (local11.startsWith(Static223.aClass79_87.method2267(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static223.aClass79_87.method2267(0).length());
		} else if (client.language != 0) {
			if (local11.startsWith(Static136.aClass79_141.method2267(client.language))) {
				local451 = 1;
				arg0 = arg0.substring(Static136.aClass79_141.method2267(client.language).length());
			} else if (local11.startsWith(Static288.aClass79_114.method2267(client.language))) {
				local451 = 2;
				arg0 = arg0.substring(Static288.aClass79_114.method2267(client.language).length());
			} else if (local11.startsWith(Static76.aClass79_39.method2267(client.language))) {
				local451 = 3;
				arg0 = arg0.substring(Static76.aClass79_39.method2267(client.language).length());
			} else if (local11.startsWith(Static196.aClass79_70.method2267(client.language))) {
				local451 = 4;
				arg0 = arg0.substring(Static196.aClass79_70.method2267(client.language).length());
			} else if (local11.startsWith(Static223.aClass79_87.method2267(client.language))) {
				local451 = 5;
				arg0 = arg0.substring(Static223.aClass79_87.method2267(client.language).length());
			}
		}
		Static91.method1960(Static102.aClass145_141);
		Protocol.outboundBuffer.p1(0);
		@Pc(646) int local646 = Protocol.outboundBuffer.pos;
		if (arg1 == 5021) {
			Protocol.outboundBuffer.p1(1);
		} else {
			Protocol.outboundBuffer.p1(0);
		}
		Protocol.outboundBuffer.p1(local13);
		Protocol.outboundBuffer.p1(local451);
		Static120.method2379(arg0, Protocol.outboundBuffer);
		Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local646);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!fn;I)V")
	private static void method3593(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub11 local12 = Static295.method5100(local8);
		if (local12 == null) {
			return;
		}
		anIntArray212 = new int[local12.anInt3225];
		@Pc(21) int local21 = 0;
		aStringArray30 = new String[local12.anInt3228];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2116;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2117;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass161_3 == null ? -1 : arg0.aClass161_3.anInt4317;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2118;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass161_3 == null ? -1 : arg0.aClass161_3.anInt4297;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass161_4 == null ? -1 : arg0.aClass161_4.anInt4317;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass161_4 == null ? -1 : arg0.aClass161_4.anInt4297;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2114;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2115;
				}
				anIntArray212[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString20;
				}
				aStringArray30[local27++] = local135;
			}
		}
		method3600(local12, arg1);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method3594(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray31[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
	private static void method3595(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class161 local137;
		@Pc(25) int local25;
		@Pc(35) Class161 local35;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(210) Class161 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3650 -= 3;
				local13 = anIntArray213[anInt3650];
				local19 = anIntArray213[anInt3650 + 1];
				local25 = anIntArray213[anInt3650 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static6.method140(local13);
				if (local35.aClass161Array2 == null) {
					local35.aClass161Array2 = new Class161[local25 + 1];
				}
				if (local35.aClass161Array2.length <= local25) {
					@Pc(54) Class161[] local54 = new Class161[local25 + 1];
					for (local56 = 0; local56 < local35.aClass161Array2.length; local56++) {
						local54[local56] = local35.aClass161Array2[local56];
					}
					local35.aClass161Array2 = local54;
				}
				if (local25 > 0 && local35.aClass161Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class161 local99 = new Class161();
				local99.anInt4272 = local19;
				local99.anInt4275 = local99.anInt4317 = local35.anInt4317;
				local99.anInt4297 = local25;
				local35.aClass161Array2[local25] = local99;
				if (arg1) {
					aClass161_10 = local99;
				} else {
					aClass161_9 = local99;
				}
				Static200.method3645(local35);
				return;
			}
			@Pc(158) Class161 local158;
			if (arg0 == 101) {
				local137 = arg1 ? aClass161_10 : aClass161_9;
				if (local137.anInt4297 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static6.method140(local137.anInt4317);
				local158.aClass161Array2[local137.anInt4297] = null;
				Static200.method3645(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static6.method140(anIntArray213[--anInt3650]);
				local137.aClass161Array2 = null;
				Static200.method3645(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3650 -= 2;
				local13 = anIntArray213[anInt3650];
				local19 = anIntArray213[anInt3650 + 1];
				local210 = Static207.method3705(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray213[anInt3650++] = 1;
					if (arg1) {
						aClass161_10 = local210;
						return;
					}
					aClass161_9 = local210;
					return;
				}
				anIntArray213[anInt3650++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray213[--anInt3650];
				local158 = Static6.method140(local13);
				if (local158 != null) {
					anIntArray213[anInt3650++] = 1;
					if (arg1) {
						aClass161_10 = local158;
						return;
					}
					aClass161_9 = local158;
					return;
				}
				anIntArray213[anInt3650++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray213[--anInt3650];
				method3590(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray213[--anInt3650];
				method3597(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3650 -= 2;
					local13 = anIntArray213[anInt3650];
					local19 = anIntArray213[anInt3650 + 1];
					for (local25 = 0; local25 < Static5.anIntArray3.length; local25++) {
						if (Static5.anIntArray3[local25] == local13) {
							Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3181(Static21.aClass55_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static355.anIntArray457.length; local353++) {
						if (Static355.anIntArray457[local353] == local13) {
							Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3181(Static21.aClass55_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3650 -= 2;
					local13 = anIntArray213[anInt3650];
					local19 = anIntArray213[anInt3650 + 1];
					Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3187(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray213[--anInt3650] != 0;
					Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3183(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static6.method140(anIntArray213[--anInt3650]);
					} else {
						local137 = arg1 ? aClass161_10 : aClass161_9;
					}
					if (arg0 == 1100) {
						anInt3650 -= 2;
						local137.anInt4258 = anIntArray213[anInt3650];
						if (local137.anInt4258 > local137.anInt4281 - local137.anInt4248) {
							local137.anInt4258 = local137.anInt4281 - local137.anInt4248;
						}
						if (local137.anInt4258 < 0) {
							local137.anInt4258 = 0;
						}
						local137.anInt4259 = anIntArray213[anInt3650 + 1];
						if (local137.anInt4259 > local137.anInt4266 - local137.anInt4261) {
							local137.anInt4259 = local137.anInt4266 - local137.anInt4261;
						}
						if (local137.anInt4259 < 0) {
							local137.anInt4259 = 0;
						}
						Static200.method3645(local137);
						if (local137.anInt4297 == -1) {
							Static369.method6220(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4290 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						if (local137.anInt4297 == -1) {
							Static278.method4723(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean293 = anIntArray213[--anInt3650] == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt4311 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt4237 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray213[--anInt3650];
						if (local137.anInt4295 != local19) {
							local137.anInt4295 = local19;
							Static200.method3645(local137);
						}
						if (local137.anInt4297 == -1) {
							Static137.method2552(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt4308 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean286 = anIntArray213[--anInt3650] == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt4288 = 1;
						local137.anInt4313 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						if (local137.anInt4297 == -1) {
							Static17.method4213(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3650 -= 6;
						local137.anInt4278 = anIntArray213[anInt3650];
						local137.anInt4250 = anIntArray213[anInt3650 + 1];
						local137.anInt4320 = anIntArray213[anInt3650 + 2];
						local137.anInt4274 = anIntArray213[anInt3650 + 3];
						local137.anInt4319 = anIntArray213[anInt3650 + 4];
						local137.anInt4255 = anIntArray213[anInt3650 + 5];
						Static200.method3645(local137);
						if (local137.anInt4297 == -1) {
							Static173.method3322(local137.anInt4317);
							Static86.method1934(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray213[--anInt3650];
						if (local137.anInt4299 != local19) {
							local137.anInt4299 = local19;
							local137.anInt4247 = 0;
							local137.anInt4316 = 1;
							local137.anInt4283 = 0;
							Static200.method3645(local137);
						}
						if (local137.anInt4297 == -1) {
							Static250.method4343(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean290 = anIntArray213[--anInt3650] == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray29[--anInt3652];
						if (!local1101.equals(local137.aString47)) {
							local137.aString47 = local1101;
							Static200.method3645(local137);
						}
						if (local137.anInt4297 == -1) {
							Static179.method3364(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4318 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						if (local137.anInt4297 == -1) {
							Static129.method2439(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3650 -= 3;
						local137.anInt4298 = anIntArray213[anInt3650];
						local137.anInt4293 = anIntArray213[anInt3650 + 1];
						local137.anInt4303 = anIntArray213[anInt3650 + 2];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean291 = anIntArray213[--anInt3650] == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt4279 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt4252 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean281 = anIntArray213[--anInt3650] == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean285 = anIntArray213[--anInt3650] == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3650 -= 2;
						local137.anInt4281 = anIntArray213[anInt3650];
						local137.anInt4266 = anIntArray213[anInt3650 + 1];
						Static200.method3645(local137);
						if (local137.anInt4272 == 0) {
							Static85.method1911(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3650 -= 2;
						local137.aShort62 = (short) anIntArray213[anInt3650];
						local137.aShort61 = (short) anIntArray213[anInt3650 + 1];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean283 = anIntArray213[--anInt3650] == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4255 = anIntArray213[--anInt3650];
						Static200.method3645(local137);
						if (local137.anInt4297 == -1) {
							Static173.method3322(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray213[--anInt3650];
						local137.aBoolean292 = local19 == 1;
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3650 -= 2;
						local137.anInt4307 = anIntArray213[anInt3650];
						local137.anInt4253 = anIntArray213[anInt3650 + 1];
						Static200.method3645(local137);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static6.method140(anIntArray213[--anInt3650]);
					} else {
						local137 = arg1 ? aClass161_10 : aClass161_9;
					}
					Static200.method3645(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3650 -= 2;
						local19 = anIntArray213[anInt3650];
						local25 = anIntArray213[anInt3650 + 1];
						if (local137.anInt4297 == -1) {
							Static318.method5428(local137.anInt4317);
							Static173.method3322(local137.anInt4317);
							Static86.method1934(local137.anInt4317);
						}
						if (local19 == -1) {
							local137.anInt4288 = 1;
							local137.anInt4313 = -1;
							local137.anInt4300 = -1;
							return;
						}
						local137.anInt4300 = local19;
						local137.anInt4240 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean280 = true;
						} else {
							local137.aBoolean280 = false;
						}
						@Pc(1537) Class188 local1537 = Static313.aClass107_2.method2759(local19);
						local137.anInt4320 = local1537.anInt5245;
						local137.anInt4274 = local1537.anInt5215;
						local137.anInt4319 = local1537.anInt5249;
						local137.anInt4278 = local1537.anInt5252;
						local137.anInt4250 = local1537.anInt5232;
						local137.anInt4255 = local1537.anInt5241;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt4306 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt4306 = 1;
						} else {
							local137.anInt4306 = 2;
						}
						if (local137.anInt4251 > 0) {
							local137.anInt4255 = local137.anInt4255 * 32 / local137.anInt4251;
							return;
						}
						if (local137.anInt4294 > 0) {
							local137.anInt4255 = local137.anInt4255 * 32 / local137.anInt4294;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt4288 = 2;
						local137.anInt4313 = anIntArray213[--anInt3650];
						if (local137.anInt4297 == -1) {
							Static17.method4213(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt4288 = 3;
						local137.anInt4313 = -1;
						if (local137.anInt4297 == -1) {
							Static17.method4213(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt4288 = 6;
						local137.anInt4313 = anIntArray213[--anInt3650];
						if (local137.anInt4297 == -1) {
							Static17.method4213(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt4288 = 5;
						local137.anInt4313 = anIntArray213[--anInt3650];
						if (local137.anInt4297 == -1) {
							Static17.method4213(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3650 -= 4;
						local137.anInt4280 = anIntArray213[anInt3650];
						local137.anInt4267 = anIntArray213[anInt3650 + 1];
						local137.anInt4235 = anIntArray213[anInt3650 + 2];
						local137.anInt4242 = anIntArray213[anInt3650 + 3];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3650 -= 2;
						local137.anInt4270 = anIntArray213[anInt3650];
						local137.anInt4302 = anIntArray213[anInt3650 + 1];
						Static200.method3645(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3650 -= 4;
						local137.anInt4313 = anIntArray213[anInt3650];
						local137.anInt4236 = anIntArray213[anInt3650 + 1];
						if (anIntArray213[anInt3650 + 2] == 1) {
							local137.anInt4288 = 9;
						} else {
							local137.anInt4288 = 8;
						}
						if (anIntArray213[anInt3650 + 3] == 1) {
							local137.aBoolean280 = true;
						} else {
							local137.aBoolean280 = false;
						}
						if (local137.anInt4297 == -1) {
							Static17.method4213(local137.anInt4317);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt4288 = 5;
						local137.anInt4313 = Static234.anInt4226;
						local137.anInt4236 = 0;
						if (local137.anInt4297 == -1) {
							Static17.method4213(local137.anInt4317);
						}
						return;
					}
				} else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static6.method140(anIntArray213[--anInt3650]);
					} else {
						local137 = arg1 ? aClass161_10 : aClass161_9;
					}
					if (arg0 == 1300) {
						local19 = anIntArray213[--anInt3650] - 1;
						if (local19 >= 0 && local19 <= 9) {
							local137.method4103(local19, aStringArray29[--anInt3652]);
							return;
						}
						anInt3652--;
						return;
					}
					if (arg0 == 1301) {
						anInt3650 -= 2;
						local19 = anIntArray213[anInt3650];
						local25 = anIntArray213[anInt3650 + 1];
						local137.aClass161_12 = Static207.method3705(local19, local25);
						return;
					}
					if (arg0 == 1302) {
						local19 = anIntArray213[--anInt3650];
						if (local19 != Static164.anInt3138 && local19 != Static158.anInt2895 && local19 != Static83.anInt1838) {
							return;
						}
						local137.anInt4285 = local19;
						return;
					}
					if (arg0 == 1303) {
						local137.anInt4239 = anIntArray213[--anInt3650];
						return;
					}
					if (arg0 == 1304) {
						local137.anInt4271 = anIntArray213[--anInt3650];
						return;
					}
					if (arg0 == 1305) {
						local137.aString45 = aStringArray29[--anInt3652];
						return;
					}
					if (arg0 == 1306) {
						local137.aString44 = aStringArray29[--anInt3652];
						return;
					}
					if (arg0 == 1307) {
						local137.aStringArray40 = null;
						return;
					}
					if (arg0 == 1308) {
						local137.anInt4286 = anIntArray213[--anInt3650];
						local137.anInt4238 = anIntArray213[--anInt3650];
						return;
					}
					if (arg0 == 1309) {
						local19 = anIntArray213[--anInt3650];
						local25 = anIntArray213[--anInt3650];
						if (local25 >= 1 && local25 <= 10) {
							local137.method4110(local19, local25 - 1);
						}
						return;
					}
					if (arg0 == 1310) {
						local137.aString46 = aStringArray29[--anInt3652];
						return;
					}
					if (arg0 == 1311) {
						local137.anInt4260 = anIntArray213[--anInt3650];
						return;
					}
				} else {
					@Pc(2194) int local2194;
					if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static6.method140(anIntArray213[--anInt3650]);
						} else {
							local137 = arg1 ? aClass161_10 : aClass161_9;
						}
						local1101 = aStringArray29[--anInt3652];
						@Pc(2137) int[] local2137 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray213[--anInt3650];
							if (local353 > 0) {
								local2137 = new int[local353];
								while (local353-- > 0) {
									local2137[local353] = anIntArray213[--anInt3650];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2189) Object[] local2189 = new Object[local1101.length() + 1];
						for (local2194 = local2189.length - 1; local2194 >= 1; local2194--) {
							if (local1101.charAt(local2194 - 1) == 's') {
								local2189[local2194] = aStringArray29[--anInt3652];
							} else {
								local2189[local2194] = Integer.valueOf(anIntArray213[--anInt3650]);
							}
						}
						local56 = anIntArray213[--anInt3650];
						if (local56 == -1) {
							local2189 = null;
						} else {
							local2189[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray14 = local2189;
						} else if (arg0 == 1401) {
							local137.anObjectArray16 = local2189;
						} else if (arg0 == 1402) {
							local137.anObjectArray30 = local2189;
						} else if (arg0 == 1403) {
							local137.anObjectArray13 = local2189;
						} else if (arg0 == 1404) {
							local137.anObjectArray9 = local2189;
						} else if (arg0 == 1405) {
							local137.anObjectArray31 = local2189;
						} else if (arg0 == 1406) {
							local137.anObjectArray32 = local2189;
						} else if (arg0 == 1407) {
							local137.anObjectArray10 = local2189;
							local137.anIntArray273 = local2137;
						} else if (arg0 == 1408) {
							local137.anObjectArray23 = local2189;
						} else if (arg0 == 1409) {
							local137.anObjectArray27 = local2189;
						} else if (arg0 == 1410) {
							local137.anObjectArray8 = local2189;
						} else if (arg0 == 1411) {
							local137.anObjectArray28 = local2189;
						} else if (arg0 == 1412) {
							local137.anObjectArray12 = local2189;
						} else if (arg0 == 1414) {
							local137.anObjectArray29 = local2189;
							local137.anIntArray281 = local2137;
						} else if (arg0 == 1415) {
							local137.anObjectArray5 = local2189;
							local137.anIntArray274 = local2137;
						} else if (arg0 == 1416) {
							local137.anObjectArray15 = local2189;
						} else if (arg0 == 1417) {
							local137.anObjectArray21 = local2189;
						} else if (arg0 == 1418) {
							local137.anObjectArray26 = local2189;
						} else if (arg0 == 1419) {
							local137.anObjectArray17 = local2189;
						} else if (arg0 == 1420) {
							local137.anObjectArray25 = local2189;
						} else if (arg0 == 1421) {
							local137.anObjectArray18 = local2189;
						} else if (arg0 == 1422) {
							local137.anObjectArray24 = local2189;
						} else if (arg0 == 1423) {
							local137.anObjectArray34 = local2189;
						} else if (arg0 == 1424) {
							local137.anObjectArray11 = local2189;
						} else if (arg0 == 1425) {
							local137.anObjectArray33 = local2189;
						} else if (arg0 == 1426) {
							local137.anObjectArray20 = local2189;
						} else if (arg0 == 1427) {
							local137.anObjectArray6 = local2189;
						} else if (arg0 == 1428) {
							local137.anObjectArray19 = local2189;
							local137.anIntArray278 = local2137;
						} else if (arg0 == 1429) {
							local137.anObjectArray7 = local2189;
							local137.anIntArray277 = local2137;
						}
						local137.aBoolean296 = true;
						return;
					}
					if (arg0 < 1600) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1500) {
							anIntArray213[anInt3650++] = local137.anInt4305;
							return;
						}
						if (arg0 == 1501) {
							anIntArray213[anInt3650++] = local137.anInt4254;
							return;
						}
						if (arg0 == 1502) {
							anIntArray213[anInt3650++] = local137.anInt4248;
							return;
						}
						if (arg0 == 1503) {
							anIntArray213[anInt3650++] = local137.anInt4261;
							return;
						}
						if (arg0 == 1504) {
							anIntArray213[anInt3650++] = local137.aBoolean284 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray213[anInt3650++] = local137.anInt4275;
							return;
						}
					} else if (arg0 < 1700) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1600) {
							anIntArray213[anInt3650++] = local137.anInt4258;
							return;
						}
						if (arg0 == 1601) {
							anIntArray213[anInt3650++] = local137.anInt4259;
							return;
						}
						if (arg0 == 1602) {
							aStringArray29[anInt3652++] = local137.aString47;
							return;
						}
						if (arg0 == 1603) {
							anIntArray213[anInt3650++] = local137.anInt4281;
							return;
						}
						if (arg0 == 1604) {
							anIntArray213[anInt3650++] = local137.anInt4266;
							return;
						}
						if (arg0 == 1605) {
							anIntArray213[anInt3650++] = local137.anInt4255;
							return;
						}
						if (arg0 == 1606) {
							anIntArray213[anInt3650++] = local137.anInt4320;
							return;
						}
						if (arg0 == 1607) {
							anIntArray213[anInt3650++] = local137.anInt4319;
							return;
						}
						if (arg0 == 1608) {
							anIntArray213[anInt3650++] = local137.anInt4274;
							return;
						}
						if (arg0 == 1609) {
							anIntArray213[anInt3650++] = local137.anInt4311;
							return;
						}
						if (arg0 == 1610) {
							anIntArray213[anInt3650++] = local137.anInt4278;
							return;
						}
						if (arg0 == 1611) {
							anIntArray213[anInt3650++] = local137.anInt4250;
							return;
						}
						if (arg0 == 1612) {
							anIntArray213[anInt3650++] = local137.anInt4295;
							return;
						}
					} else if (arg0 < 1800) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1700) {
							anIntArray213[anInt3650++] = local137.anInt4300;
							return;
						}
						if (arg0 == 1701) {
							if (local137.anInt4300 != -1) {
								anIntArray213[anInt3650++] = local137.anInt4240;
								return;
							}
							anIntArray213[anInt3650++] = 0;
							return;
						}
						if (arg0 == 1702) {
							anIntArray213[anInt3650++] = local137.anInt4297;
							return;
						}
					} else if (arg0 < 1900) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1800) {
							anIntArray213[anInt3650++] = Static45.method1404(local137).method1852();
							return;
						}
						if (arg0 == 1801) {
							local19 = anIntArray213[--anInt3650];
							local19--;
							if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
								aStringArray29[anInt3652++] = local137.aStringArray40[local19];
								return;
							}
							aStringArray29[anInt3652++] = "";
							return;
						}
						if (arg0 == 1802) {
							if (local137.aString45 == null) {
								aStringArray29[anInt3652++] = "";
								return;
							}
							aStringArray29[anInt3652++] = local137.aString45;
							return;
						}
					} else if (arg0 < 2600) {
						local137 = Static6.method140(anIntArray213[--anInt3650]);
						if (arg0 == 2500) {
							anIntArray213[anInt3650++] = local137.anInt4305;
							return;
						}
						if (arg0 == 2501) {
							anIntArray213[anInt3650++] = local137.anInt4254;
							return;
						}
						if (arg0 == 2502) {
							anIntArray213[anInt3650++] = local137.anInt4248;
							return;
						}
						if (arg0 == 2503) {
							anIntArray213[anInt3650++] = local137.anInt4261;
							return;
						}
						if (arg0 == 2504) {
							anIntArray213[anInt3650++] = local137.aBoolean284 ? 1 : 0;
							return;
						}
						if (arg0 == 2505) {
							anIntArray213[anInt3650++] = local137.anInt4275;
							return;
						}
					} else if (arg0 < 2700) {
						local137 = Static6.method140(anIntArray213[--anInt3650]);
						if (arg0 == 2600) {
							anIntArray213[anInt3650++] = local137.anInt4258;
							return;
						}
						if (arg0 == 2601) {
							anIntArray213[anInt3650++] = local137.anInt4259;
							return;
						}
						if (arg0 == 2602) {
							aStringArray29[anInt3652++] = local137.aString47;
							return;
						}
						if (arg0 == 2603) {
							anIntArray213[anInt3650++] = local137.anInt4281;
							return;
						}
						if (arg0 == 2604) {
							anIntArray213[anInt3650++] = local137.anInt4266;
							return;
						}
						if (arg0 == 2605) {
							anIntArray213[anInt3650++] = local137.anInt4255;
							return;
						}
						if (arg0 == 2606) {
							anIntArray213[anInt3650++] = local137.anInt4320;
							return;
						}
						if (arg0 == 2607) {
							anIntArray213[anInt3650++] = local137.anInt4319;
							return;
						}
						if (arg0 == 2608) {
							anIntArray213[anInt3650++] = local137.anInt4274;
							return;
						}
						if (arg0 == 2609) {
							anIntArray213[anInt3650++] = local137.anInt4311;
							return;
						}
						if (arg0 == 2610) {
							anIntArray213[anInt3650++] = local137.anInt4278;
							return;
						}
						if (arg0 == 2611) {
							anIntArray213[anInt3650++] = local137.anInt4250;
							return;
						}
						if (arg0 == 2612) {
							anIntArray213[anInt3650++] = local137.anInt4295;
							return;
						}
					} else {
						@Pc(3356) Class2_Sub7 local3356;
						@Pc(3254) Class2_Sub7 local3254;
						if (arg0 < 2800) {
							if (arg0 == 2700) {
								local137 = Static6.method140(anIntArray213[--anInt3650]);
								anIntArray213[anInt3650++] = local137.anInt4300;
								return;
							}
							if (arg0 == 2701) {
								local137 = Static6.method140(anIntArray213[--anInt3650]);
								if (local137.anInt4300 != -1) {
									anIntArray213[anInt3650++] = local137.anInt4240;
									return;
								}
								anIntArray213[anInt3650++] = 0;
								return;
							}
							if (arg0 == 2702) {
								local13 = anIntArray213[--anInt3650];
								local3254 = (Class2_Sub7) Static329.aClass4_130.method90((long) local13);
								if (local3254 != null) {
									anIntArray213[anInt3650++] = 1;
									return;
								}
								anIntArray213[anInt3650++] = 0;
								return;
							}
							if (arg0 == 2703) {
								local137 = Static6.method140(anIntArray213[--anInt3650]);
								if (local137.aClass161Array2 == null) {
									anIntArray213[anInt3650++] = 0;
									return;
								}
								local19 = local137.aClass161Array2.length;
								for (local25 = 0; local25 < local137.aClass161Array2.length; local25++) {
									if (local137.aClass161Array2[local25] == null) {
										local19 = local25;
										break;
									}
								}
								anIntArray213[anInt3650++] = local19;
								return;
							}
							if (arg0 == 2704 || arg0 == 2705) {
								anInt3650 -= 2;
								local13 = anIntArray213[anInt3650];
								local19 = anIntArray213[anInt3650 + 1];
								local3356 = (Class2_Sub7) Static329.aClass4_130.method90((long) local13);
								if (local3356 != null && local3356.anInt1370 == local19) {
									anIntArray213[anInt3650++] = 1;
									return;
								} else {
									anIntArray213[anInt3650++] = 0;
									return;
								}
							}
						} else if (arg0 < 2900) {
							local137 = Static6.method140(anIntArray213[--anInt3650]);
							if (arg0 == 2800) {
								anIntArray213[anInt3650++] = Static45.method1404(local137).method1852();
								return;
							}
							if (arg0 == 2801) {
								local19 = anIntArray213[--anInt3650];
								local19--;
								if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
									aStringArray29[anInt3652++] = local137.aStringArray40[local19];
									return;
								}
								aStringArray29[anInt3652++] = "";
								return;
							}
							if (arg0 == 2802) {
								if (local137.aString45 == null) {
									aStringArray29[anInt3652++] = "";
									return;
								}
								aStringArray29[anInt3652++] = local137.aString45;
								return;
							}
						} else {
							@Pc(3493) String local3493;
							if (arg0 < 3200) {
								if (arg0 == 3100) {
									local3493 = aStringArray29[--anInt3652];
									Static207.method3700(local3493);
									return;
								}
								if (arg0 == 3101) {
									anInt3650 -= 2;
									Static337.method5707(Static17.aClass11_Sub5_Sub2_Sub1_3, anIntArray213[anInt3650 + 1], anIntArray213[anInt3650]);
									return;
								}
								if (arg0 == 3103) {
									Static82.method1904();
									return;
								}
								if (arg0 == 3104) {
									local3493 = aStringArray29[--anInt3652];
									local19 = 0;
									if (Static132.method2485(local3493)) {
										local19 = Static146.method2698(local3493);
									}
									Static91.method1960(Static363.aClass145_239);
									Protocol.outboundBuffer.p4(local19);
									return;
								}
								if (arg0 == 3105) {
									local3493 = aStringArray29[--anInt3652];
									Static91.method1960(Static49.aClass145_44);
									Protocol.outboundBuffer.p1(local3493.length() + 1);
									Protocol.outboundBuffer.pjstr(local3493);
									return;
								}
								if (arg0 == 3106) {
									local3493 = aStringArray29[--anInt3652];
									Static91.method1960(Static221.aClass145_164);
									Protocol.outboundBuffer.p1(local3493.length() + 1);
									Protocol.outboundBuffer.pjstr(local3493);
									return;
								}
								if (arg0 == 3107) {
									local13 = anIntArray213[--anInt3650];
									local1101 = aStringArray29[--anInt3652];
									Static341.method5769(local13, local1101);
									return;
								}
								if (arg0 == 3108) {
									anInt3650 -= 3;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local25 = anIntArray213[anInt3650 + 2];
									local35 = Static6.method140(local25);
									Static380.method6335(local13, local19, local35);
									return;
								}
								if (arg0 == 3109) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local210 = arg1 ? aClass161_10 : aClass161_9;
									Static380.method6335(local13, local19, local210);
									return;
								}
								if (arg0 == 3110) {
									local13 = anIntArray213[--anInt3650];
									Static91.method1960(Static190.aClass145_138);
									Protocol.outboundBuffer.p2(local13);
									return;
								}
								if (arg0 == 3111) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local3356 = (Class2_Sub7) Static329.aClass4_130.method90((long) local13);
									if (local3356 != null) {
										Static276.method4655(true, local3356, local3356.anInt1370 != local19);
									}
									Static382.method6365(local13, 3, true, local19);
									return;
								}
								if (arg0 == 3112) {
									anInt3650--;
									local13 = anIntArray213[anInt3650];
									local3254 = (Class2_Sub7) Static329.aClass4_130.method90((long) local13);
									if (local3254 != null && local3254.anInt1373 == 3) {
										Static276.method4655(true, local3254, true);
									}
									return;
								}
							} else if (arg0 < 3300) {
								if (arg0 == 3200) {
									anInt3650 -= 3;
									Static29.method939(anIntArray213[anInt3650 + 1], 255, anIntArray213[anInt3650 + 2], anIntArray213[anInt3650]);
									return;
								}
								if (arg0 == 3201) {
									Static138.method2578(50, 255, anIntArray213[--anInt3650]);
									return;
								}
								if (arg0 == 3202) {
									anInt3650 -= 2;
									Static175.method3324(anIntArray213[anInt3650], anIntArray213[anInt3650 + 1], 255);
									return;
								}
								if (arg0 == 3203) {
									anInt3650 -= 4;
									Static29.method939(anIntArray213[anInt3650 + 1], anIntArray213[anInt3650 + 3], anIntArray213[anInt3650 + 2], anIntArray213[anInt3650]);
									return;
								}
								if (arg0 == 3204) {
									anInt3650 -= 3;
									Static138.method2578(anIntArray213[anInt3650 + 2], anIntArray213[anInt3650 + 1], anIntArray213[anInt3650]);
									return;
								}
								if (arg0 == 3205) {
									anInt3650 -= 3;
									Static175.method3324(anIntArray213[anInt3650], anIntArray213[anInt3650 + 1], anIntArray213[anInt3650 + 2]);
									return;
								}
							} else if (arg0 < 3400) {
								if (arg0 == 3300) {
									anIntArray213[anInt3650++] = Static114.anInt2348;
									return;
								}
								if (arg0 == 3301) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static41.method1305(false, local13, local19);
									return;
								}
								if (arg0 == 3302) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static243.method4238(local19, false, local13);
									return;
								}
								if (arg0 == 3303) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static192.method3506(local13, false, local19);
									return;
								}
								if (arg0 == 3304) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static178.aClass51_3.method1706(local13).anInt2488;
									return;
								}
								if (arg0 == 3305) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static268.anIntArray338[local13];
									return;
								}
								if (arg0 == 3306) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static325.anIntArray414[local13];
									return;
								}
								if (arg0 == 3307) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static80.anIntArray464[local13];
									return;
								}
								if (arg0 == 3308) {
									@Pc(4136) byte local4136 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78;
									local19 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6781 >> 7) + Static164.anInt3140;
									local25 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6783 >> 7) + Static148.anInt2719;
									anIntArray213[anInt3650++] = (local4136 << 28) + (local19 << 14) + local25;
									return;
								}
								if (arg0 == 3309) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = local13 >> 14 & 0x3FFF;
									return;
								}
								if (arg0 == 3310) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = local13 >> 28;
									return;
								}
								if (arg0 == 3311) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = local13 & 0x3FFF;
									return;
								}
								if (arg0 == 3312) {
									anIntArray213[anInt3650++] = Static206.aBoolean241 ? 1 : 0;
									return;
								}
								if (arg0 == 3313) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static41.method1305(true, local13, local19);
									return;
								}
								if (arg0 == 3314) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static243.method4238(local19, true, local13);
									return;
								}
								if (arg0 == 3315) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static192.method3506(local13, true, local19);
									return;
								}
								if (arg0 == 3316) {
									if (Static4.anInt90 >= 2) {
										anIntArray213[anInt3650++] = Static4.anInt90;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3317) {
									anIntArray213[anInt3650++] = Static151.anInt2773;
									return;
								}
								if (arg0 == 3318) {
									anIntArray213[anInt3650++] = client.worldId;
									return;
								}
								if (arg0 == 3321) {
									anIntArray213[anInt3650++] = Static96.anInt2002;
									return;
								}
								if (arg0 == 3322) {
									anIntArray213[anInt3650++] = Static41.anInt1048;
									return;
								}
								if (arg0 == 3323) {
									if (Static210.anInt3774 >= 5 && Static210.anInt3774 <= 9) {
										anIntArray213[anInt3650++] = 1;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3324) {
									if (Static210.anInt3774 >= 5 && Static210.anInt3774 <= 9) {
										anIntArray213[anInt3650++] = Static210.anInt3774;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3325) {
									anIntArray213[anInt3650++] = Static381.aBoolean482 ? 1 : 0;
									return;
								}
								if (arg0 == 3326) {
									anIntArray213[anInt3650++] = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4179;
									return;
								}
								if (arg0 == 3327) {
									anIntArray213[anInt3650++] = Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.aBoolean220 ? 1 : 0;
									return;
								}
								if (arg0 == 3328) {
									anIntArray213[anInt3650++] = Static56.aBoolean123 && !Static101.aBoolean159 ? 1 : 0;
									return;
								}
								if (arg0 == 3329) {
									anIntArray213[anInt3650++] = Static109.aBoolean166 ? 1 : 0;
									return;
								}
								if (arg0 == 3330) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static154.method2784(local13);
									return;
								}
								if (arg0 == 3331) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static165.method3150(local19, false, local13);
									return;
								}
								if (arg0 == 3332) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = Static165.method3150(local19, true, local13);
									return;
								}
								if (arg0 == 3333) {
									anIntArray213[anInt3650++] = Static202.anInt3714;
									return;
								}
								if (arg0 == 3335) {
									anIntArray213[anInt3650++] = client.language;
									return;
								}
								if (arg0 == 3336) {
									anInt3650 -= 4;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local25 = anIntArray213[anInt3650 + 2];
									local353 = anIntArray213[anInt3650 + 3];
									local13 += local19 << 14;
									local13 += local25 << 28;
									local13 += local353;
									anIntArray213[anInt3650++] = local13;
									return;
								}
								if (arg0 == 3337) {
									anIntArray213[anInt3650++] = client.affiliate;
									return;
								}
								if (arg0 == 3338) {
									anIntArray213[anInt3650++] = Static374.method6273();
									return;
								}
							} else if (arg0 < 3500) {
								@Pc(4761) Class52 local4761;
								if (arg0 == 3400) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local4761 = Static140.aClass109_1.method2779(local13);
									aStringArray29[anInt3652++] = local4761.method1775(local19);
									return;
								}
								if (arg0 == 3408) {
									anInt3650 -= 4;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local25 = anIntArray213[anInt3650 + 2];
									local353 = anIntArray213[anInt3650 + 3];
									@Pc(4807) Class52 local4807 = Static140.aClass109_1.method2779(local25);
									if (local4807.aChar4 == local13 && local4807.aChar3 == local19) {
										if (local19 == 115) {
											aStringArray29[anInt3652++] = local4807.method1775(local353);
											return;
										}
										anIntArray213[anInt3650++] = local4807.method1766(local353);
										return;
									}
									throw new RuntimeException("C3408-1");
								}
								if (arg0 == 3409) {
									anInt3650 -= 3;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local25 = anIntArray213[anInt3650 + 2];
									if (local19 == -1) {
										throw new RuntimeException("C3409-2");
									}
									@Pc(4883) Class52 local4883 = Static140.aClass109_1.method2779(local19);
									if (local4883.aChar3 != local13) {
										throw new RuntimeException("C3409-1");
									}
									anIntArray213[anInt3650++] = local4883.method1771(local25) ? 1 : 0;
									return;
								}
								if (arg0 == 3410) {
									local13 = anIntArray213[--anInt3650];
									local1101 = aStringArray29[--anInt3652];
									if (local13 == -1) {
										throw new RuntimeException("C3410-2");
									}
									local4761 = Static140.aClass109_1.method2779(local13);
									if (local4761.aChar3 != 's') {
										throw new RuntimeException("C3410-1");
									}
									anIntArray213[anInt3650++] = local4761.method1769(local1101) ? 1 : 0;
									return;
								}
								if (arg0 == 3411) {
									local13 = anIntArray213[--anInt3650];
									@Pc(4981) Class52 local4981 = Static140.aClass109_1.method2779(local13);
									anIntArray213[anInt3650++] = local4981.aClass4_31.method83();
									return;
								}
							} else if (arg0 < 3700) {
								if (arg0 == 3600) {
									if (Static235.anInt3363 == 0) {
										anIntArray213[anInt3650++] = -2;
										return;
									}
									if (Static235.anInt3363 == 1) {
										anIntArray213[anInt3650++] = -1;
										return;
									}
									anIntArray213[anInt3650++] = Static384.anInt7178;
									return;
								}
								if (arg0 == 3601) {
									local13 = anIntArray213[--anInt3650];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										aStringArray29[anInt3652++] = Static17.aStringArray43[local13];
										if (Static319.aStringArray54[local13] != null) {
											aStringArray29[anInt3652++] = Static319.aStringArray54[local13];
											return;
										}
										aStringArray29[anInt3652++] = "";
										return;
									}
									aStringArray29[anInt3652++] = "";
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3602) {
									local13 = anIntArray213[--anInt3650];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										anIntArray213[anInt3650++] = Static265.anIntArray333[local13];
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3603) {
									local13 = anIntArray213[--anInt3650];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										anIntArray213[anInt3650++] = Static114.anIntArray148[local13];
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3604) {
									local3493 = aStringArray29[--anInt3652];
									local19 = anIntArray213[--anInt3650];
									Static171.method3256(local19, local3493);
									return;
								}
								if (arg0 == 3605) {
									local3493 = aStringArray29[--anInt3652];
									Static61.method1669(local3493);
									return;
								}
								if (arg0 == 3606) {
									local3493 = aStringArray29[--anInt3652];
									Static34.method4828(local3493);
									return;
								}
								if (arg0 == 3607) {
									local3493 = aStringArray29[--anInt3652];
									Static309.method5279(local3493, false);
									return;
								}
								if (arg0 == 3608) {
									local3493 = aStringArray29[--anInt3652];
									Static258.method4404(local3493);
									return;
								}
								if (arg0 == 3609) {
									local3493 = aStringArray29[--anInt3652];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									anIntArray213[anInt3650++] = Static391.method6451(local3493) ? 1 : 0;
									return;
								}
								if (arg0 == 3610) {
									local13 = anIntArray213[--anInt3650];
									if (Static235.anInt3363 == 2 && local13 < Static384.anInt7178) {
										aStringArray29[anInt3652++] = Static209.aStringArray32[local13];
										return;
									}
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3611) {
									if (Static389.aString53 != null) {
										aStringArray29[anInt3652++] = Static330.method5657(Static389.aString53);
										return;
									}
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3612) {
									if (Static389.aString53 != null) {
										anIntArray213[anInt3650++] = Static186.anInt3730;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3613) {
									local13 = anIntArray213[--anInt3650];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										aStringArray29[anInt3652++] = Static47.aClass214Array1[local13].aString58;
										return;
									}
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3614) {
									local13 = anIntArray213[--anInt3650];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										anIntArray213[anInt3650++] = Static47.aClass214Array1[local13].anInt5978;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3615) {
									local13 = anIntArray213[--anInt3650];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										anIntArray213[anInt3650++] = Static47.aClass214Array1[local13].aByte65;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3616) {
									anIntArray213[anInt3650++] = Static265.aByte54;
									return;
								}
								if (arg0 == 3617) {
									local3493 = aStringArray29[--anInt3652];
									Static163.method3102(local3493);
									return;
								}
								if (arg0 == 3618) {
									anIntArray213[anInt3650++] = Static119.aByte25;
									return;
								}
								if (arg0 == 3619) {
									local3493 = aStringArray29[--anInt3652];
									Static115.method3841(local3493);
									return;
								}
								if (arg0 == 3620) {
									Static290.method5026();
									return;
								}
								if (arg0 == 3621) {
									if (Static235.anInt3363 == 0) {
										anIntArray213[anInt3650++] = -1;
										return;
									}
									anIntArray213[anInt3650++] = Static301.anInt5700;
									return;
								}
								if (arg0 == 3622) {
									local13 = anIntArray213[--anInt3650];
									if (Static235.anInt3363 != 0 && local13 < Static301.anInt5700) {
										aStringArray29[anInt3652++] = Static226.aStringArray35[local13];
										if (Static371.aStringArray66[local13] != null) {
											aStringArray29[anInt3652++] = Static371.aStringArray66[local13];
											return;
										}
										aStringArray29[anInt3652++] = "";
										return;
									}
									aStringArray29[anInt3652++] = "";
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3623) {
									local3493 = aStringArray29[--anInt3652];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									anIntArray213[anInt3650++] = Static105.method2208(local3493) ? 1 : 0;
									return;
								}
								if (arg0 == 3624) {
									local13 = anIntArray213[--anInt3650];
									if (Static47.aClass214Array1 != null && local13 < Static186.anInt3730 && Static47.aClass214Array1[local13].aString60.equalsIgnoreCase(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
										anIntArray213[anInt3650++] = 1;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3625) {
									if (Static169.aString25 != null) {
										aStringArray29[anInt3652++] = Static169.aString25;
										return;
									}
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3626) {
									local13 = anIntArray213[--anInt3650];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										aStringArray29[anInt3652++] = Static47.aClass214Array1[local13].aString61;
										return;
									}
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3627) {
									local13 = anIntArray213[--anInt3650];
									if (Static235.anInt3363 == 2 && local13 >= 0 && local13 < Static384.anInt7178) {
										anIntArray213[anInt3650++] = Static302.aBooleanArray13[local13] ? 1 : 0;
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 3628) {
									local3493 = aStringArray29[--anInt3652];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									anIntArray213[anInt3650++] = Static117.method2372(local3493);
									return;
								}
								if (arg0 == 3629) {
									anIntArray213[anInt3650++] = Static320.anInt6007;
									return;
								}
								if (arg0 == 3630) {
									local3493 = aStringArray29[--anInt3652];
									Static309.method5279(local3493, true);
									return;
								}
								if (arg0 == 3631) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static196.aBooleanArray31[local13] ? 1 : 0;
									return;
								}
								if (arg0 == 3632) {
									local13 = anIntArray213[--anInt3650];
									if (Static389.aString53 != null && local13 < Static186.anInt3730) {
										aStringArray29[anInt3652++] = Static47.aClass214Array1[local13].aString60;
										return;
									}
									aStringArray29[anInt3652++] = "";
									return;
								}
								if (arg0 == 3633) {
									local13 = anIntArray213[--anInt3650];
									if (Static235.anInt3363 != 0 && local13 < Static301.anInt5700) {
										aStringArray29[anInt3652++] = Static234.aStringArray39[local13];
										return;
									}
									aStringArray29[anInt3652++] = "";
									return;
								}
							} else if (arg0 < 4000) {
								if (arg0 == 3903) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static290.aClass187Array1[local13].method4683();
									return;
								}
								if (arg0 == 3904) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static290.aClass187Array1[local13].anInt5105;
									return;
								}
								if (arg0 == 3905) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static290.aClass187Array1[local13].anInt5108;
									return;
								}
								if (arg0 == 3906) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static290.aClass187Array1[local13].anInt5111;
									return;
								}
								if (arg0 == 3907) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static290.aClass187Array1[local13].anInt5106;
									return;
								}
								if (arg0 == 3908) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static290.aClass187Array1[local13].anInt5114;
									return;
								}
								if (arg0 == 3910) {
									local13 = anIntArray213[--anInt3650];
									local19 = Static290.aClass187Array1[local13].method4679();
									anIntArray213[anInt3650++] = local19 == 0 ? 1 : 0;
									return;
								}
								if (arg0 == 3911) {
									local13 = anIntArray213[--anInt3650];
									local19 = Static290.aClass187Array1[local13].method4679();
									anIntArray213[anInt3650++] = local19 == 2 ? 1 : 0;
									return;
								}
								if (arg0 == 3912) {
									local13 = anIntArray213[--anInt3650];
									local19 = Static290.aClass187Array1[local13].method4679();
									anIntArray213[anInt3650++] = local19 == 5 ? 1 : 0;
									return;
								}
								if (arg0 == 3913) {
									local13 = anIntArray213[--anInt3650];
									local19 = Static290.aClass187Array1[local13].method4679();
									anIntArray213[anInt3650++] = local19 == 1 ? 1 : 0;
									return;
								}
							} else if (arg0 < 4100) {
								if (arg0 == 4000) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 + local19;
									return;
								}
								if (arg0 == 4001) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 - local19;
									return;
								}
								if (arg0 == 4002) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 * local19;
									return;
								}
								if (arg0 == 4003) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 / local19;
									return;
								}
								if (arg0 == 4004) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = (int) (Math.random() * (double) local13);
									return;
								}
								if (arg0 == 4005) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = (int) (Math.random() * (double) (local13 + 1));
									return;
								}
								if (arg0 == 4006) {
									anInt3650 -= 5;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									local25 = anIntArray213[anInt3650 + 2];
									local353 = anIntArray213[anInt3650 + 3];
									local2194 = anIntArray213[anInt3650 + 4];
									anIntArray213[anInt3650++] = local13 + (local19 - local13) * (local2194 - local25) / (local353 - local25);
									return;
								}
								@Pc(6491) long local6491;
								@Pc(6484) long local6484;
								if (arg0 == 4007) {
									anInt3650 -= 2;
									local6484 = anIntArray213[anInt3650];
									local6491 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = (int) (local6484 + local6484 * local6491 / 100L);
									return;
								}
								if (arg0 == 4008) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 | 0x1 << local19;
									return;
								}
								if (arg0 == 4009) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 & -(0x1 << local19) - 1;
									return;
								}
								if (arg0 == 4010) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
									return;
								}
								if (arg0 == 4011) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 % local19;
									return;
								}
								if (arg0 == 4012) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									if (local13 == 0) {
										anIntArray213[anInt3650++] = 0;
										return;
									}
									anIntArray213[anInt3650++] = (int) Math.pow((double) local13, (double) local19);
									return;
								}
								if (arg0 == 4013) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									if (local13 == 0) {
										anIntArray213[anInt3650++] = 0;
										return;
									}
									if (local19 == 0) {
										anIntArray213[anInt3650++] = Integer.MAX_VALUE;
										return;
									}
									anIntArray213[anInt3650++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
									return;
								}
								if (arg0 == 4014) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 & local19;
									return;
								}
								if (arg0 == 4015) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 | local19;
									return;
								}
								if (arg0 == 4016) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 < local19 ? local13 : local19;
									return;
								}
								if (arg0 == 4017) {
									anInt3650 -= 2;
									local13 = anIntArray213[anInt3650];
									local19 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local13 > local19 ? local13 : local19;
									return;
								}
								if (arg0 == 4018) {
									anInt3650 -= 3;
									local6484 = anIntArray213[anInt3650];
									local6491 = anIntArray213[anInt3650 + 1];
									@Pc(6872) long local6872 = (long) anIntArray213[anInt3650 + 2];
									anIntArray213[anInt3650++] = (int) (local6484 * local6872 / local6491);
									return;
								}
							} else if (arg0 < 4200) {
								if (arg0 == 4100) {
									local3493 = aStringArray29[--anInt3652];
									local19 = anIntArray213[--anInt3650];
									aStringArray29[anInt3652++] = local3493 + local19;
									return;
								}
								if (arg0 == 4101) {
									anInt3652 -= 2;
									local3493 = aStringArray29[anInt3652];
									local1101 = aStringArray29[anInt3652 + 1];
									aStringArray29[anInt3652++] = local3493 + local1101;
									return;
								}
								if (arg0 == 4102) {
									local3493 = aStringArray29[--anInt3652];
									local19 = anIntArray213[--anInt3650];
									aStringArray29[anInt3652++] = local3493 + Static320.method5462(local19);
									return;
								}
								if (arg0 == 4103) {
									local3493 = aStringArray29[--anInt3652];
									aStringArray29[anInt3652++] = local3493.toLowerCase();
									return;
								}
								if (arg0 == 4104) {
									aStringArray29[anInt3652++] = method3594(anIntArray213[--anInt3650]);
									return;
								}
								if (arg0 == 4105) {
									anInt3652 -= 2;
									local3493 = aStringArray29[anInt3652];
									local1101 = aStringArray29[anInt3652 + 1];
									if (Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 != null && Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.aBoolean220) {
										aStringArray29[anInt3652++] = local1101;
										return;
									}
									aStringArray29[anInt3652++] = local3493;
									return;
								}
								if (arg0 == 4106) {
									local13 = anIntArray213[--anInt3650];
									aStringArray29[anInt3652++] = Integer.toString(local13);
									return;
								}
								if (arg0 == 4107) {
									anInt3652 -= 2;
									anIntArray213[anInt3650++] = StringUtils.compare(aStringArray29[anInt3652 + 1], aStringArray29[anInt3652], client.language);
									return;
								}
								@Pc(7155) Class239 local7155;
								if (arg0 == 4108) {
									local3493 = aStringArray29[--anInt3652];
									anInt3650 -= 2;
									local19 = anIntArray213[anInt3650];
									local25 = anIntArray213[anInt3650 + 1];
									local7155 = Static101.method2165(local25, Static255.aClass197_64);
									anIntArray213[anInt3650++] = local7155.method6123(local3493, local19, Static124.aClass13Array27);
									return;
								}
								if (arg0 == 4109) {
									local3493 = aStringArray29[--anInt3652];
									anInt3650 -= 2;
									local19 = anIntArray213[anInt3650];
									local25 = anIntArray213[anInt3650 + 1];
									local7155 = Static101.method2165(local25, Static255.aClass197_64);
									anIntArray213[anInt3650++] = local7155.method6124(Static124.aClass13Array27, local3493, local19);
									return;
								}
								if (arg0 == 4110) {
									anInt3652 -= 2;
									local3493 = aStringArray29[anInt3652];
									local1101 = aStringArray29[anInt3652 + 1];
									if (anIntArray213[--anInt3650] == 1) {
										aStringArray29[anInt3652++] = local3493;
										return;
									}
									aStringArray29[anInt3652++] = local1101;
									return;
								}
								if (arg0 == 4111) {
									local3493 = aStringArray29[--anInt3652];
									aStringArray29[anInt3652++] = Static153.method2772(local3493);
									return;
								}
								if (arg0 == 4112) {
									local3493 = aStringArray29[--anInt3652];
									local19 = anIntArray213[--anInt3650];
									if (local19 == -1) {
										throw new RuntimeException("null char");
									}
									aStringArray29[anInt3652++] = local3493 + (char) local19;
									return;
								}
								if (arg0 == 4113) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static146.method2697((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4114) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static89.method1939((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4115) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static35.method1103((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4116) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Static328.method5598((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4117) {
									local3493 = aStringArray29[--anInt3652];
									if (local3493 != null) {
										anIntArray213[anInt3650++] = local3493.length();
										return;
									}
									anIntArray213[anInt3650++] = 0;
									return;
								}
								if (arg0 == 4118) {
									local3493 = aStringArray29[--anInt3652];
									anInt3650 -= 2;
									local19 = anIntArray213[anInt3650];
									local25 = anIntArray213[anInt3650 + 1];
									aStringArray29[anInt3652++] = local3493.substring(local19, local25);
									return;
								}
								if (arg0 == 4119) {
									local3493 = aStringArray29[--anInt3652];
									@Pc(7518) StringBuffer local7518 = new StringBuffer(local3493.length());
									@Pc(7520) boolean local7520 = false;
									for (local353 = 0; local353 < local3493.length(); local353++) {
										@Pc(7527) char local7527 = local3493.charAt(local353);
										if (local7527 == '<') {
											local7520 = true;
										} else if (local7527 == '>') {
											local7520 = false;
										} else if (!local7520) {
											local7518.append(local7527);
										}
									}
									aStringArray29[anInt3652++] = local7518.toString();
									return;
								}
								if (arg0 == 4120) {
									local3493 = aStringArray29[--anInt3652];
									anInt3650 -= 2;
									local19 = anIntArray213[anInt3650];
									local25 = anIntArray213[anInt3650 + 1];
									anIntArray213[anInt3650++] = local3493.indexOf(local19, local25);
									return;
								}
								if (arg0 == 4121) {
									anInt3652 -= 2;
									local3493 = aStringArray29[anInt3652];
									local1101 = aStringArray29[anInt3652 + 1];
									local25 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = local3493.indexOf(local1101, local25);
									return;
								}
								if (arg0 == 4122) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Character.toLowerCase((char) local13);
									return;
								}
								if (arg0 == 4123) {
									local13 = anIntArray213[--anInt3650];
									anIntArray213[anInt3650++] = Character.toUpperCase((char) local13);
									return;
								}
								if (arg0 == 4124) {
									local412 = anIntArray213[--anInt3650] != 0;
									local19 = anIntArray213[--anInt3650];
									aStringArray29[anInt3652++] = Static172.method3289((long) local19, client.language, local412, 0);
									return;
								}
								if (arg0 == 4125) {
									local3493 = aStringArray29[--anInt3652];
									local19 = anIntArray213[--anInt3650];
									@Pc(7741) Class239 local7741 = Static101.method2165(local19, Static255.aClass197_64);
									anIntArray213[anInt3650++] = local7741.method6127(Static124.aClass13Array27, local3493);
									return;
								}
							} else {
								@Pc(8083) Class240 local8083;
								if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray213[--anInt3650];
										aStringArray29[anInt3652++] = Static313.aClass107_2.method2759(local13).aString55;
										return;
									}
									@Pc(7803) Class188 local7803;
									if (arg0 == 4201) {
										anInt3650 -= 2;
										local13 = anIntArray213[anInt3650];
										local19 = anIntArray213[anInt3650 + 1];
										local7803 = Static313.aClass107_2.method2759(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.aStringArray50[local19 - 1] != null) {
											aStringArray29[anInt3652++] = local7803.aStringArray50[local19 - 1];
											return;
										}
										aStringArray29[anInt3652++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3650 -= 2;
										local13 = anIntArray213[anInt3650];
										local19 = anIntArray213[anInt3650 + 1];
										local7803 = Static313.aClass107_2.method2759(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.aStringArray51[local19 - 1] != null) {
											aStringArray29[anInt3652++] = local7803.aStringArray51[local19 - 1];
											return;
										}
										aStringArray29[anInt3652++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray213[--anInt3650];
										anIntArray213[anInt3650++] = Static313.aClass107_2.method2759(local13).anInt5220;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray213[--anInt3650];
										anIntArray213[anInt3650++] = Static313.aClass107_2.method2759(local13).anInt5247 == 1 ? 1 : 0;
										return;
									}
									@Pc(7966) Class188 local7966;
									if (arg0 == 4205) {
										local13 = anIntArray213[--anInt3650];
										local7966 = Static313.aClass107_2.method2759(local13);
										if (local7966.anInt5258 == -1 && local7966.anInt5202 >= 0) {
											anIntArray213[anInt3650++] = local7966.anInt5202;
											return;
										}
										anIntArray213[anInt3650++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray213[--anInt3650];
										local7966 = Static313.aClass107_2.method2759(local13);
										if (local7966.anInt5258 >= 0 && local7966.anInt5202 >= 0) {
											anIntArray213[anInt3650++] = local7966.anInt5202;
											return;
										}
										anIntArray213[anInt3650++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray213[--anInt3650];
										anIntArray213[anInt3650++] = Static313.aClass107_2.method2759(local13).aBoolean382 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3650 -= 2;
										local13 = anIntArray213[anInt3650];
										local19 = anIntArray213[anInt3650 + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6263()) {
											aStringArray29[anInt3652++] = Static313.aClass107_2.method2759(local13).method4773(local8083.aString69, local19);
											return;
										}
										anIntArray213[anInt3650++] = Static313.aClass107_2.method2759(local13).method4772(local8083.anInt7023, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt3650 -= 2;
										local13 = anIntArray213[anInt3650];
										local19 = anIntArray213[anInt3650 + 1] - 1;
										local7803 = Static313.aClass107_2.method2759(local13);
										if (local7803.anInt5244 == local19) {
											anIntArray213[anInt3650++] = local7803.anInt5204;
											return;
										}
										if (local7803.anInt5221 == local19) {
											anIntArray213[anInt3650++] = local7803.anInt5240;
											return;
										}
										anIntArray213[anInt3650++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3493 = aStringArray29[--anInt3652];
										local19 = anIntArray213[--anInt3650];
										Static131.method3697(local3493, local19 == 1);
										anIntArray213[anInt3650++] = Static328.anInt6127;
										return;
									}
									if (arg0 == 4211) {
										if (Static177.aShortArray56 != null && Static12.anInt266 < Static328.anInt6127) {
											anIntArray213[anInt3650++] = Static177.aShortArray56[Static12.anInt266++] & 0xFFFF;
											return;
										}
										anIntArray213[anInt3650++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static12.anInt266 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3650 -= 2;
										local13 = anIntArray213[anInt3650];
										local19 = anIntArray213[anInt3650 + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6263()) {
											aStringArray29[anInt3652++] = Static6.aClass219_1.method5570(local13).method2090(local8083.aString69, local19);
											return;
										}
										anIntArray213[anInt3650++] = Static6.aClass219_1.method5570(local13).method2098(local8083.anInt7023, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3650 -= 2;
										local13 = anIntArray213[anInt3650];
										local19 = anIntArray213[anInt3650 + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6263()) {
											aStringArray29[anInt3652++] = Static359.aClass202_4.method5163(local13).method1520(local8083.aString69, local19);
											return;
										}
										anIntArray213[anInt3650++] = Static359.aClass202_4.method5163(local13).method1532(local8083.anInt7023, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3650 -= 2;
										local13 = anIntArray213[anInt3650];
										local19 = anIntArray213[anInt3650 + 1];
										local8083 = Static363.aClass18_2.method565(local19);
										if (local8083.method6263()) {
											aStringArray29[anInt3652++] = Static367.aClass132_1.method3471(local13).method1346(local19, local8083.aString69);
											return;
										}
										anIntArray213[anInt3650++] = Static367.aClass132_1.method3471(local13).method1343(local19, local8083.anInt7023);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray213[--anInt3650];
									@Pc(8467) Class222 local8467 = Static59.aClass7_1.method245(local13);
									if (local8467.anIntArray426 != null && local8467.anIntArray426.length > 0) {
										local25 = 0;
										local353 = local8467.anIntArray427[0];
										for (local2194 = 1; local2194 < local8467.anIntArray426.length; local2194++) {
											if (local8467.anIntArray427[local2194] > local353) {
												local25 = local2194;
												local353 = local8467.anIntArray427[local2194];
											}
										}
										anIntArray213[anInt3650++] = local8467.anIntArray426[local25];
										return;
									}
									anIntArray213[anInt3650++] = local8467.anInt6291;
									return;
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static6.method140(anIntArray213[--anInt3650]);
				} else {
					local137 = arg1 ? aClass161_10 : aClass161_9;
				}
				if (arg0 == 1000) {
					anInt3650 -= 4;
					local137.anInt4241 = anIntArray213[anInt3650];
					local137.anInt4249 = anIntArray213[anInt3650 + 1];
					local19 = anIntArray213[anInt3650 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray213[anInt3650 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte45 = (byte) local19;
					local137.aByte46 = (byte) local25;
					Static200.method3645(local137);
					Static58.method1624(local137);
					if (local137.anInt4297 == -1) {
						Static139.method2585(local137.anInt4317);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3650 -= 4;
					local137.anInt4294 = anIntArray213[anInt3650];
					local137.anInt4289 = anIntArray213[anInt3650 + 1];
					local137.anInt4251 = 0;
					local137.anInt4269 = 0;
					local19 = anIntArray213[anInt3650 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray213[anInt3650 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte47 = (byte) local19;
					local137.aByte44 = (byte) local25;
					Static200.method3645(local137);
					Static58.method1624(local137);
					if (local137.anInt4272 == 0) {
						Static85.method1911(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray213[--anInt3650] == 1;
					if (local137.aBoolean284 != local620) {
						local137.aBoolean284 = local620;
						Static200.method3645(local137);
					}
					if (local137.anInt4297 == -1) {
						Static216.method3778(local137.anInt4317);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3650 -= 2;
					local137.anInt4243 = anIntArray213[anInt3650];
					local137.anInt4291 = anIntArray213[anInt3650 + 1];
					Static200.method3645(local137);
					Static58.method1624(local137);
					if (local137.anInt4272 == 0) {
						Static85.method1911(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean295 = anIntArray213[--anInt3650] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!bc;II)V")
	public static void method3596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub11 local5 = Static185.method3399(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray212 = new int[local5.anInt3225];
		aStringArray30 = new String[local5.anInt3228];
		if (local5.aClass16_4 == Static383.aClass16_9 || local5.aClass16_4 == Static309.aClass16_7 || local5.aClass16_4 == Static3.aClass16_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static227.aClass161_11 != null) {
				local30 = Static227.aClass161_11.anInt4305;
				local32 = Static227.aClass161_11.anInt4254;
			}
			anIntArray212[0] = Static226.aClass119_1.method3304() - local30;
			anIntArray212[1] = Static226.aClass119_1.method3313() - local32;
		}
		method3600(local5, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	private static void method3597(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = Static6.method140(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class161[] local13 = Static113.aClass161ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class161[] local19 = Static26.aClass161ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static113.aClass161ArrayArray2[local9] = new Class161[local22];
			Static404.method4609(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static404.method4609(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	public static void method3598(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static222.method3916(arg0)) {
			return;
		}
		@Pc(12) Class161[] local12 = Static26.aClass161ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class161 local19 = local12[local14];
			if (local19.anObjectArray22 != null) {
				@Pc(26) Class2_Sub13 local26 = new Class2_Sub13();
				local26.aClass161_3 = local19;
				local26.anObjectArray4 = local19.anObjectArray22;
				method3593(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V")
	private static void runScript(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1292) boolean local1292;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(89) int local89;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray213[anInt3650++] = Static20.anInt545;
				return;
			}
			if (arg0 == 5001) {
				anInt3650 -= 3;
				Static20.anInt545 = anIntArray213[anInt3650];
				Static154.aClass170_2 = Static335.method5695(anIntArray213[anInt3650 + 1]);
				if (Static154.aClass170_2 == null) {
					Static154.aClass170_2 = Static329.aClass170_4;
				}
				Static331.anInt6206 = anIntArray213[anInt3650 + 2];
				Static91.method1960(Static32.aClass145_32);
				Protocol.outboundBuffer.p1(Static20.anInt545);
				Protocol.outboundBuffer.p1(Static154.aClass170_2.anInt4690);
				Protocol.outboundBuffer.p1(Static331.anInt6206);
				return;
			}
			if (arg0 == 5002) {
				anInt3652 -= 2;
				local75 = aStringArray29[anInt3652];
				local81 = aStringArray29[anInt3652 + 1];
				anInt3650 -= 2;
				local89 = anIntArray213[anInt3650];
				local95 = anIntArray213[anInt3650 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static91.method1960(Static327.aClass145_222);
				Protocol.outboundBuffer.p1(Static27.method872(local75) + Static27.method872(local81) + 2);
				Protocol.outboundBuffer.pjstr(local75);
				Protocol.outboundBuffer.p1(local89 - 1);
				Protocol.outboundBuffer.p1(local95);
				Protocol.outboundBuffer.pjstr(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray213[--anInt3650];
				local81 = null;
				if (local157 < 100) {
					local81 = Static88.aStringArray13[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray29[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray213[--anInt3650];
				local192 = -1;
				if (local157 < 100 && Static88.aStringArray13[local157] != null) {
					local192 = Static291.anIntArray373[local157];
				}
				anIntArray213[anInt3650++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static154.aClass170_2 == null) {
					anIntArray213[anInt3650++] = -1;
					return;
				}
				anIntArray213[anInt3650++] = Static154.aClass170_2.anInt4690;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = aStringArray29[--anInt3652];
				method3592(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3652 -= 2;
				local75 = aStringArray29[anInt3652];
				local81 = aStringArray29[anInt3652 + 1];
				if (Static4.anInt90 != 0 || (!Static56.aBoolean123 || Static101.aBoolean159) && !Static109.aBoolean166) {
					Static91.method1960(Static382.aClass145_261);
					Protocol.outboundBuffer.p1(0);
					local89 = Protocol.outboundBuffer.pos;
					Protocol.outboundBuffer.pjstr(local75);
					Static120.method2379(local81, Protocol.outboundBuffer);
					Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray213[--anInt3650];
				local81 = null;
				if (local157 < 100) {
					local81 = Static42.aStringArray59[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray29[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray213[--anInt3650];
				local81 = null;
				if (local157 < 100) {
					local81 = Static135.aStringArray20[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray29[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray213[--anInt3650];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static132.anIntArray162[local157];
				}
				anIntArray213[anInt3650++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static17.aClass11_Sub5_Sub2_Sub1_3 == null || Static17.aClass11_Sub5_Sub2_Sub1_3.aString42 == null) {
					local75 = Static374.aString70;
				} else {
					local75 = Static17.aClass11_Sub5_Sub2_Sub1_3.method4072();
				}
				aStringArray29[anInt3652++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray213[anInt3650++] = Static331.anInt6206;
				return;
			}
			if (arg0 == 5017) {
				anIntArray213[anInt3650++] = Static226.anInt4016;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray213[--anInt3650];
				local192 = 0;
				if (local157 < 100 && Static88.aStringArray13[local157] != null) {
					local192 = Static291.anIntArray373[local157];
				}
				anIntArray213[anInt3650++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray213[--anInt3650];
				local81 = null;
				if (local157 < 100) {
					local81 = Static169.aStringArray26[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray29[anInt3652++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static17.aClass11_Sub5_Sub2_Sub1_3 == null || Static17.aClass11_Sub5_Sub2_Sub1_3.aString42 == null) {
					local75 = Static374.aString70;
				} else {
					local75 = Static17.aClass11_Sub5_Sub2_Sub1_3.method4070();
				}
				aStringArray29[anInt3652++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray213[--anInt3650];
				aStringArray29[anInt3652++] = Static138.method2581(local157).aString37;
				return;
			}
			@Pc(584) Class2_Sub2_Sub12 local584;
			if (arg0 == 5051) {
				local157 = anIntArray213[--anInt3650];
				local584 = Static138.method2581(local157);
				if (local584.anIntArray233 == null) {
					anIntArray213[anInt3650++] = 0;
					return;
				}
				anIntArray213[anInt3650++] = local584.anIntArray233.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				@Pc(628) Class2_Sub2_Sub12 local628 = Static138.method2581(local157);
				local95 = local628.anIntArray233[local192];
				anIntArray213[anInt3650++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray213[--anInt3650];
				local584 = Static138.method2581(local157);
				if (local584.anIntArray232 == null) {
					anIntArray213[anInt3650++] = 0;
					return;
				}
				anIntArray213[anInt3650++] = local584.anIntArray232.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				anIntArray213[anInt3650++] = Static138.method2581(local157).anIntArray232[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray213[--anInt3650];
				aStringArray29[anInt3652++] = Static146.method2699(local157).method5601();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray213[--anInt3650];
				@Pc(750) Class2_Sub2_Sub16 local750 = Static146.method2699(local157);
				if (local750.anIntArray418 == null) {
					anIntArray213[anInt3650++] = 0;
					return;
				}
				anIntArray213[anInt3650++] = local750.anIntArray418.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				anIntArray213[anInt3650++] = Static146.method2699(local157).anIntArray418[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass86_1 = new Class86();
				aClass86_1.anInt2377 = anIntArray213[--anInt3650];
				aClass86_1.aClass2_Sub2_Sub16_1 = Static146.method2699(aClass86_1.anInt2377);
				aClass86_1.anIntArray151 = new int[aClass86_1.aClass2_Sub2_Sub16_1.method5603()];
				return;
			}
			if (arg0 == 5059) {
				Static91.method1960(Static369.aClass145_248);
				Protocol.outboundBuffer.p1(0);
				local157 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p1(0);
				Protocol.outboundBuffer.p2(aClass86_1.anInt2377);
				aClass86_1.aClass2_Sub2_Sub16_1.method5597(Protocol.outboundBuffer, aClass86_1.anIntArray151);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray29[--anInt3652];
				Static91.method1960(Static325.aClass145_220);
				Protocol.outboundBuffer.p1(0);
				local192 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.pjstr(local75);
				Protocol.outboundBuffer.p2(aClass86_1.anInt2377);
				aClass86_1.aClass2_Sub2_Sub16_1.method5597(Protocol.outboundBuffer, aClass86_1.anIntArray151);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local192);
				return;
			}
			if (arg0 == 5061) {
				Static91.method1960(Static369.aClass145_248);
				Protocol.outboundBuffer.p1(0);
				local157 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p1(1);
				Protocol.outboundBuffer.p2(aClass86_1.anInt2377);
				aClass86_1.aClass2_Sub2_Sub16_1.method5597(Protocol.outboundBuffer, aClass86_1.anIntArray151);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				anIntArray213[anInt3650++] = Static138.method2581(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				anIntArray213[anInt3650++] = Static138.method2581(local157).aCharArray5[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				if (local192 == -1) {
					anIntArray213[anInt3650++] = -1;
					return;
				}
				anIntArray213[anInt3650++] = Static138.method2581(local157).method3794((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				if (local192 == -1) {
					anIntArray213[anInt3650++] = -1;
					return;
				}
				anIntArray213[anInt3650++] = Static138.method2581(local157).method3798((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray213[--anInt3650];
				anIntArray213[anInt3650++] = Static146.method2699(local157).method5603();
				return;
			}
			if (arg0 == 5067) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				local89 = Static146.method2699(local157).method5596(local192);
				anIntArray213[anInt3650++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				aClass86_1.anIntArray151[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3650 -= 2;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				aClass86_1.anIntArray151[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3650 -= 3;
				local157 = anIntArray213[anInt3650];
				local192 = anIntArray213[anInt3650 + 1];
				local89 = anIntArray213[anInt3650 + 2];
				@Pc(1245) Class2_Sub2_Sub16 local1245 = Static146.method2699(local157);
				if (local1245.method5596(local192) != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray213[anInt3650++] = local1245.method5600(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray29[--anInt3652];
				local1292 = anIntArray213[--anInt3650] == 1;
				Static272.method4593(local1292, local75);
				anIntArray213[anInt3650++] = Static328.anInt6127;
				return;
			}
			if (arg0 == 5072) {
				if (Static177.aShortArray56 != null && Static12.anInt266 < Static328.anInt6127) {
					anIntArray213[anInt3650++] = Static177.aShortArray56[Static12.anInt266++] & 0xFFFF;
					return;
				}
				anIntArray213[anInt3650++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static12.anInt266 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static174.aClass123_2.method3343(86)) {
					anIntArray213[anInt3650++] = 1;
					return;
				}
				anIntArray213[anInt3650++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static174.aClass123_2.method3343(82)) {
					anIntArray213[anInt3650++] = 1;
					return;
				}
				anIntArray213[anInt3650++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static174.aClass123_2.method3343(81)) {
					anIntArray213[anInt3650++] = 1;
					return;
				}
				anIntArray213[anInt3650++] = 0;
				return;
			}
		} else {
			@Pc(1903) boolean local1903;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static211.method3722(anIntArray213[--anInt3650]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray213[anInt3650++] = Static333.method6331();
					return;
				}
				if (arg0 == 5205) {
					Static258.method4402(false, -1, anIntArray213[--anInt3650], -1);
					return;
				}
				@Pc(1492) Class2_Sub2_Sub17 local1492;
				if (arg0 == 5206) {
					local157 = anIntArray213[--anInt3650];
					local1492 = Static344.method5527(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1492 == null) {
						anIntArray213[anInt3650++] = -1;
						return;
					}
					anIntArray213[anInt3650++] = local1492.anInt6869;
					return;
				}
				@Pc(1525) Class2_Sub2_Sub17 local1525;
				if (arg0 == 5207) {
					local1525 = Static344.method5514(anIntArray213[--anInt3650]);
					if (local1525 != null && local1525.aString66 != null) {
						aStringArray29[anInt3652++] = local1525.aString66;
						return;
					}
					aStringArray29[anInt3652++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray213[anInt3650++] = Static44.anInt1105;
					anIntArray213[anInt3650++] = Static368.anInt6930;
					return;
				}
				if (arg0 == 5209) {
					anIntArray213[anInt3650++] = Static151.anInt2772 + Static344.anInt6057;
					anIntArray213[anInt3650++] = Static96.anInt2003 + Static344.anInt6055;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray213[--anInt3650];
					local1492 = Static344.method5514(local157);
					if (local1492 == null) {
						anIntArray213[anInt3650++] = 0;
						anIntArray213[anInt3650++] = 0;
						return;
					}
					anIntArray213[anInt3650++] = local1492.anInt6872 >> 14 & 0x3FFF;
					anIntArray213[anInt3650++] = local1492.anInt6872 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray213[--anInt3650];
					local1492 = Static344.method5514(local157);
					if (local1492 == null) {
						anIntArray213[anInt3650++] = 0;
						anIntArray213[anInt3650++] = 0;
						return;
					}
					anIntArray213[anInt3650++] = local1492.anInt6868 - local1492.anInt6870;
					anIntArray213[anInt3650++] = local1492.anInt6874 - local1492.anInt6863;
					return;
				}
				@Pc(1715) Class2_Sub20 local1715;
				if (arg0 == 5212) {
					local1715 = Static209.method3713();
					if (local1715 == null) {
						anIntArray213[anInt3650++] = -1;
						anIntArray213[anInt3650++] = -1;
						return;
					}
					anIntArray213[anInt3650++] = local1715.anInt2947;
					local192 = local1715.anInt2946 << 28 | local1715.anInt2949 + Static344.anInt6057 << 14 | local1715.anInt2952 + Static344.anInt6055;
					anIntArray213[anInt3650++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1715 = Static115.method3829();
					if (local1715 == null) {
						anIntArray213[anInt3650++] = -1;
						anIntArray213[anInt3650++] = -1;
						return;
					}
					anIntArray213[anInt3650++] = local1715.anInt2947;
					local192 = local1715.anInt2946 << 28 | local1715.anInt2949 + Static344.anInt6057 << 14 | local1715.anInt2952 + Static344.anInt6055;
					anIntArray213[anInt3650++] = local192;
					return;
				}
				@Pc(1863) boolean local1863;
				if (arg0 == 5214) {
					local157 = anIntArray213[--anInt3650];
					local1492 = Static378.method6312();
					if (local1492 != null) {
						local1863 = local1492.method6145(local157 >> 28 & 0x3, anIntArray215, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							Static15.method394(anIntArray215[2], anIntArray215[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3650 -= 2;
					local157 = anIntArray213[anInt3650];
					local192 = anIntArray213[anInt3650 + 1];
					@Pc(1901) Class246 local1901 = Static344.method5516(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1903 = false;
					for (@Pc(1908) Class2_Sub2_Sub17 local1908 = (Class2_Sub2_Sub17) local1901.method6337(); local1908 != null; local1908 = (Class2_Sub2_Sub17) local1901.method6336()) {
						if (local1908.anInt6869 == local192) {
							local1903 = true;
							break;
						}
					}
					if (local1903) {
						anIntArray213[anInt3650++] = 1;
						return;
					}
					anIntArray213[anInt3650++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray213[--anInt3650];
					local1492 = Static344.method5514(local157);
					if (local1492 == null) {
						anIntArray213[anInt3650++] = -1;
						return;
					}
					anIntArray213[anInt3650++] = local1492.anInt6875;
					return;
				}
				if (arg0 == 5220) {
					anIntArray213[anInt3650++] = Static355.anInt6581 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray213[--anInt3650];
					Static15.method394(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1525 = Static378.method6312();
					if (local1525 != null) {
						local1292 = local1525.method6149(anIntArray215, Static96.anInt2003 + Static344.anInt6055, Static151.anInt2772 + Static344.anInt6057);
						if (local1292) {
							anIntArray213[anInt3650++] = anIntArray215[1];
							anIntArray213[anInt3650++] = anIntArray215[2];
							return;
						}
						anIntArray213[anInt3650++] = -1;
						anIntArray213[anInt3650++] = -1;
						return;
					}
					anIntArray213[anInt3650++] = -1;
					anIntArray213[anInt3650++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3650 -= 2;
					local157 = anIntArray213[anInt3650];
					local192 = anIntArray213[anInt3650 + 1];
					Static258.method4402(false, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray213[--anInt3650];
					local1492 = Static378.method6312();
					if (local1492 != null) {
						local1863 = local1492.method6145(local157 >> 28 & 0x3, anIntArray215, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							anIntArray213[anInt3650++] = anIntArray215[1];
							anIntArray213[anInt3650++] = anIntArray215[2];
							return;
						}
						anIntArray213[anInt3650++] = -1;
						anIntArray213[anInt3650++] = -1;
						return;
					}
					anIntArray213[anInt3650++] = -1;
					anIntArray213[anInt3650++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray213[--anInt3650];
					local1492 = Static378.method6312();
					if (local1492 != null) {
						local1863 = local1492.method6149(anIntArray215, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1863) {
							anIntArray213[anInt3650++] = anIntArray215[1];
							anIntArray213[anInt3650++] = anIntArray215[2];
							return;
						}
						anIntArray213[anInt3650++] = -1;
						anIntArray213[anInt3650++] = -1;
						return;
					}
					anIntArray213[anInt3650++] = -1;
					anIntArray213[anInt3650++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static225.method3955(anIntArray213[--anInt3650]);
					return;
				}
				if (arg0 == 5227) {
					anInt3650 -= 2;
					local157 = anIntArray213[anInt3650];
					local192 = anIntArray213[anInt3650 + 1];
					Static258.method4402(true, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static175.aBoolean225 = anIntArray213[--anInt3650] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray213[anInt3650++] = Static175.aBoolean225 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray213[--anInt3650];
					Static232.method4027(local157);
					return;
				}
				@Pc(2421) Class2 local2421;
				if (arg0 == 5231) {
					anInt3650 -= 2;
					local157 = anIntArray213[anInt3650];
					local1292 = anIntArray213[anInt3650 + 1] == 1;
					if (Static141.aClass4_58 != null) {
						local2421 = Static141.aClass4_58.method90((long) local157);
						if (local2421 != null && !local1292) {
							local2421.method6468();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Class2();
							Static141.aClass4_58.method87(local2421, (long) local157);
						}
					}
					return;
				}
				@Pc(2463) Class2 local2463;
				if (arg0 == 5232) {
					local157 = anIntArray213[--anInt3650];
					if (Static141.aClass4_58 != null) {
						local2463 = Static141.aClass4_58.method90((long) local157);
						anIntArray213[anInt3650++] = local2463 == null ? 0 : 1;
						return;
					}
					anIntArray213[anInt3650++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3650 -= 2;
					local157 = anIntArray213[anInt3650];
					local1292 = anIntArray213[anInt3650 + 1] == 1;
					if (Static220.aClass4_83 != null) {
						local2421 = Static220.aClass4_83.method90((long) local157);
						if (local2421 != null && !local1292) {
							local2421.method6468();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Class2();
							Static220.aClass4_83.method87(local2421, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray213[--anInt3650];
					if (Static220.aClass4_83 != null) {
						local2463 = Static220.aClass4_83.method90((long) local157);
						anIntArray213[anInt3650++] = local2463 == null ? 0 : 1;
						return;
					}
					anIntArray213[anInt3650++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray213[anInt3650++] = Static344.aClass2_Sub2_Sub17_3 == null ? -1 : Static344.aClass2_Sub2_Sub17_3.anInt6869;
					return;
				}
			} else {
				@Pc(2717) int local2717;
				if (arg0 < 5400) {
					if (arg0 == 5300) {
						anInt3650 -= 2;
						local157 = anIntArray213[anInt3650];
						local192 = anIntArray213[anInt3650 + 1];
						Static143.method2677(local192, 3, false, local157);
						anIntArray213[anInt3650++] = Static363.aFrame2 == null ? 0 : 1;
						return;
					}
					if (arg0 == 5301) {
						if (Static363.aFrame2 != null) {
							Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
						}
						return;
					}
					if (arg0 == 5302) {
						@Pc(2654) Class169[] local2654 = Static63.method1703();
						anIntArray213[anInt3650++] = local2654.length;
						return;
					}
					if (arg0 == 5303) {
						local157 = anIntArray213[--anInt3650];
						@Pc(2678) Class169[] local2678 = Static63.method1703();
						anIntArray213[anInt3650++] = local2678[local157].anInt4685;
						anIntArray213[anInt3650++] = local2678[local157].anInt4684;
						return;
					}
					if (arg0 == 5305) {
						local157 = Static218.aClass177_Sub1_2.anInt4884;
						local192 = Static218.aClass177_Sub1_2.anInt4893;
						local89 = -1;
						@Pc(2715) Class169[] local2715 = Static63.method1703();
						for (local2717 = 0; local2717 < local2715.length; local2717++) {
							@Pc(2722) Class169 local2722 = local2715[local2717];
							if (local2722.anInt4685 == local157 && local2722.anInt4684 == local192) {
								local89 = local2717;
								break;
							}
						}
						anIntArray213[anInt3650++] = local89;
						return;
					}
					if (arg0 == 5306) {
						anIntArray213[anInt3650++] = Static144.method2692();
						return;
					}
					if (arg0 == 5307) {
						local157 = anIntArray213[--anInt3650];
						if (local157 >= 1 && local157 <= 2) {
							Static143.method2677(-1, local157, false, -1);
							return;
						}
						return;
					}
					if (arg0 == 5308) {
						anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4894;
						return;
					}
					if (arg0 == 5309) {
						local157 = anIntArray213[--anInt3650];
						if (local157 >= 1 && local157 <= 2) {
							Static218.aClass177_Sub1_2.anInt4894 = local157;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						return;
					}
				} else {
					@Pc(3230) String local3230;
					if (arg0 < 5500) {
						if (arg0 == 5400) {
							anInt3652 -= 2;
							local75 = aStringArray29[anInt3652];
							local81 = aStringArray29[anInt3652 + 1];
							local89 = anIntArray213[--anInt3650];
							Static91.method1960(Static323.aClass145_219);
							Protocol.outboundBuffer.p1(Static27.method872(local75) + Static27.method872(local81) + 1);
							Protocol.outboundBuffer.pjstr(local75);
							Protocol.outboundBuffer.pjstr(local81);
							Protocol.outboundBuffer.p1(local89);
							return;
						}
						if (arg0 == 5401) {
							anInt3650 -= 2;
							Static257.aShortArray79[anIntArray213[anInt3650]] = (short) Static376.method6285(anIntArray213[anInt3650 + 1]);
							Static313.aClass107_2.method2767();
							Static313.aClass107_2.method2760();
							Static6.aClass219_1.method5572();
							Static98.method2107();
							return;
						}
						if (arg0 == 5405) {
							anInt3650 -= 2;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							if (local157 >= 0 && local157 < 2) {
								Static364.anIntArrayArrayArray13[local157] = new int[local192 << 1][4];
							}
							return;
						}
						if (arg0 == 5406) {
							anInt3650 -= 7;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1] << 1;
							local89 = anIntArray213[anInt3650 + 2];
							local95 = anIntArray213[anInt3650 + 3];
							local2717 = anIntArray213[anInt3650 + 4];
							@Pc(2990) int local2990 = anIntArray213[anInt3650 + 5];
							@Pc(2996) int local2996 = anIntArray213[anInt3650 + 6];
							if (local157 >= 0 && local157 < 2 && Static364.anIntArrayArrayArray13[local157] != null && local192 >= 0 && local192 < Static364.anIntArrayArrayArray13[local157].length) {
								Static364.anIntArrayArrayArray13[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) * 128, local95, (local89 & 0x3FFF) * 128, local2996 };
								Static364.anIntArrayArrayArray13[local157][local192 + 1] = new int[] { (local2717 >> 14 & 0x3FFF) * 128, local2990, (local2717 & 0x3FFF) * 128 };
							}
							return;
						}
						if (arg0 == 5407) {
							local157 = Static364.anIntArrayArrayArray13[anIntArray213[--anInt3650]].length >> 1;
							anIntArray213[anInt3650++] = local157;
							return;
						}
						if (arg0 == 5411) {
							if (Static363.aFrame2 != null) {
								Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
							}
							if (GameShell.frame != null) {
								Static340.method5765();
								System.exit(0);
								return;
							}
							local75 = Static307.aString57 == null ? Static200.method3650() : Static307.aString57;
							Static280.method4765(local75, GameShell.signlink, Static77.anInt1762 == 1, false);
							return;
						}
						if (arg0 == 5419) {
							local75 = "";
							if (Static354.aClass32_5 != null) {
								if (Static354.aClass32_5.result == null) {
									local75 = Static150.method2739(Static354.aClass32_5.intArg1);
								} else {
									local75 = (String) Static354.aClass32_5.result;
								}
							}
							aStringArray29[anInt3652++] = local75;
							return;
						}
						if (arg0 == 5420) {
							anIntArray213[anInt3650++] = Static215.anInt3795 == 3 ? 1 : 0;
							return;
						}
						if (arg0 == 5421) {
							if (Static363.aFrame2 != null) {
								Static143.method2677(-1, Static218.aClass177_Sub1_2.anInt4894, false, -1);
							}
							local75 = aStringArray29[--anInt3652];
							local1292 = anIntArray213[--anInt3650] == 1;
							local3230 = Static200.method3650() + local75;
							Static280.method4765(local3230, GameShell.signlink, Static77.anInt1762 == 1, local1292);
							return;
						}
						if (arg0 == 5422) {
							anInt3652 -= 2;
							local75 = aStringArray29[anInt3652];
							local81 = aStringArray29[anInt3652 + 1];
							local89 = anIntArray213[--anInt3650];
							if (local75.length() > 0) {
								if (Static129.aStringArray19 == null) {
									Static129.aStringArray19 = new String[Static342.anIntArray384[client.game.anInt1553]];
								}
								Static129.aStringArray19[local89] = local75;
							}
							if (local81.length() > 0) {
								if (Static333.aStringArray67 == null) {
									Static333.aStringArray67 = new String[Static342.anIntArray384[client.game.anInt1553]];
								}
								Static333.aStringArray67[local89] = local81;
							}
							return;
						}
						if (arg0 == 5423) {
							System.out.println(aStringArray29[--anInt3652]);
							return;
						}
						if (arg0 == 5424) {
							anInt3650 -= 11;
							Static242.anInt4446 = anIntArray213[anInt3650];
							Static260.anInt6717 = anIntArray213[anInt3650 + 1];
							Static200.anInt3697 = anIntArray213[anInt3650 + 2];
							Static86.anInt1868 = anIntArray213[anInt3650 + 3];
							Static186.anInt3731 = anIntArray213[anInt3650 + 4];
							Static67.anInt1636 = anIntArray213[anInt3650 + 5];
							Static74.anInt1722 = anIntArray213[anInt3650 + 6];
							Static363.anInt6804 = anIntArray213[anInt3650 + 7];
							Static390.anInt7211 = anIntArray213[anInt3650 + 8];
							Static322.anInt6030 = anIntArray213[anInt3650 + 9];
							Static381.anInt7118 = anIntArray213[anInt3650 + 10];
							Static30.aClass197_5.method5087(Static186.anInt3731);
							Static30.aClass197_5.method5087(Static67.anInt1636);
							Static30.aClass197_5.method5087(Static74.anInt1722);
							Static30.aClass197_5.method5087(Static363.anInt6804);
							Static30.aClass197_5.method5087(Static390.anInt7211);
							Static337.aClass13_17 = null;
							Static110.aClass13_6 = null;
							Static35.aClass13_3 = null;
							Static75.aClass13_5 = null;
							Static138.aClass13_8 = null;
							Static197.aClass13_12 = null;
							Static339.aClass13_18 = null;
							Static211.aClass13_13 = null;
							Static270.aBoolean371 = true;
							return;
						}
						if (arg0 == 5425) {
							Static190.method3502();
							Static270.aBoolean371 = false;
							return;
						}
						if (arg0 == 5426) {
							anInt3650 -= 2;
							Static394.anInt7263 = anIntArray213[anInt3650];
							Static91.anInt1910 = anIntArray213[anInt3650 + 1];
							return;
						}
						if (arg0 == 5427) {
							anInt3650 -= 2;
							Static135.anInt2523 = anIntArray213[anInt3650 + 1];
							return;
						}
						if (arg0 == 5428) {
							anInt3650 -= 2;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							anIntArray213[anInt3650++] = Static281.method4785(local192, local157) ? 1 : 0;
							return;
						}
						if (arg0 == 5429) {
							Static161.method2972(aStringArray29[--anInt3652], false);
							return;
						}
					} else if (arg0 < 5600) {
						if (arg0 == 5500) {
							anInt3650 -= 4;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							local95 = anIntArray213[anInt3650 + 3];
							Static51.method1545((local157 & 0x3FFF) - Static148.anInt2719, local89, local95, false, local192, (local157 >> 14 & 0x3FFF) - Static164.anInt3140);
							return;
						}
						if (arg0 == 5501) {
							anInt3650 -= 4;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							local95 = anIntArray213[anInt3650 + 3];
							Static33.method4203(local89, local192, (local157 & 0x3FFF) - Static148.anInt2719, local95, (local157 >> 14 & 0x3FFF) - Static164.anInt3140);
							return;
						}
						if (arg0 == 5502) {
							anInt3650 -= 6;
							local157 = anIntArray213[anInt3650];
							if (local157 >= 2) {
								throw new RuntimeException();
							}
							Static147.anInt2717 = local157;
							local192 = anIntArray213[anInt3650 + 1];
							if (local192 + 1 >= Static364.anIntArrayArrayArray13[Static147.anInt2717].length >> 1) {
								throw new RuntimeException();
							}
							Static295.anInt5567 = local192;
							Static353.anInt6533 = 0;
							Static41.anInt1038 = anIntArray213[anInt3650 + 2];
							Static217.anInt3821 = anIntArray213[anInt3650 + 3];
							local89 = anIntArray213[anInt3650 + 4];
							if (local89 >= 2) {
								throw new RuntimeException();
							}
							Static349.anInt6455 = local89;
							local95 = anIntArray213[anInt3650 + 5];
							if (local95 + 1 >= Static364.anIntArrayArrayArray13[Static349.anInt6455].length >> 1) {
								throw new RuntimeException();
							}
							Static343.anInt6398 = local95;
							Static314.anInt5911 = 3;
							return;
						}
						if (arg0 == 5503) {
							Static117.method2369();
							return;
						}
						if (arg0 == 5504) {
							anInt3650 -= 2;
							Static231.method4022(anIntArray213[anInt3650], anIntArray213[anInt3650 + 1]);
							return;
						}
						if (arg0 == 5505) {
							anIntArray213[anInt3650++] = (int) Static31.aFloat28 >> 3;
							return;
						}
						if (arg0 == 5506) {
							anIntArray213[anInt3650++] = (int) Static277.aFloat67 >> 3;
							return;
						}
						if (arg0 == 5507) {
							Static350.method5837();
							return;
						}
						if (arg0 == 5508) {
							Static121.method2396();
							return;
						}
						if (arg0 == 5509) {
							Static352.method5880();
							return;
						}
						if (arg0 == 5510) {
							Static26.method862();
							return;
						}
						if (arg0 == 5511) {
							local157 = anIntArray213[--anInt3650];
							local192 = local157 >> 14 & 0x3FFF;
							local89 = local157 & 0x3FFF;
							local192 -= Static164.anInt3140;
							if (local192 < 0) {
								local192 = 0;
							} else if (local192 >= Static373.anInt7033) {
								local192 = Static373.anInt7033;
							}
							local89 -= Static148.anInt2719;
							if (local89 < 0) {
								local89 = 0;
							} else if (local89 >= Static242.anInt4449) {
								local89 = Static242.anInt4449;
							}
							Static394.anInt7264 = local192 * 128 + 64;
							Static348.anInt6448 = local89 * 128 + 64;
							Static314.anInt5911 = 4;
							return;
						}
						if (arg0 == 5512) {
							Static351.method5859();
							return;
						}
					} else if (arg0 < 5700) {
						if (arg0 == 5600) {
							anInt3652 -= 2;
							local75 = aStringArray29[anInt3652];
							local81 = aStringArray29[anInt3652 + 1];
							local89 = anIntArray213[--anInt3650];
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.anInt6441 == 0 && Static141.anInt2652 == 0 && WorldList.step == 0) {
								Static97.method2087(local81, local75, local89);
								return;
							}
							return;
						}
						if (arg0 == 5601) {
							Static319.method5435();
							return;
						}
						if (arg0 == 5602) {
							if (Static347.anInt6441 == 0) {
								Static41.anInt1046 = -2;
							}
							return;
						}
						if (arg0 == 5603) {
							anInt3650 -= 4;
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.anInt6441 == 0 && Static141.anInt2652 == 0 && WorldList.step == 0) {
								Static352.method5876(anIntArray213[anInt3650 + 3], anIntArray213[anInt3650 + 2], anIntArray213[anInt3650], anIntArray213[anInt3650 + 1]);
								return;
							}
							return;
						}
						if (arg0 == 5604) {
							anInt3652--;
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.anInt6441 == 0 && Static141.anInt2652 == 0 && WorldList.step == 0) {
								Static72.method1809(Static80.toBase37(aStringArray29[anInt3652]));
								return;
							}
							return;
						}
						if (arg0 == 5605) {
							anInt3652 -= 3;
							anInt3650 -= 7;
							if (Static347.anInt6442 != 10) {
								return;
							}
							if (Static154.anInt2803 == 0 && Static347.anInt6441 == 0 && Static141.anInt2652 == 0 && WorldList.step == 0) {
								Static389.method4488(aStringArray29[anInt3652 + 1], anIntArray213[anInt3650], anIntArray213[anInt3650 + 3], anIntArray213[anInt3650 + 4] == 1, Static80.toBase37(aStringArray29[anInt3652]), anIntArray213[anInt3650 + 2], anIntArray213[anInt3650 + 1], anIntArray213[anInt3650 + 6] == 1, anIntArray213[anInt3650 + 5] == 1, aStringArray29[anInt3652 + 2]);
								return;
							}
							return;
						}
						if (arg0 == 5606) {
							if (Static141.anInt2652 == 0) {
								Static318.anInt5968 = -2;
							}
							return;
						}
						if (arg0 == 5607) {
							anIntArray213[anInt3650++] = Static41.anInt1046;
							return;
						}
						if (arg0 == 5608) {
							anIntArray213[anInt3650++] = Static47.anInt1248;
							return;
						}
						if (arg0 == 5609) {
							anIntArray213[anInt3650++] = Static318.anInt5968;
							return;
						}
						if (arg0 == 5610) {
							for (local157 = 0; local157 < 5; local157++) {
								aStringArray29[anInt3652++] = Static163.aStringArray23.length > local157 ? Static330.method5657(Static163.aStringArray23[local157]) : "";
							}
							Static163.aStringArray23 = null;
							return;
						}
						if (arg0 == 5611) {
							anIntArray213[anInt3650++] = Static360.anInt6186;
							return;
						}
					} else if (arg0 < 6100) {
						if (arg0 == 6001) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 1) {
								local157 = 1;
							}
							if (local157 > 4) {
								local157 = 4;
							}
							Static218.aClass177_Sub1_2.anInt4879 = local157;
							Static347.method5827();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6002) {
							Static218.aClass177_Sub1_2.method4493(anIntArray213[--anInt3650] == 1);
							Static347.method5827();
							Static226.method3982();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6003) {
							Static218.aClass177_Sub1_2.aBoolean349 = anIntArray213[--anInt3650] == 1;
							Static226.method3982();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6005) {
							Static218.aClass177_Sub1_2.aBoolean359 = anIntArray213[--anInt3650] == 1;
							Static347.method5827();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6006) {
							Static218.aClass177_Sub1_2.aBoolean350 = anIntArray213[--anInt3650] == 1;
							Static190.aClass19_8.method2874(!Static218.aClass177_Sub1_2.aBoolean350);
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6007) {
							Static218.aClass177_Sub1_2.anInt4895 = anIntArray213[--anInt3650];
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6008) {
							Static218.aClass177_Sub1_2.aBoolean353 = anIntArray213[--anInt3650] == 1;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6009) {
							Static218.aClass177_Sub1_2.aBoolean355 = anIntArray213[--anInt3650] == 1;
							Static347.method5827();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6010) {
							Static218.aClass177_Sub1_2.aBoolean358 = anIntArray213[--anInt3650] == 1;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6011) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4886 = local157;
							Static347.method5827();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6012) {
							Static218.aClass177_Sub1_2.aBoolean364 = anIntArray213[--anInt3650] == 1;
							Static174.method1506();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6014) {
							Static218.aClass177_Sub1_2.aBoolean361 = anIntArray213[--anInt3650] == 1;
							Static347.method5827();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6015) {
							Static218.aClass177_Sub1_2.aBoolean348 = anIntArray213[--anInt3650] == 1;
							Static347.method5827();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6016) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4885 = local157;
							Static353.method5883();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						if (arg0 == 6017) {
							Static218.aClass177_Sub1_2.aBoolean352 = anIntArray213[--anInt3650] == 1;
							Static178.method2342();
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6018) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static218.aClass177_Sub1_2.anInt4888 = local157;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6019) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 255) {
								local157 = 255;
							}
							if (local157 != Static218.aClass177_Sub1_2.anInt4889) {
								if (Static218.aClass177_Sub1_2.anInt4889 == 0 && Static171.anInt3268 != -1) {
									Static94.method2042(local157, Static171.anInt3268, Static101.aClass197_23);
									Static393.aBoolean486 = false;
								} else if (local157 == 0) {
									Static368.method6192();
									Static393.aBoolean486 = false;
								} else {
									Static303.method5211(local157);
								}
								Static218.aClass177_Sub1_2.anInt4889 = local157;
							}
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6020) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static218.aClass177_Sub1_2.anInt4882 = local157;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6021) {
							Static218.aClass177_Sub1_2.aBoolean366 = anIntArray213[--anInt3650] == 1;
							Static226.method3982();
							return;
						}
						if (arg0 == 6023) {
							local157 = anIntArray213[--anInt3650];
							local1292 = false;
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 2) {
								local157 = 2;
							}
							if (Static309.anInt5802 < 96) {
								local157 = 0;
								local1292 = true;
							}
							Static26.method864(local157);
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							anIntArray213[anInt3650++] = local1292 ? 0 : 1;
							return;
						}
						if (arg0 == 6024) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4891 = local157;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						if (arg0 == 6025) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > Static289.method5019(Static309.anInt5802)) {
								local157 = 0;
							}
							Static218.aClass177_Sub1_2.anInt4883 = local157;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6027) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > 1) {
								local157 = 0;
							}
							Static284.method4882(local157 == 1);
							return;
						}
						if (arg0 == 6028) {
							Static218.aClass177_Sub1_2.aBoolean363 = anIntArray213[--anInt3650] != 0;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						if (arg0 == 6029) {
							Static218.aClass177_Sub1_2.anInt4895 = anIntArray213[--anInt3650];
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						if (arg0 == 6030) {
							Static218.aClass177_Sub1_2.aBoolean357 = anIntArray213[--anInt3650] != 0;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static347.method5827();
							return;
						}
						if (arg0 == 6031) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static78.method5701(local157);
							return;
						}
						if (arg0 == 6032) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static218.aClass177_Sub1_2.anInt4878 = local157;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							Static236.aBoolean288 = false;
							return;
						}
						if (arg0 == 6033) {
							local157 = anIntArray213[--anInt3650];
							if (local157 < 0 || local157 > 4) {
								local157 = 2;
							}
							Static218.aClass177_Sub1_2.anInt4881 = local157;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						if (arg0 == 6035) {
							Static218.aClass177_Sub1_2.aBoolean365 = anIntArray213[--anInt3650] == 1;
							Static347.method5827();
							Static226.method3982();
							return;
						}
					} else if (arg0 < 6200) {
						if (arg0 == 6101) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4879;
							return;
						}
						if (arg0 == 6102) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.method4496(Static77.anInt1762) ? 1 : 0;
							return;
						}
						if (arg0 == 6103) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean349 ? 1 : 0;
							return;
						}
						if (arg0 == 6105) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean359 ? 1 : 0;
							return;
						}
						if (arg0 == 6106) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean350 ? 1 : 0;
							return;
						}
						if (arg0 == 6107) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4895;
							return;
						}
						if (arg0 == 6108) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean353 ? 1 : 0;
							return;
						}
						if (arg0 == 6109) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean355 ? 1 : 0;
							return;
						}
						if (arg0 == 6110) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean358 ? 1 : 0;
							return;
						}
						if (arg0 == 6111) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4886;
							return;
						}
						if (arg0 == 6112) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean364 ? 1 : 0;
							return;
						}
						if (arg0 == 6114) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean361 ? 1 : 0;
							return;
						}
						if (arg0 == 6115) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean348 ? 1 : 0;
							return;
						}
						if (arg0 == 6116) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4885;
							return;
						}
						if (arg0 == 6117) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean352 ? 1 : 0;
							return;
						}
						if (arg0 == 6118) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4888;
							return;
						}
						if (arg0 == 6119) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4889;
							return;
						}
						if (arg0 == 6120) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4882;
							return;
						}
						if (arg0 == 6121) {
							anIntArray213[anInt3650++] = Static190.aClass19_8.method2894() ? 1 : 0;
							return;
						}
						if (arg0 == 6123) {
							anIntArray213[anInt3650++] = Static184.method3391();
							return;
						}
						if (arg0 == 6124) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4891;
							return;
						}
						if (arg0 == 6125) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4883;
							return;
						}
						if (arg0 == 6126) {
							anIntArray213[anInt3650++] = Static190.aClass19_8.method2858() ? 1 : 0;
							return;
						}
						if (arg0 == 6127) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean356 ? 1 : 0;
							return;
						}
						if (arg0 == 6128) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean363 ? 1 : 0;
							return;
						}
						if (arg0 == 6129) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4895;
							return;
						}
						if (arg0 == 6130) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean357 ? 1 : 0;
							return;
						}
						if (arg0 == 6131) {
							anIntArray213[anInt3650++] = Static77.anInt1762;
							return;
						}
						if (arg0 == 6132) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4878;
							return;
						}
						if (arg0 == 6133) {
							anIntArray213[anInt3650++] = Static215.anInt3795 == 1 || Static215.anInt3795 == 4 ? 1 : 0;
							return;
						}
						if (arg0 == 6134) {
							anIntArray213[anInt3650++] = Static289.method5019(Static309.anInt5802);
							return;
						}
						if (arg0 == 6135) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4881;
							return;
						}
					} else if (arg0 < 6300) {
						if (arg0 == 6200) {
							anInt3650 -= 2;
							Static254.aShort73 = (short) anIntArray213[anInt3650];
							if (Static254.aShort73 <= 0) {
								Static254.aShort73 = 256;
							}
							Static258.aShort78 = (short) anIntArray213[anInt3650 + 1];
							if (Static258.aShort78 <= 0) {
								Static258.aShort78 = 205;
							}
							return;
						}
						if (arg0 == 6201) {
							anInt3650 -= 2;
							Static271.aShort79 = (short) anIntArray213[anInt3650];
							if (Static271.aShort79 <= 0) {
								Static271.aShort79 = 256;
							}
							Static120.aShort36 = (short) anIntArray213[anInt3650 + 1];
							if (Static120.aShort36 <= 0) {
								Static120.aShort36 = 320;
							}
							return;
						}
						if (arg0 == 6202) {
							anInt3650 -= 4;
							Static78.aShort86 = (short) anIntArray213[anInt3650];
							if (Static78.aShort86 <= 0) {
								Static78.aShort86 = 1;
							}
							Static120.aShort35 = (short) anIntArray213[anInt3650 + 1];
							if (Static120.aShort35 <= 0) {
								Static120.aShort35 = 32767;
							} else if (Static120.aShort35 < Static78.aShort86) {
								Static120.aShort35 = Static78.aShort86;
							}
							Static353.aShort92 = (short) anIntArray213[anInt3650 + 2];
							if (Static353.aShort92 <= 0) {
								Static353.aShort92 = 1;
							}
							Static68.aShort19 = (short) anIntArray213[anInt3650 + 3];
							if (Static68.aShort19 <= 0) {
								Static68.aShort19 = 32767;
								return;
							}
							if (Static68.aShort19 < Static353.aShort92) {
								Static68.aShort19 = Static353.aShort92;
							}
							return;
						}
						if (arg0 == 6203) {
							Static308.method5273(0, Static20.aClass161_1.anInt4261, false, Static20.aClass161_1.anInt4248, 0);
							anIntArray213[anInt3650++] = Static155.anInt2808;
							anIntArray213[anInt3650++] = Static180.anInt3408;
							return;
						}
						if (arg0 == 6204) {
							anIntArray213[anInt3650++] = Static271.aShort79;
							anIntArray213[anInt3650++] = Static120.aShort36;
							return;
						}
						if (arg0 == 6205) {
							anIntArray213[anInt3650++] = Static254.aShort73;
							anIntArray213[anInt3650++] = Static258.aShort78;
							return;
						}
					} else if (arg0 < 6400) {
						if (arg0 == 6300) {
							anIntArray213[anInt3650++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
							return;
						}
						if (arg0 == 6301) {
							anIntArray213[anInt3650++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6302) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							aCalendar1.clear();
							aCalendar1.set(11, 12);
							aCalendar1.set(local89, local192, local157);
							anIntArray213[anInt3650++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6303) {
							aCalendar1.clear();
							aCalendar1.setTime(new Date(MonotonicClock.currentTimeMillis()));
							anIntArray213[anInt3650++] = aCalendar1.get(1);
							return;
						}
						if (arg0 == 6304) {
							local157 = anIntArray213[--anInt3650];
							local1292 = true;
							if (local157 < 0) {
								local1292 = (local157 + 1) % 4 == 0;
							} else if (local157 < 1582) {
								local1292 = local157 % 4 == 0;
							} else if (local157 % 4 != 0) {
								local1292 = false;
							} else if (local157 % 100 != 0) {
								local1292 = true;
							} else if (local157 % 400 != 0) {
								local1292 = false;
							}
							anIntArray213[anInt3650++] = local1292 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6500) {
						if (arg0 == 6405) {
							anIntArray213[anInt3650++] = Static79.method1870() ? 1 : 0;
							return;
						}
						if (arg0 == 6406) {
							anIntArray213[anInt3650++] = Static331.method5660() ? 1 : 0;
							return;
						}
					} else if (arg0 < 6600) {
						if (arg0 == 6500) {
							if (Static347.anInt6442 == 10 && Static154.anInt2803 == 0 && Static347.anInt6441 == 0 && Static141.anInt2652 == 0) {
								anIntArray213[anInt3650++] = WorldList.fetch() == -1 ? 0 : 1;
								return;
							}
							anIntArray213[anInt3650++] = 1;
							return;
						}
						@Pc(5979) Country local5979;
						@Pc(5946) World local5946;
						if (arg0 == 6501) {
							local5946 = WorldList.head();
							if (local5946 != null) {
								anIntArray213[anInt3650++] = local5946.id;
								anIntArray213[anInt3650++] = local5946.flags;
								aStringArray29[anInt3652++] = local5946.activity;
								local5979 = local5946.getCountry();
								anIntArray213[anInt3650++] = local5979.flag;
								aStringArray29[anInt3652++] = local5979.name;
								anIntArray213[anInt3650++] = local5946.players;
								anIntArray213[anInt3650++] = local5946.ping;
								return;
							}
							anIntArray213[anInt3650++] = -1;
							anIntArray213[anInt3650++] = 0;
							aStringArray29[anInt3652++] = "";
							anIntArray213[anInt3650++] = 0;
							aStringArray29[anInt3652++] = "";
							anIntArray213[anInt3650++] = 0;
							anIntArray213[anInt3650++] = 0;
							return;
						}
						if (arg0 == 6502) {
							local5946 = WorldList.next();
							if (local5946 != null) {
								anIntArray213[anInt3650++] = local5946.id;
								anIntArray213[anInt3650++] = local5946.flags;
								aStringArray29[anInt3652++] = local5946.activity;
								local5979 = local5946.getCountry();
								anIntArray213[anInt3650++] = local5979.flag;
								aStringArray29[anInt3652++] = local5979.name;
								anIntArray213[anInt3650++] = local5946.players;
								anIntArray213[anInt3650++] = local5946.ping;
								return;
							}
							anIntArray213[anInt3650++] = -1;
							anIntArray213[anInt3650++] = 0;
							aStringArray29[anInt3652++] = "";
							anIntArray213[anInt3650++] = 0;
							aStringArray29[anInt3652++] = "";
							anIntArray213[anInt3650++] = 0;
							anIntArray213[anInt3650++] = 0;
							return;
						}
						if (arg0 == 6503) {
							local157 = anIntArray213[--anInt3650];
							if (Static347.anInt6442 == 10 && Static154.anInt2803 == 0 && Static347.anInt6441 == 0 && Static141.anInt2652 == 0) {
								anIntArray213[anInt3650++] = WorldList.switchWorld(local157) ? 1 : 0;
								return;
							}
							anIntArray213[anInt3650++] = 0;
							return;
						}
						if (arg0 == 6504) {
							Static218.aClass177_Sub1_2.anInt4887 = anIntArray213[--anInt3650];
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						if (arg0 == 6505) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.anInt4887;
							return;
						}
						if (arg0 == 6506) {
							local157 = anIntArray213[--anInt3650];
							@Pc(6295) World local6295 = WorldList.get(local157);
							if (local6295 != null) {
								anIntArray213[anInt3650++] = local6295.flags;
								aStringArray29[anInt3652++] = local6295.activity;
								@Pc(6319) Country local6319 = local6295.getCountry();
								anIntArray213[anInt3650++] = local6319.flag;
								aStringArray29[anInt3652++] = local6319.name;
								anIntArray213[anInt3650++] = local6295.players;
								anIntArray213[anInt3650++] = local6295.ping;
								return;
							}
							anIntArray213[anInt3650++] = -1;
							aStringArray29[anInt3652++] = "";
							anIntArray213[anInt3650++] = 0;
							aStringArray29[anInt3652++] = "";
							anIntArray213[anInt3650++] = 0;
							anIntArray213[anInt3650++] = 0;
							return;
						}
						if (arg0 == 6507) {
							anInt3650 -= 4;
							local157 = anIntArray213[anInt3650];
							local1292 = anIntArray213[anInt3650 + 1] == 1;
							local89 = anIntArray213[anInt3650 + 2];
							local1903 = anIntArray213[anInt3650 + 3] == 1;
							WorldList.sort(local1292, local1903, local89, local157);
							return;
						}
						if (arg0 == 6508) {
							Static200.method3644();
							return;
						}
						if (arg0 == 6509) {
							if (Static347.anInt6442 != 10) {
								return;
							}
							WorldList.refreshing = anIntArray213[--anInt3650] == 1;
							return;
						}
					} else if (arg0 < 6700) {
						if (arg0 == 6600) {
							Static218.aClass177_Sub1_2.aBoolean351 = anIntArray213[--anInt3650] == 1;
							Static218.aClass177_Sub1_2.method4497(GameShell.signlink);
							return;
						}
						if (arg0 == 6601) {
							anIntArray213[anInt3650++] = Static218.aClass177_Sub1_2.aBoolean351 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6800 && client.modeWhat == client.MODE_ENV_WIP) {
						if (arg0 == 6700) {
							local157 = Static329.aClass4_130.method83();
							if (Static139.anInt2595 != -1) {
								local157++;
							}
							anIntArray213[anInt3650++] = local157;
							return;
						}
						if (arg0 == 6701) {
							local157 = anIntArray213[--anInt3650];
							if (Static139.anInt2595 != -1) {
								if (local157 == 0) {
									anIntArray213[anInt3650++] = Static139.anInt2595;
									return;
								}
								local157--;
							}
							@Pc(6577) Class2_Sub7 local6577 = (Class2_Sub7) Static329.aClass4_130.method80();
							while (local157-- > 0) {
								local6577 = (Class2_Sub7) Static329.aClass4_130.method79();
							}
							anIntArray213[anInt3650++] = local6577.anInt1370;
							return;
						}
						if (arg0 == 6702) {
							local157 = anIntArray213[--anInt3650];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								aStringArray29[anInt3652++] = "";
								return;
							}
							local81 = Static26.aClass161ArrayArray1[local157][0].aString43;
							if (local81 == null) {
								aStringArray29[anInt3652++] = "";
								return;
							}
							aStringArray29[anInt3652++] = local81.substring(0, local81.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local157 = anIntArray213[--anInt3650];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								anIntArray213[anInt3650++] = 0;
								return;
							}
							anIntArray213[anInt3650++] = Static26.aClass161ArrayArray1[local157].length;
							return;
						}
						if (arg0 == 6704) {
							anInt3650 -= 2;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								aStringArray29[anInt3652++] = "";
								return;
							}
							local3230 = Static26.aClass161ArrayArray1[local157][local192].aString43;
							if (local3230 == null) {
								aStringArray29[anInt3652++] = "";
								return;
							}
							aStringArray29[anInt3652++] = local3230;
							return;
						}
						if (arg0 == 6705) {
							anInt3650 -= 2;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								anIntArray213[anInt3650++] = 0;
								return;
							}
							anIntArray213[anInt3650++] = Static26.aClass161ArrayArray1[local157][local192].anInt4246;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 1, "", local89);
							return;
						}
						if (arg0 == 6708) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 2, "", local89);
							return;
						}
						if (arg0 == 6709) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 3, "", local89);
							return;
						}
						if (arg0 == 6710) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 4, "", local89);
							return;
						}
						if (arg0 == 6711) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 5, "", local89);
							return;
						}
						if (arg0 == 6712) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 6, "", local89);
							return;
						}
						if (arg0 == 6713) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 7, "", local89);
							return;
						}
						if (arg0 == 6714) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 8, "", local89);
							return;
						}
						if (arg0 == 6715) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 9, "", local89);
							return;
						}
						if (arg0 == 6716) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							Static277.method4681(local157 << 16 | local192, 10, "", local89);
							return;
						}
						if (arg0 == 6717) {
							anInt3650 -= 3;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							local89 = anIntArray213[anInt3650 + 2];
							@Pc(7165) Class161 local7165 = Static207.method3705(local157 << 16 | local192, local89);
							Static207.method3699();
							@Pc(7170) Class2_Sub10 local7170 = Static45.method1404(local7165);
							Static185.method3400(local7165.anInt4238, local7170.method1852(), local157 << 16 | local192, local89, local7165.anInt4286, local7170.anInt1759);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(7207) Class164 local7207;
						if (arg0 == 6800) {
							local157 = anIntArray213[--anInt3650];
							local7207 = Static236.aClass125_1.method3379(local157);
							if (local7207.aString48 == null) {
								aStringArray29[anInt3652++] = "";
								return;
							}
							aStringArray29[anInt3652++] = local7207.aString48;
							return;
						}
						if (arg0 == 6801) {
							local157 = anIntArray213[--anInt3650];
							local7207 = Static236.aClass125_1.method3379(local157);
							anIntArray213[anInt3650++] = local7207.anInt4420;
							return;
						}
						if (arg0 == 6802) {
							local157 = anIntArray213[--anInt3650];
							local7207 = Static236.aClass125_1.method3379(local157);
							anIntArray213[anInt3650++] = local7207.anInt4418;
							return;
						}
						if (arg0 == 6803) {
							local157 = anIntArray213[--anInt3650];
							local7207 = Static236.aClass125_1.method3379(local157);
							anIntArray213[anInt3650++] = local7207.anInt4424;
							return;
						}
						if (arg0 == 6804) {
							anInt3650 -= 2;
							local157 = anIntArray213[anInt3650];
							local192 = anIntArray213[anInt3650 + 1];
							@Pc(7329) Class240 local7329 = Static363.aClass18_2.method565(local192);
							if (local7329.method6263()) {
								aStringArray29[anInt3652++] = Static236.aClass125_1.method3379(local157).method4185(local192, local7329.aString69);
								return;
							}
							anIntArray213[anInt3650++] = Static236.aClass125_1.method3379(local157).method4188(local7329.anInt7023, local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!js;I)V")
	private static void method3600(@OriginalArg(0) Class2_Sub2_Sub11 arg0, @OriginalArg(1) int arg1) {
		anInt3650 = 0;
		anInt3652 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray199;
		@Pc(11) int[] local11 = arg0.anIntArray200;
		@Pc(13) byte local13 = -1;
		anInt3661 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method3595(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						runScript(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray213[anInt3650++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray213[anInt3650++] = Static214.aClass226_1.anIntArray430[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static214.aClass226_1.method5780(local54, anIntArray213[--anInt3650]);
					} else if (local31 == 3) {
						aStringArray29[anInt3652++] = arg0.aStringArray27[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3650 -= 2;
						if (anIntArray213[anInt3650] != anIntArray213[anInt3650 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3650 -= 2;
						if (anIntArray213[anInt3650] == anIntArray213[anInt3650 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3650 -= 2;
						if (anIntArray213[anInt3650] < anIntArray213[anInt3650 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3650 -= 2;
						if (anIntArray213[anInt3650] > anIntArray213[anInt3650 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3661 == 0) {
							return;
						}
						@Pc(216) Class172 local216 = aClass172Array1[--anInt3661];
						arg0 = local216.aClass2_Sub2_Sub11_1;
						local8 = arg0.anIntArray199;
						local11 = arg0.anIntArray200;
						local5 = local216.anInt4704;
						anIntArray212 = local216.anIntArray319;
						aStringArray30 = local216.aStringArray47;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray213[anInt3650++] = Static214.aClass226_1.method5778(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static214.aClass226_1.method5779(local54, anIntArray213[--anInt3650]);
					} else if (local31 == 31) {
						anInt3650 -= 2;
						if (anIntArray213[anInt3650] <= anIntArray213[anInt3650 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3650 -= 2;
						if (anIntArray213[anInt3650] >= anIntArray213[anInt3650 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray213[anInt3650++] = anIntArray212[local11[local5]];
					} else if (local31 == 34) {
						anIntArray212[local11[local5]] = anIntArray213[--anInt3650];
					} else if (local31 == 35) {
						aStringArray29[anInt3652++] = aStringArray30[local11[local5]];
					} else if (local31 == 36) {
						aStringArray30[local11[local5]] = aStringArray29[--anInt3652];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3652 -= local54;
						@Pc(400) String local400 = Static89.method1940(anInt3652, aStringArray29, local54);
						aStringArray29[anInt3652++] = local400;
					} else if (local31 == 38) {
						anInt3650--;
					} else if (local31 == 39) {
						anInt3652--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub2_Sub11 local436 = Static295.method5100(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3225];
							@Pc(450) String[] local450 = new String[local436.anInt3228];
							for (local452 = 0; local452 < local436.anInt3230; local452++) {
								local446[local452] = anIntArray213[anInt3650 + local452 - local436.anInt3230];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3227; local471++) {
								local450[local471] = aStringArray29[anInt3652 + local471 - local436.anInt3227];
							}
							anInt3650 -= local436.anInt3230;
							anInt3652 -= local436.anInt3227;
							@Pc(502) Class172 local502 = new Class172();
							local502.aClass2_Sub2_Sub11_1 = arg0;
							local502.anInt4704 = local5;
							local502.anIntArray319 = anIntArray212;
							local502.aStringArray47 = aStringArray30;
							if (anInt3661 >= aClass172Array1.length) {
								throw new RuntimeException();
							}
							aClass172Array1[anInt3661++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray199;
							local11 = local436.anIntArray200;
							local5 = -1;
							anIntArray212 = local446;
							aStringArray30 = local450;
						} else if (local31 == 42) {
							anIntArray213[anInt3650++] = Static75.anIntArray117[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static75.anIntArray117[local54] = anIntArray213[--anInt3650];
							Static226.method3983(local54);
							Static273.aBoolean374 |= Static89.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray213[--anInt3650];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray214[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray27[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray213[--anInt3650];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							anIntArray213[anInt3650++] = anIntArrayArray27[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3650 -= 2;
							local603 = anIntArray213[anInt3650];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray27[local54][local603] = anIntArray213[anInt3650 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static75.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray29[anInt3652++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static75.aStringArray11[local54] = aStringArray29[--anInt3652];
							Static290.method5023(local54);
						} else if (local31 == 51) {
							@Pc(774) Class4 local774 = arg0.aClass4Array1[local11[local5]];
							@Pc(787) Class2_Sub39 local787 = (Class2_Sub39) local774.method90((long) anIntArray213[--anInt3650]);
							if (local787 != null) {
								local5 += local787.anInt6818;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString27 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong232).append(" ");
				for (local603 = anInt3661 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass172Array1[local603].aClass2_Sub2_Sub11_1.aLong232).append(" ");
				}
				local855.append("op: ").append(local13);
				Static262.report(local837, local855.toString());
			} else {
				Static207.method3700("Clientscript error in: " + arg0.aString27);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString27).append("\n");
				for (local603 = anInt3661 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass172Array1[local603].aClass2_Sub2_Sub11_1.aString27).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static262.report(local837, local855.toString());
				Static158.method2940(local855.toString());
			}
		}
	}
}
