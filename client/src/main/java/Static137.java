import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lclient!jd;")
	public static Sprite[] aClass13Array13;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILclient!ed;I)V")
	public static void addObjStack(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) ObjStack arg2, @OriginalArg(4) int arg3) {
		@Pc(25) long local25 = (long) (arg1 | arg3 << 28 | arg0 << 14);
		@Pc(31) Class2_Sub32 local31 = (Class2_Sub32) Static120.objStacks.get(local25);
		if (local31 == null) {
			local31 = new Class2_Sub32();
			Static120.objStacks.put(local31, local25);
			local31.aClass135_34.addTail(arg2);
			return;
		}
		@Pc(54) ObjType local54 = client.ObjTypes.get(arg2.type);
		@Pc(57) int local57 = local54.cost;
		if (local54.stackable == 1) {
			local57 *= arg2.count + 1;
		}
		for (@Pc(76) ObjStack local76 = (ObjStack) local31.aClass135_34.head(); local76 != null; local76 = (ObjStack) local31.aClass135_34.next()) {
			local54 = client.ObjTypes.get(local76.type);
			@Pc(87) int local87 = local54.cost;
			if (local54.stackable == 1) {
				local87 *= local76.count + 1;
			}
			if (local57 > local87) {
				Static97.method2100(arg2, local76);
				return;
			}
		}
		local31.aClass135_34.addTail(arg2);
	}

}
