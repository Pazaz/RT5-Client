import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class97 {

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Lclient!wc;")
	private final Class246 aClass246_1 = new Class246();

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
	private final int anInt2588;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	private int anInt2579;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!ad;")
	private final Class4 aClass4_55;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt2588 = arg0;
		this.anInt2579 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass4_55 = new Class4(local16);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!iq;Ljava/lang/Object;)V")
	public void method2583(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Object arg1) {
		this.method2588(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public void method2584() {
		this.aClass246_1.method6342();
		this.aClass4_55.method81();
		this.anInt2579 = this.anInt2588;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!bq;B)V")
	private void method2586(@OriginalArg(0) Class2_Sub2_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method6468();
			arg0.method6143();
			this.anInt2579 += arg0.anInt5040;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
	public int method2587() {
		return this.anInt2579;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!iq;Ljava/lang/Object;II)V")
	private void method2588(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt2588 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2593(arg0);
		this.anInt2579--;
		while (this.anInt2579 < 0) {
			@Pc(36) Class2_Sub2_Sub2 local36 = (Class2_Sub2_Sub2) this.aClass246_1.method6339();
			this.method2586(local36);
		}
		@Pc(61) Class2_Sub2_Sub2_Sub2 local61 = new Class2_Sub2_Sub2_Sub2(arg0, arg1, 1);
		this.aClass4_55.method87(local61, arg0.method1779());
		this.aClass246_1.method6341(local61);
		local61.aLong215 = 0L;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V")
	public void method2589() {
		if (Static281.aClass236_1 == null) {
			return;
		}
		for (@Pc(19) Class2_Sub2_Sub2 local19 = (Class2_Sub2_Sub2) this.aClass246_1.method6337(); local19 != null; local19 = (Class2_Sub2_Sub2) this.aClass246_1.method6336()) {
			if (local19.method4625()) {
				if (local19.method4626() == null) {
					local19.method6468();
					local19.method6143();
					this.anInt2579 += local19.anInt5040;
				}
			} else if ((long) 5 < ++local19.aLong215) {
				@Pc(66) Class2_Sub2_Sub2 local66 = Static281.aClass236_1.method6030(local19);
				this.aClass4_55.method87(local66, local19.aLong232);
				Static145.method2696(local19, local66);
				local19.method6468();
				local19.method6143();
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
	public void method2590() {
		for (@Pc(7) Class2_Sub2_Sub2 local7 = (Class2_Sub2_Sub2) this.aClass246_1.method6337(); local7 != null; local7 = (Class2_Sub2_Sub2) this.aClass246_1.method6336()) {
			if (local7.method4625()) {
				local7.method6468();
				local7.method6143();
				this.anInt2579 += local7.anInt5040;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)I")
	public int method2592() {
		return this.anInt2588;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!iq;)V")
	private void method2593(@OriginalArg(1) Interface7 arg0) {
		@Pc(11) long local11 = arg0.method1779();
		for (@Pc(25) Class2_Sub2_Sub2 local25 = (Class2_Sub2_Sub2) this.aClass4_55.method90(local11); local25 != null; local25 = (Class2_Sub2_Sub2) this.aClass4_55.method82()) {
			if (local25.anInterface7_3.method1778(arg0)) {
				this.method2586(local25);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!iq;I)Ljava/lang/Object;")
	public Object method2596(@OriginalArg(0) Interface7 arg0) {
		@Pc(11) long local11 = arg0.method1779();
		for (@Pc(18) Class2_Sub2_Sub2 local18 = (Class2_Sub2_Sub2) this.aClass4_55.method90(local11); local18 != null; local18 = (Class2_Sub2_Sub2) this.aClass4_55.method82()) {
			if (local18.anInterface7_3.method1778(arg0)) {
				@Pc(30) Object local30 = local18.method4626();
				if (local30 != null) {
					if (local18.method4625()) {
						@Pc(59) Class2_Sub2_Sub2_Sub2 local59 = new Class2_Sub2_Sub2_Sub2(arg0, local30, local18.anInt5040);
						this.aClass4_55.method87(local59, local18.aLong232);
						this.aClass246_1.method6341(local59);
						local59.aLong215 = 0L;
						local18.method6468();
						local18.method6143();
					} else {
						this.aClass246_1.method6341(local18);
						local18.aLong215 = 0L;
					}
					return local30;
				}
				local18.method6468();
				local18.method6143();
				this.anInt2579 += local18.anInt5040;
			}
		}
		return null;
	}
}
