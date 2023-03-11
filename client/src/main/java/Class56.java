import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class56 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!hu;")
	private final Class98 aClass98_8 = new Class98(256);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_9;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!ci;")
	private final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!bf;Lclient!ci;)V")
	public Class56(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass19_Sub1_9 = arg0;
		this.anInterface2_3 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method1787() {
		this.aClass98_8.method2614();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Lclient!al;")
	public Class8_Sub1 method1788(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass98_8.method2612((long) arg0);
		if (local6 != null) {
			return (Class8_Sub1) local6;
		} else if (this.anInterface2_3.method2657(arg0)) {
			@Pc(28) Class229 local28 = this.anInterface2_3.method2658(arg0);
			@Pc(35) int local35 = local28.aBoolean441 ? 64 : 128;
			@Pc(73) Class8_Sub1 local73;
			if (local28.aBoolean437 && this.aClass19_Sub1_9.method2892()) {
				@Pc(52) float[] local52 = this.anInterface2_3.method2660(arg0, local35, 0.7F, local35);
				local73 = new Class8_Sub1(this.aClass19_Sub1_9, 3553, 34842, local35, local35, local28.aByte66 != 0, local52, 6408);
			} else {
				@Pc(84) int[] local84 = this.anInterface2_3.method2656(0.7F, local35, local35, arg0);
				local73 = new Class8_Sub1(this.aClass19_Sub1_9, 3553, 6408, local35, local35, local28.aByte66 != 0, local84, false);
			}
			local73.method3638(local28.aBoolean436, local28.aBoolean439);
			this.aClass98_8.method2624((long) arg0, local73);
			return local73;
		} else {
			return null;
		}
	}
}
