import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class76 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[Lclient!gja;")
	public Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public int anInt2141;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ge;Lclient!kda;)Lclient!gja;")
	private Interface10 method2030(@OriginalArg(1) Packet arg0, @OriginalArg(2) Class204 arg1) {
		if (Static515.aClass204_10 == arg1) {
			return Static652.method8531(arg0);
		} else if (Static77.aClass204_1 == arg1) {
			return Static502.method6720(arg0);
		} else if (arg1 == Static166.aClass204_6) {
			return Static35.method935(arg0);
		} else if (Static647.aClass204_13 == arg1) {
			return Static464.method6301(arg0);
		} else if (Static541.aClass204_12 == arg1) {
			return Static515.method6803(arg0);
		} else if (arg1 == Static565.aClass204_9) {
			return Static303.method4430(arg0);
		} else if (Static535.aClass204_11 == arg1) {
			return Static715.method9346(arg0);
		} else if (arg1 == Static189.aClass204_7) {
			return Static452.method6171(arg0);
		} else if (arg1 == Static667.aClass204_15) {
			return Static112.method2106(arg0);
		} else if (arg1 == Static505.aClass204_16) {
			return Static353.method8430(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method2032(@OriginalArg(0) Packet arg0) {
		this.anInt2140 = arg0.g3();
		this.anInt2141 = arg0.g2();
		this.anInterface10Array1 = new Interface10[arg0.g1()];
		@Pc(31) Class204[] local31 = Static370.method5281();
		for (@Pc(33) int local33 = 0; local33 < this.anInterface10Array1.length; local33++) {
			this.anInterface10Array1[local33] = this.method2030(arg0, local31[arg0.g1()]);
		}
	}
}
