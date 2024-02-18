import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "[Lclient!pp;")
	public static Class8_Sub4_Sub2_Sub1[] aClass8_Sub4_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lclient!cda;")
	public static Class2_Sub10 method7192(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) Class local13 = Class.forName("on");
			@Pc(17) Class2_Sub10 local17 = (Class2_Sub10) local13.getDeclaredConstructor().newInstance();
			local17.method6332(arg2, arg0, arg1);
			return local17;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class2_Sub10_Sub1 local30 = new Class2_Sub10_Sub1();
			local30.method6332(arg2, arg0, arg1);
			return local30;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V")
	public static void method7193() {
		@Pc(15) Class2_Sub21_Sub2 local15 = Static405.aClass153_2.aClass2_Sub21_Sub2_2;
		for (@Pc(17) int local17 = 0; local17 < Static86.anInt1798; local17++) {
			@Pc(23) int local23 = Static458.anIntArray553[local17];
			@Pc(31) Class8_Sub2_Sub1_Sub2_Sub2 local31 = ((Class2_Sub45) Static18.aClass28_2.method738((long) local23)).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			@Pc(35) int local35 = local15.method7396();
			if ((local35 & 0x80) != 0) {
				local35 += local15.method7396() << 8;
			}
			if ((local35 & 0x8000) != 0) {
				local35 += local15.method7396() << 16;
			}
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(86) int local86;
			@Pc(90) int local90;
			@Pc(96) int local96;
			@Pc(117) boolean local117;
			if ((local35 & 0x100000) != 0) {
				local73 = local15.method7382();
				local77 = local15.method7349();
				if (local73 == 65535) {
					local73 = -1;
				}
				local86 = local15.method7374();
				local90 = local86 & 0x7;
				local96 = local86 >> 3 & 0xF;
				if (local96 == 15) {
					local96 = -1;
				}
				local117 = (local86 >> 7 & 0x1) == 1;
				local31.method9309(2, local90, local117, local77, local96, local73);
			}
			if ((local35 & 0x1) != 0) {
				local31.anInt10722 = local15.method7372();
				if (local31.anInt10722 == 65535) {
					local31.anInt10722 = -1;
				}
			}
			if ((local35 & 0x20000) != 0) {
				local73 = local15.method7382();
				local77 = local15.method7349();
				if (local73 == 65535) {
					local73 = -1;
				}
				local86 = local15.method7396();
				local90 = local86 & 0x7;
				local96 = local86 >> 3 & 0xF;
				if (local96 == 15) {
					local96 = -1;
				}
				local117 = (local86 >> 7 & 0x1) == 1;
				local31.method9309(3, local90, local117, local77, local96, local73);
			}
			@Pc(280) int local280;
			@Pc(284) int local284;
			@Pc(240) int local240;
			if ((local35 & 0x40) != 0) {
				local73 = local15.method7401();
				if (local73 > 0) {
					for (local77 = 0; local77 < local73; local77++) {
						local90 = -1;
						local96 = -1;
						local86 = local15.method7390();
						local240 = -1;
						if (local86 == 32767) {
							local86 = local15.method7390();
							local96 = local15.method7390();
							local90 = local15.method7390();
							local240 = local15.method7390();
						} else if (local86 == 32766) {
							local86 = -1;
						} else {
							local96 = local15.method7390();
						}
						local280 = local15.method7390();
						local284 = local15.method7396();
						local31.method9301(local240, local280, local284, local96, Static333.anInt5455, local90, local86);
					}
				}
			}
			if ((local35 & 0x100) != 0) {
				local73 = local15.method7387();
				local31.anInt10738 = local15.method7401();
				local31.anInt10731 = local15.method7401();
				local31.anInt10737 = local73 & 0x7FFF;
				local31.aBoolean818 = (local73 & 0x8000) != 0;
				local31.anInt10719 = local31.anInt10737 + Static333.anInt5455 + local31.anInt10738;
			}
			if ((local35 & 0x40000) != 0) {
				local31.aString128 = local15.method7358();
				if ("".equals(local31.aString128) || local31.aString128.equals(local31.aClass268_1.aString73)) {
					local31.aString128 = local31.aClass268_1.aString73;
				}
			}
			if ((local35 & 0x20) != 0) {
				if (local31.aClass268_1.method5984()) {
					Static58.method1259(local31);
				}
				local31.method9328(Static690.aClass308_2.method7092(local15.method7372()));
				local31.method9310(local31.aClass268_1.anInt6713);
				local31.anInt10757 = local31.aClass268_1.lb << 3;
				if (local31.aClass268_1.method5984()) {
					Static89.method1714(local31.aByte144, (Class8_Sub2_Sub1_Sub2_Sub1) null, local31.anIntArray879[0], local31.anIntArray878[0], local31, (Class54) null, 0);
				}
			}
			if ((local35 & 0x2) != 0) {
				local31.method9327(local15.method7358());
			}
			if ((local35 & 0x8) != 0) {
				local31.anInt10774 = local15.method7372();
				local31.anInt10767 = local15.method7372();
			}
			if ((local35 & 0x80000) != 0) {
				local31.anInt10791 = local15.method7372();
				if (local31.anInt10791 == 65535) {
					local31.anInt10791 = local31.aClass268_1.anInt6727;
				}
			}
			@Pc(511) int[] local511;
			@Pc(514) int[] local514;
			if ((local35 & 0x2000) != 0) {
				local73 = local15.method7374();
				local511 = new int[local73];
				local514 = new int[local73];
				for (local90 = 0; local90 < local73; local90++) {
					local96 = local15.method7382();
					if ((local96 & 0xC000) == 49152) {
						local240 = local15.method7387();
						local511[local90] = local240 | local96 << 16;
					} else {
						local511[local90] = local96;
					}
					local514[local90] = local15.method7382();
				}
				local31.method9315(local514, local511);
			}
			@Pc(665) short[] local665;
			@Pc(608) int[] local608;
			@Pc(636) short[] local636;
			@Pc(708) long local708;
			if ((local35 & 0x10000) != 0) {
				local73 = local31.aClass268_1.anIntArray534.length;
				local77 = 0;
				if (local31.aClass268_1.aShortArray100 != null) {
					local77 = local31.aClass268_1.aShortArray100.length;
				}
				if (local31.aClass268_1.aShortArray102 != null) {
					local77 = local31.aClass268_1.aShortArray102.length;
				}
				local90 = local15.method7376();
				if ((local90 & 0x1) != 1) {
					local608 = null;
					if ((local90 & 0x2) == 2) {
						local608 = new int[local73];
						for (local240 = 0; local240 < local73; local240++) {
							local608[local240] = local15.method7406();
						}
					}
					local636 = null;
					if ((local90 & 0x4) == 4) {
						local636 = new short[local77];
						for (local280 = 0; local280 < local77; local280++) {
							local636[local280] = (short) local15.method7387();
						}
					}
					local665 = null;
					if ((local90 & 0x8) == 8) {
						local665 = new short[0];
						for (local284 = 0; local284 < 0; local284++) {
							local665[local284] = (short) local15.method7382();
						}
					}
					local708 = (long) local31.anInt10788++ << 32 | (long) local23;
					new Class386(local708, local608, local636, local665);
				}
			}
			if ((local35 & 0x400) != 0) {
				local31.anInt10750 = local15.method7348();
				local31.anInt10753 = local15.method7348();
				local31.anInt10761 = local15.method7399();
				local31.anInt10758 = local15.method7399();
				local31.anInt10759 = local15.method7382() + Static333.anInt5455;
				local31.anInt10755 = local15.method7406() + Static333.anInt5455;
				local31.anInt10754 = local15.method7376();
				local31.anInt10758 += local31.anIntArray878[0];
				local31.anInt10764 = 1;
				local31.anInt10753 += local31.anIntArray878[0];
				local31.anInt10761 += local31.anIntArray879[0];
				local31.anInt10762 = 0;
				local31.anInt10750 += local31.anIntArray879[0];
			}
			if ((local35 & 0x10) != 0) {
				@Pc(814) int[] local814 = new int[4];
				for (local77 = 0; local77 < 4; local77++) {
					local814[local77] = local15.method7382();
					if (local814[local77] == 65535) {
						local814[local77] = -1;
					}
				}
				local86 = local15.method7396();
				Static651.method8515(local814, local86, true, local31);
			}
			if ((local35 & 0x800) != 0) {
				local73 = local31.aClass268_1.anIntArray535.length;
				local77 = 0;
				if (local31.aClass268_1.aShortArray100 != null) {
					local77 = local31.aClass268_1.aShortArray100.length;
				}
				local86 = 0;
				if (local31.aClass268_1.aShortArray102 != null) {
					local86 = local31.aClass268_1.aShortArray102.length;
				}
				local90 = local15.method7376();
				if ((local90 & 0x1) == 1) {
					local31.aClass386_1 = null;
				} else {
					local608 = null;
					if ((local90 & 0x2) == 2) {
						local608 = new int[local73];
						for (local240 = 0; local240 < local73; local240++) {
							local608[local240] = local15.method7382();
						}
					}
					local636 = null;
					if ((local90 & 0x4) == 4) {
						local636 = new short[local77];
						for (local280 = 0; local280 < local77; local280++) {
							local636[local280] = (short) local15.method7382();
						}
					}
					local665 = null;
					if ((local90 & 0x8) == 8) {
						local665 = new short[local86];
						for (local284 = 0; local284 < local86; local284++) {
							local665[local284] = (short) local15.method7406();
						}
					}
					local708 = (long) local23 | (long) local31.anInt10790++ << 32;
					local31.aClass386_1 = new Class386(local708, local608, local636, local665);
				}
			}
			if ((local35 & 0x4000) != 0) {
				local73 = local15.method7396();
				local511 = new int[local73];
				local514 = new int[local73];
				@Pc(1031) int[] local1031 = new int[local73];
				for (local96 = 0; local96 < local73; local96++) {
					local240 = local15.method7372();
					if (local240 == 65535) {
						local240 = -1;
					}
					local511[local96] = local240;
					local514[local96] = local15.method7374();
					local1031[local96] = local15.method7382();
				}
				Static310.method4505(local1031, local511, local514, local31);
			}
			if ((local35 & 0x1000) != 0) {
				local73 = local15.method7387();
				local77 = local15.method7349();
				if (local73 == 65535) {
					local73 = -1;
				}
				local86 = local15.method7396();
				local90 = local86 & 0x7;
				local96 = local86 >> 3 & 0xF;
				if (local96 == 15) {
					local96 = -1;
				}
				local117 = (local86 >> 7 & 0x1) == 1;
				local31.method9309(1, local90, local117, local77, local96, local73);
			}
			if ((local35 & 0x4) != 0) {
				local73 = local15.method7372();
				local77 = local15.method7371();
				if (local73 == 65535) {
					local73 = -1;
				}
				local86 = local15.method7401();
				local90 = local86 & 0x7;
				local96 = local86 >> 3 & 0xF;
				if (local96 == 15) {
					local96 = -1;
				}
				local117 = (local86 >> 7 & 0x1) == 1;
				local31.method9309(0, local90, local117, local77, local96, local73);
			}
			if ((local35 & 0x200) != 0) {
				local31.aByte150 = local15.method7405();
				local31.aByte147 = local15.method7348();
				local31.aByte148 = local15.method7377();
				local31.aByte149 = (byte) local15.method7376();
				local31.anInt10760 = Static333.anInt5455 + local15.method7372();
				local31.anInt10752 = Static333.anInt5455 + local15.method7382();
			}
		}
	}
}
