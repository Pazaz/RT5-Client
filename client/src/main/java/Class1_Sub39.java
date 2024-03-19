import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!um", name = "v", descriptor = "I")
	public final int anInt6604;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "I")
	public final int anInt6605;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(II)V")
	public Class1_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6604 = arg0;
		this.anInt6605 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)Z")
	public boolean method5617() {
		return (this.anInt6604 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)Z")
	public boolean method5618(@OriginalArg(0) int arg0) {
		return (this.anInt6604 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Z")
	public boolean method5619() {
		return (this.anInt6604 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)Z")
	public boolean method5620() {
		return (this.anInt6604 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Z")
	public boolean method5621() {
		return (this.anInt6604 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Z")
	public boolean method5622() {
		return (this.anInt6604 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Z")
	public boolean method5623() {
		return (this.anInt6604 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I")
	public int method5625() {
		return this.anInt6604 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(B)I")
	public int method5626() {
		return Static263.method4775(this.anInt6604);
	}
}
