import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class97 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt3415 = 0;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt3416 = 0;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!dg;")
	private Class44 aClass44_1 = null;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_19;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!rj;")
	private final Class174 aClass174_2;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[Lclient!aq;")
	private final Class13[] aClass13Array1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class97(@OriginalArg(0) Class40_Sub2 arg0) {
		this.aClass40_Sub2_19 = arg0;
		this.aClass174_2 = new Class174(arg0);
		this.aClass13Array1 = new Class13[9];
		this.aClass13Array1[1] = new Class13_Sub5(arg0);
		this.aClass13Array1[2] = new Class13_Sub3(arg0, this.aClass174_2);
		this.aClass13Array1[4] = new Class13_Sub7(arg0, this.aClass174_2);
		this.aClass13Array1[5] = new Class13_Sub6(arg0, this.aClass174_2);
		this.aClass13Array1[6] = new Class13_Sub1(arg0);
		this.aClass13Array1[7] = new Class13_Sub4(arg0);
		this.aClass13Array1[3] = new Class13_Sub2(arg0);
		this.aClass13Array1[8] = this.aClass13Array1[4];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZI)V")
	public void method3047(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) boolean local12 = arg2 & this.aClass40_Sub2_19.method2799();
		if (!local12 && (arg1 == 4 || arg1 == 8)) {
			arg1 = 2;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (this.anInt3415 != arg1) {
			if (this.anInt3415 != 0) {
				this.aClass13Array1[Integer.MAX_VALUE & this.anInt3415].method4588();
			}
			if (arg1 != 0) {
				this.aClass13Array1[Integer.MAX_VALUE & arg1].method4593(arg0);
				this.aClass13Array1[Integer.MAX_VALUE & arg1].method4591(arg0);
			}
			this.anInt3416 = Integer.MIN_VALUE;
			this.anInt3415 = arg1;
			this.aClass44_1 = null;
		} else if (this.anInt3415 != 0) {
			this.aClass13Array1[Integer.MAX_VALUE & this.anInt3415].method4591(arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z")
	public boolean method3048() {
		return this.aClass13Array1[3].method4592();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!dg;)Z")
	public boolean method3049(@OriginalArg(1) Class44 arg0) {
		if (this.anInt3415 == 0) {
			return false;
		}
		if (this.aClass44_1 != arg0) {
			this.aClass13Array1[this.anInt3415 & Integer.MAX_VALUE].method4590(arg0);
			this.aClass44_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZ)V")
	public void method3050(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3415 != 0 & (this.anInt3416 != arg1 | arg0)) {
			this.aClass13Array1[Integer.MAX_VALUE & this.anInt3415].method4589(arg1);
			this.anInt3416 = arg1;
		}
	}
}
