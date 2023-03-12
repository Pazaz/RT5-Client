import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class11_Sub5_Sub4 extends Class11_Sub5 {

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "Lclient!oh;")
	private Class12_Sub5 aClass12_Sub5_7;

	@OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
	private int anInt6518 = -32768;

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
	private final int anInt6510 = -1;

	@OriginalMember(owner = "client!uh", name = "Q", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
	private int anInt6509 = 0;

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
	private int anInt6524 = 0;

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
	private final int anInt6505;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	public final int anInt6504;

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "Lclient!nb;")
	private Class157 aClass157_3;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class11_Sub5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6505 = arg0;
		this.anInt6504 = arg1 + arg2;
		@Pc(41) int local41 = Static322.aClass211_2.method5407(this.anInt6505).anInt2448;
		if (local41 == -1) {
			this.aBoolean445 = true;
		} else {
			this.aBoolean445 = false;
			this.aClass157_3 = Static39.aClass85_1.method2371(local41);
		}
		if (arg2 == this.anInt6504) {
			Static1.method4(this.aClass157_3, false, super.aByte78, super.anInt6781, super.anInt6783, this.anInt6509);
		}
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class31 local9 = this.method5874(0, arg0);
		if (local9 != null) {
			this.method5873(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!gn;Lclient!wm;Z)V")
	private void method5873(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(6) Class114[] local6 = arg0.method3808();
		@Pc(9) Class163[] local9 = arg0.method3840();
		if ((this.aClass12_Sub5_7 == null || this.aClass12_Sub5_7.aBoolean322) && (local6 != null || local9 != null)) {
			this.aClass12_Sub5_7 = new Class12_Sub5(client.cycle);
		}
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4357(arg1, (long) client.cycle, local6, local9);
			this.aClass12_Sub5_7.method4361(super.aByte78, super.aShort103, super.aShort104, super.aShort101, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class31 local9 = this.method5874(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class14 local16 = arg0.method2808();
		local16.method3922(super.anInt6781, super.anInt6782, super.anInt6783);
		if (this.aClass12_Sub5_7 == null) {
			local9.method3835(local16, null, 0);
		} else {
			@Pc(41) Class224 local41 = this.aClass12_Sub5_7.method4358();
			arg0.method2824(local9, local41, local16, null);
		}
		this.anInt6518 = local9.method3802();
		this.method5873(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)I")
	@Override
	public int method6080() {
		return this.anInt6518;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!wm;Z)Lclient!gn;")
	private Class31 method5874(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(9) Class91 local9 = Static322.aClass211_2.method5407(this.anInt6505);
		return this.aBoolean445 ? local9.method2433(-1, 0, arg1, arg0, Static39.aClass85_1, -1) : local9.method2433(this.anInt6510, this.anInt6524, arg1, arg0, Static39.aClass85_1, this.anInt6509);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V")
	public void method5878() {
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4354();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	public void method5879(@OriginalArg(0) int arg0) {
		if (this.aBoolean445) {
			return;
		}
		this.anInt6524 += arg0;
		while (this.anInt6524 > this.aClass157_3.anIntArray261[this.anInt6509]) {
			this.anInt6524 -= this.aClass157_3.anIntArray261[this.anInt6509];
			this.anInt6509++;
			if (this.anInt6509 >= this.aClass157_3.anIntArray262.length) {
				this.aBoolean445 = true;
				break;
			}
		}
		if (!this.aBoolean445) {
			Static1.method4(this.aClass157_3, false, super.aByte78, super.anInt6781, super.anInt6783, this.anInt6509);
		}
	}

	@OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub5_7 != null) {
			this.aClass12_Sub5_7.method4354();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}
}
