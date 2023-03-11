import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class13_Sub1_Sub2 extends Class13_Sub1 {

	@OriginalMember(owner = "client!cn", name = "H", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!cn", name = "I", descriptor = "[I")
	private final int[] anIntArray89;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!j;[B[III)V")
	public Class13_Sub1_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg3, arg4);
		this.aByteArray13 = arg1;
		this.anIntArray89 = arg2;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V")
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
			@Pc(335) int local335;
			@Pc(343) int local343;
			@Pc(346) int local346;
			@Pc(369) int local369;
			@Pc(377) int local377;
			@Pc(385) int local385;
			@Pc(361) int local361;
			if (arg6 != 0) {
				@Pc(778) int local778;
				@Pc(786) int local786;
				@Pc(794) int local794;
				@Pc(806) int local806;
				@Pc(564) byte local564;
				if (arg6 == 1) {
					if (arg4 == 0) {
						local258 = local14;
						for (local261 = -arg3; local261 < 0; local261++) {
							local269 = (local16 >> 16) * super.anInt1936;
							for (local272 = -arg2; local272 < 0; local272++) {
								local564 = this.aByteArray13[(local14 >> 16) + local269];
								if (local564 == 0) {
									local64++;
								} else {
									local252[local64++] = this.anIntArray89[local564 & 0xFF];
								}
								local14 += local44;
							}
							local16 += local50;
							local14 = local258;
							local64 += local152;
						}
					} else if (arg4 == 1) {
						local258 = local14;
						if ((arg5 & 0xFFFFFF) == 16777215) {
							local261 = arg5 >>> 24;
							local269 = 256 - local261;
							for (local272 = -arg3; local272 < 0; local272++) {
								local335 = (local16 >> 16) * super.anInt1936;
								for (local343 = -arg2; local343 < 0; local343++) {
									@Pc(641) byte local641 = this.aByteArray13[(local14 >> 16) + local335];
									if (local641 == 0) {
										local64++;
									} else {
										local361 = this.anIntArray89[local641 & 0xFF];
										local369 = local252[local64];
										local252[local64++] = ((local361 & 0xFF00FF) * local261 + (local369 & 0xFF00FF) * local269 & 0xFF00FF00) + ((local361 & 0xFF00) * local261 + (local369 & 0xFF00) * local269 & 0xFF0000) >> 8;
									}
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
							local335 = arg5 >>> 24;
							local343 = 256 - local335;
							for (local346 = -arg3; local346 < 0; local346++) {
								local361 = (local16 >> 16) * super.anInt1936;
								for (local369 = -arg2; local369 < 0; local369++) {
									@Pc(758) byte local758 = this.aByteArray13[(local14 >> 16) + local361];
									if (local758 == 0) {
										local64++;
									} else {
										local385 = this.anIntArray89[local758 & 0xFF];
										if (local335 == 255) {
											local778 = (local385 & 0xFF0000) * local261 & 0xFF000000;
											local786 = (local385 & 0xFF00) * local269 & 0xFF0000;
											local794 = (local385 & 0xFF) * local272 & 0xFF00;
											local252[local64++] = (local778 | local786 | local794) >>> 8;
										} else {
											local778 = (local385 & 0xFF0000) * local261 & 0xFF000000;
											local786 = (local385 & 0xFF00) * local269 & 0xFF0000;
											local794 = (local385 & 0xFF) * local272 & 0xFF00;
											local385 = (local778 | local786 | local794) >>> 8;
											local806 = local252[local64];
											local252[local64++] = ((local385 & 0xFF00FF) * local335 + (local806 & 0xFF00FF) * local343 & 0xFF00FF00) + ((local385 & 0xFF00) * local335 + (local806 & 0xFF00) * local343 & 0xFF0000) >> 8;
										}
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
							local564 = this.aByteArray13[(local14 >> 16) + local269];
							if (local564 == 0) {
								local64++;
							} else {
								local343 = this.anIntArray89[local564 & 0xFF];
								local346 = local252[local64];
								local361 = local343 + local346;
								local369 = (local343 & 0xFF00FF) + (local346 & 0xFF00FF);
								local346 = (local369 & 0x1000100) + (local361 - local369 & 0x10000);
								local252[local64++] = local361 - local346 | local346 - (local346 >>> 8);
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
					for (local335 = -arg3; local335 < 0; local335++) {
						local343 = (local16 >> 16) * super.anInt1936;
						for (local346 = -arg2; local346 < 0; local346++) {
							@Pc(1167) byte local1167 = this.aByteArray13[(local14 >> 16) + local343];
							if (local1167 == 0) {
								local64++;
							} else {
								local369 = this.anIntArray89[local1167 & 0xFF];
								local377 = (local369 & 0xFF0000) * local261 & 0xFF000000;
								local385 = (local369 & 0xFF00) * local269 & 0xFF0000;
								local778 = (local369 & 0xFF) * local272 & 0xFF00;
								@Pc(1208) int local1208 = (local377 | local385 | local778) >>> 8;
								local786 = local252[local64];
								local794 = local1208 + local786;
								local806 = (local1208 & 0xFF00FF) + (local786 & 0xFF00FF);
								@Pc(1234) int local1234 = (local806 & 0x1000100) + (local794 - local806 & 0x10000);
								local252[local64++] = local794 - local1234 | local1234 - (local1234 >>> 8);
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
						local252[local64++] = this.anIntArray89[this.aByteArray13[(local14 >> 16) + local269] & 0xFF];
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
				for (local335 = -arg3; local335 < 0; local335++) {
					local343 = (local16 >> 16) * super.anInt1936;
					for (local346 = -arg2; local346 < 0; local346++) {
						local361 = this.anIntArray89[this.aByteArray13[(local14 >> 16) + local343] & 0xFF];
						local369 = (local361 & 0xFF0000) * local258 & 0xFF000000;
						local377 = (local361 & 0xFF00) * local261 & 0xFF0000;
						local385 = (local361 & 0xFF) * local269 & 0xFF00;
						local252[local64++] = (local369 | local377 | local385) >>> 8;
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

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
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
		@Pc(459) int local459;
		@Pc(466) int local466;
		if (arg2 == 0) {
			for (local459 = -local32; local459 < 0; local459++) {
				local466 = local27 + local35 - 3;
				@Pc(473) byte local473;
				while (local27 < local466) {
					local473 = this.aByteArray13[local29++];
					if (local473 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray89[local473 & 0xFF];
					}
					local473 = this.aByteArray13[local29++];
					if (local473 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray89[local473 & 0xFF];
					}
					local473 = this.aByteArray13[local29++];
					if (local473 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray89[local473 & 0xFF];
					}
					local473 = this.aByteArray13[local29++];
					if (local473 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray89[local473 & 0xFF];
					}
				}
				local466 += 3;
				while (local27 < local466) {
					local473 = this.aByteArray13[local29++];
					if (local473 == 0) {
						local27++;
					} else {
						local160[local27++] = this.anIntArray89[local473 & 0xFF];
					}
				}
				local27 += local39;
				local29 += local41;
			}
			return;
		}
		@Pc(606) int local606;
		@Pc(610) int local610;
		@Pc(704) int local704;
		@Pc(626) int local626;
		if (arg2 == 1) {
			@Pc(630) int local630;
			if ((arg3 & 0xFFFFFF) == 16777215) {
				local459 = arg3 >>> 24;
				local466 = 256 - local459;
				for (local606 = -local32; local606 < 0; local606++) {
					for (local610 = -local35; local610 < 0; local610++) {
						@Pc(617) byte local617 = this.aByteArray13[local29++];
						if (local617 == 0) {
							local27++;
						} else {
							local626 = this.anIntArray89[local617 & 0xFF];
							local630 = local160[local27];
							local160[local27++] = ((local626 & 0xFF00FF) * local459 + (local630 & 0xFF00FF) * local466 & 0xFF00FF00) + ((local626 & 0xFF00) * local459 + (local630 & 0xFF00) * local466 & 0xFF0000) >> 8;
						}
					}
					local27 += local39;
					local29 += local41;
				}
			} else {
				local459 = arg3 >> 16 & 0xFF;
				local466 = arg3 >> 8 & 0xFF;
				local606 = arg3 & 0xFF;
				local610 = arg3 >>> 24;
				local704 = 256 - local610;
				for (local626 = -local32; local626 < 0; local626++) {
					for (local630 = -local35; local630 < 0; local630++) {
						@Pc(718) byte local718 = this.aByteArray13[local29++];
						if (local718 == 0) {
							local27++;
						} else {
							@Pc(727) int local727 = this.anIntArray89[local718 & 0xFF];
							@Pc(738) int local738;
							@Pc(746) int local746;
							@Pc(754) int local754;
							if (local610 == 255) {
								local738 = (local727 & 0xFF0000) * local459 & 0xFF000000;
								local746 = (local727 & 0xFF00) * local466 & 0xFF0000;
								local754 = (local727 & 0xFF) * local606 & 0xFF00;
								local160[local27++] = (local738 | local746 | local754) >>> 8;
							} else {
								local738 = (local727 & 0xFF0000) * local459 & 0xFF000000;
								local746 = (local727 & 0xFF00) * local466 & 0xFF0000;
								local754 = (local727 & 0xFF) * local606 & 0xFF00;
								local727 = (local738 | local746 | local754) >>> 8;
								@Pc(766) int local766 = local160[local27];
								local160[local27++] = ((local727 & 0xFF00FF) * local610 + (local766 & 0xFF00FF) * local704 & 0xFF00FF00) + ((local727 & 0xFF00) * local610 + (local766 & 0xFF00) * local704 & 0xFF0000) >> 8;
							}
						}
					}
					local27 += local39;
					local29 += local41;
				}
			}
		} else if (arg2 == 2) {
			local459 = arg3 >>> 24;
			local466 = 256 - local459;
			local606 = (arg3 & 0xFF00FF) * local466 & 0xFF00FF00;
			local610 = (arg3 & 0xFF00) * local466 & 0xFF0000;
			@Pc(885) int local885 = (local606 | local610) >>> 8;
			for (local704 = -local32; local704 < 0; local704++) {
				for (local626 = -local35; local626 < 0; local626++) {
					@Pc(899) byte local899 = this.aByteArray13[local29++];
					if (local899 == 0) {
						local27++;
					} else {
						@Pc(908) int local908 = this.anIntArray89[local899 & 0xFF];
						local606 = (local908 & 0xFF00FF) * local459 & 0xFF00FF00;
						local610 = (local908 & 0xFF00) * local459 & 0xFF0000;
						local160[local27++] = ((local606 | local610) >>> 8) + local885;
					}
				}
				local27 += local39;
				local29 += local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([I[III)V")
	@Override
	protected void method1989(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_5.anIntArray179;
		@Pc(186) int local186;
		@Pc(9) int local9;
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(29) int local29;
		@Pc(53) int local53;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(111) byte local111;
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
								local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray89[local111 & 0xFF];
								}
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
							@Pc(179) int local179;
							if ((local179 = local27 - (super.anInt1944 << 12)) >= 0) {
								local186 = (Static149.anInt1928 - local179) / Static149.anInt1928;
								local29 += local186;
								local27 += Static149.anInt1928 * local186;
								local23 += local186;
							}
							@Pc(207) int local207;
							if ((local207 = (local27 - Static149.anInt1928) / Static149.anInt1928) > local29) {
								local29 = local207;
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
								local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray89[local111 & 0xFF];
								}
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
								local186 = (Static149.anInt1928 - local27 - 1) / Static149.anInt1928;
								local29 += local186;
								local27 += Static149.anInt1928 * local186;
								local23 += local186;
							}
							@Pc(379) int local379;
							if ((local379 = (local27 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local29) {
								local29 = local379;
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
								local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray89[local111 & 0xFF];
								}
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
							@Pc(525) int local525;
							if ((local525 = local25 - (super.anInt1936 << 12)) >= 0) {
								local186 = (Static149.anInt1915 - local525) / Static149.anInt1915;
								local29 += local186;
								local25 += Static149.anInt1915 * local186;
								local23 += local186;
							}
							@Pc(553) int local553;
							if ((local553 = (local25 - Static149.anInt1915) / Static149.anInt1915) > local29) {
								local29 = local553;
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
								local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
								if (local111 == 0) {
									local23++;
								} else {
									local3[local23++] = this.anIntArray89[local111 & 0xFF];
								}
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
						@Pc(690) int local690;
						if ((local690 = local25 - (super.anInt1936 << 12)) >= 0) {
							local186 = (Static149.anInt1915 - local690) / Static149.anInt1915;
							local29 += local186;
							local25 += Static149.anInt1915 * local186;
							local27 += Static149.anInt1928 * local186;
							local23 += local186;
						}
						@Pc(724) int local724;
						if ((local724 = (local25 - Static149.anInt1915) / Static149.anInt1915) > local29) {
							local29 = local724;
						}
						@Pc(736) int local736;
						if ((local736 = local27 - (super.anInt1944 << 12)) >= 0) {
							local186 = (Static149.anInt1928 - local736) / Static149.anInt1928;
							local29 += local186;
							local25 += Static149.anInt1915 * local186;
							local27 += Static149.anInt1928 * local186;
							local23 += local186;
						}
						@Pc(770) int local770;
						if ((local770 = (local27 - Static149.anInt1928) / Static149.anInt1928) > local29) {
							local29 = local770;
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
							local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray89[local111 & 0xFF];
							}
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
						@Pc(913) int local913;
						if ((local913 = local25 - (super.anInt1936 << 12)) >= 0) {
							local186 = (Static149.anInt1915 - local913) / Static149.anInt1915;
							local29 += local186;
							local25 += Static149.anInt1915 * local186;
							local27 += Static149.anInt1928 * local186;
							local23 += local186;
						}
						@Pc(947) int local947;
						if ((local947 = (local25 - Static149.anInt1915) / Static149.anInt1915) > local29) {
							local29 = local947;
						}
						if (local27 < 0) {
							local186 = (Static149.anInt1928 - local27 - 1) / Static149.anInt1928;
							local29 += local186;
							local25 += Static149.anInt1915 * local186;
							local27 += Static149.anInt1928 * local186;
							local23 += local186;
						}
						@Pc(995) int local995;
						if ((local995 = (local27 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local29) {
							local29 = local995;
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
							local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray89[local111 & 0xFF];
							}
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
							local186 = (Static149.anInt1915 - local25 - 1) / Static149.anInt1915;
							local29 += local186;
							local25 += Static149.anInt1915 * local186;
							local23 += local186;
						}
						@Pc(1177) int local1177;
						if ((local1177 = (local25 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local29) {
							local29 = local1177;
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
							local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
							if (local111 == 0) {
								local23++;
							} else {
								local3[local23++] = this.anIntArray89[local111 & 0xFF];
							}
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
						local186 = (Static149.anInt1915 - local25 - 1) / Static149.anInt1915;
						local29 += local186;
						local25 += Static149.anInt1915 * local186;
						local27 += Static149.anInt1928 * local186;
						local23 += local186;
					}
					@Pc(1354) int local1354;
					if ((local1354 = (local25 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local29) {
						local29 = local1354;
					}
					@Pc(1366) int local1366;
					if ((local1366 = local27 - (super.anInt1944 << 12)) >= 0) {
						local186 = (Static149.anInt1928 - local1366) / Static149.anInt1928;
						local29 += local186;
						local25 += Static149.anInt1915 * local186;
						local27 += Static149.anInt1928 * local186;
						local23 += local186;
					}
					@Pc(1400) int local1400;
					if ((local1400 = (local27 - Static149.anInt1928) / Static149.anInt1928) > local29) {
						local29 = local1400;
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
						local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray89[local111 & 0xFF];
						}
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
						local186 = (Static149.anInt1915 - local25 - 1) / Static149.anInt1915;
						local29 += local186;
						local25 += Static149.anInt1915 * local186;
						local27 += Static149.anInt1928 * local186;
						local23 += local186;
					}
					@Pc(1579) int local1579;
					if ((local1579 = (local25 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local29) {
						local29 = local1579;
					}
					if (local27 < 0) {
						local186 = (Static149.anInt1928 - local27 - 1) / Static149.anInt1928;
						local29 += local186;
						local25 += Static149.anInt1915 * local186;
						local27 += Static149.anInt1928 * local186;
						local23 += local186;
					}
					@Pc(1627) int local1627;
					if ((local1627 = (local27 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local29) {
						local29 = local1627;
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
						local111 = this.aByteArray13[(local27 >> 12) * super.anInt1936 + (local25 >> 12)];
						if (local111 == 0) {
							local23++;
						} else {
							local3[local23++] = this.anIntArray89[local111 & 0xFF];
						}
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

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
	@Override
	protected void method1991(@OriginalArg(0) int arg0) {
		@Pc(3) int[] local3 = super.aClass19_Sub2_5.anIntArray179;
		@Pc(691) int local691;
		@Pc(9) int local9;
		@Pc(12) int local12;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(176) byte local176;
		@Pc(205) int local205;
		@Pc(214) int local214;
		@Pc(218) int local218;
		@Pc(222) int local222;
		@Pc(294) int local294;
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
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local3[local51] = this.anIntArray89[local176 & 0xFF];
								}
							} else if (arg0 == 1) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
										local214 = Static149.anInt1920 >>> 24;
										local218 = 256 - local214;
										local222 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
									} else if (Static149.anInt1925 == 255) {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local3[local51] = (local214 | local218 | local222) >>> 8;
									} else {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local205 = (local214 | local218 | local222) >>> 8;
										local294 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
									local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
									local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
								}
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
						@Pc(684) int local684;
						if ((local684 = local16 - (super.anInt1944 << 12)) >= 0) {
							local691 = (Static149.anInt1928 - local684) / Static149.anInt1928;
							local18 += local691;
							local16 += Static149.anInt1928 * local691;
							local12 += local691;
						}
						@Pc(712) int local712;
						if ((local712 = (local16 - Static149.anInt1928) / Static149.anInt1928) > local18) {
							local18 = local712;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local3[local51] = this.anIntArray89[local176 & 0xFF];
								}
							} else if (arg0 == 1) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
										local214 = Static149.anInt1920 >>> 24;
										local218 = 256 - local214;
										local222 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
									} else if (Static149.anInt1925 == 255) {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local3[local51] = (local214 | local218 | local222) >>> 8;
									} else {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local205 = (local214 | local218 | local222) >>> 8;
										local294 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
									local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
									local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
								}
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
							local691 = (Static149.anInt1928 - local16 - 1) / Static149.anInt1928;
							local18 += local691;
							local16 += Static149.anInt1928 * local691;
							local12 += local691;
						}
						@Pc(1400) int local1400;
						if ((local1400 = (local16 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local18) {
							local18 = local1400;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local3[local51] = this.anIntArray89[local176 & 0xFF];
								}
							} else if (arg0 == 1) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
										local214 = Static149.anInt1920 >>> 24;
										local218 = 256 - local214;
										local222 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
									} else if (Static149.anInt1925 == 255) {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local3[local51] = (local214 | local218 | local222) >>> 8;
									} else {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local205 = (local214 | local218 | local222) >>> 8;
										local294 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
									local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
									local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
								}
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
						@Pc(2062) int local2062;
						if ((local2062 = local14 - (super.anInt1936 << 12)) >= 0) {
							local691 = (Static149.anInt1915 - local2062) / Static149.anInt1915;
							local18 += local691;
							local14 += Static149.anInt1915 * local691;
							local12 += local691;
						}
						@Pc(2090) int local2090;
						if ((local2090 = (local14 - Static149.anInt1915) / Static149.anInt1915) > local18) {
							local18 = local2090;
						}
						while (local18 < 0) {
							local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
							local51 = local12++;
							if (arg0 == 0) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local3[local51] = this.anIntArray89[local176 & 0xFF];
								}
							} else if (arg0 == 1) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
										local214 = Static149.anInt1920 >>> 24;
										local218 = 256 - local214;
										local222 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
									} else if (Static149.anInt1925 == 255) {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local3[local51] = (local214 | local218 | local222) >>> 8;
									} else {
										local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
										local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
										local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
										local205 = (local214 | local218 | local222) >>> 8;
										local294 = local3[local51];
										local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
									}
								}
							} else if (arg0 == 2) {
								local176 = this.aByteArray13[local48];
								if (local176 != 0) {
									local205 = this.anIntArray89[local176 & 0xFF];
									local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
									local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
									local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
								}
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
					@Pc(2743) int local2743;
					if ((local2743 = local14 - (super.anInt1936 << 12)) >= 0) {
						local691 = (Static149.anInt1915 - local2743) / Static149.anInt1915;
						local18 += local691;
						local14 += Static149.anInt1915 * local691;
						local16 += Static149.anInt1928 * local691;
						local12 += local691;
					}
					@Pc(2777) int local2777;
					if ((local2777 = (local14 - Static149.anInt1915) / Static149.anInt1915) > local18) {
						local18 = local2777;
					}
					@Pc(2789) int local2789;
					if ((local2789 = local16 - (super.anInt1944 << 12)) >= 0) {
						local691 = (Static149.anInt1928 - local2789) / Static149.anInt1928;
						local18 += local691;
						local14 += Static149.anInt1915 * local691;
						local16 += Static149.anInt1928 * local691;
						local12 += local691;
					}
					@Pc(2823) int local2823;
					if ((local2823 = (local16 - Static149.anInt1928) / Static149.anInt1928) > local18) {
						local18 = local2823;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local3[local51] = this.anIntArray89[local176 & 0xFF];
							}
						} else if (arg0 == 1) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local205 = this.anIntArray89[local176 & 0xFF];
								if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
									local214 = Static149.anInt1920 >>> 24;
									local218 = 256 - local214;
									local222 = local3[local51];
									local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
								} else if (Static149.anInt1925 == 255) {
									local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local3[local51] = (local214 | local218 | local222) >>> 8;
								} else {
									local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local205 = (local214 | local218 | local222) >>> 8;
									local294 = local3[local51];
									local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 2) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local205 = this.anIntArray89[local176 & 0xFF];
								local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
								local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
								local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
							}
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
					@Pc(3482) int local3482;
					if ((local3482 = local14 - (super.anInt1936 << 12)) >= 0) {
						local691 = (Static149.anInt1915 - local3482) / Static149.anInt1915;
						local18 += local691;
						local14 += Static149.anInt1915 * local691;
						local16 += Static149.anInt1928 * local691;
						local12 += local691;
					}
					@Pc(3516) int local3516;
					if ((local3516 = (local14 - Static149.anInt1915) / Static149.anInt1915) > local18) {
						local18 = local3516;
					}
					if (local16 < 0) {
						local691 = (Static149.anInt1928 - local16 - 1) / Static149.anInt1928;
						local18 += local691;
						local14 += Static149.anInt1915 * local691;
						local16 += Static149.anInt1928 * local691;
						local12 += local691;
					}
					@Pc(3564) int local3564;
					if ((local3564 = (local16 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local18) {
						local18 = local3564;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local3[local51] = this.anIntArray89[local176 & 0xFF];
							}
						} else if (arg0 == 1) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local205 = this.anIntArray89[local176 & 0xFF];
								if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
									local214 = Static149.anInt1920 >>> 24;
									local218 = 256 - local214;
									local222 = local3[local51];
									local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
								} else if (Static149.anInt1925 == 255) {
									local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local3[local51] = (local214 | local218 | local222) >>> 8;
								} else {
									local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local205 = (local214 | local218 | local222) >>> 8;
									local294 = local3[local51];
									local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 2) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local205 = this.anIntArray89[local176 & 0xFF];
								local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
								local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
								local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
							}
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
						local691 = (Static149.anInt1915 - local14 - 1) / Static149.anInt1915;
						local18 += local691;
						local14 += Static149.anInt1915 * local691;
						local12 += local691;
					}
					@Pc(4262) int local4262;
					if ((local4262 = (local14 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local18) {
						local18 = local4262;
					}
					while (local18 < 0) {
						local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
						local51 = local12++;
						if (arg0 == 0) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local3[local51] = this.anIntArray89[local176 & 0xFF];
							}
						} else if (arg0 == 1) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local205 = this.anIntArray89[local176 & 0xFF];
								if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
									local214 = Static149.anInt1920 >>> 24;
									local218 = 256 - local214;
									local222 = local3[local51];
									local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
								} else if (Static149.anInt1925 == 255) {
									local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local3[local51] = (local214 | local218 | local222) >>> 8;
								} else {
									local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
									local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
									local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
									local205 = (local214 | local218 | local222) >>> 8;
									local294 = local3[local51];
									local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
								}
							}
						} else if (arg0 == 2) {
							local176 = this.aByteArray13[local48];
							if (local176 != 0) {
								local205 = this.anIntArray89[local176 & 0xFF];
								local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
								local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
								local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
							}
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
					local691 = (Static149.anInt1915 - local14 - 1) / Static149.anInt1915;
					local18 += local691;
					local14 += Static149.anInt1915 * local691;
					local16 += Static149.anInt1928 * local691;
					local12 += local691;
				}
				@Pc(4955) int local4955;
				if ((local4955 = (local14 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local18) {
					local18 = local4955;
				}
				@Pc(4967) int local4967;
				if ((local4967 = local16 - (super.anInt1944 << 12)) >= 0) {
					local691 = (Static149.anInt1928 - local4967) / Static149.anInt1928;
					local18 += local691;
					local14 += Static149.anInt1915 * local691;
					local16 += Static149.anInt1928 * local691;
					local12 += local691;
				}
				@Pc(5001) int local5001;
				if ((local5001 = (local16 - Static149.anInt1928) / Static149.anInt1928) > local18) {
					local18 = local5001;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 0) {
						local176 = this.aByteArray13[local48];
						if (local176 != 0) {
							local3[local51] = this.anIntArray89[local176 & 0xFF];
						}
					} else if (arg0 == 1) {
						local176 = this.aByteArray13[local48];
						if (local176 != 0) {
							local205 = this.anIntArray89[local176 & 0xFF];
							if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
								local214 = Static149.anInt1920 >>> 24;
								local218 = 256 - local214;
								local222 = local3[local51];
								local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
							} else if (Static149.anInt1925 == 255) {
								local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local3[local51] = (local214 | local218 | local222) >>> 8;
							} else {
								local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local205 = (local214 | local218 | local222) >>> 8;
								local294 = local3[local51];
								local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 2) {
						local176 = this.aByteArray13[local48];
						if (local176 != 0) {
							local205 = this.anIntArray89[local176 & 0xFF];
							local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
							local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
							local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
						}
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
					local691 = (Static149.anInt1915 - local14 - 1) / Static149.anInt1915;
					local18 += local691;
					local14 += Static149.anInt1915 * local691;
					local16 += Static149.anInt1928 * local691;
					local12 += local691;
				}
				@Pc(5696) int local5696;
				if ((local5696 = (local14 + 1 - (super.anInt1936 << 12) - Static149.anInt1915) / Static149.anInt1915) > local18) {
					local18 = local5696;
				}
				if (local16 < 0) {
					local691 = (Static149.anInt1928 - local16 - 1) / Static149.anInt1928;
					local18 += local691;
					local14 += Static149.anInt1915 * local691;
					local16 += Static149.anInt1928 * local691;
					local12 += local691;
				}
				@Pc(5744) int local5744;
				if ((local5744 = (local16 + 1 - (super.anInt1944 << 12) - Static149.anInt1928) / Static149.anInt1928) > local18) {
					local18 = local5744;
				}
				while (local18 < 0) {
					local48 = (local16 >> 12) * super.anInt1936 + (local14 >> 12);
					local51 = local12++;
					if (arg0 == 0) {
						local176 = this.aByteArray13[local48];
						if (local176 != 0) {
							local3[local51] = this.anIntArray89[local176 & 0xFF];
						}
					} else if (arg0 == 1) {
						local176 = this.aByteArray13[local48];
						if (local176 != 0) {
							local205 = this.anIntArray89[local176 & 0xFF];
							if ((Static149.anInt1920 & 0xFFFFFF) == 16777215) {
								local214 = Static149.anInt1920 >>> 24;
								local218 = 256 - local214;
								local222 = local3[local51];
								local3[local51] = ((local205 & 0xFF00FF) * local214 + (local222 & 0xFF00FF) * local218 & 0xFF00FF00) + ((local205 & 0xFF00) * local214 + (local222 & 0xFF00) * local218 & 0xFF0000) >> 8;
							} else if (Static149.anInt1925 == 255) {
								local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local3[local51] = (local214 | local218 | local222) >>> 8;
							} else {
								local214 = (local205 & 0xFF0000) * Static149.anInt1923 & 0xFF000000;
								local218 = (local205 & 0xFF00) * Static149.anInt1941 & 0xFF0000;
								local222 = (local205 & 0xFF) * Static149.anInt1922 & 0xFF00;
								local205 = (local214 | local218 | local222) >>> 8;
								local294 = local3[local51];
								local3[local51] = ((local205 & 0xFF00FF) * Static149.anInt1925 + (local294 & 0xFF00FF) * Static149.anInt1942 & 0xFF00FF00) + ((local205 & 0xFF00) * Static149.anInt1925 + (local294 & 0xFF00) * Static149.anInt1942 & 0xFF0000) >> 8;
							}
						}
					} else if (arg0 == 2) {
						local176 = this.aByteArray13[local48];
						if (local176 != 0) {
							local205 = this.anIntArray89[local176 & 0xFF];
							local214 = (local205 & 0xFF00FF) * Static149.anInt1925 & 0xFF00FF00;
							local218 = (local205 & 0xFF00) * Static149.anInt1925 & 0xFF0000;
							local3[local51++] = ((local214 | local218) >>> 8) + Static149.anInt1940;
						}
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

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
	@Override
	public void method6392(@OriginalArg(2) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!kf;II)V")
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
				@Pc(311) byte local311 = this.aByteArray13[local19++];
				if (local311 == 0) {
					local41++;
				} else {
					local169[local41++] = this.anIntArray89[local311 & 0xFF];
				}
			}
			local19 += local236 + local35;
			local41 += local236 + local33;
		}
	}
}
