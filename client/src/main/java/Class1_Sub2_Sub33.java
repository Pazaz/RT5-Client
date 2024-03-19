import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!t", name = "P", descriptor = "I")
	private int anInt6158;

	@OriginalMember(owner = "client!t", name = "R", descriptor = "I")
	private int anInt6160;

	@OriginalMember(owner = "client!t", name = "X", descriptor = "I")
	private int anInt6164;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub33(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5201(arg0);
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub33() {
		this(0);
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V")
	private void method5201(@OriginalArg(1) int arg0) {
		this.anInt6160 = arg0 >> 4 & 0xFF0;
		this.anInt6164 = (arg0 & 0xFF) << 4;
		this.anInt6158 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static64.anInt1755; local36++) {
				local26[local36] = this.anInt6158;
				local30[local36] = this.anInt6160;
				local34[local36] = this.anInt6164;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.method5201(arg1.method5755());
		}
	}
}
