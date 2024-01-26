import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class87 implements Interface9 {

	@OriginalMember(owner = "client!du", name = "i", descriptor = "Lclient!iaa;")
	private final Class19_Sub2 aClass19_Sub2_3;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "[I")
	public final int[] anIntArray203;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	public final int anInt2357;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public final int anInt2354;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "Lclient!hia;")
	private Class165 aClass165_1;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "[F")
	public float[] aFloatArray16;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!iaa;Lclient!st;Lclient!hia;)V")
	public Class87(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class165 arg2) {
		this.aClass19_Sub2_3 = arg0;
		if (arg1 instanceof Class23_Sub1_Sub1) {
			@Pc(35) Class23_Sub1_Sub1 local35 = (Class23_Sub1_Sub1) arg1;
			this.anInt2357 = local35.anInt9302;
			this.anInt2354 = local35.anInt9306;
			this.anIntArray203 = local35.anIntArray32;
		} else if (arg1 instanceof Class23_Sub1_Sub2) {
			@Pc(13) Class23_Sub1_Sub2 local13 = (Class23_Sub1_Sub2) arg1;
			this.anIntArray203 = local13.anIntArray528;
			this.anInt2357 = local13.anInt9302;
			this.anInt2354 = local13.anInt9306;
		} else {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			this.aClass165_1 = arg2;
			if (this.anInt2357 != this.aClass165_1.anInt3961 || this.aClass165_1.anInt3960 != this.anInt2354) {
				throw new RuntimeException();
			}
			this.aFloatArray16 = this.aClass165_1.aFloatArray21;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) boolean arg4) {
		Static22.method588(0, arg2, this.aClass19_Sub2_3.aFloatArray25, arg4 ? this.aClass19_Sub2_3.aClass2_Sub10_1.anIntArray567 : null, this.aClass19_Sub2_3.aClass2_Sub10_1.anInt7053, this.aFloatArray16, this.anInt2357, 0, this.anIntArray203, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method9040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static22.method588(arg5, arg2, this.aFloatArray16, this.anIntArray203, this.anInt2357, this.aClass19_Sub2_3.aFloatArray25, this.aClass19_Sub2_3.aClass2_Sub10_1.anInt7053, arg4, this.aClass19_Sub2_3.aClass2_Sub10_1.anIntArray567, arg3, arg0, arg1);
	}
}
