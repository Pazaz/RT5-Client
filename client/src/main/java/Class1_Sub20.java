import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Lclient!hg;")
	public Class1_Sub3_Sub2 aClass1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
	public int anInt4002;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!hg;")
	public Class1_Sub3_Sub2 aClass1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	public int anInt4003;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	public int anInt4004;

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "Lclient!vp;")
	public Class7_Sub1_Sub1_Sub2 aClass7_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "Z")
	public boolean aBoolean284;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
	public int anInt4010;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
	public int anInt4011;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
	public int anInt4012;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "Lclient!ai;")
	public Class7_Sub1_Sub1_Sub1 aClass7_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	public int anInt4015;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
	public int anInt4017;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
	public int anInt4018;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "Lclient!ta;")
	public Class189 aClass189_1;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
	public int anInt4009 = 0;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V")
	public void method3451() {
		@Pc(14) int local14 = this.anInt4008;
		if (this.aClass189_1 != null) {
			@Pc(92) Class189 local92 = this.aClass189_1.method5210();
			if (local92 == null) {
				this.anIntArray282 = null;
				this.anInt4003 = 0;
				this.anInt4008 = -1;
				this.anInt4010 = 0;
				this.anInt4004 = 0;
				this.anInt4005 = 0;
			} else {
				this.anInt4003 = local92.anInt6185 * 128;
				this.anIntArray282 = local92.anIntArray474;
				this.anInt4010 = local92.anInt6176;
				this.anInt4005 = local92.anInt6190;
				this.anInt4008 = local92.anInt6210;
				this.anInt4004 = local92.anInt6182;
			}
		} else if (this.aClass7_Sub1_Sub1_Sub1_1 != null) {
			@Pc(48) int local48 = Static352.method6141(this.aClass7_Sub1_Sub1_Sub1_1);
			if (local48 != local14) {
				this.anInt4008 = local48;
				@Pc(58) Class75 local58 = this.aClass7_Sub1_Sub1_Sub1_1.aClass75_1;
				if (local58.anIntArray155 != null) {
					local58 = local58.method2064();
				}
				if (local58 == null) {
					this.anInt4005 = this.anInt4003 = 0;
				} else {
					this.anInt4005 = local58.anInt2464;
					this.anInt4003 = local58.anInt2476 * 128;
				}
			}
		} else if (this.aClass7_Sub1_Sub1_Sub2_1 != null) {
			this.anInt4008 = Static256.method4724(this.aClass7_Sub1_Sub1_Sub2_1);
			this.anInt4005 = this.aClass7_Sub1_Sub1_Sub2_1.anInt7118;
			this.anInt4003 = this.aClass7_Sub1_Sub1_Sub2_1.anInt7135 * 128;
		}
		if (this.anInt4008 != local14 && this.aClass1_Sub3_Sub2_3 != null) {
			Static127.aClass1_Sub3_Sub3_1.method3522(this.aClass1_Sub3_Sub2_3);
			this.aClass1_Sub3_Sub2_3 = null;
		}
	}
}
