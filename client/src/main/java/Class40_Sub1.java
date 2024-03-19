import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "Lclient!we;")
	private Class215 aClass215_18;

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
	public int anInt1419;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "[Lclient!na;")
	private Class134[] aClass134Array1;

	@OriginalMember(owner = "client!cs", name = "Q", descriptor = "Z")
	public boolean aBoolean91;

	@OriginalMember(owner = "client!cs", name = "R", descriptor = "I")
	public int anInt1423;

	@OriginalMember(owner = "client!cs", name = "T", descriptor = "I")
	public int anInt1425;

	@OriginalMember(owner = "client!cs", name = "W", descriptor = "I")
	public int anInt1428;

	@OriginalMember(owner = "client!cs", name = "X", descriptor = "I")
	public int anInt1429;

	@OriginalMember(owner = "client!cs", name = "Y", descriptor = "I")
	private int anInt1430;

	@OriginalMember(owner = "client!cs", name = "bb", descriptor = "I")
	public int anInt1432;

	@OriginalMember(owner = "client!cs", name = "cb", descriptor = "Lclient!ue;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!cs", name = "db", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!cs", name = "eb", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!cs", name = "gb", descriptor = "F")
	private float aFloat4;

	@OriginalMember(owner = "client!cs", name = "jb", descriptor = "I")
	public int anInt1437;

	@OriginalMember(owner = "client!cs", name = "ob", descriptor = "I")
	public int anInt1440;

	@OriginalMember(owner = "client!cs", name = "pb", descriptor = "Lclient!tm;")
	private Class1_Sub37 aClass1_Sub37_1;

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
	public int anInt1418 = 78642;

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
	public int anInt1410 = 0;

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
	private int anInt1413 = 3500;

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
	private int anInt1414 = 0;

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
	private int anInt1420 = 0;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
	public int anInt1417 = 512;

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
	public int anInt1415 = 45823;

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
	public int anInt1416 = 0;

	@OriginalMember(owner = "client!cs", name = "V", descriptor = "I")
	public int anInt1427 = 75518;

	@OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
	public int anInt1422 = 0;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!cs", name = "U", descriptor = "I")
	public int anInt1426 = 3500;

	@OriginalMember(owner = "client!cs", name = "S", descriptor = "I")
	public int anInt1424 = this.anInt1413 - 255;

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!cs", name = "fb", descriptor = "I")
	public int anInt1435 = 0;

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!cs", name = "ab", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
	public int anInt1421 = 50;

	@OriginalMember(owner = "client!cs", name = "Z", descriptor = "I")
	private int anInt1431 = 0;

	@OriginalMember(owner = "client!cs", name = "kb", descriptor = "I")
	public int anInt1438 = 0;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
	public int anInt1411 = 0;

	@OriginalMember(owner = "client!cs", name = "mb", descriptor = "I")
	public int anInt1439 = 512;

	@OriginalMember(owner = "client!cs", name = "lb", descriptor = "I")
	public int lb = 0;

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "Lclient!we;")
	private final Class215 aClass215_19 = new Class215(16);

	@OriginalMember(owner = "client!cs", name = "hb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!cs", name = "nb", descriptor = "Lclient!fl;")
	public Interface4 anInterface4_1;

	@OriginalMember(owner = "client!cs", name = "O", descriptor = "Lclient!e;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
	public int anInt1412;

	@OriginalMember(owner = "client!cs", name = "ib", descriptor = "I")
	private int anInt1436;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fl;I)V")
	public Class40_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		this.aCanvas1 = arg0;
		this.anInterface4_1 = arg1;
		super.anInt3191 = arg2;
		this.aClass53_1 = Static147.method3213(this.aCanvas1);
		this.anIntArray90 = this.aClass53_1.anIntArray536;
		this.anInt1412 = this.aClass53_1.anInt6565;
		this.anInt1436 = this.aClass53_1.anInt6564;
		this.method1227();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method2712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2720(arg0, arg1, arg2, arg4, arg5);
		this.method2720(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method2704(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method2704(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "(I)Z")
	public boolean method1225(@OriginalArg(0) int arg0) {
		return this.aBoolean90 || this.anInterface4_1.method165(arg0).aBoolean112;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
	@Override
	public void method2777() {
		this.anInt1414 = this.anInt1422;
		this.anInt1416 = -1;
		this.anInt1422 = 1583160;
		this.anInt1411 = 40;
		this.aBoolean92 = true;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)I")
	@Override
	public int method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "(I)[I")
	public int[] method1226(@OriginalArg(0) int arg0) {
		@Pc(2) Class215 local2 = this.aClass215_18;
		@Pc(12) Class1_Sub6 local12;
		synchronized (this.aClass215_18) {
			local12 = (Class1_Sub6) this.aClass215_18.method6057((long) arg0);
			if (local12 == null) {
				if (!this.anInterface4_1.method166(arg0)) {
					return null;
				}
				@Pc(32) Class50 local32 = this.anInterface4_1.method165(arg0);
				@Pc(42) int local42 = local32.aBoolean112 || this.aBoolean90 ? 64 : 128;
				local12 = new Class1_Sub6(arg0, local42, this.anInterface4_1.method169(0.7F, local42, arg0, local42, true), local32.aBoolean110);
				this.aClass215_18.method6050(local12, (long) arg0);
			}
		}
		local12.aBoolean124 = true;
		return local12.method1474();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIZ)Lclient!qa;")
	@Override
	public Class29 method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1412 + arg0;
		@Pc(16) int local16 = this.anInt1412 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray90[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class29_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class29_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "()Z")
	@Override
	public boolean method2750() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "()V")
	@Override
	public void method2710() {
		if (this.aCanvas1 == null || this.aClass53_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass53_1.method5600(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "()I")
	@Override
	public int method2758() {
		@Pc(2) int local2 = this.anInt1431;
		this.anInt1431 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class134 local3 = this.method1228(Thread.currentThread());
		@Pc(6) Class74 local6 = local3.aClass74_1;
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
		@Pc(93) int local93 = arg0 - local6.method2043();
		@Pc(98) int local98 = arg1 - local6.method2044();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt2447 = 0;
		local6.aBoolean160 = local102 < 0 || local102 > local6.anInt2451 || local106 < 0 || local106 > local6.anInt2451 || local112 < 0 || local112 > local6.anInt2451;
		local6.method2049(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean160 = local102 < 0 || local102 > local6.anInt2451 || local106 < 0 || local106 > local6.anInt2451 || local118 < 0 || local118 > local6.anInt2451;
		local6.method2049(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!n;Z)Lclient!qa;")
	@Override
	public Class29 method2722(@OriginalArg(0) Class133 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray321;
		@Pc(5) byte[] local5 = arg0.aByteArray66;
		@Pc(8) int local8 = arg0.anInt4518;
		@Pc(11) int local11 = arg0.anInt4515;
		@Pc(76) Class29_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray65 == null) {
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
			local76 = new Class29_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray65;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class29_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class29_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class29_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.method5842(arg0.anInt4519, arg0.anInt4514, arg0.anInt4516, arg0.anInt4517);
		return local76;
	}

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "()Z")
	@Override
	public boolean method2767() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!ao;)V")
	@Override
	public void method2804(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub2_1 = (Class11_Sub2) arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "()V")
	private void method1227() {
		this.aClass215_18 = new Class215(20);
		this.aClass11_Sub2_1 = new Class11_Sub2();
		Static239.method4518(false);
		this.aBoolean88 = true;
		this.method2733(1);
		this.method2727(0);
		this.method2788();
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1435 || arg1 >= this.anInt1410) {
			return;
		}
		if (arg0 < this.anInt1438) {
			arg2 -= this.anInt1438 - arg0;
			arg0 = this.anInt1438;
		}
		if (arg0 + arg2 > this.lb) {
			arg2 = this.lb - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1412;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray90[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray90[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray90[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray90[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray90[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!na;")
	public Class134 method1228(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1425; local1++) {
			if (this.aClass134Array1[local1].aRunnable1 == arg0) {
				return this.aClass134Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "()Lclient!ao;")
	@Override
	public Class11 method2801() {
		return new Class11_Sub2();
	}

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "()Z")
	@Override
	public boolean method2730() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II[[I[[IIII)Lclient!gm;")
	@Override
	public Class77 method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class77_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "(I)[I")
	private int[] method1229(@OriginalArg(0) int arg0) {
		@Pc(2) Class215 local2 = this.aClass215_18;
		@Pc(12) Class1_Sub6 local12;
		synchronized (this.aClass215_18) {
			local12 = (Class1_Sub6) this.aClass215_18.method6057((long) arg0);
			if (local12 == null) {
				if (!this.anInterface4_1.method166(arg0)) {
					return null;
				}
				@Pc(32) Class50 local32 = this.anInterface4_1.method165(arg0);
				@Pc(42) int local42 = local32.aBoolean112 || this.aBoolean90 ? 64 : 128;
				local12 = new Class1_Sub6(arg0, local42, this.anInterface4_1.method167(local42, arg0, 0.7F, local42), local32.aBoolean110);
				this.aClass215_18.method6050(local12, (long) arg0);
			}
		}
		local12.aBoolean124 = true;
		return local12.method1474();
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIII)V")
	@Override
	public void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1412) {
			arg2 = this.anInt1412;
		}
		if (arg3 > this.anInt1436) {
			arg3 = this.anInt1436;
		}
		this.anInt1438 = arg0;
		this.lb = arg2;
		this.anInt1435 = arg1;
		this.anInt1410 = arg3;
		this.method1230();
	}

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "()Z")
	@Override
	public boolean method2764() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1429 = arg0;
		this.anInt1437 = arg1;
		this.anInt1439 = arg2;
		this.anInt1417 = arg3;
		this.method1230();
	}

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "()F")
	@Override
	public float method2706() {
		return this.aFloat4;
	}

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "()V")
	@Override
	public void method2795() {
		this.anInt1422 = this.anInt1414;
		this.aBoolean92 = false;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "()V")
	private void method1230() {
		this.anInt1432 = this.anInt1438 - this.anInt1429;
		this.anInt1419 = this.lb - this.anInt1429;
		this.anInt1434 = this.anInt1435 - this.anInt1437;
		this.anInt1433 = this.anInt1410 - this.anInt1437;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1425; local29++) {
			@Pc(36) Class74 local36 = this.aClass134Array1[local29].aClass74_1;
			local36.anInt2449 = this.anInt1429 - this.anInt1438;
			local36.anInt2448 = this.anInt1437 - this.anInt1435;
			local36.anInt2451 = this.lb - this.anInt1438;
			local36.anInt2450 = this.anInt1410 - this.anInt1435;
		}
		@Pc(78) int local78 = this.anInt1435 * this.anInt1412 + this.anInt1438;
		for (@Pc(81) int local81 = this.anInt1435; local81 < this.anInt1410; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1425; local84++) {
				this.aClass134Array1[local84].aClass74_1.anIntArray154[local81 - this.anInt1435] = local78;
			}
			local78 += this.anInt1412;
		}
	}

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "()I")
	@Override
	public int method2709() {
		return 0;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(II)V")
	@Override
	public void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1422 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1422 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1422 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1422 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1422 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean91 = false;
		} else {
			this.aBoolean91 = true;
		}
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "()Z")
	@Override
	public boolean method2703() {
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "()V")
	@Override
	public void method2794() {
	}

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "()I")
	@Override
	public int method2805() {
		return this.anInt1421;
	}

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)Lclient!qm;")
	@Override
	public Class1_Sub29 method2800() {
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
	@Override
	public void method2727(@OriginalArg(0) int arg0) {
		this.aClass134Array1[arg0].method3900(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "()V")
	@Override
	public void method2738() {
		this.aClass215_18.method6060();
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1435) {
			local8 = this.anInt1435;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1410) {
			local21 = this.anInt1410;
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
				if (local91 < this.anInt1438) {
					local91 = this.anInt1438;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb) {
					local102 = this.lb;
				}
				local116 = local91 + local30 * this.anInt1412;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray90[local116++] = arg3;
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
				if (local91 < this.anInt1438) {
					local91 = this.anInt1438;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb - 1) {
					local102 = this.lb - 1;
				}
				local116 = local91 + local30 * this.anInt1412;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray90[local116++] = arg3;
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
			if (local102 < this.anInt1438) {
				local102 = this.anInt1438;
			}
			local116 = arg0 + local36;
			if (local116 > this.lb) {
				local116 = this.lb;
			}
			local118 = local102 + local30 * this.anInt1412;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray90[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray90[local118++] = local277 + local360;
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
			if (local102 < this.anInt1438) {
				local102 = this.anInt1438;
			}
			local116 = arg0 + local36;
			if (local116 > this.lb - 1) {
				local116 = this.lb - 1;
			}
			local118 = local102 + local30 * this.anInt1412;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray90[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray90[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "()V")
	@Override
	public void method2713() {
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)V")
	@Override
	public void method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1416 = arg0;
		this.anInt1422 = arg1;
		this.anInt1411 = arg2;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(F)V")
	@Override
	public void method2705(@OriginalArg(0) float arg0) {
		this.anInt1427 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!lc;)V")
	@Override
	public void method2759(@OriginalArg(0) Class117 arg0) {
		@Pc(3) Class2_Sub2 local3 = arg0.aClass148_1.aClass2_Sub2_5;
		for (@Pc(6) Class2_Sub2 local6 = local3.aClass2_Sub2_7; local6 != local3; local6 = local6.aClass2_Sub2_7) {
			@Pc(10) Class2_Sub2_Sub1 local10 = (Class2_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt6017 >> 12;
			@Pc(20) int local20 = local10.anInt6020 >> 12;
			@Pc(25) int local25 = local10.anInt6014 >> 12;
			@Pc(49) int local49 = this.aClass11_Sub2_1.anInt6494 + (this.aClass11_Sub2_1.anInt6498 * local15 + this.aClass11_Sub2_1.anInt6496 * local20 + this.aClass11_Sub2_1.anInt6495 * local25 >> 15);
			if (local49 >= this.anInt1421 && local49 <= this.anInt1413) {
				@Pc(90) int local90 = this.anInt1429 + this.anInt1439 * (this.aClass11_Sub2_1.anInt6501 + (this.aClass11_Sub2_1.anInt6492 * local15 + this.aClass11_Sub2_1.anInt6490 * local20 + this.aClass11_Sub2_1.anInt6493 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1437 + this.anInt1417 * (this.aClass11_Sub2_1.anInt6499 + (this.aClass11_Sub2_1.anInt6500 * local15 + this.aClass11_Sub2_1.anInt6491 * local20 + this.aClass11_Sub2_1.anInt6497 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1438 && local90 <= this.lb && local122 >= this.anInt1435 && local122 <= this.anInt1410) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1234(local10, local90, local122, (local10.anInt6013 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass11_Sub2_1.anInt6494 + (this.aClass11_Sub2_1.anInt6498 * arg0 + this.aClass11_Sub2_1.anInt6496 * arg1 + this.aClass11_Sub2_1.anInt6495 * arg2 >> 15);
		if (local23 < this.anInt1421 || local23 > this.anInt1413) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1439 * (this.aClass11_Sub2_1.anInt6501 + (this.aClass11_Sub2_1.anInt6492 * arg0 + this.aClass11_Sub2_1.anInt6490 * arg1 + this.aClass11_Sub2_1.anInt6493 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1417 * (this.aClass11_Sub2_1.anInt6499 + (this.aClass11_Sub2_1.anInt6500 * arg0 + this.aClass11_Sub2_1.anInt6491 * arg1 + this.aClass11_Sub2_1.anInt6497 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1432 && local73 <= this.anInt1419 && local102 >= this.anInt1434 && local102 <= this.anInt1433) {
			arg3[0] = local73 - this.anInt1432;
			arg3[1] = local102 - this.anInt1434;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "()V")
	@Override
	protected void method2702() {
		if (this.aBoolean88) {
			Static255.method4693(false);
			this.aBoolean88 = false;
		}
		this.aCanvas1 = null;
		this.anInterface4_1 = null;
		this.aClass53_1 = null;
		this.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "()Z")
	@Override
	public boolean method2719() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1438 || arg0 >= this.lb) {
			return;
		}
		if (arg1 < this.anInt1435) {
			arg2 -= this.anInt1435 - arg1;
			arg1 = this.anInt1435;
		}
		if (arg1 + arg2 > this.anInt1410) {
			arg2 = this.anInt1410 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1412;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray90[local40 + local54 * this.anInt1412] = arg3;
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
				local111 = local40 + local103 * this.anInt1412;
				local116 = this.anIntArray90[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray90[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1412;
				local111 = this.anIntArray90[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray90[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
	@Override
	public void method2715(@OriginalArg(0) boolean arg0) {
		this.aBoolean90 = arg0;
		this.aClass215_18.method6060();
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1438 < arg0) {
			this.anInt1438 = arg0;
		}
		if (this.anInt1435 < arg1) {
			this.anInt1435 = arg1;
		}
		if (this.lb > arg2) {
			this.lb = arg2;
		}
		if (this.anInt1410 > arg3) {
			this.anInt1410 = arg3;
		}
		this.method1230();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II[I[I)Lclient!sn;")
	@Override
	public Class142 method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class142_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "()V")
	@Override
	public void method2765() {
		this.aClass53_1 = Static147.method3213(this.aCanvas1);
		this.anIntArray90 = this.aClass53_1.anIntArray536;
		this.anInt1412 = this.aClass53_1.anInt6565;
		this.anInt1436 = this.aClass53_1.anInt6564;
		for (@Pc(22) int local22 = 0; local22 < this.anInt1425; local22++) {
			this.aClass134Array1[local22].method3902();
		}
		this.method2788();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIILclient!sn;II)V")
	@Override
	public void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class142 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class142_Sub1 local2 = (Class142_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray371;
		@Pc(8) int[] local8 = local2.anIntArray372;
		@Pc(17) int local17 = this.anInt1435 > arg7 ? this.anInt1435 : arg7;
		@Pc(32) int local32 = this.anInt1410 < arg7 + local5.length ? this.anInt1410 : arg7 + local5.length;
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
					if (local129 >= this.anInt1438 && local129 < this.lb && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray90[local129 + arg1 * this.anInt1412] = arg4;
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
					if (local133 >= this.anInt1438 && local133 < this.lb && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1412;
						local248 = this.anIntArray90[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray90[local133 + arg1 * this.anInt1412] = local201 + local584;
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
		if (arg0 < this.anInt1438) {
			arg1 += local83 * (this.anInt1438 - arg0);
			arg0 = this.anInt1438;
		}
		if (arg2 >= this.lb) {
			arg2 = this.lb - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray90[arg0 + local129 * this.anInt1412] = arg4;
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
					local243 = arg0 + local133 * this.anInt1412;
					local248 = this.anIntArray90[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray90[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "()Z")
	@Override
	public boolean method2785() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2734(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.method2765();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2755(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas1 == null || this.aClass53_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1412 && local21.y <= this.anInt1436 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass53_1.method5602(local21.height, local21.width, local14, local21.x, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass11_Sub2_1.anInt6498 * arg0 + this.aClass11_Sub2_1.anInt6496 * arg1 + this.aClass11_Sub2_1.anInt6495 * arg2 >> 15) + this.aClass11_Sub2_1.anInt6494;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass11_Sub2_1.anInt6498 * arg3 + this.aClass11_Sub2_1.anInt6496 * arg4 + this.aClass11_Sub2_1.anInt6495 * arg5 >> 15) + this.aClass11_Sub2_1.anInt6494;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1421 && local52 < this.anInt1421 || !(local23 <= this.anInt1413 || local52 <= this.anInt1413)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1439 * ((this.aClass11_Sub2_1.anInt6492 * arg0 + this.aClass11_Sub2_1.anInt6490 * arg1 + this.aClass11_Sub2_1.anInt6493 * arg2 >> 15) + this.aClass11_Sub2_1.anInt6501) / local23;
		@Pc(133) int local133 = this.anInt1439 * ((this.aClass11_Sub2_1.anInt6492 * arg3 + this.aClass11_Sub2_1.anInt6490 * arg4 + this.aClass11_Sub2_1.anInt6493 * arg5 >> 15) + this.aClass11_Sub2_1.anInt6501) / local52;
		if (local104 < this.anInt1432 && local133 < this.anInt1432 || local104 > this.anInt1419 && local133 > this.anInt1419) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1417 * ((this.aClass11_Sub2_1.anInt6500 * arg0 + this.aClass11_Sub2_1.anInt6491 * arg1 + this.aClass11_Sub2_1.anInt6497 * arg2 >> 15) + this.aClass11_Sub2_1.anInt6499) / local23;
			@Pc(209) int local209 = this.anInt1417 * ((this.aClass11_Sub2_1.anInt6500 * arg3 + this.aClass11_Sub2_1.anInt6491 * arg4 + this.aClass11_Sub2_1.anInt6497 * arg5 >> 15) + this.aClass11_Sub2_1.anInt6499) / local52;
			return (local180 >= this.anInt1434 || local209 >= this.anInt1434) && (local180 <= this.anInt1433 || local209 <= this.anInt1433);
		}
	}

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "()Z")
	@Override
	public boolean method2707() {
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!m;IIII)Lclient!qc;")
	@Override
	public Class86 method2762(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class86_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V")
	@Override
	public void method2733(@OriginalArg(0) int arg0) {
		if (this.anInt1425 == arg0) {
			return;
		}
		this.anInt1425 = arg0;
		this.aClass134Array1 = new Class134[this.anInt1425];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1425; local14++) {
			this.aClass134Array1[local14] = new Class134(this);
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2720(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method2720(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt1438) {
					arg1 += local104 * (this.anInt1438 - arg0);
					arg0 = this.anInt1438;
				}
				if (arg2 >= this.lb) {
					arg2 = this.lb - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1435 && local150 < this.anInt1410) {
							this.anIntArray90[arg0 + local150 * this.anInt1412] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1435 && local213 < this.anInt1410) {
							local228 = arg0 + local213 * this.anInt1412;
							local233 = this.anIntArray90[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray90[local228] = local204 + local233;
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
				if (arg1 < this.anInt1435) {
					arg0 += local104 * (this.anInt1435 - arg1);
					arg1 = this.anInt1435;
				}
				if (arg3 >= this.anInt1410) {
					arg3 = this.anInt1410 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1438 && local150 < this.lb) {
							this.anIntArray90[local150 + arg1 * this.anInt1412] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1438 && local213 < this.lb) {
							local228 = local213 + arg1 * this.anInt1412;
							local233 = this.anIntArray90[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray90[local213 + arg1 * this.anInt1412] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method2704(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method2704(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!j;Lclient!j;FLclient!j;)Lclient!j;")
	@Override
	public Class94 method2728(@OriginalArg(0) Class94 arg0, @OriginalArg(1) Class94 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class94 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "()V")
	@Override
	public void method2786() {
	}

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "(I)Z")
	public boolean method1231(@OriginalArg(0) int arg0) {
		return this.anInterface4_1.method166(arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1412;
		@Pc(35) int local35 = this.anInt1412 - arg2;
		if (arg1 + arg3 > this.anInt1410) {
			arg3 -= arg1 + arg3 - this.anInt1410;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1435) {
			local59 = this.anInt1435 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1412;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.lb) {
			local59 = arg0 + arg2 - this.lb;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1438) {
			local59 = this.anInt1438 - arg0;
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
						this.anIntArray90[local30++] = arg4;
					} else {
						this.anIntArray90[local30++] = arg5;
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
					local245 = this.anIntArray90[local30];
					this.anIntArray90[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray90[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray90[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "(I)I")
	public int method1232(@OriginalArg(0) int arg0) {
		return this.anInterface4_1.method165(arg0).aShort27 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "()Z")
	public boolean method1233() {
		return this.aBoolean89;
	}

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "()Z")
	@Override
	public boolean method2789() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "(I)V")
	@Override
	public void method2773(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1430;
		for (@Pc(9) Object local9 = this.aClass215_18.method6054(); local9 != null; local9 = this.aClass215_18.method6061()) {
			@Pc(13) Class1_Sub6 local13 = (Class1_Sub6) local9;
			if (local13.aBoolean124) {
				local13.anInt1719 += local4;
				@Pc(27) int local27 = local13.anInt1719 / 20;
				if (local27 > 0) {
					@Pc(36) Class50 local36 = this.anInterface4_1.method165(local13.anInt1720);
					local13.method1472(local36.aByte19 * local4 * 50 / 1000, local36.aByte16 * local4 * 50 / 1000);
					local13.anInt1719 -= local27 * 20;
				}
				local13.aBoolean124 = false;
			}
		}
		this.anInt1430 = arg0;
		this.aClass215_19.method6063(5);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1438) {
			arg2 -= this.anInt1438 - arg0;
			arg0 = this.anInt1438;
		}
		if (arg1 < this.anInt1435) {
			arg3 -= this.anInt1435 - arg1;
			arg1 = this.anInt1435;
		}
		if (arg0 + arg2 > this.lb) {
			arg2 = this.lb - arg0;
		}
		if (arg1 + arg3 > this.anInt1410) {
			arg3 = this.anInt1410 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.lb || arg1 > this.anInt1410) {
			return;
		}
		@Pc(67) int local67 = this.anInt1412 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1412;
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
						local221 = this.anIntArray90[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray90[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray90[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray90[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray90[arg2] = arg4;
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray90[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!j;)V")
	@Override
	public void method2716(@OriginalArg(0) Class94 arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([I)V")
	@Override
	public void method2772(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1438;
		arg0[1] = this.anInt1435;
		arg0[2] = this.lb;
		arg0[3] = this.anInt1410;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V")
	@Override
	public void method2729(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!fi;[Lclient!n;Z)Lclient!dr;")
	@Override
	public Class30 method2768(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class133[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4518;
			local7[local11] = arg1[local11].anInt4515;
			if (arg1[local11].aByteArray65 != null) {
			}
		}
		return new Class30_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "()I")
	@Override
	public int method2779() {
		@Pc(2) int local2 = this.anInt1420;
		this.anInt1420 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "()Z")
	@Override
	public boolean method2799() {
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "()V")
	@Override
	public void method2726() {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!ea;III)V")
	public void method1234(@OriginalArg(0) Class2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt6010;
		if (local6 == -1) {
			this.method2751(arg1, arg2, local3, arg0.anInt6016);
			return;
		}
		if (this.aClass1_Sub37_1 == null || this.aClass1_Sub37_1.aLong235 != (long) local6) {
			this.aClass1_Sub37_1 = (Class1_Sub37) this.aClass215_19.method6057((long) local6);
		}
		if (this.aClass1_Sub37_1 == null) {
			@Pc(44) int[] local44 = this.method1229(local6);
			if (local44 == null) {
				return;
			}
			this.aClass1_Sub37_1 = new Class1_Sub37();
			this.aClass1_Sub37_1.aBoolean457 = this.method1225(local6);
			@Pc(65) int local65 = this.aClass1_Sub37_1.aBoolean457 ? 64 : 128;
			this.aClass1_Sub37_1.aClass29_18 = this.method2791(local44, local65, local65, local65);
			this.aClass215_19.method6050(this.aClass1_Sub37_1, (long) local6);
		}
		if (this.aClass1_Sub37_1.aBoolean457) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass1_Sub37_1.aClass29_18.method5835(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt6016, 1);
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "()Lclient!ao;")
	@Override
	public Class11 method2782() {
		@Pc(3) Class134 local3 = this.method1228(Thread.currentThread());
		return local3.aClass11_Sub2_2;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([Lclient!qc;Lclient!ao;[Lclient!np;I)V")
	@Override
	public void method2740(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class2_Sub6[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class86_Sub2[] local3 = new Class86_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class86_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class86_Sub2 local26 = Static317.method5591(this, local3);
		local26.method5585(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "()V")
	@Override
	public void method2788() {
		this.anInt1438 = 0;
		this.anInt1435 = 0;
		this.lb = this.anInt1412;
		this.anInt1410 = this.anInt1436;
		this.method1230();
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(IIIIII)Lclient!j;")
	@Override
	public Class94 method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(II)V")
	@Override
	public void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1421 = arg0;
		this.anInt1413 = arg1;
		this.anInt1424 = this.anInt1413 - 255;
		this.method1236();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!qc;Lclient!lc;Lclient!ao;Lclient!np;I)V")
	@Override
	public void method2748(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class2_Sub6 arg3) {
		((Class86_Sub2) arg0).method5585(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "()Z")
	@Override
	public boolean method2757() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "(I)Z")
	public boolean method1235(@OriginalArg(0) int arg0) {
		return this.anInterface4_1.method165(arg0).aBoolean109;
	}

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "()Z")
	@Override
	public boolean method2760() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method2718() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt1412;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray90[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "()Z")
	@Override
	public boolean method2714() {
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)V")
	@Override
	public void method2735(@OriginalArg(0) int arg0) {
		this.method2717(0, 0, this.anInt1412, this.anInt1436, arg0, 0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[Lclient!fe;)V")
	@Override
	public void method2761(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9[] arg1) {
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	@Override
	public void method2731(@OriginalArg(0) int arg0) {
		this.aClass134Array1[arg0].method3900(null);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([IIIII)Lclient!qa;")
	@Override
	public Class29 method2791(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class29_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class29_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class29_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class29_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "()I")
	@Override
	public int method2708() {
		return this.anInt1413;
	}

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "()I")
	@Override
	public int method2793() {
		return 0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
	@Override
	public int method2747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "()V")
	private void method1236() {
		if (this.aFloat3 == 0.0F) {
			this.anInt1426 = this.anInt1413;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1413;
		@Pc(12) float local12 = (float) this.anInt1421;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat4 / (this.aFloat3 + this.aFloat4);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat3;
		this.anInt1426 = (int) (((float) this.anInt1413 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2763() {
		@Pc(3) Class134 local3 = this.method1228(Thread.currentThread());
		@Pc(6) Class74 local6 = local3.aClass74_1;
		local6.aBoolean161 = false;
		local6.aBoolean161 = false;
		local6.anInt2447 = 0;
		local6.aBoolean160 = true;
		local6.method2056(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "()Z")
	@Override
	public boolean method2803() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "()Z")
	@Override
	public boolean method2741() {
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!qm;)V")
	@Override
	public void method2775(@OriginalArg(0) Class1_Sub29 arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1415 = (int) (arg1 * 65535.0F);
		this.anInt1418 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1428 = (int) (arg3 * 65535.0F / local26);
		this.anInt1440 = (int) (arg4 * 65535.0F / local26);
		this.anInt1423 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "()F")
	@Override
	public float method2783() {
		return this.aFloat3;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(FF)V")
	@Override
	public void method2796(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat4 = arg0;
		this.aFloat3 = arg1;
		this.method1236();
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)V")
	@Override
	public void method2721(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!sn;II)V")
	@Override
	public void method2736(@OriginalArg(1) Class142 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class142_Sub1 local2 = (Class142_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray371;
		@Pc(8) int[] local8 = local2.anIntArray372;
		@Pc(20) int local20;
		if (this.anInt1410 < arg2 + local5.length) {
			local20 = this.anInt1410 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1435 > arg2) {
			local33 = this.anInt1435 - arg2;
			arg2 = this.anInt1435;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt1412;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1438 > local58) {
				local62 -= this.anInt1438 - local58;
				local58 = this.anInt1438;
			}
			if (this.lb < local58 + local62) {
				local62 = this.lb - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray90[local58++] = -16777216;
			}
			local49 += this.anInt1412;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "([Lclient!qc;Lclient!lc;Lclient!ao;[Lclient!np;I)V")
	@Override
	public void method2778(@OriginalArg(0) Class86[] arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class2_Sub6[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class86_Sub2[] local3 = new Class86_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class86_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class86_Sub2 local26 = Static317.method5591(this, local3);
		local26.method5585(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}
}
