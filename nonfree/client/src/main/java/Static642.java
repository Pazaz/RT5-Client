import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "Lclient!it;")
	public static final Class184 aClass184_17 = new Class184(7, 0, 1, 1);

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	public static int anInt9599 = 1;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!sb;IZLclient!sb;)V")
	public static void method8440(@OriginalArg(0) Class330 arg0, @OriginalArg(3) Class330 arg1) {
		Static509.aClass330_96 = arg1;
		Static269.aClass330_58 = arg0;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZBI)Lclient!pea;")
	public static Class8_Sub7 method8441(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class130[] local7 = Class43.aClass130Array1;
		synchronized (Class43.aClass130Array1) {
			@Pc(37) Class8_Sub7 local37;
			if (Class43.aClass130Array1.length <= arg1 || Class43.aClass130Array1[arg1].method2782()) {
				local37 = new Class8_Sub7();
				local37.aClass8_Sub6Array1 = new Class8_Sub6[arg1];
				for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
					local37.aClass8_Sub6Array1[local43] = new Class8_Sub6();
				}
			} else {
				local37 = (Class8_Sub7) Class43.aClass130Array1[arg1].method2788();
				local37.method9274();
				@Pc(78) int local78 = Static159.anIntArray245[arg1]--;
			}
			local37.aBoolean548 = arg0;
			return local37;
		}
	}
}
