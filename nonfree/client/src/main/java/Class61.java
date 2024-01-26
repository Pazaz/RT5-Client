import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class61 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!nga;")
	public Class259 aClass259_16 = Static60.aClass259_3;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!eba;")
	protected final Class92 aClass92_17;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Z")
	public final boolean aBoolean785;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!wda;")
	protected final Class397 aClass397_12;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!kea;")
	protected final Class19_Sub1_Sub1 aClass19_Sub1_Sub1_9;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!kea;Lclient!eba;Lclient!wda;ZI)V")
	protected Class61(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class397 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass92_17 = arg1;
		this.aBoolean785 = arg3;
		this.aClass397_12 = arg2;
		this.aClass19_Sub1_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!nga;)V")
	public void method9041(@OriginalArg(1) Class259 arg0) {
		this.aClass259_16 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method9042();
}
