import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!pha", name = "m", descriptor = "Lclient!av;")
	public static final Class28 aClass28_34 = new Class28(16);

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZIIIIIIIF)[[I")
	public static int[][] method6551(@OriginalArg(8) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class2_Sub1_Sub27 local11 = new Class2_Sub1_Sub27();
		local11.anInt8799 = (int) (arg0 * 4096.0F);
		local11.aBoolean667 = false;
		local11.anInt8805 = 4;
		local11.anInt8810 = 4;
		local11.anInt8803 = 3;
		local11.method9421(7);
		Static132.method2313(256, 64);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local11.method7809(local48, local7[local48]);
		}
		return local7;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZII)I")
	public static int method6553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static195.anIntArray771[arg0 & 0x3] : Static217.anIntArray285[arg0 & 0x3];
	}
}
