import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "Lclient!mi;")
	public final Class130 aClass130_32 = new Class130();

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "Lclient!lg;")
	public final Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2 = new Class1_Sub3_Sub3();

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Lclient!hb;")
	private final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class1_Sub3_Sub4(@OriginalArg(0) Class1_Sub3_Sub1 arg0) {
		this.aClass1_Sub3_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[ILclient!hs;III)V")
	private void method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class1_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub3_Sub1_2.anIntArray171[arg2.anInt3043] & 0x4) != 0 && arg2.anInt3032 < 0) {
			@Pc(34) int local34 = this.aClass1_Sub3_Sub1_2.anIntArray182[arg2.anInt3043] / Static80.anInt2184;
			while (true) {
				@Pc(45) int local45 = (local34 + 1048575 - arg2.anInt3035) / local34;
				if (arg4 < local45) {
					arg2.anInt3035 += local34 * arg4;
					break;
				}
				arg2.aClass1_Sub3_Sub2_1.method4457(arg1, arg0, local45);
				arg4 -= local45;
				arg2.anInt3035 += local34 * local45 - 1048576;
				arg0 += local45;
				@Pc(76) int local76 = Static80.anInt2184 / 100;
				@Pc(80) int local80 = 262144 / local34;
				if (local80 < local76) {
					local76 = local80;
				}
				@Pc(92) Class1_Sub3_Sub2 local92 = arg2.aClass1_Sub3_Sub2_1;
				if (this.aClass1_Sub3_Sub1_2.anIntArray175[arg2.anInt3043] == 0) {
					arg2.aClass1_Sub3_Sub2_1 = Static362.method2352(arg2.aClass1_Sub13_Sub1_1, local92.method2343(), local92.method2366(), local92.method2339());
				} else {
					arg2.aClass1_Sub3_Sub2_1 = Static362.method2352(arg2.aClass1_Sub13_Sub1_1, local92.method2343(), 0, local92.method2339());
					this.aClass1_Sub3_Sub1_2.method2233(arg2, arg2.aClass1_Sub10_1.aShortArray28[arg2.anInt3039] < 0);
					arg2.aClass1_Sub3_Sub2_1.method2349(local76, local92.method2366());
				}
				if (arg2.aClass1_Sub10_1.aShortArray28[arg2.anInt3039] < 0) {
					arg2.aClass1_Sub3_Sub2_1.method2364(-1);
				}
				local92.method2361(local76);
				local92.method4457(arg1, arg0, arg3 - arg0);
				if (local92.method2333()) {
					this.aClass1_Sub3_Sub3_2.method3527(local92);
				}
			}
		}
		arg2.aClass1_Sub3_Sub2_1.method4457(arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "([III)V")
	@Override
	public void method4457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub3_Sub3_2.method4457(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub12 local17 = (Class1_Sub12) this.aClass130_32.method3749(); local17 != null; local17 = (Class1_Sub12) this.aClass130_32.method3756()) {
			if (!this.aClass1_Sub3_Sub1_2.method2230(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt3052 >= local27) {
						this.method4459(local29, arg0, local17, local27 + local29, local27);
						local17.anInt3052 -= local27;
						break;
					}
					this.method4459(local29, arg0, local17, local27 + local29, local17.anInt3052);
					local29 += local17.anInt3052;
					local27 -= local17.anInt3052;
				} while (!this.aClass1_Sub3_Sub1_2.method2212(local17, local29, local27, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILclient!hs;)V")
	private void method4461(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		if ((this.aClass1_Sub3_Sub1_2.anIntArray171[arg1.anInt3043] & 0x4) != 0 && arg1.anInt3032 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub3_Sub1_2.anIntArray182[arg1.anInt3043] / Static80.anInt2184;
			@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt3035) / local26;
			arg1.anInt3035 = arg0 * local26 + arg1.anInt3035 & 0xFFFFF;
			if (arg0 >= local36) {
				if (this.aClass1_Sub3_Sub1_2.anIntArray175[arg1.anInt3043] == 0) {
					arg1.aClass1_Sub3_Sub2_1 = Static362.method2352(arg1.aClass1_Sub13_Sub1_1, arg1.aClass1_Sub3_Sub2_1.method2343(), arg1.aClass1_Sub3_Sub2_1.method2366(), arg1.aClass1_Sub3_Sub2_1.method2339());
				} else {
					arg1.aClass1_Sub3_Sub2_1 = Static362.method2352(arg1.aClass1_Sub13_Sub1_1, arg1.aClass1_Sub3_Sub2_1.method2343(), 0, arg1.aClass1_Sub3_Sub2_1.method2339());
					this.aClass1_Sub3_Sub1_2.method2233(arg1, arg1.aClass1_Sub10_1.aShortArray28[arg1.anInt3039] < 0);
				}
				if (arg1.aClass1_Sub10_1.aShortArray28[arg1.anInt3039] < 0) {
					arg1.aClass1_Sub3_Sub2_1.method2364(-1);
				}
				arg0 = arg1.anInt3035 / local26;
			}
		}
		arg1.aClass1_Sub3_Sub2_1.method4454(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "()Lclient!af;")
	@Override
	public Class1_Sub3 method4451() {
		@Pc(9) Class1_Sub12 local9;
		do {
			local9 = (Class1_Sub12) this.aClass130_32.method3756();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub3_Sub2_1 == null);
		return local9.aClass1_Sub3_Sub2_1;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	@Override
	public void method4454(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3_Sub3_2.method4454(arg0);
		for (@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) this.aClass130_32.method3749(); local15 != null; local15 = (Class1_Sub12) this.aClass130_32.method3756()) {
			if (!this.aClass1_Sub3_Sub1_2.method2230(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt3052) {
						this.method4461(local25, local15);
						local15.anInt3052 -= local25;
						break;
					}
					this.method4461(local15.anInt3052, local15);
					local25 -= local15.anInt3052;
				} while (!this.aClass1_Sub3_Sub1_2.method2212(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "()Lclient!af;")
	@Override
	public Class1_Sub3 method4453() {
		@Pc(9) Class1_Sub12 local9 = (Class1_Sub12) this.aClass130_32.method3749();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub3_Sub2_1 == null) {
			return this.method4451();
		} else {
			return local9.aClass1_Sub3_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "()I")
	@Override
	public int method4456() {
		return 0;
	}
}
