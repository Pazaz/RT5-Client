import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!haa;")
	public Class2_Sub6_Sub2 aClass2_Sub6_Sub2_3;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	public int anInt9349;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public int anInt9350;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	public int anInt9351;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "Lclient!c;")
	public Class54 aClass54_1;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
	public int anInt9352;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public int anInt9353;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
	public int anInt9354;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
	public int anInt9355;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
	public int anInt9356;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "Lclient!haa;")
	public Class2_Sub6_Sub2 aClass2_Sub6_Sub2_4;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
	public int anInt9357;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	public int anInt9358;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
	public int anInt9359;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
	public int anInt9360;

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "Lclient!ca;")
	public Class8_Sub2_Sub1_Sub2_Sub1 aClass8_Sub2_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
	public boolean aBoolean713;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "Lclient!sq;")
	public Class2_Sub49_Sub1 aClass2_Sub49_Sub1_3;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!sq;")
	public Class2_Sub49_Sub1 aClass2_Sub49_Sub1_4;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Lclient!uj;")
	public Class2_Sub53 aClass2_Sub53_2;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
	public int[] anIntArray718;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "Lclient!uj;")
	public Class2_Sub53 aClass2_Sub53_3;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	public int anInt9362;

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "Lclient!wj;")
	public Class8_Sub2_Sub1_Sub2_Sub2 aClass8_Sub2_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
	public boolean aBoolean715;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public int anInt9365;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public int anInt9364 = 0;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public void method8236() {
		@Pc(11) int local11 = this.anInt9353;
		@Pc(14) boolean local14 = this.aBoolean714;
		if (this.aClass54_1 != null) {
			@Pc(148) Class54 local148 = this.aClass54_1.method1301(13, Static1.anInt10798 == 3 ? Static298.anInterface23_2 : Static34.aClass304_1);
			if (local148 == null) {
				this.anIntArray718 = null;
				this.anInt9353 = -1;
				this.aBoolean714 = false;
				this.anInt9358 = 0;
				this.anInt9359 = 256;
				this.anInt9354 = 0;
				this.anInt9355 = 0;
				this.aBoolean715 = false;
				this.anInt9360 = 256;
				this.anInt9365 = 0;
				this.anInt9356 = 0;
			} else {
				this.aBoolean714 = local148.aBoolean88;
				this.anInt9360 = local148.anInt1249;
				this.anInt9359 = local148.anInt1268;
				this.anInt9356 = local148.anInt1244 << 9;
				this.anInt9358 = local148.anInt1253;
				this.anInt9354 = local148.anInt1219;
				this.anInt9353 = local148.anInt1246;
				this.anIntArray718 = local148.anIntArray116;
				this.aBoolean715 = local148.aBoolean92;
				this.anInt9365 = local148.anInt1231;
			}
		} else if (this.aClass8_Sub2_Sub1_Sub2_Sub2_3 != null) {
			@Pc(27) int local27 = Static497.method6629(this.aClass8_Sub2_Sub1_Sub2_Sub2_3);
			if (local27 != local11) {
				this.anInt9353 = local27;
				@Pc(37) Class268 local37 = this.aClass8_Sub2_Sub1_Sub2_Sub2_3.aClass268_1;
				if (local37.anIntArray532 != null) {
					local37 = local37.method5985(65535, Static34.aClass304_1);
				}
				if (local37 == null) {
					this.aBoolean714 = this.aClass8_Sub2_Sub1_Sub2_Sub2_3.aClass268_1.aBoolean508;
					this.anInt9359 = 256;
					this.anInt9360 = 256;
					this.anInt9358 = this.anInt9356 = this.anInt9355 = 0;
				} else {
					this.anInt9360 = local37.anInt6736;
					this.anInt9358 = local37.anInt6721;
					this.anInt9356 = local37.anInt6742 << 9;
					this.anInt9359 = local37.anInt6729;
					this.aBoolean714 = local37.aBoolean508;
					this.anInt9355 = local37.anInt6741 << 9;
				}
			}
		} else if (this.aClass8_Sub2_Sub1_Sub2_Sub1_3 != null) {
			this.anInt9353 = Static326.method4870(this.aClass8_Sub2_Sub1_Sub2_Sub1_3);
			this.anInt9358 = this.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt1460;
			this.anInt9355 = 0;
			this.anInt9359 = 256;
			this.anInt9356 = this.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt1452 << 9;
			this.aBoolean714 = this.aClass8_Sub2_Sub1_Sub2_Sub1_3.aBoolean126;
			this.anInt9360 = 256;
		}
		if (this.anInt9353 == local11 && this.aBoolean714 == local14) {
			return;
		}
		if (this.aClass2_Sub6_Sub2_4 == null) {
			return;
		}
		Static336.aClass2_Sub6_Sub3_1.method5883(this.aClass2_Sub6_Sub2_4);
		this.aClass2_Sub6_Sub2_4 = null;
		this.aClass2_Sub49_Sub1_4 = null;
		this.aClass2_Sub53_3 = null;
	}
}
