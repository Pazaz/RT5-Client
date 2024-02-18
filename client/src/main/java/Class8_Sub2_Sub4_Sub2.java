import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class8_Sub2_Sub4_Sub2 extends Class8_Sub2_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "Lclient!ke;")
	private Class205 aClass205_8;

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "Z")
	private boolean aBoolean588 = true;

	@OriginalMember(owner = "client!qg", name = "bb", descriptor = "Lclient!sh;")
	public Class337 aClass337_4;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "Z")
	private final boolean aBoolean587;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIII)V")
	public Class8_Sub2_Sub4_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass337_4 = new Class337(arg0, arg1, arg10, arg11, super.aByte144, arg3, this, arg7, arg12);
		this.aBoolean587 = arg1.anInt1271 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)I")
	@Override
	public int method9292(@OriginalArg(0) byte arg0) {
		return arg0 == -21 ? this.aClass337_4.method7673(true) : -55;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
	@Override
	public int method6858() {
		return this.aClass337_4.anInt8645;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class114 local14 = this.aClass337_4.method7678(arg0, false, true, true, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class73 local22 = arg0.method7985();
		local22.method7125(super.anInt10690 + super.aShort101, super.anInt10691, super.anInt10694 + super.aShort102);
		@Pc(42) Class8_Sub7 local42 = Static642.method8441(this.aBoolean587, 1);
		@Pc(55) int local55 = super.anInt10690 >> 9;
		@Pc(60) int local60 = super.anInt10694 >> 9;
		this.aClass337_4.method7681(local60, local14, true, -9827, arg0, local55, local55, local60, local22);
		if (Static504.aBoolean579) {
			local14.method7484(local22, local42.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			local14.method7473(local22, local42.aClass8_Sub6Array1[0], 0);
		}
		if (this.aClass337_4.aClass8_Sub5_7 != null) {
			@Pc(106) Class230 local106 = this.aClass337_4.aClass8_Sub5_7.method3645();
			if (Static504.aBoolean579) {
				arg0.method7967(local106, Static582.anInt8627);
			} else {
				arg0.method8021(local106);
			}
		}
		this.aBoolean588 = local14.F() || this.aClass337_4.aClass8_Sub5_7 != null;
		if (this.aClass205_8 == null) {
			this.aClass205_8 = Static317.method4583(super.anInt10691, super.anInt10690, local14, super.anInt10694);
		} else {
			Static223.method9103(local14, super.anInt10694, super.anInt10691, super.anInt10690, this.aClass205_8);
		}
		return local42;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I")
	@Override
	public int method6855(@OriginalArg(0) int arg0) {
		return arg0 == 23796 ? this.aClass337_4.anInt8663 : -54;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
	@Override
	public void method6856() {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6857(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		this.aClass337_4.method7669(arg0);
		if (arg1 < -42) {
			;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(17) Class114 local17 = this.aClass337_4.method7678(arg3, false, !arg2, arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(25) Class73 local25 = arg3.method7985();
			local25.method7125(super.aShort101 + super.anInt10690, super.anInt10691, super.anInt10694 + super.aShort102);
			return Static504.aBoolean579 ? local17.method7483(arg1, arg0, local25, false, 0, Static582.anInt8627) : local17.method7486(arg1, arg0, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!gp;B)V")
	public void method6862(@OriginalArg(0) Class150 arg0) {
		this.aClass337_4.method7679(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6860(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.method6856();
		}
		return this.aClass337_4.method7675(10);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9283() {
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return arg1 >= -93 ? null : this.aClass205_8;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6861(@OriginalArg(0) Class19 arg0) {
		this.aClass337_4.method7668(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9282(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aBoolean588 : true;
	}

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(I)I")
	@Override
	public int method9286(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? this.aClass337_4.method7671() : 14;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			this.method6862((Class150) null);
		}
		@Pc(21) Class114 local21 = this.aClass337_4.method7678(arg0, false, true, true, 262144);
		if (local21 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt10690 >> 9;
		@Pc(33) int local33 = super.anInt10694 >> 9;
		@Pc(36) Class73 local36 = arg0.method7985();
		local36.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		this.aClass337_4.method7681(local33, local21, false, arg1 - 9822, arg0, local28, local28, local33, local36);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	@Override
	public int method6859(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			this.aClass337_4 = null;
		}
		return this.aClass337_4.anInt8649;
	}
}
