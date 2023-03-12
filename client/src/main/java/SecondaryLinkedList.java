import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class SecondaryLinkedList {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!tl;")
	private SecondaryNode aClass2_Sub2_54;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!tl;")
	private final SecondaryNode aClass2_Sub2_53 = new SecondaryNode();

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public SecondaryLinkedList() {
		this.aClass2_Sub2_53.secondaryPrev = this.aClass2_Sub2_53;
		this.aClass2_Sub2_53.secondaryNext = this.aClass2_Sub2_53;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lclient!tl;")
	public SecondaryNode next() {
		@Pc(6) SecondaryNode local6 = this.aClass2_Sub2_54;
		if (this.aClass2_Sub2_53 == local6) {
			this.aClass2_Sub2_54 = null;
			return null;
		} else {
			this.aClass2_Sub2_54 = local6.secondaryNext;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!tl;")
	public SecondaryNode head() {
		@Pc(14) SecondaryNode local14 = this.aClass2_Sub2_53.secondaryNext;
		if (local14 == this.aClass2_Sub2_53) {
			this.aClass2_Sub2_54 = null;
			return null;
		} else {
			this.aClass2_Sub2_54 = local14.secondaryNext;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	public int method6338() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) SecondaryNode local11 = this.aClass2_Sub2_53.secondaryNext; local11 != this.aClass2_Sub2_53; local11 = local11.secondaryNext) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lclient!tl;")
	public SecondaryNode method6339() {
		@Pc(7) SecondaryNode local7 = this.aClass2_Sub2_53.secondaryNext;
		if (this.aClass2_Sub2_53 == local7) {
			return null;
		} else {
			local7.unlinkSecondary();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!tl;)V")
	public void addTail(@OriginalArg(1) SecondaryNode arg0) {
		if (arg0.secondaryPrev != null) {
			arg0.unlinkSecondary();
		}
		arg0.secondaryPrev = this.aClass2_Sub2_53.secondaryPrev;
		arg0.secondaryNext = this.aClass2_Sub2_53;
		arg0.secondaryPrev.secondaryNext = arg0;
		arg0.secondaryNext.secondaryPrev = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public void clear() {
		while (true) {
			@Pc(9) SecondaryNode local9 = this.aClass2_Sub2_53.secondaryNext;
			if (local9 == this.aClass2_Sub2_53) {
				this.aClass2_Sub2_54 = null;
				return;
			}
			local9.unlinkSecondary();
		}
	}
}
