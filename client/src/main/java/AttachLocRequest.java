import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class AttachLocRequest extends Node {

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	public int anInt1100;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	public int anInt1101;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	public int anInt1102;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	public int anInt1104;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
	public int anInt1107;

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
	public int anInt1108;

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
	public int anInt1109;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
	public int anInt1110;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	public int anInt1111;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	public int anInt1112;

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
	public int anInt1113;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
	public int anInt1114;

	@OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
	public int anInt1116;

	@OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
	public int anInt1117;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void mainLogic() {
		for (@Pc(15) AttachLocRequest local15 = (AttachLocRequest) Static366.aClass135_40.head(); local15 != null; local15 = (AttachLocRequest) Static366.aClass135_40.next()) {
			if (Scene.aClass67ArrayArrayArray3 == null) {
				local15.unlink();
			} else {
				@Pc(41) int local41;
				@Pc(262) Class11_Sub1 local262;
				@Pc(298) Class11_Sub1_Sub1 local298;
				@Pc(54) Class11_Sub3 local54;
				@Pc(117) Class11_Sub2 local117;
				@Pc(162) Entity local162;
				@Pc(90) Class11_Sub3_Sub1 local90;
				@Pc(136) Class11_Sub2_Sub2 local136;
				if (client.cycle >= local15.anInt1118) {
					local41 = Static150.anIntArray174[local15.anInt1116];
					if (local41 == 0) {
						local262 = Static12.method283(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local262 instanceof Class11_Sub1_Sub1) {
							Static259.method4429(local15.anInt1110, local15.anInt1117, local15.anInt1109);
							local298 = (Class11_Sub1_Sub1) local262;
							if (local298.aClass11_Sub1_1 != null) {
								Static4.method73(local15.anInt1110, local15.anInt1117, local15.anInt1109, local298.aClass11_Sub1_1, null);
							}
						}
					} else if (local41 == 1) {
						local54 = Static28.method893(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local54 instanceof Class11_Sub3_Sub1) {
							Static201.method3654(local15.anInt1110, local15.anInt1117, local15.anInt1109);
							local90 = (Class11_Sub3_Sub1) local54;
							if (local90.aClass11_Sub3_1 != null) {
								Static94.method2044(local15.anInt1110, local15.anInt1117, local15.anInt1109, local90.aClass11_Sub3_1, null);
							}
						}
					} else if (local41 == 2) {
						local162 = Static105.method2207(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
						if (local162 instanceof Class11_Sub5_Sub6) {
							Static188.method3466(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
							@Pc(471) Class11_Sub5_Sub6 local471 = (Class11_Sub5_Sub6) local162;
							if (local471.aClass11_Sub5_2 != null) {
								Static329.method5630(local471.aClass11_Sub5_2, false);
							}
						}
					} else if (local41 == 3) {
						local117 = Static26.method865(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local117 instanceof Class11_Sub2_Sub2) {
							Static370.method6246(local15.anInt1110, local15.anInt1117, local15.anInt1109);
							local136 = (Class11_Sub2_Sub2) local117;
							if (local136.aClass11_Sub2_1 != null) {
								Static29.method938(local15.anInt1110, local15.anInt1117, local15.anInt1109, local136.aClass11_Sub2_1);
							}
						}
					}
					local15.unlink();
				} else if (client.cycle == local15.anInt1100) {
					local41 = Static150.anIntArray174[local15.anInt1116];
					if (local41 == 0) {
						local262 = Static12.method283(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local262 instanceof Class11_Sub1_Sub1) {
							local15.unlink();
						} else if (Static99.method2143(local15.anInt1110, local15.anInt1117, local15.anInt1109) == null) {
							local298 = new Class11_Sub1_Sub1(local15.anInt1116, local15.anInt1111, local15.anInt1104, local15.anInt1114, local15.anInt1101, local262);
							Static4.method73(local15.anInt1110, local15.anInt1117, local15.anInt1109, local298, null);
						} else {
							local15.unlink();
						}
					} else if (local41 == 1) {
						local54 = Static28.method893(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local54 instanceof Class11_Sub3_Sub1) {
							local15.unlink();
						} else if (Static93.method2001(local15.anInt1110, local15.anInt1117, local15.anInt1109) == null) {
							local90 = new Class11_Sub3_Sub1(local15.anInt1116, local15.anInt1111, local15.anInt1104, local15.anInt1114, local15.anInt1101, local54);
							Static94.method2044(local15.anInt1110, local15.anInt1117, local15.anInt1109, local90, null);
						} else {
							local15.unlink();
						}
					} else if (local41 == 2) {
						local162 = Static105.method2207(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
						if (local162 instanceof Class11_Sub5_Sub6) {
							local15.unlink();
						} else {
							Static188.method3466(local15.anInt1110, local15.anInt1117, local15.anInt1109, Interface6.class);
							@Pc(191) LocType local191 = client.LocTypes.get(local15.anInt1112);
							@Pc(207) int local207;
							@Pc(204) int local204;
							if (local15.anInt1111 == 1 || local15.anInt1111 == 3) {
								local204 = local191.anInt1356;
								local207 = local191.anInt1327;
							} else {
								local207 = local191.anInt1356;
								local204 = local191.anInt1327;
							}
							@Pc(248) Class11_Sub5_Sub6 local248 = new Class11_Sub5_Sub6(local15.anInt1116, local15.anInt1111, local15.anInt1110, local15.anInt1104, local15.anInt1114, local15.anInt1101, local15.anInt1117, local207 + local15.anInt1117 - 1, local15.anInt1109, local204 + local15.anInt1109 - 1, local162);
							Static329.method5630(local248, false);
						}
					} else if (local41 == 3) {
						local117 = Static26.method865(local15.anInt1110, local15.anInt1117, local15.anInt1109);
						if (local117 instanceof Class11_Sub2_Sub2) {
							local15.unlink();
						} else {
							local136 = new Class11_Sub2_Sub2(local15.anInt1104, local15.anInt1114, local15.anInt1101, local117);
							Static29.method938(local15.anInt1110, local15.anInt1117, local15.anInt1109, local136);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!wm;II)Lclient!gn;")
	public Model method1360(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static150.anIntArray174[this.anInt1116];
		if (local13 == 0) {
			@Pc(119) Class11_Sub1 local119 = Static12.method283(this.anInt1110, this.anInt1117, this.anInt1109);
			if (local119 instanceof Class11_Sub1_Sub1) {
				@Pc(125) Class11_Sub1_Sub1 local125 = (Class11_Sub1_Sub1) local119;
				if (local125.aClass11_Sub1_1 != null) {
					return ((Interface6) local125.aClass11_Sub1_1).method6088(arg1, arg0);
				}
			}
		} else if (local13 == 1) {
			@Pc(28) Class11_Sub3 local28 = Static28.method893(this.anInt1110, this.anInt1117, this.anInt1109);
			if (local28 instanceof Class11_Sub3_Sub1) {
				@Pc(34) Class11_Sub3_Sub1 local34 = (Class11_Sub3_Sub1) local28;
				if (local34.aClass11_Sub3_1 != null) {
					return ((Interface6) local34.aClass11_Sub3_1).method6088(arg1, arg0);
				}
			}
		} else if (local13 == 2) {
			@Pc(94) Entity local94 = Static105.method2207(this.anInt1110, this.anInt1117, this.anInt1109, Interface6.class);
			if (local94 instanceof Class11_Sub5_Sub6) {
				@Pc(100) Class11_Sub5_Sub6 local100 = (Class11_Sub5_Sub6) local94;
				if (local100.aClass11_Sub5_2 != null) {
					return ((Interface6) local100.aClass11_Sub5_2).method6088(arg1, arg0);
				}
			}
		} else if (local13 == 3) {
			@Pc(61) Class11_Sub2 local61 = Static26.method865(this.anInt1110, this.anInt1117, this.anInt1109);
			if (local61 instanceof Class11_Sub2_Sub2) {
				@Pc(67) Class11_Sub2_Sub2 local67 = (Class11_Sub2_Sub2) local61;
				if (local67.aClass11_Sub2_1 != null) {
					return ((Interface6) local67.aClass11_Sub2_1).method6088(arg1, arg0);
				}
			}
		}
		return null;
	}
}
