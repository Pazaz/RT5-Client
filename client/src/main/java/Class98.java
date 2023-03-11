import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class98 {

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "Lclient!wc;")
	private final Class246 aClass246_2 = new Class246();

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	private int anInt2608;

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
	private final int anInt2619;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Lclient!ad;")
	private final Class4 aClass4_56;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(I)V")
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2608 = arg0;
		this.anInt2619 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass4_56 = new Class4(local14);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method2612(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub2_Sub6 local10 = (Class2_Sub2_Sub6) this.aClass4_56.method90(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method5951();
		if (local25 == null) {
			local10.method6468();
			local10.method6143();
			this.anInt2608 += local10.anInt6636;
			return null;
		}
		if (local10.method5954()) {
			@Pc(53) Class2_Sub2_Sub6_Sub2 local53 = new Class2_Sub2_Sub6_Sub2(local25, local10.anInt6636);
			this.aClass4_56.method87(local53, local10.aLong232);
			this.aClass246_2.method6341(local53);
			local53.aLong215 = 0L;
			local10.method6468();
			local10.method6143();
		} else {
			this.aClass246_2.method6341(local10);
			local10.aLong215 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)I")
	public int method2613() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class2_Sub2_Sub6 local18 = (Class2_Sub2_Sub6) this.aClass246_2.method6337(); local18 != null; local18 = (Class2_Sub2_Sub6) this.aClass246_2.method6336()) {
			if (!local18.method5954()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
	public void method2614() {
		this.aClass246_2.method6342();
		this.aClass4_56.method81();
		this.anInt2608 = this.anInt2619;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
	public void method2615(@OriginalArg(0) int arg0) {
		if (Static308.aClass93_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub2_Sub6 local9 = (Class2_Sub2_Sub6) this.aClass246_2.method6337(); local9 != null; local9 = (Class2_Sub2_Sub6) this.aClass246_2.method6336()) {
			if (local9.method5954()) {
				if (local9.method5951() == null) {
					local9.method6468();
					local9.method6143();
					this.anInt2608++;
				}
			} else if (++local9.aLong215 > (long) arg0) {
				@Pc(35) Class2_Sub2_Sub6 local35 = Static308.aClass93_1.method3695(local9);
				this.aClass4_56.method87(local35, local9.aLong232);
				Static145.method2696(local9, local35);
				local9.method6468();
				local9.method6143();
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I")
	public int method2616() {
		return this.anInt2608;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/Object;J)V")
	private void method2617(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt2619 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2626(arg1);
		this.anInt2608--;
		while (this.anInt2608 < 0) {
			@Pc(36) Class2_Sub2_Sub6 local36 = (Class2_Sub2_Sub6) this.aClass246_2.method6339();
			this.method2625(local36);
		}
		@Pc(49) Class2_Sub2_Sub6_Sub2 local49 = new Class2_Sub2_Sub6_Sub2(arg0, 1);
		this.aClass4_56.method87(local49, arg1);
		this.aClass246_2.method6341(local49);
		local49.aLong215 = 0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method2618() {
		@Pc(17) Class2_Sub2_Sub6 local17 = (Class2_Sub2_Sub6) this.aClass4_56.method79();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method5951();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class2_Sub2_Sub6 local27 = local17;
			local17 = (Class2_Sub2_Sub6) this.aClass4_56.method79();
			local27.method6468();
			local27.method6143();
			this.anInt2608 += local17.anInt6636;
		}
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method2619() {
		@Pc(11) Class2_Sub2_Sub6 local11 = (Class2_Sub2_Sub6) this.aClass4_56.method80();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5951();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class2_Sub2_Sub6 local23 = local11;
			local11 = (Class2_Sub2_Sub6) this.aClass4_56.method79();
			local23.method6468();
			local23.method6143();
			this.anInt2608 += local11.anInt6636;
		}
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I")
	public int method2620() {
		return this.anInt2619;
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V")
	public void method2621() {
		for (@Pc(14) Class2_Sub2_Sub6 local14 = (Class2_Sub2_Sub6) this.aClass246_2.method6337(); local14 != null; local14 = (Class2_Sub2_Sub6) this.aClass246_2.method6336()) {
			if (local14.method5954()) {
				local14.method6468();
				local14.method6143();
				this.anInt2608 += local14.anInt6636;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method2624(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method2617(arg1, arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLclient!eu;)V")
	private void method2625(@OriginalArg(1) Class2_Sub2_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method6468();
			arg0.method6143();
			this.anInt2608 += arg0.anInt6636;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)V")
	private void method2626(@OriginalArg(0) long arg0) {
		@Pc(14) Class2_Sub2_Sub6 local14 = (Class2_Sub2_Sub6) this.aClass4_56.method90(arg0);
		this.method2625(local14);
	}
}
