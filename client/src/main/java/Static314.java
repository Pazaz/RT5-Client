import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)Lclient!bp;")
	public static Class28 method5367(@OriginalArg(0) int arg0) {
		@Pc(10) Class28 local10 = (Class28) Static119.aClass98_16.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static188.aClass197_52.fetchFile(arg0, 1);
		local10 = new Class28();
		local10.anInt749 = arg0;
		if (local20 != null) {
			local10.decode(new Packet(local20));
		}
		local10.method945();
		if (local10.anInt737 == 2 && Static7.aClass4_151.get((long) arg0) == null) {
			Static7.aClass4_151.put(new Class2_Sub39(Static307.anInt5780), (long) arg0);
			Static278.aClass28Array1[Static307.anInt5780++] = local10;
		}
		Static119.aClass98_16.put((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nn;)V")
	public static void method5368(@OriginalArg(0) Class2_Sub26_Sub1 arg0) {
		if (Scene.anInt3139 >= 65535) {
			return;
		}
		Scene.aClass2_Sub26_Sub1Array2[Scene.anInt3139] = arg0;
		Scene.aBooleanArray57[Scene.anInt3139] = false;
		Scene.anInt3139++;
		@Pc(18) int local18 = arg0.anInt4380;
		if (arg0.aBoolean300) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4380;
		if (arg0.aBoolean301) {
			local26 = Scene.anInt1914 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4371 + Scene.anInt4693 - arg0.anInt4374 >> Scene.scale;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4371 + arg0.anInt4374 - Scene.anInt4693 >> Scene.scale;
			if (local66 >= Scene.anInt3773) {
				local66 = Scene.anInt3773 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray92[local38++];
				@Pc(96) int local96 = (arg0.anInt4370 + Scene.anInt4693 - arg0.anInt4374 >> Scene.scale) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Scene.anInt1684) {
					local104 = Scene.anInt1684 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Scene.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Scene.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Scene.anInt3139;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Scene.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Scene.anInt3139 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Scene.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Scene.anInt3139 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Scene.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Scene.anInt3139 << 48;
					}
				}
			}
		}
	}
}
