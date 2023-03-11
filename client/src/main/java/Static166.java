import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
	public static int anInt3193;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	public static int anInt3187 = 0;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_134 = new Class89(23, 8);

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_122 = new Class145(40, 7);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZBI)V")
	public static void method3186(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub41 local8 = Static374.method6275(arg0, arg1);
		if (local8 != null) {
			local8.method6468();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)[Lclient!h;")
	public static Class89[] method3188() {
		return new Class89[] { Static272.aClass89_186, Static183.aClass89_6, Static272.aClass89_184, Static36.aClass89_31, Static238.aClass89_167, Static372.aClass89_245, Static394.aClass89_259, Static210.aClass89_156, Static142.aClass89_110, Static97.aClass89_82, Static161.aClass89_123, Static179.aClass89_143, Static120.aClass89_95, Static201.aClass89_151, Static137.aClass89_106, Static78.aClass89_223, Static30.aClass89_26, Static106.aClass89_88, Static299.aClass89_202, Static241.aClass89_170, Static387.aClass89_120, Static84.aClass89_70, Static83.aClass89_68, aClass89_134, Static48.aClass89_43, Static153.aClass89_118, Static394.aClass89_258, Static96.aClass89_81, Static202.aClass89_153, Static93.aClass89_76, Static23.aClass89_22, Static78.aClass89_224, Static319.aClass89_211, Static371.aClass89_244, Static43.aClass89_39, Static82.aClass89_67, Static305.aClass89_204, Static86.aClass89_72, Static144.aClass89_112, Static50.aClass89_46, Static89.aClass89_74, Static112.aClass89_91, Static235.aClass89_140, Static79.aClass89_63, Static165.aClass89_131, Static336.aClass89_225, Static210.aClass89_155, Static261.aClass89_176, Static70.aClass89_58, Static98.aClass89_83, Static271.aClass89_182, Static113.aClass89_94, Static98.aClass89_84, Static94.aClass89_79, Static88.aClass89_73, Static220.aClass89_158, Static82.aClass89_66, Static354.aClass89_42, Static10.aClass89_12, Static139.aClass89_108, Static322.aClass89_217, Static133.aClass89_103, Static42.aClass89_226, Static193.aClass89_146, Static221.aClass89_175, Static80.aClass89_234, Static297.aClass89_200, Static386.aClass89_236, Static177.aClass89_141, Static391.aClass89_256, Static83.aClass89_69, Static385.aClass89_255, Static153.aClass89_119, Static170.aClass89_136, Static33.aClass89_171, Static375.aClass89_246, Static31.aClass89_27, Static384.aClass89_253, Static272.aClass89_185, Static164.aClass89_129, Static81.aClass89_152, Static207.aClass89_154, Static58.aClass89_49, Static200.aClass89_150, Static125.aClass89_249, Static146.aClass89_113, Static164.aClass89_130, Static152.aClass89_116, Static30.aClass89_25, Static371.aClass89_243, Static7.aClass89_257, Static227.aClass89_161, Static268.aClass89_180, Static320.aClass89_214, Static380.aClass89_248, Static11.aClass89_13, Static247.aClass89_174, Static6.aClass89_9, Static296.aClass89_199, Static153.aClass89_117, Static321.aClass89_216, Static340.aClass89_227, Static230.aClass89_163, Static118.aClass89_144, Static353.aClass89_230, Static39.aClass89_34 };
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Lclient!da;")
	public static Class11_Sub4 method3190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static330.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub4 local14 = local7.aClass11_Sub4_1;
			local7.aClass11_Sub4_1 = null;
			return local14;
		}
	}
}
