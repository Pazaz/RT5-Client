import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public abstract class Class130 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!wm;")
	private final Class19 aClass19_12;

	@OriginalMember(owner = "client!ur", name = "q", descriptor = "Lclient!vi;")
	private final Class239 aClass239_8;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!wm;Lclient!vi;)V")
	protected Class130(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class239 arg1) {
		this.aClass19_12 = arg0;
		this.aClass239_8 = arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
	private void method5887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static25.anInt643 = -1;
		Static373.anInt7029 = -1;
		Static342.anInt5655 = arg1;
		Static280.anInt5197 = arg1;
		Static126.anInt6311 = 0;
		Static120.anInt2387 = 0;
		if (arg0 == -1) {
			arg0 = 0;
		}
		Static248.anInt4661 = arg0;
		Static94.anInt1979 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method5889(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method5887(-16777216, arg0);
		@Pc(18) int local18 = arg1.length();
		@Pc(21) int[] local21 = new int[local18];
		@Pc(24) int[] local24 = new int[local18];
		for (@Pc(26) int local26 = 0; local26 < local18; local26++) {
			local21[local26] = (int) (Math.sin((double) local26 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local24[local26] = (int) (Math.sin((double) arg4 / 5.0D + (double) local26 / 3.0D) * 5.0D);
		}
		this.method5890(arg3 - this.aClass239_8.method6126(arg1) / 2, null, local24, arg2, null, arg1, local21);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI[I[II[Lclient!jd;Ljava/lang/String;[I)V")
	private void method5890(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Sprite[] arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int[] arg6) {
		@Pc(19) int local19 = arg3 - this.aClass239_8.anInt6841;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg5.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) char local41 = (char) (Static234.method4099(arg5.charAt(local30)) & 0xFF);
			if (local41 == '<') {
				local21 = local30;
			} else {
				@Pc(121) int local121;
				@Pc(131) int local131;
				if (local41 == '>' && local21 != -1) {
					@Pc(63) String local63 = arg5.substring(local21 + 1, local30);
					local21 = -1;
					if (local63.equals("lt")) {
						local41 = '<';
					} else if (local63.equals("gt")) {
						local41 = '>';
					} else if (local63.equals("nbsp")) {
						local41 = ' ';
					} else if (local63.equals("shy")) {
						local41 = '\u00ad';
					} else if (local63.equals("times")) {
						local41 = '×';
					} else if (local63.equals("euro")) {
						local41 = '€';
					} else if (local63.equals("copy")) {
						local41 = '©';
					} else {
						if (!local63.equals("reg")) {
							if (local63.startsWith("img=")) {
								try {
									if (arg6 == null) {
										local121 = 0;
									} else {
										local121 = arg6[local25];
									}
									if (arg2 == null) {
										local131 = 0;
									} else {
										local131 = arg2[local25];
									}
									local25++;
									@Pc(144) int local144 = Static146.method2698(local63.substring(4));
									@Pc(148) Sprite local148 = arg4[local144];
									@Pc(157) int local157 = arg1 == null ? local148.method6384() : arg1[local144];
									local148.method6401(local121 + arg0, local131 + -local157 + local19 + this.aClass239_8.anInt6841, 0, 0);
									local23 = -1;
									arg0 += arg4[local144].method6399();
								} catch (@Pc(186) Exception local186) {
								}
							} else {
								this.method5894(local63);
							}
							continue;
						}
						local41 = '®';
					}
				}
				if (local21 == -1) {
					if (local23 != -1) {
						arg0 += this.aClass239_8.method6125(local23, local41);
					}
					@Pc(229) int local229;
					if (arg6 == null) {
						local229 = 0;
					} else {
						local229 = arg6[local25];
					}
					if (arg2 == null) {
						local121 = 0;
					} else {
						local121 = arg2[local25];
					}
					if (local41 != ' ') {
						if ((Static94.anInt1979 & 0xFF000000) != 0) {
							this.method5892(local41, local229 + arg0 + 1, local121 + 1 + local19, Static94.anInt1979, true);
						}
						this.method5892(local41, local229 + arg0, local19 - -local121, Static280.anInt5197, false);
					} else if (Static120.anInt2387 > 0) {
						Static126.anInt6311 += Static120.anInt2387;
						arg0 += Static126.anInt6311 >> 8;
						Static126.anInt6311 &= 0xFF;
					}
					local25++;
					local131 = this.aClass239_8.method6122(local41);
					if (Static373.anInt7029 != -1) {
						this.aClass19_12.method2890(arg0, local131, (int) ((double) this.aClass239_8.anInt6841 * 0.7D) + local19, Static373.anInt7029);
					}
					if (Static25.anInt643 != -1) {
						this.aClass19_12.method2890(arg0, local131, this.aClass239_8.anInt6841 + local19, Static25.anInt643);
					}
					local23 = local41;
					arg0 += local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILjava/lang/String;)V")
	private void method5891(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
			@Pc(25) char local25 = arg1.charAt(local19);
			if (local25 == '<') {
				local9 = true;
			} else if (local25 == '>') {
				local9 = false;
			} else if (!local9 && local25 == ' ') {
				local7++;
			}
		}
		if (local7 > 0) {
			Static120.anInt2387 = (arg0 - this.aClass239_8.method6126(arg1) << 8) / local7;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZ)V")
	protected abstract void method5892(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIII[IILclient!kf;ILjava/lang/String;III[Lclient!jd;II)I")
	public final int method5893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class78 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) String arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Sprite[] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		if (arg9 == null) {
			return 0;
		}
		this.method5887(arg4, arg13);
		if (arg1 == 0) {
			arg1 = this.aClass239_8.anInt6841;
		}
		@Pc(54) int[] local54;
		if (arg8 < arg1 + this.aClass239_8.anInt6846 + this.aClass239_8.anInt6836 && arg1 + arg1 > arg8) {
			local54 = null;
		} else {
			local54 = new int[] { arg14 };
		}
		@Pc(67) int local67 = this.aClass239_8.method6119(Static257.aStringArray34, arg9, local54, arg12);
		if (arg10 == 3 && local67 == 1) {
			arg10 = 1;
		}
		@Pc(88) int local88;
		@Pc(164) int local164;
		if (arg10 == 0) {
			local88 = this.aClass239_8.anInt6836 + arg11;
		} else if (arg10 == 1) {
			local88 = (arg8 - this.aClass239_8.anInt6836 - this.aClass239_8.anInt6846 - arg1 * (local67 + -1)) / 2 + this.aClass239_8.anInt6836 + arg11;
		} else if (arg10 == 2) {
			local88 = arg11 + arg8 - this.aClass239_8.anInt6846 - arg1 * (local67 + -1);
		} else {
			local164 = (arg8 - this.aClass239_8.anInt6836 - this.aClass239_8.anInt6846 - arg1 * (local67 - 1)) / (local67 - -1);
			if (local164 < 0) {
				local164 = 0;
			}
			arg1 += local164;
			local88 = this.aClass239_8.anInt6836 + arg11 + local164;
		}
		for (local164 = 0; local164 < local67; local164++) {
			if (arg3 == 0) {
				this.method5904(local88, arg6, Static257.aStringArray34[local164], arg7, arg2, arg12, arg5, arg0);
			} else if (arg3 == 1) {
				this.method5904(local88, arg6, Static257.aStringArray34[local164], arg7, (arg14 - this.aClass239_8.method6126(Static257.aStringArray34[local164])) / 2 + arg2, arg12, arg5, arg0);
			} else if (arg3 == 2) {
				this.method5904(local88, arg6, Static257.aStringArray34[local164], arg7, arg14 + arg2 - this.aClass239_8.method6126(Static257.aStringArray34[local164]), arg12, arg5, arg0);
			} else if (local67 - 1 == local164) {
				this.method5904(local88, arg6, Static257.aStringArray34[local164], arg7, arg2, arg12, arg5, arg0);
			} else {
				this.method5891(arg14, Static257.aStringArray34[local164]);
				this.method5904(local88, arg6, Static257.aStringArray34[local164], arg7, arg2, arg12, arg5, arg0);
				Static120.anInt2387 = 0;
			}
			local88 += arg1;
		}
		return local67;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method5894(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static280.anInt5197 = Static280.anInt5197 & 0xFF000000 | Static247.method4302(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static280.anInt5197 = Static342.anInt5655 & 0xFFFFFF | Static280.anInt5197 & 0xFF000000;
			}
			if (arg0.startsWith("argb=")) {
				Static280.anInt5197 = Static247.method4302(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static280.anInt5197 = Static342.anInt5655;
			} else if (arg0.startsWith("str=")) {
				Static373.anInt7029 = Static247.method4302(arg0.substring(4)) | 0xFF000000;
			} else if (arg0.equals("str")) {
				Static373.anInt7029 = -8388608;
			} else if (arg0.equals("/str")) {
				Static373.anInt7029 = -1;
			} else if (arg0.startsWith("u=")) {
				Static25.anInt643 = Static247.method4302(arg0.substring(2)) | 0xFF000000;
			} else if (arg0.equals("u")) {
				Static25.anInt643 = -16777216;
			} else if (arg0.equals("/u")) {
				Static25.anInt643 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static94.anInt1979 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static94.anInt1979 = Static247.method4302(arg0.substring(5)) | 0xFF000000;
			} else if (arg0.equals("shad")) {
				Static94.anInt1979 = -16777216;
			} else if (arg0.equals("/shad")) {
				Static94.anInt1979 = Static248.anInt4661;
			} else if (arg0.equals("br")) {
				this.method5887(Static248.anInt4661, Static342.anInt5655);
			}
		} catch (@Pc(174) Exception local174) {
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBIIILjava/lang/String;II)V")
	public final void method5895(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == null) {
			return;
		}
		this.method5887(-16777216, arg4);
		@Pc(21) double local21 = 7.0D - (double) arg2 / 8.0D;
		if (local21 < 0.0D) {
			local21 = 0.0D;
		}
		@Pc(30) int local30 = arg3.length();
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(48) int local48 = 0; local48 < local30; local48++) {
			local33[local48] = (int) (Math.sin((double) local48 / 1.5D + (double) arg0) * local21);
		}
		this.method5890(arg1 - this.aClass239_8.method6126(arg3) / 2, null, local33, arg5, null, arg3, null);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIBLjava/lang/String;)V")
	public final void method5897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		if (arg4 != null) {
			this.method5887(arg1, arg3);
			this.method5904(arg2, 0, arg4, null, arg0, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public final void method5898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		if (arg2 != null) {
			this.method5887(-1, arg3);
			this.method5904(arg1, 0, arg2, null, arg0 - this.aClass239_8.method6126(arg2), null, null, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[Lclient!jd;Ljava/util/Random;III[ILjava/lang/String;I)I")
	public final int method5899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Sprite[] arg2, @OriginalArg(3) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) String arg6) {
		if (arg6 == null) {
			return 0;
		}
		arg3.setSeed((long) arg1);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method5887((local20 | 0x0) << 24, local20 << 24 | 0xFFFFFF);
		@Pc(40) int local40 = arg6.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		this.method5890(arg0, arg5, null, arg4, arg2, arg6, local43);
		return local45;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public final void method5900(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			this.method5887(arg1, arg3);
			this.method5904(arg2, 0, arg0, null, arg4 - this.aClass239_8.method6126(arg0) / 2, null, null, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([I[Lclient!jd;ILjava/lang/String;IIII)V")
	public final void method5901(@OriginalArg(0) int[] arg0, @OriginalArg(1) Sprite[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 != null) {
			this.method5887(0, arg5);
			this.method5904(arg4, 0, arg3, null, arg2, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(CIIIZLclient!kf;II)V")
	protected abstract void method5902(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class78 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;ILjava/util/Random;I[IIIII[Lclient!jd;II[IZ)I")
	public final int method5903(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Random arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Sprite[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int[] arg13) {
		if (arg1 == null) {
			return 0;
		}
		arg3.setSeed((long) arg9);
		@Pc(20) int local20 = (arg3.nextInt() & 0x1F) + 192;
		this.method5887(arg6 & 0xFFFFFF | local20 << 24, arg8 & 0xFFFFFF | local20 << 24);
		@Pc(40) int local40 = arg1.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		for (@Pc(53) int local53 = 0; local53 < local40; local53++) {
			local43[local53] = local45;
			if ((arg3.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		@Pc(78) int local78 = arg0;
		@Pc(84) int local84 = arg2 + this.aClass239_8.anInt6836;
		@Pc(86) int local86 = -1;
		if (arg4 == 1) {
			local84 += (arg11 - this.aClass239_8.anInt6836 - this.aClass239_8.anInt6846) / 2;
		} else if (arg4 == 2) {
			local84 = arg2 + arg11 - this.aClass239_8.anInt6846;
		}
		if (arg12 == 1) {
			local86 = this.aClass239_8.method6126(arg1) + local45;
			local78 = arg0 + (arg7 - local86) / 2;
		} else if (arg12 == 2) {
			local86 = this.aClass239_8.method6126(arg1) + local45;
			local78 = arg0 + arg7 - local86;
		}
		this.method5890(local78, arg13, null, local84, arg10, arg1, local43);
		if (arg5 != null) {
			if (local86 == -1) {
				local86 = local45 + this.aClass239_8.method6126(arg1);
			}
			arg5[2] = local86;
			arg5[3] = this.aClass239_8.anInt6846 + this.aClass239_8.anInt6836;
			arg5[1] = local84 - this.aClass239_8.anInt6836;
			arg5[0] = local78;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILjava/lang/String;Lclient!kf;I[Lclient!jd;Z[II)V")
	private void method5904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class78 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Sprite[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg0 - this.aClass239_8.anInt6841;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = -1;
		@Pc(22) int local22 = arg2.length();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) char local35 = (char) (Static234.method4099(arg2.charAt(local24)) & 0xFF);
			if (local35 == '<') {
				local17 = local24;
			} else {
				if (local35 == '>' && local17 != -1) {
					@Pc(56) String local56 = arg2.substring(local17 + 1, local24);
					local17 = -1;
					if (local56.equals("lt")) {
						local35 = '<';
					} else if (local56.equals("gt")) {
						local35 = '>';
					} else if (local56.equals("nbsp")) {
						local35 = ' ';
					} else if (local56.equals("shy")) {
						local35 = '\u00ad';
					} else if (local56.equals("times")) {
						local35 = '×';
					} else if (local56.equals("euro")) {
						local35 = '€';
					} else if (local56.equals("copy")) {
						local35 = '©';
					} else {
						if (!local56.equals("reg")) {
							if (local56.startsWith("img=")) {
								try {
									@Pc(122) int local122 = Static146.method2698(local56.substring(4));
									@Pc(126) Sprite local126 = arg5[local122];
									@Pc(135) int local135 = arg6 == null ? local126.method6384() : arg6[local122];
									if ((-16777216 & Static280.anInt5197) == -16777216) {
										local126.method6401(arg4, this.aClass239_8.anInt6841 + local15 - local135, 0, 0);
									} else {
										local126.method6401(arg4, local15 + this.aClass239_8.anInt6841 - local135, 1, Static280.anInt5197 & 0xFF000000 | 0xFFFFFF);
									}
									arg4 += arg5[local122].method6399();
									local19 = -1;
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method5894(local56);
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local17 == -1) {
					if (local19 != -1) {
						arg4 += this.aClass239_8.method6125(local19, local35);
					}
					if (local35 == ' ') {
						if (Static120.anInt2387 > 0) {
							Static126.anInt6311 += Static120.anInt2387;
							arg4 += Static126.anInt6311 >> 8;
							Static126.anInt6311 &= 0xFF;
						}
					} else if (arg3 == null) {
						if ((Static94.anInt1979 & 0xFF000000) != 0) {
							this.method5892(local35, arg4 + 1, local15 + 1, Static94.anInt1979, true);
						}
						this.method5892(local35, arg4, local15, Static280.anInt5197, false);
					} else {
						if ((Static94.anInt1979 & 0xFF000000) != 0) {
							this.method5902(local35, arg4 + 1, local15 + 1, Static94.anInt1979, true, arg3, arg7, arg1);
						}
						this.method5902(local35, arg4, local15, Static280.anInt5197, false, arg3, arg7, arg1);
					}
					@Pc(310) int local310 = this.aClass239_8.method6122(local35);
					if (Static373.anInt7029 != -1) {
						this.aClass19_12.method2890(arg4, local310, (int) ((double) this.aClass239_8.anInt6841 * 0.7D) + local15, Static373.anInt7029);
					}
					if (Static25.anInt643 != -1) {
						this.aClass19_12.method2890(arg4, local310, this.aClass239_8.anInt6841 + local15 + 1, Static25.anInt643);
					}
					local19 = local35;
					arg4 += local310;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method5905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method5887(-16777216, arg0);
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int[] local19 = new int[local16];
		for (@Pc(26) int local26 = 0; local26 < local16; local26++) {
			local19[local26] = (int) (Math.sin((double) arg1 / 5.0D + (double) local26 / 2.0D) * 5.0D);
		}
		this.method5890(arg4 - this.aClass239_8.method6126(arg2) / 2, null, local19, arg3, null, arg2, null);
	}
}
