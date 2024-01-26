import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cha", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
	public static int anInt1601 = 0;

	@OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
	public static int anInt1604 = 0;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BLclient!ca;)V")
	public static void method1552(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(19) Class2_Sub51 local19 = (Class2_Sub51) Static113.aClass28_12.method738((long) arg0.anInt10740);
		if (local19 == null) {
			return;
		}
		if (local19.aClass2_Sub6_Sub2_4 != null) {
			Static336.aClass2_Sub6_Sub3_1.method5883(local19.aClass2_Sub6_Sub2_4);
			local19.aClass2_Sub6_Sub2_4 = null;
		}
		local19.method9457();
	}

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "(B)V")
	public static void method1555() {
		if (Static6.anInt95 == 0) {
			return;
		}
		try {
			if (++Static654.anInt9739 > 2000) {
				Static405.aClass153_1.method3274();
				if (Static720.anInt10865 >= 2) {
					Static6.anInt95 = 0;
					Static580.anInt8621 = -5;
					return;
				}
				Static660.aClass229_4.method5260();
				Static6.anInt95 = 1;
				Static654.anInt9739 = 0;
				Static720.anInt10865++;
			}
			if (Static6.anInt95 == 1) {
				Static405.aClass153_1.aClass270_1 = Static660.aClass229_4.method5263(Static446.aClass390_6);
				Static6.anInt95 = 2;
			}
			if (Static6.anInt95 == 2) {
				if (Static405.aClass153_1.aClass270_1.anInt6789 == 2) {
					throw new IOException();
				}
				if (Static405.aClass153_1.aClass270_1.anInt6789 != 1) {
					return;
				}
				Static405.aClass153_1.aClass348_1 = Static99.method1975((Socket) Static405.aClass153_1.aClass270_1.anObject13);
				Static405.aClass153_1.aClass270_1 = null;
				Static405.aClass153_1.method3273();
				Static6.anInt95 = 4;
			}
			if (Static6.anInt95 == 4 && Static405.aClass153_1.aClass348_1.method7932(1)) {
				Static405.aClass153_1.aClass348_1.method7929(Static405.aClass153_1.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				@Pc(139) int local139 = Static405.aClass153_1.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				Static6.anInt95 = 0;
				Static580.anInt8621 = local139;
				Static405.aClass153_1.method3274();
			}
		} catch (@Pc(148) IOException local148) {
			Static405.aClass153_1.method3274();
			if (Static720.anInt10865 < 2) {
				Static660.aClass229_4.method5260();
				Static720.anInt10865++;
				Static654.anInt9739 = 0;
				Static6.anInt95 = 1;
			} else {
				Static6.anInt95 = 0;
				Static580.anInt8621 = -4;
			}
		}
	}
}
