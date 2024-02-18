import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class8_Sub2_Sub2_Sub1 extends Class8_Sub2_Sub2 implements Interface25 {

	@OriginalMember(owner = "client!cu", name = "fb", descriptor = "Lclient!ke;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "client!cu", name = "W", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!cu", name = "F", descriptor = "B")
	private byte aByte38;

	@OriginalMember(owner = "client!cu", name = "jb", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!cu", name = "ab", descriptor = "Z")
	private final boolean aBoolean183;

	@OriginalMember(owner = "client!cu", name = "U", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!cu", name = "S", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!cu", name = "R", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!cu", name = "bb", descriptor = "Lclient!ka;")
	private Class114 aClass114_1;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIZ)V")
	public Class8_Sub2_Sub2_Sub1(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt1227);
		this.aShort20 = (short) arg1.anInt1256;
		super.anInt10694 = arg6;
		this.aByte38 = (byte) arg8;
		this.aBoolean182 = arg1.anInt1271 != 0 && !arg7;
		super.anInt10690 = arg4;
		this.aBoolean183 = arg7;
		this.aBoolean180 = arg9;
		this.aBoolean181 = arg0.method8006() && arg1.aBoolean89 && !this.aBoolean183 && Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4364() != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean180) {
			local68 |= 0x10000;
		}
		@Pc(83) Class272 local83 = this.method1831(local68, 20, arg0, this.aBoolean181);
		if (local83 != null) {
			this.aClass2_Sub2_Sub9_1 = local83.aClass2_Sub2_Sub9_5;
			this.aClass114_1 = local83.aClass114_7;
			if (this.aBoolean180) {
				this.aClass114_1 = this.aClass114_1.method7495((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9283() {
		if (this.aClass114_1 == null) {
			return true;
		} else {
			return !this.aClass114_1.r();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		if (this.aClass114_1 == null) {
			return null;
		}
		@Pc(20) Class73 local20 = arg0.method7985();
		local20.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(34) Class8_Sub7 local34 = Static642.method8441(this.aBoolean182, 1);
		if (Static504.aBoolean579) {
			this.aClass114_1.method7484(local20, local34.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			this.aClass114_1.method7473(local20, local34.aClass8_Sub6Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "(I)I")
	@Override
	public int method9286(@OriginalArg(0) int arg0) {
		if (arg0 == 2) {
			return this.aClass114_1 == null ? 0 : this.aClass114_1.fa();
		} else {
			return 14;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 <= 101) {
			this.method1831(-126, -84, (Class19) null, false);
		}
		if (!(arg6 instanceof Class8_Sub2_Sub2_Sub1)) {
			return;
		}
		@Pc(21) Class8_Sub2_Sub2_Sub1 local21 = (Class8_Sub2_Sub2_Sub1) arg6;
		if (this.aClass114_1 != null && local21.aClass114_1 != null) {
			this.aClass114_1.method7481(local21.aClass114_1, arg5, arg0, arg3, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (arg2) {
			Static93.aClass390_1 = null;
		}
		@Pc(16) Class114 local16 = this.method1834(arg3, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class73 local21 = arg3.method7985();
			local21.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
			return Static504.aBoolean579 ? local16.method7483(arg1, arg0, local21, false, 0, Static582.anInt8627) : local16.method7486(arg1, arg0, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6861(@OriginalArg(0) Class19 arg0) {
		@Pc(33) Class2_Sub2_Sub9 local33;
		if (this.aClass2_Sub2_Sub9_1 == null && this.aBoolean181) {
			@Pc(25) Class272 local25 = this.method1831(262144, 20, arg0, true);
			local33 = local25 == null ? null : local25.aClass2_Sub2_Sub9_5;
		} else {
			local33 = this.aClass2_Sub2_Sub9_1;
			this.aClass2_Sub2_Sub9_1 = null;
		}
		if (local33 != null) {
			Static630.method8357(local33, super.aByte143, super.anInt10690, super.anInt10694, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!ha;Z)Lclient!od;")
	private Class272 method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(13) Class54 local13 = Static354.aClass142_4.method3063(this.aShort20 & 0xFFFF, arg1 + 35);
		if (arg1 != 20) {
			this.aShort20 = -113;
		}
		@Pc(29) Class178 local29;
		@Pc(35) Class178 local35;
		if (this.aBoolean183) {
			local29 = Static693.aClass178Array2[super.aByte143];
			local35 = Static706.aClass178Array3[0];
		} else {
			local29 = Static706.aClass178Array3[super.aByte143];
			if (super.aByte143 >= 3) {
				local35 = null;
			} else {
				local35 = Static706.aClass178Array3[super.aByte143 + 1];
			}
		}
		return local13.method1309(this.aByte38, super.anInt10694, super.anInt10690, local29, arg3, super.anInt10691, 22, arg2, (Class150) null, arg0, local35);
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9282(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aByte38 = 33;
		}
		return this.aClass114_1 == null ? false : this.aClass114_1.F();
	}

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9290(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method6856();
		}
		return this.aBoolean180;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass205_1 == null) {
			this.aClass205_1 = Static317.method4583(super.anInt10691, super.anInt10690, this.method1834(arg0, 0), super.anInt10694);
		}
		if (arg1 >= -93) {
			this.aClass205_1 = null;
		}
		return this.aClass205_1;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)I")
	@Override
	public int method6855(@OriginalArg(0) int arg0) {
		if (arg0 != 23796) {
			this.method9285(90, false, (Class19) null, -97, (byte) -34, 87, (Class8_Sub2) null);
		}
		return this.aByte38;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6857(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -42) {
			this.method6859(-92);
		}
		@Pc(25) Class2_Sub2_Sub9 local25;
		if (this.aClass2_Sub2_Sub9_1 == null && this.aBoolean181) {
			@Pc(36) Class272 local36 = this.method1831(262144, 20, arg0, true);
			local25 = local36 == null ? null : local36.aClass2_Sub2_Sub9_5;
		} else {
			local25 = this.aClass2_Sub2_Sub9_1;
			this.aClass2_Sub2_Sub9_1 = null;
		}
		if (local25 != null) {
			Static292.method4618(local25, super.aByte143, super.anInt10690, super.anInt10694, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "(I)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0) {
		this.aBoolean180 = false;
		if (arg0 == 27811 && this.aClass114_1 != null) {
			this.aClass114_1.s(this.aClass114_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I")
	@Override
	public int method6859(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			this.aBoolean181 = false;
		}
		return this.aShort20 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)V")
	@Override
	public void method6856() {
		if (this.aClass114_1 != null) {
			this.aClass114_1.method7479();
		}
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			Static93.aClass390_1 = null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
	@Override
	public int method6858() {
		return 22;
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6860(@OriginalArg(0) int arg0) {
		return arg0 == -19717 ? this.aBoolean181 : false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class114 method1834(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass114_1 != null && arg0.method7960(this.aClass114_1.ua(), arg1) == 0) {
			return this.aClass114_1;
		} else {
			@Pc(26) Class272 local26 = this.method1831(arg1, 20, arg0, false);
			return local26 == null ? null : local26.aClass114_7;
		}
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)I")
	@Override
	public int method9292(@OriginalArg(0) byte arg0) {
		if (arg0 == -21) {
			return this.aClass114_1 == null ? 0 : this.aClass114_1.ma();
		} else {
			return -86;
		}
	}
}
