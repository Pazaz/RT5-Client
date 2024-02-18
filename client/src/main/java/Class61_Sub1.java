import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.lh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class61_Sub1 extends Class61 implements Interface2 {

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
	private final int anInt1586;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
	private final int anInt1587;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
	private final int anInt1585;

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "Lclient!jagdx/IDirect3DVolumeTexture;")
	private final IDirect3DVolumeTexture anIDirect3DVolumeTexture1;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!kea;Lclient!eba;III[B)V")
	public Class61_Sub1(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, arg1, Static702.aClass397_16, false, arg4 * arg2 * arg3);
		this.anInt1586 = arg4;
		this.anInt1587 = arg2;
		this.anInt1585 = arg3;
		this.anIDirect3DVolumeTexture1 = this.aClass19_Sub1_Sub1_9.anIDirect3DDevice1.a(arg2, arg3, arg4, 1, 0, Static325.method4868(this.aClass397_12, arg1), 1);
		@Pc(40) PixelBuffer local40 = this.aClass19_Sub1_Sub1_9.aPixelBuffer1;
		@Pc(53) int local53 = this.anIDirect3DVolumeTexture1.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, local40);
		if (lh.a((byte) 107, local53)) {
			@Pc(66) int local66 = this.anInt1587 * this.aClass92_17.anInt2416;
			@Pc(71) int local71 = local66 * this.anInt1585;
			@Pc(74) int local74 = local40.getSlicePitch();
			if (local71 == local74) {
				local40.a((byte[]) arg5, 0, 0, this.anInt1585 * local66 * this.anInt1586);
			} else {
				@Pc(80) int local80 = local40.getRowPitch();
				@Pc(89) int local89;
				if (local66 == local80) {
					for (local89 = 0; local89 < this.anInt1586; local89++) {
						local40.a(arg5, local71 * local89, local89 * local74, local71);
					}
				} else {
					for (local89 = 0; local89 < this.anInt1586; local89++) {
						for (@Pc(95) int local95 = 0; local95 < this.anInt1585; local95++) {
							local40.a(arg5, local71 * local89 + local66 * local95, local95 * local80 + local74 * local89, local66);
						}
					}
				}
			}
			this.anIDirect3DVolumeTexture1.UnlockBox(0);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BLclient!nga;)V")
	@Override
	public void method9041(@OriginalArg(1) Class259 arg0) {
		super.method9041(arg0);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method9043() {
		this.aClass19_Sub1_Sub1_9.method4866(this);
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	@Override
	public IDirect3DBaseTexture method9042() {
		return this.anIDirect3DVolumeTexture1;
	}
}
