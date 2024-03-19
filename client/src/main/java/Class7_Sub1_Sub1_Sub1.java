import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class7_Sub1_Sub1_Sub1 extends Class7_Sub1_Sub1 {

	@OriginalMember(owner = "client!ai", name = "Fc", descriptor = "Lclient!gj;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!gj;)V")
	public void method330(@OriginalArg(1) Class75 arg0) {
		this.aClass75_1 = arg0;
		if (super.aClass2_Sub7_7 != null) {
			super.aClass2_Sub7_7.method4745();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
		if (this.aClass75_1 != null && (super.aBoolean510 || this.method334(0, arg0))) {
			this.method5969(arg0, super.aClass86Array3, super.aBoolean510);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Z")
	public boolean method331() {
		return this.aClass75_1 != null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
	@Override
	protected int method5970() {
		if (this.aClass75_1.anIntArray155 != null) {
			@Pc(12) Class75 local12 = this.aClass75_1.method2064();
			if (local12 != null && local12.anInt2463 != -1) {
				return local12.anInt2463;
			}
		}
		return this.aClass75_1.anInt2463;
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)Z")
	private boolean method332() {
		return this.aClass75_1.aBoolean164;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!nr;)Z")
	private boolean method334(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(11) Class83 local11 = this.method5982();
		@Pc(28) Class165 local28 = super.anInt7046 != -1 && super.anInt7055 == 0 ? Static231.method4385(super.anInt7046) : null;
		@Pc(45) Class165 local45 = super.anInt7053 == -1 || super.aBoolean506 && local28 != null ? null : Static231.method4385(super.anInt7053);
		@Pc(48) int local48 = local11.anInt2844;
		@Pc(51) int local51 = local11.anInt2846;
		if (local48 != 0 || local51 != 0 || local11.anInt2830 != 0 || local11.anInt2838 != 0) {
			arg0 |= 0x7;
		}
		@Pc(104) Class86 local104 = super.aClass86Array3[0] = this.aClass75_1.method2063(super.anInt7096, super.anInt7037, super.aClass147Array3, local28, local45, super.anInt7035, arg1, super.anInt7047, super.anInt7097, arg0, super.anInt7057);
		if (local104 == null) {
			return false;
		}
		super.anInt7062 = local104.method5534();
		this.method5979(local104);
		@Pc(121) int local121 = super.aClass175_7.method4862();
		super.anInt7051 = 0;
		super.anInt7036 = 0;
		super.anInt7071 = 0;
		if (local48 == 0 && local51 == 0) {
			this.method5974(this.method5973() << 7, this.method5973() << 7, local121);
		} else {
			this.method5974(local51, local48, local121);
			if (super.anInt7051 != 0) {
				super.aClass86Array3[0].method5566(super.anInt7051);
			}
			if (super.anInt7071 != 0) {
				super.aClass86Array3[0].method5529(super.anInt7071);
			}
			if (super.anInt7036 != 0) {
				super.aClass86Array3[0].method5550(0, super.anInt7036, 0);
			}
		}
		super.aClass86Array3[1] = null;
		if (super.anInt7052 != -1 && super.anInt7060 != -1) {
			@Pc(210) Class122 local210 = Static243.method4561(super.anInt7052);
			@Pc(229) Class86 local229 = local210.method3543(super.anInt7060, super.anInt7082, super.anInt7050, (local210.aBoolean293 ? 7 : 2) | local5, arg1);
			if (local229 != null) {
				local229.method5550(0, -super.anInt7080, 0);
				if (local210.aBoolean293 && (local48 != 0 || local51 != 0)) {
					if (super.anInt7051 != 0) {
						local229.method5566(super.anInt7051);
					}
					if (super.anInt7071 != 0) {
						local229.method5529(super.anInt7071);
					}
					if (super.anInt7036 != 0) {
						local229.method5550(0, super.anInt7036, 0);
					}
				}
				super.aClass86Array3[1] = local229;
			}
		}
		super.aClass86Array3[2] = null;
		if (super.anInterface6_3 != null) {
			if (Static197.anInt4521 >= super.anInt7112) {
				super.anInterface6_3 = null;
			}
			if (Static197.anInt4521 >= super.anInt7108 && super.anInt7112 > Static197.anInt4521) {
				@Pc(319) Class86 local319 = super.anInterface6_3.method5681(local5 | 0x7, arg1);
				if (local319 != null) {
					local319.method5550(-super.anInt7027 + super.anInt7110, -super.anInt7031 + super.anInt7109, super.anInt7107 - super.anInt7032);
					if (local121 != 0) {
						local319.method5542(local121);
					}
					super.aClass86Array3[2] = local319;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass75_1 == null || !this.method334(65536, arg1)) {
			return false;
		}
		@Pc(17) Class11 local17 = arg1.method2782();
		@Pc(22) int local22 = super.aClass175_7.method4862();
		local17.method5492(local22);
		local17.method5496(super.anInt7027, super.anInt7031, super.anInt7032);
		for (@Pc(35) int local35 = 0; super.aClass86Array3.length > local35; local35++) {
			if (super.aClass86Array3[local35] != null) {
				return super.aClass86Array3[local35].method5556(arg2, arg0, local17, this.aClass75_1.anInt2458 == 1);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)I")
	@Override
	public int method5961() {
		return super.anInt7062;
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(B)I")
	@Override
	public int method5984() {
		if (this.aClass75_1.anIntArray155 != null) {
			@Pc(18) Class75 local18 = this.aClass75_1.method2064();
			if (local18 != null && local18.anInt2492 != -1) {
				return local18.anInt2492;
			}
		}
		return this.aClass75_1.anInt2492;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)I")
	@Override
	public int method5983() {
		if (this.aClass75_1.anIntArray155 != null) {
			@Pc(12) Class75 local12 = this.aClass75_1.method2064();
			if (local12 != null && local12.anInt2461 != -1) {
				return local12.anInt2461;
			}
		}
		return this.aClass75_1.anInt2461 == -1 ? super.method5983() : this.aClass75_1.anInt2461;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		if (this.aClass75_1 == null || !this.method334(1024, arg0)) {
			return null;
		}
		@Pc(17) Class11 local17 = arg0.method2782();
		@Pc(22) int local22 = super.aClass175_7.method4862();
		local17.method5492(local22);
		local17.method5489(super.anInt7027, super.anInt7031, super.anInt7032);
		@Pc(37) Class83 local37 = this.method5982();
		@Pc(53) Class75 local53 = this.aClass75_1.anIntArray155 == null ? this.aClass75_1 : this.aClass75_1.method2064();
		if (Static190.aBoolean378 && local53.aBoolean168 && local37.aBoolean189) {
			@Pc(78) Class165 local78 = super.anInt7046 != -1 && super.anInt7055 == 0 ? Static231.method4385(super.anInt7046) : null;
			@Pc(95) Class165 local95 = super.anInt7053 == -1 || super.aBoolean506 && local78 != null ? null : Static231.method4385(super.anInt7053);
			@Pc(147) Class86 local147 = Static232.method4422(this.aClass75_1.aShort39 & 0xFFFF, arg0, local95 == null ? local78 : local95, this.aClass75_1.aByte31 & 0xFF, super.anInt7036, local22, super.aBoolean508, local95 == null ? super.anInt7047 : super.anInt7035, super.aClass86Array3[0], super.anInt7051, super.anInt7071, this.aClass75_1.aShort38 & 0xFFFF, this.aClass75_1.anInt2458, this.aClass75_1.aByte30 & 0xFF);
			if (local147 != null) {
				@Pc(152) float local152 = arg0.method2706();
				@Pc(155) float local155 = arg0.method2783();
				arg0.method2721(false);
				arg0.method2796(local152, local155 - 150.0F);
				local147.method5539(local17, null, 0);
				arg0.method2796(local152, local155);
				arg0.method2721(true);
			}
		}
		@Pc(178) Class2_Sub3 local178 = null;
		if (this.method332()) {
			local178 = Static159.method3981(super.aClass86Array3.length);
		}
		if (super.aClass2_Sub7_7 == null) {
			arg0.method2740(super.aClass86Array3, local17, local178 == null ? null : local178.aClass2_Sub6Array1, 0);
		} else {
			@Pc(195) Class117 local195 = super.aClass2_Sub7_7.method4737();
			arg0.method2778(super.aClass86Array3, local195, local17, local178 == null ? null : local178.aClass2_Sub6Array1, 0);
		}
		this.method5969(arg0, super.aClass86Array3, false);
		if (super.aClass86Array3[2] != null) {
			if (local22 != 0) {
				super.aClass86Array3[2].method5542(local22);
			}
			super.aClass86Array3[2].method5550(-super.anInt7110 + super.anInt7027, super.anInt7031 - super.anInt7109, super.anInt7032 - super.anInt7107);
		}
		return local178;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		throw new IllegalStateException();
	}
}
