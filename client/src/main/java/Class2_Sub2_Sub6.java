import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
	public int anInt2072 = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 2) {
			this.anInt2072 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method1979(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.g1();
			if (local11 == 0) {
				return;
			}
			this.method1978(local11, arg0);
		}
	}
}
