import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!k", name = "C", descriptor = "I")
	public static int anInt3338 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!mr;)V")
	public static void method3315(@OriginalArg(1) PathingEntity arg0) {
		arg0.aBoolean318 = false;
		@Pc(20) Class157 local20;
		if (arg0.anInt4585 != -1) {
			local20 = client.SeqTypes.method2371(arg0.anInt4585);
			if (local20 == null || local20.anIntArray262 == null) {
				arg0.aBoolean317 = false;
				arg0.anInt4585 = -1;
			} else {
				label297: {
					arg0.anInt4629++;
					if (local20.anIntArray262.length > arg0.anInt4626 && arg0.anInt4629 > local20.anIntArray261[arg0.anInt4626]) {
						arg0.anInt4626++;
						arg0.anInt4593++;
						arg0.anInt4629 = 1;
						Static1.method4(local20, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0, arg0.aByte78, arg0.xFine, arg0.zFine, arg0.anInt4626);
					}
					if (local20.anIntArray262.length <= arg0.anInt4626) {
						arg0.anInt4626 = 0;
						arg0.anInt4629 = 0;
						if (arg0.aBoolean317) {
							arg0.anInt4585 = arg0.method4332().method5696();
							if (arg0.anInt4585 == -1) {
								arg0.aBoolean317 = false;
								break label297;
							}
							local20 = client.SeqTypes.method2371(arg0.anInt4585);
						}
						Static1.method4(local20, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.xFine, arg0.zFine, arg0.anInt4626);
					}
					arg0.anInt4593 = arg0.anInt4626 + 1;
					if (local20.anIntArray262.length <= arg0.anInt4593) {
						arg0.anInt4593 = 0;
					}
				}
			}
		}
		@Pc(196) Class157 local196;
		if (arg0.anInt4594 != -1 && arg0.anInt4595 <= client.cycle) {
			@Pc(184) SpotAnimType local184 = client.SpotAnimTypes.method5407(arg0.anInt4594);
			@Pc(187) int local187 = local184.anInt2448;
			if (local187 == -1) {
				arg0.anInt4594 = -1;
			} else {
				label299: {
					local196 = client.SeqTypes.method2371(local187);
					if (local184.aBoolean177) {
						if (local196.anInt4027 == 3) {
							if (arg0.anInt4642 > 0 && arg0.anInt4622 <= client.cycle && arg0.anInt4584 < client.cycle) {
								arg0.anInt4594 = -1;
								break label299;
							}
						} else if (local196.anInt4027 == 1 && arg0.anInt4642 > 0 && client.cycle >= arg0.anInt4622 && client.cycle > arg0.anInt4584) {
							arg0.anInt4595 = client.cycle + 1;
							break label299;
						}
					}
					if (local196 == null || local196.anIntArray262 == null) {
						arg0.anInt4594 = -1;
					} else {
						if (arg0.anInt4582 < 0) {
							arg0.anInt4582 = 0;
							Static1.method4(local196, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.xFine, arg0.zFine, 0);
						}
						arg0.anInt4620++;
						if (arg0.anInt4582 < local196.anIntArray262.length && local196.anIntArray261[arg0.anInt4582] < arg0.anInt4620) {
							arg0.anInt4620 = 1;
							arg0.anInt4582++;
							Static1.method4(local196, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.xFine, arg0.zFine, arg0.anInt4582);
						}
						if (local196.anIntArray262.length <= arg0.anInt4582) {
							if (local184.aBoolean177) {
								arg0.anInt4582 -= local196.anInt4032;
								arg0.anInt4602++;
								if (arg0.anInt4602 >= local196.anInt4024) {
									arg0.anInt4594 = -1;
								} else if (arg0.anInt4582 >= 0 && local196.anIntArray262.length > arg0.anInt4582) {
									Static1.method4(local196, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0, arg0.aByte78, arg0.xFine, arg0.zFine, arg0.anInt4582);
								} else {
									arg0.anInt4594 = -1;
								}
							} else {
								arg0.anInt4594 = -1;
							}
						}
						arg0.anInt4612 = arg0.anInt4582 + 1;
						if (arg0.anInt4612 >= local196.anIntArray262.length) {
							if (local184.aBoolean177) {
								arg0.anInt4612 -= local196.anInt4032;
								if (arg0.anInt4602 + 1 >= local196.anInt4024) {
									arg0.anInt4612 = -1;
								} else if (arg0.anInt4612 < 0 || local196.anIntArray262.length <= arg0.anInt4612) {
									arg0.anInt4612 = -1;
								}
							} else {
								arg0.anInt4612 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4597 != -1 && arg0.anInt4590 <= 1) {
			local20 = client.SeqTypes.method2371(arg0.anInt4597);
			if (local20.anInt4027 == 3) {
				if (arg0.anInt4642 > 0 && arg0.anInt4622 <= client.cycle && client.cycle > arg0.anInt4584) {
					arg0.anInt4597 = -1;
				}
			} else if (local20.anInt4027 == 1 && arg0.anInt4642 > 0 && arg0.anInt4622 <= client.cycle && client.cycle > arg0.anInt4584) {
				arg0.anInt4590 = 2;
			}
		}
		if (arg0.anInt4597 != -1 && arg0.anInt4590 == 0) {
			local20 = client.SeqTypes.method2371(arg0.anInt4597);
			if (local20 == null || local20.anIntArray262 == null) {
				arg0.anInt4597 = -1;
			} else {
				arg0.anInt4624++;
				if (local20.anIntArray262.length > arg0.anInt4607 && local20.anIntArray261[arg0.anInt4607] < arg0.anInt4624) {
					arg0.anInt4624 = 1;
					arg0.anInt4607++;
					Static1.method4(local20, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.xFine, arg0.zFine, arg0.anInt4607);
				}
				if (arg0.anInt4607 >= local20.anIntArray262.length) {
					arg0.anInt4598++;
					arg0.anInt4607 -= local20.anInt4032;
					if (arg0.anInt4598 >= local20.anInt4024) {
						arg0.anInt4597 = -1;
					} else if (arg0.anInt4607 >= 0 && local20.anIntArray262.length > arg0.anInt4607) {
						Static1.method4(local20, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.xFine, arg0.zFine, arg0.anInt4607);
					} else {
						arg0.anInt4597 = -1;
					}
				}
				arg0.anInt4592 = arg0.anInt4607 + 1;
				if (local20.anIntArray262.length <= arg0.anInt4592) {
					arg0.anInt4592 -= local20.anInt4032;
					if (arg0.anInt4598 + 1 >= local20.anInt4024) {
						arg0.anInt4592 = -1;
					} else if (arg0.anInt4592 < 0 || local20.anIntArray262.length <= arg0.anInt4592) {
						arg0.anInt4592 = -1;
					}
				}
				arg0.aBoolean318 = local20.aBoolean261;
			}
		}
		if (arg0.anInt4590 > 0) {
			arg0.anInt4590--;
		}
		for (@Pc(765) int local765 = 0; local765 < arg0.aClass20Array3.length; local765++) {
			@Pc(777) Class20 local777 = arg0.aClass20Array3[local765];
			if (local777 != null) {
				if (local777.anInt629 > 0) {
					local777.anInt629--;
				} else {
					local196 = client.SeqTypes.method2371(local777.anInt624);
					if (local196 == null || local196.anIntArray262 == null) {
						arg0.aClass20Array3[local765] = null;
					} else {
						local777.anInt625++;
						if (local777.anInt628 < local196.anIntArray262.length && local196.anIntArray261[local777.anInt628] < local777.anInt625) {
							local777.anInt625 = 1;
							local777.anInt628++;
							Static1.method4(local196, Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0, arg0.aByte78, arg0.xFine, arg0.zFine, local777.anInt628);
						}
						if (local777.anInt628 >= local196.anIntArray262.length) {
							local777.anInt626++;
							local777.anInt628 -= local196.anInt4032;
							if (local777.anInt626 >= local196.anInt4024) {
								arg0.aClass20Array3[local765] = null;
							} else if (local777.anInt628 >= 0 && local777.anInt628 < local196.anIntArray262.length) {
								Static1.method4(local196, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.xFine, arg0.zFine, local777.anInt628);
							} else {
								arg0.aClass20Array3[local765] = null;
							}
						}
						local777.anInt627 = local777.anInt628 + 1;
						if (local777.anInt627 >= local196.anIntArray262.length) {
							local777.anInt627 -= local196.anInt4032;
							if (local196.anInt4024 <= local777.anInt626 + 1) {
								local777.anInt627 = -1;
							} else if (local777.anInt627 < 0 || local777.anInt627 >= local196.anIntArray262.length) {
								local777.anInt627 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!hc;IIII)V")
	public static void method3316(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static156.method2796(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Scene.anInt1684) {
			Static156.method2796(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static156.method2796(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Scene.anInt3773) {
			Static156.method2796(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Scene.anInt3773) {
			Static156.method2796(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Scene.anInt1684 && arg4 <= Scene.anInt3773) {
			Static156.method2796(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static156.method2796(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Scene.anInt1684 && arg4 > 0) {
			Static156.method2796(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void method3322(@OriginalArg(1) int arg0) {
		@Pc(13) DelayedStateChange local13 = Static316.method5413(8, arg0);
		local13.method2312();
	}
}
