import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	private int anInt1798 = 3216;

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "[I")
	private final int[] anIntArray119 = new int[3];

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
	private int anInt1799 = 4096;

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
	private int anInt1801 = 3216;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method6085(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass201_41.method5513(arg0);
		if (super.aClass201_41.aBoolean471) {
			@Pc(27) int local27 = this.anInt1799 * Static150.anInt3679 >> 12;
			@Pc(37) int[] local37 = this.method6078(0, arg0 - 1 & Static128.anInt3242);
			@Pc(43) int[] local43 = this.method6078(0, arg0);
			@Pc(53) int[] local53 = this.method6078(0, Static128.anInt3242 & arg0 + 1);
			for (@Pc(55) int local55 = 0; local55 < Static64.anInt1755; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = (local43[Static145.anInt3608 & local55 - 1] - local43[Static145.anInt3608 & local55 + 1]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local70 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(136) int local136 = Class7_Sub5.aByteArray36[local95 + (local99 * (local99 + 1) >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * local70 >> 8;
				@Pc(148) int local148 = local136 * 4096 >> 8;
				@Pc(154) int local154 = local136 * local91 >> 8;
				@Pc(163) int local163 = local148 * this.anIntArray119[2] >> 12;
				@Pc(172) int local172 = local154 * this.anIntArray119[0] >> 12;
				@Pc(181) int local181 = local142 * this.anIntArray119[1] >> 12;
				local16[local55] = local172 + local181 + local163;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
	private void method1533() {
		@Pc(17) double local17 = Math.cos((double) ((float) this.anInt1798 / 4096.0F));
		this.anIntArray119[0] = (int) (Math.sin((double) ((float) this.anInt1801 / 4096.0F)) * 4096.0D * local17);
		this.anIntArray119[1] = (int) (Math.cos((double) ((float) this.anInt1801 / 4096.0F)) * local17 * 4096.0D);
		this.anIntArray119[2] = (int) (Math.sin((double) ((float) this.anInt1798 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray119[0] * this.anIntArray119[0] >> 12;
		@Pc(87) int local87 = this.anIntArray119[1] * this.anIntArray119[1] >> 12;
		@Pc(99) int local99 = this.anIntArray119[2] * this.anIntArray119[2] >> 12;
		@Pc(113) int local113 = (int) (Math.sqrt((double) (local99 + local75 + local87 >> 12)) * 4096.0D);
		if (local113 != 0) {
			this.anIntArray119[1] = (this.anIntArray119[1] << 12) / local113;
			this.anIntArray119[0] = (this.anIntArray119[0] << 12) / local113;
			this.anIntArray119[2] = (this.anIntArray119[2] << 12) / local113;
		}
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	@Override
	public void method6090() {
		this.method1533();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBLclient!il;)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 0) {
			this.anInt1799 = arg1.method5749();
		} else if (arg0 == 1) {
			this.anInt1801 = arg1.method5749();
		} else if (arg0 == 2) {
			this.anInt1798 = arg1.method5749();
		}
	}
}
