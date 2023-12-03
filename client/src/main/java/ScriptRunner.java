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
	private static Component staticActiveComponent2;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Lclient!nk;")
	private static Component staticActiveComponent1;

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
	private static final int[] coord = new int[3];

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_30 = new LruHashTable(4);

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray31 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	private static void method3590(@OriginalArg(0) int arg0) {
		@Pc(3) Component local3 = InterfaceList.getComponent(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Component[] local13 = Static113.aClass161ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Component[] local19 = Static26.aClass161ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static113.aClass161ArrayArray2[local9] = new Component[local22];
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
	public static void execute(@OriginalArg(0) HookRequest arg0) {
		method3593(arg0, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!fn;I)V")
	private static void method3593(@OriginalArg(0) HookRequest arg0, @OriginalArg(1) int arg1) {
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
					local41 = arg0.source == null ? -1 : arg0.source.id;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2118;
				}
				if (local41 == -2147483643) {
					local41 = arg0.source == null ? -1 : arg0.source.activeComponentId;
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
		@Pc(137) Component local137;
		@Pc(25) int local25;
		@Pc(35) Component local35;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(210) Component local210;
		@Pc(13) int local13;
		if (opcode < 300) {
			if (opcode == 100) {
				// cc_create
				isp -= 3;
				local13 = intStack[isp];
				local19 = intStack[isp + 1];
				local25 = intStack[isp + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = InterfaceList.getComponent(local13);
				if (local35.activeComponents == null) {
					local35.activeComponents = new Component[local25 + 1];
				}
				if (local35.activeComponents.length <= local25) {
					@Pc(54) Component[] local54 = new Component[local25 + 1];
					for (local56 = 0; local56 < local35.activeComponents.length; local56++) {
						local54[local56] = local35.activeComponents[local56];
					}
					local35.activeComponents = local54;
				}
				if (local25 > 0 && local35.activeComponents[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Component local99 = new Component();
				local99.type = local19;
				local99.layer = local99.id = local35.id;
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
			@Pc(158) Component local158;
			if (opcode == 101) {
				// cc_delete
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
				// cc_deleteall
				local137 = InterfaceList.getComponent(intStack[--isp]);
				local137.activeComponents = null;
				InterfaceList.redraw(local137);
				return;
			}
			if (opcode == 200) {
				// cc_find
				isp -= 2;
				local13 = intStack[isp];
				local19 = intStack[isp + 1];
				local210 = InterfaceList.getCreatedComponent(local13, local19);
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
				// if_find
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
				// todo
				local13 = intStack[--isp];
				method3590(local13);
				return;
			}
			if (opcode == 203) {
				// todo
				local13 = intStack[--isp];
				method3597(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (opcode < 500) {
				if (opcode == 403) {
					// baseidkit
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
					// basecolour
					isp -= 2;
					local13 = intStack[isp];
					local19 = intStack[isp + 1];
					PlayerList.self.appearance.setColor(local13, local19);
					return;
				}
				if (opcode == 410) {
					// setgender
					local412 = intStack[--isp] != 0;
					PlayerList.self.appearance.setGender(local412);
					return;
				}
			} else if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
				@Pc(1101) String local1101;
				if (opcode >= 1100 && opcode < 1200 || !(opcode < 2100 || opcode >= 2200)) {
					if (opcode >= 2000) {
						// if_
						opcode -= 1000;
						local137 = InterfaceList.getComponent(intStack[--isp]);
					} else {
						// cc_
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
					}
					// add if/cc + name e.g. if_setscrollpos
					if (opcode == 1100) {
						// setscrollpos
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
							DelayedStateChange.setComponentScrollPositionClient(local137.id);
						}
						return;
					}
					if (opcode == 1101) {
						// setcolour
						local137.color = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentColorClient(local137.id);
						}
						return;
					}
					if (opcode == 1102) {
						// setfill
						local137.filled = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1103) {
						// settrans
						local137.alpha = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1104) {
						// setlinewid
						local137.lineWidth = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1105) {
						// setgraphic
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
						// set2dangle
						local137.angle2d = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1107) {
						// settiling
						local137.spriteTiling = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1108) {
						// setmodel
						local137.modelType = 1;
						local137.modelId = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelClient(local137.id);
						}
						return;
					}
					if (opcode == 1109) {
						// setmodelangle
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
						// setmodelanim
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
						// setmodelorthog
						local137.modelOrtho = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1112) {
						// settext
						local1101 = stringStack[--ssp];
						if (!local1101.equals(local137.text)) {
							local137.text = local1101;
							InterfaceList.redraw(local137);
						}
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentTextClient(local137.id);
						}
						return;
					}
					if (opcode == 1113) {
						// settextfont
						local137.font = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.method2439(local137.id);
						}
						return;
					}
					if (opcode == 1114) {
						// settextalign
						isp -= 3;
						local137.halign = intStack[isp];
						local137.valign = intStack[isp + 1];
						local137.vpadding = intStack[isp + 2];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1115) {
						// settextshadow
						local137.shadowed = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1116) {
						// setoutline
						local137.outlineThickness = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1117) {
						// setgraphicshadow
						local137.shadowColor = intStack[--isp];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1118) {
						// setvflip
						local137.vFlip = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1119) {
						// sethflip
						local137.hFlip = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1120) {
						// setscrollsize
						isp -= 2;
						local137.scrollMaxH = intStack[isp];
						local137.scrollMaxV = intStack[isp + 1];
						InterfaceList.redraw(local137);
						if (local137.type == 0) {
							DelayedStateChange.setComponentSizeClient(false, local137);
						}
						return;
					}
					if (opcode == 1121) {
						// todo: scale factor related to projection/modelOrtho?
						isp -= 2;
						local137.aShort62 = (short) intStack[isp];
						local137.aShort61 = (short) intStack[isp + 1];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1122) {
						// setalpha
						local137.hasAlpha = intStack[--isp] == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1123) {
						// setmodelzoom
						local137.modelZoom = intStack[--isp];
						InterfaceList.redraw(local137);
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelAngleClient(local137.id);
						}
						return;
					}
					if (opcode == 1124) {
						// setlinedirection
						local19 = intStack[--isp];
						local137.aBoolean292 = local19 == 1;
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1125) {
						// setmodelorigin
						isp -= 2;
						local137.anInt4307 = intStack[isp];
						local137.anInt4253 = intStack[isp + 1];
						InterfaceList.redraw(local137);
						return;
					}
				} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
					if (opcode >= 2000) {
						// if_
						opcode -= 1000;
						local137 = InterfaceList.getComponent(intStack[--isp]);
					} else {
						// cc_
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
					}
					// add if/cc + name e.g. if_setobject
					InterfaceList.redraw(local137);
					if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209 || opcode == 1212 || opcode == 1213) {
						// 1200: setobject
						// 1205: setobject_nonum
						// 1208: setobject_wearcol
						// 1209: setobject_wearcol_nonum
						// 1212: todo: setobject_alwaysnum?
						// 1213: todo: setobject_alwaysnum?
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
							local137.objWearColor = true;
						} else {
							local137.objWearColor = false;
						}
						@Pc(1537) ObjType local1537 = client.ObjTypes.get(local19);
						local137.modelXAngle = local1537.xAngle2d;
						local137.modelYAngle = local1537.yAngle2d;
						local137.modelYOffset = local1537.yOffset2d;
						local137.modelXOffset = local1537.xOffset2d;
						local137.modelZOffset = local1537.zOffset2d;
						local137.modelZoom = local1537.zoom2d;
						if (opcode == 1205 || opcode == 1209) {
							local137.showObjCount = 0;
						} else if (opcode == 1212 || opcode == 1213) {
							local137.showObjCount = 1;
						} else {
							local137.showObjCount = 2;
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
						// setnpchead
						local137.modelType = 2;
						local137.modelId = intStack[--isp];
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelClient(local137.id);
						}
						return;
					}
					if (opcode == 1202) {
						// setplayerhead_self
						local137.modelType = 3;
						local137.modelId = -1;
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelClient(local137.id);
						}
						return;
					}
					if (opcode == 1203) {
						// setnpcmodel
						local137.modelType = 6;
						local137.modelId = intStack[--isp];
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelClient(local137.id);
						}
						return;
					}
					if (opcode == 1204) {
						// setplayermodel
						local137.modelType = 5;
						local137.modelId = intStack[--isp];
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelClient(local137.id);
						}
						return;
					}
					if (opcode == 1206) {
						// todo
						isp -= 4;
						local137.anInt4280 = intStack[isp];
						local137.anInt4267 = intStack[isp + 1];
						local137.anInt4235 = intStack[isp + 2];
						local137.anInt4242 = intStack[isp + 3];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1207) {
						// todo
						isp -= 2;
						local137.anInt4270 = intStack[isp];
						local137.anInt4302 = intStack[isp + 1];
						InterfaceList.redraw(local137);
						return;
					}
					if (opcode == 1210) {
						// todo
						isp -= 4;
						local137.modelId = intStack[isp];
						local137.anInt4236 = intStack[isp + 1];
						if (intStack[isp + 2] == 1) {
							local137.modelType = 9;
						} else {
							local137.modelType = 8;
						}
						if (intStack[isp + 3] == 1) {
							local137.objWearColor = true;
						} else {
							local137.objWearColor = false;
						}
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelClient(local137.id);
						}
						return;
					}
					if (opcode == 1211) {
						// todo
						local137.modelType = 5;
						local137.modelId = PlayerList.selfId;
						local137.anInt4236 = 0;
						if (local137.activeComponentId == -1) {
							DelayedStateChange.setComponentModelClient(local137.id);
						}
						return;
					}
				} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
					if (opcode >= 2000) {
						// if_
						opcode -= 1000;
						local137 = InterfaceList.getComponent(intStack[--isp]);
					} else {
						// cc_
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
					}
					// add if/cc + name e.g. if_setop
					if (opcode == 1300) {
						// setop
						local19 = intStack[--isp] - 1;
						if (local19 >= 0 && local19 <= 9) {
							local137.setOp(local19, stringStack[--ssp]);
							return;
						}
						ssp--;
						return;
					}
					if (opcode == 1301) {
						// setdraggable
						isp -= 2;
						local19 = intStack[isp];
						local25 = intStack[isp + 1];
						local137.dragComponent = InterfaceList.getCreatedComponent(local19, local25);
						return;
					}
					if (opcode == 1302) {
						// setdraggablebehavior
						local19 = intStack[--isp];
						if (local19 != Static164.anInt3138 && local19 != Static158.anInt2895 && local19 != Static83.anInt1838) {
							return;
						}
						local137.dragRender = local19;
						return;
					}
					if (opcode == 1303) {
						// setdragdeadzone
						local137.dragDeadZone = intStack[--isp];
						return;
					}
					if (opcode == 1304) {
						// setdragdeadtime
						local137.dragDeadTime = intStack[--isp];
						return;
					}
					if (opcode == 1305) {
						// setopbase
						local137.opBase = stringStack[--ssp];
						return;
					}
					if (opcode == 1306) {
						// settargetverb
						local137.targetVerb = stringStack[--ssp];
						return;
					}
					if (opcode == 1307) {
						// clearops
						local137.ops = null;
						return;
					}
					if (opcode == 1308) {
						// settargetcursors
						local137.anInt4286 = intStack[--isp];
						local137.anInt4238 = intStack[--isp];
						return;
					}
					if (opcode == 1309) {
						// setopcursor
						local19 = intStack[--isp];
						local25 = intStack[--isp];
						if (local25 >= 1 && local25 <= 10) {
							local137.setOpCursor(local19, local25 - 1);
						}
						return;
					}
					if (opcode == 1310) {
						// setpausetext
						local137.pauseText = stringStack[--ssp];
						return;
					}
					if (opcode == 1311) {
						// settargetopcursor
						local137.targetOpCursor = intStack[--isp];
						return;
					}
				} else {
					@Pc(2194) int local2194;
					if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
						if (opcode >= 2000) {
							// if_
							opcode -= 1000;
							local137 = InterfaceList.getComponent(intStack[--isp]);
						} else {
							// cc_
							local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						}
						// add if/cc + name e.g. if_setonclick
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
							// setonclick
							local137.onClick = local2189;
						} else if (opcode == 1401) {
							// setonhold
							local137.onHold = local2189;
						} else if (opcode == 1402) {
							// setonrelease
							local137.onRelease = local2189;
						} else if (opcode == 1403) {
							// setonmouseover
							local137.onMouseOver = local2189;
						} else if (opcode == 1404) {
							// setonmouseleave
							local137.onMouseLeave = local2189;
						} else if (opcode == 1405) {
							// setondrag
							local137.onDrag = local2189;
						} else if (opcode == 1406) {
							// setontargetleave
							local137.onTargetLeave = local2189;
						} else if (opcode == 1407) {
							// setonvartransmit
							local137.onVarTransmit = local2189;
							local137.varpTriggers = local2137;
						} else if (opcode == 1408) {
							// setontimer
							local137.onTimer = local2189;
						} else if (opcode == 1409) {
							// setonop
							local137.onOp = local2189;
						} else if (opcode == 1410) {
							// setondragcomplete
							local137.onDragComplete = local2189;
						} else if (opcode == 1411) {
							// setonclickrepeat
							local137.onClickRepeat = local2189;
						} else if (opcode == 1412) {
							// setonmouserepeat
							local137.onMouseRepeat = local2189;
						} else if (opcode == 1414) {
							// setoninvtransmit
							local137.onInvTransmit = local2189;
							local137.invTriggers = local2137;
						} else if (opcode == 1415) {
							// setonstattransmit
							local137.onStatTransmit = local2189;
							local137.statTriggers = local2137;
						} else if (opcode == 1416) {
							// setontargetenter
							local137.onTargetEnter = local2189;
						} else if (opcode == 1417) {
							// setonscrollwheel
							local137.onScrollWheel = local2189;
						} else if (opcode == 1418) {
							// setonchattransmit
							local137.onChatTransmit = local2189;
						} else if (opcode == 1419) {
							// setonkey
							local137.onKey = local2189;
						} else if (opcode == 1420) {
							// setonfriendtransmit
							local137.onFriendTransmit = local2189;
						} else if (opcode == 1421) {
							// setonclantransmit
							local137.onClanTransmit = local2189;
						} else if (opcode == 1422) {
							// setonmisctransmit
							local137.onMiscTransmit = local2189;
						} else if (opcode == 1423) {
							// setondialogabort
							local137.onDialogAbort = local2189;
						} else if (opcode == 1424) {
							// setonsubchange
							local137.onSubChange = local2189;
						} else if (opcode == 1425) {
							// setonstocktransmit
							local137.onStockTransmit = local2189;
						} else if (opcode == 1426) {
							// setoncamfinished
							local137.onCamFinished = local2189;
						} else if (opcode == 1427) {
							// setonresize
							local137.onResize = local2189;
						} else if (opcode == 1428) {
							// setonvarctransmit
							local137.onVarcTransmit = local2189;
							local137.varcTriggers = local2137;
						} else if (opcode == 1429) {
							// setonvarcstrtransmit
							local137.onVarcStrTransmit = local2189;
							local137.varcStrTriggers = local2137;
						}
						local137.aBoolean296 = true;
						return;
					}
					if (opcode < 1600) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1500) {
							// cc_getx
							intStack[isp++] = local137.x;
							return;
						}
						if (opcode == 1501) {
							// cc_gety
							intStack[isp++] = local137.y;
							return;
						}
						if (opcode == 1502) {
							// cc_getwidth
							intStack[isp++] = local137.width;
							return;
						}
						if (opcode == 1503) {
							// cc_getheight
							intStack[isp++] = local137.height;
							return;
						}
						if (opcode == 1504) {
							// cc_gethide
							intStack[isp++] = local137.hidden ? 1 : 0;
							return;
						}
						if (opcode == 1505) {
							// cc_getlayer
							intStack[isp++] = local137.layer;
							return;
						}
					} else if (opcode < 1700) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1600) {
							// cc_getscrollx
							intStack[isp++] = local137.scrollX;
							return;
						}
						if (opcode == 1601) {
							// cc_getscrolly
							intStack[isp++] = local137.scrollY;
							return;
						}
						if (opcode == 1602) {
							// cc_gettext
							stringStack[ssp++] = local137.text;
							return;
						}
						if (opcode == 1603) {
							// cc_getscrollwidth
							intStack[isp++] = local137.scrollMaxH;
							return;
						}
						if (opcode == 1604) {
							// cc_getscrollheight
							intStack[isp++] = local137.scrollMaxV;
							return;
						}
						if (opcode == 1605) {
							// cc_getmodelzoom
							intStack[isp++] = local137.modelZoom;
							return;
						}
						if (opcode == 1606) {
							// cc_getmodelangle_x
							intStack[isp++] = local137.modelXAngle;
							return;
						}
						if (opcode == 1607) {
							// cc_getmodelangle_z
							intStack[isp++] = local137.modelYOffset;
							return;
						}
						if (opcode == 1608) {
							// cc_getmodelangle_y
							intStack[isp++] = local137.modelYAngle;
							return;
						}
						if (opcode == 1609) {
							// cc_gettrans
							intStack[isp++] = local137.alpha;
							return;
						}
						if (opcode == 1610) {
							// cc_getmodelxof
							intStack[isp++] = local137.modelXOffset;
							return;
						}
						if (opcode == 1611) {
							// cc_getmodelyof
							intStack[isp++] = local137.modelZOffset;
							return;
						}
						if (opcode == 1612) {
							// cc_getgraphic
							intStack[isp++] = local137.spriteId;
							return;
						}
					} else if (opcode < 1800) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1700) {
							// cc_getinvobject
							intStack[isp++] = local137.objId;
							return;
						}
						if (opcode == 1701) {
							// cc_getinvcount
							if (local137.objId != -1) {
								intStack[isp++] = local137.objCount;
								return;
							}
							intStack[isp++] = 0;
							return;
						}
						if (opcode == 1702) {
							// cc_hassub
							intStack[isp++] = local137.activeComponentId;
							return;
						}
					} else if (opcode < 1900) {
						local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
						if (opcode == 1800) {
							// cc_gettargetmask
							intStack[isp++] = InterfaceList.getServerActiveProperties(local137).getTargetMask();
							return;
						}
						if (opcode == 1801) {
							// cc_getop
							local19 = intStack[--isp];
							local19--;
							if (local137.ops != null && local19 < local137.ops.length && local137.ops[local19] != null) {
								stringStack[ssp++] = local137.ops[local19];
								return;
							}
							stringStack[ssp++] = "";
							return;
						}
						if (opcode == 1802) {
							// cc_getopbase
							if (local137.opBase == null) {
								stringStack[ssp++] = "";
								return;
							}
							stringStack[ssp++] = local137.opBase;
							return;
						}
					} else if (opcode < 2600) {
						local137 = InterfaceList.getComponent(intStack[--isp]);
						if (opcode == 2500) {
							// if_getx
							intStack[isp++] = local137.x;
							return;
						}
						if (opcode == 2501) {
							// if_gety
							intStack[isp++] = local137.y;
							return;
						}
						if (opcode == 2502) {
							// if_getwidth
							intStack[isp++] = local137.width;
							return;
						}
						if (opcode == 2503) {
							// if_getheight
							intStack[isp++] = local137.height;
							return;
						}
						if (opcode == 2504) {
							// if_gethide
							intStack[isp++] = local137.hidden ? 1 : 0;
							return;
						}
						if (opcode == 2505) {
							// if_getlayer
							intStack[isp++] = local137.layer;
							return;
						}
					} else if (opcode < 2700) {
						local137 = InterfaceList.getComponent(intStack[--isp]);
						if (opcode == 2600) {
							// if_getscrollx
							intStack[isp++] = local137.scrollX;
							return;
						}
						if (opcode == 2601) {
							// if_getscrolly
							intStack[isp++] = local137.scrollY;
							return;
						}
						if (opcode == 2602) {
							// if_gettext
							stringStack[ssp++] = local137.text;
							return;
						}
						if (opcode == 2603) {
							// if_getscrollwidth
							intStack[isp++] = local137.scrollMaxH;
							return;
						}
						if (opcode == 2604) {
							// if_getscrollheight
							intStack[isp++] = local137.scrollMaxV;
							return;
						}
						if (opcode == 2605) {
							// if_getmodelzoom
							intStack[isp++] = local137.modelZoom;
							return;
						}
						if (opcode == 2606) {
							// if_getmodelangle_x
							intStack[isp++] = local137.modelXAngle;
							return;
						}
						if (opcode == 2607) {
							// if_getmodelangle_z
							intStack[isp++] = local137.modelYOffset;
							return;
						}
						if (opcode == 2608) {
							// if_getmodelangle_y
							intStack[isp++] = local137.modelYAngle;
							return;
						}
						if (opcode == 2609) {
							// if_gettrans
							intStack[isp++] = local137.alpha;
							return;
						}
						if (opcode == 2610) {
							// if_getmodelxof
							intStack[isp++] = local137.modelXOffset;
							return;
						}
						if (opcode == 2611) {
							// if_getmodelyof
							intStack[isp++] = local137.modelZOffset;
							return;
						}
						if (opcode == 2612) {
							// if_getgraphic
							intStack[isp++] = local137.spriteId;
							return;
						}
					} else {
						@Pc(3356) SubInterface local3356;
						@Pc(3254) SubInterface local3254;
						if (opcode < 2800) {
							if (opcode == 2700) {
								// if_getinvobject
								local137 = InterfaceList.getComponent(intStack[--isp]);
								intStack[isp++] = local137.objId;
								return;
							}
							if (opcode == 2701) {
								// if_getinvcount
								local137 = InterfaceList.getComponent(intStack[--isp]);
								if (local137.objId != -1) {
									intStack[isp++] = local137.objCount;
									return;
								}
								intStack[isp++] = 0;
								return;
							}
							if (opcode == 2702) {
								// if_hassub
								local13 = intStack[--isp];
								local3254 = (SubInterface) InterfaceList.subInterfaces.get((long) local13);
								if (local3254 != null) {
									intStack[isp++] = 1;
									return;
								}
								intStack[isp++] = 0;
								return;
							}
							if (opcode == 2703) {
								// if_getnextsubid
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
								// 2704: if_hassubmodal
								// 2705: if_hassuboverlay
								isp -= 2;
								local13 = intStack[isp];
								local19 = intStack[isp + 1];
								local3356 = (SubInterface) InterfaceList.subInterfaces.get((long) local13);
								if (local3356 != null && local3356.id == local19) {
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
								// if_gettargetmask
								intStack[isp++] = InterfaceList.getServerActiveProperties(local137).getTargetMask();
								return;
							}
							if (opcode == 2801) {
								// if_getop
								local19 = intStack[--isp];
								local19--;
								if (local137.ops != null && local19 < local137.ops.length && local137.ops[local19] != null) {
									stringStack[ssp++] = local137.ops[local19];
									return;
								}
								stringStack[ssp++] = "";
								return;
							}
							if (opcode == 2802) {
								// if_getopbase
								if (local137.opBase == null) {
									stringStack[ssp++] = "";
									return;
								}
								stringStack[ssp++] = local137.opBase;
								return;
							}
						} else {
							@Pc(3493) String local3493;
							if (opcode < 3200) {
								if (opcode == 3100) {
									// mes
									local3493 = stringStack[--ssp];
									Chat.add(local3493);
									return;
								}
								if (opcode == 3101) {
									// anim
									isp -= 2;
									Player.animate(PlayerList.self, intStack[isp + 1], intStack[isp]);
									return;
								}
								if (opcode == 3103) {
									// if_close
									InterfaceList.closeModal();
									return;
								}
								if (opcode == 3104) {
									// resume_countdialog
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
									// resume_namedialog
									local3493 = stringStack[--ssp];
									Protocol.writeOpcode(ClientProt.RESUME_P_NAMEDIALOG);
									Protocol.outboundBuffer.p1(local3493.length() + 1);
									Protocol.outboundBuffer.pjstr(local3493);
									return;
								}
								if (opcode == 3106) {
									// resume_stringdialog
									local3493 = stringStack[--ssp];
									Protocol.writeOpcode(ClientProt.RESUME_P_STRINGDIALOG);
									Protocol.outboundBuffer.p1(local3493.length() + 1);
									Protocol.outboundBuffer.pjstr(local3493);
									return;
								}
								if (opcode == 3107) {
									// opplayer
									local13 = intStack[--isp];
									local1101 = stringStack[--ssp];
									Protocol.clickPlayerOption(local13, local1101);
									return;
								}
								if (opcode == 3108) {
									// if_dragpickup
									isp -= 3;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local25 = intStack[isp + 2];
									local35 = InterfaceList.getComponent(local25);
									Cs1ScriptRunner.method6335(local13, local19, local35);
									return;
								}
								if (opcode == 3109) {
									// cc_dragpickup
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local210 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
									Cs1ScriptRunner.method6335(local13, local19, local210);
									return;
								}
								if (opcode == 3110) {
									// resume_objdialog
									local13 = intStack[--isp];
									Protocol.writeOpcode(ClientProt.RESUME_P_OBJDIALOG);
									Protocol.outboundBuffer.p2(local13);
									return;
								}
								if (opcode == 3111) {
									// todo
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local3356 = (SubInterface) InterfaceList.subInterfaces.get((long) local13);
									if (local3356 != null) {
										Static276.method4655(true, local3356, local3356.id != local19);
									}
									Static382.method6365(local13, 3, true, local19);
									return;
								}
								if (opcode == 3112) {
									// todo
									isp--;
									local13 = intStack[isp];
									local3254 = (SubInterface) InterfaceList.subInterfaces.get((long) local13);
									if (local3254 != null && local3254.anInt1373 == 3) {
										Static276.method4655(true, local3254, true);
									}
									return;
								}
							} else if (opcode < 3300) {
								if (opcode == 3200) {
									// sound_synth
									isp -= 3;
									SoundPlayer.play(intStack[isp + 1], 255, intStack[isp + 2], intStack[isp]);
									return;
								}
								if (opcode == 3201) {
									// sound_song
									MusicPlayer.playSong(50, 255, intStack[--isp]);
									return;
								}
								if (opcode == 3202) {
									// sound_jingle
									isp -= 2;
									MusicPlayer.playJingle(intStack[isp], intStack[isp + 1], 255);
									return;
								}
								if (opcode == 3203) {
									// sound_synth_volume
									isp -= 4;
									SoundPlayer.play(intStack[isp + 1], intStack[isp + 3], intStack[isp + 2], intStack[isp]);
									return;
								}
								if (opcode == 3204) {
									// sound_song_volume
									isp -= 3;
									MusicPlayer.playSong(intStack[isp + 2], intStack[isp + 1], intStack[isp]);
									return;
								}
								if (opcode == 3205) {
									// sound_jingle_volume
									isp -= 3;
									MusicPlayer.playJingle(intStack[isp], intStack[isp + 1], intStack[isp + 2]);
									return;
								}
							} else if (opcode < 3400) {
								if (opcode == 3300) {
									// clientclock
									intStack[isp++] = client.cycle;
									return;
								}
								if (opcode == 3301) {
									// inv_getobj
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemType(false, local13, local19);
									return;
								}
								if (opcode == 3302) {
									// inv_getnum
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemCount(local19, false, local13);
									return;
								}
								if (opcode == 3303) {
									// inv_total
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getSlotTotal(local13, false, local19);
									return;
								}
								if (opcode == 3304) {
									// inv_size
									local13 = intStack[--isp];
									intStack[isp++] = client.InvTypes.get(local13).size;
									return;
								}
								if (opcode == 3305) {
									// stat
									local13 = intStack[--isp];
									intStack[isp++] = PlayerSkillXpTable.boostedLevels[local13];
									return;
								}
								if (opcode == 3306) {
									// stat_base
									local13 = intStack[--isp];
									intStack[isp++] = PlayerSkillXpTable.baseLevels[local13];
									return;
								}
								if (opcode == 3307) {
									// stat_xp
									local13 = intStack[--isp];
									intStack[isp++] = PlayerSkillXpTable.experience[local13];
									return;
								}
								if (opcode == 3308) {
									// coord
									@Pc(4136) byte local4136 = PlayerList.self.plane;
									local19 = (PlayerList.self.xFine >> 7) + Camera.originX;
									local25 = (PlayerList.self.zFine >> 7) + Camera.originZ;
									intStack[isp++] = (local4136 << 28) + (local19 << 14) + local25;
									return;
								}
								if (opcode == 3309) {
									// coordx
									local13 = intStack[--isp];
									intStack[isp++] = local13 >> 14 & 0x3FFF;
									return;
								}
								if (opcode == 3310) {
									// coordy
									local13 = intStack[--isp];
									intStack[isp++] = local13 >> 28;
									return;
								}
								if (opcode == 3311) {
									// coordz
									local13 = intStack[--isp];
									intStack[isp++] = local13 & 0x3FFF;
									return;
								}
								if (opcode == 3312) {
									// map_members
									intStack[isp++] = LoginManager.mapMembers ? 1 : 0;
									return;
								}
								if (opcode == 3313) {
									// invother_getobj
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemType(true, local13, local19);
									return;
								}
								if (opcode == 3314) {
									// invother_getnum
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getItemCount(local19, true, local13);
									return;
								}
								if (opcode == 3315) {
									// invother_total
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getSlotTotal(local13, true, local19);
									return;
								}
								if (opcode == 3316) {
									// staffmodlevel
									if (LoginManager.staffModLevel >= 2) {
										intStack[isp++] = LoginManager.staffModLevel;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3317) {
									// reboottimer
									intStack[isp++] = Player.rebootTimer;
									return;
								}
								if (opcode == 3318) {
									// map_world
									intStack[isp++] = Player.worldId;
									return;
								}
								if (opcode == 3321) {
									// runeneregy_visible
									intStack[isp++] = Player.energy;
									return;
								}
								if (opcode == 3322) {
									// runweight_visible
									intStack[isp++] = Player.weight;
									return;
								}
								if (opcode == 3323) {
									// playermod
									if (LoginManager.playerModLevel >= 5 && LoginManager.playerModLevel <= 9) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3324) {
									// playermodlevel
									if (LoginManager.playerModLevel >= 5 && LoginManager.playerModLevel <= 9) {
										intStack[isp++] = LoginManager.playerModLevel;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3325) {
									// playermember
									intStack[isp++] = LoginManager.playerMember ? 1 : 0;
									return;
								}
								if (opcode == 3326) {
									// comlevel_active
									intStack[isp++] = PlayerList.self.combatLevel;
									return;
								}
								if (opcode == 3327) {
									// gender
									intStack[isp++] = PlayerList.self.appearance.gender ? 1 : 0;
									return;
								}
								if (opcode == 3328) {
									// todo
									intStack[isp++] = LoginManager.playerUnderage && !LoginManager.parentalChatConsent ? 1 : 0;
									return;
								}
								if (opcode == 3329) {
									// map_quickchat
									intStack[isp++] = LoginManager.mapQuickChat ? 1 : 0;
									return;
								}
								if (opcode == 3330) {
									// inv_freespace
									local13 = intStack[--isp];
									intStack[isp++] = Inv.getFreeSpace(local13);
									return;
								}
								if (opcode == 3331) {
									// inv_totalparam
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getTotalParam(local19, false, local13);
									return;
								}
								if (opcode == 3332) {
									// inv_totalparam_stack
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = Inv.getTotalParam(local19, true, local13);
									return;
								}
								if (opcode == 3333) {
									// todo
									intStack[isp++] = LoginManager.anInt3714;
									return;
								}
								if (opcode == 3335) {
									// map_lang
									intStack[isp++] = client.language;
									return;
								}
								if (opcode == 3336) {
									// movecoord
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
									// affiliate
									intStack[isp++] = client.affiliate;
									return;
								}
								if (opcode == 3338) {
									// profilecpu
									intStack[isp++] = Static374.method6273();
									return;
								}
							} else if (opcode < 3500) {
								@Pc(4761) EnumType local4761;
								if (opcode == 3400) {
									// enum_string
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									local4761 = client.EnumTypes.get(local13);
									stringStack[ssp++] = local4761.getString(local19);
									return;
								}
								if (opcode == 3408) {
									// enum
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
									// enum_hasoutput
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
									// enum_hasoutput_string
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
									// enum_getoutputcount
									local13 = intStack[--isp];
									@Pc(4981) EnumType local4981 = client.EnumTypes.get(local13);
									intStack[isp++] = local4981.table.size();
									return;
								}
							} else if (opcode < 3700) {
								if (opcode == 3600) {
									// friend_count
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
									// friend_getname
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
									// friend_getworld
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 < FriendsList.size) {
										intStack[isp++] = FriendsList.worlds[local13];
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3603) {
									// friend_getrank
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 < FriendsList.size) {
										intStack[isp++] = FriendsList.ranks[local13];
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3604) {
									// friend_setrank
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									FriendsList.setRank(local19, local3493);
									return;
								}
								if (opcode == 3605) {
									// friend_add
									local3493 = stringStack[--ssp];
									FriendsList.add(local3493);
									return;
								}
								if (opcode == 3606) {
									// friend_del
									local3493 = stringStack[--ssp];
									FriendsList.remove(local3493);
									return;
								}
								if (opcode == 3607) {
									// ignore_add
									local3493 = stringStack[--ssp];
									IgnoreList.add(local3493, false);
									return;
								}
								if (opcode == 3608) {
									// ignore_del
									local3493 = stringStack[--ssp];
									IgnoreList.remove(local3493);
									return;
								}
								if (opcode == 3609) {
									// friend_test
									local3493 = stringStack[--ssp];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = FriendsList.contains(local3493) ? 1 : 0;
									return;
								}
								if (opcode == 3610) {
									// friend_getworldname
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 < FriendsList.size) {
										stringStack[ssp++] = FriendsList.worldNames[local13];
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3611) {
									// clan_getchatdisplayname
									if (ClanChat.name != null) {
										stringStack[ssp++] = StringUtils.toTitleCase(ClanChat.name);
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3612) {
									// clan_getchatcount
									if (ClanChat.name != null) {
										intStack[isp++] = ClanChat.size;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3613) {
									// clan_getchatusername
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										stringStack[ssp++] = ClanChat.members[local13].username2;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3614) {
									// clan_getchatuserworld
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										intStack[isp++] = ClanChat.members[local13].world;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3615) {
									// clan_getchatuserrank
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										intStack[isp++] = ClanChat.members[local13].rank;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3616) {
									// clan_getchatminkick
									intStack[isp++] = ClanChat.minKick;
									return;
								}
								if (opcode == 3617) {
									// clan_kickuser
									local3493 = stringStack[--ssp];
									ClanChat.kick(local3493);
									return;
								}
								if (opcode == 3618) {
									// clan_getchatrank
									intStack[isp++] = ClanChat.rank;
									return;
								}
								if (opcode == 3619) {
									// clan_joinchat
									local3493 = stringStack[--ssp];
									ClanChat.join(local3493);
									return;
								}
								if (opcode == 3620) {
									// clan_leavechat
									ClanChat.leave();
									return;
								}
								if (opcode == 3621) {
									// ignore_count
									if (FriendsList.status == 0) {
										intStack[isp++] = -1;
										return;
									}
									intStack[isp++] = IgnoreList.size;
									return;
								}
								if (opcode == 3622) {
									// ignore_getname
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
									// ignore_test
									local3493 = stringStack[--ssp];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = IgnoreList.contains(local3493) ? 1 : 0;
									return;
								}
								if (opcode == 3624) {
									// clan_isself
									local13 = intStack[--isp];
									if (ClanChat.members != null && local13 < ClanChat.size && ClanChat.members[local13].username.equalsIgnoreCase(PlayerList.self.username)) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3625) {
									// clan_getchatownername
									if (ClanChat.owner != null) {
										stringStack[ssp++] = ClanChat.owner;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3626) {
									// clan_getchatuserworldname
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										stringStack[ssp++] = ClanChat.members[local13].worldName;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3627) {
									// friend_platform
									local13 = intStack[--isp];
									if (FriendsList.status == 2 && local13 >= 0 && local13 < FriendsList.size) {
										intStack[isp++] = FriendsList.sameGame[local13] ? 1 : 0;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 3628) {
									// firned_getslotfromname
									local3493 = stringStack[--ssp];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									intStack[isp++] = FriendsList.indexOf(local3493);
									return;
								}
								if (opcode == 3629) {
									// playercountry
									intStack[isp++] = client.country;
									return;
								}
								if (opcode == 3630) {
									// ignore_add_temp
									local3493 = stringStack[--ssp];
									IgnoreList.add(local3493, true);
									return;
								}
								if (opcode == 3631) {
									// ignore_is_temp
									local13 = intStack[--isp];
									intStack[isp++] = IgnoreList.temporary[local13] ? 1 : 0;
									return;
								}
								if (opcode == 3632) {
									// clan_getchatusername_unfiltered
									local13 = intStack[--isp];
									if (ClanChat.name != null && local13 < ClanChat.size) {
										stringStack[ssp++] = ClanChat.members[local13].username;
										return;
									}
									stringStack[ssp++] = "";
									return;
								}
								if (opcode == 3633) {
									// todo: maybe ignore_getname_unfiltered
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
									// stockmarket_getoffertype
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].getType();
									return;
								}
								if (opcode == 3904) {
									// stockmarket_getofferitem
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].item;
									return;
								}
								if (opcode == 3905) {
									// stockmarket_getofferprice
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].price;
									return;
								}
								if (opcode == 3906) {
									// stockmarket_getoffercount
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].count;
									return;
								}
								if (opcode == 3907) {
									// stockmarket_getoffercompletedcount
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].completedCount;
									return;
								}
								if (opcode == 3908) {
									// stockmarket_getoffercompletedgold
									local13 = intStack[--isp];
									intStack[isp++] = StockMarketManager.offers[local13].completedGold;
									return;
								}
								if (opcode == 3910) {
									// stockmarket_isofferempty
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 0 ? 1 : 0;
									return;
								}
								if (opcode == 3911) {
									// stockmarket_isofferstable
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 2 ? 1 : 0;
									return;
								}
								if (opcode == 3912) {
									// stockmarket_isofferfinished
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 5 ? 1 : 0;
									return;
								}
								if (opcode == 3913) {
									// stockmarket_isofferadding
									local13 = intStack[--isp];
									local19 = StockMarketManager.offers[local13].getStatus();
									intStack[isp++] = local19 == 1 ? 1 : 0;
									return;
								}
							} else if (opcode < 4100) {
								if (opcode == 4000) {
									// add
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 + local19;
									return;
								}
								if (opcode == 4001) {
									// sub
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 - local19;
									return;
								}
								if (opcode == 4002) {
									// multiply
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 * local19;
									return;
								}
								if (opcode == 4003) {
									// divide
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 / local19;
									return;
								}
								if (opcode == 4004) {
									// random
									local13 = intStack[--isp];
									intStack[isp++] = (int) (Math.random() * (double) local13);
									return;
								}
								if (opcode == 4005) {
									// randominc
									local13 = intStack[--isp];
									intStack[isp++] = (int) (Math.random() * (double) (local13 + 1));
									return;
								}
								if (opcode == 4006) {
									// interpolate
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
									// addpercent
									isp -= 2;
									local6484 = intStack[isp];
									local6491 = intStack[isp + 1];
									intStack[isp++] = (int) (local6484 + local6484 * local6491 / 100L);
									return;
								}
								if (opcode == 4008) {
									// setbit
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 | 0x1 << local19;
									return;
								}
								if (opcode == 4009) {
									// clearbit
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 & -(0x1 << local19) - 1;
									return;
								}
								if (opcode == 4010) {
									// testbit
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
									return;
								}
								if (opcode == 4011) {
									// modulo
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 % local19;
									return;
								}
								if (opcode == 4012) {
									// pow
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
									// invpow
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
									// and
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 & local19;
									return;
								}
								if (opcode == 4015) {
									// or
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 | local19;
									return;
								}
								if (opcode == 4016) {
									// min
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 < local19 ? local13 : local19;
									return;
								}
								if (opcode == 4017) {
									// max
									isp -= 2;
									local13 = intStack[isp];
									local19 = intStack[isp + 1];
									intStack[isp++] = local13 > local19 ? local13 : local19;
									return;
								}
								if (opcode == 4018) {
									// scale
									isp -= 3;
									local6484 = intStack[isp];
									local6491 = intStack[isp + 1];
									@Pc(6872) long local6872 = (long) intStack[isp + 2];
									intStack[isp++] = (int) (local6484 * local6872 / local6491);
									return;
								}
							} else if (opcode < 4200) {
								if (opcode == 4100) {
									// append_num
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									stringStack[ssp++] = local3493 + local19;
									return;
								}
								if (opcode == 4101) {
									// append
									ssp -= 2;
									local3493 = stringStack[ssp];
									local1101 = stringStack[ssp + 1];
									stringStack[ssp++] = local3493 + local1101;
									return;
								}
								if (opcode == 4102) {
									// append_signnum
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									stringStack[ssp++] = local3493 + Static320.method5462(local19);
									return;
								}
								if (opcode == 4103) {
									// lowercase
									local3493 = stringStack[--ssp];
									stringStack[ssp++] = local3493.toLowerCase();
									return;
								}
								if (opcode == 4104) {
									// fromdate
									stringStack[ssp++] = method3594(intStack[--isp]);
									return;
								}
								if (opcode == 4105) {
									// text_gender
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
									// tostring
									local13 = intStack[--isp];
									stringStack[ssp++] = Integer.toString(local13);
									return;
								}
								if (opcode == 4107) {
									// compare
									ssp -= 2;
									intStack[isp++] = StringUtils.compare(stringStack[ssp + 1], stringStack[ssp], client.language);
									return;
								}
								@Pc(7155) Class239 local7155;
								if (opcode == 4108) {
									// paraheight
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									local7155 = Static101.method2165(local25, client.jsArchive13);
									intStack[isp++] = local7155.getParagraphLineCount(local3493, local19, Static124.aClass13Array27);
									return;
								}
								if (opcode == 4109) {
									// parawidth
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									local7155 = Static101.method2165(local25, client.jsArchive13);
									intStack[isp++] = local7155.getParagraphWidth(Static124.aClass13Array27, local3493, local19);
									return;
								}
								if (opcode == 4110) {
									// text_switch
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
									// escape
									local3493 = stringStack[--ssp];
									stringStack[ssp++] = StringUtils.escape(local3493);
									return;
								}
								if (opcode == 4112) {
									// append_char
									local3493 = stringStack[--ssp];
									local19 = intStack[--isp];
									if (local19 == -1) {
										throw new RuntimeException("null char");
									}
									stringStack[ssp++] = local3493 + (char) local19;
									return;
								}
								if (opcode == 4113) {
									// char_isprintable
									local13 = intStack[--isp];
									intStack[isp++] = StringUtils.isPrintable((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4114) {
									// char_isalphanumeric
									local13 = intStack[--isp];
									intStack[isp++] = StringUtils.isAlphanumeric((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4115) {
									// char_isalpha
									local13 = intStack[--isp];
									intStack[isp++] = StringUtils.isAlpha((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4116) {
									// char_isnumeric
									local13 = intStack[--isp];
									intStack[isp++] = StringUtils.isNumeric((char) local13) ? 1 : 0;
									return;
								}
								if (opcode == 4117) {
									// string_length
									local3493 = stringStack[--ssp];
									if (local3493 != null) {
										intStack[isp++] = local3493.length();
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (opcode == 4118) {
									// substring
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									stringStack[ssp++] = local3493.substring(local19, local25);
									return;
								}
								if (opcode == 4119) {
									// removetags
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
									// string_indexof_char
									local3493 = stringStack[--ssp];
									isp -= 2;
									local19 = intStack[isp];
									local25 = intStack[isp + 1];
									intStack[isp++] = local3493.indexOf(local19, local25);
									return;
								}
								if (opcode == 4121) {
									// string_indexof_string
									ssp -= 2;
									local3493 = stringStack[ssp];
									local1101 = stringStack[ssp + 1];
									local25 = intStack[--isp];
									intStack[isp++] = local3493.indexOf(local1101, local25);
									return;
								}
								if (opcode == 4122) {
									// char_tolowercase
									local13 = intStack[--isp];
									intStack[isp++] = Character.toLowerCase((char) local13);
									return;
								}
								if (opcode == 4123) {
									// char_touppercase
									local13 = intStack[--isp];
									intStack[isp++] = Character.toUpperCase((char) local13);
									return;
								}
								if (opcode == 4124) {
									// tostring_localised
									local412 = intStack[--isp] != 0;
									local19 = intStack[--isp];
									stringStack[ssp++] = Static172.fixedPointToString((long) local19, client.language, local412, 0);
									return;
								}
								if (opcode == 4125) {
									// stringwidth
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
										// oc_name
										local13 = intStack[--isp];
										stringStack[ssp++] = client.ObjTypes.get(local13).name;
										return;
									}
									@Pc(7803) ObjType local7803;
									if (opcode == 4201) {
										// oc_op
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
										// oc_iop
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
										// oc_cost
										local13 = intStack[--isp];
										intStack[isp++] = client.ObjTypes.get(local13).cost;
										return;
									}
									if (opcode == 4204) {
										// oc_stackable
										local13 = intStack[--isp];
										intStack[isp++] = client.ObjTypes.get(local13).stackable == 1 ? 1 : 0;
										return;
									}
									@Pc(7966) ObjType local7966;
									if (opcode == 4205) {
										// oc_cert
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
										// oc_uncert
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
										// oc_members
										local13 = intStack[--isp];
										intStack[isp++] = client.ObjTypes.get(local13).members ? 1 : 0;
										return;
									}
									if (opcode == 4208) {
										// oc_param
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
										// oc_icursor
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
										// oc_find
										local3493 = stringStack[--ssp];
										local19 = intStack[--isp];
										Find.search(local3493, local19 == 1);
										intStack[isp++] = Find.index;
										return;
									}
									if (opcode == 4211) {
										// oc_findnext
										if (Find.results != null && Find.size < Find.index) {
											intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
											return;
										}
										intStack[isp++] = -1;
										return;
									}
									if (opcode == 4212) {
										// oc_findrestart
										Find.size = 0;
										return;
									}
								} else if (opcode < 4400) {
									if (opcode == 4300) {
										// nc_param
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
										// lc_param
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
										// struct_param
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
									// bas_getanim_ready
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
					// if_
					opcode -= 1000;
					local137 = InterfaceList.getComponent(intStack[--isp]);
				} else {
					// cc_
					local137 = arg1 ? staticActiveComponent1 : staticActiveComponent2;
				}
				// add if/cc + name e.g. if_setposition
				if (opcode == 1000) {
					// setposition
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
						DelayedStateChange.setComponentPositionClient(local137.id);
					}
					return;
				}
				if (opcode == 1001) {
					// setsize
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
						DelayedStateChange.setComponentSizeClient(false, local137);
					}
					return;
				}
				if (opcode == 1003) {
					// sethide
					@Pc(620) boolean local620 = intStack[--isp] == 1;
					if (local137.hidden != local620) {
						local137.hidden = local620;
						InterfaceList.redraw(local137);
					}
					if (local137.activeComponentId == -1) {
						DelayedStateChange.setComponentHideClient(local137.id);
					}
					return;
				}
				if (opcode == 1004) {
					// setaspect
					isp -= 2;
					local137.aspectWidth = intStack[isp];
					local137.aspectHeight = intStack[isp + 1];
					InterfaceList.redraw(local137);
					InterfaceList.update(local137);
					if (local137.type == 0) {
						DelayedStateChange.setComponentSizeClient(false, local137);
					}
					return;
				}
				if (opcode == 1005) {
					// setnoclickthrough
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
			if (WorldMap.aClass161_11 != null) {
				local30 = WorldMap.aClass161_11.x;
				local32 = WorldMap.aClass161_11.y;
			}
			anIntArray212[0] = Mouse.instance.method3304() - local30;
			anIntArray212[1] = Mouse.instance.method3313() - local32;
		}
		method3600(local5, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	private static void method3597(@OriginalArg(0) int arg0) {
		@Pc(3) Component local3 = InterfaceList.getComponent(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Component[] local13 = Static113.aClass161ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Component[] local19 = Static26.aClass161ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static113.aClass161ArrayArray2[local9] = new Component[local22];
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
		@Pc(12) Component[] local12 = Static26.aClass161ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Component local19 = local12[local14];
			if (local19.anObjectArray22 != null) {
				@Pc(26) HookRequest local26 = new HookRequest();
				local26.source = local19;
				local26.anObjectArray4 = local19.anObjectArray22;
				method3593(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V")
	private static void runScript10000(@OriginalArg(0) int opcode, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1292) boolean local1292;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(89) int local89;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (opcode < 5100) {
			if (opcode == 5000) {
				// chat_getfilter_public
				intStack[isp++] = Chat.publicFilter;
				return;
			}
			if (opcode == 5001) {
				// chat_setfilter
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
			if (opcode == 5002) {
				// chat_sendabusereport
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
			if (opcode == 5003) {
				// chat_gethistorymessage
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
			if (opcode == 5004) {
				// chat_gethistorytype
				local157 = intStack[--isp];
				local192 = -1;
				if (local157 < 100 && Chat.messages[local157] != null) {
					local192 = Chat.types[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (opcode == 5005) {
				// chat_getfilter_private
				if (Chat.privateFilter == null) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Chat.privateFilter.setting;
				return;
			}
			if (opcode == 5008 || opcode == 5021) {
				// 5008: chat_sendpublic
				// 5021: todo
				local75 = stringStack[--ssp];
				Chat.sendPublicMessage(local75, opcode);
				return;
			}
			if (opcode == 5009) {
				// chat_sendprivate
				ssp -= 2;
				local75 = stringStack[ssp];
				local81 = stringStack[ssp + 1];
				if (LoginManager.staffModLevel != 0 || (!LoginManager.playerUnderage || LoginManager.parentalChatConsent) && !LoginManager.mapQuickChat) {
					Protocol.writeOpcode(ClientProt.MESSAGE_PRIVATE);
					Protocol.outboundBuffer.p1(0);
					local89 = Protocol.outboundBuffer.pos;
					Protocol.outboundBuffer.pjstr(local75);
					WordPack.encode(local81, Protocol.outboundBuffer);
					Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local89);
					return;
				}
				return;
			}
			if (opcode == 5010) {
				// chat_gethistoryname
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
			if (opcode == 5011) {
				// chat_gethistoryclan
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
			if (opcode == 5012) {
				// chat_gethistoryphrase
				local157 = intStack[--isp];
				local192 = -1;
				if (local157 < 100) {
					local192 = Chat.phraseIds[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (opcode == 5015) {
				// chat_playername
				if (PlayerList.self == null || PlayerList.self.username2 == null) {
					local75 = LoginManager.usernameInput;
				} else {
					local75 = PlayerList.self.getName();
				}
				stringStack[ssp++] = local75;
				return;
			}
			if (opcode == 5016) {
				// chat_getfilter_trade
				intStack[isp++] = Chat.tradeFilter;
				return;
			}
			if (opcode == 5017) {
				// chat_gethistorylength
				intStack[isp++] = Chat.size;
				return;
			}
			if (opcode == 5018) {
				// todo
				local157 = intStack[--isp];
				local192 = 0;
				if (local157 < 100 && Chat.messages[local157] != null) {
					local192 = Chat.types[local157];
				}
				intStack[isp++] = local192;
				return;
			}
			if (opcode == 5019) {
				// todo
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
			if (opcode == 5020) {
				// todo
				if (PlayerList.self == null || PlayerList.self.username2 == null) {
					local75 = LoginManager.usernameInput;
				} else {
					local75 = PlayerList.self.method4070();
				}
				stringStack[ssp++] = local75;
				return;
			}
			if (opcode == 5050) {
				// chatcat_getdesc
				local157 = intStack[--isp];
				stringStack[ssp++] = QuickChatCatTypeList.get(local157).aString37;
				return;
			}
			@Pc(584) QuickChatCatType local584;
			if (opcode == 5051) {
				// chatcat_getsubcatcount
				local157 = intStack[--isp];
				local584 = QuickChatCatTypeList.get(local157);
				if (local584.subcategories == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local584.subcategories.length;
				return;
			}
			if (opcode == 5052) {
				// chatcat_getsubcat
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				@Pc(628) QuickChatCatType type = QuickChatCatTypeList.get(local157);
				local95 = type.subcategories[local192];
				intStack[isp++] = local95;
				return;
			}
			if (opcode == 5053) {
				// chatcat_getphrasecount
				local157 = intStack[--isp];
				local584 = QuickChatCatTypeList.get(local157);
				if (local584.phrases == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local584.phrases.length;
				return;
			}
			if (opcode == 5054) {
				// chatcat_getphrase
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatCatTypeList.get(local157).phrases[local192];
				return;
			}
			if (opcode == 5055) {
				// chatphrase_gettext
				local157 = intStack[--isp];
				stringStack[ssp++] = QuickChatPhraseTypeList.get(local157).getText();
				return;
			}
			if (opcode == 5056) {
				// chatphrase_getautoresponsecount
				local157 = intStack[--isp];
				@Pc(750) QuickChatPhraseType local750 = QuickChatPhraseTypeList.get(local157);
				if (local750.automaticResponses == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local750.automaticResponses.length;
				return;
			}
			if (opcode == 5057) {
				// chatphrase_getautoresponse
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatPhraseTypeList.get(local157).automaticResponses[local192];
				return;
			}
			if (opcode == 5058) {
				// activechatphrase_prepare
				activePhrase = new QuickChatPhrase();
				activePhrase.id = intStack[--isp];
				activePhrase.type = QuickChatPhraseTypeList.get(activePhrase.id);
				activePhrase.values = new int[activePhrase.type.getDynamicCommandCount()];
				return;
			}
			if (opcode == 5059) {
				// activechatphrase_sendpublic
				Protocol.writeOpcode(ClientProt.MESSAGE_QUICKCHAT_PUBLIC);
				Protocol.outboundBuffer.p1(0);
				local157 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p1(0);
				Protocol.outboundBuffer.p2(activePhrase.id);
				activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local157);
				return;
			}
			if (opcode == 5060) {
				// activechatphrase_sendprivate
				local75 = stringStack[--ssp];
				Protocol.writeOpcode(ClientProt.MESSAGE_QUICKCHAT_PRIVATE);
				Protocol.outboundBuffer.p1(0);
				local192 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.pjstr(local75);
				Protocol.outboundBuffer.p2(activePhrase.id);
				activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local192);
				return;
			}
			if (opcode == 5061) {
				// activechatphrase_sendclan
				Protocol.writeOpcode(ClientProt.MESSAGE_QUICKCHAT_PUBLIC);
				Protocol.outboundBuffer.p1(0);
				local157 = Protocol.outboundBuffer.pos;
				Protocol.outboundBuffer.p1(1);
				Protocol.outboundBuffer.p2(activePhrase.id);
				activePhrase.type.encodeMessage(Protocol.outboundBuffer, activePhrase.values);
				Protocol.outboundBuffer.psize1(Protocol.outboundBuffer.pos - local157);
				return;
			}
			if (opcode == 5062) {
				// chatcat_getsubcatshortcut
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatCatTypeList.get(local157).subcategoryShortcuts[local192];
				return;
			}
			if (opcode == 5063) {
				// chatcat_getphraseshortcut
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				intStack[isp++] = QuickChatCatTypeList.get(local157).phraseShortcuts[local192];
				return;
			}
			if (opcode == 5064) {
				// chatcat_findsubcatbyshortcut
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
			if (opcode == 5065) {
				// chatcat_findphrasebyshortcut
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
			if (opcode == 5066) {
				// chatphrase_getdynamiccommandcount
				local157 = intStack[--isp];
				intStack[isp++] = QuickChatPhraseTypeList.get(local157).getDynamicCommandCount();
				return;
			}
			if (opcode == 5067) {
				// chatphrase_getdynamiccommand
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				local89 = QuickChatPhraseTypeList.get(local157).getDynamicCommand(local192);
				intStack[isp++] = local89;
				return;
			}
			if (opcode == 5068) {
				// activechatphrase_setdynamicint
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				activePhrase.values[local157] = local192;
				return;
			}
			if (opcode == 5069) {
				// activechatphrase_setdynamicobj
				isp -= 2;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				activePhrase.values[local157] = local192;
				return;
			}
			if (opcode == 5070) {
				// chatphrase_getdynamiccommandparam_enum
				isp -= 3;
				local157 = intStack[isp];
				local192 = intStack[isp + 1];
				local89 = intStack[isp + 2];
				@Pc(1245) QuickChatPhraseType type = QuickChatPhraseTypeList.get(local157);
				if (type.getDynamicCommand(local192) != 0) {
					throw new RuntimeException("bad command");
				}
				intStack[isp++] = type.getDynamicCommandParam(local192, local89);
				return;
			}
			if (opcode == 5071) {
				// chatphrase_find
				local75 = stringStack[--ssp];
				local1292 = intStack[--isp] == 1;
				Find.findQuickChatPhrases(local1292, local75);
				intStack[isp++] = Find.index;
				return;
			}
			if (opcode == 5072) {
				// chatphrase_findnext
				if (Find.results != null && Find.size < Find.index) {
					intStack[isp++] = Find.results[Find.size++] & 0xFFFF;
					return;
				}
				intStack[isp++] = -1;
				return;
			}
			if (opcode == 5073) {
				// chatphrase_findrestart
				Find.size = 0;
				return;
			}
		} else if (opcode < 5200) {
			if (opcode == 5100) {
				// keyheld_alt
				if (Keyboard.instance.isPressed(86)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 5101) {
				// keyheld_ctrl
				if (Keyboard.instance.isPressed(82)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 5102) {
				// keyheld_shift
				if (Keyboard.instance.isPressed(81)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
		} else {
			@Pc(1903) boolean local1903;
			if (opcode < 5300) {
				if (opcode == 5200) {
					// worldmap_setzoom
					WorldMap.setTargetZoom(intStack[--isp]);
					return;
				}
				if (opcode == 5201) {
					// worldmap_getzoom
					intStack[isp++] = WorldMap.getTargetZoom();
					return;
				}
				if (opcode == 5205) {
					// todo
					WorldMap.method4402(false, -1, intStack[--isp], -1);
					return;
				}
				@Pc(1492) Map local1492;
				if (opcode == 5206) {
					// worldmap_getmap
					local157 = intStack[--isp];
					local1492 = MapList.getContainingSource(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1492 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1492.id;
					return;
				}
				@Pc(1525) Map local1525;
				if (opcode == 5207) {
					// worldmap_getmapname
					local1525 = MapList.get(intStack[--isp]);
					if (local1525 != null && local1525.name != null) {
						stringStack[ssp++] = local1525.name;
						return;
					}
					stringStack[ssp++] = "";
					return;
				}
				if (opcode == 5208) {
					// worldmap_getsize
					intStack[isp++] = WorldMap.anInt1105;
					intStack[isp++] = WorldMap.anInt6930;
					return;
				}
				if (opcode == 5209) {
					// worldmap_getdisplayposition
					intStack[isp++] = WorldMap.anInt2772 + WorldMap.originX;
					intStack[isp++] = WorldMap.anInt2003 + WorldMap.originZ;
					return;
				}
				if (opcode == 5210) {
					// todo
					local157 = intStack[--isp];
					local1492 = MapList.get(local157);
					if (local1492 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1492.origin >> 14 & 0x3FFF;
					intStack[isp++] = local1492.origin & 0x3FFF;
					return;
				}
				if (opcode == 5211) {
					// todo
					local157 = intStack[--isp];
					local1492 = MapList.get(local157);
					if (local1492 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1492.displayMaxX - local1492.displayMinX;
					intStack[isp++] = local1492.displayMaxY - local1492.displayMinY;
					return;
				}
				@Pc(1715) MapElement element;
				if (opcode == 5212) {
					// todo
					element = WorldMap.headMapElement();
					if (element == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = element.id;
					local192 = element.level << 28 | element.x + WorldMap.originX << 14 | element.z + WorldMap.originZ;
					intStack[isp++] = local192;
					return;
				}
				if (opcode == 5213) {
					// todo
					element = WorldMap.nextMapElement();
					if (element == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = element.id;
					local192 = element.level << 28 | element.x + WorldMap.originX << 14 | element.z + WorldMap.originZ;
					intStack[isp++] = local192;
					return;
				}
				@Pc(1863) boolean local1863;
				if (opcode == 5214) {
					// todo
					local157 = intStack[--isp];
					local1492 = WorldMap.getCurrentMap();
					if (local1492 != null) {
						local1863 = local1492.convertSourceToDisplay(local157 >> 28 & 0x3, coord, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							WorldMap.method394(coord[2], coord[1]);
						}
					}
					return;
				}
				if (opcode == 5215) {
					// todo
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					@Pc(1901) SecondaryLinkedList maps = MapList.getAllContainingSource(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1903 = false;
					for (@Pc(1908) Map local1908 = (Map) maps.head(); local1908 != null; local1908 = (Map) maps.next()) {
						if (local1908.id == local192) {
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
				if (opcode == 5218) {
					// worldmap_getconfigzoom
					local157 = intStack[--isp];
					local1492 = MapList.get(local157);
					if (local1492 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1492.defaultZoom;
					return;
				}
				if (opcode == 5220) {
					// worldmap_isloaded
					intStack[isp++] = WorldMap.loadPercentage == 100 ? 1 : 0;
					return;
				}
				if (opcode == 5221) {
					// todo
					local157 = intStack[--isp];
					WorldMap.method394(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (opcode == 5222) {
					// todo
					local1525 = WorldMap.getCurrentMap();
					if (local1525 != null) {
						local1292 = local1525.convertDisplayToSource(coord, WorldMap.anInt2003 + WorldMap.originZ, WorldMap.anInt2772 + WorldMap.originX);
						if (local1292) {
							intStack[isp++] = coord[1];
							intStack[isp++] = coord[2];
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
				if (opcode == 5223) {
					// todo
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					WorldMap.method4402(false, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (opcode == 5224) {
					// todo
					local157 = intStack[--isp];
					local1492 = WorldMap.getCurrentMap();
					if (local1492 != null) {
						local1863 = local1492.convertSourceToDisplay(local157 >> 28 & 0x3, coord, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							intStack[isp++] = coord[1];
							intStack[isp++] = coord[2];
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
				if (opcode == 5225) {
					// todo
					local157 = intStack[--isp];
					local1492 = WorldMap.getCurrentMap();
					if (local1492 != null) {
						local1863 = local1492.convertDisplayToSource(coord, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1863) {
							intStack[isp++] = coord[1];
							intStack[isp++] = coord[2];
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
				if (opcode == 5226) {
					// todo
					WorldMap.method3955(intStack[--isp]);
					return;
				}
				if (opcode == 5227) {
					// todo
					isp -= 2;
					local157 = intStack[isp];
					local192 = intStack[isp + 1];
					WorldMap.method4402(true, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (opcode == 5228) {
					// todo
					WorldMap.aBoolean225 = intStack[--isp] == 1;
					return;
				}
				if (opcode == 5229) {
					// todo
					intStack[isp++] = WorldMap.aBoolean225 ? 1 : 0;
					return;
				}
				if (opcode == 5230) {
					// todo
					local157 = intStack[--isp];
					WorldMap.method4027(local157);
					return;
				}
				@Pc(2421) Node local2421;
				if (opcode == 5231) {
					// todo
					isp -= 2;
					local157 = intStack[isp];
					local1292 = intStack[isp + 1] == 1;
					if (WorldMap.visibleMapElementCategories != null) {
						local2421 = WorldMap.visibleMapElementCategories.get((long) local157);
						if (local2421 != null && !local1292) {
							local2421.unlink();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Node();
							WorldMap.visibleMapElementCategories.put(local2421, (long) local157);
						}
					}
					return;
				}
				@Pc(2463) Node local2463;
				if (opcode == 5232) {
					// todo
					local157 = intStack[--isp];
					if (WorldMap.visibleMapElementCategories != null) {
						local2463 = WorldMap.visibleMapElementCategories.get((long) local157);
						intStack[isp++] = local2463 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (opcode == 5233) {
					// todo
					isp -= 2;
					local157 = intStack[isp];
					local1292 = intStack[isp + 1] == 1;
					if (WorldMap.visibleMapElementIds != null) {
						local2421 = WorldMap.visibleMapElementIds.get((long) local157);
						if (local2421 != null && !local1292) {
							local2421.unlink();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Node();
							WorldMap.visibleMapElementIds.put(local2421, (long) local157);
						}
					}
					return;
				}
				if (opcode == 5234) {
					// todo
					local157 = intStack[--isp];
					if (WorldMap.visibleMapElementIds != null) {
						local2463 = WorldMap.visibleMapElementIds.get((long) local157);
						intStack[isp++] = local2463 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (opcode == 5235) {
					// todo
					intStack[isp++] = WorldMap.currentMap == null ? -1 : WorldMap.currentMap.id;
					return;
				}
			} else {
				@Pc(2717) int local2717;
				if (opcode < 5400) {
					if (opcode == 5300) {
						// fullscreen_enter
						isp -= 2;
						local157 = intStack[isp];
						local192 = intStack[isp + 1];
						DisplayMode.setWindowMode(local192, 3, false, local157);
						intStack[isp++] = GameShell.fullScreenFrame == null ? 0 : 1;
						return;
					}
					if (opcode == 5301) {
						// fullscreen_exit
						if (GameShell.fullScreenFrame != null) {
							DisplayMode.setWindowMode(-1, client.preferences.windowMode, false, -1);
						}
						return;
					}
					if (opcode == 5302) {
						// fullscreen_modecount
						@Pc(2654) DisplayMode[] modes = DisplayMode.getModes();
						intStack[isp++] = modes.length;
						return;
					}
					if (opcode == 5303) {
						// fullscreen_getmode
						local157 = intStack[--isp];
						@Pc(2678) DisplayMode[] modes = DisplayMode.getModes();
						intStack[isp++] = modes[local157].width;
						intStack[isp++] = modes[local157].height;
						return;
					}
					if (opcode == 5305) {
						// fullscreen_lastmode
						local157 = client.preferences.fullScreenWidth;
						local192 = client.preferences.fullScreenHeight;
						local89 = -1;
						@Pc(2715) DisplayMode[] modes = DisplayMode.getModes();
						for (local2717 = 0; local2717 < modes.length; local2717++) {
							@Pc(2722) DisplayMode mode = modes[local2717];
							if (mode.width == local157 && mode.height == local192) {
								local89 = local2717;
								break;
							}
						}
						intStack[isp++] = local89;
						return;
					}
					if (opcode == 5306) {
						// getwindowmode
						intStack[isp++] = DisplayMode.getWindowMode();
						return;
					}
					if (opcode == 5307) {
						// setwindowmode
						local157 = intStack[--isp];
						if (local157 >= 1 && local157 <= 2) {
							DisplayMode.setWindowMode(-1, local157, false, -1);
							return;
						}
						return;
					}
					if (opcode == 5308) {
						// getdefaultwindowmode
						intStack[isp++] = client.preferences.windowMode;
						return;
					}
					if (opcode == 5309) {
						// setdefaultwindowmode
						local157 = intStack[--isp];
						if (local157 >= 1 && local157 <= 2) {
							client.preferences.windowMode = local157;
							client.preferences.write(GameShell.signlink);
							return;
						}
						return;
					}
				} else {
					@Pc(3230) String local3230;
					if (opcode < 5500) {
						if (opcode == 5400) {
							// openurl
							ssp -= 2;
							local75 = stringStack[ssp];
							local81 = stringStack[ssp + 1];
							local89 = intStack[--isp];
							Protocol.writeOpcode(ClientProt.URL_REQUEST);
							Protocol.outboundBuffer.p1(Buffer.getStringLength(local75) + Buffer.getStringLength(local81) + 1);
							Protocol.outboundBuffer.pjstr(local75);
							Protocol.outboundBuffer.pjstr(local81);
							Protocol.outboundBuffer.p1(local89);
							return;
						}
						if (opcode == 5401) {
							// hsvtorgb
							isp -= 2;
							client.aShortArray79[intStack[isp]] = (short) ColorUtils.rgbToHsl(intStack[isp + 1]);
							client.ObjTypes.clearModels();
							client.ObjTypes.clearSprites();
							client.NpcTypes.clearModels();
							Static98.method2107();
							return;
						}
						if (opcode == 5405) {
							// spline_new
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							if (local157 >= 0 && local157 < 2) {
								Camera.splines[local157] = new int[local192 << 1][4];
							}
							return;
						}
						if (opcode == 5406) {
							// spline_addpoint
							isp -= 7;
							local157 = intStack[isp];
							local192 = intStack[isp + 1] << 1;
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							local2717 = intStack[isp + 4];
							@Pc(2990) int local2990 = intStack[isp + 5];
							@Pc(2996) int local2996 = intStack[isp + 6];
							if (local157 >= 0 && local157 < 2 && Camera.splines[local157] != null && local192 >= 0 && local192 < Camera.splines[local157].length) {
								Camera.splines[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) * 128, local95, (local89 & 0x3FFF) * 128, local2996 };
								Camera.splines[local157][local192 + 1] = new int[] { (local2717 >> 14 & 0x3FFF) * 128, local2990, (local2717 & 0x3FFF) * 128 };
							}
							return;
						}
						if (opcode == 5407) {
							// spline_length
							local157 = Camera.splines[intStack[--isp]].length >> 1;
							intStack[isp++] = local157;
							return;
						}
						if (opcode == 5411) {
							// quit
							if (GameShell.fullScreenFrame != null) {
								DisplayMode.setWindowMode(-1, client.preferences.windowMode, false, -1);
							}
							if (GameShell.frame != null) {
								Static340.method5765();
								System.exit(0);
								return;
							}
							local75 = client.quitUrl == null ? Static200.getWebsiteUrl() : client.quitUrl;
							Static280.openUrl(local75, GameShell.signlink, Static77.anInt1762 == 1, false);
							return;
						}
						if (opcode == 5419) {
							// lastlogin
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
						if (opcode == 5420) {
							// todo
							intStack[isp++] = Static215.anInt3795 == 3 ? 1 : 0;
							return;
						}
						if (opcode == 5421) {
							// openurl_nologin
							if (GameShell.fullScreenFrame != null) {
								DisplayMode.setWindowMode(-1, client.preferences.windowMode, false, -1);
							}
							local75 = stringStack[--ssp];
							local1292 = intStack[--isp] == 1;
							local3230 = Static200.getWebsiteUrl() + local75;
							Static280.openUrl(local3230, GameShell.signlink, Static77.anInt1762 == 1, local1292);
							return;
						}
						if (opcode == 5422) {
							// todo
							ssp -= 2;
							local75 = stringStack[ssp];
							local81 = stringStack[ssp + 1];
							local89 = intStack[--isp];
							if (local75.length() > 0) {
								if (Player.playerNames == null) {
									Player.playerNames = new String[Player.TITLES_PER_GAME[client.game.id]];
								}
								Player.playerNames[local89] = local75;
							}
							if (local81.length() > 0) {
								if (Static333.playerNames2 == null) {
									Static333.playerNames2 = new String[Player.TITLES_PER_GAME[client.game.id]];
								}
								Static333.playerNames2[local89] = local81;
							}
							return;
						}
						if (opcode == 5423) {
							// writeconsole
							System.out.println(stringStack[--ssp]);
							return;
						}
						if (opcode == 5424) {
							// formatminimenu
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
						if (opcode == 5425) {
							// defaultminimenu
							LoginManager.method3502();
							InterfaceList.aBoolean371 = false;
							return;
						}
						if (opcode == 5426) {
							// setdefaultcursors
							isp -= 2;
							Minimap.anInt7263 = intStack[isp];
							Minimap.anInt1910 = intStack[isp + 1];
							return;
						}
						if (opcode == 5427) {
							// sethardcodedopcursors
							isp -= 2;
							Static135.anInt2523 = intStack[isp + 1];
							return;
						}
						if (opcode == 5428) {
							// todo
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							intStack[isp++] = Static281.method4785(local192, local157) ? 1 : 0;
							return;
						}
						if (opcode == 5429) {
							// todo
							Cheat.execute(stringStack[--ssp], false);
							return;
						}
					} else if (opcode < 5600) {
						if (opcode == 5500) {
							// cam_moveto
							isp -= 4;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							Camera.moveto((local157 & 0x3FFF) - Camera.originZ, local89, local95, false, local192, (local157 >> 14 & 0x3FFF) - Camera.originX);
							return;
						}
						if (opcode == 5501) {
							// cam_lookat
							isp -= 4;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							local95 = intStack[isp + 3];
							Camera.lookAt(local89, local192, (local157 & 0x3FFF) - Camera.originZ, local95, (local157 >> 14 & 0x3FFF) - Camera.originX);
							return;
						}
						if (opcode == 5502) {
							// cam_movealong
							isp -= 6;
							local157 = intStack[isp];
							if (local157 >= 2) {
								throw new RuntimeException();
							}
							Camera.anInt2717 = local157;
							local192 = intStack[isp + 1];
							if (local192 + 1 >= Camera.splines[Camera.anInt2717].length >> 1) {
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
							if (local95 + 1 >= Camera.splines[Camera.anInt6455].length >> 1) {
								throw new RuntimeException();
							}
							Camera.anInt6398 = local95;
							Camera.cameraType = 3;
							return;
						}
						if (opcode == 5503) {
							// cam_reset
							Camera.reset();
							return;
						}
						if (opcode == 5504) {
							// cam_forceangle
							isp -= 2;
							Camera.forceAngle(intStack[isp], intStack[isp + 1]);
							return;
						}
						if (opcode == 5505) {
							// cam_getangle_xa
							intStack[isp++] = (int) Camera.pitch >> 3;
							return;
						}
						if (opcode == 5506) {
							// cam_getangle_ya
							intStack[isp++] = (int) Camera.yaw >> 3;
							return;
						}
						if (opcode == 5507) {
							// cam_inc_y
							Camera.incY();
							return;
						}
						if (opcode == 5508) {
							// cam_dec_y
							Camera.decY();
							return;
						}
						if (opcode == 5509) {
							// cam_inc_x
							Camera.incX();
							return;
						}
						if (opcode == 5510) {
							// cam_dec_y
							Camera.decX();
							return;
						}
						if (opcode == 5511) {
							// cam_followcoord
							local157 = intStack[--isp];
							local192 = local157 >> 14 & 0x3FFF;
							local89 = local157 & 0x3FFF;
							local192 -= Camera.originX;
							if (local192 < 0) {
								local192 = 0;
							} else if (local192 >= Static373.buildAreaLimitX) {
								local192 = Static373.buildAreaLimitX;
							}
							local89 -= Camera.originZ;
							if (local89 < 0) {
								local89 = 0;
							} else if (local89 >= Static242.buildAreaLimitZ) {
								local89 = Static242.buildAreaLimitZ;
							}
							Static394.anInt7264 = local192 * 128 + 64;
							Static348.anInt6448 = local89 * 128 + 64;
							Camera.cameraType = 4;
							return;
						}
						if (opcode == 5512) {
							// cam_smoothreset
							Camera.smoothReset();
							return;
						}
					} else if (opcode < 5700) {
						if (opcode == 5600) {
							// login_request
							ssp -= 2;
							local75 = stringStack[ssp];
							local81 = stringStack[ssp + 1];
							local89 = intStack[--isp];
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
								LoginManager.login(local81, local75, local89);
								return;
							}
							return;
						}
						if (opcode == 5601) {
							// login_continue
							LoginManager.method5435();
							return;
						}
						if (opcode == 5602) {
							// login_resetreply
							if (LoginManager.step == 0) {
								LoginManager.loginResult = -2;
							}
							return;
						}
						if (opcode == 5603) {
							// create_availablerequest
							isp -= 4;
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
								CreateManager.checkInfo(intStack[isp + 3], intStack[isp + 2], intStack[isp], intStack[isp + 1]);
								return;
							}
							return;
						}
						if (opcode == 5604) {
							// create_name_availablerequest
							ssp--;
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
								CreateManager.checkName(StringUtils.toBase37(stringStack[ssp]));
								return;
							}
							return;
						}
						if (opcode == 5605) {
							// create_createrequest
							ssp -= 3;
							isp -= 7;
							if (client.gameState != 10) {
								return;
							}
							if (LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0 && WorldList.step == 0) {
								CreateManager.createAccount(stringStack[ssp + 1], intStack[isp], intStack[isp + 3], intStack[isp + 4] == 1, StringUtils.toBase37(stringStack[ssp]), intStack[isp + 2], intStack[isp + 1], intStack[isp + 6] == 1, intStack[isp + 5] == 1, stringStack[ssp + 2]);
								return;
							}
							return;
						}
						if (opcode == 5606) {
							// todo
							if (CreateManager.step == 0) {
								CreateManager.reply = -2;
							}
							return;
						}
						if (opcode == 5607) {
							// login_reply
							intStack[isp++] = LoginManager.loginResult;
							return;
						}
						if (opcode == 5608) {
							// login-hoptime
							intStack[isp++] = LoginManager.hopTime;
							return;
						}
						if (opcode == 5609) {
							// create_reply
							intStack[isp++] = CreateManager.reply;
							return;
						}
						if (opcode == 5610) {
							// create_suggest_name_reply
							for (local157 = 0; local157 < 5; local157++) {
								stringStack[ssp++] = CreateManager.suggestedNames.length > local157 ? StringUtils.toTitleCase(CreateManager.suggestedNames[local157]) : "";
							}
							CreateManager.suggestedNames = null;
							return;
						}
						if (opcode == 5611) {
							// login_disallowresult
							intStack[isp++] = LoginManager.disallowResult;
							return;
						}
					} else if (opcode < 6100) {
						if (opcode == 6001) {
							// detail_brightness
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
						if (opcode == 6002) {
							// todo
							client.preferences.setAllVisibleLevels(intStack[--isp] == 1);
							Static347.method5827();
							Static226.method3982();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6003) {
							// detail_removeroofs_option
							client.preferences.roofsVisible = intStack[--isp] == 1;
							Static226.method3982();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6005) {
							// detail_grounddecor_on
							client.preferences.groundDecoration = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6006) {
							// todo: detail_texturing?
							client.preferences.highDetailTextures = intStack[--isp] == 1;
							Rasteriser.instance.method2874(!client.preferences.highDetailTextures);
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6007) {
							// detail_idleanims_many
							client.preferences.manyIdleAnimations = intStack[--isp];
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6008) {
							// detail_flickering_on
							client.preferences.flickeringEffects = intStack[--isp] == 1;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6009) {
							// todo
							client.preferences.groundTextures = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6010) {
							// detail_spotshadows_on
							client.preferences.characterShadows = intStack[--isp] == 1;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6011) {
							// detail_shadowquality
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							client.preferences.shadows = local157;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6012) {
							// detail_lightdetail_high
							client.preferences.highDetailLighting = intStack[--isp] == 1;
							Static174.method1506();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6014) {
							// detail_waterdetail_high
							client.preferences.highDetailWater = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6015) {
							// detail_fog_on
							client.preferences.fogEnabled = intStack[--isp] == 1;
							Static347.method5827();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6016) {
							// detail_antialiasing
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							client.preferences.antiAliasingMode = local157;
							Static353.method5883();
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (opcode == 6017) {
							// detail_stereo
							client.preferences.stereo = intStack[--isp] == 1;
							Static178.method2342();
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6018) {
							// detail_soundvol
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
						if (opcode == 6019) {
							// detail_musicvol
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
						if (opcode == 6020) {
							// detail_bgsoundvol
							local157 = intStack[--isp];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							client.preferences.areaSoundsVolume = local157;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6021) {
							// detail_removeroofs_option_override
							client.preferences.neverRemoveRoofs = intStack[--isp] == 1;
							Static226.method3982();
							return;
						}
						if (opcode == 6023) {
							// detail_particles
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
						if (opcode == 6024) {
							// detail_antialiasing_default
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							client.preferences.antiAliasingModeDefault = local157;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (opcode == 6025) {
							// detail_buildarea
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > Static289.method5019(GameShell.maxMemory)) {
								local157 = 0;
							}
							client.preferences.buildArea = local157;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6027) {
							// detail_bloom
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 1) {
								local157 = 0;
							}
							Static284.setBloomEnabled(local157 == 1);
							return;
						}
						if (opcode == 6028) {
							// detail_customcursors
							client.preferences.cursorsEnabled = intStack[--isp] != 0;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (opcode == 6029) {
							// detail_idleanims
							client.preferences.manyIdleAnimations = intStack[--isp];
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (opcode == 6030) {
							// detail_groundblending
							client.preferences.groundBlending = intStack[--isp] != 0;
							client.preferences.write(GameShell.signlink);
							Static347.method5827();
							return;
						}
						if (opcode == 6031) {
							// todo
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static78.method5701(local157);
							return;
						}
						if (opcode == 6032) {
							// todo
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							client.preferences.anInt4878 = local157;
							client.preferences.write(GameShell.signlink);
							Preferences.sentToServer = false;
							return;
						}
						if (opcode == 6033) {
							// detail_cpuusage
							local157 = intStack[--isp];
							if (local157 < 0 || local157 > 4) {
								local157 = 2;
							}
							client.preferences.cpuUsage = local157;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (opcode == 6035) {
							// todo
							client.preferences.aBoolean365 = intStack[--isp] == 1;
							Static347.method5827();
							Static226.method3982();
							return;
						}
					} else if (opcode < 6200) {
						if (opcode == 6101) {
							// detailget_brightness
							intStack[isp++] = client.preferences.brightness;
							return;
						}
						if (opcode == 6102) {
							// todo
							intStack[isp++] = client.preferences.isAllLevelsVisible(Static77.anInt1762) ? 1 : 0;
							return;
						}
						if (opcode == 6103) {
							// detailget_removeroofs_option
							intStack[isp++] = client.preferences.roofsVisible ? 1 : 0;
							return;
						}
						if (opcode == 6105) {
							// detailget_grounddecor_on
							intStack[isp++] = client.preferences.groundDecoration ? 1 : 0;
							return;
						}
						if (opcode == 6106) {
							// todo
							intStack[isp++] = client.preferences.highDetailTextures ? 1 : 0;
							return;
						}
						if (opcode == 6107) {
							// detailget_idleanims_many
							intStack[isp++] = client.preferences.manyIdleAnimations;
							return;
						}
						if (opcode == 6108) {
							// detailget_flickering_on
							intStack[isp++] = client.preferences.flickeringEffects ? 1 : 0;
							return;
						}
						if (opcode == 6109) {
							// todo
							intStack[isp++] = client.preferences.groundTextures ? 1 : 0;
							return;
						}
						if (opcode == 6110) {
							// detailget_spotshadows_on
							intStack[isp++] = client.preferences.characterShadows ? 1 : 0;
							return;
						}
						if (opcode == 6111) {
							// detailget_shadows
							intStack[isp++] = client.preferences.shadows;
							return;
						}
						if (opcode == 6112) {
							// detailget_lightdetail_high
							intStack[isp++] = client.preferences.highDetailLighting ? 1 : 0;
							return;
						}
						if (opcode == 6114) {
							// detailget_waterdetail_high
							intStack[isp++] = client.preferences.highDetailWater ? 1 : 0;
							return;
						}
						if (opcode == 6115) {
							// detailget_fog_on
							intStack[isp++] = client.preferences.fogEnabled ? 1 : 0;
							return;
						}
						if (opcode == 6116) {
							// detailget_antialiasing
							intStack[isp++] = client.preferences.antiAliasingMode;
							return;
						}
						if (opcode == 6117) {
							// detailget_stereo
							intStack[isp++] = client.preferences.stereo ? 1 : 0;
							return;
						}
						if (opcode == 6118) {
							// detailget_soundvol
							intStack[isp++] = client.preferences.soundEffectVolume;
							return;
						}
						if (opcode == 6119) {
							// detailget_musicvol
							intStack[isp++] = client.preferences.musicVolume;
							return;
						}
						if (opcode == 6120) {
							// detailget_bgsoundvol
							intStack[isp++] = client.preferences.areaSoundsVolume;
							return;
						}
						if (opcode == 6121) {
							// todo: detailcanset...
							intStack[isp++] = Rasteriser.instance.arbMultisampleSupported() ? 1 : 0;
							return;
						}
						if (opcode == 6123) {
							// detailget_particles
							intStack[isp++] = Preferences.getParticles();
							return;
						}
						if (opcode == 6124) {
							// detailget_antialiasing_default
							intStack[isp++] = client.preferences.antiAliasingModeDefault;
							return;
						}
						if (opcode == 6125) {
							// detailget_buildarea
							intStack[isp++] = client.preferences.buildArea;
							return;
						}
						if (opcode == 6126) {
							// detailcanset_bloom
							intStack[isp++] = Rasteriser.instance.isBloomSupported() ? 1 : 0;
							return;
						}
						if (opcode == 6127) {
							// detailget_bloom
							intStack[isp++] = client.preferences.bloomEnabled ? 1 : 0;
							return;
						}
						if (opcode == 6128) {
							// detailget_customcursors
							intStack[isp++] = client.preferences.cursorsEnabled ? 1 : 0;
							return;
						}
						if (opcode == 6129) {
							// detailget_idleanims
							intStack[isp++] = client.preferences.manyIdleAnimations;
							return;
						}
						if (opcode == 6130) {
							// detailget_groundblending
							intStack[isp++] = client.preferences.groundBlending ? 1 : 0;
							return;
						}
						if (opcode == 6131) {
							// todo
							intStack[isp++] = Static77.anInt1762;
							return;
						}
						if (opcode == 6132) {
							// todo
							intStack[isp++] = client.preferences.anInt4878;
							return;
						}
						if (opcode == 6133) {
							// todo
							intStack[isp++] = Static215.anInt3795 == 1 || Static215.anInt3795 == 4 ? 1 : 0;
							return;
						}
						if (opcode == 6134) {
							// todo
							intStack[isp++] = Static289.method5019(GameShell.maxMemory);
							return;
						}
						if (opcode == 6135) {
							// detailget_cpuusage
							intStack[isp++] = client.preferences.cpuUsage;
							return;
						}
					} else if (opcode < 6300) {
						if (opcode == 6200) {
							// viewport_setfov
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
						if (opcode == 6201) {
							// viewport_setzoom
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
						if (opcode == 6202) {
							// viewport_clampfov
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
						if (opcode == 6203) {
							// viewport_geteffectivesize
							method5273(0, Static20.aClass161_1.height, false, Static20.aClass161_1.width, 0);
							intStack[isp++] = Static155.anInt2808;
							intStack[isp++] = Static180.anInt3408;
							return;
						}
						if (opcode == 6204) {
							// viewport_getzoom
							intStack[isp++] = aShort79;
							intStack[isp++] = aShort36;
							return;
						}
						if (opcode == 6205) {
							// viewport_getfov
							intStack[isp++] = aShort73;
							intStack[isp++] = aShort78;
							return;
						}
					} else if (opcode < 6400) {
						if (opcode == 6300) {
							// date_minutes
							intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 60000L);
							return;
						}
						if (opcode == 6301) {
							// date_runeday
							intStack[isp++] = (int) (MonotonicClock.currentTimeMillis() / 86400000L) - 11745;
							return;
						}
						if (opcode == 6302) {
							// date_runeday_fromdate
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							calendar.clear();
							calendar.set(Calendar.HOUR_OF_DAY, 12);
							calendar.set(local89, local192, local157);
							intStack[isp++] = (int) (calendar.getTime().getTime() / 86400000L) - 11745;
							return;
						}
						if (opcode == 6303) {
							// date_year
							calendar.clear();
							calendar.setTime(new Date(MonotonicClock.currentTimeMillis()));
							intStack[isp++] = calendar.get(Calendar.YEAR);
							return;
						}
						if (opcode == 6304) {
							// date_isleapyear
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
					} else if (opcode < 6500) {
						if (opcode == 6405) {
							// video_advert_play
							intStack[isp++] = client.showVideoAd() ? 1 : 0;
							return;
						}
						if (opcode == 6406) {
							// video_advert_has_finished
							intStack[isp++] = client.isHidingVideoAd() ? 1 : 0;
							return;
						}
					} else if (opcode < 6600) {
						if (opcode == 6500) {
							// worldlist_fetch
							if (client.gameState == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
								intStack[isp++] = WorldList.fetch() == -1 ? 0 : 1;
								return;
							}
							intStack[isp++] = 1;
							return;
						}
						@Pc(5979) Country country;
						@Pc(5946) World world;
						if (opcode == 6501) {
							// worldlist_start
							world = WorldList.head();
							if (world != null) {
								intStack[isp++] = world.id;
								intStack[isp++] = world.flags;
								stringStack[ssp++] = world.activity;
								country = world.getCountry();
								intStack[isp++] = country.flag;
								stringStack[ssp++] = country.name;
								intStack[isp++] = world.players;
								intStack[isp++] = world.ping;
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
						if (opcode == 6502) {
							// worldlist_next
							world = WorldList.next();
							if (world != null) {
								intStack[isp++] = world.id;
								intStack[isp++] = world.flags;
								stringStack[ssp++] = world.activity;
								country = world.getCountry();
								intStack[isp++] = country.flag;
								stringStack[ssp++] = country.name;
								intStack[isp++] = world.players;
								intStack[isp++] = world.ping;
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
						if (opcode == 6503) {
							// worldlist_switch
							local157 = intStack[--isp];
							if (client.gameState == 10 && LoginManager.autoStep == 0 && LoginManager.step == 0 && CreateManager.step == 0) {
								intStack[isp++] = WorldList.switchWorld(local157) ? 1 : 0;
								return;
							}
							intStack[isp++] = 0;
							return;
						}
						if (opcode == 6504) {
							// todo
							client.preferences.favouriteWorlds = intStack[--isp];
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (opcode == 6505) {
							// todo
							intStack[isp++] = client.preferences.favouriteWorlds;
							return;
						}
						if (opcode == 6506) {
							// worldlist_specific
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
						if (opcode == 6507) {
							// worldlist_sort
							isp -= 4;
							local157 = intStack[isp];
							local1292 = intStack[isp + 1] == 1;
							local89 = intStack[isp + 2];
							local1903 = intStack[isp + 3] == 1;
							WorldList.sort(local1292, local1903, local89, local157);
							return;
						}
						if (opcode == 6508) {
							// worldlist_autoworld
							Static200.method3644();
							return;
						}
						if (opcode == 6509) {
							// worldlist_pingworlds
							if (client.gameState != 10) {
								return;
							}
							WorldList.refreshing = intStack[--isp] == 1;
							return;
						}
					} else if (opcode < 6700) {
						if (opcode == 6600) {
							// todo
							client.preferences.aBoolean351 = intStack[--isp] == 1;
							client.preferences.write(GameShell.signlink);
							return;
						}
						if (opcode == 6601) {
							// todo
							intStack[isp++] = client.preferences.aBoolean351 ? 1 : 0;
							return;
						}
					} else if (opcode < 6800 && client.modeWhat == client.MODE_ENV_WIP) {
						if (opcode == 6700) {
							// todo
							local157 = InterfaceList.subInterfaces.size();
							if (Static139.anInt2595 != -1) {
								local157++;
							}
							intStack[isp++] = local157;
							return;
						}
						if (opcode == 6701) {
							// todo
							local157 = intStack[--isp];
							if (Static139.anInt2595 != -1) {
								if (local157 == 0) {
									intStack[isp++] = Static139.anInt2595;
									return;
								}
								local157--;
							}
							@Pc(6577) SubInterface local6577 = (SubInterface) InterfaceList.subInterfaces.head();
							while (local157-- > 0) {
								local6577 = (SubInterface) InterfaceList.subInterfaces.next();
							}
							intStack[isp++] = local6577.id;
							return;
						}
						if (opcode == 6702) {
							// todo
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
						if (opcode == 6703) {
							// todo
							local157 = intStack[--isp];
							if (Static26.aClass161ArrayArray1[local157] == null) {
								intStack[isp++] = 0;
								return;
							}
							intStack[isp++] = Static26.aClass161ArrayArray1[local157].length;
							return;
						}
						if (opcode == 6704) {
							// todo
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
						if (opcode == 6705) {
							// todo
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
						if (opcode == 6706) {
							// todo
							return;
						}
						if (opcode == 6707) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 1, "", local89);
							return;
						}
						if (opcode == 6708) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 2, "", local89);
							return;
						}
						if (opcode == 6709) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 3, "", local89);
							return;
						}
						if (opcode == 6710) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 4, "", local89);
							return;
						}
						if (opcode == 6711) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 5, "", local89);
							return;
						}
						if (opcode == 6712) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 6, "", local89);
							return;
						}
						if (opcode == 6713) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 7, "", local89);
							return;
						}
						if (opcode == 6714) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 8, "", local89);
							return;
						}
						if (opcode == 6715) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 9, "", local89);
							return;
						}
						if (opcode == 6716) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							Protocol.method4681(local157 << 16 | local192, 10, "", local89);
							return;
						}
						if (opcode == 6717) {
							// todo
							isp -= 3;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							local89 = intStack[isp + 2];
							@Pc(7165) Component local7165 = InterfaceList.getCreatedComponent(local157 << 16 | local192, local89);
							Static207.method3699();
							@Pc(7170) ServerActiveProperties local7170 = InterfaceList.getServerActiveProperties(local7165);
							Static185.method3400(local7165.anInt4238, local7170.getTargetMask(), local157 << 16 | local192, local89, local7165.anInt4286, local7170.targetParam);
							return;
						}
					} else if (opcode < 6900) {
						@Pc(7207) MelType type;
						if (opcode == 6800) {
							// mec_text
							local157 = intStack[--isp];
							type = client.MelTypes.get(local157);
							if (type.text == null) {
								stringStack[ssp++] = "";
								return;
							}
							stringStack[ssp++] = type.text;
							return;
						}
						if (opcode == 6801) {
							// mec_sprite
							local157 = intStack[--isp];
							type = client.MelTypes.get(local157);
							intStack[isp++] = type.sprite;
							return;
						}
						if (opcode == 6802) {
							// mec_textsize
							local157 = intStack[--isp];
							type = client.MelTypes.get(local157);
							intStack[isp++] = type.textSize;
							return;
						}
						if (opcode == 6803) {
							// mec_category
							local157 = intStack[--isp];
							type = client.MelTypes.get(local157);
							intStack[isp++] = type.category;
							return;
						}
						if (opcode == 6804) {
							// mec_param
							isp -= 2;
							local157 = intStack[isp];
							local192 = intStack[isp + 1];
							@Pc(7329) ParamType local7329 = client.ParamTypes.get(local192);
							if (local7329.isString()) {
								stringStack[ssp++] = client.MelTypes.get(local157).method4185(local192, local7329.defaultString);
								return;
							}
							intStack[isp++] = client.MelTypes.get(local157).method4188(local7329.defaultInt, local192);
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
					// push_constant_int
					intStack[isp++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						// push_varp
						local54 = local11[local5];
						intStack[isp++] = VarpDomain.instance.anIntArray430[local54];
					} else if (local31 == 2) {
						// pop_varp
						local54 = local11[local5];
						VarpDomain.instance.method5780(local54, intStack[--isp]);
					} else if (local31 == 3) {
						// push_constant_string
						stringStack[ssp++] = arg0.aStringArray27[local5];
					} else if (local31 == 6) {
						// branch
						local5 += local11[local5];
					} else if (local31 == 7) {
						// branch_not
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						// branch_equals
						isp -= 2;
						if (intStack[isp] == intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						// branch_less_than
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						// branch_greater_than
						isp -= 2;
						if (intStack[isp] > intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						// return
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
						// push_varbit
						local54 = local11[local5];
						intStack[isp++] = VarpDomain.instance.method5778(local54);
					} else if (local31 == 27) {
						// pop_varbit
						local54 = local11[local5];
						VarpDomain.instance.method5779(local54, intStack[--isp]);
					} else if (local31 == 31) {
						// branch_less_than_or_equals
						isp -= 2;
						if (intStack[isp] <= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						// branch_greater_than_or_equals
						isp -= 2;
						if (intStack[isp] >= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						// push_int_local
						intStack[isp++] = anIntArray212[local11[local5]];
					} else if (local31 == 34) {
						// pop_int_local
						anIntArray212[local11[local5]] = intStack[--isp];
					} else if (local31 == 35) {
						// push_string_local
						stringStack[ssp++] = aStringArray30[local11[local5]];
					} else if (local31 == 36) {
						// pop_string_local
						aStringArray30[local11[local5]] = stringStack[--ssp];
					} else if (local31 == 37) {
						// join_string
						local54 = local11[local5];
						ssp -= local54;
						@Pc(400) String local400 = Static89.method1940(ssp, stringStack, local54);
						stringStack[ssp++] = local400;
					} else if (local31 == 38) {
						// pop_int_discard
						isp--;
					} else if (local31 == 39) {
						// pop_string_discard
						ssp--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							// gosub_with_params
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
							// push_varc_int
							intStack[isp++] = VarcDomain.varcs[local11[local5]];
						} else if (local31 == 43) {
							// pop_varc_int
							local54 = local11[local5];
							VarcDomain.varcs[local54] = intStack[--isp];
							Static226.method3983(local54);
							VarcDomain.aBoolean374 |= Static89.aBooleanArray18[local54];
						} else if (local31 == 44) {
							// define_array
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
							// push_array_int
							local54 = local11[local5];
							local603 = intStack[--isp];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							intStack[isp++] = anIntArrayArray27[local54][local603];
						} else if (local31 == 46) {
							// pop_array_int
							local54 = local11[local5];
							isp -= 2;
							local603 = intStack[isp];
							if (local603 < 0 || local603 >= anIntArray214[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray27[local54][local603] = intStack[isp + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = VarcDomain.varcstrs[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							stringStack[ssp++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							VarcDomain.varcstrs[local54] = stringStack[--ssp];
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
				TracingException.report(local837, local855.toString());
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
				TracingException.report(local837, local855.toString());
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
					Rasteriser.instance.method2898();
					Rasteriser.instance.method2868(arg1, arg0, arg4, -16777216, local118);
					Rasteriser.instance.method2868(arg1, arg0 + arg3 - local118, arg4, -16777216, local118);
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
					Rasteriser.instance.method2898();
					Rasteriser.instance.method2868(local118, arg0, arg4, -16777216, arg3);
					Rasteriser.instance.method2868(local118, arg0, arg4 + arg1 - local118, -16777216, arg3);
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
