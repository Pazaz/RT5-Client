import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class WorldMap {

	@OriginalMember(owner = "client!i", name = "V", descriptor = "Lclient!ad;")
	public static final HashTable visibleMapElementCategories = new HashTable(8);
	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!ad;")
	public static final HashTable visibleMapElementIds = new HashTable(8);
	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	public static int anInt1105;
	@OriginalMember(owner = "client!vl", name = "hb", descriptor = "I")
	public static int anInt6930;
	@OriginalMember(owner = "client!im", name = "D", descriptor = "I")
	public static int anInt2772;
	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public static int anInt2003;
	@OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
	public static int loadPercentage = 0;
	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!nk;")
	public static Component aClass161_11;
	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	public static boolean aBoolean225 = false;
	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!vj;")
	public static Map currentMap;
	@OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
	public static int originX;
	@OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
	public static int originZ;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void setTargetZoom(@OriginalArg(1) int arg0) {
		Static77.anInt1763 = -1;
		if (arg0 == 37) {
			MapList.aFloat73 = 3.0F;
		} else if (arg0 == 50) {
			MapList.aFloat73 = 4.0F;
		} else if (arg0 == 75) {
			MapList.aFloat73 = 6.0F;
		} else if (arg0 == 100) {
			MapList.aFloat73 = 8.0F;
		} else if (arg0 == 200) {
			MapList.aFloat73 = 16.0F;
		}
		Static77.anInt1763 = -1;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
	public static int getTargetZoom() {
		if ((double) MapList.aFloat73 == 3.0D) {
			return 37;
		} else if ((double) MapList.aFloat73 == 4.0D) {
			return 50;
		} else if ((double) MapList.aFloat73 == 6.0D) {
			return 75;
		} else if ((double) MapList.aFloat73 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZIIII)V")
	public static void method4402(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static77.anInt1762 == 0) {
			Static241.method4192(false);
		} else {
			Static33.anInt4462 = Static77.anInt1762;
			Static78.method5701(0);
		}
		Static184.anInt3436 = arg1;
		Static18.anInt519 = arg3;
		Static299.aBoolean399 = arg0;
		MapList.method5518(arg2);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Lclient!jg;")
	public static MapElement headMapElement() {
		if (MapList.aClass135_36 == null || Static116.aClass75_1 == null) {
			return null;
		}
		Static116.aClass75_1.method2180(MapList.aClass135_36);
		@Pc(18) MapElement local18 = (MapElement) Static116.aClass75_1.method2181();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) MelType local33 = MapList.aClass125_4.get(local18.id);
			return local33 != null && local33.aBoolean302 && local33.method4180(MapList.anInterface11_2) ? local18 : nextMapElement();
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Lclient!jg;")
	public static MapElement nextMapElement() {
		if (MapList.aClass135_36 == null || Static116.aClass75_1 == null) {
			return null;
		}
		for (@Pc(16) MapElement local16 = (MapElement) Static116.aClass75_1.method2178(); local16 != null; local16 = (MapElement) Static116.aClass75_1.method2178()) {
			@Pc(24) MelType local24 = MapList.aClass125_4.get(local16.id);
			if (local24 != null && local24.aBoolean302 && local24.method4180(MapList.anInterface11_2)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lclient!vj;")
	public static Map getCurrentMap() {
		return currentMap;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(IIB)V")
	public static void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static77.anInt1763 = arg0 - originZ;
		Static238.anInt4328 = arg1 - originX;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	public static void method3955(@OriginalArg(0) int arg0) {
		Static225.anInt3979 = arg0;
		Static236.anInt4301 = -1;
		Static90.anInt6637 = 100;
		Static243.anInt4495 = 3;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
	public static void method4027(@OriginalArg(1) int arg0) {
		Static90.anInt6637 = 100;
		Static243.anInt4495 = 3;
		Static236.anInt4301 = arg0;
		Static225.anInt3979 = -1;
	}
}
