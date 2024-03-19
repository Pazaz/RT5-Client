import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class183 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!o;")
	private Class1 aClass1_200;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!o;")
	private Class1 aClass1_201;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	private int anInt5991 = 0;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[Lclient!o;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public final int anInt5989;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I)V")
	public Class183(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt5989 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_248 = local23;
			local23.aClass1_247 = local23;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lclient!o;")
	public Class1 method5048() {
		if (this.aClass1_200 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) ((long) (this.anInt5989 - 1) & this.aLong183)];
		while (this.aClass1_200 != local23) {
			if (this.aClass1_200.aLong235 == this.aLong183) {
				@Pc(39) Class1 local39 = this.aClass1_200;
				this.aClass1_200 = this.aClass1_200.aClass1_247;
				return local39;
			}
			this.aClass1_200 = this.aClass1_200.aClass1_247;
		}
		this.aClass1_200 = null;
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lclient!o;")
	public Class1 method5050() {
		@Pc(20) Class1 local20;
		if (this.anInt5991 > 0 && this.aClass1_201 != this.aClass1Array1[this.anInt5991 - 1]) {
			local20 = this.aClass1_201;
			this.aClass1_201 = local20.aClass1_247;
			return local20;
		}
		while (this.anInt5989 > this.anInt5991) {
			local20 = this.aClass1Array1[this.anInt5991++].aClass1_247;
			if (local20 != this.aClass1Array1[this.anInt5991 - 1]) {
				this.aClass1_201 = local20.aClass1_247;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public void method5051() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5989; local3++) {
			@Pc(18) Class1 local18 = this.aClass1Array1[local3];
			while (true) {
				@Pc(21) Class1 local21 = local18.aClass1_247;
				if (local21 == local18) {
					break;
				}
				local21.method6172();
			}
		}
		this.aClass1_200 = null;
		this.aClass1_201 = null;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lclient!o;")
	public Class1 method5052() {
		this.anInt5991 = 0;
		return this.method5050();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)Lclient!o;")
	public Class1 method5053(@OriginalArg(1) long arg0) {
		this.aLong183 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt5989 - 1))];
		for (this.aClass1_200 = local20.aClass1_247; this.aClass1_200 != local20; this.aClass1_200 = this.aClass1_200.aClass1_247) {
			if (arg0 == this.aClass1_200.aLong235) {
				@Pc(41) Class1 local41 = this.aClass1_200;
				this.aClass1_200 = this.aClass1_200.aClass1_247;
				return local41;
			}
		}
		this.aClass1_200 = null;
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I")
	public int method5054() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt5989; local14++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local14];
			for (@Pc(24) Class1 local24 = local21.aClass1_247; local24 != local21; local24 = local24.aClass1_247) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZJLclient!o;)V")
	public void method5055(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_248 != null) {
			arg1.method6172();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt5989 - 1) & arg0)];
		arg1.aClass1_247 = local21;
		arg1.aClass1_248 = local21.aClass1_248;
		arg1.aClass1_248.aClass1_247 = arg1;
		arg1.aLong235 = arg0;
		arg1.aClass1_247.aClass1_248 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I")
	public int method5057() {
		return this.anInt5989;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([Lclient!o;I)I")
	public int method5060(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt5989; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_247; local19 != local16; local19 = local19.aClass1_247) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}
}
