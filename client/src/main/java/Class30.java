import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public abstract class Class30 {

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Lclient!nr;")
	private final Class40 aClass40_7;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "Lclient!fi;")
	private final Class63 aClass63_8;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!nr;Lclient!fi;)V")
	protected Class30(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class63 arg1) {
		this.aClass40_7 = arg0;
		this.aClass63_8 = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public final void method4828(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method4840(-16777216, arg3);
		@Pc(16) int local16 = arg1.length();
		@Pc(19) int[] local19 = new int[local16];
		@Pc(22) int[] local22 = new int[local16];
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			local19[local24] = (int) (Math.sin((double) local24 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local22[local24] = (int) (Math.sin((double) local24 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4829(arg0, arg1, arg2 - this.aClass63_8.method1849(arg1) / 2, local19, local22, null, null);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;I[I[I[Lclient!qa;Z[I)V")
	private void method4829(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class29[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(11) int local11 = arg0 - this.aClass63_8.anInt2200;
		@Pc(13) int local13 = -1;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(27) int local27 = arg1.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(40) char local40 = (char) (Static57.method4845(arg1.charAt(local29)) & 0xFF);
			if (local40 == '<') {
				local13 = local29;
			} else {
				@Pc(127) int local127;
				@Pc(137) int local137;
				if (local40 == '>' && local13 != -1) {
					@Pc(65) String local65 = arg1.substring(local13 + 1, local29);
					local13 = -1;
					if (local65.equals("lt")) {
						local40 = '<';
					} else if (local65.equals("gt")) {
						local40 = '>';
					} else if (local65.equals("nbsp")) {
						local40 = ' ';
					} else if (local65.equals("shy")) {
						local40 = '\u00ad';
					} else if (local65.equals("times")) {
						local40 = '×';
					} else if (local65.equals("euro")) {
						local40 = '€';
					} else if (local65.equals("copy")) {
						local40 = '©';
					} else {
						if (!local65.equals("reg")) {
							if (local65.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local127 = 0;
									} else {
										local127 = arg3[local24];
									}
									if (arg4 == null) {
										local137 = 0;
									} else {
										local137 = arg4[local24];
									}
									local24++;
									@Pc(148) int local148 = Static260.method4756(local65.substring(4));
									@Pc(152) Class29 local152 = arg5[local148];
									@Pc(161) int local161 = arg6 == null ? local152.method5832() : arg6[local148];
									local152.method5836(arg2 + local127, this.aClass63_8.anInt2200 + local11 - local161 - -local137, 0, 0);
									arg2 += arg5[local148].method5850();
									local22 = -1;
								} catch (@Pc(191) Exception local191) {
								}
							} else {
								this.method4834(local65);
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local13 == -1) {
					if (local22 != -1) {
						arg2 += this.aClass63_8.method1841(local40, local22);
					}
					@Pc(233) int local233;
					if (arg3 == null) {
						local233 = 0;
					} else {
						local233 = arg3[local24];
					}
					if (arg4 == null) {
						local127 = 0;
					} else {
						local127 = arg4[local24];
					}
					if (local40 != ' ') {
						if ((Static140.anInt3466 & 0xFF000000) != 0) {
							this.method4847(local40, local233 + arg2 + 1, local127 + (local11 - -1), Static140.anInt3466, true);
						}
						this.method4847(local40, arg2 + local233, local11 + local127, Static100.anInt4629, false);
					} else if (Static120.anInt3021 > 0) {
						Static181.anInt4287 += Static120.anInt3021;
						arg2 += Static181.anInt4287 >> 8;
						Static181.anInt4287 &= 0xFF;
					}
					local24++;
					local137 = this.aClass63_8.method1838(local40);
					if (Static49.anInt1556 != -1) {
						this.aClass40_7.method2769(arg2, Static49.anInt1556, local137, (int) ((double) this.aClass63_8.anInt2200 * 0.7D) + local11);
					}
					if (Static75.anInt2074 != -1) {
						this.aClass40_7.method2769(arg2, Static75.anInt2074, local137, this.aClass63_8.anInt2200 + local11);
					}
					arg2 += local137;
					local22 = local40;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZIIILjava/lang/String;II)V")
	public final void method4830(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method4840(-16777216, arg2);
		@Pc(25) double local25 = 7.0D - (double) arg1 / 8.0D;
		if (local25 < 0.0D) {
			local25 = 0.0D;
		}
		@Pc(34) int local34 = arg3.length();
		@Pc(37) int[] local37 = new int[local34];
		for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
			local37[local39] = (int) (Math.sin((double) local39 / 1.5D + (double) arg5) * local25);
		}
		this.method4829(arg4, arg3, arg0 - this.aClass63_8.method1849(arg3) / 2, null, local37, null, null);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BILjava/lang/String;III)V")
	public final void method4831(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method4840(arg0, arg2);
			this.method4846(arg4, 0, null, null, arg3 - this.aClass63_8.method1849(arg1) / 2, 0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public final void method4832(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method4840(arg4, arg1);
			this.method4846(arg2, 0, null, null, arg3, 0, arg0, null);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIILjava/lang/String;ILjava/util/Random;[IIIIII[I[Lclient!qa;)I")
	public final int method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Random arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) Class29[] arg13) {
		if (arg4 == null) {
			return 0;
		}
		arg6.setSeed((long) arg10);
		@Pc(20) int local20 = (arg6.nextInt() & 0x1F) + 192;
		this.method4840(local20 << 24 | arg9 & 0xFFFFFF, arg11 & 0xFFFFFF | local20 << 24);
		@Pc(42) int local42 = arg4.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < local42; local49++) {
			local45[local49] = local47;
			if ((arg6.nextInt() & 0x3) == 0) {
				local47++;
			}
		}
		@Pc(67) int local67 = arg2;
		@Pc(74) int local74 = arg5 + this.aClass63_8.anInt2197;
		@Pc(76) int local76 = -1;
		if (arg1 == 1) {
			local74 += (arg0 - this.aClass63_8.anInt2192 - this.aClass63_8.anInt2197) / 2;
		} else if (arg1 == 2) {
			local74 = arg0 + arg5 - this.aClass63_8.anInt2192;
		}
		if (arg8 == 1) {
			local76 = local47 + this.aClass63_8.method1849(arg4);
			local67 = arg2 + (arg3 - local76) / 2;
		} else if (arg8 == 2) {
			local76 = local47 + this.aClass63_8.method1849(arg4);
			local67 = arg2 + arg3 - local76;
		}
		this.method4829(local74, arg4, local67, local45, null, arg13, arg12);
		if (arg7 != null) {
			if (local76 == -1) {
				local76 = this.aClass63_8.method1849(arg4) + local47;
			}
			arg7[3] = this.aClass63_8.anInt2197 + this.aClass63_8.anInt2192;
			arg7[0] = local67;
			arg7[2] = local76;
			arg7[1] = local74 - this.aClass63_8.anInt2197;
		}
		return local47;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4834(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static100.anInt4629 = Static100.anInt4629 & 0xFF000000 | Static307.method5406(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static100.anInt4629 = Static100.anInt4629 & 0xFF000000 | Static289.anInt5210 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static100.anInt4629 = Static307.method5406(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static100.anInt4629 = Static289.anInt5210;
			} else if (arg0.startsWith("str=")) {
				Static49.anInt1556 = Static307.method5406(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static49.anInt1556 = -8388608;
			} else if (arg0.equals("/str")) {
				Static49.anInt1556 = -1;
			} else if (arg0.startsWith("u=")) {
				Static75.anInt2074 = Static307.method5406(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static75.anInt2074 = -16777216;
			} else if (arg0.equals("/u")) {
				Static75.anInt2074 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static140.anInt3466 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static140.anInt3466 = Static307.method5406(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static140.anInt3466 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static140.anInt3466 = Static304.anInt6378;
			} else if (arg0.equals("br")) {
				this.method4840(Static304.anInt6378, Static289.anInt5210);
			}
		} catch (@Pc(175) Exception local175) {
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([ILclient!sn;IIIIIIIIILjava/lang/String;[Lclient!qa;III)I")
	public final int method4836(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) String arg10, @OriginalArg(12) Class29[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg10 == null) {
			return 0;
		}
		this.method4840(arg5, arg7);
		if (arg9 == 0) {
			arg9 = this.aClass63_8.anInt2200;
		}
		@Pc(47) int[] local47;
		if (arg8 < arg9 + this.aClass63_8.anInt2197 + this.aClass63_8.anInt2192 && arg8 < arg9 + arg9) {
			local47 = null;
		} else {
			local47 = new int[] { arg13 };
		}
		@Pc(65) int local65 = this.aClass63_8.method1848(local47, arg10, Static43.aStringArray11, arg11);
		if (arg3 == 3 && local65 == 1) {
			arg3 = 1;
		}
		@Pc(108) int local108;
		@Pc(137) int local137;
		if (arg3 == 0) {
			local108 = this.aClass63_8.anInt2197 + arg4;
		} else if (arg3 == 1) {
			local108 = (arg8 - this.aClass63_8.anInt2197 - this.aClass63_8.anInt2192 - arg9 * (local65 - 1)) / 2 + this.aClass63_8.anInt2197 + arg4;
		} else if (arg3 == 2) {
			local108 = arg4 + arg8 - (local65 - 1) * arg9 - this.aClass63_8.anInt2192;
		} else {
			local137 = (arg8 - (local65 - 1) * arg9 - this.aClass63_8.anInt2192 - this.aClass63_8.anInt2197) / (local65 + 1);
			if (local137 < 0) {
				local137 = 0;
			}
			arg9 += local137;
			local108 = this.aClass63_8.anInt2197 + arg4 + local137;
		}
		for (local137 = 0; local137 < local65; local137++) {
			if (arg14 == 0) {
				this.method4846(local108, arg6, arg11, arg1, arg12, arg2, Static43.aStringArray11[local137], arg0);
			} else if (arg14 == 1) {
				this.method4846(local108, arg6, arg11, arg1, arg12 + (arg13 - this.aClass63_8.method1849(Static43.aStringArray11[local137])) / 2, arg2, Static43.aStringArray11[local137], arg0);
			} else if (arg14 == 2) {
				this.method4846(local108, arg6, arg11, arg1, arg12 + arg13 - this.aClass63_8.method1849(Static43.aStringArray11[local137]), arg2, Static43.aStringArray11[local137], arg0);
			} else if (local137 == local65 - 1) {
				this.method4846(local108, arg6, arg11, arg1, arg12, arg2, Static43.aStringArray11[local137], arg0);
			} else {
				this.method4838(arg13, Static43.aStringArray11[local137]);
				this.method4846(local108, arg6, arg11, arg1, arg12, arg2, Static43.aStringArray11[local137], arg0);
				Static120.anInt3021 = 0;
			}
			local108 += arg9;
		}
		return local65;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(CIIIZLclient!sn;II)V")
	protected abstract void method4837(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class142 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZLjava/lang/String;)V")
	private void method4838(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(20) boolean local20 = false;
		for (@Pc(22) int local22 = 0; arg1.length() > local22; local22++) {
			@Pc(28) char local28 = arg1.charAt(local22);
			if (local28 == '<') {
				local20 = true;
			} else if (local28 == '>') {
				local20 = false;
			} else if (!local20 && local28 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static120.anInt3021 = (arg0 - this.aClass63_8.method1849(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
	private void method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static75.anInt2074 = -1;
		Static120.anInt3021 = 0;
		Static49.anInt1556 = -1;
		Static181.anInt4287 = 0;
		Static289.anInt5210 = arg1;
		Static100.anInt4629 = arg1;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static304.anInt6378 = arg0;
		Static140.anInt3466 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBILjava/lang/String;II)V")
	public final void method4842(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 != null) {
			this.method4840(-1, arg2);
			this.method4846(arg3, 0, null, null, arg0 - this.aClass63_8.method1849(arg1), 0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/util/Random;IZII[Lclient!qa;IILjava/lang/String;[I)I")
	public final int method4843(@OriginalArg(0) Random arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class29[] arg3, @OriginalArg(7) int arg4, @OriginalArg(8) String arg5, @OriginalArg(9) int[] arg6) {
		if (arg5 == null) {
			return 0;
		}
		arg0.setSeed((long) arg1);
		@Pc(20) int local20 = (arg0.nextInt() & 0x1F) + 192;
		this.method4840((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg5.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg0.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method4829(arg4, arg5, arg2, local43, null, arg3, arg6);
		return local45;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public final void method4844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) String arg4) {
		if (arg4 == null) {
			return;
		}
		this.method4840(-16777216, arg1);
		@Pc(18) int local18 = arg4.length();
		@Pc(21) int[] local21 = new int[local18];
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			local21[local28] = (int) (Math.sin((double) arg2 / 5.0D + (double) local28 / 2.0D) * 5.0D);
		}
		this.method4829(arg0, arg4, arg3 - this.aClass63_8.method1849(arg4) / 2, null, local21, null, null);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[Lclient!qa;Lclient!sn;IIILjava/lang/String;[I)V")
	private void method4846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class29[] arg2, @OriginalArg(3) Class142 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int[] arg7) {
		@Pc(7) int local7 = arg0 - this.aClass63_8.anInt2200;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = arg6.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) char local31 = (char) (Static57.method4845(arg6.charAt(local20)) & 0xFF);
			if (local31 == '<') {
				local13 = local20;
			} else {
				if (local31 == '>' && local13 != -1) {
					@Pc(53) String local53 = arg6.substring(local13 + 1, local20);
					local13 = -1;
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
							if (local53.startsWith("img=")) {
								try {
									@Pc(115) int local115 = Static260.method4756(local53.substring(4));
									@Pc(119) Class29 local119 = arg2[local115];
									@Pc(128) int local128 = arg7 == null ? local119.method5832() : arg7[local115];
									if ((Static100.anInt4629 & 0xFF000000) == -16777216) {
										local119.method5836(arg4, this.aClass63_8.anInt2200 + local7 - local128, 0, 0);
									} else {
										local119.method5836(arg4, this.aClass63_8.anInt2200 + local7 - local128, 1, Static100.anInt4629 & 0xFF000000 | 0xFFFFFF);
									}
									arg4 += arg2[local115].method5850();
									local15 = -1;
								} catch (@Pc(180) Exception local180) {
								}
							} else {
								this.method4834(local53);
							}
							continue;
						}
						local31 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass63_8.method1841(local31, local15);
					}
					if (local31 == ' ') {
						if (Static120.anInt3021 > 0) {
							Static181.anInt4287 += Static120.anInt3021;
							arg4 += Static181.anInt4287 >> 8;
							Static181.anInt4287 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static140.anInt3466 & 0xFF000000) != 0) {
							this.method4847(local31, arg4 + 1, local7 + 1, Static140.anInt3466, true);
						}
						this.method4847(local31, arg4, local7, Static100.anInt4629, false);
					} else {
						if ((Static140.anInt3466 & 0xFF000000) != 0) {
							this.method4837(local31, arg4 + 1, local7 + 1, Static140.anInt3466, true, arg3, arg1, arg5);
						}
						this.method4837(local31, arg4, local7, Static100.anInt4629, false, arg3, arg1, arg5);
					}
					@Pc(309) int local309 = this.aClass63_8.method1838(local31);
					if (Static49.anInt1556 != -1) {
						this.aClass40_7.method2769(arg4, Static49.anInt1556, local309, (int) ((double) this.aClass63_8.anInt2200 * 0.7D) + local7);
					}
					if (Static75.anInt2074 != -1) {
						this.aClass40_7.method2769(arg4, Static75.anInt2074, local309, this.aClass63_8.anInt2200 + local7 + 1);
					}
					arg4 += local309;
					local15 = local31;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method4847(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B[Lclient!qa;II[IILjava/lang/String;I)V")
	public final void method4848(@OriginalArg(1) Class29[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		if (arg5 != null) {
			this.method4840(arg4, arg1);
			this.method4846(arg6, 0, arg0, null, arg2 - this.aClass63_8.method1849(arg5) / 2, 0, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;[IIBIII[Lclient!qa;)V")
	public final void method4849(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class29[] arg6) {
		if (arg0 != null) {
			this.method4840(arg4, arg5);
			this.method4846(arg2, 0, arg6, null, arg3 - this.aClass63_8.method1849(arg0), 0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILjava/lang/String;[Lclient!qa;[IIII)V")
	public final void method4850(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class29[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 != null) {
			this.method4840(arg5, arg0);
			this.method4846(arg6, 0, arg2, null, arg4, 0, arg1, arg3);
		}
	}
}
