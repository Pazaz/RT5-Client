import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class Camera {

	@OriginalMember(owner = "client!vg", name = "v", descriptor = "[[[I")
	public static final int[][][] splines = new int[2][][];
	@OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
	public static int originX;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int originZ;
	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public static int anInt2717 = -1;
	@OriginalMember(owner = "client!r", name = "w", descriptor = "I")
	public static int anInt5567 = 0;
	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public static int anInt6533 = 0;
	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
	public static int anInt1038 = 0;
	@OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
	public static int anInt3821 = 0;
	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	public static int anInt6455 = -1;
	@OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
	public static int anInt6398 = 0;
	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	public static int cameraType;
	@OriginalMember(owner = "client!bp", name = "t", descriptor = "F")
	public static float pitch = 1024.0F;
	@OriginalMember(owner = "client!q", name = "q", descriptor = "F")
	public static float yaw = 0.0F;
	@OriginalMember(owner = "client!fn", name = "D", descriptor = "Z")
	public static boolean aBoolean156 = true;
	@OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
	public static int anInt7153 = 0;
	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	public static int anInt3966 = 0;
	@OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
	public static int anInt28 = 0;
	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public static int anInt642 = 0;
	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	public static int anInt327 = 0;
	@OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
	public static int anInt213 = 1;
	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2705 = 2;
	@OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
	public static int anInt4897 = 2;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIZII)V")
	public static void moveto(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static19.anInt535 = arg0;
		Static348.anInt6446 = arg1;
		Static180.anInt3404 = arg4;
		Static359.anInt6702 = arg2;
		Static311.anInt5810 = arg5;
		if (arg3 && Static359.anInt6702 >= 100) {
			Static136.anInt6778 = Static311.anInt5810 * 128 + 64;
			Static211.anInt3777 = Static19.anInt535 * 128 + 64;
			Static102.anInt3592 = Scene.getTileHeight(Static136.anInt6778, Static211.anInt3777, Static355.anInt6585) - Static180.anInt3404;
		}
		cameraType = 2;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIIII)V")
	public static void lookAt(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static123.anInt2420 = arg2;
		Static236.anInt4309 = arg0;
		Static254.anInt4698 = arg4;
		Static57.anInt1464 = arg1;
		Static33.anInt4463 = arg3;
		if (Static33.anInt4463 >= 100) {
			@Pc(30) int local30 = Static254.anInt4698 * 128 + 64;
			@Pc(36) int local36 = Static123.anInt2420 * 128 + 64;
			@Pc(44) int local44 = Scene.getTileHeight(local30, local36, Static355.anInt6585) - Static57.anInt1464;
			@Pc(49) int local49 = local30 - Static136.anInt6778;
			@Pc(54) int local54 = local44 - Static102.anInt3592;
			@Pc(59) int local59 = local36 - Static211.anInt3777;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static265.anInt4857 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static4.anInt87 = (int) (-2607.5945876176133D * Math.atan2((double) local49, (double) local59)) & 0x3FFF;
			Static342.anInt5657 = 0;
			if (Static265.anInt4857 < 1024) {
				Static265.anInt4857 = 1024;
			}
			if (Static265.anInt4857 > 3072) {
				Static265.anInt4857 = 3072;
			}
		}
		cameraType = 2;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)V")
	public static void reset() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static189.aBooleanArray33[local3] = false;
		}
		anInt2717 = -1;
		anInt6455 = -1;
		Static236.anInt4309 = 0;
		cameraType = 1;
		Static33.anInt4463 = 0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBI)V")
	public static void forceAngle(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		pitch = local3;
		yaw = local11;
		if (cameraType == 2) {
			Static342.anInt5657 = 0;
			Static265.anInt4857 = local3;
			Static4.anInt87 = local11;
		}
		Static338.method6141();
		aBoolean156 = true;
	}

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void smoothReset() {
        for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
            Static189.aBooleanArray33[local7] = false;
        }
        Static241.anInt4445 = client.cycle;
        Static5.anInt105 = Static102.anInt3592;
        anInt6455 = -1;
        anInt2717 = -1;
        cameraType = 5;
        Static272.anInt5023 = Static4.anInt87;
        Static231.anInt4071 = Static265.anInt4857;
        Static196.anInt3318 = Static211.anInt3777;
        Static236.anInt4309 = 0;
        Static33.anInt4463 = 0;
        Static106.anInt2218 = Static136.anInt6778;
    }

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public static void decX() {
		if (Static369.aBoolean471) {
			return;
		}
		aBoolean156 = true;
		Static369.aBoolean471 = true;
		if (client.preferences.aBoolean351) {
			yaw = (int) yaw - 65 & 0xFFFFFF80;
		} else {
			Static184.aFloat39 += (-Static184.aFloat39 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V")
	public static void incX() {
		if (Static369.aBoolean471) {
			return;
		}
		aBoolean156 = true;
		if (client.preferences.aBoolean351) {
			yaw = (int) yaw + 191 & 0xFFFFFF80;
		} else {
			Static184.aFloat39 += (24.0F - Static184.aFloat39) / 2.0F;
		}
		Static369.aBoolean471 = true;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public static void decY() {
		if (Static140.aBoolean187) {
			return;
		}
		if (client.preferences.aBoolean351) {
			pitch = (int) pitch - 17 & 0xFFFFFFF0;
		} else {
			Static296.aFloat68 += (-Static296.aFloat68 - 12.0F) / 2.0F;
		}
		Static140.aBoolean187 = true;
		aBoolean156 = true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void incY() {
		if (Static140.aBoolean187) {
			return;
		}
		Static140.aBoolean187 = true;
		aBoolean156 = true;
		if (client.preferences.aBoolean351) {
			pitch = (int) pitch + 47 & 0xFFFFFFF0;
		} else {
			Static296.aFloat68 += (12.0F - Static296.aFloat68) / 2.0F;
		}
	}
}
