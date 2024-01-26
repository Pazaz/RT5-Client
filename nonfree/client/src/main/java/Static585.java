import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBII)V")
	public static void method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static122.anInt2339; local1++) {
			@Pc(6) Rectangle local6 = Class2_Sub1_Sub28.aRectangleArray1[local1];
			if (arg1 < local6.x + local6.width && arg1 + arg0 > local6.x && local6.height + local6.y > arg3 && local6.y < arg2 + arg3) {
				Static364.aBooleanArray18[local1] = true;
			}
		}
		Static682.method8927(arg3, arg3 + arg2, arg1, arg1 + arg0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZ[B)[B")
	public static byte[] method7674(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static734.method7694(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)[Lclient!lga;")
	public static Class225[] method7677() {
		return new Class225[] { Static699.aClass225_252, Static273.aClass225_113, Static356.aClass225_149, Static155.aClass225_60, Static370.aClass225_152, Static121.aClass225_49, Static269.aClass225_111, Static384.aClass225_156, Static489.aClass225_185, Static303.aClass225_126, Static193.aClass225_74, Static137.aClass225_56, Static451.aClass225_171, Static671.aClass225_246, Static176.aClass225_187, Static40.aClass225_19, Static504.aClass225_188, Static481.aClass225_178, Static655.aClass225_237, Static287.aClass225_119, Static441.aClass225_168, Static641.aClass225_234, Static161.aClass225_62, Static207.aClass225_127, Static137.aClass225_57, Static590.aClass225_217, Static31.aClass225_14, Static314.aClass225_132, Static84.aClass225_36, Static670.aClass225_245, Static353.aClass225_233, Static606.aClass225_221, Static286.aClass225_117, Static109.aClass225_45, Static231.aClass225_102, Static207.aClass225_128, Static331.aClass225_138, Static100.aClass225_43, Static232.aClass225_103, Static40.aClass225_17, Static616.aClass225_223, Static166.aClass225_63, Static444.aClass225_169, Static651.aClass225_235, Static452.aClass225_173, Static464.aClass225_176, Static157.aClass225_61, Static347.aClass225_146, Static18.aClass225_7, Static479.aClass225_177, Static383.aClass225_155, Static12.aClass225_147, Static25.aClass225_11, Static390.aClass225_158, Static51.aClass225_30, Static215.aClass225_86, Static309.aClass225_130, Static225.aClass225_90, Static416.aClass225_165, Static432.aClass225_10, Static125.aClass225_52, Static557.aClass225_205, Static722.aClass225_260, Static679.aClass225_247, Static14.aClass225_5, Static284.aClass225_116, Static297.aClass225_125, Static608.aClass225_222, Static619.aClass225_34, Static91.aClass225_236, Static36.aClass225_15, Static334.aClass225_140, Static250.aClass225_105, Static586.aClass225_215, Static40.aClass225_16, Static125.aClass225_53, Static85.aClass225_257, Static468.aClass225_212, Static526.aClass225_194, Static229.aClass225_101, Static526.aClass225_195, Static618.aClass225_227, Static587.aClass225_216, Static211.aClass225_143, Static205.aClass225_80, Static320.aClass225_135, Static283.aClass225_115, Static446.aClass225_170, Static688.aClass225_250, Static632.aClass225_229, Static133.aClass225_55, Static132.aClass225_54, Static344.aClass225_144, Static636.aClass225_230, Static629.aClass225_228, Static286.aClass225_118, Static41.aClass225_20, Static87.aClass225_37, Static9.aClass225_3, Static570.aClass225_208, Static565.aClass225_76, Static46.aClass225_27, Static408.aClass225_162, Static491.aClass225_254, Static542.aClass225_199, Static706.aClass225_255, Static19.aClass225_8, Static707.aClass225_256, Static605.aClass225_220, Static266.aClass225_192, Static459.aClass225_175, Static617.aClass225_224, Static312.aClass225_131, Static208.aClass225_83, Static533.aClass225_196, Static233.aClass225_104, Static550.aClass225_200, Static660.aClass225_239, Static331.aClass225_139, Static598.aClass225_219, Static663.aClass225_241, Static389.aClass225_157, Static721.aClass225_259, Static428.aClass225_167, Static346.aClass225_145, Static72.aClass225_35, Static404.aClass225_161, Static563.aClass225_207, Static291.aClass225_123, Static663.aClass225_240, Static410.aClass225_163, Static224.aClass225_89, Static40.aClass225_18, Static718.aClass225_258, Static305.aClass225_129, Static411.aClass225_164, Static201.aClass225_206, Static119.aClass225_47, Static266.aClass225_191, Static692.aClass225_251, Static454.aClass225_174, Static618.aClass225_226, Static491.aClass225_253, Static272.aClass225_112, Static214.aClass225_85 };
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z")
	public static boolean method7682(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg3.equals(arg1);
		}
	}
}
