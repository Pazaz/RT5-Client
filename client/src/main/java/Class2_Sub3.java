import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Lclient!vs;")
	protected Class243 aClass243_41;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "Lclient!nc;")
	protected Class158 aClass158_41;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt7251;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "[Lclient!jq;")
	public final Class2_Sub3[] aClass2_Sub3Array42;

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "Z")
	public boolean aBoolean487;

	static {
		new Class79("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub3Array42 = new Class2_Sub3[arg0];
		this.aBoolean487 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IZI)[I")
	protected final int[] method6473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub3Array42[arg0].aBoolean487 ? this.aClass2_Sub3Array42[arg0].method6485(arg1) : this.aClass2_Sub3Array42[arg0].method6479(arg1)[0];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V")
	public void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt7251 == 255 ? arg0 : this.anInt7251;
		if (this.aBoolean487) {
			this.aClass158_41 = new Class158(local12, arg0, arg1);
		} else {
			this.aClass243_41 = new Class243(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void method6477() {
		if (this.aBoolean487) {
			this.aClass158_41.method3994();
			this.aClass158_41 = null;
		} else {
			this.aClass243_41.method6283();
			this.aClass243_41 = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	public int method6478() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)[[I")
	public int[][] method6479(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
	public void method6480() {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
	public int method6482() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(IZI)[[I")
	protected final int[][] method6483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub3Array42[arg0].aBoolean487) {
			@Pc(22) int[] local22 = this.aClass2_Sub3Array42[arg0].method6485(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass2_Sub3Array42[arg0].method6479(arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!bt;I)V")
	public void method6484(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[I")
	public int[] method6485(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
