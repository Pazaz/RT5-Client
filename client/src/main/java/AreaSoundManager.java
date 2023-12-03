import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class AreaSoundManager {

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "Lclient!ld;")
	public static final LinkedList npcSounds = new LinkedList();
	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!ad;")
	public static final HashTable aClass4_86 = new HashTable(16);
	@OriginalMember(owner = "client!en", name = "c", descriptor = "Lclient!ld;")
	public static final LinkedList locSounds = new LinkedList();

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!oe;B)V")
	public static void remove(@OriginalArg(0) Npc arg0) {
		for (@Pc(16) AreaSound local16 = (AreaSound) npcSounds.head(); local16 != null; local16 = (AreaSound) npcSounds.next()) {
			if (local16.npc == arg0) {
				if (local16.primaryStream != null) {
					client.soundStream.removeSubStream(local16.primaryStream);
					local16.primaryStream = null;
				}
				local16.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ct;IILclient!nh;Lclient!oe;BII)V")
	public static void add(@OriginalArg(0) LocType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Player arg3, @OriginalArg(4) Npc arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) AreaSound local7 = new AreaSound();
		local7.level = arg6;
		local7.minXFine = arg5 * 128;
		local7.minZFine = arg1 * 128;
		if (arg0 != null) {
			local7.aClass41_1 = arg0;
			@Pc(33) int local33 = arg0.anInt1356;
			@Pc(36) int local36 = arg0.anInt1327;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg0.anInt1327;
				local36 = arg0.anInt1356;
			}
			local7.sounds = arg0.bgsounds;
			local7.minInterval = arg0.bgsoundmin;
			local7.maxXFine = (arg5 + local33) * 128;
			local7.radius = arg0.bgsoundrange * 128;
			local7.maxZFine = (local36 + arg1) * 128;
			local7.volume = arg0.anInt1320;
			local7.sound = arg0.bgsound;
			local7.maxInterval = arg0.bgsoundmax;
			if (arg0.anIntArray94 != null) {
				local7.multiLocOrNpc = true;
				local7.update();
			}
			if (local7.sounds != null) {
				local7.remainingLoops = local7.minInterval + (int) ((double) (local7.maxInterval - local7.minInterval) * Math.random());
			}
			locSounds.addTail(local7);
		} else if (arg4 != null) {
			local7.npc = arg4;
			@Pc(131) NpcType local131 = arg4.type;
			if (local131.multiNpcs != null) {
				local7.multiLocOrNpc = true;
				local131 = local131.getMultiNpc(VarpDomain.instance);
			}
			if (local131 != null) {
				local7.maxZFine = (arg1 + local131.size) * 128;
				local7.maxXFine = (arg5 + local131.size) * 128;
				local7.sound = Static340.getSound(arg4);
				local7.radius = local131.anInt2022 * 128;
				local7.volume = local131.anInt2051;
			}
			npcSounds.addTail(local7);
		} else if (arg3 != null) {
			local7.player = arg3;
			local7.maxXFine = (arg5 + arg3.getSize()) * 128;
			local7.maxZFine = (arg1 + arg3.getSize()) * 128;
			local7.sound = Player.getSound(arg3);
			local7.volume = arg3.soundVolume;
			local7.radius = arg3.soundRadius * 128;
			aClass4_86.put(local7, (long) arg3.anInt4619);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!nh;)V")
	public static void remove(@OriginalArg(1) Player arg0) {
		@Pc(11) AreaSound local11 = (AreaSound) aClass4_86.get((long) arg0.anInt4619);
		if (local11 == null) {
			return;
		}
		if (local11.primaryStream != null) {
			client.soundStream.removeSubStream(local11.primaryStream);
			local11.primaryStream = null;
		}
		local11.unlink();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!nh;I)V")
	public static void update(@OriginalArg(0) Player arg0) {
		@Pc(19) AreaSound local19 = (AreaSound) aClass4_86.get((long) arg0.anInt4619);
		if (local19 == null) {
			add(null, arg0.movementQueueZ[0], 0, arg0, null, arg0.movementQueueX[0], arg0.plane);
		} else {
			local19.update();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!jc;III)V")
	public static void redraw(@OriginalArg(0) int loops, @OriginalArg(1) int level, @OriginalArg(2) AreaSound areaSound, @OriginalArg(3) int z, @OriginalArg(4) int x) {
		if (areaSound.sound == -1 && areaSound.sounds == null) {
			return;
		}
		@Pc(16) int distance = 0;
		@Pc(24) int local24 = client.preferences.areaSoundsVolume * areaSound.volume >> 8;
		if (areaSound.maxXFine < x) {
			distance = x - areaSound.maxXFine;
		} else if (x < areaSound.minXFine) {
			distance = areaSound.minXFine - x;
		}
		if (z > areaSound.maxZFine) {
			distance += z - areaSound.maxZFine;
		} else if (z < areaSound.minZFine) {
			distance += areaSound.minZFine - z;
		}
		if (areaSound.radius == 0 || areaSound.radius < distance - 64 || client.preferences.areaSoundsVolume == 0 || areaSound.level != level) {
			if (areaSound.primaryStream != null) {
				client.soundStream.removeSubStream(areaSound.primaryStream);
				areaSound.primaryStream = null;
			}
			if (areaSound.secondaryStream != null) {
				client.soundStream.removeSubStream(areaSound.secondaryStream);
				areaSound.secondaryStream = null;
			}
			return;
		}
		distance -= 64;
		if (distance < 0) {
			distance = 0;
		}
		@Pc(140) int local140 = local24 * (areaSound.radius - distance) / areaSound.radius;
		if (areaSound.primaryStream != null) {
			areaSound.primaryStream.method4979(local140);
		} else if (areaSound.sound >= 0) {
			@Pc(155) SynthSound local155 = SynthSound.create(client.jsArchive4, areaSound.sound, 0);
			if (local155 != null) {
				@Pc(162) PcmSound local162 = local155.toPcmSound().method3179(client.resampler);
				@Pc(167) Class2_Sub12_Sub4 local167 = Static406.method5006(local162, local140);
				local167.method4984(-1);
				client.soundStream.addSubStream(local167);
				areaSound.primaryStream = local167;
			}
		}
		if (areaSound.secondaryStream != null) {
			areaSound.secondaryStream.method4979(local140);
			if (areaSound.secondaryStream.isLinked()) {
				return;
			}
			areaSound.secondaryStream = null;
		} else if (areaSound.sounds != null && (areaSound.remainingLoops -= loops) <= 0) {
			@Pc(204) int local204 = (int) ((double) areaSound.sounds.length * Math.random());
			@Pc(212) SynthSound local212 = SynthSound.create(client.jsArchive4, areaSound.sounds[local204], 0);
			if (local212 != null) {
				@Pc(219) PcmSound local219 = local212.toPcmSound().method3179(client.resampler);
				@Pc(224) Class2_Sub12_Sub4 local224 = Static406.method5006(local219, local140);
				local224.method4984(0);
				client.soundStream.addSubStream(local224);
				areaSound.remainingLoops = (int) ((double) (areaSound.maxInterval - areaSound.minInterval) * Math.random()) + areaSound.minInterval;
				areaSound.secondaryStream = local224;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	public static void redraw(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) AreaSound local10 = (AreaSound) locSounds.head(); local10 != null; local10 = (AreaSound) locSounds.next()) {
			redraw(arg2, arg3, local10, arg1, arg0);
		}
		for (@Pc(33) AreaSound areaSound = (AreaSound) npcSounds.head(); areaSound != null; areaSound = (AreaSound) npcSounds.next()) {
			@Pc(37) byte local37 = 1;
			@Pc(42) BasType basType = areaSound.npc.getBasType();
			if (areaSound.npc.aBoolean317) {
				local37 = 0;
			} else if (basType.anInt6263 == areaSound.npc.anInt4585 || basType.anInt6292 == areaSound.npc.anInt4585 || basType.anInt6301 == areaSound.npc.anInt4585 || basType.anInt6271 == areaSound.npc.anInt4585) {
				local37 = 2;
			} else if (basType.anInt6265 == areaSound.npc.anInt4585 || areaSound.npc.anInt4585 == basType.anInt6299 || basType.anInt6267 == areaSound.npc.anInt4585 || basType.anInt6284 == areaSound.npc.anInt4585) {
				local37 = 3;
			}
			if (local37 != areaSound.movementSpeed) {
				@Pc(133) int local133 = Static340.getSound(areaSound.npc);
				if (local133 != areaSound.sound) {
					if (areaSound.primaryStream != null) {
						client.soundStream.removeSubStream(areaSound.primaryStream);
						areaSound.primaryStream = null;
					}
					areaSound.sound = local133;
				}
				areaSound.movementSpeed = local37;
			}
			areaSound.minXFine = areaSound.npc.xFine;
			areaSound.maxXFine = areaSound.npc.xFine + areaSound.npc.getSize() * 64;
			areaSound.minZFine = areaSound.npc.zFine;
			areaSound.maxZFine = areaSound.npc.zFine + areaSound.npc.getSize() * 64;
			redraw(arg2, arg3, areaSound, arg1, arg0);
		}
		for (@Pc(208) AreaSound areaSound = (AreaSound) aClass4_86.head(); areaSound != null; areaSound = (AreaSound) aClass4_86.next()) {
			@Pc(212) byte movementSpeed = 1;
			@Pc(217) BasType basType = areaSound.player.getBasType();
			if (areaSound.player.aBoolean317) {
				movementSpeed = 0;
			} else if (areaSound.player.anInt4585 == basType.anInt6263 || areaSound.player.anInt4585 == basType.anInt6292 || areaSound.player.anInt4585 == basType.anInt6301 || basType.anInt6271 == areaSound.player.anInt4585) {
				movementSpeed = 2;
			} else if (basType.anInt6265 == areaSound.player.anInt4585 || basType.anInt6299 == areaSound.player.anInt4585 || areaSound.player.anInt4585 == basType.anInt6267 || basType.anInt6284 == areaSound.player.anInt4585) {
				movementSpeed = 3;
			}
			if (movementSpeed != areaSound.movementSpeed) {
				@Pc(300) int sound = Player.getSound(areaSound.player);
				if (sound != areaSound.sound) {
					if (areaSound.primaryStream != null) {
						client.soundStream.removeSubStream(areaSound.primaryStream);
						areaSound.primaryStream = null;
					}
					areaSound.sound = sound;
				}
				areaSound.movementSpeed = movementSpeed;
			}
			areaSound.minXFine = areaSound.player.xFine;
			areaSound.maxXFine = areaSound.player.xFine + areaSound.player.getSize() * 64;
			areaSound.minZFine = areaSound.player.zFine;
			areaSound.maxZFine = areaSound.player.zFine + areaSound.player.getSize() * 64;
			redraw(arg2, arg3, areaSound, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILclient!ct;)V")
	public static void remove(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) LocType arg3) {
		for (@Pc(10) AreaSound local10 = (AreaSound) locSounds.head(); local10 != null; local10 = (AreaSound) locSounds.next()) {
			if (local10.level == arg0 && local10.minXFine == arg1 * 128 && local10.minZFine == arg2 * 128 && local10.aClass41_1.anInt1351 == arg3.anInt1351) {
				if (local10.primaryStream != null) {
					client.soundStream.removeSubStream(local10.primaryStream);
					local10.primaryStream = null;
				}
				if (local10.secondaryStream != null) {
					client.soundStream.removeSubStream(local10.secondaryStream);
					local10.secondaryStream = null;
				}
				local10.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public static void method282() {
		for (@Pc(10) AreaSound local10 = (AreaSound) locSounds.head(); local10 != null; local10 = (AreaSound) locSounds.next()) {
			if (local10.multiLocOrNpc) {
				local10.update();
			}
		}
		for (@Pc(30) AreaSound local30 = (AreaSound) npcSounds.head(); local30 != null; local30 = (AreaSound) npcSounds.next()) {
			if (local30.multiLocOrNpc) {
				local30.update();
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V")
	public static void clear(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) AreaSound local12 = (AreaSound) locSounds.head(); local12 != null; local12 = (AreaSound) locSounds.next()) {
			if (local12.primaryStream != null) {
				client.soundStream.removeSubStream(local12.primaryStream);
				local12.primaryStream = null;
			}
			if (local12.secondaryStream != null) {
				client.soundStream.removeSubStream(local12.secondaryStream);
				local12.secondaryStream = null;
			}
			local12.unlink();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(55) AreaSound local55 = (AreaSound) npcSounds.head(); local55 != null; local55 = (AreaSound) npcSounds.next()) {
			if (local55.primaryStream != null) {
				client.soundStream.removeSubStream(local55.primaryStream);
				local55.primaryStream = null;
			}
			local55.unlink();
		}
		for (@Pc(82) AreaSound local82 = (AreaSound) aClass4_86.head(); local82 != null; local82 = (AreaSound) aClass4_86.next()) {
			if (local82.primaryStream != null) {
				client.soundStream.removeSubStream(local82.primaryStream);
				local82.primaryStream = null;
			}
			local82.unlink();
		}
	}
}
