import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rla")
public final class Class324 implements Interface24 {

	@OriginalMember(owner = "client!rla", name = "n", descriptor = "I")
	public int anInt8430;

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "I")
	public int anInt8432;

	@OriginalMember(owner = "client!rla", name = "j", descriptor = "I")
	public int anInt8433;

	@OriginalMember(owner = "client!rla", name = "b", descriptor = "I")
	public int anInt8434;

	@OriginalMember(owner = "client!rla", name = "g", descriptor = "I")
	public int anInt8435;

	@OriginalMember(owner = "client!rla", name = "p", descriptor = "I")
	public int anInt8436;

	@OriginalMember(owner = "client!rla", name = "l", descriptor = "Z")
	public boolean aBoolean641;

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(I)J")
	@Override
	public long method7433() {
		@Pc(5) long[] local5 = Class2_Sub2_Sub14.aLongArray21;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) ((local7 ^ (long) this.anInt8432) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt8433 >> 8)) & 0xFFL)];
		@Pc(61) long local61 = local39 >>> 8 ^ local5[(int) (((long) this.anInt8433 ^ local39) & 0xFFL)];
		@Pc(78) long local78 = local61 >>> 8 ^ local5[(int) ((local61 ^ (long) (this.anInt8430 >> 24)) & 0xFFL)];
		@Pc(95) long local95 = local5[(int) (((long) (this.anInt8430 >> 16) ^ local78) & 0xFFL)] ^ local78 >>> 8;
		@Pc(112) long local112 = local5[(int) (((long) (this.anInt8430 >> 8) ^ local95) & 0xFFL)] ^ local95 >>> 8;
		@Pc(127) long local127 = local112 >>> 8 ^ local5[(int) ((local112 ^ (long) this.anInt8430) & 0xFFL)];
		@Pc(142) long local142 = local5[(int) ((local127 ^ (long) this.anInt8434) & 0xFFL)] ^ local127 >>> 8;
		@Pc(159) long local159 = local5[(int) ((local142 ^ (long) (this.anInt8436 >> 24)) & 0xFFL)] ^ local142 >>> 8;
		@Pc(176) long local176 = local159 >>> 8 ^ local5[(int) (((long) (this.anInt8436 >> 16) ^ local159) & 0xFFL)];
		@Pc(193) long local193 = local176 >>> 8 ^ local5[(int) ((local176 ^ (long) (this.anInt8436 >> 8)) & 0xFFL)];
		@Pc(208) long local208 = local5[(int) ((local193 ^ (long) this.anInt8436) & 0xFFL)] ^ local193 >>> 8;
		@Pc(223) long local223 = local5[(int) ((local208 ^ (long) this.anInt8435) & 0xFFL)] ^ local208 >>> 8;
		return local223 >>> 8 ^ local5[(int) (((long) (this.aBoolean641 ? 1 : 0) ^ local223) & 0xFFL)];
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(ILclient!uq;)Z")
	@Override
	public boolean method7432(@OriginalArg(1) Interface24 arg0) {
		if (!(arg0 instanceof Class324)) {
			return false;
		}
		@Pc(12) Class324 local12 = (Class324) arg0;
		if (this.anInt8432 != local12.anInt8432) {
			return false;
		} else if (local12.anInt8433 != this.anInt8433) {
			return false;
		} else if (this.anInt8430 != local12.anInt8430) {
			return false;
		} else if (local12.anInt8434 != this.anInt8434) {
			return false;
		} else if (this.anInt8436 != local12.anInt8436) {
			return false;
		} else if (this.anInt8435 == local12.anInt8435) {
			return local12.aBoolean641 == this.aBoolean641;
		} else {
			return false;
		}
	}
}
