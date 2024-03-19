import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class184 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_56;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "I")
	private final int anInt6030;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[Lclient!w;")
	private final Class1_Sub1[] aClass1_Sub1Array1;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class184(@OriginalArg(0) int arg0) {
		this.anInt6030 = arg0;
		this.aClass1_Sub1Array1 = new Class1_Sub1[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class1_Sub1 local20 = this.aClass1_Sub1Array1[local10] = new Class1_Sub1();
			local20.aClass1_Sub1_61 = local20;
			local20.aClass1_Sub1_62 = local20;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lclient!w;")
	public Class1_Sub1 method5095() {
		if (this.aClass1_Sub1_56 == null) {
			return null;
		}
		@Pc(23) Class1_Sub1 local23 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt6030 - 1) & this.aLong187)];
		while (this.aClass1_Sub1_56 != local23) {
			if (this.aLong187 == this.aClass1_Sub1_56.aLong234) {
				@Pc(46) Class1_Sub1 local46 = this.aClass1_Sub1_56;
				this.aClass1_Sub1_56 = this.aClass1_Sub1_56.aClass1_Sub1_61;
				return local46;
			}
			this.aClass1_Sub1_56 = this.aClass1_Sub1_56.aClass1_Sub1_61;
		}
		this.aClass1_Sub1_56 = null;
		return null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IJ)Lclient!w;")
	public Class1_Sub1 method5096(@OriginalArg(1) long arg0) {
		this.aLong187 = arg0;
		@Pc(28) Class1_Sub1 local28 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt6030 - 1) & arg0)];
		for (this.aClass1_Sub1_56 = local28.aClass1_Sub1_61; this.aClass1_Sub1_56 != local28; this.aClass1_Sub1_56 = this.aClass1_Sub1_56.aClass1_Sub1_61) {
			if (this.aClass1_Sub1_56.aLong234 == arg0) {
				@Pc(43) Class1_Sub1 local43 = this.aClass1_Sub1_56;
				this.aClass1_Sub1_56 = this.aClass1_Sub1_56.aClass1_Sub1_61;
				return local43;
			}
		}
		this.aClass1_Sub1_56 = null;
		return null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZJLclient!w;)V")
	public void method5099(@OriginalArg(1) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg1.aClass1_Sub1_62 != null) {
			arg1.method6158();
		}
		@Pc(21) Class1_Sub1 local21 = this.aClass1_Sub1Array1[(int) ((long) (this.anInt6030 - 1) & arg0)];
		arg1.aClass1_Sub1_62 = local21.aClass1_Sub1_62;
		arg1.aClass1_Sub1_61 = local21;
		arg1.aClass1_Sub1_62.aClass1_Sub1_61 = arg1;
		arg1.aClass1_Sub1_61.aClass1_Sub1_62 = arg1;
		arg1.aLong234 = arg0;
	}
}
