import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class122 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	private int anInt4132;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
	public int anInt4137;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "Z")
	public boolean aBoolean295 = false;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	private int anInt4133 = 128;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Z")
	public boolean aBoolean293 = false;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
	private int anInt4134 = 128;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
	private int anInt4136 = 0;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	public int anInt4135 = -1;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
	private int anInt4138 = 0;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	private int anInt4129 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!il;IB)V")
	private void method3542(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4132 = arg0.method5749();
		} else if (arg1 == 2) {
			this.anInt4135 = arg0.method5749();
		} else if (arg1 == 4) {
			this.anInt4133 = arg0.method5749();
		} else if (arg1 == 5) {
			this.anInt4134 = arg0.method5749();
		} else if (arg1 == 6) {
			this.anInt4138 = arg0.method5749();
		} else if (arg1 == 7) {
			this.anInt4129 = arg0.method5761();
		} else if (arg1 == 8) {
			this.anInt4136 = arg0.method5761();
		} else if (arg1 == 9) {
			this.aBoolean293 = true;
		} else if (arg1 == 10) {
			this.aBoolean295 = true;
		} else {
			@Pc(74) int local74;
			@Pc(84) int local84;
			if (arg1 == 40) {
				local74 = arg0.method5761();
				this.aShortArray66 = new short[local74];
				this.aShortArray68 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray66[local84] = (short) arg0.method5749();
					this.aShortArray68[local84] = (short) arg0.method5749();
				}
			} else if (arg1 == 41) {
				local74 = arg0.method5761();
				this.aShortArray67 = new short[local74];
				this.aShortArray65 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray67[local84] = (short) arg0.method5749();
					this.aShortArray65[local84] = (short) arg0.method5749();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIILclient!nr;)Lclient!qc;")
	public Class86 method3543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class40 arg4) {
		@Pc(7) int local7 = arg3;
		@Pc(22) Class165 local22 = this.anInt4135 == -1 || arg0 == -1 ? null : Static231.method4385(this.anInt4135);
		if (local22 != null) {
			local7 = arg3 | local22.method4752(false, arg2, arg0);
		}
		if (this.anInt4134 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4133 != 128 || this.anInt4138 != 0) {
			local7 |= 0x5;
		}
		@Pc(59) Class215 local59 = Static80.aClass215_34;
		@Pc(77) Class86 local77;
		synchronized (Static80.aClass215_34) {
			local77 = (Class86) Static80.aClass215_34.method6057((long) (this.anInt4137 |= arg4.anInt3191 << 29));
		}
		if (local77 == null || arg4.method2752(local77.method5531(), local7) != 0) {
			if (local77 != null) {
				local7 = arg4.method2747(local7, local77.method5531());
			}
			@Pc(101) int local101 = local7;
			if (this.aShortArray66 != null) {
				local101 = local7 | 0x2000;
			}
			if (this.aShortArray67 != null) {
				local101 |= 0x4000;
			}
			@Pc(122) Class126 local122 = Static216.method4218(this.anInt4132, Static249.aClass162_192);
			if (local122 == null) {
				return null;
			}
			local77 = arg4.method2762(local122, local101, Static208.anInt4813, this.anInt4129 + 64, this.anInt4136 + 850);
			@Pc(145) int local145;
			if (this.aShortArray66 != null) {
				for (local145 = 0; local145 < this.aShortArray66.length; local145++) {
					local77.method5538(this.aShortArray66[local145], this.aShortArray68[local145]);
				}
			}
			if (this.aShortArray67 != null) {
				for (local145 = 0; local145 < this.aShortArray67.length; local145++) {
					local77.method5559(this.aShortArray67[local145], this.aShortArray65[local145]);
				}
			}
			local77.method5526(local7);
			@Pc(199) Class215 local199 = Static80.aClass215_34;
			synchronized (Static80.aClass215_34) {
				Static80.aClass215_34.method6050(local77, (long) (this.anInt4137 |= arg4.anInt3191 << 29));
			}
		}
		@Pc(241) Class86 local241 = local22 == null ? local77.method5565((byte) 2, local7, true) : local22.method4753(arg2, arg0, local7, (byte) 2, arg1, 0, local77);
		if (this.anInt4133 != 128 || this.anInt4134 != 128) {
			local241.method5540(this.anInt4133, this.anInt4134, this.anInt4133);
		}
		if (this.anInt4138 != 0) {
			if (this.anInt4138 == 90) {
				local241.method5542(4096);
			}
			if (this.anInt4138 == 180) {
				local241.method5542(8192);
			}
			if (this.anInt4138 == 270) {
				local241.method5542(12288);
			}
		}
		local241.method5526(arg3);
		return local241;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!il;)V")
	public void method3544(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method3542(arg0, local5);
		}
	}
}
