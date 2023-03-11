import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_111 = new Class79("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!ha;")
	public static Class2_Sub16 aClass2_Sub16_1 = null;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public static int anInt5161 = 13156520;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method4725(@OriginalArg(1) Class19 arg0) {
		arg0.method2895(0, 0, Static250.anInt4665, 350);
		arg0.method2901(0, 0, Static250.anInt4665, 350, Static214.anInt3793 << 24 | 0x332277, 1);
		@Pc(37) int local37;
		@Pc(43) int local43;
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			local37 = Static121.anIntArray157[local29] >> 4;
			local43 = Static121.anIntArray156[local29] >> 4;
			@Pc(60) int local60 = local37 + (Class19.anIntArray178[(local43 + (local37 & 0x40)) * 64 & 0x3FFF] >> 10);
			arg0.method2901(local60, local43, 2, 2, Static353.anIntArray450[local29] << 24 | 0xFFFFFF, 1);
		}
		local37 = 350 / Static78.anInt6309;
		if (Static368.anInt6917 > 0) {
			local43 = 342 - Static78.anInt6309;
			@Pc(98) int local98 = local43 * local37 / (Static368.anInt6917 + local37 - 1);
			@Pc(100) int local100 = 4;
			if (Static368.anInt6917 > 1) {
				local100 = (local43 - local98) * (-Static177.anInt3385 + -1 + Static368.anInt6917) / (Static368.anInt6917 - 1) + 4;
			}
			arg0.method2901(Static250.anInt4665 - 16, local100, 12, local98, Static214.anInt3793 << 24 | 0x332277, 2);
			for (@Pc(137) int local137 = Static177.anInt3385; Static177.anInt3385 + local37 > local137 && Static368.anInt6917 > local137; local137++) {
				@Pc(148) String[] local148 = Static200.method3643('\b', Static124.aStringArray65[local137]);
				@Pc(157) int local157 = (Static250.anInt4665 - 8 - 16) / local148.length;
				for (@Pc(159) int local159 = 0; local159 < local148.length; local159++) {
					@Pc(168) int local168 = local159 * local157 + 8;
					arg0.method2895(local168, 0, local168 + local157 - 8, 350);
					Static276.aClass130_4.method5897(local168, -16777216, 350 - Static165.aClass239_3.anInt6846 - Static284.anInt5359 - Static78.anInt6309 * (local137 - Static177.anInt3385) - 2, -1, local148[local159]);
				}
			}
		}
		arg0.method2895(0, 0, Static250.anInt4665, 350);
		arg0.method2890(0, Static250.anInt4665, 350 - Static284.anInt5359, -1);
		Static52.aClass130_1.method5897(10, -16777216, 350 - Static113.aClass239_2.anInt6846 - 1, -1, "--> " + Static25.aString9);
		local43 = -1;
		if (Static114.anInt2348 % 30 > 15) {
			local43 = 16777215;
		}
		arg0.method2810(local43, Static113.aClass239_2.method6126("--> " + Static25.aString9.substring(0, Static357.anInt6683)) + 10, -Static113.aClass239_2.anInt6846 + -11 + 350, 12);
	}
}
