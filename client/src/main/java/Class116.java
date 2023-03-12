import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class116 {

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!tl;")
	private SecondaryNode aClass2_Sub2_32 = new SecondaryNode();

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Lclient!wc;")
	private final SecondaryLinkedList aClass246_3 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	private final int anInt3150;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	private int anInt3151;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!ad;")
	private final HashTable aClass4_69;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3150 = arg0;
		this.anInt3151 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass4_69 = new HashTable(local19);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JB)Lclient!tl;")
	public SecondaryNode method3152(@OriginalArg(0) long arg0) {
		@Pc(15) SecondaryNode local15 = (SecondaryNode) this.aClass4_69.get(arg0);
		if (local15 != null) {
			this.aClass246_3.addTail(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V")
	public void method3153() {
		this.aClass246_3.clear();
		this.aClass4_69.clear();
		this.aClass2_Sub2_32 = new SecondaryNode();
		this.anInt3151 = this.anInt3150;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!tl;J)V")
	public void method3155(@OriginalArg(1) SecondaryNode arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3151 == 0) {
			@Pc(7) SecondaryNode local7 = this.aClass246_3.method6339();
			local7.unlink();
			local7.unlinkSecondary();
			if (this.aClass2_Sub2_32 == local7) {
				local7 = this.aClass246_3.method6339();
				local7.unlink();
				local7.unlinkSecondary();
			}
		} else {
			this.anInt3151--;
		}
		this.aClass4_69.put(arg0, arg1);
		this.aClass246_3.addTail(arg0);
	}
}
