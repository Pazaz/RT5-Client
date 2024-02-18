import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "Lclient!av;")
	public Class28 aClass28_8;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "[B")
	public final byte[] aByteArray12;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class2_Sub8(@OriginalArg(0) Packet arg0) {
		arg0.pos = arg0.data.length - 3;
		@Pc(12) int local12 = arg0.g1();
		@Pc(16) int local16 = arg0.g2();
		@Pc(22) int local22 = local12 * 10 + 14;
		arg0.pos = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(46) int local46;
		@Pc(50) int local50;
		for (@Pc(43) int local43 = 0; local43 < local12; local43++) {
			local46 = -1;
			while (true) {
				local50 = arg0.g1();
				if (local50 != local46) {
					local22++;
				}
				local46 = local50 & 0xF;
				if (local50 == 7) {
					break;
				}
				if (local50 == 23) {
					local27++;
				} else if (local46 == 0) {
					local31++;
				} else if (local46 == 1) {
					local33++;
				} else if (local46 == 2) {
					local29++;
				} else if (local46 == 3) {
					local35++;
				} else if (local46 == 4) {
					local37++;
				} else if (local46 == 5) {
					local39++;
				} else if (local46 == 6) {
					local41++;
				} else {
					throw new RuntimeException();
				}
			}
		}
		local22 += local27 * 5;
		local22 += (local31 + local33 + local29 + local35 + local39) * 2;
		local22 += local37 + local41;
		local46 = arg0.pos;
		local50 = local12 + local27 + local29 + local31 + local33 + local35 + local37 + local39 + local41;
		for (@Pc(169) int local169 = 0; local169 < local50; local169++) {
			arg0.gVarInt();
		}
		local22 += arg0.pos - local46;
		@Pc(188) int local188 = arg0.pos;
		@Pc(190) int local190 = 0;
		@Pc(192) int local192 = 0;
		@Pc(194) int local194 = 0;
		@Pc(196) int local196 = 0;
		@Pc(198) int local198 = 0;
		@Pc(200) int local200 = 0;
		@Pc(202) int local202 = 0;
		@Pc(204) int local204 = 0;
		@Pc(206) int local206 = 0;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		for (@Pc(216) int local216 = 0; local216 < local29; local216++) {
			local214 = local214 + arg0.g1() & 0x7F;
			if (local214 == 0 || local214 == 32) {
				local41++;
			} else if (local214 == 1) {
				local190++;
			} else if (local214 == 33) {
				local192++;
			} else if (local214 == 7) {
				local194++;
			} else if (local214 == 39) {
				local196++;
			} else if (local214 == 10) {
				local198++;
			} else if (local214 == 42) {
				local200++;
			} else if (local214 == 99) {
				local202++;
			} else if (local214 == 98) {
				local204++;
			} else if (local214 == 101) {
				local206++;
			} else if (local214 == 100) {
				local208++;
			} else if (local214 == 64 || local214 == 65 || local214 == 120 || local214 == 121 || local214 == 123) {
				local210++;
			} else {
				local212++;
			}
		}
		@Pc(328) int local328 = 0;
		@Pc(331) int local331 = arg0.pos;
		arg0.pos += local210;
		@Pc(340) int local340 = arg0.pos;
		arg0.pos += local39;
		@Pc(349) int local349 = arg0.pos;
		arg0.pos += local37;
		@Pc(358) int local358 = arg0.pos;
		arg0.pos += local35;
		@Pc(367) int local367 = arg0.pos;
		arg0.pos += local190;
		@Pc(376) int local376 = arg0.pos;
		arg0.pos += local194;
		@Pc(385) int local385 = arg0.pos;
		arg0.pos += local198;
		@Pc(394) int local394 = arg0.pos;
		arg0.pos += local31 + local33 + local39;
		@Pc(407) int local407 = arg0.pos;
		arg0.pos += local31;
		@Pc(416) int local416 = arg0.pos;
		arg0.pos += local212;
		@Pc(425) int local425 = arg0.pos;
		arg0.pos += local33;
		@Pc(434) int local434 = arg0.pos;
		arg0.pos += local192;
		@Pc(443) int local443 = arg0.pos;
		arg0.pos += local196;
		@Pc(452) int local452 = arg0.pos;
		arg0.pos += local200;
		@Pc(461) int local461 = arg0.pos;
		arg0.pos += local41;
		@Pc(470) int local470 = arg0.pos;
		arg0.pos += local35;
		@Pc(479) int local479 = arg0.pos;
		arg0.pos += local202;
		@Pc(488) int local488 = arg0.pos;
		arg0.pos += local204;
		@Pc(497) int local497 = arg0.pos;
		arg0.pos += local206;
		@Pc(506) int local506 = arg0.pos;
		arg0.pos += local208;
		@Pc(515) int local515 = arg0.pos;
		arg0.pos += local27 * 3;
		this.aByteArray12 = new byte[local22];
		@Pc(533) Packet local533 = new Packet(this.aByteArray12);
		local533.p4(1297377380);
		local533.p4(6);
		local533.p2(local12 > 1 ? 1 : 0);
		local533.p2(local12);
		local533.p2(local16);
		arg0.pos = local46;
		@Pc(564) int local564 = 0;
		@Pc(566) int local566 = 0;
		@Pc(568) int local568 = 0;
		@Pc(570) int local570 = 0;
		@Pc(572) int local572 = 0;
		@Pc(574) int local574 = 0;
		@Pc(576) int local576 = 0;
		@Pc(579) int[] local579 = new int[128];
		local214 = 0;
		label220: for (@Pc(583) int local583 = 0; local583 < local12; local583++) {
			local533.p4(1297379947);
			local533.pos += 4;
			@Pc(597) int local597 = local533.pos;
			@Pc(599) int local599 = -1;
			while (true) {
				while (true) {
					@Pc(603) int local603 = arg0.gVarInt();
					local533.pVarInt(local603);
					@Pc(615) int local615 = arg0.data[local328++] & 0xFF;
					@Pc(623) boolean local623 = local615 != local599;
					local599 = local615 & 0xF;
					if (local615 == 7) {
						if (local623) {
							local533.p1(255);
						}
						local533.p1(47);
						local533.p1(0);
						local533.psize4(local533.pos - local597);
						continue label220;
					}
					if (local615 == 23) {
						if (local623) {
							local533.p1(255);
						}
						local533.p1(81);
						local533.p1(3);
						local533.p1(arg0.data[local515++]);
						local533.p1(arg0.data[local515++]);
						local533.p1(arg0.data[local515++]);
					} else {
						local564 ^= local615 >> 4;
						if (local599 == 0) {
							if (local623) {
								local533.p1(local564 + 144);
							}
							local566 += arg0.data[local394++];
							local568 += arg0.data[local407++];
							local533.p1(local566 & 0x7F);
							local533.p1(local568 & 0x7F);
						} else if (local599 == 1) {
							if (local623) {
								local533.p1(local564 + 128);
							}
							local566 += arg0.data[local394++];
							local570 += arg0.data[local425++];
							local533.p1(local566 & 0x7F);
							local533.p1(local570 & 0x7F);
						} else if (local599 == 2) {
							if (local623) {
								local533.p1(local564 + 176);
							}
							local214 = local214 + arg0.data[local188++] & 0x7F;
							local533.p1(local214);
							@Pc(830) byte local830;
							if (local214 == 0 || local214 == 32) {
								local830 = arg0.data[local461++];
							} else if (local214 == 1) {
								local830 = arg0.data[local367++];
							} else if (local214 == 33) {
								local830 = arg0.data[local434++];
							} else if (local214 == 7) {
								local830 = arg0.data[local376++];
							} else if (local214 == 39) {
								local830 = arg0.data[local443++];
							} else if (local214 == 10) {
								local830 = arg0.data[local385++];
							} else if (local214 == 42) {
								local830 = arg0.data[local452++];
							} else if (local214 == 99) {
								local830 = arg0.data[local479++];
							} else if (local214 == 98) {
								local830 = arg0.data[local488++];
							} else if (local214 == 101) {
								local830 = arg0.data[local497++];
							} else if (local214 == 100) {
								local830 = arg0.data[local506++];
							} else if (local214 == 64 || local214 == 65 || local214 == 120 || local214 == 121 || local214 == 123) {
								local830 = arg0.data[local331++];
							} else {
								local830 = arg0.data[local416++];
							}
							@Pc(973) int local973 = local830 + local579[local214];
							local579[local214] = local973;
							local533.p1(local973 & 0x7F);
						} else if (local599 == 3) {
							if (local623) {
								local533.p1(local564 + 224);
							}
							local572 += arg0.data[local470++];
							local572 += arg0.data[local358++] << 7;
							local533.p1(local572 & 0x7F);
							local533.p1(local572 >> 7 & 0x7F);
						} else if (local599 == 4) {
							if (local623) {
								local533.p1(local564 + 208);
							}
							local574 += arg0.data[local349++];
							local533.p1(local574 & 0x7F);
						} else if (local599 == 5) {
							if (local623) {
								local533.p1(local564 + 160);
							}
							local566 += arg0.data[local394++];
							local576 += arg0.data[local340++];
							local533.p1(local566 & 0x7F);
							local533.p1(local576 & 0x7F);
						} else if (local599 == 6) {
							if (local623) {
								local533.p1(local564 + 192);
							}
							local533.p1(arg0.data[local461++]);
						} else {
							throw new RuntimeException();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "()V")
	public void method1154() {
		if (this.aClass28_8 != null) {
			return;
		}
		this.aClass28_8 = new Class28(16);
		@Pc(13) int[] local13 = new int[16];
		@Pc(16) int[] local16 = new int[16];
		local13[9] = local16[9] = 128;
		@Pc(30) Class40 local30 = new Class40(this.aByteArray12);
		@Pc(33) int local33 = local30.method1070();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			local30.method1063(local35);
			local30.method1069(local35);
			local30.method1058(local35);
		}
		label53: do {
			while (true) {
				@Pc(52) int local52 = local30.method1062();
				@Pc(57) int local57 = local30.anIntArray70[local52];
				while (local30.anIntArray70[local52] == local57) {
					local30.method1063(local52);
					@Pc(65) int local65 = local30.method1057(local52);
					if (local65 == 1) {
						local30.method1064();
						local30.method1058(local52);
						continue label53;
					}
					@Pc(84) int local84 = local65 & 0xF0;
					@Pc(91) int local91;
					@Pc(97) int local97;
					@Pc(103) int local103;
					if (local84 == 176) {
						local91 = local65 & 0xF;
						local97 = local65 >> 8 & 0x7F;
						local103 = local65 >> 16 & 0x7F;
						if (local97 == 0) {
							local13[local91] = (local13[local91] & 0xFFE03FFF) + (local103 << 14);
						}
						if (local97 == 32) {
							local13[local91] = (local13[local91] & 0xFFFFC07F) + (local103 << 7);
						}
					}
					if (local84 == 192) {
						local91 = local65 & 0xF;
						local97 = local65 >> 8 & 0x7F;
						local16[local91] = local13[local91] + local97;
					}
					if (local84 == 144) {
						local91 = local65 & 0xF;
						local97 = local65 >> 8 & 0x7F;
						local103 = local65 >> 16 & 0x7F;
						if (local103 > 0) {
							@Pc(182) int local182 = local16[local91];
							@Pc(190) Class2_Sub55 local190 = (Class2_Sub55) this.aClass28_8.method738((long) local182);
							if (local190 == null) {
								local190 = new Class2_Sub55(new byte[128]);
								this.aClass28_8.method735((long) local182, local190);
							}
							local190.aByteArray105[local97] = 1;
						}
					}
					local30.method1069(local52);
					local30.method1058(local52);
				}
			}
		} while (!local30.method1068());
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
	public void method1155() {
		this.aClass28_8 = null;
	}
}
