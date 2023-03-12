import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class11_Sub5_Sub3 extends Class11_Sub5 {

	@OriginalMember(owner = "client!om", name = "w", descriptor = "Lclient!oh;")
	private Class12_Sub5 aClass12_Sub5_4;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	private int anInt4724;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!om", name = "R", descriptor = "I")
	private int anInt4727;

	@OriginalMember(owner = "client!om", name = "T", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!om", name = "Y", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!om", name = "db", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "I")
	private int anInt4718 = -1;

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!om", name = "hb", descriptor = "I")
	private int anInt4738 = -32768;

	@OriginalMember(owner = "client!om", name = "S", descriptor = "I")
	private int anInt4728 = 0;

	@OriginalMember(owner = "client!om", name = "lb", descriptor = "I")
	private int anInt4742 = 0;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	public final int anInt4714;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	public final int anInt4722;

	@OriginalMember(owner = "client!om", name = "kb", descriptor = "I")
	private final int anInt4741;

	@OriginalMember(owner = "client!om", name = "X", descriptor = "I")
	private final int anInt4732;

	@OriginalMember(owner = "client!om", name = "eb", descriptor = "I")
	public final int anInt4736;

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "I")
	private final int anInt4735;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "I")
	public final int anInt4725;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "Lclient!nb;")
	private final Class157 aClass157_1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class11_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4714 = arg9;
		this.anInt4722 = arg6;
		this.anInt4741 = arg7;
		this.anInt4732 = arg0;
		this.anInt4736 = arg10;
		this.anInt4735 = arg8;
		this.anInt4725 = arg5;
		this.aBoolean326 = false;
		@Pc(65) int local65 = Static322.aClass211_2.method5407(this.anInt4732).anInt2448;
		if (local65 == -1) {
			this.aClass157_1 = null;
		} else {
			this.aClass157_1 = Static39.aClass85_1.method2371(local65);
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		@Pc(21) Class31 local21 = this.method4396(1024, arg0);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class14 local28 = arg0.method2808();
		local28.method3933(this.anInt4727);
		local28.method3926(this.anInt4724);
		local28.method3936((int) this.aDouble3, (int) this.aDouble9, (int) this.aDouble8);
		if (this.aClass12_Sub5_4 == null) {
			local21.method3835(local28, null, 0);
		} else {
			@Pc(54) Class224 local54 = this.aClass12_Sub5_4.method4358();
			arg0.method2824(local21, local54, local28, null);
		}
		this.anInt4738 = local21.method3802();
		this.method4393(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
	public void method4391() {
		if (this.aClass12_Sub5_4 != null) {
			this.aClass12_Sub5_4.method4354();
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
	public void method4392(@OriginalArg(0) int arg0) {
		this.aDouble3 += this.aDouble4 * (double) arg0;
		this.aDouble8 += (double) arg0 * this.aDouble6;
		this.aBoolean326 = true;
		if (this.anInt4741 == -1) {
			this.aDouble9 += this.aDouble7 * (double) arg0;
		} else {
			this.aDouble9 += (double) arg0 * this.aDouble7 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble5 * (double) arg0;
		}
		this.anInt4724 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4727 = (int) (Math.atan2(this.aDouble7, this.aDouble2) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass157_1 == null) {
			return;
		}
		this.anInt4742 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4742 <= this.aClass157_1.anIntArray261[this.anInt4728]) {
						return;
					}
					this.anInt4742 -= this.aClass157_1.anIntArray261[this.anInt4728];
					this.anInt4728++;
					if (this.anInt4728 >= this.aClass157_1.anIntArray262.length) {
						this.anInt4728 -= this.aClass157_1.anInt4032;
						if (this.anInt4728 < 0 || this.aClass157_1.anIntArray262.length <= this.anInt4728) {
							this.anInt4728 = 0;
						}
					}
					this.anInt4718 = this.anInt4728 + 1;
				} while (this.aClass157_1.anIntArray262.length > this.anInt4718);
				this.anInt4718 -= this.aClass157_1.anInt4032;
			} while (this.anInt4718 >= 0 && this.anInt4718 < this.aClass157_1.anIntArray262.length);
			this.anInt4718 = -1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!wm;Lclient!gn;)V")
	private void method4393(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class31 arg1) {
		@Pc(12) Class114[] local12 = arg1.method3808();
		@Pc(15) Class163[] local15 = arg1.method3840();
		if ((this.aClass12_Sub5_4 == null || this.aClass12_Sub5_4.aBoolean322) && (local12 != null || local15 != null)) {
			this.aClass12_Sub5_4 = new Class12_Sub5(client.cycle);
		}
		if (this.aClass12_Sub5_4 != null) {
			this.aClass12_Sub5_4.method4357(arg0, (long) client.cycle, local12, local15);
			this.aClass12_Sub5_4.method4361(super.aByte78, super.aShort103, super.aShort104, super.aShort101, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)I")
	@Override
	public int method6080() {
		return this.anInt4738;
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBLclient!wm;)Lclient!gn;")
	private Class31 method4396(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(17) Class91 local17 = Static322.aClass211_2.method5407(this.anInt4732);
		return local17.method2433(this.anInt4718, this.anInt4742, arg1, arg0, Static39.aClass85_1, this.anInt4728);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
		@Pc(9) Class31 local9 = this.method4396(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class14 local15 = arg0.method2808();
		local15.method3933(this.anInt4727);
		local15.method3926(this.anInt4724);
		local15.method3936((int) this.aDouble3, (int) this.aDouble9, (int) this.aDouble8);
		this.anInt4738 = local9.method3802();
		this.method4393(arg0, local9);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	@Override
	public void method6078() {
		super.aShort103 = super.aShort104 = (short) (this.aDouble3 / 128.0D);
		super.aShort101 = super.aShort102 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!om", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub5_4 != null) {
			this.aClass12_Sub5_4.method4354();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIZI)V")
	public void method4397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean326) {
			local9 = arg1 - super.xFine;
			@Pc(16) double local16 = (double) (arg3 - super.zFine);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble8 = (double) super.zFine + local16 * (double) this.anInt4735 / local25;
			this.aDouble3 = (double) super.xFine + (double) this.anInt4735 * local9 / local25;
			this.aDouble9 = super.anInt6782;
		}
		local9 = this.anInt4722 + 1 - arg2;
		this.aDouble4 = ((double) arg1 - this.aDouble3) / local9;
		this.aDouble6 = ((double) arg3 - this.aDouble8) / local9;
		this.aDouble2 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (this.anInt4741 == -1) {
			this.aDouble7 = ((double) arg0 - this.aDouble9) / local9;
		} else {
			if (!this.aBoolean326) {
				this.aDouble7 = -this.aDouble2 * Math.tan((double) this.anInt4741 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg0 - this.aDouble7 * local9 - this.aDouble9) * 2.0D / (local9 * local9);
		}
	}
}
