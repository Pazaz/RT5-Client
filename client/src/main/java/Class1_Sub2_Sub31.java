import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
	private int anInt5734 = 4096;

	@OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
	private int anInt5736 = 409;

	@OriginalMember(owner = "client!rm", name = "W", descriptor = "[I")
	private final int[] anIntArray429 = new int[3];

	@OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
	private int anInt5739 = 4096;

	@OriginalMember(owner = "client!rm", name = "bb", descriptor = "I")
	private int anInt5744 = 4096;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6081(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass68_41.method2002(arg0);
		if (super.aClass68_41.aBoolean157) {
			@Pc(23) int[][] local23 = this.method6082(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local13[2];
			for (@Pc(49) int local49 = 0; local49 < Static64.anInt1755; local49++) {
				@Pc(55) int local55 = local27[local49];
				@Pc(63) int local63 = local55 - this.anIntArray429[0];
				if (local63 < 0) {
					local63 = -local63;
				}
				if (this.anInt5736 < local63) {
					local39[local49] = local55;
					local43[local49] = local31[local49];
					local47[local49] = local35[local49];
				} else {
					@Pc(94) int local94 = local31[local49];
					local63 = local94 - this.anIntArray429[1];
					if (local63 < 0) {
						local63 = -local63;
					}
					if (this.anInt5736 < local63) {
						local39[local49] = local55;
						local43[local49] = local94;
						local47[local49] = local35[local49];
					} else {
						@Pc(135) int local135 = local35[local49];
						local63 = local135 - this.anIntArray429[2];
						if (local63 < 0) {
							local63 = -local63;
						}
						if (this.anInt5736 < local63) {
							local39[local49] = local55;
							local43[local49] = local94;
							local47[local49] = local135;
						} else {
							local39[local49] = this.anInt5734 * local55 >> 12;
							local43[local49] = local94 * this.anInt5739 >> 12;
							local47[local49] = local135 * this.anInt5744 >> 12;
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt5736 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt5744 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt5739 = arg1.method5749();
		} else if (arg0 == 3) {
			this.anInt5734 = arg1.method5749();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method5755();
			this.anIntArray429[2] = local59 >> 12 & 0x0;
			this.anIntArray429[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray429[1] = local59 >> 4 & 0xFF0;
		}
	}
}
