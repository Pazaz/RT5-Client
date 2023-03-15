import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class19_Sub2 extends RasteriserBase {

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	public int anInt2840;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "F")
	private float aFloat36;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!j", name = "y", descriptor = "[Lclient!wq;")
	private Class250[] aClass250Array1;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "I")
	public int anInt2844;

	@OriginalMember(owner = "client!j", name = "B", descriptor = "I")
	public int anInt2845;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	public int anInt2846;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "I")
	public int anInt2848;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	private int anInt2849;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "I")
	public int anInt2850;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "I")
	public int anInt2855;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!j", name = "W", descriptor = "F")
	private float aFloat37;

	@OriginalMember(owner = "client!j", name = "X", descriptor = "I")
	public int anInt2862;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "Lclient!ba;")
	public Class14_Sub1 aClass14_Sub1_2;

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
	public int anInt2865;

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "Lclient!hu;")
	private LruHashTable aClass98_25;

	@OriginalMember(owner = "client!j", name = "lb", descriptor = "Lclient!aa;")
	private Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public int anInt2841 = 512;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "I")
	private int anInt2839 = 3500;

	@OriginalMember(owner = "client!j", name = "A", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	public int anInt2854 = 0;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	public int anInt2852 = 75518;

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	public int anInt2847 = 3500;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "I")
	public int anInt2858 = 45823;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	private int anInt2856 = 0;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	public int anInt2853 = 0;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public int anInt2842 = 78642;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	public int anInt2857 = 0;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "I")
	public int anInt2843 = 50;

	@OriginalMember(owner = "client!j", name = "I", descriptor = "I")
	public int anInt2851 = 512;

	@OriginalMember(owner = "client!j", name = "db", descriptor = "I")
	public int anInt2866 = 0;

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
	private int anInt2864 = 0;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "I")
	public int anInt2859 = 0;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public int anInt2867 = this.anInt2839 - 255;

	@OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
	public int anInt2870 = 0;

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
	public int anInt2868 = 0;

	@OriginalMember(owner = "client!j", name = "gb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
	private int anInt2869 = 0;

	@OriginalMember(owner = "client!j", name = "kb", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "Lclient!hu;")
	private final LruHashTable aClass98_24 = new LruHashTable(16);

	@OriginalMember(owner = "client!j", name = "N", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!tr;")
	private FrameBuffer aClass155_1;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
	public int anInt2863;

	@OriginalMember(owner = "client!j", name = "V", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ci;I)V")
	public Class19_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) TextureProviderInterface arg1, @OriginalArg(2) int arg2) {
		super(arg2, arg1);
		this.aCanvas3 = arg0;
		this.aClass155_1 = FrameBuffer.create(this.aCanvas3);
		this.anIntArray179 = this.aClass155_1.anIntArray385;
		this.anInt2863 = this.aClass155_1.anInt5654;
		this.anInt2861 = this.aClass155_1.anInt5658;
		this.method2915();
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
	@Override
	public void method2867(@OriginalArg(0) int arg0) {
		this.method2901(0, 0, this.anInt2863, this.anInt2861, arg0, 0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2832(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2858 = (int) (arg1 * 65535.0F);
		this.anInt2842 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2845 = (int) (arg3 * 65535.0F / local26);
		this.anInt2840 = (int) (arg4 * 65535.0F / local26);
		this.anInt2850 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2873(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(I)Z")
	public boolean method2904(@OriginalArg(0) int arg0) {
		return super.anInterface2_5.method2658(arg0).aBoolean442;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!wq;")
	public Class250 method2905(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2846; local1++) {
			if (this.aClass250Array1[local1].aRunnable1 == arg0) {
				return this.aClass250Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!j", name = "p", descriptor = "()V")
	@Override
	protected void method2839() {
		if (this.aBoolean202) {
			Static82.method1902(false);
			this.aBoolean202 = false;
		}
		this.aCanvas3 = null;
		this.aClass155_1 = null;
		this.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class250 local3 = this.method2905(Thread.currentThread());
		@Pc(6) Rasteriser local6 = local3.aClass81_2;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method2281();
		@Pc(98) int local98 = arg1 - local6.method2291();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt2264 = 0;
		local6.textX = local102 < 0 || local102 > local6.width || local106 < 0 || local106 > local6.width || local112 < 0 || local112 > local6.width;
		local6.method2282(local122, local126, local132, local102, local106, local112, arg4);
		local6.textX = local102 < 0 || local102 > local6.width || local106 < 0 || local106 > local6.width || local118 < 0 || local118 > local6.width;
		local6.method2282(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "(I)Z")
	public boolean method2906(@OriginalArg(0) int arg0) {
		return super.anInterface2_5.method2657(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([Lclient!gn;Lclient!on;[Lclient!au;I)V")
	@Override
	public void method2881(@OriginalArg(0) Model[] arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class12_Sub2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) SoftwareModel[] local3 = new SoftwareModel[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (SoftwareModel) arg0[local5];
			}
		}
		@Pc(26) SoftwareModel local26 = Static38.method1259(this, local3);
		local26.method1249(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)V")
	@Override
	public void method2872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2843 = arg0;
		this.anInt2839 = arg1;
		this.anInt2867 = this.anInt2839 - 255;
		this.method2913();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!rc;)V")
	@Override
	public void method2870(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!j", name = "D", descriptor = "()I")
	@Override
	public int method2886() {
		return 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
	@Override
	public void method2851(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2868;
		arg0[1] = this.anInt2857;
		arg0[2] = this.anInt2854;
		arg0[3] = this.anInt2859;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2868 < arg0) {
			this.anInt2868 = arg0;
		}
		if (this.anInt2857 < arg1) {
			this.anInt2857 = arg1;
		}
		if (this.anInt2854 > arg2) {
			this.anInt2854 = arg2;
		}
		if (this.anInt2859 > arg3) {
			this.anInt2859 = arg3;
		}
		this.method2909();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2853() {
		@Pc(3) Class250 local3 = this.method2905(Thread.currentThread());
		@Pc(6) Rasteriser local6 = local3.aClass81_2;
		local6.aBoolean168 = false;
		local6.aBoolean168 = false;
		local6.anInt2264 = 0;
		local6.textX = true;
		local6.method2289(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean168 = true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!kg;)V")
	@Override
	public void method2846(@OriginalArg(0) Class2_Sub22 arg0) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(FF)V")
	@Override
	public void method2823(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat36 = arg0;
		this.aFloat37 = arg1;
		this.method2913();
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "(I)I")
	public int method2907(@OriginalArg(0) int arg0) {
		return super.anInterface2_5.method2658(arg0).aShort87 & 0xFFFF;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!gn;Lclient!tp;Lclient!on;Lclient!au;I)V")
	@Override
	public void method2824(@OriginalArg(0) Model arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2 arg3) {
		((SoftwareModel) arg0).method1249(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
	@Override
	public int method2806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2828(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.method2803();
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)Lclient!kg;")
	@Override
	public Class2_Sub22 method2876() {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2863;
		@Pc(35) int local35 = this.anInt2863 - arg2;
		if (arg1 + arg3 > this.anInt2859) {
			arg3 -= arg1 + arg3 - this.anInt2859;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2857) {
			local59 = this.anInt2857 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2863;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2854) {
			local59 = arg0 + arg2 - this.anInt2854;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2868) {
			local59 = this.anInt2868 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 = local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray179[local30++] = arg4;
					} else {
						this.anIntArray179[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray179[local30];
					this.anIntArray179[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray179[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray179[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!j", name = "B", descriptor = "()V")
	@Override
	public void method2882() {
		this.anInt2853 = this.anInt2869;
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
	@Override
	public void method2855(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()F")
	@Override
	public float method2802() {
		return this.aFloat36;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!at;III)V")
	public void method2908(@OriginalArg(0) Class12_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt4474;
		if (local6 == -1) {
			this.method2816(arg1, arg2, local3, arg0.anInt4469);
			return;
		}
		if (this.aClass2_Sub1_1 == null || this.aClass2_Sub1_1.key != (long) local6) {
			this.aClass2_Sub1_1 = (Class2_Sub1) this.aClass98_24.get((long) local6);
		}
		if (this.aClass2_Sub1_1 == null) {
			@Pc(44) int[] local44 = this.method2910(local6);
			if (local44 == null) {
				return;
			}
			this.aClass2_Sub1_1 = new Class2_Sub1();
			this.aClass2_Sub1_1.aBoolean2 = this.method2914(local6);
			@Pc(65) int local65 = this.aClass2_Sub1_1.aBoolean2 ? 64 : 128;
			this.aClass2_Sub1_1.aClass13_1 = this.method2884(local44, local65, local65, local65);
			this.aClass98_24.put((long) local6, this.aClass2_Sub1_1);
		}
		if (this.aClass2_Sub1_1.aBoolean2) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass2_Sub1_1.aClass13_1.method6395(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt4469, 1);
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "()V")
	@Override
	public void method2819() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2856(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method2856(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt2868) {
					arg1 += local104 * (this.anInt2868 - arg0);
					arg0 = this.anInt2868;
				}
				if (arg2 >= this.anInt2854) {
					arg2 = this.anInt2854 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2857 && local150 < this.anInt2859) {
							this.anIntArray179[arg0 + local150 * this.anInt2863] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2857 && local213 < this.anInt2859) {
							local228 = arg0 + local213 * this.anInt2863;
							local233 = this.anIntArray179[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray179[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt2857) {
					arg0 += local104 * (this.anInt2857 - arg1);
					arg1 = this.anInt2857;
				}
				if (arg3 >= this.anInt2859) {
					arg3 = this.anInt2859 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2868 && local150 < this.anInt2854) {
							this.anIntArray179[local150 + arg1 * this.anInt2863] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2868 && local213 < this.anInt2854) {
							local228 = local213 + arg1 * this.anInt2863;
							local233 = this.anIntArray179[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray179[local213 + arg1 * this.anInt2863] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method2889(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method2889(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	private void method2909() {
		this.anInt2848 = this.anInt2868 - this.anInt2855;
		this.anInt2865 = this.anInt2854 - this.anInt2855;
		this.anInt2844 = this.anInt2857 - this.anInt2860;
		this.anInt2862 = this.anInt2859 - this.anInt2860;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2846; local29++) {
			@Pc(36) Rasteriser local36 = this.aClass250Array1[local29].aClass81_2;
			local36.anInt2266 = this.anInt2855 - this.anInt2868;
			local36.anInt2263 = this.anInt2860 - this.anInt2857;
			local36.width = this.anInt2854 - this.anInt2868;
			local36.anInt2267 = this.anInt2859 - this.anInt2857;
		}
		@Pc(78) int local78 = this.anInt2857 * this.anInt2863 + this.anInt2868;
		for (@Pc(81) int local81 = this.anInt2857; local81 < this.anInt2859; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt2846; local84++) {
				this.aClass250Array1[local84].aClass81_2.anIntArray144[local81 - this.anInt2857] = local78;
			}
			local78 += this.anInt2863;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!on;)V")
	@Override
	public void method2896(@OriginalArg(0) Class14 arg0) {
		this.aClass14_Sub1_2 = (Class14_Sub1) arg0;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method2889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2868 || arg0 >= this.anInt2854) {
			return;
		}
		if (arg1 < this.anInt2857) {
			arg2 -= this.anInt2857 - arg1;
			arg1 = this.anInt2857;
		}
		if (arg1 + arg2 > this.anInt2859) {
			arg2 = this.anInt2859 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2863;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray179[local40 + local54 * this.anInt2863] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt2863;
				local116 = this.anIntArray179[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray179[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2863;
				local111 = this.anIntArray179[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray179[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!j", name = "s", descriptor = "()Z")
	@Override
	public boolean method2847() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II[[I[[IIII)Lclient!tf;")
	@Override
	public Class6 method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class6_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!j", name = "k", descriptor = "(I)[I")
	private int[] method2910(@OriginalArg(0) int arg0) {
		@Pc(2) LruHashTable local2 = this.aClass98_25;
		@Pc(12) Class2_Sub14 local12;
		synchronized (this.aClass98_25) {
			local12 = (Class2_Sub14) this.aClass98_25.get((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_5.method2657(arg0)) {
					return null;
				}
				@Pc(32) Class229 local32 = super.anInterface2_5.method2658(arg0);
				@Pc(42) int local42 = local32.aBoolean441 || this.aBoolean201 ? 64 : 128;
				local12 = new Class2_Sub14(arg0, local42, super.anInterface2_5.method2656(0.7F, local42, local42, arg0), local32.aBoolean440);
				this.aClass98_25.put((long) arg0, local12);
			}
		}
		local12.aBoolean165 = true;
		return local12.method2252();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIZ)Lclient!jd;")
	@Override
	public Sprite method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2863 + arg0;
		@Pc(16) int local16 = this.anInt2863 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray179[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class13_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class13_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!j", name = "J", descriptor = "()V")
	@Override
	public void method2898() {
		this.anInt2868 = 0;
		this.anInt2857 = 0;
		this.anInt2854 = this.anInt2863;
		this.anInt2859 = this.anInt2861;
		this.method2909();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2842(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas3 == null || this.aClass155_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2863 && local21.y <= this.anInt2861 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass155_1.method5151(local21.height, local21.x, local21.y, local14, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "()Z")
	@Override
	public boolean method2813() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	@Override
	public void method2893(@OriginalArg(0) int arg0) {
		this.aClass250Array1[arg0].method6450(Thread.currentThread());
	}

	@OriginalMember(owner = "client!j", name = "n", descriptor = "()Z")
	@Override
	public boolean method2829() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2855 = arg0;
		this.anInt2860 = arg1;
		this.anInt2851 = arg2;
		this.anInt2841 = arg3;
		this.method2909();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	@Override
	public void method2852(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(I)[I")
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(2) LruHashTable local2 = this.aClass98_25;
		@Pc(12) Class2_Sub14 local12;
		synchronized (this.aClass98_25) {
			local12 = (Class2_Sub14) this.aClass98_25.get((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_5.method2657(arg0)) {
					return null;
				}
				@Pc(32) Class229 local32 = super.anInterface2_5.method2658(arg0);
				@Pc(42) int local42 = local32.aBoolean441 || this.aBoolean201 ? 64 : 128;
				local12 = new Class2_Sub14(arg0, local42, super.anInterface2_5.method2659(arg0, true, local42, 0.7F, local42), local32.aBoolean440);
				this.aClass98_25.put((long) arg0, local12);
			}
		}
		local12.aBoolean165 = true;
		return local12.method2252();
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(IIII)V")
	@Override
	public void method2895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2863) {
			arg2 = this.anInt2863;
		}
		if (arg3 > this.anInt2861) {
			arg3 = this.anInt2861;
		}
		this.anInt2868 = arg0;
		this.anInt2854 = arg2;
		this.anInt2857 = arg1;
		this.anInt2859 = arg3;
		this.method2909();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)I")
	@Override
	public int method2863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!j", name = "v", descriptor = "()Z")
	@Override
	public boolean method2859() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "()Z")
	@Override
	public boolean method2805() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "r", descriptor = "()I")
	@Override
	public int method2843() {
		@Pc(2) int local2 = this.anInt2856;
		this.anInt2856 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!j", name = "G", descriptor = "()Z")
	@Override
	public boolean method2892() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Z")
	public boolean method2912() {
		return this.aBoolean200;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(IIII)[I")
	@Override
	public int[] method2850() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt2863;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray179[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
	@Override
	public void method2874(@OriginalArg(0) boolean arg0) {
		this.aBoolean201 = arg0;
		this.aClass98_25.method2614();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!pr;IIII)Lclient!gn;")
	@Override
	public Model method2864(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new SoftwareModel(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(F)V")
	@Override
	public void method2838(@OriginalArg(0) float arg0) {
		this.anInt2852 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	@Override
	public void method2865(@OriginalArg(0) int arg0) {
		this.aClass250Array1[arg0].method6450(null);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method2816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2857) {
			local8 = this.anInt2857;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2859) {
			local21 = this.anInt2859;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt2868) {
					local91 = this.anInt2868;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2854) {
					local102 = this.anInt2854;
				}
				local116 = local91 + local30 * this.anInt2863;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray179[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt2868) {
					local91 = this.anInt2868;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2854 - 1) {
					local102 = this.anInt2854 - 1;
				}
				local116 = local91 + local30 * this.anInt2863;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray179[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt2868) {
				local102 = this.anInt2868;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt2854) {
				local116 = this.anInt2854;
			}
			local118 = local102 + local30 * this.anInt2863;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray179[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray179[local118++] = local277 + local360;
			}
			local30++;
			local44 -= local40-- + local40;
			local48 -= local40 + local40;
		}
		local36 = arg2;
		local40 = -local40;
		local48 = local40 * local40 + local34;
		local44 = local48 - arg2;
		local48 -= local40;
		while (local30 < local21) {
			while (local48 > local34 && local44 > local34) {
				local48 -= local36-- + local36;
				local44 -= local36 + local36;
			}
			local102 = arg0 - local36;
			if (local102 < this.anInt2868) {
				local102 = this.anInt2868;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt2854 - 1) {
				local116 = this.anInt2854 - 1;
			}
			local118 = local102 + local30 * this.anInt2863;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray179[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray179[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(II)V")
	@Override
	public void method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2853 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt2853 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt2853 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt2853 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt2853 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean198 = false;
		} else {
			this.aBoolean198 = true;
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(IIII)V")
	@Override
	public void method2880() {
		this.anInt2869 = this.anInt2853;
		this.anInt2866 = -1;
		this.anInt2853 = 1583160;
		this.anInt2870 = 40;
		this.aBoolean199 = true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II[I[I)Lclient!kf;")
	@Override
	public Class78 method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class78_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "E", descriptor = "()V")
	@Override
	public void method2887() {
	}

	@OriginalMember(owner = "client!j", name = "A", descriptor = "()Z")
	@Override
	public boolean method2878() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!vi;[Lclient!dk;Z)Lclient!ur;")
	@Override
	public BitmapFont method2857(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class48[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1531;
			local7[local11] = arg1[local11].anInt1533;
			if (arg1[local11].aByteArray20 != null) {
			}
		}
		return new Class130_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!rc;Lclient!rc;FLclient!rc;)Lclient!rc;")
	@Override
	public Class42 method2827(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class42 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "x", descriptor = "()Z")
	@Override
	public boolean method2869() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "C", descriptor = "()V")
	@Override
	public void method2883() {
		if (this.aCanvas3 == null || this.aClass155_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass155_1.method5152(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method2833(@OriginalArg(0) Class224 arg0) {
		@Pc(3) Class12_Sub1 local3 = arg0.aClass191_1.aClass12_Sub1_7;
		for (@Pc(6) Class12_Sub1 local6 = local3.aClass12_Sub1_5; local6 != local3; local6 = local6.aClass12_Sub1_5) {
			@Pc(10) Class12_Sub1_Sub1 local10 = (Class12_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt4465 >> 12;
			@Pc(20) int local20 = local10.anInt4470 >> 12;
			@Pc(25) int local25 = local10.anInt4467 >> 12;
			@Pc(49) int local49 = this.aClass14_Sub1_2.anInt501 + (this.aClass14_Sub1_2.anInt504 * local15 + this.aClass14_Sub1_2.anInt502 * local20 + this.aClass14_Sub1_2.anInt503 * local25 >> 15);
			if (local49 >= this.anInt2843 && local49 <= this.anInt2839) {
				@Pc(90) int local90 = this.anInt2855 + this.anInt2851 * (this.aClass14_Sub1_2.anInt498 + (this.aClass14_Sub1_2.anInt505 * local15 + this.aClass14_Sub1_2.anInt500 * local20 + this.aClass14_Sub1_2.anInt497 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt2860 + this.anInt2841 * (this.aClass14_Sub1_2.anInt496 + (this.aClass14_Sub1_2.anInt507 * local15 + this.aClass14_Sub1_2.anInt506 * local20 + this.aClass14_Sub1_2.anInt499 * local25 >> 15)) / local49;
				if (local90 >= this.anInt2868 && local90 <= this.anInt2854 && local122 >= this.anInt2857 && local122 <= this.anInt2859) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2908(local10, local90, local122, (local10.anInt4472 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "()V")
	@Override
	public void draw() {
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()Lclient!on;")
	@Override
	public Class14 method2808() {
		@Pc(3) Class250 local3 = this.method2905(Thread.currentThread());
		return local3.aClass14_Sub1_3;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
	private void method2913() {
		if (this.aFloat37 == 0.0F) {
			this.anInt2847 = this.anInt2839;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt2839;
		@Pc(12) float local12 = (float) this.anInt2843;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat36 / (this.aFloat37 + this.aFloat36);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat37;
		this.anInt2847 = (int) (((float) this.anInt2839 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Lclient!of;)V")
	@Override
	public void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26[] arg1) {
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	@Override
	public void method2854(@OriginalArg(0) int arg0) {
		if (this.anInt2846 == arg0) {
			return;
		}
		this.anInt2846 = arg0;
		this.aClass250Array1 = new Class250[this.anInt2846];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2846; local14++) {
			this.aClass250Array1[local14] = new Class250(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "k", descriptor = "()I")
	@Override
	public int method2814() {
		return this.anInt2843;
	}

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()Z")
	@Override
	public boolean method2888() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIILclient!kf;II)V")
	@Override
	public void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class78_Sub1 local2 = (Class78_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray139;
		@Pc(8) int[] local8 = local2.anIntArray140;
		@Pc(17) int local17 = this.anInt2857 > arg7 ? this.anInt2857 : arg7;
		@Pc(32) int local32 = this.anInt2859 < arg7 + local5.length ? this.anInt2859 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt2868 && local129 < this.anInt2854 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray179[local129 + arg1 * this.anInt2863] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt2868 && local133 < this.anInt2854 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2863;
						local248 = this.anIntArray179[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray179[local133 + arg1 * this.anInt2863] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt2868) {
			arg1 += local83 * (this.anInt2868 - arg0);
			arg0 = this.anInt2868;
		}
		if (arg2 >= this.anInt2854) {
			arg2 = this.anInt2854 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray179[arg0 + local129 * this.anInt2863] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt2863;
					local248 = this.anIntArray179[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray179[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!j", name = "q", descriptor = "()Z")
	@Override
	public boolean method2840() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "z", descriptor = "()I")
	@Override
	public int method2875() {
		return this.anInt2839;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass14_Sub1_2.anInt501 + (this.aClass14_Sub1_2.anInt504 * arg0 + this.aClass14_Sub1_2.anInt502 * arg1 + this.aClass14_Sub1_2.anInt503 * arg2 >> 15);
		if (local23 < this.anInt2843 || local23 > this.anInt2839) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt2851 * (this.aClass14_Sub1_2.anInt498 + (this.aClass14_Sub1_2.anInt505 * arg0 + this.aClass14_Sub1_2.anInt500 * arg1 + this.aClass14_Sub1_2.anInt497 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt2841 * (this.aClass14_Sub1_2.anInt496 + (this.aClass14_Sub1_2.anInt507 * arg0 + this.aClass14_Sub1_2.anInt506 * arg1 + this.aClass14_Sub1_2.anInt499 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt2848 && local73 <= this.anInt2865 && local102 >= this.anInt2844 && local102 <= this.anInt2862) {
			arg3[0] = local73 - this.anInt2848;
			arg3[1] = local102 - this.anInt2844;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
	@Override
	public int method2899() {
		return 0;
	}

	@OriginalMember(owner = "client!j", name = "w", descriptor = "()F")
	@Override
	public float method2860() {
		return this.aFloat37;
	}

	@OriginalMember(owner = "client!j", name = "o", descriptor = "()V")
	@Override
	public void method2831() {
	}

	@OriginalMember(owner = "client!j", name = "H", descriptor = "()Z")
	@Override
	public boolean method2894() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "()Z")
	@Override
	public boolean method2812() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "()V")
	@Override
	public void method2803() {
		this.aClass155_1 = FrameBuffer.create(this.aCanvas3);
		this.anIntArray179 = this.aClass155_1.anIntArray385;
		this.anInt2863 = this.aClass155_1.anInt5654;
		this.anInt2861 = this.aClass155_1.anInt5658;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2846; local22++) {
			this.aClass250Array1[local22].method6457();
		}
		this.method2898();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([Lclient!gn;Lclient!tp;Lclient!on;[Lclient!au;I)V")
	@Override
	public void method2830(@OriginalArg(0) Model[] arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) SoftwareModel[] local3 = new SoftwareModel[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (SoftwareModel) arg0[local5];
			}
		}
		@Pc(26) SoftwareModel local26 = Static38.method1259(this, local3);
		local26.method1249(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!j", name = "m", descriptor = "()I")
	@Override
	public int method2820() {
		@Pc(2) int local2 = this.anInt2864;
		this.anInt2864 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(IIII)V")
	@Override
	public void method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2866 = arg0;
		this.anInt2853 = arg1;
		this.anInt2870 = arg2;
	}

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()Z")
	@Override
	public boolean method2858() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(I)Z")
	public boolean method2914(@OriginalArg(0) int arg0) {
		return this.aBoolean201 || super.anInterface2_5.method2658(arg0).aBoolean441;
	}

	@OriginalMember(owner = "client!j", name = "t", descriptor = "()Z")
	@Override
	public boolean method2849() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!dk;Z)Lclient!jd;")
	@Override
	public Sprite method2891(@OriginalArg(0) Class48 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray108;
		@Pc(5) byte[] local5 = arg0.aByteArray21;
		@Pc(8) int local8 = arg0.anInt1531;
		@Pc(11) int local11 = arg0.anInt1533;
		@Pc(76) SoftwareSprite local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray20 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class13_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray20;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class13_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class13_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class13_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method6391(arg0.anInt1535, arg0.anInt1530, arg0.anInt1532, arg0.anInt1534);
		return local76;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	@Override
	public void method2848(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2849;
		for (@Pc(9) Object local9 = this.aClass98_25.method2619(); local9 != null; local9 = this.aClass98_25.method2618()) {
			@Pc(13) Class2_Sub14 local13 = (Class2_Sub14) local9;
			if (local13.aBoolean165) {
				local13.anInt2233 += local4;
				@Pc(27) int local27 = local13.anInt2233 / 20;
				if (local27 > 0) {
					@Pc(36) Class229 local36 = super.anInterface2_5.method2658(local13.anInt2234);
					local13.method2251(local36.aByte68 * local4 * 50 / 1000, local36.aByte69 * local4 * 50 / 1000);
					local13.anInt2233 -= local27 * 20;
				}
				local13.aBoolean165 = false;
			}
		}
		this.anInt2849 = arg0;
		this.aClass98_24.clean(5);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2857 || arg1 >= this.anInt2859) {
			return;
		}
		if (arg0 < this.anInt2868) {
			arg2 -= this.anInt2868 - arg0;
			arg0 = this.anInt2868;
		}
		if (arg0 + arg2 > this.anInt2854) {
			arg2 = this.anInt2854 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2863;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray179[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray179[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray179[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray179[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray179[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "L", descriptor = "()V")
	@Override
	public void method2903() {
		this.aClass98_25.method2614();
	}

	@OriginalMember(owner = "client!j", name = "y", descriptor = "()Z")
	@Override
	public boolean method2871() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(IIIIII)V")
	@Override
	public void method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2868) {
			arg2 -= this.anInt2868 - arg0;
			arg0 = this.anInt2868;
		}
		if (arg1 < this.anInt2857) {
			arg3 -= this.anInt2857 - arg1;
			arg1 = this.anInt2857;
		}
		if (arg0 + arg2 > this.anInt2854) {
			arg2 = this.anInt2854 - arg0;
		}
		if (arg1 + arg3 > this.anInt2859) {
			arg3 = this.anInt2859 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2854 || arg1 > this.anInt2859) {
			return;
		}
		@Pc(67) int local67 = this.anInt2863 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2863;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray179[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray179[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray179[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray179[local74++] = local221 - local298 | local298 - (local298 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(IIIIII)Lclient!rc;")
	@Override
	public Class42 method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "I", descriptor = "()Lclient!on;")
	@Override
	public Class14 method2897() {
		return new Class14_Sub1();
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass14_Sub1_2.anInt504 * arg0 + this.aClass14_Sub1_2.anInt502 * arg1 + this.aClass14_Sub1_2.anInt503 * arg2 >> 15) + this.aClass14_Sub1_2.anInt501;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass14_Sub1_2.anInt504 * arg3 + this.aClass14_Sub1_2.anInt502 * arg4 + this.aClass14_Sub1_2.anInt503 * arg5 >> 15) + this.aClass14_Sub1_2.anInt501;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt2843 && local52 < this.anInt2843 || !(local23 <= this.anInt2839 || local52 <= this.anInt2839)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt2851 * ((this.aClass14_Sub1_2.anInt505 * arg0 + this.aClass14_Sub1_2.anInt500 * arg1 + this.aClass14_Sub1_2.anInt497 * arg2 >> 15) + this.aClass14_Sub1_2.anInt498) / local23;
		@Pc(133) int local133 = this.anInt2851 * ((this.aClass14_Sub1_2.anInt505 * arg3 + this.aClass14_Sub1_2.anInt500 * arg4 + this.aClass14_Sub1_2.anInt497 * arg5 >> 15) + this.aClass14_Sub1_2.anInt498) / local52;
		if (local104 < this.anInt2848 && local133 < this.anInt2848 || local104 > this.anInt2865 && local133 > this.anInt2865) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt2841 * ((this.aClass14_Sub1_2.anInt507 * arg0 + this.aClass14_Sub1_2.anInt506 * arg1 + this.aClass14_Sub1_2.anInt499 * arg2 >> 15) + this.aClass14_Sub1_2.anInt496) / local23;
			@Pc(209) int local209 = this.anInt2841 * ((this.aClass14_Sub1_2.anInt507 * arg3 + this.aClass14_Sub1_2.anInt506 * arg4 + this.aClass14_Sub1_2.anInt499 * arg5 >> 15) + this.aClass14_Sub1_2.anInt496) / local52;
			return (local180 >= this.anInt2844 || local209 >= this.anInt2844) && (local180 <= this.anInt2862 || local209 <= this.anInt2862);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!kf;II)V")
	@Override
	public void method2811(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class78_Sub1 local2 = (Class78_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray139;
		@Pc(8) int[] local8 = local2.anIntArray140;
		@Pc(20) int local20;
		if (this.anInt2859 < arg2 + local5.length) {
			local20 = this.anInt2859 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2857 > arg2) {
			local33 = this.anInt2857 - arg2;
			arg2 = this.anInt2857;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt2863;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2868 > local58) {
				local62 -= this.anInt2868 - local58;
				local58 = this.anInt2868;
			}
			if (this.anInt2854 < local58 + local62) {
				local62 = this.anInt2854 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray179[local58++] = -16777216;
			}
			local49 += this.anInt2863;
		}
	}

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()V")
	private void method2915() {
		this.aClass98_25 = new LruHashTable(20);
		this.aClass14_Sub1_2 = new Class14_Sub1();
		Static280.method4766(false);
		this.aBoolean202 = true;
		this.method2854(1);
		this.method2893(0);
		this.method2898();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2856(arg0, arg1, arg2, arg4, arg5);
		this.method2856(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method2889(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method2889(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIII)Lclient!jd;")
	@Override
	public Sprite method2884(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class13_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class13_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}
}
