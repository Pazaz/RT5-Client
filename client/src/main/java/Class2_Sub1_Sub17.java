import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
	private int anInt5965;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub17() {
		this(4096);
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(I)V")
	public Class2_Sub1_Sub17(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5965 = 4096;
		this.anInt5965 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Static379.method5355(false);
		}
		if (arg2 == 0) {
			this.anInt5965 = (arg1.g1() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 107) {
			Static379.anInt5968 = -76;
		}
		@Pc(16) int[] local16 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			Static734.method7690(local16, 0, Static608.anInt9289, this.anInt5965);
		}
		return local16;
	}
}
