import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class7_Sub1_Sub2 extends Class7_Sub1 {

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "Lclient!qp;")
	private Class2_Sub7 aClass2_Sub7_3;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!fk", name = "ab", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
	private int anInt2234;

	@OriginalMember(owner = "client!fk", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!fk", name = "pb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!fk", name = "rb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!fk", name = "sb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
	private int anInt2236 = -1;

	@OriginalMember(owner = "client!fk", name = "kb", descriptor = "I")
	private int anInt2240 = 0;

	@OriginalMember(owner = "client!fk", name = "mb", descriptor = "I")
	private int anInt2241 = -32768;

	@OriginalMember(owner = "client!fk", name = "bb", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
	private int anInt2222 = 0;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	public final int anInt2217;

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
	public final int anInt2232;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
	private final int anInt2220;

	@OriginalMember(owner = "client!fk", name = "jb", descriptor = "I")
	public final int anInt2239;

	@OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
	public final int anInt2229;

	@OriginalMember(owner = "client!fk", name = "eb", descriptor = "I")
	private final int anInt2235;

	@OriginalMember(owner = "client!fk", name = "ib", descriptor = "I")
	private final int anInt2238;

	@OriginalMember(owner = "client!fk", name = "S", descriptor = "Lclient!qr;")
	private final Class165 aClass165_1;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class7_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt2217 = arg9;
		this.anInt2232 = arg6;
		this.anInt2220 = arg8;
		this.aBoolean149 = false;
		this.anInt2239 = arg10;
		this.anInt2229 = arg5;
		this.anInt2235 = arg7;
		this.anInt2238 = arg0;
		@Pc(64) int local64 = Static243.method4561(this.anInt2238).anInt4135;
		if (local64 == -1) {
			this.aClass165_1 = null;
		} else {
			this.aClass165_1 = Static231.method4385(local64);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
		@Pc(11) Class86 local11 = this.method1874(arg0, 0);
		if (local11 == null) {
			return;
		}
		@Pc(17) Class11 local17 = arg0.method2782();
		local17.method5493(this.anInt2234);
		local17.method5507(this.lb);
		local17.method5489((int) this.aDouble7, (int) this.aDouble2, (int) this.aDouble3);
		this.anInt2241 = local11.method5534();
		this.method1869(local11, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!qc;Lclient!nr;I)V")
	private void method1869(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class40 arg1) {
		@Pc(6) Class49[] local6 = arg0.method5532();
		@Pc(13) Class116[] local13 = arg0.method5544();
		if ((this.aClass2_Sub7_3 == null || this.aClass2_Sub7_3.aBoolean388) && (local6 != null || local13 != null)) {
			this.aClass2_Sub7_3 = new Class2_Sub7(Static197.anInt4521);
		}
		if (this.aClass2_Sub7_3 != null) {
			this.aClass2_Sub7_3.method4744(arg1, (long) Static197.anInt4521, local6, local13);
			this.aClass2_Sub7_3.method4747(super.aByte72, super.aShort93, super.aShort92, super.aShort91, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)I")
	@Override
	public int method5961() {
		return this.anInt2241;
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)V")
	@Override
	public void method5963() {
		super.aShort91 = super.aShort90 = (short) (this.aDouble3 / 128.0D);
		super.aShort93 = super.aShort92 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public void method1872() {
		if (this.aClass2_Sub7_3 != null) {
			this.aClass2_Sub7_3.method4743();
		}
	}

	@OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub7_3 != null) {
			this.aClass2_Sub7_3.method4743();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
	public void method1873(@OriginalArg(1) int arg0) {
		this.aDouble3 += this.aDouble9 * (double) arg0;
		this.aBoolean149 = true;
		if (this.anInt2235 == -1) {
			this.aDouble2 += this.aDouble8 * (double) arg0;
		} else {
			this.aDouble2 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble6 + (double) arg0 * this.aDouble8;
			this.aDouble8 += (double) arg0 * this.aDouble6;
		}
		this.aDouble7 += this.aDouble4 * (double) arg0;
		this.lb = (int) (Math.atan2(this.aDouble4, this.aDouble9) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2234 = (int) (Math.atan2(this.aDouble8, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass165_1 == null) {
			return;
		}
		this.anInt2222 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass165_1.anIntArray410[this.anInt2240] >= this.anInt2222) {
						return;
					}
					this.anInt2222 -= this.aClass165_1.anIntArray410[this.anInt2240];
					this.anInt2240++;
					if (this.aClass165_1.anIntArray407.length <= this.anInt2240) {
						this.anInt2240 -= this.aClass165_1.anInt5581;
						if (this.anInt2240 < 0 || this.aClass165_1.anIntArray407.length <= this.anInt2240) {
							this.anInt2240 = 0;
						}
					}
					this.anInt2236 = this.anInt2240 + 1;
				} while (this.anInt2236 < this.aClass165_1.anIntArray407.length);
				this.anInt2236 -= this.aClass165_1.anInt5581;
			} while (this.anInt2236 >= 0 && this.aClass165_1.anIntArray407.length > this.anInt2236);
			this.anInt2236 = -1;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!nr;II)Lclient!qc;")
	private Class86 method1874(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class122 local13 = Static243.method4561(this.anInt2238);
		return local13.method3543(this.anInt2240, this.anInt2222, this.anInt2236, arg1, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V")
	public void method1875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean149) {
			local8 = arg2 - super.anInt7027;
			@Pc(15) double local15 = (double) (arg3 - super.anInt7032);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble2 = super.anInt7031;
			this.aDouble7 = (double) this.anInt2220 * local8 / local24 + (double) super.anInt7027;
			this.aDouble3 = (double) this.anInt2220 * local15 / local24 + (double) super.anInt7032;
		}
		local8 = this.anInt2232 + 1 - arg0;
		this.aDouble4 = ((double) arg2 - this.aDouble7) / local8;
		this.aDouble9 = ((double) arg3 - this.aDouble3) / local8;
		this.aDouble5 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble9 * this.aDouble9);
		if (this.anInt2235 == -1) {
			this.aDouble8 = ((double) arg1 - this.aDouble2) / local8;
		} else {
			if (!this.aBoolean149) {
				this.aDouble8 = -this.aDouble5 * Math.tan((double) this.anInt2235 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg1 - local8 * this.aDouble8 - this.aDouble2) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		@Pc(9) Class86 local9 = this.method1874(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class11 local16 = arg0.method2782();
		local16.method5493(this.anInt2234);
		local16.method5507(this.lb);
		local16.method5489((int) this.aDouble7, (int) this.aDouble2, (int) this.aDouble3);
		if (this.aClass2_Sub7_3 == null) {
			local9.method5539(local16, null, 0);
		} else {
			@Pc(42) Class117 local42 = this.aClass2_Sub7_3.method4737();
			arg0.method2748(local9, local42, local16, null);
		}
		this.anInt2241 = local9.method5534();
		this.method1869(local9, arg0);
		return null;
	}
}
