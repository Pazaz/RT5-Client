import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class13_Sub1_Sub1 extends SoftwareSprite {

	@OriginalMember(owner = "client!b", name = "H", descriptor = "[I")
	private final int[] anIntArray22;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!j;[IIIII)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg4, arg5);
		this.anIntArray22 = new int[arg4 * arg5];
		@Pc(15) int local15 = arg3 - super.anInt1936;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg5; local19++) {
			for (@Pc(22) int local22 = 0; local22 < arg4; local22++) {
				this.anIntArray22[local17++] = arg1[arg2++];
			}
			arg2 += local15;
		}
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!j;[III)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anIntArray22 = arg1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	@Override
	public void method6392(@OriginalArg(2) int arg0) {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(25) int local25;
		if (arg0 == 0) {
			local5 = super.aClass19_Sub2_5.anIntArray179;
			for (local7 = 0; local7 < super.anInt1944; local7++) {
				local13 = local7 * super.anInt1936;
				local23 = local7 * super.aClass19_Sub2_5.anInt2863;
				for (local25 = 0; local25 < super.anInt1936; local25++) {
					this.anIntArray22[local13 + local25] = this.anIntArray22[local13 + local25] & 0xFFFFFF | (local5[local23 + local25] & 0xFF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			local5 = super.aClass19_Sub2_5.anIntArray179;
			for (local7 = 0; local7 < super.anInt1944; local7++) {
				local13 = local7 * super.anInt1936;
				local23 = local7 * super.aClass19_Sub2_5.anInt2863;
				for (local25 = 0; local25 < super.anInt1936; local25++) {
					this.anIntArray22[local13 + local25] = this.anIntArray22[local13 + local25] & 0xFFFFFF | (local5[local23 + local25] == 0 ? 0 : -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
	@Override
	protected void method1991(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_5.anIntArray179;
		@Pc(710) int local710;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(162) int local162;
		@Pc(166) int local166;
		@Pc(170) int local170;
		@Pc(174) int local174;
		@Pc(288) int local288;
		@Pc(296) int local296;
		@Pc(308) int local308;
		if (Static149.anInt1915 == 0) {
			if (Static149.anInt1928 == 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local12 = Static149.anInt1918;
					local14 = Static149.anInt1939;
					local16 = Static149.anInt1917;
					local18 = Static149.anInt1937;
					if (local14 >= 0 && local16 >= 0 && local14 - (super.anInt1936 << 12) < 0 && local16 - (super.anInt1944 << 12) < 0) {
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else if (arg0 == 1) {
								local162 = this.anIntArray22[local48];
								local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
								local170 = 256 - local166;
								if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
									local174 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
								} else if (Static149.anInt1925 == 255) {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local3[local51] = (local174 | local288 | local296) >>> 8;
								} else {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local162 = (local174 | local288 | local296) >>> 8;
									local308 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
								local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
								local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
								local296 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local18++;
						}
					}
					local9++;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else if (Static149.anInt1928 < 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local12 = Static149.anInt1918;
					local14 = Static149.anInt1939;
					local16 = Static149.anInt1917 + Static149.anInt1931;
					local18 = Static149.anInt1937;
					if (local14 >= 0 && local14 - (super.anInt1936 << 12) < 0) {
						@Pc(703) int local703;
						if ((local703 = local16 - (super.anInt1944 << 12)) >= 0) {
							local710 = (Static149.anInt1928 - local703) / Static149.anInt1928;
							local18 += local710;
							local16 += Static149.anInt1928 * local710;
							local12 += local710;
						}
						@Pc(731) int local731;
						if ((local731 = (local16 - Static149.anInt1928) / Static149.anInt1928) > local18) {
							local18 = local731;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else if (arg0 == 1) {
								local162 = this.anIntArray22[local48];
								local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
								local170 = 256 - local166;
								if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
									local174 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
								} else if (Static149.anInt1925 == 255) {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local3[local51] = (local174 | local288 | local296) >>> 8;
								} else {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local162 = (local174 | local288 | local296) >>> 8;
									local308 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
								local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
								local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
								local296 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static149.anInt1928;
							local18++;
						}
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local12 = Static149.anInt1918;
					local14 = Static149.anInt1939;
					local16 = Static149.anInt1917 + Static149.anInt1931;
					local18 = Static149.anInt1937;
					if (local14 >= 0 && local14 - (super.anInt1936 << 12) < 0) {
						if (local16 < 0) {
							local710 = (Static149.anInt1928 - local16 - 1) / Static149.anInt1928;
							local18 += local710;
							local16 += Static149.anInt1928 * local710;
							local12 += local710;
						}
						@Pc(1438) int local1438;
						if ((local1438 = (local16 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local18) {
							local18 = local1438;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else if (arg0 == 1) {
								local162 = this.anIntArray22[local48];
								local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
								local170 = 256 - local166;
								if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
									local174 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
								} else if (Static149.anInt1925 == 255) {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local3[local51] = (local174 | local288 | local296) >>> 8;
								} else {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local162 = (local174 | local288 | local296) >>> 8;
									local308 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
								local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
								local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
								local296 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local16 += Static149.anInt1928;
							local18++;
						}
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1918 += Static149.anInt1934;
				}
			}
		} else if (Static149.anInt1915 < 0) {
			if (Static149.anInt1928 == 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local12 = Static149.anInt1918;
					local14 = Static149.anInt1939 + Static149.anInt1935;
					local16 = Static149.anInt1917;
					local18 = Static149.anInt1937;
					if (local16 >= 0 && local16 - (super.anInt1944 << 12) < 0) {
						@Pc(2119) int local2119;
						if ((local2119 = local14 - (super.anInt1936 << 12)) >= 0) {
							local710 = (Static149.anInt1915 - local2119) / Static149.anInt1915;
							local18 += local710;
							local14 += Static149.anInt1915 * local710;
							local12 += local710;
						}
						@Pc(2147) int local2147;
						if ((local2147 = (local14 - Static149.anInt1915) / Static149.anInt1915) > local18) {
							local18 = local2147;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else if (arg0 == 1) {
								local162 = this.anIntArray22[local48];
								local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
								local170 = 256 - local166;
								if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
									local174 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
								} else if (Static149.anInt1925 == 255) {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local3[local51] = (local174 | local288 | local296) >>> 8;
								} else {
									local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local162 = (local174 | local288 | local296) >>> 8;
									local308 = local3[local51];
									local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
								}
							} else if (arg0 == 2) {
								local162 = this.anIntArray22[local48];
								local166 = local162 >>> 24;
								local170 = 256 - local166;
								local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
								local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
								local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
								local296 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
							local14 += Static149.anInt1915;
							local18++;
						}
					}
					local9++;
					Static149.anInt1917 += Static149.anInt1930;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else if (Static149.anInt1928 < 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local12 = Static149.anInt1918;
					local14 = Static149.anInt1939 + Static149.anInt1935;
					local16 = Static149.anInt1917 + Static149.anInt1931;
					local18 = Static149.anInt1937;
					@Pc(2819) int local2819;
					if ((local2819 = local14 - (super.anInt1936 << 12)) >= 0) {
						local710 = (Static149.anInt1915 - local2819) / Static149.anInt1915;
						local18 += local710;
						local14 += Static149.anInt1915 * local710;
						local16 += Static149.anInt1928 * local710;
						local12 += local710;
					}
					@Pc(2853) int local2853;
					if ((local2853 = (local14 - Static149.anInt1915) / Static149.anInt1915) > local18) {
						local18 = local2853;
					}
					@Pc(2865) int local2865;
					if ((local2865 = local16 - (super.anInt1944 << 12)) >= 0) {
						local710 = (Static149.anInt1928 - local2865) / Static149.anInt1928;
						local18 += local710;
						local14 += Static149.anInt1915 * local710;
						local16 += Static149.anInt1928 * local710;
						local12 += local710;
					}
					@Pc(2899) int local2899;
					if ((local2899 = (local16 - Static149.anInt1928) / Static149.anInt1928) > local18) {
						local18 = local2899;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local162 = this.anIntArray22[local48];
							local166 = local162 >>> 24;
							local170 = 256 - local166;
							local174 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else if (arg0 == 1) {
							local162 = this.anIntArray22[local48];
							local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
							local170 = 256 - local166;
							if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
								local174 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else if (Static149.anInt1925 == 255) {
								local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local3[local51] = (local174 | local288 | local296) >>> 8;
							} else {
								local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local162 = (local174 | local288 | local296) >>> 8;
								local308 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 2) {
							local162 = this.anIntArray22[local48];
							local166 = local162 >>> 24;
							local170 = 256 - local166;
							local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
							local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
							local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
							local296 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static149.anInt1915;
						local16 += Static149.anInt1928;
						local18++;
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1917 += Static149.anInt1930;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local12 = Static149.anInt1918;
					local14 = Static149.anInt1939 + Static149.anInt1935;
					local16 = Static149.anInt1917 + Static149.anInt1931;
					local18 = Static149.anInt1937;
					@Pc(3577) int local3577;
					if ((local3577 = local14 - (super.anInt1936 << 12)) >= 0) {
						local710 = (Static149.anInt1915 - local3577) / Static149.anInt1915;
						local18 += local710;
						local14 += Static149.anInt1915 * local710;
						local16 += Static149.anInt1928 * local710;
						local12 += local710;
					}
					@Pc(3611) int local3611;
					if ((local3611 = (local14 - Static149.anInt1915) / Static149.anInt1915) > local18) {
						local18 = local3611;
					}
					if (local16 < 0) {
						local710 = (Static149.anInt1928 - local16 - 1) / Static149.anInt1928;
						local18 += local710;
						local14 += Static149.anInt1915 * local710;
						local16 += Static149.anInt1928 * local710;
						local12 += local710;
					}
					@Pc(3659) int local3659;
					if ((local3659 = (local16 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local18) {
						local18 = local3659;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local162 = this.anIntArray22[local48];
							local166 = local162 >>> 24;
							local170 = 256 - local166;
							local174 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else if (arg0 == 1) {
							local162 = this.anIntArray22[local48];
							local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
							local170 = 256 - local166;
							if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
								local174 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else if (Static149.anInt1925 == 255) {
								local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local3[local51] = (local174 | local288 | local296) >>> 8;
							} else {
								local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local162 = (local174 | local288 | local296) >>> 8;
								local308 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 2) {
							local162 = this.anIntArray22[local48];
							local166 = local162 >>> 24;
							local170 = 256 - local166;
							local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
							local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
							local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
							local296 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static149.anInt1915;
						local16 += Static149.anInt1928;
						local18++;
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1917 += Static149.anInt1930;
					Static149.anInt1918 += Static149.anInt1934;
				}
			}
		} else if (Static149.anInt1928 == 0) {
			local9 = Static149.anInt1933;
			while (local9 < 0) {
				local12 = Static149.anInt1918;
				local14 = Static149.anInt1939 + Static149.anInt1935;
				local16 = Static149.anInt1917;
				local18 = Static149.anInt1937;
				if (local16 >= 0 && local16 - (super.anInt1944 << 12) < 0) {
					if (local14 < 0) {
						local710 = (Static149.anInt1915 - local14 - 1) / Static149.anInt1915;
						local18 += local710;
						local14 += Static149.anInt1915 * local710;
						local12 += local710;
					}
					@Pc(4376) int local4376;
					if ((local4376 = (local14 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local18) {
						local18 = local4376;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local162 = this.anIntArray22[local48];
							local166 = local162 >>> 24;
							local170 = 256 - local166;
							local174 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else if (arg0 == 1) {
							local162 = this.anIntArray22[local48];
							local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
							local170 = 256 - local166;
							if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
								local174 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
							} else if (Static149.anInt1925 == 255) {
								local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local3[local51] = (local174 | local288 | local296) >>> 8;
							} else {
								local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local162 = (local174 | local288 | local296) >>> 8;
								local308 = local3[local51];
								local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
							}
						} else if (arg0 == 2) {
							local162 = this.anIntArray22[local48];
							local166 = local162 >>> 24;
							local170 = 256 - local166;
							local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
							local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
							local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
							local296 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
						local14 += Static149.anInt1915;
						local18++;
					}
				}
				local9++;
				Static149.anInt1939 += Static149.anInt1924;
				Static149.anInt1917 += Static149.anInt1930;
				Static149.anInt1918 += Static149.anInt1934;
			}
		} else if (Static149.anInt1928 < 0) {
			for (local9 = Static149.anInt1933; local9 < 0; local9++) {
				local12 = Static149.anInt1918;
				local14 = Static149.anInt1939 + Static149.anInt1935;
				local16 = Static149.anInt1917 + Static149.anInt1931;
				local18 = Static149.anInt1937;
				if (local14 < 0) {
					local710 = (Static149.anInt1915 - local14 - 1) / Static149.anInt1915;
					local18 += local710;
					local14 += Static149.anInt1915 * local710;
					local16 += Static149.anInt1928 * local710;
					local12 += local710;
				}
				@Pc(5088) int local5088;
				if ((local5088 = (local14 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local18) {
					local18 = local5088;
				}
				@Pc(5100) int local5100;
				if ((local5100 = local16 - (super.anInt1944 << 12)) >= 0) {
					local710 = (Static149.anInt1928 - local5100) / Static149.anInt1928;
					local18 += local710;
					local14 += Static149.anInt1915 * local710;
					local16 += Static149.anInt1928 * local710;
					local12 += local710;
				}
				@Pc(5134) int local5134;
				if ((local5134 = (local16 - Static149.anInt1928) / Static149.anInt1928) > local18) {
					local18 = local5134;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 0) {
						local162 = this.anIntArray22[local48];
						local166 = local162 >>> 24;
						local170 = 256 - local166;
						local174 = local3[local51];
						local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
					} else if (arg0 == 1) {
						local162 = this.anIntArray22[local48];
						local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
						local170 = 256 - local166;
						if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
							local174 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else if (Static149.anInt1925 == 255) {
							local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
							local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
							local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
							local3[local51] = (local174 | local288 | local296) >>> 8;
						} else {
							local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
							local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
							local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
							local162 = (local174 | local288 | local296) >>> 8;
							local308 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 2) {
						local162 = this.anIntArray22[local48];
						local166 = local162 >>> 24;
						local170 = 256 - local166;
						local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
						local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
						local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
						local296 = local3[local51];
						local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static149.anInt1915;
					local16 += Static149.anInt1928;
					local18++;
				}
				Static149.anInt1939 += Static149.anInt1924;
				Static149.anInt1917 += Static149.anInt1930;
				Static149.anInt1918 += Static149.anInt1934;
			}
		} else {
			for (local9 = Static149.anInt1933; local9 < 0; local9++) {
				local12 = Static149.anInt1918;
				local14 = Static149.anInt1939 + Static149.anInt1935;
				local16 = Static149.anInt1917 + Static149.anInt1931;
				local18 = Static149.anInt1937;
				if (local14 < 0) {
					local710 = (Static149.anInt1915 - local14 - 1) / Static149.anInt1915;
					local18 += local710;
					local14 += Static149.anInt1915 * local710;
					local16 += Static149.anInt1928 * local710;
					local12 += local710;
				}
				@Pc(5848) int local5848;
				if ((local5848 = (local14 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local18) {
					local18 = local5848;
				}
				if (local16 < 0) {
					local710 = (Static149.anInt1928 - local16 - 1) / Static149.anInt1928;
					local18 += local710;
					local14 += Static149.anInt1915 * local710;
					local16 += Static149.anInt1928 * local710;
					local12 += local710;
				}
				@Pc(5896) int local5896;
				if ((local5896 = (local16 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local18) {
					local18 = local5896;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 0) {
						local162 = this.anIntArray22[local48];
						local166 = local162 >>> 24;
						local170 = 256 - local166;
						local174 = local3[local51];
						local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
					} else if (arg0 == 1) {
						local162 = this.anIntArray22[local48];
						local166 = (local162 >>> 24) * Static149.anInt1925 >> 8;
						local170 = 256 - local166;
						if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
							local174 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local174 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local174 & 0xFF00) * local170 & 0xFF0000) >> 8;
						} else if (Static149.anInt1925 == 255) {
							local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
							local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
							local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
							local3[local51] = (local174 | local288 | local296) >>> 8;
						} else {
							local174 = (local162 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
							local288 = (local162 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
							local296 = (local162 & 0xFF) * Static149.anInt1922 & 0xFF00;
							local162 = (local174 | local288 | local296) >>> 8;
							local308 = local3[local51];
							local3[local51] = ((local162 & 0xFF00FF) * local166 + (local308 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local308 & 0xFF00) * local170 & 0xFF0000) >> 8;
						}
					} else if (arg0 == 2) {
						local162 = this.anIntArray22[local48];
						local166 = local162 >>> 24;
						local170 = 256 - local166;
						local174 = (local162 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
						local288 = (local162 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
						local162 = ((local174 | local288) >>> 8) + Static149.anInt1940;
						local296 = local3[local51];
						local3[local51] = ((local162 & 0xFF00FF) * local166 + (local296 & 0xFF00FF) * local170 & 0xFF00FF00) + ((local162 & 0xFF00) * local166 + (local296 & 0xFF00) * local170 & 0xFF0000) >> 8;
					} else {
						throw new IllegalArgumentException();
					}
					local14 += Static149.anInt1915;
					local16 += Static149.anInt1928;
					local18++;
				}
				Static149.anInt1939 += Static149.anInt1924;
				Static149.anInt1917 += Static149.anInt1930;
				Static149.anInt1918 += Static149.anInt1934;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method1989(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_5.anIntArray179;
		@Pc(217) int local217;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) int local111;
		@Pc(115) int local115;
		@Pc(119) int local119;
		@Pc(123) int local123;
		if (Static149.anInt1915 == 0) {
			if (Static149.anInt1928 == 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static149.anInt1918;
						local25 = Static149.anInt1939;
						local27 = Static149.anInt1917;
						local29 = Static149.anInt1937;
						if (local25 >= 0 && local27 >= 0 && local25 - (super.anInt1936 << 12) < 0 && local27 - (super.anInt1944 << 12) < 0) {
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static149.anInt1918 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static149.anInt1915 * local64;
								local27 += Static149.anInt1928 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local29++;
							}
						}
					}
					local9++;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else if (Static149.anInt1928 < 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static149.anInt1918;
						local25 = Static149.anInt1939;
						local27 = Static149.anInt1917 + Static149.anInt1931;
						local29 = Static149.anInt1937;
						if (local25 >= 0 && local25 - (super.anInt1936 << 12) < 0) {
							@Pc(210) int local210;
							if ((local210 = local27 - (super.anInt1944 << 12)) >= 0) {
								local217 = (Static149.anInt1928 - local210) / Static149.anInt1928;
								local29 += local217;
								local27 += Static149.anInt1928 * local217;
								local23 += local217;
							}
							@Pc(238) int local238;
							if ((local238 = (local27 - Static149.anInt1928) / Static149.anInt1928) > local29) {
								local29 = local238;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static149.anInt1918 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static149.anInt1915 * local64;
								local27 += Static149.anInt1928 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local27 += Static149.anInt1928;
								local29++;
							}
						}
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static149.anInt1918;
						local25 = Static149.anInt1939;
						local27 = Static149.anInt1917 + Static149.anInt1931;
						local29 = Static149.anInt1937;
						if (local25 >= 0 && local25 - (super.anInt1936 << 12) < 0) {
							if (local27 < 0) {
								local217 = (Static149.anInt1928 - local27 - 1) / Static149.anInt1928;
								local29 += local217;
								local27 += Static149.anInt1928 * local217;
								local23 += local217;
							}
							@Pc(441) int local441;
							if ((local441 = (local27 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local29) {
								local29 = local441;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static149.anInt1918 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static149.anInt1915 * local64;
								local27 += Static149.anInt1928 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local27 += Static149.anInt1928;
								local29++;
							}
						}
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1918 += Static149.anInt1934;
				}
			}
		} else if (Static149.anInt1915 < 0) {
			if (Static149.anInt1928 == 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static149.anInt1918;
						local25 = Static149.anInt1939 + Static149.anInt1935;
						local27 = Static149.anInt1917;
						local29 = Static149.anInt1937;
						if (local27 >= 0 && local27 - (super.anInt1944 << 12) < 0) {
							@Pc(618) int local618;
							if ((local618 = local25 - (super.anInt1936 << 12)) >= 0) {
								local217 = (Static149.anInt1915 - local618) / Static149.anInt1915;
								local29 += local217;
								local25 += Static149.anInt1915 * local217;
								local23 += local217;
							}
							@Pc(646) int local646;
							if ((local646 = (local25 - Static149.anInt1915) / Static149.anInt1915) > local29) {
								local29 = local646;
							}
							local53 = arg0[local14] - arg2;
							local58 = -arg1[local14];
							local64 = local53 + Static149.anInt1918 - local23;
							if (local64 > 0) {
								local23 += local64;
								local29 += local64;
								local25 += Static149.anInt1915 * local64;
								local27 += Static149.anInt1928 * local64;
							} else {
								local58 -= local64;
							}
							if (local29 < local58) {
								local29 = local58;
							}
							while (local29 < 0) {
								local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								local115 = local111 >>> 24;
								local119 = 256 - local115;
								local123 = local3[local23];
								local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
								local25 += Static149.anInt1915;
								local29++;
							}
						}
					}
					local9++;
					Static149.anInt1917 += Static149.anInt1930;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else if (Static149.anInt1928 < 0) {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static149.anInt1918;
						local25 = Static149.anInt1939 + Static149.anInt1935;
						local27 = Static149.anInt1917 + Static149.anInt1931;
						local29 = Static149.anInt1937;
						@Pc(814) int local814;
						if ((local814 = local25 - (super.anInt1936 << 12)) >= 0) {
							local217 = (Static149.anInt1915 - local814) / Static149.anInt1915;
							local29 += local217;
							local25 += Static149.anInt1915 * local217;
							local27 += Static149.anInt1928 * local217;
							local23 += local217;
						}
						@Pc(848) int local848;
						if ((local848 = (local25 - Static149.anInt1915) / Static149.anInt1915) > local29) {
							local29 = local848;
						}
						@Pc(860) int local860;
						if ((local860 = local27 - (super.anInt1944 << 12)) >= 0) {
							local217 = (Static149.anInt1928 - local860) / Static149.anInt1928;
							local29 += local217;
							local25 += Static149.anInt1915 * local217;
							local27 += Static149.anInt1928 * local217;
							local23 += local217;
						}
						@Pc(894) int local894;
						if ((local894 = (local27 - Static149.anInt1928) / Static149.anInt1928) > local29) {
							local29 = local894;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static149.anInt1918 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static149.anInt1915 * local64;
							local27 += Static149.anInt1928 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static149.anInt1915;
							local27 += Static149.anInt1928;
							local29++;
						}
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1917 += Static149.anInt1930;
					Static149.anInt1918 += Static149.anInt1934;
				}
			} else {
				local9 = Static149.anInt1933;
				while (local9 < 0) {
					local14 = local9 + arg3;
					if (local14 >= 0) {
						if (local14 >= arg0.length) {
							return;
						}
						local23 = Static149.anInt1918;
						local25 = Static149.anInt1939 + Static149.anInt1935;
						local27 = Static149.anInt1917 + Static149.anInt1931;
						local29 = Static149.anInt1937;
						@Pc(1068) int local1068;
						if ((local1068 = local25 - (super.anInt1936 << 12)) >= 0) {
							local217 = (Static149.anInt1915 - local1068) / Static149.anInt1915;
							local29 += local217;
							local25 += Static149.anInt1915 * local217;
							local27 += Static149.anInt1928 * local217;
							local23 += local217;
						}
						@Pc(1102) int local1102;
						if ((local1102 = (local25 - Static149.anInt1915) / Static149.anInt1915) > local29) {
							local29 = local1102;
						}
						if (local27 < 0) {
							local217 = (Static149.anInt1928 - local27 - 1) / Static149.anInt1928;
							local29 += local217;
							local25 += Static149.anInt1915 * local217;
							local27 += Static149.anInt1928 * local217;
							local23 += local217;
						}
						@Pc(1150) int local1150;
						if ((local1150 = (local27 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local29) {
							local29 = local1150;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static149.anInt1918 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static149.anInt1915 * local64;
							local27 += Static149.anInt1928 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static149.anInt1915;
							local27 += Static149.anInt1928;
							local29++;
						}
					}
					local9++;
					Static149.anInt1939 += Static149.anInt1924;
					Static149.anInt1917 += Static149.anInt1930;
					Static149.anInt1918 += Static149.anInt1934;
				}
			}
		} else if (Static149.anInt1928 == 0) {
			local9 = Static149.anInt1933;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static149.anInt1918;
					local25 = Static149.anInt1939 + Static149.anInt1935;
					local27 = Static149.anInt1917;
					local29 = Static149.anInt1937;
					if (local27 >= 0 && local27 - (super.anInt1944 << 12) < 0) {
						if (local25 < 0) {
							local217 = (Static149.anInt1915 - local25 - 1) / Static149.anInt1915;
							local29 += local217;
							local25 += Static149.anInt1915 * local217;
							local23 += local217;
						}
						@Pc(1363) int local1363;
						if ((local1363 = (local25 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local29) {
							local29 = local1363;
						}
						local53 = arg0[local14] - arg2;
						local58 = -arg1[local14];
						local64 = local53 + Static149.anInt1918 - local23;
						if (local64 > 0) {
							local23 += local64;
							local29 += local64;
							local25 += Static149.anInt1915 * local64;
							local27 += Static149.anInt1928 * local64;
						} else {
							local58 -= local64;
						}
						if (local29 < local58) {
							local29 = local58;
						}
						while (local29 < 0) {
							local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
							local115 = local111 >>> 24;
							local119 = 256 - local115;
							local123 = local3[local23];
							local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
							local25 += Static149.anInt1915;
							local29++;
						}
					}
				}
				local9++;
				Static149.anInt1939 += Static149.anInt1924;
				Static149.anInt1917 += Static149.anInt1930;
				Static149.anInt1918 += Static149.anInt1934;
			}
		} else if (Static149.anInt1928 < 0) {
			local9 = Static149.anInt1933;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static149.anInt1918;
					local25 = Static149.anInt1939 + Static149.anInt1935;
					local27 = Static149.anInt1917 + Static149.anInt1931;
					local29 = Static149.anInt1937;
					if (local25 < 0) {
						local217 = (Static149.anInt1915 - local25 - 1) / Static149.anInt1915;
						local29 += local217;
						local25 += Static149.anInt1915 * local217;
						local27 += Static149.anInt1928 * local217;
						local23 += local217;
					}
					@Pc(1571) int local1571;
					if ((local1571 = (local25 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local29) {
						local29 = local1571;
					}
					@Pc(1583) int local1583;
					if ((local1583 = local27 - (super.anInt1944 << 12)) >= 0) {
						local217 = (Static149.anInt1928 - local1583) / Static149.anInt1928;
						local29 += local217;
						local25 += Static149.anInt1915 * local217;
						local27 += Static149.anInt1928 * local217;
						local23 += local217;
					}
					@Pc(1617) int local1617;
					if ((local1617 = (local27 - Static149.anInt1928) / Static149.anInt1928) > local29) {
						local29 = local1617;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static149.anInt1918 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static149.anInt1915 * local64;
						local27 += Static149.anInt1928 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
						local115 = local111 >>> 24;
						local119 = 256 - local115;
						local123 = local3[local23];
						local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
						local25 += Static149.anInt1915;
						local27 += Static149.anInt1928;
						local29++;
					}
				}
				local9++;
				Static149.anInt1939 += Static149.anInt1924;
				Static149.anInt1917 += Static149.anInt1930;
				Static149.anInt1918 += Static149.anInt1934;
			}
		} else {
			local9 = Static149.anInt1933;
			while (local9 < 0) {
				local14 = local9 + arg3;
				if (local14 >= 0) {
					if (local14 >= arg0.length) {
						return;
					}
					local23 = Static149.anInt1918;
					local25 = Static149.anInt1939 + Static149.anInt1935;
					local27 = Static149.anInt1917 + Static149.anInt1931;
					local29 = Static149.anInt1937;
					if (local25 < 0) {
						local217 = (Static149.anInt1915 - local25 - 1) / Static149.anInt1915;
						local29 += local217;
						local25 += Static149.anInt1915 * local217;
						local27 += Static149.anInt1928 * local217;
						local23 += local217;
					}
					@Pc(1827) int local1827;
					if ((local1827 = (local25 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local29) {
						local29 = local1827;
					}
					if (local27 < 0) {
						local217 = (Static149.anInt1928 - local27 - 1) / Static149.anInt1928;
						local29 += local217;
						local25 += Static149.anInt1915 * local217;
						local27 += Static149.anInt1928 * local217;
						local23 += local217;
					}
					@Pc(1875) int local1875;
					if ((local1875 = (local27 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local29) {
						local29 = local1875;
					}
					local53 = arg0[local14] - arg2;
					local58 = -arg1[local14];
					local64 = local53 + Static149.anInt1918 - local23;
					if (local64 > 0) {
						local23 += local64;
						local29 += local64;
						local25 += Static149.anInt1915 * local64;
						local27 += Static149.anInt1928 * local64;
					} else {
						local58 -= local64;
					}
					if (local29 < local58) {
						local29 = local58;
					}
					while (local29 < 0) {
						local111 = this.anIntArray22[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
						local115 = local111 >>> 24;
						local119 = 256 - local115;
						local123 = local3[local23];
						local3[local23++] = ((local111 & 0xFF00FF) * local115 + (local123 & 0xFF00FF) * local119 & 0xFF00FF00) + ((local111 & 0xFF00) * local115 + (local123 & 0xFF00) * local119 & 0xFF0000) >> 8;
						local25 += Static149.anInt1915;
						local27 += Static149.anInt1928;
						local29++;
					}
				}
				local9++;
				Static149.anInt1939 += Static149.anInt1924;
				Static149.anInt1917 += Static149.anInt1930;
				Static149.anInt1918 += Static149.anInt1934;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (super.aClass19_Sub2_5.method2912()) {
			throw new IllegalStateException();
		} else if (arg2 > 0 && arg3 > 0) {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(20) int local20 = super.aClass19_Sub2_5.anInt2863;
			@Pc(29) int local29 = super.anInt1938 + super.anInt1936 + super.anInt1919;
			@Pc(38) int local38 = super.anInt1916 + super.anInt1944 + super.anInt1929;
			@Pc(44) int local44 = (local29 << 16) / arg2;
			@Pc(50) int local50 = (local38 << 16) / arg3;
			@Pc(64) int local64;
			if (super.anInt1938 > 0) {
				local64 = ((super.anInt1938 << 16) + local44 - 1) / local44;
				arg0 += local64;
				local14 = local64 * local44 - (super.anInt1938 << 16);
			}
			if (super.anInt1916 > 0) {
				local64 = ((super.anInt1916 << 16) + local50 - 1) / local50;
				arg1 += local64;
				local16 = local64 * local50 - (super.anInt1916 << 16);
			}
			if (super.anInt1936 < local29) {
				arg2 = ((super.anInt1936 << 16) + local44 - local14 - 1) / local44;
			}
			if (super.anInt1944 < local38) {
				arg3 = ((super.anInt1944 << 16) + local50 - local16 - 1) / local50;
			}
			local64 = arg0 + arg1 * local20;
			@Pc(152) int local152 = local20 - arg2;
			if (arg1 + arg3 > super.aClass19_Sub2_5.anInt2859) {
				arg3 -= arg1 + arg3 - super.aClass19_Sub2_5.anInt2859;
			}
			@Pc(180) int local180;
			if (arg1 < super.aClass19_Sub2_5.anInt2857) {
				local180 = super.aClass19_Sub2_5.anInt2857 - arg1;
				arg3 -= local180;
				local64 += local180 * local20;
				local16 += local50 * local180;
			}
			if (arg0 + arg2 > super.aClass19_Sub2_5.anInt2854) {
				local180 = arg0 + arg2 - super.aClass19_Sub2_5.anInt2854;
				arg2 -= local180;
				local152 += local180;
			}
			if (arg0 < super.aClass19_Sub2_5.anInt2868) {
				local180 = super.aClass19_Sub2_5.anInt2868 - arg0;
				arg2 -= local180;
				local64 += local180;
				local14 += local44 * local180;
				local152 += local180;
			}
			@Pc(252) int[] local252 = super.aClass19_Sub2_5.anIntArray179;
			@Pc(258) int local258;
			@Pc(261) int local261;
			@Pc(269) int local269;
			@Pc(272) int local272;
			@Pc(330) int local330;
			@Pc(338) int local338;
			@Pc(341) int local341;
			@Pc(351) int local351;
			@Pc(359) int local359;
			@Pc(367) int local367;
			@Pc(375) int local375;
			if (arg6 != 0) {
				@Pc(794) int local794;
				@Pc(802) int local802;
				@Pc(814) int local814;
				if (arg6 == 1) {
					if (arg4 == 0) {
						local258 = local14;
						for (local261 = -arg3; local261 < 0; local261++) {
							local269 = (local16 >> 16) * super.anInt1936;
							for (local272 = -arg2; local272 < 0; local272++) {
								local330 = this.anIntArray22[(local14 >> 16) + local269];
								local338 = local330 >>> 24;
								local341 = 256 - local338;
								local351 = local252[local64];
								local252[local64++] = ((local330 & 0xFF00FF) * local338 + (local351 & 0xFF00FF) * local341 & 0xFF00FF00) + ((local330 & 0xFF00) * local338 + (local351 & 0xFF00) * local341 & 0xFF0000) >> 8;
								local14 += local44;
							}
							local16 += local50;
							local14 = local258;
							local64 += local152;
						}
					} else if (arg4 == 1) {
						local258 = local14;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							for (local261 = -arg3; local261 < 0; local261++) {
								local269 = (local16 >> 16) * super.anInt1936;
								for (local272 = -arg2; local272 < 0; local272++) {
									local330 = this.anIntArray22[(local14 >> 16) + local269];
									local338 = (local330 >>> 24) * (arg5 >>> 24) >> 8;
									local341 = 256 - local338;
									local351 = local252[local64];
									local252[local64++] = ((local330 & 0xFF00FF) * local338 + (local351 & 0xFF00FF) * local341 & 0xFF00FF00) + ((local330 & 0xFF00) * local338 + (local351 & 0xFF00) * local341 & 0xFF0000) >> 8;
									local14 += local44;
								}
								local16 += local50;
								local14 = local258;
								local64 += local152;
							}
						} else {
							local261 = arg5 >> 16 & 0xFF;
							local269 = arg5 >> 8 & 0xFF;
							local272 = arg5 & 0xFF;
							for (local330 = -arg3; local330 < 0; local330++) {
								local338 = (local16 >> 16) * super.anInt1936;
								for (local341 = -arg2; local341 < 0; local341++) {
									local351 = this.anIntArray22[(local14 >> 16) + local338];
									local359 = (local351 >>> 24) * (arg5 >>> 24) >> 8;
									local367 = 256 - local359;
									if (local359 == 255) {
										local375 = (local351 & 0xFF0000) * local261 & 0xFF000000;
										local794 = (local351 & 0xFF00) * local269 & 0xFF0000;
										local802 = (local351 & 0xFF) * local272 & 0xFF00;
										local252[local64++] = (local375 | local794 | local802) >>> 8;
									} else {
										local375 = (local351 & 0xFF0000) * local261 & 0xFF000000;
										local794 = (local351 & 0xFF00) * local269 & 0xFF0000;
										local802 = (local351 & 0xFF) * local272 & 0xFF00;
										local351 = (local375 | local794 | local802) >>> 8;
										local814 = local252[local64];
										local252[local64++] = ((local351 & 0xFF00FF) * local359 + (local814 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local351 & 0xFF00) * local359 + (local814 & 0xFF00) * local367 & 0xFF0000) >> 8;
									}
									local14 += local44;
								}
								local16 += local50;
								local14 = local258;
								local64 += local152;
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (arg6 != 2) {
					throw new IllegalArgumentException();
				} else if (arg4 == 0) {
					local258 = local14;
					for (local261 = -arg3; local261 < 0; local261++) {
						local269 = (local16 >> 16) * super.anInt1936;
						for (local272 = -arg2; local272 < 0; local272++) {
							local330 = this.anIntArray22[(local14 >> 16) + local269];
							if (local330 == 0) {
								local64++;
							} else {
								local338 = local252[local64];
								local341 = local330 + local338;
								local351 = (local330 & 0xFF00FF) + (local338 & 0xFF00FF);
								local338 = (local351 & 0x1000100) + (local341 - local351 & 0x10000);
								local252[local64++] = local341 - local338 | local338 - (local338 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local258;
						local64 += local152;
					}
				} else if (arg4 == 1) {
					local258 = local14;
					local261 = arg5 >> 16 & 0xFF;
					local269 = arg5 >> 8 & 0xFF;
					local272 = arg5 & 0xFF;
					for (local330 = -arg3; local330 < 0; local330++) {
						local338 = (local16 >> 16) * super.anInt1936;
						for (local341 = -arg2; local341 < 0; local341++) {
							local351 = this.anIntArray22[(local14 >> 16) + local338];
							if (local351 == 0) {
								local64++;
							} else {
								local359 = (local351 & 0xFF0000) * local261 & 0xFF000000;
								local367 = (local351 & 0xFF00) * local269 & 0xFF0000;
								local375 = (local351 & 0xFF) * local272 & 0xFF00;
								local351 = (local359 | local367 | local375) >>> 8;
								local794 = local252[local64];
								local802 = local351 + local794;
								local814 = (local351 & 0xFF00FF) + (local794 & 0xFF00FF);
								@Pc(1257) int local1257 = (local814 & 0x1000100) + (local802 - local814 & 0x10000);
								local252[local64++] = local802 - local1257 | local1257 - (local1257 >>> 8);
							}
							local14 += local44;
						}
						local16 += local50;
						local14 = local258;
						local64 += local152;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg4 == 0) {
				local258 = local14;
				for (local261 = -arg3; local261 < 0; local261++) {
					local269 = (local16 >> 16) * super.anInt1936;
					for (local272 = -arg2; local272 < 0; local272++) {
						local252[local64++] = this.anIntArray22[(local14 >> 16) + local269];
						local14 += local44;
					}
					local16 += local50;
					local14 = local258;
					local64 += local152;
				}
			} else if (arg4 == 1) {
				local258 = arg5 >> 16 & 0xFF;
				local261 = arg5 >> 8 & 0xFF;
				local269 = arg5 & 0xFF;
				local272 = local14;
				for (local330 = -arg3; local330 < 0; local330++) {
					local338 = (local16 >> 16) * super.anInt1936;
					for (local341 = -arg2; local341 < 0; local341++) {
						local351 = this.anIntArray22[(local14 >> 16) + local338];
						local359 = (local351 & 0xFF0000) * local258 & 0xFF000000;
						local367 = (local351 & 0xFF00) * local261 & 0xFF0000;
						local375 = (local351 & 0xFF) * local269 & 0xFF00;
						local252[local64++] = (local359 | local367 | local375) >>> 8;
						local14 += local44;
					}
					local16 += local50;
					local14 = local272;
					local64 += local152;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (super.aClass19_Sub2_5.method2912()) {
			throw new IllegalStateException();
		}
		@Pc(11) int local11 = super.aClass19_Sub2_5.anInt2863;
		arg0 += super.anInt1938;
		arg1 += super.anInt1916;
		@Pc(27) int local27 = arg1 * local11 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = super.anInt1944;
		@Pc(35) int local35 = super.anInt1936;
		@Pc(39) int local39 = local11 - local35;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg1 < super.aClass19_Sub2_5.anInt2857) {
			local52 = super.aClass19_Sub2_5.anInt2857 - arg1;
			local32 -= local52;
			arg1 = super.aClass19_Sub2_5.anInt2857;
			local29 = local52 * local35;
			local27 += local52 * local11;
		}
		if (arg1 + local32 > super.aClass19_Sub2_5.anInt2859) {
			local32 -= arg1 + local32 - super.aClass19_Sub2_5.anInt2859;
		}
		if (arg0 < super.aClass19_Sub2_5.anInt2868) {
			local52 = super.aClass19_Sub2_5.anInt2868 - arg0;
			local35 -= local52;
			arg0 = super.aClass19_Sub2_5.anInt2868;
			local29 += local52;
			local27 += local52;
			local41 = local52;
			local39 += local52;
		}
		if (arg0 + local35 > super.aClass19_Sub2_5.anInt2854) {
			local52 = arg0 + local35 - super.aClass19_Sub2_5.anInt2854;
			local35 -= local52;
			local41 += local52;
			local39 += local52;
		}
		if (local35 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(160) int[] local160 = super.aClass19_Sub2_5.anIntArray179;
		@Pc(424) int local424;
		@Pc(428) int local428;
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(443) int local443;
		@Pc(447) int local447;
		if (arg2 == 0) {
			for (local424 = -local32; local424 < 0; local424++) {
				for (local428 = -local35; local428 < 0; local428++) {
					local435 = this.anIntArray22[local29++];
					local439 = local435 >>> 24;
					local443 = 256 - local439;
					local447 = local160[local27];
					local160[local27++] = ((local435 & 0xFF00FF) * local439 + (local447 & 0xFF00FF) * local443 & 0xFF00FF00) + ((local435 & 0xFF00) * local439 + (local447 & 0xFF00) * local443 & 0xFF0000) >> 8;
				}
				local27 += local39;
				local29 += local41;
			}
			return;
		}
		@Pc(623) int local623;
		@Pc(627) int local627;
		@Pc(638) int local638;
		@Pc(646) int local646;
		if (arg2 == 1) {
			if ((arg3 & 0xFFFFFF) == 16777215) {
				for (local424 = -local32; local424 < 0; local424++) {
					for (local428 = -local35; local428 < 0; local428++) {
						local435 = this.anIntArray22[local29++];
						local439 = (local435 >>> 24) * (arg3 >>> 24) >> 8;
						local443 = 256 - local439;
						local447 = local160[local27];
						local160[local27++] = ((local435 & 0xFF00FF) * local439 + (local447 & 0xFF00FF) * local443 & 0xFF00FF00) + ((local435 & 0xFF00) * local439 + (local447 & 0xFF00) * local443 & 0xFF0000) >> 8;
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				local424 = arg3 >> 16 & 0xFF;
				local428 = arg3 >> 8 & 0xFF;
				local435 = arg3 & 0xFF;
				for (local439 = -local32; local439 < 0; local439++) {
					for (local443 = -local35; local443 < 0; local443++) {
						local447 = this.anIntArray22[local29++];
						local623 = (local447 >>> 24) * (arg3 >>> 24) >> 8;
						local627 = 256 - local623;
						@Pc(654) int local654;
						if (local623 == 255) {
							local638 = (local447 & 0xFF0000) * local424 & 0xFF000000;
							local646 = (local447 & 0xFF00) * local428 & 0xFF0000;
							local654 = (local447 & 0xFF) * local435 & 0xFF00;
							local160[local27++] = (local638 | local646 | local654) >>> 8;
						} else {
							local638 = (local447 & 0xFF0000) * local424 & 0xFF000000;
							local646 = (local447 & 0xFF00) * local428 & 0xFF0000;
							local654 = (local447 & 0xFF) * local435 & 0xFF00;
							local447 = (local638 | local646 | local654) >>> 8;
							@Pc(666) int local666 = local160[local27];
							local160[local27++] = ((local447 & 0xFF00FF) * local623 + (local666 & 0xFF00FF) * local627 & 0xFF00FF00) + ((local447 & 0xFF00) * local623 + (local666 & 0xFF00) * local627 & 0xFF0000) >> 8;
						}
					}
					local27 += local39;
					local29 += local41;
				}
			}
		} else if (arg2 == 2) {
			local424 = arg3 >>> 24;
			local428 = 256 - local424;
			local435 = (arg3 & 0xFF00FF) * local428 & 0xFF00FF00;
			local439 = (arg3 & 0xFF00) * local428 & 0xFF0000;
			@Pc(783) int local783 = (local435 | local439) >>> 8;
			for (local443 = -local32; local443 < 0; local443++) {
				for (local447 = -local35; local447 < 0; local447++) {
					local623 = this.anIntArray22[local29++];
					local627 = local623 >>> 24;
					local638 = 256 - local627;
					local435 = (local623 & 0xFF00FF) * local424 & 0xFF00FF00;
					local439 = (local623 & 0xFF00) * local424 & 0xFF0000;
					@Pc(829) int local829 = ((local435 | local439) >>> 8) + local783;
					local646 = local160[local27];
					local160[local27++] = ((local829 & 0xFF00FF) * local627 + (local646 & 0xFF00FF) * local638 & 0xFF00FF00) + ((local829 & 0xFF00) * local627 + (local646 & 0xFF00) * local638 & 0xFF0000) >> 8;
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_5.anIntArray179;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(14) int local14 = (arg1 + local5) * arg2 + arg0;
			@Pc(22) int local22 = local5 * arg2;
			for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
				this.anIntArray22[local14 + local24] = local3[local22 + local24] & 0xFFFFFF;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!kf;II)V")
	@Override
	public void method6383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aClass19_Sub2_5.method2912()) {
			throw new IllegalStateException();
		}
		arg0 += super.anInt1938;
		arg1 += super.anInt1916;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = super.aClass19_Sub2_5.anInt2863;
		@Pc(26) int local26 = super.anInt1936;
		@Pc(29) int local29 = super.anInt1944;
		@Pc(33) int local33 = local23 - local26;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = arg0 + arg1 * local23;
		@Pc(52) int local52;
		if (arg1 < super.aClass19_Sub2_5.anInt2857) {
			local52 = super.aClass19_Sub2_5.anInt2857 - arg1;
			local29 -= local52;
			arg1 = super.aClass19_Sub2_5.anInt2857;
			local19 = local52 * local26;
			local41 += local52 * local23;
		}
		if (arg1 + local29 > super.aClass19_Sub2_5.anInt2859) {
			local29 -= arg1 + local29 - super.aClass19_Sub2_5.anInt2859;
		}
		if (arg0 < super.aClass19_Sub2_5.anInt2868) {
			local52 = super.aClass19_Sub2_5.anInt2868 - arg0;
			local26 -= local52;
			arg0 = super.aClass19_Sub2_5.anInt2868;
			local19 += local52;
			local41 += local52;
			local35 = local52;
			local33 += local52;
		}
		if (arg0 + local26 > super.aClass19_Sub2_5.anInt2854) {
			local52 = arg0 + local26 - super.aClass19_Sub2_5.anInt2854;
			local26 -= local52;
			local35 += local52;
			local33 += local52;
		}
		if (local26 <= 0 || local29 <= 0) {
			return;
		}
		@Pc(159) Class78_Sub1 local159 = (Class78_Sub1) arg2;
		@Pc(162) int[] local162 = local159.anIntArray139;
		@Pc(165) int[] local165 = local159.anIntArray140;
		@Pc(169) int[] local169 = super.aClass19_Sub2_5.anIntArray179;
		@Pc(171) int local171 = arg1;
		if (arg4 > arg1) {
			local171 = arg4;
			local41 += (arg4 - arg1) * local23;
			local19 += (arg4 - arg1) * super.anInt1936;
		}
		@Pc(210) int local210 = arg4 + local162.length < arg1 + local29 ? arg4 + local162.length : arg1 + local29;
		for (@Pc(212) int local212 = local171; local212 < local210; local212++) {
			@Pc(221) int local221 = local162[local212 - arg4] + arg3;
			@Pc(227) int local227 = local165[local212 - arg4];
			@Pc(229) int local229 = local26;
			@Pc(236) int local236;
			if (arg0 > local221) {
				local236 = arg0 - local221;
				if (local236 >= local227) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local227 -= local236;
			} else {
				local236 = local221 - arg0;
				if (local236 >= local26) {
					local19 += local26 + local35;
					local41 += local26 + local33;
					continue;
				}
				local19 += local236;
				local229 = local26 - local236;
				local41 += local236;
			}
			local236 = 0;
			if (local229 < local227) {
				local227 = local229;
			} else {
				local236 = local229 - local227;
			}
			for (@Pc(304) int local304 = -local227; local304 < 0; local304++) {
				@Pc(311) int local311 = this.anIntArray22[local19++];
				@Pc(315) int local315 = local311 >>> 24;
				@Pc(319) int local319 = 256 - local315;
				@Pc(323) int local323 = local169[local41];
				local169[local41++] = ((local311 & 0xFF00FF) * local315 + (local323 & 0xFF00FF) * local319 & 0xFF00FF00) + ((local311 & 0xFF00) * local315 + (local323 & 0xFF00) * local319 & 0xFF0000) >> 8;
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}
}
