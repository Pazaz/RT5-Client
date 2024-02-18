import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jfa", name = "Mb", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!hma;)V")
	public static void method4332(@OriginalArg(1) Class2_Sub25 arg0) {
		if (Static334.aClass291ArrayArrayArray1 == null) {
			return;
		}
		@Pc(9) Interface25 local9 = null;
		if (arg0.anInt4011 == 0) {
			local9 = (Interface25) Static302.method4414(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006);
		}
		if (arg0.anInt4011 == 1) {
			local9 = (Interface25) Static114.method2134(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006);
		}
		if (arg0.anInt4011 == 2) {
			local9 = (Interface25) Static578.method7623(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006, aClass10 == null ? (aClass10 = getClass("Interface25")) : aClass10);
		}
		if (arg0.anInt4011 == 3) {
			local9 = (Interface25) Static687.method8959(arg0.anInt4010, arg0.anInt4016, arg0.anInt4006);
		}
		if (local9 == null) {
			arg0.anInt4009 = 0;
			arg0.anInt4002 = -1;
			arg0.anInt4015 = 0;
		} else {
			arg0.anInt4002 = local9.method6859(-32136);
			arg0.anInt4009 = local9.method6858();
			arg0.anInt4015 = local9.method6855(23796);
		}
	}

	static Class getClass(String name) {
		Class instance;
		try {
			instance = Class.forName(name);
		} catch (ClassNotFoundException ex) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
		}
		return instance;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
	public static boolean method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static139.method2358(arg0, arg1) | (arg0 & 0x2000) != 0 | Static401.method5575(arg0, arg1)) & Static279.method4074(arg1, arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!gw;I)Z")
	public static boolean method4334(@OriginalArg(0) Class153 arg0) throws IOException {
		@Pc(8) Class348 local8 = arg0.aClass348_1;
		@Pc(11) PacketBit local11 = arg0.aClass2_Sub21_Sub2_2;
		if (local8 == null) {
			return false;
		}
		@Pc(100) int local100;
		if (arg0.aClass225_93 == null) {
			if (arg0.aBoolean279) {
				if (!local8.method7932(1)) {
					return false;
				}
				local8.method7929(arg0.aClass2_Sub21_Sub2_2.data, 1, 0);
				arg0.anInt3646 = 0;
				arg0.anInt3644++;
				arg0.aBoolean279 = false;
			}
			local11.pos = 0;
			if (local11.method7413()) {
				if (!local8.method7932(1)) {
					return false;
				}
				local8.method7929(arg0.aClass2_Sub21_Sub2_2.data, 1, 1);
				arg0.anInt3644++;
				arg0.anInt3646 = 0;
			}
			arg0.aBoolean279 = true;
			@Pc(96) Class225[] local96 = Static585.method7677();
			local100 = local11.method7421();
			if (local100 < 0 || local96.length <= local100) {
				throw new IOException("invo:" + local100 + " ip:" + local11.pos);
			}
			arg0.aClass225_93 = local96[local100];
			arg0.anInt3648 = arg0.aClass225_93.anInt5822;
		}
		if (arg0.anInt3648 == -1) {
			if (!local8.method7932(1)) {
				return false;
			}
			local8.method7929(local11.data, 1, 0);
			arg0.anInt3648 = local11.data[0] & 0xFF;
			arg0.anInt3644++;
			arg0.anInt3646 = 0;
		}
		if (arg0.anInt3648 == -2) {
			if (!local8.method7932(2)) {
				return false;
			}
			local8.method7929(local11.data, 2, 0);
			local11.pos = 0;
			arg0.anInt3648 = local11.g2();
			arg0.anInt3644 += 2;
			arg0.anInt3646 = 0;
		}
		if (arg0.anInt3648 > 0) {
			if (!local8.method7932(arg0.anInt3648)) {
				return false;
			}
			local11.pos = 0;
			local8.method7929(local11.data, arg0.anInt3648, 0);
			arg0.anInt3644 += arg0.anInt3648;
			arg0.anInt3646 = 0;
		}
		arg0.aClass225_91 = arg0.aClass225_94;
		arg0.aClass225_94 = arg0.aClass225_92;
		arg0.aClass225_92 = arg0.aClass225_93;
		@Pc(277) int local277;
		if (Static586.aClass225_215 == arg0.aClass225_93) {
			local277 = local11.g4_alt1();
			Static574.method7573();
			@Pc(287) Class2_Sub4 local287 = (Class2_Sub4) Static548.aClass28_40.method738((long) local277);
			if (local287 != null) {
				Static449.method6115(false, true, local287);
			}
			if (Static390.aClass158_9 != null) {
				Static178.method2729(Static390.aClass158_9);
				Static390.aClass158_9 = null;
			}
			arg0.aClass225_93 = null;
			return true;
		} else if (Static133.aClass225_55 == arg0.aClass225_93) {
			Static605.method7912(Static3.aClass287_1);
			arg0.aClass225_93 = null;
			return true;
		} else if (Static125.aClass225_52 == arg0.aClass225_93) {
			Static605.method7912(Static77.aClass287_5);
			arg0.aClass225_93 = null;
			return true;
		} else if (arg0.aClass225_93 == Static660.aClass225_239) {
			local277 = local11.g4_alt2();
			local100 = local11.g1_alt1();
			Static574.method7573();
			Static450.method6127(local100, local277);
			arg0.aClass225_93 = null;
			return true;
		} else if (Static347.aClass225_146 == arg0.aClass225_93) {
			Static605.method7912(Static420.aClass287_13);
			arg0.aClass225_93 = null;
			return true;
		} else if (Static632.aClass225_229 == arg0.aClass225_93) {
			Static331.aString52 = arg0.anInt3648 <= 2 ? Static32.aClass32_26.method877(Static51.anInt1052) : local11.gjstr();
			Static331.anInt5439 = arg0.anInt3648 <= 0 ? -1 : local11.g2();
			if (Static331.anInt5439 == 65535) {
				Static331.anInt5439 = -1;
			}
			arg0.aClass225_93 = null;
			return true;
		} else if (arg0.aClass225_93 == Static504.aClass225_188) {
			Static605.method7912(Static565.aClass287_8);
			arg0.aClass225_93 = null;
			return true;
		} else {
			@Pc(446) boolean local446;
			if (arg0.aClass225_93 == Static679.aClass225_247) {
				local446 = local11.g1_alt2() == 1;
				local100 = local11.g4_alt3();
				Static574.method7573();
				Static487.method6516(local100, local446);
				arg0.aClass225_93 = null;
				return true;
			} else if (Static489.aClass225_185 == arg0.aClass225_93) {
				local277 = local11.g2_alt2();
				local100 = local11.g4_alt1();
				Static574.method7573();
				Static382.method5370(local277, local100);
				arg0.aClass225_93 = null;
				return true;
			} else if (Static201.aClass225_206 == arg0.aClass225_93) {
				local277 = local11.g4_alt1();
				local100 = local11.g2_alt2();
				Static574.method7573();
				Static700.method9153(local100, local277);
				arg0.aClass225_93 = null;
				return true;
			} else {
				@Pc(526) int local526;
				if (arg0.aClass225_93 == Static542.aClass225_199) {
					local277 = local11.ig2s();
					local100 = local11.ig2s();
					local526 = local11.g4_alt3();
					Static574.method7573();
					Static555.method7298(local100, local277, local526);
					arg0.aClass225_93 = null;
					return true;
				} else if (arg0.aClass225_93 == Static331.aClass225_139) {
					Static400.anInt8102 = Static642.anInt9599;
					local446 = local11.g1() == 1;
					if (arg0.anInt3648 != 1) {
						if (local446) {
							Static128.aClass164_8 = new Class164(local11);
						} else {
							Static91.aClass164_9 = new Class164(local11);
						}
						arg0.aClass225_93 = null;
						return true;
					}
					arg0.aClass225_93 = null;
					if (local446) {
						Static128.aClass164_8 = null;
					} else {
						Static91.aClass164_9 = null;
					}
					return true;
				} else {
					@Pc(629) String local629;
					@Pc(639) long local639;
					@Pc(644) long local644;
					@Pc(649) long local649;
					@Pc(653) int local653;
					@Pc(627) String local627;
					@Pc(657) int local657;
					@Pc(665) boolean local665;
					@Pc(667) int local667;
					if (arg0.aClass225_93 == Static441.aClass225_168) {
						local446 = local11.g1() == 1;
						local627 = local11.gjstr();
						local629 = local627;
						if (local446) {
							local629 = local11.gjstr();
						}
						local639 = local11.g8();
						local644 = (long) local11.g2();
						local649 = (long) local11.g3();
						local653 = local11.g1();
						local657 = local11.g2();
						@Pc(663) long local663 = (local644 << 32) + local649;
						local665 = false;
						local667 = 0;
						while (true) {
							if (local667 >= 100) {
								if (local653 <= 1 && Static71.method1524(local629)) {
									local665 = true;
								}
								break;
							}
							if (Static511.aLongArray17[local667] == local663) {
								local665 = true;
								break;
							}
							local667++;
						}
						if (!local665 && Static659.anInt9817 == 0) {
							Static511.aLongArray17[Static97.anInt2001] = local663;
							Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
							@Pc(737) String local737 = Static288.aClass139_2.method2950(local657).method3903(local11);
							if (local653 == 2) {
								Static662.method8625("<img=1>" + local629, "<img=1>" + local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
							} else if (local653 == 1) {
								Static662.method8625("<img=0>" + local629, "<img=0>" + local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
							} else {
								Static662.method8625(local629, local627, local657, local737, Static99.method1977(local639), 0, local627, 20);
							}
						}
						arg0.aClass225_93 = null;
						return true;
					} else if (arg0.aClass225_93 == Static688.aClass225_250) {
						local446 = local11.g1() == 1;
						@Pc(854) byte[] local854 = new byte[arg0.anInt3648 - 1];
						local11.gdata(local854, 0, arg0.anInt3648 - 1);
						Static113.method2121(local854, local446);
						arg0.aClass225_93 = null;
						return true;
					} else {
						@Pc(892) boolean local892;
						if (arg0.aClass225_93 == Static214.aClass225_85) {
							local277 = local11.g4();
							local892 = local11.g1() == 1;
							if (Static684.aBoolean775 != local892 || Static134.anInt10326 != local277) {
								Static134.anInt10326 = local277;
								Static684.aBoolean775 = local892;
								Static472.method6429(Static232.aClass242_6, -1, -1);
							}
							arg0.aClass225_93 = null;
							return true;
						}
						@Pc(931) byte local931;
						if (Static46.aClass225_27 == arg0.aClass225_93) {
							local277 = local11.g2();
							local931 = local11.g1b_alt1();
							Static34.aClass304_1.method6873(local277, local931);
							arg0.aClass225_93 = null;
							return true;
						} else if (arg0.aClass225_93 == Static283.aClass225_115) {
							Static34.aClass304_1.method6867();
							Static635.anInt9525 += 32;
							arg0.aClass225_93 = null;
							return true;
						} else {
							@Pc(1097) int local1097;
							@Pc(992) int local992;
							@Pc(996) int local996;
							@Pc(1004) boolean local1004;
							@Pc(1002) long local1002;
							@Pc(988) long local988;
							@Pc(1021) int local1021;
							@Pc(1090) String local1090;
							@Pc(983) long local983;
							if (Static224.aClass225_89 == arg0.aClass225_93) {
								local446 = local11.g1() == 1;
								local627 = local11.gjstr();
								local983 = (long) local11.g2();
								local988 = (long) local11.g3();
								local992 = local11.g1();
								local996 = local11.g2();
								local1002 = (local983 << 32) + local988;
								local1004 = false;
								@Pc(1013) Class2_Sub47 local1013 = local446 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
								if (local1013 == null) {
									local1004 = true;
								} else {
									label2238: {
										for (local1021 = 0; local1021 < 100; local1021++) {
											if (Static511.aLongArray17[local1021] == local1002) {
												local1004 = true;
												break label2238;
											}
										}
										if (local992 <= 1 && Static71.method1524(local627)) {
											local1004 = true;
										}
									}
								}
								if (!local1004 && Static659.anInt9817 == 0) {
									Static511.aLongArray17[Static97.anInt2001] = local1002;
									Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
									local1090 = Static288.aClass139_2.method2950(local996).method3903(local11);
									local1097 = local446 ? 42 : 45;
									if (local992 == 2 || local992 == 3) {
										Static662.method8625("<img=1>" + local627, "<img=1>" + local627, local996, local1090, local1013.aString101, 0, local627, local1097);
									} else if (local992 == 1) {
										Static662.method8625("<img=0>" + local627, "<img=0>" + local627, local996, local1090, local1013.aString101, 0, local627, local1097);
									} else {
										Static662.method8625(local627, local627, local996, local1090, local1013.aString101, 0, local627, local1097);
									}
								}
								arg0.aClass225_93 = null;
								return true;
							} else if (arg0.aClass225_93 == Static314.aClass225_132) {
								for (local277 = 0; local277 < Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3.length; local277++) {
									if (Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277] != null) {
										Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277].anIntArray869 = null;
										Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277].aClass152_11.method9113(true, -1);
									}
								}
								for (local100 = 0; local100 < Static416.anInt6378; local100++) {
									Static592.aClass2_Sub45Array1[local100].aClass8_Sub2_Sub1_Sub2_Sub2_2.anIntArray869 = null;
									Static592.aClass2_Sub45Array1[local100].aClass8_Sub2_Sub1_Sub2_Sub2_2.aClass152_11.method9113(true, -1);
								}
								arg0.aClass225_93 = null;
								return true;
							} else if (Static232.aClass225_103 == arg0.aClass225_93) {
								Static279.anObjectArray35 = new Object[Static628.aClass342_5.anInt8769];
								arg0.aClass225_93 = null;
								return true;
							} else if (Static346.aClass225_145 == arg0.aClass225_93) {
								Static324.aBoolean388 = local11.g1_alt3() == 1;
								arg0.aClass225_93 = null;
								return true;
							} else if (arg0.aClass225_93 == Static619.aClass225_34) {
								Static578.anInt8595 = local11.g1();
								arg0.aClass225_93 = null;
								return true;
							} else if (arg0.aClass225_93 == Static416.aClass225_165) {
								local277 = local11.g4_alt2();
								local100 = local11.g2_alt2();
								if (local100 == 65535) {
									local100 = -1;
								}
								Static574.method7573();
								Static479.method6462(local100, 1, -1, local277);
								arg0.aClass225_93 = null;
								return true;
							} else if (arg0.aClass225_93 == Static286.aClass225_117) {
								Static605.method7912(Static370.aClass287_11);
								arg0.aClass225_93 = null;
								return true;
							} else if (Static432.aClass225_10 == arg0.aClass225_93) {
								Static233.method3409(Static461.aBoolean529);
								arg0.aClass225_93 = null;
								return false;
							} else {
								@Pc(1449) int local1449;
								@Pc(1409) int local1409;
								@Pc(1413) int local1413;
								@Pc(1425) boolean local1425;
								@Pc(1427) String local1427;
								@Pc(1750) String local1750;
								@Pc(1491) boolean local1491;
								if (arg0.aClass225_93 == Static320.aClass225_135) {
									while (local11.pos < arg0.anInt3648) {
										local446 = local11.g1() == 1;
										local627 = local11.gjstr();
										local629 = local11.gjstr();
										local1409 = local11.g2();
										local1413 = local11.g1();
										local1425 = local11.g1() == 1;
										local1427 = "";
										@Pc(1429) boolean local1429 = false;
										if (local1409 > 0) {
											local1427 = local11.gjstr();
											local1429 = local11.g1() == 1;
										}
										for (local1449 = 0; local1449 < Static327.anInt5392; local1449++) {
											if (local446) {
												if (local629.equals(Static330.aStringArray25[local1449])) {
													Static330.aStringArray25[local1449] = local627;
													local627 = null;
													Static572.aStringArray42[local1449] = local629;
													break;
												}
											} else if (local627.equals(Static330.aStringArray25[local1449])) {
												if (Static371.anIntArray455[local1449] != local1409) {
													local1491 = true;
													for (@Pc(1496) Class8_Sub4_Sub1 local1496 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2790(); local1496 != null; local1496 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2785()) {
														if (local1496.aString72.equals(local627)) {
															if (local1409 != 0 && local1496.aShort74 == 0) {
																local1491 = false;
																local1496.method9274();
															} else if (local1409 == 0 && local1496.aShort74 != 0) {
																local1491 = false;
																local1496.method9274();
															}
														}
													}
													if (local1491) {
														Static168.aClass130_5.method2787(new Class8_Sub4_Sub1(local627, local1409));
													}
													Static371.anIntArray455[local1449] = local1409;
												}
												Static572.aStringArray42[local1449] = local629;
												Static419.aStringArray33[local1449] = local1427;
												Static715.anIntArray881[local1449] = local1413;
												Static623.aBooleanArray30[local1449] = local1429;
												local627 = null;
												Static429.aBooleanArray21[local1449] = local1425;
												break;
											}
										}
										if (local627 != null && Static327.anInt5392 < 200) {
											Static330.aStringArray25[Static327.anInt5392] = local627;
											Static572.aStringArray42[Static327.anInt5392] = local629;
											Static371.anIntArray455[Static327.anInt5392] = local1409;
											Static419.aStringArray33[Static327.anInt5392] = local1427;
											Static715.anIntArray881[Static327.anInt5392] = local1413;
											Static623.aBooleanArray30[Static327.anInt5392] = local1429;
											Static429.aBooleanArray21[Static327.anInt5392] = local1425;
											Static327.anInt5392++;
										}
									}
									Static344.anInt5621 = Static642.anInt9599;
									Static251.anInt4036 = 2;
									local100 = Static327.anInt5392;
									while (local100 > 0) {
										local446 = true;
										local100--;
										for (local526 = 0; local526 < local100; local526++) {
											@Pc(1665) boolean local1665 = false;
											if (Static344.aClass229_1.anInt5856 != Static371.anIntArray455[local526] && Static344.aClass229_1.anInt5856 == Static371.anIntArray455[local526 + 1]) {
												local1665 = true;
											}
											if (!local1665 && Static371.anIntArray455[local526] == 0 && Static371.anIntArray455[local526 + 1] != 0) {
												local1665 = true;
											}
											if (!local1665 && !Static429.aBooleanArray21[local526] && Static429.aBooleanArray21[local526 + 1]) {
												local1665 = true;
											}
											if (local1665) {
												local1413 = Static371.anIntArray455[local526];
												Static371.anIntArray455[local526] = Static371.anIntArray455[local526 + 1];
												Static371.anIntArray455[local526 + 1] = local1413;
												local1750 = Static419.aStringArray33[local526];
												Static419.aStringArray33[local526] = Static419.aStringArray33[local526 + 1];
												Static419.aStringArray33[local526 + 1] = local1750;
												local1427 = Static330.aStringArray25[local526];
												Static330.aStringArray25[local526] = Static330.aStringArray25[local526 + 1];
												Static330.aStringArray25[local526 + 1] = local1427;
												@Pc(1786) String local1786 = Static572.aStringArray42[local526];
												Static572.aStringArray42[local526] = Static572.aStringArray42[local526 + 1];
												Static572.aStringArray42[local526 + 1] = local1786;
												local1449 = Static715.anIntArray881[local526];
												Static715.anIntArray881[local526] = Static715.anIntArray881[local526 + 1];
												Static715.anIntArray881[local526 + 1] = local1449;
												local1491 = Static623.aBooleanArray30[local526];
												Static623.aBooleanArray30[local526] = Static623.aBooleanArray30[local526 + 1];
												Static623.aBooleanArray30[local526 + 1] = local1491;
												local1004 = Static429.aBooleanArray21[local526];
												Static429.aBooleanArray21[local526] = Static429.aBooleanArray21[local526 + 1];
												local446 = false;
												Static429.aBooleanArray21[local526 + 1] = local1004;
											}
										}
										if (local446) {
											break;
										}
									}
									arg0.aClass225_93 = null;
									return true;
								} else if (Static207.aClass225_128 == arg0.aClass225_93) {
									local277 = local11.g1_alt3();
									local931 = local11.g1b_alt3();
									Static574.method7573();
									Static711.method9271(local931, local277);
									arg0.aClass225_93 = null;
									return true;
								} else if (Static205.aClass225_80 == arg0.aClass225_93) {
									local277 = local11.g4();
									local100 = local11.g2();
									Static34.aClass304_1.method6871(local277, local100);
									arg0.aClass225_93 = null;
									return true;
								} else {
									@Pc(1937) String local1937;
									if (arg0.aClass225_93 == Static87.aClass225_37) {
										local1937 = local11.gjstr();
										local100 = local11.g2();
										local629 = Static288.aClass139_2.method2950(local100).method3903(local11);
										Static662.method8625(local1937, local1937, local100, local629, (String) null, 0, local1937, 19);
										arg0.aClass225_93 = null;
										return true;
									} else if (arg0.aClass225_93 == Static526.aClass225_194) {
										local277 = local11.g2();
										if (local277 == 65535) {
											local277 = -1;
										}
										local100 = local11.g1();
										local526 = local11.g2();
										local1409 = local11.g1();
										local1413 = local11.g2();
										Static186.method2818(local277, local100, local1413, local526, local1409, false);
										arg0.aClass225_93 = null;
										return true;
									} else if (Static618.aClass225_226 == arg0.aClass225_93) {
										local277 = local11.ig2();
										Static574.method7573();
										Static695.method9267(local277);
										arg0.aClass225_93 = null;
										return true;
									} else if (arg0.aClass225_93 == Static286.aClass225_118) {
										local277 = local11.g4_alt2();
										local100 = local11.g2_alt3();
										if (local100 == 65535) {
											local100 = -1;
										}
										Static574.method7573();
										Static681.method8920(local277, local100);
										arg0.aClass225_93 = null;
										return true;
									} else {
										@Pc(2080) boolean local2080;
										@Pc(2098) int local2098;
										if (arg0.aClass225_93 == Static100.aClass225_43) {
											local277 = local11.g2();
											local100 = local11.g1();
											local2080 = (local100 & 0x1) == 1;
											Static205.method3089(local277, local2080);
											local1409 = local11.g2();
											for (local1413 = 0; local1413 < local1409; local1413++) {
												local2098 = local11.g1();
												if (local2098 == 255) {
													local2098 = local11.g4();
												}
												local992 = local11.ig2();
												Static341.method5034(local2080, local2098, local1413, local992 - 1, local277);
											}
											Static322.anIntArray889[Static451.anInt6851++ & 0x1F] = local277;
											arg0.aClass225_93 = null;
											return true;
										} else if (Static663.aClass225_240 == arg0.aClass225_93) {
											local277 = local11.g4();
											Static439.aClass270_4 = Static446.aClass390_6.method8982(local277);
											arg0.aClass225_93 = null;
											return true;
										} else if (Static312.aClass225_131 == arg0.aClass225_93) {
											local277 = local11.ig2();
											local100 = local11.g4();
											Static574.method7573();
											Static540.method6537(local100, local277);
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static452.aClass225_173) {
											local277 = local11.g4_alt3();
											local100 = local11.g2();
											local526 = local11.g2_alt3();
											local1409 = local11.g2_alt2();
											Static574.method7573();
											Static479.method6462(local1409 << 16 | local526, 7, local100, local277);
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static655.aClass225_237) {
											local277 = local11.g4();
											Static574.method7573();
											Static479.method6462(Static312.anInt5000, 5, 0, local277);
											arg0.aClass225_93 = null;
											return true;
										} else if (Static12.aClass225_147 == arg0.aClass225_93) {
											Static233.method3409(false);
											arg0.aClass225_93 = null;
											return false;
										} else if (arg0.aClass225_93 == Static291.aClass225_123) {
											Static466.method6325();
											arg0.aClass225_93 = null;
											return false;
										} else if (arg0.aClass225_93 == Static526.aClass225_195) {
											local277 = local11.g2();
											local100 = local11.g1();
											local2080 = (local100 & 0x1) == 1;
											while (arg0.anInt3648 > local11.pos) {
												local1409 = local11.gSamrt1or2();
												local1413 = local11.g2();
												local2098 = 0;
												if (local1413 != 0) {
													local2098 = local11.g1();
													if (local2098 == 255) {
														local2098 = local11.g4();
													}
												}
												Static341.method5034(local2080, local2098, local1409, local1413 - 1, local277);
											}
											Static322.anIntArray889[Static451.anInt6851++ & 0x1F] = local277;
											arg0.aClass225_93 = null;
											return true;
										} else if (Static383.aClass225_155 == arg0.aClass225_93) {
											local1937 = local11.gjstr();
											@Pc(2379) Object[] local2379 = new Object[local1937.length() + 1];
											for (local526 = local1937.length() - 1; local526 >= 0; local526--) {
												if (local1937.charAt(local526) == 's') {
													local2379[local526 + 1] = local11.gjstr();
												} else {
													local2379[local526 + 1] = Integer.valueOf(local11.g4());
												}
											}
											local2379[0] = Integer.valueOf(local11.g4());
											Static574.method7573();
											@Pc(2442) Class2_Sub42 local2442 = new Class2_Sub42();
											local2442.anObjectArray36 = local2379;
											Static472.method6420(local2442);
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static356.aClass225_149) {
											local277 = local11.ig2();
											local100 = local11.g4();
											Static574.method7573();
											Static647.method8467(local100, local277);
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static491.aClass225_254) {
											Static494.anInt7404 = local11.g2s();
											arg0.aClass225_93 = null;
											Static321.anInt5111 = Static642.anInt9599;
											return true;
										} else if (Static608.aClass225_222 == arg0.aClass225_93) {
											local277 = local11.g2_alt3();
											local100 = local11.g1_alt3();
											Static574.method7573();
											if (local100 == 2) {
												Static322.method9441();
											}
											Static377.anInt5930 = local277;
											Static122.method2208(local277);
											Static640.method8435(false);
											Static472.method6414(Static377.anInt5930);
											for (local526 = 0; local526 < 100; local526++) {
												Static364.aBooleanArray18[local526] = true;
											}
											arg0.aClass225_93 = null;
											return true;
										} else if (Static641.aClass225_234 == arg0.aClass225_93) {
											Static708.method9230(local11.gjstr());
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static40.aClass225_16) {
											local277 = local11.g1_alt2();
											@Pc(2579) int[] local2579 = new int[4];
											for (local526 = 0; local526 < 4; local526++) {
												local2579[local526] = local11.g2_alt3();
											}
											local1409 = local11.g2_alt2();
											@Pc(2608) Class2_Sub45 local2608 = (Class2_Sub45) Static18.aClass28_2.method738((long) local1409);
											if (local2608 != null) {
												Static651.method8515(local2579, local277, true, local2608.aClass8_Sub2_Sub1_Sub2_Sub2_2);
											}
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static72.aClass225_35) {
											if (Static620.method8321(Static283.anInt4574)) {
												Static249.anInt4008 = (int) ((float) local11.g2() * 2.5F);
											} else {
												Static249.anInt4008 = local11.g2() * 30;
											}
											arg0.aClass225_93 = null;
											Static321.anInt5111 = Static642.anInt9599;
											return true;
										} else if (Static565.aClass225_76 == arg0.aClass225_93) {
											Static486.aByte115 = local11.g1b();
											arg0.aClass225_93 = null;
											if (Static486.aByte115 == 0 || Static486.aByte115 == 1) {
												Static587.aBoolean663 = true;
											}
											return true;
										} else if (Static40.aClass225_17 == arg0.aClass225_93) {
											local277 = local11.g4_alt3();
											local100 = local11.g2_alt2();
											Static34.aClass304_1.method6873(local100, local277);
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static229.aClass225_101) {
											Static39.anInt949 = Static642.anInt9599;
											local446 = local11.g1() == 1;
											@Pc(2736) Class68 local2736 = new Class68(local11);
											@Pc(2740) Class2_Sub47 local2740;
											if (local446) {
												local2740 = Static45.aClass2_Sub47_1;
											} else {
												local2740 = Static674.aClass2_Sub47_3;
											}
											local2736.method1581(local2740);
											arg0.aClass225_93 = null;
											return true;
										} else if (Static587.aClass225_216 == arg0.aClass225_93) {
											local277 = local11.g4_alt2();
											local100 = local11.g2();
											Static574.method7573();
											Static2.method62(local100, local277);
											arg0.aClass225_93 = null;
											return true;
										} else if (Static344.aClass225_144 == arg0.aClass225_93) {
											local277 = local11.g4_alt1();
											Static574.method7573();
											if (local277 == -1) {
												Static693.anInt10383 = -1;
												Static692.anInt10376 = -1;
											} else {
												local100 = local277 >> 14 & 0x3FFF;
												local526 = local277 & 0x3FFF;
												local100 -= Static691.anInt10367;
												if (local100 < 0) {
													local100 = 0;
												} else if (Static720.anInt10859 <= local100) {
													local100 = Static720.anInt10859;
												}
												local526 -= Static116.anInt2270;
												Static692.anInt10376 = (local100 << 9) + 256;
												if (local526 < 0) {
													local526 = 0;
												} else if (local526 >= Static501.anInt7568) {
													local526 = Static501.anInt7568;
												}
												Static693.anInt10383 = (local526 << 9) + 256;
											}
											arg0.aClass225_93 = null;
											return true;
										} else if (arg0.aClass225_93 == Static491.aClass225_253) {
											Static696.method9035();
											arg0.aClass225_93 = null;
											return true;
										} else if (Static14.aClass225_5 == arg0.aClass225_93) {
											local277 = local11.g2();
											local931 = local11.g1b();
											if (Static279.anObjectArray35 == null) {
												Static279.anObjectArray35 = new Object[Static628.aClass342_5.anInt8769];
											}
											Static279.anObjectArray35[local277] = Integer.valueOf(local931);
											Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
											arg0.aClass225_93 = null;
											return true;
										} else if (Static40.aClass225_18 == arg0.aClass225_93) {
											local277 = local11.g2();
											Static607.anInt9251 = -1;
											Static717.anInt10817 = local277;
											Static1.anInt10798 = 1;
											Static504.aClass330_95.method7581(Static717.anInt10817);
											local100 = local11.g2();
											Static322.anIntArrayArray265 = new int[local100][4];
											for (local526 = 0; local526 < local100; local526++) {
												for (local1409 = 0; local1409 < 4; local1409++) {
													Static322.anIntArrayArray265[local526][local1409] = local11.g4();
												}
											}
											local1409 = local11.g1();
											Static518.aPacket_18 = new Packet(local1409);
											Static518.aPacket_18.pdata(local11.data, local11.pos, local1409);
											local11.pos += local1409;
											arg0.aClass225_93 = null;
											return false;
										} else {
											@Pc(3044) byte[] local3044;
											if (Static692.aClass225_251 == arg0.aClass225_93) {
												if (Static316.aFrame8 != null) {
													Static409.method5657(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
												}
												local3044 = new byte[arg0.anInt3648];
												local11.pdataisaac(local3044, arg0.anInt3648);
												local627 = Static350.method5126(0, local3044, arg0.anInt3648);
												Static664.method8655(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915() == 1, local627, true, Static446.aClass390_6);
												arg0.aClass225_93 = null;
												return true;
											} else if (arg0.aClass225_93 == Static444.aClass225_169) {
												local446 = local11.g1() == 1;
												local627 = local11.gjstr();
												local629 = local627;
												if (local446) {
													local629 = local11.gjstr();
												}
												local639 = (long) local11.g2();
												local644 = (long) local11.g3();
												local996 = local11.g1();
												local1449 = local11.g2();
												@Pc(3134) long local3134 = local644 + (local639 << 32);
												@Pc(3136) boolean local3136 = false;
												local1021 = 0;
												while (true) {
													if (local1021 >= 100) {
														if (local996 <= 1 && Static71.method1524(local629)) {
															local3136 = true;
														}
														break;
													}
													if (local3134 == Static511.aLongArray17[local1021]) {
														local3136 = true;
														break;
													}
													local1021++;
												}
												if (!local3136 && Static659.anInt9817 == 0) {
													Static511.aLongArray17[Static97.anInt2001] = local3134;
													Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
													local1090 = Static288.aClass139_2.method2950(local1449).method3903(local11);
													if (local996 == 2) {
														Static662.method8625("<img=1>" + local629, "<img=1>" + local627, local1449, local1090, (String) null, 0, local627, 18);
													} else if (local996 == 1) {
														Static662.method8625("<img=0>" + local629, "<img=0>" + local627, local1449, local1090, (String) null, 0, local627, 18);
													} else {
														Static662.method8625(local629, local627, local1449, local1090, (String) null, 0, local627, 18);
													}
												}
												arg0.aClass225_93 = null;
												return true;
											} else if (Static176.aClass225_187 == arg0.aClass225_93) {
												local277 = local11.g1_alt3();
												local100 = local11.g2_alt2();
												Static34.aClass304_1.method6871(local277, local100);
												arg0.aClass225_93 = null;
												return true;
											} else if (Static636.aClass225_230 == arg0.aClass225_93) {
												local277 = local11.g1_alt3();
												local100 = local11.g1_alt1();
												local526 = local11.g4_alt1();
												Static237.anIntArray518[local100] = local526;
												Static581.anIntArray688[local100] = local277;
												Static498.anIntArray604[local100] = 1;
												local1409 = Static245.anIntArray773[local100] - 1;
												for (local1413 = 0; local1413 < local1409; local1413++) {
													if (Class28.anIntArray34[local1413] <= local526) {
														Static498.anIntArray604[local100] = local1413 + 2;
													}
												}
												Static395.anIntArray833[Static366.anInt5858++ & 0x1F] = local100;
												arg0.aClass225_93 = null;
												return true;
											} else if (arg0.aClass225_93 == Static305.aClass225_129) {
												Static726.aClass280_7 = Static189.method2864(local11.g1());
												arg0.aClass225_93 = null;
												return true;
											} else if (Static410.aClass225_163 == arg0.aClass225_93) {
												local277 = local11.g1_alt3();
												local100 = local11.g4();
												local526 = local11.ig2();
												local1409 = local11.ig2();
												Static574.method7573();
												Static223.method9094(local277, local1409, local100, local526);
												arg0.aClass225_93 = null;
												return true;
											} else {
												@Pc(3502) int local3502;
												@Pc(3582) String local3582;
												if (arg0.aClass225_93 == Static266.aClass225_191) {
													local446 = local11.g1() == 1;
													local627 = local11.gjstr();
													local983 = (long) local11.g2();
													local988 = (long) local11.g3();
													local992 = local11.g1();
													local649 = (local983 << 32) + local988;
													local1491 = false;
													@Pc(3494) Class2_Sub47 local3494 = local446 ? Static45.aClass2_Sub47_1 : Static674.aClass2_Sub47_3;
													if (local3494 == null) {
														local1491 = true;
													} else {
														label2266: {
															for (local3502 = 0; local3502 < 100; local3502++) {
																if (local649 == Static511.aLongArray17[local3502]) {
																	local1491 = true;
																	break label2266;
																}
															}
															if (local992 <= 1) {
																if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
																	local1491 = true;
																} else if (Static71.method1524(local627)) {
																	local1491 = true;
																}
															}
														}
													}
													if (!local1491 && Static659.anInt9817 == 0) {
														Static511.aLongArray17[Static97.anInt2001] = local649;
														Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
														local3582 = Static130.method2280(Static15.method189(local11));
														local1021 = local446 ? 41 : 44;
														if (local992 == 2 || local992 == 3) {
															Static662.method8625("<img=1>" + local627, "<img=1>" + local627, -1, local3582, local3494.aString101, 0, local627, local1021);
														} else if (local992 == 1) {
															Static662.method8625("<img=0>" + local627, "<img=0>" + local627, -1, local3582, local3494.aString101, 0, local627, local1021);
														} else {
															Static662.method8625(local627, local627, -1, local3582, local3494.aString101, 0, local627, local1021);
														}
													}
													arg0.aClass225_93 = null;
													return true;
												} else if (arg0.aClass225_93 == Static618.aClass225_227) {
													local277 = local11.g1();
													local100 = local277 >> 5;
													local526 = local277 & 0x1F;
													if (local526 == 0) {
														Static527.aClass254Array1[local100] = null;
														arg0.aClass225_93 = null;
														return true;
													}
													@Pc(3721) Class254 local3721 = new Class254();
													local3721.anInt6363 = local526;
													local3721.anInt6367 = local11.g1();
													if (local3721.anInt6367 >= 0 && local3721.anInt6367 < Static28.aClass23Array1.length) {
														if (local3721.anInt6363 == 1 || local3721.anInt6363 == 10) {
															local3721.anInt6366 = local11.g2();
															local3721.anInt6360 = local11.g2();
															local11.pos += 4;
														} else if (local3721.anInt6363 >= 2 && local3721.anInt6363 <= 6) {
															if (local3721.anInt6363 == 2) {
																local3721.anInt6362 = 256;
																local3721.anInt6369 = 256;
															}
															if (local3721.anInt6363 == 3) {
																local3721.anInt6369 = 0;
																local3721.anInt6362 = 256;
															}
															if (local3721.anInt6363 == 4) {
																local3721.anInt6369 = 512;
																local3721.anInt6362 = 256;
															}
															if (local3721.anInt6363 == 5) {
																local3721.anInt6362 = 0;
																local3721.anInt6369 = 256;
															}
															if (local3721.anInt6363 == 6) {
																local3721.anInt6362 = 512;
																local3721.anInt6369 = 256;
															}
															local3721.anInt6363 = 2;
															local3721.anInt6368 = local11.g1();
															local3721.anInt6369 += local11.g2() - Static691.anInt10367 << 9;
															local3721.anInt6362 += local11.g2() - Static116.anInt2270 << 9;
															local3721.anInt6365 = local11.g1() << 2;
															local3721.anInt6364 = local11.g2();
														}
														local3721.anInt6371 = local11.g2();
														if (local3721.anInt6371 == 65535) {
															local3721.anInt6371 = -1;
														}
														Static527.aClass254Array1[local100] = local3721;
													}
													arg0.aClass225_93 = null;
													return true;
												} else if (arg0.aClass225_93 == Static428.aClass225_167) {
													local277 = local11.g1_alt3();
													Static574.method7573();
													arg0.aClass225_93 = null;
													Static150.anInt2632 = local277;
													return true;
												} else if (arg0.aClass225_93 == Static309.aClass225_130) {
													local11.pos += 28;
													if (local11.checkcrc()) {
														Static83.method1608(local11.pos - 28, local11);
													}
													arg0.aClass225_93 = null;
													return true;
												} else if (arg0.aClass225_93 == Static303.aClass225_126) {
													local277 = local11.ig2();
													if (local277 == 65535) {
														local277 = -1;
													}
													local100 = local11.g4();
													local526 = local11.g4_alt3();
													Static574.method7573();
													Static301.method4394(local526, local100, local277);
													@Pc(4005) Class382 local4005 = Static419.aClass112_1.method2486(local277);
													Static231.method3378(local4005.anInt10107, local4005.anInt10098, local526, local4005.anInt10096);
													Static528.method7087(local4005.anInt10094, local526, local4005.anInt10099, local4005.anInt10126);
													arg0.aClass225_93 = null;
													return true;
												} else if (arg0.aClass225_93 == Static208.aClass225_83) {
													local277 = local11.g1_alt3();
													local100 = local11.g2();
													Static574.method7573();
													Static515.method6802(true, local100, local277);
													arg0.aClass225_93 = null;
													return true;
												} else if (arg0.aClass225_93 == Static479.aClass225_177) {
													local446 = local11.g1_alt2() == 1;
													Static574.method7573();
													Static501.aBoolean576 = local446;
													arg0.aClass225_93 = null;
													return true;
												} else if (arg0.aClass225_93 == Static557.aClass225_205) {
													local277 = local11.g1();
													if (local11.g1() == 0) {
														Static105.aClass171Array1[local277] = new Class171();
													} else {
														local11.pos--;
														Static105.aClass171Array1[local277] = new Class171(local11);
													}
													Static526.anInt8067 = Static642.anInt9599;
													arg0.aClass225_93 = null;
													return true;
												} else if (Static334.aClass225_140 == arg0.aClass225_93) {
													local277 = local11.g2_alt3();
													Static574.method7573();
													Static121.method2199(local277);
													arg0.aClass225_93 = null;
													return true;
												} else if (Static166.aClass225_63 == arg0.aClass225_93) {
													Static605.method7912(Static668.aClass287_16);
													arg0.aClass225_93 = null;
													return true;
												} else {
													@Pc(4175) String local4175;
													@Pc(4177) String local4177;
													if (arg0.aClass225_93 == Static408.aClass225_162) {
														local277 = local11.gSamrt1or2();
														local100 = local11.g4();
														local526 = local11.g1();
														local4175 = "";
														local4177 = local4175;
														if ((local526 & 0x1) != 0) {
															local4175 = local11.gjstr();
															if ((local526 & 0x2) == 0) {
																local4177 = local4175;
															} else {
																local4177 = local11.gjstr();
															}
														}
														local1750 = local11.gjstr();
														if (local277 == 99) {
															Static79.method1579(local1750);
														} else if (local277 == 98) {
															Static87.method1694(local1750);
														} else if (local4177.equals("") || !Static71.method1524(local4177)) {
															Static44.method1072(local1750, local4175, local100, local4175, local4177, local277);
														} else {
															arg0.aClass225_93 = null;
															return true;
														}
														arg0.aClass225_93 = null;
														return true;
													} else if (arg0.aClass225_93 == Static481.aClass225_178) {
														arg0.aClass225_93 = null;
														Static279.anObjectArray35 = null;
														return true;
													} else if (Static51.aClass225_30 == arg0.aClass225_93) {
														local277 = local11.g2_alt3();
														local627 = local11.gjstr();
														Static574.method7573();
														Static394.method5544(local277, local627);
														arg0.aClass225_93 = null;
														return true;
													} else if (arg0.aClass225_93 == Static231.aClass225_102) {
														local277 = local11.g1_alt3();
														local100 = local11.g1_alt1();
														local526 = local11.g2_alt3();
														local1409 = local11.g1_alt3();
														local1413 = local11.g1_alt3();
														Static574.method7573();
														Static572.aBooleanArray29[local100] = true;
														Static331.anIntArray403[local100] = local1409;
														Static140.anIntArray222[local100] = local1413;
														Static362.anIntArray450[local100] = local277;
														Static194.anIntArray268[local100] = local526;
														arg0.aClass225_93 = null;
														return true;
													} else if (Static284.aClass225_116 == arg0.aClass225_93) {
														Static605.method7912(Static481.aClass287_15);
														arg0.aClass225_93 = null;
														return true;
													} else if (Static225.aClass225_90 == arg0.aClass225_93) {
														Static436.anInt3849 = local11.g1();
														for (local277 = 0; local277 < Static436.anInt3849; local277++) {
															Static632.aStringArray44[local277] = local11.gjstr();
															Static446.aStringArray35[local277] = local11.gjstr();
															if (Static446.aStringArray35[local277].equals("")) {
																Static446.aStringArray35[local277] = Static632.aStringArray44[local277];
															}
															Static10.aStringArray1[local277] = local11.gjstr();
															Static316.aStringArray41[local277] = local11.gjstr();
															if (Static316.aStringArray41[local277].equals("")) {
																Static316.aStringArray41[local277] = Static10.aStringArray1[local277];
															}
															Static65.aBooleanArray2[local277] = false;
														}
														Static344.anInt5621 = Static642.anInt9599;
														arg0.aClass225_93 = null;
														return true;
													} else if (Static570.aClass225_208 == arg0.aClass225_93) {
														Static605.method7912(Static379.aClass287_12);
														arg0.aClass225_93 = null;
														return true;
													} else if (Static273.aClass225_113 == arg0.aClass225_93) {
														local277 = local11.g1_alt1();
														local100 = local11.ig2();
														if (local100 == 65535) {
															local100 = -1;
														}
														local629 = local11.gjstr();
														local1409 = local11.g1_alt2();
														if (local1409 >= 1 && local1409 <= 8) {
															if (local629.equalsIgnoreCase("null")) {
																local629 = null;
															}
															Static297.aStringArray24[local1409 - 1] = local629;
															Static147.anIntArray227[local1409 - 1] = local100;
															Static601.aBooleanArray28[local1409 - 1] = local277 == 0;
														}
														arg0.aClass225_93 = null;
														return true;
													} else {
														@Pc(4611) Class2_Sub41 local4611;
														@Pc(4597) Class2_Sub41 local4597;
														if (arg0.aClass225_93 == Static161.aClass225_62) {
															local277 = local11.g2_alt2();
															if (local277 == 65535) {
																local277 = -1;
															}
															local100 = local11.g4_alt3();
															local526 = local11.g2();
															if (local526 == 65535) {
																local526 = -1;
															}
															local1409 = local11.ig2();
															Static574.method7573();
															for (local1413 = local277; local1413 <= local526; local1413++) {
																local644 = (long) local1413 + ((long) local100 << 32);
																local4597 = (Class2_Sub41) Static291.aClass28_24.method738(local644);
																if (local4597 != null) {
																	local4611 = new Class2_Sub41(local4597.anInt6909, local1409);
																	local4597.method9457();
																} else if (local1413 == -1) {
																	local4611 = new Class2_Sub41(Static145.method2412(local100).aClass2_Sub41_2.anInt6909, local1409);
																} else {
																	local4611 = new Class2_Sub41(0, local1409);
																}
																Static291.aClass28_24.method735(local644, local4611);
															}
															arg0.aClass225_93 = null;
															return true;
														}
														@Pc(4669) long local4669;
														if (arg0.aClass225_93 == Static297.aClass225_125) {
															local277 = local11.g2();
															local4669 = local11.g8();
															if (Static279.anObjectArray35 == null) {
																Static279.anObjectArray35 = new Object[Static628.aClass342_5.anInt8769];
															}
															Static279.anObjectArray35[local277] = Long.valueOf(local4669);
															Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
															arg0.aClass225_93 = null;
															return true;
														} else if (Static233.aClass225_104 == arg0.aClass225_93) {
															local277 = local11.ig2();
															local100 = local11.g2_alt3();
															local526 = local11.g4();
															Static574.method7573();
															Static295.method4347(local526, local277 + (local100 << 16));
															arg0.aClass225_93 = null;
															return true;
														} else if (arg0.aClass225_93 == Static137.aClass225_56) {
															Static605.method7912(Static328.aClass287_10);
															arg0.aClass225_93 = null;
															return true;
														} else {
															@Pc(4857) boolean local4857;
															if (arg0.aClass225_93 == Static605.aClass225_220) {
																local277 = local11.g2_alt2();
																local100 = local11.g4_alt3();
																local526 = local11.g1_alt1();
																local1409 = local11.g1_alt1();
																local1413 = local11.g2();
																local2098 = local11.ig2();
																if (local2098 == 65535) {
																	local2098 = -1;
																}
																local992 = local1409 & 0x7;
																local996 = local1409 >> 3 & 0xF;
																if (local996 == 15) {
																	local996 = -1;
																}
																@Pc(4806) boolean local4806 = (local1409 >> 7 & 0x1) == 1;
																if (local100 >> 30 == 0) {
																	@Pc(4943) int local4943;
																	@Pc(4911) Class69 local4911;
																	@Pc(4888) Class227 local4888;
																	@Pc(4905) Class69 local4905;
																	if (local100 >> 29 != 0) {
																		local653 = local100 & 0xFFFF;
																		@Pc(5032) Class2_Sub45 local5032 = (Class2_Sub45) Static18.aClass28_2.method738((long) local653);
																		if (local5032 != null) {
																			@Pc(5037) Class8_Sub2_Sub1_Sub2_Sub2 local5037 = local5032.aClass8_Sub2_Sub1_Sub2_Sub2_2;
																			@Pc(5042) Class199 local5042 = local5037.aClass199Array3[local526];
																			if (local2098 == 65535) {
																				local2098 = -1;
																			}
																			local665 = true;
																			local667 = local5042.anInt4930;
																			if (local2098 != -1 && local667 != -1) {
																				if (local667 == local2098) {
																					local4888 = Static23.aClass128_1.method2694(local2098);
																					if (local4888.aBoolean448 && local4888.anInt5842 != -1) {
																						local4905 = Static25.aClass50_1.method1162(local4888.anInt5842);
																						@Pc(5134) int local5134 = local4905.anInt1646;
																						if (local5134 == 0 || local5134 == 2) {
																							local665 = false;
																						} else if (local5134 == 1) {
																							local665 = true;
																						}
																					}
																				} else {
																					local4888 = Static23.aClass128_1.method2694(local2098);
																					@Pc(5078) Class227 local5078 = Static23.aClass128_1.method2694(local667);
																					if (local4888.anInt5842 != -1 && local5078.anInt5842 != -1) {
																						local4911 = Static25.aClass50_1.method1162(local4888.anInt5842);
																						@Pc(5102) Class69 local5102 = Static25.aClass50_1.method1162(local5078.anInt5842);
																						if (local4911.anInt1649 < local5102.anInt1649) {
																							local665 = false;
																						}
																					}
																				}
																			}
																			if (local665) {
																				local5042.anInt4928 = local996;
																				local5042.anInt4931 = local1413;
																				local5042.anInt4930 = local2098;
																				if (local2098 == -1) {
																					local5042.aClass152_7.method9113(true, -1);
																				} else {
																					local4888 = Static23.aClass128_1.method2694(local2098);
																					local4943 = local4888.aBoolean448 ? 0 : 2;
																					if (local4806) {
																						local4943 = 1;
																					}
																					local5042.aClass152_7.method9092(local4888.anInt5842, local277, local4943, false);
																				}
																			}
																		}
																	} else if (local100 >> 28 != 0) {
																		local653 = local100 & 0xFFFF;
																		@Pc(4839) Class8_Sub2_Sub1_Sub2_Sub1 local4839;
																		if (local653 == Static312.anInt5000) {
																			local4839 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
																		} else {
																			local4839 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local653];
																		}
																		if (local4839 != null) {
																			@Pc(4850) Class199 local4850 = local4839.aClass199Array3[local526];
																			if (local2098 == 65535) {
																				local2098 = -1;
																			}
																			local4857 = true;
																			local1097 = local4850.anInt4930;
																			@Pc(4883) Class227 local4883;
																			if (local2098 != -1 && local1097 != -1) {
																				if (local2098 == local1097) {
																					local4883 = Static23.aClass128_1.method2694(local2098);
																					if (local4883.aBoolean448 && local4883.anInt5842 != -1) {
																						@Pc(4940) Class69 local4940 = Static25.aClass50_1.method1162(local4883.anInt5842);
																						local4943 = local4940.anInt1646;
																						if (local4943 == 0 || local4943 == 2) {
																							local4857 = false;
																						} else if (local4943 == 1) {
																							local4857 = true;
																						}
																					}
																				} else {
																					local4883 = Static23.aClass128_1.method2694(local2098);
																					local4888 = Static23.aClass128_1.method2694(local1097);
																					if (local4883.anInt5842 != -1 && local4888.anInt5842 != -1) {
																						local4905 = Static25.aClass50_1.method1162(local4883.anInt5842);
																						local4911 = Static25.aClass50_1.method1162(local4888.anInt5842);
																						if (local4911.anInt1649 > local4905.anInt1649) {
																							local4857 = false;
																						}
																					}
																				}
																			}
																			if (local4857) {
																				local4850.anInt4928 = local996;
																				local4850.anInt4931 = local1413;
																				local4850.anInt4929 = local992;
																				local4850.anInt4930 = local2098;
																				if (local2098 == -1) {
																					local4850.aClass152_7.method9113(true, -1);
																				} else {
																					local4883 = Static23.aClass128_1.method2694(local2098);
																					@Pc(5006) int local5006 = local4883.aBoolean448 ? 0 : 2;
																					if (local4806) {
																						local5006 = 1;
																					}
																					local4850.aClass152_7.method9092(local4883.anInt5842, local277, local5006, false);
																				}
																			}
																		}
																	}
																} else {
																	local653 = local100 >> 28 & 0x3;
																	local657 = (local100 >> 14 & 0x3FFF) - Static691.anInt10367;
																	local3502 = (local100 & 0x3FFF) - Static116.anInt2270;
																	if (local657 >= 0 && local3502 >= 0 && local657 < Static720.anInt10859 && local3502 < Static501.anInt7568) {
																		if (local2098 == -1) {
																			@Pc(5270) Class2_Sub2_Sub20 local5270 = (Class2_Sub2_Sub20) Static346.aClass28_29.method738((long) (local657 << 16 | local3502));
																			if (local5270 != null) {
																				local5270.aClass8_Sub2_Sub1_Sub5_1.method6600();
																				local5270.method9457();
																			}
																		} else {
																			local1021 = local657 * 512 + 256;
																			local1097 = local3502 * 512 + 256;
																			local667 = local653;
																			if (local653 < 3 && Static441.method5968(local3502, local657)) {
																				local667 = local653 + 1;
																			}
																			@Pc(5334) Class8_Sub2_Sub1_Sub5 local5334 = new Class8_Sub2_Sub1_Sub5(local2098, local277, local653, local667, local1021, Static102.method2025(local653, -29754, local1097, local1021) - local1413, local1097, local657, local657, local3502, local3502, local992, local4806);
																			Static346.aClass28_29.method735((long) (local3502 | local657 << 16), new Class2_Sub2_Sub20(local5334));
																		}
																	}
																}
																arg0.aClass225_93 = null;
																return true;
															} else if (Static9.aClass225_3 == arg0.aClass225_93) {
																local277 = local11.g4();
																local100 = local11.ig2();
																if (local100 == 65535) {
																	local100 = -1;
																}
																Static574.method7573();
																Static479.method6462(local100, 2, -1, local277);
																arg0.aClass225_93 = null;
																return true;
															} else if (Static36.aClass225_15 == arg0.aClass225_93) {
																Static480.method6468(local11, Static446.aClass390_6, arg0.anInt3648);
																arg0.aClass225_93 = null;
																return true;
															} else if (Static193.aClass225_74 == arg0.aClass225_93) {
																Static574.method7573();
																Static693.method9012();
																arg0.aClass225_93 = null;
																return true;
															} else {
																@Pc(5445) Class2_Sub4 local5445;
																if (Static119.aClass225_47 == arg0.aClass225_93) {
																	local277 = local11.g4_alt2();
																	local100 = local11.g4_alt3();
																	Static574.method7573();
																	@Pc(5438) Class2_Sub4 local5438 = (Class2_Sub4) Static548.aClass28_40.method738((long) local100);
																	local5445 = (Class2_Sub4) Static548.aClass28_40.method738((long) local277);
																	if (local5445 != null) {
																		Static449.method6115(false, local5438 == null || local5438.anInt147 != local5445.anInt147, local5445);
																	}
																	if (local5438 != null) {
																		local5438.method9457();
																		Static548.aClass28_40.method735((long) local277, local5438);
																	}
																	@Pc(5487) Class158 local5487 = Static145.method2412(local100);
																	if (local5487 != null) {
																		Static178.method2729(local5487);
																	}
																	local5487 = Static145.method2412(local277);
																	if (local5487 != null) {
																		Static178.method2729(local5487);
																		Static134.method8956(local5487, true);
																	}
																	if (Static377.anInt5930 != -1) {
																		Static145.method2411(1, Static377.anInt5930);
																	}
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static121.aClass225_49) {
																	local277 = local11.g2_alt3();
																	local100 = local11.g4_alt1();
																	local526 = local11.g1();
																	Static574.method7573();
																	local5445 = (Class2_Sub4) Static548.aClass28_40.method738((long) local100);
																	if (local5445 != null) {
																		Static449.method6115(false, local5445.anInt147 != local277, local5445);
																	}
																	Static163.method8850(local526, local277, local100, false);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static563.aClass225_207) {
																	local277 = local11.g1_alt2();
																	local100 = local11.g2_alt3() << 2;
																	local526 = local11.g1_alt3();
																	local1409 = local11.g1();
																	local1413 = local11.g1_alt3();
																	Static574.method7573();
																	Static638.method8397(local1409, local277, local526, local100, local1413);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (Static671.aClass225_246 == arg0.aClass225_93) {
																	Static703.anInt10571 = local11.g1();
																	arg0.aClass225_93 = null;
																	Static321.anInt5111 = Static642.anInt9599;
																	return true;
																} else if (arg0.aClass225_93 == Static721.aClass225_259) {
																	local277 = local11.g2_alt2();
																	local100 = local11.g2_alt3();
																	local526 = local11.g4_alt1();
																	local1409 = local11.g2_alt3();
																	Static574.method7573();
																	Static231.method3378(local1409, local277, local526, local100);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (Static454.aClass225_174 == arg0.aClass225_93) {
																	local1937 = local11.gjstr();
																	local100 = local11.g2_alt2();
																	Static574.method7573();
																	Static394.method5544(local100, local1937);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static663.aClass225_241) {
																	local446 = local11.g1() == 1;
																	local627 = local11.gjstr();
																	local629 = local627;
																	if (local446) {
																		local629 = local11.gjstr();
																	}
																	local639 = (long) local11.g2();
																	local644 = (long) local11.g3();
																	local996 = local11.g1();
																	local1002 = local644 + (local639 << 32);
																	local1004 = false;
																	local3502 = 0;
																	while (true) {
																		if (local3502 >= 100) {
																			if (local996 <= 1) {
																				if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
																					local1004 = true;
																				} else if (Static71.method1524(local629)) {
																					local1004 = true;
																				}
																			}
																			break;
																		}
																		if (Static511.aLongArray17[local3502] == local1002) {
																			local1004 = true;
																			break;
																		}
																		local3502++;
																	}
																	if (!local1004 && Static659.anInt9817 == 0) {
																		Static511.aLongArray17[Static97.anInt2001] = local1002;
																		Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
																		local3582 = Static130.method2280(Static15.method189(local11));
																		if (local996 == 2) {
																			Static662.method8625("<img=1>" + local629, "<img=1>" + local627, -1, local3582, (String) null, 0, local627, 7);
																		} else if (local996 == 1) {
																			Static662.method8625("<img=0>" + local629, "<img=0>" + local627, -1, local3582, (String) null, 0, local627, 7);
																		} else {
																			Static662.method8625(local629, local627, -1, local3582, (String) null, 0, local627, 3);
																		}
																	}
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static606.aClass225_221) {
																	local277 = local11.g1_alt3();
																	local100 = local11.ig2();
																	if (local100 == 65535) {
																		local100 = -1;
																	}
																	local526 = local11.g1_alt2();
																	Static63.method1427(local526, local100, local277);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (Static699.aClass225_252 == arg0.aClass225_93) {
																	local277 = local11.g2_alt2();
																	if (local277 == 65535) {
																		local277 = -1;
																	}
																	local100 = local11.g3_alt1();
																	local526 = local11.g1_alt2();
																	Static482.method6481(local526, local277, local100);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (Static272.aClass225_112 == arg0.aClass225_93) {
																	if (Static316.aFrame8 != null) {
																		Static409.method5657(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
																	}
																	local3044 = new byte[arg0.anInt3648];
																	local11.pdataisaac(local3044, arg0.anInt3648);
																	local627 = Static350.method5126(0, local3044, arg0.anInt3648);
																	local629 = "opensn";
																	if (!Static98.aBoolean191 || Static36.method980(Static446.aClass390_6, local627, local629, 1).anInt6789 == 2) {
																		Static259.method3693(local627, local629, Static446.aClass390_6, Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7915() == 1, true);
																	}
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static459.aClass225_175) {
																	local277 = local11.g2();
																	local100 = local11.g2();
																	local526 = local11.g2();
																	Static574.method7573();
																	if (Static453.aClass158ArrayArray2[local277] != null) {
																		for (local1409 = local100; local1409 < local526; local1409++) {
																			local1413 = local11.g3();
																			if (Static453.aClass158ArrayArray2[local277].length > local1409 && Static453.aClass158ArrayArray2[local277][local1409] != null) {
																				Static453.aClass158ArrayArray2[local277][local1409].anInt3774 = local1413;
																			}
																		}
																	}
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static266.aClass225_192) {
																	local277 = local11.g4_alt2();
																	local100 = local11.g2();
																	local526 = local11.g4_alt3();
																	Static574.method7573();
																	Static479.method6462(local100, 5, local526, local277);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static598.aClass225_219) {
																	Static605.method7912(Static84.aClass287_6);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (Static389.aClass225_157 == arg0.aClass225_93) {
																	local277 = local11.g2();
																	if (local277 == 65535) {
																		local277 = -1;
																	}
																	local100 = local11.g1();
																	local526 = local11.g2();
																	local1409 = local11.g1();
																	Static186.method2818(local277, local100, 256, local526, local1409, true);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static40.aClass225_19) {
																	Static574.method7573();
																	Static145.method2409();
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static91.aClass225_236) {
																	Static308.method4482(local11, arg0.anInt3648);
																	arg0.aClass225_93 = null;
																	return true;
																} else if (Static250.aClass225_105 == arg0.aClass225_93) {
																	Static133.anInt2458 = local11.g1();
																	Static87.anInt1806 = local11.g1();
																	arg0.aClass225_93 = null;
																	return true;
																} else if (Static31.aClass225_14 == arg0.aClass225_93) {
																	Static626.anInt9476 = local11.g1b() << 3;
																	Static270.anInt4354 = local11.g1b_alt3() << 3;
																	Static87.anInt1810 = local11.g1();
																	for (@Pc(6277) Class2_Sub17 local6277 = (Class2_Sub17) Static497.aClass28_35.method736(); local6277 != null; local6277 = (Class2_Sub17) Static497.aClass28_35.method740()) {
																		local100 = (int) (local6277.aLong328 >> 28 & 0x3L);
																		local526 = (int) (local6277.aLong328 & 0x3FFFL);
																		local1409 = local526 - Static691.anInt10367;
																		local1413 = (int) (local6277.aLong328 >> 14 & 0x3FFFL);
																		local2098 = local1413 - Static116.anInt2270;
																		if (Static87.anInt1810 == local100 && local1409 >= Static626.anInt9476 && Static626.anInt9476 + 8 > local1409 && local2098 >= Static270.anInt4354 && Static270.anInt4354 + 8 > local2098) {
																			local6277.method9457();
																			if (local1409 >= 0 && local2098 >= 0 && Static720.anInt10859 > local1409 && local2098 < Static501.anInt7568) {
																				Static468.method7641(Static87.anInt1810, local2098, local1409);
																			}
																		}
																	}
																	@Pc(6385) Class2_Sub25 local6385;
																	for (local6385 = (Class2_Sub25) Static159.aClass339_15.method7699(65280); local6385 != null; local6385 = (Class2_Sub25) Static159.aClass339_15.method7706()) {
																		if (Static626.anInt9476 <= local6385.anInt4016 && Static626.anInt9476 + 8 > local6385.anInt4016 && local6385.anInt4006 >= Static270.anInt4354 && Static270.anInt4354 + 8 > local6385.anInt4006 && Static87.anInt1810 == local6385.anInt4010) {
																			local6385.aBoolean309 = true;
																		}
																	}
																	for (local6385 = (Class2_Sub25) Static227.aClass339_18.method7699(65280); local6385 != null; local6385 = (Class2_Sub25) Static227.aClass339_18.method7706()) {
																		if (local6385.anInt4016 >= Static626.anInt9476 && Static626.anInt9476 + 8 > local6385.anInt4016 && local6385.anInt4006 >= Static270.anInt4354 && Static270.anInt4354 + 8 > local6385.anInt4006 && local6385.anInt4010 == Static87.anInt1810) {
																			local6385.aBoolean309 = true;
																		}
																	}
																	arg0.aClass225_93 = null;
																	return true;
																} else if (arg0.aClass225_93 == Static533.aClass225_196) {
																	local277 = local11.g4_alt1();
																	Static574.method7573();
																	Static479.method6462(-1, 3, -1, local277);
																	arg0.aClass225_93 = null;
																	return true;
																} else {
																	@Pc(6565) boolean local6565;
																	if (Static718.aClass225_258 == arg0.aClass225_93) {
																		local446 = local11.g1() == 1;
																		local627 = local11.gjstr();
																		local629 = local627;
																		if (local446) {
																			local629 = local11.gjstr();
																		}
																		local1409 = local11.g1();
																		local6565 = false;
																		if (local1409 <= 1) {
																			if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
																				local6565 = true;
																			} else if (local1409 <= 1 && Static71.method1524(local629)) {
																				local6565 = true;
																			}
																		}
																		if (!local6565 && Static659.anInt9817 == 0) {
																			local1750 = Static130.method2280(Static15.method189(local11));
																			if (local1409 == 2) {
																				Static662.method8625("<img=1>" + local629, "<img=1>" + local627, -1, local1750, (String) null, 0, local627, 24);
																			} else if (local1409 == 1) {
																				Static662.method8625("<img=0>" + local629, "<img=0>" + local627, -1, local1750, (String) null, 0, local627, 24);
																			} else {
																				Static662.method8625(local629, local627, -1, local1750, (String) null, 0, local627, 24);
																			}
																		}
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (Static629.aClass225_228 == arg0.aClass225_93) {
																		local277 = local11.g2();
																		local627 = local11.gjstr();
																		local2080 = local11.g1() == 1;
																		Static718.aBoolean823 = local2080;
																		Static459.aClass229_2 = Static344.aClass229_1;
																		Static430.method5817(local277, local627);
																		Static81.method1586(15);
																		arg0.aClass225_93 = null;
																		return false;
																	} else if (arg0.aClass225_93 == Static370.aClass225_152) {
																		if (Static377.anInt5930 != -1) {
																			Static145.method2411(0, Static377.anInt5930);
																		}
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (arg0.aClass225_93 == Static411.aClass225_164) {
																		Static251.anInt4036 = 1;
																		Static344.anInt5621 = Static642.anInt9599;
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (arg0.aClass225_93 == Static384.aClass225_156) {
																		Static39.anInt949 = Static642.anInt9599;
																		local446 = local11.g1() == 1;
																		if (arg0.anInt3648 != 1) {
																			if (local446) {
																				Static45.aClass2_Sub47_1 = new Class2_Sub47(local11);
																			} else {
																				Static674.aClass2_Sub47_3 = new Class2_Sub47(local11);
																			}
																			arg0.aClass225_93 = null;
																			return true;
																		}
																		if (local446) {
																			Static45.aClass2_Sub47_1 = null;
																		} else {
																			Static674.aClass2_Sub47_3 = null;
																		}
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (Static446.aClass225_170 == arg0.aClass225_93) {
																		Static626.anInt9476 = local11.g1b_alt2() << 3;
																		Static87.anInt1810 = local11.g1_alt1();
																		Static270.anInt4354 = local11.g1b() << 3;
																		while (local11.pos < arg0.anInt3648) {
																			@Pc(6873) Class287 local6873 = Static559.method7419()[local11.g1()];
																			Static605.method7912(local6873);
																		}
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (Static651.aClass225_235 == arg0.aClass225_93) {
																		Static434.method5855();
																		arg0.aClass225_93 = null;
																		return false;
																	} else if (arg0.aClass225_93 == Static41.aClass225_20) {
																		local277 = local11.g4_alt3();
																		local100 = local277 >> 28 & 0x3;
																		local526 = local277 >> 14 & 0x3FFF;
																		local1409 = local277 & 0x3FFF;
																		local1413 = local11.g2_alt2();
																		if (local1413 == 65535) {
																			local1413 = -1;
																		}
																		local2098 = local11.g1_alt3();
																		local992 = local2098 >> 2;
																		local996 = local2098 & 0x3;
																		local1449 = Static310.anIntArray379[local992];
																		local1409 -= Static116.anInt2270;
																		local526 -= Static691.anInt10367;
																		Static198.method2953(local100, local1409, local992, local1413, local526, local996, local1449);
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (Static706.aClass225_255 == arg0.aClass225_93) {
																		local277 = local11.g1();
																		local892 = (local277 & 0x1) == 1;
																		local629 = local11.gjstr();
																		local4175 = local11.gjstr();
																		if (local4175.equals("")) {
																			local4175 = local629;
																		}
																		local4177 = local11.gjstr();
																		local1750 = local11.gjstr();
																		if (local1750.equals("")) {
																			local1750 = local4177;
																		}
																		if (local892) {
																			for (local992 = 0; local992 < Static436.anInt3849; local992++) {
																				if (Static446.aStringArray35[local992].equals(local1750)) {
																					Static632.aStringArray44[local992] = local629;
																					Static446.aStringArray35[local992] = local4175;
																					Static10.aStringArray1[local992] = local4177;
																					Static316.aStringArray41[local992] = local1750;
																					break;
																				}
																			}
																		} else {
																			Static632.aStringArray44[Static436.anInt3849] = local629;
																			Static446.aStringArray35[Static436.anInt3849] = local4175;
																			Static10.aStringArray1[Static436.anInt3849] = local4177;
																			Static316.aStringArray41[Static436.anInt3849] = local1750;
																			Static65.aBooleanArray2[Static436.anInt3849] = (local277 & 0x2) == 2;
																			Static436.anInt3849++;
																		}
																		Static344.anInt5621 = Static642.anInt9599;
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (Static331.aClass225_138 == arg0.aClass225_93) {
																		local277 = local11.g4_alt2();
																		if (local277 != Static435.anInt6594) {
																			Static435.anInt6594 = local277;
																			Static472.method6429(Static362.aClass242_10, -1, -1);
																		}
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (Static550.aClass225_200 == arg0.aClass225_93) {
																		local446 = local11.g1() == 1;
																		local627 = local11.gjstr();
																		local629 = local627;
																		if (local446) {
																			local629 = local11.gjstr();
																		}
																		local1409 = local11.g1();
																		local1413 = local11.g2();
																		local1425 = false;
																		if (local1409 <= 1 && Static71.method1524(local629)) {
																			local1425 = true;
																		}
																		if (!local1425 && Static659.anInt9817 == 0) {
																			local1427 = Static288.aClass139_2.method2950(local1413).method3903(local11);
																			if (local1409 == 2) {
																				Static662.method8625("<img=1>" + local629, "<img=1>" + local627, local1413, local1427, (String) null, 0, local627, 25);
																			} else if (local1409 == 1) {
																				Static662.method8625("<img=0>" + local629, "<img=0>" + local627, local1413, local1427, (String) null, 0, local627, 25);
																			} else {
																				Static662.method8625(local629, local627, local1413, local1427, (String) null, 0, local627, 25);
																			}
																		}
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (arg0.aClass225_93 == Static287.aClass225_119) {
																		local277 = local11.g4();
																		local100 = local11.g4();
																		@Pc(7309) Class2_Sub19 local7309 = method4335(Static128.aClass345_106, arg0.aIsaacRandom_1);
																		local7309.aPacketBit_1.p4(local277);
																		local7309.aPacketBit_1.p4(local100);
																		arg0.method3275(local7309);
																		arg0.aClass225_93 = null;
																		return true;
																	} else if (arg0.aClass225_93 == Static84.aClass225_36) {
																		Static605.method7912(Static450.aClass287_14);
																		arg0.aClass225_93 = null;
																		return true;
																	} else {
																		@Pc(7394) Class241 local7394;
																		if (arg0.aClass225_93 == Static137.aClass225_57) {
																			local1937 = local11.gjstr();
																			local2080 = local11.g1() == 1;
																			if (local2080) {
																				local627 = local11.gjstr();
																			} else {
																				local627 = local1937;
																			}
																			local1409 = local11.g2();
																			@Pc(7377) byte local7377 = local11.g1b();
																			local1425 = false;
																			if (local7377 == -128) {
																				local1425 = true;
																			}
																			if (local1425) {
																				if (Static706.anInt10633 == 0) {
																					arg0.aClass225_93 = null;
																					return true;
																				}
																				for (local992 = 0; Static706.anInt10633 > local992 && (!Static87.aClass241Array1[local992].aString66.equals(local627) || local1409 != Static87.aClass241Array1[local992].anInt6148); local992++) {
																				}
																				if (local992 < Static706.anInt10633) {
																					while (Static706.anInt10633 - 1 > local992) {
																						Static87.aClass241Array1[local992] = Static87.aClass241Array1[local992 + 1];
																						local992++;
																					}
																					Static706.anInt10633--;
																					Static87.aClass241Array1[Static706.anInt10633] = null;
																				}
																			} else {
																				local1427 = local11.gjstr();
																				local7394 = new Class241();
																				local7394.aString67 = local1937;
																				local7394.aString66 = local627;
																				local7394.aString68 = Static390.method5492(local7394.aString66);
																				local7394.anInt6148 = local1409;
																				local7394.aString65 = local1427;
																				local7394.aByte99 = local7377;
																				for (local1449 = Static706.anInt10633 - 1; local1449 >= 0; local1449--) {
																					local653 = Static87.aClass241Array1[local1449].aString68.compareTo(local7394.aString68);
																					if (local653 == 0) {
																						Static87.aClass241Array1[local1449].anInt6148 = local1409;
																						Static87.aClass241Array1[local1449].aByte99 = local7377;
																						Static87.aClass241Array1[local1449].aString65 = local1427;
																						if (local627.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
																							Static682.aByte142 = local7377;
																						}
																						Static352.anInt5754 = Static642.anInt9599;
																						arg0.aClass225_93 = null;
																						return true;
																					}
																					if (local653 < 0) {
																						break;
																					}
																				}
																				if (Static87.aClass241Array1.length <= Static706.anInt10633) {
																					arg0.aClass225_93 = null;
																					return true;
																				}
																				for (local653 = Static706.anInt10633 - 1; local653 > local1449; local653--) {
																					Static87.aClass241Array1[local653 + 1] = Static87.aClass241Array1[local653];
																				}
																				if (Static706.anInt10633 == 0) {
																					Static87.aClass241Array1 = new Class241[100];
																				}
																				Static87.aClass241Array1[local1449 + 1] = local7394;
																				Static706.anInt10633++;
																				if (local627.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
																					Static682.aByte142 = local7377;
																				}
																			}
																			Static352.anInt5754 = Static642.anInt9599;
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static25.aClass225_11) {
																			local277 = local11.g2();
																			local100 = local11.g4();
																			if (Static279.anObjectArray35 == null) {
																				Static279.anObjectArray35 = new Object[Static628.aClass342_5.anInt8769];
																			}
																			Static279.anObjectArray35[local277] = Integer.valueOf(local100);
																			Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (Static132.aClass225_54 == arg0.aClass225_93) {
																			local277 = local11.g2();
																			@Pc(7724) Class8_Sub2_Sub1_Sub2_Sub1 local7724;
																			if (local277 == Static312.anInt5000) {
																				local7724 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
																			} else {
																				local7724 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local277];
																			}
																			if (local7724 == null) {
																				arg0.aClass225_93 = null;
																				return true;
																			}
																			local526 = local11.g2();
																			local1409 = local11.g1();
																			local6565 = (local526 & 0x8000) != 0;
																			if (local7724.aString9 != null && local7724.aClass201_1 != null) {
																				local1425 = false;
																				if (local1409 <= 1) {
																					if (!local6565 && (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724)) {
																						local1425 = true;
																					} else if (Static71.method1524(local7724.aString9)) {
																						local1425 = true;
																					}
																				}
																				if (!local1425 && Static659.anInt9817 == 0) {
																					local996 = -1;
																					if (local6565) {
																						local526 &= 0x7FFF;
																						@Pc(7827) Class21 local7827 = Static260.method3828(local11);
																						local996 = local7827.anInt521;
																						local1427 = local7827.aClass2_Sub2_Sub12_1.method3903(local11);
																					} else {
																						local1427 = Static130.method2280(Static15.method189(local11));
																					}
																					local7724.method1413(local526 >> 8, local526 & 0xFF, local1427.trim());
																					if (local1409 == 1 || local1409 == 2) {
																						local1449 = local6565 ? 17 : 1;
																					} else {
																						local1449 = local6565 ? 17 : 2;
																					}
																					if (local1409 == 2) {
																						Static662.method8625("<img=1>" + local7724.method1422(), "<img=1>" + local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
																					} else if (local1409 == 1) {
																						Static662.method8625("<img=0>" + local7724.method1422(), "<img=0>" + local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
																					} else {
																						Static662.method8625(local7724.method1422(), local7724.method1424(false), local996, local1427, (String) null, 0, local7724.aString8, local1449);
																					}
																				}
																			}
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static19.aClass225_8) {
																			local277 = local11.g2();
																			if (local277 == 65535) {
																				local277 = -1;
																			}
																			local100 = local11.g1();
																			local526 = local11.g2();
																			local1409 = local11.g1();
																			local1413 = local11.g2();
																			Static161.method2586(local1413, local526, local277, local100, local1409);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (Static590.aClass225_217 == arg0.aClass225_93) {
																			arg0.aClass225_93 = null;
																			return false;
																		} else if (Static155.aClass225_60 == arg0.aClass225_93) {
																			local277 = local11.ig2();
																			if (local277 == 65535) {
																				local277 = -1;
																			}
																			local100 = local11.g4_alt3();
																			local526 = local11.g2_alt2();
																			if (local526 == 65535) {
																				local526 = -1;
																			}
																			local1409 = local11.g4_alt1();
																			Static574.method7573();
																			for (local1413 = local277; local1413 <= local526; local1413++) {
																				local644 = (long) local1413 + ((long) local100 << 32);
																				local4597 = (Class2_Sub41) Static291.aClass28_24.method738(local644);
																				if (local4597 != null) {
																					local4611 = new Class2_Sub41(local1409, local4597.anInt6904);
																					local4597.method9457();
																				} else if (local1413 == -1) {
																					local4611 = new Class2_Sub41(local1409, Static145.method2412(local100).aClass2_Sub41_2.anInt6904);
																				} else {
																					local4611 = new Class2_Sub41(local1409, -1);
																				}
																				Static291.aClass28_24.method735(local644, local4611);
																			}
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static85.aClass225_257) {
																			local277 = local11.g2();
																			local100 = local11.g4();
																			local526 = local11.g2();
																			local1409 = local11.g1_alt3();
																			Static574.method7573();
																			Static167.method2630(local526, local1409, local100, local277);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static157.aClass225_61) {
																			Static626.anInt9476 = local11.g1b_alt1() << 3;
																			Static270.anInt4354 = local11.g1b() << 3;
																			Static87.anInt1810 = local11.g1_alt3();
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (Static18.aClass225_7 == arg0.aClass225_93) {
																			Static605.method7912(Static18.aClass287_2);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (Static207.aClass225_127 == arg0.aClass225_93) {
																			local277 = local11.g2s_alt3();
																			local100 = local11.g4_alt2();
																			Static574.method7573();
																			Static147.method2420(local100, local277);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (Static707.aClass225_256 == arg0.aClass225_93) {
																			local277 = local11.g2_alt3();
																			local100 = local11.g2_alt2();
																			Static574.method7573();
																			Static471.method6408(local100, local277);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (Static404.aClass225_161 == arg0.aClass225_93) {
																			Static106.anInt2153 = local11.g3s();
																			Static389.aBoolean459 = local11.g1() == 1;
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static617.aClass225_224) {
																			local277 = local11.g2_alt3();
																			local931 = local11.g1b_alt3();
																			Static574.method7573();
																			Static540.method6537(local931, local277);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static468.aClass225_212) {
																			local1937 = local11.gjstr();
																			local627 = Static130.method2280(Static15.method189(local11));
																			Static44.method1072(local627, local1937, 0, local1937, local1937, 6);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static353.aClass225_233) {
																			Static400.anInt8102 = Static642.anInt9599;
																			local446 = local11.g1() == 1;
																			@Pc(8376) Class20 local8376 = new Class20(local11);
																			@Pc(8380) Class164 local8380;
																			if (local446) {
																				local8380 = Static128.aClass164_8;
																			} else {
																				local8380 = Static91.aClass164_9;
																			}
																			local8376.method587(local8380);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static109.aClass225_45) {
																			local277 = local11.g4();
																			local627 = local11.gjstr();
																			Static574.method7573();
																			Static211.method4998(local277, local627);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static125.aClass225_53) {
																			local277 = local11.ig2();
																			local100 = local11.g1_alt2();
																			local2080 = (local100 & 0x1) == 1;
																			Static698.method9123(local2080, local277);
																			Static322.anIntArray889[Static451.anInt6851++ & 0x1F] = local277;
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static464.aClass225_176) {
																			Static605.method7912(Static210.aClass287_9);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static269.aClass225_111) {
																			Static346.method5085();
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (Static670.aClass225_245 == arg0.aClass225_93) {
																			local277 = local11.g1_alt3();
																			local100 = local11.g1_alt2();
																			local526 = local11.g1_alt2();
																			local1409 = local11.g1_alt2();
																			local1413 = local11.g2_alt3() << 2;
																			Static574.method7573();
																			Static319.method4595(local526, true, local1409, local1413, local100, local277);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static451.aClass225_171) {
																			Static352.anInt5754 = Static642.anInt9599;
																			if (arg0.anInt3648 == 0) {
																				arg0.aClass225_93 = null;
																				Static706.anInt10633 = 0;
																				Static87.aClass241Array1 = null;
																				Static723.aString129 = null;
																				Static158.aString28 = null;
																				return true;
																			}
																			Static158.aString28 = local11.gjstr();
																			local446 = local11.g1() == 1;
																			if (local446) {
																				local11.gjstr();
																			}
																			local4669 = local11.g8();
																			Static723.aString129 = Static287.method4154(local4669);
																			Static673.aByte140 = local11.g1b();
																			local1409 = local11.g1();
																			if (local1409 == 255) {
																				arg0.aClass225_93 = null;
																				return true;
																			}
																			Static706.anInt10633 = local1409;
																			@Pc(8611) Class241[] local8611 = new Class241[100];
																			for (local2098 = 0; local2098 < Static706.anInt10633; local2098++) {
																				local8611[local2098] = new Class241();
																				local8611[local2098].aString67 = local11.gjstr();
																				local446 = local11.g1() == 1;
																				if (local446) {
																					local8611[local2098].aString66 = local11.gjstr();
																				} else {
																					local8611[local2098].aString66 = local8611[local2098].aString67;
																				}
																				local8611[local2098].aString68 = Static390.method5492(local8611[local2098].aString66);
																				local8611[local2098].anInt6148 = local11.g2();
																				local8611[local2098].aByte99 = local11.g1b();
																				local8611[local2098].aString65 = local11.gjstr();
																				if (local8611[local2098].aString66.equals(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
																					Static682.aByte142 = local8611[local2098].aByte99;
																				}
																			}
																			local1449 = Static706.anInt10633;
																			while (local1449 > 0) {
																				@Pc(8729) boolean local8729 = true;
																				local1449--;
																				for (local653 = 0; local653 < local1449; local653++) {
																					if (local8611[local653].aString68.compareTo(local8611[local653 + 1].aString68) > 0) {
																						local7394 = local8611[local653];
																						local8611[local653] = local8611[local653 + 1];
																						local8611[local653 + 1] = local7394;
																						local8729 = false;
																					}
																				}
																				if (local8729) {
																					break;
																				}
																			}
																			arg0.aClass225_93 = null;
																			Static87.aClass241Array1 = local8611;
																			return true;
																		} else if (Static722.aClass225_260 == arg0.aClass225_93) {
																			Static605.method7912(Static73.aClass287_18);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static215.aClass225_86) {
																			local277 = local11.g1();
																			local100 = local11.g1_alt1();
																			if (local277 == 255) {
																				local100 = -1;
																				local277 = -1;
																			}
																			Static50.method6639(local100, local277);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static211.aClass225_143) {
																			Static605.method7912(Static704.aClass287_17);
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static390.aClass225_158) {
																			local277 = local11.g2();
																			local627 = local11.gjstr();
																			if (Static279.anObjectArray35 == null) {
																				Static279.anObjectArray35 = new Object[Static628.aClass342_5.anInt8769];
																			}
																			Static279.anObjectArray35[local277] = local627;
																			Static265.anIntArray328[Static710.anInt7554++ & 0x1F] = local277;
																			arg0.aClass225_93 = null;
																			return true;
																		} else if (arg0.aClass225_93 == Static616.aClass225_223) {
																			local446 = local11.g1() == 1;
																			local627 = local11.gjstr();
																			local629 = local627;
																			if (local446) {
																				local629 = local11.gjstr();
																			}
																			local639 = local11.g8();
																			local644 = (long) local11.g2();
																			local649 = (long) local11.g3();
																			local653 = local11.g1();
																			@Pc(8945) long local8945 = local649 + (local644 << 32);
																			local4857 = false;
																			local1097 = 0;
																			while (true) {
																				if (local1097 >= 100) {
																					if (local653 <= 1) {
																						if (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean724) {
																							local4857 = true;
																						} else if (Static71.method1524(local629)) {
																							local4857 = true;
																						}
																					}
																					break;
																				}
																				if (Static511.aLongArray17[local1097] == local8945) {
																					local4857 = true;
																					break;
																				}
																				local1097++;
																			}
																			if (!local4857 && Static659.anInt9817 == 0) {
																				Static511.aLongArray17[Static97.anInt2001] = local8945;
																				Static97.anInt2001 = (Static97.anInt2001 + 1) % 100;
																				@Pc(9032) String local9032 = Static130.method2280(Static15.method189(local11));
																				if (local653 == 2 || local653 == 3) {
																					Static662.method8625("<img=1>" + local629, "<img=1>" + local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
																				} else if (local653 == 1) {
																					Static662.method8625("<img=0>" + local629, "<img=0>" + local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
																				} else {
																					Static662.method8625(local629, local627, -1, local9032, Static99.method1977(local639), 0, local627, 9);
																				}
																			}
																			arg0.aClass225_93 = null;
																			return true;
																		} else {
																			Static240.method3496((Throwable) null, "T1 - " + (arg0.aClass225_93 == null ? -1 : arg0.aClass225_93.method5239()) + "," + (arg0.aClass225_94 == null ? -1 : arg0.aClass225_94.method5239()) + "," + (arg0.aClass225_91 == null ? -1 : arg0.aClass225_91.method5239()) + " - " + arg0.anInt3648);
																			Static233.method3409(false);
																			return true;
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
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!ss;Lclient!iv;)Lclient!fk;")
	public static Class2_Sub19 method4335(@OriginalArg(1) Class345 arg0, @OriginalArg(2) IsaacRandom arg1) {
		@Pc(6) Class2_Sub19 local6 = Static119.method2174();
		local6.anInt2986 = arg0.anInt8827;
		local6.aClass345_32 = arg0;
		if (local6.anInt2986 == -1) {
			local6.aPacketBit_1 = new PacketBit(260);
		} else if (local6.anInt2986 == -2) {
			local6.aPacketBit_1 = new PacketBit(10000);
		} else if (local6.anInt2986 <= 18) {
			local6.aPacketBit_1 = new PacketBit(20);
		} else if (local6.anInt2986 <= 98) {
			local6.aPacketBit_1 = new PacketBit(100);
		} else {
			local6.aPacketBit_1 = new PacketBit(260);
		}
		local6.aPacketBit_1.setRandom(arg1);
		local6.aPacketBit_1.p1isaac(local6.aClass345_32.method7826());
		local6.anInt2989 = 0;
		return local6;
	}
}
