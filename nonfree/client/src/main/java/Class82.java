import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dla")
public final class Class82 {

	@OriginalMember(owner = "client!dla", name = "j", descriptor = "Lclient!jga;")
	private final Class192 aClass192_5;

	@OriginalMember(owner = "client!dla", name = "h", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!dla", name = "r", descriptor = "Lclient!av;")
	private final Class28 aClass28_13;

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "I")
	private final int anInt2285;

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(II)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass192_5 = new Class192();
		this.anInt2285 = arg0;
		this.anInt2281 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass28_13 = new Class28(local14);
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(I)I")
	public int method2144() {
		return this.anInt2281;
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method2145() {
		@Pc(19) Class2_Sub2_Sub14 local19 = (Class2_Sub2_Sub14) this.aClass28_13.method736();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method9268();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class2_Sub2_Sub14 local29 = local19;
			local19 = (Class2_Sub2_Sub14) this.aClass28_13.method740();
			local29.method9457();
			local29.method9260();
			this.anInt2281 += local29.anInt10683;
		}
		return null;
	}

	@OriginalMember(owner = "client!dla", name = "d", descriptor = "(I)I")
	public int method2146() {
		return this.anInt2285;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(II)V")
	public void method2147(@OriginalArg(0) int arg0) {
		if (Static443.aClass145_1 == null) {
			return;
		}
		for (@Pc(15) Class2_Sub2_Sub14 local15 = (Class2_Sub2_Sub14) this.aClass192_5.method4352(); local15 != null; local15 = (Class2_Sub2_Sub14) this.aClass192_5.method4350()) {
			if (local15.method9270()) {
				if (local15.method9268() == null) {
					local15.method9457();
					local15.method9260();
					this.anInt2281 += local15.anInt10683;
				}
			} else if (++local15.aLong325 > (long) arg0) {
				@Pc(42) Class2_Sub2_Sub14 local42 = Static443.aClass145_1.method4433(local15);
				this.aClass28_13.method735(local15.aLong328, local42);
				Static409.method5654(local15, local42);
				local15.method9457();
				local15.method9260();
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(B)I")
	public int method2148() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class2_Sub2_Sub14 local11 = (Class2_Sub2_Sub14) this.aClass192_5.method4352(); local11 != null; local11 = (Class2_Sub2_Sub14) this.aClass192_5.method4350()) {
			if (!local11.method9270()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(ILclient!vw;)V")
	private void method2149(@OriginalArg(1) Class2_Sub2_Sub14 arg0) {
		if (arg0 != null) {
			arg0.method9457();
			arg0.method9260();
			this.anInt2281 += arg0.anInt10683;
		}
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method2150(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method2153(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(B)V")
	public void method2151() {
		for (@Pc(14) Class2_Sub2_Sub14 local14 = (Class2_Sub2_Sub14) this.aClass192_5.method4352(); local14 != null; local14 = (Class2_Sub2_Sub14) this.aClass192_5.method4350()) {
			if (local14.method9270()) {
				local14.method9457();
				local14.method9260();
				this.anInt2281 += local14.anInt10683;
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method2152() {
		@Pc(19) Class2_Sub2_Sub14 local19 = (Class2_Sub2_Sub14) this.aClass28_13.method740();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method9268();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class2_Sub2_Sub14 local29 = local19;
			local19 = (Class2_Sub2_Sub14) this.aClass28_13.method740();
			local29.method9457();
			local29.method9260();
			this.anInt2281 += local29.anInt10683;
		}
		return null;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	public void method2153(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt2285) {
			throw new IllegalStateException("s>cs");
		}
		this.method2154(arg0);
		this.anInt2281 -= arg2;
		while (this.anInt2281 < 0) {
			@Pc(32) Class2_Sub2_Sub14 local32 = (Class2_Sub2_Sub14) this.aClass192_5.method4346();
			this.method2149(local32);
		}
		@Pc(48) Class2_Sub2_Sub14_Sub1 local48 = new Class2_Sub2_Sub14_Sub1(arg1, arg2);
		this.aClass28_13.method735(arg0, local48);
		this.aClass192_5.method4348(local48);
		local48.aLong325 = 0L;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JI)V")
	public void method2154(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub2_Sub14 local15 = (Class2_Sub2_Sub14) this.aClass28_13.method738(arg0);
		this.method2149(local15);
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(JI)Ljava/lang/Object;")
	public Object method2156(@OriginalArg(0) long arg0) {
		@Pc(12) Class2_Sub2_Sub14 local12 = (Class2_Sub2_Sub14) this.aClass28_13.method738(arg0);
		if (local12 == null) {
			return null;
		}
		@Pc(26) Object local26 = local12.method9268();
		if (local26 == null) {
			local12.method9457();
			local12.method9260();
			this.anInt2281 += local12.anInt10683;
			return null;
		}
		if (local12.method9270()) {
			@Pc(65) Class2_Sub2_Sub14_Sub1 local65 = new Class2_Sub2_Sub14_Sub1(local26, local12.anInt10683);
			this.aClass28_13.method735(local12.aLong328, local65);
			this.aClass192_5.method4348(local65);
			local65.aLong325 = 0L;
			local12.method9457();
			local12.method9260();
		} else {
			this.aClass192_5.method4348(local12);
			local12.aLong325 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Z)V")
	public void method2157() {
		this.aClass192_5.method4351();
		this.aClass28_13.method737();
		this.anInt2281 = this.anInt2285;
	}
}
