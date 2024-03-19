import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
	public int anInt5558;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
	public int anInt5559;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
	public int anInt5561;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
	public int anInt5562;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
	public int anInt5556 = 0;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Z")
	public boolean aBoolean388 = false;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "Lclient!ep;")
	private Class58 aClass58_9 = new Class58();

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	private int anInt5557 = 0;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Lclient!mi;")
	public Class130 aClass130_33 = new Class130();

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "Z")
	private boolean aBoolean390 = false;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	private int anInt5560 = 0;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "Lclient!lc;")
	public final Class117 aClass117_2 = new Class117();

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "[Lclient!sh;")
	public Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array1 = new Class2_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7(@OriginalArg(0) int arg0) {
		Static55.aClass58_4.method1670(this);
		this.aLong168 = arg0;
		this.aLong167 = arg0;
		this.aBoolean390 = true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!nr;[Lclient!dn;Z)V")
	private void method4735(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class49[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static258.aBooleanArray20[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class2_Sub4 local16 = (Class2_Sub4) this.aClass58_9.method1672(); local16 != null; local16 = (Class2_Sub4) this.aClass58_9.method1675()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass49_2 == arg1[local21] || local16.aClass49_2 == arg1[local21].aClass49_1) {
						Static258.aBooleanArray20[local21] = true;
						local16.method3236();
						local16.aBoolean259 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3693 == 0) {
				local16.method5802();
				this.anInt5557--;
			} else {
				local16.aBoolean259 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt5557 != 8; local21++) {
			if (!Static258.aBooleanArray20[local21]) {
				@Pc(101) Class2_Sub4 local101 = new Class2_Sub4(arg0, arg1[local21], this, this.aLong168);
				this.aClass58_9.method1670(local101);
				this.anInt5557++;
				Static258.aBooleanArray20[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "()V")
	private void method4736() {
		this.aBoolean389 = false;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "()Lclient!lc;")
	public Class117 method4737() {
		return this.aClass117_2;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(J)V")
	public void method4739(@OriginalArg(0) long arg0) {
		this.aLong168 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([Lclient!la;Z)V")
	private void method4740(@OriginalArg(0) Class116[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static258.aBooleanArray19[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class1_Sub1_Sub15 local16 = (Class1_Sub1_Sub15) this.aClass130_33.method3749(); local16 != null; local16 = (Class1_Sub1_Sub15) this.aClass130_33.method3756()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass116_2 == arg0[local21] || local16.aClass116_2 == arg0[local21].aClass116_1) {
						Static258.aBooleanArray19[local21] = true;
						local16.method3739();
						continue label68;
					}
				}
			}
			local16.method6172();
			this.anInt5560--;
			if (local16.method6157()) {
				local16.method6158();
				Static185.anInt4350--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt5560 != 8; local21++) {
			if (!Static258.aBooleanArray19[local21]) {
				@Pc(93) Class1_Sub1_Sub15 local93 = null;
				if (Static236.method4503(arg0[local21].anInt4036).anInt4088 == 1 && Static185.anInt4350 < 32) {
					local93 = new Class1_Sub1_Sub15(arg0[local21], this);
					Static72.aClass184_1.method5099((long) arg0[local21].anInt4036, local93);
					Static185.anInt4350++;
				}
				if (local93 == null) {
					local93 = new Class1_Sub1_Sub15(arg0[local21], this);
				}
				this.aClass130_33.method3760(local93);
				this.anInt5560++;
				Static258.aBooleanArray19[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "()V")
	public void method4741() {
		this.aBoolean388 = true;
		for (@Pc(8) Class1_Sub1_Sub15 local8 = (Class1_Sub1_Sub15) this.aClass130_33.method3749(); local8 != null; local8 = (Class1_Sub1_Sub15) this.aClass130_33.method3756()) {
			if (local8.aClass118_1.anInt4088 == 1) {
				local8.method6158();
			}
		}
		this.aClass2_Sub2_Sub1_Sub1Array1 = new Class2_Sub2_Sub1_Sub1[8192];
		this.anInt5556 = 0;
		this.aClass58_9 = new Class58();
		this.anInt5557 = 0;
		this.aClass130_33 = new Class130();
		this.anInt5560 = 0;
		this.method5802();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!nr;J)Z")
	public boolean method4742(@OriginalArg(0) Class40 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong168 == this.aLong167) {
			this.method4736();
		} else {
			this.method4743();
		}
		if (arg1 - this.aLong168 > 750L) {
			this.method4741();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong167);
		@Pc(36) Class2_Sub4 local36;
		if (this.aBoolean390) {
			for (local36 = (Class2_Sub4) this.aClass58_9.method1672(); local36 != null; local36 = (Class2_Sub4) this.aClass58_9.method1675()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass39_1.anInt1339; local39++) {
					local36.method3237(arg0, 1, !this.aBoolean389, arg1);
				}
			}
			this.aBoolean390 = false;
		}
		for (local36 = (Class2_Sub4) this.aClass58_9.method1672(); local36 != null; local36 = (Class2_Sub4) this.aClass58_9.method1675()) {
			local36.method3237(arg0, local27, !this.aBoolean389, arg1);
		}
		this.aLong167 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "()V")
	public void method4743() {
		this.aBoolean389 = true;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!nr;J[Lclient!dn;[Lclient!la;Z)V")
	public void method4744(@OriginalArg(0) Class40 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class49[] arg2, @OriginalArg(3) Class116[] arg3) {
		if (!this.aBoolean388) {
			this.method4735(arg0, arg2);
			this.method4740(arg3);
			this.aLong168 = arg1;
		}
	}

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "()V")
	public void method4745() {
		this.aBoolean390 = true;
	}

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "()V")
	public void method4746() {
		this.aClass117_2.aClass148_1.method4348();
		for (@Pc(10) Class2_Sub4 local10 = (Class2_Sub4) this.aClass58_9.method1672(); local10 != null; local10 = (Class2_Sub4) this.aClass58_9.method1675()) {
			local10.method3235(this.aLong167);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
	public void method4747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5558 = arg0;
		this.anInt5561 = arg1;
		this.anInt5562 = arg3;
		this.anInt5559 = arg4;
	}
}
