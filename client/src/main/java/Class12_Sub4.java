import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class12_Sub4 extends ParticleNode {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public int anInt4073;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "[Lclient!au;")
	public Class12_Sub2[] aClass12_Sub2Array1;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	public int anInt4075;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "Lclient!hp;")
	public BaseEntity aClass11_1;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	public int anInt4076;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBILclient!wm;)Z")
	public boolean method4025(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) RasteriserBase arg2) {
		if (this.aClass12_Sub2Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass12_Sub2Array1.length; local15++) {
				if (this.aClass12_Sub2Array1[local15].method432(arg1, arg0) && this.aClass11_1.method6068(arg1, arg0, arg2)) {
					return true;
				}
			}
		}
		return false;
	}
}
