import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class201 {

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
	private int anInt5007;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "[Lclient!bs;")
	private Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "Z")
	public boolean aBoolean385;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public int anInt5012 = -1;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	private void method4543() {
		@Pc(5) long[] local5 = Class2_Sub2_Sub14.aLongArray21;
		this.aLong160 = -1L;
		this.aLong160 = local5[(int) ((this.aLong160 ^ (long) (this.anInt5007 >> 8)) & 0xFFL)] ^ this.aLong160 >>> 8;
		this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) (((long) this.anInt5007 ^ this.aLong160) & 0xFFL)];
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray381.length; local56++) {
			this.aLong160 = local5[(int) ((this.aLong160 ^ (long) (this.anIntArray381[local56] >> 24)) & 0xFFL)] ^ this.aLong160 >>> 8;
			this.aLong160 = local5[(int) (((long) (this.anIntArray381[local56] >> 16) ^ this.aLong160) & 0xFFL)] ^ this.aLong160 >>> 8;
			this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) ((this.aLong160 ^ (long) (this.anIntArray381[local56] >> 8)) & 0xFFL)];
			this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) ((this.aLong160 ^ (long) this.anIntArray381[local56]) & 0xFFL)];
		}
		@Pc(156) int local156;
		if (this.aClass52Array1 != null) {
			for (local156 = 0; local156 < this.aClass52Array1.length; local156++) {
				if (this.aClass52Array1[local156] != null) {
					@Pc(179) int[] local179;
					@Pc(173) int[] local173;
					if (this.aBoolean385) {
						local173 = this.aClass52Array1[local156].anIntArray100;
						local179 = this.aClass52Array1[local156].anIntArray99;
					} else {
						local173 = this.aClass52Array1[local156].anIntArray98;
						local179 = this.aClass52Array1[local156].anIntArray97;
					}
					@Pc(196) int local196;
					if (local179 != null) {
						for (local196 = 0; local196 < local179.length; local196++) {
							this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) (((long) (local179[local196] >> 8) ^ this.aLong160) & 0xFFL)];
							this.aLong160 = local5[(int) (((long) local179[local196] ^ this.aLong160) & 0xFFL)] ^ this.aLong160 >>> 8;
						}
					}
					if (local173 != null) {
						for (local196 = 0; local196 < local173.length; local196++) {
							this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) ((this.aLong160 ^ (long) (local173[local196] >> 8)) & 0xFFL)];
							this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) ((this.aLong160 ^ (long) local173[local196]) & 0xFFL)];
						}
					}
					if (this.aClass52Array1[local156].aShortArray11 != null) {
						for (local196 = 0; local196 < this.aClass52Array1[local156].aShortArray11.length; local196++) {
							this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) (((long) (this.aClass52Array1[local156].aShortArray11[local196] >> 8) ^ this.aLong160) & 0xFFL)];
							this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) (((long) this.aClass52Array1[local156].aShortArray11[local196] ^ this.aLong160) & 0xFFL)];
						}
					}
					if (this.aClass52Array1[local156].aShortArray10 != null) {
						for (local196 = 0; local196 < this.aClass52Array1[local156].aShortArray10.length; local196++) {
							this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) ((this.aLong160 ^ (long) (this.aClass52Array1[local156].aShortArray10[local196] >> 8)) & 0xFFL)];
							this.aLong160 = local5[(int) (((long) this.aClass52Array1[local156].aShortArray10[local196] ^ this.aLong160) & 0xFFL)] ^ this.aLong160 >>> 8;
						}
					}
				}
			}
		}
		for (local156 = 0; local156 < 10; local156++) {
			this.aLong160 = this.aLong160 >>> 8 ^ local5[(int) (((long) this.anIntArray380[local156] ^ this.aLong160) & 0xFFL)];
		}
		this.aLong160 = local5[(int) (((long) (this.aBoolean385 ? 1 : 0) ^ this.aLong160) & 0xFFL)] ^ this.aLong160 >>> 8;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([I[I[Lclient!bs;IIZB)V")
	public void method4545(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class52[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass52Array1 = arg2;
		this.anIntArray380 = arg0;
		this.aBoolean385 = arg5;
		if (this.anInt5007 != arg4) {
			this.anInt5007 = arg4;
		}
		this.anIntArray381 = arg1;
		this.anInt5012 = arg3;
		this.method4543();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!es;Lclient!gu;IZLclient!qp;Lclient!bp;I[ILclient!vl;Lclient!kr;Lclient!ha;Lclient!ql;[Lclient!gu;ILclient!gu;Lclient!uk;)Lclient!ka;")
	public Class114 method4546(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(4) Class310 arg2, @OriginalArg(5) Class50 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) Class388 arg6, @OriginalArg(9) Class215 arg7, @OriginalArg(10) Class19 arg8, @OriginalArg(11) Class308 arg9, @OriginalArg(12) Class152[] arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Class152 arg12, @OriginalArg(15) Interface23 arg13) {
		if (this.anInt5012 != -1) {
			return arg9.method7092(this.anInt5012).method5993(arg13, arg8, arg2, arg1, arg11, arg5, (Class386) null, arg12, arg4, arg10);
		}
		@Pc(28) int local28 = arg4;
		@Pc(31) long local31 = this.aLong160;
		@Pc(34) int[] local34 = this.anIntArray381;
		@Pc(36) boolean local36 = false;
		@Pc(44) boolean local44 = false;
		@Pc(72) int local72;
		@Pc(116) int local116;
		if (arg1 != null) {
			@Pc(50) Class69 local50 = arg1.method9107();
			if (local50 != null && (local50.anInt1652 >= 0 || local50.anInt1651 >= 0)) {
				local34 = new int[this.anIntArray381.length];
				for (local72 = 0; local72 < local34.length; local72++) {
					local34[local72] = this.anIntArray381[local72];
				}
				if (local50.anInt1652 >= 0 && arg6.anInt10301 != -1) {
					if (local50.anInt1652 == 65535) {
						local34[arg6.anInt10301] = 0;
						for (local116 = 0; local116 < arg6.anIntArray818.length; local116++) {
							local34[arg6.anIntArray818[local116]] = 0;
						}
						local31 ^= 0xFFFFFFFF00000000L;
					} else {
						local34[arg6.anInt10301] = local50.anInt1652 | 0x40000000;
						for (local116 = 0; local116 < arg6.anIntArray818.length; local116++) {
							local34[arg6.anIntArray818[local116]] = 0;
						}
						local31 ^= (long) local34[arg6.anInt10301] << 32;
					}
					local36 = true;
				}
				if (local50.anInt1651 >= 0 && arg6.anInt10300 != -1) {
					local44 = true;
					if (local50.anInt1651 == 65535) {
						local34[arg6.anInt10300] = 0;
						for (local116 = 0; local116 < arg6.anIntArray820.length; local116++) {
							local34[arg6.anIntArray820[local116]] = 0;
						}
						local31 ^= 0xFFFFFFFFL;
					} else {
						local34[arg6.anInt10300] = local50.anInt1651 | 0x40000000;
						for (local116 = 0; local116 < arg6.anIntArray820.length; local116++) {
							local34[arg6.anIntArray820[local116]] = 0;
						}
						local31 ^= (long) local34[arg6.anInt10300];
					}
				}
			}
		}
		@Pc(257) boolean local257 = false;
		local72 = arg10 == null ? 0 : arg10.length;
		for (local116 = 0; local116 < local72; local116++) {
			if (arg10[local116] != null) {
				local28 |= arg10[local116].method9101();
				local257 = true;
			}
		}
		if (arg1 != null) {
			local28 |= arg1.method9101();
			local257 = true;
		}
		if (arg12 != null) {
			local257 = true;
			local28 |= arg12.method9101();
		}
		@Pc(310) boolean local310 = false;
		if (arg5 != null) {
			for (@Pc(314) int local314 = 0; local314 < arg5.length; local314++) {
				if (arg5[local314] != -1) {
					local310 = true;
					local28 |= 0x20;
				}
			}
		}
		@Pc(334) Class82 local334 = Static580.aClass82_186;
		@Pc(342) Class114 local342;
		synchronized (Static580.aClass82_186) {
			local342 = (Class114) Static580.aClass82_186.method2156(local31);
		}
		@Pc(350) Class289 local350 = null;
		if (this.anInt5007 != -1) {
			local350 = arg2.method7118(this.anInt5007);
		}
		@Pc(390) int local390;
		@Pc(395) int local395;
		@Pc(586) int local586;
		@Pc(591) int local591;
		if (local342 == null || arg8.method7960(local342.ua(), local28) != 0) {
			if (local342 != null) {
				local28 = arg8.method8013(local28, local342.ua());
			}
			@Pc(388) boolean local388 = false;
			local390 = 0;
			while (true) {
				@Pc(409) int local409;
				if (local390 >= local34.length) {
					if (local388) {
						if (this.aLong159 != -1L) {
							@Pc(552) Class82 local552 = Static580.aClass82_186;
							synchronized (Static580.aClass82_186) {
								local342 = (Class114) Static580.aClass82_186.method2156(this.aLong159);
							}
						}
						if (local342 == null || arg8.method7960(local342.ua(), local28) != 0) {
							return null;
						}
					} else {
						@Pc(584) Class88[] local584 = new Class88[local34.length];
						for (local586 = 0; local586 < local34.length; local586++) {
							local591 = local34[local586];
							@Pc(593) Class52 local593 = null;
							@Pc(614) boolean local614 = local586 == 5 && local36 || local586 == 3 && local44;
							@Pc(633) Class88 local633;
							if ((local591 & 0x40000000) != 0) {
								if (!local614 && this.aClass52Array1 != null && this.aClass52Array1[local586] != null) {
									local593 = this.aClass52Array1[local586];
								}
								local633 = arg0.method2486(local591 & 0x3FFFFFFF).method8799(local593, this.aBoolean385);
								if (local633 != null) {
									local584[local586] = local633;
								}
							} else if ((Integer.MIN_VALUE & local591) != 0) {
								local633 = arg7.method5042(local591 & 0x3FFFFFFF).method6618();
								if (local633 != null) {
									local584[local586] = local633;
								}
							}
						}
						@Pc(709) int local709;
						if (local350 != null && local350.anIntArrayArray181 != null) {
							for (local591 = 0; local591 < local350.anIntArrayArray181.length; local591++) {
								if (local584[local591] != null) {
									local409 = 0;
									local709 = 0;
									@Pc(711) int local711 = 0;
									@Pc(713) int local713 = 0;
									@Pc(715) int local715 = 0;
									@Pc(717) int local717 = 0;
									if (local350.anIntArrayArray181[local591] != null) {
										local709 = local350.anIntArrayArray181[local591][1];
										local711 = local350.anIntArrayArray181[local591][2];
										local717 = local350.anIntArrayArray181[local591][5] << 3;
										local409 = local350.anIntArrayArray181[local591][0];
										local715 = local350.anIntArrayArray181[local591][4] << 3;
										local713 = local350.anIntArrayArray181[local591][3] << 3;
									}
									if (local713 != 0 || local715 != 0 || local717 != 0) {
										local584[local591].method2236(local717, local713, local715);
									}
									if (local409 != 0 || local709 != 0 || local711 != 0) {
										local584[local591].method2233(local409, local709, local711);
									}
								}
							}
						}
						@Pc(826) int local826 = local28 | 0x4000;
						@Pc(833) Class88 local833 = new Class88(local584, local584.length);
						local342 = arg8.method7952(local833, local826, Static294.anInt4766, 64, 850);
						for (local409 = 0; local409 < 10; local409++) {
							for (local709 = 0; local709 < Static76.aShortArrayArray2[local409].length; local709++) {
								if (Static339.aShortArrayArrayArray2[local409][local709].length > this.anIntArray380[local409]) {
									local342.ia(Static76.aShortArrayArray2[local409][local709], Static339.aShortArrayArrayArray2[local409][local709][this.anIntArray380[local409]]);
								}
							}
						}
						local342.s(local28);
						@Pc(903) Class82 local903 = Static580.aClass82_186;
						synchronized (Static580.aClass82_186) {
							Static580.aClass82_186.method2150(local342, local31);
						}
						this.aLong159 = local31;
					}
					break;
				}
				local395 = local34[local390];
				@Pc(397) Class52 local397 = null;
				@Pc(399) boolean local399 = false;
				if (local36) {
					if (arg6.anInt10301 == local390) {
						local399 = true;
					} else {
						for (local409 = 0; local409 < arg6.anIntArray818.length; local409++) {
							if (local390 == arg6.anIntArray818[local409]) {
								local399 = true;
								break;
							}
						}
					}
				}
				if (local44) {
					if (arg6.anInt10300 == local390) {
						local399 = true;
					} else {
						for (local409 = 0; local409 < arg6.anIntArray820.length; local409++) {
							if (arg6.anIntArray820[local409] == local390) {
								local399 = true;
								break;
							}
						}
					}
				}
				if ((local395 & 0x40000000) != 0) {
					if (!local399 && this.aClass52Array1 != null && this.aClass52Array1[local390] != null) {
						local397 = this.aClass52Array1[local390];
					}
					if (!arg0.method2486(local395 & 0x3FFFFFFF).method8802(this.aBoolean385, local397)) {
						local388 = true;
					}
				} else if ((Integer.MIN_VALUE & local395) != 0 && !arg7.method5042(local395 & 0x3FFFFFFF).method6616()) {
					local388 = true;
				}
				local390++;
			}
		}
		@Pc(925) Class114 local925 = local342.method7495((byte) 4, local28, true);
		if (!local257 && !local310) {
			return local925;
		}
		@Pc(936) Class73[] local936 = null;
		if (local350 != null) {
			local936 = local350.method6480(arg8);
		}
		if (local310 && local936 != null) {
			for (local390 = 0; local390 < arg5.length; local390++) {
				if (local936[local390] != null) {
					local925.method7492(local936[local390], 0x1 << local390, true);
				}
			}
		}
		local390 = 0;
		local395 = 1;
		while (local390 < local72) {
			if (arg10[local390] != null) {
				arg10[local390].method9110(local395, local925);
			}
			local390++;
			local395 <<= 0x1;
		}
		if (local310) {
			for (local586 = 0; local586 < arg5.length; local586++) {
				if (arg5[local586] != -1) {
					local591 = arg5[local586] - arg11;
					local591 &= 0x3FFF;
					@Pc(1034) Class73 local1034 = arg8.method7953();
					local1034.method7131(local591);
					local925.method7492(local1034, 0x1 << local586, false);
				}
			}
		}
		if (local310 && local936 != null) {
			for (local586 = 0; local586 < arg5.length; local586++) {
				if (local936[local586] != null) {
					local925.method7492(local936[local586], 0x1 << local586, false);
				}
			}
		}
		if (arg1 != null && arg12 != null) {
			Static468.method7645(arg1, local925, arg12);
		} else if (arg1 != null) {
			arg1.method9089(local925, 0);
		} else if (arg12 != null) {
			arg12.method9089(local925, 0);
		}
		return local925;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V")
	public void method4547(@OriginalArg(1) boolean arg0) {
		this.aBoolean385 = arg0;
		this.method4543();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBLclient!kr;I)V")
	public void method4548(@OriginalArg(0) int arg0, @OriginalArg(2) Class215 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static264.anIntArray891[arg2];
		if (arg1.method5042(arg0) != null) {
			this.anIntArray381[local7] = Integer.MIN_VALUE | arg0;
			this.method4543();
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIB)V")
	public void method4549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray380[arg0] = arg1;
		this.method4543();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!gu;IILclient!bp;Lclient!ha;BLclient!kr;II)Lclient!ka;")
	public Class114 method4550(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class50 arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(6) Class215 arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = arg0 == null ? 2048 : arg0.method9101() | 0x800;
		@Pc(29) long local29 = (long) arg1 | (long) arg2 << 32 | (long) (arg6 << 16);
		@Pc(31) Class82 local31 = Static54.aClass82_25;
		@Pc(39) Class114 local39;
		synchronized (Static54.aClass82_25) {
			local39 = (Class114) Static54.aClass82_25.method2156(local29);
		}
		if (local39 == null || arg4.method7960(local39.ua(), local16) != 0) {
			if (local39 != null) {
				local16 = arg4.method8013(local16, local39.ua());
			}
			@Pc(70) Class88[] local70 = new Class88[3];
			@Pc(72) int local72 = 0;
			if (!arg5.method5042(arg1).method6615() || !arg5.method5042(arg6).method6615() || !arg5.method5042(arg2).method6615()) {
				return null;
			}
			@Pc(107) Class88 local107 = arg5.method5042(arg1).method6614();
			if (local107 != null) {
				local72++;
				local70[0] = local107;
			}
			local107 = arg5.method5042(arg6).method6614();
			if (local107 != null) {
				local70[local72++] = local107;
			}
			local107 = arg5.method5042(arg2).method6614();
			if (local107 != null) {
				local70[local72++] = local107;
			}
			@Pc(152) int local152 = local16 | 0x4000;
			local107 = new Class88(local70, local72);
			local39 = arg4.method7952(local107, local152, Static294.anInt4766, 64, 768);
			for (@Pc(168) int local168 = 0; local168 < 10; local168++) {
				for (@Pc(172) int local172 = 0; local172 < Static76.aShortArrayArray2[local168].length; local172++) {
					if (this.anIntArray380[local168] < Static339.aShortArrayArrayArray2[local168][local172].length) {
						local39.ia(Static76.aShortArrayArray2[local168][local172], Static339.aShortArrayArrayArray2[local168][local172][this.anIntArray380[local168]]);
					}
				}
			}
			local39.s(local16);
			@Pc(228) Class82 local228 = Static54.aClass82_25;
			synchronized (Static54.aClass82_25) {
				Static54.aClass82_25.method2150(local39, local29);
			}
		}
		if (arg0 == null) {
			return local39;
		} else {
			local39 = local39.method7495((byte) 4, local16, true);
			arg0.method9089(local39, 0);
			return local39;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BIILclient!es;)V")
	public void method4551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class112 arg2) {
		if (arg0 == -1) {
			this.anIntArray381[arg1] = 0;
		} else if (arg2.method2486(arg0) != null) {
			this.anIntArray381[arg1] = arg0 | 0x40000000;
			this.method4543();
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!kr;BLclient!bp;Lclient!uk;Lclient!gu;Lclient!es;Lclient!ql;Lclient!ha;I)Lclient!ka;")
	public Class114 method4552(@OriginalArg(0) Class215 arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) Interface23 arg2, @OriginalArg(4) Class152 arg3, @OriginalArg(5) Class112 arg4, @OriginalArg(6) Class308 arg5, @OriginalArg(7) Class19 arg6) {
		if (this.anInt5012 != -1) {
			return arg5.method7092(this.anInt5012).method5992(arg3, (Class386) null, arg6, arg2);
		}
		@Pc(35) int local35 = arg3 == null ? 2048 : arg3.method9101() | 0x800;
		@Pc(37) Class82 local37 = Static54.aClass82_25;
		@Pc(48) Class114 local48;
		synchronized (Static54.aClass82_25) {
			local48 = (Class114) Static54.aClass82_25.method2156(this.aLong160);
		}
		if (local48 == null || arg6.method7960(local48.ua(), local35) != 0) {
			if (local48 != null) {
				local35 = arg6.method8013(local35, local48.ua());
			}
			@Pc(81) boolean local81 = false;
			for (@Pc(83) int local83 = 0; local83 < this.anIntArray381.length; local83++) {
				@Pc(92) int local92 = this.anIntArray381[local83];
				@Pc(94) Class52 local94 = null;
				if ((local92 & 0x40000000) != 0) {
					if (this.aClass52Array1 != null && this.aClass52Array1[local83] != null) {
						local94 = this.aClass52Array1[local83];
					}
					if (!arg4.method2486(local92 & 0x3FFFFFFF).method8808(local94, this.aBoolean385)) {
						local81 = true;
					}
				} else if ((Integer.MIN_VALUE & local92) != 0 && !arg0.method5042(local92 & 0x3FFFFFFF).method6615()) {
					local81 = true;
				}
			}
			if (local81) {
				return null;
			}
			@Pc(172) Class88[] local172 = new Class88[this.anIntArray381.length];
			@Pc(174) int local174 = 0;
			for (@Pc(176) int local176 = 0; local176 < this.anIntArray381.length; local176++) {
				@Pc(185) int local185 = this.anIntArray381[local176];
				@Pc(187) Class52 local187 = null;
				@Pc(220) Class88 local220;
				if ((local185 & 0x40000000) != 0) {
					if (this.aClass52Array1 != null && this.aClass52Array1[local176] != null) {
						local187 = this.aClass52Array1[local176];
					}
					local220 = arg4.method2486(local185 & 0x3FFFFFFF).method8801(this.aBoolean385, local187);
					if (local220 != null) {
						local172[local174++] = local220;
					}
				} else if ((Integer.MIN_VALUE & local185) != 0) {
					local220 = arg0.method5042(local185 & 0x3FFFFFFF).method6614();
					if (local220 != null) {
						local172[local174++] = local220;
					}
				}
			}
			@Pc(266) Class88 local266 = new Class88(local172, local174);
			@Pc(270) int local270 = local35 | 0x4000;
			local48 = arg6.method7952(local266, local270, Static294.anInt4766, 64, 768);
			for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
				for (@Pc(286) int local286 = 0; local286 < Static76.aShortArrayArray2[local282].length; local286++) {
					if (this.anIntArray380[local282] < Static339.aShortArrayArrayArray2[local282][local286].length) {
						local48.ia(Static76.aShortArrayArray2[local282][local286], Static339.aShortArrayArrayArray2[local282][local286][this.anIntArray380[local282]]);
					}
				}
			}
			local48.s(local35);
			@Pc(340) Class82 local340 = Static54.aClass82_25;
			synchronized (Static54.aClass82_25) {
				Static54.aClass82_25.method2150(local48, this.aLong160);
			}
		}
		if (arg3 == null) {
			return local48;
		} else {
			@Pc(375) Class114 local375 = local48.method7495((byte) 4, local35, true);
			arg3.method9089(local375, 0);
			return local375;
		}
	}
}
