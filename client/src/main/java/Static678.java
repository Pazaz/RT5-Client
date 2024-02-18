import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!via", name = "O", descriptor = "J")
	public static long aLong310;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method8901(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static476.anInt7177; local1++) {
			@Pc(6) int local6 = arg1.gSamrt1or2();
			@Pc(10) int local10 = arg1.g2();
			if (local10 == 65535) {
				local10 = -1;
			}
			if (Static106.aClass297_Sub1Array1[local6] != null) {
				Static106.aClass297_Sub1Array1[local6].anInt7561 = local10;
			}
		}
		if (arg0 != -1) {
			method8901(-83, (Packet) null);
		}
	}
}
