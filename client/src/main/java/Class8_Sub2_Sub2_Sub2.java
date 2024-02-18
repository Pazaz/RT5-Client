import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class8_Sub2_Sub2_Sub2 extends Class8_Sub2_Sub2 implements Interface25 {

	@OriginalMember(owner = "client!hp", name = "V", descriptor = "Lclient!ke;")
	private Class205 aClass205_3;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "Z")
	private boolean aBoolean317 = true;

	@OriginalMember(owner = "client!hp", name = "eb", descriptor = "Lclient!sh;")
	public Class337 aClass337_2;

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZII)V")
	public Class8_Sub2_Sub2_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt1227);
		this.aClass337_2 = new Class337(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean318 = arg1.anInt1271 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(12) Class114 local12 = this.aClass337_2.method7678(arg3, false, true, arg2, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class73 local20 = arg3.method7985();
			local20.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
			return Static504.aBoolean579 ? local12.method7483(arg1, arg0, local20, false, 0, Static582.anInt8627) : local12.method7486(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9290(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass205_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			this.method3581((Class150) null);
		}
		@Pc(21) Class114 local21 = this.aClass337_2.method7678(arg0, true, true, true, 262144);
		if (local21 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt10690 >> 9;
		@Pc(33) int local33 = super.anInt10694 >> 9;
		@Pc(36) Class73 local36 = arg0.method7985();
		local36.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		this.aClass337_2.method7681(local33, local21, false, -9827, arg0, local28, local28, local33, local36);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!gp;I)V")
	public void method3581(@OriginalArg(0) Class150 arg0) {
		this.aClass337_2.method7679(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6857(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		this.aClass337_2.method7669(arg0);
		if (arg1 > -42) {
			this.method9282(-38);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6861(@OriginalArg(0) Class19 arg0) {
		this.aClass337_2.method7668(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 < 101) {
			this.aBoolean317 = true;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)I")
	@Override
	public int method6859(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			this.method9282(69);
		}
		return this.aClass337_2.anInt8649;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9283() {
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -93) {
			Static252.aBoolean316 = true;
		}
		return this.aClass205_3;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(I)I")
	@Override
	public int method9286(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.method6857((Class19) null, 33);
		}
		return this.aClass337_2.method7671();
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6860(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.aClass337_2 = null;
		}
		return this.aClass337_2.method7675(arg0 + 19727);
	}

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "(I)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0) {
		if (arg0 != 27811) {
			this.method6860(81);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		@Pc(22) Class114 local22 = this.aClass337_2.method7678(arg0, false, true, true, 2048);
		if (local22 == null) {
			return null;
		}
		@Pc(30) Class73 local30 = arg0.method7985();
		local30.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(44) Class8_Sub7 local44 = Static642.method8441(this.aBoolean318, 1);
		@Pc(49) int local49 = super.anInt10690 >> 9;
		@Pc(54) int local54 = super.anInt10694 >> 9;
		this.aClass337_2.method7681(local54, local22, true, -9827, arg0, local49, local49, local54, local30);
		if (Static504.aBoolean579) {
			local22.method7484(local30, local44.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			local22.method7473(local30, local44.aClass8_Sub6Array1[0], 0);
		}
		if (this.aClass337_2.aClass8_Sub5_7 != null) {
			@Pc(100) Class230 local100 = this.aClass337_2.aClass8_Sub5_7.method3645();
			if (Static504.aBoolean579) {
				arg0.method7967(local100, Static582.anInt8627);
			} else {
				arg0.method8021(local100);
			}
		}
		this.aBoolean317 = local22.F() || this.aClass337_2.aClass8_Sub5_7 != null;
		if (this.aClass205_3 == null) {
			this.aClass205_3 = Static317.method4583(super.anInt10691, super.anInt10690, local22, super.anInt10694);
		} else {
			Static223.method9103(local22, super.anInt10694, super.anInt10691, super.anInt10690, this.aClass205_3);
		}
		return local44;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)I")
	@Override
	public int method6855(@OriginalArg(0) int arg0) {
		if (arg0 != 23796) {
			Static252.aBoolean316 = false;
		}
		return this.aClass337_2.anInt8663;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)I")
	@Override
	public int method9292(@OriginalArg(0) byte arg0) {
		if (arg0 != -21) {
			this.aBoolean317 = true;
		}
		return this.aClass337_2.method7673(true);
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9282(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aBoolean317 : true;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
	@Override
	public int method6858() {
		return this.aClass337_2.anInt8645;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
	@Override
	public void method6856() {
	}
}
