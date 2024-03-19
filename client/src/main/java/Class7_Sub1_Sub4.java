import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class7_Sub1_Sub4 extends Class7_Sub1 {

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "Lclient!qp;")
	private Class2_Sub7 aClass2_Sub7_4;

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
	private final int anInt3590 = -1;

	@OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
	private int anInt3604 = 0;

	@OriginalMember(owner = "client!jl", name = "bb", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
	private int anInt3609 = -32768;

	@OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
	private int anInt3607 = 0;

	@OriginalMember(owner = "client!jl", name = "db", descriptor = "I")
	public final int anInt3610;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
	private final int anInt3592;

	@OriginalMember(owner = "client!jl", name = "Q", descriptor = "Lclient!qr;")
	private Class165 aClass165_2;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class7_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt3610 = arg2 + arg1;
		this.anInt3592 = arg0;
		@Pc(40) int local40 = Static243.method4561(this.anInt3592).anInt4135;
		if (local40 == -1) {
			this.aBoolean256 = true;
		} else {
			this.aBoolean256 = false;
			this.aClass165_2 = Static231.method4385(local40);
		}
		if (arg2 == this.anInt3610) {
			Static209.method4128(super.anInt7027, false, this.anInt3604, super.anInt7032, this.aClass165_2);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public void method3185() {
		if (this.aClass2_Sub7_4 != null) {
			this.aClass2_Sub7_4.method4743();
		}
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)I")
	@Override
	public int method5961() {
		return this.anInt3609;
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return false;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		@Pc(9) Class86 local9 = this.method3189(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class11 local16 = arg0.method2782();
		local16.method5496(super.anInt7027, super.anInt7031, super.anInt7032);
		if (this.aClass2_Sub7_4 == null) {
			local9.method5539(local16, null, 0);
		} else {
			@Pc(38) Class117 local38 = this.aClass2_Sub7_4.method4737();
			arg0.method2748(local9, local38, local16, null);
		}
		this.anInt3609 = local9.method5534();
		this.method3192(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!nr;II)Lclient!qc;")
	private Class86 method3189(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class122 local15 = Static243.method4561(this.anInt3592);
		return this.aBoolean256 ? local15.method3543(-1, 0, -1, arg1, arg0) : local15.method3543(this.anInt3604, this.anInt3607, this.anInt3590, arg1, arg0);
	}

	@OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub7_4 != null) {
			this.aClass2_Sub7_4.method4743();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V")
	public void method3191(@OriginalArg(0) int arg0) {
		if (this.aBoolean256) {
			return;
		}
		this.anInt3607 += arg0;
		while (this.aClass165_2.anIntArray410[this.anInt3604] < this.anInt3607) {
			this.anInt3607 -= this.aClass165_2.anIntArray410[this.anInt3604];
			this.anInt3604++;
			if (this.anInt3604 >= this.aClass165_2.anIntArray407.length) {
				this.aBoolean256 = true;
				break;
			}
		}
		if (!this.aBoolean256) {
			Static209.method4128(super.anInt7027, false, this.anInt3604, super.anInt7032, this.aClass165_2);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!qc;Lclient!nr;Z)V")
	private void method3192(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class40 arg1) {
		@Pc(6) Class49[] local6 = arg0.method5532();
		@Pc(13) Class116[] local13 = arg0.method5544();
		if ((this.aClass2_Sub7_4 == null || this.aClass2_Sub7_4.aBoolean388) && (local6 != null || local13 != null)) {
			this.aClass2_Sub7_4 = new Class2_Sub7(Static197.anInt4521);
		}
		if (this.aClass2_Sub7_4 != null) {
			this.aClass2_Sub7_4.method4744(arg1, (long) Static197.anInt4521, local6, local13);
			this.aClass2_Sub7_4.method4747(super.aByte72, super.aShort93, super.aShort92, super.aShort91, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
		@Pc(9) Class86 local9 = this.method3189(arg0, 0);
		if (local9 != null) {
			this.method3192(local9, arg0);
		}
	}
}
