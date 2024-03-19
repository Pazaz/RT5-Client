import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "Lclient!sf;")
	private Class183 aClass183_35;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!il;B)V")
	public void method6161(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5761();
			if (local10 == 0) {
				return;
			}
			this.method6162(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!il;I)V")
	private void method6162(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method5761();
		@Pc(19) int local19;
		if (this.aClass183_35 == null) {
			local19 = Static162.method3414(local12);
			this.aClass183_35 = new Class183(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg0.method5761() == 1;
			@Pc(44) int local44 = arg0.method5755();
			@Pc(53) Class1 local53;
			if (local40) {
				local53 = new Class1_Sub31(arg0.method5776());
			} else {
				local53 = new Class1_Sub26(arg0.method5730());
			}
			this.aClass183_35.method5055((long) local44, local53);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBI)I")
	public int method6164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass183_35 == null) {
			return arg0;
		} else {
			@Pc(24) Class1_Sub26 local24 = (Class1_Sub26) this.aClass183_35.method5053((long) arg1);
			return local24 == null ? arg0 : local24.anInt4811;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method6166(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass183_35 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub31 local24 = (Class1_Sub31) this.aClass183_35.method5053((long) arg0);
			return local24 == null ? arg1 : local24.aString205;
		}
	}
}
