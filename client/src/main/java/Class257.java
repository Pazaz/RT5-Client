import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class257 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "Lclient!rw;")
	public Class2_Sub2_Sub18 aClass2_Sub2_Sub18_1;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "I")
	public int anInt6448;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lclient!rw;")
	public Class2_Sub2_Sub18 aClass2_Sub2_Sub18_2;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
	public int anInt6450;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
	public int anInt6452;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!bp;BLclient!cka;II[I)Z")
	public boolean method5769(@OriginalArg(0) Class50 arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (this.aBoolean481) {
			return true;
		} else if (arg4.length <= arg3) {
			return false;
		} else {
			this.anInt6448 = arg4[arg3];
			this.aClass2_Sub2_Sub18_1 = arg0.method1166(this.anInt6448 >> 16);
			this.anInt6448 &= 0xFFFF;
			if (this.aClass2_Sub2_Sub18_1 == null) {
				return false;
			}
			if (arg1.aBoolean142 && arg2 != -1 && arg4.length > arg2) {
				this.anInt6450 = arg4[arg2];
				this.aClass2_Sub2_Sub18_2 = arg0.method1166(this.anInt6450 >> 16);
				this.anInt6450 &= 0xFFFF;
			}
			if (arg1.aBoolean140) {
				this.anInt6452 |= 0x200;
			}
			if (this.aClass2_Sub2_Sub18_1.method7570(this.anInt6448)) {
				this.anInt6452 |= 0x80;
			}
			if (this.aClass2_Sub2_Sub18_1.method7568(this.anInt6448)) {
				this.anInt6452 |= 0x100;
			}
			if (this.aClass2_Sub2_Sub18_1.method7569(this.anInt6448)) {
				this.anInt6452 |= 0x400;
			}
			if (this.aClass2_Sub2_Sub18_2 != null) {
				if (this.aClass2_Sub2_Sub18_2.method7570(this.anInt6450)) {
					this.anInt6452 |= 0x80;
				}
				if (this.aClass2_Sub2_Sub18_2.method7568(this.anInt6450)) {
					this.anInt6452 |= 0x100;
				}
				if (this.aClass2_Sub2_Sub18_2.method7569(this.anInt6450)) {
					this.anInt6452 |= 0x400;
				}
			}
			this.aBoolean481 = true;
			this.anInt6452 |= 0x20;
			return true;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	public void method5774() {
		this.anInt6452 = 0;
		this.aBoolean481 = false;
		this.aClass2_Sub2_Sub18_1 = this.aClass2_Sub2_Sub18_2 = null;
	}
}
