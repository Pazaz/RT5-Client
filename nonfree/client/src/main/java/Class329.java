import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class329 {

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "[Lclient!rq;")
	public Class93_Sub2[] aClass93_Sub2Array3 = null;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!vv;")
	public Class93_Sub3 aClass93_Sub3_3 = null;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!vv;")
	public Class93_Sub3 aClass93_Sub3_2 = null;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[Lclient!rq;")
	public Class93_Sub2[] aClass93_Sub2Array4 = null;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!vv;")
	public Class93_Sub3 aClass93_Sub3_1 = null;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Z")
	public final boolean aBoolean655;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class329(@OriginalArg(0) Class19_Sub3 arg0) {
		this.aBoolean655 = arg0.aBoolean606;
		Static491.method9159(arg0);
		if (this.aBoolean655) {
			@Pc(31) byte[] local31 = Static377.method5321(false, Static599.anObject14);
			this.aClass93_Sub3_2 = new Class93_Sub3(arg0, 6410, 128, 128, 16, local31, 6410);
			@Pc(48) byte[] local48 = Static377.method5321(false, Static158.anObject5);
			this.aClass93_Sub3_1 = new Class93_Sub3(arg0, 6410, 128, 128, 16, local48, 6410);
			@Pc(63) Class202 local63 = arg0.aClass202_1;
			if (local63.method4582()) {
				local31 = Static377.method5321(false, Static71.anObject4);
				this.aClass93_Sub3_3 = new Class93_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(93) Class93_Sub3 local93 = new Class93_Sub3(arg0, 6409, 128, 128, 16, local31, 6409);
				if (local63.method4580(2.0F, this.aClass93_Sub3_3, local93)) {
					this.aClass93_Sub3_3.method9446();
				} else {
					this.aClass93_Sub3_3.method9442();
					this.aClass93_Sub3_3 = null;
				}
				local93.method9442();
				return;
			}
		} else {
			this.aClass93_Sub2Array3 = new Class93_Sub2[16];
			for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
				@Pc(138) byte[] local138 = Static60.method1292(Static599.anObject14, local125 * 2 * 128 * 128);
				this.aClass93_Sub2Array3[local125] = new Class93_Sub2(arg0, 3553, 6410, 128, 128, true, local138, 6410, false);
			}
			this.aClass93_Sub2Array4 = new Class93_Sub2[16];
			for (@Pc(164) int local164 = 0; local164 < 16; local164++) {
				@Pc(175) byte[] local175 = Static60.method1292(Static158.anObject5, local164 * 128 * 256);
				this.aClass93_Sub2Array4[local164] = new Class93_Sub2(arg0, 3553, 6410, 128, 128, true, local175, 6410, false);
			}
		}
	}
}
