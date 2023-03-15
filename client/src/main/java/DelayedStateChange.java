import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class DelayedStateChange extends SecondaryNode {

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
	public int anInt2284;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	public int anInt2290;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V")
	public DelayedStateChange(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.key = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
	public static void method2585(@OriginalArg(0) int arg0) {
		@Pc(13) DelayedStateChange local13 = Static316.method5413(11, arg0);
		local13.method2312();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method3778(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static316.method5413(7, arg0);
		local12.method2312();
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IB)V")
	public static void method6220(@OriginalArg(0) int arg0) {
		@Pc(16) DelayedStateChange local16 = Static316.method5413(12, arg0);
		local16.method2312();
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public static void method4723(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static316.method5413(6, arg0);
		local12.method2312();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
	public static void method2552(@OriginalArg(0) int arg0) {
		@Pc(8) DelayedStateChange local8 = Static316.method5413(14, arg0);
		local8.method2312();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public static void method4213(@OriginalArg(1) int arg0) {
		@Pc(8) DelayedStateChange local8 = Static316.method5413(4, arg0);
		local8.method2312();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void setComponentModelAngleClient(@OriginalArg(1) int arg0) {
		@Pc(13) DelayedStateChange local13 = Static316.method5413(8, arg0);
		local13.method2312();
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(ZI)V")
	public static void setComponentModelOffsetClient(@OriginalArg(1) int arg0) {
		@Pc(12) DelayedStateChange local12 = Static316.method5413(10, arg0);
		local12.method2312();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V")
	public static void method4343(@OriginalArg(0) int arg0) {
		@Pc(8) DelayedStateChange local8 = Static316.method5413(5, arg0);
		local8.method2312();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	public static void method3364(@OriginalArg(1) int arg0) {
		@Pc(16) DelayedStateChange local16 = Static316.method5413(3, arg0);
		local16.method2312();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
	public static void method2439(@OriginalArg(1) int arg0) {
		@Pc(17) DelayedStateChange local17 = Static316.method5413(16, arg0);
		local17.method2312();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!nk;B)V")
	public static void method1911(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class161 arg1) {
		@Pc(12) int local12 = arg1.scrollMaxH == 0 ? arg1.width : arg1.scrollMaxH;
		@Pc(24) int local24 = arg1.scrollMaxV == 0 ? arg1.height : arg1.scrollMaxV;
		Static364.method6105(arg0, local24, arg1.id, Static26.aClass161ArrayArray1[arg1.id >> 16], local12);
		if (arg1.activeComponents != null) {
			Static364.method6105(arg0, local24, arg1.id, arg1.activeComponents, local12);
		}
		@Pc(57) Class2_Sub7 local57 = (Class2_Sub7) Static329.aClass4_130.get((long) arg1.id);
		if (local57 != null) {
			Static129.method2435(local24, local57.anInt1370, arg0, local12);
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
	public static void setComponentObjClient(@OriginalArg(1) int arg0) {
		@Pc(13) DelayedStateChange local13 = Static316.method5413(9, arg0);
		local13.method2312();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	public int method2307() {
		return (int) (super.key >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)J")
	public long method2308() {
		return super.secondaryKey & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I")
	public int method2309() {
		return (int) super.key;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	public void method2311() {
		super.secondaryKey |= Long.MIN_VALUE;
		if (this.method2308() == 0L) {
			Static368.aClass246_10.addTail(this);
		}
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
	public void method2312() {
		super.secondaryKey = MonotonicClock.currentTimeMillis() + 500L | super.secondaryKey & Long.MIN_VALUE;
		Static208.aClass246_4.addTail(this);
	}
}
