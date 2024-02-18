import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ska")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ska", name = "Q", descriptor = "I")
	private int anInt8719;

	@OriginalMember(owner = "client!ska", name = "K", descriptor = "I")
	private int anInt8720;

	@OriginalMember(owner = "client!ska", name = "J", descriptor = "I")
	private int anInt8721;

	@OriginalMember(owner = "client!ska", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		this(0);
	}

	@OriginalMember(owner = "client!ska", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub26(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7742(arg0);
	}

	@OriginalMember(owner = "client!ska", name = "b", descriptor = "(II)V")
	private void method7742(@OriginalArg(1) int arg0) {
		this.anInt8720 = arg0 >> 4 & 0xFF0;
		this.anInt8719 = (arg0 & 0xFF) << 4;
		this.anInt8721 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.method7742(arg1.method7383());
		}
		if (arg0) {
			Static590.anIntArray695 = null;
		}
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9414(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass372_41.method8450(arg0);
		if (super.aClass372_41.aBoolean737) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static608.anInt9289; local35++) {
				local25[local35] = this.anInt8721;
				local29[local35] = this.anInt8720;
				local33[local35] = this.anInt8719;
			}
		}
		return local17;
	}
}
