import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	public int anInt7203 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public int anInt7204 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	public int anInt7202 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public int anInt7206 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public int anInt7211 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	public int anInt7212 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public int anInt7208 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public int anInt7205 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!lo;")
	public final Class1_Sub21 aClass1_Sub21_1;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!lo;)V")
	public Class1_Sub42(@OriginalArg(0) Class1_Sub21 arg0) {
		this.aClass1_Sub21_1 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public boolean method6041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt7208 && this.anInt7211 >= arg1 && this.anInt7205 <= arg0 && arg0 <= this.anInt7212) {
			return true;
		} else {
			return this.anInt7202 <= arg1 && arg1 <= this.anInt7206 && this.anInt7203 <= arg0 && this.anInt7204 >= arg0;
		}
	}
}
