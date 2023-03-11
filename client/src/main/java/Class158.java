import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class158 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	private int anInt4039 = 0;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	private int anInt4044 = -1;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!ld;")
	private Class135 aClass135_27 = new Class135();

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
	public boolean aBoolean265 = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	private final int anInt4042;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private final int anInt4038;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!se;")
	private Class2_Sub33[] aClass2_Sub33Array1;

	static {
		new Class79("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4042 = arg0;
		this.anInt4038 = arg1;
		this.anIntArrayArray34 = new int[this.anInt4042][arg2];
		this.aClass2_Sub33Array1 = new Class2_Sub33[this.anInt4038];
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void method3994() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4042; local3++) {
			this.anIntArrayArray34[local3] = null;
		}
		this.aClass2_Sub33Array1 = null;
		this.anIntArrayArray34 = null;
		this.aClass135_27.method3544();
		this.aClass135_27 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	public int[] method3996(@OriginalArg(0) int arg0) {
		if (this.anInt4038 == this.anInt4042) {
			this.aBoolean265 = this.aClass2_Sub33Array1[arg0] == null;
			this.aClass2_Sub33Array1[arg0] = Static133.aClass2_Sub33_1;
			return this.anIntArrayArray34[arg0];
		} else if (this.anInt4042 == 1) {
			this.aBoolean265 = this.anInt4044 != arg0;
			this.anInt4044 = arg0;
			return this.anIntArrayArray34[0];
		} else {
			@Pc(27) Class2_Sub33 local27 = this.aClass2_Sub33Array1[arg0];
			if (local27 == null) {
				this.aBoolean265 = true;
				if (this.anInt4039 >= this.anInt4042) {
					@Pc(52) Class2_Sub33 local52 = (Class2_Sub33) this.aClass135_27.method3548();
					local27 = new Class2_Sub33(arg0, local52.anInt5933);
					this.aClass2_Sub33Array1[local52.anInt5932] = null;
					local52.method6468();
				} else {
					local27 = new Class2_Sub33(arg0, this.anInt4039);
					this.anInt4039++;
				}
				this.aClass2_Sub33Array1[arg0] = local27;
			} else {
				this.aBoolean265 = false;
			}
			this.aClass135_27.method3545(local27);
			return this.anIntArrayArray34[local27.anInt5933];
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)[[I")
	public int[][] method3998() {
		if (this.anInt4042 != this.anInt4038) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt4042; local21++) {
			this.aClass2_Sub33Array1[local21] = Static133.aClass2_Sub33_1;
		}
		return this.anIntArrayArray34;
	}
}
