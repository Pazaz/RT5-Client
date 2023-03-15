import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public static int anInt2317;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public static int anInt2319;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILclient!nb;IILclient!gn;ILclient!wm;IZIII)Lclient!gn;")
	public static Model method2340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Model arg7, @OriginalArg(8) int arg8, @OriginalArg(9) TextureProvider arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg4 != null) {
			local11 = arg4.method3990(arg0, false, -1) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg10 << 32) + ((long) ((arg1 << 24) + (arg2 << 16) + arg5) + ((long) arg6 << 48));
		@Pc(50) LruHashTable local50 = Static98.aClass98_10;
		@Pc(58) Model local58;
		synchronized (Static98.aClass98_10) {
			local58 = (Model) Static98.aClass98_10.get(local48);
		}
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(169) int local169;
		@Pc(173) int local173;
		if (local58 == null || arg9.method2863(local58.method3827(), local11) != 0) {
			if (local58 != null) {
				local11 = arg9.method2806(local11, local58.method3827());
			}
			@Pc(93) byte local93;
			if (arg5 == 1) {
				local93 = 9;
			} else if (arg5 == 2) {
				local93 = 12;
			} else if (arg5 == 3) {
				local93 = 15;
			} else if (arg5 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(132) int[] local132 = new int[] { 64, 96, 128 };
			@Pc(150) Class185 local150 = new Class185(local93 * 3 + 1, -local93 + local93 * 3 * 2, 0);
			local157 = local150.method4665(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local93];
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (local163 = 0; local163 < 3; local163++) {
				local169 = local132[local163];
				local173 = local132[local163];
				for (local175 = 0; local175 < local93; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local93;
					@Pc(191) int local191 = TextureProvider.anIntArray178[local183] * local169 >> 15;
					local199 = local173 * TextureProvider.anIntArray177[local183] >> 15;
					local161[local163][local175] = local150.method4665(0, local191, local199);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(250) byte local250 = (byte) (arg2 * local175 + local173 * arg1 >> 8);
				@Pc(295) short local295 = (short) (((arg10 & 0x380) * local175 + (arg6 & 0x380) * local173 & 0x38000) + ((arg10 & 0xFC00) * local175 + (arg6 & 0xFC00) * local173 & 0xFC0000) + (local175 * (arg10 & 0x7F) + (arg6 & 0x7F) * local173 & 0x7F00) >> 8);
				for (local199 = 0; local199 < local93; local199++) {
					if (local169 == 0) {
						local150.method4659(local295, local157, local250, local161[0][(local199 + 1) % local93], (byte) 1, local161[0][local199], (short) -1, (byte) -1);
					} else {
						local150.method4659(local295, local161[local169 - 1][local199], local250, local161[local169 - 1][(local199 + 1) % local93], (byte) 1, local161[local169][(local199 + 1) % local93], (short) -1, (byte) -1);
						local150.method4659(local295, local161[local169 - 1][local199], local250, local161[local169][(local199 + 1) % local93], (byte) 1, local161[local169][local199], (short) -1, (byte) -1);
					}
				}
			}
			local58 = arg9.method2864(local150, local11, Static199.anInt5756, 64, 768);
			@Pc(411) LruHashTable local411 = Static98.aClass98_10;
			synchronized (Static98.aClass98_10) {
				Static98.aClass98_10.put(local48, local58);
			}
		}
		@Pc(430) int local430 = arg5 * 64 - 1;
		@Pc(433) int local433 = -local430;
		@Pc(436) int local436 = -local430;
		@Pc(438) int local438 = local430;
		local157 = local430;
		if (arg11) {
			if (arg8 > 1024 && arg8 < 7168) {
				local433 -= 128;
			}
			if (arg8 > 5120 && arg8 < 11264) {
				local157 = local430 + 128;
			}
			if (arg8 > 13312 || arg8 < 3072) {
				local436 -= 128;
			}
			if (arg8 > 9216 && arg8 < 15360) {
				local438 = local430 + 128;
			}
		}
		@Pc(477) int local477 = arg7.method3806();
		local163 = arg7.method3822();
		local169 = arg7.method3812();
		if (local436 > local169) {
			local169 = local436;
		}
		if (local477 < local433) {
			local477 = local433;
		}
		if (local163 > local438) {
			local163 = local438;
		}
		local173 = arg7.method3832();
		if (local157 < local173) {
			local173 = local157;
		}
		@Pc(521) AnimFrameset local521 = null;
		if (arg4 != null) {
			@Pc(528) int local528 = arg4.anIntArray262[arg0];
			local521 = client.SeqTypes.method2368(local528 >> 16);
			arg0 = local528 & 0xFFFF;
		}
		if (local521 == null) {
			local58 = local58.method3800((byte) 3, local11, true);
			local58.method3842((local163 - local477) / 2, 128, (local173 - local169) / 2);
			local58.method3813((local477 + local163) / 2, 0, (local173 + local169) / 2);
		} else {
			local58 = local58.method3800((byte) 3, local11, true);
			local58.method3842((local163 - local477) / 2, 128, (local173 - local169) / 2);
			local58.method3813((local477 + local163) / 2, 0, (local173 + local169) / 2);
			local58.method3818(local521, arg0);
		}
		if (arg13 != 0) {
			local58.method3824(arg13);
		}
		if (arg3 != 0) {
			local58.method3815(arg3);
		}
		if (arg12 != 0) {
			local58.method3813(0, arg12, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method2342() {
		if (client.musicChannel != null) {
			client.musicChannel.method6326();
		}
		if (client.soundChannel != null) {
			client.soundChannel.method6326();
		}
		AudioChannel.init(client.preferences.stereo);
		client.musicChannel = AudioChannel.create(0, GameShell.signlink, GameShell.canvas, 22050);
		client.musicChannel.setStream(client.musicStream);
		client.soundChannel = AudioChannel.create(1, GameShell.signlink, GameShell.canvas, 2048);
		client.soundChannel.setStream(client.soundStream);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)I")
	public static int method2344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static391.anIntArray495[arg1 & 0x3] : Static208.anIntArray227[arg1 & 0x3];
	}
}
