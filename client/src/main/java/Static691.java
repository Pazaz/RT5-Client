import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static691 {

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array15;

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "Lclient!kka;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
	public static int anInt10367;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	public static int anInt10368 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIILclient!ha;)Lclient!ka;")
	public static Class114 method9004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class19 arg5) {
		@Pc(13) long local13 = (long) arg2;
		@Pc(19) Class114 local19 = (Class114) Static186.aClass82_67.method2156(local13);
		if (local19 == null) {
			@Pc(29) Class88 local29 = Static121.method2201(arg2, Static190.aClass330_38);
			if (local29 == null) {
				return null;
			}
			if (local29.anInt2379 < 13) {
				local29.method2232();
			}
			local19 = arg5.method7952(local29, 2055, Static391.anInt6133, 64, 768);
			Static186.aClass82_67.method2150(local19, local13);
		}
		local19 = local19.method7495((byte) 6, 2055, true);
		if (arg4 != 0) {
			local19.a(arg4);
		}
		if (arg0 != 0) {
			local19.FA(arg0);
		}
		if (arg1 != 0) {
			local19.VA(arg1);
		}
		if (arg3 != 0) {
			local19.H(0, arg3, 0);
		}
		return local19;
	}
}
