import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class243 {

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
	private int anInt7041 = -1;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private int anInt7048 = 0;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!ld;")
	private Class135 aClass135_42 = new Class135();

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
	public boolean aBoolean478 = false;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	private final int anInt7049;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	private final int anInt7040;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "[Lclient!wh;")
	private Class2_Sub43[] aClass2_Sub43Array1;

	static {
		new Class79("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(III)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7049 = arg0;
		this.anInt7040 = arg1;
		this.anIntArrayArrayArray14 = new int[this.anInt7049][3][arg2];
		this.aClass2_Sub43Array1 = new Class2_Sub43[this.anInt7040];
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I")
	public int[][] method6277(@OriginalArg(0) int arg0) {
		if (this.anInt7040 == this.anInt7049) {
			this.aBoolean478 = this.aClass2_Sub43Array1[arg0] == null;
			this.aClass2_Sub43Array1[arg0] = Static184.aClass2_Sub43_1;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt7049 == 1) {
			this.aBoolean478 = arg0 != this.anInt7041;
			this.anInt7041 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(30) Class2_Sub43 local30 = this.aClass2_Sub43Array1[arg0];
			if (local30 == null) {
				this.aBoolean478 = true;
				if (this.anInt7048 >= this.anInt7049) {
					@Pc(55) Class2_Sub43 local55 = (Class2_Sub43) this.aClass135_42.method3548();
					local30 = new Class2_Sub43(arg0, local55.anInt7177);
					this.aClass2_Sub43Array1[local55.anInt7176] = null;
					local55.method6468();
				} else {
					local30 = new Class2_Sub43(arg0, this.anInt7048);
					this.anInt7048++;
				}
				this.aClass2_Sub43Array1[arg0] = local30;
			} else {
				this.aBoolean478 = false;
			}
			this.aClass135_42.method3545(local30);
			return this.anIntArrayArrayArray14[local30.anInt7177];
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method6280() {
		if (this.anInt7040 != this.anInt7049) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt7049; local28++) {
			this.aClass2_Sub43Array1[local28] = Static184.aClass2_Sub43_1;
		}
		return this.anIntArrayArrayArray14;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public void method6283() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7049; local3++) {
			this.anIntArrayArrayArray14[local3][0] = null;
			this.anIntArrayArrayArray14[local3][1] = null;
			this.anIntArrayArrayArray14[local3][2] = null;
			this.anIntArrayArrayArray14[local3] = null;
		}
		this.aClass2_Sub43Array1 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass135_42.method3544();
		this.aClass135_42 = null;
	}
}
