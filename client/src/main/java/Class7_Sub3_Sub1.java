import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class7_Sub3_Sub1 extends Class7_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Lclient!td;")
	public final Class192 aClass192_1;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
	private final boolean aBoolean123;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!nr;Lclient!ta;IIIIIIIZIIII)V")
	public Class7_Sub3_Sub1(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static253.method4651(arg2, arg3));
		this.aClass192_1 = new Class192(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean123 = arg1.anInt6170 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILclient!nr;)Lclient!qc;")
	@Override
	public Class86 method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		return this.aClass192_1.method5245(arg0, arg1, 0, 0, false, false);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5682() {
		return this.aClass192_1.method5249();
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)I")
	@Override
	public int method5680() {
		return this.aClass192_1.method5254();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		@Pc(16) Class86 local16 = this.aClass192_1.method5245(1024, arg0, super.anInt6683, super.anInt6685, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class11 local23 = arg0.method2782();
		local23.method5496(super.anInt6683 + super.anInt6684, super.anInt6681, super.anInt6685 + super.anInt6680);
		@Pc(39) Class2_Sub3 local39 = null;
		if (this.aBoolean123) {
			local39 = Static159.method3981(1);
		}
		if (this.aClass192_1.aClass2_Sub7_6 == null) {
			local16.method5539(local23, local39 == null ? null : local39.aClass2_Sub6Array1[0], 0);
		} else {
			@Pc(55) Class117 local55 = this.aClass192_1.aClass2_Sub7_6.method4737();
			arg0.method2748(local16, local55, local23, local39 == null ? null : local39.aClass2_Sub6Array1[0]);
		}
		this.aClass192_1.method5244(super.anInt6683 >> 7, true, super.anInt6685 >> 7, local16, arg0, super.anInt6685 >> 7, super.anInt6683 >> 7);
		return local39;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
	@Override
	public int method5687() {
		return this.aClass192_1.anInt6264;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
		@Pc(24) Class86 local24 = this.aClass192_1.method5245(131072, arg0, super.anInt6683, super.anInt6685, true, false);
		if (local24 != null) {
			this.aClass192_1.method5244(super.anInt6683 >> 7, false, super.anInt6685 >> 7, local24, arg0, super.anInt6685 >> 7, super.anInt6683 >> 7);
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
	@Override
	public void method5688() {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return this.aClass192_1.anInt6263;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
	@Override
	public int method5686() {
		return this.aClass192_1.anInt6262;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!nr;Z)V")
	@Override
	public void method5683(@OriginalArg(0) Class40 arg0) {
		this.aClass192_1.method5248(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class86 local16 = this.aClass192_1.method5245(65536, arg1, super.anInt6683, super.anInt6685, false, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class11 local30 = arg1.method2782();
			local30.method5496(super.anInt6683 + super.anInt6684, super.anInt6681, super.anInt6685 + super.anInt6680);
			return local16.method5556(arg2, arg0, local30, false);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!nr;)V")
	@Override
	public void method5685(@OriginalArg(1) Class40 arg0) {
		this.aClass192_1.method5255(arg0);
	}
}
