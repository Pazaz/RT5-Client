import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!il;)V")
	public Class90_Sub1(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class138_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected void method7751(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static163.aClass19_17.method7976(arg0 - 2, arg1, super.aClass138_5.anInt4418 + 4, super.aClass138_5.anInt4413 + 2, ((Class138_Sub3) super.aClass138_5).anInt4427, 0);
		Static163.aClass19_17.method7976(arg0 - 1, arg1 - -1, super.aClass138_5.anInt4418 + 2, super.aClass138_5.anInt4413, 0, 0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7753(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(21) int local21 = this.method7752() * super.aClass138_5.anInt4418 / 10000;
		Static163.aClass19_17.aa(arg0, arg1 + 2, local21, super.aClass138_5.anInt4413 - 2, ((Class138_Sub3) super.aClass138_5).anInt4428, 0);
		Static163.aClass19_17.aa(arg0 + local21, arg1 + 2, super.aClass138_5.anInt4418 - local21, super.aClass138_5.anInt4413 + -2, 0, 0);
	}
}
