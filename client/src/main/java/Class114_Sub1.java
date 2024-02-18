import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!eu", name = "sc", descriptor = "I")
	private int anInt2701;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	private int anInt2708;

	@OriginalMember(owner = "client!eu", name = "X", descriptor = "Lclient!tq;")
	private Class359 aClass359_1;

	@OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
	private int anInt2716;

	@OriginalMember(owner = "client!eu", name = "rc", descriptor = "I")
	private int anInt2720;

	@OriginalMember(owner = "client!eu", name = "cb", descriptor = "Lclient!ufa;")
	private Class371 aClass371_1;

	@OriginalMember(owner = "client!eu", name = "xb", descriptor = "I")
	private int anInt2723;

	@OriginalMember(owner = "client!eu", name = "Ac", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "Lclient!ufa;")
	private Class371 aClass371_2;

	@OriginalMember(owner = "client!eu", name = "hb", descriptor = "Lclient!ufa;")
	private Class371 aClass371_3;

	@OriginalMember(owner = "client!eu", name = "Hb", descriptor = "Lclient!qv;")
	private Class313 aClass313_1;

	@OriginalMember(owner = "client!eu", name = "zc", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!eu", name = "Hc", descriptor = "I")
	private int anInt2756;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
	private int anInt2758;

	@OriginalMember(owner = "client!eu", name = "Cb", descriptor = "I")
	private int anInt2759;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!eu", name = "W", descriptor = "I")
	private int anInt2765;

	@OriginalMember(owner = "client!eu", name = "Ib", descriptor = "I")
	private int anInt2768;

	@OriginalMember(owner = "client!eu", name = "db", descriptor = "Lclient!ufa;")
	private Class371 aClass371_4;

	@OriginalMember(owner = "client!eu", name = "Kb", descriptor = "I")
	private int anInt2771;

	@OriginalMember(owner = "client!eu", name = "kc", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_6;

	@OriginalMember(owner = "client!eu", name = "vb", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
	private int anInt2715;

	@OriginalMember(owner = "client!eu", name = "Jc", descriptor = "I")
	private int anInt2745;

	@OriginalMember(owner = "client!eu", name = "ob", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!eu", name = "ac", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!eu", name = "Gc", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!eu", name = "gc", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
	private int anInt2773;

	@OriginalMember(owner = "client!eu", name = "fc", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!eu", name = "Nb", descriptor = "[Lclient!mn;")
	private Class249[] aClass249Array2;

	@OriginalMember(owner = "client!eu", name = "wb", descriptor = "[Lclient!rv;")
	private Class328[] aClass328Array2;

	@OriginalMember(owner = "client!eu", name = "Cc", descriptor = "I")
	private int anInt2713;

	@OriginalMember(owner = "client!eu", name = "tb", descriptor = "[Lclient!ala;")
	private Class18[] aClass18Array1;

	@OriginalMember(owner = "client!eu", name = "N", descriptor = "[Lclient!pr;")
	private Class298[] aClass298Array1;

	@OriginalMember(owner = "client!eu", name = "eb", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!eu", name = "R", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!eu", name = "I", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!eu", name = "yc", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!eu", name = "Sb", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!eu", name = "pb", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!eu", name = "P", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!eu", name = "kb", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!eu", name = "V", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!eu", name = "lb", descriptor = "[F")
	private float[] lb;

	@OriginalMember(owner = "client!eu", name = "Yb", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!eu", name = "fb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!eu", name = "Db", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!eu", name = "Jb", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!eu", name = "Mc", descriptor = "[F")
	private float[] aFloatArray18;

	@OriginalMember(owner = "client!eu", name = "Bc", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!eu", name = "Wb", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!eu", name = "S", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!eu", name = "zb", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!eu", name = "Lc", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!eu", name = "Tb", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!eu", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!am;Lclient!dv;IIII)V")
	public Class114_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_10;
		@Pc(15) int[] local15 = new int[arg1.anInt2362];
		this.anIntArray243 = new int[arg1.anInt2363 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2362; local24++) {
			if (arg1.aByteArray25 == null || arg1.aByteArray25[local24] != 2) {
				if (arg1.aShortArray25 != null && arg1.aShortArray25[local24] != -1) {
					@Pc(65) Class118 local65 = local11.method6817(arg1.aShortArray25[local24] & 0xFFFF);
					if (((this.anInt2765 & 0x40) == 0 || !local65.aBoolean240) && local65.aBoolean234) {
						continue;
					}
				}
				local15[this.anInt2715++] = local24;
				this.anIntArray243[arg1.aShortArray27[local24]]++;
				this.anIntArray243[arg1.aShortArray24[local24]]++;
				this.anIntArray243[arg1.aShortArray26[local24]]++;
			}
		}
		this.anInt2745 = this.anInt2715;
		@Pc(145) long[] local145 = new long[this.anInt2715];
		@Pc(157) boolean local157 = (this.anInt2756 & 0x100) != 0;
		@Pc(171) int local171;
		@Pc(184) int local184;
		@Pc(375) int local375;
		for (@Pc(159) int local159 = 0; local159 < this.anInt2715; local159++) {
			@Pc(167) int local167 = local15[local159];
			@Pc(169) Class118 local169 = null;
			local171 = 0;
			@Pc(173) byte local173 = 0;
			@Pc(175) byte local175 = 0;
			@Pc(177) byte local177 = 0;
			if (arg1.aClass24Array1 != null) {
				@Pc(182) boolean local182 = false;
				for (local184 = 0; local184 < arg1.aClass24Array1.length; local184++) {
					@Pc(191) Class24 local191 = arg1.aClass24Array1[local184];
					if (local191.anInt588 == local167) {
						@Pc(204) Class376 local204 = Static402.method5582(local191.anInt592);
						if (local204.aBoolean747) {
							local182 = true;
						}
						if (local204.anInt9693 != -1) {
							@Pc(220) Class118 local220 = local11.method6817(local204.anInt9693);
							if (local220.anInt2796 == 2) {
								this.aBoolean228 = true;
							}
						}
					}
				}
				if (local182) {
					local145[local159] = Long.MAX_VALUE;
					this.anInt2745--;
					continue;
				}
			}
			@Pc(257) short local257 = -1;
			if (arg1.aShortArray25 != null) {
				local257 = arg1.aShortArray25[local167];
				if (local257 != -1) {
					local169 = local11.method6817(local257 & 0xFFFF);
					if ((this.anInt2765 & 0x40) != 0 && local169.aBoolean240) {
						local257 = -1;
						local169 = null;
					} else {
						local177 = local169.aByte55;
						local175 = local169.aByte56;
					}
				}
			}
			@Pc(327) boolean local327 = arg1.aByteArray29 != null && arg1.aByteArray29[local167] != 0 || local169 != null && local169.anInt2796 != 0;
			if ((local157 || local327) && arg1.aByteArray26 != null) {
				local171 += arg1.aByteArray26[local167] << 17;
			}
			if (local327) {
				local171 += 65536;
			}
			local171 += (local175 & 0xFF) << 8;
			local171 += local177 & 0xFF;
			local375 = local173 + ((local257 & 0xFFFF) << 16);
			@Pc(381) int local381 = local375 + (local159 & 0xFFFF);
			local145[local159] = ((long) local171 << 32) + (long) local381;
			this.aBoolean228 |= local327;
			this.aBoolean230 |= local169 != null && (local169.aByte54 != 0 || local169.aByte52 != 0);
		}
		Static15.method187(local145, local15);
		this.anIntArray240 = arg1.anIntArray213;
		this.anInt2767 = arg1.anInt2372;
		this.anIntArray244 = arg1.anIntArray204;
		this.anInt2773 = arg1.anInt2363;
		this.anIntArray242 = arg1.anIntArray205;
		this.aShortArray41 = arg1.aShortArray23;
		this.aClass249Array2 = arg1.aClass249Array1;
		@Pc(470) Class368[] local470 = new Class368[this.anInt2773];
		this.aClass328Array2 = arg1.aClass328Array1;
		@Pc(494) int local494;
		@Pc(510) int local510;
		@Pc(566) int local566;
		if (arg1.aClass24Array1 != null) {
			this.anInt2713 = arg1.aClass24Array1.length;
			this.aClass18Array1 = new Class18[this.anInt2713];
			this.aClass298Array1 = new Class298[this.anInt2713];
			for (local494 = 0; local494 < this.anInt2713; local494++) {
				@Pc(503) Class24 local503 = arg1.aClass24Array1[local494];
				@Pc(508) Class376 local508 = Static402.method5582(local503.anInt592);
				local510 = -1;
				for (@Pc(512) int local512 = 0; local512 < this.anInt2715; local512++) {
					if (local503.anInt588 == local15[local512]) {
						local510 = local512;
						break;
					}
				}
				if (local510 == -1) {
					throw new RuntimeException();
				}
				local566 = Static154.anIntArray237[arg1.aShortArray22[local503.anInt588] & 0xFFFF] & 0xFFFFFF;
				@Pc(585) int local585 = local566 | 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local503.anInt588]) << 24;
				this.aClass298Array1[local494] = new Class298(local510, arg1.aShortArray27[local503.anInt588], arg1.aShortArray24[local503.anInt588], arg1.aShortArray26[local503.anInt588], local508.anInt9696, local508.anInt9690, local508.anInt9693, local508.anInt9697, local508.anInt9689, local508.aBoolean747, local508.aBoolean748, local503.anInt591);
				this.aClass18Array1[local494] = new Class18(local585);
			}
		}
		local494 = this.anInt2715 * 3;
		this.aShortArray47 = new short[local494];
		this.aShortArray46 = new short[this.anInt2715];
		this.aShortArray40 = new short[this.anInt2715];
		this.aShortArray49 = new short[local494];
		this.aShortArray42 = new short[local494];
		this.aShort35 = (short) arg4;
		this.aShortArray50 = new short[local494];
		Static381.aLongArray10 = new long[local494];
		this.aShortArray48 = new short[local494];
		this.aShortArray43 = new short[this.anInt2715];
		this.aByteArray33 = new byte[this.anInt2715];
		this.lb = new float[local494];
		this.aShortArray51 = new short[this.anInt2715];
		this.aShortArray39 = new short[local494];
		this.aShort36 = (short) arg3;
		this.aShortArray44 = new short[this.anInt2715];
		this.aFloatArray18 = new float[local494];
		this.aByteArray32 = new byte[local494];
		if (arg1.aShortArray20 != null) {
			this.aShortArray45 = new short[this.anInt2715];
		}
		local171 = 0;
		for (local375 = 0; local375 < arg1.anInt2363; local375++) {
			local510 = this.anIntArray243[local375];
			this.anIntArray243[local375] = local171;
			local470[local375] = new Class368();
			local171 += local510;
		}
		this.anIntArray243[arg1.anInt2363] = local171;
		@Pc(783) Class369 local783 = Static50.method6635(arg1, this.anInt2715, local15);
		@Pc(787) Class252[] local787 = new Class252[arg1.anInt2362];
		@Pc(830) int local830;
		@Pc(841) int local841;
		@Pc(852) int local852;
		@Pc(808) short local808;
		@Pc(819) int local819;
		for (local566 = 0; local566 < arg1.anInt2362; local566++) {
			@Pc(798) short local798 = arg1.aShortArray27[local566];
			@Pc(803) short local803 = arg1.aShortArray24[local566];
			local808 = arg1.aShortArray26[local566];
			local819 = this.anIntArray240[local803] - this.anIntArray240[local798];
			local830 = this.anIntArray242[local803] - this.anIntArray242[local798];
			local841 = this.anIntArray244[local803] - this.anIntArray244[local798];
			local852 = this.anIntArray240[local808] - this.anIntArray240[local798];
			@Pc(863) int local863 = this.anIntArray242[local808] - this.anIntArray242[local798];
			@Pc(873) int local873 = this.anIntArray244[local808] - this.anIntArray244[local798];
			@Pc(882) int local882 = local873 * local830 - local863 * local841;
			@Pc(891) int local891 = local852 * local841 - local873 * local819;
			@Pc(899) int local899 = local863 * local819 - local852 * local830;
			while (local882 > 8192 || local891 > 8192 || local899 > 8192 || local882 < -8192 || local891 < -8192 || local899 < -8192) {
				local882 >>= 0x1;
				local899 >>= 0x1;
				local891 >>= 0x1;
			}
			@Pc(957) int local957 = (int) Math.sqrt((double) (local891 * local891 + local882 * local882 + local899 * local899));
			if (local957 <= 0) {
				local957 = 1;
			}
			local899 = local899 * 256 / local957;
			local882 = local882 * 256 / local957;
			local891 = local891 * 256 / local957;
			@Pc(990) byte local990 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local566];
			if (local990 == 0) {
				@Pc(999) Class368 local999 = local470[local798];
				local999.anInt9597++;
				local999.anInt9595 += local891;
				local999.anInt9594 += local882;
				local999.anInt9596 += local899;
				@Pc(1027) Class368 local1027 = local470[local803];
				local1027.anInt9595 += local891;
				local1027.anInt9596 += local899;
				local1027.anInt9597++;
				local1027.anInt9594 += local882;
				@Pc(1055) Class368 local1055 = local470[local808];
				local1055.anInt9596 += local899;
				local1055.anInt9595 += local891;
				local1055.anInt9597++;
				local1055.anInt9594 += local882;
			} else if (local990 == 1) {
				@Pc(1094) Class252 local1094 = local787[local566] = new Class252();
				local1094.anInt6320 = local882;
				local1094.anInt6319 = local891;
				local1094.anInt6321 = local899;
			}
		}
		@Pc(1120) int local1120;
		@Pc(1164) short local1164;
		for (local184 = 0; local184 < this.anInt2715; local184++) {
			local1120 = local15[local184];
			@Pc(1127) int local1127 = arg1.aShortArray22[local1120] & 0xFFFF;
			if (arg1.aByteArray28 == null) {
				local819 = -1;
			} else {
				local819 = arg1.aByteArray28[local1120];
			}
			if (arg1.aByteArray29 == null) {
				local830 = 0;
			} else {
				local830 = arg1.aByteArray29[local1120] & 0xFF;
			}
			local1164 = arg1.aShortArray25 == null ? -1 : arg1.aShortArray25[local1120];
			if (local1164 != -1 && (this.anInt2765 & 0x40) != 0) {
				@Pc(1181) Class118 local1181 = local11.method6817(local1164 & 0xFFFF);
				if (local1181.aBoolean240) {
					local1164 = -1;
				}
			}
			@Pc(1188) float local1188 = 0.0F;
			@Pc(1190) float local1190 = 0.0F;
			@Pc(1192) float local1192 = 0.0F;
			@Pc(1194) float local1194 = 0.0F;
			@Pc(1196) float local1196 = 0.0F;
			@Pc(1198) float local1198 = 0.0F;
			@Pc(1200) byte local1200 = 0;
			@Pc(1202) byte local1202 = 0;
			@Pc(1204) int local1204 = 0;
			@Pc(1221) byte local1221;
			@Pc(1241) short local1241;
			@Pc(1246) short local1246;
			@Pc(1251) short local1251;
			if (local1164 != -1) {
				if (local819 == -1) {
					local1192 = 1.0F;
					local1198 = 0.0F;
					local1202 = 2;
					local1196 = 0.0F;
					local1194 = 1.0F;
					local1190 = 1.0F;
					local1188 = 0.0F;
					local1200 = 1;
				} else {
					local819 &= 0xFF;
					local1221 = arg1.aByteArray24[local819];
					@Pc(1231) short local1231;
					@Pc(1236) short local1236;
					@Pc(1274) float local1274;
					@Pc(1283) float local1283;
					@Pc(1292) float local1292;
					@Pc(1378) float local1378;
					@Pc(1386) float local1386;
					@Pc(1395) float local1395;
					@Pc(1403) float local1403;
					@Pc(1412) float local1412;
					@Pc(1420) float local1420;
					if (local1221 == 0) {
						local1231 = arg1.aShortArray27[local1120];
						local1236 = arg1.aShortArray24[local1120];
						local1241 = arg1.aShortArray26[local1120];
						local1246 = arg1.aShortArray29[local819];
						local1251 = arg1.aShortArray21[local819];
						@Pc(1256) short local1256 = arg1.aShortArray28[local819];
						@Pc(1262) float local1262 = (float) arg1.anIntArray213[local1246];
						@Pc(1268) float local1268 = (float) arg1.anIntArray205[local1246];
						local1274 = (float) arg1.anIntArray204[local1246];
						local1283 = (float) arg1.anIntArray213[local1251] - local1262;
						local1292 = (float) arg1.anIntArray205[local1251] - local1268;
						@Pc(1300) float local1300 = (float) arg1.anIntArray204[local1251] - local1274;
						@Pc(1308) float local1308 = (float) arg1.anIntArray213[local1256] - local1262;
						@Pc(1317) float local1317 = (float) arg1.anIntArray205[local1256] - local1268;
						@Pc(1326) float local1326 = (float) arg1.anIntArray204[local1256] - local1274;
						@Pc(1334) float local1334 = (float) arg1.anIntArray213[local1231] - local1262;
						@Pc(1343) float local1343 = (float) arg1.anIntArray205[local1231] - local1268;
						@Pc(1352) float local1352 = (float) arg1.anIntArray204[local1231] - local1274;
						@Pc(1361) float local1361 = (float) arg1.anIntArray213[local1236] - local1262;
						@Pc(1369) float local1369 = (float) arg1.anIntArray205[local1236] - local1268;
						local1378 = (float) arg1.anIntArray204[local1236] - local1274;
						local1386 = (float) arg1.anIntArray213[local1241] - local1262;
						local1395 = (float) arg1.anIntArray205[local1241] - local1268;
						local1403 = (float) arg1.anIntArray204[local1241] - local1274;
						local1412 = local1326 * local1292 - local1317 * local1300;
						local1420 = local1308 * local1300 - local1326 * local1283;
						@Pc(1429) float local1429 = local1283 * local1317 - local1308 * local1292;
						@Pc(1437) float local1437 = local1317 * local1429 - local1326 * local1420;
						@Pc(1445) float local1445 = local1412 * local1326 - local1308 * local1429;
						@Pc(1453) float local1453 = local1308 * local1420 - local1412 * local1317;
						@Pc(1467) float local1467 = 1.0F / (local1453 * local1300 + local1283 * local1437 + local1292 * local1445);
						local1196 = local1467 * (local1386 * local1437 + local1395 * local1445 + local1453 * local1403);
						local1188 = local1467 * (local1445 * local1343 + local1334 * local1437 + local1352 * local1453);
						local1192 = (local1445 * local1369 + local1361 * local1437 + local1453 * local1378) * local1467;
						@Pc(1517) float local1517 = local1283 * local1420 - local1292 * local1412;
						@Pc(1525) float local1525 = local1412 * local1300 - local1429 * local1283;
						@Pc(1533) float local1533 = local1429 * local1292 - local1420 * local1300;
						@Pc(1547) float local1547 = 1.0F / (local1517 * local1326 + local1317 * local1525 + local1308 * local1533);
						local1198 = (local1403 * local1517 + local1386 * local1533 + local1395 * local1525) * local1547;
						local1194 = (local1517 * local1378 + local1533 * local1361 + local1369 * local1525) * local1547;
						local1190 = local1547 * (local1525 * local1343 + local1533 * local1334 + local1352 * local1517);
					} else {
						local1231 = arg1.aShortArray27[local1120];
						local1236 = arg1.aShortArray24[local1120];
						local1241 = arg1.aShortArray26[local1120];
						@Pc(1611) int local1611 = local783.anIntArray750[local819];
						@Pc(1616) int local1616 = local783.anIntArray751[local819];
						@Pc(1621) int local1621 = local783.anIntArray749[local819];
						@Pc(1626) float[] local1626 = local783.aFloatArrayArray19[local819];
						@Pc(1631) byte local1631 = arg1.aByteArray23[local819];
						local1274 = (float) arg1.anIntArray214[local819] / 256.0F;
						if (local1221 == 1) {
							local1283 = (float) arg1.anIntArray208[local819] / 1024.0F;
							Static89.method1715(local1626, local1274, local1621, arg1.anIntArray213[local1231], local1631, Static346.aFloatArray40, local1283, local1616, arg1.anIntArray205[local1231], arg1.anIntArray204[local1231], local1611);
							local1188 = Static346.aFloatArray40[0];
							local1190 = Static346.aFloatArray40[1];
							Static89.method1715(local1626, local1274, local1621, arg1.anIntArray213[local1236], local1631, Static346.aFloatArray40, local1283, local1616, arg1.anIntArray205[local1236], arg1.anIntArray204[local1236], local1611);
							local1192 = Static346.aFloatArray40[0];
							local1194 = Static346.aFloatArray40[1];
							Static89.method1715(local1626, local1274, local1621, arg1.anIntArray213[local1241], local1631, Static346.aFloatArray40, local1283, local1616, arg1.anIntArray205[local1241], arg1.anIntArray204[local1241], local1611);
							local1196 = Static346.aFloatArray40[0];
							local1198 = Static346.aFloatArray40[1];
							local1292 = local1283 / 2.0F;
							if ((local1631 & 0x1) == 0) {
								if (local1292 < local1192 - local1188) {
									local1200 = 1;
									local1192 -= local1283;
								} else if (local1188 - local1192 > local1292) {
									local1200 = 2;
									local1192 += local1283;
								}
								if (local1196 - local1188 > local1292) {
									local1202 = 1;
									local1196 -= local1283;
								} else if (local1292 < local1188 - local1196) {
									local1196 += local1283;
									local1202 = 2;
								}
							} else {
								if (local1198 - local1190 > local1292) {
									local1202 = 1;
									local1198 -= local1283;
								} else if (local1292 < local1190 - local1198) {
									local1202 = 2;
									local1198 += local1283;
								}
								if (local1292 < local1194 - local1190) {
									local1200 = 1;
									local1194 -= local1283;
								} else if (local1292 < local1190 - local1194) {
									local1194 += local1283;
									local1200 = 2;
								}
							}
						} else if (local1221 == 2) {
							local1283 = (float) arg1.anIntArray212[local819] / 256.0F;
							local1292 = (float) arg1.anIntArray206[local819] / 256.0F;
							@Pc(1909) int local1909 = arg1.anIntArray213[local1236] - arg1.anIntArray213[local1231];
							@Pc(1920) int local1920 = arg1.anIntArray205[local1236] - arg1.anIntArray205[local1231];
							@Pc(1931) int local1931 = arg1.anIntArray204[local1236] - arg1.anIntArray204[local1231];
							@Pc(1942) int local1942 = arg1.anIntArray213[local1241] - arg1.anIntArray213[local1231];
							@Pc(1952) int local1952 = arg1.anIntArray205[local1241] - arg1.anIntArray205[local1231];
							@Pc(1962) int local1962 = arg1.anIntArray204[local1241] - arg1.anIntArray204[local1231];
							@Pc(1971) int local1971 = local1962 * local1920 - local1952 * local1931;
							@Pc(1979) int local1979 = local1931 * local1942 - local1909 * local1962;
							@Pc(1987) int local1987 = local1909 * local1952 - local1920 * local1942;
							local1378 = 64.0F / (float) arg1.anIntArray211[local819];
							local1386 = 64.0F / (float) arg1.anIntArray207[local819];
							local1395 = 64.0F / (float) arg1.anIntArray208[local819];
							local1403 = (local1626[1] * (float) local1979 + local1626[0] * (float) local1971 + (float) local1987 * local1626[2]) / local1378;
							local1412 = ((float) local1979 * local1626[4] + local1626[3] * (float) local1971 + local1626[5] * (float) local1987) / local1386;
							local1420 = ((float) local1987 * local1626[8] + (float) local1971 * local1626[6] + (float) local1979 * local1626[7]) / local1395;
							local1204 = Static161.method2589(local1420, local1403, local1412);
							Static57.method1224(local1274, local1204, arg1.anIntArray213[local1231], local1283, local1616, Static346.aFloatArray40, arg1.anIntArray205[local1231], arg1.anIntArray204[local1231], local1611, local1621, local1292, local1626, local1631);
							local1188 = Static346.aFloatArray40[0];
							local1190 = Static346.aFloatArray40[1];
							Static57.method1224(local1274, local1204, arg1.anIntArray213[local1236], local1283, local1616, Static346.aFloatArray40, arg1.anIntArray205[local1236], arg1.anIntArray204[local1236], local1611, local1621, local1292, local1626, local1631);
							local1192 = Static346.aFloatArray40[0];
							local1194 = Static346.aFloatArray40[1];
							Static57.method1224(local1274, local1204, arg1.anIntArray213[local1241], local1283, local1616, Static346.aFloatArray40, arg1.anIntArray205[local1241], arg1.anIntArray204[local1241], local1611, local1621, local1292, local1626, local1631);
							local1196 = Static346.aFloatArray40[0];
							local1198 = Static346.aFloatArray40[1];
						} else if (local1221 == 3) {
							Static397.method5556(local1611, arg1.anIntArray204[local1231], arg1.anIntArray205[local1231], Static346.aFloatArray40, local1621, local1274, local1626, local1631, arg1.anIntArray213[local1231], local1616);
							local1188 = Static346.aFloatArray40[0];
							local1190 = Static346.aFloatArray40[1];
							Static397.method5556(local1611, arg1.anIntArray204[local1236], arg1.anIntArray205[local1236], Static346.aFloatArray40, local1621, local1274, local1626, local1631, arg1.anIntArray213[local1236], local1616);
							local1192 = Static346.aFloatArray40[0];
							local1194 = Static346.aFloatArray40[1];
							Static397.method5556(local1611, arg1.anIntArray204[local1241], arg1.anIntArray205[local1241], Static346.aFloatArray40, local1621, local1274, local1626, local1631, arg1.anIntArray213[local1241], local1616);
							local1198 = Static346.aFloatArray40[1];
							local1196 = Static346.aFloatArray40[0];
							if ((local1631 & 0x1) == 0) {
								if (local1196 - local1188 > 0.5F) {
									local1202 = 1;
									local1196--;
								} else if (local1188 - local1196 > 0.5F) {
									local1202 = 2;
									local1196++;
								}
								if (local1192 - local1188 > 0.5F) {
									local1200 = 1;
									local1192--;
								} else if (local1188 - local1192 > 0.5F) {
									local1200 = 2;
									local1192++;
								}
							} else {
								if (local1198 - local1190 > 0.5F) {
									local1202 = 1;
									local1198--;
								} else if (local1190 - local1198 > 0.5F) {
									local1198++;
									local1202 = 2;
								}
								if (local1194 - local1190 > 0.5F) {
									local1200 = 1;
									local1194--;
								} else if (local1190 - local1194 > 0.5F) {
									local1200 = 2;
									local1194++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1221 = 0;
			} else {
				local1221 = arg1.aByteArray25[local1120];
			}
			if (local1221 == 0) {
				@Pc(2456) long local2456 = ((long) local830 + (long) (local1204 << 24) + (long) (local1127 << 8) << 32) + (long) (local819 << 2);
				local1241 = arg1.aShortArray27[local1120];
				local1246 = arg1.aShortArray24[local1120];
				local1251 = arg1.aShortArray26[local1120];
				@Pc(2475) Class368 local2475 = local470[local1241];
				this.aShortArray43[local184] = this.method2555(local2475.anInt9596, local2475.anInt9597, local1188, local1241, local2475.anInt9594, local184, local1190, local2456, local2475.anInt9595, arg1);
				@Pc(2500) Class368 local2500 = local470[local1246];
				this.aShortArray44[local184] = this.method2555(local2500.anInt9596, local2500.anInt9597, local1192, local1246, local2500.anInt9594, local184, local1194, (long) local1200 + local2456, local2500.anInt9595, arg1);
				@Pc(2528) Class368 local2528 = local470[local1251];
				this.aShortArray51[local184] = this.method2555(local2528.anInt9596, local2528.anInt9597, local1196, local1251, local2528.anInt9594, local184, local1198, (long) local1202 + local2456, local2528.anInt9595, arg1);
			} else if (local1221 == 1) {
				@Pc(2565) Class252 local2565 = local787[local1120];
				@Pc(2612) long local2612 = ((long) local830 + (long) (local1204 << 24) + (long) (local1127 << 8) << 32) + (long) ((local2565.anInt6319 + 256 << 12) + ((local2565.anInt6320 <= 0 ? 2048 : 1024) + (local819 << 2) + (local2565.anInt6321 + 256 << 22)));
				this.aShortArray43[local184] = this.method2555(local2565.anInt6321, 0, local1188, arg1.aShortArray27[local1120], local2565.anInt6320, local184, local1190, local2612, local2565.anInt6319, arg1);
				this.aShortArray44[local184] = this.method2555(local2565.anInt6321, 0, local1192, arg1.aShortArray24[local1120], local2565.anInt6320, local184, local1194, local2612 + (long) local1200, local2565.anInt6319, arg1);
				this.aShortArray51[local184] = this.method2555(local2565.anInt6321, 0, local1196, arg1.aShortArray26[local1120], local2565.anInt6320, local184, local1198, local2612 + (long) local1202, local2565.anInt6319, arg1);
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray33[local184] = arg1.aByteArray29[local1120];
			}
			if (arg1.aShortArray20 != null) {
				this.aShortArray45[local184] = arg1.aShortArray20[local1120];
			}
			this.aShortArray40[local184] = arg1.aShortArray22[local1120];
			this.aShortArray46[local184] = local1164;
		}
		if (this.anInt2745 > 0) {
			local1120 = 1;
			local808 = this.aShortArray46[0];
			for (local819 = 0; local819 < this.anInt2745; local819++) {
				@Pc(2761) short local2761 = this.aShortArray46[local819];
				if (local808 != local2761) {
					local1120++;
					local808 = local2761;
				}
			}
			this.anIntArray238 = new int[local1120 + 1];
			this.anIntArray241 = new int[local1120];
			this.anIntArray239 = new int[local1120];
			this.anIntArray238[0] = 0;
			local830 = this.anInt2759;
			local1120 = 0;
			local1164 = 0;
			local808 = this.aShortArray46[0];
			for (local852 = 0; local852 < this.anInt2745; local852++) {
				@Pc(2820) short local2820 = this.aShortArray46[local852];
				if (local2820 != local808) {
					this.anIntArray241[local1120] = local830;
					this.anIntArray239[local1120] = local1164 + 1 - local830;
					local1120++;
					this.anIntArray238[local1120] = local852;
					local830 = this.anInt2759;
					local1164 = 0;
					local808 = local2820;
				}
				@Pc(2855) short local2855 = this.aShortArray43[local852];
				if (local1164 < local2855) {
					local1164 = local2855;
				}
				if (local2855 < local830) {
					local830 = local2855;
				}
				local2855 = this.aShortArray44[local852];
				if (local1164 < local2855) {
					local1164 = local2855;
				}
				if (local2855 < local830) {
					local830 = local2855;
				}
				local2855 = this.aShortArray51[local852];
				if (local2855 < local830) {
					local830 = local2855;
				}
				if (local2855 > local1164) {
					local1164 = local2855;
				}
			}
			this.anIntArray241[local1120] = local830;
			this.anIntArray239[local1120] = local1164 + 1 - local830;
			local1120++;
			this.anIntArray238[local1120] = this.anInt2745;
		}
		Static381.aLongArray10 = null;
		this.aShortArray48 = Static4.method94(this.aShortArray48, this.anInt2759);
		this.aShortArray42 = Static4.method94(this.aShortArray42, this.anInt2759);
		this.aShortArray47 = Static4.method94(this.aShortArray47, this.anInt2759);
		this.aShortArray49 = Static4.method94(this.aShortArray49, this.anInt2759);
		this.aShortArray39 = Static4.method94(this.aShortArray39, this.anInt2759);
		this.aByteArray32 = Static396.method5550(this.anInt2759, this.aByteArray32);
		this.aFloatArray18 = Static617.method8299(this.anInt2759, this.aFloatArray18);
		this.lb = Static617.method8299(this.anInt2759, this.lb);
		if (arg1.anIntArray209 != null && Static1.method9338(this.anInt2765, arg2)) {
			this.anIntArrayArray66 = arg1.method2234(false);
		}
		if (arg1.aClass24Array1 != null && Static178.method2730(arg2, this.anInt2765)) {
			this.anIntArrayArray67 = arg1.method2239();
		}
		if (arg1.anIntArray210 != null && Static176.method6689(-1, this.anInt2765, arg2)) {
			local1120 = 0;
			@Pc(3065) int[] local3065 = new int[256];
			for (local819 = 0; local819 < this.anInt2715; local819++) {
				local830 = arg1.anIntArray210[local15[local819]];
				if (local830 >= 0) {
					@Pc(3082) int local3082 = local3065[local830]++;
					if (local1120 < local830) {
						local1120 = local830;
					}
				}
			}
			this.anIntArrayArray68 = new int[local1120 + 1][];
			for (local830 = 0; local830 <= local1120; local830++) {
				this.anIntArrayArray68[local830] = new int[local3065[local830]];
				local3065[local830] = 0;
			}
			for (local841 = 0; local841 < this.anInt2715; local841++) {
				local852 = arg1.anIntArray210[local15[local841]];
				if (local852 >= 0) {
					this.anIntArrayArray68[local852][local3065[local852]++] = local841;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!am;IIZZ)V")
	public Class114_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean228 = false;
		this.anInt2715 = 0;
		this.aBoolean230 = false;
		this.aBoolean231 = false;
		this.anInt2745 = 0;
		this.anInt2767 = 0;
		this.aBoolean229 = true;
		this.aBoolean232 = false;
		this.anInt2759 = 0;
		this.anInt2773 = 0;
		this.anInt2756 = arg1;
		this.aBoolean231 = arg4;
		this.anInt2765 = arg2;
		this.aClass19_Sub1_6 = arg0;
		if (arg3 || Static154.method2475(this.anInt2765, this.anInt2756)) {
			this.aClass371_2 = new Class371(Static42.method1054(this.anInt2765, this.anInt2756));
		}
		if (arg3 || Static230.method3372(this.anInt2765, this.anInt2756)) {
			this.aClass371_1 = new Class371(Static475.method6443(this.anInt2756, this.anInt2765));
		}
		if (arg3 || Static280.method4087(this.anInt2765, this.anInt2756)) {
			this.aClass371_3 = new Class371(Static519.method6832(-89, this.anInt2756, this.anInt2765));
		}
		if (arg3 || Static69.method6335(this.anInt2756, this.anInt2765)) {
			this.aClass371_4 = new Class371(Static576.method7609(this.anInt2765, this.anInt2756));
		}
		if (arg3 || Static652.method8532(this.anInt2756, this.anInt2765)) {
			this.aClass359_1 = new Class359(Static69.method6333(this.anInt2756, this.anInt2765));
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)Z")
	private boolean method2548() {
		@Pc(14) boolean local14 = !this.aClass371_3.aBoolean736;
		@Pc(36) boolean local36 = (this.anInt2765 & 0x37) != 0 && !this.aClass371_4.aBoolean736;
		@Pc(45) boolean local45 = !this.aClass371_2.aBoolean736;
		@Pc(54) boolean local54 = !this.aClass371_1.aBoolean736;
		if (!local45 && !local14 && !local36 && !local54) {
			return true;
		}
		@Pc(73) boolean local73 = true;
		@Pc(102) Interface16 local102;
		@Pc(116) Buffer local116;
		if (local45) {
			if (this.aShortArray48 == null) {
				return true;
			}
			if (this.aClass371_2.anInterface16_16 == null) {
				this.aClass371_2.anInterface16_16 = this.aClass19_Sub1_6.method8156(this.aBoolean231);
			}
			local102 = this.aClass371_2.anInterface16_16;
			local102.method3153(12, this.anInt2759 * 12);
			local116 = local102.method3155();
			if (local116 == null) {
				local73 = false;
			} else {
				this.aClass19_Sub1_6.aNativeInterface3.copyPositions(this.anIntArray240, this.anIntArray242, this.anIntArray244, this.aShortArray48, 0, 12, this.anInt2759, local116.getAddress());
				if (local102.method3154()) {
					this.aClass371_2.anInterface16_17 = local102;
					this.aClass371_2.aBoolean736 = true;
				} else {
					local73 = false;
				}
			}
		}
		@Pc(247) short[] local247;
		@Pc(250) short[] local250;
		@Pc(244) short[] local244;
		@Pc(241) byte[] local241;
		if (local14) {
			if (this.aClass371_3.anInterface16_16 == null) {
				this.aClass371_3.anInterface16_16 = this.aClass19_Sub1_6.method8156(this.aBoolean231);
			}
			local102 = this.aClass371_3.anInterface16_16;
			local102.method3153(4, this.anInt2759 * 4);
			local116 = local102.method3155();
			if (local116 == null) {
				local73 = false;
			} else {
				if ((this.anInt2765 & 0x37) == 0) {
					if (this.aClass313_1 == null) {
						local241 = this.aByteArray32;
						local244 = this.aShortArray39;
						local247 = this.aShortArray47;
						local250 = this.aShortArray49;
					} else {
						local241 = this.aClass313_1.aByteArray91;
						local244 = this.aClass313_1.aShortArray110;
						local250 = this.aClass313_1.aShortArray109;
						local247 = this.aClass313_1.aShortArray111;
					}
					this.aClass19_Sub1_6.aNativeInterface3.copyLighting(this.aShortArray40, this.aByteArray33, this.aShortArray46, local247, local250, local244, local241, this.aShort36, this.aShort35, this.aShortArray42, 0, 4, this.anInt2759, local116.getAddress());
				} else {
					this.aClass19_Sub1_6.aNativeInterface3.copyColours(this.aShortArray40, this.aByteArray33, this.aShortArray46, this.aShort36, this.aShortArray42, 0, 4, this.anInt2759, local116.getAddress());
				}
				if (local102.method3154()) {
					this.aClass371_3.anInterface16_17 = local102;
					this.aClass371_3.aBoolean736 = true;
				} else {
					local73 = false;
				}
			}
		}
		if (local36) {
			if (this.aClass371_4.anInterface16_16 == null) {
				this.aClass371_4.anInterface16_16 = this.aClass19_Sub1_6.method8156(this.aBoolean231);
			}
			local102 = this.aClass371_4.anInterface16_16;
			local102.method3153(12, this.anInt2759 * 12);
			local116 = local102.method3155();
			if (local116 == null) {
				local73 = false;
			} else {
				if (this.aClass313_1 == null) {
					local244 = this.aShortArray39;
					local241 = this.aByteArray32;
					local247 = this.aShortArray47;
					local250 = this.aShortArray49;
				} else {
					local244 = this.aClass313_1.aShortArray110;
					local247 = this.aClass313_1.aShortArray111;
					local241 = this.aClass313_1.aByteArray91;
					local250 = this.aClass313_1.aShortArray109;
				}
				this.aClass19_Sub1_6.aNativeInterface3.copyNormals(local247, local250, local244, local241, 3.0F / (float) this.aShort35, 3.0F / (float) (this.aShort35 + this.aShort35 / 2), 0, 12, this.anInt2759, local116.getAddress());
				if (local102.method3154()) {
					this.aClass371_4.anInterface16_17 = local102;
					this.aClass371_4.aBoolean736 = true;
				} else {
					local73 = false;
				}
			}
		}
		if (local54) {
			if (this.aClass371_1.anInterface16_16 == null) {
				this.aClass371_1.anInterface16_16 = this.aClass19_Sub1_6.method8156(this.aBoolean231);
			}
			local102 = this.aClass371_1.anInterface16_16;
			local102.method3153(8, this.anInt2759 * 8);
			local116 = local102.method3155();
			if (local116 == null) {
				local73 = false;
			} else {
				this.aClass19_Sub1_6.aNativeInterface3.copyTexCoords(this.aFloatArray18, this.lb, 0, 8, this.anInt2759, local116.getAddress());
				if (local102.method3154()) {
					this.aClass371_1.anInterface16_17 = local102;
					this.aClass371_1.aBoolean736 = true;
				} else {
					local73 = false;
				}
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "(I)V")
	private void method2549() {
		if (this.aClass371_2 != null) {
			this.aClass371_2.aBoolean736 = false;
		}
	}

	@OriginalMember(owner = "client!eu", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort35;
	}

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean232) {
			this.method2561();
		}
		@Pc(19) int local19 = arg4 + this.anInt2723;
		@Pc(25) int local25 = arg4 + this.anInt2716;
		@Pc(30) int local30 = arg6 + this.anInt2758;
		@Pc(35) int local35 = this.anInt2771 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local19 < 0 || arg2.anInt8894 <= arg2.anInt8888 + local25 >> arg2.anInt8895 || local30 < 0 || local35 + arg2.anInt8888 >> arg2.anInt8895 >= arg2.anInt8892)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local19 < 0 || arg3.anInt8894 <= arg3.anInt8888 + local25 >> arg3.anInt8895 || local30 < 0 || arg3.anInt8888 + local35 >> arg3.anInt8895 >= arg3.anInt8892) {
				return;
			}
		} else {
			local19 >>= arg2.anInt8895;
			local25 = arg2.anInt8888 + local25 - 1 >> arg2.anInt8895;
			local30 >>= arg2.anInt8895;
			local35 = arg2.anInt8888 + local35 - 1 >> arg2.anInt8895;
			if (arg2.method7869(local30, local19) == arg5 && arg2.method7869(local30, local25) == arg5 && arg5 == arg2.method7869(local35, local19) && arg2.method7869(local35, local25) == arg5) {
				return;
			}
		}
		@Pc(230) int local230;
		if (arg0 == 1) {
			for (local230 = 0; local230 < this.anInt2773; local230++) {
				this.anIntArray242[local230] = this.anIntArray242[local230] + arg2.method7878(arg6 + this.anIntArray244[local230], this.anIntArray240[local230] + arg4) - arg5;
			}
		} else {
			@Pc(303) int local303;
			@Pc(312) int local312;
			if (arg0 == 2) {
				local230 = this.anInt2768;
				if (local230 == 0) {
					return;
				}
				for (local303 = 0; local303 < this.anInt2773; local303++) {
					local312 = (this.anIntArray242[local303] << 16) / local230;
					if (local312 < arg1) {
						this.anIntArray242[local303] -= -((arg1 - local312) * (arg2.method7878(this.anIntArray244[local303] - -arg6, this.anIntArray240[local303] - -arg4) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(319) int local319;
				if (arg0 == 3) {
					local230 = (arg1 & 0xFF) * 4;
					local303 = (arg1 >> 8 & 0xFF) * 4;
					local312 = (arg1 >> 16 & 0xFF) << 6;
					local319 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local230 >> 1) < 0 || arg2.anInt8894 << arg2.anInt8895 <= (local230 >> 1) + arg4 + arg2.anInt8888 || arg6 - (local303 >> 1) < 0 || arg6 + (local303 >> 1) + arg2.anInt8888 >= arg2.anInt8892 << arg2.anInt8895) {
						return;
					}
					this.method7490(arg5, local312, arg4, local230, arg6, local303, arg2, local319);
				} else if (arg0 == 4) {
					local230 = this.anInt2720 - this.anInt2768;
					for (local303 = 0; local303 < this.anInt2773; local303++) {
						this.anIntArray242[local303] = local230 + this.anIntArray242[local303] + arg3.method7878(arg6 + this.anIntArray244[local303], this.anIntArray240[local303] + arg4) - arg5;
					}
				} else if (arg0 == 5) {
					local230 = this.anInt2720 - this.anInt2768;
					for (local303 = 0; local303 < this.anInt2773; local303++) {
						local312 = this.anIntArray240[local303] + arg4;
						local319 = arg6 + this.anIntArray244[local303];
						@Pc(325) int local325 = arg2.method7878(local319, local312);
						@Pc(331) int local331 = arg3.method7878(local319, local312);
						@Pc(339) int local339 = local325 - arg1 - local331;
						this.anIntArray242[local303] = (local339 * ((this.anIntArray242[local303] << 8) / local230) >> 8) + local325 - arg5;
					}
				}
			}
		}
		this.method2549();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[B)V")
	@Override
	public void method7498(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(9) int local9;
		if (arg1 == null) {
			for (local9 = 0; local9 < this.anInt2715; local9++) {
				this.aByteArray33[local9] = arg0;
			}
		} else {
			for (local9 = 0; local9 < this.anInt2715; local9++) {
				@Pc(52) int local52 = 255 - (255 - (arg1[local9] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray33[local9] = (byte) local52;
			}
		}
		this.method2563();
	}

	@OriginalMember(owner = "client!eu", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2701;
	}

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "(I)V")
	public void method2550() {
		if (this.aClass371_2 != null) {
			this.aClass371_2.method8446();
		}
		if (this.aClass371_1 != null) {
			this.aClass371_1.method8446();
		}
		if (this.aClass371_3 != null) {
			this.aClass371_3.method8446();
		}
		if (this.aClass371_4 != null) {
			this.aClass371_4.method8446();
		}
		if (this.aClass359_1 != null) {
			this.aClass359_1.method8339();
		}
	}

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "(I)Z")
	private boolean method2551() {
		if (this.aClass359_1.aBoolean729) {
			return true;
		}
		if (this.aClass359_1.anInterface20_7 == null) {
			this.aClass359_1.anInterface20_7 = this.aClass19_Sub1_6.method8122(this.aBoolean231);
		}
		@Pc(31) Interface20 local31 = this.aClass359_1.anInterface20_7;
		local31.method8543(this.anInt2745 * 6);
		@Pc(45) Buffer local45 = local31.method8547();
		if (local45 != null) {
			@Pc(71) Stream local71 = this.aClass19_Sub1_6.method8100(local45);
			@Pc(75) int local75;
			if (Stream.b()) {
				for (local75 = 0; local75 < this.anInt2745; local75++) {
					local71.b(this.aShortArray43[local75]);
					local71.b(this.aShortArray44[local75]);
					local71.b(this.aShortArray51[local75]);
				}
			} else {
				for (local75 = 0; local75 < this.anInt2745; local75++) {
					local71.c(this.aShortArray43[local75]);
					local71.c(this.aShortArray44[local75]);
					local71.c(this.aShortArray51[local75]);
				}
			}
			local71.c();
			if (local31.method8546()) {
				this.aClass359_1.aBoolean729 = true;
				this.aClass359_1.anInterface20_8 = local31;
				this.aBoolean229 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "(I)V")
	private void method2552() {
		if (this.aClass298Array1 == null) {
			return;
		}
		this.aClass19_Sub1_6.C(!this.aBoolean228);
		this.aClass19_Sub1_6.method8072(false);
		this.aClass19_Sub1_6.method8080(1, Static454.aClass168_5);
		this.aClass19_Sub1_6.method8142(Static454.aClass168_5, 1);
		for (@Pc(48) int local48 = 0; local48 < this.anInt2713; local48++) {
			@Pc(57) Class298 local57 = this.aClass298Array1[local48];
			@Pc(62) Class18 local62 = this.aClass18Array1[local48];
			if (!local57.aBoolean577 || !this.aClass19_Sub1_6.method8014()) {
				@Pc(94) float local94 = (float) (this.anIntArray240[local57.anInt7573] + this.anIntArray240[local57.anInt7574] + this.anIntArray240[local57.anInt7577]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray242[local57.anInt7577] + this.anIntArray242[local57.anInt7573] + this.anIntArray242[local57.anInt7574]) * 0.3333333F;
				@Pc(137) float local137 = (float) (this.anIntArray244[local57.anInt7573] + this.anIntArray244[local57.anInt7574] + this.anIntArray244[local57.anInt7577]) * 0.3333333F;
				@Pc(151) float local151 = local137 * Static53.aFloat28 + local116 * Static18.aFloat2 + local94 * Static305.aFloat86 + Static279.aFloat82;
				@Pc(165) float local165 = Static706.aFloat217 + Static654.aFloat209 * local137 + Static348.aFloat107 * local94 + local116 * Static580.aFloat176;
				@Pc(179) float local179 = local137 * Static382.aFloat114 + Static624.aFloat198 * local116 + local94 * Static355.aFloat111 + Static115.aFloat50;
				@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local179 * local179 + local165 * local165 + local151 * local151))) * (float) local57.anInt7576;
				@Pc(205) Class73_Sub1 local205 = this.aClass19_Sub1_6.method8040();
				local205.method1893(local179 - local179 * local200, local62.anInt266 * local57.aShort98 >> 7, local62.anInt268 * local57.aShort99 >> 7, (float) local62.anInt263 + local165 - local165 * local200, (float) local62.anInt262 + local151 - local151 * local200, local62.anInt267);
				local205.method1878(this.aClass19_Sub1_6.aClass73_Sub1_17);
				this.aClass19_Sub1_6.method8042();
				@Pc(260) int local260 = local62.anInt269;
				this.aClass19_Sub1_6.method8108(false, local57.aShort100, false);
				this.aClass19_Sub1_6.method8053(local57.aByte123);
				this.aClass19_Sub1_6.method8112(local260);
				this.aClass19_Sub1_6.method8059();
			}
		}
		this.aClass19_Sub1_6.method8142(Static188.aClass168_1, 1);
		this.aClass19_Sub1_6.method8080(1, Static188.aClass168_1);
		this.aClass19_Sub1_6.C(true);
	}

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass371_2 != null) {
			this.aClass371_2.aBoolean735 = Static42.method1054(this.anInt2765, arg0);
		}
		if (this.aClass371_1 != null) {
			this.aClass371_1.aBoolean735 = Static475.method6443(arg0, this.anInt2765);
		}
		if (this.aClass371_3 != null) {
			this.aClass371_3.aBoolean735 = Static519.method6832(-90, arg0, this.anInt2765);
		}
		if (this.aClass371_4 != null) {
			this.aClass371_4.aBoolean735 = Static576.method7609(this.anInt2765, arg0);
		}
		this.anInt2756 = arg0;
		this.aBoolean229 = true;
		if (this.aClass313_1 != null && (this.anInt2756 & 0x10000) == 0) {
			this.aShortArray39 = this.aClass313_1.aShortArray110;
			this.aByteArray32 = this.aClass313_1.aByteArray91;
			this.aShortArray47 = this.aClass313_1.aShortArray111;
			this.aShortArray49 = this.aClass313_1.aShortArray109;
			this.aClass313_1 = null;
		}
		this.method2558();
	}

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean228;
	}

	@OriginalMember(owner = "client!eu", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort36;
	}

	@OriginalMember(owner = "client!eu", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2708;
	}

	@OriginalMember(owner = "client!eu", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static658.anInt9800 = 0;
			Static272.anInt4374 = 0;
			local16 = 0;
			Static393.anInt6145 = 0;
			for (local20 = 0; local20 < this.anInt2773; local20++) {
				Static272.anInt4374 += this.anIntArray240[local20];
				Static658.anInt9800 += this.anIntArray242[local20];
				local16++;
				Static393.anInt6145 += this.anIntArray244[local20];
			}
			if (local16 <= 0) {
				Static658.anInt9800 = arg2;
				Static272.anInt4374 = arg1;
				Static393.anInt6145 = arg3;
			} else {
				Static658.anInt9800 = Static658.anInt9800 / local16 + arg2;
				Static272.anInt4374 = arg1 + Static272.anInt4374 / local16;
				Static393.anInt6145 = arg3 + Static393.anInt6145 / local16;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt2773; local16++) {
				this.anIntArray240[local16] += arg1;
				this.anIntArray242[local16] += arg2;
				this.anIntArray244[local16] += arg3;
			}
		} else {
			@Pc(180) int local180;
			@Pc(198) int local198;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt2773; local16++) {
					this.anIntArray240[local16] -= Static272.anInt4374;
					this.anIntArray242[local16] -= Static658.anInt9800;
					this.anIntArray244[local16] -= Static393.anInt6145;
					if (arg3 != 0) {
						local20 = Class361.anIntArray741[arg3];
						local180 = Class361.anIntArray740[arg3];
						local198 = local180 * this.anIntArray240[local16] + this.anIntArray242[local16] * local20 + 16383 >> 14;
						this.anIntArray242[local16] = local180 * this.anIntArray242[local16] + 16383 - this.anIntArray240[local16] * local20 >> 14;
						this.anIntArray240[local16] = local198;
					}
					if (arg1 != 0) {
						local20 = Class361.anIntArray741[arg1];
						local180 = Class361.anIntArray740[arg1];
						local198 = local180 * this.anIntArray242[local16] + 16383 - this.anIntArray244[local16] * local20 >> 14;
						this.anIntArray244[local16] = local180 * this.anIntArray244[local16] + local20 * this.anIntArray242[local16] + 16383 >> 14;
						this.anIntArray242[local16] = local198;
					}
					if (arg2 != 0) {
						local20 = Class361.anIntArray741[arg2];
						local180 = Class361.anIntArray740[arg2];
						local198 = this.anIntArray244[local16] * local20 + local180 * this.anIntArray240[local16] + 16383 >> 14;
						this.anIntArray244[local16] = local180 * this.anIntArray244[local16] + 16383 - local20 * this.anIntArray240[local16] >> 14;
						this.anIntArray240[local16] = local198;
					}
					this.anIntArray240[local16] += Static272.anInt4374;
					this.anIntArray242[local16] += Static658.anInt9800;
					this.anIntArray244[local16] += Static393.anInt6145;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt2773; local16++) {
					this.anIntArray240[local16] -= Static272.anInt4374;
					this.anIntArray242[local16] -= Static658.anInt9800;
					this.anIntArray244[local16] -= Static393.anInt6145;
					this.anIntArray240[local16] = arg1 * this.anIntArray240[local16] / 128;
					this.anIntArray242[local16] = arg2 * this.anIntArray242[local16] / 128;
					this.anIntArray244[local16] = this.anIntArray244[local16] * arg3 / 128;
					this.anIntArray240[local16] += Static272.anInt4374;
					this.anIntArray242[local16] += Static658.anInt9800;
					this.anIntArray244[local16] += Static393.anInt6145;
				}
			} else {
				@Pc(538) Class298 local538;
				@Pc(543) Class18 local543;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt2715; local16++) {
						local20 = arg1 * 8 + (this.aByteArray33[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray33[local16] = (byte) local20;
					}
					if (this.aClass298Array1 != null) {
						for (local20 = 0; local20 < this.anInt2713; local20++) {
							local538 = this.aClass298Array1[local20];
							local543 = this.aClass18Array1[local20];
							local543.anInt269 = 255 - (this.aByteArray33[local538.anInt7575] & 0xFF) << 24 | local543.anInt269 & 0xFFFFFF;
						}
					}
					this.method2563();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt2715; local16++) {
						local20 = this.aShortArray40[local16] & 0xFFFF;
						local180 = local20 >> 10 & 0x3F;
						local198 = local20 >> 7 & 0x7;
						local198 += arg2 / 4;
						@Pc(610) int local610 = local20 & 0x7F;
						@Pc(616) int local616 = local180 + arg1 & 0x3F;
						local610 += arg3;
						if (local198 < 0) {
							local198 = 0;
						} else if (local198 > 7) {
							local198 = 7;
						}
						if (local610 < 0) {
							local610 = 0;
						} else if (local610 > 127) {
							local610 = 127;
						}
						this.aShortArray40[local16] = (short) (local198 << 7 | local616 << 10 | local610);
					}
					if (this.aClass298Array1 != null) {
						for (local20 = 0; local20 < this.anInt2713; local20++) {
							local538 = this.aClass298Array1[local20];
							local543 = this.aClass18Array1[local20];
							local543.anInt269 = Static154.anIntArray237[this.aShortArray40[local538.anInt7575] & 0xFFFF] & 0xFFFFFF | local543.anInt269 & 0xFF000000;
						}
					}
					this.method2563();
				} else {
					@Pc(728) Class18 local728;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt2713; local16++) {
							local728 = this.aClass18Array1[local16];
							local728.anInt263 += arg2;
							local728.anInt262 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt2713; local16++) {
							local728 = this.aClass18Array1[local16];
							local728.anInt266 = local728.anInt266 * arg2 >> 7;
							local728.anInt268 = arg1 * local728.anInt268 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt2713; local16++) {
							local728 = this.aClass18Array1[local16];
							local728.anInt267 = local728.anInt267 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method7476(@OriginalArg(0) Class73 arg0) {
		@Pc(8) Class73_Sub1 local8 = (Class73_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass328Array2 != null) {
			for (local13 = 0; local13 < this.aClass328Array2.length; local13++) {
				@Pc(20) Class328 local20 = this.aClass328Array2[local13];
				@Pc(22) Class328 local22 = local20;
				if (local20.aClass328_2 != null) {
					local22 = local20.aClass328_2;
				}
				local22.anInt8518 = (int) (local8.aFloat46 + local8.aFloat38 * (float) this.anIntArray244[local20.anInt8514] + (float) this.anIntArray242[local20.anInt8514] * local8.aFloat40 + local8.aFloat39 * (float) this.anIntArray240[local20.anInt8514]);
				local22.anInt8502 = (int) (local8.aFloat37 + local8.aFloat41 * (float) this.anIntArray244[local20.anInt8514] + (float) this.anIntArray242[local20.anInt8514] * local8.aFloat42 + local8.aFloat44 * (float) this.anIntArray240[local20.anInt8514]);
				local22.anInt8504 = (int) ((float) this.anIntArray240[local20.anInt8514] * local8.aFloat45 + (float) this.anIntArray242[local20.anInt8514] * local8.aFloat36 + (float) this.anIntArray244[local20.anInt8514] * local8.aFloat47 + local8.aFloat43);
				local22.anInt8516 = (int) ((float) this.anIntArray244[local20.anInt8508] * local8.aFloat38 + (float) this.anIntArray240[local20.anInt8508] * local8.aFloat39 + local8.aFloat40 * (float) this.anIntArray242[local20.anInt8508] + local8.aFloat46);
				local22.anInt8507 = (int) (local8.aFloat41 * (float) this.anIntArray244[local20.anInt8508] + (float) this.anIntArray242[local20.anInt8508] * local8.aFloat42 + local8.aFloat44 * (float) this.anIntArray240[local20.anInt8508] + local8.aFloat37);
				local22.anInt8509 = (int) (local8.aFloat36 * (float) this.anIntArray242[local20.anInt8508] + local8.aFloat45 * (float) this.anIntArray240[local20.anInt8508] + local8.aFloat47 * (float) this.anIntArray244[local20.anInt8508] + local8.aFloat43);
				local22.anInt8512 = (int) (local8.aFloat46 + local8.aFloat38 * (float) this.anIntArray244[local20.anInt8505] + (float) this.anIntArray240[local20.anInt8505] * local8.aFloat39 + local8.aFloat40 * (float) this.anIntArray242[local20.anInt8505]);
				local22.anInt8503 = (int) (local8.aFloat37 + (float) this.anIntArray240[local20.anInt8505] * local8.aFloat44 + local8.aFloat42 * (float) this.anIntArray242[local20.anInt8505] + (float) this.anIntArray244[local20.anInt8505] * local8.aFloat41);
				local22.anInt8520 = (int) (local8.aFloat43 + (float) this.anIntArray240[local20.anInt8505] * local8.aFloat45 + local8.aFloat36 * (float) this.anIntArray242[local20.anInt8505] + (float) this.anIntArray244[local20.anInt8505] * local8.aFloat47);
			}
		}
		if (this.aClass249Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass249Array2.length; local13++) {
			@Pc(367) Class249 local367 = this.aClass249Array2[local13];
			@Pc(369) Class249 local369 = local367;
			if (local367.aClass249_2 != null) {
				local369 = local367.aClass249_2;
			}
			if (local367.aClass73_6 == null) {
				local367.aClass73_6 = local8.method7129();
			} else {
				local367.aClass73_6.method7128(local8);
			}
			local369.anInt6252 = (int) ((float) this.anIntArray244[local367.anInt6247] * local8.aFloat38 + local8.aFloat39 * (float) this.anIntArray240[local367.anInt6247] + (float) this.anIntArray242[local367.anInt6247] * local8.aFloat40 + local8.aFloat46);
			local369.anInt6250 = (int) ((float) this.anIntArray244[local367.anInt6247] * local8.aFloat41 + local8.aFloat42 * (float) this.anIntArray242[local367.anInt6247] + local8.aFloat44 * (float) this.anIntArray240[local367.anInt6247] + local8.aFloat37);
			local369.anInt6249 = (int) ((float) this.anIntArray242[local367.anInt6247] * local8.aFloat36 + (float) this.anIntArray240[local367.anInt6247] * local8.aFloat45 + local8.aFloat47 * (float) this.anIntArray244[local367.anInt6247] + local8.aFloat43);
		}
	}

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean230;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!tt;IIZZI)Z")
	private boolean method2553(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class73_Sub1 local8 = (Class73_Sub1) arg1;
		@Pc(12) Class73_Sub1 local12 = this.aClass19_Sub1_6.aClass73_Sub1_16;
		@Pc(33) float local33 = local12.aFloat46 + local12.aFloat38 * local8.aFloat43 + local8.aFloat46 * local12.aFloat39 + local12.aFloat40 * local8.aFloat37;
		@Pc(54) float local54 = local12.aFloat37 + local12.aFloat41 * local8.aFloat43 + local12.aFloat42 * local8.aFloat37 + local8.aFloat46 * local12.aFloat44;
		Static654.aFloat209 = local12.aFloat41 * local8.aFloat47 + local12.aFloat44 * local8.aFloat38 + local8.aFloat41 * local12.aFloat42;
		Static382.aFloat114 = local8.aFloat38 * local12.aFloat45 + local8.aFloat41 * local12.aFloat36 + local8.aFloat47 * local12.aFloat47;
		Static355.aFloat111 = local8.aFloat45 * local12.aFloat47 + local12.aFloat45 * local8.aFloat39 + local8.aFloat44 * local12.aFloat36;
		Static53.aFloat28 = local12.aFloat40 * local8.aFloat41 + local8.aFloat38 * local12.aFloat39 + local12.aFloat38 * local8.aFloat47;
		Static18.aFloat2 = local8.aFloat36 * local12.aFloat38 + local12.aFloat40 * local8.aFloat42 + local12.aFloat39 * local8.aFloat40;
		Static624.aFloat198 = local8.aFloat40 * local12.aFloat45 + local12.aFloat36 * local8.aFloat42 + local12.aFloat47 * local8.aFloat36;
		Static348.aFloat107 = local12.aFloat42 * local8.aFloat44 + local12.aFloat44 * local8.aFloat39 + local8.aFloat45 * local12.aFloat41;
		Static580.aFloat176 = local12.aFloat41 * local8.aFloat36 + local8.aFloat40 * local12.aFloat44 + local8.aFloat42 * local12.aFloat42;
		Static305.aFloat86 = local12.aFloat40 * local8.aFloat44 + local8.aFloat39 * local12.aFloat39 + local12.aFloat38 * local8.aFloat45;
		@Pc(237) float local237 = local12.aFloat43 + local8.aFloat43 * local12.aFloat47 + local12.aFloat45 * local8.aFloat46 + local8.aFloat37 * local12.aFloat36;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass19_Sub1_6.anInt9151;
		@Pc(255) int local255 = this.aClass19_Sub1_6.anInt9180;
		if (!this.aBoolean232) {
			this.method2561();
		}
		@Pc(272) int local272 = this.anInt2716 - this.anInt2723 >> 1;
		@Pc(281) int local281 = this.anInt2720 - this.anInt2768 >> 1;
		@Pc(290) int local290 = this.anInt2771 - this.anInt2758 >> 1;
		@Pc(296) int local296 = this.anInt2723 + local272;
		@Pc(302) int local302 = this.anInt2768 + local281;
		@Pc(307) int local307 = local290 + this.anInt2758;
		@Pc(314) int local314 = local296 - (local272 << arg2);
		@Pc(321) int local321 = local302 - (local281 << arg2);
		@Pc(328) int local328 = local307 - (local290 << arg2);
		@Pc(335) int local335 = local296 + (local272 << arg2);
		@Pc(341) int local341 = local302 + (local281 << arg2);
		Static499.anIntArray605[0] = local314;
		@Pc(351) int local351 = (local290 << arg2) + local307;
		Static172.anIntArray251[0] = local321;
		Static399.anIntArray483[0] = local328;
		Static499.anIntArray605[1] = local335;
		Static172.anIntArray251[1] = local321;
		Static399.anIntArray483[1] = local328;
		Static499.anIntArray605[2] = local314;
		Static172.anIntArray251[2] = local341;
		Static399.anIntArray483[2] = local328;
		Static499.anIntArray605[3] = local335;
		Static172.anIntArray251[3] = local341;
		Static499.anIntArray605[4] = local314;
		Static399.anIntArray483[3] = local328;
		Static172.anIntArray251[4] = local321;
		Static399.anIntArray483[4] = local351;
		Static499.anIntArray605[5] = local335;
		Static172.anIntArray251[5] = local321;
		Static499.anIntArray605[6] = local314;
		Static399.anIntArray483[5] = local351;
		Static172.anIntArray251[6] = local341;
		Static399.anIntArray483[6] = local351;
		Static499.anIntArray605[7] = local335;
		Static172.anIntArray251[7] = local341;
		Static399.anIntArray483[7] = local351;
		@Pc(478) float local478;
		@Pc(506) float local506;
		@Pc(492) float local492;
		@Pc(454) float local454;
		@Pc(464) float local464;
		@Pc(459) float local459;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local454 = (float) Static499.anIntArray605[local445];
			local459 = (float) Static399.anIntArray483[local445];
			local464 = (float) Static172.anIntArray251[local445];
			local478 = local459 * Static53.aFloat28 + local454 * Static305.aFloat86 + Static18.aFloat2 * local464 + local33;
			local492 = Static355.aFloat111 * local454 + Static624.aFloat198 * local464 + local459 * Static382.aFloat114 + local237;
			local506 = Static654.aFloat209 * local459 + local454 * Static348.aFloat107 + local464 * Static580.aFloat176 + local54;
			if (local492 >= (float) this.aClass19_Sub1_6.anInt9181) {
				if (arg0 > 0) {
					local492 = (float) arg0;
				}
				@Pc(535) float local535 = (float) this.aClass19_Sub1_6.anInt9170 + local478 * (float) local251 / local492;
				if (local243 < local535) {
					local243 = local535;
				}
				@Pc(553) float local553 = (float) local255 * local506 / local492 + (float) this.aClass19_Sub1_6.anInt9163;
				if (local535 < local241) {
					local241 = local535;
				}
				if (local245 > local553) {
					local245 = local553;
				}
				if (local553 > local247) {
					local247 = local553;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg5 && (float) arg5 < local243 && local245 < (float) arg3 && local247 > (float) arg3) {
			if (arg4) {
				return true;
			}
			if (this.anInt2759 > Static190.anIntArray266.length) {
				Static686.anIntArray710 = new int[this.anInt2759];
				Static190.anIntArray266 = new int[this.anInt2759];
			}
			@Pc(717) int local717;
			for (@Pc(641) int local641 = 0; local641 < this.anInt2773; local641++) {
				local459 = (float) this.anIntArray244[local641];
				local454 = (float) this.anIntArray240[local641];
				local464 = (float) this.anIntArray242[local641];
				local506 = local54 + Static348.aFloat107 * local454 + Static580.aFloat176 * local464 + local459 * Static654.aFloat209;
				local478 = local454 * Static305.aFloat86 + Static18.aFloat2 * local464 + Static53.aFloat28 * local459 + local33;
				local492 = local237 + local464 * Static624.aFloat198 + Static355.aFloat111 * local454 + Static382.aFloat114 * local459;
				@Pc(724) int local724;
				@Pc(726) int local726;
				@Pc(735) int local735;
				if ((float) this.aClass19_Sub1_6.anInt9181 <= local492) {
					if (arg0 > 0) {
						local492 = (float) arg0;
					}
					local717 = (int) ((float) this.aClass19_Sub1_6.anInt9170 + local478 * (float) local251 / local492);
					local724 = (int) ((float) this.aClass19_Sub1_6.anInt9163 + local506 * (float) local255 / local492);
					local726 = this.anIntArray243[local641];
					local735 = this.anIntArray243[local641 + 1];
					for (@Pc(805) int local805 = local726; local805 < local735; local805++) {
						@Pc(814) int local814 = this.aShortArray50[local805] - 1;
						if (local814 == -1) {
							break;
						}
						Static190.anIntArray266[local814] = local717;
						Static686.anIntArray710[local814] = local724;
					}
				} else {
					local717 = this.anIntArray243[local641];
					local724 = this.anIntArray243[local641 + 1];
					for (local726 = local717; local726 < local724; local726++) {
						local735 = this.aShortArray50[local726] - 1;
						if (local735 == -1) {
							break;
						}
						Static190.anIntArray266[this.aShortArray50[local726] - 1] = -999999;
					}
				}
			}
			for (local717 = 0; local717 < this.anInt2715; local717++) {
				if (Static190.anIntArray266[this.aShortArray43[local717]] != -999999 && Static190.anIntArray266[this.aShortArray44[local717]] != -999999 && Static190.anIntArray266[this.aShortArray51[local717]] != -999999 && this.method2556(Static686.anIntArray710[this.aShortArray44[local717]], arg5, Static686.anIntArray710[this.aShortArray43[local717]], Static190.anIntArray266[this.aShortArray51[local717]], arg3, Static190.anIntArray266[this.aShortArray44[local717]], Static190.anIntArray266[this.aShortArray43[local717]], Static686.anIntArray710[this.aShortArray51[local717]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eu", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2767; local7++) {
			this.anIntArray240[local7] = this.anIntArray240[local7] + 7 >> 4;
			this.anIntArray242[local7] = this.anIntArray242[local7] + 7 >> 4;
			this.anIntArray244[local7] = this.anIntArray244[local7] + 7 >> 4;
		}
		this.method2549();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class361.anIntArray741[arg0];
		@Pc(13) int local13 = Class361.anIntArray740[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2773; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray240[local15] + this.anIntArray242[local15] * local9 >> 14;
			this.anIntArray242[local15] = this.anIntArray242[local15] * local13 - local9 * this.anIntArray240[local15] >> 14;
			this.anIntArray240[local15] = local33;
		}
		this.method2549();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2773; local7++) {
			if (arg0 != 128) {
				this.anIntArray240[local7] = this.anIntArray240[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray242[local7] = arg1 * this.anIntArray242[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray244[local7] = this.anIntArray244[local7] * arg2 >> 7;
			}
		}
		this.method2549();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(40) int local40;
		@Pc(54) int[] local54;
		@Pc(56) int local56;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			local24 = 0;
			Static272.anInt4374 = 0;
			Static658.anInt9800 = 0;
			Static393.anInt6145 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray66.length) {
					local54 = this.anIntArrayArray66[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						Static272.anInt4374 += this.anIntArray240[local62];
						Static658.anInt9800 += this.anIntArray242[local62];
						local24++;
						Static393.anInt6145 += this.anIntArray244[local62];
					}
				}
			}
			if (local24 <= 0) {
				Static658.anInt9800 = local18;
				Static393.anInt6145 = local14;
				Static272.anInt4374 = local22;
			} else {
				Static658.anInt9800 = Static658.anInt9800 / local24 + local18;
				Static272.anInt4374 = Static272.anInt4374 / local24 + local22;
				Static393.anInt6145 = local14 + Static393.anInt6145 / local24;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local22 = arg2 << 4;
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray66.length > local32) {
					local162 = this.anIntArrayArray66[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local56 = local162[local164];
						this.anIntArray240[local56] += local22;
						this.anIntArray242[local56] += local18;
						this.anIntArray244[local56] += local14;
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(306) int local306;
		@Pc(774) int local774;
		@Pc(783) int local783;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray66.length) {
					local162 = this.anIntArrayArray66[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local56 = local162[local164];
							this.anIntArray240[local56] -= Static272.anInt4374;
							this.anIntArray242[local56] -= Static658.anInt9800;
							this.anIntArray244[local56] -= Static393.anInt6145;
							if (arg4 != 0) {
								local62 = Class361.anIntArray741[arg4];
								local287 = Class361.anIntArray740[arg4];
								local306 = local62 * this.anIntArray242[local56] + this.anIntArray240[local56] * local287 + 16383 >> 14;
								this.anIntArray242[local56] = local287 * this.anIntArray242[local56] + 16383 - local62 * this.anIntArray240[local56] >> 14;
								this.anIntArray240[local56] = local306;
							}
							if (arg2 != 0) {
								local62 = Class361.anIntArray741[arg2];
								local287 = Class361.anIntArray740[arg2];
								local306 = local287 * this.anIntArray242[local56] + 16383 - this.anIntArray244[local56] * local62 >> 14;
								this.anIntArray244[local56] = this.anIntArray242[local56] * local62 + this.anIntArray244[local56] * local287 + 16383 >> 14;
								this.anIntArray242[local56] = local306;
							}
							if (arg3 != 0) {
								local62 = Class361.anIntArray741[arg3];
								local287 = Class361.anIntArray740[arg3];
								local306 = local62 * this.anIntArray244[local56] + this.anIntArray240[local56] * local287 + 16383 >> 14;
								this.anIntArray244[local56] = local287 * this.anIntArray244[local56] + 16383 - local62 * this.anIntArray240[local56] >> 14;
								this.anIntArray240[local56] = local306;
							}
							this.anIntArray240[local56] += Static272.anInt4374;
							this.anIntArray242[local56] += Static658.anInt9800;
							this.anIntArray244[local56] += Static393.anInt6145;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local56 = local162[local164];
							this.anIntArray240[local56] -= Static272.anInt4374;
							this.anIntArray242[local56] -= Static658.anInt9800;
							this.anIntArray244[local56] -= Static393.anInt6145;
							if (arg2 != 0) {
								local62 = Class361.anIntArray741[arg2];
								local287 = Class361.anIntArray740[arg2];
								local306 = local287 * this.anIntArray242[local56] + 16383 - this.anIntArray244[local56] * local62 >> 14;
								this.anIntArray244[local56] = this.anIntArray244[local56] * local287 + this.anIntArray242[local56] * local62 + 16383 >> 14;
								this.anIntArray242[local56] = local306;
							}
							if (arg4 != 0) {
								local62 = Class361.anIntArray741[arg4];
								local287 = Class361.anIntArray740[arg4];
								local306 = local62 * this.anIntArray242[local56] + this.anIntArray240[local56] * local287 + 16383 >> 14;
								this.anIntArray242[local56] = local287 * this.anIntArray242[local56] + 16383 - local62 * this.anIntArray240[local56] >> 14;
								this.anIntArray240[local56] = local306;
							}
							if (arg3 != 0) {
								local62 = Class361.anIntArray741[arg3];
								local287 = Class361.anIntArray740[arg3];
								local306 = local287 * this.anIntArray240[local56] + this.anIntArray244[local56] * local62 + 16383 >> 14;
								this.anIntArray244[local56] = this.anIntArray244[local56] * local287 + 16383 - this.anIntArray240[local56] * local62 >> 14;
								this.anIntArray240[local56] = local306;
							}
							this.anIntArray240[local56] += Static272.anInt4374;
							this.anIntArray242[local56] += Static658.anInt9800;
							this.anIntArray244[local56] += Static393.anInt6145;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local40 = arg1[local32];
					if (local40 < this.anIntArrayArray66.length) {
						local54 = this.anIntArrayArray66[local40];
						for (local56 = 0; local56 < local54.length; local56++) {
							local62 = local54[local56];
							local287 = this.anIntArray243[local62];
							local306 = this.anIntArray243[local62 + 1];
							for (local774 = local287; local774 < local306; local774++) {
								local783 = this.aShortArray50[local774] - 1;
								if (local783 == -1) {
									break;
								}
								@Pc(798) int local798;
								@Pc(802) int local802;
								@Pc(821) int local821;
								if (arg4 != 0) {
									local798 = Class361.anIntArray741[arg4];
									local802 = Class361.anIntArray740[arg4];
									local821 = this.aShortArray49[local783] * local798 + this.aShortArray47[local783] * local802 + 16383 >> 14;
									this.aShortArray49[local783] = (short) (this.aShortArray49[local783] * local802 + 16383 - this.aShortArray47[local783] * local798 >> 14);
									this.aShortArray47[local783] = (short) local821;
								}
								if (arg2 != 0) {
									local798 = Class361.anIntArray741[arg2];
									local802 = Class361.anIntArray740[arg2];
									local821 = this.aShortArray49[local783] * local802 + 16383 - this.aShortArray39[local783] * local798 >> 14;
									this.aShortArray39[local783] = (short) (local798 * this.aShortArray49[local783] + local802 * this.aShortArray39[local783] + 16383 >> 14);
									this.aShortArray49[local783] = (short) local821;
								}
								if (arg3 != 0) {
									local798 = Class361.anIntArray741[arg3];
									local802 = Class361.anIntArray740[arg3];
									local821 = local802 * this.aShortArray47[local783] + this.aShortArray39[local783] * local798 + 16383 >> 14;
									this.aShortArray39[local783] = (short) (local802 * this.aShortArray39[local783] + 16383 - local798 * this.aShortArray47[local783] >> 14);
									this.aShortArray47[local783] = (short) local821;
								}
							}
						}
					}
				}
				this.method2554();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray66.length) {
					local162 = this.anIntArrayArray66[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local56 = local162[local164];
						this.anIntArray240[local56] -= Static272.anInt4374;
						this.anIntArray242[local56] -= Static658.anInt9800;
						this.anIntArray244[local56] -= Static393.anInt6145;
						this.anIntArray240[local56] = arg2 * this.anIntArray240[local56] >> 7;
						this.anIntArray242[local56] = arg3 * this.anIntArray242[local56] >> 7;
						this.anIntArray244[local56] = arg4 * this.anIntArray244[local56] >> 7;
						this.anIntArray240[local56] += Static272.anInt4374;
						this.anIntArray242[local56] += Static658.anInt9800;
						this.anIntArray244[local56] += Static393.anInt6145;
					}
				}
			}
		} else {
			@Pc(1265) Class18 local1265;
			@Pc(1145) boolean local1145;
			@Pc(1260) Class298 local1260;
			if (arg0 == 5) {
				if (this.anIntArrayArray68 != null) {
					local1145 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray68.length > local40) {
							local54 = this.anIntArrayArray68[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								local287 = (this.aByteArray33[local62] & 0xFF) + (arg2 * 8);
								if (local287 < 0) {
									local287 = 0;
								} else if (local287 > 255) {
									local287 = 255;
								}
								this.aByteArray33[local62] = (byte) local287;
							}
							local1145 |= local54.length > 0;
						}
					}
					if (local1145) {
						if (this.aClass298Array1 != null) {
							for (local40 = 0; local40 < this.anInt2713; local40++) {
								local1260 = this.aClass298Array1[local40];
								local1265 = this.aClass18Array1[local40];
								local1265.anInt269 = local1265.anInt269 & 0xFFFFFF | 255 - (this.aByteArray33[local1260.anInt7575] & 0xFF) << 24;
							}
						}
						this.method2563();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray68 != null) {
					local1145 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray68.length) {
							local54 = this.anIntArrayArray68[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								local287 = this.aShortArray40[local62] & 0xFFFF;
								local306 = local287 >> 10 & 0x3F;
								local774 = local287 >> 7 & 0x7;
								local783 = local287 & 0x7F;
								@Pc(1375) int local1375 = local306 + arg2 & 0x3F;
								local774 += arg3 / 4;
								local783 += arg4;
								if (local774 < 0) {
									local774 = 0;
								} else if (local774 > 7) {
									local774 = 7;
								}
								if (local783 < 0) {
									local783 = 0;
								} else if (local783 > 127) {
									local783 = 127;
								}
								this.aShortArray40[local62] = (short) (local774 << 7 | local1375 << 10 | local783);
							}
							local1145 |= local54.length > 0;
						}
					}
					if (local1145) {
						if (this.aClass298Array1 != null) {
							for (local40 = 0; local40 < this.anInt2713; local40++) {
								local1260 = this.aClass298Array1[local40];
								local1265 = this.aClass18Array1[local40];
								local1265.anInt269 = Static154.anIntArray237[this.aShortArray40[local1260.anInt7575] & 0xFFFF] & 0xFFFFFF | local1265.anInt269 & 0xFF000000;
							}
						}
						this.method2563();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray67 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray67.length) {
							local162 = this.anIntArrayArray67[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1265 = this.aClass18Array1[local162[local164]];
								local1265.anInt262 += arg2;
								local1265.anInt263 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray67 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray67.length) {
							local162 = this.anIntArrayArray67[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1265 = this.aClass18Array1[local162[local164]];
								local1265.anInt268 = arg2 * local1265.anInt268 >> 7;
								local1265.anInt266 = arg3 * local1265.anInt266 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray67 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray67.length > local32) {
						local162 = this.anIntArrayArray67[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local1265 = this.aClass18Array1[local162[local164]];
							local1265.anInt267 = local1265.anInt267 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2773; local7++) {
			this.anIntArray244[local7] = -this.anIntArray244[local7];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt2759; local31++) {
			this.aShortArray39[local31] = (short) -this.aShortArray39[local31];
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2715; local58++) {
			@Pc(69) short local69 = this.aShortArray43[local58];
			this.aShortArray43[local58] = this.aShortArray51[local58];
			this.aShortArray51[local58] = local69;
		}
		this.method2549();
		this.method2554();
		this.method2562();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2720;
	}

	@OriginalMember(owner = "client!eu", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(58) int local58;
		@Pc(40) int local40;
		@Pc(50) int[] local50;
		@Pc(52) int local52;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static658.anInt9800 = 0;
			Static393.anInt6145 = 0;
			Static272.anInt4374 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (this.anIntArrayArray66.length > local40) {
					local50 = this.anIntArrayArray66[local40];
					for (local52 = 0; local52 < local50.length; local52++) {
						local58 = local50[local52];
						if (this.aShortArray41 == null || (this.aShortArray41[local58] & arg6) != 0) {
							Static272.anInt4374 += this.anIntArray240[local58];
							Static658.anInt9800 += this.anIntArray242[local58];
							local30++;
							Static393.anInt6145 += this.anIntArray244[local58];
						}
					}
				}
			}
			if (local30 <= 0) {
				Static658.anInt9800 = arg3;
				Static272.anInt4374 = arg2;
				Static393.anInt6145 = arg4;
			} else {
				Static272.aBoolean336 = true;
				Static272.anInt4374 = Static272.anInt4374 / local30 + arg2;
				Static658.anInt9800 = arg3 + Static658.anInt9800 / local30;
				Static393.anInt6145 = arg4 + Static393.anInt6145 / local30;
			}
			return;
		}
		@Pc(256) int[] local256;
		@Pc(258) int local258;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
				local40 = arg7[8] * arg4 + arg7[6] * arg2 + arg3 * arg7[7] + 8192 >> 14;
				arg4 = local40;
				arg3 = local32;
				arg2 = local30;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray66.length) {
					local256 = this.anIntArrayArray66[local32];
					for (local258 = 0; local258 < local256.length; local258++) {
						local52 = local256[local258];
						if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local52]) != 0) {
							this.anIntArray240[local52] += arg2;
							this.anIntArray242[local52] += arg3;
							this.anIntArray244[local52] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(393) int local393;
		@Pc(415) int local415;
		@Pc(437) int local437;
		@Pc(472) int local472;
		@Pc(476) int local476;
		@Pc(480) int local480;
		@Pc(484) int local484;
		@Pc(492) int local492;
		@Pc(500) int local500;
		@Pc(654) int local654;
		@Pc(680) int local680;
		@Pc(685) int local685;
		@Pc(693) int local693;
		@Pc(698) int local698;
		@Pc(702) int local702;
		@Pc(706) int local706;
		@Pc(708) int local708;
		@Pc(846) int[] local846;
		@Pc(848) int local848;
		@Pc(854) int local854;
		@Pc(858) int local858;
		@Pc(860) int local860;
		@Pc(995) int local995;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray66.length > local32) {
						local256 = this.anIntArrayArray66[local32];
						for (local258 = 0; local258 < local256.length; local258++) {
							local52 = local256[local258];
							if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local52]) != 0) {
								this.anIntArray240[local52] -= Static272.anInt4374;
								this.anIntArray242[local52] -= Static658.anInt9800;
								this.anIntArray244[local52] -= Static393.anInt6145;
								if (arg4 != 0) {
									local58 = Class361.anIntArray741[arg4];
									local393 = Class361.anIntArray740[arg4];
									local415 = this.anIntArray242[local52] * local58 + local393 * this.anIntArray240[local52] + 16383 >> 14;
									this.anIntArray242[local52] = this.anIntArray242[local52] * local393 + 16383 - this.anIntArray240[local52] * local58 >> 14;
									this.anIntArray240[local52] = local415;
								}
								if (arg2 != 0) {
									local58 = Class361.anIntArray741[arg2];
									local393 = Class361.anIntArray740[arg2];
									local415 = local393 * this.anIntArray242[local52] + 16383 - local58 * this.anIntArray244[local52] >> 14;
									this.anIntArray244[local52] = local58 * this.anIntArray242[local52] + local393 * this.anIntArray244[local52] + 16383 >> 14;
									this.anIntArray242[local52] = local415;
								}
								if (arg3 != 0) {
									local58 = Class361.anIntArray741[arg3];
									local393 = Class361.anIntArray740[arg3];
									local415 = this.anIntArray244[local52] * local58 + local393 * this.anIntArray240[local52] + 16383 >> 14;
									this.anIntArray244[local52] = this.anIntArray244[local52] * local393 + 16383 - local58 * this.anIntArray240[local52] >> 14;
									this.anIntArray240[local52] = local415;
								}
								this.anIntArray240[local52] += Static272.anInt4374;
								this.anIntArray242[local52] += Static658.anInt9800;
								this.anIntArray244[local52] += Static393.anInt6145;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray66.length) {
							local50 = this.anIntArrayArray66[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local58]) != 0) {
									local393 = this.anIntArray243[local58];
									local415 = this.anIntArray243[local58 + 1];
									for (local437 = local393; local437 < local415; local437++) {
										local472 = this.aShortArray50[local437] - 1;
										if (local472 == -1) {
											break;
										}
										if (arg4 != 0) {
											local476 = Class361.anIntArray741[arg4];
											local480 = Class361.anIntArray740[arg4];
											local484 = local480 * this.aShortArray47[local472] + local476 * this.aShortArray49[local472] + 16383 >> 14;
											this.aShortArray49[local472] = (short) (local480 * this.aShortArray49[local472] + 16383 - this.aShortArray47[local472] * local476 >> 14);
											this.aShortArray47[local472] = (short) local484;
										}
										if (arg2 != 0) {
											local476 = Class361.anIntArray741[arg2];
											local480 = Class361.anIntArray740[arg2];
											local484 = this.aShortArray49[local472] * local480 + 16383 - local476 * this.aShortArray39[local472] >> 14;
											this.aShortArray39[local472] = (short) (this.aShortArray49[local472] * local476 + this.aShortArray39[local472] * local480 + 16383 >> 14);
											this.aShortArray49[local472] = (short) local484;
										}
										if (arg3 != 0) {
											local476 = Class361.anIntArray741[arg3];
											local480 = Class361.anIntArray740[arg3];
											local484 = local476 * this.aShortArray39[local472] + local480 * this.aShortArray47[local472] + 16383 >> 14;
											this.aShortArray39[local472] = (short) (this.aShortArray39[local472] * local480 + 16383 - local476 * this.aShortArray47[local472] >> 14);
											this.aShortArray47[local472] = (short) local484;
										}
									}
								}
							}
						}
					}
					this.method2554();
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local258 = arg7[12] << 4;
				local52 = arg7[13] << 4;
				local58 = arg7[14] << 4;
				if (Static272.aBoolean336) {
					local393 = Static393.anInt6145 * arg7[6] + Static658.anInt9800 * arg7[3] + arg7[0] * Static272.anInt4374 + 8192 >> 14;
					local415 = arg7[1] * Static272.anInt4374 + arg7[4] * Static658.anInt9800 + Static393.anInt6145 * arg7[7] + 8192 >> 14;
					local437 = Static393.anInt6145 * arg7[8] + arg7[5] * Static658.anInt9800 + Static272.anInt4374 * arg7[2] + 8192 >> 14;
					local393 += local258;
					local415 += local52;
					local437 += local58;
					Static272.anInt4374 = local393;
					Static658.anInt9800 = local415;
					Static272.aBoolean336 = false;
					Static393.anInt6145 = local437;
				}
				@Pc(460) int[] local460 = new int[9];
				local415 = Class361.anIntArray740[arg2];
				local437 = Class361.anIntArray741[arg2];
				local472 = Class361.anIntArray740[arg3];
				local476 = Class361.anIntArray741[arg3];
				local480 = Class361.anIntArray740[arg4];
				local484 = Class361.anIntArray741[arg4];
				local492 = local480 * local437 + 8192 >> 14;
				local500 = local437 * local484 + 8192 >> 14;
				local460[3] = local415 * local484 + 8192 >> 14;
				local460[1] = local484 * -local472 + local476 * local492 + 8192 >> 14;
				local460[4] = local480 * local415 + 8192 >> 14;
				local460[8] = local415 * local472 + 8192 >> 14;
				local460[2] = local415 * local476 + 8192 >> 14;
				local460[5] = -local437;
				local460[7] = local484 * local476 + local492 * local472 + 8192 >> 14;
				local460[0] = local480 * local472 + local476 * local500 + 8192 >> 14;
				local460[6] = local472 * local500 + -local476 * local480 + 8192 >> 14;
				@Pc(628) int local628 = local460[2] * -Static393.anInt6145 + local460[1] * -Static658.anInt9800 + local460[0] * -Static272.anInt4374 + 8192 >> 14;
				local654 = -Static272.anInt4374 * local460[3] + -Static658.anInt9800 * local460[4] + -Static393.anInt6145 * local460[5] + 8192 >> 14;
				local680 = -Static658.anInt9800 * local460[7] + -Static272.anInt4374 * local460[6] + -Static393.anInt6145 * local460[8] + 8192 >> 14;
				local685 = local628 + Static272.anInt4374;
				@Pc(689) int local689 = local654 + Static658.anInt9800;
				local693 = Static393.anInt6145 + local680;
				@Pc(696) int[] local696 = new int[9];
				for (local698 = 0; local698 < 3; local698++) {
					for (local702 = 0; local702 < 3; local702++) {
						local706 = 0;
						for (local708 = 0; local708 < 3; local708++) {
							local706 += arg7[local708 + local702 * 3] * local460[local698 * 3 + local708];
						}
						local696[local702 + local698 * 3] = local706 + 8192 >> 14;
					}
				}
				local702 = local52 * local460[1] + local460[0] * local258 + local460[2] * local58 + 8192 >> 14;
				local706 = local258 * local460[3] + local52 * local460[4] + local58 * local460[5] + 8192 >> 14;
				local702 += local685;
				local706 += local689;
				local708 = local460[7] * local52 + local460[6] * local258 + local58 * local460[8] + 8192 >> 14;
				local708 += local693;
				local846 = new int[9];
				for (local848 = 0; local848 < 3; local848++) {
					for (local854 = 0; local854 < 3; local854++) {
						local858 = 0;
						for (local860 = 0; local860 < 3; local860++) {
							local858 += local696[local860 * 3 + local854] * arg7[local860 + local848 * 3];
						}
						local846[local854 + local848 * 3] = local858 + 8192 >> 14;
					}
				}
				local854 = arg7[1] * local706 + local702 * arg7[0] + local708 * arg7[2] + 8192 >> 14;
				local858 = local708 * arg7[5] + local702 * arg7[3] + local706 * arg7[4] + 8192 >> 14;
				local858 += local32;
				local854 += local30;
				local860 = arg7[8] * local708 + arg7[6] * local702 + local706 * arg7[7] + 8192 >> 14;
				local860 += local40;
				for (local995 = 0; local995 < local8; local995++) {
					@Pc(1003) int local1003 = arg1[local995];
					if (local1003 < this.anIntArrayArray66.length) {
						@Pc(1013) int[] local1013 = this.anIntArrayArray66[local1003];
						for (@Pc(1015) int local1015 = 0; local1015 < local1013.length; local1015++) {
							@Pc(1021) int local1021 = local1013[local1015];
							if (this.aShortArray41 == null || (this.aShortArray41[local1021] & arg6) != 0) {
								@Pc(1064) int local1064 = local846[2] * this.anIntArray244[local1021] + local846[1] * this.anIntArray242[local1021] + this.anIntArray240[local1021] * local846[0] + 8192 >> 14;
								@Pc(1096) int local1096 = this.anIntArray242[local1021] * local846[4] + local846[3] * this.anIntArray240[local1021] + this.anIntArray244[local1021] * local846[5] + 8192 >> 14;
								@Pc(1100) int local1100 = local1096 + local858;
								@Pc(1104) int local1104 = local1064 + local854;
								@Pc(1136) int local1136 = this.anIntArray240[local1021] * local846[6] + this.anIntArray242[local1021] * local846[7] + this.anIntArray244[local1021] * local846[8] + 8192 >> 14;
								this.anIntArray240[local1021] = local1104;
								@Pc(1145) int local1145 = local1136 + local860;
								this.anIntArray242[local1021] = local1100;
								this.anIntArray244[local1021] = local1145;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2686) Class18 local2686;
			@Pc(2555) boolean local2555;
			@Pc(2681) Class298 local2681;
			if (arg0 == 5) {
				if (this.anIntArrayArray68 != null) {
					local2555 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray68.length) {
							local50 = this.anIntArrayArray68[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray45 == null || (arg6 & this.aShortArray45[local58]) != 0) {
									local393 = (this.aByteArray33[local58] & 0xFF) + (arg2 * 8);
									if (local393 < 0) {
										local393 = 0;
									} else if (local393 > 255) {
										local393 = 255;
									}
									this.aByteArray33[local58] = (byte) local393;
								}
							}
							local2555 |= local50.length > 0;
						}
					}
					if (local2555) {
						if (this.aClass298Array1 != null) {
							for (local40 = 0; local40 < this.anInt2713; local40++) {
								local2681 = this.aClass298Array1[local40];
								local2686 = this.aClass18Array1[local40];
								local2686.anInt269 = 255 - (this.aByteArray33[local2681.anInt7575] & 0xFF) << 24 | local2686.anInt269 & 0xFFFFFF;
							}
						}
						this.method2563();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray68 != null) {
					local2555 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray68.length) {
							local50 = this.anIntArrayArray68[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray45 == null || (this.aShortArray45[local58] & arg6) != 0) {
									local393 = this.aShortArray40[local58] & 0xFFFF;
									local415 = local393 >> 10 & 0x3F;
									local437 = local393 >> 7 & 0x7;
									local472 = local393 & 0x7F;
									local437 += arg3 / 4;
									@Pc(2810) int local2810 = arg2 + local415 & 0x3F;
									if (local437 < 0) {
										local437 = 0;
									} else if (local437 > 7) {
										local437 = 7;
									}
									local472 += arg4;
									if (local472 < 0) {
										local472 = 0;
									} else if (local472 > 127) {
										local472 = 127;
									}
									this.aShortArray40[local58] = (short) (local437 << 7 | local2810 << 10 | local472);
								}
							}
							local2555 |= local50.length > 0;
						}
					}
					if (local2555) {
						if (this.aClass298Array1 != null) {
							for (local40 = 0; local40 < this.anInt2713; local40++) {
								local2681 = this.aClass298Array1[local40];
								local2686 = this.aClass18Array1[local40];
								local2686.anInt269 = local2686.anInt269 & 0xFF000000 | Static154.anIntArray237[this.aShortArray40[local2681.anInt7575] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method2563();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray67 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray67.length > local32) {
							local256 = this.anIntArrayArray67[local32];
							for (local258 = 0; local258 < local256.length; local258++) {
								local2686 = this.aClass18Array1[local256[local258]];
								local2686.anInt263 += arg3;
								local2686.anInt262 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray67 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray67.length) {
							local256 = this.anIntArrayArray67[local32];
							for (local258 = 0; local258 < local256.length; local258++) {
								local2686 = this.aClass18Array1[local256[local258]];
								local2686.anInt268 = arg2 * local2686.anInt268 >> 7;
								local2686.anInt266 = arg3 * local2686.anInt266 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray67 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray67.length) {
						local256 = this.anIntArrayArray67[local32];
						for (local258 = 0; local258 < local256.length; local258++) {
							local2686 = this.aClass18Array1[local256[local258]];
							local2686.anInt267 = arg2 + local2686.anInt267 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray66.length > local32) {
					local256 = this.anIntArrayArray66[local32];
					for (local258 = 0; local258 < local256.length; local258++) {
						local52 = local256[local258];
						if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local52]) != 0) {
							this.anIntArray240[local52] -= Static272.anInt4374;
							this.anIntArray242[local52] -= Static658.anInt9800;
							this.anIntArray244[local52] -= Static393.anInt6145;
							this.anIntArray240[local52] = this.anIntArray240[local52] * arg2 >> 7;
							this.anIntArray242[local52] = arg3 * this.anIntArray242[local52] >> 7;
							this.anIntArray244[local52] = arg4 * this.anIntArray244[local52] >> 7;
							this.anIntArray240[local52] += Static272.anInt4374;
							this.anIntArray242[local52] += Static658.anInt9800;
							this.anIntArray244[local52] += Static393.anInt6145;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local258 = arg7[12] << 4;
			local52 = arg7[13] << 4;
			local58 = arg7[14] << 4;
			if (Static272.aBoolean336) {
				local393 = arg7[6] * Static393.anInt6145 + arg7[0] * Static272.anInt4374 + Static658.anInt9800 * arg7[3] + 8192 >> 14;
				local415 = arg7[4] * Static658.anInt9800 + Static272.anInt4374 * arg7[1] + Static393.anInt6145 * arg7[7] + 8192 >> 14;
				local393 += local258;
				local415 += local52;
				local437 = Static393.anInt6145 * arg7[8] + arg7[5] * Static658.anInt9800 + Static272.anInt4374 * arg7[2] + 8192 >> 14;
				Static272.anInt4374 = local393;
				Static658.anInt9800 = local415;
				local437 += local58;
				Static272.aBoolean336 = false;
				Static393.anInt6145 = local437;
			}
			local393 = arg2 << 15 >> 7;
			local415 = arg3 << 15 >> 7;
			local437 = arg4 << 15 >> 7;
			local472 = local393 * -Static272.anInt4374 + 8192 >> 14;
			local476 = -Static658.anInt9800 * local415 + 8192 >> 14;
			local480 = local437 * -Static393.anInt6145 + 8192 >> 14;
			local484 = Static272.anInt4374 + local472;
			local492 = Static658.anInt9800 + local476;
			local500 = local480 + Static393.anInt6145;
			@Pc(1928) int[] local1928 = new int[] { arg7[0] * local393 + 8192 >> 14, arg7[3] * local393 + 8192 >> 14, arg7[6] * local393 + 8192 >> 14, arg7[1] * local415 + 8192 >> 14, local415 * arg7[4] + 8192 >> 14, arg7[7] * local415 + 8192 >> 14, arg7[2] * local437 + 8192 >> 14, local437 * arg7[5] + 8192 >> 14, arg7[8] * local437 + 8192 >> 14 };
			local654 = local393 * local258 + 8192 >> 14;
			local680 = local415 * local52 + 8192 >> 14;
			local685 = local437 * local58 + 8192 >> 14;
			@Pc(2064) int local2064 = local654 + local484;
			@Pc(2068) int local2068 = local680 + local492;
			@Pc(2072) int local2072 = local685 + local500;
			@Pc(2075) int[] local2075 = new int[9];
			@Pc(2081) int local2081;
			for (local693 = 0; local693 < 3; local693++) {
				for (local2081 = 0; local2081 < 3; local2081++) {
					local698 = 0;
					for (local702 = 0; local702 < 3; local702++) {
						local698 += arg7[local693 * 3 + local702] * local1928[local2081 + local702 * 3];
					}
					local2075[local693 * 3 + local2081] = local698 + 8192 >> 14;
				}
			}
			local2081 = arg7[1] * local2068 + arg7[0] * local2064 + local2072 * arg7[2] + 8192 >> 14;
			local698 = arg7[5] * local2072 + local2064 * arg7[3] + local2068 * arg7[4] + 8192 >> 14;
			local702 = local2068 * arg7[7] + local2064 * arg7[6] + arg7[8] * local2072 + 8192 >> 14;
			local2081 += local30;
			local698 += local32;
			local702 += local40;
			for (local706 = 0; local706 < local8; local706++) {
				local708 = arg1[local706];
				if (this.anIntArrayArray66.length > local708) {
					local846 = this.anIntArrayArray66[local708];
					for (local848 = 0; local848 < local846.length; local848++) {
						local854 = local846[local848];
						if (this.aShortArray41 == null || (arg6 & this.aShortArray41[local854]) != 0) {
							local858 = this.anIntArray244[local854] * local2075[2] + this.anIntArray240[local854] * local2075[0] + local2075[1] * this.anIntArray242[local854] + 8192 >> 14;
							local860 = local2075[4] * this.anIntArray242[local854] + this.anIntArray240[local854] * local2075[3] + this.anIntArray244[local854] * local2075[5] + 8192 >> 14;
							@Pc(2333) int local2333 = local858 + local2081;
							@Pc(2337) int local2337 = local860 + local698;
							local995 = local2075[8] * this.anIntArray244[local854] + local2075[6] * this.anIntArray240[local854] + this.anIntArray242[local854] * local2075[7] + 8192 >> 14;
							this.anIntArray240[local854] = local2333;
							@Pc(2377) int local2377 = local995 + local702;
							this.anIntArray242[local854] = local2337;
							this.anIntArray244[local854] = local2377;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "(I)V")
	private void method2554() {
		if ((this.anInt2765 & 0x37) == 0) {
			if (this.aClass371_3 == null) {
				return;
			}
			this.aClass371_3.aBoolean736 = false;
		} else if (this.aClass371_4 != null) {
			this.aClass371_4.aBoolean736 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!tt;Lclient!ima;II)V")
	@Override
	public void method7484(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class8_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2759 == 0) {
			return;
		}
		@Pc(14) Class73_Sub1 local14 = this.aClass19_Sub1_6.aClass73_Sub1_16;
		if (!this.aBoolean232) {
			this.method2561();
		}
		@Pc(25) Class73_Sub1 local25 = (Class73_Sub1) arg0;
		Static115.aFloat50 = local25.aFloat43 * local14.aFloat47 + local25.aFloat46 * local14.aFloat45 + local14.aFloat36 * local25.aFloat37 + local14.aFloat43;
		Static624.aFloat198 = local25.aFloat40 * local14.aFloat45 + local25.aFloat42 * local14.aFloat36 + local25.aFloat36 * local14.aFloat47;
		@Pc(72) float local72 = Static624.aFloat198 * (float) this.anInt2768 + Static115.aFloat50;
		@Pc(80) float local80 = Static115.aFloat50 + (float) this.anInt2720 * Static624.aFloat198;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.anInt2701 + local80;
			local97 = (float) this.anInt2701 + local72;
		} else {
			local97 = local80 + (float) this.anInt2701;
			local91 = local72 - (float) this.anInt2701;
		}
		if (this.aClass19_Sub1_6.aFloat196 <= local91 || local97 <= (float) this.aClass19_Sub1_6.anInt9181) {
			return;
		}
		Static279.aFloat82 = local25.aFloat43 * local14.aFloat38 + local14.aFloat40 * local25.aFloat37 + local14.aFloat39 * local25.aFloat46 + local14.aFloat46;
		Static18.aFloat2 = local14.aFloat38 * local25.aFloat36 + local14.aFloat40 * local25.aFloat42 + local25.aFloat40 * local14.aFloat39;
		@Pc(175) float local175 = Static18.aFloat2 * (float) this.anInt2768 + Static279.aFloat82;
		@Pc(183) float local183 = Static279.aFloat82 + (float) this.anInt2720 * Static18.aFloat2;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local175 > local183) {
			local198 = ((float) -this.anInt2701 + local183) * (float) this.aClass19_Sub1_6.anInt9151;
			local209 = (float) this.aClass19_Sub1_6.anInt9151 * ((float) this.anInt2701 + local175);
		} else {
			local198 = (local175 - (float) this.anInt2701) * (float) this.aClass19_Sub1_6.anInt9151;
			local209 = (float) this.aClass19_Sub1_6.anInt9151 * (local183 + (float) this.anInt2701);
		}
		if (local198 / (float) arg2 >= this.aClass19_Sub1_6.aFloat190 || local209 / (float) arg2 <= this.aClass19_Sub1_6.aFloat185) {
			return;
		}
		Static580.aFloat176 = local25.aFloat42 * local14.aFloat42 + local25.aFloat40 * local14.aFloat44 + local14.aFloat41 * local25.aFloat36;
		Static706.aFloat217 = local14.aFloat37 + local14.aFloat44 * local25.aFloat46 + local14.aFloat42 * local25.aFloat37 + local14.aFloat41 * local25.aFloat43;
		@Pc(303) float local303 = Static706.aFloat217 + (float) this.anInt2768 * Static580.aFloat176;
		@Pc(311) float local311 = (float) this.anInt2720 * Static580.aFloat176 + Static706.aFloat217;
		@Pc(338) float local338;
		@Pc(326) float local326;
		if (local303 > local311) {
			local326 = (local303 + (float) this.anInt2701) * (float) this.aClass19_Sub1_6.anInt9180;
			local338 = (float) this.aClass19_Sub1_6.anInt9180 * ((float) -this.anInt2701 + local311);
		} else {
			local338 = (float) this.aClass19_Sub1_6.anInt9180 * ((float) -this.anInt2701 + local303);
			local326 = (local311 + (float) this.anInt2701) * (float) this.aClass19_Sub1_6.anInt9180;
		}
		if (this.aClass19_Sub1_6.aFloat188 <= local338 / (float) arg2 || this.aClass19_Sub1_6.aFloat183 >= local326 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass298Array1 != null) {
			Static348.aFloat107 = local25.aFloat39 * local14.aFloat44 + local14.aFloat42 * local25.aFloat44 + local14.aFloat41 * local25.aFloat45;
			Static355.aFloat111 = local14.aFloat45 * local25.aFloat39 + local25.aFloat44 * local14.aFloat36 + local25.aFloat45 * local14.aFloat47;
			Static654.aFloat209 = local25.aFloat38 * local14.aFloat44 + local25.aFloat41 * local14.aFloat42 + local25.aFloat47 * local14.aFloat41;
			Static53.aFloat28 = local14.aFloat38 * local25.aFloat47 + local25.aFloat38 * local14.aFloat39 + local14.aFloat40 * local25.aFloat41;
			Static305.aFloat86 = local14.aFloat40 * local25.aFloat44 + local25.aFloat39 * local14.aFloat39 + local25.aFloat45 * local14.aFloat38;
			Static382.aFloat114 = local25.aFloat47 * local14.aFloat47 + local25.aFloat38 * local14.aFloat45 + local14.aFloat36 * local25.aFloat41;
		}
		if (arg1 != null) {
			@Pc(512) int local512 = this.anInt2716 + this.anInt2723 >> 1;
			@Pc(520) int local520 = this.anInt2771 + this.anInt2758 >> 1;
			@Pc(539) int local539 = (int) ((float) local520 * Static53.aFloat28 + (float) local512 * Static305.aFloat86 + Static279.aFloat82 + Static18.aFloat2 * (float) this.anInt2768);
			@Pc(558) int local558 = (int) ((float) local512 * Static348.aFloat107 + Static706.aFloat217 + (float) this.anInt2768 * Static580.aFloat176 + Static654.aFloat209 * (float) local520);
			@Pc(577) int local577 = (int) (Static115.aFloat50 + Static355.aFloat111 * (float) local512 + (float) this.anInt2768 * Static624.aFloat198 + Static382.aFloat114 * (float) local520);
			@Pc(596) int local596 = (int) (Static279.aFloat82 + (float) local512 * Static305.aFloat86 + (float) this.anInt2720 * Static18.aFloat2 + Static53.aFloat28 * (float) local520);
			@Pc(615) int local615 = (int) (Static654.aFloat209 * (float) local520 + (float) local512 * Static348.aFloat107 + Static706.aFloat217 + Static580.aFloat176 * (float) this.anInt2720);
			arg1.anInt4501 = this.aClass19_Sub1_6.anInt9170 + this.aClass19_Sub1_6.anInt9151 * local596 / arg2;
			arg1.anInt4503 = this.aClass19_Sub1_6.anInt9163 + local615 * this.aClass19_Sub1_6.anInt9180 / arg2;
			arg1.anInt4505 = this.aClass19_Sub1_6.anInt9163 + this.aClass19_Sub1_6.anInt9180 * local558 / arg2;
			@Pc(675) int local675 = (int) ((float) this.anInt2720 * Static624.aFloat198 + Static115.aFloat50 + Static355.aFloat111 * (float) local512 + Static382.aFloat114 * (float) local520);
			arg1.anInt4504 = local539 * this.aClass19_Sub1_6.anInt9151 / arg2 + this.aClass19_Sub1_6.anInt9170;
			if (local577 >= this.aClass19_Sub1_6.anInt9181 || this.aClass19_Sub1_6.anInt9181 <= local675) {
				arg1.aBoolean352 = true;
				arg1.anInt4502 = this.aClass19_Sub1_6.anInt9170 + (this.anInt2701 + local539) * this.aClass19_Sub1_6.anInt9151 / arg2 - arg1.anInt4504;
			}
		}
		this.aClass19_Sub1_6.method8046((float) arg2);
		this.aClass19_Sub1_6.method8111();
		this.aClass19_Sub1_6.method8024(local25);
		this.method2566();
		this.method2552();
	}

	@OriginalMember(owner = "client!eu", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2758;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIFIIIIFJILclient!dv;)S")
	private short method2555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class88 arg9) {
		@Pc(10) int local10 = this.anIntArray243[arg3];
		@Pc(17) int local17 = this.anIntArray243[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray50[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (arg7 == Static381.aLongArray10[local21]) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray50[local19] = (short) (this.anInt2759 + 1);
		Static381.aLongArray10[local19] = arg7;
		this.aShortArray42[this.anInt2759] = (short) arg5;
		this.aShortArray48[this.anInt2759] = (short) arg3;
		this.aShortArray47[this.anInt2759] = (short) arg4;
		this.aShortArray49[this.anInt2759] = (short) arg8;
		this.aShortArray39[this.anInt2759] = (short) arg0;
		this.aByteArray32[this.anInt2759] = (byte) arg1;
		if (2971 == 2971) {
			this.aFloatArray18[this.anInt2759] = arg2;
			this.lb[this.anInt2759] = arg6;
			return (short) this.anInt2759++;
		} else {
			return 84;
		}
	}

	@OriginalMember(owner = "client!eu", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray66 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt2767; local13++) {
			this.anIntArray240[local13] <<= 0x4;
			this.anIntArray242[local13] <<= 0x4;
			this.anIntArray244[local13] <<= 0x4;
		}
		Static393.anInt6145 = 0;
		Static272.anInt4374 = 0;
		Static658.anInt9800 = 0;
		return true;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg2 && arg0 > arg4 && arg7 > arg4) {
			return false;
		} else if (arg2 < arg4 && arg4 > arg0 && arg4 > arg7) {
			return false;
		} else if (arg6 > arg1 && arg1 < arg5 && arg3 > arg1) {
			return false;
		} else {
			return arg6 >= arg1 || arg5 >= arg1 || arg3 >= arg1;
		}
	}

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort36 = (short) arg0;
		this.method2563();
	}

	@OriginalMember(owner = "client!eu", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt2756;
	}

	@OriginalMember(owner = "client!eu", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class361.anIntArray741[arg0];
		@Pc(13) int local13 = Class361.anIntArray740[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2773; local15++) {
			@Pc(34) int local34 = this.anIntArray242[local15] * local13 - local9 * this.anIntArray244[local15] >> 14;
			this.anIntArray244[local15] = local13 * this.anIntArray244[local15] + local9 * this.anIntArray242[local15] >> 14;
			this.anIntArray242[local15] = local34;
		}
		this.method2549();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "()V")
	@Override
	protected void method7491() {
	}

	@OriginalMember(owner = "client!eu", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2723;
	}

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class361.anIntArray741[arg0];
		@Pc(13) int local13 = Class361.anIntArray740[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2773; local15++) {
			local33 = local9 * this.anIntArray244[local15] + this.anIntArray240[local15] * local13 >> 14;
			this.anIntArray244[local15] = local13 * this.anIntArray244[local15] - this.anIntArray240[local15] * local9 >> 14;
			this.anIntArray240[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt2759; local33++) {
			@Pc(85) int local85 = local13 * this.aShortArray47[local33] + this.aShortArray39[local33] * local9 >> 14;
			this.aShortArray39[local33] = (short) (this.aShortArray39[local33] * local13 - local9 * this.aShortArray47[local33] >> 14);
			this.aShortArray47[local33] = (short) local85;
		}
		this.method2549();
		this.method2554();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "()V")
	@Override
	public void method7479() {
		if (this.anInt2759 > 0 && this.anInt2745 > 0) {
			this.method2548();
			this.method2551();
			this.method2558();
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "()Z")
	@Override
	public boolean method7474() {
		if (this.aShortArray46 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray46.length; local13++) {
			if (this.aShortArray46[local13] != -1 && !this.aClass19_Sub1_6.anInterface4_10.method6814(this.aShortArray46[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!tt;Lclient!ima;I)V")
	@Override
	public void method7473(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class8_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2759 == 0) {
			return;
		}
		@Pc(14) Class73_Sub1 local14 = this.aClass19_Sub1_6.aClass73_Sub1_16;
		if (!this.aBoolean232) {
			this.method2561();
		}
		@Pc(25) Class73_Sub1 local25 = (Class73_Sub1) arg0;
		Static115.aFloat50 = local14.aFloat47 * local25.aFloat43 + local14.aFloat45 * local25.aFloat46 + local14.aFloat36 * local25.aFloat37 + local14.aFloat43;
		Static624.aFloat198 = local25.aFloat42 * local14.aFloat36 + local14.aFloat45 * local25.aFloat40 + local14.aFloat47 * local25.aFloat36;
		@Pc(72) float local72 = Static115.aFloat50 + Static624.aFloat198 * (float) this.anInt2768;
		@Pc(80) float local80 = Static115.aFloat50 + (float) this.anInt2720 * Static624.aFloat198;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local90 = (float) -this.anInt2701 + local80;
			local96 = local72 + (float) this.anInt2701;
		} else {
			local90 = local72 - (float) this.anInt2701;
			local96 = (float) this.anInt2701 + local80;
		}
		if (local90 >= this.aClass19_Sub1_6.aFloat187 || (float) this.aClass19_Sub1_6.anInt9181 >= local96) {
			return;
		}
		Static18.aFloat2 = local25.aFloat42 * local14.aFloat40 + local14.aFloat39 * local25.aFloat40 + local14.aFloat38 * local25.aFloat36;
		Static279.aFloat82 = local14.aFloat46 + local14.aFloat39 * local25.aFloat46 + local14.aFloat40 * local25.aFloat37 + local25.aFloat43 * local14.aFloat38;
		@Pc(175) float local175 = Static279.aFloat82 + Static18.aFloat2 * (float) this.anInt2768;
		@Pc(183) float local183 = Static279.aFloat82 + (float) this.anInt2720 * Static18.aFloat2;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local175 > local183) {
			local198 = (float) this.aClass19_Sub1_6.anInt9151 * (local183 - (float) this.anInt2701);
			local209 = (local175 + (float) this.anInt2701) * (float) this.aClass19_Sub1_6.anInt9151;
		} else {
			local209 = (float) this.aClass19_Sub1_6.anInt9151 * ((float) this.anInt2701 + local183);
			local198 = (float) this.aClass19_Sub1_6.anInt9151 * (local175 - (float) this.anInt2701);
		}
		if (local198 / local96 >= this.aClass19_Sub1_6.aFloat190 || this.aClass19_Sub1_6.aFloat185 >= local209 / local96) {
			return;
		}
		Static580.aFloat176 = local25.aFloat40 * local14.aFloat44 + local25.aFloat42 * local14.aFloat42 + local25.aFloat36 * local14.aFloat41;
		Static706.aFloat217 = local14.aFloat37 + local25.aFloat37 * local14.aFloat42 + local25.aFloat46 * local14.aFloat44 + local14.aFloat41 * local25.aFloat43;
		@Pc(300) float local300 = Static706.aFloat217 + Static580.aFloat176 * (float) this.anInt2768;
		@Pc(308) float local308 = (float) this.anInt2720 * Static580.aFloat176 + Static706.aFloat217;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local308 < local300) {
			local323 = (float) this.aClass19_Sub1_6.anInt9180 * (local308 - (float) this.anInt2701);
			local334 = (float) this.aClass19_Sub1_6.anInt9180 * ((float) this.anInt2701 + local300);
		} else {
			local334 = (float) this.aClass19_Sub1_6.anInt9180 * (local308 + (float) this.anInt2701);
			local323 = (float) this.aClass19_Sub1_6.anInt9180 * (local300 - (float) this.anInt2701);
		}
		if (local323 / local96 >= this.aClass19_Sub1_6.aFloat188 || local334 / local96 <= this.aClass19_Sub1_6.aFloat183) {
			return;
		}
		if (arg1 != null || this.aClass298Array1 != null) {
			Static654.aFloat209 = local14.aFloat41 * local25.aFloat47 + local25.aFloat38 * local14.aFloat44 + local14.aFloat42 * local25.aFloat41;
			Static382.aFloat114 = local14.aFloat45 * local25.aFloat38 + local25.aFloat41 * local14.aFloat36 + local14.aFloat47 * local25.aFloat47;
			Static348.aFloat107 = local14.aFloat41 * local25.aFloat45 + local14.aFloat44 * local25.aFloat39 + local14.aFloat42 * local25.aFloat44;
			Static355.aFloat111 = local14.aFloat47 * local25.aFloat45 + local14.aFloat36 * local25.aFloat44 + local14.aFloat45 * local25.aFloat39;
			Static305.aFloat86 = local25.aFloat44 * local14.aFloat40 + local25.aFloat39 * local14.aFloat39 + local14.aFloat38 * local25.aFloat45;
			Static53.aFloat28 = local14.aFloat38 * local25.aFloat47 + local14.aFloat39 * local25.aFloat38 + local25.aFloat41 * local14.aFloat40;
		}
		if (arg1 != null) {
			@Pc(499) boolean local499 = false;
			@Pc(501) boolean local501 = true;
			@Pc(509) int local509 = this.anInt2723 + this.anInt2716 >> 1;
			@Pc(517) int local517 = this.anInt2771 + this.anInt2758 >> 1;
			@Pc(536) int local536 = (int) ((float) local509 * Static305.aFloat86 + Static279.aFloat82 + (float) this.anInt2768 * Static18.aFloat2 + Static53.aFloat28 * (float) local517);
			@Pc(555) int local555 = (int) ((float) local509 * Static348.aFloat107 + Static706.aFloat217 + Static580.aFloat176 * (float) this.anInt2768 + Static654.aFloat209 * (float) local517);
			@Pc(574) int local574 = (int) (Static382.aFloat114 * (float) local517 + (float) local509 * Static355.aFloat111 + Static115.aFloat50 + Static624.aFloat198 * (float) this.anInt2768);
			if (this.aClass19_Sub1_6.anInt9181 <= local574) {
				arg1.anInt4505 = local555 * this.aClass19_Sub1_6.anInt9180 / local574 + this.aClass19_Sub1_6.anInt9163;
				arg1.anInt4504 = this.aClass19_Sub1_6.anInt9170 + this.aClass19_Sub1_6.anInt9151 * local536 / local574;
			} else {
				local499 = true;
			}
			@Pc(635) int local635 = (int) (Static53.aFloat28 * (float) local517 + Static305.aFloat86 * (float) local509 + Static279.aFloat82 + Static18.aFloat2 * (float) this.anInt2720);
			@Pc(654) int local654 = (int) ((float) this.anInt2720 * Static580.aFloat176 + Static348.aFloat107 * (float) local509 + Static706.aFloat217 + Static654.aFloat209 * (float) local517);
			@Pc(673) int local673 = (int) (Static624.aFloat198 * (float) this.anInt2720 + Static355.aFloat111 * (float) local509 + Static115.aFloat50 + (float) local517 * Static382.aFloat114);
			if (this.aClass19_Sub1_6.anInt9181 <= local673) {
				arg1.anInt4501 = this.aClass19_Sub1_6.anInt9170 + local635 * this.aClass19_Sub1_6.anInt9151 / local673;
				arg1.anInt4503 = local654 * this.aClass19_Sub1_6.anInt9180 / local673 + this.aClass19_Sub1_6.anInt9163;
			} else {
				local499 = true;
			}
			if (local499) {
				if (local574 < this.aClass19_Sub1_6.anInt9181 && local673 < this.aClass19_Sub1_6.anInt9181) {
					local501 = false;
				} else {
					@Pc(770) int local770;
					@Pc(781) int local781;
					@Pc(792) int local792;
					if (local574 < this.aClass19_Sub1_6.anInt9181) {
						local770 = (local673 - this.aClass19_Sub1_6.anInt9181 << 16) / (local673 - local574);
						local781 = local635 + ((local635 - local536) * local770 >> 16);
						local792 = (local770 * (local654 - local555) >> 16) + local654;
						arg1.anInt4504 = local781 * this.aClass19_Sub1_6.anInt9151 / this.aClass19_Sub1_6.anInt9181 + this.aClass19_Sub1_6.anInt9170;
						arg1.anInt4505 = this.aClass19_Sub1_6.anInt9163 + this.aClass19_Sub1_6.anInt9180 * local792 / this.aClass19_Sub1_6.anInt9181;
					} else if (this.aClass19_Sub1_6.anInt9181 > local673) {
						local770 = (local574 - this.aClass19_Sub1_6.anInt9181 << 16) / (local574 - local673);
						local781 = local536 + (local770 * (local536 - local635) >> 16);
						local792 = ((local555 - local654) * local770 >> 16) + local555;
						arg1.anInt4504 = this.aClass19_Sub1_6.anInt9170 + local781 * this.aClass19_Sub1_6.anInt9151 / this.aClass19_Sub1_6.anInt9181;
						arg1.anInt4505 = this.aClass19_Sub1_6.anInt9180 * local792 / this.aClass19_Sub1_6.anInt9181 + this.aClass19_Sub1_6.anInt9163;
					}
				}
			}
			if (local501) {
				if (local673 >= local574) {
					arg1.anInt4502 = (this.anInt2701 + local635) * this.aClass19_Sub1_6.anInt9151 / local673 + this.aClass19_Sub1_6.anInt9170 - arg1.anInt4501;
				} else {
					arg1.anInt4502 = this.aClass19_Sub1_6.anInt9170 + this.aClass19_Sub1_6.anInt9151 * (this.anInt2701 + local536) / local574 - arg1.anInt4504;
				}
				arg1.aBoolean352 = true;
			}
		}
		this.aClass19_Sub1_6.method8044();
		this.aClass19_Sub1_6.method8024(local25);
		this.method2566();
		this.method2552();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!eu;ZZLclient!eu;I)Lclient!ka;")
	private Class114 method2557(@OriginalArg(0) int arg0, @OriginalArg(1) Class114_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class114_Sub1 arg4) {
		arg4.anInt2765 = this.anInt2765;
		arg4.aShort36 = this.aShort36;
		arg4.anInt2713 = this.anInt2713;
		arg4.anInt2773 = this.anInt2773;
		arg4.aBoolean230 = this.aBoolean230;
		arg4.anInt2745 = this.anInt2745;
		arg4.aShort35 = this.aShort35;
		arg4.anInt2715 = this.anInt2715;
		arg4.anInt2759 = this.anInt2759;
		arg4.anInt2767 = this.anInt2767;
		arg4.anInt2756 = arg0;
		if ((arg0 & 0x100) == 0) {
			arg4.aBoolean228 = this.aBoolean228;
		} else {
			arg4.aBoolean228 = true;
		}
		@Pc(71) boolean local71 = Static119.method2175(this.anInt2765, arg0);
		@Pc(77) boolean local77 = Static590.method7746(this.anInt2765, arg0);
		@Pc(83) boolean local83 = Static604.method7904(arg0, this.anInt2765);
		@Pc(89) boolean local89 = local71 | local77 | local83;
		@Pc(226) int local226;
		if (local89) {
			if (!local71) {
				arg4.anIntArray240 = this.anIntArray240;
			} else if (arg1.anIntArray240 == null || arg1.anIntArray240.length < this.anInt2767) {
				arg4.anIntArray240 = arg1.anIntArray240 = new int[this.anInt2767];
			} else {
				arg4.anIntArray240 = arg1.anIntArray240;
			}
			if (!local77) {
				arg4.anIntArray242 = this.anIntArray242;
			} else if (arg1.anIntArray242 == null || this.anInt2767 > arg1.anIntArray242.length) {
				arg4.anIntArray242 = arg1.anIntArray242 = new int[this.anInt2767];
			} else {
				arg4.anIntArray242 = arg1.anIntArray242;
			}
			if (!local83) {
				arg4.anIntArray244 = this.anIntArray244;
			} else if (arg1.anIntArray244 == null || arg1.anIntArray244.length < this.anInt2767) {
				arg4.anIntArray244 = arg1.anIntArray244 = new int[this.anInt2767];
			} else {
				arg4.anIntArray244 = arg1.anIntArray244;
			}
			for (local226 = 0; local226 < this.anInt2767; local226++) {
				if (local71) {
					arg4.anIntArray240[local226] = this.anIntArray240[local226];
				}
				if (local77) {
					arg4.anIntArray242[local226] = this.anIntArray242[local226];
				}
				if (local83) {
					arg4.anIntArray244[local226] = this.anIntArray244[local226];
				}
			}
		} else {
			arg4.anIntArray240 = this.anIntArray240;
			arg4.anIntArray242 = this.anIntArray242;
			arg4.anIntArray244 = this.anIntArray244;
		}
		if (Static42.method1054(this.anInt2765, arg0)) {
			arg4.aClass371_2 = arg1.aClass371_2;
			arg4.aClass371_2.anInterface16_17 = this.aClass371_2.anInterface16_17;
			arg4.aClass371_2.aBoolean736 = this.aClass371_2.aBoolean736;
			arg4.aClass371_2.aBoolean735 = true;
		} else if (Static154.method2475(this.anInt2765, arg0)) {
			arg4.aClass371_2 = this.aClass371_2;
		} else {
			arg4.aClass371_2 = null;
		}
		if (Static77.method1560(this.anInt2765, arg0)) {
			if (arg1.aShortArray40 == null || this.anInt2715 > arg1.aShortArray40.length) {
				arg4.aShortArray40 = arg1.aShortArray40 = new short[this.anInt2715];
			} else {
				arg4.aShortArray40 = arg1.aShortArray40;
			}
			for (local226 = 0; local226 < this.anInt2715; local226++) {
				arg4.aShortArray40[local226] = this.aShortArray40[local226];
			}
		} else {
			arg4.aShortArray40 = this.aShortArray40;
		}
		if (Static433.method5601(this.anInt2765, arg0)) {
			if (arg1.aByteArray33 == null || this.anInt2715 > arg1.aByteArray33.length) {
				arg4.aByteArray33 = arg1.aByteArray33 = new byte[this.anInt2715];
			} else {
				arg4.aByteArray33 = arg1.aByteArray33;
			}
			for (local226 = 0; local226 < this.anInt2715; local226++) {
				arg4.aByteArray33[local226] = this.aByteArray33[local226];
			}
		} else {
			arg4.aByteArray33 = this.aByteArray33;
		}
		if (Static519.method6832(-61, arg0, this.anInt2765)) {
			arg4.aClass371_3 = arg1.aClass371_3;
			arg4.aClass371_3.anInterface16_17 = this.aClass371_3.anInterface16_17;
			arg4.aClass371_3.aBoolean735 = true;
			arg4.aClass371_3.aBoolean736 = this.aClass371_3.aBoolean736;
		} else if (Static280.method4087(this.anInt2765, arg0)) {
			arg4.aClass371_3 = this.aClass371_3;
		} else {
			arg4.aClass371_3 = null;
		}
		@Pc(711) int local711;
		if (Static526.method7073(this.anInt2765, arg0)) {
			if (arg1.aShortArray47 == null || this.anInt2759 > arg1.aShortArray47.length) {
				local226 = this.anInt2759;
				arg4.aShortArray39 = arg1.aShortArray39 = new short[local226];
				arg4.aShortArray49 = arg1.aShortArray49 = new short[local226];
				arg4.aShortArray47 = arg1.aShortArray47 = new short[local226];
			} else {
				arg4.aShortArray39 = arg1.aShortArray39;
				arg4.aShortArray49 = arg1.aShortArray49;
				arg4.aShortArray47 = arg1.aShortArray47;
			}
			if (this.aClass313_1 == null) {
				arg4.aClass313_1 = null;
				for (local226 = 0; local226 < this.anInt2759; local226++) {
					arg4.aShortArray47[local226] = this.aShortArray47[local226];
					arg4.aShortArray49[local226] = this.aShortArray49[local226];
					arg4.aShortArray39[local226] = this.aShortArray39[local226];
				}
			} else {
				if (arg1.aClass313_1 == null) {
					arg1.aClass313_1 = new Class313();
				}
				@Pc(693) Class313 local693 = arg4.aClass313_1 = arg1.aClass313_1;
				if (local693.aShortArray111 == null || this.anInt2759 > local693.aShortArray111.length) {
					local711 = this.anInt2759;
					local693.aByteArray91 = new byte[local711];
					local693.aShortArray110 = new short[local711];
					local693.aShortArray109 = new short[local711];
					local693.aShortArray111 = new short[local711];
				}
				for (local711 = 0; local711 < this.anInt2759; local711++) {
					arg4.aShortArray47[local711] = this.aShortArray47[local711];
					arg4.aShortArray49[local711] = this.aShortArray49[local711];
					arg4.aShortArray39[local711] = this.aShortArray39[local711];
					local693.aShortArray111[local711] = this.aClass313_1.aShortArray111[local711];
					local693.aShortArray109[local711] = this.aClass313_1.aShortArray109[local711];
					local693.aShortArray110[local711] = this.aClass313_1.aShortArray110[local711];
					local693.aByteArray91[local711] = this.aClass313_1.aByteArray91[local711];
				}
			}
			arg4.aByteArray32 = this.aByteArray32;
		} else {
			arg4.aByteArray32 = this.aByteArray32;
			arg4.aShortArray39 = this.aShortArray39;
			arg4.aShortArray47 = this.aShortArray47;
			arg4.aShortArray49 = this.aShortArray49;
			arg4.aClass313_1 = this.aClass313_1;
		}
		if (Static576.method7609(this.anInt2765, arg0)) {
			arg4.aClass371_4 = arg1.aClass371_4;
			arg4.aClass371_4.anInterface16_17 = this.aClass371_4.anInterface16_17;
			arg4.aClass371_4.aBoolean736 = this.aClass371_4.aBoolean736;
			arg4.aClass371_4.aBoolean735 = true;
		} else if (Static69.method6335(arg0, this.anInt2765)) {
			arg4.aClass371_4 = this.aClass371_4;
		} else {
			arg4.aClass371_4 = null;
		}
		if (Static407.method5627(arg0, this.anInt2765)) {
			if (arg1.aFloatArray18 == null || arg1.aFloatArray18.length < this.anInt2715) {
				local226 = this.anInt2759;
				arg4.aFloatArray18 = arg1.aFloatArray18 = new float[local226];
				arg4.lb = arg1.lb = new float[local226];
			} else {
				arg4.aFloatArray18 = arg1.aFloatArray18;
				arg4.lb = arg1.lb;
			}
			for (local226 = 0; local226 < this.anInt2759; local226++) {
				arg4.aFloatArray18[local226] = this.aFloatArray18[local226];
				arg4.lb[local226] = this.lb[local226];
			}
		} else {
			arg4.lb = this.lb;
			arg4.aFloatArray18 = this.aFloatArray18;
		}
		if (Static475.method6443(arg0, this.anInt2765)) {
			arg4.aClass371_1 = arg1.aClass371_1;
			arg4.aClass371_1.anInterface16_17 = this.aClass371_1.anInterface16_17;
			arg4.aClass371_1.aBoolean735 = true;
			arg4.aClass371_1.aBoolean736 = this.aClass371_1.aBoolean736;
		} else if (Static230.method3372(this.anInt2765, arg0)) {
			arg4.aClass371_1 = this.aClass371_1;
		} else {
			arg4.aClass371_1 = null;
		}
		if (Static335.method4946(this.anInt2765, arg0)) {
			if (arg1.aShortArray43 == null || this.anInt2715 > arg1.aShortArray43.length) {
				local226 = this.anInt2715;
				arg4.aShortArray51 = arg1.aShortArray51 = new short[local226];
				arg4.aShortArray43 = arg1.aShortArray43 = new short[local226];
				arg4.aShortArray44 = arg1.aShortArray44 = new short[local226];
			} else {
				arg4.aShortArray44 = arg1.aShortArray44;
				arg4.aShortArray51 = arg1.aShortArray51;
				arg4.aShortArray43 = arg1.aShortArray43;
			}
			for (local226 = 0; local226 < this.anInt2715; local226++) {
				arg4.aShortArray43[local226] = this.aShortArray43[local226];
				arg4.aShortArray44[local226] = this.aShortArray44[local226];
				arg4.aShortArray51[local226] = this.aShortArray51[local226];
			}
		} else {
			arg4.aShortArray51 = this.aShortArray51;
			arg4.aShortArray43 = this.aShortArray43;
			arg4.aShortArray44 = this.aShortArray44;
		}
		if (Static69.method6333(arg0, this.anInt2765)) {
			arg4.aClass359_1 = arg1.aClass359_1;
			arg4.aClass359_1.aBoolean729 = this.aClass359_1.aBoolean729;
			arg4.aClass359_1.anInterface20_8 = this.aClass359_1.anInterface20_8;
			arg4.aClass359_1.aBoolean728 = true;
		} else if (Static652.method8532(arg0, this.anInt2765)) {
			arg4.aClass359_1 = this.aClass359_1;
		} else {
			arg4.aClass359_1 = null;
		}
		if (Static555.method7297(arg0, this.anInt2765)) {
			if (arg1.aShortArray46 == null || arg1.aShortArray46.length < this.anInt2715) {
				local226 = this.anInt2715;
				arg4.aShortArray46 = arg1.aShortArray46 = new short[local226];
			} else {
				arg4.aShortArray46 = arg1.aShortArray46;
			}
			for (local226 = 0; local226 < this.anInt2715; local226++) {
				arg4.aShortArray46[local226] = this.aShortArray46[local226];
			}
		} else {
			arg4.aShortArray46 = this.aShortArray46;
		}
		if (!Static246.method3521(arg0, this.anInt2765)) {
			arg4.aClass18Array1 = this.aClass18Array1;
		} else if (arg1.aClass18Array1 == null || this.anInt2713 > arg1.aClass18Array1.length) {
			local226 = this.anInt2713;
			arg4.aClass18Array1 = arg1.aClass18Array1 = new Class18[local226];
			for (local711 = 0; local711 < this.anInt2713; local711++) {
				arg4.aClass18Array1[local711] = this.aClass18Array1[local711].method270();
			}
		} else {
			arg4.aClass18Array1 = arg1.aClass18Array1;
			for (local226 = 0; local226 < this.anInt2713; local226++) {
				arg4.aClass18Array1[local226].method271(this.aClass18Array1[local226]);
			}
		}
		arg4.anIntArrayArray67 = this.anIntArrayArray67;
		if (this.aBoolean232) {
			arg4.anInt2768 = this.anInt2768;
			arg4.anInt2720 = this.anInt2720;
			arg4.aBoolean232 = true;
			arg4.anInt2708 = this.anInt2708;
			arg4.anInt2716 = this.anInt2716;
			arg4.anInt2723 = this.anInt2723;
			arg4.anInt2758 = this.anInt2758;
			arg4.anInt2771 = this.anInt2771;
			arg4.anInt2701 = this.anInt2701;
		} else {
			arg4.aBoolean232 = false;
		}
		arg4.anIntArrayArray68 = this.anIntArrayArray68;
		arg4.anIntArray243 = this.anIntArray243;
		arg4.aClass298Array1 = this.aClass298Array1;
		arg4.aShortArray50 = this.aShortArray50;
		arg4.aShortArray41 = this.aShortArray41;
		arg4.aShortArray45 = this.aShortArray45;
		arg4.anIntArrayArray66 = this.anIntArrayArray66;
		arg4.anIntArray239 = this.anIntArray239;
		arg4.aShortArray48 = this.aShortArray48;
		arg4.anIntArray241 = this.anIntArray241;
		arg4.aShortArray42 = this.aShortArray42;
		arg4.aClass328Array2 = this.aClass328Array2;
		arg4.anIntArray238 = this.anIntArray238;
		arg4.aClass249Array2 = this.aClass249Array2;
		return arg4;
	}

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "(I)V")
	private void method2558() {
		if (!this.aBoolean229) {
			return;
		}
		this.aBoolean229 = false;
		if (this.aClass328Array2 == null && this.aClass249Array2 == null && this.aClass298Array1 == null && !Static2.method66(this.anInt2765, this.anInt2756)) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			if (this.anIntArray240 != null && !Static577.method7616(this.anInt2756, this.anInt2765)) {
				if (this.aClass371_2 == null || this.aClass371_2.method8448()) {
					if (!this.aBoolean232) {
						this.method2561();
					}
					local39 = true;
				} else {
					this.aBoolean229 = true;
				}
			}
			@Pc(86) boolean local86 = false;
			if (this.anIntArray242 != null && !Static251.method3550(this.anInt2756, this.anInt2765)) {
				if (this.aClass371_2 == null || this.aClass371_2.method8448()) {
					if (!this.aBoolean232) {
						this.method2561();
					}
					local41 = true;
				} else {
					this.aBoolean229 = true;
				}
			}
			if (this.anIntArray244 != null && !Static398.method5562(this.anInt2765, this.anInt2756)) {
				if (this.aClass371_2 == null || this.aClass371_2.method8448()) {
					local86 = true;
					if (!this.aBoolean232) {
						this.method2561();
					}
				} else {
					this.aBoolean229 = true;
				}
			}
			if (local86) {
				this.anIntArray244 = null;
			}
			if (local39) {
				this.anIntArray240 = null;
			}
			if (local41) {
				this.anIntArray242 = null;
			}
		}
		if (this.aShortArray50 != null && this.anIntArray240 == null && this.anIntArray242 == null && this.anIntArray244 == null) {
			this.aShortArray50 = null;
			this.anIntArray243 = null;
		}
		if (this.aByteArray32 != null && !Static135.method7236(this.anInt2756, this.anInt2765)) {
			label205: {
				label204: {
					@Pc(252) boolean local252;
					if ((this.anInt2765 & 0x37) == 0) {
						if (this.aClass371_3 == null || this.aClass371_3.method8448()) {
							break label204;
						}
						local252 = false;
					} else {
						if (this.aClass371_4 == null || this.aClass371_4.method8448()) {
							break label204;
						}
						local252 = false;
					}
					if (!local252) {
						this.aBoolean229 = true;
						break label205;
					}
				}
				this.aByteArray32 = null;
				this.aShortArray47 = this.aShortArray49 = this.aShortArray39 = null;
			}
		}
		if (this.aShortArray40 != null && !Static515.method6804(this.anInt2765, this.anInt2756)) {
			if (this.aClass371_3 == null || this.aClass371_3.method8448()) {
				this.aShortArray40 = null;
			} else {
				this.aBoolean229 = true;
			}
		}
		if (this.aByteArray33 != null && !Static111.method2100(this.anInt2756, this.anInt2765)) {
			if (this.aClass371_3 == null || this.aClass371_3.method8448()) {
				this.aByteArray33 = null;
			} else {
				this.aBoolean229 = true;
			}
		}
		if (this.aFloatArray18 != null && !Static399.method5572(this.anInt2756, this.anInt2765)) {
			if (this.aClass371_1 == null || this.aClass371_1.method8448()) {
				this.aFloatArray18 = this.lb = null;
			} else {
				this.aBoolean229 = true;
			}
		}
		if (this.aShortArray46 != null && !Static383.method5381(this.anInt2765, this.anInt2756)) {
			if (this.aClass371_3 == null || this.aClass371_3.method8448()) {
				this.aShortArray46 = null;
			} else {
				this.aBoolean229 = true;
			}
		}
		if (this.aShortArray43 != null && !Static618.method8316(262144 - 262144, this.anInt2756, this.anInt2765)) {
			if ((this.aClass359_1 == null || this.aClass359_1.method8340()) && (this.aClass371_3 == null || this.aClass371_3.method8448())) {
				this.aShortArray43 = this.aShortArray44 = this.aShortArray51 = null;
			} else {
				this.aBoolean229 = true;
			}
		}
		if (this.aShortArray48 != null) {
			if (this.aClass371_2 == null || this.aClass371_2.method8448()) {
				this.aShortArray48 = null;
			} else {
				this.aBoolean229 = true;
			}
		}
		if (this.aShortArray42 != null) {
			if (this.aClass371_3 == null || this.aClass371_3.method8448()) {
				this.aShortArray42 = null;
			} else {
				this.aBoolean229 = true;
			}
		}
		if (this.anIntArrayArray68 != null && !Static176.method6689(0x40000 ^ 0xFFFBFFFF, this.anInt2765, this.anInt2756)) {
			this.aShortArray45 = null;
			this.anIntArrayArray68 = null;
		}
		if (this.anIntArrayArray66 != null && !Static1.method9338(this.anInt2765, this.anInt2756)) {
			this.anIntArrayArray66 = null;
			this.aShortArray41 = null;
		}
		if (this.anIntArrayArray67 != null && !Static178.method2730(this.anInt2756, this.anInt2765)) {
			this.anIntArrayArray67 = null;
		}
		if (this.anIntArray238 != null && (this.anInt2756 & 0x800) == 0 && (this.anInt2756 & 0x40000) == 0) {
			this.anIntArray239 = null;
			this.anIntArray238 = null;
			this.anIntArray241 = null;
		}
	}

	@OriginalMember(owner = "client!eu", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass19_Sub1_6.anInterface4_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2715; local11++) {
			if (this.aShortArray46[local11] == arg0) {
				this.aShortArray46[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(53) Class118 local53 = local9.method6817(arg0 & 0xFFFF);
			local41 = local53.aByte57;
			local39 = local53.aByte58;
		}
		@Pc(61) byte local61 = 0;
		@Pc(63) byte local63 = 0;
		if (arg1 != -1) {
			@Pc(74) Class118 local74 = local9.method6817(arg1 & 0xFFFF);
			local63 = local74.aByte57;
			if (local74.aByte54 != 0 || local74.aByte52 != 0) {
				this.aBoolean230 = true;
			}
			local61 = local74.aByte58;
		}
		if (!(local39 != local61 | local41 != local63)) {
			return;
		}
		if (this.aClass298Array1 != null) {
			for (@Pc(119) int local119 = 0; local119 < this.anInt2713; local119++) {
				@Pc(126) Class298 local126 = this.aClass298Array1[local119];
				@Pc(131) Class18 local131 = this.aClass18Array1[local119];
				local131.anInt269 = Static154.anIntArray237[this.aShortArray40[local126.anInt7575] & 0xFFFF] & 0xFFFFFF | local131.anInt269 & 0xFF000000;
			}
		}
		this.method2563();
	}

	@OriginalMember(owner = "client!eu", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2715; local7++) {
			if (arg0 == this.aShortArray40[local7]) {
				this.aShortArray40[local7] = arg1;
			}
		}
		if (this.aClass298Array1 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anInt2713; local42++) {
				@Pc(49) Class298 local49 = this.aClass298Array1[local42];
				@Pc(54) Class18 local54 = this.aClass18Array1[local42];
				local54.anInt269 = local54.anInt269 & 0xFF000000 | Static154.anIntArray237[this.aShortArray40[local49.anInt7575] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method2563();
	}

	@OriginalMember(owner = "client!eu", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort35 = (short) arg0;
		this.method2549();
		this.method2554();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class361.anIntArray741[arg0];
		@Pc(13) int local13 = Class361.anIntArray740[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2773; local15++) {
			@Pc(35) int local35 = this.anIntArray244[local15] * local9 + this.anIntArray240[local15] * local13 >> 14;
			this.anIntArray244[local15] = this.anIntArray244[local15] * local13 - this.anIntArray240[local15] * local9 >> 14;
			this.anIntArray240[local15] = local35;
		}
		this.method2549();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2716;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILclient!tt;ZI)Z")
	@Override
	public boolean method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method2553(-1, arg2, arg4, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7481(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class114_Sub1 local8 = (Class114_Sub1) arg0;
		if (this.anInt2715 == 0 || local8.anInt2715 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt2773;
		@Pc(27) int[] local27 = local8.anIntArray240;
		@Pc(30) int[] local30 = local8.anIntArray242;
		@Pc(33) int[] local33 = local8.anIntArray244;
		@Pc(36) short[] local36 = local8.aShortArray47;
		@Pc(39) short[] local39 = local8.aShortArray49;
		@Pc(42) short[] local42 = local8.aShortArray39;
		@Pc(45) byte[] local45 = local8.aByteArray32;
		@Pc(52) short[] local52;
		@Pc(50) short[] local50;
		@Pc(54) short[] local54;
		@Pc(56) byte[] local56;
		if (this.aClass313_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local50 = this.aClass313_1.aShortArray109;
			local56 = this.aClass313_1.aByteArray91;
			local54 = this.aClass313_1.aShortArray110;
			local52 = this.aClass313_1.aShortArray111;
		}
		@Pc(83) short[] local83;
		@Pc(79) short[] local79;
		@Pc(81) short[] local81;
		@Pc(85) byte[] local85;
		if (local8.aClass313_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local83 = local8.aClass313_1.aShortArray111;
			local85 = local8.aClass313_1.aByteArray91;
			local81 = local8.aClass313_1.aShortArray110;
			local79 = local8.aClass313_1.aShortArray109;
		}
		@Pc(106) int[] local106 = local8.anIntArray243;
		@Pc(109) short[] local109 = local8.aShortArray50;
		if (!local8.aBoolean232) {
			local8.method2561();
		}
		@Pc(120) int local120 = local8.anInt2768;
		@Pc(123) int local123 = local8.anInt2720;
		@Pc(126) int local126 = local8.anInt2723;
		@Pc(129) int local129 = local8.anInt2716;
		@Pc(132) int local132 = local8.anInt2758;
		@Pc(135) int local135 = local8.anInt2771;
		for (@Pc(137) int local137 = 0; local137 < this.anInt2773; local137++) {
			@Pc(147) int local147 = this.anIntArray242[local137] - arg2;
			if (local120 <= local147 && local147 <= local123) {
				@Pc(175) int local175 = this.anIntArray240[local137] - arg1;
				if (local175 >= local126 && local129 >= local175) {
					@Pc(199) int local199 = this.anIntArray244[local137] - arg3;
					if (local199 >= local132 && local135 >= local199) {
						@Pc(213) int local213 = -1;
						@Pc(218) int local218 = this.anIntArray243[local137];
						@Pc(225) int local225 = this.anIntArray243[local137 + 1];
						for (@Pc(227) int local227 = local218; local227 < local225; local227++) {
							local213 = this.aShortArray50[local227] - 1;
							if (local213 == -1 || this.aByteArray32[local213] != 0) {
								break;
							}
						}
						if (local213 != -1) {
							for (@Pc(271) int local271 = 0; local271 < local24; local271++) {
								if (local27[local271] == local175 && local33[local271] == local199 && local147 == local30[local271]) {
									local218 = local106[local271];
									@Pc(304) int local304 = -1;
									local225 = local106[local271 + 1];
									for (@Pc(312) int local312 = local218; local312 < local225; local312++) {
										local304 = local109[local312] - 1;
										if (local304 == -1 || local45[local304] != 0) {
											break;
										}
									}
									if (local304 != -1) {
										if (local52 == null) {
											this.aClass313_1 = new Class313();
											local52 = this.aClass313_1.aShortArray111 = Static57.method1230(this.aShortArray47);
											local50 = this.aClass313_1.aShortArray109 = Static57.method1230(this.aShortArray49);
											local54 = this.aClass313_1.aShortArray110 = Static57.method1230(this.aShortArray39);
											local56 = this.aClass313_1.aByteArray91 = Static134.method8955(this.aByteArray32);
										}
										if (local83 == null) {
											@Pc(402) Class313 local402 = local8.aClass313_1 = new Class313();
											local83 = local402.aShortArray111 = Static57.method1230(local36);
											local79 = local402.aShortArray109 = Static57.method1230(local39);
											local81 = local402.aShortArray110 = Static57.method1230(local42);
											local85 = local402.aByteArray91 = Static134.method8955(local45);
										}
										@Pc(435) short local435 = this.aShortArray47[local213];
										@Pc(440) short local440 = this.aShortArray49[local213];
										@Pc(445) short local445 = this.aShortArray39[local213];
										local225 = local106[local271 + 1];
										local218 = local106[local271];
										@Pc(460) byte local460 = this.aByteArray32[local213];
										@Pc(470) int local470;
										for (@Pc(462) int local462 = local218; local462 < local225; local462++) {
											local470 = local109[local462] - 1;
											if (local470 == -1) {
												break;
											}
											if (local85[local470] != 0) {
												local83[local470] += local435;
												local79[local470] += local440;
												local81[local470] += local445;
												local85[local470] += local460;
											}
										}
										local435 = local36[local304];
										local225 = this.anIntArray243[local137 + 1];
										local218 = this.anIntArray243[local137];
										local440 = local39[local304];
										local445 = local42[local304];
										local460 = local45[local304];
										for (local470 = local218; local470 < local225; local470++) {
											@Pc(560) int local560 = this.aShortArray50[local470] - 1;
											if (local560 == -1) {
												break;
											}
											if (local56[local560] != 0) {
												local52[local560] += local435;
												local50[local560] += local440;
												local54[local560] += local445;
												local56[local560] += local460;
											}
										}
										local8.method2554();
										this.method2554();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "()[Lclient!rv;")
	@Override
	public Class328[] method7482() {
		return this.aClass328Array2;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILclient!tt;ZII)Z")
	@Override
	public boolean method7483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method2553(arg5, arg2, arg4, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(B)V")
	private void method2561() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(19) int local19 = 32767;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt2773; local31++) {
			@Pc(40) int local40 = this.anIntArray240[local31];
			@Pc(45) int local45 = this.anIntArray242[local31];
			if (local40 > local21) {
				local21 = local40;
			}
			if (local40 < local7) {
				local7 = local40;
			}
			@Pc(64) int local64 = this.anIntArray244[local31];
			if (local9 > local45) {
				local9 = local45;
			}
			if (local23 < local45) {
				local23 = local45;
			}
			if (local64 > local25) {
				local25 = local64;
			}
			if (local19 > local64) {
				local19 = local64;
			}
			@Pc(100) int local100 = local64 * local64 + local40 * local40;
			if (local27 < local100) {
				local27 = local100;
			}
			local100 = local64 * local64 + local40 * local40 + local45 * local45;
			if (local29 < local100) {
				local29 = local100;
			}
		}
		this.anInt2720 = local23;
		this.anInt2716 = local21;
		this.anInt2723 = local7;
		this.anInt2768 = local9;
		this.anInt2771 = local25;
		this.anInt2758 = local19;
		this.anInt2701 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.anInt2708 = (int) (Math.sqrt((double) local29) + 0.99D);
		this.aBoolean232 = true;
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
	private void method2562() {
		if (this.aClass359_1 != null) {
			this.aClass359_1.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!eu", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub2_Sub9 ba(@OriginalArg(0) Class2_Sub2_Sub9 arg0) {
		if (this.anInt2759 == 0) {
			return null;
		}
		if (!this.aBoolean232) {
			this.method2561();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass19_Sub1_6.anInt9168 > 0) {
			local43 = this.anInt2723 - (this.anInt2720 * this.aClass19_Sub1_6.anInt9168 >> 8) >> this.aClass19_Sub1_6.anInt9173;
			local59 = this.anInt2716 - (this.aClass19_Sub1_6.anInt9168 * this.anInt2768 >> 8) >> this.aClass19_Sub1_6.anInt9173;
		} else {
			local43 = this.anInt2723 - (this.anInt2768 * this.aClass19_Sub1_6.anInt9168 >> 8) >> this.aClass19_Sub1_6.anInt9173;
			local59 = this.anInt2716 - (this.aClass19_Sub1_6.anInt9168 * this.anInt2720 >> 8) >> this.aClass19_Sub1_6.anInt9173;
		}
		@Pc(118) int local118;
		@Pc(134) int local134;
		if (this.aClass19_Sub1_6.anInt9149 > 0) {
			local118 = this.anInt2758 - (this.anInt2720 * this.aClass19_Sub1_6.anInt9149 >> 8) >> this.aClass19_Sub1_6.anInt9173;
			local134 = this.anInt2771 - (this.aClass19_Sub1_6.anInt9149 * this.anInt2768 >> 8) >> this.aClass19_Sub1_6.anInt9173;
		} else {
			local118 = this.anInt2758 - (this.aClass19_Sub1_6.anInt9149 * this.anInt2768 >> 8) >> this.aClass19_Sub1_6.anInt9173;
			local134 = this.anInt2771 - (this.aClass19_Sub1_6.anInt9149 * this.anInt2720 >> 8) >> this.aClass19_Sub1_6.anInt9173;
		}
		@Pc(177) int local177 = local59 + 1 - local43;
		@Pc(184) int local184 = local134 + 1 - local118;
		@Pc(187) Class2_Sub2_Sub9_Sub1 local187 = (Class2_Sub2_Sub9_Sub1) arg0;
		@Pc(199) Class2_Sub2_Sub9_Sub1 local199;
		if (local187 != null && local187.method2192(local177, local184)) {
			local199 = local187;
			local187.method2196();
		} else {
			local199 = new Class2_Sub2_Sub9_Sub1(this.aClass19_Sub1_6, local177, local184);
		}
		local199.method2194(local118, local134, local59, local43);
		this.method2565(local199);
		return local199;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2715; local7++) {
			local16 = this.aShortArray40[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += arg3 * (arg2 - local32) >> 7;
			}
			this.aShortArray40[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass298Array1 != null) {
			for (local16 = 0; local16 < this.anInt2713; local16++) {
				@Pc(108) Class298 local108 = this.aClass298Array1[local16];
				@Pc(113) Class18 local113 = this.aClass18Array1[local16];
				local113.anInt269 = Static154.anIntArray237[this.aShortArray40[local108.anInt7575] & 0xFFFF] & 0xFFFFFF | local113.anInt269 & 0xFF000000;
			}
		}
		this.method2563();
	}

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)V")
	private void method2563() {
		if (this.aClass371_3 != null) {
			this.aClass371_3.aBoolean736 = false;
		}
	}

	@OriginalMember(owner = "client!eu", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2768;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class114 method7495(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = false;
		@Pc(24) Class114_Sub1 local24;
		@Pc(23) Class114_Sub1 local23;
		if (arg0 > 0 && arg0 <= 7) {
			local24 = this.aClass19_Sub1_6.aClass114_Sub1Array6[arg0 - 1];
			local5 = true;
			local23 = this.aClass19_Sub1_6.aClass114_Sub1Array5[arg0 - 1];
		} else {
			local24 = local23 = new Class114_Sub1(this.aClass19_Sub1_6, 0, 0, true, false);
		}
		return this.method2557(arg1, local23, arg2, local5, local24);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!dn;)V")
	private void method2565(@OriginalArg(1) Class2_Sub2_Sub9_Sub1 arg0) {
		if (Static190.anIntArray266.length < this.anInt2759) {
			Static686.anIntArray710 = new int[this.anInt2759];
			Static190.anIntArray266 = new int[this.anInt2759];
		}
		@Pc(50) int local50;
		@Pc(88) int local88;
		@Pc(97) int local97;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2773; local22++) {
			local50 = (this.anIntArray240[local22] - (this.anIntArray242[local22] * this.aClass19_Sub1_6.anInt9168 >> 8) >> this.aClass19_Sub1_6.anInt9173) - arg0.anInt2326;
			@Pc(74) int local74 = (this.anIntArray244[local22] - (this.anIntArray242[local22] * this.aClass19_Sub1_6.anInt9149 >> 8) >> this.aClass19_Sub1_6.anInt9173) - arg0.anInt2328;
			@Pc(79) int local79 = this.anIntArray243[local22];
			@Pc(86) int local86 = this.anIntArray243[local22 + 1];
			for (local88 = local79; local88 < local86; local88++) {
				local97 = this.aShortArray50[local88] - 1;
				if (local97 == -1) {
					break;
				}
				Static190.anIntArray266[local97] = local50;
				Static686.anIntArray710[local97] = local74;
			}
		}
		if (-873913272 != -873913272) {
			this.method7482();
		}
		for (local50 = 0; local50 < this.anInt2745; local50++) {
			if (this.aByteArray33 == null || this.aByteArray33[local50] <= 128) {
				@Pc(156) short local156 = this.aShortArray43[local50];
				@Pc(161) short local161 = this.aShortArray44[local50];
				@Pc(166) short local166 = this.aShortArray51[local50];
				local88 = Static190.anIntArray266[local156];
				local97 = Static190.anIntArray266[local161];
				@Pc(178) int local178 = Static190.anIntArray266[local166];
				@Pc(182) int local182 = Static686.anIntArray710[local156];
				@Pc(186) int local186 = Static686.anIntArray710[local161];
				@Pc(190) int local190 = Static686.anIntArray710[local166];
				if (-((local186 - local182) * (-local97 + local178)) + (local88 - local97) * (-local190 + local186) > 0) {
					arg0.method2197(local178, local97, local88, local186, local182, local190);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "()[B")
	@Override
	public byte[] method7489() {
		return this.aByteArray33;
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "()V")
	@Override
	protected void method7494() {
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "()[Lclient!mn;")
	@Override
	public Class249[] method7480() {
		return this.aClass249Array2;
	}

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2773; local3++) {
			if (arg0 != 0) {
				this.anIntArray240[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray242[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray244[local3] += arg2;
			}
		}
		this.method2549();
		this.aBoolean232 = false;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!tt;IZ)V")
	@Override
	public void method7492(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray41 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2773; local15++) {
			if ((this.aShortArray41[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method7140(this.anIntArray240[local15], this.anIntArray242[local15], this.anIntArray244[local15], local13);
				} else {
					arg0.method7124(this.anIntArray240[local15], this.anIntArray242[local15], this.anIntArray244[local15], local13);
				}
				this.anIntArray240[local15] = local13[0];
				this.anIntArray242[local15] = local13[1];
				this.anIntArray244[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(I)V")
	private void method2566() {
		if (this.anInt2745 == 0) {
			return;
		}
		if (this.method2548() && this.method2551()) {
			this.aClass19_Sub1_6.method8130(0, this.aClass371_2.anInterface16_17);
			this.aClass19_Sub1_6.method8130(1, this.aClass371_3.anInterface16_17);
			this.aClass19_Sub1_6.method8130(2, this.aClass371_1.anInterface16_17);
			@Pc(66) boolean local66;
			if ((this.anInt2765 & 0x37) == 0) {
				local66 = false;
				this.aClass19_Sub1_6.method8072(false);
				this.aClass19_Sub1_6.method8114(this.aClass19_Sub1_6.aClass244_22);
			} else {
				this.aClass19_Sub1_6.method8072(true);
				local66 = true;
				this.aClass19_Sub1_6.method8130(3, this.aClass371_4.anInterface16_17);
				this.aClass19_Sub1_6.method8114(this.aClass19_Sub1_6.aClass244_20);
			}
			for (@Pc(108) int local108 = 0; local108 < this.anIntArray241.length; local108++) {
				@Pc(115) int local115 = this.anIntArray238[local108];
				@Pc(122) int local122 = this.anIntArray238[local108 + 1];
				@Pc(129) int local129 = this.aShortArray46[local115] & 0xFFFF;
				if (local129 == 65535) {
					local129 = -1;
				}
				this.aClass19_Sub1_6.method8108(local66, local129, true);
				this.aClass19_Sub1_6.method8052(this.anIntArray241[local108], local115 * 3, this.aClass359_1.anInterface20_8, this.anIntArray239[local108], Static104.aClass131_2, local122 - local115);
			}
		}
		this.method2558();
	}

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean232) {
			this.method2561();
		}
		return this.anInt2771;
	}
}
