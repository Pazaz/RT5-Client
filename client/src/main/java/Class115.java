import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class115 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!rr;")
	private final Class179 aClass179_5 = new Class179();

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	private int anInt4033;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	private final int anInt4025;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!sf;")
	private final Class183 aClass183_17;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
	public Class115(@OriginalArg(0) int arg0) {
		this.anInt4033 = arg0;
		this.anInt4025 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass183_17 = new Class183(local14);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
	public int method3452() {
		return this.anInt4025;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public void method3453() {
		for (@Pc(12) Class1_Sub1_Sub4 local12 = (Class1_Sub1_Sub4) this.aClass179_5.method4935(); local12 != null; local12 = (Class1_Sub1_Sub4) this.aClass179_5.method4932()) {
			if (local12.method3978()) {
				local12.method6172();
				local12.method6158();
				this.anInt4033++;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public void method3454() {
		this.aClass179_5.method4929();
		this.aClass183_17.method5051();
		this.anInt4033 = this.anInt4025;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I")
	public int method3455() {
		return this.anInt4033;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!bp;)Ljava/lang/Object;")
	public Object method3456(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method3076();
		for (@Pc(16) Class1_Sub1_Sub4 local16 = (Class1_Sub1_Sub4) this.aClass183_17.method5053(local9); local16 != null; local16 = (Class1_Sub1_Sub4) this.aClass183_17.method5048()) {
			if (local16.anInterface1_3.method3077(arg0)) {
				@Pc(28) Object local28 = local16.method3979();
				if (local28 != null) {
					if (local16.method3978()) {
						@Pc(54) Class1_Sub1_Sub4_Sub1 local54 = new Class1_Sub1_Sub4_Sub1(arg0, local28);
						this.aClass183_17.method5055(local16.aLong235, local54);
						this.aClass179_5.method4927(local54);
						local54.aLong234 = 0L;
						local16.method6172();
						local16.method6158();
					} else {
						this.aClass179_5.method4927(local16);
						local16.aLong234 = 0L;
					}
					return local28;
				}
				local16.method6172();
				local16.method6158();
				this.anInt4033++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!bp;ILjava/lang/Object;)V")
	public void method3458(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Object arg1) {
		this.method3460(arg0);
		if (this.anInt4033 == 0) {
			@Pc(24) Class1_Sub1_Sub4 local24 = (Class1_Sub1_Sub4) this.aClass179_5.method4926();
			local24.method6172();
			local24.method6158();
		} else {
			this.anInt4033--;
		}
		@Pc(36) Class1_Sub1_Sub4_Sub1 local36 = new Class1_Sub1_Sub4_Sub1(arg0, arg1);
		this.aClass183_17.method5055(arg0.method3076(), local36);
		this.aClass179_5.method4927(local36);
		local36.aLong234 = 0;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(BLclient!bp;)V")
	private void method3460(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method3076();
		for (@Pc(18) Class1_Sub1_Sub4 local18 = (Class1_Sub1_Sub4) this.aClass183_17.method5053(local9); local18 != null; local18 = (Class1_Sub1_Sub4) this.aClass183_17.method5048()) {
			if (local18.anInterface1_3.method3077(arg0)) {
				local18.method6172();
				local18.method6158();
				this.anInt4033++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V")
	public void method3463() {
		if (Static154.aClass67_1 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub1_Sub4 local9 = (Class1_Sub1_Sub4) this.aClass179_5.method4935(); local9 != null; local9 = (Class1_Sub1_Sub4) this.aClass179_5.method4932()) {
			if (local9.method3978()) {
				if (local9.method3979() == null) {
					local9.method6172();
					local9.method6158();
					this.anInt4033++;
				}
			} else if ((long) 5 < ++local9.aLong234) {
				@Pc(49) Class1_Sub1_Sub4 local49 = Static154.aClass67_1.method1990(local9);
				this.aClass183_17.method5055(local9.aLong235, local49);
				Static190.method4600(local9, local49);
				local9.method6172();
				local9.method6158();
			}
		}
	}
}
