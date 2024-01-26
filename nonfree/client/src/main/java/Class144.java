import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class Class144 {

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "Lclient!cm;")
	private Class2_Sub2 aClass2_Sub2_31;

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "[Lclient!cm;")
	private final Class2_Sub2[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
	private final int anInt3417;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V")
	public Class144(@OriginalArg(0) int arg0) {
		this.aClass2_Sub2Array1 = new Class2_Sub2[arg0];
		this.anInt3417 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[local10] = new Class2_Sub2();
			local20.aClass2_Sub2_67 = local20;
			local20.aClass2_Sub2_66 = local20;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLclient!cm;J)V")
	public void method3094(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub2_67 != null) {
			arg0.method9260();
		}
		@Pc(28) Class2_Sub2 local28 = this.aClass2_Sub2Array1[(int) ((long) (this.anInt3417 - 1) & arg1)];
		arg0.aClass2_Sub2_66 = local28;
		arg0.aClass2_Sub2_67 = local28.aClass2_Sub2_67;
		arg0.aClass2_Sub2_67.aClass2_Sub2_66 = arg0;
		arg0.aClass2_Sub2_66.aClass2_Sub2_67 = arg0;
		arg0.aLong325 = arg1;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(JI)Lclient!cm;")
	public Class2_Sub2 method3095(@OriginalArg(0) long arg0) {
		this.aLong115 = arg0;
		@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[(int) (arg0 & (long) (this.anInt3417 - 1))];
		for (this.aClass2_Sub2_31 = local20.aClass2_Sub2_66; this.aClass2_Sub2_31 != local20; this.aClass2_Sub2_31 = this.aClass2_Sub2_31.aClass2_Sub2_66) {
			if (arg0 == this.aClass2_Sub2_31.aLong325) {
				@Pc(41) Class2_Sub2 local41 = this.aClass2_Sub2_31;
				this.aClass2_Sub2_31 = this.aClass2_Sub2_31.aClass2_Sub2_66;
				return local41;
			}
		}
		this.aClass2_Sub2_31 = null;
		return null;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)Lclient!cm;")
	public Class2_Sub2 method3096() {
		if (this.aClass2_Sub2_31 == null) {
			return null;
		}
		@Pc(24) Class2_Sub2 local24 = this.aClass2_Sub2Array1[(int) (this.aLong115 & (long) (this.anInt3417 - 1))];
		while (this.aClass2_Sub2_31 != local24) {
			if (this.aLong115 == this.aClass2_Sub2_31.aLong325) {
				@Pc(38) Class2_Sub2 local38 = this.aClass2_Sub2_31;
				this.aClass2_Sub2_31 = this.aClass2_Sub2_31.aClass2_Sub2_66;
				return local38;
			}
			this.aClass2_Sub2_31 = this.aClass2_Sub2_31.aClass2_Sub2_66;
		}
		this.aClass2_Sub2_31 = null;
		return null;
	}
}
