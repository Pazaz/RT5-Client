import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class303 implements Interface4 {

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "Lclient!ts;")
	private final Class361 aClass361_3 = new Class361(256);

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "Lclient!sb;")
	private final Class330 aClass330_99;

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "Lclient!sb;")
	private final Class330 aClass330_98;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
	private final int anInt7709;

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "[Lclient!fa;")
	private final Class118[] aClass118Array1;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!sb;)V")
	public Class303(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_99 = arg2;
		this.aClass330_98 = arg1;
		@Pc(24) Class2_Sub21 local24 = new Class2_Sub21(arg0.method7595(0, 0));
		this.anInt7709 = local24.method7382();
		this.aClass118Array1 = new Class118[this.anInt7709];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7709; local36++) {
			if (local24.method7396() == 1) {
				this.aClass118Array1[local36] = new Class118();
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt7709; local65++) {
			if (this.aClass118Array1[local65] != null) {
				this.aClass118Array1[local65].aBoolean240 = local24.method7396() == 0;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < this.anInt7709; local98++) {
			if (this.aClass118Array1[local98] != null) {
				this.aClass118Array1[local98].aBoolean233 = local24.method7396() == 1;
			}
		}
		for (@Pc(132) int local132 = 0; local132 < this.anInt7709; local132++) {
			if (this.aClass118Array1[local132] != null) {
				this.aClass118Array1[local132].aBoolean234 = local24.method7396() == 1;
			}
		}
		for (@Pc(168) int local168 = 0; local168 < this.anInt7709; local168++) {
			if (this.aClass118Array1[local168] != null) {
				this.aClass118Array1[local168].aByte57 = local24.method7377();
			}
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt7709; local200++) {
			if (this.aClass118Array1[local200] != null) {
				this.aClass118Array1[local200].aByte58 = local24.method7377();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.anInt7709; local228++) {
			if (this.aClass118Array1[local228] != null) {
				this.aClass118Array1[local228].aByte56 = local24.method7377();
			}
		}
		for (@Pc(256) int local256 = 0; local256 < this.anInt7709; local256++) {
			if (this.aClass118Array1[local256] != null) {
				this.aClass118Array1[local256].aByte55 = local24.method7377();
			}
		}
		for (@Pc(288) int local288 = 0; local288 < this.anInt7709; local288++) {
			if (this.aClass118Array1[local288] != null) {
				this.aClass118Array1[local288].aShort37 = (short) local24.method7382();
			}
		}
		for (@Pc(321) int local321 = 0; local321 < this.anInt7709; local321++) {
			if (this.aClass118Array1[local321] != null) {
				this.aClass118Array1[local321].aByte54 = local24.method7377();
			}
		}
		for (@Pc(353) int local353 = 0; local353 < this.anInt7709; local353++) {
			if (this.aClass118Array1[local353] != null) {
				this.aClass118Array1[local353].aByte52 = local24.method7377();
			}
		}
		for (@Pc(381) int local381 = 0; local381 < this.anInt7709; local381++) {
			if (this.aClass118Array1[local381] != null) {
				this.aClass118Array1[local381].aBoolean239 = local24.method7396() == 1;
			}
		}
		for (@Pc(421) int local421 = 0; local421 < this.anInt7709; local421++) {
			if (this.aClass118Array1[local421] != null) {
				this.aClass118Array1[local421].aBoolean238 = local24.method7396() == 1;
			}
		}
		for (@Pc(455) int local455 = 0; local455 < this.anInt7709; local455++) {
			if (this.aClass118Array1[local455] != null) {
				this.aClass118Array1[local455].aByte53 = local24.method7377();
			}
		}
		for (@Pc(483) int local483 = 0; local483 < this.anInt7709; local483++) {
			if (this.aClass118Array1[local483] != null) {
				this.aClass118Array1[local483].aBoolean236 = local24.method7396() == 1;
			}
		}
		for (@Pc(521) int local521 = 0; local521 < this.anInt7709; local521++) {
			if (this.aClass118Array1[local521] != null) {
				this.aClass118Array1[local521].aBoolean235 = local24.method7396() == 1;
			}
		}
		for (@Pc(559) int local559 = 0; local559 < this.anInt7709; local559++) {
			if (this.aClass118Array1[local559] != null) {
				this.aClass118Array1[local559].aBoolean237 = local24.method7396() == 1;
			}
		}
		for (@Pc(595) int local595 = 0; local595 < this.anInt7709; local595++) {
			if (this.aClass118Array1[local595] != null) {
				this.aClass118Array1[local595].anInt2790 = local24.method7396();
			}
		}
		for (@Pc(627) int local627 = 0; local627 < this.anInt7709; local627++) {
			if (this.aClass118Array1[local627] != null) {
				this.aClass118Array1[local627].anInt2791 = local24.method7349();
			}
		}
		for (@Pc(655) int local655 = 0; local655 < this.anInt7709; local655++) {
			if (this.aClass118Array1[local655] != null) {
				this.aClass118Array1[local655].anInt2796 = local24.method7396();
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)Lclient!vm;")
	private Class2_Sub2_Sub21 method6819(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2 local10 = this.aClass361_3.method8342((long) arg0);
		if (local10 != null) {
			return (Class2_Sub2_Sub21) local10;
		}
		@Pc(30) byte[] local30 = this.aClass330_98.method7589(arg0);
		if (local30 == null) {
			return null;
		} else {
			@Pc(43) Class2_Sub2_Sub21 local43 = new Class2_Sub2_Sub21(new Class2_Sub21(local30));
			this.aClass361_3.method8341(local43, (long) arg0);
			return local43;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZIIBF)[I")
	@Override
	public int[] method6818(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4) {
		return this.method6819(arg3).method8951(this.aClass330_99, (double) arg4, this.aClass118Array1[arg3].aBoolean238, this, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)I")
	@Override
	public int method6813() {
		return this.anInt7709;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6814(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub21 local8 = this.method6819(arg0);
		return local8 != null && local8.method8947(this.aClass330_99, this);
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(II)Lclient!fa;")
	@Override
	public Class118 method6817(@OriginalArg(0) int arg0) {
		return this.aClass118Array1[arg0];
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIFBIZ)[F")
	@Override
	public float[] method6816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		return this.method6819(arg1).method8946(arg0, this, this.aClass330_99, this.aClass118Array1[arg1].aBoolean238, arg3);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(FIIZZI)[I")
	@Override
	public int[] method6815(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method6819(arg1).method8948(arg2, (double) arg0, this.aClass118Array1[arg1].aBoolean238, arg3, this, this.aClass330_99);
	}
}
