import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!am;")
	private Class9 aClass9_9;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!ms;")
	private final Class77_Sub1 aClass77_Sub1_1;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	private final int anInt5635;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_33;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "F")
	private final float aFloat72;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private final int anInt5636;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
	private final int[] anIntArray416;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	private final int anInt5634;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!ms;IIII)V")
	public Class1_Sub30(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass77_Sub1_1 = arg0;
		this.anInt5635 = arg4;
		this.aClass40_Sub2_33 = this.aClass77_Sub1_1.aClass40_Sub2_26;
		this.aFloat72 = arg2;
		this.anInt5636 = arg3;
		this.anIntArray416 = new int[this.aClass77_Sub1_1.anInt4630 * this.aClass77_Sub1_1.anInt4625];
		this.anInt5634 = arg1;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	public void method4802(@OriginalArg(1) int arg0) {
		this.aByteBuffer4.position(arg0 * 4 + 3);
		this.aByteBuffer4.put((byte) -1);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIII)V")
	public void method4803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray416[arg1 + this.aClass77_Sub1_1.anInt4630 * arg2] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
	public void method4804(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		Static196.aClass1_Sub16_4.anInt6813 = 0;
		@Pc(11) int local11 = 0;
		@Pc(35) short[] local35;
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(17) int local17;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (this.aClass40_Sub2_33.aBoolean216) {
			for (local17 = 0; local17 < arg1; local17++) {
				local24 = arg0[local17];
				local29 = this.anIntArray416[local24];
				local35 = this.aClass77_Sub1_1.aShortArrayArray4[local24];
				if (local29 != 0 && local35 != null) {
					local45 = 0;
					local47 = 0;
					while (local35.length > local47) {
						if ((0x1 << local45++ & local29) == 0) {
							local47 += 3;
						} else {
							local11++;
							Static196.aClass1_Sub16_4.method5757(local35[local47++]);
							Static196.aClass1_Sub16_4.method5757(local35[local47++]);
							local11++;
							Static196.aClass1_Sub16_4.method5757(local35[local47++]);
							local11++;
						}
					}
				}
			}
		} else {
			for (local17 = 0; local17 < arg1; local17++) {
				local24 = arg0[local17];
				local35 = this.aClass77_Sub1_1.aShortArrayArray4[local24];
				local29 = this.anIntArray416[local24];
				if (local29 != 0 && local35 != null) {
					local45 = 0;
					local47 = 0;
					while (local35.length > local47) {
						if ((local29 & 0x1 << local45++) == 0) {
							local47 += 3;
						} else {
							Static196.aClass1_Sub16_4.method5779(local35[local47++]);
							local11++;
							Static196.aClass1_Sub16_4.method5779(local35[local47++]);
							local11++;
							local11++;
							Static196.aClass1_Sub16_4.method5779(local35[local47++]);
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		@Pc(177) opengl local177 = this.aClass40_Sub2_33.anOpengl1;
		this.aClass40_Sub2_33.method2878(this.anInt5634, (this.aClass77_Sub1_1.anInt4507 & 0x7) != 0, (this.aClass77_Sub1_1.anInt4507 & 0x8) != 0);
		if (this.aClass40_Sub2_33.aBoolean217) {
			this.aClass40_Sub2_33.method2780(Integer.MAX_VALUE, this.anInt5636, this.anInt5635);
		}
		this.aClass40_Sub2_33.anInterface7_3.method6094(Static196.aClass1_Sub16_4.aByteArray86, Static196.aClass1_Sub16_4.anInt6813);
		local177.glMatrixMode(5890);
		local177.glPushMatrix();
		local177.glScalef(1.0F / this.aFloat72, 1.0F / this.aFloat72, 1.0F);
		local177.glMatrixMode(5888);
		this.aClass40_Sub2_33.method2840(this.aClass77_Sub1_1.aClass9_7, this.aClass77_Sub1_1.aClass9_6, this.aClass9_9, this.aClass77_Sub1_1.aClass9_5);
		this.aClass40_Sub2_33.method2847(this.aClass40_Sub2_33.anInterface7_3, 0, local11);
		local177.glMatrixMode(5890);
		local177.glPopMatrix();
		local177.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	public void method4805(@OriginalArg(0) int arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
	public void method4806(@OriginalArg(0) int arg0) {
		this.aByteBuffer4.position(arg0 * 4);
		this.aByteBuffer4.flip();
		@Pc(22) Interface2 local22 = this.aClass40_Sub2_33.method2818(0, this.aByteBuffer4);
		this.aClass9_9 = new Class9(this.aClass40_Sub2_33, local22, 5121, 4, 0);
		this.aByteBuffer4 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIF)V")
	public void method4807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(16) int local16;
		@Pc(32) int local32;
		if (this.anInt5634 != -1) {
			@Pc(11) Class50 local11 = this.aClass40_Sub2_33.anInterface4_5.method165(this.anInt5634);
			local16 = local11.aByte20 & 0xFF;
			@Pc(55) int local55;
			if (local16 != 0 && local11.aByte21 != 4) {
				if (arg0 < 0) {
					local32 = 0;
				} else if (arg0 > 127) {
					local32 = 16777215;
				} else {
					local32 = arg0 * 131586;
				}
				if (local16 == 256) {
					arg2 = local32;
				} else {
					local55 = 256 - local16;
					arg2 = (local16 * (local32 & 0xFF00) + local55 * (arg2 & 0xFF00) & 0xFF0000) + (local55 * (arg2 & 0xFF00FF) + local16 * (local32 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local32 = local11.aByte22 & 0xFF;
			if (local32 != 0) {
				local32 += 256;
				@Pc(108) int local108 = (arg2 >> 16 & 0xFF) * local32;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local55 = (arg2 >> 8 & 0xFF) * local32;
				if (local55 > 65535) {
					local55 = 65535;
				}
				@Pc(133) int local133 = (arg2 & 0xFF) * local32;
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg2 = (local55 & 0xFF00) + ((local108 & 0xB000FF00) << 8) + (local133 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(164) int local164 = arg2 >> 16 & 0xFF;
			local16 = arg2 >> 8 & 0xFF;
			local164 = (int) ((float) local164 * arg3);
			local32 = arg2 & 0xFF;
			local16 = (int) ((float) local16 * arg3);
			if (local164 < 0) {
				local164 = 0;
			} else if (local164 > 255) {
				local164 = 255;
			}
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local32 = (int) ((float) local32 * arg3);
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 255) {
				local32 = 255;
			}
			arg2 = local16 << 8 | local164 << 16 | local32;
		}
		this.aByteBuffer4.position(arg1 * 4);
		this.aByteBuffer4.put((byte) (arg2 >> 16));
		this.aByteBuffer4.put((byte) (arg2 >> 8));
		this.aByteBuffer4.put((byte) arg2);
	}
}
