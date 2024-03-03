import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Player extends PathingEntity {

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "[I")
	public static final int[] TITLES_PER_GAME = new int[] { 1, 4 };
	@OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
	public static int weight = 0;
	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	public static int energy = 0;
	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public static int worldId = -1;
	@OriginalMember(owner = "client!im", name = "G", descriptor = "I")
	public static int rebootTimer = 0;
	@OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!cc;")
	public static PrivilegedRequest lastLogAddress;
	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] playerNames;
	@OriginalMember(owner = "client!nt", name = "O", descriptor = "I")
	public static int level;
	@OriginalMember(owner = "client!nh", name = "pc", descriptor = "Ljava/lang/String;")
	public String username;

	@OriginalMember(owner = "client!nh", name = "tc", descriptor = "I")
	public int anInt4169;

	@OriginalMember(owner = "client!nh", name = "Gc", descriptor = "I")
	public int anInt4181;

	@OriginalMember(owner = "client!nh", name = "Rc", descriptor = "Ljava/lang/String;")
	public String username2;

	@OriginalMember(owner = "client!nh", name = "Wc", descriptor = "I")
	private int basId;

	@OriginalMember(owner = "client!nh", name = "ed", descriptor = "Lclient!jo;")
	public PlayerAppearance appearance;

	@OriginalMember(owner = "client!nh", name = "rc", descriptor = "I")
	public int crawlSound = -1;

	@OriginalMember(owner = "client!nh", name = "vc", descriptor = "I")
	public int anInt4171 = 0;

	@OriginalMember(owner = "client!nh", name = "Mc", descriptor = "I")
	public int idleSound = -1;

	@OriginalMember(owner = "client!nh", name = "yc", descriptor = "I")
	public int anInt4174 = -1;

	@OriginalMember(owner = "client!nh", name = "xc", descriptor = "I")
	public int totalLevel = 0;

	@OriginalMember(owner = "client!nh", name = "zc", descriptor = "B")
	private byte gender = 0;

	@OriginalMember(owner = "client!nh", name = "Sc", descriptor = "I")
	public int anInt4191 = -1;

	@OriginalMember(owner = "client!nh", name = "Oc", descriptor = "I")
	public int pkIcon = -1;

	@OriginalMember(owner = "client!nh", name = "sc", descriptor = "I")
	public int walkSound = -1;

	@OriginalMember(owner = "client!nh", name = "Uc", descriptor = "I")
	public int team = 0;

	@OriginalMember(owner = "client!nh", name = "mc", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!nh", name = "Ec", descriptor = "I")
	public int combatLevel = 0;

	@OriginalMember(owner = "client!nh", name = "Zc", descriptor = "I")
	public int prayerIcon = -1;

	@OriginalMember(owner = "client!nh", name = "dd", descriptor = "B")
	private byte title = 0;

	@OriginalMember(owner = "client!nh", name = "Nc", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!nh", name = "Hc", descriptor = "I")
	public int soundRadius = 0;

	@OriginalMember(owner = "client!nh", name = "Xc", descriptor = "I")
	public int runSound = -1;

	@OriginalMember(owner = "client!nh", name = "gd", descriptor = "I")
	public int soundVolume = 255;

	@OriginalMember(owner = "client!nh", name = "cd", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!nh;II)V")
	public static void animate(@OriginalArg(1) Player arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4597 == arg2 && arg2 != -1) {
			@Pc(18) Class157 local18 = client.SeqTypes.method2371(arg2);
			@Pc(21) int local21 = local18.anInt4022;
			if (local21 == 1) {
				arg0.anInt4590 = arg1;
				arg0.anInt4607 = 0;
				arg0.anInt4592 = 1;
				arg0.anInt4598 = 0;
				arg0.anInt4624 = 0;
				Static1.method4(local18, arg0 == PlayerList.self, arg0.plane, arg0.xFine, arg0.zFine, arg0.anInt4607);
			}
			if (local21 == 2) {
				arg0.anInt4598 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4597 == -1 || client.SeqTypes.method2371(arg2).anInt4023 >= client.SeqTypes.method2371(arg0.anInt4597).anInt4023) {
			arg0.anInt4597 = arg2;
			arg0.anInt4598 = 0;
			arg0.anInt4624 = 0;
			arg0.anInt4642 = arg0.anInt4643;
			arg0.anInt4590 = arg1;
			arg0.anInt4592 = 1;
			arg0.anInt4607 = 0;
			if (arg0.anInt4597 != -1) {
				Static1.method4(client.SeqTypes.method2371(arg0.anInt4597), arg0 == PlayerList.self, arg0.plane, arg0.xFine, arg0.zFine, arg0.anInt4607);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!nh;)I")
	public static int getSound(@OriginalArg(1) Player arg0) {
		@Pc(8) int local8 = arg0.walkSound;
		@Pc(12) BasType local12 = arg0.getBasType();
		if (arg0.aBoolean317) {
			local8 = arg0.crawlSound;
		} else if (local12.anInt6263 == arg0.anInt4585 || local12.anInt6292 == arg0.anInt4585 || local12.anInt6301 == arg0.anInt4585 || local12.anInt6271 == arg0.anInt4585) {
			local8 = arg0.runSound;
		} else if (local12.anInt6265 == arg0.anInt4585 || local12.anInt6299 == arg0.anInt4585 || local12.anInt6267 == arg0.anInt4585 || local12.anInt6284 == arg0.anInt4585) {
			local8 = arg0.idleSound;
		}
		return local8;
	}
	
	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) RasteriserBase arg0) {
		if (this.appearance != null && (super.aBoolean321 || this.method4067(arg0, 0))) {
			this.method4333(arg0, super.aClass31Array3, super.aBoolean321);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) RasteriserBase arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
	public void method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt4643 = 0;
		super.anInt4641 = 0;
		super.movementQueueX[0] = arg0;
		super.anInt4642 = 0;
		super.movementQueueZ[0] = arg1;
		@Pc(32) int local32 = this.getSize();
		super.xFine = local32 * 64 + super.movementQueueX[0] * 128;
		super.zFine = super.movementQueueZ[0] * 128 + local32 * 64;
		if (PlayerList.self == this) {
			Static348.method5828();
		}
		if (super.particleSystem != null) {
			super.particleSystem.method4359();
		}
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)Z")
	public boolean method4065() {
		return this.appearance != null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I")
	@Override
	public int method4324() {
		return -1;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)I")
	@Override
	protected int method4329() {
		return this.basId;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!bt;I)V")
	public void decodeAppearance(@OriginalArg(0) Packet buffer) {
		buffer.pos = 0;
		@Pc(12) int flags = buffer.g1();
		this.gender = (byte) (flags & 0x1);
		@Pc(29) boolean local29 = (flags & 0x2) != 0;
		@Pc(37) boolean showSkillLevel = (flags & 0x4) != 0;
		@Pc(41) int previousSize = super.getSize();
		this.setSize((flags >> 3 & 0x7) + 1);
		this.title = (byte) (flags >> 6 & 0x3);
		super.xFine += (this.getSize() - previousSize) * 64;
		super.zFine += (this.getSize() - previousSize) * 64;
		this.aByte38 = buffer.g1b();
		this.pkIcon = buffer.g1b();
		this.prayerIcon = buffer.g1b();
		this.team = 0;
		@Pc(113) int local113 = -1;
		@Pc(116) int[] local116 = new int[12];
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(182) int local182;
		for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
			@Pc(124) int local124 = buffer.g1();
			if (local124 == 0) {
				local116[local118] = 0;
			} else {
				local136 = buffer.g1();
				local143 = (local124 << 8) + local136;
				if (local118 == 0 && local143 == 65535) {
					local113 = buffer.g2();
					this.team = buffer.g1();
					break;
				}
				if (local143 >= 32768) {
					local143 = Equipment.objIds[local143 - 32768];
					local116[local118] = local143 | 0x40000000;
					local182 = client.ObjTypes.get(local143).team;
					if (local182 != 0) {
						this.team = local182;
					}
				} else {
					local116[local118] = local143 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(207) int[] local207 = new int[5];
		for (local136 = 0; local136 < 5; local136++) {
			local143 = buffer.g1();
			if (local143 < 0 || local143 >= PlayerAppearance.destinationBodyColors[local136].length) {
				local143 = 0;
			}
			local207[local136] = local143;
		}
		this.basId = buffer.g2();
		this.username2 = buffer.gjstr();
		if (local29) {
			System.out.println("reading more");
			this.username = buffer.gjstr();
		} else {
			this.username = this.username2;
		}
		this.combatLevel = buffer.g1();
		if (showSkillLevel) {
			this.totalLevel = buffer.g2();
			this.anInt4191 = -1;
			this.anInt4171 = this.combatLevel;
		} else {
			this.totalLevel = 0;
			this.anInt4171 = buffer.g1();
			this.anInt4191 = buffer.g1();
			if (this.anInt4191 == 255) {
				this.anInt4191 = -1;
			}
		}
		int previousSoundRadius = this.soundRadius;
		this.soundRadius = buffer.g1();
		@Pc(327) int local327;
		if (this.soundRadius == 0) {
			AreaSoundManager.remove(this);
		} else {
			local182 = this.crawlSound;
			@Pc(324) int local324 = this.idleSound;
			local327 = this.walkSound;
			@Pc(330) int local330 = this.runSound;
			@Pc(333) int local333 = this.soundVolume;
			this.crawlSound = buffer.g2();
			this.idleSound = buffer.g2();
			this.walkSound = buffer.g2();
			this.runSound = buffer.g2();
			this.soundVolume = buffer.g1();
			if (previousSoundRadius != this.soundRadius || this.crawlSound != local182 || local324 != this.idleSound || this.walkSound != local327 || this.runSound != local330 || local333 != this.soundVolume) {
				AreaSoundManager.update(this);
			}
		}
		if (this.appearance == null) {
			this.appearance = new PlayerAppearance();
		}
		local182 = this.appearance.npcId;
		@Pc(410) int[] local410 = this.appearance.anIntArray194;
		this.appearance.set(local207, local116, this.gender == 1, local113, this.method4329());
		if (local113 != local182) {
			super.xFine = super.movementQueueX[0] * 128 + this.getSize() * 64;
			super.zFine = super.movementQueueZ[0] * 128 + this.getSize() * 64;
		}
		if (PlayerList.selfId == super.anInt4619 && local410 != null) {
			for (local327 = 0; local327 < local207.length; local327++) {
				if (local207[local327] != local410[local327]) {
					client.ObjTypes.clearSprites();
					break;
				}
			}
		}
		if (super.particleSystem != null) {
			super.particleSystem.method4359();
		}
		if (super.anInt4585 == -1 || !super.aBoolean317) {
			return;
		}
		@Pc(513) BasType local513 = this.getBasType();
		if (!local513.method5692(super.anInt4585)) {
			super.anInt4585 = -1;
			super.aBoolean317 = false;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!wm;I)Z")
	private boolean method4067(@OriginalArg(1) RasteriserBase arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(13) BasType local13 = this.getBasType();
		@Pc(28) Class157 local28 = super.anInt4597 != -1 && super.anInt4590 == 0 ? client.SeqTypes.method2371(super.anInt4597) : null;
		@Pc(48) Class157 local48 = super.anInt4585 == -1 || this.aBoolean275 || super.aBoolean317 && local28 != null ? null : client.SeqTypes.method2371(super.anInt4585);
		@Pc(51) int local51 = local13.anInt6287;
		@Pc(54) int local54 = local13.anInt6290;
		if (local51 != 0 || local54 != 0 || local13.anInt6281 != 0 || local13.anInt6283 != 0) {
			arg1 |= 0x7;
		}
		super.aClass31Array3[0] = this.appearance.method3191(super.anInt4624, client.BasTypes, client.SeqTypes, client.IdkTypes, local28, super.anInt4592, super.anInt4629, arg1, super.anInt4593, super.anInt4626, local48, VarpDomain.instance, client.ObjTypes, arg0, client.NpcTypes, super.aClass20Array3, super.anInt4607);
		@Pc(116) int local116 = Static365.method6117();
		if (GameShell.maxMemory < 96 && local116 > 50) {
			Static163.method3105();
		}
		@Pc(136) int local136;
		if (ModeWhere.MODE_WHERE_LIVE != client.modeWhere && local116 < 50) {
			local136 = 50 - local116;
			while (Static50.anInt1332 < local136) {
				Static26.aByteArrayArray3[Static50.anInt1332] = new byte[102400];
				Static50.anInt1332++;
			}
			while (local136 < Static50.anInt1332) {
				Static50.anInt1332--;
				Static26.aByteArrayArray3[Static50.anInt1332] = null;
			}
		} else if (client.modeWhere != ModeWhere.MODE_WHERE_LIVE) {
			Static50.anInt1332 = 0;
			Static26.aByteArrayArray3 = new byte[50][];
		}
		if (super.aClass31Array3[0] == null) {
			return false;
		}
		super.anInt4630 = super.aClass31Array3[0].method3802();
		this.method4320(super.aClass31Array3[0]);
		local136 = super.aClass248_7.method6441();
		super.anInt4596 = 0;
		super.anInt4608 = 0;
		super.anInt4589 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4321(this.getSize() << 7, this.getSize() << 7, local136);
		} else {
			this.method4321(local54, local51, local136);
			if (super.anInt4589 != 0) {
				super.aClass31Array3[0].method3824(super.anInt4589);
			}
			if (super.anInt4596 != 0) {
				super.aClass31Array3[0].method3815(super.anInt4596);
			}
			if (super.anInt4608 != 0) {
				super.aClass31Array3[0].method3813(0, super.anInt4608, 0);
			}
		}
		super.aClass31Array3[1] = null;
		if (!this.aBoolean275 && super.anInt4594 != -1 && super.anInt4582 != -1) {
			@Pc(302) SpotAnimType local302 = client.SpotAnimTypes.method5407(super.anInt4594);
			@Pc(322) Model local322 = local302.method2433(super.anInt4612, super.anInt4620, arg0, (local302.aBoolean178 ? 7 : 2) | local7, client.SeqTypes, super.anInt4582);
			if (local322 != null) {
				local322.method3813(0, -super.anInt4639, 0);
				if (local302.aBoolean178 && (local51 != 0 || local54 != 0)) {
					if (super.anInt4589 != 0) {
						local322.method3824(super.anInt4589);
					}
					if (super.anInt4596 != 0) {
						local322.method3815(super.anInt4596);
					}
					if (super.anInt4608 != 0) {
						local322.method3813(0, super.anInt4608, 0);
					}
				}
				super.aClass31Array3[1] = local322;
			}
		}
		super.aClass31Array3[2] = null;
		if (!this.aBoolean275 && super.aClass2_Sub6_3 != null) {
			if (client.cycle >= super.aClass2_Sub6_3.anInt1118) {
				super.aClass2_Sub6_3 = null;
			} else if (client.cycle >= super.aClass2_Sub6_3.anInt1100) {
				@Pc(410) Model local410 = super.aClass2_Sub6_3.method1360(arg0, local7 | 0x7);
				if (local410 != null) {
					local410.method3813(super.aClass2_Sub6_3.anInt1104 - super.xFine, super.aClass2_Sub6_3.anInt1114 + -super.anInt6782, super.aClass2_Sub6_3.anInt1101 - super.zFine);
					if (local136 != 0) {
						local410.method3833(-local136 & 0x3FFF);
					}
					super.aClass31Array3[2] = local410;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIB)V")
	public void method4068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt4597 != -1 && client.SeqTypes.method2371(super.anInt4597).anInt4029 == 1) {
			super.anInt4597 = -1;
		}
		if (super.anInt4594 != -1) {
			@Pc(37) SpotAnimType local37 = client.SpotAnimTypes.method5407(super.anInt4594);
			if (local37.aBoolean177 && local37.anInt2448 != -1 && client.SeqTypes.method2371(local37.anInt2448).anInt4029 == 1) {
				super.anInt4594 = -1;
			}
		}
		this.anInt4174 = -1;
		if (arg1 < 0 || Static373.buildAreaLimitX <= arg1 || arg0 < 0 || Static242.buildAreaLimitZ <= arg0) {
			this.method4064(arg1, arg0);
		} else if (super.movementQueueX[0] >= 0 && super.movementQueueX[0] < Static373.buildAreaLimitX && super.movementQueueZ[0] >= 0 && Static242.buildAreaLimitZ > super.movementQueueZ[0]) {
			if (arg2 == 2) {
				Static376.method6284(this, arg1, arg0);
			}
			this.method4071(arg0, arg2, arg1);
		} else {
			this.method4064(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)I")
	@Override
	public int method6080() {
		return super.anInt4630;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) RasteriserBase arg0) {
		if (this.appearance == null || !this.method4067(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class14 local19 = arg0.method2808();
		@Pc(24) int local24 = super.aClass248_7.method6441();
		local19.method3925(local24);
		local19.method3936(super.xFine, super.anInt6782, super.zFine);
		@Pc(45) float local45 = arg0.method2802();
		@Pc(48) float local48 = arg0.method2860();
		if (client.preferences.characterShadows) {
			@Pc(55) BasType local55 = this.getBasType();
			if (local55.aBoolean424 && (this.appearance.npcId == -1 || client.NpcTypes.get(this.appearance.npcId).aBoolean142)) {
				@Pc(87) Class157 local87 = super.anInt4597 != -1 && super.anInt4590 == 0 ? client.SeqTypes.method2371(super.anInt4597) : null;
				@Pc(108) Class157 local108 = super.anInt4585 == -1 || this.aBoolean275 || super.aBoolean317 && local87 != null ? null : client.SeqTypes.method2371(super.anInt4585);
				@Pc(142) Model local142 = Static178.method2340(local108 == null ? super.anInt4607 : super.anInt4626, 240, 160, super.anInt4596, local108 == null ? local87 : local108, 1, 0, super.aClass31Array3[0], local24, arg0, 0, super.aBoolean318, super.anInt4608, super.anInt4589);
				if (local142 != null) {
					arg0.method2823(local45, local48 - 128.0F);
					arg0.method2852(false);
					local142.method3835(local19, null, 0);
					arg0.method2852(true);
				}
			}
		}
		if (PlayerList.self == this) {
			arg0.method2823(local45, local48 - 144.0F);
			local19.method3922(super.xFine, super.anInt6782, super.zFine);
			for (@Pc(183) int local183 = Static50.aClass84Array1.length - 1; local183 >= 0; local183--) {
				@Pc(189) Class84 local189 = Static50.aClass84Array1[local183];
				if (local189 != null && local189.anInt2361 != -1) {
					@Pc(239) int local239;
					@Pc(228) int local228;
					if (local189.anInt2355 == 1 && local189.anInt2354 >= 0 && local189.anInt2354 < NpcList.npcs.length) {
						@Pc(215) Npc local215 = NpcList.npcs[local189.anInt2354];
						if (local215 != null) {
							local228 = local215.xFine / 32 - PlayerList.self.xFine / 32;
							local239 = local215.zFine / 32 - PlayerList.self.zFine / 32;
							this.method4073(local189.anInt2361, 360000, local228, local239, local19, super.aClass31Array3[0], arg0);
						}
					}
					if (local189.anInt2355 == 2) {
						@Pc(273) int local273 = (local189.anInt2352 - Camera.originX) * 4 + 2 - PlayerList.self.xFine / 32;
						local228 = (local189.anInt2364 - Camera.originZ) * 4 + 2 - PlayerList.self.zFine / 32;
						local239 = local189.anInt2349 * 4;
						local239 *= local239;
						this.method4073(local189.anInt2361, local239, local273, local228, local19, super.aClass31Array3[0], arg0);
					}
					if (local189.anInt2355 == 10 && local189.anInt2354 >= 0 && PlayerList.players.length > local189.anInt2354) {
						@Pc(332) Player local332 = PlayerList.players[local189.anInt2354];
						if (local332 != null) {
							local228 = local332.xFine / 32 - PlayerList.self.xFine / 32;
							local239 = local332.zFine / 32 - PlayerList.self.zFine / 32;
							this.method4073(local189.anInt2361, 360000, local228, local239, local19, super.aClass31Array3[0], arg0);
						}
					}
				}
			}
			local19.method3925(local24);
			local19.method3936(super.xFine, super.anInt6782, super.zFine);
		}
		arg0.method2823(local45, local48);
		@Pc(397) Class12_Sub4 local397 = Static147.method2706(super.aClass31Array3.length);
		if (super.particleSystem == null) {
			arg0.method2881(super.aClass31Array3, local19, local397.aClass12_Sub2Array1, PlayerList.self == this ? 1 : 0);
		} else {
			@Pc(419) Class224 local419 = super.particleSystem.method4358();
			arg0.method2830(super.aClass31Array3, local419, local19, local397.aClass12_Sub2Array1, PlayerList.self == this ? 1 : 0);
		}
		this.method4333(arg0, super.aClass31Array3, false);
		if (super.aClass31Array3[2] != null) {
			if (local24 != 0) {
				super.aClass31Array3[2].method3833(local24);
			}
			super.aClass31Array3[2].method3813(super.xFine - super.aClass2_Sub6_3.anInt1104, super.anInt6782 + -super.aClass2_Sub6_3.anInt1114, -super.aClass2_Sub6_3.anInt1101 + super.zFine);
		}
		super.anInt4603 = Static163.anInt3086;
		return local397;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) RasteriserBase arg2) {
		if (this.appearance == null || !this.method4067(arg2, 65536)) {
			return true;
		}
		@Pc(19) Class14 local19 = arg2.method2808();
		@Pc(24) int local24 = super.aClass248_7.method6441();
		local19.method3925(local24);
		local19.method3936(super.xFine, super.anInt6782, super.zFine);
		for (@Pc(42) int local42 = 0; local42 < super.aClass31Array3.length; local42++) {
			if (super.aClass31Array3[local42] != null && super.aClass31Array3[local42].method3820(arg0, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I")
	@Override
	public int getSize() {
		return this.appearance == null || this.appearance.npcId == -1 ? super.getSize() : client.NpcTypes.get(this.appearance.npcId).size;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(ZI)Ljava/lang/String;")
	public String method4070() {
		return this.username;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIBI)V")
	public void method4071(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4643 < 9) {
			super.anInt4643++;
		}
		for (@Pc(18) int local18 = super.anInt4643; local18 > 0; local18--) {
			super.movementQueueX[local18] = super.movementQueueX[local18 - 1];
			super.movementQueueZ[local18] = super.movementQueueZ[local18 - 1];
			super.aByteArray51[local18] = super.aByteArray51[local18 - 1];
		}
		super.movementQueueX[0] = arg2;
		super.movementQueueZ[0] = arg0;
		super.aByteArray51[0] = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String getName() {
		@Pc(17) String local17 = "";
		if (playerNames != null) {
			local17 = local17 + playerNames[this.title];
		}
		@Pc(39) int[] local39;
		if (this.gender == 1 && Static324.anIntArray412 != null) {
			local39 = Static324.anIntArray412;
		} else {
			local39 = Static117.anIntArray150;
		}
		if (local39 != null && local39[this.title] != -1) {
			@Pc(59) EnumType local59 = client.EnumTypes.get(local39[this.title]);
			if (local59.valueType == 's') {
				local17 = local17 + local59.getString(this.aByte38 & 0xFF);
			} else {
				TracingException.report(new Throwable(), "gdn1");
				local39[this.title] = -1;
			}
		}
		local17 = local17 + this.username2;
		if (Static333.playerNames2 != null) {
			local17 = local17 + Static333.playerNames2[this.title];
		}
		return local17;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIIIILclient!on;Lclient!gn;Lclient!wm;)V")
	private void method4073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class14 arg4, @OriginalArg(6) Model arg5, @OriginalArg(7) RasteriserBase arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg2 * arg2;
		if (local11 < 16 || local11 > arg1) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg2, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Model local54 = Static107.method2237(arg6, super.anInt6782, super.zFine, super.anInt4596, arg0, local35, super.anInt4589, super.anInt4608, arg5, super.xFine);
		if (local54 != null) {
			arg6.method2852(false);
			local54.method3835(arg4, null, 0);
			arg6.method2852(true);
		}
	}
}
