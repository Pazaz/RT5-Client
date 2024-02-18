import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "Z")
	public boolean aBoolean14;

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "Z")
	public boolean aBoolean16;

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "Z")
	public boolean aBoolean18;

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "Z")
	public final boolean aBoolean15;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
	public final int anInt182;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "Lclient!wea;")
	public final Class222_Sub1 aClass222_Sub1_1;

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "I")
	public final int anInt180;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(ILclient!wea;IZ)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class222_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean15 = arg3;
		this.anInt182 = arg0;
		this.aClass222_Sub1_1 = arg1;
		this.anInt180 = arg2;
	}
}
