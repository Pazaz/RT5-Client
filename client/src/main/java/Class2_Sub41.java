import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "I")
	public final int anInt6904;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
	public final int anInt6909;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(II)V")
	public Class2_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6904 = arg1;
		this.anInt6909 = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)I")
	public int method6216() {
		return Static622.method6853(this.anInt6909);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)Z")
	public boolean method6217() {
		return (this.anInt6909 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "(I)I")
	public int method6218() {
		return this.anInt6909 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)Z")
	public boolean method6219() {
		return (this.anInt6909 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)Z")
	public boolean method6220() {
		return (this.anInt6909 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BI)Z")
	public boolean method6221(@OriginalArg(1) int arg0) {
		return (this.anInt6909 >> arg0 + 1 & 0x1) != 0;
	}
}
