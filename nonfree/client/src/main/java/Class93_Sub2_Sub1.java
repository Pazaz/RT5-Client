import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class93_Sub2_Sub1 extends Class93_Sub2 {

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
	public final int anInt3259;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	public final int anInt3257;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "F")
	public final float aFloat68;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "F")
	public final float aFloat67;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "Z")
	public final boolean aBoolean261;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIIIZ[BI)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3259 = arg3;
		this.anInt3257 = arg4;
		if (super.anInt10912 == 34037) {
			this.aFloat68 = (float) arg4;
			this.aFloat67 = (float) arg3;
			this.aBoolean261 = false;
		} else {
			this.aFloat67 = this.aFloat68 = 1.0F;
			this.aBoolean261 = true;
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIII)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3257 = arg4;
		if (super.anInt10912 == 34037) {
			this.aFloat68 = (float) arg4;
			this.aFloat67 = (float) arg3;
			this.aBoolean261 = false;
		} else {
			this.aFloat67 = this.aFloat68 = 1.0F;
			this.aBoolean261 = true;
		}
		this.anInt3259 = arg3;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIIIIZ)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt10912 == 34037) {
			this.aFloat68 = (float) arg5;
			this.aBoolean261 = false;
			this.aFloat67 = (float) arg4;
		} else {
			this.aFloat67 = this.aFloat68 = 1.0F;
			this.aBoolean261 = true;
		}
		this.anInt3257 = arg5;
		this.anInt3259 = arg4;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIIII)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat68 = (float) arg3 / (float) arg5;
		this.anInt3259 = arg2;
		this.aBoolean261 = false;
		this.anInt3257 = arg3;
		this.aFloat67 = (float) arg2 / (float) arg4;
		this.method2946(false, false);
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIIII[BI)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3257 = arg3;
		this.anInt3259 = arg2;
		this.method2945(arg7, arg3, arg2, arg6, true);
		this.aFloat67 = (float) arg2 / (float) arg4;
		this.aBoolean261 = false;
		this.aFloat68 = (float) arg3 / (float) arg5;
		this.method2946(false, false);
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIIIIIZ)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat67 = (float) arg3 / (float) arg5;
		this.aFloat68 = (float) arg4 / (float) arg6;
		this.anInt3259 = arg3;
		this.aBoolean261 = false;
		this.anInt3257 = arg4;
		this.method2946(false, false);
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIIZ[III)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3257 = arg3;
		this.anInt3259 = arg2;
		if (super.anInt10912 == 34037) {
			this.aFloat67 = (float) arg2;
			this.aBoolean261 = false;
			this.aFloat68 = (float) arg3;
		} else {
			this.aBoolean261 = true;
			this.aFloat67 = this.aFloat68 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!qha;IIII[I)V")
	public Class93_Sub2_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3257 = arg2;
		this.anInt3259 = arg1;
		this.method2942(arg5, 0, arg2, arg1, 0, 0);
		this.aBoolean261 = false;
		this.aFloat68 = (float) arg2 / (float) arg4;
		this.aFloat67 = (float) arg1 / (float) arg3;
		this.method2946(false, false);
	}
}
