import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SoundPlayer {

	@OriginalMember(owner = "client!om", name = "K", descriptor = "[I")
	public static final int[] ids = new int[50];
	@OriginalMember(owner = "client!tc", name = "T", descriptor = "[I")
	public static final int[] loops = new int[50];
	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
	public static final int[] delays = new int[50];
	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[Lclient!wk;")
	public static final SynthSound[] sounds = new SynthSound[50];
	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
	public static final int[] positions = new int[50];
	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
	public static final int[] volumes = new int[50];
	@OriginalMember(owner = "client!nt", name = "Q", descriptor = "I")
	public static int size = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIII)V")
	public static void play(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (client.preferences.soundEffectVolume == 0 || arg0 == 0 || size >= 50 || arg3 == -1) {
			return;
		}
		ids[size] = arg3;
		loops[size] = arg0;
		delays[size] = arg2;
		sounds[size] = null;
		positions[size] = 0;
		volumes[size] = arg1;
		size++;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void mainLogic() {
		for (@Pc(7) int local7 = 0; local7 < size; local7++) {
			@Pc(15) int local15 = delays[local7]--;
			if (delays[local7] >= -10) {
				@Pc(90) SynthSound local90 = sounds[local7];
				if (local90 == null) {
					local90 = SynthSound.create(client.jsArchive4, ids[local7], 0);
					if (local90 == null) {
						continue;
					}
					delays[local7] += local90.getStart();
					sounds[local7] = local90;
				}
				if (delays[local7] < 0) {
					@Pc(143) int local143;
					if (positions[local7] == 0) {
						local143 = client.preferences.soundEffectVolume * volumes[local7] >> 8;
					} else {
						@Pc(133) int local133 = positions[local7] >> 24 & 0x3;
						if (PlayerList.self.plane == local133) {
							@Pc(153) int local153 = (positions[local7] & 0xFF) * 128;
							@Pc(161) int local161 = positions[local7] >> 16 & 0xFF;
							@Pc(171) int local171 = local161 * 128 + 64 - PlayerList.self.xFine;
							if (local171 < 0) {
								local171 = -local171;
							}
							@Pc(187) int local187 = positions[local7] >> 8 & 0xFF;
							@Pc(197) int local197 = local187 * 128 + 64 - PlayerList.self.zFine;
							if (local197 < 0) {
								local197 = -local197;
							}
							@Pc(211) int local211 = local197 + local171 - 128;
							if (local153 < local211) {
								delays[local7] = -100;
								continue;
							}
							if (local211 < 0) {
								local211 = 0;
							}
							local143 = volumes[local7] * (local153 - local211) * client.preferences.areaSoundsVolume / local153 >> 8;
						} else {
							local143 = 0;
						}
					}
					if (local143 > 0) {
						@Pc(264) PcmSound local264 = local90.toPcmSound().method3179(client.resampler);
						@Pc(269) Class2_Sub12_Sub4 local269 = Static406.method5006(local264, local143);
						local269.method4984(loops[local7] - 1);
						client.soundStream.addSubStream(local269);
					}
					delays[local7] = -100;
				}
			} else {
				size--;
				for (@Pc(29) int local29 = local7; local29 < size; local29++) {
					ids[local29] = ids[local29 + 1];
					sounds[local29] = sounds[local29 + 1];
					loops[local29] = loops[local29 + 1];
					delays[local29] = delays[local29 + 1];
					positions[local29] = positions[local29 + 1];
					volumes[local29] = volumes[local29 + 1];
				}
				local7--;
			}
		}
		if (MidiPlayer.jingle && !Static64.method1704()) {
			if (client.preferences.musicVolume != 0 && MusicPlayer.groupId != -1) {
				MidiPlayer.playImmediate(client.preferences.musicVolume, MusicPlayer.groupId, client.jsArchive6);
			}
			MidiPlayer.jingle = false;
		} else if (client.preferences.musicVolume != 0 && MusicPlayer.groupId != -1 && !Static64.method1704()) {
			Protocol.writeOpcode(ClientProt.SOUND_SONGEND);
			Protocol.outboundBuffer.p4(MusicPlayer.groupId);
			MusicPlayer.groupId = -1;
		}
	}

}
