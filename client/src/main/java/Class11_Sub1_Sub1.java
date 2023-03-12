import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "Lclient!gq;")
	public Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIILclient!gq;)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class11_Sub1 arg5) {
		super(arg2, arg3, arg4, Static10.method238(arg1, arg0));
		this.aClass11_Sub1_1 = arg5;
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6076() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!wm;B)V")
	@Override
	public void method6070(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	@Override
	public void method6069() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!wm;I)Lclient!gn;")
	@Override
	public Model method6088(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	@Override
	public void method6082() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) BaseEntity arg5) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I")
	@Override
	public int method6081() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)I")
	@Override
	public int method6084() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIBLclient!wm;)Z")
	@Override
	public boolean method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	@Override
	public Class12_Sub4 method6073(@OriginalArg(0) Class19 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6086() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLclient!wm;)V")
	@Override
	public void method6087(@OriginalArg(1) Class19 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)I")
	@Override
	public int method6085() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!wm;I)V")
	@Override
	public void method6083(@OriginalArg(0) Class19 arg0) {
	}
}
