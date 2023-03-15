import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public static int anInt3422;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	public static int anInt3423 = 0;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!nk;")
	public static Component aClass161_7 = null;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJ)V")
	public static void method3386(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = PlayerList.self.xFine + Camera.anInt642;
		@Pc(15) int local15 = Camera.anInt327 + PlayerList.self.zFine;
		if (Static288.anInt5463 - local10 < -500 || Static288.anInt5463 - local10 > 500 || Static62.anInt2395 - local15 < -500 || Static62.anInt2395 - local15 > 500) {
			Static288.anInt5463 = local10;
			Static62.anInt2395 = local15;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (Static288.anInt5463 != local10) {
			local62 = local10 - Static288.anInt5463;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static288.anInt5463 += local70;
		}
		if (!client.preferences.aBoolean351) {
			Camera.pitchTarget += (float) arg0 * Static296.aFloat68 / 6.0F;
			Camera.yawTarget += Static184.aFloat39 * (float) arg0 / 6.0F;
		}
		if (Static62.anInt2395 != local15) {
			local62 = local15 - Static62.anInt2395;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static62.anInt2395 += local70;
		}
		Static338.method6141();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public static void method3387() {
		for (@Pc(15) Class2_Sub2_Sub1 local15 = (Class2_Sub2_Sub1) Static129.aClass135_20.head(); local15 != null; local15 = (Class2_Sub2_Sub1) Static129.aClass135_20.next()) {
			@Pc(20) Class11_Sub5_Sub4 local20 = local15.aClass11_Sub5_Sub4_1;
			if (local20.aBoolean445) {
				local15.unlink();
				local20.method5878();
			} else if (local20.anInt6504 <= client.cycle) {
				local20.method5879(client.sceneDelta);
				if (local20.aBoolean445) {
					local15.unlink();
				} else {
					Static329.method5630(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	public static void method3388() {
		Protocol.outboundBuffer.pos = 0;
		Protocol.packetSize = 0;
		Protocol.packet3 = null;
		Player.rebootTimer = 0;
		Protocol.packet1 = null;
		Protocol.packet = null;
		LoginManager.anInt4955 = 0;
		Protocol.inboundBuffer.pos = 0;
		Protocol.packet2 = null;
		Static160.method2956();
		Static309.method5280();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			Static12.aClass11_Sub5_Sub2_Sub1Array1[local35] = null;
		}
		PlayerList.self = null;
		for (@Pc(51) int local51 = 0; local51 < NpcList.npcs.length; local51++) {
			@Pc(57) Npc local57 = NpcList.npcs[local51];
			if (local57 != null) {
				local57.anInt4611 = -1;
			}
		}
		Static302.method1458();
		Camera.anInt5911 = 1;
		client.setGameState(30);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Static357.aBooleanArray59[local76] = true;
		}
		Protocol.method2002();
		Static375.aLong222 = 0L;
		Static385.aClass2_Sub16_2 = null;
	}
}
