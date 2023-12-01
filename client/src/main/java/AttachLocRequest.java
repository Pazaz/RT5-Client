import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class AttachLocRequest extends Node {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!ld;")
	public static final LinkedList queue = new LinkedList();
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
	public int shape;

	@OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
	public int anInt1117;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void loop() {
		for (@Pc(15) AttachLocRequest request = (AttachLocRequest) queue.head(); request != null; request = (AttachLocRequest) queue.next()) {
			if (Scene.aClass67ArrayArrayArray3 == null) {
				request.unlink();
				continue;
			}

			@Pc(262) Class11_Sub1 local262;
			@Pc(298) Class11_Sub1_Sub1 local298;
			@Pc(54) Class11_Sub3 local54;
			@Pc(117) Class11_Sub2 local117;
			@Pc(162) Entity local162;
			@Pc(90) Class11_Sub3_Sub1 local90;
			@Pc(136) Class11_Sub2_Sub2 local136;

			if (client.cycle >= request.anInt1118) {
				int layer = Static150.LAYERS[request.shape];
				if (layer == 0) {
					local262 = Static12.method283(request.anInt1110, request.anInt1117, request.anInt1109);
					if (local262 instanceof Class11_Sub1_Sub1) {
						Static259.method4429(request.anInt1110, request.anInt1117, request.anInt1109);
						local298 = (Class11_Sub1_Sub1) local262;
						if (local298.aClass11_Sub1_1 != null) {
							Static4.method73(request.anInt1110, request.anInt1117, request.anInt1109, local298.aClass11_Sub1_1, null);
						}
					}
				} else if (layer == 1) {
					local54 = Static28.method893(request.anInt1110, request.anInt1117, request.anInt1109);
					if (local54 instanceof Class11_Sub3_Sub1) {
						Static201.method3654(request.anInt1110, request.anInt1117, request.anInt1109);
						local90 = (Class11_Sub3_Sub1) local54;
						if (local90.aClass11_Sub3_1 != null) {
							Static94.method2044(request.anInt1110, request.anInt1117, request.anInt1109, local90.aClass11_Sub3_1, null);
						}
					}
				} else if (layer == 2) {
					local162 = Static105.method2207(request.anInt1110, request.anInt1117, request.anInt1109, Interface6.class);
					if (local162 instanceof Class11_Sub5_Sub6) {
						Static188.method3466(request.anInt1110, request.anInt1117, request.anInt1109, Interface6.class);
						@Pc(471) Class11_Sub5_Sub6 local471 = (Class11_Sub5_Sub6) local162;
						if (local471.aClass11_Sub5_2 != null) {
							Static329.method5630(local471.aClass11_Sub5_2, false);
						}
					}
				} else if (layer == 3) {
					local117 = Static26.method865(request.anInt1110, request.anInt1117, request.anInt1109);
					if (local117 instanceof Class11_Sub2_Sub2) {
						Static370.method6246(request.anInt1110, request.anInt1117, request.anInt1109);
						local136 = (Class11_Sub2_Sub2) local117;
						if (local136.aClass11_Sub2_1 != null) {
							Static29.method938(request.anInt1110, request.anInt1117, request.anInt1109, local136.aClass11_Sub2_1);
						}
					}
				}
				request.unlink();
			} else if (client.cycle == request.anInt1100) {
				int layer = Static150.LAYERS[request.shape];
				if (layer == 0) {
					local262 = Static12.method283(request.anInt1110, request.anInt1117, request.anInt1109);
					if (local262 instanceof Class11_Sub1_Sub1) {
						request.unlink();
					} else if (Static99.method2143(request.anInt1110, request.anInt1117, request.anInt1109) == null) {
						local298 = new Class11_Sub1_Sub1(request.shape, request.anInt1111, request.anInt1104, request.anInt1114, request.anInt1101, local262);
						Static4.method73(request.anInt1110, request.anInt1117, request.anInt1109, local298, null);
					} else {
						request.unlink();
					}
				} else if (layer == 1) {
					local54 = Static28.method893(request.anInt1110, request.anInt1117, request.anInt1109);
					if (local54 instanceof Class11_Sub3_Sub1) {
						request.unlink();
					} else if (Static93.method2001(request.anInt1110, request.anInt1117, request.anInt1109) == null) {
						local90 = new Class11_Sub3_Sub1(request.shape, request.anInt1111, request.anInt1104, request.anInt1114, request.anInt1101, local54);
						Static94.method2044(request.anInt1110, request.anInt1117, request.anInt1109, local90, null);
					} else {
						request.unlink();
					}
				} else if (layer == 2) {
					local162 = Static105.method2207(request.anInt1110, request.anInt1117, request.anInt1109, Interface6.class);
					if (local162 instanceof Class11_Sub5_Sub6) {
						request.unlink();
					} else {
						Static188.method3466(request.anInt1110, request.anInt1117, request.anInt1109, Interface6.class);
						@Pc(191) LocType local191 = client.LocTypes.get(request.anInt1112);
						@Pc(207) int local207;
						@Pc(204) int local204;
						if (request.anInt1111 == 1 || request.anInt1111 == 3) {
							local204 = local191.anInt1356;
							local207 = local191.anInt1327;
						} else {
							local207 = local191.anInt1356;
							local204 = local191.anInt1327;
						}
						@Pc(248) Class11_Sub5_Sub6 local248 = new Class11_Sub5_Sub6(request.shape, request.anInt1111, request.anInt1110, request.anInt1104, request.anInt1114, request.anInt1101, request.anInt1117, local207 + request.anInt1117 - 1, request.anInt1109, local204 + request.anInt1109 - 1, local162);
						Static329.method5630(local248, false);
					}
				} else if (layer == 3) {
					local117 = Static26.method865(request.anInt1110, request.anInt1117, request.anInt1109);
					if (local117 instanceof Class11_Sub2_Sub2) {
						request.unlink();
					} else {
						local136 = new Class11_Sub2_Sub2(request.anInt1104, request.anInt1114, request.anInt1101, local117);
						Static29.method938(request.anInt1110, request.anInt1117, request.anInt1109, local136);
					}
				}
			}
		}
	}

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static void push(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
        if (Scene.aClass6Array4 == null) {
            return;
        }
        @Pc(27) PathingEntity entity;
        @Pc(18) int local18;
        if (arg8 < 0) {
            local18 = -arg8 - 1;
            if (PlayerList.selfId == local18) {
                entity = PlayerList.self;
            } else {
                entity = PlayerList.players[local18];
            }
        } else {
            local18 = arg8 - 1;
            entity = NpcList.npcs[local18];
        }
        if (entity == null) {
            return;
        }
        @Pc(51) LocType local51 = client.LocTypes.get(arg1);
        @Pc(62) int local62;
        @Pc(65) int local65;
        if (arg10 == 1 || arg10 == 3) {
            local62 = local51.anInt1327;
            local65 = local51.anInt1356;
        } else {
            local62 = local51.anInt1356;
            local65 = local51.anInt1327;
        }
        @Pc(79) int local79 = (local62 >> 1) + arg0;
        @Pc(96) int local96 = arg0 + (local62 + 1 >> 1);
        @Pc(102) int local102 = (local65 >> 1) + arg11;
        @Pc(110) int local110 = (local65 + 1 >> 1) + arg11;
        @Pc(114) Class6 local114 = Scene.aClass6Array4[arg12];
        @Pc(138) int local138 = local114.method5719(local79, local102) + local114.method5719(local96, local102) + local114.method5719(local79, local110) + local114.method5719(local96, local110) >> 2;
        @Pc(142) AttachLocRequest request = new AttachLocRequest();
        request.anInt1110 = entity.plane;
        request.anInt1118 = arg3 + client.cycle;
        request.anInt1100 = client.cycle + arg7;
        request.anInt1117 = arg0;
        request.anInt1109 = arg11;
        request.anInt1112 = arg1;
        @Pc(170) int local170;
        if (arg5 < arg4) {
            local170 = arg4;
            arg4 = arg5;
            arg5 = local170;
        }
        request.shape = arg9;
        request.anInt1111 = arg10;
        if (arg6 > arg2) {
            local170 = arg6;
            arg6 = arg2;
            arg2 = local170;
        }
        request.anInt1108 = arg0 + arg4;
        request.anInt1107 = arg5 + arg0;
        request.anInt1104 = (request.anInt1117 << 7) + (local62 << 6);
        request.anInt1102 = arg6 + arg11;
        request.anInt1101 = (local65 << 6) + (request.anInt1109 << 7);
        request.anInt1113 = arg11 + arg2;
        request.anInt1114 = local138;
        queue.addTail(request);
        entity.aClass2_Sub6_3 = request;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!wm;II)Lclient!gn;")
	public Model method1360(@OriginalArg(0) RasteriserBase arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static150.LAYERS[this.shape];
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
