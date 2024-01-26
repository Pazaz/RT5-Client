import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int anInt10880;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!ug;")
	protected Class372 aClass372_41;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!ija;")
	protected Class180 aClass180_41;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Z")
	public boolean aBoolean824;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "[Lclient!pf;")
	public final Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean824 = arg1;
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 107) {
			throw new IllegalStateException("This operation does not have a monochrome output");
		}
		return null;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
	public int method9412() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)[[I")
	protected final int[][] method9413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array42[arg0].aBoolean824) {
			@Pc(36) int[] local36 = this.aClass2_Sub1Array42[arg0].method9411(111, arg1);
			return new int[][] { local36, local36, local36 };
		} else {
			return this.aClass2_Sub1Array42[arg0].method9414(arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
	public int[][] method9414(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!ge;I)V")
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Static485.method9420(true, (float[]) null, 33);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
	public void method9418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt10880 == 255 ? arg0 : this.anInt10880;
		if (this.aBoolean824) {
			this.aClass180_41 = new Class180(local22, arg0, arg1);
		} else {
			this.aClass372_41 = new Class372(local22, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
	public int method9419() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public void method9421(@OriginalArg(0) int arg0) {
		if (arg0 != 7) {
			Static485.anIntArray886 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[I")
	protected final int[] method9422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean824 ? this.aClass2_Sub1Array42[arg1].method9411(120, arg0) : this.aClass2_Sub1Array42[arg1].method9414(arg0)[0];
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public void method9423() {
		if (this.aBoolean824) {
			this.aClass180_41.method3934();
			this.aClass180_41 = null;
		} else {
			this.aClass372_41.method8449();
			this.aClass372_41 = null;
		}
	}
}
