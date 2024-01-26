import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
	public static int anInt6819;

	@OriginalMember(owner = "client!oda", name = "r", descriptor = "Lclient!gaa;")
	public static Interface9 anInterface9_1;

	@OriginalMember(owner = "client!oda", name = "v", descriptor = "Lclient!pc;")
	public static final Class287 aClass287_14 = new Class287(0, 4);

	@OriginalMember(owner = "client!oda", name = "n", descriptor = "Lclient!uf;")
	public static final Class370 aClass370_6 = new Class370();

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BII)V")
	public static void method6127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub2_Sub2 local16 = Static440.method5963(7, (long) arg1);
		local16.method202();
		local16.anInt197 = arg0;
	}
}
