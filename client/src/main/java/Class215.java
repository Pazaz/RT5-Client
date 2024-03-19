import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class215 {

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!rr;")
	private final Class179 aClass179_11 = new Class179();

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	private final int anInt7242;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	private int anInt7228;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!sf;")
	private final Class183 aClass183_34;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
	public Class215(@OriginalArg(0) int arg0) {
		this.anInt7242 = arg0;
		this.anInt7228 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass183_34 = new Class183(local14);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/lang/Object;J)V")
	public void method6050(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method6051(arg1);
		if (this.anInt7228 == 0) {
			@Pc(22) Class1_Sub1_Sub1 local22 = (Class1_Sub1_Sub1) this.aClass179_11.method4926();
			local22.method6172();
			local22.method6158();
		} else {
			this.anInt7228--;
		}
		@Pc(41) Class1_Sub1_Sub1_Sub1 local41 = new Class1_Sub1_Sub1_Sub1(arg0);
		this.aClass183_34.method5055(arg1, local41);
		this.aClass179_11.method4927(local41);
		local41.aLong234 = 0L;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IJ)V")
	private void method6051(@OriginalArg(1) long arg0) {
		@Pc(17) Class1_Sub1_Sub1 local17 = (Class1_Sub1_Sub1) this.aClass183_34.method5053(arg0);
		if (local17 != null) {
			local17.method6172();
			local17.method6158();
			this.anInt7228++;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public void method6052() {
		for (@Pc(19) Class1_Sub1_Sub1 local19 = (Class1_Sub1_Sub1) this.aClass179_11.method4935(); local19 != null; local19 = (Class1_Sub1_Sub1) this.aClass179_11.method4932()) {
			if (local19.method4237()) {
				local19.method6172();
				local19.method6158();
				this.anInt7228++;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method6054() {
		@Pc(13) Class1_Sub1_Sub1 local13 = (Class1_Sub1_Sub1) this.aClass183_34.method5052();
		while (local13 != null) {
			@Pc(19) Object local19 = local13.method4234();
			if (local19 != null) {
				return local19;
			}
			@Pc(25) Class1_Sub1_Sub1 local25 = local13;
			local13 = (Class1_Sub1_Sub1) this.aClass183_34.method5050();
			local25.method6172();
			local25.method6158();
			this.anInt7228++;
		}
		return null;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
	public int method6055() {
		@Pc(15) int local15 = 0;
		for (@Pc(21) Class1_Sub1_Sub1 local21 = (Class1_Sub1_Sub1) this.aClass179_11.method4935(); local21 != null; local21 = (Class1_Sub1_Sub1) this.aClass179_11.method4932()) {
			if (!local21.method4237()) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method6057(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub1_Sub1 local10 = (Class1_Sub1_Sub1) this.aClass183_34.method5053(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method4234();
		if (local25 == null) {
			local10.method6172();
			local10.method6158();
			this.anInt7228++;
			return null;
		}
		if (local10.method4237()) {
			@Pc(50) Class1_Sub1_Sub1_Sub1 local50 = new Class1_Sub1_Sub1_Sub1(local25);
			this.aClass183_34.method5055(local10.aLong235, local50);
			this.aClass179_11.method4927(local50);
			local50.aLong234 = 0L;
			local10.method6172();
			local10.method6158();
		} else {
			this.aClass179_11.method4927(local10);
			local10.aLong234 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I")
	public int method6058() {
		return this.anInt7228;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	public void method6060() {
		this.aClass179_11.method4929();
		this.aClass183_34.method5051();
		this.anInt7228 = this.anInt7242;
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method6061() {
		@Pc(16) Class1_Sub1_Sub1 local16 = (Class1_Sub1_Sub1) this.aClass183_34.method5050();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method4234();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class1_Sub1_Sub1 local26 = local16;
			local16 = (Class1_Sub1_Sub1) this.aClass183_34.method5050();
			local26.method6172();
			local26.method6158();
			this.anInt7228++;
		}
		return null;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)I")
	public int method6062() {
		return this.anInt7242;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public void method6063(@OriginalArg(1) int arg0) {
		if (Static243.aClass57_1 == null) {
			return;
		}
		for (@Pc(19) Class1_Sub1_Sub1 local19 = (Class1_Sub1_Sub1) this.aClass179_11.method4935(); local19 != null; local19 = (Class1_Sub1_Sub1) this.aClass179_11.method4932()) {
			if (local19.method4237()) {
				if (local19.method4234() == null) {
					local19.method6172();
					local19.method6158();
					this.anInt7228++;
				}
			} else if ((long) arg0 < ++local19.aLong234) {
				@Pc(67) Class1_Sub1_Sub1 local67 = Static243.aClass57_1.method1652(local19);
				this.aClass183_34.method5055(local19.aLong235, local67);
				Static190.method4600(local19, local67);
				local19.method6172();
				local19.method6158();
			}
		}
	}
}
