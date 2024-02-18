import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class381 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "[B")
	private final byte[] aByteArray106;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "[[B")
	private byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public final int anInt10027;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public final int anInt10030;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public final int anInt10036;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([B)V")
	public Class381(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Packet local6 = new Packet(arg0);
		@Pc(10) int local10 = local6.g1();
		if (local10 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local6.g1() == 1;
		this.aByteArray106 = new byte[256];
		local6.gdata(this.aByteArray106, 0, 256);
		if (local30) {
			@Pc(46) int[] local46 = new int[256];
			for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
				local46[local48] = local6.g1();
			}
			@Pc(62) int[] local62 = new int[256];
			for (@Pc(64) int local64 = 0; local64 < 256; local64++) {
				local62[local64] = local6.g1();
			}
			@Pc(78) byte[][] local78 = new byte[256][];
			@Pc(92) int local92;
			for (@Pc(80) int local80 = 0; local80 < 256; local80++) {
				local78[local80] = new byte[local46[local80]];
				@Pc(90) byte local90 = 0;
				for (local92 = 0; local92 < local78[local80].length; local92++) {
					local90 += local6.g1b();
					local78[local80][local92] = local90;
				}
			}
			@Pc(128) byte[][] local128 = new byte[256][];
			@Pc(142) int local142;
			for (local92 = 0; local92 < 256; local92++) {
				local128[local92] = new byte[local46[local92]];
				@Pc(140) byte local140 = 0;
				for (local142 = 0; local142 < local128[local92].length; local142++) {
					local140 += local6.g1b();
					local128[local92][local142] = local140;
				}
			}
			this.aByteArrayArray34 = new byte[256][256];
			for (@Pc(178) int local178 = 0; local178 < 256; local178++) {
				if (local178 != 32 && local178 != 160) {
					for (local142 = 0; local142 < 256; local142++) {
						if (local142 != 32 && local142 != 160) {
							this.aByteArrayArray34[local178][local142] = (byte) Static359.method5225(local62, local142, local46, local178, local78, this.aByteArray106, local128);
						}
					}
				}
			}
			this.anInt10027 = local62[32] + local46[32];
		} else {
			this.anInt10027 = local6.g1();
		}
		local6.g1();
		local6.g1();
		this.anInt10030 = local6.g1();
		this.anInt10036 = local6.g1();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(CII)I")
	public int method8737(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return this.aByteArrayArray34 == null ? 0 : this.aByteArrayArray34[arg1][arg0];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
	public int method8738(@OriginalArg(0) int arg0) {
		return this.aByteArray106[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;[Lclient!st;BI)I")
	public int method8739(@OriginalArg(0) String arg0, @OriginalArg(1) Class23[] arg1, @OriginalArg(3) int arg2) {
		return this.method8740(Static623.aStringArray43, new int[] { arg2 }, arg1, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([Ljava/lang/String;[II[Lclient!st;Ljava/lang/String;)I")
	public int method8740(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class23[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = -1;
		@Pc(16) int local16 = 0;
		@Pc(18) byte local18 = 0;
		@Pc(20) int local20 = -1;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(35) int local35 = arg3.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(46) int local46 = Static41.method1028(arg3.charAt(local37)) & 0xFF;
			@Pc(48) int local48 = 0;
			if (local46 == 60) {
				local20 = local37;
			} else {
				@Pc(69) int local69;
				if (local20 == -1) {
					local48 = this.method8738(local46);
					local69 = local37;
					if (this.aByteArrayArray34 != null && local22 != -1) {
						local48 += this.aByteArrayArray34[local22][local46];
					}
					local22 = local46;
				} else {
					if (local46 != 62) {
						continue;
					}
					local69 = local20;
					@Pc(76) String local76 = arg3.substring(local20 + 1, local37);
					local20 = -1;
					if (local76.equals("br")) {
						arg0[local24] = arg3.substring(local12, local37 + 1);
						local24++;
						if (arg0.length <= local24) {
							return 0;
						}
						local10 = 0;
						local12 = local37 + 1;
						local14 = -1;
						local22 = -1;
						continue;
					}
					if (local76.equals("lt")) {
						local48 = this.method8738(60);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][60];
						}
						local22 = 60;
					} else if (local76.equals("gt")) {
						local48 = this.method8738(62);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][62];
						}
						local22 = 62;
					} else if (local76.equals("nbsp")) {
						local48 = this.method8738(160);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][160];
						}
						local22 = 160;
					} else if (local76.equals("shy")) {
						local48 = this.method8738(173);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][173];
						}
						local22 = 173;
					} else if (local76.equals("times")) {
						local48 = this.method8738(215);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][215];
						}
						local22 = 215;
					} else if (local76.equals("euro")) {
						local48 = this.method8738(8364);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][8364];
						}
						local22 = 8364;
					} else if (local76.equals("copy")) {
						local48 = this.method8738(169);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][169];
						}
						local22 = 169;
					} else if (local76.equals("reg")) {
						local48 = this.method8738(174);
						if (this.aByteArrayArray34 != null && local22 != -1) {
							local48 += this.aByteArrayArray34[local22][174];
						}
						local22 = 174;
					} else if (local76.startsWith("img=") && arg2 != null) {
						try {
							@Pc(242) int local242 = Static647.method8473(local76.substring(4));
							local48 = arg2[local242].method8203();
							local22 = -1;
						} catch (@Pc(253) Exception local253) {
						}
					}
					local46 = -1;
				}
				if (local48 > 0) {
					local10 += local48;
					if (arg1 != null) {
						if (local46 == 32) {
							local14 = local37;
							local18 = 1;
							local16 = local10;
						}
						if (arg1[arg1.length <= local24 ? arg1.length - 1 : local24] < local10) {
							if (local14 < 0) {
								arg0[local24] = arg3.substring(local12, local69);
								local24++;
								if (local24 >= arg0.length) {
									return 0;
								}
								local12 = local69;
								local10 = local48;
								local22 = -1;
								local14 = -1;
							} else {
								arg0[local24] = arg3.substring(local12, local14 + 1 - local18);
								local24++;
								if (arg0.length <= local24) {
									return 0;
								}
								local12 = local14 + 1;
								local14 = -1;
								local10 -= local16;
								local22 = -1;
							}
						}
						if (local46 == 45) {
							local16 = local10;
							local18 = 0;
							local14 = local37;
						}
					}
				}
			}
		}
		if (arg3.length() > local12) {
			arg0[local24] = arg3.substring(local12, arg3.length());
			local24++;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([Lclient!st;ILjava/lang/String;I)I")
	public int method8741(@OriginalArg(0) Class23[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.method8740(Static623.aStringArray43, new int[] { arg2 }, arg0, arg1);
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(29) int local29 = this.method8742(arg0, Static623.aStringArray43[local20]);
			if (local18 < local29) {
				local18 = local29;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[Lclient!st;Ljava/lang/String;)I")
	public int method8742(@OriginalArg(1) Class23[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(10) int local10 = -1;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = arg1.length();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) char local31 = arg1.charAt(local26);
			if (local31 == '<') {
				local10 = local26;
			} else {
				if (local31 == '>' && local10 != -1) {
					@Pc(53) String local53 = arg1.substring(local10 + 1, local26);
					local10 = -1;
					if (local53.equals("lt")) {
						local31 = '<';
					} else if (local53.equals("gt")) {
						local31 = '>';
					} else if (local53.equals("nbsp")) {
						local31 = ' ';
					} else if (local53.equals("shy")) {
						local31 = '\u00ad';
					} else if (local53.equals("times")) {
						local31 = '×';
					} else if (local53.equals("euro")) {
						local31 = '€';
					} else if (local53.equals("copy")) {
						local31 = '©';
					} else {
						if (!local53.equals("reg")) {
							if (local53.startsWith("img=") && arg0 != null) {
								try {
									@Pc(143) int local143 = Static647.method8473(local53.substring(4));
									local19 = -1;
									local21 += arg0[local143].method8203();
								} catch (@Pc(154) Exception local154) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local10 == -1) {
					local21 += this.aByteArray106[Static41.method1028(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray34 != null && local19 != -1) {
						local21 += this.aByteArrayArray34[local19][local31];
					}
					local19 = local31;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;[Lclient!st;II)Ljava/lang/String;")
	public String method8743(@OriginalArg(0) String arg0, @OriginalArg(1) Class23[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= this.method8742(arg1, arg0)) {
			return arg0;
		}
		@Pc(27) int local27 = arg2 - this.method8742((Class23[]) null, "...");
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		@Pc(38) String local38 = "";
		for (@Pc(40) int local40 = 0; local40 < local36; local40++) {
			@Pc(45) char local45 = arg0.charAt(local40);
			if (local45 == '<') {
				local29 = local40;
			} else {
				if (local45 == '>' && local29 != -1) {
					@Pc(69) String local69 = arg0.substring(local29 + 1, local40);
					local29 = -1;
					if (local69.equals("lt")) {
						local45 = '<';
					} else if (local69.equals("gt")) {
						local45 = '>';
					} else if (local69.equals("nbsp")) {
						local45 = ' ';
					} else if (local69.equals("shy")) {
						local45 = '\u00ad';
					} else if (local69.equals("times")) {
						local45 = '×';
					} else if (local69.equals("euro")) {
						local45 = '€';
					} else if (local69.equals("copy")) {
						local45 = '©';
					} else {
						if (!local69.equals("reg")) {
							if (local69.startsWith("img=") && arg1 != null) {
								try {
									@Pc(155) int local155 = Static647.method8473(local69.substring(4));
									local33 += arg1[local155].method8203();
									local31 = -1;
									if (local33 > local27) {
										return local38 + "...";
									}
									local38 = arg0.substring(0, local40 + 1);
								} catch (@Pc(192) Exception local192) {
								}
							}
							continue;
						}
						local45 = '®';
					}
				}
				if (local29 == -1) {
					local33 += this.aByteArray106[Static41.method1028(local45) & 0xFF] & 0xFF;
					if (this.aByteArrayArray34 != null && local31 != -1) {
						local33 += this.aByteArrayArray34[local31][local45];
					}
					local31 = local45;
					@Pc(242) int local242 = local33;
					if (this.aByteArrayArray34 != null) {
						local242 = local33 + this.aByteArrayArray34[local45][46];
					}
					if (local27 < local242) {
						return local38 + "...";
					}
					local38 = arg0.substring(0, local40 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method8744(@OriginalArg(1) String arg0) {
		return this.method8742((Class23[]) null, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/String;[Lclient!st;B)I")
	public int method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class23[] arg3) {
		if (arg1 == 0) {
			arg1 = this.anInt10027;
		}
		@Pc(24) int local24 = this.method8740(Static623.aStringArray43, new int[] { arg0 }, arg3, arg2);
		@Pc(42) int local42 = arg1 * (local24 - 1);
		return local42 + this.anInt10030 + this.anInt10036;
	}
}
