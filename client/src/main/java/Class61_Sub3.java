import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.lh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class61_Sub3 extends Class61 implements Interface18 {

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Z")
	public boolean aBoolean786;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Z")
	public boolean aBoolean787;

	@OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
	private final int anInt10425;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	private final int anInt10426;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "Lclient!jagdx/IDirect3DTexture;")
	private final IDirect3DTexture anIDirect3DTexture1;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!kea;IIZ[III)V")
	public Class61_Sub3(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Static172.aClass92_8, Static702.aClass397_16, arg3 && arg0.aBoolean414, arg2 * arg1);
		if (this.aClass19_Sub1_Sub1_9.aBoolean413) {
			this.anInt10425 = arg1;
			this.anInt10426 = arg2;
		} else {
			this.anInt10425 = Static440.method5962(arg1);
			this.anInt10426 = Static440.method5962(arg2);
		}
		if (arg3) {
			this.anIDirect3DTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10425, this.anInt10426, 0, 1024, 21, 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10425, this.anInt10426, 1, 0, 21, 1);
		}
		@Pc(72) PixelBuffer local72 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(83) int local83 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 0, local72);
		if (lh.a((byte) 84, local83)) {
			if (arg6 == 0) {
				arg6 = arg1;
			}
			@Pc(99) int local99 = local72.getRowPitch();
			if (arg1 * 4 == local99 && arg6 == arg1) {
				local72.b(arg4, arg5, 0, arg1 * arg2);
			} else {
				for (@Pc(125) int local125 = 0; local125 < arg2; local125++) {
					local72.b(arg4, arg5 + local125 * arg6, local125 * local99, arg1);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!kea;Lclient!eba;Lclient!wda;II)V")
	public Class61_Sub3(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class397 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, false, arg4 * arg3);
		if (this.aClass19_Sub1_Sub1_9.aBoolean413) {
			this.anInt10426 = arg4;
			this.anInt10425 = arg3;
		} else {
			this.anInt10425 = Static440.method5962(arg3);
			this.anInt10426 = Static440.method5962(arg4);
		}
		this.anIDirect3DTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(arg3, arg4, 1, 0, Static325.method4868(this.aClass397_12, this.aClass92_17), 1);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!kea;Lclient!eba;IIZ[BII)V")
	public Class61_Sub3(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Static702.aClass397_16, arg4 && arg0.aBoolean414, arg3 * arg2);
		if (this.aClass19_Sub1_Sub1_9.aBoolean413) {
			this.anInt10426 = arg3;
			this.anInt10425 = arg2;
		} else {
			this.anInt10425 = Static440.method5962(arg2);
			this.anInt10426 = Static440.method5962(arg3);
		}
		if (arg4) {
			this.anIDirect3DTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10425, this.anInt10426, 0, 1024, Static325.method4868(Static702.aClass397_16, this.aClass92_17), 1);
		} else {
			this.anIDirect3DTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(this.anInt10425, this.anInt10426, 1, 0, Static325.method4868(Static702.aClass397_16, this.aClass92_17), 1);
		}
		@Pc(80) PixelBuffer local80 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(91) int local91 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg2, arg3, 0, local80);
		if (lh.a((byte) 104, local91)) {
			@Pc(108) int local108 = arg2 * this.aClass92_17.anInt2416;
			@Pc(114) int local114 = arg2 * this.aClass92_17.anInt2416;
			@Pc(117) int local117 = local80.getRowPitch();
			if (local108 == local117 && local108 == local114) {
				local80.a((byte[]) arg5, arg6, 0, local108 * arg3);
			} else {
				for (@Pc(145) int local145 = 0; local145 < arg3; local145++) {
					local80.a(arg5, local114 * local145 + arg6, local145 * local117, local108);
				}
			}
			this.anIDirect3DTexture1.UnlockRect(0);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)I")
	@Override
	public int method9047() {
		return this.anInt10426;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9042() {
		return this.anIDirect3DTexture1;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method9052(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean786 = arg1;
		this.aBoolean787 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIII[BILclient!eba;II)V")
	@Override
	public void method9051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) Class92 arg3, @OriginalArg(8) int arg4) {
		if (arg3 != this.aClass92_17 || Static702.aClass397_16 != this.aClass397_12) {
			throw new RuntimeException();
		}
		@Pc(19) PixelBuffer local19 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(30) int local30 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg4, arg1, 0, local19);
		if (!lh.a((byte) 106, local30)) {
			return;
		}
		@Pc(40) int local40 = arg0 * this.aClass92_17.anInt2416;
		@Pc(46) int local46 = arg4 * this.aClass92_17.anInt2416;
		@Pc(49) int local49 = local19.getRowPitch();
		if (local46 == local49 && local46 == local40) {
			local19.a((byte[]) arg2, 0, 0, local46 * arg1);
		} else {
			for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
				local19.a(arg2, local63 * local40, local49 * local63, local46);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLclient!nga;)V")
	@Override
	public void method9041(@OriginalArg(1) Class259 arg0) {
		super.method9041(arg0);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(FI)F")
	@Override
	public float method9046(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt10425;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9043() {
		this.aClass19_Sub1_Sub1_9.method4864(this);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BII[IIII)V")
	@Override
	public void method9044(@OriginalArg(3) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		if (Static172.aClass92_8 != this.aClass92_17 || Static702.aClass397_16 != this.aClass397_12) {
			throw new RuntimeException();
		}
		@Pc(28) PixelBuffer local28 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(39) int local39 = this.anIDirect3DTexture1.LockRect(0, 0, 0, arg1, arg2, 16, local28);
		if (!lh.a((byte) 63, local39)) {
			return;
		}
		@Pc(48) int local48 = local28.getRowPitch();
		if (arg1 * 4 == local48) {
			local28.a((int[]) arg0, 0, 0, arg0.length);
		} else {
			for (@Pc(64) int local64 = 0; local64 < arg2; local64++) {
				local28.a(arg0, arg1 * local64, local64 * local48, arg1);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9049() {
		return true;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method9048(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static172.aClass92_8 != this.aClass92_17 || Static702.aClass397_16 != this.aClass397_12) {
			throw new RuntimeException();
		}
		@Pc(18) PixelBuffer local18 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(29) int local29 = this.anIDirect3DTexture1.LockRect(0, arg1, arg2, arg4, arg3, 0, local18);
		if (!lh.a((byte) 123, local29)) {
			return;
		}
		@Pc(48) int local48 = local18.getRowPitch();
		if (local48 == arg4 * 4 && arg4 == arg5) {
			local18.b(arg0, 0, 0, arg4 * arg3);
		} else {
			for (@Pc(64) int local64 = 0; local64 < arg3; local64++) {
				local18.b(arg0, arg5 * local64, local64 * local48, arg4);
			}
		}
		this.anIDirect3DTexture1.UnlockRect(0);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(FB)F")
	@Override
	public float method9050(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt10426;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)I")
	@Override
	public int method9045() {
		return this.anInt10425;
	}
}
