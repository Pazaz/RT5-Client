import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class MidiInstrument extends Node {

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "[B")
	public final byte[] aByteArray45 = new byte[128];

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[Lclient!jn;")
	public final PcmSound[] aClass2_Sub21_Sub1Array1 = new PcmSound[128];

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "[B")
	public final byte[] aByteArray46 = new byte[128];

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "[Lclient!bd;")
	public final Class17[] aClass17Array1 = new Class17[128];

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "[I")
	private int[] anIntArray264 = new int[128];

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	public final int anInt4064;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "[S")
	public final short[] aShortArray90 = new short[128];

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "[B")
	public final byte[] aByteArray47 = new byte[128];

	static {
		new LocalizedString("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public MidiInstrument(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Buffer local36 = new Buffer(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.data[local36.pos + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.g1b();
		}
		local38++;
		local36.pos++;
		@Pc(80) int local80 = local36.pos;
		local36.pos += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.data[local36.pos + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local36.g1b();
		}
		local88++;
		local36.pos++;
		@Pc(130) int local130 = local36.pos;
		local36.pos += local88;
		@Pc(138) int local138;
		for (local138 = 0; local36.data[local138 + local36.pos] != 0; local138++) {
		}
		@Pc(152) byte[] local152 = new byte[local138];
		for (@Pc(154) int local154 = 0; local154 < local138; local154++) {
			local152[local154] = local36.g1b();
		}
		local138++;
		local36.pos++;
		@Pc(176) byte[] local176 = new byte[local138];
		@Pc(187) int local187;
		@Pc(189) int local189;
		@Pc(195) int local195;
		if (local138 > 1) {
			local176[1] = 1;
			@Pc(185) int local185 = 1;
			local187 = 2;
			for (local189 = 2; local189 < local138; local189++) {
				local195 = local36.g1();
				if (local195 == 0) {
					local185 = local187++;
				} else {
					if (local185 >= local195) {
						local195--;
					}
					local185 = local195;
				}
				local176[local189] = (byte) local185;
			}
		} else {
			local187 = local138;
		}
		@Pc(224) Class17[] local224 = new Class17[local187];
		for (local189 = 0; local189 < local224.length; local189++) {
			@Pc(236) Class17 local236 = local224[local189] = new Class17();
			@Pc(240) int local240 = local36.g1();
			if (local240 > 0) {
				local236.aByteArray3 = new byte[local240 * 2];
			}
			local240 = local36.g1();
			if (local240 > 0) {
				local236.aByteArray4 = new byte[local240 * 2 + 2];
				local236.aByteArray4[1] = 64;
			}
		}
		local195 = local36.g1();
		@Pc(294) byte[] local294 = local195 <= 0 ? null : new byte[local195 * 2];
		local195 = local36.g1();
		@Pc(310) byte[] local310 = local195 > 0 ? new byte[local195 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.data[local312 + local36.pos] != 0; local312++) {
		}
		@Pc(329) byte[] local329 = new byte[local312];
		for (@Pc(331) int local331 = 0; local331 < local312; local331++) {
			local329[local331] = local36.g1b();
		}
		local36.pos++;
		local312++;
		@Pc(352) int local352 = 0;
		for (@Pc(354) int local354 = 0; local354 < 128; local354++) {
			local352 += local36.g1();
			this.aShortArray90[local354] = (short) local352;
		}
		local352 = 0;
		for (@Pc(378) int local378 = 0; local378 < 128; local378++) {
			local352 += local36.g1();
			this.aShortArray90[local378] = (short) (this.aShortArray90[local378] + (local352 << 8));
		}
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		for (@Pc(411) int local411 = 0; local411 < 128; local411++) {
			if (local405 == 0) {
				if (local407 >= local329.length) {
					local405 = -1;
				} else {
					local405 = local329[local407++];
				}
				local409 = local36.gVarInt();
			}
			this.aShortArray90[local411] = (short) (this.aShortArray90[local411] + ((local409 - 1 & 0x2) << 14));
			this.anIntArray264[local411] = local409;
			local405--;
		}
		local407 = 0;
		local405 = 0;
		@Pc(468) int local468 = 0;
		for (@Pc(470) int local470 = 0; local470 < 128; local470++) {
			if (this.anIntArray264[local470] != 0) {
				if (local405 == 0) {
					if (local52.length <= local407) {
						local405 = -1;
					} else {
						local405 = local52[local407++];
					}
					local468 = local36.data[local80++] - 1;
				}
				this.aByteArray46[local470] = (byte) local468;
				local405--;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray264[local526] != 0) {
				if (local405 == 0) {
					if (local407 < local102.length) {
						local405 = local102[local407++];
					} else {
						local405 = -1;
					}
					local524 = local36.data[local130++] + 16 << 2;
				}
				local405--;
				this.aByteArray45[local526] = (byte) local524;
			}
		}
		local405 = 0;
		local407 = 0;
		@Pc(580) Class17 local580 = null;
		for (@Pc(582) int local582 = 0; local582 < 128; local582++) {
			if (this.anIntArray264[local582] != 0) {
				if (local405 == 0) {
					local580 = local224[local176[local407]];
					if (local407 < local152.length) {
						local405 = local152[local407++];
					} else {
						local405 = -1;
					}
				}
				this.aClass17Array1[local582] = local580;
				local405--;
			}
		}
		local407 = 0;
		local405 = 0;
		@Pc(628) int local628 = 0;
		for (@Pc(630) int local630 = 0; local630 < 128; local630++) {
			if (local405 == 0) {
				if (local329.length <= local407) {
					local405 = -1;
				} else {
					local405 = local329[local407++];
				}
				if (this.anIntArray264[local630] > 0) {
					local628 = local36.g1() + 1;
				}
			}
			local405--;
			this.aByteArray47[local630] = (byte) local628;
		}
		this.anInt4064 = local36.g1() + 1;
		@Pc(689) int local689;
		for (@Pc(678) int local678 = 0; local678 < local187; local678++) {
			@Pc(684) Class17 local684 = local224[local678];
			if (local684.aByteArray3 != null) {
				for (local689 = 1; local689 < local684.aByteArray3.length; local689 += 2) {
					local684.aByteArray3[local689] = local36.g1b();
				}
			}
			if (local684.aByteArray4 != null) {
				for (local689 = 3; local689 < local684.aByteArray4.length - 2; local689 += 2) {
					local684.aByteArray4[local689] = local36.g1b();
				}
			}
		}
		@Pc(742) int local742;
		if (local294 != null) {
			for (local742 = 1; local742 < local294.length; local742 += 2) {
				local294[local742] = local36.g1b();
			}
		}
		if (local310 != null) {
			for (local742 = 1; local742 < local310.length; local742 += 2) {
				local310[local742] = local36.g1b();
			}
		}
		@Pc(791) int local791;
		for (local742 = 0; local742 < local187; local742++) {
			@Pc(784) Class17 local784 = local224[local742];
			if (local784.aByteArray4 != null) {
				local352 = 0;
				for (local791 = 2; local791 < local784.aByteArray4.length; local791 += 2) {
					local352 += local36.g1() + 1;
					local784.aByteArray4[local791] = (byte) local352;
				}
			}
		}
		@Pc(840) int local840;
		for (local689 = 0; local689 < local187; local689++) {
			@Pc(833) Class17 local833 = local224[local689];
			if (local833.aByteArray3 != null) {
				local352 = 0;
				for (local840 = 2; local840 < local833.aByteArray3.length; local840 += 2) {
					local352 = local352 + local36.g1() + 1;
					local833.aByteArray3[local840] = (byte) local352;
				}
			}
		}
		@Pc(910) int local910;
		@Pc(933) int local933;
		@Pc(939) byte local939;
		@Pc(959) int local959;
		@Pc(961) int local961;
		@Pc(971) int local971;
		@Pc(904) byte local904;
		@Pc(1011) int local1011;
		if (local294 != null) {
			local352 = local36.g1();
			local294[0] = (byte) local352;
			for (local791 = 2; local791 < local294.length; local791 += 2) {
				local352 = local352 + local36.g1() + 1;
				local294[local791] = (byte) local352;
			}
			local904 = local294[0];
			@Pc(908) byte local908 = local294[1];
			for (local910 = 0; local910 < local904; local910++) {
				this.aByteArray47[local910] = (byte) (this.aByteArray47[local910] * local908 + 32 >> 6);
			}
			local933 = 2;
			while (local294.length > local933) {
				local939 = local294[local933];
				@Pc(945) byte local945 = local294[local933 + 1];
				local959 = (local939 - local904) / 2 + local908 * (local939 - local904);
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static220.method3876(local959, local939 - local904);
					this.aByteArray47[local961] = (byte) (this.aByteArray47[local961] * local971 + 32 >> 6);
					local959 += local945 - local908;
				}
				local904 = local939;
				local933 += 2;
				local908 = local945;
			}
			for (local1011 = local904; local1011 < 128; local1011++) {
				this.aByteArray47[local1011] = (byte) (local908 * this.aByteArray47[local1011] + 32 >> 6);
			}
		}
		@Pc(1081) int local1081;
		if (local310 != null) {
			local352 = local36.g1();
			local310[0] = (byte) local352;
			for (local791 = 2; local791 < local310.length; local791 += 2) {
				local352 += local36.g1() + 1;
				local310[local791] = (byte) local352;
			}
			local904 = local310[0];
			local1081 = local310[1] << 1;
			for (local910 = 0; local910 < local904; local910++) {
				local933 = (this.aByteArray45[local910] & 0xFF) + local1081;
				if (local933 < 0) {
					local933 = 0;
				}
				if (local933 > 128) {
					local933 = 128;
				}
				this.aByteArray45[local910] = (byte) local933;
			}
			local933 = 2;
			@Pc(1130) int local1130;
			while (local310.length > local933) {
				local939 = local310[local933];
				local1130 = local310[local933 + 1] << 1;
				local959 = (local939 - local904) * local1081 + (local939 - local904) / 2;
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static220.method3876(local959, local939 - local904);
					@Pc(1164) int local1164 = local971 + (this.aByteArray45[local961] & 0xFF);
					if (local1164 < 0) {
						local1164 = 0;
					}
					if (local1164 > 128) {
						local1164 = 128;
					}
					this.aByteArray45[local961] = (byte) local1164;
					local959 += local1130 - local1081;
				}
				local933 += 2;
				local904 = local939;
				local1081 = local1130;
			}
			for (local1011 = local904; local1011 < 128; local1011++) {
				local1130 = local1081 + (this.aByteArray45[local1011] & 0xFF);
				if (local1130 < 0) {
					local1130 = 0;
				}
				if (local1130 > 128) {
					local1130 = 128;
				}
				this.aByteArray45[local1011] = (byte) local1130;
			}
		}
		for (local791 = 0; local791 < local187; local791++) {
			local224[local791].anInt544 = local36.g1();
		}
		for (local840 = 0; local840 < local187; local840++) {
			@Pc(1269) Class17 local1269 = local224[local840];
			if (local1269.aByteArray3 != null) {
				local1269.anInt546 = local36.g1();
			}
			if (local1269.aByteArray4 != null) {
				local1269.anInt542 = local36.g1();
			}
			if (local1269.anInt544 > 0) {
				local1269.anInt541 = local36.g1();
			}
		}
		for (local1081 = 0; local1081 < local187; local1081++) {
			local224[local1081].anInt547 = local36.g1();
		}
		for (local910 = 0; local910 < local187; local910++) {
			@Pc(1323) Class17 local1323 = local224[local910];
			if (local1323.anInt547 > 0) {
				local1323.anInt540 = local36.g1();
			}
		}
		for (local933 = 0; local933 < local187; local933++) {
			@Pc(1343) Class17 local1343 = local224[local933];
			if (local1343.anInt540 > 0) {
				local1343.anInt539 = local36.g1();
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public void release() {
		this.anIntArray264 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BLclient!bk;I[I)Z")
	public boolean method4018(@OriginalArg(0) byte[] arg0, @OriginalArg(1) SoundBank arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) PcmSound local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray264[local19];
				if (local34 != 0) {
					if (local34 != local15) {
						local15 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg1.method871(local34 >> 2, arg2);
						} else {
							local17 = arg1.method869(arg2, local34 >> 2);
						}
						if (local17 == null) {
							local7 = false;
						}
					}
					if (local17 != null) {
						this.aClass2_Sub21_Sub1Array1[local19] = local17;
						this.anIntArray264[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
