import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public int anInt2696;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "[Lclient!v;")
	public Class208[] aClass208Array1;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "[Lclient!ok;")
	public Class1_Sub13_Sub1[] aClass1_Sub13_Sub1Array1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	private Class1_Sub10() {
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub13_Sub1Array1 = new Class1_Sub13_Sub1[128];
		this.aByteArray18 = new byte[128];
		this.aByteArray17 = new byte[128];
		this.aByteArray19 = new byte[128];
		this.aShortArray28 = new short[128];
		this.anIntArray187 = new int[128];
		this.aClass208Array1 = new Class208[128];
		@Pc(36) Class1_Sub16 local36 = new Class1_Sub16(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray86[local36.anInt6813 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method5772();
		}
		local36.anInt6813++;
		local38++;
		@Pc(81) int local81 = local36.anInt6813;
		local36.anInt6813 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray86[local89 + local36.anInt6813] != 0; local89++) {
		}
		@Pc(106) byte[] local106 = new byte[local89];
		for (@Pc(108) int local108 = 0; local108 < local89; local108++) {
			local106[local108] = local36.method5772();
		}
		local36.anInt6813++;
		local89++;
		@Pc(134) int local134 = local36.anInt6813;
		local36.anInt6813 += local89;
		@Pc(142) int local142;
		for (local142 = 0; local36.aByteArray86[local36.anInt6813 + local142] != 0; local142++) {
		}
		@Pc(160) byte[] local160 = new byte[local142];
		for (@Pc(162) int local162 = 0; local162 < local142; local162++) {
			local160[local162] = local36.method5772();
		}
		local36.anInt6813++;
		local142++;
		@Pc(188) byte[] local188 = new byte[local142];
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(209) int local209;
		if (local142 > 1) {
			local188[1] = 1;
			local199 = 2;
			@Pc(201) int local201 = 1;
			for (local203 = 2; local203 < local142; local203++) {
				local209 = local36.method5761();
				if (local209 == 0) {
					local201 = local199++;
				} else {
					if (local209 <= local201) {
						local209--;
					}
					local201 = local209;
				}
				local188[local203] = (byte) local201;
			}
		} else {
			local199 = local142;
		}
		@Pc(245) Class208[] local245 = new Class208[local199];
		for (local203 = 0; local203 < local245.length; local203++) {
			@Pc(257) Class208 local257 = local245[local203] = new Class208();
			@Pc(261) int local261 = local36.method5761();
			if (local261 > 0) {
				local257.aByteArray85 = new byte[local261 * 2];
			}
			local261 = local36.method5761();
			if (local261 > 0) {
				local257.aByteArray84 = new byte[local261 * 2 + 2];
				local257.aByteArray84[1] = 64;
			}
		}
		local209 = local36.method5761();
		@Pc(312) byte[] local312 = local209 <= 0 ? null : new byte[local209 * 2];
		local209 = local36.method5761();
		@Pc(328) byte[] local328 = local209 > 0 ? new byte[local209 * 2] : null;
		@Pc(330) int local330;
		for (local330 = 0; local36.aByteArray86[local330 + local36.anInt6813] != 0; local330++) {
		}
		@Pc(344) byte[] local344 = new byte[local330];
		for (@Pc(346) int local346 = 0; local346 < local330; local346++) {
			local344[local346] = local36.method5772();
		}
		local36.anInt6813++;
		local330++;
		@Pc(367) int local367 = 0;
		for (@Pc(369) int local369 = 0; local369 < 128; local369++) {
			local367 += local36.method5761();
			this.aShortArray28[local369] = (short) local367;
		}
		local367 = 0;
		for (@Pc(393) int local393 = 0; local393 < 128; local393++) {
			local367 += local36.method5761();
			this.aShortArray28[local393] = (short) (this.aShortArray28[local393] + (local367 << 8));
		}
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		@Pc(422) int local422 = 0;
		for (@Pc(424) int local424 = 0; local424 < 128; local424++) {
			if (local418 == 0) {
				if (local420 >= local344.length) {
					local418 = -1;
				} else {
					local418 = local344[local420++];
				}
				local422 = local36.method5745();
			}
			this.aShortArray28[local424] = (short) (this.aShortArray28[local424] + ((local422 - 1 & 0x2) << 14));
			local418--;
			this.anIntArray187[local424] = local422;
		}
		local420 = 0;
		local418 = 0;
		@Pc(481) int local481 = 0;
		for (@Pc(483) int local483 = 0; local483 < 128; local483++) {
			if (this.anIntArray187[local483] != 0) {
				if (local418 == 0) {
					local481 = local36.aByteArray86[local81++] - 1;
					if (local53.length > local420) {
						local418 = local53[local420++];
					} else {
						local418 = -1;
					}
				}
				this.aByteArray18[local483] = (byte) local481;
				local418--;
			}
		}
		local418 = 0;
		local420 = 0;
		@Pc(535) int local535 = 0;
		for (@Pc(537) int local537 = 0; local537 < 128; local537++) {
			if (this.anIntArray187[local537] != 0) {
				if (local418 == 0) {
					local535 = local36.aByteArray86[local134++] + 16 << 2;
					if (local420 >= local106.length) {
						local418 = -1;
					} else {
						local418 = local106[local420++];
					}
				}
				local418--;
				this.aByteArray17[local537] = (byte) local535;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(593) Class208 local593 = null;
		for (@Pc(595) int local595 = 0; local595 < 128; local595++) {
			if (this.anIntArray187[local595] != 0) {
				if (local418 == 0) {
					local593 = local245[local188[local420]];
					if (local420 >= local160.length) {
						local418 = -1;
					} else {
						local418 = local160[local420++];
					}
				}
				this.aClass208Array1[local595] = local593;
				local418--;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local418 == 0) {
				if (local344.length <= local420) {
					local418 = -1;
				} else {
					local418 = local344[local420++];
				}
				if (this.anIntArray187[local643] > 0) {
					local641 = local36.method5761() + 1;
				}
			}
			this.aByteArray19[local643] = (byte) local641;
			local418--;
		}
		this.anInt2696 = local36.method5761() + 1;
		@Pc(714) int local714;
		for (@Pc(703) int local703 = 0; local703 < local199; local703++) {
			@Pc(709) Class208 local709 = local245[local703];
			if (local709.aByteArray85 != null) {
				for (local714 = 1; local714 < local709.aByteArray85.length; local714 += 2) {
					local709.aByteArray85[local714] = local36.method5772();
				}
			}
			if (local709.aByteArray84 != null) {
				for (local714 = 3; local714 < local709.aByteArray84.length - 2; local714 += 2) {
					local709.aByteArray84[local714] = local36.method5772();
				}
			}
		}
		@Pc(763) int local763;
		if (local312 != null) {
			for (local763 = 1; local763 < local312.length; local763 += 2) {
				local312[local763] = local36.method5772();
			}
		}
		if (local328 != null) {
			for (local763 = 1; local763 < local328.length; local763 += 2) {
				local328[local763] = local36.method5772();
			}
		}
		@Pc(812) int local812;
		for (local763 = 0; local763 < local199; local763++) {
			@Pc(805) Class208 local805 = local245[local763];
			if (local805.aByteArray84 != null) {
				local367 = 0;
				for (local812 = 2; local812 < local805.aByteArray84.length; local812 += 2) {
					local367 = local367 + local36.method5761() + 1;
					local805.aByteArray84[local812] = (byte) local367;
				}
			}
		}
		@Pc(861) int local861;
		for (local714 = 0; local714 < local199; local714++) {
			@Pc(854) Class208 local854 = local245[local714];
			if (local854.aByteArray85 != null) {
				local367 = 0;
				for (local861 = 2; local861 < local854.aByteArray85.length; local861 += 2) {
					local367 += local36.method5761() + 1;
					local854.aByteArray85[local861] = (byte) local367;
				}
			}
		}
		@Pc(936) int local936;
		@Pc(959) int local959;
		@Pc(965) byte local965;
		@Pc(986) int local986;
		@Pc(988) int local988;
		@Pc(998) int local998;
		@Pc(930) byte local930;
		@Pc(1037) int local1037;
		if (local312 != null) {
			local367 = local36.method5761();
			local312[0] = (byte) local367;
			for (local812 = 2; local812 < local312.length; local812 += 2) {
				local367 = local367 + local36.method5761() + 1;
				local312[local812] = (byte) local367;
			}
			local930 = local312[0];
			@Pc(934) byte local934 = local312[1];
			for (local936 = 0; local936 < local930; local936++) {
				this.aByteArray19[local936] = (byte) (this.aByteArray19[local936] * local934 + 32 >> 6);
			}
			local959 = 2;
			while (local959 < local312.length) {
				local965 = local312[local959];
				@Pc(971) byte local971 = local312[local959 + 1];
				local986 = local934 * (local965 - local930) + (local965 - local930) / 2;
				for (local988 = local930; local988 < local965; local988++) {
					local998 = Static133.method3029(local986, local965 - local930);
					this.aByteArray19[local988] = (byte) (local998 * this.aByteArray19[local988] + 32 >> 6);
					local986 += local971 - local934;
				}
				local959 += 2;
				local930 = local965;
				local934 = local971;
			}
			for (local1037 = local930; local1037 < 128; local1037++) {
				this.aByteArray19[local1037] = (byte) (local934 * this.aByteArray19[local1037] + 32 >> 6);
			}
		}
		@Pc(1103) int local1103;
		if (local328 != null) {
			local367 = local36.method5761();
			local328[0] = (byte) local367;
			for (local812 = 2; local812 < local328.length; local812 += 2) {
				local367 -= -local36.method5761() - 1;
				local328[local812] = (byte) local367;
			}
			local930 = local328[0];
			local1103 = local328[1] << 1;
			for (local936 = 0; local936 < local930; local936++) {
				local959 = (this.aByteArray17[local936] & 0xFF) + local1103;
				if (local959 < 0) {
					local959 = 0;
				}
				if (local959 > 128) {
					local959 = 128;
				}
				this.aByteArray17[local936] = (byte) local959;
			}
			local959 = 2;
			@Pc(1152) int local1152;
			while (local959 < local328.length) {
				local965 = local328[local959];
				local1152 = local328[local959 + 1] << 1;
				local986 = (local965 - local930) * local1103 + (local965 - local930) / 2;
				for (local988 = local930; local988 < local965; local988++) {
					local998 = Static133.method3029(local986, local965 - local930);
					@Pc(1186) int local1186 = local998 + (this.aByteArray17[local988] & 0xFF);
					if (local1186 < 0) {
						local1186 = 0;
					}
					if (local1186 > 128) {
						local1186 = 128;
					}
					local986 += local1152 - local1103;
					this.aByteArray17[local988] = (byte) local1186;
				}
				local1103 = local1152;
				local959 += 2;
				local930 = local965;
			}
			for (local1037 = local930; local1037 < 128; local1037++) {
				local1152 = (this.aByteArray17[local1037] & 0xFF) + local1103;
				if (local1152 < 0) {
					local1152 = 0;
				}
				if (local1152 > 128) {
					local1152 = 128;
				}
				this.aByteArray17[local1037] = (byte) local1152;
			}
		}
		for (local812 = 0; local812 < local199; local812++) {
			local245[local812].anInt6649 = local36.method5761();
		}
		for (local861 = 0; local861 < local199; local861++) {
			@Pc(1287) Class208 local1287 = local245[local861];
			if (local1287.aByteArray85 != null) {
				local1287.anInt6646 = local36.method5761();
			}
			if (local1287.aByteArray84 != null) {
				local1287.anInt6653 = local36.method5761();
			}
			if (local1287.anInt6649 > 0) {
				local1287.anInt6651 = local36.method5761();
			}
		}
		for (local1103 = 0; local1103 < local199; local1103++) {
			local245[local1103].anInt6655 = local36.method5761();
		}
		for (local936 = 0; local936 < local199; local936++) {
			@Pc(1341) Class208 local1341 = local245[local936];
			if (local1341.anInt6655 > 0) {
				local1341.anInt6647 = local36.method5761();
			}
		}
		for (local959 = 0; local959 < local199; local959++) {
			@Pc(1361) Class208 local1361 = local245[local959];
			if (local1361.anInt6647 > 0) {
				local1361.anInt6654 = local36.method5761();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V")
	public void method2263() {
		this.anIntArray187 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([ILclient!hj;I[B)Z")
	public boolean method2266(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class85 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(14) boolean local14 = true;
		@Pc(16) int local16 = 0;
		@Pc(18) Class1_Sub13_Sub1 local18 = null;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg2 == null || arg2[local20] != 0) {
				@Pc(35) int local35 = this.anIntArray187[local20];
				if (local35 != 0) {
					if (local16 != local35) {
						local16 = local35--;
						if ((local35 & 0x1) == 0) {
							local18 = arg1.method2383(arg0, local35 >> 2);
						} else {
							local18 = arg1.method2380(local35 >> 2, arg0);
						}
						if (local18 == null) {
							local14 = false;
						}
					}
					if (local18 != null) {
						this.aClass1_Sub13_Sub1Array1[local20] = local18;
						this.anIntArray187[local20] = 0;
					}
				}
			}
		}
		return local14;
	}
}
