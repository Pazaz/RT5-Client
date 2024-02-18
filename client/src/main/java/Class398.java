import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class398 {

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!tu;")
	private Class362 aClass362_2;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!sb;")
	private final Class330 aClass330_124;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!sb;")
	private final Class330 aClass330_125;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;)V")
	public Class398(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class330 arg1) {
		this.aClass330_124 = arg1;
		this.aClass330_125 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!gja;)Lclient!jd;")
	public Interface13 method9168(@OriginalArg(1) Interface10 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) Class204 local18 = arg0.method5357();
		if (local18 == Static515.aClass204_10) {
			return new Class5((Class146) arg0);
		} else if (local18 == Static166.aClass204_6) {
			return new Class290(this.method9170(), (Class235) arg0);
		} else if (local18 == Static541.aClass204_12) {
			return new Class37(this.aClass330_125, (Class160) arg0);
		} else if (Static647.aClass204_13 == local18) {
			return new Class37_Sub1(this.aClass330_125, (Class160_Sub1) arg0);
		} else if (Static77.aClass204_1 == local18) {
			return new Class90_Sub1(this.aClass330_125, this.aClass330_124, (Class138_Sub3) arg0);
		} else if (Static565.aClass204_9 == local18) {
			return new Class90_Sub3(this.aClass330_125, this.aClass330_124, (Class138_Sub2) arg0);
		} else if (Static535.aClass204_11 == local18) {
			return new Class90_Sub2(this.aClass330_125, this.aClass330_124, (Class138_Sub1) arg0);
		} else if (local18 == Static189.aClass204_7) {
			return new Class133(this.aClass330_125, this.aClass330_124, (Class125) arg0);
		} else if (local18 == Static667.aClass204_15) {
			return new Class109(this.aClass330_125, (Class200) arg0);
		} else if (Static505.aClass204_16 == local18) {
			return new Class90_Sub2_Sub1(this.aClass330_125, this.aClass330_124, (Class138_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Lclient!tu;")
	private Class362 method9170() {
		if (this.aClass362_2 == null) {
			this.aClass362_2 = new Class362();
		}
		return this.aClass362_2;
	}
}
