import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray84 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean268 = true;

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "J")
	public static long aLong114 = 0L;

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
	public static final int anInt3421 = 1339;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;II)Lclient!ha;")
	public static Class19 method3093(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		return new Class19_Sub3(arg1, arg0, arg2);
	}
}
