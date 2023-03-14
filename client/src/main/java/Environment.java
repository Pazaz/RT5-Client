import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Environment {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "F")
	public float aFloat22 = 1.0F;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "F")
	public float aFloat26 = 0.25F;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "F")
	public float aFloat27 = 1.0F;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public final int anInt636;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public final int anInt632;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public final int anInt641;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public final int anInt634;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public final int anInt637;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public final int anInt640;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Lclient!rc;")
	public final Class42 aClass42_1;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "F")
	public final float aFloat23;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "F")
	public final float aFloat24;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "F")
	public final float aFloat25;

	static {
		new LocalizedString("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Environment() {
		this.anInt636 = -60;
		this.anInt632 = -50;
		this.anInt641 = Static279.anInt5161;
		this.anInt634 = 0;
		this.anInt637 = Static28.anInt686;
		this.anInt640 = -50;
		this.aClass42_1 = Static62.aClass42_5;
		this.aFloat23 = 0.69921875F;
		this.aFloat24 = 1.2F;
		this.aFloat25 = 1.1523438F;
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Environment(@OriginalArg(0) Buffer arg0) {
		@Pc(16) int local16 = arg0.g1();
		if (client.preferences.aBoolean364 && Static65.aClass19_3.method2886() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt637 = Static28.anInt686;
			} else {
				this.anInt637 = arg0.g4();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat25 = 1.1523438F;
			} else {
				this.aFloat25 = (float) arg0.g2() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat23 = 0.69921875F;
			} else {
				this.aFloat23 = (float) arg0.g2() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat24 = 1.2F;
			} else {
				this.aFloat24 = (float) arg0.g2() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.g4();
			}
			if ((local16 & 0x2) != 0) {
				arg0.g2();
			}
			if ((local16 & 0x4) != 0) {
				arg0.g2();
			}
			if ((local16 & 0x8) != 0) {
				arg0.g2();
			}
			this.anInt637 = Static28.anInt686;
			this.aFloat25 = 1.1523438F;
			this.aFloat24 = 1.2F;
			this.aFloat23 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt636 = -60;
			this.anInt632 = -50;
			this.anInt640 = -50;
		} else {
			this.anInt632 = arg0.g2s();
			this.anInt636 = arg0.g2s();
			this.anInt640 = arg0.g2s();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt641 = Static279.anInt5161;
		} else {
			this.anInt641 = arg0.g4();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt634 = 0;
		} else {
			this.anInt634 = arg0.g2();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass42_1 = Static62.aClass42_5;
		} else {
			this.aClass42_1 = Static297.method5107(arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2(), arg0.g2());
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!bt;)V")
	public void method851(@OriginalArg(1) Buffer arg0) {
		this.aFloat27 = (float) (arg0.g1() * 8) / 255.0F;
		this.aFloat26 = (float) (arg0.g1() * 8) / 255.0F;
		this.aFloat22 = (float) (arg0.g1() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!bh;)Z")
	public boolean method854(@OriginalArg(1) Environment arg0) {
		return arg0.anInt637 == this.anInt637 && this.aFloat25 == arg0.aFloat25 && arg0.aFloat23 == this.aFloat23 && this.aFloat24 == arg0.aFloat24 && this.aFloat26 == arg0.aFloat26 && this.aFloat27 == arg0.aFloat27 && this.aFloat22 == arg0.aFloat22 && this.anInt641 == arg0.anInt641 && this.anInt634 == arg0.anInt634 && this.aClass42_1 == arg0.aClass42_1;
	}
}
