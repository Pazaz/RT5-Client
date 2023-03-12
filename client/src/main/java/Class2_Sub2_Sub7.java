import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class2_Sub2_Sub7 extends SecondaryNode {

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	public int anInt2290;

	static {
		new LocalizedString("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V")
	public Class2_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.key = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	public int method2307() {
		return (int) (super.key >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)J")
	public long method2308() {
		return super.secondaryKey & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I")
	public int method2309() {
		return (int) super.key;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public void method2311() {
		super.secondaryKey |= Long.MIN_VALUE;
		if (this.method2308() == 0L) {
			Static368.aClass246_10.addTail(this);
		}
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
	public void method2312() {
		super.secondaryKey = MonotonicClock.currentTimeMillis() + 500L | super.secondaryKey & Long.MIN_VALUE;
		Static208.aClass246_4.addTail(this);
	}
}
