import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Lclient!r;")
	public static Js5 aClass197_48;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
	public static int anInt3385 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!bu;[[BI)V")
	public static void method3346(@OriginalArg(0) SceneBuilder arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19 = arg1.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) byte[] local27 = arg1[local21];
			if (local27 != null) {
				@Pc(34) Packet local34 = new Packet(local27);
				local40 = Static291.mapSquares[local21] >> 8;
				@Pc(46) int local46 = Static291.mapSquares[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Camera.originX;
				@Pc(59) int local59 = local46 * 64 - Camera.originZ;
				client.audioLogic();
				arg0.method1087(local53, Static171.collisionMaps, local34, local59, Camera.originZ, Camera.originX);
				arg0.method1100(local16, local59, local53, Rasteriser.instance, local34);
				if (!arg0.aBoolean73 && Static105.anInt2187 / 8 == local40 && Static9.anInt212 / 8 == local46) {
					if (local16[0] == -1) {
						Static368.aClass43_1 = null;
					} else {
						Static368.aClass43_1 = client.SkyboxTypes.method5424(local16[0], local16[1], local16[2], client.SkyboxSphereTypes, local16[3]);
						Static72.anInt1683 = local16[4];
					}
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local19; local136++) {
			@Pc(148) int local148 = (Static291.mapSquares[local136] >> 8) * 64 - Camera.originX;
			local40 = (Static291.mapSquares[local136] & 0xFF) * 64 - Camera.originZ;
			@Pc(163) byte[] local163 = arg1[local136];
			if (local163 == null && Static9.anInt212 < 800) {
				client.audioLogic();
				arg0.method1098(local40, local148);
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public static void method3347() {
		@Pc(1) LruHashTable local1 = Static98.aClass98_10;
		synchronized (Static98.aClass98_10) {
			Static98.aClass98_10.method2621();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I")
	public static int method3349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static74.anIntArray116[arg1 & 0x3] : Static195.anIntArray211[arg1 & 0x3];
	}
}
