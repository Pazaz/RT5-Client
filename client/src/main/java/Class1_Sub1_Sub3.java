import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!as", name = "C", descriptor = "I")
	public int anInt577 = 0;

	@OriginalMember(owner = "client!as", name = "K", descriptor = "I")
	public int anInt584 = 12800;

	@OriginalMember(owner = "client!as", name = "L", descriptor = "I")
	public int anInt585 = -1;

	@OriginalMember(owner = "client!as", name = "T", descriptor = "I")
	public int anInt590 = 0;

	@OriginalMember(owner = "client!as", name = "J", descriptor = "I")
	public int anInt583 = 12800;

	@OriginalMember(owner = "client!as", name = "V", descriptor = "I")
	public int anInt592 = -1;

	@OriginalMember(owner = "client!as", name = "E", descriptor = "Z")
	public boolean aBoolean40 = true;

	@OriginalMember(owner = "client!as", name = "G", descriptor = "I")
	public final int anInt580;

	@OriginalMember(owner = "client!as", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString20;

	@OriginalMember(owner = "client!as", name = "Q", descriptor = "I")
	public final int anInt589;

	@OriginalMember(owner = "client!as", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!as", name = "R", descriptor = "Lclient!mi;")
	public final Class130 aClass130_2;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt580 = arg0;
		this.aString20 = arg1;
		this.aBoolean40 = arg5;
		this.anInt589 = arg3;
		this.aString19 = arg2;
		this.anInt585 = arg4;
		this.anInt592 = arg6;
		if (this.anInt592 == 255) {
			this.anInt592 = 0;
		}
		this.aClass130_2 = new Class130();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII[I)Z")
	public boolean method412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(19) Class1_Sub7 local19 = (Class1_Sub7) this.aClass130_2.method3749(); local19 != null; local19 = (Class1_Sub7) this.aClass130_2.method3756()) {
			if (local19.method1637(arg0, arg1, arg2)) {
				local19.method1643(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(B)V")
	public void method414() {
		this.anInt584 = 12800;
		this.anInt583 = 12800;
		this.anInt590 = 0;
		this.anInt577 = 0;
		for (@Pc(28) Class1_Sub7 local28 = (Class1_Sub7) this.aClass130_2.method3749(); local28 != null; local28 = (Class1_Sub7) this.aClass130_2.method3756()) {
			if (this.anInt584 > local28.anInt1954) {
				this.anInt584 = local28.anInt1954;
			}
			if (local28.anInt1950 < this.anInt583) {
				this.anInt583 = local28.anInt1950;
			}
			if (this.anInt590 < local28.anInt1956) {
				this.anInt590 = local28.anInt1956;
			}
			if (this.anInt577 < local28.anInt1953) {
				this.anInt577 = local28.anInt1953;
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIB)Z")
	public boolean method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(16) Class1_Sub7 local16 = (Class1_Sub7) this.aClass130_2.method3749(); local16 != null; local16 = (Class1_Sub7) this.aClass130_2.method3756()) {
			if (local16.method1640(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[III)Z")
	public boolean method416(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(19) Class1_Sub7 local19 = (Class1_Sub7) this.aClass130_2.method3749(); local19 != null; local19 = (Class1_Sub7) this.aClass130_2.method3756()) {
			if (local19.method1640(arg0, arg2)) {
				local19.method1643(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[IIB)Z")
	public boolean method418(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) Class1_Sub7 local16 = (Class1_Sub7) this.aClass130_2.method3749(); local16 != null; local16 = (Class1_Sub7) this.aClass130_2.method3756()) {
			if (local16.method1639(arg0, arg2)) {
				local16.method1641(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
