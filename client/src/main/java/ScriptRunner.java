import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class ScriptRunner {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATCOL_YELLOW = new LocalizedString("yellow:", "gelb:", "jaune:", "amarelo:");
	@OriginalMember(owner = "client!cu", name = "u", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATCOL_RED = new LocalizedString("red:", "rot:", "rouge:", "vermelho:");
	@OriginalMember(owner = "client!ab", name = "H", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATCOL_GREEN = new LocalizedString("green:", "grün:", "vert:", "verde:");
	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATCOL_CYAN = new LocalizedString("cyan:", "blaugrün:", "cyan:", "cyan:");
	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATCOL_PURPLE = new LocalizedString("purple:", "lila:", "violet:", "roxo:");
	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_17 = new LocalizedString("white:", "weiss:", "blanc:", "branco:");
	@OriginalMember(owner = "client!ft", name = "S", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_45 = new LocalizedString("flash1:", "blinken1:", "clignotant1:", "flash1:");
	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_57 = new LocalizedString("flash2:", "blinken2:", "clignotant2:", "flash2:");
	@OriginalMember(owner = "client!lm", name = "s", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_120 = new LocalizedString("flash3:", "blinken3:", "clignotant3:", "brilho3:");
	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_24 = new LocalizedString("glow1:", "leuchten1:", "brillant1:", "brilho1:");
	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_113 = new LocalizedString("glow2:", "leuchten2:", "brillant2:", "brilho2:");
	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATCOL_GLOW3 = new LocalizedString("glow3:", "leuchten3:", "brillant3:", "brilho3:");
	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATEFF_WAVE = new LocalizedString("wave:", "welle:", "ondulation:", "onda:");
	@OriginalMember(owner = "client!qm", name = "O", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_114 = new LocalizedString("wave2:", "welle2:", "ondulation2:", "onda2:");
	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_39 = new LocalizedString("shake:", "schütteln:", "tremblement:", "tremor:");
	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_70 = new LocalizedString("scroll:", "scrollen:", "déroulement:", "rolagem:");
	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Lclient!gd;")
	public static final LocalizedString CHATEFF_SLIDE = new LocalizedString("slide:", "gleiten:", "glissement:", "deslizamento:");
	@OriginalMember(owner = "client!ok", name = "g", descriptor = "S")
	public static short aShort73 = 256;
	@OriginalMember(owner = "client!oo", name = "i", descriptor = "S")
	public static short aShort78 = 205;
	@OriginalMember(owner = "client!pj", name = "w", descriptor = "S")
	public static short aShort79 = 256;
	@OriginalMember(owner = "client!gs", name = "l", descriptor = "S")
	public static short aShort36 = 320;
	@OriginalMember(owner = "client!ei", name = "i", descriptor = "S")
	public static short aShort86 = 1;
	@OriginalMember(owner = "client!gs", name = "j", descriptor = "S")
	public static short aShort35 = 32767;
	@OriginalMember(owner = "client!ui", name = "p", descriptor = "S")
	public static short aShort92 = 1;
	@OriginalMember(owner = "client!dt", name = "k", descriptor = "S")
	public static short aShort19 = 32767;
	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
	private static int[] anIntArray212;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray30;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!gr;")
	private static QuickChatPhrase activePhrase;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Lclient!nk;")
	private static Class161 staticActiveComponent2;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Lclient!nk;")
	private static Class161 staticActiveComponent1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	private static int isp = 0;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "[Ljava/lang/String;")
	private static final String[] stringStack = new String[1000];

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "[Lclient!ol;")
	private static final Class172[] aClass172Array1 = new Class172[50];

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	private static int ssp = 0;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "[I")
	private static final int[] intStack = new int[1000];

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	private static int anInt3661 = 0;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar calendar = Calendar.getInstance();

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "[[I")
	private static final int[][] anIntArrayArray27 = new int[5][5000];

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "[I")
	private static final int[] anIntArray214 = new int[5];

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "[I")
	private static final int[] anIntArray215 = new int[3];

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_30 = new LruHashTable(4);

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray31 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	private static void method3590(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = InterfaceList.getComponent(arg0);
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
					local41 = arg0.aClass161_3 == null ? -1 : arg0.aClass161_3.id;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2118;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass161_3 == null ? -1 : arg0.aClass161_3.activeComponentId;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass161_4 == null ? -1 : arg0.aClass161_4.id;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass161_4 == null ? -1 : arg0.aClass161_4.activeComponentId;
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
		calendar.setTime(new Date(local6));
		@Pc(16) int local16 = calendar.get(5);
		@Pc(20) int local20 = calendar.get(2);
		@Pc(24) int local24 = calendar.get(1);
		return local16 + "-" + aStringArray31[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V")
	private static void runScript5000(@OriginalArg(0) int opcode, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class161 local137;
		@Pc(25) int local25;
		@Pc(35) Class161 local35;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(210) Class161 local210;
		@Pc(13) int local13;
		if (opcode < 300) {
			if (opcode == 100) {
				isp -= 3;
				local13 = intStack[isp];
				local19 = intStack[isp + 1];
				local25 = intStack[isp + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = InterfaceList.getComponent(local13);
				if (local35.activeComponents == null) {
					local35.activeComponents = new Class161[local25 + 1];
				}
				if (local35.activeComponents.length <= local25) {
					@Pc(54) Class161[] local54 = new Class161[local25 + 1];
					for (local56 = 0; local56 < local35.activeComponents.length; local56++) {
						local54[local56] = local35.activeComponents[local56];
					}
					local35.activeComponents = local54;
				}
				if (local25 > 0 && local35.activeComponents[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class161 local99 = new Class161();
				local99.type = local19;
				local99.anInt4275 = local99.id = local35.id;
				local99.activeComponentId = local25;
				local35.activeComponents[local25] = local99;
				if (arg1) {
					staticActiveComponent1 = local99;
				} else {
					staticActiveComponent2 = local99;
				}
				InterfaceList.redraw(local35);
				return;
			}
			@Pc(158) Class161 local158;
			if (opcode == 101) {
				local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
				if (local137.activeComponentId == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = InterfaceList.getComponent(local137.id);
				local158.activeComponents[local137.activeComponentId] = null;
				InterfaceList.redraw(local158);
				return;
			}
			if (opcode == 102) {
				local137 = InterfaceList.getComponent(intStack[--isp]);
				local137.activeComponents = null;
				InterfaceList.redraw(local137);
				return;
			}
			if (opcode == 200) {
				isp -= 2;
				local13 = intStack[isp];
				local19 = intStack[isp + 1];
				local210 = InterfaceList.method3705(local13, local19);
				if (local210 != null && local19 != -1) {
					intStack[isp++] = 1;
					if (arg1) {
						staticActiveComponent1 = local210;
						return;
					}
					staticActiveComponent2 = local210;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 201) {
				local13 = intStack[--isp];
				local158 = InterfaceList.getComponent(local13);
				if (local158 != null) {
					intStack[isp++] = 1;
					if (arg1) {
						staticActiveComponent1 = local158;
						return;
					}
					staticActiveComponent2 = local158;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 202) {
				local13 = intStack[--isp];
				method3590(local13);
				return;
			}
			if (opcode == 203) {
				local13 = intStack[--isp];
				method3597(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (opcode < 500) {
				if (opcode == 403) {
					isp -= 2;
					local13 = intStack[isp];
					local19 = intStack[isp + 1];
					for (local25 = 0; local25 < PlayerAppearance.MALE_FEATURES.length; local25++) {
						if (PlayerAppearance.MALE_FEATURES[local25] == local13) {
							PlayerList.self.appearance.setIdentikit(client.IdkTypes, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < PlayerAppearance.FEMALE_FEATURES.length; local353++) {
						if (PlayerAppearance.FEMALE_FEATURES[local353] == local13) {
							PlayerList.self.appearance.setIdentikit(client.IdkTypes, local353, local19);
							return;
						}
					}
					return;
				}
				if (opcode == 404) {
					isp -= 2;
					local13 = intStack[isp];
					local19 = intStack[isp + 1];
					PlayerList.self.appearance.setColor(local13, local19);
					return;
				}
				if (opcode == 410) {
					local412 = intStack[--isp] != 0;
					PlayerList.self.appearance.setGender(local412);
					return;
				}
			} else if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
				@Pc(1101) String local1101;
				if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
					if (opcode >= 2000) {
						opcode -= 1000;
						local137 = InterfaceList.getComponent(intStack[--isp]);
					} else {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
					}
					if (opcode == 1100) {
						isp -= 2;
						local137.scrollX = intStack[isp];
						if (local137.scrollX > local137.scrollMaxH - local137.width) {
							local137.scrollX = local137.scrollMaxH - local137.width;
						}
						if (local137.scrollX < 0) {
							local137.scrollX = 0;
						}
						local137.scrollY = intStack[isp + 1];
						if (local137.scrollY > local137.scrollMaxV - local137.height) {
							local137.scrollY = local137.scrollMaxV - local137.height;
						}
						if (local137.scrollY < 0) {
							local137.scrollY = 0;
						}
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method6220(local137.id);
						}
						return;
					}
					if (opcode == 1101) {
						local137.color = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4723(local137.id);
						}
						return;
					}
					if (opcode == 1102) {
						local137.filled = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1103) {
						local137.alpha = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1104) {
						local137.lineWidth = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1105) {
						local19 = intStack[--isp];
						if (local137.spriteId != local19) {
							local137.spriteId = local19;
							InterfaceList.redraw(local137);
						}
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method2552(local137.id);
						}
						return;
					}
					if (opcode == 1106) {
						local137.angle2d = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1107) {
						local137.spriteTiling = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1108) {
						local137.modelType = 1;
						local137.modelId = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4213(local137.id);
						}
						return;
					}
					if (opcode == 1109) {
						isp -= 6;
						local137.modelXOffset = intStack[isp];
						local137.modelZOffset = intStack[isp + 1];
						local137.modelXAngle = intStack[isp + 2];
						local137.modelYAngle = intStack[isp + 3];
						local137.modelYOffset = intStack[isp + 4];
						local137.modelZoom = intStack[isp + 5];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelAngleClient(local137.id);
							DelayedStateChange.setComponentModelOffsetClient(local137.id);
						}
						return;
					}
					if (opcode == 1110) {
						local19 = intStack[--isp];
						if (local137.modelSeqId != local19) {
							local137.modelSeqId = local19;
							local137.anInt4247 = 0;
							local137.anInt4316 = 1;
							local137.anInt4283 = 0;
							InterfaceList.redraw(local137);
						}
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4343(local137.id);
						}
						return;
					}
					if (opcode == 1111) {
						local137.modelOrtho = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1112) {
						local1101 = stringStack[--ssp];
						if (!local1101.equals(local137.text)) {
							local137.text = local1101;
							InterfaceList.redraw(local137);
						}
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method3364(local137.id);
						}
						return;
					}
					if (opcode == 1113) {
						local137.font = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method2439(local137.id);
						}
						return;
					}
					if (opcode == 1114) {
						isp -= 3;
						local137.halign = intStack[isp];
						local137.valign = intStack[isp + 1];
						local137.vpadding = intStack[isp + 2];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1115) {
						local137.shadowed = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1116) {
						local137.outlineThickness = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1117) {
						local137.shadowColor = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1118) {
						local137.vFlip = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1119) {
						local137.hFlip = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1120) {
						isp -= 2;
						local137.scrollMaxH = intStack[isp];
						local137.scrollMaxV = intStack[isp + 1];
						InterfaceList.redraw(local137);
						if (local137.type == 0) {
							DelayedStateChange.method1911(false, local137);
						}
						return;
					}
					if (opcode == 1121) {
						isp -= 2;
						local137.aShort62 = (short) intStack[isp];
						local137.aShort61 = (short) intStack[isp + 1];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1122) {
						local137.hasAlpha = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1123) {
						local137.modelZoom = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelAngleClient(local137.id);
						}
						return;
					}
					if (opcode == 1124) {
						local19 = intStack[--isp];
						local137.aBoolean292 = local19 == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1125) {
						isp -= 2;
						local137.anInt4307 = intStack[isp];
						local137.anInt4253 = intStack[isp + 1];
						InterfaceList.redraw(local137);
						return;
					}
				} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
					if (opcode >= 2000) {
						opcode -= 1000;
						local137 = InterfaceList.getComponent(intStack[--isp]);
					} else {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
					}
					InterfaceList.redraw(local137);
					if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209 || opcode == 1212 || opcode == 1213) {
						isp -= 2;
						local19 = intStack[isp];
						local25 = intStack[isp + 1];
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentObjClient(local137.id);
							DelayedStateChange.setComponentModelAngleClient(local137.id);
							DelayedStateChange.setComponentModelOffsetClient(local137.id);
						}
						if (local19 == -1) {
							local137.modelType = 1;
							local137.modelId = -1;
							local137.objId = -1;
							return;
						}
						local137.objId = local19;
						local137.objCount = local25;
						if (opcode == 1208 || opcode == 1209) {
							local137.aBoolean280 = true;
						} else {
							local137.aBoolean280 = false;
						}
						@Pc(1537) ObjType local1537 = client.ObjTypes.get(local19);
						local137.modelXAngle = local1537.anInt5245;
						local137.modelYAngle = local1537.anInt5215;
						local137.modelYOffset = local1537.anInt5249;
						local137.modelXOffset = local1537.anInt5252;
						local137.modelZOffset = local1537.anInt5232;
						local137.modelZoom = local1537.anInt5241;
						if (opcode == 1205 || opcode == 1209) {
							local137.anInt4306 = 0;
						} else if (opcode == 1212 || opcode == 1213) {
							local137.anInt4306 = 1;
						} else {
							local137.anInt4306 = 2;
						}
						if (local137.anInt4251 > 0) {
							local137.modelZoom = local137.modelZoom * 32 / local137.anInt4251;
							return;
						}
						if (local137.baseWidth > 0) {
							local137.modelZoom = local137.modelZoom * 32 / local137.baseWidth;
						}
						return;
					}
					if (opcode == 1201) {
						local137.modelType = 2;
						local137.modelId = intStack[--isp];
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4213(local137.id);
						}
						return;
					}
					if (opcode == 1202) {
						local137.modelType = 3;
						local137.modelId = -1;
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4213(local137.id);
						}
						return;
					}
					if (opcode == 1203) {
						local137.modelType = 6;
						local137.modelId = intStack[--isp];
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4213(local137.id);
						}
						return;
					}
					if (opcode == 1204) {
						local137.modelType = 5;
						local137.modelId = intStack[--isp];
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4213(local137.id);
						}
						return;
					}
					if (opcode == 1206) {
						isp -= 4;
						local137.anInt4280 = intStack[isp];
						local137.anInt4267 = intStack[isp + 1];
						local137.anInt4235 = intStack[isp + 2];
						local137.anInt4242 = intStack[isp + 3];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1207) {
						isp -= 2;
						local137.anInt4270 = intStack[isp];
						local137.anInt4302 = intStack[isp + 1];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1210) {
						isp -= 4;
						local137.modelId = intStack[isp];
						local137.anInt4236 = intStack[isp + 1];
						if (intStack[isp + 2] == 1) {
							local137.modelType = 9;
						} else {
							local137.modelType = 8;
						}
						if (intStack[isp + 3] == 1) {
							local137.aBoolean280 = true;
						} else {
							local137.aBoolean280 = false;
						}
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4213(local137.id);
						}
						return;
					}
					if (opcode == 1211) {
						local137.modelType = 5;
						local137.modelId = PlayerList.selfId;
						local137.anInt4236 = 0;
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method4213(local137.id);
						}
						return;
					}
				} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
					if (opcode >= 2000) {
						opcode -= 1000;
						local137 = InterfaceList.getComponent(intStack[--isp]);
					} else {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
					}
					if (opcode == 1300) {
						local19 = intStack[--isp] - 1;
						if (local19 >= 0 && local19 <= 9) {
							local137.method4103(local19, stringStack[--ssp]);
							return;
						}
						ssp--;
						return;
					}
					if (opcode == 1301) {
						isp -= 2;
						local19 = intStack[isp];
						local25 = intStack[isp + 1];
						local137.aClass161_12 = InterfaceList.method3705(local19, local25);
						return;
					}
					if (opcode == 1302) {
						local19 = intStack[--isp];
						if (local19 != Static164.anInt3138 && local19 != Static158.anInt2895 && local19 != Static83.anInt1838) {
							return;
						}
						local137.anInt4285 = local19;
						return;
					}
					if (opcode == 1303) {
						local137.anInt4239 = intStack[--isp];
						return;
					}
					if (opcode == 1304) {
						local137.anInt4271 = intStack[--isp];
						return;
					}
					if (opcode == 1305) {
						local137.aString45 = stringStack[--ssp];
						return;
					}
					if (opcode == 1306) {
						local137.aString44 = stringStack[--ssp];
						return;
					}
					if (opcode == 1307) {
						local137.aStringArray40 = null;
						return;
					}
					if (opcode == 1308) {
						local137.anInt4286 = intStack[--isp];
						local137.anInt4238 = intStack[--isp];
						return;
					}
					if (opcode == 1309) {
						local19 = intStack[--isp];
						local25 = intStack[--isp];
						if (local25 >= 1 && local25 <= 10) {
							local137.method4110(local19, local25 - 1);
						}
						return;
					}
					if (opcode == 1310) {
						local137.aString46 = stringStack[--ssp];
						return;
					}
					if (opcode == 1311) {
						local137.anInt4260 = intStack[--isp];
						return;
					}
				} else {
					@Pc(2194) int local2194;
					if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
						if (opcode >= 2000) {
							opcode -= 1000;
							local137 = InterfaceList.getComponent(intStack[--isp]);
						} else {
							local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						}
						local1101 = stringStack[--ssp];
						@Pc(2137) int[] local2137 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = intStack[--isp];
							if (local353 > 0) {
								local2137 = new int[local353];
								while (local353-- > 0) {
									local2137[local353] = intStack[--isp];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2189) Object[] local2189 = new Object[local1101.length() + 1];
						for (local2194 = local2189.length - 1; local2194 >= 1; local2194--) {
							if (local1101.charAt(local2194 - 1) == 's') {
								local2189[local2194] = stringStack[--ssp];
							} else {
								local2189[local2194] = Integer.valueOf(intStack[--isp]);
							}
						}
						local56 = intStack[--isp];
						if (local56 == -1) {
							local2189 = null;
						} else {
							local2189[0] = Integer.valueOf(local56);
						}
						if (opcode == 1400) {
							local137.anObjectArray14 = local2189;
						} else if (opcode == 1401) {
							local137.anObjectArray16 = local2189;
						} else if (opcode == 1402) {
							local137.anObjectArray30 = local2189;
						} else if (opcode == 1403) {
							local137.anObjectArray13 = local2189;
						} else if (opcode == 1404) {
							local137.anObjectArray9 = local2189;
						} else if (opcode == 1405) {
							local137.anObjectArray31 = local2189;
						} else if (opcode == 1406) {
							local137.anObjectArray32 = local2189;
						} else if (opcode == 1407) {
							local137.anObjectArray10 = local2189;
							local137.anIntArray273 = local2137;
						} else if (opcode == 1408) {
							local137.anObjectArray23 = local2189;
						} else if (opcode == 1409) {
							local137.anObjectArray27 = local2189;
						} else if (opcode == 1410) {
							local137.anObjectArray8 = local2189;
						} else if (opcode == 1411) {
							local137.anObjectArray28 = local2189;
						} else if (opcode == 1412) {
							local137.anObjectArray12 = local2189;
						} else if (opcode == 1414) {
							local137.anObjectArray29 = local2189;
							local137.anIntArray281 = local2137;
						} else if (opcode == 1415) {
							local137.anObjectArray5 = local2189;
							local137.anIntArray274 = local2137;
						} else if (opcode == 1416) {
							local137.anObjectArray15 = local2189;
						} else if (opcode == 1417) {
							local137.anObjectArray21 = local2189;
						} else if (opcode == 1418) {
							local137.anObjectArray26 = local2189;
						} else if (opcode == 1419) {
							local137.anObjectArray17 = local2189;
						} else if (opcode == 1420) {
							local137.anObjectArray25 = local2189;
						} else if (opcode == 1421) {
							local137.anObjectArray18 = local2189;
						} else if (opcode == 1422) {
							local137.anObjectArray24 = local2189;
						} else if (opcode == 1423) {
							local137.anObjectArray34 = local2189;
						} else if (opcode == 1424) {
							local137.anObjectArray11 = local2189;
						} else if (opcode == 1425) {
							local137.anObjectArray33 = local2189;
						} else if (opcode == 1426) {
							local137.anObjectArray20 = local2189;
						} else if (opcode == 1427) {
							local137.anObjectArray6 = local2189;
						} else if (opcode == 1428) {
							local137.anObjectArray19 = local2189;
							local137.anIntArray278 = local2137;
						} else if (opcode == 1429) {
							local137.anObjectArray7 = local2189;
							local137.anIntArray277 = local2137;
						}
						local137.aBoolean296 = true;
						return;
					}
					if (opcode < 1600) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1500) {
							intStack[isp++] = local137.anInt4305;
							return;
						}
						if (opcode == 1501) {
							intStack[isp++] = local137.anInt4254;
							return;
						}
						if (opcode == 1502) {
							intStack[isp++] = local137.width;
							return;
						}
						if (opcode == 1503) {
							intStack[isp++] = local137.height;
							return;
						}
						if (opcode == 1504) {
							intStack[isp++] = local137.hidden ? 1 : 0;
							return;
						}
						if (opcode == 1505) {
							intStack[isp++] = local137.anInt4275;
							return;
						}
					} else if (opcode < 1700) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1600) {
							intStack[isp++] = local137.scrollX;
							return;
						}
						if (opcode == 1601) {
							intStack[isp++] = local137.scrollY;
							return;
						}
						if (opcode == 1602) {
							stringStack[ssp++] = local137.text;
							return;
						}
						if (opcode == 1603) {
							intStack[isp++] = local137.scrollMaxH;
							return;
						}
						if (opcode == 1604) {
							intStack[isp++] = local137.scrollMaxV;
							return;
						}
						if (opcode == 1605) {
							intStack[isp++] = local137.modelZoom;
							return;
						}
						if (opcode == 1606) {
							intStack[isp++] = local137.modelXAngle;
							return;
						}
						if (opcode == 1607) {
							intStack[isp++] = local137.modelYOffset;
							return;
						}
						if (opcode == 1608) {
							intStack[isp++] = local137.modelYAngle;
							return;
						}
						if (opcode == 1609) {
							intStack[isp++] = local137.alpha;
							return;
						}
						if (opcode == 1610) {
							intStack[isp++] = local137.modelXOffset;
							return;
						}
						if (opcode == 1611) {
							intStack[isp++] = local137.modelZOffset;
							return;
						}
						if (opcode == 1612) {
							intStack[isp++] = local137.spriteId;
							return;
						}
					} else if (opcode < 1800) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1700) {
							intStack[isp++] = local137.objId;
							return;
						}
						if (opcode == 1701) {
							if (local137.objId != -1) {
								intStack[isp++] = local137.objCount;
								return;
							}
							intStack[isp++] = 0;
							return;
						}
						if (opcode == 1702) {
							intStack[isp++] = local137.activeComponentId;
							return;
						}
					} else if (opcode < 1900) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1800) {
							intStack[isp++] = Static45.method1404(local137).getTargetMask();
							return;
						}
						if (opcode == 1801) {
							local19 = intStack[--isp];
							local19--;
							if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
								stringStack[ssp++] = local137.aStringArray40[local19];
								return;
							}
							stringStack[ssp++] = "";
							return;
						}
						if (opcode == 1802) {
							if (local137.aString45 == null) {
								stringStack[ssp++] = "";
								return;
							}
							stringStack[ssp++] = local137.aString45;
							return;
						}
					} else if (opcode < 2600) {
						local137 = InterfaceList.getComponent(intStack[--isp]);
						if (opcode == 2500) {
							intStack[isp++] = local137.anInt4305;
							return;
						}
						if (opcode == 2501) {
							intStack[isp++] = local137.anInt4254;
							return;
						}
						if (opcode == 2502) {
							intStack[isp++] = local137.width;
							return;
						}
						if (opcode == 2503) {
							intStack[isp++] = local137.height;
							return;
						}
						if (opcode == 2504) {
							intStack[isp++] = local137.hidden ? 1 : 0;
							return;
						}
						if (opcode == 2505) {
							intStack[isp++] = local137.anInt4275;
							return;
						}
					} else if (opcode < 2700) {
						local137 = InterfaceList.getComponent(intStack[--isp]);
						if (opcode == 2600) {
							intStack[isp++] = local137.scrollX;
							return;
						}
						if (opcode == 2601) {
							intStack[isp++] = local137.scrollY;
							return;
						}
						if (opcode == 2602) {
							stringStack[ssp++] = local137.text;
							return;
						}
						if (opcode == 2603) {
							intStack[isp++] = local137.scrollMaxH;
							return;
						}
						if (opcode == 2604) {
							intStack[isp++] = local137.scrollMaxV;
							return;
						}
						if (opcode == 2605) {
							intStack[isp++] = local137.modelZoom;
							return;
						}
						if (opcode == 2606) {
							intStack[isp++] = local137.modelXAngle;
							return;
						}
						if (opcode == 2607) {
							intStack[isp++] = local137.modelYOffset;
							return;
						}
						if (opcode == 2608) {
							intStack[isp++] = local137.modelYAngle;
							return;
						}
						if (opcode == 2609) {
							intStack[isp++] = local137.alpha;
							return;
						}
						if (opcode == 2610) {
							intStack[isp++] = local137.modelXOffset;
							return;
						}
						if (opcode == 2611) {
							intStack[isp++] = local137.modelZOffset;
							return;
						}
						if (opcode == 2612) {
							intStack[isp++] = local137.spriteId;
							return;
						}
					} else {
						@Pc(3356) Class2_Sub7 local3356;
						@Pc(3254) Class2_Sub7 local3254;
						if (opcode < 2800) {
							if (opcode == 2700) {
								local137 = InterfaceList.getComponent(intStack[--isp]);
								intStack[isp++] = local137.objId;
								return;
							}
							if (opcode == 2701) {
								local137 = InterfaceList.getComponent(intStack[--isp]);
								if (local137.objId != -1) {
									intStack[isp++] = local137.objCount;
									return;
								}
								intStack[isp++] = 0;
								return;
							}
							if (opcode == 2702) {
								local13 = intStack[--isp];
								local3254 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
								if (local3254 != null) {
									intStack[isp++] = 1;
									return;
								}
								intStack[isp++] = 0;
								return;
							}
							if (opcode == 2703) {
								local137 = InterfaceList.getComponent(intStack[--isp]);
								if (local137.activeComponents == null) {
									intStack[isp++] = 0;
									return;
								}
								local19 = local137.activeComponents.length;
								for (local25 = 0; local25 < local137.activeComponents.length; local25++) {
									if (local137.activeComponents[local25] == null) {
										local19 = local25;
										break;
									}
								}
								intStack[isp++] = local19;
								return;
							}
							if (opcode == 2704 || opcode == 2705) {
								isp -= 2;
								local13 = intStack[isp];
								local19 = intStack[isp + 1];
								local3356 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
								if (local3356 != null && local3356.anInt1370 == local19) {
									intStack[isp++] = 1;
									return;
								} else {
									intStack[isp++] = 0;
									return;
								}
							}
						} else if (opcode < 2900) {
							local137 = InterfaceList.getComponent(intStack[--isp]);
							if (opcode == 2800) {
								intStack[isp++] = Static45.method1404(local137).getTargetMask();
								return;
							}
							if (opcode == 2801) {
								local19 = intStack[--isp];
								local19--;
								if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
									stringStack[ssp++] = local137.aStringArray40[local19];
									return;
								}
								stringStack[ssp++] = "";
								return;
							}
							if (opcode == 2802) {
								if (local137.aString45 == null) {
									stringStack[ssp++] = "";
									return;
								}
								stringStack[ssp++] = local137.aString45;
								return;
							}
						} else {
							@Pc(3493) String local3493;
							if (opcode < 3200) {
								if (opcode == 3100) {
									local3493 = stringStack[--ssp];
									Chat.add(local3493);
									return;
								}
								if (opcode == 3101) {
									isp -= 2;
									Player.animate(PlayerList.self, intStack[isp + 1], intStack[isp]);
									return;
								}
								if (opcode == 3103) {
									Protocol.closeWidget();
									return;
								}
								if (opcode == 3104) {
									local3493 = stringStack[--ssp];
									local19 = 0;
									if (StringUtils.isInt(local3493)) {
										local19 = StringUtils.parseInt(local3493);
									}
									Protocol.writeOpcode(ClientProt.RESUME_P_COUTNDIALOG);
									Protocol.outboundBuffer.p4(local19);
									return;
								}
								if (opcode == 3105) {
									local3493 = stringStack[--ssp];
									Protocol.writeOpcode(ClientProt.RESUME_P_NAMEDIALOG);
									Protocol.outboundBuffer.p1(local3493.length() + 1);
									Protocol.outboundBuffer.pjstr(local3493);
									return;
								}
								if (opcode == 3106) {
									local3493 = stringStack[--ssp];
									Protocol.writeOpcode(ClientProt.RESUME_P_STRINGDIALOG);
									Protocol.outboundBuffer.p1(local3493.length() + 1);
									Protocol.outboundBuffer.pjstr(local3493);
									return;
								}
								if (opcode == 3107) {
									local13 = intStack[--isp];
									local1101 = stringStack[--ssp];
									Protocol.clickPlayerOption(local13, local1101);
									return;
								}
								if (opcode == 3108) {
									isp -= 3;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local35 = InterfaceList.getComponent(local25);
									Cs1ScriptRunner.method6335(local13, local19, local35);
									return;
								}
								if (opcode == 3109) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local210 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
									Cs1ScriptRunner.method6335(local13, local19, local210);
									return;
								}
								if (opcode == 3110) {
									local13 = intStack[--isp];
									Protocol.writeOpcode(ClientProt.PACKET_58);
									Protocol.outboundBuffer.p2(local13);
									return;
								}
								if (opcode == 3111) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local3356 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
									if (local3356 != null) {
										Static276.method4655(true, local3356, local3356.anInt1370 != local19);
									}
									Static382.method6365(local13, 3, true, local19);
									return;
								}
								if (opcode == 3112) {
									isp--;
									local13 = intStack[isp];
									local3254 = (Class2_Sub7) Static329.aClass4_130.get((long) local13);
									if (local3254 != null && local3254.anInt1373 == 3) {
										Static276.method4655(true, local3254, true);
									}
									return;
								}
							} else if (opcode < 3300) {
								if (opcode == 3200) {
									isp -= 3;
									SoundPlayer.play(intStack[isp + 1], 255, intStack[isp + 2], intStack[isp]);
									return;
								}
								if (opcode == 3201) {
									MusicPlayer.playSong(50, 255, intStack[--isp]);
									return;
								}
								if (opcode == 3202) {
									isp -= 2;
									MusicPlayer.playJingle(intStack[isp], intStack[isp + 1], 255);
									return;
								}
								if (opcode == 3203) {
									isp -= 4;
									SoundPlayer.play(intStack[isp + 1], intStack[isp + 3], intStack[isp + 2], intStack[isp]);
									return;
								}
								if (opcode == 3204) {
									isp -= 3;
									MusicPlayer.playSong(intStack[isp + 2], intStack[isp + 1], intStack[isp]);
									return;
								}
								if (opcode == 3205) {
									isp -= 3;
									MusicPlayer.playJingle(intStack[isp], intStack[isp + 1], intStack[isp + 2]);
									return;
								}
							} else if (opcode < 3400) {
								if (opcode == 3300) {
									intStack[isp++] = client.cycle;
									return;
								}
								if (opcode == 3301) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemType(false, local13, local19);
									return;
								}
								if (opcode == 3302) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemCount(local19, false, local13);
									return;
								}
								if (opcode == 3303) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getSlotTotal(local13, false, local19);
									return;
								}
								if (opcode == 3304) {
									local13 = intStack[--isp];
									intStack[isp++] = client.InvTypes.get(local13).size;
									return;
								}
								if (opcode == 3305) {
									local13 = intStack[--isp];
									intStack[isp++] = PlayerSkillXpTable.boostedLevels[local13];
									return;
								}
								if (opcode == 3306) {
									local13 = intStack[--isp];
									intStack[isp++] = PlayerSkillXpTable.baseLevels[local13];
									return;
								}
								if (opcode == 3307) {
									local13 = intStack[--isp];
									intStack[isp++] = PlayerSkillXpTable.experience[local13];
									return;
								}
								if (opcode == 3308) {
									@Pc(4136) byte local4136 = PlayerList.self.plane;
									local19 = (PlayerList.self.xFine >> 7) + Camera.originX;
									local25 = (PlayerList.self.zFine >> 7) + Camera.originZ;
									intStack[isp++] = (local4136 << 28) + (local19 << 14) + local25;
									return;
								}
								if (opcode == 3309) {
									local13 = intStack[--isp];
									intStack[isp++] = local13 >> 14 & 0x3FFF;
									return;
								}
								if (opcode == 3310) {
									local13 = intStack[--isp];
									intStack[isp++] = local13 >> 28;
									return;
								}
								if (opcode == 3311) {
									local13 = intStack[--isp];
									intStack[isp++] = local13 & 0x3FFF;
									return;
								}
								if (opcode == 3312) {
									intStack[isp++] = LoginManager.mapMembers ? 1 : 0;
									return;
								}
								if (opcode == 3313) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemType(true, local13, local19);
									return;
								}
								if (opcode == 3314) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemCount(local19, true, local13);
									return;
								}
								if (opcode == 3315) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getSlotTotal(local13, true, local19);
									return;
								}
								if (opcode == 3316) {
									if (LoginManager.staffModLevel >= 2) {
										intStack[isp++] = LoginManager.staffModLevel;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3317) {
									intStack[isp++] = Player.rebootTimer;
									return;
								}
								if (opcode == 3318) {
									intStack[isp++] = Player.worldId;
									return;
								}
								if (opcode == 3321) {
									intStack[isp++] = Player.energy;
									return;
								}
								if (opcode == 3322) {
									intStack[isp++] = Player.weight;
									return;
								}
								if (opcode == 3323) {
									if (LoginManager.blackmarks >= 5 && LoginManager.blackmarks <= 9) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3324) {
									if (LoginManager.blackmarks >= 5 && LoginManager.blackmarks <= 9) {
										intStack[isp++] = LoginManager.blackmarks;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3325) {
									intStack[isp++] = LoginManager.playerMember ? 1 : 0;
									return;
								}
								if (opcode == 3326) {
									intStack[isp++] = PlayerList.self.combatLevel;
									return;
								}
								if (opcode == 3327) {
									intStack[isp++] = PlayerList.self.appearance.gender ? 1 : 0;
									return;
								}
								if (opcode == 3328) {
									intStack[isp++] = LoginManager.playerUnderage && !LoginManager.parentalChatConsent ? 1 : 0;
									return;
								}
								if (opcode == 3329) {
									intStack[isp++] = LoginManager.mapQuickChat ? 1 : 0;
									return;
								}
								if (opcode == 3330) {
									local13 = intStack[--isp];
									intStack[isp++] = Inv.getFreeSpace(local13);
									return;
								}
								if (opcode == 3331) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getTotalParam(local19, false, local13);
									return;
								}
								if (opcode == 3332) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getTotalParam(local19, true, local13);
									return;
								}
								if (opcode == 3333) {
									intStack[isp++] = LoginManager.anInt3714;
									return;
								}
								if (opcode == 3335) {
									intStack[isp++] = client.language;
									return;
								}
								if (opcode == 3336) {
									isp -= 4;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local353 = intStack[isp + 3];
									local13 += local19 << 14;
									local13 += local25 << 28;
									local13 += local353;
									intStack[isp++] = local13;
									return;
								}
								if (opcode == 3337) {
									intStack[isp++] = client.affiliate;
									return;
								}
								if (opcode == 3338) {
									intStack[isp++] = Static374.method6273();
									return;
								}
							} else if (opcode < 3500) {
								@Pc(4761) EnumType local4761;
								if (opcode == 3400) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local4761 = client.EnumTypes.get(local13);
									stringStack[ssp++] = local4761.getString(local19);
									return;
								}
								if (opcode == 3408) {
									isp -= 4;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local353 = intStack[isp + 3];
									@Pc(4807) EnumType local4807 = client.EnumTypes.get(local25);
									if (local4807.keyType == local13 && local4807.valueType == local19) {
										if (local19 == 115) {
											stringStack[ssp++] = local4807.getString(local353);
											return;
										}
										intStack[isp++] = local4807.getInt(local353);
										return;
									}
									throw new RuntimeException("C3408-1");
								}
								if (opcode == 3409) {
									isp -= 3;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									if (local19 == -1) {
										throw new RuntimeException("C3409-2");
									}
									@Pc(4883) EnumType local4883 = client.EnumTypes.get(local19);
									if (local4883.valueType != local13) {
										throw new RuntimeException("C3409-1");
									}
									intStack[isp++] = local4883.containsValue(local25) ? 1 : 0;
									return;
								}
								if (opcode == 3410) {
									local13 = intStack[--isp];
									local1101 = stringStack[--ssp];
									if (local13 == -1) {
										throw new RuntimeException("C3410-2");
									}
									local4761 = client.EnumTypes.get(local13);
									if (local4761.valueType != 's') {
										throw new RuntimeException("C3410-1");
									}
									intStack[isp++] = local4761.containsValue(local1101) ? 1 : 0;
									return;
								}
								if (opcode == 3411) {
									local13 = intStack[--isp];
									@Pc(4981) EnumType local4981 = client.EnumTypes.get(local13);
									intStack[isp++] = local4981.table.size();
									return;
								}
							} else if (opcode < 3700) {
								if (opcode == 3600) {
									if (FriendsList.status == 0) {
										intStack[isp++] = -2;
										return;
									}
									if (FriendsList.status == 1) {
										intStack[isp++] = -1;
										return;
									}
									intStack[isp++] = FriendsList.size;
									return;
								}
								if (opcode == 3601) {
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 < FriendsList.size) {
										stringStack[ssp++] = FriendsList.usernames[local13];
										if (Static319.aStringArray54[local13] != null) {
											stringStack[ssp++] = Static319.aStringArray54[local13];
											return;
										}
										stringStack[ssp++] = "";
										return;
									}
									stringStack[ssp++] = "";
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3602) {
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 < FriendsList.size) {
										intStack[isp++] = FriendsList.worlds[local13];
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3603) {
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 < FriendsList.size) {
										intStack[isp++] = FriendsList.ranks[local13];
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3604) {
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									FriendsList.setRank(local19, local3493);
									return;
								}
								if (opcode == 3605) {
									local3493 = stringStack[--ssp];
									FriendsList.add(local3493);
									return;
								}
								if (opcode == 3606) {
									local3493 = stringStack[--ssp];
									FriendsList.remove(local3493);
									return;
								}
								if (opcode == 3607) {
									local3493 = stringStack[--ssp];
									IgnoreList.add(local3493, false);
									return;
								}
								if (opcode == 3608) {
									local3493 = stringStack[--ssp];
									IgnoreList.remove(local3493);
									return;
								}
								if (opcode == 3609) {
									local3493 = stringStack[--ssp];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = FriendsList.contains(local3493) ? 1 : 0;
									return;
								}
								if (opcode == 3610) {
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 < FriendsList.size) {
										stringStack[ssp++] = FriendsList.worldNames[local13];
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3611) {
									if (ClanChat.name != null) {
										stringStack[ssp++] = StringUtils.toTitleCase(ClanChat.name);
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3612) {
									if (ClanChat.name != null) {
										intStack[isp++] = ClanChat.size;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3613) {
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										stringStack[ssp++] = ClanChat.members[local13].username2;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3614) {
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										intStack[isp++] = ClanChat.members[local13].world;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3615) {
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										intStack[isp++] = ClanChat.members[local13].rank;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3616) {
									intStack[isp++] = ClanChat.minKick;
									return;
								}
								if (opcode == 3617) {
									local3493 = stringStack[--ssp];
									ClanChat.kick(local3493);
									return;
								}
								if (opcode == 3618) {
									intStack[isp++] = ClanChat.rank;
									return;
								}
								if (opcode == 3619) {
									local3493 = stringStack[--ssp];
									ClanChat.join(local3493);
									return;
								}
								if (opcode == 3620) {
									ClanChat.leave();
									return;
								}
								if (opcode == 3621) {
									if (FriendsList.status == 0) {
										intStack[isp++] = -1;
										return;
									}
									intStack[isp++] = IgnoreList.size;
									return;
								}
								if (opcode == 3622) {
									local13 = intStack[--isp];
									if (FriendsList.status != 0 && local13 < IgnoreList.size) {
										stringStack[ssp++] = Static226.aStringArray35[local13];
										if (Static371.aStringArray66[local13] != null) {
											stringStack[ssp++] = Static371.aStringArray66[local13];
											return;
										}
										stringStack[ssp++] = "";
										return;
									}
									stringStack[ssp++] = "";
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3623) {
									local3493 = stringStack[--ssp];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = IgnoreList.contains(local3493) ? 1 : 0;
									return;
								}
								if (opcode == 3624) {
									local13 = intStack[--isp];
									if (ClanChat.members != null && local13 < ClanChat.size && ClanChat.members[local13].username.equalsIgnoreCase(PlayerList.self.username)) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3625) {
									if (ClanChat.owner != null) {
										stringStack[ssp++] = ClanChat.owner;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3626) {
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										stringStack[ssp++] = ClanChat.members[local13].worldName;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3627) {
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 >= 0 && local13 < FriendsList.size) {
										intStack[isp++] = FriendsList.sameGame[local13] ? 1 : 0;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3628) {
									local3493 = stringStack[--ssp];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = FriendsList.indexOf(local3493);
									return;
								}
								if (opcode == 3629) {
									intStack[isp++] = client.country;
									return;
								}
								if (opcode == 3630) {
									local3493 = stringStack[--ssp];
									IgnoreList.add(local3493, true);
									return;
								}
								if (opcode == 3631) {
									local13 = intStack[--isp];
									intStack[isp++] = Static196.aBooleanArray31[local13] ? 1 : 0;
									return;
								}
								if (opcode == 3632) {
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										stringStack[ssp++] = ClanChat.members[local13].username;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3633) {
									local13 = intStack[--isp];
									if (FriendsList.status != 0 && local13 < IgnoreList.size) {
										stringStack[ssp++] = Static234.aStringArray39[local13];
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
							} else if (opcode < 4000) {
								if (opcode == 3903) {
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].getType();
									return;
								}
								if (opcode == 3904) {
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].item;
									return;
								}
								if (opcode == 3905) {
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].price;
									return;
								}
								if (opcode == 3906) {
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].count;
									return;
								}
								if (opcode == 3907) {
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].completedCount;
									return;
								}
								if (opcode == 3908) {
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].completedGold;
									return;
								}
								if (opcode == 3910) {
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 0 ? 1 : 0;
									return;
								}
								if (opcode == 3911) {
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 2 ? 1 : 0;
									return;
								}
								if (opcode == 3912) {
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 5 ? 1 : 0;
									return;
								}
								if (opcode == 3913) {
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 1 ? 1 : 0;
									return;
								}
							} else if (opcode < 4100) {
								if (opcode == 4000) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 + local19;
									return;
								}
								if (opcode == 4001) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 - local19;
									return;
								}
								if (opcode == 4002) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 * local19;
									return;
								}
								if (opcode == 4003) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 / local19;
									return;
								}
								if (opcode == 4004) {
									local13 = intStack[--isp];
									intStack[isp++] = (int) (Math.random() * (double) local13);
									return;
								}
								if (opcode == 4005) {
									local13 = intStack[--isp];
									intStack[isp++] = (int) (Math.random() * (double) (local13 + 1));
									return;
								}
								if (opcode == 4006) {
									isp -= 5;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local353 = intStack[isp + 3];
									local2194 = intStack[isp + 4];
									intStack[isp++] = local13 + (local19 - local13) * (local2194 - local25) / (local353 - local25);
									return;
								}
								@Pc(6491) long local6491;
								@Pc(6484) long local6484;
								if (opcode == 4007) {
									isp -= 2;
									local6484 = intStack[isp];
									local6491 = intStack[isp + 1];
									intStack[isp++] = (int) (local6484 + local6484 * local6491 / 100L);
									return;
								}
								if (opcode == 4008) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 | 0x1 << local19;
									return;
								}
								if (opcode == 4009) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 & -(0x1 << local19) - 1;
									return;
								}
								if (opcode == 4010) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
									return;
								}
								if (opcode == 4011) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 % local19;
									return;
								}
								if (opcode == 4012) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									if (local13 == 0) {
										intStack[isp++] = 0;
										return;
									}
									intStack[isp++] = (int) Math.pow((double) local13, (double) local19);
									return;
								}
								if (opcode == 4013) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									if (local13 == 0) {
										intStack[isp++] = 0;
										return;
									}
									if (local19 == 0) {
										intStack[isp++] = Integer.MAX_VALUE;
										return;
									}
									intStack[isp++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
									return;
								}
								if (opcode == 4014) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 & local19;
									return;
								}
								if (opcode == 4015) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 | local19;
									return;
								}
								if (opcode == 4016) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 < local19 ? local13 : local19;
									return;
								}
								if (opcode == 4017) {
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 > local19 ? local13 : local19;
									return;
								}
								if (opcode == 4018) {
									isp -= 3;
									local6484 = intStack[isp];
									local6491 = intStack[isp + 1];
									@Pc(6872) long local6872 = (long) intStack[isp + 2];
									intStack[isp++] = (int) (local6484 * local6872 / local6491);
									return;
								}
							} else if (opcode < 4200) {
								if (opcode == 4100) {
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									stringStack[ssp++] = local3493 + local19;
									return;
								}
								if (opcode == 4101) {
									ssp -= 2;
									local3493 = stringStack[ssp];
									local1101 = stringStack[ssp + 1];
									stringStack[ssp++] = local3493 + local1101;
									return;
								}
								if (opcode == 4102) {
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									stringStack[ssp++] = local3493 + Static320.method5462(local19);
									return;
								}
								if (opcode == 4103) {
									local3493 = stringStack[--ssp];
									stringStack[ssp++] = local3493.toLowerCase();
									return;
								}
								if (opcode == 4104) {
									stringStack[ssp++] = method3594(intStack[--isp]);
									return;
								}
								if (opcode == 4105) {
									ssp -= 2;
									local3493 = stringStack[ssp];
									local1101 = stringStack[ssp + 1];
									if (PlayerList.self.appearance != null && PlayerList.self.appearance.gender) {
										stringStack[ssp++] = local1101;
										return;
									}
									stringStack[ssp++] = local3493;
									return;
								}
								if (opcode == 4106) {
									local13 = intStack[--isp];
									stringStack[ssp++] = Integer.toString(local13);
									return;
								}
								if (opcode == 4107) {
									ssp -= 2;
									intStack[isp++] = StringUtils.compare(stringStack[ssp + 1], stringStack[ssp], client.language);
									return;
								}
								@Pc(7155) Class239 local7155;
								if (opcode == 4108) {
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									local7155 = Static101.method2165(local25, client.jsArchive13);
									intStack[isp++] = local7155.method6123(local3493, local19, Static124.aClass13Array27);
									return;
								}
								if (opcode == 4109) {
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									local7155 = Static101.method2165(local25, client.jsArchive13);
									intStack[isp++] = local7155.method6124(Static124.aClass13Array27, local3493, local19);
									return;
								}
								if (opcode == 4110) {
									ssp -= 2;
									local3493 = stringStack[ssp];
									local1101 = stringStack[ssp + 1];
									if (intStack[--isp] == 1) {
										stringStack[ssp++] = local3493;
										return;
									}
									stringStack[ssp++] = local1101;
									return;
								}
								if (opcode == 4111) {
									local3493 = stringStack[--ssp];
									stringStack[ssp++] = Static153.method2772(local3493);
									return;
								}
								if (opcode == 4112) {
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									if (local19 == -1) {
										throw new RuntimeException("null char");
									}
									stringStack[ssp++] = local3493 + (char) local19;
									return;
								}
								if (opcode == 4113) {
									local13 = intStack[--isp];
									intStack[isp++] = Static146.method2697((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4114) {
									local13 = intStack[--isp];
									intStack[isp++] = Static89.method1939((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4115) {
									local13 = intStack[--isp];
									intStack[isp++] = Static35.method1103((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4116) {
									local13 = intStack[--isp];
									intStack[isp++] = Static328.method5598((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4117) {
									local3493 = stringStack[--ssp];
									if (local3493 != null) {
										intStack[isp++] = local3493.length();
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 4118) {
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									stringStack[ssp++] = local3493.substring(local19, local25);
									return;
								}
								if (opcode == 4119) {
									local3493 = stringStack[--ssp];
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
									stringStack[ssp++] = local7518.toString();
									return;
								}
								if (opcode == 4120) {
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									intStack[isp++] = local3493.indexOf(local19, local25);
									return;
								}
								if (opcode == 4121) {
									ssp -= 2;
									local3493 = stringStack[ssp];
									local1101 = stringStack[ssp + 1];
									local25 = intStack[--isp];
									intStack[isp++] = local3493.indexOf(local1101, local25);
									return;
								}
								if (opcode == 4122) {
									local13 = intStack[--isp];
									intStack[isp++] = Character.toLowerCase((char) local13);
									return;
								}
								if (opcode == 4123) {
									local13 = intStack[--isp];
									intStack[isp++] = Character.toUpperCase((char) local13);
									return;
								}
								if (opcode == 4124) {
									local412 = intStack[--isp] != 0;
									local19 = intStack[--isp];
									stringStack[ssp++] = Static172.method3289((long) local19, client.language, local412, 0);
									return;
								}
								if (opcode == 4125) {
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									@Pc(7741) Class239 local7741 = Static101.method2165(local19, client.jsArchive13);
									intStack[isp++] = local7741.method6127(Static124.aClass13Array27, local3493);
									return;
								}
							} else {
								@Pc(8083) ParamType local8083;
								if (opcode < 4300) {
									if (opcode == 4200) {
										local13 = intStack[--isp];
										stringStack[ssp++] = client.ObjTypes.get(local13).name;
										return;
									}
									@Pc(7803) ObjType local7803;
									if (opcode == 4201) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local7803 = client.ObjTypes.get(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.ops[local19 - 1] != null) {
											stringStack[ssp++] = local7803.ops[local19 - 1];
											return;
										}
										stringStack[ssp++] = "";
										return;
									}
									if (opcode == 4202) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local7803 = client.ObjTypes.get(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.iops[local19 - 1] != null) {
											stringStack[ssp++] = local7803.iops[local19 - 1];
											return;
										}
										stringStack[ssp++] = "";
										return;
									}
									if (opcode == 4203) {
										local13 = intStack[--isp];
										intStack[isp++] = client.ObjTypes.get(local13).cost;
										return;
									}
									if (opcode == 4204) {
										local13 = intStack[--isp];
										intStack[isp++] = client.ObjTypes.get(local13).stackable == 1 ? 1 : 0;
										return;
									}
									@Pc(7966) ObjType local7966;
									if (opcode == 4205) {
										local13 = intStack[--isp];
										local7966 = client.ObjTypes.get(local13);
										if (local7966.certtemplate == -1 && local7966.certlink >= 0) {
											intStack[isp++] = local7966.certlink;
											return;
										}
										intStack[isp++] = local13;
										return;
									}
									if (opcode == 4206) {
										local13 = intStack[--isp];
										local7966 = client.ObjTypes.get(local13);
										if (local7966.certtemplate >= 0 && local7966.certlink >= 0) {
											intStack[isp++] = local7966.certlink;
											return;
										}
										intStack[isp++] = local13;
										return;
									}
									if (opcode == 4207) {
										local13 = intStack[--isp];
										intStack[isp++] = client.ObjTypes.get(local13).members ? 1 : 0;
										return;
									}
									if (opcode == 4208) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = client.ParamTypes.get(local19);
										if (local8083.isString()) {
											stringStack[ssp++] = client.ObjTypes.get(local13).getParam(local8083.defaultString, local19);
											return;
										}
										intStack[isp++] = client.ObjTypes.get(local13).getParam(local8083.defaultInt, local19);
										return;
									}
									if (opcode == 4209) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1] - 1;
										local7803 = client.ObjTypes.get(local13);
										if (local7803.anInt5244 == local19) {
											intStack[isp++] = local7803.anInt5204;
											return;
										}
										if (local7803.anInt5221 == local19) {
											intStack[isp++] = local7803.anInt5240;
											return;
										}
										intStack[isp++] = -1;
										return;
									}
									if (opcode == 4210) {
										local3493 = stringStack[--ssp];
										local19 = intStack[--isp];
										Find.search(local3493, local19 == 1);
										intStack[isp++] = Find.index;
										return;
									}
									if (opcode == 4211) {
										if (Find.results != null && Find.size < Find.index) {
											intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
											return;
										}
										intStack[isp++] = -1;
										return;
									}
									if (opcode == 4212) {
										Find.size = 0;
										return;
									}
								} else if (opcode < 4400) {
									if (opcode == 4300) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = client.ParamTypes.get(local19);
										if (local8083.isString()) {
											stringStack[ssp++] = client.NpcTypes.get(local13).getParam(local8083.defaultString, local19);
											return;
										}
										intStack[isp++] = client.NpcTypes.get(local13).getParam(local8083.defaultInt, local19);
										return;
									}
								} else if (opcode < 4500) {
									if (opcode == 4400) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = client.ParamTypes.get(local19);
										if (local8083.isString()) {
											stringStack[ssp++] = client.LocTypes.get(local13).getParam(local8083.defaultString, local19);
											return;
										}
										intStack[isp++] = client.LocTypes.get(local13).getParam(local8083.defaultInt, local19);
										return;
									}
								} else if (opcode < 4600) {
									if (opcode == 4500) {
										isp -= 2;
										local13 = intStack[isp];
										local19 = intStack[isp + 1];
										local8083 = client.ParamTypes.get(local19);
										if (local8083.isString()) {
											stringStack[ssp++] = client.StructTypes.get(local13).getParam(local19, local8083.defaultString);
											return;
										}
										intStack[isp++] = client.StructTypes.get(local13).getParam(local19, local8083.defaultInt);
										return;
									}
								} else if (opcode < 4700 && opcode == 4600) {
									local13 = intStack[--isp];
									@Pc(8467) BasType local8467 = client.BasTypes.method245(local13);
									if (local8467.anIntArray426 != null && local8467.anIntArray426.length > 0) {
										local25 = 0;
										local353 = local8467.anIntArray427[0];
										for (local2194 = 1; local2194 < local8467.anIntArray426.length; local2194++) {
											if (local8467.anIntArray427[local2194] > local353) {
												local25 = local2194;
												local353 = local8467.anIntArray427[local2194];
											}
										}
										intStack[isp++] = local8467.anIntArray426[local25];
										return;
									}
									intStack[isp++] = local8467.anInt6291;
									return;
								}
							}
						}
					}
				}
			} else {
				if (opcode >= 2000) {
					opcode -= 1000;
					local137 = InterfaceList.getComponent(intStack[--isp]);
				} else {
					local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
				}
				if (opcode == 1000) {
					isp -= 4;
					local137.baseX = intStack[isp];
					local137.baseY = intStack[isp + 1];
					local19 = intStack[isp + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = intStack[isp + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.xMode = (byte) local19;
					local137.yMode = (byte) local25;
					InterfaceList.redraw(local137);
					InterfaceList.update(local137);
					if (local137.activeComponentId == -1) {
						DelayedStateChange.method2585(local137.id);
					}
					return;
				}
				if (opcode == 1001) {
					isp -= 4;
					local137.baseWidth = intStack[isp];
					local137.baseHeight = intStack[isp + 1];
					local137.anInt4251 = 0;
					local137.anInt4269 = 0;
					local19 = intStack[isp + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = intStack[isp + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.dynamicWidthValue = (byte) local19;
					local137.dynamicHeightValue = (byte) local25;
					InterfaceList.redraw(local137);
					InterfaceList.update(local137);
					if (local137.type == 0) {
						DelayedStateChange.method1911(false, local137);
					}
					return;
				}
				if (opcode == 1003) {
					@Pc(620) boolean local620 = intStack[--isp] == 1;
					if (local137.hidden != local620) {
						local137.hidden = local620;
						InterfaceList.redraw(local137);
					}
					if (local137.activeComponentId == -1) {
						DelayedStateChange.method3778(local137.id);
					}
					return;
				}
				if (opcode == 1004) {
					isp -= 2;
					local137.aspectWidth = intStack[isp];
					local137.aspectHeight = intStack[isp + 1];
					InterfaceList.redraw(local137);
					InterfaceList.update(local137);
					if (local137.type == 0) {
						DelayedStateChange.method1911(false, local137);
					}
					return;
				}
				if (opcode == 1005) {
					local137.noClickThrough = intStack[--isp] == 1;
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
		@Pc(3) Class161 local3 = InterfaceList.getComponent(arg0);
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
	private static void runScript10000(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1292) boolean local1292;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(89) int local89;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				intStack[isp++] = Chat.publicFilter;
				return;
			}
			if (arg0 == 5001) {
				isp -= 3;
				Chat.publicFilter = intStack[isp];
				Chat.privateFilter = FilterSetting.fromInt(intStack[isp + 1]);
				if (Chat.privateFilter == null) {
					Chat.privateFilter = FilterSetting.FILTER_1;
				}
				Chat.tradeFilter = intStack[isp + 2];
				Protocol.writeOpcode(ClientProt.SET_CHATFILTERSETTINGS);
				Protocol.outboundBuffer.p1(Chat.publicFilter);
				Protocol.outboundBuffer.p1(Chat.privateFilter.setting);
				Protocol.outboundBuffer.p1(Chat.tradeFilter);
				return;
			}
			if (arg0 == 5002) {
				ssp -= 2;
				local75 = stringStack[ssp];
				local81 = stringStack[ssp + 1];
				isp -= 2;
				local89 = intStack[isp];
				local95 = intStack[isp + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Protocol.writeOpcode(ClientProt.BUG_REPORT);
				Protocol.outboundBuffer.p1(Buffer.getStringLength(local75) + Buffer.getStringLength(local81) + 2);
				Protocol.outboundBuffer.pjstr(local75);
				Protocol.outboundBuffer.p1(local89 - 1);
				Protocol.outboundBuffer.p1(local95);
				Protocol.outboundBuffer.pjstr(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Chat.messages[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[ssp++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = intStack[--isp];
				local192 = -1;
				if (local157 < 100 && Chat.messages[local157] != null) {
					local192 = Chat.types[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Chat.privateFilter == null) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Chat.privateFilter.setting;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = stringStack[--ssp];
				Chat.sendPublicMessage(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				ssp -= 2;
				local75 = stringStack[ssp];
				local81 = stringStack[ssp + 1];
				if (LoginManager.staffModLevel != 0 || (!LoginManager.playerUnderage || LoginManager.parentalChatConsent) && !LoginManager.mapQuickChat) {
					Protocol.writeOpcode(ClientProt.PACKET_1);
					Protocol.outboundBuffer.p1(0);
					local89 = Protocol.outboundBuffer.pos;
					Protocol.outboundBuffer.pjstr(local75);
					WordPack.encode(local81, Protocol.outboundBuffer);
					Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Chat.names[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[ssp++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Chat.clans[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[ssp++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = intStack[--isp];
				local192 = -1;
				if (local157 < 100) {
					local192 = Chat.phraseIds[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (PlayerList.self == null || PlayerList.self.username2 == null) {
					local75 = LoginManager.usernameInput;
				} else {
					local75 = PlayerList.self.getName();
				}
				stringStack[ssp++] = local75;
				return;
			}
			if (arg0 == 5016) {
				intStack[isp++] = Chat.tradeFilter;
				return;
			}
			if (arg0 == 5017) {
				intStack[isp++] = Chat.size;
				return;
			}
			if (arg0 == 5018) {
				local157 = intStack[--isp];
				local192 = 0;
				if (local157 < 100 && Chat.messages[local157] != null) {
					local192 = Chat.types[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = intStack[--isp];
				local81 = null;
				if (local157 < 100) {
					local81 = Static169.MSG_SECONDARY[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				stringStack[ssp++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (PlayerList.self == null || PlayerList.self.username2 == null) {
					local75 = LoginManager.usernameInput;
				} else {
					local75 = PlayerList.self.method4070();
				}
				stringStack[ssp++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = intStack[--isp];
				stringStack[ssp++] = QuickChatCatTypeList.get(local157).aString37;
				return;
			}
			@Pc(584) QuickChatCatType local584;
			if (arg0 == 5051) {
				local157 = intStack[--isp];
				local584 = QuickChatCatTypeList.get(local157);
				if (local584.subcategories == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local584.subcategories.length;
				return;
			}
			if (arg0 == 5052) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				@Pc(628) QuickChatCatType local628 = QuickChatCatTypeList.get(local157);
				local95 = local628.subcategories[local192];
				intStack[isp++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = intStack[--isp];
				local584 = QuickChatCatTypeList.get(local157);
				if (local584.phrases == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local584.phrases.length;
				return;
			}
			if (arg0 == 5054) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatCatTypeList.get(local157).phrases[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = intStack[--isp];
				stringStack[ssp++] = QuickChatPhraseTypeList.get(local157).getText();
				return;
			}
			if (arg0 == 5056) {
				local157 = intStack[--isp];
				@Pc(750) QuickChatPhraseType local750 = QuickChatPhraseTypeList.get(local157);
				if (local750.automaticResponses == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local750.automaticResponses.length;
				return;
			}
			if (arg0 == 5057) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatPhraseTypeList.get(local157).automaticResponses[local192];
				return;
			}
			if (arg0 == 5058) {
				activePhrase = new QuickChatPhrase();
				activePhrase.id = intStack[--isp];
				activePhrase.type = QuickChatPhraseTypeList.get(activePhrase.id);
				activePhrase.values = new int[activePhrase.type.getDynamicCommandCount()];
				return;
			}
			if (arg0 == 5059) {
				Protocol.writeOpcode(ClientProt.PACKET_19);
				Protocol.outboundBuffer.p1(0);
				local157 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p1(0);
				Protocol.outboundBuffer.p2(activePhrase.id);
				activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = stringStack[--ssp];
				Protocol.writeOpcode(ClientProt.PACKET_30);
				Protocol.outboundBuffer.p1(0);
				local192 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.pjstr(local75);
				Protocol.outboundBuffer.p2(activePhrase.id);
				activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local192);
				return;
			}
			if (arg0 == 5061) {
				Protocol.writeOpcode(ClientProt.PACKET_19);
				Protocol.outboundBuffer.p1(0);
				local157 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p1(1);
				Protocol.outboundBuffer.p2(activePhrase.id);
				activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local157);
				return;
			}
			if (arg0 == 5062) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatCatTypeList.get(local157).subcategoryShortcuts[local192];
				return;
			}
			if (arg0 == 5063) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatCatTypeList.get(local157).phraseShortcuts[local192];
				return;
			}
			if (arg0 == 5064) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				if (local192 == -1) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = QuickChatCatTypeList.get(local157).getSubcategoryByShortcut((char) local192);
				return;
			}
			if (arg0 == 5065) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				if (local192 == -1) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = QuickChatCatTypeList.get(local157).getPhraseByShortcut((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = intStack[--isp];
				intStack[isp++] = QuickChatPhraseTypeList.get(local157).getDynamicCommandCount();
				return;
			}
			if (arg0 == 5067) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				local89 = QuickChatPhraseTypeList.get(local157).getDynamicCommand(local192);
				intStack[isp++] = local89;
				return;
			}
			if (arg0 == 5068) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				activePhrase.values[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				activePhrase.values[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				isp -= 3;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				local89 = intStack[isp + 2];
				@Pc(1245) QuickChatPhraseType local1245 = QuickChatPhraseTypeList.get(local157);
				if (local1245.getDynamicCommand(local192) != 0) {
					throw new RuntimeException("bad command");
				}
				intStack[isp++] = local1245.getDynamicCommandParam(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = stringStack[--ssp];
				local1292 = intStack[--isp] == 1;
				Find.findQuickChatPhrases(local1292, local75);
				intStack[isp++] = Find.index;
				return;
			}
			if (arg0 == 5072) {
				if (Find.results != null && Find.size < Find.index) {
					intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
					return;
				}
				intStack[isp++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Find.size = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Keyboard.instance.isPressed(86)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Keyboard.instance.isPressed(82)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Keyboard.instance.isPressed(81)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
		} else {
			@Pc(1903) boolean local1903;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					WorldMap.setTargetZoom(intStack[--isp]);
					return;
				}
				if (arg0 == 5201) {
					intStack[isp++] = WorldMap.getTargetZoom();
					return;
				}
				if (arg0 == 5205) {
					WorldMap.method4402(false, -1, intStack[--isp], -1);
					return;
				}
				@Pc(1492) Map local1492;
				if (arg0 == 5206) {
					local157 = intStack[--isp];
					local1492 = MapList.getContainingSource(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1492 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1492.anInt6869;
					return;
				}
				@Pc(1525) Map local1525;
				if (arg0 == 5207) {
					local1525 = MapList.get(intStack[--isp]);
					if (local1525 != null && local1525.name != null) {
						stringStack[ssp++] = local1525.name;
						return;
					}
					stringStack[ssp++] = "";
					return;
				}
				if (arg0 == 5208) {
					intStack[isp++] = WorldMap.anInt1105;
					intStack[isp++] = WorldMap.anInt6930;
					return;
				}
				if (arg0 == 5209) {
					intStack[isp++] = WorldMap.anInt2772 + MapList.anInt6057;
					intStack[isp++] = WorldMap.anInt2003 + MapList.anInt6055;
					return;
				}
				if (arg0 == 5210) {
					local157 = intStack[--isp];
					local1492 = MapList.get(local157);
					if (local1492 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1492.anInt6872 >> 14 & 0x3FFF;
					intStack[isp++] = local1492.anInt6872 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = intStack[--isp];
					local1492 = MapList.get(local157);
					if (local1492 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1492.anInt6868 - local1492.anInt6870;
					intStack[isp++] = local1492.anInt6874 - local1492.anInt6863;
					return;
				}
				@Pc(1715) Class2_Sub20 local1715;
				if (arg0 == 5212) {
					local1715 = WorldMap.method3713();
					if (local1715 == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1715.anInt2947;
					local192 = local1715.anInt2946 << 28 | local1715.anInt2949 + MapList.anInt6057 << 14 | local1715.anInt2952 + MapList.anInt6055;
					intStack[isp++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1715 = Static115.method3829();
					if (local1715 == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1715.anInt2947;
					local192 = local1715.anInt2946 << 28 | local1715.anInt2949 + MapList.anInt6057 << 14 | local1715.anInt2952 + MapList.anInt6055;
					intStack[isp++] = local192;
					return;
				}
				@Pc(1863) boolean local1863;
				if (arg0 == 5214) {
					local157 = intStack[--isp];
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
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					@Pc(1901) SecondaryLinkedList local1901 = MapList.method5516(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1903 = false;
					for (@Pc(1908) Map local1908 = (Map) local1901.head(); local1908 != null; local1908 = (Map) local1901.next()) {
						if (local1908.anInt6869 == local192) {
							local1903 = true;
							break;
						}
					}
					if (local1903) {
						intStack[isp++] = 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = intStack[--isp];
					local1492 = MapList.get(local157);
					if (local1492 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1492.anInt6875;
					return;
				}
				if (arg0 == 5220) {
					intStack[isp++] = WorldMap.loadPercentage == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = intStack[--isp];
					Static15.method394(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1525 = Static378.method6312();
					if (local1525 != null) {
						local1292 = local1525.method6149(anIntArray215, WorldMap.anInt2003 + MapList.anInt6055, WorldMap.anInt2772 + MapList.anInt6057);
						if (local1292) {
							intStack[isp++] = anIntArray215[1];
							intStack[isp++] = anIntArray215[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (arg0 == 5223) {
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					WorldMap.method4402(false, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = intStack[--isp];
					local1492 = Static378.method6312();
					if (local1492 != null) {
						local1863 = local1492.method6145(local157 >> 28 & 0x3, anIntArray215, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							intStack[isp++] = anIntArray215[1];
							intStack[isp++] = anIntArray215[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = intStack[--isp];
					local1492 = Static378.method6312();
					if (local1492 != null) {
						local1863 = local1492.method6149(anIntArray215, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1863) {
							intStack[isp++] = anIntArray215[1];
							intStack[isp++] = anIntArray215[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static225.method3955(intStack[--isp]);
					return;
				}
				if (arg0 == 5227) {
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					WorldMap.method4402(true, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static175.aBoolean225 = intStack[--isp] == 1;
					return;
				}
				if (arg0 == 5229) {
					intStack[isp++] = Static175.aBoolean225 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = intStack[--isp];
					Static232.method4027(local157);
					return;
				}
				@Pc(2421) Node local2421;
				if (arg0 == 5231) {
					isp -= 2;
					local157 = intStack[isp];
					local1292 = intStack[isp + 1] == 1;
					if (Static141.aClass4_58 != null) {
						local2421 = Static141.aClass4_58.get((long) local157);
						if (local2421 != null && !local1292) {
							local2421.unlink();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Node();
							Static141.aClass4_58.put(local2421, (long) local157);
						}
					}
					return;
				}
				@Pc(2463) Node local2463;
				if (arg0 == 5232) {
					local157 = intStack[--isp];
					if (Static141.aClass4_58 != null) {
						local2463 = Static141.aClass4_58.get((long) local157);
						intStack[isp++] = local2463 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (arg0 == 5233) {
					isp -= 2;
					local157 = intStack[isp];
					local1292 = intStack[isp + 1] == 1;
					if (Static220.aClass4_83 != null) {
						local2421 = Static220.aClass4_83.get((long) local157);
						if (local2421 != null && !local1292) {
							local2421.unlink();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Node();
							Static220.aClass4_83.put(local2421, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = intStack[--isp];
					if (Static220.aClass4_83 != null) {
						local2463 = Static220.aClass4_83.get((long) local157);
						intStack[isp++] = local2463 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (arg0 == 5235) {
					intStack[isp++] = MapList.aClass2_Sub2_Sub17_3 == null ? -1 : MapList.aClass2_Sub2_Sub17_3.anInt6869;
					return;
				}
			} else {
				@Pc(2717) int local2717;
				if (arg0 < 5400) {
					if (arg0 == 5300) {
						isp -= 2;
						local157 = intStack[isp];
						local192 = intStack[isp + 1];
						DisplayMode.setWindowMode(local192, 3, false, local157);
						intStack[isp++] = GameShell.fullScreenFrame == null ? 0 : 1;
						return;
					}
					if (arg0 == 5301) {
						if (GameShell.fullScreenFrame != null) {
							DisplayMode.setWindowMode(-1, client.preferences.favoriteWorlds, false, -1);
						}
						return;
					}
					if (arg0 == 5302) {
						@Pc(2654) DisplayMode[] local2654 = DisplayMode.getDisplayModes();
						intStack[isp++] = local2654.length;
						return;
					}
					if (arg0 == 5303) {
						local157 = intStack[--isp];
						@Pc(2678) DisplayMode[] local2678 = DisplayMode.getDisplayModes();
						intStack[isp++] = local2678[local157].width;
						intStack[isp++] = local2678[local157].height;
						return;
					}
					if (arg0 == 5305) {
						local157 = client.preferences.fullScreenWidth;
						local192 = client.preferences.fullScreenHeight;
						local89 = -1;
						@Pc(2715) DisplayMode[] local2715 = DisplayMode.getDisplayModes();
						for (local2717 = 0; local2717 < local2715.length; local2717++) {
							@Pc(2722) DisplayMode local2722 = local2715[local2717];
							if (local2722.width == local157 && local2722.height == local192) {
								local89 = local2717;
								break;
							}
						}
						intStack[isp++] = local89;
						return;
					}
					if (arg0 == 5306) {
						intStack[isp++] = DisplayMode.getWindowMode();
						return;
					}
					if (arg0 == 5307) {
						local157 = intStack[--isp];
						if (local157 >= 1 && local157 <= 2) {
							DisplayMode.setWindowMode(-1, local157, false, -1);
							return;
						}
						return;
					}
					if (arg0 == 5308) {
						intStack[isp++] = client.preferences.favoriteWorlds;
						return;
					}
					if (arg0 == 5309) {
						local157 = intStack[--isp];
						if (local157 >= 1 && local157 <= 2) {
							client.preferences.favoriteWorlds = local157;
							client.preferences.write(GameShell.signlink);
							return;
						}
						return;
					}
				} else {
					@Pc(3230) String local3230;
					if (arg0 < 5500) {
						if (arg0 == 5400) {
							ssp -= 2;
							local75 = stringStack[ssp];
							local81 = stringStack[ssp + 1];
							local89 = intStack[--isp];
							Protocol.writeOpcode(ClientProt.PACKET_56);
							Protocol.outboundBuffer.p1(Buffer.getStringLength(local75) + Buffer.getStringLength(local81) + 1);
							Protocol.outboundBuffer.pjstr(local75);
							Protocol.outboundBuffer.pjstr(local81);
							Protocol.outboundBuffer.p1(local89);
							return;
						}
						if (arg0 == 5401) {
							isp -= 2;
							client.aShortArray79[intStack[isp]] = (short) ColorUtils.rgbToHsl(intStack[isp + 1]);
							client.ObjTypes.clearModels();
							client.ObjTypes.clearSprites();
							client.NpcTypes.clearModels();
							Static98.method2107();
							return;
						}
						if (arg0 == 5405) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							if (local157 >= 0 && local157 < 2) {
								Camera.anIntArrayArrayArray13[local157] = new int[local192 << 1][4];
							}
							return;
						}
						if (arg0 == 5406) {
							isp -= 7;
							local157 = intStack[isp];
							local192 = intStack[isp + 1] << 1;
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							local2717 = intStack[isp + 4];
							@Pc(2990) int local2990 = intStack[isp + 5];
							@Pc(2996) int local2996 = intStack[isp + 6];
							if (local157 >= 0 && local157 < 2 && Camera.anIntArrayArrayArray13[local157] != null && local192 >= 0 && local192 < Camera.anIntArrayArrayArray13[local157].length) {
								Camera.anIntArrayArrayArray13[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) * 128, local95, (local89 & 0x3FFF) * 128, local2996 };
								Camera.anIntArrayArrayArray13[local157][local192 + 1] = new int[] { (local2717 >> 14 & 0x3FFF) * 128, local2990, (local2717 & 0x3FFF) * 128 };
							}
							return;
						}
						if (arg0 == 5407) {
							local157 = Camera.anIntArrayArrayArray13[intStack[--isp]].length >> 1;
							intStack[isp++] = local157;
							return;
						}
						if (arg0 == 5411) {
							if (GameShell.fullScreenFrame != null) {
								DisplayMode.setWindowMode(-1, client.preferences.favoriteWorlds, false, -1);
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
							if (Player.lastLogAddress != null) {
								if (Player.lastLogAddress.result == null) {
									local75 = StringUtils.formatIp(Player.lastLogAddress.intArg1);
								} else {
									local75 = (String) Player.lastLogAddress.result;
								}
							}
							stringStack[ssp++] = local75;
							return;
						}
						if (arg0 == 5420) {
							intStack[isp++] = Static215.anInt3795 == 3 ? 1 : 0;
							return;
						}
						if (arg0 == 5421) {
							if (GameShell.fullScreenFrame != null) {
								DisplayMode.setWindowMode(-1, client.preferences.favoriteWorlds, false, -1);
							}
							local75 = stringStack[--ssp];
							local1292 = intStack[--isp] == 1;
							local3230 = Static200.method3650() + local75;
							Static280.method4765(local3230, GameShell.signlink, Static77.anInt1762 == 1, local1292);
							return;
						}
						if (arg0 == 5422) {
							ssp -= 2;
							local75 = stringStack[ssp];
							local81 = stringStack[ssp + 1];
							local89 = intStack[--isp];
							if (local75.length() > 0) {
								if (PlayerList.playerNames == null) {
									PlayerList.playerNames = new String[PlayerList.anIntArray384[client.game.id]];
								}
								PlayerList.playerNames[local89] = local75;
							}
							if (local81.length() > 0) {
								if (Static333.playerNames2 == null) {
									Static333.playerNames2 = new String[PlayerList.anIntArray384[client.game.id]];
								}
								Static333.playerNames2[local89] = local81;
							}
							return;
						}
						if (arg0 == 5423) {
							System.out.println(stringStack[--ssp]);
							return;
						}
						if (arg0 == 5424) {
							isp -= 11;
							LoginManager.anInt4446 = intStack[isp];
							LoginManager.anInt6717 = intStack[isp + 1];
							LoginManager.anInt3697 = intStack[isp + 2];
							LoginManager.anInt1868 = intStack[isp + 3];
							LoginManager.anInt3731 = intStack[isp + 4];
							LoginManager.anInt1636 = intStack[isp + 5];
							LoginManager.anInt1722 = intStack[isp + 6];
							LoginManager.anInt6804 = intStack[isp + 7];
							LoginManager.anInt7211 = intStack[isp + 8];
							LoginManager.anInt6030 = intStack[isp + 9];
							LoginManager.anInt7118 = intStack[isp + 10];
							client.jsArchive8.isFileReady(LoginManager.anInt3731);
							client.jsArchive8.isFileReady(LoginManager.anInt1636);
							client.jsArchive8.isFileReady(LoginManager.anInt1722);
							client.jsArchive8.isFileReady(LoginManager.anInt6804);
							client.jsArchive8.isFileReady(LoginManager.anInt7211);
							Static337.aClass13_17 = null;
							Static110.aClass13_6 = null;
							Static35.aClass13_3 = null;
							Static75.aClass13_5 = null;
							Static138.aClass13_8 = null;
							Static197.aClass13_12 = null;
							Static339.aClass13_18 = null;
							Static211.aClass13_13 = null;
							InterfaceList.aBoolean371 = true;
							return;
						}
						if (arg0 == 5425) {
							LoginManager.method3502();
							InterfaceList.aBoolean371 = false;
							return;
						}
						if (arg0 == 5426) {
							isp -= 2;
							Minimap.anInt7263 = intStack[isp];
							Minimap.anInt1910 = intStack[isp + 1];
							return;
						}
						if (arg0 == 5427) {
							isp -= 2;
							Static135.anInt2523 = intStack[isp + 1];
							return;
						}
						if (arg0 == 5428) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							intStack[isp++] = Static281.method4785(local192, local157) ? 1 : 0;
							return;
						}
						if (arg0 == 5429) {
							Cheat.execute(stringStack[--ssp], false);
							return;
						}
					} else if (arg0 < 5600) {
						if (arg0 == 5500) {
							isp -= 4;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							Camera.method1545((local157 & 0x3FFF) - Camera.originZ, local89, local95, false, local192, (local157 >> 14 & 0x3FFF) - Camera.originX);
							return;
						}
						if (arg0 == 5501) {
							isp -= 4;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							Camera.method4203(local89, local192, (local157 & 0x3FFF) - Camera.originZ, local95, (local157 >> 14 & 0x3FFF) - Camera.originX);
							return;
						}
						if (arg0 == 5502) {
							isp -= 6;
							local157 = intStack[isp];
							if (local157 >= 2) {
								throw new RuntimeException();
							}
							Camera.anInt2717 = local157;
							local192 = intStack[isp + 1];
							if (local192 + 1 >= Camera.anIntArrayArrayArray13[Camera.anInt2717].length >> 1) {
								throw new RuntimeException();
							}
							Camera.anInt5567 = local192;
							Camera.anInt6533 = 0;
							Camera.anInt1038 = intStack[isp + 2];
							Camera.anInt3821 = intStack[isp + 3];
							local89 = intStack[isp + 4];
							if (local89 >= 2) {
								throw new RuntimeException();
							}
							Camera.anInt6455 = local89;
							local95 = intStack[isp + 5];
							if (local95 + 1 >= Camera.anIntArrayArrayArray13[Camera.anInt6455].length >> 1) {
								throw new RuntimeException();
							}
							Camera.anInt6398 = local95;
							Camera.anInt5911 = 3;
							return;
						}
						if (arg0 == 5503) {
							Camera.resetCameraEffects();
							return;
						}
						if (arg0 == 5504) {
							isp -= 2;
							Camera.clampCameraAngle(intStack[isp], intStack[isp + 1]);
							return;
						}
						if (arg0 == 5505) {
							intStack[isp++] = (int) Camera.pitchTarget >> 3;
							return;
						}
						if (arg0 == 5506) {
							intStack[isp++] = (int) Camera.yawTarget >> 3;
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
							local157 = intStack[--isp];
							local192 = local157 >> 14 & 0x3FFF;
							local89 = local157 & 0x3FFF;
							local192 -= Camera.originX;
							if (local192 < 0) {
								local192 = 0;
							} else if (local192 >= Static373.anInt7033) {
								local192 = Static373.anInt7033;
							}
							local89 -= Camera.originZ;
							if (local89 < 0) {
								local89 = 0;
							} else if (local89 >= Static242.anInt4449) {
								local89 = Static242.anInt4449;
							}
							Static394.anInt7264 = local192 * 128 + 64;
							Static348.anInt6448 = local89 * 128 + 64;
							Camera.anInt5911 = 4;
							return;
						}
						if (arg0 == 5512) {
							Static351.method5859();
							return;
						}
					} else if (arg0 < 5700) {
						if (arg0 == 5600) {
							ssp -= 2;
							local75 = stringStack[ssp];
							local81 = stringStack[ssp + 1];
							local89 = intStack[--isp];
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.anInt2803 == 0 && LoginManager.loginStep == 0 && AccountCreationManager.step == 0 && WorldList.step == 0) {
								LoginManager.method2087(local81, local75, local89);
								return;
							}
							return;
						}
						if (arg0 == 5601) {
							LoginManager.method5435();
							return;
						}
						if (arg0 == 5602) {
							if (LoginManager.loginStep == 0) {
								LoginManager.loginResult = -2;
							}
							return;
						}
						if (arg0 == 5603) {
							isp -= 4;
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.anInt2803 == 0 && LoginManager.loginStep == 0 && AccountCreationManager.step == 0 && WorldList.step == 0) {
								AccountCreationManager.checkInfo(intStack[isp + 3], intStack[isp + 2], intStack[isp], intStack[isp + 1]);
								return;
							}
							return;
						}
						if (arg0 == 5604) {
							ssp--;
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.anInt2803 == 0 && LoginManager.loginStep == 0 && AccountCreationManager.step == 0 && WorldList.step == 0) {
								AccountCreationManager.checkName(StringUtils.toBase37(stringStack[ssp]));
								return;
							}
							return;
						}
						if (arg0 == 5605) {
							ssp -= 3;
							isp -= 7;
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.anInt2803 == 0 && LoginManager.loginStep == 0 && AccountCreationManager.step == 0 && WorldList.step == 0) {
								AccountCreationManager.createAccount(stringStack[ssp + 1], intStack[isp], intStack[isp + 3], intStack[isp + 4] == 1, StringUtils.toBase37(stringStack[ssp]), intStack[isp + 2], intStack[isp + 1], intStack[isp + 6] == 1, intStack[isp + 5] == 1, stringStack[ssp + 2]);
								return;
							}
							return;
						}
						if (arg0 == 5606) {
							if (AccountCreationManager.step == 0) {
								AccountCreationManager.reply = -2;
							}
							return;
						}
						if (arg0 == 5607) {
							intStack[isp++] = LoginManager.loginResult;
							return;
						}
						if (arg0 == 5608) {
							intStack[isp++] = LoginManager.hopTime;
							return;
						}
						if (arg0 == 5609) {
							intStack[isp++] = AccountCreationManager.reply;
							return;
						}
						if (arg0 == 5610) {
							for (local157 = 0; local157 < 5; local157++) {
								stringStack[ssp++] = AccountCreationManager.suggestedNames.length > local157 ? StringUtils.toTitleCase(AccountCreationManager.suggestedNames[local157]) : "";
							}
							AccountCreationManager.suggestedNames = null;
							return;
						}
						if (arg0 == 5611) {
							intStack[isp++] = LoginManager.disallowResult;
							return;
						}
					} else if (arg0 < 6100) {
						if (arg0 == 6001) {
							local157 = intStack[--isp];
							if (local157 < 1) {
								local157 = 1;
							}
							if (local157 > 4) {
								local157 = 4;
							}
							client.preferences.brightness = local157;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6002) {
							client.preferences.setAllVisibleLevels(intStack[--isp] == 1);
							Static347.method5827();
							Static226.method3982();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6003) {
							client.preferences.removeRoofsSelectively = intStack[--isp] == 1;
							Static226.method3982();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6005) {
							client.preferences.showGroundDecorations = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6006) {
							client.preferences.highDetailTextures = intStack[--isp] == 1;
							Rasteriser.textureProvider.method2874(!client.preferences.highDetailTextures);
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6007) {
							client.preferences.manyIdleAnimations = intStack[--isp];
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6008) {
							client.preferences.flickeringEffectsOn = intStack[--isp] == 1;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6009) {
							client.preferences.manyGroundTextures = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6010) {
							client.preferences.characterShadowsOn = intStack[--isp] == 1;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6011) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							client.preferences.sceneryShadowsType = local157;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6012) {
							client.preferences.highDetailLighting = intStack[--isp] == 1;
							Static174.method1506();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6014) {
							client.preferences.highWaterDetail = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6015) {
							client.preferences.fogEnabled = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6016) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							client.preferences.antiAliasingMode = local157;
							Static353.method5883();
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (arg0 == 6017) {
							client.preferences.stereo = intStack[--isp] == 1;
							Static178.method2342();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6018) {
							local157 = intStack[--isp];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							client.preferences.soundEffectVolume = local157;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6019) {
							local157 = intStack[--isp];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 255) {
								local157 = 255;
							}
							if (local157 != client.preferences.musicVolume) {
								if (client.preferences.musicVolume == 0 && MusicPlayer.groupId != -1) {
									MidiPlayer.playImmediate(local157, MusicPlayer.groupId, client.jsArchive6);
									MidiPlayer.jingle = false;
								} else if (local157 == 0) {
									MidiPlayer.method6192();
									MidiPlayer.jingle = false;
								} else {
									MidiPlayer.method5211(local157);
								}
								client.preferences.musicVolume = local157;
							}
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6020) {
							local157 = intStack[--isp];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							client.preferences.ambientSoundsVolume = local157;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6021) {
							client.preferences.neverRemoveRoofs = intStack[--isp] == 1;
							Static226.method3982();
							return;
						}
						if (arg0 == 6023) {
							local157 = intStack[--isp];
							local1292 = false;
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 2) {
								local157 = 2;
							}
							if (GameShell.maxMemory < 96) {
								local157 = 0;
								local1292 = true;
							}
							Preferences.setParticles(local157);
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							intStack[isp++] = local1292 ? 0 : 1;
							return;
						}
						if (arg0 == 6024) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							client.preferences.windowMode = local157;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (arg0 == 6025) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > Static289.method5019(GameShell.maxMemory)) {
								local157 = 0;
							}
							client.preferences.anInt4883 = local157;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6027) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 1) {
								local157 = 0;
							}
							Static284.method4882(local157 == 1);
							return;
						}
						if (arg0 == 6028) {
							client.preferences.cursorsEnabled = intStack[--isp] != 0;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (arg0 == 6029) {
							client.preferences.manyIdleAnimations = intStack[--isp];
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (arg0 == 6030) {
							client.preferences.gb = intStack[--isp] != 0;
							client.preferences.write(GameShell.signlink);
							Static347.method5827();
							return;
						}
						if (arg0 == 6031) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static78.method5701(local157);
							return;
						}
						if (arg0 == 6032) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							client.preferences.anInt4878 = local157;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (arg0 == 6033) {
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 4) {
								local157 = 2;
							}
							client.preferences.anInt4881 = local157;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (arg0 == 6035) {
							client.preferences.aBoolean365 = intStack[--isp] == 1;
							Static347.method5827();
							Static226.method3982();
							return;
						}
					} else if (arg0 < 6200) {
						if (arg0 == 6101) {
							intStack[isp++] = client.preferences.brightness;
							return;
						}
						if (arg0 == 6102) {
							intStack[isp++] = client.preferences.method4496(Static77.anInt1762) ? 1 : 0;
							return;
						}
						if (arg0 == 6103) {
							intStack[isp++] = client.preferences.removeRoofsSelectively ? 1 : 0;
							return;
						}
						if (arg0 == 6105) {
							intStack[isp++] = client.preferences.showGroundDecorations ? 1 : 0;
							return;
						}
						if (arg0 == 6106) {
							intStack[isp++] = client.preferences.highDetailTextures ? 1 : 0;
							return;
						}
						if (arg0 == 6107) {
							intStack[isp++] = client.preferences.manyIdleAnimations;
							return;
						}
						if (arg0 == 6108) {
							intStack[isp++] = client.preferences.flickeringEffectsOn ? 1 : 0;
							return;
						}
						if (arg0 == 6109) {
							intStack[isp++] = client.preferences.manyGroundTextures ? 1 : 0;
							return;
						}
						if (arg0 == 6110) {
							intStack[isp++] = client.preferences.characterShadowsOn ? 1 : 0;
							return;
						}
						if (arg0 == 6111) {
							intStack[isp++] = client.preferences.sceneryShadowsType;
							return;
						}
						if (arg0 == 6112) {
							intStack[isp++] = client.preferences.highDetailLighting ? 1 : 0;
							return;
						}
						if (arg0 == 6114) {
							intStack[isp++] = client.preferences.highWaterDetail ? 1 : 0;
							return;
						}
						if (arg0 == 6115) {
							intStack[isp++] = client.preferences.fogEnabled ? 1 : 0;
							return;
						}
						if (arg0 == 6116) {
							intStack[isp++] = client.preferences.antiAliasingMode;
							return;
						}
						if (arg0 == 6117) {
							intStack[isp++] = client.preferences.stereo ? 1 : 0;
							return;
						}
						if (arg0 == 6118) {
							intStack[isp++] = client.preferences.soundEffectVolume;
							return;
						}
						if (arg0 == 6119) {
							intStack[isp++] = client.preferences.musicVolume;
							return;
						}
						if (arg0 == 6120) {
							intStack[isp++] = client.preferences.ambientSoundsVolume;
							return;
						}
						if (arg0 == 6121) {
							intStack[isp++] = Rasteriser.textureProvider.method2894() ? 1 : 0;
							return;
						}
						if (arg0 == 6123) {
							intStack[isp++] = Static184.method3391();
							return;
						}
						if (arg0 == 6124) {
							intStack[isp++] = client.preferences.windowMode;
							return;
						}
						if (arg0 == 6125) {
							intStack[isp++] = client.preferences.anInt4883;
							return;
						}
						if (arg0 == 6126) {
							intStack[isp++] = Rasteriser.textureProvider.method2858() ? 1 : 0;
							return;
						}
						if (arg0 == 6127) {
							intStack[isp++] = client.preferences.aBoolean356 ? 1 : 0;
							return;
						}
						if (arg0 == 6128) {
							intStack[isp++] = client.preferences.cursorsEnabled ? 1 : 0;
							return;
						}
						if (arg0 == 6129) {
							intStack[isp++] = client.preferences.manyIdleAnimations;
							return;
						}
						if (arg0 == 6130) {
							intStack[isp++] = client.preferences.gb ? 1 : 0;
							return;
						}
						if (arg0 == 6131) {
							intStack[isp++] = Static77.anInt1762;
							return;
						}
						if (arg0 == 6132) {
							intStack[isp++] = client.preferences.anInt4878;
							return;
						}
						if (arg0 == 6133) {
							intStack[isp++] = Static215.anInt3795 == 1 || Static215.anInt3795 == 4 ? 1 : 0;
							return;
						}
						if (arg0 == 6134) {
							intStack[isp++] = Static289.method5019(GameShell.maxMemory);
							return;
						}
						if (arg0 == 6135) {
							intStack[isp++] = client.preferences.anInt4881;
							return;
						}
					} else if (arg0 < 6300) {
						if (arg0 == 6200) {
							isp -= 2;
							aShort73 = (short) intStack[isp];
							if (aShort73 <= 0) {
								aShort73 = 256;
							}
							aShort78 = (short) intStack[isp + 1];
							if (aShort78 <= 0) {
								aShort78 = 205;
							}
							return;
						}
						if (arg0 == 6201) {
							isp -= 2;
							aShort79 = (short) intStack[isp];
							if (aShort79 <= 0) {
								aShort79 = 256;
							}
							aShort36 = (short) intStack[isp + 1];
							if (aShort36 <= 0) {
								aShort36 = 320;
							}
							return;
						}
						if (arg0 == 6202) {
							isp -= 4;
							aShort86 = (short) intStack[isp];
							if (aShort86 <= 0) {
								aShort86 = 1;
							}
							aShort35 = (short) intStack[isp + 1];
							if (aShort35 <= 0) {
								aShort35 = 32767;
							} else if (aShort35 < aShort86) {
								aShort35 = aShort86;
							}
							aShort92 = (short) intStack[isp + 2];
							if (aShort92 <= 0) {
								aShort92 = 1;
							}
							aShort19 = (short) intStack[isp + 3];
							if (aShort19 <= 0) {
								aShort19 = 32767;
								return;
							}
							if (aShort19 < aShort92) {
								aShort19 = aShort92;
							}
							return;
						}
						if (arg0 == 6203) {
							method5273(0, Static20.aClass161_1.height, false, Static20.aClass161_1.width, 0);
							intStack[isp++] = Static155.anInt2808;
							intStack[isp++] = Static180.anInt3408;
							return;
						}
						if (arg0 == 6204) {
							intStack[isp++] = aShort79;
							intStack[isp++] = aShort36;
							return;
						}
						if (arg0 == 6205) {
							intStack[isp++] = aShort73;
							intStack[isp++] = aShort78;
							return;
						}
					} else if (arg0 < 6400) {
						if (arg0 == 6300) {
							intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
							return;
						}
						if (arg0 == 6301) {
							intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6302) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							calendar.clear();
							calendar.set(11, 12);
							calendar.set(local89, local192, local157);
							intStack[isp++] = (int) (calendar.getTime().getTime() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6303) {
							calendar.clear();
							calendar.setTime(new Date(MonotonicClock.currentTimeMillis()));
							intStack[isp++] = calendar.get(1);
							return;
						}
						if (arg0 == 6304) {
							local157 = intStack[--isp];
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
							intStack[isp++] = local1292 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6500) {
						if (arg0 == 6405) {
							intStack[isp++] = client.canShowVideoAd() ? 1 : 0;
							return;
						}
						if (arg0 == 6406) {
							intStack[isp++] = client.isShowingVideoAd() ? 1 : 0;
							return;
						}
					} else if (arg0 < 6600) {
						if (arg0 == 6500) {
							if (client.gameState == 10 && LoginManager.anInt2803 == 0 && LoginManager.loginStep == 0 && AccountCreationManager.step == 0) {
								intStack[isp++] = WorldList.fetch() == -1 ? 0 : 1;
								return;
							}
							intStack[isp++] = 1;
							return;
						}
						@Pc(5979) Country local5979;
						@Pc(5946) World local5946;
						if (arg0 == 6501) {
							local5946 = WorldList.head();
							if (local5946 != null) {
								intStack[isp++] = local5946.id;
								intStack[isp++] = local5946.flags;
								stringStack[ssp++] = local5946.activity;
								local5979 = local5946.getCountry();
								intStack[isp++] = local5979.flag;
								stringStack[ssp++] = local5979.name;
								intStack[isp++] = local5946.players;
								intStack[isp++] = local5946.ping;
								return;
							}
							intStack[isp++] = -1;
							intStack[isp++] = 0;
							stringStack[ssp++] = "";
							intStack[isp++] = 0;
							stringStack[ssp++] = "";
							intStack[isp++] = 0;
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6502) {
							local5946 = WorldList.next();
							if (local5946 != null) {
								intStack[isp++] = local5946.id;
								intStack[isp++] = local5946.flags;
								stringStack[ssp++] = local5946.activity;
								local5979 = local5946.getCountry();
								intStack[isp++] = local5979.flag;
								stringStack[ssp++] = local5979.name;
								intStack[isp++] = local5946.players;
								intStack[isp++] = local5946.ping;
								return;
							}
							intStack[isp++] = -1;
							intStack[isp++] = 0;
							stringStack[ssp++] = "";
							intStack[isp++] = 0;
							stringStack[ssp++] = "";
							intStack[isp++] = 0;
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6503) {
							local157 = intStack[--isp];
							if (client.gameState == 10 && LoginManager.anInt2803 == 0 && LoginManager.loginStep == 0 && AccountCreationManager.step == 0) {
								intStack[isp++] = WorldList.switchWorld(local157) ? 1 : 0;
								return;
							}
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6504) {
							client.preferences.lastWorldId = intStack[--isp];
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (arg0 == 6505) {
							intStack[isp++] = client.preferences.lastWorldId;
							return;
						}
						if (arg0 == 6506) {
							local157 = intStack[--isp];
							@Pc(6295) World local6295 = WorldList.get(local157);
							if (local6295 != null) {
								intStack[isp++] = local6295.flags;
								stringStack[ssp++] = local6295.activity;
								@Pc(6319) Country local6319 = local6295.getCountry();
								intStack[isp++] = local6319.flag;
								stringStack[ssp++] = local6319.name;
								intStack[isp++] = local6295.players;
								intStack[isp++] = local6295.ping;
								return;
							}
							intStack[isp++] = -1;
							stringStack[ssp++] = "";
							intStack[isp++] = 0;
							stringStack[ssp++] = "";
							intStack[isp++] = 0;
							intStack[isp++] = 0;
							return;
						}
						if (arg0 == 6507) {
							isp -= 4;
							local157 = intStack[isp];
							local1292 = intStack[isp + 1] == 1;
							local89 = intStack[isp + 2];
							local1903 = intStack[isp + 3] == 1;
							WorldList.sort(local1292, local1903, local89, local157);
							return;
						}
						if (arg0 == 6508) {
							Static200.method3644();
							return;
						}
						if (arg0 == 6509) {
							if (client.gameState != 10) {
								return;
							}
							WorldList.refreshing = intStack[--isp] == 1;
							return;
						}
					} else if (arg0 < 6700) {
						if (arg0 == 6600) {
							client.preferences.aBoolean351 = intStack[--isp] == 1;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (arg0 == 6601) {
							intStack[isp++] = client.preferences.aBoolean351 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6800 && client.modeWhat == client.MODE_ENV_WIP) {
						if (arg0 == 6700) {
							local157 = Static329.aClass4_130.size();
							if (Static139.anInt2595 != -1) {
								local157++;
							}
							intStack[isp++] = local157;
							return;
						}
						if (arg0 == 6701) {
							local157 = intStack[--isp];
							if (Static139.anInt2595 != -1) {
								if (local157 == 0) {
									intStack[isp++] = Static139.anInt2595;
									return;
								}
								local157--;
							}
							@Pc(6577) Class2_Sub7 local6577 = (Class2_Sub7) Static329.aClass4_130.head();
							while (local157-- > 0) {
								local6577 = (Class2_Sub7) Static329.aClass4_130.next();
							}
							intStack[isp++] = local6577.anInt1370;
							return;
						}
						if (arg0 == 6702) {
							local157 = intStack[--isp];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								stringStack[ssp++] = "";
								return;
							}
							local81 = Static26.aClass161ArrayArray1[local157][0].aString43;
							if (local81 == null) {
								stringStack[ssp++] = "";
								return;
							}
							stringStack[ssp++] = local81.substring(0, local81.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local157 = intStack[--isp];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								intStack[isp++] = 0;
								return;
							}
							intStack[isp++] = Static26.aClass161ArrayArray1[local157].length;
							return;
						}
						if (arg0 == 6704) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								stringStack[ssp++] = "";
								return;
							}
							local3230 = Static26.aClass161ArrayArray1[local157][local192].aString43;
							if (local3230 == null) {
								stringStack[ssp++] = "";
								return;
							}
							stringStack[ssp++] = local3230;
							return;
						}
						if (arg0 == 6705) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								intStack[isp++] = 0;
								return;
							}
							intStack[isp++] = Static26.aClass161ArrayArray1[local157][local192].anInt4246;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 1, "", local89);
							return;
						}
						if (arg0 == 6708) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 2, "", local89);
							return;
						}
						if (arg0 == 6709) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 3, "", local89);
							return;
						}
						if (arg0 == 6710) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 4, "", local89);
							return;
						}
						if (arg0 == 6711) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 5, "", local89);
							return;
						}
						if (arg0 == 6712) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 6, "", local89);
							return;
						}
						if (arg0 == 6713) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 7, "", local89);
							return;
						}
						if (arg0 == 6714) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 8, "", local89);
							return;
						}
						if (arg0 == 6715) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 9, "", local89);
							return;
						}
						if (arg0 == 6716) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 10, "", local89);
							return;
						}
						if (arg0 == 6717) {
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							@Pc(7165) Class161 local7165 = InterfaceList.method3705(local157 << 16 | local192, local89);
							Static207.method3699();
							@Pc(7170) ServerActiveProperties local7170 = Static45.method1404(local7165);
							Static185.method3400(local7165.anInt4238, local7170.getTargetMask(), local157 << 16 | local192, local89, local7165.anInt4286, local7170.anInt1759);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(7207) MelType local7207;
						if (arg0 == 6800) {
							local157 = intStack[--isp];
							local7207 = client.MelTypes.method3379(local157);
							if (local7207.aString48 == null) {
								stringStack[ssp++] = "";
								return;
							}
							stringStack[ssp++] = local7207.aString48;
							return;
						}
						if (arg0 == 6801) {
							local157 = intStack[--isp];
							local7207 = client.MelTypes.method3379(local157);
							intStack[isp++] = local7207.anInt4420;
							return;
						}
						if (arg0 == 6802) {
							local157 = intStack[--isp];
							local7207 = client.MelTypes.method3379(local157);
							intStack[isp++] = local7207.anInt4418;
							return;
						}
						if (arg0 == 6803) {
							local157 = intStack[--isp];
							local7207 = client.MelTypes.method3379(local157);
							intStack[isp++] = local7207.anInt4424;
							return;
						}
						if (arg0 == 6804) {
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							@Pc(7329) ParamType local7329 = client.ParamTypes.get(local192);
							if (local7329.isString()) {
								stringStack[ssp++] = client.MelTypes.method3379(local157).method4185(local192, local7329.defaultString);
								return;
							}
							intStack[isp++] = client.MelTypes.method3379(local157).method4188(local7329.defaultInt, local192);
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
		isp = 0;
		ssp = 0;
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
						runScript5000(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						runScript10000(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					intStack[isp++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						intStack[isp++] = Static214.aClass226_1.anIntArray430[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static214.aClass226_1.method5780(local54, intStack[--isp]);
					} else if (local31 == 3) {
						stringStack[ssp++] = arg0.aStringArray27[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						isp -= 2;
						if (intStack[isp] == intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						isp -= 2;
						if (intStack[isp] > intStack[isp + 1]) {
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
						intStack[isp++] = Static214.aClass226_1.method5778(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static214.aClass226_1.method5779(local54, intStack[--isp]);
					} else if (local31 == 31) {
						isp -= 2;
						if (intStack[isp] <= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						isp -= 2;
						if (intStack[isp] >= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						intStack[isp++] = anIntArray212[local11[local5]];
					} else if (local31 == 34) {
						anIntArray212[local11[local5]] = intStack[--isp];
					} else if (local31 == 35) {
						stringStack[ssp++] = aStringArray30[local11[local5]];
					} else if (local31 == 36) {
						aStringArray30[local11[local5]] = stringStack[--ssp];
					} else if (local31 == 37) {
						local54 = local11[local5];
						ssp -= local54;
						@Pc(400) String local400 = Static89.method1940(ssp, stringStack, local54);
						stringStack[ssp++] = local400;
					} else if (local31 == 38) {
						isp--;
					} else if (local31 == 39) {
						ssp--;
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
								local446[local452] = intStack[isp + local452 - local436.anInt3230];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3227; local471++) {
								local450[local471] = stringStack[ssp + local471 - local436.anInt3227];
							}
							isp -= local436.anInt3230;
							ssp -= local436.anInt3227;
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
							intStack[isp++] = Static75.anIntArray117[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static75.anIntArray117[local54] = intStack[--isp];
							Static226.method3983(local54);
							Static273.aBoolean374 |= Static89.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = intStack[--isp];
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
							local603 = intStack[--isp];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							intStack[isp++] = anIntArrayArray27[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							isp -= 2;
							local603 = intStack[isp];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray27[local54][local603] = intStack[isp + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static75.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							stringStack[ssp++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static75.aStringArray11[local54] = stringStack[--ssp];
							Static290.method5023(local54);
						} else if (local31 == 51) {
							@Pc(774) HashTable local774 = arg0.aClass4Array1[local11[local5]];
							@Pc(787) Class2_Sub39 local787 = (Class2_Sub39) local774.get((long) intStack[--isp]);
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
				local855.append("CS2: ").append(arg0.key).append(" ");
				for (local603 = anInt3661 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass172Array1[local603].aClass2_Sub2_Sub11_1.key).append(" ");
				}
				local855.append("op: ").append(local13);
				Static262.report(local837, local855.toString());
			} else {
				Chat.add("Clientscript error in: " + arg0.aString27);
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
				DevConsole.log(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
	public static void method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1008) {
			method3596(Static138.aClass16_3, arg0, arg2);
		} else if (arg1 == 1002) {
			method3596(Static192.aClass16_5, arg0, arg2);
		} else if (arg1 == 1012) {
			method3596(Static250.aClass16_6, arg0, arg2);
		} else if (arg1 == 1003) {
			method3596(Static320.aClass16_8, arg0, arg2);
		} else if (arg1 == 1007) {
			method3596(Static135.aClass16_2, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIB)V")
	public static void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(44) int local44 = local21 * (aShort78 - aShort73) / 100 + aShort73;
		if (aShort86 > local44) {
			local44 = aShort86;
		} else if (local44 > aShort35) {
			local44 = aShort35;
		}
		@Pc(70) int local70 = arg1 * 512 * local44 / (arg3 * 334);
		@Pc(111) int local111;
		@Pc(118) int local118;
		@Pc(86) short local86;
		if (aShort92 > local70) {
			local86 = aShort92;
			local44 = arg3 * 334 * local86 / (arg1 * 512);
			if (local44 > aShort35) {
				local44 = aShort35;
				local111 = arg1 * local44 * 512 / (local86 * 334);
				local118 = (arg3 - local111) / 2;
				if (arg2) {
					Rasteriser.textureProvider.method2898();
					Rasteriser.textureProvider.method2868(arg1, arg0, arg4, -16777216, local118);
					Rasteriser.textureProvider.method2868(arg1, arg0 + arg3 - local118, arg4, -16777216, local118);
				}
				arg3 -= local118 * 2;
				arg0 += local118;
			}
		} else if (local70 > aShort19) {
			local86 = aShort19;
			local44 = local86 * 334 * arg3 / (arg1 * 512);
			if (aShort86 > local44) {
				local44 = aShort86;
				local111 = arg3 * 334 * local86 / (local44 * 512);
				local118 = (arg1 - local111) / 2;
				if (arg2) {
					Rasteriser.textureProvider.method2898();
					Rasteriser.textureProvider.method2868(local118, arg0, arg4, -16777216, arg3);
					Rasteriser.textureProvider.method2868(local118, arg0, arg4 + arg1 - local118, -16777216, arg3);
				}
				arg1 -= local118 * 2;
				arg4 += local118;
			}
		}
		Static235.anInt3368 = arg0;
		Static375.anInt7051 = arg4;
		Static155.anInt2808 = (short) arg3;
		Static320.anInt6006 = local44 * arg1 / 334;
		Static180.anInt3408 = (short) arg1;
	}

}
