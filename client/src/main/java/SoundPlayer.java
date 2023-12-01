import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class SoundPlayer {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIII)V")
	public static void play(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (client.preferences.soundEffectVolume == 0 || arg0 == 0 || Static243.anInt4503 >= 50 || arg3 == -1) {
			return;
		}
		Static256.anIntArray321[Static243.anInt4503] = arg3;
		Static329.anIntArray419[Static243.anInt4503] = arg0;
		Static237.anIntArray283[Static243.anInt4503] = arg2;
		Static196.aClass247Array2[Static243.anInt4503] = null;
		Static162.anIntArray188[Static243.anInt4503] = 0;
		Static223.anIntArray256[Static243.anInt4503] = arg1;
		Static243.anInt4503++;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public static void mainLogic() {
		for (@Pc(7) int local7 = 0; local7 < Static243.anInt4503; local7++) {
			@Pc(15) int local15 = Static237.anIntArray283[local7]--;
			if (Static237.anIntArray283[local7] >= -10) {
				@Pc(90) SynthSound local90 = Static196.aClass247Array2[local7];
				if (local90 == null) {
					local90 = Static409.method6435(client.jsArchive4, Static256.anIntArray321[local7], 0);
					if (local90 == null) {
						continue;
					}
					Static237.anIntArray283[local7] += local90.getStart();
					Static196.aClass247Array2[local7] = local90;
				}
				if (Static237.anIntArray283[local7] < 0) {
					@Pc(143) int local143;
					if (Static162.anIntArray188[local7] == 0) {
						local143 = client.preferences.soundEffectVolume * Static223.anIntArray256[local7] >> 8;
					} else {
						@Pc(133) int local133 = Static162.anIntArray188[local7] >> 24 & 0x3;
						if (PlayerList.self.plane == local133) {
							@Pc(153) int local153 = (Static162.anIntArray188[local7] & 0xFF) * 128;
							@Pc(161) int local161 = Static162.anIntArray188[local7] >> 16 & 0xFF;
							@Pc(171) int local171 = local161 * 128 + 64 - PlayerList.self.xFine;
							if (local171 < 0) {
								local171 = -local171;
							}
							@Pc(187) int local187 = Static162.anIntArray188[local7] >> 8 & 0xFF;
							@Pc(197) int local197 = local187 * 128 + 64 - PlayerList.self.zFine;
							if (local197 < 0) {
								local197 = -local197;
							}
							@Pc(211) int local211 = local197 + local171 - 128;
							if (local153 < local211) {
								Static237.anIntArray283[local7] = -100;
								continue;
							}
							if (local211 < 0) {
								local211 = 0;
							}
							local143 = Static223.anIntArray256[local7] * (local153 - local211) * client.preferences.areaSoundsVolume / local153 >> 8;
						} else {
							local143 = 0;
						}
					}
					if (local143 > 0) {
						@Pc(264) PcmSound local264 = local90.toPcmSound().method3179(client.resampler);
						@Pc(269) Class2_Sub12_Sub4 local269 = Static406.method5006(local264, local143);
						local269.method4984(Static329.anIntArray419[local7] - 1);
						client.soundStream.addSubStream(local269);
					}
					Static237.anIntArray283[local7] = -100;
				}
			} else {
				Static243.anInt4503--;
				for (@Pc(29) int local29 = local7; local29 < Static243.anInt4503; local29++) {
					Static256.anIntArray321[local29] = Static256.anIntArray321[local29 + 1];
					Static196.aClass247Array2[local29] = Static196.aClass247Array2[local29 + 1];
					Static329.anIntArray419[local29] = Static329.anIntArray419[local29 + 1];
					Static237.anIntArray283[local29] = Static237.anIntArray283[local29 + 1];
					Static162.anIntArray188[local29] = Static162.anIntArray188[local29 + 1];
					Static223.anIntArray256[local29] = Static223.anIntArray256[local29 + 1];
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
