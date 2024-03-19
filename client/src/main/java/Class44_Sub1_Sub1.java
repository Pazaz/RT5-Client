import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class44_Sub1_Sub1 extends Class44_Sub1 {

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
	public final int anInt4851;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Z")
	public final boolean aBoolean337;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "F")
	public final float aFloat60;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	public final int anInt4850;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ih;IIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt4851 = arg4;
		if (this.anInt6479 == 34037) {
			this.aFloat61 = arg5;
			this.aBoolean337 = false;
			this.aFloat60 = arg4;
		} else {
			this.aFloat60 = this.aFloat61 = 1.0F;
			this.aBoolean337 = true;
		}
		this.anInt4850 = arg5;
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ih;IIIIZ[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt4850 = arg4;
		this.anInt4851 = arg3;
		if (this.anInt6479 == 34037) {
			this.aFloat60 = arg3;
			this.aBoolean337 = false;
			this.aFloat61 = arg4;
		} else {
			this.aBoolean337 = true;
			this.aFloat60 = this.aFloat61 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ih;IIIII[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt4851 = arg2;
		this.anInt4850 = arg3;
		this.method4159(arg2, arg3, arg6, arg7, true);
		this.aBoolean337 = false;
		this.aFloat61 = (float) arg3 / (float) arg5;
		this.aFloat60 = (float) arg2 / (float) arg4;
		this.method4162(false, false);
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ih;IIIZ[I)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt4851 = arg2;
		this.anInt4850 = arg3;
		if (this.anInt6479 == 34037) {
			this.aFloat60 = arg2;
			this.aBoolean337 = false;
			this.aFloat61 = arg3;
		} else {
			this.aBoolean337 = true;
			this.aFloat60 = this.aFloat61 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ih;IIII[I)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt4851 = arg1;
		this.anInt4850 = arg2;
		this.method4163(arg1, arg2, arg5);
		this.aFloat61 = (float) arg2 / (float) arg4;
		this.aBoolean337 = false;
		this.aFloat60 = (float) arg1 / (float) arg3;
		this.method4162(false, false);
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ih;IIIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt4851 = arg3;
		this.anInt4850 = arg4;
		this.aFloat60 = (float) arg3 / (float) arg5;
		this.aFloat61 = (float) arg4 / (float) arg6;
		this.aBoolean337 = false;
		this.method4162(false, false);
	}
}
