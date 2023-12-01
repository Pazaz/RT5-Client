import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class ChangeLocRequest extends Node {

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public int anInt6479;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	public int anInt6480;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	public int anInt6481;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	public int anInt6482;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
	public int anInt6484;

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
	public int anInt6486;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
	public int anInt6491;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
	public int anInt6492;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
	public int anInt6493;

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
	public int anInt6494;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
	public int anInt6488 = 0;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public int anInt6485 = -1;

	static {
		new Class16("", 76);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public static void mainLogic() {
		for (@Pc(10) ChangeLocRequest local10 = (ChangeLocRequest) Static207.aClass135_26.head(); local10 != null; local10 = (ChangeLocRequest) Static207.aClass135_26.next()) {
			if (local10.anInt6485 > 0) {
				local10.anInt6485--;
			}
			if (local10.anInt6485 != 0) {
				if (local10.anInt6488 > 0) {
					local10.anInt6488--;
				}
				if (local10.anInt6488 == 0 && local10.anInt6484 >= 1 && local10.anInt6486 >= 1 && Static373.buildAreaLimitX - 2 >= local10.anInt6484 && Static242.buildAreaLimitZ - 2 >= local10.anInt6486 && (local10.anInt6480 < 0 || Static287.method4931(local10.anInt6480, local10.anInt6479))) {
					Static79.method1871(local10.anInt6481, local10.anInt6484, local10.anInt6480, local10.anInt6494, local10.anInt6491, -1, local10.anInt6479, local10.anInt6486);
					local10.anInt6488 = -1;
					if (local10.anInt6480 == local10.anInt6492 && local10.anInt6492 == -1) {
						local10.unlink();
					} else if (local10.anInt6480 == local10.anInt6492 && local10.anInt6493 == local10.anInt6494 && local10.anInt6482 == local10.anInt6479) {
						local10.unlink();
					}
				}
			} else if (local10.anInt6492 < 0 || Static287.method4931(local10.anInt6492, local10.anInt6482)) {
				Static79.method1871(local10.anInt6481, local10.anInt6484, local10.anInt6492, local10.anInt6493, local10.anInt6491, -1, local10.anInt6482, local10.anInt6486);
				local10.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void push(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(12) ChangeLocRequest local12 = null;
		for (@Pc(17) ChangeLocRequest local17 = (ChangeLocRequest) Static207.aClass135_26.head(); local17 != null; local17 = (ChangeLocRequest) Static207.aClass135_26.next()) {
			if (local17.anInt6481 == arg6 && local17.anInt6484 == arg3 && arg5 == local17.anInt6486 && local17.anInt6491 == arg1) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new ChangeLocRequest();
			local12.anInt6486 = arg5;
			local12.anInt6481 = arg6;
			local12.anInt6484 = arg3;
			local12.anInt6491 = arg1;
			Static83.method1906(local12);
			Static207.aClass135_26.addTail(local12);
		}
		local12.anInt6494 = arg4;
		local12.anInt6479 = arg2;
		local12.anInt6480 = arg0;
		local12.anInt6488 = 0;
		local12.anInt6485 = -1;
	}
}
