import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class63 {

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	public final int anInt2200;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
	public final int anInt2197;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public final int anInt2192;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V")
	public Class63(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(arg0);
		@Pc(12) int local12 = local8.method5761();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(28) boolean local28 = local8.method5761() == 1;
		this.aByteArray13 = new byte[256];
		local8.method5774(256, this.aByteArray13);
		if (local28) {
			@Pc(44) int[] local44 = new int[256];
			@Pc(47) int[] local47 = new int[256];
			for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
				local44[local49] = local8.method5761();
			}
			for (@Pc(63) int local63 = 0; local63 < 256; local63++) {
				local47[local63] = local8.method5761();
			}
			@Pc(78) byte[][] local78 = new byte[256][];
			@Pc(93) int local93;
			for (@Pc(80) int local80 = 0; local80 < 256; local80++) {
				local78[local80] = new byte[local44[local80]];
				@Pc(91) byte local91 = 0;
				for (local93 = 0; local93 < local78[local80].length; local93++) {
					local91 += local8.method5772();
					local78[local80][local93] = local91;
				}
			}
			@Pc(122) byte[][] local122 = new byte[256][];
			@Pc(137) int local137;
			for (local93 = 0; local93 < 256; local93++) {
				local122[local93] = new byte[local44[local93]];
				@Pc(135) byte local135 = 0;
				for (local137 = 0; local137 < local122[local93].length; local137++) {
					local135 += local8.method5772();
					local122[local93][local137] = local135;
				}
			}
			this.aByteArrayArray17 = new byte[256][256];
			for (@Pc(172) int local172 = 0; local172 < 256; local172++) {
				if (local172 != 32 && local172 != 160) {
					for (local137 = 0; local137 < 256; local137++) {
						if (local137 != 32 && local137 != 160) {
							this.aByteArrayArray17[local172][local137] = (byte) Static158.method3378(local172, local122, this.aByteArray13, local137, local44, local78, local47);
						}
					}
				}
			}
			this.anInt2200 = local44[32] + local47[32];
		} else {
			this.anInt2200 = local8.method5761();
		}
		local8.method5761();
		local8.method5761();
		this.anInt2197 = local8.method5761();
		this.anInt2192 = local8.method5761();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
	public int method1838(@OriginalArg(0) int arg0) {
		return this.aByteArray13[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(CZI)I")
	public int method1841(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		return this.aByteArrayArray17 == null ? 0 : this.aByteArrayArray17[arg1][arg0];
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lclient!qa;Ljava/lang/String;B)I")
	public int method1842(@OriginalArg(0) Class29[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = arg1.length();
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) char local31 = arg1.charAt(local25);
			if (local31 == '<') {
				local11 = local25;
			} else {
				if (local31 == '>' && local11 != -1) {
					@Pc(53) String local53 = arg1.substring(local11 + 1, local25);
					local11 = -1;
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
									@Pc(121) int local121 = Static260.method4756(local53.substring(4));
									local15 += arg0[local121].method5850();
									local13 = -1;
								} catch (@Pc(132) Exception local132) {
								}
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray13[Static57.method4845(local31) & 0xFF] & 0xFF;
					if (this.aByteArrayArray17 != null && local13 != -1) {
						local15 += this.aByteArrayArray17[local13][local31];
					}
					local13 = local31;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!qa;)I")
	public int method1844(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class29[] arg2) {
		return this.method1848(new int[] { arg1 }, arg0, Static1.aStringArray1, arg2);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BILjava/lang/String;[Lclient!qa;)I")
	public int method1845(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class29[] arg2) {
		@Pc(18) int local18 = this.method1848(new int[] { arg0 }, arg1, Static1.aStringArray1, arg2);
		@Pc(20) int local20 = 0;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(38) int local38 = this.method1842(arg2, Static1.aStringArray1[local28]);
			if (local38 > local20) {
				local20 = local38;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lclient!qa;Ljava/lang/String;III)I")
	public int method1846(@OriginalArg(0) Class29[] arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = this.anInt2200;
		@Pc(23) int local23 = this.method1848(new int[] { 100 }, arg1, Static1.aStringArray1, arg0);
		@Pc(29) int local29 = (local23 - 1) * local4;
		return this.anInt2192 + this.anInt2197 + local29;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([IILjava/lang/String;[Ljava/lang/String;[Lclient!qa;)I")
	public int method1848(@OriginalArg(0) int[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) Class29[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg1.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static57.method4845(arg1.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(57) int local57;
				if (local21 == -1) {
					local42 = this.method1838(local40);
					local57 = local30;
					if (this.aByteArrayArray17 != null && local23 != -1) {
						local42 += this.aByteArrayArray17[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local57 = local21;
					@Pc(64) String local64 = arg1.substring(local21 + 1, local30);
					local21 = -1;
					if (local64.equals("br")) {
						arg2[local25] = arg1.substring(local13, local30 + 1);
						local25++;
						if (arg2.length <= local25) {
							return 0;
						}
						local15 = -1;
						local13 = local30 + 1;
						local23 = -1;
						local11 = 0;
						continue;
					}
					if (local64.equals("lt")) {
						local42 = this.method1838(60);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][60];
						}
						local23 = 60;
					} else if (local64.equals("gt")) {
						local42 = this.method1838(62);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][62];
						}
						local23 = 62;
					} else if (local64.equals("nbsp")) {
						local42 = this.method1838(160);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][160];
						}
						local23 = 160;
					} else if (local64.equals("shy")) {
						local42 = this.method1838(173);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][173];
						}
						local23 = 173;
					} else if (local64.equals("times")) {
						local42 = this.method1838(215);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][215];
						}
						local23 = 215;
					} else if (local64.equals("euro")) {
						local42 = this.method1838(8364);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][8364];
						}
						local23 = 8364;
					} else if (local64.equals("copy")) {
						local42 = this.method1838(169);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][169];
						}
						local23 = 169;
					} else if (local64.equals("reg")) {
						local42 = this.method1838(174);
						if (this.aByteArrayArray17 != null && local23 != -1) {
							local42 += this.aByteArrayArray17[local23][174];
						}
						local23 = 174;
					} else if (local64.startsWith("img=") && arg3 != null) {
						try {
							@Pc(300) int local300 = Static260.method4756(local64.substring(4));
							local42 = arg3[local300].method5850();
							local23 = -1;
						} catch (@Pc(311) Exception local311) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg0 != null) {
						if (local40 == 32) {
							local19 = 1;
							local17 = local11;
							local15 = local30;
						}
						if (arg0[arg0.length > local25 ? local25 : arg0.length - 1] < local11) {
							if (local15 >= 0) {
								arg2[local25] = arg1.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg2.length) {
									return 0;
								}
								local13 = local15 + 1;
								local11 -= local17;
								local23 = -1;
								local15 = -1;
							} else {
								arg2[local25] = arg1.substring(local13, local57);
								local25++;
								if (arg2.length <= local25) {
									return 0;
								}
								local13 = local57;
								local23 = -1;
								local11 = local42;
								local15 = -1;
							}
						}
						if (local40 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local30;
						}
					}
				}
			}
		}
		if (arg1.length() > local13) {
			arg2[local25] = arg1.substring(local13, arg1.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method1849(@OriginalArg(1) String arg0) {
		return this.method1842(null, arg0);
	}
}
