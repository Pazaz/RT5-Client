import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class367 {

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "F")
	public float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "F")
	public float aFloat203 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "F")
	public float aFloat200 = 0.25F;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public int anInt9533;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!pu;")
	public Class67 aClass67_10;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public int anInt9535;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!gm;")
	public Class148 aClass148_5;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public int anInt9537;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public int anInt9534;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public int anInt9538;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public int anInt9539;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class367() {
		this.anInt9533 = -60;
		this.aClass67_10 = Static226.aClass67_9;
		this.anInt9535 = -50;
		this.aFloat202 = 1.2F;
		this.aClass148_5 = Static495.aClass148_4;
		this.anInt9537 = Static68.anInt4096;
		this.aFloat205 = 0.69921875F;
		this.aFloat204 = 1.1523438F;
		this.anInt9534 = -50;
		this.anInt9538 = Static563.anInt8460;
		this.anInt9539 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class367(@OriginalArg(0) Class2_Sub21 arg0) {
		this.method8386(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method8384(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(17) int local17 = arg0.method7382();
		@Pc(21) int local21 = arg0.method7356();
		@Pc(25) int local25 = arg0.method7356();
		@Pc(29) int local29 = arg0.method7356();
		@Pc(33) int local33 = arg0.method7382();
		Static436.anInt3852 = local33;
		this.aClass148_5 = Static344.method5047(local25, local17, local21, local29);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method8385(@OriginalArg(0) Class2_Sub21 arg0) {
		this.aFloat201 = (float) (arg0.method7396() * 8) / 255.0F;
		this.aFloat200 = (float) (arg0.method7396() * 8) / 255.0F;
		this.aFloat203 = (float) (arg0.method7396() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lclient!ge;I)V")
	public void method8386(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method7396();
		if (Static400.aClass2_Sub34_28.aClass57_Sub24_1.method7082() == 1 && Static425.aClass19_13.method7955() > 0) {
			if ((local7 & 0x1) == 0) {
				this.anInt9537 = Static68.anInt4096;
			} else {
				this.anInt9537 = arg0.method7349();
			}
			if ((local7 & 0x2) == 0) {
				this.aFloat204 = 1.1523438F;
			} else {
				this.aFloat204 = (float) arg0.method7382() / 256.0F;
			}
			if ((local7 & 0x4) == 0) {
				this.aFloat205 = 0.69921875F;
			} else {
				this.aFloat205 = (float) arg0.method7382() / 256.0F;
			}
			if ((local7 & 0x8) == 0) {
				this.aFloat202 = 1.2F;
			} else {
				this.aFloat202 = (float) arg0.method7382() / 256.0F;
			}
		} else {
			if ((local7 & 0x1) != 0) {
				arg0.method7349();
			}
			if ((local7 & 0x2) != 0) {
				arg0.method7382();
			}
			if ((local7 & 0x4) != 0) {
				arg0.method7382();
			}
			if ((local7 & 0x8) != 0) {
				arg0.method7382();
			}
			this.aFloat202 = 1.2F;
			this.aFloat204 = 1.1523438F;
			this.aFloat205 = 0.69921875F;
			this.anInt9537 = Static68.anInt4096;
		}
		if ((local7 & 0x10) == 0) {
			this.anInt9535 = -50;
			this.anInt9534 = -50;
			this.anInt9533 = -60;
		} else {
			this.anInt9535 = arg0.method7356();
			this.anInt9533 = arg0.method7356();
			this.anInt9534 = arg0.method7356();
		}
		if ((local7 & 0x20) == 0) {
			this.anInt9538 = Static563.anInt8460;
		} else {
			this.anInt9538 = arg0.method7349();
		}
		if ((local7 & 0x40) == 0) {
			this.anInt9539 = 0;
		} else {
			this.anInt9539 = arg0.method7382();
		}
		if ((local7 & 0x80) == 0) {
			this.aClass67_10 = Static226.aClass67_9;
			return;
		}
		@Pc(251) int local251 = arg0.method7382();
		@Pc(255) int local255 = arg0.method7382();
		@Pc(261) int local261 = arg0.method7382();
		@Pc(265) int local265 = arg0.method7382();
		@Pc(271) int local271 = arg0.method7382();
		@Pc(275) int local275 = arg0.method7382();
		this.aClass67_10 = Static373.method5301(local271, local255, local261, local265, local275, local251);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!uc;)Z")
	public boolean method8388(@OriginalArg(1) Class367 arg0) {
		return this.anInt9537 == arg0.anInt9537 && arg0.aFloat204 == this.aFloat204 && this.aFloat205 == arg0.aFloat205 && this.aFloat202 == arg0.aFloat202 && arg0.aFloat200 == this.aFloat200 && this.aFloat201 == arg0.aFloat201 && this.aFloat203 == arg0.aFloat203 && this.anInt9538 == arg0.anInt9538 && arg0.anInt9539 == this.anInt9539 && arg0.aClass67_10 == this.aClass67_10 && arg0.aClass148_5 == this.aClass148_5;
	}
}
