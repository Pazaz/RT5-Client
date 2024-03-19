import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class100 implements Interface1 {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Z")
	public boolean aBoolean240;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public int anInt3461;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	public int anInt3462;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public int anInt3464;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	public int anInt3470;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public int anInt3471;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!bp;I)Z")
	@Override
	public boolean method3077(@OriginalArg(0) Interface1 arg0) {
		if (!(arg0 instanceof Class100)) {
			return false;
		}
		@Pc(11) Class100 local11 = (Class100) arg0;
		if (this.anInt3462 != local11.anInt3462) {
			return false;
		} else if (this.anInt3461 != local11.anInt3461) {
			return false;
		} else if (local11.anInt3459 != this.anInt3459) {
			return false;
		} else if (this.anInt3471 != local11.anInt3471) {
			return false;
		} else if (local11.anInt3464 != this.anInt3464) {
			return false;
		} else if (local11.anInt3470 == this.anInt3470) {
			return local11.aBoolean240 == this.aBoolean240;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)J")
	@Override
	public long method3076() {
		@Pc(5) long[] local5 = Class7_Sub5.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) (((long) this.anInt3462 ^ local7) & 0xFFL)];
		@Pc(39) long local39 = local5[(int) ((local22 ^ (long) (this.anInt3461 >> 8)) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt3461 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt3459 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt3459 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) ((local88 ^ (long) (this.anInt3459 >> 8)) & 0xFFL)];
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt3459) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt3471) & 0xFFL)];
		@Pc(152) long local152 = local5[(int) ((local135 ^ (long) (this.anInt3464 >> 24)) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local152 >>> 8 ^ local5[(int) (((long) (this.anInt3464 >> 16) ^ local152) & 0xFFL)];
		@Pc(186) long local186 = local5[(int) ((local169 ^ (long) (this.anInt3464 >> 8)) & 0xFFL)] ^ local169 >>> 8;
		@Pc(201) long local201 = local186 >>> 8 ^ local5[(int) ((local186 ^ (long) this.anInt3464) & 0xFFL)];
		@Pc(216) long local216 = local5[(int) (((long) this.anInt3470 ^ local201) & 0xFFL)] ^ local201 >>> 8;
		return local5[(int) (((long) (this.aBoolean240 ? 1 : 0) ^ local216) & 0xFFL)] ^ local216 >>> 8;
	}
}
