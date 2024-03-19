import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class180 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "[Lclient!kk;")
	private Class26_Sub1[] aClass26_Sub1Array2;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "Lclient!il;")
	private Class1_Sub16 aClass1_Sub16_5;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!se;")
	private final Class182 aClass182_3;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!je;")
	private final Class99 aClass99_2;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Lclient!ag;")
	private Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!se;Lclient!je;)V")
	public Class180(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class99 arg1) {
		this.aClass182_3 = arg0;
		this.aClass99_2 = arg1;
		if (!this.aClass182_3.method5040()) {
			this.aClass1_Sub1_Sub2_Sub1_1 = this.aClass182_3.method5039(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!jb;ZILclient!jb;I)Lclient!kk;")
	private Class26_Sub1 method4936(@OriginalArg(0) Class96 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class96 arg2) {
		if (this.aClass1_Sub16_5 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub16_5.anInt6813 = arg1 * 8 + 5;
		if (this.aClass1_Sub16_5.anInt6813 >= this.aClass1_Sub16_5.aByteArray86.length) {
			throw new RuntimeException();
		} else if (this.aClass26_Sub1Array2[arg1] == null) {
			@Pc(51) int local51 = this.aClass1_Sub16_5.method5730();
			@Pc(61) int local61 = this.aClass1_Sub16_5.method5730();
			@Pc(75) Class26_Sub1 local75 = new Class26_Sub1(arg1, arg0, arg2, this.aClass182_3, this.aClass99_2, local51, local61, true);
			this.aClass26_Sub1Array2[arg1] = local75;
			return local75;
		} else {
			return this.aClass26_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public void method4938() {
		if (this.aClass26_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass26_Sub1Array2.length; local11++) {
			if (this.aClass26_Sub1Array2[local11] != null) {
				this.aClass26_Sub1Array2[local11].method3375();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass26_Sub1Array2.length; local32++) {
			if (this.aClass26_Sub1Array2[local32] != null) {
				this.aClass26_Sub1Array2[local32].method3367();
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BILclient!jb;Lclient!jb;)Lclient!kk;")
	public Class26_Sub1 method4939(@OriginalArg(1) int arg0, @OriginalArg(2) Class96 arg1, @OriginalArg(3) Class96 arg2) {
		return this.method4936(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)Z")
	public boolean method4940() {
		if (this.aClass1_Sub16_5 != null) {
			return true;
		}
		if (this.aClass1_Sub1_Sub2_Sub1_1 == null) {
			if (this.aClass182_3.method5040()) {
				return false;
			}
			this.aClass1_Sub1_Sub2_Sub1_1 = this.aClass182_3.method5039(255, true, (byte) 0, 255);
		}
		if (this.aClass1_Sub1_Sub2_Sub1_1.aBoolean300) {
			return false;
		} else {
			this.aClass1_Sub16_5 = new Class1_Sub16(this.aClass1_Sub1_Sub2_Sub1_1.method3603());
			this.aClass26_Sub1Array2 = new Class26_Sub1[(this.aClass1_Sub16_5.aByteArray86.length - 5) / 8];
			return true;
		}
	}
}
