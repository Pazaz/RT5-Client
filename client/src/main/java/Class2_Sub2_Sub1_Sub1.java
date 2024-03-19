import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub2_Sub1_Sub1 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
	private int anInt6023;

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "Lclient!js;")
	private Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!sh", name = "Q", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!sh", name = "S", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!sh", name = "T", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
	private int anInt6024;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!js;IIIIIIIIIIIZ)V")
	public Class2_Sub2_Sub1_Sub1(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass2_Sub4_1 = arg0;
		super.anInt6017 = arg1 << Static318.anInt6558;
		super.anInt6020 = arg2 << Static318.anInt6558;
		super.anInt6014 = arg3 << Static318.anInt6558;
		super.anInt6016 = arg9;
		this.aShort76 = this.aShort75 = (short) arg8;
		super.anInt6013 = arg10;
		super.anInt6010 = arg11;
		this.aShort72 = (short) arg4;
		this.aShort73 = (short) arg5;
		this.aShort77 = (short) arg6;
		this.anInt6024 = arg7;
		super.aByte58 = this.aClass2_Sub4_1.aClass49_2.aByte15;
		this.method5094();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "()V")
	private void method5090() {
		this.aClass2_Sub4_1.aClass2_Sub7_5.aClass2_Sub2_Sub1_Sub1Array1[this.aShort74] = null;
		Static297.aClass2_Sub2_Sub1_Sub1Array2[Static248.anInt5405] = this;
		Static248.anInt5405 = Static248.anInt5405 + 1 & 0x3FF;
		this.method5802();
		this.method5084();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(JI)V")
	public void method5091(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort75 = (short) (this.aShort75 - arg1);
		if (this.aShort75 <= 0) {
			this.method5090();
			return;
		}
		@Pc(17) int local17 = super.anInt6017 >> Static318.anInt6558;
		@Pc(22) int local22 = super.anInt6020 >> Static318.anInt6558;
		@Pc(27) int local27 = super.anInt6014 >> Static318.anInt6558;
		@Pc(31) Class2_Sub7 local31 = this.aClass2_Sub4_1.aClass2_Sub7_5;
		@Pc(35) Class39 local35 = this.aClass2_Sub4_1.aClass39_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt1331 != 0) {
			if (this.aShort76 - this.aShort75 <= local35.anInt1366) {
				local65 = (super.anInt6016 >> 8 & 0xFF00) + (this.anInt6023 >> 16 & 0xFF) + local35.anInt1371 * arg1;
				local82 = (super.anInt6016 & 0xFF00) + (this.anInt6023 >> 8 & 0xFF) + local35.anInt1348 * arg1;
				local99 = ((super.anInt6016 & 0xFF) << 8) + (this.anInt6023 & 0xFF) + local35.anInt1341 * arg1;
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
				super.anInt6016 &= 0xFF000000;
				super.anInt6016 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6023 &= 0xFF000000;
				this.anInt6023 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort76 - this.aShort75 <= local35.anInt1349) {
				local65 = (super.anInt6016 >> 16 & 0xFF00) + (this.anInt6023 >> 24 & 0xFF) + local35.anInt1332 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6016 &= 0xFFFFFF;
				super.anInt6016 |= (local65 & 0xFF00) << 16;
				this.anInt6023 &= 0xFFFFFF;
				this.anInt6023 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1340 != -1 && this.aShort76 - this.aShort75 <= local35.anInt1330) {
			this.anInt6024 += local35.anInt1327 * arg1;
		}
		if (local35.anInt1328 != -1 && this.aShort76 - this.aShort75 <= local35.anInt1357) {
			super.anInt6013 += local35.lb * arg1;
		}
		local65 = this.aShort72;
		local82 = this.aShort73;
		local99 = this.aShort77;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt1359 == 1) {
			local313 = local17 - this.aClass2_Sub4_1.anInt3710;
			local319 = local22 - this.aClass2_Sub4_1.anInt3687;
			local325 = local27 - this.aClass2_Sub4_1.anInt3700;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt1355 * local340 * arg1;
			this.anInt6024 = (int) ((long) this.anInt6024 - ((long) this.anInt6024 * local348 >> 18));
		} else if (local35.anInt1359 == 2) {
			local313 = local17 - this.aClass2_Sub4_1.anInt3710;
			local319 = local22 - this.aClass2_Sub4_1.anInt3687;
			local325 = local27 - this.aClass2_Sub4_1.anInt3700;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt1355 * local340 * arg1;
			this.anInt6024 = (int) ((long) this.anInt6024 - ((long) this.anInt6024 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray86 != null) {
			@Pc(426) Class1 local426 = local31.aClass130_33.aClass1_138;
			for (@Pc(429) Class1 local429 = local426.aClass1_247; local429 != local426; local429 = local429.aClass1_247) {
				@Pc(433) Class1_Sub1_Sub15 local433 = (Class1_Sub1_Sub15) local429;
				@Pc(436) Class118 local436 = local433.aClass118_1;
				if (local436.anInt4088 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray86.length; local444++) {
						if (local35.anIntArray86[local444] == local436.anInt4077) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4346;
						@Pc(473) int local473 = local22 - local433.anInt4344;
						local478 = local27 - local433.anInt4342;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong119) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4345 + local473 * local436.anInt4078 + local478 * local433.anInt4349) * 65535L / (long) (local436.anInt4086 * local501);
							if (local529 >= (long) local436.anInt4092) {
								local537 = 0;
								if (local436.anInt4081 == 1) {
									local537 = (local501 >> 4) * local436.anInt4085;
								} else if (local436.anInt4081 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt4085;
								}
								if (local436.anInt4080 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt4086;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt4086;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt4086;
									if (local436.anInt4082 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6017 += local643 * arg1 >> 15;
										super.anInt6020 += local652 * arg1 >> 15;
										super.anInt6014 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt4082 == 0) {
									local65 += (local433.anInt4345 - local537) * arg1;
									local82 += (local436.anInt4078 - local537) * arg1;
									local99 += (local433.anInt4349 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6017 += (local433.anInt4345 - local537) * arg1;
									super.anInt6020 += (local436.anInt4078 - local537) * arg1;
									super.anInt6014 += (local433.anInt4349 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray84 != null) {
			for (local313 = 0; local313 < local35.anIntArray84.length; local313++) {
				@Pc(743) Class1_Sub1_Sub15 local743 = (Class1_Sub1_Sub15) Static72.aClass184_1.method5096((long) local35.anIntArray84[local313]);
				while (local743 != null) {
					@Pc(747) Class118 local747 = local743.aClass118_1;
					local340 = local17 - local743.anInt4346;
					@Pc(757) int local757 = local22 - local743.anInt4344;
					local444 = local27 - local743.anInt4342;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong119) {
						local743 = (Class1_Sub1_Sub15) Static72.aClass184_1.method5095();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4345 + local757 * local747.anInt4078 + local444 * local743.anInt4349) * 65535L / (long) (local747.anInt4086 * local478);
						if (local491 < (long) local747.anInt4092) {
							local743 = (Class1_Sub1_Sub15) Static72.aClass184_1.method5095();
						} else {
							local501 = 0;
							if (local747.anInt4081 == 1) {
								local501 = (local478 >> 4) * local747.anInt4085;
							} else if (local747.anInt4081 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt4085;
							}
							if (local747.anInt4080 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt4086;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt4086;
								local537 = (local444 << 15) / local478 * local747.anInt4086;
								if (local747.anInt4082 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6017 += local939 * arg1 >> 15;
									super.anInt6020 += local948 * arg1 >> 15;
									super.anInt6014 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt4082 == 0) {
								local65 += (local743.anInt4345 - local501) * arg1;
								local82 += (local747.anInt4078 - local501) * arg1;
								local99 += (local743.anInt4349 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6017 += (local743.anInt4345 - local501) * arg1;
								super.anInt6020 += (local747.anInt4078 - local501) * arg1;
								super.anInt6014 += (local743.anInt4349 - local501) * arg1;
							}
							local743 = (Class1_Sub1_Sub15) Static72.aClass184_1.method5095();
						}
					}
				}
			}
		}
		if (local35.anIntArray85 != null) {
			if (local35.anIntArray89 == null) {
				local35.anIntArray89 = new int[local35.anIntArray85.length];
				for (local313 = 0; local313 < local35.anIntArray85.length; local313++) {
					Static236.method4503(local35.anIntArray85[local313]);
					local35.anIntArray89[local313] = ((Class1_Sub26) Static138.aClass183_12.method5053((long) local35.anIntArray85[local313])).anInt4811;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray89.length; local313++) {
				@Pc(1082) Class118 local1082 = Static264.aClass118Array1[local35.anIntArray89[local313]];
				if (local1082.anInt4082 == 0) {
					local65 += local1082.anInt4090 * arg1;
					local82 += local1082.anInt4078 * arg1;
					local99 += local1082.anInt4083 * arg1;
					local303 = true;
				} else {
					super.anInt6017 += local1082.anInt4090 * arg1;
					super.anInt6020 += local1082.anInt4078 * arg1;
					super.anInt6014 += local1082.anInt4083 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort72 = (short) local65;
					this.aShort73 = (short) local82;
					this.aShort77 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6024 <<= 0x1;
			}
		}
		super.anInt6017 = (int) ((long) super.anInt6017 + ((long) this.aShort72 * (long) this.anInt6024 >> 23) * (long) arg1);
		super.anInt6020 = (int) ((long) super.anInt6020 + ((long) this.aShort73 * (long) this.anInt6024 >> 23) * (long) arg1);
		super.anInt6014 = (int) ((long) super.anInt6014 + ((long) this.aShort77 * (long) this.anInt6024 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!js;IIIIIIIIIIIZ)V")
	public void method5092(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass2_Sub4_1 = arg0;
		super.anInt6017 = arg1 << Static318.anInt6558;
		super.anInt6020 = arg2 << Static318.anInt6558;
		super.anInt6014 = arg3 << Static318.anInt6558;
		super.anInt6016 = arg9;
		this.aShort76 = this.aShort75 = (short) arg8;
		super.anInt6013 = arg10;
		super.anInt6010 = arg11;
		this.aShort72 = (short) arg4;
		this.aShort73 = (short) arg5;
		this.aShort77 = (short) arg6;
		this.anInt6024 = arg7;
		super.aByte58 = this.aClass2_Sub4_1.aClass49_2.aByte15;
		this.method5094();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(J)V")
	public void method5093(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt6017 >> 19;
		@Pc(9) int local9 = super.anInt6014 >> 19;
		@Pc(14) int local14 = super.anInt6020 >> Static318.anInt6558;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static328.anInt6717 || local9 < 0 || local9 >= Static200.anInt4590) {
			this.method5090();
			return;
		}
		@Pc(36) Class2_Sub7 local36 = this.aClass2_Sub4_1.aClass2_Sub7_5;
		@Pc(40) Class39 local40 = this.aClass2_Sub4_1.aClass39_1;
		@Pc(42) Class77[] local42 = Static118.aClass77Array1;
		@Pc(50) int local50 = local42[local36.anInt5558].method3986(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt5558 < 3) {
			local64 = local42[local36.anInt5558 + 1].method3986(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean83) {
			if (local40.anInt1342 == -1 && local14 > local50) {
				this.method5090();
				return;
			}
			if (local40.anInt1342 >= 0 && local14 > local42[local40.anInt1342].method3986(local4, local9)) {
				this.method5090();
				return;
			}
			if (local40.anInt1353 == -1 && local14 < local64) {
				this.method5090();
				return;
			}
			if (local40.anInt1353 >= 0 && local14 < local42[local40.anInt1353 + 1].method3986(local4, local9)) {
				this.method5090();
				return;
			}
		}
		if (local4 >= local36.anInt5561 && local4 <= local36.anInt5559 && local9 >= local36.anInt5562 && local9 <= local36.anInt5559 && local14 <= local50 && local14 >= local64) {
			local36.aClass117_2.aClass148_1.method4346(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method3986(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method3986(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method3986(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method3986(local4, local9) - 1024) {
			this.method5090();
			return;
		}
		@Pc(202) Class154 local202 = Static241.aClass154ArrayArrayArray2[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static241.aClass154ArrayArrayArray2[0][local4][local9].aClass154_1 != null;
			if (local148 == 3 && local217) {
				this.method5090();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static241.aClass154ArrayArrayArray2[local227][local4][local9] == null) {
					local202 = Static241.aClass154ArrayArrayArray2[local227][local4][local9] = new Class154(local227, local4, local9);
					if (local217) {
						local202.aByte46++;
					}
				}
			}
		}
		if (local202.aClass117_1 == null) {
			local202.aClass117_1 = new Class117();
			local202.aByte47 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte47 != (byte) (arg0 & 0xFFL)) {
			local202.aClass117_1 = new Class117();
			local202.aByte47 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass117_1.aClass148_1.method4346(this);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "()V")
	private void method5094() {
		@Pc(4) int local4 = this.aClass2_Sub4_1.aClass2_Sub7_5.anInt5556;
		if (this.aClass2_Sub4_1.aClass2_Sub7_5.aClass2_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass2_Sub4_1.aClass2_Sub7_5.aClass2_Sub2_Sub1_Sub1Array1[local4].method5090();
		}
		this.aClass2_Sub4_1.aClass2_Sub7_5.aClass2_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort74 = (short) this.aClass2_Sub4_1.aClass2_Sub7_5.anInt5556;
		this.aClass2_Sub4_1.aClass2_Sub7_5.anInt5556 = local4 + 1 & 0x1FFF;
		this.aClass2_Sub4_1.aClass58_5.method1670(this);
	}
}
