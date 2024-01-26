import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class14 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!ha;")
	private final Class19 aClass19_16;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!ve;")
	private final Class381 aClass381_12;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!ha;Lclient!ve;)V")
	protected Class14(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class381 arg1) {
		this.aClass19_16 = arg0;
		this.aClass381_12 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!st;IIIILjava/lang/String;[IILjava/util/Random;I)I")
	public final int method8816(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int[] arg4, @OriginalArg(8) Random arg5, @OriginalArg(9) int arg6) {
		if (arg3 == null) {
			return 0;
		}
		arg5.setSeed((long) arg1);
		@Pc(22) int local22 = (arg5.nextInt() & 0x1F) + 192;
		this.method8825(local22 << 24 | 0xFFFFFF, (local22 | 0x0) << 24);
		@Pc(42) int local42 = arg3.length();
		@Pc(45) int[] local45 = new int[local42];
		@Pc(57) int local57 = 0;
		for (@Pc(59) int local59 = 0; local59 < local42; local59++) {
			local45[local59] = local57;
			if ((arg5.nextInt() & 0x3) == 0) {
				local57++;
			}
		}
		this.method8820(local45, arg3, arg2, arg0, arg6, (int[]) null, arg4);
		return local57;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	protected abstract void method8817(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public final void method8818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		if (arg5 == null) {
			return;
		}
		this.method8825(arg4, -16777216);
		@Pc(32) double local32 = 7.0D - (double) arg0 / 8.0D;
		if (local32 < 0.0D) {
			local32 = 0.0D;
		}
		@Pc(41) int local41 = arg5.length();
		@Pc(44) int[] local44 = new int[local41];
		for (@Pc(46) int local46 = 0; local46 < local41; local46++) {
			local44[local46] = (int) (Math.sin((double) arg2 + (double) local46 / 1.5D) * local32);
		}
		this.method8820((int[]) null, arg5, arg3, (Class23[]) null, arg1 - this.aClass381_12.method8744(arg5) / 2, local44, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/lang/String;I[Lclient!st;I[IZ[I)V")
	private void method8820(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class23[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass381_12.anInt10027;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = arg1.length();
		for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
			@Pc(40) char local40 = (char) (Static41.method1028(arg1.charAt(local29)) & 0xFF);
			if (local40 == '<') {
				local13 = local29;
			} else {
				@Pc(164) int local164;
				@Pc(174) int local174;
				if (local40 == '>' && local13 != -1) {
					@Pc(64) String local64 = arg1.substring(local13 + 1, local29);
					local13 = -1;
					if (local64.equals("lt")) {
						local40 = '<';
					} else if (local64.equals("gt")) {
						local40 = '>';
					} else if (local64.equals("nbsp")) {
						local40 = ' ';
					} else if (local64.equals("shy")) {
						local40 = '\u00ad';
					} else if (local64.equals("times")) {
						local40 = '×';
					} else if (local64.equals("euro")) {
						local40 = '€';
					} else if (local64.equals("copy")) {
						local40 = '©';
					} else {
						if (!local64.equals("reg")) {
							if (local64.startsWith("img=")) {
								try {
									if (arg0 == null) {
										local164 = 0;
									} else {
										local164 = arg0[local17];
									}
									if (arg5 == null) {
										local174 = 0;
									} else {
										local174 = arg5[local17];
									}
									local17++;
									@Pc(187) int local187 = Static647.method8473(local64.substring(4));
									@Pc(191) Class23 local191 = arg3[local187];
									@Pc(201) int local201 = arg6 == null ? local191.method8192() : arg6[local187];
									local191.method8197(local164 + arg4, local174 + -local201 + local7 + this.aClass381_12.anInt10027, 1, 0, 1);
									local15 = -1;
									arg4 += arg3[local187].method8203();
								} catch (@Pc(230) Exception local230) {
								}
							} else {
								this.method8831(local64);
							}
							continue;
						}
						local40 = '®';
					}
				}
				if (local13 == -1) {
					if (local15 != -1) {
						arg4 += this.aClass381_12.method8737(local40, local15);
					}
					@Pc(268) int local268;
					if (arg0 == null) {
						local268 = 0;
					} else {
						local268 = arg0[local17];
					}
					if (arg5 == null) {
						local164 = 0;
					} else {
						local164 = arg5[local17];
					}
					if (local40 != ' ') {
						if ((Static65.anInt1536 & 0xFF000000) != 0) {
							this.fa(local40, arg4 + local268 + 1, local164 + (local7 - -1), Static65.anInt1536, true);
						}
						this.fa(local40, arg4 + local268, local164 + local7, Static658.anInt9801, false);
					} else if (Static38.anInt922 > 0) {
						Static558.anInt3187 += Static38.anInt922;
						arg4 += Static558.anInt3187 >> 8;
						Static558.anInt3187 &= 0xFF;
					}
					local17++;
					local174 = this.aClass381_12.method8738(local40);
					if (Static633.anInt10897 != -1) {
						this.aClass19_16.method7991((int) ((double) this.aClass381_12.anInt10027 * 0.7D) + local7, Static633.anInt10897, arg4, local174);
					}
					if (Static698.anInt10510 != -1) {
						this.aClass19_16.method7991(this.aClass381_12.anInt10027 + local7, Static698.anInt10510, arg4, local174);
					}
					arg4 += local174;
					local15 = local40;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method8822(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(17) int local17 = 0; arg1.length() > local17; local17++) {
			@Pc(22) char local22 = arg1.charAt(local17);
			if (local22 == '<') {
				local7 = true;
			} else if (local22 == '>') {
				local7 = false;
			} else if (!local7 && local22 == ' ') {
				local5++;
			}
		}
		if (local5 > 0) {
			Static38.anInt922 = (arg0 - this.aClass381_12.method8744(arg1) << 8) / local5;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!st;IILjava/lang/String;IZLclient!aa;I[I)V")
	private void method8824(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		@Pc(5) int local5 = arg6 - this.aClass381_12.anInt10027;
		@Pc(11) int local11 = -1;
		@Pc(18) int local18 = -1;
		@Pc(21) int local21 = arg3.length();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(33) char local33 = (char) (Static41.method1028(arg3.charAt(local23)) & 0xFF);
			if (local33 == '<') {
				local11 = local23;
			} else {
				if (local33 == '>' && local11 != -1) {
					@Pc(54) String local54 = arg3.substring(local11 + 1, local23);
					local11 = -1;
					if (local54.equals("lt")) {
						local33 = '<';
					} else if (local54.equals("gt")) {
						local33 = '>';
					} else if (local54.equals("nbsp")) {
						local33 = ' ';
					} else if (local54.equals("shy")) {
						local33 = '\u00ad';
					} else if (local54.equals("times")) {
						local33 = '×';
					} else if (local54.equals("euro")) {
						local33 = '€';
					} else if (local54.equals("copy")) {
						local33 = '©';
					} else {
						if (!local54.equals("reg")) {
							if (local54.startsWith("img=")) {
								try {
									@Pc(136) int local136 = Static647.method8473(local54.substring(4));
									@Pc(140) Class23 local140 = arg0[local136];
									@Pc(150) int local150 = arg7 == null ? local140.method8192() : arg7[local136];
									if ((Static658.anInt9801 & 0xFF000000) == -16777216) {
										local140.method8197(arg4, this.aClass381_12.anInt10027 + local5 - local150, 1, 0, 1);
									} else {
										local140.method8197(arg4, local5 + this.aClass381_12.anInt10027 - local150, 0, Static658.anInt9801 & 0xFF000000 | 0xFFFFFF, 1);
									}
									local18 = -1;
									arg4 += arg0[local136].method8203();
								} catch (@Pc(202) Exception local202) {
								}
							} else {
								this.method8831(local54);
							}
							continue;
						}
						local33 = '®';
					}
				}
				if (local11 == -1) {
					if (local18 != -1) {
						arg4 += this.aClass381_12.method8737(local33, local18);
					}
					if (local33 == ' ') {
						if (Static38.anInt922 > 0) {
							Static558.anInt3187 += Static38.anInt922;
							arg4 += Static558.anInt3187 >> 8;
							Static558.anInt3187 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((Static65.anInt1536 & 0xFF000000) != 0) {
							this.fa(local33, arg4 + 1, local5 - -1, Static65.anInt1536, true);
						}
						this.fa(local33, arg4, local5, Static658.anInt9801, false);
					} else {
						if ((Static65.anInt1536 & 0xFF000000) != 0) {
							this.method8817(local33, arg4 + 1, local5 - -1, Static65.anInt1536, true, arg5, arg2, arg1);
						}
						this.method8817(local33, arg4, local5, Static658.anInt9801, false, arg5, arg2, arg1);
					}
					@Pc(328) int local328 = this.aClass381_12.method8738(local33);
					if (Static633.anInt10897 != -1) {
						this.aClass19_16.method7991(local5 + (int) ((double) this.aClass381_12.anInt10027 * 0.7D), Static633.anInt10897, arg4, local328);
					}
					if (Static698.anInt10510 != -1) {
						this.aClass19_16.method7991(this.aClass381_12.anInt10027 + local5 + 1, Static698.anInt10510, arg4, local328);
					}
					local18 = local33;
					arg4 += local328;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	private void method8825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static38.anInt922 = 0;
		Static655.anInt9767 = arg0;
		Static658.anInt9801 = arg0;
		Static558.anInt3187 = 0;
		Static698.anInt10510 = -1;
		Static633.anInt10897 = -1;
		if (arg1 == -1) {
			arg1 = 0;
		}
		Static655.anInt9766 = arg1;
		Static65.anInt1536 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;Lclient!aa;[Lclient!st;IIIIIIIIII)I")
	public final int method8826(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) Class23[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		return this.method8830(arg11, arg2, arg7, arg5, 0, arg0, arg6, arg14, arg8, arg4, arg12, arg13, arg10, arg9, arg1, arg3);
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
	protected abstract void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;II[Lclient!st;[I)V")
	public final void method8827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class23[] arg4, @OriginalArg(7) int[] arg5) {
		if (arg2 != null) {
			this.method8825(arg0, 0);
			this.method8824(arg4, 0, 0, arg2, arg3, (Class1) null, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBILjava/lang/String;II)V")
	public final void method8828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method8825(arg4, arg0);
			this.method8824((Class23[]) null, 0, 0, arg2, arg1 - this.aClass381_12.method8744(arg2) / 2, (Class1) null, arg3, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public final void method8829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			this.method8825(arg4, arg3);
			this.method8824((Class23[]) null, 0, 0, arg2, arg0, (Class1) null, arg1, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII[Lclient!st;IIIIILclient!aa;IIII[ILjava/lang/String;)I")
	public final int method8830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class23[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class1 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) String arg15) {
		if (arg15 == null) {
			return 0;
		}
		this.method8825(arg1, arg2);
		if (arg10 == 0) {
			arg10 = this.aClass381_12.anInt10027;
		}
		@Pc(81) int[] local81;
		if (arg10 + this.aClass381_12.anInt10036 + this.aClass381_12.anInt10030 > arg7 && arg7 < arg10 + arg10) {
			local81 = null;
		} else {
			local81 = new int[] { arg11 };
		}
		@Pc(93) int local93 = this.aClass381_12.method8740(Static11.aStringArray2, local81, arg3, arg15);
		if (arg4 == -1) {
			arg4 = arg7 / arg10;
			if (arg4 <= 0) {
				arg4 = 1;
			}
		}
		if (arg4 > 0 && arg4 <= local93) {
			local93 = arg4;
			Static11.aStringArray2[arg4 - 1] = this.aClass381_12.method8743(Static11.aStringArray2[arg4 - 1], arg3, arg11);
		}
		if (arg0 == 3 && local93 == 1) {
			arg0 = 1;
		}
		@Pc(190) int local190;
		@Pc(233) int local233;
		if (arg0 == 0) {
			local190 = this.aClass381_12.anInt10030 + arg6;
		} else if (arg0 == 1) {
			local190 = (arg7 - this.aClass381_12.anInt10036 - this.aClass381_12.anInt10030 - arg10 * (local93 + -1)) / 2 + this.aClass381_12.anInt10030 + arg6;
		} else if (arg0 == 2) {
			local190 = arg7 + arg6 - arg10 * (local93 - 1) - this.aClass381_12.anInt10036;
		} else {
			local233 = (arg7 - this.aClass381_12.anInt10030 - this.aClass381_12.anInt10036 - arg10 * (local93 - 1)) / (local93 + 1);
			if (local233 < 0) {
				local233 = 0;
			}
			arg10 += local233;
			local190 = arg6 + this.aClass381_12.anInt10030 + local233;
		}
		for (local233 = 0; local233 < local93; local233++) {
			if (arg13 == 0) {
				this.method8824(arg3, arg5, arg8, Static11.aStringArray2[local233], arg12, arg9, local190, arg14);
			} else if (arg13 == 1) {
				this.method8824(arg3, arg5, arg8, Static11.aStringArray2[local233], arg12 + (arg11 - this.aClass381_12.method8744(Static11.aStringArray2[local233])) / 2, arg9, local190, arg14);
			} else if (arg13 == 2) {
				this.method8824(arg3, arg5, arg8, Static11.aStringArray2[local233], arg12 + arg11 - this.aClass381_12.method8744(Static11.aStringArray2[local233]), arg9, local190, arg14);
			} else if (local93 - 1 == local233) {
				this.method8824(arg3, arg5, arg8, Static11.aStringArray2[local233], arg12, arg9, local190, arg14);
			} else {
				this.method8822(arg11, Static11.aStringArray2[local233]);
				this.method8824(arg3, arg5, arg8, Static11.aStringArray2[local233], arg12, arg9, local190, arg14);
				Static38.anInt922 = 0;
			}
			local190 += arg10;
		}
		return local93;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method8831(@OriginalArg(1) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static658.anInt9801 = Static658.anInt9801 & 0xFF000000 | Static12.method5162(arg0.substring(4)) & 0xFFFFFF;
			} else if (arg0.equals("/col")) {
				Static658.anInt9801 = Static658.anInt9801 & 0xFF000000 | Static655.anInt9767 & 0xFFFFFF;
			}
			if (arg0.startsWith("argb=")) {
				Static658.anInt9801 = Static12.method5162(arg0.substring(5));
			} else if (arg0.equals("/argb")) {
				Static658.anInt9801 = Static655.anInt9767;
			} else if (arg0.startsWith("str=")) {
				Static633.anInt10897 = Static658.anInt9801 & 0xFF000000 | Static12.method5162(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static633.anInt10897 = Static658.anInt9801 & 0xFF000000 | 0x800000;
			} else if (arg0.equals("/str")) {
				Static633.anInt10897 = -1;
			} else if (arg0.startsWith("u=")) {
				Static698.anInt10510 = Static658.anInt9801 & 0xFF000000 | Static12.method5162(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static698.anInt10510 = Static658.anInt9801 & 0xFF000000;
			} else if (arg0.equals("/u")) {
				Static698.anInt10510 = -1;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				Static65.anInt1536 = 0;
			} else if (arg0.startsWith("shad=")) {
				Static65.anInt1536 = Static658.anInt9801 & 0xFF000000 | Static12.method5162(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static65.anInt1536 = Static658.anInt9801 & 0xFF000000;
			} else if (arg0.equals("/shad")) {
				Static65.anInt1536 = Static655.anInt9766;
			} else if (arg0.equals("br")) {
				this.method8825(Static655.anInt9767, Static655.anInt9766);
			}
		} catch (@Pc(214) Exception local214) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public final void method8832(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		this.method8825(arg3, -16777216);
		@Pc(17) int local17 = arg1.length();
		@Pc(20) int[] local20 = new int[local17];
		@Pc(23) int[] local23 = new int[local17];
		for (@Pc(30) int local30 = 0; local30 < local17; local30++) {
			local20[local30] = (int) (Math.sin((double) local30 / 5.0D + (double) arg0 / 5.0D) * 5.0D);
			local23[local30] = (int) (Math.sin((double) local30 / 3.0D + (double) arg0 / 5.0D) * 5.0D);
		}
		this.method8820(local20, arg1, arg4, (Class23[]) null, arg2 - this.aClass381_12.method8744(arg1) / 2, local23, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public final void method8833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		this.method8825(arg0, -16777216);
		@Pc(17) int local17 = arg2.length();
		@Pc(25) int[] local25 = new int[local17];
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 2.0D + (double) arg1 / 5.0D) * 5.0D);
		}
		this.method8820((int[]) null, arg2, arg4, (Class23[]) null, arg3 - this.aClass381_12.method8744(arg2) / 2, local25, (int[]) null);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILjava/lang/String;III)V")
	public final void method8834(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			this.method8825(arg2, arg3);
			this.method8824((Class23[]) null, 0, 0, arg1, arg0 - this.aClass381_12.method8744(arg1), (Class1) null, arg4, (int[]) null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIII[IIILjava/util/Random;Ljava/lang/String;II[Lclient!st;III)I")
	public final int method8836(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Random arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class23[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return 0;
		}
		arg6.setSeed((long) arg11);
		@Pc(21) int local21 = (arg6.nextInt() & 0x1F) + 192;
		this.method8825(local21 << 24 | arg4 & 0xFFFFFF, local21 << 24 | arg9 & 0xFFFFFF);
		@Pc(41) int local41 = arg7.length();
		@Pc(44) int[] local44 = new int[local41];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local41; local48++) {
			local44[local48] = local46;
			if ((arg6.nextInt() & 0x3) == 0) {
				local46++;
			}
		}
		@Pc(74) int local74 = arg8;
		@Pc(80) int local80 = this.aClass381_12.anInt10030 + arg12;
		if (arg13 == 1) {
			local80 += (arg5 - this.aClass381_12.anInt10030 - this.aClass381_12.anInt10036) / 2;
		} else if (arg13 == 2) {
			local80 = arg12 + arg5 - this.aClass381_12.anInt10036;
		}
		@Pc(119) int local119 = -1;
		if (arg1 == 1) {
			local119 = local46 + this.aClass381_12.method8744(arg7);
			local74 = arg8 + (arg2 - local119) / 2;
		} else if (arg1 == 2) {
			local119 = local46 + this.aClass381_12.method8744(arg7);
			local74 = arg8 + arg2 - local119;
		}
		this.method8820(local44, arg7, local80, arg10, local74, (int[]) null, arg3);
		if (arg0 != null) {
			if (local119 == -1) {
				local119 = local46 + this.aClass381_12.method8744(arg7);
			}
			arg0[3] = this.aClass381_12.anInt10036 + this.aClass381_12.anInt10030;
			arg0[0] = local74;
			arg0[2] = local119;
			arg0[1] = local80 - this.aClass381_12.anInt10030;
		}
		return local46;
	}
}
