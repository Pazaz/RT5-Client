import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class7_Sub2_Sub1 extends Class7_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "Lclient!td;")
	public final Class192 aClass192_4;

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "Z")
	private final boolean aBoolean308;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!nr;Lclient!ta;IIIIIIIZI)V")
	public Class7_Sub2_Sub1(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static83.method1843(arg2, arg3));
		this.aClass192_4 = new Class192(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt6405, super.anInt6403, arg9, arg10);
		this.aBoolean308 = arg1.anInt6170 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)I")
	@Override
	public int method5687() {
		return this.aClass192_4.anInt6264;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)V")
	@Override
	public void method5688() {
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)I")
	@Override
	public int method5686() {
		return this.aClass192_4.anInt6262;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!nr;Z)V")
	@Override
	public void method5683(@OriginalArg(0) Class40 arg0) {
		this.aClass192_4.method5248(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5682() {
		return this.aClass192_4.method5249();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!nr;IIZLclient!cb;I)V")
	@Override
	public void method5956(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BILclient!nr;)Lclient!qc;")
	@Override
	public Class86 method5681(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		return this.aClass192_4.method5245(arg0, arg1, 0, 0, false, false);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!nr;I)V")
	@Override
	public void method5957(@OriginalArg(0) Class40 arg0) {
		@Pc(16) Class86 local16 = this.aClass192_4.method5245(131072, arg0, super.anInt6405, super.anInt6403, true, true);
		if (local16 != null) {
			this.aClass192_4.method5244(super.anInt6405 >> 7, false, super.anInt6403 >> 7, local16, arg0, super.anInt6403 >> 7, super.anInt6405 >> 7);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)I")
	@Override
	public int method5684() {
		return this.aClass192_4.anInt6263;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!nr;II)Z")
	@Override
	public boolean method5950(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class86 local16 = this.aClass192_4.method5245(65536, arg1, super.anInt6405, super.anInt6403, false, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class11 local28 = arg1.method2782();
			local28.method5496(super.anInt6405, super.anInt6407, super.anInt6403);
			return local16.method5556(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!nr;)V")
	@Override
	public void method5685(@OriginalArg(1) Class40 arg0) {
		this.aClass192_4.method5255(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5952() {
		return false;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
	@Override
	public void method5958() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Lclient!nr;Z)Lclient!g;")
	@Override
	public Class2_Sub3 method5951(@OriginalArg(0) Class40 arg0) {
		@Pc(16) Class86 local16 = this.aClass192_4.method5245(1024, arg0, super.anInt6405, super.anInt6403, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class11 local23 = arg0.method2782();
		local23.method5496(super.anInt6405, super.anInt6407, super.anInt6403);
		@Pc(33) Class2_Sub3 local33 = null;
		if (this.aBoolean308) {
			local33 = Static159.method3981(1);
		}
		if (this.aClass192_4.aClass2_Sub7_6 == null) {
			local16.method5539(local23, local33 == null ? null : local33.aClass2_Sub6Array1[0], 0);
		} else {
			@Pc(49) Class117 local49 = this.aClass192_4.aClass2_Sub7_6.method4737();
			arg0.method2748(local16, local49, local23, local33 == null ? null : local33.aClass2_Sub6Array1[0]);
		}
		this.aClass192_4.method5244(super.anInt6405 >> 7, true, super.anInt6403 >> 7, local16, arg0, super.anInt6403 >> 7, super.anInt6405 >> 7);
		return local33;
	}
}
