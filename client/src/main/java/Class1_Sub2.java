import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "Lclient!ug;")
	protected Class201 aClass201_41;

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
	public int anInt7266;

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "Lclient!ga;")
	protected Class68 aClass68_41;

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "Z")
	public boolean aBoolean515;

	@OriginalMember(owner = "client!ak", name = "L", descriptor = "[Lclient!ak;")
	public final Class1_Sub2[] aClass1_Sub2Array41;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean515 = arg1;
		this.aClass1_Sub2Array41 = new Class1_Sub2[arg0];
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I")
	public int method6073() {
		return -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLclient!il;)V")
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)I")
	public int method6075() {
		return -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)[I")
	protected final int[] method6078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub2Array41[arg0].aBoolean515 ? this.aClass1_Sub2Array41[arg0].method6085(arg1) : this.aClass1_Sub2Array41[arg0].method6081(arg1)[0];
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	public void method6079() {
		if (this.aBoolean515) {
			this.aClass201_41.method5515();
			this.aClass201_41 = null;
		} else {
			this.aClass68_41.method2007();
			this.aClass68_41 = null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
	public void method6080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt7266 == 255 ? arg0 : this.anInt7266;
		if (this.aBoolean515) {
			this.aClass201_41 = new Class201(local22, arg0, arg1);
		} else {
			this.aClass68_41 = new Class68(local22, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)[[I")
	public int[][] method6081(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IBI)[[I")
	protected final int[][] method6082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub2Array41[arg0].aBoolean515) {
			@Pc(30) int[] local30 = this.aClass1_Sub2Array41[arg0].method6085(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub2Array41[arg0].method6081(arg1);
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)[I")
	public int[] method6085(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
	public void method6090() {
	}
}
