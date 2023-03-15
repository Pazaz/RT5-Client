import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class239 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "[B")
	private final byte[] aByteArray98;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	public final int anInt6841;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	public final int anInt6836;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public final int anInt6846;

	static {
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
	public Class239(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Buffer local8 = new Buffer(arg0);
		@Pc(12) int local12 = local8.g1();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(31) boolean local31 = local8.g1() == 1;
		this.aByteArray98 = new byte[256];
		local8.gdata(this.aByteArray98, 256);
		if (local31) {
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local47[local49] = local8.g1();
			}
			@Pc(64) int[] local64 = new int[256];
			for (@Pc(66) int local66 = 0; local66 < 256; local66++) {
				local64[local66] = local8.g1();
			}
			@Pc(81) byte[][] local81 = new byte[256][];
			@Pc(96) int local96;
			for (@Pc(83) int local83 = 0; local83 < 256; local83++) {
				local81[local83] = new byte[local47[local83]];
				@Pc(94) byte local94 = 0;
				for (local96 = 0; local96 < local81[local83].length; local96++) {
					local94 += local8.g1b();
					local81[local83][local96] = local94;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local96 = 0; local96 < 256; local96++) {
				local131[local96] = new byte[local47[local96]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local96].length; local146++) {
					local144 += local8.g1b();
					local131[local96][local146] = local144;
				}
			}
			this.aByteArrayArray22 = new byte[256][256];
			for (@Pc(179) int local179 = 0; local179 < 256; local179++) {
				if (local179 != 32 && local179 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray22[local179][local146] = (byte) Static155.method2788(local47, local179, this.aByteArray98, local131, local64, local81, local146);
						}
					}
				}
			}
			this.anInt6841 = local64[32] + local47[32];
		} else {
			this.anInt6841 = local8.g1();
		}
		local8.g1();
		local8.g1();
		this.anInt6836 = local8.g1();
		this.anInt6846 = local8.g1();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[Ljava/lang/String;Ljava/lang/String;[I[Lclient!jd;)I")
	public int method6119(@OriginalArg(1) String[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Sprite[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(27) byte local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg1.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(48) int local48 = Static234.method4099(arg1.charAt(local38)) & 0xFF;
			@Pc(50) int local50 = 0;
			if (local48 == 60) {
				local29 = local38;
			} else {
				@Pc(70) int local70;
				if (local29 == -1) {
					local70 = local38;
					local50 = this.method6122(local48);
					if (this.aByteArrayArray22 != null && local31 != -1) {
						local50 += this.aByteArrayArray22[local31][local48];
					}
					local31 = local48;
				} else {
					if (local48 != 62) {
						continue;
					}
					local70 = local29;
					@Pc(77) String local77 = arg1.substring(local29 + 1, local38);
					local29 = -1;
					if (local77.equals("br")) {
						arg0[local33] = arg1.substring(local21, local38 + 1);
						local33++;
						if (local33 >= arg0.length) {
							return 0;
						}
						local21 = local38 + 1;
						local31 = -1;
						local23 = -1;
						local11 = 0;
						continue;
					}
					if (local77.equals("lt")) {
						local50 = this.method6122(60);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][60];
						}
						local31 = 60;
					} else if (local77.equals("gt")) {
						local50 = this.method6122(62);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][62];
						}
						local31 = 62;
					} else if (local77.equals("nbsp")) {
						local50 = this.method6122(160);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][160];
						}
						local31 = 160;
					} else if (local77.equals("shy")) {
						local50 = this.method6122(173);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][173];
						}
						local31 = 173;
					} else if (local77.equals("times")) {
						local50 = this.method6122(215);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][215];
						}
						local31 = 215;
					} else if (local77.equals("euro")) {
						local50 = this.method6122(8364);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][8364];
						}
						local31 = 8364;
					} else if (local77.equals("copy")) {
						local50 = this.method6122(169);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][169];
						}
						local31 = 169;
					} else if (local77.equals("reg")) {
						local50 = this.method6122(174);
						if (this.aByteArrayArray22 != null && local31 != -1) {
							local50 += this.aByteArrayArray22[local31][174];
						}
						local31 = 174;
					} else if (local77.startsWith("img=") && arg3 != null) {
						try {
							@Pc(286) int local286 = Static146.method2698(local77.substring(4));
							local31 = -1;
							local50 = arg3[local286].method6399();
						} catch (@Pc(297) Exception local297) {
						}
					}
					local48 = -1;
				}
				if (local50 > 0) {
					local11 += local50;
					if (arg2 != null) {
						if (local48 == 32) {
							local25 = local11;
							local27 = 1;
							local23 = local38;
						}
						if (local11 > arg2[arg2.length <= local33 ? arg2.length - 1 : local33]) {
							if (local23 >= 0) {
								arg0[local33] = arg1.substring(local21, local23 + 1 - local27);
								local33++;
								if (arg0.length <= local33) {
									return 0;
								}
								local21 = local23 + 1;
								local31 = -1;
								local23 = -1;
								local11 -= local25;
							} else {
								arg0[local33] = arg1.substring(local21, local70);
								local33++;
								if (local33 >= arg0.length) {
									return 0;
								}
								local21 = local70;
								local11 = local50;
								local23 = -1;
								local31 = -1;
							}
						}
						if (local48 == 45) {
							local25 = local11;
							local27 = 0;
							local23 = local38;
						}
					}
				}
			}
		}
		if (arg1.length() > local21) {
			arg0[local33] = arg1.substring(local21, arg1.length());
			local33++;
		}
		return local33;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/String;B[Lclient!jd;I)I")
	public int method6121(@OriginalArg(1) String arg0, @OriginalArg(3) Sprite[] arg1) {
		@Pc(4) int local4 = this.anInt6841;
		@Pc(21) int local21 = this.method6119(Static112.aStringArray18, arg0, new int[] { 100 }, arg1);
		@Pc(27) int local27 = local4 * (local21 - 1);
		return this.anInt6836 + local27 + this.anInt6846;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
	public int method6122(@OriginalArg(1) int arg0) {
		return this.aByteArray98[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/String;I[Lclient!jd;)I")
	public int method6123(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Sprite[] arg2) {
		return this.method6119(Static112.aStringArray18, arg0, new int[] { arg1 }, arg2);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([Lclient!jd;Ljava/lang/String;BI)I")
	public int method6124(@OriginalArg(0) Sprite[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method6119(Static112.aStringArray18, arg1, new int[] { arg2 }, arg0);
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local18; local22++) {
			@Pc(40) int local40 = this.method6127(arg0, Static112.aStringArray18[local22]);
			if (local20 < local40) {
				local20 = local40;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIC)I")
	public int method6125(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray22 == null ? 0 : this.aByteArrayArray22[arg0][arg1];
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method6126(@OriginalArg(0) String arg0) {
		return this.method6127(null, arg0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([Lclient!jd;ZLjava/lang/String;)I")
	public int method6127(@OriginalArg(0) Sprite[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg1.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) char local34 = arg1.charAt(local28);
			if (local34 == '<') {
				local19 = local28;
			} else {
				if (local34 == '>' && local19 != -1) {
					@Pc(58) String local58 = arg1.substring(local19 + 1, local28);
					local19 = -1;
					if (local58.equals("lt")) {
						local34 = '<';
					} else if (local58.equals("gt")) {
						local34 = '>';
					} else if (local58.equals("nbsp")) {
						local34 = ' ';
					} else if (local58.equals("shy")) {
						local34 = '\u00ad';
					} else if (local58.equals("times")) {
						local34 = '×';
					} else if (local58.equals("euro")) {
						local34 = '€';
					} else if (local58.equals("copy")) {
						local34 = '©';
					} else {
						if (!local58.equals("reg")) {
							if (local58.startsWith("img=") && arg0 != null) {
								try {
									@Pc(118) int local118 = Static146.method2698(local58.substring(4));
									local23 += arg0[local118].method6399();
									local21 = -1;
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local34 = '®';
					}
				}
				if (local19 == -1) {
					local23 += this.aByteArray98[Static234.method4099(local34) & 0xFF] & 0xFF;
					if (this.aByteArrayArray22 != null && local21 != -1) {
						local23 += this.aByteArrayArray22[local21][local34];
					}
					local21 = local34;
				}
			}
		}
		return local23;
	}
}
