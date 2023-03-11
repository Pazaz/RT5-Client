import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class53 implements Interface7 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
	public int anInt1639;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
	public int anInt1640;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
	public int anInt1641;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
	public int anInt1642;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
	public int anInt1644;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
	public int anInt1645;

	static {
		new Class79("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!iq;)Z")
	@Override
	public boolean method1778(@OriginalArg(1) Interface7 arg0) {
		if (!(arg0 instanceof Class53)) {
			return false;
		}
		@Pc(11) Class53 local11 = (Class53) arg0;
		if (local11.anInt1639 != this.anInt1639) {
			return false;
		} else if (local11.anInt1644 != this.anInt1644) {
			return false;
		} else if (local11.anInt1645 != this.anInt1645) {
			return false;
		} else if (local11.anInt1642 != this.anInt1642) {
			return false;
		} else if (local11.anInt1640 != this.anInt1640) {
			return false;
		} else if (local11.anInt1641 == this.anInt1641) {
			return local11.aBoolean128 == this.aBoolean128;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)J")
	@Override
	public long method1779() {
		@Pc(5) long[] local5 = Class4.aLongArray1;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt1639) & 0xFFL)];
		@Pc(46) long local46 = local5[(int) (((long) (this.anInt1644 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(61) long local61 = local46 >>> 8 ^ local5[(int) (((long) this.anInt1644 ^ local46) & 0xFFL)];
		@Pc(78) long local78 = local5[(int) (((long) (this.anInt1645 >> 24) ^ local61) & 0xFFL)] ^ local61 >>> 8;
		@Pc(95) long local95 = local5[(int) ((local78 ^ (long) (this.anInt1645 >> 16)) & 0xFFL)] ^ local78 >>> 8;
		@Pc(112) long local112 = local95 >>> 8 ^ local5[(int) ((local95 ^ (long) (this.anInt1645 >> 8)) & 0xFFL)];
		@Pc(127) long local127 = local112 >>> 8 ^ local5[(int) (((long) this.anInt1645 ^ local112) & 0xFFL)];
		@Pc(142) long local142 = local127 >>> 8 ^ local5[(int) (((long) this.anInt1642 ^ local127) & 0xFFL)];
		@Pc(159) long local159 = local142 >>> 8 ^ local5[(int) (((long) (this.anInt1640 >> 24) ^ local142) & 0xFFL)];
		@Pc(176) long local176 = local159 >>> 8 ^ local5[(int) (((long) (this.anInt1640 >> 16) ^ local159) & 0xFFL)];
		@Pc(193) long local193 = local5[(int) (((long) (this.anInt1640 >> 8) ^ local176) & 0xFFL)] ^ local176 >>> 8;
		@Pc(208) long local208 = local193 >>> 8 ^ local5[(int) ((local193 ^ (long) this.anInt1640) & 0xFFL)];
		@Pc(223) long local223 = local5[(int) (((long) this.anInt1641 ^ local208) & 0xFFL)] ^ local208 >>> 8;
		return local5[(int) ((local223 ^ (long) (this.aBoolean128 ? 1 : 0)) & 0xFFL)] ^ local223 >>> 8;
	}
}
