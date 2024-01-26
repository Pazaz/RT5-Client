import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class10 {

	@OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!afa", name = "m", descriptor = "Z")
	public boolean aBoolean10;

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
	public int anInt123 = 8;

	@OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
	public int anInt131 = 16777215;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method129(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt123 = arg1.method7382();
		} else if (arg0 == 2) {
			this.aBoolean10 = true;
		} else if (arg0 == 3) {
			this.anInt125 = arg1.method7356();
			this.anInt130 = arg1.method7356();
			this.anInt132 = arg1.method7356();
		} else if (arg0 == 4) {
			this.anInt129 = arg1.method7396();
		} else if (arg0 == 5) {
			this.anInt124 = arg1.method7382();
		} else if (arg0 == 6) {
			this.anInt131 = arg1.method7383();
		} else if (arg0 == 7) {
			this.anInt128 = arg1.method7356();
			this.anInt133 = arg1.method7356();
			this.anInt126 = arg1.method7356();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method131(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7396();
			if (local11 == 0) {
				return;
			}
			this.method129(local11, arg0);
		}
	}
}
