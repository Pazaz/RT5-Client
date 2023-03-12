import jaggl.opengl;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub36 extends Node {

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!kj;")
	private Class126 aClass126_14;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "Lclient!ah;")
	private final Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	public final int anInt6097;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	public final int anInt6098;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "I")
	public final int anInt6095;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	public final int anInt6096;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "F")
	public final float aFloat75;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_34;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "[I")
	private final int[] anIntArray415;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!ve;")
	private final Class180_Sub2 aClass180_Sub2_1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!ah;IIIII)V")
	public Class2_Sub36(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass6_Sub1_3 = arg0;
		this.anInt6097 = arg3;
		this.anInt6098 = arg5;
		this.anInt6095 = arg1;
		this.anInt6096 = arg4;
		this.aFloat75 = arg2;
		this.aClass19_Sub1_34 = this.aClass6_Sub1_3.aClass19_Sub1_1;
		this.anIntArray415 = new int[this.aClass6_Sub1_3.anInt6320 * this.aClass6_Sub1_3.anInt6319];
		this.aClass180_Sub2_1 = new Class180_Sub2(this.aClass19_Sub1_34, 5123, null, 1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(FIIII)V")
	public void method5564(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(38) int local38;
		if (this.anInt6095 != -1) {
			@Pc(14) Class229 local14 = this.aClass19_Sub1_34.anInterface2_5.method2658(this.anInt6095);
			local19 = local14.aByte71 & 0xFF;
			@Pc(57) int local57;
			if (local19 != 0 && local14.aByte67 != 4) {
				if (arg1 < 0) {
					local38 = 0;
				} else if (arg1 <= 127) {
					local38 = arg1 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local19 == 256) {
					arg2 = local38;
				} else {
					local57 = 256 - local19;
					arg2 = ((local38 & 0xFF00FF) * local19 + (arg2 & 0xFF00FF) * local57 & 0xFF00FF00) + ((local38 & 0xFF00) * local19 + (local57 * (arg2 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local38 = local14.aByte70 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(109) int local109 = (arg2 >> 16 & 0xFF) * local38;
				if (local109 > 65535) {
					local109 = 65535;
				}
				local57 = (arg2 >> 8 & 0xFF) * local38;
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(136) int local136 = (arg2 & 0xFF) * local38;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg2 = (local109 << 8 & 0xFF000D) + (local57 & 0xFF00) + (local136 >> 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(166) int local166 = arg2 >> 16 & 0xFF;
			local19 = arg2 >> 8 & 0xFF;
			local38 = arg2 & 0xFF;
			local166 = (int) ((float) local166 * arg0);
			local19 = (int) ((float) local19 * arg0);
			if (local166 < 0) {
				local166 = 0;
			} else if (local166 > 255) {
				local166 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local38 = (int) ((float) local38 * arg0);
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg2 = local19 << 8 | local166 << 16 | local38;
		}
		this.aByteBuffer6.position(arg3 * 4);
		this.aByteBuffer6.put((byte) (arg2 >> 16));
		this.aByteBuffer6.put((byte) (arg2 >> 8));
		this.aByteBuffer6.put((byte) arg2);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IB)V")
	public void method5565(@OriginalArg(0) int arg0) {
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	public void method5566(@OriginalArg(0) int arg0) {
		this.aByteBuffer6.position(arg0 * 4);
		this.aByteBuffer6.flip();
		@Pc(18) Interface5 local18 = this.aClass19_Sub1_34.method802(0, this.aByteBuffer6);
		this.aClass126_14 = new Class126(this.aClass19_Sub1_34, local18, 5121, 4, 0);
		this.aByteBuffer6 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
	public void method5567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray415[this.aClass6_Sub1_3.anInt6320 * arg2 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)V")
	public void method5568(@OriginalArg(0) int arg0) {
		this.aByteBuffer6.position(arg0 * 4 + 3);
		this.aByteBuffer6.put((byte) -1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IZI)V")
	public void method5569(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Buffer local3 = Static8.aClass2_Sub4_1;
		local3.pos = 0;
		@Pc(33) short[] local33;
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(15) int local15;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass19_Sub1_34.aBoolean53) {
			for (local15 = 0; local15 < arg1; local15++) {
				local22 = arg0[local15];
				local27 = this.anIntArray415[local22];
				local33 = this.aClass6_Sub1_3.aShortArrayArray1[local22];
				if (local27 != 0 && local33 != null) {
					local43 = 0;
					local45 = 0;
					while (local33.length > local45) {
						if ((0x1 << local43++ & local27) == 0) {
							local45 += 3;
						} else {
							local1++;
							local3.p2(local33[local45++] & 0xFFFF);
							local1++;
							local3.p2(local33[local45++] & 0xFFFF);
							local1++;
							local3.p2(local33[local45++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local15 = 0; local15 < arg1; local15++) {
				local22 = arg0[local15];
				local27 = this.anIntArray415[local22];
				local33 = this.aClass6_Sub1_3.aShortArrayArray1[local22];
				if (local27 != 0 && local33 != null) {
					local43 = 0;
					local45 = 0;
					while (local33.length > local45) {
						if ((0x1 << local43++ & local27) == 0) {
							local45 += 3;
						} else {
							local1++;
							local3.ip2(local33[local45++] & 0xFFFF);
							local1++;
							local3.ip2(local33[local45++] & 0xFFFF);
							local3.ip2(local33[local45++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(185) opengl local185 = this.aClass19_Sub1_34.anOpengl1;
		this.aClass180_Sub2_1.method6067(local3.data, local3.pos);
		this.aClass19_Sub1_34.method790(this.aClass6_Sub1_3.aClass126_1, this.aClass6_Sub1_3.aClass126_4, this.aClass126_14, this.aClass6_Sub1_3.aClass126_2);
		this.aClass19_Sub1_34.method846(this.anInt6095, (this.aClass6_Sub1_3.anInt181 & 0x7) != 0, (this.aClass6_Sub1_3.anInt181 & 0x8) != 0);
		if (this.aClass19_Sub1_34.aBoolean50) {
			this.aClass19_Sub1_34.method2866(Integer.MAX_VALUE, this.anInt6097, this.anInt6096, this.anInt6098);
		}
		local185.glMatrixMode(GL.GL_TEXTURE);
		local185.glPushMatrix();
		local185.glScalef(1.0F / this.aFloat75, 1.0F / this.aFloat75, 1.0F);
		local185.glMatrixMode(GL.GL_MODELVIEW);
		this.aClass19_Sub1_34.method790(this.aClass6_Sub1_3.aClass126_1, this.aClass6_Sub1_3.aClass126_4, this.aClass126_14, this.aClass6_Sub1_3.aClass126_2);
		this.aClass19_Sub1_34.method811(this.aClass180_Sub2_1, 0, local1);
		local185.glMatrixMode(GL.GL_TEXTURE);
		local185.glPopMatrix();
		local185.glMatrixMode(GL.GL_MODELVIEW);
	}
}
