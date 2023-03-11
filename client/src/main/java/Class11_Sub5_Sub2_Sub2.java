import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class11_Sub5_Sub2_Sub2 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!oe", name = "tc", descriptor = "Lclient!fk;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!oe", name = "Ac", descriptor = "I")
	public int anInt4657 = -1;

	@OriginalMember(owner = "client!oe", name = "Gc", descriptor = "I")
	public int anInt4663 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!wm;)Z")
	private boolean method4335(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class222 local11 = this.method4332();
		@Pc(27) Class157 local27 = super.anInt4597 != -1 && super.anInt4590 == 0 ? Static39.aClass85_1.method2371(super.anInt4597) : null;
		@Pc(45) Class157 local45 = super.anInt4585 == -1 || super.aBoolean317 && local27 != null ? null : Static39.aClass85_1.method2371(super.anInt4585);
		@Pc(48) int local48 = local11.anInt6287;
		@Pc(51) int local51 = local11.anInt6290;
		if (local48 != 0 || local51 != 0 || local11.anInt6281 != 0 || local11.anInt6283 != 0) {
			arg0 |= 0x7;
		}
		@Pc(102) Class31 local102 = super.aClass31Array3[0] = this.aClass71_1.method2086(Static59.aClass7_1, super.anInt4607, local27, arg1, Static39.aClass85_1, super.anInt4629, super.anInt4626, super.anInt4593, local45, arg0, super.aClass20Array3, super.anInt4624, Static214.aClass226_1, super.anInt4592);
		if (local102 == null) {
			return false;
		}
		super.anInt4630 = local102.method3802();
		this.method4320(local102);
		@Pc(119) int local119 = super.aClass248_7.method6441();
		super.anInt4589 = 0;
		super.anInt4608 = 0;
		super.anInt4596 = 0;
		if (local48 == 0 && local51 == 0) {
			this.method4321(this.method4328() << 7, this.method4328() << 7, local119);
		} else {
			this.method4321(local51, local48, local119);
			if (super.anInt4589 != 0) {
				super.aClass31Array3[0].method3824(super.anInt4589);
			}
			if (super.anInt4596 != 0) {
				super.aClass31Array3[0].method3815(super.anInt4596);
			}
			if (super.anInt4608 != 0) {
				super.aClass31Array3[0].method3813(0, super.anInt4608, 0);
			}
		}
		super.aClass31Array3[1] = null;
		if (super.anInt4594 != -1 && super.anInt4582 != -1) {
			@Pc(218) Class91 local218 = Static322.aClass211_2.method5407(super.anInt4594);
			@Pc(238) Class31 local238 = local218.method2433(super.anInt4612, super.anInt4620, arg1, (local218.aBoolean178 ? 7 : 2) | local7, Static39.aClass85_1, super.anInt4582);
			if (local238 != null) {
				local238.method3813(0, -super.anInt4639, 0);
				if (local218.aBoolean178 && (local48 != 0 || local51 != 0)) {
					if (super.anInt4589 != 0) {
						local238.method3824(super.anInt4589);
					}
					if (super.anInt4596 != 0) {
						local238.method3815(super.anInt4596);
					}
					if (super.anInt4608 != 0) {
						local238.method3813(0, super.anInt4608, 0);
					}
				}
				super.aClass31Array3[1] = local238;
			}
		}
		super.aClass31Array3[2] = null;
		if (super.aClass2_Sub6_3 != null) {
			if (super.aClass2_Sub6_3.anInt1118 <= Static114.anInt2348) {
				super.aClass2_Sub6_3 = null;
			} else if (Static114.anInt2348 >= super.aClass2_Sub6_3.anInt1100) {
				@Pc(331) Class31 local331 = super.aClass2_Sub6_3.method1360(arg1, local7 | 0x7);
				if (local331 != null) {
					local331.method3813(-super.anInt6781 + super.aClass2_Sub6_3.anInt1104, super.aClass2_Sub6_3.anInt1114 + -super.anInt6782, -super.anInt6783 + super.aClass2_Sub6_3.anInt1101);
					if (local119 != 0) {
						local331.method3833(local119);
					}
					super.aClass31Array3[2] = local331;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z")
	public boolean method4336() {
		return this.aClass71_1 != null;
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
	@Override
	public int method4324() {
		if (this.aClass71_1.anIntArray129 != null) {
			@Pc(18) Class71 local18 = this.aClass71_1.method2093(Static214.aClass226_1);
			if (local18 != null && local18.anInt2031 != -1) {
				return local18.anInt2031;
			}
		}
		return this.aClass71_1.anInt2031;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V")
	public void method4338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray316[0];
		@Pc(15) int local15 = super.anIntArray317[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt4597 != -1 && Static39.aClass85_1.method2371(super.anInt4597).anInt4029 == 1) {
			super.anInt4597 = -1;
		}
		if (super.anInt4594 != -1) {
			@Pc(83) Class91 local83 = Static322.aClass211_2.method5407(super.anInt4594);
			if (local83.aBoolean177 && local83.anInt2448 != -1 && Static39.aClass85_1.method2371(local83.anInt2448).anInt4029 == 1) {
				super.anInt4594 = -1;
			}
		}
		if (super.anInt4643 < 9) {
			super.anInt4643++;
		}
		for (@Pc(118) int local118 = super.anInt4643; local118 > 0; local118--) {
			super.anIntArray316[local118] = super.anIntArray316[local118 - 1];
			super.anIntArray317[local118] = super.anIntArray317[local118 - 1];
			super.aByteArray51[local118] = super.aByteArray51[local118 - 1];
		}
		super.anIntArray316[0] = local10;
		super.aByteArray51[0] = (byte) arg0;
		super.anIntArray317[0] = local15;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		if (this.aClass71_1 == null || !this.method4335(1024, arg0)) {
			return null;
		}
		@Pc(17) Class14 local17 = arg0.method2808();
		@Pc(22) int local22 = super.aClass248_7.method6441();
		local17.method3925(local22);
		local17.method3936(super.anInt6781, super.anInt6782, super.anInt6783);
		@Pc(37) Class222 local37 = this.method4332();
		@Pc(50) Class71 local50 = this.aClass71_1.anIntArray129 == null ? this.aClass71_1 : this.aClass71_1.method2093(Static214.aClass226_1);
		if (Static218.aClass177_Sub1_2.aBoolean358 && local50.aBoolean142 && local37.aBoolean424) {
			@Pc(75) Class157 local75 = super.anInt4597 != -1 && super.anInt4590 == 0 ? Static39.aClass85_1.method2371(super.anInt4597) : null;
			@Pc(92) Class157 local92 = super.anInt4585 == -1 || super.aBoolean317 && local75 != null ? null : Static39.aClass85_1.method2371(super.anInt4585);
			@Pc(144) Class31 local144 = Static178.method2340(local92 == null ? super.anInt4607 : super.anInt4626, this.aClass71_1.aByte15 & 0xFF, this.aClass71_1.aByte14 & 0xFF, super.anInt4596, local92 == null ? local75 : local92, this.aClass71_1.anInt2041, this.aClass71_1.aShort25 & 0xFFFF, super.aClass31Array3[0], local22, arg0, this.aClass71_1.aShort24 & 0xFFFF, super.aBoolean318, super.anInt4608, super.anInt4589);
			if (local144 != null) {
				@Pc(149) float local149 = arg0.method2802();
				@Pc(152) float local152 = arg0.method2860();
				arg0.method2852(false);
				arg0.method2823(local149, local152 - 150.0F);
				local144.method3835(local17, null, 0);
				arg0.method2823(local149, local152);
				arg0.method2852(true);
			}
		}
		@Pc(175) Class12_Sub4 local175 = null;
		if (this.method4340()) {
			local175 = Static147.method2706(super.aClass31Array3.length);
		}
		if (super.aClass12_Sub5_3 == null) {
			arg0.method2881(super.aClass31Array3, local17, local175 == null ? null : local175.aClass12_Sub2Array1, 0);
		} else {
			@Pc(211) Class224 local211 = super.aClass12_Sub5_3.method4358();
			arg0.method2830(super.aClass31Array3, local211, local17, local175 == null ? null : local175.aClass12_Sub2Array1, 0);
		}
		this.method4333(arg0, super.aClass31Array3, false);
		if (super.aClass31Array3[2] != null) {
			if (local22 != 0) {
				super.aClass31Array3[2].method3833(local22);
			}
			super.aClass31Array3[2].method3813(-super.aClass2_Sub6_3.anInt1104 + super.anInt6781, super.anInt6782 + -super.aClass2_Sub6_3.anInt1114, super.anInt6783 - super.aClass2_Sub6_3.anInt1101);
		}
		super.anInt4603 = Static163.anInt3086;
		return local175;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZI)V")
	public void method4339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte78 = (byte) arg1;
		if (super.anInt4597 != -1 && Static39.aClass85_1.method2371(super.anInt4597).anInt4029 == 1) {
			super.anInt4597 = -1;
		}
		if (super.anInt4594 != -1) {
			@Pc(37) Class91 local37 = Static322.aClass211_2.method5407(super.anInt4594);
			if (local37.aBoolean177 && local37.anInt2448 != -1 && Static39.aClass85_1.method2371(local37.anInt2448).anInt4029 == 1) {
				super.anInt4594 = -1;
			}
		}
		if (!arg3) {
			@Pc(67) int local67 = arg2 - super.anIntArray316[0];
			@Pc(75) int local75 = arg4 - super.anIntArray317[0];
			if (local67 >= -8 && local67 <= 8 && local75 >= -8 && local75 <= 8) {
				if (super.anInt4643 < 9) {
					super.anInt4643++;
				}
				for (@Pc(108) int local108 = super.anInt4643; local108 > 0; local108--) {
					super.anIntArray316[local108] = super.anIntArray316[local108 - 1];
					super.anIntArray317[local108] = super.anIntArray317[local108 - 1];
					super.aByteArray51[local108] = super.aByteArray51[local108 - 1];
				}
				super.anIntArray316[0] = arg2;
				super.anIntArray317[0] = arg4;
				super.aByteArray51[0] = 1;
				return;
			}
		}
		super.anInt4643 = 0;
		super.anIntArray316[0] = arg2;
		super.anInt4641 = 0;
		super.anInt4642 = 0;
		super.anIntArray317[0] = arg4;
		super.anInt6781 = arg0 * 64 + super.anIntArray316[0] * 128;
		super.anInt6783 = super.anIntArray317[0] * 128 + arg0 * 64;
		if (super.aClass12_Sub5_3 != null) {
			super.aClass12_Sub5_3.method4359();
		}
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)I")
	@Override
	public int method6080() {
		return super.anInt4630;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.aClass71_1 == null || !this.method4335(65536, arg2)) {
			return false;
		}
		@Pc(19) Class14 local19 = arg2.method2808();
		@Pc(24) int local24 = super.aClass248_7.method6441();
		local19.method3925(local24);
		local19.method3936(super.anInt6781, super.anInt6782, super.anInt6783);
		for (@Pc(43) int local43 = 0; super.aClass31Array3.length > local43; local43++) {
			if (super.aClass31Array3[local43] != null && super.aClass31Array3[local43].method3820(arg0, arg1, local19, this.aClass71_1.anInt2041 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
	@Override
	public int method4323() {
		if (this.aClass71_1.anIntArray129 != null) {
			@Pc(21) Class71 local21 = this.aClass71_1.method2093(Static214.aClass226_1);
			if (local21 != null && local21.anInt2010 != -1) {
				return local21.anInt2010;
			}
		}
		return this.aClass71_1.anInt2010 == -1 ? super.method4323() : this.aClass71_1.anInt2010;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "(I)Z")
	private boolean method4340() {
		return this.aClass71_1.aBoolean145;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)I")
	@Override
	protected int method4329() {
		if (this.aClass71_1.anIntArray129 != null) {
			@Pc(19) Class71 local19 = this.aClass71_1.method2093(Static214.aClass226_1);
			if (local19 != null && local19.anInt2032 != -1) {
				return local19.anInt2032;
			}
		}
		return this.aClass71_1.anInt2032;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
		if (this.aClass71_1 != null && (super.aBoolean321 || this.method4335(0, arg0))) {
			this.method4333(arg0, super.aClass31Array3, super.aBoolean321);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!fk;I)V")
	public void method4342(@OriginalArg(0) Class71 arg0) {
		this.aClass71_1 = arg0;
		if (super.aClass12_Sub5_3 != null) {
			super.aClass12_Sub5_3.method4359();
		}
	}
}
