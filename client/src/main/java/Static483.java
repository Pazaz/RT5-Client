import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Z")
	public static boolean aBoolean546;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!uf;")
	public static final Class370 aClass370_7 = new Class370();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)Z")
	public static boolean method6488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public static void method6490(@OriginalArg(0) int arg0) {
		Static684.anInt10304 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BIBII)V")
	public static void method6491(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		arg2 += arg3;
		@Pc(20) int local20 = arg0 - arg3 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg0 - arg3 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg1[arg2++] = 1;
				}
			}
			@Pc(35) int local35 = arg2 + 1;
			arg1[arg2] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg1[local35] = 1;
			@Pc(45) int local45 = local40 + 1;
			arg1[local40] = 1;
			arg2 = local45 + 1;
			arg1[local45] = 1;
		}
	}
}
