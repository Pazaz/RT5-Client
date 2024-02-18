import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "[Lclient!oaa;")
	public Class269[] aClass269Array1;

	@OriginalMember(owner = "client!cea", name = "B", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "[Lclient!sq;")
	public Class2_Sub49_Sub1[] aClass2_Sub49_Sub1Array1;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
	public int anInt1579;

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!cea", name = "y", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
	private Class2_Sub11() {
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "([B)V")
	public Class2_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aClass269Array1 = new Class269[128];
		this.aClass2_Sub49_Sub1Array1 = new Class2_Sub49_Sub1[128];
		this.anIntArray149 = new int[128];
		this.aByteArray20 = new byte[128];
		this.aByteArray19 = new byte[128];
		this.aShortArray16 = new short[128];
		this.aByteArray18 = new byte[128];
		@Pc(34) Packet local34 = new Packet(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.data[local36 + local34.pos] != 0; local36++) {
		}
		@Pc(49) byte[] local49 = new byte[local36];
		for (@Pc(51) int local51 = 0; local51 < local36; local51++) {
			local49[local51] = local34.g1b();
		}
		local36++;
		local34.pos++;
		@Pc(76) int local76 = local34.pos;
		local34.pos += local36;
		@Pc(84) int local84;
		for (local84 = 0; local34.data[local34.pos + local84] != 0; local84++) {
		}
		@Pc(97) byte[] local97 = new byte[local84];
		for (@Pc(99) int local99 = 0; local99 < local84; local99++) {
			local97[local99] = local34.g1b();
		}
		local84++;
		local34.pos++;
		@Pc(124) int local124 = local34.pos;
		local34.pos += local84;
		@Pc(132) int local132;
		for (local132 = 0; local34.data[local132 + local34.pos] != 0; local132++) {
		}
		@Pc(148) byte[] local148 = new byte[local132];
		for (@Pc(150) int local150 = 0; local150 < local132; local150++) {
			local148[local150] = local34.g1b();
		}
		local34.pos++;
		local132++;
		@Pc(171) byte[] local171 = new byte[local132];
		@Pc(182) int local182;
		@Pc(186) int local186;
		@Pc(191) int local191;
		if (local132 > 1) {
			local171[1] = 1;
			local182 = 2;
			@Pc(184) int local184 = 1;
			for (local186 = 2; local186 < local132; local186++) {
				local191 = local34.g1();
				if (local191 == 0) {
					local184 = local182++;
				} else {
					if (local191 <= local184) {
						local191--;
					}
					local184 = local191;
				}
				local171[local186] = (byte) local184;
			}
		} else {
			local182 = local132;
		}
		@Pc(228) Class269[] local228 = new Class269[local182];
		for (local186 = 0; local186 < local228.length; local186++) {
			@Pc(239) Class269 local239 = local228[local186] = new Class269();
			@Pc(243) int local243 = local34.g1();
			if (local243 > 0) {
				local239.aByteArray83 = new byte[local243 * 2];
			}
			local243 = local34.g1();
			if (local243 > 0) {
				local239.aByteArray82 = new byte[local243 * 2 + 2];
				local239.aByteArray82[1] = 64;
			}
		}
		local191 = local34.g1();
		@Pc(299) byte[] local299 = local191 <= 0 ? null : new byte[local191 * 2];
		local191 = local34.g1();
		@Pc(316) byte[] local316 = local191 > 0 ? new byte[local191 * 2] : null;
		@Pc(318) int local318;
		for (local318 = 0; local34.data[local318 + local34.pos] != 0; local318++) {
		}
		@Pc(334) byte[] local334 = new byte[local318];
		for (@Pc(336) int local336 = 0; local336 < local318; local336++) {
			local334[local336] = local34.g1b();
		}
		local318++;
		local34.pos++;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local34.g1();
			this.aShortArray16[local358] = (short) local356;
		}
		local356 = 0;
		for (@Pc(379) int local379 = 0; local379 < 128; local379++) {
			local356 += local34.g1();
			this.aShortArray16[local379] = (short) (this.aShortArray16[local379] + (local356 << 8));
		}
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		for (@Pc(409) int local409 = 0; local409 < 128; local409++) {
			if (local403 == 0) {
				if (local334.length <= local405) {
					local403 = -1;
				} else {
					local403 = local334[local405++];
				}
				local407 = local34.gVarInt();
			}
			this.aShortArray16[local409] = (short) (this.aShortArray16[local409] + ((local407 - 1 & 0x2) << 14));
			this.anIntArray149[local409] = local407;
			local403--;
		}
		local405 = 0;
		local403 = 0;
		@Pc(464) int local464 = 0;
		for (@Pc(466) int local466 = 0; local466 < 128; local466++) {
			if (this.anIntArray149[local466] != 0) {
				if (local403 == 0) {
					local464 = local34.data[local76++] - 1;
					if (local49.length > local405) {
						local403 = local49[local405++];
					} else {
						local403 = -1;
					}
				}
				this.aByteArray19[local466] = (byte) local464;
				local403--;
			}
		}
		local405 = 0;
		local403 = 0;
		@Pc(519) int local519 = 0;
		for (@Pc(521) int local521 = 0; local521 < 128; local521++) {
			if (this.anIntArray149[local521] != 0) {
				if (local403 == 0) {
					if (local97.length <= local405) {
						local403 = -1;
					} else {
						local403 = local97[local405++];
					}
					local519 = local34.data[local124++] + 16 << 2;
				}
				local403--;
				this.aByteArray18[local521] = (byte) local519;
			}
		}
		local403 = 0;
		local405 = 0;
		@Pc(581) Class269 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray149[local583] != 0) {
				if (local403 == 0) {
					local581 = local228[local171[local405]];
					if (local148.length > local405) {
						local403 = local148[local405++];
					} else {
						local403 = -1;
					}
				}
				this.aClass269Array1[local583] = local581;
				local403--;
			}
		}
		local405 = 0;
		local403 = 0;
		@Pc(627) int local627 = 0;
		for (@Pc(629) int local629 = 0; local629 < 128; local629++) {
			if (local403 == 0) {
				if (local405 >= local334.length) {
					local403 = -1;
				} else {
					local403 = local334[local405++];
				}
				if (this.anIntArray149[local629] > 0) {
					local627 = local34.g1() + 1;
				}
			}
			this.aByteArray20[local629] = (byte) local627;
			local403--;
		}
		this.anInt1579 = local34.g1() + 1;
		@Pc(694) int local694;
		for (@Pc(684) int local684 = 0; local684 < local182; local684++) {
			@Pc(689) Class269 local689 = local228[local684];
			if (local689.aByteArray83 != null) {
				for (local694 = 1; local694 < local689.aByteArray83.length; local694 += 2) {
					local689.aByteArray83[local694] = local34.g1b();
				}
			}
			if (local689.aByteArray82 != null) {
				for (local694 = 3; local694 < local689.aByteArray82.length - 2; local694 += 2) {
					local689.aByteArray82[local694] = local34.g1b();
				}
			}
		}
		@Pc(747) int local747;
		if (local299 != null) {
			for (local747 = 1; local747 < local299.length; local747 += 2) {
				local299[local747] = local34.g1b();
			}
		}
		if (local316 != null) {
			for (local747 = 1; local747 < local316.length; local747 += 2) {
				local316[local747] = local34.g1b();
			}
		}
		@Pc(795) int local795;
		for (local747 = 0; local747 < local182; local747++) {
			@Pc(788) Class269 local788 = local228[local747];
			if (local788.aByteArray82 != null) {
				local356 = 0;
				for (local795 = 2; local795 < local788.aByteArray82.length; local795 += 2) {
					local356 = local34.g1() + local356 + 1;
					local788.aByteArray82[local795] = (byte) local356;
				}
			}
		}
		@Pc(840) int local840;
		for (local694 = 0; local694 < local182; local694++) {
			@Pc(833) Class269 local833 = local228[local694];
			if (local833.aByteArray83 != null) {
				local356 = 0;
				for (local840 = 2; local840 < local833.aByteArray83.length; local840 += 2) {
					local356 = local34.g1() + local356 + 1;
					local833.aByteArray83[local840] = (byte) local356;
				}
			}
		}
		@Pc(915) int local915;
		@Pc(937) int local937;
		@Pc(942) byte local942;
		@Pc(962) int local962;
		@Pc(964) int local964;
		@Pc(972) int local972;
		@Pc(909) byte local909;
		@Pc(1015) int local1015;
		if (local299 != null) {
			local356 = local34.g1();
			local299[0] = (byte) local356;
			for (local795 = 2; local795 < local299.length; local795 += 2) {
				local356 = local34.g1() + local356 + 1;
				local299[local795] = (byte) local356;
			}
			local909 = local299[0];
			@Pc(913) byte local913 = local299[1];
			for (local915 = 0; local915 < local909; local915++) {
				this.aByteArray20[local915] = (byte) (this.aByteArray20[local915] * local913 + 32 >> 6);
			}
			for (local937 = 2; local937 < local299.length; local937 += 2) {
				local942 = local299[local937];
				@Pc(948) byte local948 = local299[local937 + 1];
				local962 = (local942 - local909) / 2 + local913 * (local942 - local909);
				for (local964 = local909; local964 < local942; local964++) {
					local972 = Static235.method3427(local942 - local909, local962);
					local962 += local948 - local913;
					this.aByteArray20[local964] = (byte) (this.aByteArray20[local964] * local972 + 32 >> 6);
				}
				local913 = local948;
				local909 = local942;
			}
			for (local1015 = local909; local1015 < 128; local1015++) {
				this.aByteArray20[local1015] = (byte) (this.aByteArray20[local1015] * local913 + 32 >> 6);
			}
		}
		@Pc(1085) int local1085;
		if (local316 != null) {
			local356 = local34.g1();
			local316[0] = (byte) local356;
			for (local795 = 2; local795 < local316.length; local795 += 2) {
				local356 = local34.g1() + local356 + 1;
				local316[local795] = (byte) local356;
			}
			local909 = local316[0];
			local1085 = local316[1] << 1;
			for (local915 = 0; local915 < local909; local915++) {
				local937 = local1085 + (this.aByteArray18[local915] & 0xFF);
				if (local937 < 0) {
					local937 = 0;
				}
				if (local937 > 128) {
					local937 = 128;
				}
				this.aByteArray18[local915] = (byte) local937;
			}
			@Pc(1131) int local1131;
			for (local937 = 2; local937 < local316.length; local937 += 2) {
				local942 = local316[local937];
				local1131 = local316[local937 + 1] << 1;
				local962 = (local942 - local909) / 2 + (local942 - local909) * local1085;
				for (local964 = local909; local964 < local942; local964++) {
					local972 = Static235.method3427(local942 - local909, local962);
					@Pc(1164) int local1164 = (this.aByteArray18[local964] & 0xFF) + local972;
					if (local1164 < 0) {
						local1164 = 0;
					}
					if (local1164 > 128) {
						local1164 = 128;
					}
					this.aByteArray18[local964] = (byte) local1164;
					local962 += local1131 - local1085;
				}
				local909 = local942;
				local1085 = local1131;
			}
			for (local1015 = local909; local1015 < 128; local1015++) {
				local1131 = local1085 + (this.aByteArray18[local1015] & 0xFF);
				if (local1131 < 0) {
					local1131 = 0;
				}
				if (local1131 > 128) {
					local1131 = 128;
				}
				this.aByteArray18[local1015] = (byte) local1131;
			}
		}
		for (local795 = 0; local795 < local182; local795++) {
			local228[local795].anInt6771 = local34.g1();
		}
		for (local840 = 0; local840 < local182; local840++) {
			@Pc(1256) Class269 local1256 = local228[local840];
			if (local1256.aByteArray83 != null) {
				local1256.anInt6778 = local34.g1();
			}
			if (local1256.aByteArray82 != null) {
				local1256.anInt6779 = local34.g1();
			}
			if (local1256.anInt6771 > 0) {
				local1256.anInt6772 = local34.g1();
			}
		}
		for (local1085 = 0; local1085 < local182; local1085++) {
			local228[local1085].anInt6776 = local34.g1();
		}
		for (local915 = 0; local915 < local182; local915++) {
			@Pc(1311) Class269 local1311 = local228[local915];
			if (local1311.anInt6776 > 0) {
				local1311.anInt6775 = local34.g1();
			}
		}
		for (local937 = 0; local937 < local182; local937++) {
			@Pc(1336) Class269 local1336 = local228[local937];
			if (local1336.anInt6775 > 0) {
				local1336.anInt6780 = local34.g1();
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
	public void method1521() {
		this.anIntArray149 = null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLclient!fca;[I[B)Z")
	public boolean method1526(@OriginalArg(1) Class123 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(7) int local7 = 0;
		@Pc(9) Class2_Sub49_Sub1 local9 = null;
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			if (arg2 == null || arg2[local11] != 0) {
				@Pc(33) int local33 = this.anIntArray149[local11];
				if (local33 != 0) {
					if (local33 != local7) {
						local7 = local33--;
						if ((local33 & 0x1) == 0) {
							local9 = arg0.method2614(arg1, local33 >> 2);
						} else {
							local9 = arg0.method2615(arg1, local33 >> 2);
						}
						if (local9 == null) {
							local5 = false;
						}
					}
					if (local9 != null) {
						this.aClass2_Sub49_Sub1Array1[local11] = local9;
						this.anIntArray149[local11] = 0;
					}
				}
			}
		}
		return local5;
	}
}
