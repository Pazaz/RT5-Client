import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_235 = new Class82(8);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray267 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "[I")
	public static final int[] anIntArray891 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V")
	public static void method9459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static180.anInt2995 <= arg5 && arg1 <= Static111.anInt2219 && Static724.anInt10930 <= arg3 && arg4 <= Static273.anInt4395) {
			Static446.method6094(arg4, arg1, arg2, arg0, arg5, arg6, arg3);
		} else {
			Static547.method7252(arg4, arg5, arg2, arg3, arg1, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIBIIIIII)Z")
	public static boolean method9460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 > 2000 || arg6 > 2000 || arg4 > 2000 || arg0 > 2000 || arg8 > 2000 || arg5 > 2000) {
			return false;
		} else if (arg1 >= -2000 && arg6 >= -2000 && arg4 >= -2000 && arg0 >= -2000 && arg8 >= -2000 && arg5 >= -2000) {
			@Pc(88) int local88;
			if (Static254.anInt4115 == 2) {
				local88 = Static228.anInt3709 * arg1 + arg0;
				if (local88 >= 0 && local88 < Static485.anIntArray886.length && Static485.anIntArray886[local88] > (arg7 << 8) - 38400) {
					return false;
				}
				local88 = Static228.anInt3709 * arg6 + arg8;
				if (local88 >= 0 && Static485.anIntArray886.length > local88 && (arg3 << 8) - 38400 < Static485.anIntArray886[local88]) {
					return false;
				}
				local88 = arg4 * Static228.anInt3709 + arg5;
				if (local88 >= 0 && Static485.anIntArray886.length > local88 && (arg2 << 8) - 38400 < Static485.anIntArray886[local88]) {
					return false;
				}
			}
			local88 = arg8 - arg0;
			@Pc(191) int local191 = arg6 - arg1;
			@Pc(196) int local196 = arg5 - arg0;
			@Pc(201) int local201 = arg4 - arg1;
			@Pc(206) int local206 = arg3 - arg7;
			if (arg6 > arg1 && arg4 > arg4) {
				if (arg6 <= arg4) {
					arg4++;
				} else {
					arg6++;
				}
				arg1--;
			} else if (arg4 <= arg6) {
				if (arg6 < arg1) {
					arg1++;
				} else {
					arg6++;
				}
				arg4--;
			} else {
				if (arg1 <= arg4) {
					arg4++;
				} else {
					arg1++;
				}
				arg6--;
			}
			@Pc(272) int local272 = arg2 - arg7;
			@Pc(274) int local274 = 0;
			if (arg1 != arg6) {
				local274 = (arg8 - arg0 << 12) / (arg6 - arg1);
			}
			@Pc(291) int local291 = 0;
			if (arg4 != arg6) {
				local291 = (arg5 - arg8 << 12) / (arg4 - arg6);
			}
			@Pc(312) int local312 = 0;
			if (arg4 != arg1) {
				local312 = (arg0 - arg5 << 12) / (arg1 - arg4);
			}
			@Pc(352) int local352 = local201 * local88 - local191 * local196;
			if (local352 == 0) {
				return false;
			}
			@Pc(369) int local369 = (local201 * local206 - local272 * local191 << 8) / local352;
			@Pc(381) int local381 = (local272 * local88 - local206 * local196 << 8) / local352;
			if (arg1 <= arg6 && arg4 >= arg1) {
				if (Static624.anInt9461 <= arg1) {
					return true;
				}
				if (arg4 > Static624.anInt9461) {
					arg4 = Static624.anInt9461;
				}
				arg7 = local369 + (arg7 << 8) - local369 * arg0;
				if (Static624.anInt9461 < arg6) {
					arg6 = Static624.anInt9461;
				}
				if (arg4 > arg6) {
					arg5 = arg0 <<= 0xC;
					arg8 <<= 0xC;
					if (arg1 < 0) {
						arg7 -= arg1 * local381;
						arg0 -= local274 * arg1;
						arg5 -= arg1 * local312;
						arg1 = 0;
					}
					if (arg6 < 0) {
						arg8 -= arg6 * local291;
						arg6 = 0;
					}
					if ((arg1 == arg6 || local274 <= local312) && (arg1 != arg6 || local312 <= local291)) {
						arg4 -= arg6;
						arg6 -= arg1;
						arg1 *= Static228.anInt3709;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static34.method885((arg8 >> 12) - 1, (arg5 >> 12) + 1, arg7, Static485.anIntArray886, local369, arg1)) {
										return false;
									}
									arg5 += local312;
									arg7 += local381;
									arg1 += Static228.anInt3709;
									arg8 += local291;
								}
							}
							if (!Static34.method885((arg0 >> 12) - 1, (arg5 >> 12) + 1, arg7, Static485.anIntArray886, local369, arg1)) {
								return false;
							}
							arg7 += local381;
							arg1 += Static228.anInt3709;
							arg0 += local274;
							arg5 += local312;
						}
					} else {
						arg4 -= arg6;
						arg6 -= arg1;
						arg1 = Static228.anInt3709 * arg1;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static34.method885((arg5 >> 12) - 1, (arg8 >> 12) + 1, arg7, Static485.anIntArray886, local369, arg1)) {
										return false;
									}
									arg5 += local312;
									arg8 += local291;
									arg7 += local381;
									arg1 += Static228.anInt3709;
								}
							}
							if (!Static34.method885((arg5 >> 12) - 1, (arg0 >> 12) + 1, arg7, Static485.anIntArray886, local369, arg1)) {
								return false;
							}
							arg0 += local274;
							arg7 += local381;
							arg1 += Static228.anInt3709;
							arg5 += local312;
						}
					}
				} else {
					arg8 = arg0 <<= 0xC;
					arg5 <<= 0xC;
					if (arg1 < 0) {
						arg7 -= arg1 * local381;
						arg0 -= arg1 * local274;
						arg8 -= local312 * arg1;
						arg1 = 0;
					}
					if (arg4 < 0) {
						arg5 -= arg4 * local291;
						arg4 = 0;
					}
					if (arg1 != arg4 && local312 < local274 || arg1 == arg4 && local291 > local274) {
						arg6 -= arg4;
						arg4 -= arg1;
						arg1 = Static228.anInt3709 * arg1;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static34.method885((arg5 >> 12) - 1, (arg0 >> 12) + 1, arg7, Static485.anIntArray886, local369, arg1)) {
										return false;
									}
									arg5 += local291;
									arg0 += local274;
									arg7 += local381;
									arg1 += Static228.anInt3709;
								}
							}
							if (!Static34.method885((arg8 >> 12) - 1, (arg0 >> 12) + 1, arg7, Static485.anIntArray886, local369, arg1)) {
								return false;
							}
							arg0 += local274;
							arg7 += local381;
							arg8 += local312;
							arg1 += Static228.anInt3709;
						}
					} else {
						arg6 -= arg4;
						arg4 -= arg1;
						arg1 = Static228.anInt3709 * arg1;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static34.method885((arg0 >> 12) - 1, (arg5 >> 12) + 1, arg7, Static485.anIntArray886, local369, arg1)) {
										return false;
									}
									arg7 += local381;
									arg0 += local274;
									arg1 += Static228.anInt3709;
									arg5 += local291;
								}
							}
							if (!Static34.method885((arg0 >> 12) - 1, (arg8 >> 12) - -1, arg7, Static485.anIntArray886, local369, arg1)) {
								return false;
							}
							arg0 += local274;
							arg1 += Static228.anInt3709;
							arg8 += local312;
							arg7 += local381;
						}
					}
				}
			} else if (arg4 < arg6) {
				if (Static624.anInt9461 <= arg4) {
					return true;
				}
				if (Static624.anInt9461 < arg1) {
					arg1 = Static624.anInt9461;
				}
				if (arg6 > Static624.anInt9461) {
					arg6 = Static624.anInt9461;
				}
				arg2 = local369 + (arg2 << 8) - arg5 * local369;
				if (arg6 > arg1) {
					arg8 = arg5 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= local312 * arg4;
						arg8 -= arg4 * local291;
						arg2 -= arg4 * local381;
						arg4 = 0;
					}
					arg0 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local274;
						arg1 = 0;
					}
					if (local312 <= local291) {
						arg6 -= arg1;
						arg1 -= arg4;
						arg4 *= Static228.anInt3709;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static34.method885((arg0 >> 12) - 1, (arg8 >> 12) + 1, arg2, Static485.anIntArray886, local369, arg4)) {
										return false;
									}
									arg2 += local381;
									arg8 += local291;
									arg4 += Static228.anInt3709;
									arg0 += local274;
								}
							}
							if (!Static34.method885((arg5 >> 12) - 1, (arg8 >> 12) + 1, arg2, Static485.anIntArray886, local369, arg4)) {
								return false;
							}
							arg4 += Static228.anInt3709;
							arg5 += local312;
							arg2 += local381;
							arg8 += local291;
						}
					} else {
						arg6 -= arg1;
						arg1 -= arg4;
						arg4 *= Static228.anInt3709;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static34.method885((arg8 >> 12) - 1, (arg0 >> 12) + 1, arg2, Static485.anIntArray886, local369, arg4)) {
										return false;
									}
									arg2 += local381;
									arg8 += local291;
									arg0 += local274;
									arg4 += Static228.anInt3709;
								}
							}
							if (!Static34.method885((arg8 >> 12) - 1, (arg5 >> 12) + 1, arg2, Static485.anIntArray886, local369, arg4)) {
								return false;
							}
							arg5 += local312;
							arg4 += Static228.anInt3709;
							arg2 += local381;
							arg8 += local291;
						}
					}
				} else {
					arg0 = arg5 <<= 0xC;
					if (arg4 < 0) {
						arg0 -= local291 * arg4;
						arg2 -= local381 * arg4;
						arg5 -= local312 * arg4;
						arg4 = 0;
					}
					arg8 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= local274 * arg6;
						arg6 = 0;
					}
					if (local312 <= local291) {
						arg1 -= arg6;
						arg6 -= arg4;
						arg4 = Static228.anInt3709 * arg4;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static34.method885((arg5 >> 12) - 1, (arg8 >> 12) - -1, arg2, Static485.anIntArray886, local369, arg4)) {
										return false;
									}
									arg8 += local274;
									arg4 += Static228.anInt3709;
									arg5 += local312;
									arg2 += local381;
								}
							}
							if (!Static34.method885((arg5 >> 12) - 1, (arg0 >> 12) + 1, arg2, Static485.anIntArray886, local369, arg4)) {
								return false;
							}
							arg0 += local291;
							arg4 += Static228.anInt3709;
							arg2 += local381;
							arg5 += local312;
						}
					} else {
						arg1 -= arg6;
						arg6 -= arg4;
						arg4 *= Static228.anInt3709;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static34.method885((arg8 >> 12) - 1, (arg5 >> 12) + 1, arg2, Static485.anIntArray886, local369, arg4)) {
										return false;
									}
									arg2 += local381;
									arg4 += Static228.anInt3709;
									arg5 += local312;
									arg8 += local274;
								}
							}
							if (!Static34.method885((arg0 >> 12) - 1, (arg5 >> 12) + 1, arg2, Static485.anIntArray886, local369, arg4)) {
								return false;
							}
							arg2 += local381;
							arg0 += local291;
							arg5 += local312;
							arg4 += Static228.anInt3709;
						}
					}
				}
			} else if (Static624.anInt9461 <= arg6) {
				return true;
			} else {
				if (Static624.anInt9461 < arg4) {
					arg4 = Static624.anInt9461;
				}
				if (arg1 > Static624.anInt9461) {
					arg1 = Static624.anInt9461;
				}
				arg3 = (arg3 << 8) - (arg8 * local369 - local369);
				if (arg4 >= arg1) {
					arg5 = arg8 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= arg6 * local291;
						arg3 -= local381 * arg6;
						arg5 -= local274 * arg6;
						arg6 = 0;
					}
					arg0 <<= 0xC;
					if (arg1 < 0) {
						arg0 -= arg1 * local312;
						arg1 = 0;
					}
					if (local291 > local274) {
						arg4 -= arg1;
						arg1 -= arg6;
						arg6 = Static228.anInt3709 * arg6;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static34.method885((arg0 >> 12) - 1, (arg8 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
										return false;
									}
									arg8 += local291;
									arg0 += local312;
									arg3 += local381;
									arg6 += Static228.anInt3709;
								}
							}
							if (!Static34.method885((arg5 >> 12) - 1, (arg8 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
								return false;
							}
							arg8 += local291;
							arg6 += Static228.anInt3709;
							arg3 += local381;
							arg5 += local274;
						}
					} else {
						arg4 -= arg1;
						arg1 -= arg6;
						arg6 *= Static228.anInt3709;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg4--;
									if (arg4 < 0) {
										return true;
									}
									if (!Static34.method885((arg8 >> 12) - 1, (arg0 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
										return false;
									}
									arg8 += local291;
									arg0 += local312;
									arg6 += Static228.anInt3709;
									arg3 += local381;
								}
							}
							if (!Static34.method885((arg8 >> 12) - 1, (arg5 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
								return false;
							}
							arg6 += Static228.anInt3709;
							arg5 += local274;
							arg3 += local381;
							arg8 += local291;
						}
					}
				} else {
					arg0 = arg8 <<= 0xC;
					if (arg6 < 0) {
						arg3 -= local381 * arg6;
						arg8 -= arg6 * local291;
						arg0 -= arg6 * local274;
						arg6 = 0;
					}
					arg5 <<= 0xC;
					if (arg4 < 0) {
						arg5 -= local312 * arg4;
						arg4 = 0;
					}
					if (arg6 != arg4 && local291 > local274 || arg4 == arg6 && local312 < local274) {
						arg1 -= arg4;
						arg4 -= arg6;
						arg6 = Static228.anInt3709 * arg6;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static34.method885((arg0 >> 12) - 1, (arg5 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
										return false;
									}
									arg0 += local274;
									arg3 += local381;
									arg6 += Static228.anInt3709;
									arg5 += local312;
								}
							}
							if (!Static34.method885((arg0 >> 12) - 1, (arg8 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
								return false;
							}
							arg0 += local274;
							arg3 += local381;
							arg6 += Static228.anInt3709;
							arg8 += local291;
						}
					} else {
						arg1 -= arg4;
						arg4 -= arg6;
						arg6 *= Static228.anInt3709;
						while (true) {
							arg4--;
							if (arg4 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static34.method885((arg5 >> 12) - 1, (arg0 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
										return false;
									}
									arg3 += local381;
									arg6 += Static228.anInt3709;
									arg0 += local274;
									arg5 += local312;
								}
							}
							if (!Static34.method885((arg8 >> 12) - 1, (arg0 >> 12) + 1, arg3, Static485.anIntArray886, local369, arg6)) {
								return false;
							}
							arg3 += local381;
							arg0 += local274;
							arg6 += Static228.anInt3709;
							arg8 += local291;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}
