import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "Lclient!jd;")
	public static Sprite aClass13_8;

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_3 = new Class16("", 10);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIB)I")
	public static int method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static309.method5277(arg0 - 1, arg1 + -1) + Static309.method5277(arg0 - 1, arg1 + 1) + Static309.method5277(arg0 + 1, arg1 + -1) + Static309.method5277(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static309.method5277(arg0, arg1 - 1) + Static309.method5277(arg0, arg1 + 1) + Static309.method5277(arg0 - 1, arg1) + Static309.method5277(arg0 + 1, arg1);
		@Pc(83) int local83 = Static309.method5277(arg0, arg1);
		return local83 / 4 + local49 / 16 + local78 / 8;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
	public static void method2580(@OriginalArg(0) int arg0) {
		for (@Pc(16) Node local16 = Static327.aClass4_127.head(); local16 != null; local16 = Static327.aClass4_127.next()) {
			if ((long) arg0 == (local16.key >> 48 & 0xFFFFL)) {
				local16.unlink();
			}
		}
	}

}
