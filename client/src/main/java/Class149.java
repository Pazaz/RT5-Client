import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class149 {

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	private int anInt5096;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public int anInt5099;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	public int anInt5100;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Lclient!n;")
	public Class133 method4351() {
		@Pc(16) Class133 local16 = (Class133) Static18.aClass215_9.method6057((long) this.anInt5096);
		if (local16 != null) {
			return local16;
		}
		local16 = Static363.method3886(Static246.aClass162_223, this.anInt5096, 0);
		if (local16 != null) {
			Static18.aClass215_9.method6050(local16, (long) this.anInt5096);
		}
		return local16;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLclient!il;)V")
	public void method4352(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method5761();
			if (local9 == 0) {
				return;
			}
			this.method4357(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!il;IZI)V")
	private void method4357(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5096 = arg0.method5749();
		} else if (arg1 == 2) {
			this.anInt5100 = arg0.method5761();
			this.anInt5099 = arg0.method5761();
		}
	}
}
