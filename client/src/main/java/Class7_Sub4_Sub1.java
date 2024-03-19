import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class7_Sub4_Sub1 extends Class7_Sub4 {

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	public int anInt6288;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public int anInt6289;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "I")
	public int anInt6292;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "I")
	public int anInt6294;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	public int anInt6295 = -1;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "I")
	public int anInt6287 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		@Pc(12) Class11 local12 = arg0.method2782();
		local12.method5496(super.anInt6283, super.anInt6282, super.anInt6284);
		@Pc(24) Class2_Sub3 local24 = Static159.method3981(3);
		@Pc(44) Class86 local44;
		if (this.anInt6295 != -1) {
			local44 = Static165.method3446(this.anInt6295).method954(this.anInt6288, arg0, 0, 0, 1024, null, null, -1);
			if (local44 != null) {
				local44.method5539(local12, local24.aClass2_Sub6Array1[2], 0);
			}
		}
		if (this.anInt6287 != -1) {
			local44 = Static165.method3446(this.anInt6287).method954(this.anInt6292, arg0, 0, 0, 1024, null, null, -1);
			if (local44 != null) {
				local44.method5539(local12, local24.aClass2_Sub6Array1[1], 0);
			}
		}
		local44 = Static165.method3446(this.anInt6294).method954(this.anInt6289, arg0, 0, 0, 1024, null, null, -1);
		if (local44 != null) {
			local44.method5539(local12, local24.aClass2_Sub6Array1[0], 0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class11 local6 = arg1.method2782();
		local6.method5496(super.anInt6283, super.anInt6282, super.anInt6284);
		@Pc(38) Class86 local38 = Static165.method3446(this.anInt6294).method954(this.anInt6289, arg1, 0, 0, 65536, null, null, -1);
		if (local38 != null && local38.method5556(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt6287 != -1) {
			local38 = Static165.method3446(this.anInt6287).method954(this.anInt6292, arg1, 0, 0, 65536, null, null, -1);
			if (local38 != null && local38.method5556(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt6295 != -1) {
			local38 = Static165.method3446(this.anInt6295).method954(this.anInt6288, arg1, 0, 0, 65536, null, null, -1);
			if (local38 != null && local38.method5556(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
