import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!av;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method88(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(6) int local6 = arg1.method7396();
		@Pc(13) int local13;
		if (this.aClass28_1 == null) {
			local13 = Static440.method5962(local6);
			this.aClass28_1 = new Class28(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(32) boolean local32 = arg1.method7396() == 1;
			@Pc(36) int local36 = arg1.method7383();
			@Pc(45) Class2 local45;
			if (local32) {
				local45 = new Class2_Sub24(arg1.method7358());
			} else {
				local45 = new Class2_Sub38(arg1.method7349());
			}
			this.aClass28_1.method735((long) local36, local45);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
	public int method89(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass28_1 == null) {
			return arg0;
		} else {
			@Pc(17) Class2_Sub38 local17 = (Class2_Sub38) this.aClass28_1.method738((long) arg1);
			return local17 == null ? arg0 : local17.anInt6379;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!ge;)V")
	public void method90(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7396();
			if (local7 == 0) {
				return;
			}
			this.method88(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method91(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass28_1 == null) {
			return arg1;
		} else {
			@Pc(23) Class2_Sub24 local23 = (Class2_Sub24) this.aClass28_1.method738((long) arg0);
			return local23 == null ? arg1 : local23.aString46;
		}
	}
}
