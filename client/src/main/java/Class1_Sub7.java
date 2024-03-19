import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!el", name = "D", descriptor = "I")
	public final int anInt1954;

	@OriginalMember(owner = "client!el", name = "G", descriptor = "I")
	public final int anInt1956;

	@OriginalMember(owner = "client!el", name = "C", descriptor = "I")
	public final int anInt1953;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "I")
	private final int anInt1945;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "I")
	public final int anInt1950;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "I")
	private final int anInt1948;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "I")
	private final int anInt1947;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	private final int anInt1943;

	@OriginalMember(owner = "client!el", name = "I", descriptor = "I")
	private final int anInt1958;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1954 = arg6;
		this.anInt1956 = arg7;
		this.anInt1953 = arg8;
		this.anInt1945 = arg0;
		this.anInt1950 = arg5;
		this.anInt1948 = arg4;
		this.anInt1947 = arg3;
		this.anInt1943 = arg2;
		this.anInt1958 = arg1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZIII)Z")
	public boolean method1637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt1945 && arg0 >= this.anInt1958 && this.anInt1947 >= arg0 && this.anInt1943 <= arg2 && this.anInt1948 >= arg2;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(III)Z")
	public boolean method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt1950 <= arg0 && arg0 <= this.anInt1956 && this.anInt1954 <= arg1 && arg1 <= this.anInt1953;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)Z")
	public boolean method1640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt1958 && this.anInt1947 >= arg0 && this.anInt1943 <= arg1 && arg1 <= this.anInt1948;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([IIBI)V")
	public void method1641(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt1943 + arg1 - this.anInt1954;
		arg0[1] = arg2 + this.anInt1958 - this.anInt1950;
		arg0[0] = this.anInt1945;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BII[I)V")
	public void method1643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = arg0 + this.anInt1950 - this.anInt1958;
		arg2[0] = 0;
		arg2[2] = arg1 + this.anInt1954 - this.anInt1943;
	}
}
