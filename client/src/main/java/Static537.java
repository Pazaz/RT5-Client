import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!qu", name = "I", descriptor = "[I")
	public static int[] anIntArray633;

	@OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
	public static int anInt8170 = -1;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!mia;III)Lclient!fj;")
	public static Class2_Sub2_Sub10 method7189(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.anInt6197 | arg1 << 10;
		@Pc(19) Class2_Sub2_Sub10 local19 = (Class2_Sub2_Sub10) Static480.aClass361_2.method8342((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(32) byte[] local32 = Static31.aClass330_6.method7589(Static31.aClass330_6.method7599(local10));
		if (local32 == null) {
			local10 = arg2 + 65536 << 10 | arg0.anInt6197;
			local19 = (Class2_Sub2_Sub10) Static480.aClass361_2.method8342((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local32 = Static31.aClass330_6.method7589(Static31.aClass330_6.method7599(local10));
			if (local32 == null) {
				local10 = arg0.anInt6197 | 0x3FFFC00;
				local19 = (Class2_Sub2_Sub10) Static480.aClass361_2.method8342((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local32 = Static31.aClass330_6.method7589(Static31.aClass330_6.method7599(local10));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static48.method1097(local32);
					} catch (@Pc(211) Exception local211) {
						throw new RuntimeException(local211.getMessage() + " S: " + local10);
					}
					local19.aClass242_5 = arg0;
					Static480.aClass361_2.method8341(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static48.method1097(local32);
				} catch (@Pc(135) Exception local135) {
					throw new RuntimeException(local135.getMessage() + " S: " + local10);
				}
				local19.aClass242_5 = arg0;
				Static480.aClass361_2.method8341(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static48.method1097(local32);
			} catch (@Pc(51) Exception local51) {
				throw new RuntimeException(local51.getMessage() + " S: " + local10);
			}
			local19.aClass242_5 = arg0;
			Static480.aClass361_2.method8341(local19, (long) local10 << 16);
			return local19;
		}
	}
}
