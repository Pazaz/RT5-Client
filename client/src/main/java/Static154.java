import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!hq;")
	public static final Class67 aClass67_1 = Static183.method3717();

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public static int anInt3814 = -1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;Lclient!ro;)Ljava/lang/String;")
	public static String method3302(@OriginalArg(1) String arg0, @OriginalArg(2) Class177 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(12) int local12 = arg0.indexOf("%1");
			if (local12 == -1) {
				while (true) {
					local12 = arg0.indexOf("%2");
					if (local12 == -1) {
						while (true) {
							local12 = arg0.indexOf("%3");
							if (local12 == -1) {
								while (true) {
									local12 = arg0.indexOf("%4");
									if (local12 == -1) {
										while (true) {
											local12 = arg0.indexOf("%5");
											if (local12 == -1) {
												while (true) {
													local12 = arg0.indexOf("%dns");
													if (local12 == -1) {
														return arg0;
													}
													@Pc(185) String local185 = "";
													if (Static221.aClass145_7 != null) {
														if (Static221.aClass145_7.anObject6 == null) {
															local185 = Static321.method5629(Static221.aClass145_7.anInt5066);
														} else {
															local185 = (String) Static221.aClass145_7.anObject6;
														}
													}
													arg0 = arg0.substring(0, local12) + local185 + arg0.substring(local12 + 4);
												}
											}
											arg0 = arg0.substring(0, local12) + Static171.method3502(Static237.method4508(4, arg1)) + arg0.substring(local12 + 2);
										}
									}
									arg0 = arg0.substring(0, local12) + Static171.method3502(Static237.method4508(3, arg1)) + arg0.substring(local12 + 2);
								}
							}
							arg0 = arg0.substring(0, local12) + Static171.method3502(Static237.method4508(2, arg1)) + arg0.substring(local12 + 2);
						}
					}
					arg0 = arg0.substring(0, local12) + Static171.method3502(Static237.method4508(1, arg1)) + arg0.substring(local12 + 2);
				}
			}
			arg0 = arg0.substring(0, local12) + Static171.method3502(Static237.method4508(0, arg1)) + arg0.substring(local12 + 2);
		}
	}
}
