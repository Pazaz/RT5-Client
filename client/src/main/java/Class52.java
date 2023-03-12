import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class52 {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!ad;")
	private HashTable aClass4_30;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Lclient!ad;")
	public HashTable aClass4_31;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	private int anInt1634;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
	private String aString16 = "null";

	static {
		new LocalizedString("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
		new LocalizedString("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
	public int method1766(@OriginalArg(1) int arg0) {
		if (this.aClass4_31 == null) {
			return this.anInt1634;
		} else {
			@Pc(23) Class2_Sub39 local23 = (Class2_Sub39) this.aClass4_31.get((long) arg0);
			return local23 == null ? this.anInt1634 : local23.anInt6818;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!bt;BI)V")
	private void method1767(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static78.method5698(arg0.g1b());
		} else if (arg1 == 2) {
			this.aChar3 = Static78.method5698(arg0.g1b());
		} else if (arg1 == 3) {
			this.aString16 = arg0.gjstr();
		} else if (arg1 == 4) {
			this.anInt1634 = arg0.g4();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(45) int local45 = arg0.g2();
			this.aClass4_31 = new HashTable(Static162.method2977(local45));
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				@Pc(61) int local61 = arg0.g4();
				@Pc(73) Node local73;
				if (arg1 == 5) {
					local73 = new Class2_Sub40(arg0.gjstr());
				} else {
					local73 = new Class2_Sub39(arg0.g4());
				}
				this.aClass4_31.put(local73, (long) local61);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	private void method1768() {
		this.aClass4_30 = new HashTable(this.aClass4_31.method89());
		for (@Pc(20) Class2_Sub39 local20 = (Class2_Sub39) this.aClass4_31.method80(); local20 != null; local20 = (Class2_Sub39) this.aClass4_31.method79()) {
			@Pc(29) Class2_Sub39 local29 = new Class2_Sub39((int) local20.key);
			this.aClass4_30.put(local29, (long) local20.anInt6818);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method1769(@OriginalArg(1) String arg0) {
		if (this.aClass4_31 == null) {
			return false;
		}
		if (this.aClass4_30 == null) {
			this.method1773();
		}
		for (@Pc(37) Class2_Sub28 local37 = (Class2_Sub28) this.aClass4_30.get(Static80.method5982(arg0)); local37 != null; local37 = (Class2_Sub28) this.aClass4_30.method82()) {
			if (local37.aString54.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)Z")
	public boolean method1771(@OriginalArg(1) int arg0) {
		if (this.aClass4_31 == null) {
			return false;
		}
		if (this.aClass4_30 == null) {
			this.method1768();
		}
		@Pc(29) Class2_Sub39 local29 = (Class2_Sub39) this.aClass4_30.get((long) arg0);
		return local29 != null;
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)V")
	private void method1773() {
		this.aClass4_30 = new HashTable(this.aClass4_31.method89());
		for (@Pc(28) Class2_Sub40 local28 = (Class2_Sub40) this.aClass4_31.method80(); local28 != null; local28 = (Class2_Sub40) this.aClass4_31.method79()) {
			@Pc(39) Class2_Sub28 local39 = new Class2_Sub28(local28.aString65, (int) local28.key);
			this.aClass4_30.put(local39, Static80.method5982(local28.aString65));
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!bt;)V")
	public void method1774(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.g1();
			if (local11 == 0) {
				return;
			}
			this.method1767(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method1775(@OriginalArg(0) int arg0) {
		if (this.aClass4_31 == null) {
			return this.aString16;
		} else {
			@Pc(19) Class2_Sub40 local19 = (Class2_Sub40) this.aClass4_31.get((long) arg0);
			return local19 == null ? this.aString16 : local19.aString65;
		}
	}
}
