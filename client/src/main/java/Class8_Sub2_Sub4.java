import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tla")
public abstract class Class8_Sub2_Sub4 extends Class8_Sub2 {

	@OriginalMember(owner = "client!tla", name = "B", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!tla", name = "y", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!tla", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class8_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte144 = (byte) arg3;
		this.aShort101 = (short) arg5;
		super.anInt10694 = arg2;
		this.aShort102 = (short) arg6;
		super.anInt10690 = arg0;
		super.aByte143 = (byte) arg4;
		super.anInt10691 = arg1;
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9284(@OriginalArg(0) byte arg0, @OriginalArg(1) Class19 arg1) {
		if (arg0 != 59) {
			this.aShort101 = -126;
		}
		return Static282.method3976(this.method9286(2), super.aByte143, super.anInt10690 >> Static52.anInt1066, super.anInt10694 >> Static52.anInt1066);
	}

	@OriginalMember(owner = "client!tla", name = "j", descriptor = "(I)V")
	@Override
	public final void method9280(@OriginalArg(0) int arg0) {
		if (arg0 == 27811) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public final void method9285(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 < 101) {
			Static622.anInt7737 = -26;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tla", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method9290(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			Static622.method6854((String) null, 109, (Class19_Sub3) null, (byte) 91);
		}
		return false;
	}

	@OriginalMember(owner = "client!tla", name = "a", descriptor = "([Lclient!lca;I)I")
	@Override
	public final int method9288(@OriginalArg(0) Class2_Sub7[] arg0) {
		return this.method9277(arg0, super.anInt10694 >> Static52.anInt1066, super.anInt10690 >> Static52.anInt1066);
	}

	@OriginalMember(owner = "client!tla", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9275() {
		return Static258.aBooleanArrayArray3[(super.anInt10690 >> Static52.anInt1066) + Static35.anInt813 - Static403.anInt6246][(super.anInt10694 >> Static52.anInt1066) + Static35.anInt813 - Static550.anInt8271];
	}
}
