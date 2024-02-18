import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class28 {

	@OriginalMember(owner = "client!av", name = "m", descriptor = "[I")
	public static final int[] anIntArray34 = new int[120];

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!ie;")
	private Class2 aClass2_21;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Lclient!ie;")
	private Class2 aClass2_22;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	private int anInt641 = 0;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "I")
	public final int anInt638;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "[Lclient!ie;")
	public final Class2[] aClass2Array1;

	static {
		@Pc(85) int local85 = 0;
		for (@Pc(87) int local87 = 0; local87 < 120; local87++) {
			@Pc(92) int local92 = local87 + 1;
			@Pc(105) int local105 = (int) (Math.pow(2.0D, (double) local92 / 7.0D) * 300.0D + (double) local92);
			local85 += local105;
			anIntArray34[local87] = local85 / 4;
		}
	}

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(I)V")
	public Class28(@OriginalArg(0) int arg0) {
		this.anInt638 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_346 = local23;
			local23.aClass2_345 = local23;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(JLclient!ie;I)V")
	public void method735(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_345 != null) {
			arg1.method9457();
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt638 - 1))];
		arg1.aClass2_346 = local28;
		arg1.aClass2_345 = local28.aClass2_345;
		arg1.aClass2_345.aClass2_346 = arg1;
		arg1.aClass2_346.aClass2_345 = arg1;
		arg1.aLong328 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)Lclient!ie;")
	public Class2 method736() {
		this.anInt641 = 0;
		return this.method740();
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)V")
	public void method737() {
		for (@Pc(6) int local6 = 0; local6 < this.anInt638; local6++) {
			@Pc(12) Class2 local12 = this.aClass2Array1[local6];
			while (true) {
				@Pc(15) Class2 local15 = local12.aClass2_346;
				if (local15 == local12) {
					break;
				}
				local15.method9457();
			}
		}
		this.aClass2_21 = null;
		this.aClass2_22 = null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IJ)Lclient!ie;")
	public Class2 method738(@OriginalArg(1) long arg0) {
		this.aLong21 = arg0;
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt638 - 1))];
		for (this.aClass2_21 = local25.aClass2_346; this.aClass2_21 != local25; this.aClass2_21 = this.aClass2_21.aClass2_346) {
			if (arg0 == this.aClass2_21.aLong328) {
				@Pc(43) Class2 local43 = this.aClass2_21;
				this.aClass2_21 = this.aClass2_21.aClass2_346;
				return local43;
			}
		}
		this.aClass2_21 = null;
		return null;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)I")
	public int method739() {
		@Pc(5) int local5 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt638; local13++) {
			@Pc(19) Class2 local19 = this.aClass2Array1[local13];
			@Pc(22) Class2 local22 = local19.aClass2_346;
			while (local22 != local19) {
				local22 = local22.aClass2_346;
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Lclient!ie;")
	public Class2 method740() {
		@Pc(32) Class2 local32;
		if (this.anInt641 > 0 && this.aClass2_22 != this.aClass2Array1[this.anInt641 - 1]) {
			local32 = this.aClass2_22;
			this.aClass2_22 = local32.aClass2_346;
			return local32;
		}
		while (this.anInt638 > this.anInt641) {
			local32 = this.aClass2Array1[this.anInt641++].aClass2_346;
			if (this.aClass2Array1[this.anInt641 - 1] != local32) {
				this.aClass2_22 = local32.aClass2_346;
				return local32;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)I")
	public int method742() {
		return this.anInt638;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B[Lclient!ie;)I")
	public int method743(@OriginalArg(1) Class2[] arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt638; local16++) {
			@Pc(22) Class2 local22 = this.aClass2Array1[local16];
			for (@Pc(25) Class2 local25 = local22.aClass2_346; local25 != local22; local25 = local25.aClass2_346) {
				arg0[local5++] = local25;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)Lclient!ie;")
	public Class2 method744() {
		if (this.aClass2_21 == null) {
			return null;
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) ((long) (this.anInt638 - 1) & this.aLong21)];
		while (this.aClass2_21 != local28) {
			if (this.aClass2_21.aLong328 == this.aLong21) {
				@Pc(43) Class2 local43 = this.aClass2_21;
				this.aClass2_21 = this.aClass2_21.aClass2_346;
				return local43;
			}
			this.aClass2_21 = this.aClass2_21.aClass2_346;
		}
		this.aClass2_21 = null;
		return null;
	}
}
