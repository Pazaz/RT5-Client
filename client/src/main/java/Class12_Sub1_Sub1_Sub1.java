import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class12_Sub1_Sub1_Sub1 extends Class12_Sub1_Sub1 {

	@OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
	private int anInt4478;

	@OriginalMember(owner = "client!ns", name = "Z", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!ns", name = "W", descriptor = "Lclient!th;")
	private Class12_Sub8 aClass12_Sub8_1;

	@OriginalMember(owner = "client!ns", name = "X", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!ns", name = "Y", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!ns", name = "U", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
	private int anInt4477;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!th;IIIIIIIIIIIZZ)V")
	public Class12_Sub1_Sub1_Sub1(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub8_1 = arg0;
		super.anInt4465 = arg1 << Static111.anInt2254;
		super.anInt4470 = arg2 << Static111.anInt2254;
		super.anInt4467 = arg3 << Static111.anInt2254;
		super.anInt4469 = arg9;
		this.aShort67 = this.aShort66 = (short) arg8;
		super.anInt4472 = arg10;
		super.anInt4474 = arg11;
		super.aBoolean307 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort63 = (short) arg5;
		this.aShort65 = (short) arg6;
		this.anInt4477 = arg7;
		super.aByte48 = this.aClass12_Sub8_1.aClass114_2.aByte26;
		this.method4217();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(J)V")
	public void method4216(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt4465 >> 19;
		@Pc(9) int local9 = super.anInt4467 >> 19;
		@Pc(14) int local14 = super.anInt4470 >> Static111.anInt2254;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static72.anInt1684 || local9 < 0 || local9 >= Static210.anInt3773) {
			this.method4220();
			return;
		}
		@Pc(36) Class12_Sub5 local36 = this.aClass12_Sub8_1.aClass12_Sub5_6;
		@Pc(40) Class235 local40 = this.aClass12_Sub8_1.aClass235_1;
		@Pc(42) Class6[] local42 = Static365.aClass6Array4;
		@Pc(50) int local50 = local42[local36.anInt4679].method5719(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt4679 < Static92.anInt1914 - 1) {
			local66 = local42[local36.anInt4679 + 1].method5719(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean448) {
			if (local40.anInt6577 == -1 && local14 > local50) {
				this.method4220();
				return;
			}
			if (local40.anInt6577 >= 0 && local14 > local42[local40.anInt6577].method5719(local4, local9)) {
				this.method4220();
				return;
			}
			if (local40.anInt6587 == -1 && local14 < local66) {
				this.method4220();
				return;
			}
			if (local40.anInt6587 >= 0 && local14 < local42[local40.anInt6587 + 1].method5719(local4, local9)) {
				this.method4220();
				return;
			}
		}
		if (local4 >= local36.anInt4677 && local4 <= local36.anInt4676 && local9 >= local36.anInt4680 && local9 <= local36.anInt4675 && local14 <= local50 && local14 >= local66) {
			local36.aClass224_2.aClass191_1.method4891(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static92.anInt1914 - 1; local152 > 0 && local14 > local42[local152].method5719(local4, local9); local152--) {
		}
		if (local152 == 0 && local14 > local42[0].method5719(local4, local9)) {
			this.method4220();
		} else if (local152 == Static92.anInt1914 - 1 && local42[local152].method5719(local4, local9) - local14 > 1024) {
			this.method4220();
		} else {
			@Pc(203) Class67 local203 = Static330.aClass67ArrayArrayArray3[local152][local4][local9];
			if (local203 == null) {
				if (local152 == 0) {
					local203 = Static330.aClass67ArrayArrayArray3[0][local4][local9] = new Class67(0, local4, local9);
				}
				@Pc(235) boolean local235 = Static330.aClass67ArrayArrayArray3[0][local4][local9].aClass67_1 != null;
				if (local152 == 3 && local235) {
					this.method4220();
					return;
				}
				for (@Pc(245) int local245 = 1; local245 <= local152; local245++) {
					if (Static330.aClass67ArrayArrayArray3[local245][local4][local9] == null) {
						local203 = Static330.aClass67ArrayArrayArray3[local245][local4][local9] = new Class67(local245, local4, local9);
						if (local235) {
							local203.aByte7++;
						}
					}
				}
			}
			if (local203.aClass224_1 == null) {
				local203.aClass224_1 = new Class224();
				local203.aByte13 = (byte) (arg0 & 0xFFL);
			} else if (local203.aByte13 != (byte) (arg0 & 0xFFL)) {
				local203.aClass224_1.aClass191_1.method4892();
				local203.aClass224_1.aBoolean429 = false;
				local203.aByte13 = (byte) (arg0 & 0xFFL);
			}
			local203.aClass224_1.aClass191_1.method4891(this);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "()V")
	private void method4217() {
		@Pc(4) int local4 = this.aClass12_Sub8_1.aClass12_Sub5_6.anInt4673;
		if (this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[local4].method4220();
		}
		this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort68 = (short) this.aClass12_Sub8_1.aClass12_Sub5_6.anInt4673;
		this.aClass12_Sub8_1.aClass12_Sub5_6.anInt4673 = local4 + 1 & 0x1FFF;
		this.aClass12_Sub8_1.aClass36_8.method1418(this);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!th;IIIIIIIIIIIZZ)V")
	public void method4218(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub8_1 = arg0;
		super.anInt4465 = arg1 << Static111.anInt2254;
		super.anInt4470 = arg2 << Static111.anInt2254;
		super.anInt4467 = arg3 << Static111.anInt2254;
		super.anInt4469 = arg9;
		this.aShort67 = this.aShort66 = (short) arg8;
		super.anInt4472 = arg10;
		super.anInt4474 = arg11;
		super.aBoolean307 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort63 = (short) arg5;
		this.aShort65 = (short) arg6;
		this.anInt4477 = arg7;
		super.aByte48 = this.aClass12_Sub8_1.aClass114_2.aByte26;
		this.method4217();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(JI)V")
	public void method4219(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort66 = (short) (this.aShort66 - arg1);
		if (this.aShort66 <= 0) {
			this.method4220();
			return;
		}
		@Pc(17) int local17 = super.anInt4465 >> Static111.anInt2254;
		@Pc(22) int local22 = super.anInt4470 >> Static111.anInt2254;
		@Pc(27) int local27 = super.anInt4467 >> Static111.anInt2254;
		@Pc(31) Class12_Sub5 local31 = this.aClass12_Sub8_1.aClass12_Sub5_6;
		@Pc(35) Class235 local35 = this.aClass12_Sub8_1.aClass235_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6579 != 0) {
			if (this.aShort67 - this.aShort66 <= local35.anInt6618) {
				local65 = (super.anInt4469 >> 8 & 0xFF00) + (this.anInt4478 >> 16 & 0xFF) + local35.anInt6589 * arg1;
				local82 = (super.anInt4469 & 0xFF00) + (this.anInt4478 >> 8 & 0xFF) + local35.anInt6571 * arg1;
				local99 = ((super.anInt4469 & 0xFF) << 8) + (this.anInt4478 & 0xFF) + local35.anInt6591 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt4469 &= 0xFF000000;
				super.anInt4469 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4478 &= 0xFF000000;
				this.anInt4478 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort67 - this.aShort66 <= local35.anInt6606) {
				local65 = (super.anInt4469 >> 16 & 0xFF00) + (this.anInt4478 >> 24 & 0xFF) + local35.anInt6584 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4469 &= 0xFFFFFF;
				super.anInt4469 |= (local65 & 0xFF00) << 16;
				this.anInt4478 &= 0xFFFFFF;
				this.anInt4478 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6596 != -1 && this.aShort67 - this.aShort66 <= local35.anInt6613) {
			this.anInt4477 += local35.anInt6572 * arg1;
		}
		if (local35.anInt6614 != -1 && this.aShort67 - this.aShort66 <= local35.anInt6603) {
			super.anInt4472 += local35.anInt6602 * arg1;
		}
		local65 = this.aShort64;
		local82 = this.aShort63;
		local99 = this.aShort65;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6595 == 1) {
			local313 = local17 - this.aClass12_Sub8_1.anInt6254;
			local319 = local22 - this.aClass12_Sub8_1.anInt6261;
			local325 = local27 - this.aClass12_Sub8_1.anInt6241;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6580 * local340 * arg1;
			this.anInt4477 = (int) ((long) this.anInt4477 - ((long) this.anInt4477 * local348 >> 18));
		} else if (local35.anInt6595 == 2) {
			local313 = local17 - this.aClass12_Sub8_1.anInt6254;
			local319 = local22 - this.aClass12_Sub8_1.anInt6261;
			local325 = local27 - this.aClass12_Sub8_1.anInt6241;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6580 * local340 * arg1;
			this.anInt4477 = (int) ((long) this.anInt4477 - ((long) this.anInt4477 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray456 != null) {
			@Pc(426) Node local426 = local31.aClass135_29.aClass2_130;
			for (@Pc(429) Node local429 = local426.next; local429 != local426; local429 = local429.next) {
				@Pc(433) Class2_Sub2_Sub5 local433 = (Class2_Sub2_Sub5) local429;
				@Pc(436) Class28 local436 = local433.aClass28_1;
				if (local436.anInt737 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray456.length; local444++) {
						if (local35.anIntArray456[local444] == local436.anInt749) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1395;
						@Pc(473) int local473 = local22 - local433.anInt1390;
						local478 = local27 - local433.anInt1396;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong23) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1389 + local473 * local436.anInt748 + local478 * local433.anInt1391) * 65535L / (long) (local436.anInt740 * local501);
							if (local529 >= (long) local436.anInt738) {
								local537 = 0;
								if (local436.anInt753 == 1) {
									local537 = (local501 >> 4) * local436.anInt750;
								} else if (local436.anInt753 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt750;
								}
								if (local436.anInt746 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt740;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt740;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt740;
									if (local436.anInt743 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4465 += local643 * arg1 >> 15;
										super.anInt4470 += local652 * arg1 >> 15;
										super.anInt4467 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt743 == 0) {
									local65 += (local433.anInt1389 - local537) * arg1;
									local82 += (local436.anInt748 - local537) * arg1;
									local99 += (local433.anInt1391 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4465 += (local433.anInt1389 - local537) * arg1;
									super.anInt4470 += (local436.anInt748 - local537) * arg1;
									super.anInt4467 += (local433.anInt1391 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray459 != null) {
			for (local313 = 0; local313 < local35.anIntArray459.length; local313++) {
				@Pc(743) Class2_Sub2_Sub5 local743 = (Class2_Sub2_Sub5) Static141.aClass115_1.method2974((long) local35.anIntArray459[local313]);
				while (local743 != null) {
					@Pc(747) Class28 local747 = local743.aClass28_1;
					local340 = local17 - local743.anInt1395;
					@Pc(757) int local757 = local22 - local743.anInt1390;
					local444 = local27 - local743.anInt1396;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong23) {
						local743 = (Class2_Sub2_Sub5) Static141.aClass115_1.method2975();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1389 + local757 * local747.anInt748 + local444 * local743.anInt1391) * 65535L / (long) (local747.anInt740 * local478);
						if (local491 < (long) local747.anInt738) {
							local743 = (Class2_Sub2_Sub5) Static141.aClass115_1.method2975();
						} else {
							local501 = 0;
							if (local747.anInt753 == 1) {
								local501 = (local478 >> 4) * local747.anInt750;
							} else if (local747.anInt753 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt750;
							}
							if (local747.anInt746 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt740;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt740;
								local537 = (local444 << 15) / local478 * local747.anInt740;
								if (local747.anInt743 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4465 += local939 * arg1 >> 15;
									super.anInt4470 += local948 * arg1 >> 15;
									super.anInt4467 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt743 == 0) {
								local65 += (local743.anInt1389 - local501) * arg1;
								local82 += (local747.anInt748 - local501) * arg1;
								local99 += (local743.anInt1391 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4465 += (local743.anInt1389 - local501) * arg1;
								super.anInt4470 += (local747.anInt748 - local501) * arg1;
								super.anInt4467 += (local743.anInt1391 - local501) * arg1;
							}
							local743 = (Class2_Sub2_Sub5) Static141.aClass115_1.method2975();
						}
					}
				}
			}
		}
		if (local35.anIntArray458 != null) {
			if (local35.anIntArray455 == null) {
				local35.anIntArray455 = new int[local35.anIntArray458.length];
				for (local313 = 0; local313 < local35.anIntArray458.length; local313++) {
					Static314.method5367(local35.anIntArray458[local313]);
					local35.anIntArray455[local313] = ((Class2_Sub39) Static7.aClass4_151.get((long) local35.anIntArray458[local313])).anInt6818;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray455.length; local313++) {
				@Pc(1082) Class28 local1082 = Static278.aClass28Array1[local35.anIntArray455[local313]];
				if (local1082.anInt743 == 0) {
					local65 += local1082.anInt754 * arg1;
					local82 += local1082.anInt748 * arg1;
					local99 += local1082.anInt741 * arg1;
					local303 = true;
				} else {
					super.anInt4465 += local1082.anInt754 * arg1;
					super.anInt4470 += local1082.anInt748 * arg1;
					super.anInt4467 += local1082.anInt741 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort64 = (short) local65;
					this.aShort63 = (short) local82;
					this.aShort65 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4477 <<= 0x1;
			}
		}
		super.anInt4465 = (int) ((long) super.anInt4465 + ((long) this.aShort64 * (long) this.anInt4477 >> 23) * (long) arg1);
		super.anInt4470 = (int) ((long) super.anInt4470 + ((long) this.aShort63 * (long) this.anInt4477 >> 23) * (long) arg1);
		super.anInt4467 = (int) ((long) super.anInt4467 + ((long) this.aShort65 * (long) this.anInt4477 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "()V")
	private void method4220() {
		this.aClass12_Sub8_1.aClass12_Sub5_6.aClass12_Sub1_Sub1_Sub1Array2[this.aShort68] = null;
		Static98.aClass12_Sub1_Sub1_Sub1Array1[Static82.anInt1835] = this;
		Static82.anInt1835 = Static82.anInt1835 + 1 & 0x3FF;
		this.method5684();
		this.method4206();
	}
}
