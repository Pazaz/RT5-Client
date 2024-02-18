import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class8_Sub2_Sub3_Sub1 extends Class8_Sub2_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!db", name = "N", descriptor = "Lclient!ke;")
	private Class205 aClass205_2;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "Lclient!sh;")
	public Class337 aClass337_1;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "Z")
	private final boolean aBoolean192;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIII)V")
	public Class8_Sub2_Sub3_Sub1(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static372.method5290(arg9, arg8));
		this.aClass337_1 = new Class337(arg0, arg1, arg8, arg9, super.aByte144, arg3, this, arg7, arg10);
		this.aBoolean192 = arg1.anInt1271 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!gp;I)V")
	public void method1963(@OriginalArg(0) Class150 arg0) {
		this.aClass337_1.method7679(arg0);
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I")
	@Override
	public int method6855(@OriginalArg(0) int arg0) {
		if (arg0 != 23796) {
			this.method9286(52);
		}
		return this.aClass337_1.anInt8663;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6861(@OriginalArg(0) Class19 arg0) {
		this.aClass337_1.method7668(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	@Override
	public int method6859(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			this.aClass205_2 = null;
		}
		return this.aClass337_1.anInt8649;
	}

	@OriginalMember(owner = "client!db", name = "j", descriptor = "(I)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0) {
		if (arg0 != 27811) {
			this.method9279(-29, 50, false, (Class19) null);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!db", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9290(@OriginalArg(0) int arg0) {
		return arg0 != 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class114 local14 = this.aClass337_1.method7678(arg0, false, true, true, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class73 local22 = arg0.method7985();
		local22.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(36) Class8_Sub7 local36 = Static642.method8441(this.aBoolean192, 1);
		@Pc(49) int local49 = super.anInt10690 >> 9;
		@Pc(54) int local54 = super.anInt10694 >> 9;
		this.aClass337_1.method7681(local54, local14, true, -9827, arg0, local49, local49, local54, local22);
		if (Static504.aBoolean579) {
			local14.method7484(local22, local36.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			local14.method7473(local22, local36.aClass8_Sub6Array1[0], 0);
		}
		if (this.aClass337_1.aClass8_Sub5_7 != null) {
			@Pc(100) Class230 local100 = this.aClass337_1.aClass8_Sub5_7.method3645();
			if (Static504.aBoolean579) {
				arg0.method7967(local100, Static582.anInt8627);
			} else {
				arg0.method8021(local100);
			}
		}
		this.aBoolean193 = local14.F() || this.aClass337_1.aClass8_Sub5_7 != null;
		if (this.aClass205_2 == null) {
			this.aClass205_2 = Static317.method4583(super.anInt10691, super.anInt10690, local14, super.anInt10694);
		} else {
			Static223.method9103(local14, super.anInt10694, super.anInt10691, super.anInt10690, this.aClass205_2);
		}
		return local36;
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9282(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			Static98.anIntArray176 = null;
		}
		return this.aBoolean193;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 >= 101) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(12) Class114 local12 = this.aClass337_1.method7678(arg3, false, true, arg2, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class73 local20 = arg3.method7985();
			local20.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
			return Static504.aBoolean579 ? local12.method7483(arg1, arg0, local20, false, 0, Static582.anInt8627) : local12.method7486(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
	@Override
	public int method9292(@OriginalArg(0) byte arg0) {
		if (arg0 != -21) {
			this.method9292((byte) -62);
		}
		return this.aClass337_1.method7673(true);
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			return;
		}
		@Pc(17) Class114 local17 = this.aClass337_1.method7678(arg0, true, true, true, 262144);
		if (local17 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt10690 >> 9;
		@Pc(29) int local29 = super.anInt10694 >> 9;
		@Pc(32) Class73 local32 = arg0.method7985();
		local32.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		this.aClass337_1.method7681(local29, local17, false, -9827, arg0, local24, local24, local29, local32);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6857(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < -42) {
			this.aClass337_1.method7669(arg0);
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	@Override
	public void method6856() {
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9283() {
		return false;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -93) {
			this.aClass205_2 = null;
		}
		return this.aClass205_2;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6860(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.aClass337_1 = null;
		}
		return this.aClass337_1.method7675(arg0 + 19727);
	}

	@OriginalMember(owner = "client!db", name = "k", descriptor = "(I)I")
	@Override
	public int method9286(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? this.aClass337_1.method7671() : 103;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
	@Override
	public int method6858() {
		return this.aClass337_1.anInt8645;
	}
}
