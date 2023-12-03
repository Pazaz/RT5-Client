import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.math.BigInteger;

public class Protocol {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!qg;")
	public static final Packet outboundBuffer = new Packet(5000);
	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger MODULUS = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger EXPONENT = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!qg;")
	public static final Packet inboundBuffer = new Packet(5000);
	@OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
	public static final int[] removedIds = new int[1000];
	@OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
	public static final int[] extendedIds = new int[250];
	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!bt;")
	public static final Buffer playerAppearanceBuffer = new Buffer(new byte[5000]);

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!cc;")
	public static PrivilegedRequest socketRequest = null;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!cc;")
	public static PrivilegedRequest socketRequest2;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!iu;")
	public static BufferedSocket socket;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
	public static int verifyId = 0;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!h;")
	public static ServerProt packet = null;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public static int packetSize = 0;
	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	public static int totalRead;
	@OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
	public static boolean aBoolean129 = true;
	@OriginalMember(owner = "client!dr", name = "O", descriptor = "Lclient!h;")
	public static ServerProt packet2;
	@OriginalMember(owner = "client!th", name = "F", descriptor = "Lclient!h;")
	public static ServerProt packet1;
	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!h;")
	public static ServerProt packet3;
	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	public static int removedCount = 0;
	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public static int extendedCount = 0;
	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!iu;")
	public static BufferedSocket aClass111_2;
	@OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
	public static int anInt1870 = 0;
	@OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
	public static int zoneX;
	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public static int zoneZ;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
	public static boolean readPacketInternal() throws IOException {
		if (socket == null) {
			return false;
		}
		@Pc(15) int available = socket.available();
		if (available == 0) {
			return false;
		}
		@Pc(74) int local74;
		if (packet == null) {
			if (aBoolean129) {
				available--;
				socket.read(inboundBuffer.data, 1, 0);
				totalRead++;
				aBoolean129 = false;
			}
			inboundBuffer.pos = 0;
			if (inboundBuffer.peek1isaac()) {
				if (available == 0) {
					return false;
				}
				socket.read(inboundBuffer.data, 1, 1);
				available--;
				totalRead++;
			}
			aBoolean129 = true;
			@Pc(70) ServerProt[] incoming = ServerProt.getAll();
			local74 = inboundBuffer.g1isaac();
			if (local74 < 0 || incoming.length <= local74) {
				throw new IOException("invo:" + local74);
			}
			packet = incoming[local74];
			packetSize = packet.size;
		}
		if (packetSize == -1) {
			if (available <= 0) {
				return false;
			}
			socket.read(inboundBuffer.data, 1, 0);
			totalRead++;
			packetSize = inboundBuffer.data[0] & 0xFF;
			available--;
		}
		if (packetSize == -2) {
			if (available <= 1) {
				return false;
			}
			socket.read(inboundBuffer.data, 2, 0);
			inboundBuffer.pos = 0;
			available -= 2;
			packetSize = inboundBuffer.g2();
			totalRead += 2;
		}
		if (packetSize > available) {
			return false;
		}
		inboundBuffer.pos = 0;
		socket.read(inboundBuffer.data, packetSize, 0);
		LoginManager.anInt4955 = 0;
		packet3 = packet2;
		totalRead += packetSize;
		packet2 = packet1;
		packet1 = packet;
		if (ServerProt.REFLECTION_CHEAT_CHECK == packet) {
			ReflectionCheck.push(GameShell.signlink, packetSize, inboundBuffer);
			packet = null;
			return true;
		} else if (packet == ServerProt.PACKET_75) {
			VarpDomain.instance.method5781();
			packet = null;
			VarpDomain.updatedVarpsWriterIndex += 32;
			return true;
		} else {
			@Pc(228) int local228;
			@Pc(249) int local249;
			@Pc(220) int local220;
			if (packet == ServerProt.IF_OPENTOP) {
				local220 = inboundBuffer.g1();
				local74 = inboundBuffer.ig2();
				local228 = inboundBuffer.ig2();
				if (Static378.method6314(local228)) {
					if (local220 == 2) {
						Static90.method5953();
					}
					Static139.anInt2595 = local74;
					Static160.method2957(local74);
					Static60.method891(false);
					ScriptRunner.method3598(Static139.anInt2595);
					for (local249 = 0; local249 < 100; local249++) {
						Static357.aBooleanArray59[local249] = true;
					}
				}
				packet = null;
				return true;
			}
			@Pc(272) byte local272;
			if (packet == ServerProt.PACKET_48) {
				local272 = inboundBuffer.g1badd();
				local74 = inboundBuffer.g2add();
				local228 = inboundBuffer.ig2add();
				if (Static378.method6314(local74)) {
					Static322.method5481(local228, local272);
				}
				packet = null;
				return true;
			} else if (ServerProt.PACKET_91 == packet) {
				local220 = inboundBuffer.g2();
				if (Static378.method6314(local220)) {
					Camera.reset();
				}
				packet = null;
				return true;
			} else {
				@Pc(344) SubInterface local344;
				if (packet == ServerProt.PACKET_66) {
					local220 = inboundBuffer.mg4();
					local74 = inboundBuffer.mg4();
					local228 = inboundBuffer.ig2();
					if (Static378.method6314(local228)) {
						@Pc(335) SubInterface local335 = (SubInterface) InterfaceList.subInterfaces.get((long) local220);
						local344 = (SubInterface) InterfaceList.subInterfaces.get((long) local74);
						if (local344 != null) {
							Static276.method4655(false, local344, local335 == null || local344.id != local335.id);
						}
						if (local335 != null) {
							local335.unlink();
							InterfaceList.subInterfaces.put(local335, (long) local74);
						}
						@Pc(375) Component local375 = InterfaceList.getComponent(local220);
						if (local375 != null) {
							InterfaceList.redraw(local375);
						}
						local375 = InterfaceList.getComponent(local74);
						if (local375 != null) {
							InterfaceList.redraw(local375);
							DelayedStateChange.setComponentSizeClient(true, local375);
						}
						if (Static139.anInt2595 != -1) {
							Static392.method6460(Static139.anInt2595, 1);
						}
					}
					packet = null;
					return true;
				} else if (ServerProt.PACKET_82 == packet) {
					if (Static139.anInt2595 != -1) {
						Static392.method6460(Static139.anInt2595, 0);
					}
					packet = null;
					return true;
				} else if (packet == ServerProt.PACKET_30) {
					local220 = inboundBuffer.g2();
					if (Static378.method6314(local220)) {
						Camera.smoothReset();
					}
					packet = null;
					return true;
				} else {
					@Pc(452) String local452;
					@Pc(444) String local444;
					if (ServerProt.PACKET_76 == packet) {
						local444 = inboundBuffer.gjstr();
						local452 = StringUtils.escape(Static308.method5276(inboundBuffer));
						Static33.method4200(local444, 0, local452, 6, local444);
						packet = null;
						return true;
					}
					@Pc(506) int local506;
					@Pc(512) int local512;
					@Pc(536) int local536;
					@Pc(542) int local542;
					@Pc(638) int local638;
					@Pc(497) int local497;
					@Pc(604) boolean local604;
					if (ServerProt.PACKET_0 == packet) {
						local220 = inboundBuffer.g2add();
						local74 = inboundBuffer.g2add();
						local228 = inboundBuffer.g4();
						local249 = inboundBuffer.ig2();
						if (local228 >> 30 == 0) {
							@Pc(621) SpotAnimType local621;
							@Pc(692) Class157 local692;
							@Pc(684) Class157 local684;
							@Pc(667) SpotAnimType local667;
							@Pc(635) Class157 local635;
							if (local228 >> 29 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(790) Npc local790 = NpcList.npcs[local497];
								if (local790 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local790.anInt4594 != -1) {
										if (local790.anInt4594 == local220) {
											local621 = client.SpotAnimTypes.method5407(local220);
											if (local621.aBoolean177 && local621.anInt2448 != -1) {
												local635 = client.SeqTypes.method2371(local621.anInt2448);
												local638 = local635.anInt4022;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = client.SpotAnimTypes.method5407(local220);
											local667 = client.SpotAnimTypes.method5407(local790.anInt4594);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = client.SeqTypes.method2371(local621.anInt2448);
												local692 = client.SeqTypes.method2371(local667.anInt2448);
												if (local692.anInt4023 > local684.anInt4023) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local790.anInt4594 = local220;
										local790.anInt4620 = 0;
										local790.anInt4582 = 0;
										local790.anInt4595 = local74 + client.cycle;
										local790.anInt4639 = local249;
										local790.anInt4612 = 1;
										if (client.cycle < local790.anInt4595) {
											local790.anInt4582 = -1;
										}
										if (local790.anInt4594 != -1 && local790.anInt4595 == client.cycle) {
											local536 = client.SpotAnimTypes.method5407(local790.anInt4594).anInt2448;
											if (local536 != -1) {
												local635 = client.SeqTypes.method2371(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, false, local790.plane, local790.xFine, local790.zFine, 0);
												}
											}
										}
									}
								}
							} else if (local228 >> 28 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(589) Player local589;
								if (PlayerList.selfId == local497) {
									local589 = PlayerList.self;
								} else {
									local589 = PlayerList.players[local497];
								}
								if (local589 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local589.anInt4594 != -1) {
										if (local220 == local589.anInt4594) {
											local621 = client.SpotAnimTypes.method5407(local220);
											if (local621.aBoolean177 && local621.anInt2448 != -1) {
												local635 = client.SeqTypes.method2371(local621.anInt2448);
												local638 = local635.anInt4022;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = client.SpotAnimTypes.method5407(local220);
											local667 = client.SpotAnimTypes.method5407(local589.anInt4594);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = client.SeqTypes.method2371(local621.anInt2448);
												local692 = client.SeqTypes.method2371(local667.anInt2448);
												if (local692.anInt4023 > local684.anInt4023) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local589.anInt4620 = 0;
										local589.anInt4582 = 0;
										local589.anInt4612 = 1;
										local589.anInt4639 = local249;
										local589.anInt4594 = local220;
										local589.anInt4595 = local74 + client.cycle;
										if (local589.anInt4594 == 65535) {
											local589.anInt4594 = -1;
										}
										if (client.cycle < local589.anInt4595) {
											local589.anInt4582 = -1;
										}
										if (local589.anInt4594 != -1 && client.cycle == local589.anInt4595) {
											local536 = client.SpotAnimTypes.method5407(local589.anInt4594).anInt2448;
											if (local536 != -1) {
												local635 = client.SeqTypes.method2371(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, PlayerList.self == local589, local589.plane, local589.xFine, local589.zFine, 0);
												}
											}
										}
									}
								}
							}
						} else {
							local497 = local228 >> 28 & 0x3;
							local506 = (local228 >> 14 & 0x3FFF) - Camera.originX;
							local512 = (local228 & 0x3FFF) - Camera.originZ;
							if (local506 >= 0 && local512 >= 0 && Static373.buildAreaLimitX > local506 && Static242.buildAreaLimitZ > local512) {
								local536 = local506 * 128 + 64;
								local542 = local512 * 128 + 64;
								@Pc(563) SpotAnim local563 = new SpotAnim(local220, 0, client.cycle, local497, local536, Scene.getTileHeight(local536, local542, local497) - local249, local542, local506, local506, local512, local512);
								Static129.spotAnims.addTail(new SpotAnimNode(local563));
							}
						}
						packet = null;
						return true;
					} else if (ServerProt.PACKET_36 == packet) {
						local220 = inboundBuffer.ig2add();
						local74 = inboundBuffer.img4();
						local228 = inboundBuffer.g2add();
						if (Static378.method6314(local228)) {
							Static7.method6469(local220, local74);
						}
						packet = null;
						return true;
					} else if (ServerProt.PACKET_12 == packet) {
						local220 = inboundBuffer.g2add();
						local74 = inboundBuffer.g1bneg();
						if (Static378.method6314(local220)) {
							Static114.anInt2344 = local74;
						}
						packet = null;
						return true;
					} else if (packet == ServerProt.PLAYER_INFO) {
						readPlayerInfo(inboundBuffer, packetSize);
						packet = null;
						return true;
					} else {
						@Pc(1101) long local1101;
						@Pc(1118) ServerActiveProperties local1118;
						@Pc(1109) ServerActiveProperties local1109;
						if (packet == ServerProt.PACKET_77) {
							local220 = inboundBuffer.g2();
							if (local220 == 65535) {
								local220 = -1;
							}
							local74 = inboundBuffer.ig2();
							local228 = inboundBuffer.g2add();
							if (local228 == 65535) {
								local228 = -1;
							}
							local249 = inboundBuffer.g2();
							local497 = inboundBuffer.img4();
							if (Static378.method6314(local249)) {
								for (local506 = local220; local506 <= local228; local506++) {
									local1101 = (long) local506 + ((long) local497 << 32);
									local1109 = (ServerActiveProperties) Static327.aClass4_127.get(local1101);
									if (local1109 != null) {
										local1118 = new ServerActiveProperties(local1109.events, local74);
										local1109.unlink();
									} else if (local506 == -1) {
										local1118 = new ServerActiveProperties(InterfaceList.getComponent(local497).aClass2_Sub10_1.events, local74);
									} else {
										local1118 = new ServerActiveProperties(0, local74);
									}
									Static327.aClass4_127.put(local1118, local1101);
								}
							}
							packet = null;
							return true;
						} else if (packet == ServerProt.PACKET_89) {
							local220 = inboundBuffer.ig4();
							local74 = inboundBuffer.ig2add();
							if (Static378.method6314(local74)) {
								Static190.method3501(-1, -1, 3, local220);
							}
							packet = null;
							return true;
						} else if (ServerProt.IF_OPENSUB == packet) {
							local220 = inboundBuffer.g2add();
							local74 = inboundBuffer.g1sub();
							local228 = inboundBuffer.ig4();
							local249 = inboundBuffer.g2();
							if (Static378.method6314(local220)) {
								local344 = (SubInterface) InterfaceList.subInterfaces.get((long) local228);
								if (local344 != null) {
									Static276.method4655(false, local344, local249 != local344.id);
								}
								Static382.method6365(local228, local74, false, local249);
							}
							packet = null;
							return true;
						} else if (ServerProt.PACKET_20 == packet) {
							local220 = inboundBuffer.g4();
							local74 = inboundBuffer.g1bneg();
							local228 = inboundBuffer.g1sub();
							PlayerSkillXpTable.experience[local74] = local220;
							PlayerSkillXpTable.boostedLevels[local74] = local228;
							PlayerSkillXpTable.baseLevels[local74] = 1;
							local249 = Static287.anIntArray369[local74] - 1;
							for (local497 = 0; local497 < local249; local497++) {
								if (local220 >= PlayerSkillXpTable.xpLevelLookup[local497]) {
									PlayerSkillXpTable.baseLevels[local74] = local497 + 2;
								}
							}
							Static208.anIntArray226[Static381.anInt7117++ & 0x1F] = local74;
							packet = null;
							return true;
						} else if (packet == ServerProt.PACKET_25) {
							local220 = inboundBuffer.g2();
							local74 = inboundBuffer.g1();
							local228 = inboundBuffer.g1();
							local249 = inboundBuffer.g2();
							local497 = inboundBuffer.g1();
							local506 = inboundBuffer.g1();
							if (Static378.method6314(local220)) {
								Camera.moveto(local228, local497, local506, true, local249, local74);
							}
							packet = null;
							return true;
						} else {
							@Pc(1371) boolean local1371;
							@Pc(1381) String local1381;
							@Pc(1627) String local1627;
							@Pc(1391) String local1391;
							@Pc(1663) String local1663;
							if (ServerProt.PACKET_70 == packet) {
								while (inboundBuffer.pos < packetSize) {
									local1371 = inboundBuffer.g1() == 1;
									local452 = inboundBuffer.gjstr();
									local1381 = inboundBuffer.gjstr();
									local249 = inboundBuffer.g2();
									local497 = inboundBuffer.g1();
									local1391 = "";
									local604 = false;
									if (local249 > 0) {
										local1391 = inboundBuffer.gjstr();
										local604 = inboundBuffer.g1() == 1;
									}
									for (local536 = 0; local536 < FriendsList.size; local536++) {
										if (local1371) {
											if (local1381.equals(FriendsList.usernames[local536])) {
												FriendsList.usernames[local536] = local452;
												Static319.aStringArray54[local536] = local1381;
												local452 = null;
												break;
											}
										} else if (local452.equals(FriendsList.usernames[local536])) {
											if (FriendsList.worlds[local536] != local249) {
												FriendsList.worlds[local536] = local249;
												if (local249 > 0) {
													Static33.method4200("", 0, local452 + Static282.aClass79_112.getLocalized(client.language), 5, "");
												}
												if (local249 == 0) {
													Static33.method4200("", 0, local452 + Static359.aClass79_140.getLocalized(client.language), 5, "");
												}
											}
											Static319.aStringArray54[local536] = local1381;
											FriendsList.worldNames[local536] = local1391;
											FriendsList.ranks[local536] = local497;
											local452 = null;
											FriendsList.sameGame[local536] = local604;
											break;
										}
									}
									if (local452 != null && FriendsList.size < 200) {
										FriendsList.usernames[FriendsList.size] = local452;
										Static319.aStringArray54[FriendsList.size] = local1381;
										FriendsList.worlds[FriendsList.size] = local249;
										FriendsList.worldNames[FriendsList.size] = local1391;
										FriendsList.ranks[FriendsList.size] = local497;
										FriendsList.sameGame[FriendsList.size] = local604;
										FriendsList.size++;
									}
								}
								FriendsList.status = 2;
								Static53.anInt3971 = InterfaceList.transmitTimer;
								local74 = FriendsList.size;
								while (local74 > 0) {
									local1371 = true;
									local74--;
									for (local228 = 0; local228 < local74; local228++) {
										if (FriendsList.worlds[local228] != Player.worldId && Player.worldId == FriendsList.worlds[local228 + 1] || FriendsList.worlds[local228] == 0 && FriendsList.worlds[local228 + 1] != 0) {
											local249 = FriendsList.worlds[local228];
											FriendsList.worlds[local228] = FriendsList.worlds[local228 + 1];
											FriendsList.worlds[local228 + 1] = local249;
											local1627 = FriendsList.worldNames[local228];
											FriendsList.worldNames[local228] = FriendsList.worldNames[local228 + 1];
											FriendsList.worldNames[local228 + 1] = local1627;
											local1391 = FriendsList.usernames[local228];
											FriendsList.usernames[local228] = FriendsList.usernames[local228 + 1];
											FriendsList.usernames[local228 + 1] = local1391;
											local1663 = Static319.aStringArray54[local228];
											Static319.aStringArray54[local228] = Static319.aStringArray54[local228 + 1];
											Static319.aStringArray54[local228 + 1] = local1663;
											local536 = FriendsList.ranks[local228];
											FriendsList.ranks[local228] = FriendsList.ranks[local228 + 1];
											FriendsList.ranks[local228 + 1] = local536;
											@Pc(1699) boolean local1699 = FriendsList.sameGame[local228];
											FriendsList.sameGame[local228] = FriendsList.sameGame[local228 + 1];
											local1371 = false;
											FriendsList.sameGame[local228 + 1] = local1699;
										}
									}
									if (local1371) {
										break;
									}
								}
								packet = null;
								return true;
							} else if (packet == ServerProt.PACKET_7) {
								Player.weight = inboundBuffer.g2s();
								InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
								packet = null;
								return true;
							} else {
								@Pc(1780) long local1780;
								@Pc(1785) long local1785;
								if (packet == ServerProt.PACKET_55) {
									local1371 = inboundBuffer.g1() == 1;
									local452 = inboundBuffer.gjstr();
									local1381 = local452;
									if (local1371) {
										local1381 = inboundBuffer.gjstr();
									}
									local1780 = inboundBuffer.g2();
									local1785 = inboundBuffer.ig3();
									local536 = inboundBuffer.g1();
									@Pc(1796) long local1796 = (local1780 << 32) + local1785;
									@Pc(1798) boolean local1798 = false;
									@Pc(1800) int local1800 = 0;
									while (true) {
										if (local1800 >= 100) {
											if (local536 <= 1) {
												if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
													local1798 = true;
												} else if (IgnoreList.contains(local1381)) {
													local1798 = true;
												}
											}
											break;
										}
										if (local1796 == Static358.aLongArray11[local1800]) {
											local1798 = true;
											break;
										}
										local1800++;
									}
									if (!local1798 && Static212.anInt3785 == 0) {
										Static358.aLongArray11[Static193.anInt3555] = local1796;
										Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
										@Pc(1866) String local1866 = StringUtils.escape(Static308.method5276(inboundBuffer));
										if (local536 == 2) {
											Static220.method3874(0, null, local1866, -1, 7, "<img=1>" + local1381, "<img=1>" + local452);
										} else if (local536 == 1) {
											Static220.method3874(0, null, local1866, -1, 7, "<img=0>" + local1381, "<img=0>" + local452);
										} else {
											Static220.method3874(0, null, local1866, -1, 3, local1381, local452);
										}
									}
									packet = null;
									return true;
								} else if (packet == ServerProt.PACKET_43) {
									local444 = inboundBuffer.gjstr();
									local74 = inboundBuffer.g2();
									local1381 = QuickChatPhraseTypeList.get(local74).method5602(inboundBuffer);
									Static220.method3874(0, null, local1381, local74, 19, local444, local444);
									packet = null;
									return true;
								} else if (packet == ServerProt.LOGOUT) {
									LoginManager.logout();
									packet = null;
									return false;
								} else if (packet == ServerProt.PACKET_73) {
									local220 = inboundBuffer.ig2add();
									local74 = inboundBuffer.ig4();
									VarpDomain.instance.method5785(local74, local220);
									packet = null;
									return true;
								} else if (packet == ServerProt.PACKET_5) {
									local220 = inboundBuffer.g2();
									local74 = inboundBuffer.g1();
									local228 = inboundBuffer.g1();
									local249 = inboundBuffer.g2();
									local497 = inboundBuffer.g1();
									local506 = inboundBuffer.g1();
									if (Static378.method6314(local220)) {
										Camera.lookAt(local497, local249, local228, local506, local74);
									}
									packet = null;
									return true;
								} else if (ServerProt.PACKET_17 == packet) {
									local220 = inboundBuffer.g1bneg();
									local74 = inboundBuffer.g1sub();
									if (local220 == 255) {
										local74 = -1;
										local220 = -1;
									}
									Static283.method4875(local220, local74);
									packet = null;
									return true;
								} else if (packet == ServerProt.SOUND_AREA) {
									readZonePacket(ZoneProt.SOUND_AREA);
									packet = null;
									return true;
								} else if (ServerProt.PACKET_97 == packet) {
									local220 = inboundBuffer.ig2add();
									local74 = inboundBuffer.ig4();
									local228 = inboundBuffer.g1sub();
									if (Static378.method6314(local220)) {
										Static17.method4208(local74, local228);
									}
									packet = null;
									return true;
								} else if (ServerProt.PACKET_103 == packet) {
									for (local220 = 0; local220 < PlayerList.players.length; local220++) {
										if (PlayerList.players[local220] != null) {
											PlayerList.players[local220].anInt4597 = -1;
										}
									}
									for (local74 = 0; local74 < NpcList.npcs.length; local74++) {
										if (NpcList.npcs[local74] != null) {
											NpcList.npcs[local74].anInt4597 = -1;
										}
									}
									packet = null;
									return true;
								} else if (ServerProt.UPDATE_REBOOT_TIMER == packet) {
									Player.rebootTimer = inboundBuffer.g2() * 30;
									packet = null;
									InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
									return true;
								} else if (packet == ServerProt.PACKET_92) {
									local220 = inboundBuffer.g2();
									if (local220 == 65535) {
										local220 = -1;
									}
									local74 = inboundBuffer.g1();
									local228 = inboundBuffer.g2();
									local249 = inboundBuffer.g1();
									SoundPlayer.play(local74, local249, local228, local220);
									packet = null;
									return true;
								} else if (ServerProt.PACKET_31 == packet) {
									local220 = inboundBuffer.g4();
									local74 = inboundBuffer.ig2();
									local228 = inboundBuffer.g2add();
									if (Static378.method6314(local74)) {
										Static120.method2383(local228, local220);
									}
									packet = null;
									return true;
								} else if (packet == ServerProt.MAP_PROJANIM_SPECIFIC) {
									readZonePacket(ZoneProt.MAP_PROJANIM_SPECIFIC);
									packet = null;
									return true;
								} else if (ServerProt.LOC_MERGE == packet) {
									readZonePacket(ZoneProt.LOC_MERGE);
									packet = null;
									return true;
								} else if (packet == ServerProt.PACKET_15) {
									local220 = inboundBuffer.ig2add();
									local74 = inboundBuffer.img4();
									local228 = inboundBuffer.g2();
									local249 = inboundBuffer.ig2add();
									if (Static378.method6314(local228)) {
										Static375.method6282(local220 + (local249 << 16), local74);
									}
									packet = null;
									return true;
								} else if (ServerProt.PACKET_24 == packet) {
									local220 = inboundBuffer.g4();
									local74 = inboundBuffer.img4();
									local228 = inboundBuffer.g2add();
									local249 = inboundBuffer.ig2();
									if (Static378.method6314(local228)) {
										Static190.method3501(local249, local74, 5, local220);
									}
									packet = null;
									return true;
								} else {
									@Pc(2522) ClanMember local2522;
									if (packet == ServerProt.PACKET_35) {
										Static285.anInt5370 = InterfaceList.transmitTimer;
										if (packetSize == 0) {
											ClanChat.name = null;
											ClanChat.size = 0;
											ClanChat.owner = null;
											packet = null;
											ClanChat.members = null;
											return true;
										}
										ClanChat.owner = inboundBuffer.gjstr();
										local1371 = inboundBuffer.g1() == 1;
										if (local1371) {
											inboundBuffer.gjstr();
										}
										@Pc(2364) long local2364 = inboundBuffer.g8();
										ClanChat.name = StringUtils.fromBase37(local2364);
										ClanChat.minKick = inboundBuffer.g1b();
										local249 = inboundBuffer.g1();
										if (local249 == 255) {
											packet = null;
											return true;
										}
										ClanChat.size = local249;
										@Pc(2392) ClanMember[] local2392 = new ClanMember[100];
										for (local506 = 0; local506 < ClanChat.size; local506++) {
											local2392[local506] = new ClanMember();
											local2392[local506].username2 = inboundBuffer.gjstr();
											local1371 = inboundBuffer.g1() == 1;
											if (local1371) {
												local2392[local506].username = inboundBuffer.gjstr();
											} else {
												local2392[local506].username = local2392[local506].username2;
											}
											local2392[local506].aString59 = Static135.method2537(local2392[local506].username);
											local2392[local506].world = inboundBuffer.g2();
											local2392[local506].rank = inboundBuffer.g1b();
											local2392[local506].worldName = inboundBuffer.gjstr();
											if (local2392[local506].username.equals(PlayerList.self.username)) {
												ClanChat.rank = local2392[local506].rank;
											}
										}
										local542 = ClanChat.size;
										while (local542 > 0) {
											local542--;
											local604 = true;
											for (local638 = 0; local638 < local542; local638++) {
												if (local2392[local638].aString59.compareTo(local2392[local638 + 1].aString59) > 0) {
													local2522 = local2392[local638];
													local2392[local638] = local2392[local638 + 1];
													local2392[local638 + 1] = local2522;
													local604 = false;
												}
											}
											if (local604) {
												break;
											}
										}
										ClanChat.members = local2392;
										packet = null;
										return true;
									} else if (packet == ServerProt.PACKET_26) {
										inboundBuffer.pos += 28;
										if (inboundBuffer.checkcrc()) {
											Static294.method5065(inboundBuffer, inboundBuffer.pos - 28);
										}
										packet = null;
										return true;
									} else if (ServerProt.PACKET_71 == packet) {
										local220 = inboundBuffer.g1();
										if (inboundBuffer.g1() == 0) {
											StockMarketManager.offers[local220] = new StockMarketOffer();
										} else {
											inboundBuffer.pos--;
											StockMarketManager.offers[local220] = new StockMarketOffer(inboundBuffer);
										}
										packet = null;
										Static177.anInt3381 = InterfaceList.transmitTimer;
										return true;
									} else if (packet == ServerProt.PACKET_10) {
										local220 = inboundBuffer.g2();
										local74 = inboundBuffer.g2();
										local228 = inboundBuffer.g2();
										local249 = inboundBuffer.g2();
										if (Static378.method6314(local220) && Static26.aClass161ArrayArray1[local74] != null) {
											for (local497 = local228; local497 < local249; local497++) {
												local506 = inboundBuffer.ig3();
												if (local497 < Static26.aClass161ArrayArray1[local74].length && Static26.aClass161ArrayArray1[local74][local497] != null) {
													Static26.aClass161ArrayArray1[local74][local497].anInt4246 = local506;
												}
											}
										}
										packet = null;
										return true;
									} else if (ServerProt.LOC_ADD_CHANGE == packet) {
										readZonePacket(ZoneProt.LOC_ADD_CHANGE);
										packet = null;
										return true;
									} else if (packet == ServerProt.OBJ_COUNT) {
										readZonePacket(ZoneProt.OBJ_COUNT);
										packet = null;
										return true;
									} else if (ServerProt.PACKET_40 == packet) {
										Static146.anInt2703 = inboundBuffer.g1();
										packet = null;
										return true;
									} else if (ServerProt.PACKET_23 == packet) {
										local220 = inboundBuffer.g2();
										local74 = inboundBuffer.g1();
										local228 = inboundBuffer.g1();
										local249 = inboundBuffer.g1();
										local497 = inboundBuffer.g1();
										local506 = inboundBuffer.g2();
										if (Static378.method6314(local220)) {
											Static189.aBooleanArray33[local74] = true;
											Static134.anIntArray164[local74] = local228;
											Static105.anIntArray134[local74] = local249;
											Static43.anIntArray87[local74] = local497;
											Static116.anIntArray149[local74] = local506;
										}
										packet = null;
										return true;
									} else if (packet == ServerProt.PACKET_56) {
										if (GameShell.fullScreenFrame != null) {
											DisplayMode.setWindowMode(-1, client.preferences.windowMode, false, -1);
										}
										@Pc(2782) byte[] local2782 = new byte[packetSize];
										inboundBuffer.gisaac(local2782, packetSize);
										local452 = Cp1252Charset.decodeString(0, local2782, packetSize);
										Static280.openUrl(local452, GameShell.signlink, Static77.anInt1762 == 1, true);
										packet = null;
										return true;
									} else if (ServerProt.LOC_PREFETCH == packet) {
										readZonePacket(ZoneProt.LOC_PREFETCH);
										packet = null;
										return true;
									} else if (ServerProt.PACKET_42 == packet) {
										zoneX = inboundBuffer.g1();
										zoneZ = inboundBuffer.g1bneg();
										Player.level = inboundBuffer.g1add();
										for (@Pc(2839) Class2_Sub32 local2839 = (Class2_Sub32) Static120.objStacks.head(); local2839 != null; local2839 = (Class2_Sub32) Static120.objStacks.next()) {
											local74 = (int) (local2839.key & 0x3FFFL);
											local228 = (int) (local2839.key >> 14 & 0x3FFFL);
											local249 = (int) (local2839.key >> 28 & 0x3L);
											if (Player.level == local249 && zoneX <= local74 && zoneX + 8 > local74 && local228 >= zoneZ && local228 < zoneZ + 8) {
												local2839.unlink();
												Static165.sortObjStack(local74, Player.level, local228);
											}
										}
										for (@Pc(2914) ChangeLocRequest local2914 = (ChangeLocRequest) Static207.aClass135_26.head(); local2914 != null; local2914 = (ChangeLocRequest) Static207.aClass135_26.next()) {
											if (local2914.anInt6484 >= zoneX && local2914.anInt6484 < zoneX + 8 && local2914.anInt6486 >= zoneZ && local2914.anInt6486 < zoneZ + 8 && Player.level == local2914.anInt6481) {
												local2914.anInt6485 = 0;
											}
										}
										packet = null;
										return true;
									} else if (packet == ServerProt.PACKET_105) {
										local1371 = inboundBuffer.g1() == 1;
										local452 = inboundBuffer.gjstr();
										local1381 = local452;
										if (local1371) {
											local1381 = inboundBuffer.gjstr();
										}
										local1780 = inboundBuffer.g2();
										local1785 = inboundBuffer.ig3();
										local536 = inboundBuffer.g1();
										local542 = inboundBuffer.g2();
										@Pc(3014) long local3014 = local1785 + (local1780 << 32);
										@Pc(3016) boolean local3016 = false;
										@Pc(3018) int local3018 = 0;
										while (true) {
											if (local3018 >= 100) {
												if (local536 <= 1 && IgnoreList.contains(local1381)) {
													local3016 = true;
												}
												break;
											}
											if (local3014 == Static358.aLongArray11[local3018]) {
												local3016 = true;
												break;
											}
											local3018++;
										}
										if (!local3016 && Static212.anInt3785 == 0) {
											Static358.aLongArray11[Static193.anInt3555] = local3014;
											Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
											@Pc(3071) String local3071 = QuickChatPhraseTypeList.get(local542).method5602(inboundBuffer);
											if (local536 == 2) {
												Static220.method3874(0, null, local3071, local542, 18, "<img=1>" + local1381, "<img=1>" + local452);
											} else if (local536 == 1) {
												Static220.method3874(0, null, local3071, local542, 18, "<img=0>" + local1381, "<img=0>" + local452);
											} else {
												Static220.method3874(0, null, local3071, local542, 18, local1381, local452);
											}
										}
										packet = null;
										return true;
									} else if (packet == ServerProt.PACKET_41) {
										Player.level = inboundBuffer.g1add();
										zoneZ = inboundBuffer.g1bneg();
										zoneX = inboundBuffer.g1sub();
										packet = null;
										return true;
									} else if (ServerProt.PACKET_19 == packet) {
										FriendsList.status = 1;
										Static53.anInt3971 = InterfaceList.transmitTimer;
										packet = null;
										return true;
									} else if (ServerProt.PACKET_38 == packet) {
										local220 = inboundBuffer.img4();
										local74 = inboundBuffer.ig2();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = inboundBuffer.mg4();
										local249 = inboundBuffer.g2add();
										if (local249 == 65535) {
											local249 = -1;
										}
										local497 = inboundBuffer.ig2();
										if (Static378.method6314(local497)) {
											for (local506 = local74; local506 <= local249; local506++) {
												local1101 = ((long) local220 << 32) + ((long) local506);
												local1109 = (ServerActiveProperties) Static327.aClass4_127.get(local1101);
												if (local1109 != null) {
													local1118 = new ServerActiveProperties(local228, local1109.anInt1759);
													local1109.unlink();
												} else if (local506 == -1) {
													local1118 = new ServerActiveProperties(local228, InterfaceList.getComponent(local220).aClass2_Sub10_1.anInt1759);
												} else {
													local1118 = new ServerActiveProperties(local228, -1);
												}
												Static327.aClass4_127.put(local1118, local1101);
											}
										}
										packet = null;
										return true;
									} else if (ServerProt.PACKET_6 == packet) {
										IgnoreList.size = inboundBuffer.g1();
										for (local220 = 0; local220 < IgnoreList.size; local220++) {
											Static226.aStringArray35[local220] = inboundBuffer.gjstr();
											Static234.aStringArray39[local220] = inboundBuffer.gjstr();
											if (Static234.aStringArray39[local220].equals("")) {
												Static234.aStringArray39[local220] = Static226.aStringArray35[local220];
											}
											Static371.aStringArray66[local220] = inboundBuffer.gjstr();
											Static190.aStringArray28[local220] = inboundBuffer.gjstr();
											if (Static190.aStringArray28[local220].equals("")) {
												Static190.aStringArray28[local220] = Static371.aStringArray66[local220];
											}
											IgnoreList.temporary[local220] = false;
										}
										packet = null;
										Static53.anInt3971 = InterfaceList.transmitTimer;
										return true;
									} else if (packet == ServerProt.PACKET_46) {
										local444 = inboundBuffer.gjstr();
										local74 = inboundBuffer.g2add();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = inboundBuffer.g1sub();
										local249 = inboundBuffer.g1sub();
										if (local228 >= 1 && local228 <= 8) {
											if (local444.equalsIgnoreCase("null")) {
												local444 = null;
											}
											Static243.aStringArray44[local228 - 1] = local444;
											Static207.anIntArray225[local228 - 1] = local74;
											Static44.aBooleanArray11[local228 - 1] = local249 == 0;
										}
										packet = null;
										return true;
									} else if (ServerProt.PACKET_14 == packet) {
										local220 = inboundBuffer.g2();
										local74 = inboundBuffer.g2add();
										local228 = inboundBuffer.g2add();
										if (Static378.method6314(local74)) {
											Camera.forceAngle(local220, local228);
										}
										packet = null;
										return true;
									} else if (ServerProt.PACKET_54 == packet) {
										local220 = inboundBuffer.ig2add();
										local74 = inboundBuffer.ig2();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = inboundBuffer.mg4();
										local249 = inboundBuffer.img4();
										if (Static378.method6314(local220)) {
											Static216.method3774(local74, local249, local228);
											@Pc(3499) ObjType local3499 = client.ObjTypes.get(local74);
											Static277.method4680(local3499.yAngle2d, local3499.xAngle2d, local249, local3499.zoom2d);
											Static376.method6287(local249, local3499.yOffset2d, local3499.xOffset2d, local3499.zOffset2d);
										}
										packet = null;
										return true;
									} else if (packet == ServerProt.PACKET_37) {
										readNpcInfoPacket(true);
										packet = null;
										return true;
									} else {
										@Pc(3551) boolean local3551;
										if (packet == ServerProt.PACKET_67) {
											local444 = inboundBuffer.gjstr();
											local3551 = inboundBuffer.g1() == 1;
											if (local3551) {
												local452 = inboundBuffer.gjstr();
											} else {
												local452 = local444;
											}
											local249 = inboundBuffer.g2();
											@Pc(3569) byte local3569 = inboundBuffer.g1b();
											@Pc(3571) boolean local3571 = false;
											if (local3569 == -128) {
												local3571 = true;
											}
											if (local3571) {
												if (ClanChat.size == 0) {
													packet = null;
													return true;
												}
												for (local512 = 0; local512 < ClanChat.size && (!ClanChat.members[local512].username.equals(local452) || ClanChat.members[local512].world != local249); local512++) {
												}
												if (local512 < ClanChat.size) {
													while (local512 < ClanChat.size - 1) {
														ClanChat.members[local512] = ClanChat.members[local512 + 1];
														local512++;
													}
													ClanChat.size--;
													ClanChat.members[ClanChat.size] = null;
												}
											} else {
												local1663 = inboundBuffer.gjstr();
												local2522 = new ClanMember();
												local2522.username2 = local444;
												local2522.username = local452;
												local2522.aString59 = Static135.method2537(local2522.username);
												local2522.rank = local3569;
												local2522.worldName = local1663;
												local2522.world = local249;
												for (local542 = ClanChat.size - 1; local542 >= 0; local542--) {
													local638 = ClanChat.members[local542].aString59.compareTo(local2522.aString59);
													if (local638 == 0) {
														ClanChat.members[local542].world = local249;
														ClanChat.members[local542].rank = local3569;
														ClanChat.members[local542].worldName = local1663;
														if (local452.equals(PlayerList.self.username)) {
															ClanChat.rank = local3569;
														}
														Static285.anInt5370 = InterfaceList.transmitTimer;
														packet = null;
														return true;
													}
													if (local638 < 0) {
														break;
													}
												}
												if (ClanChat.size >= ClanChat.members.length) {
													packet = null;
													return true;
												}
												for (local638 = ClanChat.size - 1; local638 > local542; local638--) {
													ClanChat.members[local638 + 1] = ClanChat.members[local638];
												}
												if (ClanChat.size == 0) {
													ClanChat.members = new ClanMember[100];
												}
												ClanChat.members[local542 + 1] = local2522;
												ClanChat.size++;
												if (local452.equals(PlayerList.self.username)) {
													ClanChat.rank = local3569;
												}
											}
											packet = null;
											Static285.anInt5370 = InterfaceList.transmitTimer;
											return true;
										}
										@Pc(3809) String local3809;
										if (ServerProt.MESSAGE_GAME == packet) {
											int type = inboundBuffer.gsmart();
											int timestamp = inboundBuffer.g4();
											int moreStrings = inboundBuffer.g1();

											String msg2 = "";
											String msg3 = msg2;
											if ((moreStrings & 0x1) != 0) {
												msg2 = inboundBuffer.gjstr();

												if ((moreStrings & 0x2) == 0) {
													msg3 = msg2;
												} else {
													msg3 = inboundBuffer.gjstr();
												}
											}

											String message = inboundBuffer.gjstr();
											if (type == 99) {
												DevConsole.log(message);
											} else if (msg3.equals("") || !IgnoreList.contains(msg3)) {
												Static33.method4200(msg2, timestamp, message, type, msg3);
											} else {
												packet = null;
												return true;
											}

											packet = null;
											return true;
										} else if (packet == ServerProt.MAP_PROJANIM) {
											readZonePacket(ZoneProt.MAP_PROJANIM);
											packet = null;
											return true;
										} else if (packet == ServerProt.PACKET_68) {
											local220 = inboundBuffer.g4();
											Player.lastLogAddress = GameShell.signlink.getReverseDns(local220);
											packet = null;
											return true;
										} else if (ServerProt.PACKET_2 == packet) {
											Chat.publicFilter = inboundBuffer.g1add();
											Chat.tradeFilter = inboundBuffer.g1sub();
											packet = null;
											return true;
										} else if (ServerProt.PACKET_64 == packet) {
											local220 = inboundBuffer.g1();
											local74 = inboundBuffer.ig2();
											VarpDomain.instance.method5786(local74, local220);
											packet = null;
											return true;
										} else if (ServerProt.PACKET_27 == packet) {
											local220 = inboundBuffer.ig2();
											local74 = inboundBuffer.mg4();
											local228 = inboundBuffer.ig2();
											if (local228 == 65535) {
												local228 = -1;
											}
											if (Static378.method6314(local220)) {
												Static139.method2595(local74, local228);
											}
											packet = null;
											return true;
										} else if (packet == ServerProt.LOC_DEL) {
											readZonePacket(ZoneProt.LOC_DEL);
											packet = null;
											return true;
										} else if (ServerProt.PACKET_4 == packet) {
											Player.energy = inboundBuffer.g1();
											InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
											packet = null;
											return true;
										} else if (ServerProt.PACKET_44 == packet) {
											local220 = inboundBuffer.g4();
											local74 = inboundBuffer.ig2add();
											local228 = inboundBuffer.g2();
											if (Static378.method6314(local228)) {
												DelayedStateChange.method2737(local220, local74);
											}
											packet = null;
											return true;
										} else if (packet == ServerProt.PACKET_47) {
											local220 = inboundBuffer.ig4();
											local74 = inboundBuffer.ig2();
											VarpDomain.instance.method5786(local74, local220);
											packet = null;
											return true;
										} else if (packet == ServerProt.PACKET_50) {
											local220 = inboundBuffer.g1();
											@Pc(4068) boolean local4068 = (local220 & 0x1) == 1;
											local1381 = inboundBuffer.gjstr();
											local3809 = inboundBuffer.gjstr();
											if (local3809.equals("")) {
												local3809 = local1381;
											}
											local1627 = inboundBuffer.gjstr();
											local1391 = inboundBuffer.gjstr();
											if (local1391.equals("")) {
												local1391 = local1627;
											}
											if (local4068) {
												for (local512 = 0; local512 < IgnoreList.size; local512++) {
													if (Static234.aStringArray39[local512].equals(local1391)) {
														Static226.aStringArray35[local512] = local1381;
														Static234.aStringArray39[local512] = local3809;
														Static371.aStringArray66[local512] = local1627;
														Static190.aStringArray28[local512] = local1391;
														break;
													}
												}
											} else {
												Static226.aStringArray35[IgnoreList.size] = local1381;
												Static234.aStringArray39[IgnoreList.size] = local3809;
												Static371.aStringArray66[IgnoreList.size] = local1627;
												Static190.aStringArray28[IgnoreList.size] = local1391;
												IgnoreList.temporary[IgnoreList.size] = (local220 & 0x2) == 2;
												IgnoreList.size++;
											}
											packet = null;
											Static53.anInt3971 = InterfaceList.transmitTimer;
											return true;
										} else if (ServerProt.PACKET_85 == packet) {
											local444 = inboundBuffer.gjstr();
											local74 = inboundBuffer.ig2add();
											local228 = inboundBuffer.ig2();
											if (Static378.method6314(local228)) {
												Static10.method239(local74, local444);
											}
											packet = null;
											return true;
										} else if (packet == ServerProt.PACKET_61) {
											local220 = inboundBuffer.g1sub();
											local74 = inboundBuffer.ig2();
											if (local74 == 65535) {
												local74 = -1;
											}
											local228 = inboundBuffer.g1sub();
											MusicPlayer.playSong(local220, local228, local74);
											packet = null;
											return true;
										} else if (packet == ServerProt.PACKET_62) {
											local220 = inboundBuffer.g1add();
											local74 = inboundBuffer.ig3();
											local228 = inboundBuffer.g2();
											if (local228 == 65535) {
												local228 = -1;
											}
											MusicPlayer.playJingle(local228, local74, local220);
											packet = null;
											return true;
										} else {
											@Pc(4300) long local4300;
											if (ServerProt.PACKET_84 == packet) {
												local1371 = inboundBuffer.g1() == 1;
												local452 = inboundBuffer.gjstr();
												local1381 = local452;
												if (local1371) {
													local1381 = inboundBuffer.gjstr();
												}
												local1780 = inboundBuffer.g8();
												local1785 = inboundBuffer.g2();
												local4300 = inboundBuffer.ig3();
												local638 = inboundBuffer.g1();
												@Pc(4310) long local4310 = (local1785 << 32) + local4300;
												@Pc(4312) boolean local4312 = false;
												@Pc(4314) int local4314 = 0;
												while (true) {
													if (local4314 >= 100) {
														if (local638 <= 1) {
															if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
																local4312 = true;
															} else if (IgnoreList.contains(local1381)) {
																local4312 = true;
															}
														}
														break;
													}
													if (Static358.aLongArray11[local4314] == local4310) {
														local4312 = true;
														break;
													}
													local4314++;
												}
												if (!local4312 && Static212.anInt3785 == 0) {
													Static358.aLongArray11[Static193.anInt3555] = local4310;
													Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
													@Pc(4372) String local4372 = StringUtils.escape(Static308.method5276(inboundBuffer));
													if (local638 == 2 || local638 == 3) {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, local1381, local452);
													}
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_100) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g1();
												local3551 = (local74 & 0x1) == 1;
												while (packetSize > inboundBuffer.pos) {
													local249 = inboundBuffer.gsmart();
													local497 = inboundBuffer.g2();
													local506 = 0;
													if (local497 != 0) {
														local506 = inboundBuffer.g1();
														if (local506 == 255) {
															local506 = inboundBuffer.g4();
														}
													}
													Static62.method2391(local249, local506, local220, local497 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												packet = null;
												return true;
											} else if (ServerProt.PACKET_81 == packet) {
												local220 = inboundBuffer.img4();
												local74 = inboundBuffer.ig2add();
												local228 = inboundBuffer.g2();
												if (local228 == 65535) {
													local228 = -1;
												}
												if (Static378.method6314(local74)) {
													Static190.method3501(local228, -1, 1, local220);
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.LOC_ANIM) {
												readZonePacket(ZoneProt.LOC_ANIM);
												packet = null;
												return true;
											} else if (ServerProt.PACKET_60 == packet) {
												local444 = inboundBuffer.gjstr();
												local74 = inboundBuffer.ig2();
												local228 = inboundBuffer.img4();
												if (Static378.method6314(local74)) {
													Static319.method5432(local228, local444);
												}
												packet = null;
												return true;
											} else if (ServerProt.TEXT_COORD == packet) {
												readZonePacket(ZoneProt.TEXT_COORD);
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_32) {
												readNpcInfoPacket(false);
												packet = null;
												return true;
											} else if (ServerProt.PACKET_86 == packet) {
												local220 = inboundBuffer.ig4();
												local74 = inboundBuffer.ig2();
												local228 = inboundBuffer.ig2s();
												local249 = inboundBuffer.g2ssub();
												if (Static378.method6314(local74)) {
													Static129.method2438(local249, local228, local220);
												}
												packet = null;
												return true;
											} else if (ServerProt.REBUILD_NORMAL == packet) {
												Static181.rebuildMap(false);
												packet = null;
												return false;
											} else if (packet == ServerProt.PACKET_45) {
												Chat.privateFilter = FilterSetting.fromInt(inboundBuffer.g1());
												packet = null;
												return true;
											} else if (ServerProt.PACKET_21 == packet) {
												local220 = inboundBuffer.g1bneg();
												local74 = inboundBuffer.ig2add();
												local3551 = (local220 & 0x1) == 1;
												Static166.method3186(local3551, local74);
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local74;
												packet = null;
												return true;
											} else if (ServerProt.PACKET_95 == packet) {
												local220 = inboundBuffer.img4();
												local74 = inboundBuffer.g2add();
												if (local74 == 65535) {
													local74 = -1;
												}
												local228 = inboundBuffer.ig2add();
												if (Static378.method6314(local228)) {
													Static190.method3501(local74, -1, 2, local220);
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_29) {
												local272 = inboundBuffer.g1neg();
												local74 = inboundBuffer.g2();
												VarpDomain.instance.method5785(local272, local74);
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_49) {
												Static383.method6379(inboundBuffer.gjstr());
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_90) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g2();
												local228 = inboundBuffer.g2();
												local249 = inboundBuffer.ig2add();
												local497 = inboundBuffer.ig4();
												if (Static378.method6314(local74)) {
													Static190.method3501(local228 | local249 << 16, local220, 7, local497);
												}
												packet = null;
												return true;
											} else if (ServerProt.PACKET_51 == packet) {
												local1371 = inboundBuffer.g1() == 1;
												local452 = inboundBuffer.gjstr();
												local1381 = local452;
												if (local1371) {
													local1381 = inboundBuffer.gjstr();
												}
												local1780 = inboundBuffer.g8();
												local1785 = inboundBuffer.g2();
												local4300 = inboundBuffer.ig3();
												local638 = inboundBuffer.g1();
												@Pc(4892) int local4892 = inboundBuffer.g2();
												@Pc(4898) long local4898 = local4300 + (local1785 << 32);
												@Pc(4900) boolean local4900 = false;
												@Pc(4902) int local4902 = 0;
												while (true) {
													if (local4902 >= 100) {
														if (local638 <= 1 && IgnoreList.contains(local1381)) {
															local4900 = true;
														}
														break;
													}
													if (Static358.aLongArray11[local4902] == local4898) {
														local4900 = true;
														break;
													}
													local4902++;
												}
												if (!local4900 && Static212.anInt3785 == 0) {
													Static358.aLongArray11[Static193.anInt3555] = local4898;
													Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
													@Pc(4955) String local4955 = QuickChatPhraseTypeList.get(local4892).method5602(inboundBuffer);
													if (local638 == 2) {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, local1381, local452);
													}
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.OBJ_DEL) {
												readZonePacket(ZoneProt.OBJ_DEL);
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_78) {
												local220 = inboundBuffer.g2add();
												local74 = inboundBuffer.img4();
												if (Static378.method6314(local220)) {
													Static190.method3501(PlayerList.selfId, 0, 5, local74);
												}
												packet = null;
												return true;
											} else if (ServerProt.PACKET_69 == packet) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g1();
												local3551 = (local74 & 0x1) == 1;
												Static286.method4925(local3551, local220);
												local249 = inboundBuffer.g2();
												for (local497 = 0; local497 < local249; local497++) {
													local506 = inboundBuffer.ig2();
													local512 = inboundBuffer.g1();
													if (local512 == 255) {
														local512 = inboundBuffer.mg4();
													}
													Static62.method2391(local497, local512, local220, local506 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												packet = null;
												return true;
											} else if (ServerProt.PACKET_65 == packet) {
												local220 = inboundBuffer.ig2();
												local74 = inboundBuffer.g1();
												local228 = inboundBuffer.g2add();
												@Pc(5170) Npc local5170 = NpcList.npcs[local220];
												if (local5170 != null) {
													Static307.method5256(local228, local5170, local74);
												}
												packet = null;
												return true;
											} else if (ServerProt.PACKET_22 == packet) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g4();
												local228 = inboundBuffer.ig2();
												if (Static378.method6314(local220)) {
													Static322.method5481(local228, local74);
												}
												packet = null;
												return true;
											} else if (ServerProt.PACKET_11 == packet) {
												if (packetSize == 0) {
													Static330.aString62 = Static66.aClass79_34.getLocalized(client.language);
												} else {
													Static330.aString62 = inboundBuffer.gjstr();
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.REBUILD_REGION) {
												Static181.rebuildMap(true);
												packet = null;
												return false;
											} else if (packet == ServerProt.MAP_PROJANIM_HALFSQ) {
												readZonePacket(ZoneProt.MAP_PROJANIM_HALFSQ);
												packet = null;
												return true;
											} else if (ServerProt.PACKET_53 == packet) {
												local220 = inboundBuffer.g2();
												local452 = inboundBuffer.gjstr();
												local228 = inboundBuffer.ig2();
												if (Static378.method6314(local228)) {
													Static10.method239(local220, local452);
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_57) {
												local220 = inboundBuffer.mg4();
												local74 = inboundBuffer.ig2add();
												local228 = inboundBuffer.g2add();
												local249 = inboundBuffer.g2add();
												local497 = inboundBuffer.g2add();
												if (Static378.method6314(local74)) {
													Static277.method4680(local497, local249, local220, local228);
												}
												packet = null;
												return true;
											} else if (ServerProt.OBJ_ADD == packet) {
												readZonePacket(ZoneProt.OBJ_ADD);
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_16) {
												local220 = inboundBuffer.g1add();
												local74 = local220 >> 2;
												local228 = local220 & 0x3;
												local249 = Static150.LAYERS[local74];
												local497 = inboundBuffer.mg4();
												local506 = local497 >> 28 & 0x3;
												local512 = local497 >> 14 & 0x3FFF;
												local536 = local497 & 0x3FFF;
												local542 = inboundBuffer.ig2add();
												@Pc(5371) int local5371 = local536 - Camera.originZ;
												if (local542 == 65535) {
													local542 = -1;
												}
												local512 -= Camera.originX;
												Static391.method6452(local74, local542, local5371, local249, local228, local512, local506);
												packet = null;
												return true;
											} else if (ServerProt.UPDATE_ZONE_PARTIAL_ENCLOSED == packet) {
												zoneX = inboundBuffer.g1sub();
												Player.level = inboundBuffer.g1();
												zoneZ = inboundBuffer.g1bneg();
												while (inboundBuffer.pos < packetSize) {
													@Pc(5421) ZoneProt local5421 = ZoneProt.getAll()[inboundBuffer.g1()];
													readZonePacket(local5421);
												}
												packet = null;
												return true;
											} else if (ServerProt.PACKET_102 == packet) {
												local220 = inboundBuffer.g1();
												local74 = local220 >> 5;
												local228 = local220 & 0x1F;
												if (local228 == 0) {
													Static50.aClass84Array1[local74] = null;
													packet = null;
													return true;
												}
												@Pc(5468) Class84 local5468 = new Class84();
												local5468.anInt2355 = local228;
												local5468.anInt2363 = inboundBuffer.g1();
												if (local5468.anInt2363 >= 0 && local5468.anInt2363 < Static230.aClass13Array16.length) {
													if (local5468.anInt2355 == 1 || local5468.anInt2355 == 10) {
														local5468.anInt2354 = inboundBuffer.g2();
														inboundBuffer.pos += 6;
													} else if (local5468.anInt2355 >= 2 && local5468.anInt2355 <= 6) {
														if (local5468.anInt2355 == 2) {
															local5468.anInt2350 = 64;
															local5468.anInt2356 = 64;
														}
														if (local5468.anInt2355 == 3) {
															local5468.anInt2356 = 64;
															local5468.anInt2350 = 0;
														}
														if (local5468.anInt2355 == 4) {
															local5468.anInt2356 = 64;
															local5468.anInt2350 = 128;
														}
														if (local5468.anInt2355 == 5) {
															local5468.anInt2356 = 0;
															local5468.anInt2350 = 64;
														}
														if (local5468.anInt2355 == 6) {
															local5468.anInt2350 = 64;
															local5468.anInt2356 = 128;
														}
														local5468.anInt2355 = 2;
														local5468.anInt2359 = inboundBuffer.g1();
														local5468.anInt2352 = inboundBuffer.g2();
														local5468.anInt2364 = inboundBuffer.g2();
														local5468.anInt2362 = inboundBuffer.g1();
														local5468.anInt2349 = inboundBuffer.g2();
													}
													local5468.anInt2361 = inboundBuffer.g2();
													if (local5468.anInt2361 == 65535) {
														local5468.anInt2361 = -1;
													}
													Static50.aClass84Array1[local74] = local5468;
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.OBJ_REVEAL) {
												readZonePacket(ZoneProt.OBJ_REVEAL);
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_87) {
												local220 = inboundBuffer.g2();
												local452 = inboundBuffer.gjstr();
												@Pc(5648) Object[] local5648 = new Object[local452.length() + 1];
												for (local249 = local452.length() - 1; local249 >= 0; local249--) {
													if (local452.charAt(local249) == 's') {
														local5648[local249 + 1] = inboundBuffer.gjstr();
													} else {
														local5648[local249 + 1] = Integer.valueOf(inboundBuffer.g4());
													}
												}
												local5648[0] = Integer.valueOf(inboundBuffer.g4());
												if (Static378.method6314(local220)) {
													@Pc(5704) HookRequest local5704 = new HookRequest();
													local5704.anObjectArray4 = local5648;
													ScriptRunner.execute(local5704);
												}
												packet = null;
												return true;
											} else if (ServerProt.PACKET_28 == packet) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g4();
												if (Static378.method6314(local220)) {
													@Pc(5735) SubInterface local5735 = (SubInterface) InterfaceList.subInterfaces.get((long) local74);
													if (local5735 != null) {
														Static276.method4655(false, local5735, true);
													}
													if (Static192.aClass161_8 != null) {
														InterfaceList.redraw(Static192.aClass161_8);
														Static192.aClass161_8 = null;
													}
												}
												packet = null;
												return true;
											} else if (packet == ServerProt.MAP_ANIM) {
												readZonePacket(ZoneProt.MAP_ANIM);
												packet = null;
												return true;
											} else if (packet == ServerProt.PACKET_9) {
												local220 = inboundBuffer.g4();
												local74 = inboundBuffer.ig2();
												local228 = inboundBuffer.ig2sadd();
												if (Static378.method6314(local74)) {
													Static53.method3952(local228, local220);
												}
												packet = null;
												return true;
											} else {
												TracingException.report(null, "T1 - " + (packet == null ? -1 : packet.getOpcode()) + "," + (packet2 == null ? -1 : packet2.getOpcode()) + "," + (packet3 == null ? -1 : packet3.getOpcode()) + " - " + packetSize);
												LoginManager.logout();
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

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
	public static boolean readPacket() {
		try {
			return readPacketInternal();
		} catch (@Pc(16) IOException local16) {
			method3725();
			return true;
		} catch (@Pc(21) Exception ex) {
			@Pc(81) String local81 = "T2 - " + (packet == null ? -1 : packet.getOpcode()) + "," + (packet2 == null ? -1 : packet2.getOpcode()) + "," + (packet3 == null ? -1 : packet3.getOpcode()) + " - " + packetSize + "," + (Camera.originX + PlayerList.self.movementQueueX[0]) + "," + (Camera.originZ + PlayerList.self.movementQueueZ[0]) + " - ";
			for (@Pc(83) int local83 = 0; local83 < packetSize && local83 < 50; local83++) {
				local81 = local81 + inboundBuffer.data[local83] + ",";
			}
			ex.printStackTrace();
			TracingException.report(ex, local81);
			LoginManager.logout();
			return true;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void readNpcInfo() {
		inboundBuffer.accessBits();
		@Pc(13) int size = inboundBuffer.gBit(8);
		@Pc(18) int i;
		if (size < NpcList.size) {
			for (i = size; i < NpcList.size; i++) {
				removedIds[removedCount++] = NpcList.ids[i];
			}
		}
		if (NpcList.size < size) {
			throw new RuntimeException("gnpov1");
		}
		NpcList.size = 0;
		for (i = 0; i < size; i++) {
			@Pc(64) int id = NpcList.ids[i];
			@Pc(68) Npc npc = NpcList.npcs[id];
			@Pc(73) int updated = inboundBuffer.gBit(1);
			if (updated == 0) {
				NpcList.ids[NpcList.size++] = id;
				npc.lastCycle = client.cycle;
			} else {
				@Pc(96) int type = inboundBuffer.gBit(2);
				if (type == 0) {
					NpcList.ids[NpcList.size++] = id;
					npc.lastCycle = client.cycle;
					extendedIds[extendedCount++] = id;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (type == 1) {
						NpcList.ids[NpcList.size++] = id;
						npc.lastCycle = client.cycle;
						local140 = inboundBuffer.gBit(3);
						npc.move(1, local140);
						local150 = inboundBuffer.gBit(1);
						if (local150 == 1) {
							extendedIds[extendedCount++] = id;
						}
					} else if (type == 2) {
						NpcList.ids[NpcList.size++] = id;
						npc.lastCycle = client.cycle;
						if (inboundBuffer.gBit(1) == 1) {
							local140 = inboundBuffer.gBit(3);
							npc.move(2, local140);
							local150 = inboundBuffer.gBit(3);
							npc.move(2, local150);
						} else {
							local140 = inboundBuffer.gBit(3);
							npc.move(0, local140);
						}
						local140 = inboundBuffer.gBit(1);
						if (local140 == 1) {
							extendedIds[extendedCount++] = id;
						}
					} else if (type == 3) {
						removedIds[removedCount++] = id;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V")
	public static void readNpcInfoPacket(@OriginalArg(1) boolean arg0) {
		removedCount = 0;
		extendedCount = 0;
		readNpcInfo();
		readNewNpcInfo(arg0);
		readExtendedNpcInfo();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < removedCount; local18++) {
			local24 = removedIds[local18];
			if (client.cycle != NpcList.npcs[local24].lastCycle) {
				if (NpcList.npcs[local24].type.hasAreaSound()) {
					AreaSoundManager.remove(NpcList.npcs[local24]);
				}
				NpcList.npcs[local24].setType(null);
				NpcList.npcs[local24] = null;
			}
		}
		if (inboundBuffer.pos != packetSize) {
			throw new RuntimeException("gnp1 pos:" + inboundBuffer.pos + " psize:" + packetSize);
		}
		for (local24 = 0; local24 < NpcList.size; local24++) {
			if (NpcList.npcs[NpcList.ids[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + NpcList.size);
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZZ)V")
	public static void readNewNpcInfo(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (inboundBuffer.availableBits(packetSize) >= 15) {
				@Pc(16) int id = inboundBuffer.gBit(15);
				if (id != 32767) {
					@Pc(21) boolean local21 = false;
					if (NpcList.npcs[id] == null) {
						NpcList.npcs[id] = new Npc();
						NpcList.npcs[id].anInt4619 = id;
						local21 = true;
					}
					@Pc(42) Npc local42 = NpcList.npcs[id];
					NpcList.ids[NpcList.size++] = id;
					local42.lastCycle = client.cycle;
					if (local42.type != null && local42.type.hasAreaSound()) {
						AreaSoundManager.remove(local42);
					}
					@Pc(71) int local71;
					if (arg0) {
						local71 = inboundBuffer.gBit(8);
						if (local71 > 127) {
							local71 -= 256;
						}
					} else {
						local71 = inboundBuffer.gBit(5);
						if (local71 > 15) {
							local71 -= 32;
						}
					}
					@Pc(97) int local97;
					if (arg0) {
						local97 = inboundBuffer.gBit(8);
						if (local97 > 127) {
							local97 -= 256;
						}
					} else {
						local97 = inboundBuffer.gBit(5);
						if (local97 > 15) {
							local97 -= 32;
						}
					}
					@Pc(119) int local119 = inboundBuffer.gBit(1);
					if (local119 == 1) {
						extendedIds[extendedCount++] = id;
					}
					local42.setType(client.NpcTypes.get(inboundBuffer.gBit(14)));
					@Pc(151) int local151 = inboundBuffer.gBit(3) + 4 << 11 & 0x3929;
					@Pc(156) int local156 = inboundBuffer.gBit(2);
					@Pc(161) int local161 = inboundBuffer.gBit(1);
					local42.setSize(local42.type.size);
					local42.anInt4604 = local42.type.anInt2044 << 3;
					if (local42.anInt4604 == 0) {
						local42.method4330(0);
					} else if (local21) {
						local42.method4330(local151);
					}
					local42.teleport(local42.getSize(), local156, PlayerList.self.movementQueueX[0] + local97, local161 == 1, PlayerList.self.movementQueueZ[0] + local71);
					if (local42.type.hasAreaSound()) {
						AreaSoundManager.add(null, local42.movementQueueZ[0], 0, null, local42, local42.movementQueueX[0], local42.plane);
					}
					continue;
				}
			}
			inboundBuffer.accessBytes();
			return;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public static void readExtendedNpcInfo() {
		for (@Pc(7) int local7 = 0; local7 < extendedCount; local7++) {
			@Pc(21) int local21 = extendedIds[local7];
			@Pc(25) Npc local25 = NpcList.npcs[local21];
			@Pc(29) int local29 = inboundBuffer.g1();
			if ((local29 & 0x40) != 0) {
				local29 += inboundBuffer.g1() << 8;
			}
			@Pc(55) int local55;
			if ((local29 & 0x400) != 0) {
				local55 = inboundBuffer.g2add();
				local25.anInt4578 = inboundBuffer.g1sub();
				local25.anInt4591 = inboundBuffer.g1sub();
				local25.anInt4623 = local55 & 0x7FFF;
				local25.aBoolean319 = (local55 & 0x8000) != 0;
				local25.anInt4621 = client.cycle + local25.anInt4623 + local25.anInt4578;
			}
			@Pc(107) int local107;
			if ((local29 & 0x2) != 0) {
				local55 = inboundBuffer.gsmart();
				local107 = inboundBuffer.g1bneg();
				local25.method4334(local107, local55, client.cycle);
				local25.anInt4606 = client.cycle + 300;
				local25.anInt4631 = inboundBuffer.g1();
			}
			if ((local29 & 0x8) != 0) {
				local55 = inboundBuffer.g2();
				if (local55 == 65535) {
					local55 = -1;
				}
				local107 = inboundBuffer.g1sub();
				Static307.method5256(local55, local25, local107);
			}
			if ((local29 & 0x80) != 0) {
				local25.aString50 = inboundBuffer.gjstr();
				local25.anInt4636 = 100;
			}
			@Pc(224) int local224;
			if ((local29 & 0x4) != 0) {
				local55 = inboundBuffer.ig2add();
				local107 = inboundBuffer.ig4();
				if (local55 == 65535) {
					local55 = -1;
				}
				@Pc(186) boolean local186 = true;
				@Pc(221) Class157 local221;
				if (local55 != -1 && local25.anInt4594 != -1) {
					@Pc(207) SpotAnimType local207;
					if (local55 == local25.anInt4594) {
						local207 = client.SpotAnimTypes.method5407(local55);
						if (local207.aBoolean177 && local207.anInt2448 != -1) {
							local221 = client.SeqTypes.method2371(local207.anInt2448);
							local224 = local221.anInt4022;
							if (local224 == 0) {
								local186 = false;
							} else if (local224 == 1) {
								local186 = true;
							} else if (local224 == 2) {
								local25.anInt4598 = 0;
								local186 = false;
							}
						}
					} else {
						local207 = client.SpotAnimTypes.method5407(local55);
						@Pc(262) SpotAnimType local262 = client.SpotAnimTypes.method5407(local25.anInt4594);
						if (local207.anInt2448 != -1 && local262.anInt2448 != -1) {
							@Pc(277) Class157 local277 = client.SeqTypes.method2371(local207.anInt2448);
							@Pc(283) Class157 local283 = client.SeqTypes.method2371(local262.anInt2448);
							if (local277.anInt4023 < local283.anInt4023) {
								local186 = false;
							}
						}
					}
				}
				if (local186) {
					local25.anInt4620 = 0;
					local25.anInt4594 = local55;
					local25.anInt4582 = 0;
					local25.anInt4639 = local107 >> 16;
					local25.anInt4612 = 1;
					local25.anInt4595 = client.cycle + (local107 & 0xFFFF);
					if (client.cycle < local25.anInt4595) {
						local25.anInt4582 = -1;
					}
					if (local25.anInt4594 != -1 && client.cycle == local25.anInt4595) {
						@Pc(340) int local340 = client.SpotAnimTypes.method5407(local25.anInt4594).anInt2448;
						if (local340 != -1) {
							local221 = client.SeqTypes.method2371(local340);
							if (local221 != null && local221.anIntArray262 != null) {
								Static1.method4(local221, false, local25.plane, local25.xFine, local25.zFine, 0);
							}
						}
					}
				}
			}
			if ((local29 & 0x20) != 0) {
				local25.anInt4611 = inboundBuffer.g2();
				if (local25.anInt4611 == 65535) {
					local25.anInt4611 = -1;
				}
			}
			if ((local29 & 0x1) != 0) {
				local55 = inboundBuffer.gsmart();
				local107 = inboundBuffer.g1bneg();
				local25.method4334(local107, local55, client.cycle);
			}
			if ((local29 & 0x100) != 0) {
				local55 = inboundBuffer.g1sub();
				@Pc(411) int[] local411 = new int[local55];
				@Pc(414) int[] local414 = new int[local55];
				@Pc(417) int[] local417 = new int[local55];
				for (@Pc(419) int local419 = 0; local419 < local55; local419++) {
					local224 = inboundBuffer.g2add();
					if (local224 == 65535) {
						local224 = -1;
					}
					local411[local419] = local224;
					local414[local419] = inboundBuffer.g1bneg();
					local417[local419] = inboundBuffer.g2();
				}
				Static92.method1966(local411, local417, local25, local414);
			}
			if ((local29 & 0x200) != 0) {
				local25.anInt4663 = inboundBuffer.g2();
				local25.anInt4657 = inboundBuffer.ig2();
			}
			if ((local29 & 0x10) != 0) {
				if (local25.type.hasAreaSound()) {
					AreaSoundManager.remove(local25);
				}
				local25.setType(client.NpcTypes.get(inboundBuffer.ig2()));
				local25.setSize(local25.type.size);
				local25.anInt4604 = local25.type.anInt2044 << 3;
				if (local25.type.hasAreaSound()) {
					AreaSoundManager.add(null, local25.movementQueueZ[0], 0, null, local25, local25.movementQueueX[0], local25.plane);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qg;BI)V")
	public static void readPlayerInfo(@OriginalArg(0) Packet packet, @OriginalArg(2) int size) {
		Static112.debugGpi = false;
		Static325.anInt6079 = 0;
		readPlayerGpi(packet);
		readPlayerUpdateMasks(packet);
		if (Static112.debugGpi) {
			System.out.println("---endgpp---");
		}
		if (packet.pos != size) {
			throw new RuntimeException("gpi1 pos:" + packet.pos + " psize:" + size);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qg;I)V")
	public static void readPlayerGpi(@OriginalArg(0) Packet buffer) {
		// active players:

		@Pc(7) int local7 = 0;
		buffer.accessBits();
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < PlayerList.anInt751; local14++) {
			local20 = PlayerList.anIntArray121[local14];
			if ((PlayerList.aByteArray7[local20] & 0x1) == 0) {
				if (local7 > 0) {
					PlayerList.aByteArray7[local20] = (byte) (PlayerList.aByteArray7[local20] | 0x2);
					local7--;
				} else {
					local48 = buffer.gBit(1);
					if (local48 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local20] = (byte) (PlayerList.aByteArray7[local20] | 0x2);
					} else {
						method6464(buffer, local20);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}

		//

		buffer.accessBits();
		@Pc(126) int local126;
		for (local20 = 0; local20 < PlayerList.anInt751; local20++) {
			local48 = PlayerList.anIntArray121[local20];
			if ((PlayerList.aByteArray7[local48] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					PlayerList.aByteArray7[local48] = (byte) (PlayerList.aByteArray7[local48] | 0x2);
				} else {
					local126 = buffer.gBit(1);
					if (local126 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local48] = (byte) (PlayerList.aByteArray7[local48] | 0x2);
					} else {
						method6464(buffer, local48);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}

		// inactive players:

		buffer.accessBits();
		@Pc(210) int local210;
		for (local48 = 0; local48 < PlayerList.anInt3547; local48++) {
			local126 = PlayerList.anIntArray284[local48];
			if ((PlayerList.aByteArray7[local126] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					PlayerList.aByteArray7[local126] = (byte) (PlayerList.aByteArray7[local126] | 0x2);
				} else {
					local210 = buffer.gBit(1);
					if (local210 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local126] = (byte) (PlayerList.aByteArray7[local126] | 0x2);
					} else if (method6033(buffer, local126)) {
						PlayerList.aByteArray7[local126] = (byte) (PlayerList.aByteArray7[local126] | 0x2);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}

		//

		buffer.accessBits();
		for (local126 = 0; local126 < PlayerList.anInt3547; local126++) {
			local210 = PlayerList.anIntArray284[local126];
			if ((PlayerList.aByteArray7[local210] & 0x1) == 0) {
				if (local7 > 0) {
					PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] | 0x2);
					local7--;
				} else {
					@Pc(301) int local301 = buffer.gBit(1);
					if (local301 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] | 0x2);
					} else if (method6033(buffer, local210)) {
						PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] | 0x2);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}

		//

		PlayerList.anInt751 = 0;
		PlayerList.anInt3547 = 0;
		for (local210 = 1; local210 < 2048; local210++) {
			PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] >> 1);
			@Pc(366) Player local366 = PlayerList.players[local210];
			if (local366 == null) {
				PlayerList.anIntArray284[PlayerList.anInt3547++] = local210;
			} else {
				PlayerList.anIntArray121[PlayerList.anInt751++] = local210;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!qg;)V")
	public static void readPlayerUpdateMasks(@OriginalArg(1) Packet buffer) {
		for (@Pc(15) int local15 = 0; local15 < Static325.anInt6079; local15++) {
			@Pc(21) int local21 = Static52.anIntArray100[local15];
			@Pc(25) Player local25 = PlayerList.players[local21];
			@Pc(29) int opcode = buffer.g1();
			if ((opcode & 0x2) != 0) {
				opcode += buffer.g1() << 8;
			}
			readPlayerUpdateMask(buffer, local21, local25, opcode);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!qg;BILclient!nh;I)V")
	public static void readPlayerUpdateMask(@OriginalArg(0) Packet buffer, @OriginalArg(2) int arg1, @OriginalArg(3) Player arg2, @OriginalArg(4) int arg3) {
		@Pc(11) byte local11 = -1;
		if ((arg3 & 0x20) != 0) {
			Static335.aByteArray92[arg1] = buffer.g1badd();
		}
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(43) int local43;
		if ((arg3 & 0x8) != 0) {
			local32 = buffer.g2add();
			local36 = buffer.g1bneg();
			local40 = buffer.g1();
			local43 = buffer.pos;
			@Pc(51) boolean local51 = (local32 & 0x8000) != 0;
			if (arg2.username != null && arg2.appearance != null) {
				@Pc(59) boolean local59 = false;
				if (local36 <= 1) {
					if (!local51 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
						local59 = true;
					} else if (IgnoreList.contains(arg2.username)) {
						local59 = true;
					}
				}
				if (!local59 && Static212.anInt3785 == 0) {
					playerAppearanceBuffer.pos = 0;
					buffer.ipadata(playerAppearanceBuffer.data, local40);
					playerAppearanceBuffer.pos = 0;
					@Pc(107) int local107 = -1;
					@Pc(117) String local117;
					if (local51) {
						local32 &= 0x7FFF;
						@Pc(127) QuickChatPhrase local127 = Static290.method5027(playerAppearanceBuffer);
						local107 = local127.id;
						local117 = local127.type.method5602(playerAppearanceBuffer);
					} else {
						local117 = StringUtils.escape(Static308.method5276(playerAppearanceBuffer));
					}
					arg2.aString50 = local117.trim();
					arg2.anInt4600 = local32 & 0xFF;
					arg2.anInt4618 = local32 >> 8;
					arg2.anInt4636 = 150;
					@Pc(167) int local167;
					if (local36 == 1 || local36 == 2) {
						local167 = local51 ? 17 : 1;
					} else {
						local167 = local51 ? 17 : 2;
					}
					if (local36 == 2) {
						Static220.method3874(0, null, local117, local107, local167, "<img=1>" + arg2.method4070(), "<img=1>" + arg2.getName());
					} else if (local36 == 1) {
						Static220.method3874(0, null, local117, local107, local167, "<img=0>" + arg2.method4070(), "<img=0>" + arg2.getName());
					} else {
						Static220.method3874(0, null, local117, local107, local167, arg2.method4070(), arg2.getName());
					}
				}
			}
			buffer.pos = local43 + local40;
		}
		@Pc(283) int local283;
		@Pc(289) int local289;
		if ((arg3 & 0x400) != 0) {
			local32 = buffer.g1sub();
			@Pc(275) int[] local275 = new int[local32];
			@Pc(278) int[] local278 = new int[local32];
			@Pc(281) int[] local281 = new int[local32];
			for (local283 = 0; local283 < local32; local283++) {
				local289 = buffer.ig2();
				if (local289 == 65535) {
					local289 = -1;
				}
				local275[local283] = local289;
				local278[local283] = buffer.g1bneg();
				local281[local283] = buffer.ig2();
			}
			Static154.method2785(local275, local281, local278, arg2);
		}
		if ((arg3 & 0x1) != 0) {
			local32 = buffer.g1sub();
			@Pc(337) byte[] local337 = new byte[local32];
			@Pc(342) Buffer local342 = new Buffer(local337);
			buffer.igdata(local337, local32);
			Static231.aClass2_Sub4Array1[arg1] = local342;
			arg2.decodeAppearance(local342);
		}
		if ((arg3 & 0x10) != 0) {
			local32 = buffer.g2add();
			if (local32 == 65535) {
				local32 = -1;
			}
			arg2.anInt4611 = local32;
		}
		if ((arg3 & 0x4) != 0) {
			local32 = buffer.ig2add();
			if (local32 == 65535) {
				local32 = -1;
			}
			local36 = buffer.g1add();
			Player.animate(arg2, local36, local32);
		}
		if ((arg3 & 0x100) != 0) {
			arg2.anInt4615 = buffer.g1badd();
			arg2.anInt4588 = buffer.g1badd();
			arg2.anInt4577 = buffer.g1bsub();
			arg2.anInt4599 = buffer.g1b();
			arg2.anInt4622 = buffer.g2add() + client.cycle;
			arg2.anInt4584 = buffer.g2add() + client.cycle;
			arg2.anInt4614 = buffer.g1bneg();
			arg2.anInt4642 = 0;
			if (arg2.aBoolean276) {
				arg2.anInt4577 += arg2.anInt4169;
				arg2.anInt4615 += arg2.anInt4169;
				arg2.anInt4588 += arg2.anInt4181;
				arg2.anInt4643 = 0;
				arg2.anInt4599 += arg2.anInt4181;
			} else {
				arg2.anInt4588 += arg2.movementQueueZ[0];
				arg2.anInt4599 += arg2.movementQueueZ[0];
				arg2.anInt4643 = 1;
				arg2.anInt4577 += arg2.movementQueueX[0];
				arg2.anInt4615 += arg2.movementQueueX[0];
			}
		}
		if ((arg3 & 0x1000) != 0) {
			local32 = buffer.g2();
			arg2.anInt4578 = buffer.g1add();
			arg2.anInt4591 = buffer.g1sub();
			arg2.anInt4623 = local32 & 0x7FFF;
			arg2.aBoolean319 = (local32 & 0x8000) != 0;
			arg2.anInt4621 = arg2.anInt4623 + client.cycle + arg2.anInt4578;
		}
		if ((arg3 & 0x80) != 0) {
			arg2.anInt4174 = buffer.g2();
			if (arg2.anInt4643 == 0) {
				arg2.method4325(arg2.anInt4174);
				arg2.anInt4174 = -1;
			}
		}
		if ((arg3 & 0x200) != 0) {
			arg2.aString50 = buffer.gjstr();
			if (arg2.aString50.charAt(0) == '~') {
				arg2.aString50 = arg2.aString50.substring(1);
				Static33.method4200(arg2.getName(), 0, arg2.aString50, 2, arg2.method4070());
			} else if (PlayerList.self == arg2) {
				Static33.method4200(arg2.getName(), 0, arg2.aString50, 2, arg2.method4070());
			}
			arg2.anInt4600 = 0;
			arg2.anInt4618 = 0;
			arg2.anInt4636 = 150;
		}
		if ((arg3 & 0x2000) != 0) {
			local32 = buffer.ig2add();
			local36 = buffer.g4();
			if (local32 == 65535) {
				local32 = -1;
			}
			@Pc(690) boolean local690 = true;
			@Pc(780) Class157 local780;
			if (local32 != -1 && arg2.anInt4594 != -1) {
				@Pc(707) SpotAnimType local707;
				if (local32 == arg2.anInt4594) {
					local707 = client.SpotAnimTypes.method5407(local32);
					if (local707.aBoolean177 && local707.anInt2448 != -1) {
						@Pc(723) Class157 local723 = client.SeqTypes.method2371(local707.anInt2448);
						local289 = local723.anInt4022;
						if (local289 == 0) {
							local690 = false;
						} else if (local289 == 1) {
							local690 = true;
						} else if (local289 == 2) {
							arg2.anInt4598 = 0;
							local690 = false;
						}
					}
				} else {
					local707 = client.SpotAnimTypes.method5407(local32);
					@Pc(763) SpotAnimType local763 = client.SpotAnimTypes.method5407(arg2.anInt4594);
					if (local707.anInt2448 != -1 && local763.anInt2448 != -1) {
						local780 = client.SeqTypes.method2371(local707.anInt2448);
						@Pc(786) Class157 local786 = client.SeqTypes.method2371(local763.anInt2448);
						if (local780.anInt4023 < local786.anInt4023) {
							local690 = false;
						}
					}
				}
			}
			if (local690) {
				arg2.anInt4639 = local36 >> 16;
				local43 = client.cycle;
				arg2.anInt4594 = local32;
				arg2.anInt4595 = (local36 & 0xFFFF) + local43;
				arg2.anInt4582 = 0;
				arg2.anInt4620 = 0;
				arg2.anInt4612 = 1;
				if (arg2.anInt4595 > local43) {
					arg2.anInt4582 = -1;
				}
				if (arg2.anInt4594 != -1 && local43 == arg2.anInt4595) {
					local283 = client.SpotAnimTypes.method5407(arg2.anInt4594).anInt2448;
					if (local283 != -1) {
						local780 = client.SeqTypes.method2371(local283);
						if (local780 != null && local780.anIntArray262 != null) {
							Static1.method4(local780, arg2 == PlayerList.self, arg2.plane, arg2.xFine, arg2.zFine, 0);
						}
					}
				}
			}
		}
		if ((arg3 & 0x40) != 0) {
			local32 = buffer.gsmart();
			local36 = buffer.g1sub();
			arg2.method4334(local36, local32, client.cycle);
			arg2.anInt4606 = client.cycle + 300;
			arg2.anInt4631 = buffer.g1bneg();
		}
		if ((arg3 & 0x800) != 0) {
			local32 = client.cycle;
			local36 = buffer.gsmart();
			local40 = buffer.g1sub();
			arg2.method4334(local40, local36, local32);
		}
		if ((arg3 & 0x4000) != 0) {
			local11 = buffer.g1bsub();
		}
		if (!arg2.aBoolean276) {
			return;
		}
		if (local11 == 127) {
			arg2.method4064(arg2.anInt4169, arg2.anInt4181);
			return;
		}
		@Pc(964) byte local964;
		if (local11 == -1) {
			local964 = Static335.aByteArray92[arg1];
		} else {
			local964 = local11;
		}
		arg2.method4068(arg2.anInt4181, arg2.anInt4169, local964);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!qg;B)I")
	public static int method2161(@OriginalArg(0) Packet arg0) {
		@Pc(10) int local10 = arg0.gBit(2);
		@Pc(22) int local22;
		if (local10 == 0) {
			local22 = 0;
		} else if (local10 == 1) {
			local22 = arg0.gBit(5);
		} else if (local10 == 2) {
			local22 = arg0.gBit(8);
		} else {
			local22 = arg0.gBit(11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!qg;II)V")
	public static void method6464(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.gBit(1) == 1;
		if (local15) {
			Static52.anIntArray100[Static325.anInt6079++] = arg1;
		}
		@Pc(30) int local30 = arg0.gBit(2);
		@Pc(34) Player local34 = PlayerList.players[arg1];
		if (local30 != 0) {
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(146) int local146;
			if (local30 == 1) {
				local136 = arg0.gBit(3);
				local141 = local34.movementQueueX[0];
				local146 = local34.movementQueueZ[0];
				if (local136 == 0) {
					local146--;
					local141--;
				} else if (local136 == 1) {
					local146--;
				} else if (local136 == 2) {
					local146--;
					local141++;
				} else if (local136 == 3) {
					local141--;
				} else if (local136 == 4) {
					local141++;
				} else if (local136 == 5) {
					local146++;
					local141--;
				} else if (local136 == 6) {
					local146++;
				} else if (local136 == 7) {
					local141++;
					local146++;
				}
				if (local15) {
					local34.anInt4169 = local141;
					local34.anInt4181 = local146;
					local34.aBoolean276 = true;
				} else {
					local34.method4068(local146, local141, Static335.aByteArray92[arg1]);
				}
			} else if (local30 == 2) {
				local136 = arg0.gBit(4);
				local141 = local34.movementQueueX[0];
				local146 = local34.movementQueueZ[0];
				if (local136 == 0) {
					local141 -= 2;
					local146 -= 2;
				} else if (local136 == 1) {
					local141--;
					local146 -= 2;
				} else if (local136 == 2) {
					local146 -= 2;
				} else if (local136 == 3) {
					local141++;
					local146 -= 2;
				} else if (local136 == 4) {
					local141 += 2;
					local146 -= 2;
				} else if (local136 == 5) {
					local146--;
					local141 -= 2;
				} else if (local136 == 6) {
					local146--;
					local141 += 2;
				} else if (local136 == 7) {
					local141 -= 2;
				} else if (local136 == 8) {
					local141 += 2;
				} else if (local136 == 9) {
					local146++;
					local141 -= 2;
				} else if (local136 == 10) {
					local146++;
					local141 += 2;
				} else if (local136 == 11) {
					local141 -= 2;
					local146 += 2;
				} else if (local136 == 12) {
					local141--;
					local146 += 2;
				} else if (local136 == 13) {
					local146 += 2;
				} else if (local136 == 14) {
					local146 += 2;
					local141++;
				} else if (local136 == 15) {
					local146 += 2;
					local141 += 2;
				}
				if (local15) {
					local34.anInt4181 = local146;
					local34.aBoolean276 = true;
					local34.anInt4169 = local141;
				} else {
					local34.method4068(local146, local141, Static335.aByteArray92[arg1]);
				}
			} else {
				local136 = arg0.gBit(1);
				@Pc(411) int local411;
				@Pc(419) int local419;
				@Pc(432) int local432;
				@Pc(439) int local439;
				if (local136 == 0) {
					local141 = arg0.gBit(12);
					local146 = local141 >> 10;
					local411 = local141 >> 5 & 0x1F;
					if (local411 > 15) {
						local411 -= 32;
					}
					local419 = local141 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local432 = local411 + local34.movementQueueX[0];
					local439 = local419 + local34.movementQueueZ[0];
					if (local15) {
						local34.anInt4181 = local439;
						local34.aBoolean276 = true;
						local34.anInt4169 = local432;
					} else {
						local34.method4068(local439, local432, Static335.aByteArray92[arg1]);
					}
					local34.plane = (byte) (local146 + local34.plane & 0x3);
					if (arg1 == PlayerList.selfId) {
						Static355.anInt6585 = local34.plane;
					}
				} else {
					local141 = arg0.gBit(30);
					local146 = local141 >> 28;
					local411 = local141 >> 14 & 0x3FFF;
					local419 = local141 & 0x3FFF;
					System.out.println(local146 + " " + local411 + " " + local419);
					local432 = (local411 + Camera.originX + local34.movementQueueX[0] & 0x3FFF) - Camera.originX;
					local439 = (local34.movementQueueZ[0] + Camera.originZ + local419 & 0x3FFF) - Camera.originZ;
					if (local15) {
						local34.aBoolean276 = true;
						local34.anInt4181 = local439;
						local34.anInt4169 = local432;
					} else {
						local34.method4068(local439, local432, Static335.aByteArray92[arg1]);
					}
					local34.plane = (byte) (local34.plane + local146 & 0x3);
					if (PlayerList.selfId == arg1) {
						Static355.anInt6585 = local34.plane;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean276 = false;
		} else if (arg1 == PlayerList.selfId) {
			throw new RuntimeException("s:lr");
		} else {
			Static360.anIntArray422[arg1] = (Camera.originX + local34.movementQueueX[0] >> 6 << 14) + (local34.plane << 28) + (Camera.originZ + local34.movementQueueZ[0] >> 6);
			if (local34.anInt4174 == -1) {
				Static324.anIntArray410[arg1] = local34.aClass248_7.method6441();
			} else {
				Static324.anIntArray410[arg1] = local34.anInt4174;
			}
			Static225.anIntArray260[arg1] = local34.anInt4611;
			if (local34.soundRadius > 0) {
				AreaSoundManager.remove(local34);
			}
			PlayerList.players[arg1] = null;
			if (arg0.gBit(1) != 0) {
				method6033(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!qg;ZI)Z")
	public static boolean method6033(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.gBit(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (local8 == 0) {
			if (arg0.gBit(1) != 0) {
				method6033(arg0, arg1);
			}
			local31 = arg0.gBit(6);
			local36 = arg0.gBit(6);
			@Pc(48) boolean local48 = arg0.gBit(1) == 1;
			if (local48) {
				Static52.anIntArray100[Static325.anInt6079++] = arg1;
			}
			if (PlayerList.players[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Player local75 = PlayerList.players[arg1] = new Player();
			local75.anInt4619 = arg1;
			if (Static231.aClass2_Sub4Array1[arg1] != null) {
				local75.decodeAppearance(Static231.aClass2_Sub4Array1[arg1]);
			}
			local75.method4330(Static324.anIntArray410[arg1]);
			local75.anInt4611 = Static225.anIntArray260[arg1];
			local103 = Static360.anIntArray422[arg1];
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local117 = local103 & 0xFF;
			local75.aByteArray51[0] = Static335.aByteArray92[arg1];
			local75.plane = (byte) local107;
			local75.method4064(local31 + (local113 << 6) - Camera.originX, -Camera.originZ + local36 + (local117 << 6));
			local75.aBoolean276 = false;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.gBit(2);
			local36 = Static360.anIntArray422[arg1];
			Static360.anIntArray422[arg1] = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(201) int local201;
			@Pc(205) int local205;
			if (local8 != 2) {
				local31 = arg0.gBit(18);
				local36 = local31 >> 16;
				local201 = local31 >> 8 & 0xFF;
				local205 = local31 & 0xFF;
				local103 = Static360.anIntArray422[arg1];
				local107 = local36 + (local103 >> 28) & 0x3;
				local113 = local201 + (local103 >> 14) & 0xFF;
				local117 = local205 + local103 & 0xFF;
				Static360.anIntArray422[arg1] = (local113 << 14) + (local107 << 28) + local117;
				return false;
			}
			local31 = arg0.gBit(5);
			local36 = local31 >> 3;
			local201 = local31 & 0x7;
			local205 = Static360.anIntArray422[arg1];
			local103 = (local205 >> 28) + local36 & 0x3;
			local107 = local205 >> 14 & 0xFF;
			local113 = local205 & 0xFF;
			if (local201 == 0) {
				local107--;
				local113--;
			}
			if (local201 == 1) {
				local113--;
			}
			if (local201 == 2) {
				local113--;
				local107++;
			}
			if (local201 == 3) {
				local107--;
			}
			if (local201 == 4) {
				local107++;
			}
			if (local201 == 5) {
				local107--;
				local113++;
			}
			if (local201 == 6) {
				local113++;
			}
			if (local201 == 7) {
				local107++;
				local113++;
			}
			Static360.anIntArray422[arg1] = (local107 << 14) + (local103 << 28) + local113;
			return false;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void writeOpcode(@OriginalArg(0) ClientProt packet) {
		outboundBuffer.p1isaac(packet.getOpcode());
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method2002() {
		writeOpcode(ClientProt.WINDOW_STATUS);
		outboundBuffer.p1(DisplayMode.getWindowMode());
		outboundBuffer.p2(GameShell.canvasWidth);
		outboundBuffer.p2(GameShell.canvasHeight);
		outboundBuffer.p1(client.preferences.antiAliasingMode);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public static void method2045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		writeOpcode(ClientProt.PACKET_21);
		outboundBuffer.p4(arg0);
		outboundBuffer.ip2add(arg1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void clickPlayerOption(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = PlayerList.anInt751;
		@Pc(9) int[] local9 = PlayerList.anIntArray121;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Player local21 = PlayerList.players[local9[local13]];
			if (local21 != null && PlayerList.self != local21 && local21.username != null && local21.username.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					writeOpcode(ClientProt.PACKET_39);
					outboundBuffer.p1(0);
					outboundBuffer.ip2add(local9[local13]);
				} else if (arg0 == 4) {
					writeOpcode(ClientProt.PACKET_69);
					outboundBuffer.p1neg(0);
					outboundBuffer.ip2_dup(local9[local13]);
				} else if (arg0 == 5) {
					writeOpcode(ClientProt.PACKET_36);
					outboundBuffer.ip2_dup(local9[local13]);
					outboundBuffer.p1sub(0);
				} else if (arg0 == 6) {
					writeOpcode(ClientProt.PACKET_45);
					outboundBuffer.ip2_dup(local9[local13]);
					outboundBuffer.p1add(0);
				} else if (arg0 == 7) {
					writeOpcode(ClientProt.PACKET_27);
					outboundBuffer.p1sub(0);
					outboundBuffer.ip2add(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Chat.add(Static139.aClass79_60.getLocalized(client.language) + arg1);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method4681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Component local8 = InterfaceList.getCreatedComponent(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.onOp != null) {
			@Pc(18) HookRequest local18 = new HookRequest();
			local18.anObjectArray4 = local8.onOp;
			local18.anInt2118 = arg1;
			local18.source = local8;
			local18.aString20 = arg2;
			ScriptRunner.execute(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4273 != 0) {
			local35 = Static7.method6472(local8);
		}
		if (!local35 || !InterfaceList.getServerActiveProperties(local8).method1854(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			writeOpcode(ClientProt.IF_BUTTON);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 2) {
			writeOpcode(ClientProt.PACKET_4);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 3) {
			writeOpcode(ClientProt.PACKET_2);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 4) {
			writeOpcode(ClientProt.PACKET_43);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 5) {
			writeOpcode(ClientProt.PACKET_63);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 6) {
			writeOpcode(ClientProt.PACKET_57);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 7) {
			writeOpcode(ClientProt.PACKET_10);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 8) {
			writeOpcode(ClientProt.PACKET_17);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 9) {
			writeOpcode(ClientProt.PACKET_54);
			Static185.method3398(arg3, local8.objId, arg0);
		}
		if (arg1 == 10) {
			writeOpcode(ClientProt.PACKET_14);
			Static185.method3398(arg3, local8.objId, arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!cf;IZI)V")
	public static void method4427(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static129.aClass135_19.aClass2_130 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1006;
		@Pc(18) int local18 = arg0.anInt1009;
		@Pc(21) int local21 = arg0.anInt1005;
		@Pc(25) int local25 = (int) arg0.aLong30;
		@Pc(28) long local28 = arg0.aLong30;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		if (local21 == 21) {
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Cross.type = 2;
			Cross.ms = 0;
			writeOpcode(ClientProt.PACKET_26);
			outboundBuffer.ip2add(Camera.originZ + local18);
			outboundBuffer.p2(local15 + Camera.originX);
			outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
			outboundBuffer.ip2_dup(local25);
			Static151.method2756(local18, local15);
		}
		if (local21 == 45 || local21 == 1011) {
			method4681(local18, local25, arg0.aString11, local15);
		}
		if (local21 == 51) {
			Cross.type = 1;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Cross.ms = 0;
			writeOpcode(ClientProt.PACKET_52);
			outboundBuffer.ip2_dup(Static196.anInt3317);
			outboundBuffer.p4(Static337.anInt6317);
			outboundBuffer.ip2add(local18 + Camera.originZ);
			outboundBuffer.ip2_dup(Static214.anInt3792);
			outboundBuffer.ip2add(Camera.originX + local15);
			Static322.method5482(true, -4, local18, 0, 1, local15, 1, 0);
		}
		if (local21 == 12) {
			Cross.type = 2;
			Cross.ms = 0;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			writeOpcode(ClientProt.PACKET_40);
			outboundBuffer.ip2add((int) (local28 >>> 32) & Integer.MAX_VALUE);
			outboundBuffer.ip2add(Camera.originZ + local18);
			outboundBuffer.p2(local15 + Camera.originX);
			outboundBuffer.p1(Keyboard.instance.isPressed(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 1004) {
			Cross.ms = 0;
			Static291.anInt5504 = arg2;
			Cross.type = 2;
			Static320.anInt6005 = arg1;
			writeOpcode(ClientProt.PACKET_47);
			outboundBuffer.p2add(local18 + Camera.originZ);
			outboundBuffer.ip2_dup((int) (local28 >>> 32) & Integer.MAX_VALUE);
			outboundBuffer.p2add(Camera.originX + local15);
			outboundBuffer.p1neg(Keyboard.instance.isPressed(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		@Pc(275) Player local275;
		if (local21 == 2) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				Cross.type = 2;
				Static320.anInt6005 = arg1;
				writeOpcode(ClientProt.PACKET_27);
				outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
				outboundBuffer.ip2add(local25);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 1009) {
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Cross.ms = 0;
			Cross.type = 2;
			writeOpcode(ClientProt.PACKET_0);
			outboundBuffer.p2(local25);
		}
		if (local21 == 46) {
			Cross.ms = 0;
			Cross.type = 2;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			writeOpcode(ClientProt.PACKET_5);
			outboundBuffer.ip2_dup(Camera.originZ + local18);
			outboundBuffer.p2(local25);
			outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
			outboundBuffer.p2add(Camera.originX + local15);
			Static151.method2756(local18, local15);
		}
		if (local21 == 59) {
			if (LoginManager.staffModLevel > 0 && Keyboard.instance.isPressed(82) && Keyboard.instance.isPressed(81)) {
				Cheat.teleport(PlayerList.self.plane, local18 + Camera.originZ, local15 + Camera.originX);
			} else {
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				Static320.anInt6005 = arg1;
				Cross.type = 1;
				writeOpcode(ClientProt.PACKET_38);
				outboundBuffer.p2(local15 + Camera.originX);
				outboundBuffer.p2add(local18 + Camera.originZ);
			}
		}
		@Pc(485) Npc local485;
		if (local21 == 1006) {
			Cross.ms = 0;
			Cross.type = 2;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			local485 = NpcList.npcs[local25];
			if (local485 != null) {
				@Pc(490) NpcType local490 = local485.type;
				if (local490.multiNpcs != null) {
					local490 = local490.getMultiNpc(VarpDomain.instance);
				}
				if (local490 != null) {
					writeOpcode(ClientProt.PACKET_46);
					outboundBuffer.p2(local490.anInt2048);
				}
			}
		}
		if (local21 == 4) {
			local485 = NpcList.npcs[local25];
			if (local485 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				Cross.type = 2;
				writeOpcode(ClientProt.PACKET_70);
				outboundBuffer.ip2add(local25);
				outboundBuffer.p1(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.movementQueueZ[0], 0, local485.getSize(), local485.movementQueueX[0], local485.getSize(), 0);
			}
		}
		if (local21 == 15) {
			Cross.ms = 0;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Cross.type = 2;
			writeOpcode(ClientProt.PACKET_22);
			outboundBuffer.ip2add(local25);
			outboundBuffer.p2add(Camera.originZ + local18);
			outboundBuffer.ip2add(Camera.originX + local15);
			outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
			Static151.method2756(local18, local15);
		}
		if (local21 == 10) {
			local485 = NpcList.npcs[local25];
			if (local485 != null) {
				Static291.anInt5504 = arg2;
				Static320.anInt6005 = arg1;
				Cross.ms = 0;
				Cross.type = 2;
				writeOpcode(ClientProt.PACKET_75);
				outboundBuffer.p4(Static337.anInt6317);
				outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
				outboundBuffer.ip2add(Static196.anInt3317);
				outboundBuffer.ip2_dup(Static214.anInt3792);
				outboundBuffer.p2(local25);
				Static322.method5482(true, -2, local485.movementQueueZ[0], 0, local485.getSize(), local485.movementQueueX[0], local485.getSize(), 0);
			}
		}
		if (local21 == 17) {
			Static291.anInt5504 = arg2;
			Static320.anInt6005 = arg1;
			Cross.ms = 0;
			Cross.type = 2;
			writeOpcode(ClientProt.PACKET_72);
			outboundBuffer.ip2add(Integer.MAX_VALUE & (int) (local28 >>> 32));
			outboundBuffer.p1(Keyboard.instance.isPressed(82) ? 1 : 0);
			outboundBuffer.p2(local15 + Camera.originX);
			outboundBuffer.ip2_dup(Camera.originZ + local18);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 60) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Cross.type = 2;
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				Static320.anInt6005 = arg1;
				writeOpcode(ClientProt.PACKET_48);
				outboundBuffer.ip4_dup(Static337.anInt6317);
				outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
				outboundBuffer.ip2_dup(Static214.anInt3792);
				outboundBuffer.ip2add(Static196.anInt3317);
				outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 20) {
			Static320.anInt6005 = arg1;
			Cross.ms = 0;
			Cross.type = 2;
			Static291.anInt5504 = arg2;
			writeOpcode(ClientProt.PACKET_3);
			outboundBuffer.ip2add(Camera.originZ + local18);
			outboundBuffer.p2add(Integer.MAX_VALUE & (int) (local28 >>> 32));
			outboundBuffer.p2(Camera.originX + local15);
			outboundBuffer.p1neg(Keyboard.instance.isPressed(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 58) {
			Cross.type = 2;
			Static291.anInt5504 = arg2;
			Static320.anInt6005 = arg1;
			Cross.ms = 0;
			writeOpcode(ClientProt.PACKET_80);
			outboundBuffer.ip2add(local25);
			outboundBuffer.p1add(Keyboard.instance.isPressed(82) ? 1 : 0);
			outboundBuffer.p2(Camera.originZ + local18);
			outboundBuffer.ip2_dup(Camera.originX + local15);
			Static151.method2756(local18, local15);
		}
		if (local21 == 13) {
			Cross.ms = 0;
			Static320.anInt6005 = arg1;
			Static291.anInt5504 = arg2;
			Cross.type = 2;
			writeOpcode(ClientProt.PACKET_6);
			outboundBuffer.p2(Static196.anInt3317);
			outboundBuffer.ip2add(local25);
			outboundBuffer.ip2_dup(Camera.originX + local15);
			outboundBuffer.p1neg(Keyboard.instance.isPressed(82) ? 1 : 0);
			outboundBuffer.ip2add(Static214.anInt3792);
			outboundBuffer.mp4(Static337.anInt6317);
			outboundBuffer.ip2add(Camera.originZ + local18);
			Static151.method2756(local18, local15);
		}
		if (local21 == 23) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Cross.type = 2;
				Static320.anInt6005 = arg1;
				Cross.ms = 0;
				Static291.anInt5504 = arg2;
				writeOpcode(ClientProt.PACKET_45);
				outboundBuffer.ip2_dup(local25);
				outboundBuffer.p1add(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 6) {
			Static291.anInt5504 = arg2;
			Static320.anInt6005 = arg1;
			Cross.ms = 0;
			Cross.type = 2;
			writeOpcode(ClientProt.PACKET_79);
			outboundBuffer.p2(local25);
			outboundBuffer.p1add(Keyboard.instance.isPressed(82) ? 1 : 0);
			outboundBuffer.p2add(local15 + Camera.originX);
			outboundBuffer.p2(Camera.originZ + local18);
			Static151.method2756(local18, local15);
		}
		if (local21 == 22) {
			if (LoginManager.staffModLevel > 0 && Keyboard.instance.isPressed(82) && Keyboard.instance.isPressed(81)) {
				Cheat.teleport(PlayerList.self.plane, Camera.originZ + local18, local15 + Camera.originX);
			} else {
				method1736(local15, local18, local25);
				if (local25 == 1) {
					outboundBuffer.p1(-1);
					outboundBuffer.p1(-1);
					outboundBuffer.p2((int) Camera.yaw);
					outboundBuffer.p1(57);
					outboundBuffer.p1(Static6.anInt158);
					outboundBuffer.p1(Static97.anInt2005);
					outboundBuffer.p1(89);
					outboundBuffer.p2(PlayerList.self.xFine);
					outboundBuffer.p2(PlayerList.self.zFine);
					outboundBuffer.p1(63);
				} else {
					Static320.anInt6005 = arg1;
					Cross.ms = 0;
					Cross.type = 1;
					Static291.anInt5504 = arg2;
				}
				Static322.method5482(true, -4, local18, 0, 1, local15, 1, 0);
			}
		}
		if (local21 == 50) {
			Static291.anInt5504 = arg2;
			Cross.ms = 0;
			Cross.type = 2;
			Static320.anInt6005 = arg1;
			writeOpcode(ClientProt.OPLOC1);
			outboundBuffer.ip2_dup((int) (local28 >>> 32) & Integer.MAX_VALUE);
			outboundBuffer.ip2_dup(local15 + Camera.originX);
			outboundBuffer.ip2_dup(Camera.originZ + local18);
			outboundBuffer.p1(Keyboard.instance.isPressed(82) ? 1 : 0);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 8) {
			local485 = NpcList.npcs[local25];
			if (local485 != null) {
				Static291.anInt5504 = arg2;
				Cross.type = 2;
				Cross.ms = 0;
				Static320.anInt6005 = arg1;
				writeOpcode(ClientProt.PACKET_68);
				outboundBuffer.p2(local25);
				outboundBuffer.p1add(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.movementQueueZ[0], 0, local485.getSize(), local485.movementQueueX[0], local485.getSize(), 0);
			}
		}
		if (local21 == 48) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Static320.anInt6005 = arg1;
				Cross.type = 2;
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				writeOpcode(ClientProt.PACKET_41);
				outboundBuffer.p1(Keyboard.instance.isPressed(82) ? 1 : 0);
				outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 25) {
			local485 = NpcList.npcs[local25];
			if (local485 != null) {
				Cross.type = 2;
				Cross.ms = 0;
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				writeOpcode(ClientProt.PACKET_50);
				outboundBuffer.ip2add(local25);
				outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.movementQueueZ[0], 0, local485.getSize(), local485.movementQueueX[0], local485.getSize(), 0);
			}
		}
		if (local21 == 57) {
			Static320.anInt6005 = arg1;
			Cross.ms = 0;
			Cross.type = 2;
			Static291.anInt5504 = arg2;
			writeOpcode(ClientProt.PACKET_9);
			outboundBuffer.ip2_dup(Integer.MAX_VALUE & (int) (local28 >>> 32));
			outboundBuffer.imp4(Static337.anInt6317);
			outboundBuffer.p2(Static196.anInt3317);
			outboundBuffer.p1(Keyboard.instance.isPressed(82) ? 1 : 0);
			outboundBuffer.ip2add(Static214.anInt3792);
			outboundBuffer.p2(Camera.originX + local15);
			outboundBuffer.p2(Camera.originZ + local18);
			Static172.method3285(local18, local28, local15);
		}
		if (local21 == 5) {
			local485 = NpcList.npcs[local25];
			if (local485 != null) {
				Cross.ms = 0;
				Cross.type = 2;
				Static291.anInt5504 = arg2;
				Static320.anInt6005 = arg1;
				writeOpcode(ClientProt.PACKET_28);
				outboundBuffer.p1neg(Keyboard.instance.isPressed(82) ? 1 : 0);
				outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local485.movementQueueZ[0], 0, local485.getSize(), local485.movementQueueX[0], local485.getSize(), 0);
			}
		}
		if (local21 == 18) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Cross.type = 2;
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				Static320.anInt6005 = arg1;
				writeOpcode(ClientProt.PACKET_35);
				outboundBuffer.ip2add(local25);
				outboundBuffer.p1add(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 9) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Cross.ms = 0;
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Cross.type = 2;
				writeOpcode(ClientProt.PACKET_36);
				outboundBuffer.ip2_dup(local25);
				outboundBuffer.p1sub(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		@Pc(1723) Component local1723;
		if (local21 == 49) {
			local1723 = InterfaceList.getCreatedComponent(local18, local15);
			if (local1723 != null) {
				Static207.method3699();
				@Pc(1730) ServerActiveProperties local1730 = InterfaceList.getServerActiveProperties(local1723);
				Static185.method3400(local1723.anInt4238, local1730.getTargetMask(), local18, local15, local1723.anInt4286, local1730.anInt1759);
				Static91.aString18 = Static163.method3104(local1723);
				if (Static91.aString18 == null) {
					Static91.aString18 = "Null";
				}
				Static371.aString68 = local1723.opBase + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 1010) {
			Static320.anInt6005 = arg1;
			Cross.type = 2;
			Static291.anInt5504 = arg2;
			Cross.ms = 0;
			writeOpcode(ClientProt.GET_EXAMINE);
			outboundBuffer.p2(local25);
		}
		if (local21 == 19) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Cross.type = 2;
				Cross.ms = 0;
				writeOpcode(ClientProt.PACKET_32);
				outboundBuffer.ip2add(local25);
				outboundBuffer.p1neg(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 1008 || local21 == 1002 || local21 == 1012 || local21 == 1003 || local21 == 1007) {
			ScriptRunner.method3809(local25, local21, local15);
		}
		if (local21 == 11) {
			local1723 = InterfaceList.getCreatedComponent(local18, local15);
			if (local1723 != null) {
				method6129(local1723);
			}
		}
		if (local21 == 47) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				Cross.type = 2;
				writeOpcode(ClientProt.PACKET_69);
				outboundBuffer.p1neg(Keyboard.instance.isPressed(82) ? 1 : 0);
				outboundBuffer.ip2_dup(local25);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 30 && Static192.aClass161_8 == null) {
			method2045(local18, local15);
			Static192.aClass161_8 = InterfaceList.getCreatedComponent(local18, local15);
			InterfaceList.redraw(Static192.aClass161_8);
		}
		if (local21 == 44) {
			local275 = PlayerList.players[local25];
			if (local275 != null) {
				Cross.ms = 0;
				Static291.anInt5504 = arg2;
				Cross.type = 2;
				Static320.anInt6005 = arg1;
				writeOpcode(ClientProt.PACKET_39);
				outboundBuffer.p1(Keyboard.instance.isPressed(82) ? 1 : 0);
				outboundBuffer.ip2add(local25);
				Static322.method5482(true, -2, local275.movementQueueZ[0], 0, local275.getSize(), local275.movementQueueX[0], local275.getSize(), 0);
			}
		}
		if (local21 == 3) {
			local485 = NpcList.npcs[local25];
			if (local485 != null) {
				Static320.anInt6005 = arg1;
				Static291.anInt5504 = arg2;
				Cross.ms = 0;
				Cross.type = 2;
				writeOpcode(ClientProt.PACKET_31);
				outboundBuffer.p2(local25);
				outboundBuffer.p1neg(Keyboard.instance.isPressed(82) ? 1 : 0);
				Static322.method5482(true, -2, local485.movementQueueZ[0], 0, local485.getSize(), local485.movementQueueX[0], local485.getSize(), 0);
			}
		}
		if (Static330.aBoolean419) {
			Static207.method3699();
		}
		if (MiniMenu.pressedInventoryComponent != null && MiniMenu.anInt2293 == 0) {
			InterfaceList.redraw(MiniMenu.pressedInventoryComponent);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V")
	public static void method2973(@OriginalArg(1) boolean arg0) {
		client.audioLogic();
		if (client.gameState != 30 && client.gameState != 25) {
			return;
		}
		Static367.anInt6876++;
		if (Static367.anInt6876 < 50 && !arg0) {
			return;
		}
		Static367.anInt6876 = 0;
		if (!LoginManager.aBoolean158 && socket != null) {
			writeOpcode(ClientProt.NO_TIMEOUT);
			try {
				socket.write(outboundBuffer.pos, outboundBuffer.data);
				outboundBuffer.pos = 0;
			} catch (@Pc(57) IOException local57) {
				LoginManager.aBoolean158 = true;
			}
		}
		client.audioLogic();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method2432() {
		writeOpcode(ClientProt.TRANSMITVAR_VERIFYID);
		outboundBuffer.p2(verifyId);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nk;ZLclient!nk;)V")
	public static void method5096(@OriginalArg(0) Component arg0, @OriginalArg(2) Component arg1) {
		writeOpcode(ClientProt.PACKET_13);
		outboundBuffer.p4(arg1.id);
		outboundBuffer.ip2add(arg1.objId);
		outboundBuffer.p2add(arg1.activeComponentId);
		outboundBuffer.mp4(arg0.id);
		outboundBuffer.ip2add(arg0.objId);
		outboundBuffer.ip2_dup(arg0.activeComponentId);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method6129(@OriginalArg(0) Component arg0) {
		if (!Static330.aBoolean419) {
			return;
		}
		writeOpcode(ClientProt.PACKET_11);
		outboundBuffer.p4(arg0.id);
		outboundBuffer.p2add(arg0.activeComponentId);
		outboundBuffer.p2add(Static214.anInt3792);
		outboundBuffer.p2(Static196.anInt3317);
		outboundBuffer.mp4(Static337.anInt6317);
		outboundBuffer.p2(arg0.objId);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIII)V")
	public static void method1736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			writeOpcode(ClientProt.MOVE_GAMECLICK);
		}
		if (arg2 == 1) {
			writeOpcode(ClientProt.MOVE_MINIMAPCLICK);
		}
		outboundBuffer.p1add(Keyboard.instance.isPressed(82) ? 1 : 0);
		outboundBuffer.p2(arg0 + Camera.originX);
		outboundBuffer.ip2_dup(arg1 + Camera.originZ);
		Static370.aBoolean474 = false;
		Static358.anInt6550 = arg0;
		Static312.anInt5844 = arg1;
		Static359.method6009();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static void mainLogic() {
		if (anInt1870 > 0) {
			anInt1870--;
		}
		if (Player.rebootTimer > 1) {
			Player.rebootTimer--;
			InterfaceList.miscTransmitAt = InterfaceList.transmitTimer;
		}
		if (LoginManager.aBoolean158) {
			LoginManager.aBoolean158 = false;
			method3725();
			return;
		}
		if (!Static375.aBoolean477) {
			Static147.method2703();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && readPacket(); local36++) {
		}
		if (client.gameState != 30) {
			return;
		}
		ReflectionCheck.mainLogic(outboundBuffer, ClientProt.REFLECTION_CHECK.getOpcode());
		if (Static385.aClass2_Sub16_2 == null) {
			if (MonotonicClock.currentTimeMillis() >= Static375.aLong222) {
				Static385.aClass2_Sub16_2 = Static4.aClass162_1.method4114(client.hostname);
			}
		} else if (Static385.aClass2_Sub16_2.anInt2419 != -1) {
			writeOpcode(ClientProt.IDLE_TIMER);
			outboundBuffer.p2(Static385.aClass2_Sub16_2.anInt2419);
			Static385.aClass2_Sub16_2 = null;
			Static375.aLong222 = MonotonicClock.currentTimeMillis() + 30000L;
		}
		@Pc(112) int local112;
		@Pc(135) int local135;
		@Pc(153) int local153;
		@Pc(169) boolean local169;
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(236) int local236;
		if (Mouse.clickButton != null || MouseRecorder.mouseRecorderPrevTime < MonotonicClock.currentTimeMillis() - 2000L) {
			@Pc(109) boolean local109 = false;
			local112 = outboundBuffer.pos;
			for (@Pc(117) MouseRecorder local117 = (MouseRecorder) MouseRecorder.samples.head(); local117 != null && outboundBuffer.pos - local112 < 240; local117 = (MouseRecorder) MouseRecorder.samples.next()) {
				local117.unlink();
				local135 = local117.getX();
				if (local135 < 0) {
					local135 = 0;
				} else if (local135 > 65534) {
					local135 = 65534;
				}
				local153 = local117.getY();
				if (local153 < 0) {
					local153 = 0;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				boolean outsideWindow = false;
				if (local117.getX() == -1 && local117.getY() == -1) {
					local153 = -1;
					outsideWindow = true;
					local135 = -1;
				}
				if (MouseRecorder.mouseRecorderPrevX != local153 || local135 != MouseRecorder.mouseRecorderPrevY) {
					if (!local109) {
						writeOpcode(ClientProt.EVENT_MOUSE_MOVE);
						outboundBuffer.p1(0);
						local112 = outboundBuffer.pos;
						local109 = true;
					}
					local219 = local153 - MouseRecorder.mouseRecorderPrevX;
					MouseRecorder.mouseRecorderPrevX = local153;
					local225 = local135 - MouseRecorder.mouseRecorderPrevY;
					MouseRecorder.mouseRecorderPrevY = local135;
					local236 = (int) ((local117.getTime() - MouseRecorder.mouseRecorderPrevTime) / 20L);
					if (local236 < 8 && local219 >= -32 && local219 <= 31 && local225 >= -32 && local225 <= 31) {
						local219 += 32;
						local225 += 32;
						outboundBuffer.p2((local219 << 6) + (local236 << 12) + local225);
					} else if (local236 < 32 && local219 >= -128 && local219 <= 127 && local225 >= -128 && local225 <= 127) {
						local225 += 128;
						local219 += 128;
						outboundBuffer.p1(local236 + 128);
						outboundBuffer.p2((local219 << 8) + local225);
					} else if (local236 >= 32) {
						outboundBuffer.p2(local236 + 57344);
						if (outsideWindow) {
							outboundBuffer.p4(Integer.MIN_VALUE);
						} else {
							outboundBuffer.p4(local153 | local135 << 16);
						}
					} else {
						outboundBuffer.p1(local236 + 192);
						if (outsideWindow) {
							outboundBuffer.p4(Integer.MIN_VALUE);
						} else {
							outboundBuffer.p4(local135 << 16 | local153);
						}
					}
					MouseRecorder.mouseRecorderPrevTime = local117.getTime();
				}
			}
			if (local109) {
				outboundBuffer.psize1(outboundBuffer.pos - local112);
			}
		}
		@Pc(410) int local410;
		@Pc(463) int local463;
		if (Mouse.clickButton != null) {
			@Pc(394) long local394 = (Mouse.clickButton.getTime() - Mouse.prevClickTime) / 50L;
			if (local394 > 32767L) {
				local394 = 32767L;
			}
			Mouse.prevClickTime = Mouse.clickButton.getTime();
			local410 = Mouse.clickButton.getX();
			if (local410 < 0) {
				local410 = 0;
			} else if (local410 > 65535) {
				local410 = 65535;
			}
			local135 = Mouse.clickButton.getY();
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 65535) {
				local135 = 65535;
			}
			@Pc(446) byte local446 = 0;
			if (Mouse.clickButton.method5247() == 2) {
				local446 = 1;
			}
			writeOpcode(ClientProt.EVENT_MOUSE_CLICK);
			local463 = (int) local394;
			outboundBuffer.p2(local446 << 15 | local463);
			outboundBuffer.ip4_dup(local135 | local410 << 16);
		}
		@Pc(483) int local483;
		if (Static6.anInt159 > 0) {
			local483 = 0;
			for (local112 = 0; local112 < Static6.anInt159; local112++) {
				if (Static156.aClass37Array1[local112].method1459()) {
					local483++;
				}
			}
			if (local483 > 0) {
				writeOpcode(ClientProt.EVENT_KEYBOARD);
				if (local483 > 75) {
					local483 = 75;
				}
				outboundBuffer.p1(local483 * 3);
				for (local410 = 0; local410 < Static6.anInt159; local410++) {
					@Pc(531) Class37 local531 = Static156.aClass37Array1[local410];
					if (local531.method1459()) {
						@Pc(544) long local544 = (local531.method1457() - Static352.aLong202) / 50L;
						Static352.aLong202 = local531.method1457();
						if (local544 > 65535L) {
							local544 = 65535L;
						}
						outboundBuffer.p1(local531.method1461());
						outboundBuffer.p2((int) local544);
					}
				}
			}
		}
		if (Camera.anInt7153 > 0) {
			Camera.anInt7153--;
		}
		if (Camera.aBoolean156 && Camera.anInt7153 <= 0) {
			Camera.aBoolean156 = false;
			Camera.anInt7153 = 20;
			writeOpcode(ClientProt.EVENT_CAMERA_POSITION);
			outboundBuffer.p2((int) Camera.yaw >> 3);
			outboundBuffer.ip2_dup((int) Camera.pitch >> 3);
		}
		if (GameShell.focus && !GameShell.prevFocus) {
			GameShell.prevFocus = true;
			writeOpcode(ClientProt.EVENT_APPLET_FOCUS);
			outboundBuffer.p1(1);
		}
		if (!GameShell.focus && GameShell.prevFocus) {
			GameShell.prevFocus = false;
			writeOpcode(ClientProt.EVENT_APPLET_FOCUS);
			outboundBuffer.p1(0);
		}
		if (!Preferences.sentToServer) {
			writeOpcode(ClientProt.PACKET_42);
			outboundBuffer.p1(0);
			local483 = outboundBuffer.pos;
			@Pc(672) Buffer local672 = client.preferences.encode();
			outboundBuffer.pdata(local672.data, local672.pos);
			outboundBuffer.psize1(outboundBuffer.pos - local483);
			Preferences.sentToServer = true;
		}
		if (Scene.aClass67ArrayArrayArray3 != null) {
			if (Camera.anInt5911 == 2) {
				Static222.method3917();
			} else if (Camera.anInt5911 == 3) {
				Static199.method5249();
			}
		}
		if (Static140.aBoolean187) {
			Static140.aBoolean187 = false;
		} else {
			Static296.aFloat68 /= 2.0F;
		}
		if (Static369.aBoolean471) {
			Static369.aBoolean471 = false;
		} else {
			Static184.aFloat39 /= 2.0F;
		}
		Static183.method68();
		if (client.gameState != 30) {
			return;
		}
		Static56.method1611();
		ChangeLocRequest.mainLogic();
		AttachLocRequest.loop();
		SoundPlayer.mainLogic();
		LoginManager.anInt4955++;
		if (LoginManager.anInt4955 > 750) {
			method3725();
			return;
		}
		Static386.method6029();
		Static61.method1673();
		Static303.method5210();
		for (local483 = VarpDomain.instance.poll(true); local483 != -1; local483 = VarpDomain.instance.poll(false)) {
			VarpDomain.refreshMagicVarp(local483);
			VarpDomain.updatedVarps[VarpDomain.updatedVarpsWriterIndex++ & 0x1F] = local483;
		}
		@Pc(830) Component local830;
		for (@Pc(790) DelayedStateChange local790 = Static129.method2437(); local790 != null; local790 = Static129.method2437()) {
			local410 = local790.getType();
			local135 = local790.getId();
			if (local410 == 1) {
				VarcDomain.varcs[local135] = local790.intArg1;
				VarcDomain.aBoolean374 |= Static89.aBooleanArray18[local135];
				VarcDomain.updatedVarcs[VarcDomain.updatedVarcsWriterIndex++ & 0x1F] = local135;
			} else if (local410 == 2) {
				VarcDomain.varcstrs[local135] = local790.stringArg;
				VarcDomain.anIntArray444[VarcDomain.updatedVarcstrsWriterIndex++ & 0x1F] = local135;
			} else if (local410 == 3) {
				local830 = InterfaceList.getComponent(local135);
				if (!local790.stringArg.equals(local830.text)) {
					local830.text = local790.stringArg;
					InterfaceList.redraw(local830);
				}
			} else if (local410 == 4) {
				local830 = InterfaceList.getComponent(local135);
				local463 = local790.intArg1;
				local219 = local790.intArg3;
				local225 = local790.intArg2;
				if (local830.modelType != local463 || local219 != local830.modelId || local830.anInt4236 != local225) {
					local830.modelId = local219;
					local830.anInt4236 = local225;
					local830.modelType = local463;
					InterfaceList.redraw(local830);
				}
			} else if (local410 == 5) {
				local830 = InterfaceList.getComponent(local135);
				if (local790.intArg1 != local830.modelSeqId || local790.intArg1 == -1) {
					local830.anInt4316 = 1;
					local830.anInt4247 = 0;
					local830.modelSeqId = local790.intArg1;
					local830.anInt4283 = 0;
					InterfaceList.redraw(local830);
				}
			} else if (local410 == 6) {
				local153 = local790.intArg1;
				local463 = local153 >> 10 & 0x1F;
				local219 = local153 >> 5 & 0x1F;
				local225 = local153 & 0x1F;
				local236 = (local463 << 19) + ((local219 << 11) + (local225 << 3));
				@Pc(1214) Component local1214 = InterfaceList.getComponent(local135);
				if (local1214.color != local236) {
					local1214.color = local236;
					InterfaceList.redraw(local1214);
				}
			} else if (local410 == 7) {
				local830 = InterfaceList.getComponent(local135);
				local169 = local790.intArg1 == 1;
				if (local830.hidden != local169) {
					local830.hidden = local169;
					InterfaceList.redraw(local830);
				}
			} else if (local410 == 8) {
				local830 = InterfaceList.getComponent(local135);
				if (local790.intArg1 != local830.modelXAngle || local830.modelYAngle != local790.intArg3 || local790.intArg2 != local830.modelZoom) {
					local830.modelZoom = local790.intArg2;
					local830.modelYAngle = local790.intArg3;
					local830.modelXAngle = local790.intArg1;
					if (local830.objId != -1) {
						if (local830.anInt4251 > 0) {
							local830.modelZoom = local830.modelZoom * 32 / local830.anInt4251;
						} else if (local830.baseWidth > 0) {
							local830.modelZoom = local830.modelZoom * 32 / local830.baseWidth;
						}
					}
					InterfaceList.redraw(local830);
				}
			} else if (local410 == 9) {
				local830 = InterfaceList.getComponent(local135);
				if (local830.objId != local790.intArg1 || local830.objCount != local790.intArg3) {
					local830.objCount = local790.intArg3;
					local830.objId = local790.intArg1;
					InterfaceList.redraw(local830);
				}
			} else if (local410 == 10) {
				local830 = InterfaceList.getComponent(local135);
				if (local790.intArg1 != local830.modelXOffset || local790.intArg3 != local830.modelZOffset || local830.modelYOffset != local790.intArg2) {
					local830.modelYOffset = local790.intArg2;
					local830.modelXOffset = local790.intArg1;
					local830.modelZOffset = local790.intArg3;
					InterfaceList.redraw(local830);
				}
			} else if (local410 == 11) {
				local830 = InterfaceList.getComponent(local135);
				local830.yMode = 0;
				local830.xMode = 0;
				local830.y = local830.baseY = local790.intArg3;
				local830.x = local830.baseX = local790.intArg1;
				InterfaceList.redraw(local830);
			} else if (local410 == 12) {
				local830 = InterfaceList.getComponent(local135);
				local463 = local790.intArg1;
				if (local830 != null && local830.type == 0) {
					if (local463 > local830.scrollMaxV - local830.height) {
						local463 = local830.scrollMaxV - local830.height;
					}
					if (local463 < 0) {
						local463 = 0;
					}
					if (local463 != local830.scrollY) {
						local830.scrollY = local463;
						InterfaceList.redraw(local830);
					}
				}
			} else if (local410 == 14) {
				local830 = InterfaceList.getComponent(local135);
				local830.spriteId = local790.intArg1;
			} else if (local410 == 15) {
				Static312.anInt5844 = local790.intArg3;
				Static370.aBoolean474 = true;
				Static358.anInt6550 = local790.intArg1;
			} else if (local410 == 16) {
				local830 = InterfaceList.getComponent(local135);
				local830.font = local790.intArg1;
			}
		}
		if (Cross.type != 0) {
			Cross.ms += 20;
			if (Cross.ms >= 400) {
				Cross.type = 0;
			}
		}
		client.sceneDelta++;
		if (MiniMenu.pressedInventoryComponent != null) {
			MiniMenu.anInt2293++;
			if (MiniMenu.anInt2293 >= 15) {
				InterfaceList.redraw(MiniMenu.pressedInventoryComponent);
				MiniMenu.pressedInventoryComponent = null;
			}
		}
		WorldMap.aClass161_11 = null;
		Static182.aClass161_7 = null;
		Static278.aBoolean377 = false;
		Static301.aBoolean403 = false;
		Static374.method6274(-1, null, -1);
		Static65.method1735(-1, null, -1);
		Static309.method5278();
		InterfaceList.transmitTimer++;
		if (Static332.aBoolean427) {
			writeOpcode(ClientProt.PACKET_65);
			outboundBuffer.ip4_dup(Static283.anInt5351 << 28 | Static282.anInt5347 << 14 | Static4.anInt89);
			Static332.aBoolean427 = false;
		}
		while (true) {
			@Pc(1416) HookRequest local1416;
			@Pc(1421) Component local1421;
			do {
				local1416 = (HookRequest) InterfaceList.highPriorityRequests.removeHead();
				if (local1416 == null) {
					while (true) {
						do {
							local1416 = (HookRequest) InterfaceList.mediumPriorityRequests.removeHead();
							if (local1416 == null) {
								while (true) {
									do {
										local1416 = (HookRequest) InterfaceList.lowPriorityRequests.removeHead();
										if (local1416 == null) {
											if (WorldMap.aClass161_11 == null) {
												InterfaceList.anInt6449 = 0;
											}
											if (Cs1ScriptRunner.aClass161_14 != null) {
												Cs1ScriptRunner.method2398();
											}
											if (LoginManager.staffModLevel > 0 && Keyboard.instance.isPressed(82) && Keyboard.instance.isPressed(81) && MouseWheel.wheelRotation != 0) {
												local410 = PlayerList.self.plane - MouseWheel.wheelRotation;
												if (local410 < 0) {
													local410 = 0;
												} else if (local410 > 3) {
													local410 = 3;
												}
												Cheat.teleport(local410, Camera.originZ + PlayerList.self.movementQueueZ[0], PlayerList.self.movementQueueX[0] + Camera.originX);
											}
											Static315.method5381();
											for (local410 = 0; local410 < 5; local410++) {
												@Pc(1612) int local1612 = Static116.anIntArray149[local410]++;
											}
											if (VarcDomain.aBoolean374 && Static375.aLong221 < MonotonicClock.currentTimeMillis() - 60000L) {
												Static340.method5765();
											}
											Camera.anInt28++;
											if (Camera.anInt28 > 500) {
												Camera.anInt28 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x4) == 4) {
													Camera.anInt3966 += Camera.anInt213;
												}
												if ((local135 & 0x1) == 1) {
													Camera.anInt642 += Camera.anInt2705;
												}
												if ((local135 & 0x2) == 2) {
													Camera.anInt327 += Camera.anInt4897;
												}
											}
											if (Camera.anInt642 < -50) {
												Camera.anInt2705 = 2;
											}
											if (Camera.anInt327 < -55) {
												Camera.anInt4897 = 2;
											}
											if (Camera.anInt642 > 50) {
												Camera.anInt2705 = -2;
											}
											if (Camera.anInt3966 < -40) {
												Camera.anInt213 = 1;
											}
											if (Camera.anInt327 > 55) {
												Camera.anInt4897 = -2;
											}
											Static285.anInt5375++;
											if (Camera.anInt3966 > 40) {
												Camera.anInt213 = -1;
											}
											if (Static285.anInt5375 > 500) {
												Static285.anInt5375 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x1) == 1) {
													Static6.anInt158 += Static262.anInt6999;
												}
												if ((local135 & 0x2) == 2) {
													Static97.anInt2005 += Static37.anInt949;
												}
											}
											if (Static6.anInt158 < -60) {
												Static262.anInt6999 = 2;
											}
											if (Static6.anInt158 > 60) {
												Static262.anInt6999 = -2;
											}
											if (Static97.anInt2005 < -20) {
												Static37.anInt949 = 1;
											}
											Static367.anInt6876++;
											if (Static97.anInt2005 > 10) {
												Static37.anInt949 = -1;
											}
											if (Static367.anInt6876 > 50) {
												writeOpcode(ClientProt.NO_TIMEOUT);
											}
											if (Static1.aBoolean1) {
												method2432();
												Static1.aBoolean1 = false;
											}
											try {
												if (socket != null && outboundBuffer.pos > 0) {
													Static175.anInt3348 += outboundBuffer.pos;
													socket.write(outboundBuffer.pos, outboundBuffer.data);
													Static367.anInt6876 = 0;
													outboundBuffer.pos = 0;
													return;
												}
												return;
											} catch (@Pc(1823) IOException local1823) {
												method3725();
												return;
											}
										}
										local1421 = local1416.source;
										if (local1421.activeComponentId < 0) {
											break;
										}
										local830 = InterfaceList.getComponent(local1421.layer);
									} while (local830 == null || local830.activeComponents == null || local830.activeComponents.length <= local1421.activeComponentId || local1421 != local830.activeComponents[local1421.activeComponentId]);
									ScriptRunner.execute(local1416);
								}
							}
							local1421 = local1416.source;
							if (local1421.activeComponentId < 0) {
								break;
							}
							local830 = InterfaceList.getComponent(local1421.layer);
						} while (local830 == null || local830.activeComponents == null || local830.activeComponents.length <= local1421.activeComponentId || local1421 != local830.activeComponents[local1421.activeComponentId]);
						ScriptRunner.execute(local1416);
					}
				}
				local1421 = local1416.source;
				if (local1421.activeComponentId < 0) {
					break;
				}
				local830 = InterfaceList.getComponent(local1421.layer);
			} while (local830 == null || local830.activeComponents == null || local830.activeComponents.length <= local1421.activeComponentId || local1421 != local830.activeComponents[local1421.activeComponentId]);
			ScriptRunner.execute(local1416);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	public static void method3725() {
		if (anInt1870 > 0) {
			LoginManager.logout();
		} else {
			aClass111_2 = socket;
			socket = null;
			client.setGameState(40);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!s;I)V")
	public static void readZonePacket(@OriginalArg(0) ZoneProt packet) {
		if (packet == ZoneProt.MAP_PROJANIM_HALFSQ) {
			int pos = inboundBuffer.g1();
			int x = zoneX * 2 + (pos >> 4 & 0xF);
			int z = zoneZ * 2 + (pos & 0xF);

			int dstX = x + inboundBuffer.g1b();
			int dstZ = z + inboundBuffer.g1b();
			int target = inboundBuffer.g2s();
			int spotAnim = inboundBuffer.g2();
			int srcHeight = inboundBuffer.g1() * 4;
			int dstHeight = inboundBuffer.g1() * 4;
			int start = inboundBuffer.g2();
			int end = inboundBuffer.g2();
			int peak = inboundBuffer.g1();
			int arc = inboundBuffer.g1();

			if (peak == 255) {
				peak = -1;
			}

			if (x >= 0 && z >= 0 && Static373.buildAreaLimitX * 2 > x && Static373.buildAreaLimitX * 2 > z && dstX >= 0 && dstZ >= 0 && Static242.buildAreaLimitZ * 2 > dstX && dstZ < Static242.buildAreaLimitZ * 2 && spotAnim != 65535) {
				x = x * 64;
				z = z * 64;

				dstX = dstX * 64;
				dstZ = dstZ * 64;

				ProjAnim proj = new ProjAnim(spotAnim, Player.level, x, z, Scene.getTileHeight(x, z, Player.level) - srcHeight, start + client.cycle, client.cycle + end, peak, arc, target, dstHeight);
				proj.setTarget(Scene.getTileHeight(dstX, dstZ, Player.level) - dstHeight, dstX, client.cycle + start, dstZ);
				Static332.projAnims.addTail(new ProjAnimNode(proj));
			}
		} else if (packet == ZoneProt.OBJ_COUNT) {
			int pos = inboundBuffer.g1();
			int x = (pos >> 4 & 0x7) + zoneX;
			int z = (pos & 0x7) + zoneZ;

			int type = inboundBuffer.g2();
			int oldCount = inboundBuffer.g2();
			int newCount = inboundBuffer.g2();

			if (Static120.objStacks != null && x >= 0 && z >= 0 && x < Static373.buildAreaLimitX && Static242.buildAreaLimitZ > z) {
				@Pc(269) Class2_Sub32 local269 = (Class2_Sub32) Static120.objStacks.get((long) (x | Player.level << 28 | z << 14));
				if (local269 != null) {
					for (@Pc(277) ObjStack objStack = (ObjStack) local269.aClass135_34.head(); objStack != null; objStack = (ObjStack) local269.aClass135_34.next()) {
						if (objStack.type == (type & 0x7FFF) && oldCount == objStack.count) {
							objStack.unlink();
							objStack.count = newCount;
							Static137.addObjStack(z, x, objStack, Player.level);
							break;
						}
					}

					Static165.sortObjStack(x, Player.level, z);
				}
			}
		} else if (packet == ZoneProt.MAP_PROJANIM_SPECIFIC) {
			int pos = inboundBuffer.g1();
			int x = zoneX * 2 + (pos >> 4 & 0xF);
			int z = (pos & 0xF) + zoneZ * 2;

			int dstX = inboundBuffer.g1b() + x;
			int dstZ = inboundBuffer.g1b() + z;
			int sourceEntity = inboundBuffer.g2s();
			int targetEntity = inboundBuffer.g2s();
			int spotAnim = inboundBuffer.g2();
			int srcHeight = inboundBuffer.g1b();
			int dstHeight = inboundBuffer.g1() * 4;
			int start = inboundBuffer.g2();
			int end = inboundBuffer.g2();
			int peak = inboundBuffer.g1();
			int arc = inboundBuffer.g1();

			if (peak == 255) {
				peak = -1;
			}

			if (x >= 0 && z >= 0 && x < Static373.buildAreaLimitX * 2 && Static373.buildAreaLimitX * 2 > z && dstX >= 0 && dstZ >= 0 && dstX < Static242.buildAreaLimitZ * 2 && dstZ < Static242.buildAreaLimitZ * 2 && spotAnim != 65535) {
				x = x * 64;
				z = z * 64;

				dstX = dstX * 64;
				dstZ = dstZ * 64;

				if (sourceEntity != 0) {
					@Pc(483) int local483;
					@Pc(491) PathingEntity local491;
					@Pc(477) int local477;
					@Pc(487) int local487;

					if (sourceEntity >= 0) {
						local477 = sourceEntity - 1;
						local483 = local477 >> 11 & 0xF;
						local487 = local477 & 0x7FF;
						local491 = NpcList.npcs[local487];
					} else {
						local477 = -sourceEntity - 1;
						local483 = local477 >> 11 & 0xF;
						local487 = local477 & 0x7FF;
						if (PlayerList.selfId == local487) {
							local491 = PlayerList.self;
						} else {
							local491 = PlayerList.players[local487];
						}
					}

					if (local491 != null) {
						@Pc(525) BasType bas = local491.getBasType();
						if (bas.equipmentTransforms != null && bas.equipmentTransforms[local483] != null) {
							local487 = bas.equipmentTransforms[local483][0];
							@Pc(547) int local547 = bas.equipmentTransforms[local483][2];
							@Pc(552) int local552 = local491.aClass248_7.method6441();
							@Pc(556) int local556 = RasteriserBase.anIntArray178[local552];
							@Pc(560) int local560 = RasteriserBase.anIntArray177[local552];
							@Pc(571) int local571 = local556 * local547 + local487 * local560 >> 15;
							@Pc(582) int local582 = local547 * local560 - local556 * local487 >> 15;
							srcHeight -= bas.equipmentTransforms[local483][1];
							x += local571;
							z += local582;
						}
					}
				}

				@Pc(628) ProjAnim proj = new ProjAnim(spotAnim, Player.level, x, z, Scene.getTileHeight(x, z, Player.level) - srcHeight, client.cycle + start, end + client.cycle, peak, arc, targetEntity, dstHeight);
				proj.setTarget(Scene.getTileHeight(dstX, dstZ, Player.level) - dstHeight, dstX, client.cycle + start, dstZ);
				Static332.projAnims.addTail(new ProjAnimNode(proj));
			}
		} else if (packet == ZoneProt.OBJ_DEL) {
			int pos = inboundBuffer.g1bneg();
			int x = (pos >> 4 & 0x7) + zoneX;
			int z = zoneZ + (pos & 0x7);

			int type = inboundBuffer.ig2add();

			if (x >= 0 && z >= 0 && x < Static373.buildAreaLimitX && z < Static242.buildAreaLimitZ) {
				@Pc(713) Class2_Sub32 local713 = (Class2_Sub32) Static120.objStacks.get((long) (x | Player.level << 28 | z << 14));
				if (local713 != null) {
					for (@Pc(721) ObjStack objStack = (ObjStack) local713.aClass135_34.head(); objStack != null; objStack = (ObjStack) local713.aClass135_34.next()) {
						if ((type & 0x7FFF) == objStack.type) {
							objStack.unlink();
							break;
						}
					}

					if (local713.aClass135_34.method3550()) {
						local713.unlink();
					}

					Static165.sortObjStack(x, Player.level, z);
				}
			}
		} else if (packet == ZoneProt.OBJ_REVEAL) {
			int count = inboundBuffer.ig2();
			int receiver = inboundBuffer.ig2add();

			int pos = inboundBuffer.g1sub();
			int x = (pos >> 4 & 0x7) + zoneX;
			int z = zoneZ + (pos & 0x7);

			int type = inboundBuffer.ig2add();

			if (x >= 0 && z >= 0 && Static373.buildAreaLimitX > x && z < Static242.buildAreaLimitZ && receiver != PlayerList.selfId) {
				Static137.addObjStack(z, x, new ObjStack(type, count), Player.level);
				Static165.sortObjStack(x, Player.level, z);
			}
		} else if (packet == ZoneProt.LOC_ADD_CHANGE) {
			int info = inboundBuffer.g1bneg();
			int shape = info >> 2;
			int rotation = info & 0x3;
			int layer = Static150.LAYERS[shape];

			int type = inboundBuffer.g2add();

			int pos = inboundBuffer.g1();
			int x = zoneX + (pos >> 4 & 0x7);
			int z = zoneZ + (pos & 0x7);

			if (x >= 0 && z >= 0 && x < Static373.buildAreaLimitX && Static242.buildAreaLimitZ > z) {
				ChangeLocRequest.push(type, layer, shape, x, rotation, z, Player.level);
			}
		} else if (packet == ZoneProt.LOC_MERGE) {
			@Pc(916) byte local916 = inboundBuffer.g1neg();

			int pos = inboundBuffer.g1();
			int x = (pos >> 4 & 0x7) + zoneX;
			int z = (pos & 0x7) + zoneZ;

			int local49 = inboundBuffer.ig2s();
			@Pc(942) byte local942 = inboundBuffer.g1bsub();
			int local57 = inboundBuffer.ig2add();
			int local63 = inboundBuffer.ig2add();
			@Pc(954) byte local954 = inboundBuffer.g1neg();
			@Pc(958) byte local958 = inboundBuffer.g1neg();
			int info = inboundBuffer.g1add();
			int shape = info >> 2;
			int rotation = info & 0x3;
			int local403 = inboundBuffer.g2();

			// this is a software-rendering fix due to draw priorities
			if (!Rasteriser.instance.hasHwAccel()) {
				AttachLocRequest.push(x, local403, local954, local57, local958, local942, local916, local63, local49, shape, rotation, z, Player.level);
			}
		} else if (packet == ZoneProt.LOC_PREFETCH) {
			int id = inboundBuffer.g2();
			int shape = inboundBuffer.g1();

			client.LocTypes.get(id).isReady(shape);
		} else if (packet == ZoneProt.TEXT_COORD) {
			inboundBuffer.g1();

			int pos = inboundBuffer.g1();
			int x = (pos >> 4 & 0x7) + zoneX;
			int z = zoneZ + (pos & 0x7);

			int local40 = inboundBuffer.g2();
			int local49 = inboundBuffer.g1();
			int local53 = inboundBuffer.ig3();
			@Pc(1055) String text = inboundBuffer.gjstr();

			Static111.method2277(local40, local49, local53, text, Player.level, x, z);
		} else if (packet == ZoneProt.LOC_ANIM) {
			int type = inboundBuffer.g2add();
			if (type == 65535) {
				type = -1;
			}

			int pos = inboundBuffer.g1sub();
			int x = zoneX + (pos >> 4 & 0x7);
			int z = (pos & 0x7) + zoneZ;

			int info = inboundBuffer.g1sub();
			int shape = info >> 2;
			int rotation = info & 0x3;
			int layer = Static150.LAYERS[shape];

			Static391.method6452(shape, type, z, layer, rotation, x, Player.level);
		} else if (packet == ZoneProt.MAP_ANIM) {
			int pos = inboundBuffer.g1();
			int x = zoneX + (pos >> 4 & 0x7);
			int z = zoneZ + (pos & 0x7);

			int spotAnim = inboundBuffer.g2();
			int height = inboundBuffer.g1();
			int delay = inboundBuffer.g2();

			if (x >= 0 && z >= 0 && Static373.buildAreaLimitX > x && Static242.buildAreaLimitZ > z) {
				int xFine = x * 128 + 64;
				int zFine = z * 128 + 64;

				@Pc(1208) SpotAnim spot = new SpotAnim(spotAnim, delay, client.cycle, Player.level, xFine, Scene.getTileHeight(xFine, zFine, Player.level) - height, zFine, x, x, z, z);
				Static129.spotAnims.addTail(new SpotAnimNode(spot));
			}
		} else if (packet == ZoneProt.SOUND_AREA) {
			int pos = inboundBuffer.g1();
			int x = (pos >> 4 & 0x7) + zoneX;
			int z = (pos & 0x7) + zoneZ;

			int id = inboundBuffer.g2();
			if (id == 65535) {
				id = -1;
			}

			int info = inboundBuffer.g1();
			int minDistance = info >> 4 & 0xF;
			int loops = info & 0x7;
			int delay = inboundBuffer.g1();
			int volume = inboundBuffer.g1();

			if (x >= 0 && z >= 0 && x < Static373.buildAreaLimitX && Static242.buildAreaLimitZ > z) {
				int minDistanceP1 = minDistance + 1;
				if (x - minDistanceP1 <= PlayerList.self.movementQueueX[0] && PlayerList.self.movementQueueX[0] <= x + minDistanceP1 && PlayerList.self.movementQueueZ[0] >= z - minDistanceP1 && z + minDistanceP1 >= PlayerList.self.movementQueueZ[0] && client.preferences.areaSoundsVolume != 0 && loops > 0 && SoundPlayer.size < 50 && id != -1) {
					SoundPlayer.ids[SoundPlayer.size] = id;
					SoundPlayer.loops[SoundPlayer.size] = loops;
					SoundPlayer.delays[SoundPlayer.size] = delay;
					SoundPlayer.sounds[SoundPlayer.size] = null;
					SoundPlayer.positions[SoundPlayer.size] = minDistance + (z << 8) + (x << 16) + (Player.level << 24);
					SoundPlayer.volumes[SoundPlayer.size] = volume;
					SoundPlayer.size++;
				}
			}
		} else if (packet == ZoneProt.LOC_DEL) {
			int pos = inboundBuffer.g1add();
			int x = zoneX + (pos >> 4 & 0x7);
			int z = (pos & 0x7) + zoneZ;

			int info = inboundBuffer.g1bneg();
			int shape = info >> 2;
			int rotation = info & 0x3;
			int layer = Static150.LAYERS[shape];

			if (x >= 0 && z >= 0 && x < Static373.buildAreaLimitX && Static242.buildAreaLimitZ > z) {
				ChangeLocRequest.push(-1, layer, shape, x, rotation, z, Player.level);
			}
		} else if (packet == ZoneProt.MAP_PROJANIM) {
			int pos = inboundBuffer.g1();
			int x = zoneX + (pos >> 4 & 0x7);
			int z = (pos & 0x7) + zoneZ;

			int dstX = x + inboundBuffer.g1b();
			int dstZ = z + inboundBuffer.g1b();
			int target = inboundBuffer.g2s();
			int spotanim = inboundBuffer.g2();
			int srcHeight = inboundBuffer.g1() * 4;
			int dstHeight = inboundBuffer.g1() * 4;
			int start = inboundBuffer.g2();
			int end = inboundBuffer.g2();
			int peak = inboundBuffer.g1();
			int arc = inboundBuffer.g1();

			if (peak == 255) {
				peak = -1;
			}

			if (x >= 0 && z >= 0 && Static373.buildAreaLimitX > x && z < Static242.buildAreaLimitZ && dstX >= 0 && dstZ >= 0 && dstX < Static373.buildAreaLimitX && dstZ < Static242.buildAreaLimitZ && spotanim != 65535) {
				z = z * 128 + 64;
				x = x * 128 + 64;

				dstZ = dstZ * 128 + 64;
				dstX = dstX * 128 + 64;

				ProjAnim proj = new ProjAnim(spotanim, Player.level, x, z, Scene.getTileHeight(x, z, Player.level) - srcHeight, start + client.cycle, end + client.cycle, peak, arc, target, dstHeight);
				proj.setTarget(Scene.getTileHeight(dstX, dstZ, Player.level) - dstHeight, dstX, client.cycle + start, dstZ);
				Static332.projAnims.addTail(new ProjAnimNode(proj));
			}
		} else if (packet == ZoneProt.OBJ_ADD) {
			int type = inboundBuffer.g2();
			int count = inboundBuffer.g2add();

			int pos = inboundBuffer.g1();
			int x = (pos >> 4 & 0x7) + zoneX;
			int z = zoneZ + (pos & 0x7);

			if (x >= 0 && z >= 0 && x < Static373.buildAreaLimitX && Static242.buildAreaLimitZ > z) {
				Static137.addObjStack(z, x, new ObjStack(type, count), Player.level);
				Static165.sortObjStack(x, Player.level, z);
			}
		} else {
			TracingException.report(null, "T3 - " + packet);
			LoginManager.logout();
		}
	}
}
