import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[Lclient!np;")
	public Class2_Sub6[] aClass2_Sub6Array1;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!cb;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public int anInt2403;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "I")
	public int anInt2407;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!nr;BII)Z")
	public boolean method1999(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass2_Sub6Array1 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.aClass2_Sub6Array1.length; local17++) {
				if (this.aClass2_Sub6Array1[local17].method4134(arg1, arg2) && this.aClass7_1.method5950(arg2, arg0, arg1)) {
					return true;
				}
			}
		}
		return false;
	}
}
