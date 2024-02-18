import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class90_Sub2_Sub1 extends Class90_Sub2 {

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "[J")
	public static final long[] aLongArray19 = new long[11];

	@OriginalMember(owner = "client!sl", name = "D", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	static {
		for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
			@Pc(67) char local67 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local58 / 2);
			@Pc(84) long local84 = (long) ((local58 & 0x1) == 0 ? local67 >>> 8 : local67 & 0xFF);
			@Pc(88) long local88 = local84 << 1;
			if (local88 >= 256L) {
				local88 ^= 0x11DL;
			}
			@Pc(100) long local100 = local88 << 1;
			if (local100 >= 256L) {
				local100 ^= 0x11DL;
			}
			@Pc(114) long local114 = local100 ^ local84;
			@Pc(118) long local118 = local100 << 1;
			if (local118 >= 256L) {
				local118 ^= 0x11DL;
			}
			@Pc(130) long local130 = local118 ^ local84;
			aLongArrayArray1[0][local58] = Static713.method9334(Static713.method9334(local88 << 8, Static713.method9334(Static713.method9334(Static713.method9334(local84 << 32, Static713.method9334(Static713.method9334(local84 << 48, local84 << 56), local100 << 40)), local118 << 24), local114 << 16)), local130);
			for (@Pc(166) int local166 = 1; local166 < 8; local166++) {
				aLongArrayArray1[local166][local58] = Static713.method9334(aLongArrayArray1[local166 - 1][local58] >>> 8, aLongArrayArray1[local166 - 1][local58] << 56);
			}
		}
		aLongArray19[0] = 0L;
		for (@Pc(209) int local209 = 1; local209 <= 10; local209++) {
			@Pc(216) int local216 = local209 * 8 - 8;
			aLongArray19[local209] = Static315.method4576(Static570.method7548(aLongArrayArray1[7][local216 + 7], 255L), Static315.method4576(Static570.method7548(aLongArrayArray1[6][local216 + 6], 65280L), Static315.method4576(Static315.method4576(Static315.method4576(Static315.method4576(Static570.method7548(280375465082880L, aLongArrayArray1[2][local216 + 2]), Static315.method4576(Static570.method7548(aLongArrayArray1[0][local216], -72057594037927936L), Static570.method7548(aLongArrayArray1[1][local216 + 1], 71776119061217280L))), Static570.method7548(1095216660480L, aLongArrayArray1[3][local216 + 3])), Static570.method7548(aLongArrayArray1[4][local216 + 4], 4278190080L)), Static570.method7548(aLongArrayArray1[5][local216 + 5], 16711680L))));
		}
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!fw;)V")
	public Class90_Sub2_Sub1(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class138_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method7756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = super.aClass23_40.method8203();
		@Pc(26) int local26 = ((Class138_Sub1_Sub1) super.aClass138_5).anInt3192 * Static556.method7302() / 10 % local14;
		super.aClass23_40.method8198(arg1 + local26 - local14, arg0, arg2 + local14 - local26, arg3);
	}
}
