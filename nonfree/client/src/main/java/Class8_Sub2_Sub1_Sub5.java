import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pja")
public final class Class8_Sub2_Sub1_Sub5 extends Class8_Sub2_Sub1 {

	@OriginalMember(owner = "client!pja", name = "qb", descriptor = "Lclient!hv;")
	private Class8_Sub5 aClass8_Sub5_5;

	@OriginalMember(owner = "client!pja", name = "O", descriptor = "I")
	private int anInt7400 = 0;

	@OriginalMember(owner = "client!pja", name = "jb", descriptor = "I")
	private int anInt7393 = 0;

	@OriginalMember(owner = "client!pja", name = "gb", descriptor = "Z")
	private boolean aBoolean562 = true;

	@OriginalMember(owner = "client!pja", name = "Q", descriptor = "I")
	private int anInt7412 = 0;

	@OriginalMember(owner = "client!pja", name = "R", descriptor = "I")
	private final int anInt7402;

	@OriginalMember(owner = "client!pja", name = "V", descriptor = "Lclient!gu;")
	private Class152 aClass152_8;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class8_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt7402 = arg0;
		this.anInt7400 = arg11;
		@Pc(36) Class227 local36 = Static23.aClass128_1.method2694(this.anInt7402);
		@Pc(39) int local39 = local36.anInt5842;
		if (local39 != -1) {
			this.aClass152_8 = new Class152_Sub2(this, false);
			@Pc(59) int local59 = local36.aBoolean448 ? 0 : 2;
			if (arg12) {
				local59 = 1;
			}
			this.aClass152_8.method9092(local39, arg1, local59, false);
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Lclient!tt;Lclient!ka;ILclient!ha;)V")
	private void method6593(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(3) Class19 arg2) {
		arg1.method7476(arg0);
		@Pc(9) Class328[] local9 = arg1.method7482();
		@Pc(19) Class249[] local19 = arg1.method7480();
		if ((this.aClass8_Sub5_5 == null || this.aClass8_Sub5_5.aBoolean324) && (local9 != null || local19 != null)) {
			this.aClass8_Sub5_5 = Static257.method3654(Static333.anInt5455, true);
		}
		if (this.aClass8_Sub5_5 != null) {
			this.aClass8_Sub5_5.method3643(arg2, (long) Static333.anInt5455, local9, local19);
			this.aClass8_Sub5_5.method3658(super.aByte144, super.aShort131, super.aShort134, super.aShort132, super.aShort133);
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IILclient!ha;I)Lclient!ka;")
	private Class114 method6594(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class227 local8 = Static23.aClass128_1.method2694(arg0);
		@Pc(22) Class178 local22 = Static706.aClass178Array3[super.aByte144];
		@Pc(36) Class178 local36 = super.aByte143 < 3 ? Static706.aClass178Array3[super.aByte143 + 1] : null;
		return this.aClass152_8 == null || this.aClass152_8.method9102() ? local8.method5249((byte) 2, true, super.anInt10694, (Class152) null, local36, super.anInt10690, local22, arg2, super.anInt10691, arg1) : local8.method5249((byte) 2, true, super.anInt10694, this.aClass152_8, local36, super.anInt10690, local22, arg2, super.anInt10691, arg1);
	}

	@OriginalMember(owner = "client!pja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_5 != null) {
			this.aClass8_Sub5_5.method3644();
		}
	}

	@OriginalMember(owner = "client!pja", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9289(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			this.method9289((Class19) null, 72);
		}
		@Pc(20) Class114 local20 = this.method6594(this.anInt7402, arg0, 0);
		if (local20 != null) {
			@Pc(25) Class73 local25 = arg0.method7985();
			local25.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
			this.method6593(local25, local20, arg0);
		}
	}

	@OriginalMember(owner = "client!pja", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9290(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			Static494.anInt7409 = 119;
		}
		return false;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)Z")
	public boolean method6595() {
		return this.aClass152_8 != null && !this.aClass152_8.method9106();
	}

	@OriginalMember(owner = "client!pja", name = "j", descriptor = "(I)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0) {
		if (arg0 == 27811) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!pja", name = "k", descriptor = "(I)I")
	@Override
	public int method9286(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.method9282(113);
		}
		return this.anInt7412;
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(B)I")
	@Override
	public int method9292(@OriginalArg(0) byte arg0) {
		if (arg0 != -21) {
			this.finalize();
		}
		return this.anInt7393;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V")
	public void method6598() {
		if (this.aClass152_8 != null && !this.aClass152_8.method9102()) {
			this.aClass152_8.method9112(1);
		}
	}

	@OriginalMember(owner = "client!pja", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9282(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aBoolean562 : false;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (arg2) {
			this.method9286(-24);
		}
		return false;
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(I)V")
	public void method6600() {
		if (this.aClass8_Sub5_5 != null) {
			this.aClass8_Sub5_5.method3644();
		}
	}

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 method9278(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -93) {
			this.method9279(-78, 64, true, (Class19) null);
		}
		return null;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 < 101) {
			this.method9276((Class19) null);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9276(@OriginalArg(1) Class19 arg0) {
		@Pc(24) Class114 local24 = this.method6594(this.anInt7402, arg0, (this.anInt7400 == 0 ? 0 : 5) | 0x800);
		if (local24 == null) {
			return null;
		}
		if (this.anInt7400 != 0) {
			local24.a(this.anInt7400 * 2048);
		}
		@Pc(43) Class73 local43 = arg0.method7985();
		local43.method7125(super.anInt10690, super.anInt10691, super.anInt10694);
		this.method6593(local43, local24, arg0);
		@Pc(62) Class8_Sub7 local62 = Static642.method8441(false, 1);
		if (Static504.aBoolean579) {
			local24.method7484(local43, local62.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			local24.method7473(local43, local62.aClass8_Sub6Array1[0], 0);
		}
		if (this.aClass8_Sub5_5 != null) {
			@Pc(102) Class230 local102 = this.aClass8_Sub5_5.method3645();
			if (Static504.aBoolean579) {
				arg0.method7967(local102, Static582.anInt8627);
			} else {
				arg0.method8021(local102);
			}
		}
		this.aBoolean562 = local24.F();
		this.anInt7412 = local24.fa();
		this.anInt7393 = local24.ma();
		return local62;
	}

	@OriginalMember(owner = "client!pja", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9283() {
		return false;
	}

	@OriginalMember(owner = "client!pja", name = "d", descriptor = "(I)Z")
	public boolean method6603() {
		return this.aClass152_8 == null || this.aClass152_8.method9102();
	}
}
