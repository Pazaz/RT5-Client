import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class85 {

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "Lclient!sf;")
	private final Class183 aClass183_9 = new Class183(256);

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "Lclient!sf;")
	private final Class183 aClass183_10 = new Class183(256);

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!qj;")
	private final Class162 aClass162_94;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "Lclient!qj;")
	private final Class162 aClass162_95;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!qj;Lclient!qj;)V")
	public Class85(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class162 arg1) {
		this.aClass162_94 = arg1;
		this.aClass162_95 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[II)Lclient!ok;")
	private Class1_Sub13_Sub1 method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 << 4 & 0xFFF2 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub13_Sub1 local33 = (Class1_Sub13_Sub1) this.aClass183_10.method5053(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class1_Sub41 local54 = (Class1_Sub41) this.aClass183_9.method5053(local26);
			if (local54 == null) {
				local54 = Static333.method5886(this.aClass162_94, arg0, arg1);
				if (local54 == null) {
					return null;
				}
				this.aClass183_9.method5055(local26, local54);
			}
			local33 = local54.method5887(arg2);
			if (local33 == null) {
				return null;
			} else {
				local54.method6172();
				this.aClass183_10.method5055(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[III)Lclient!ok;")
	private Class1_Sub13_Sub1 method2378(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0xFFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(41) Class1_Sub13_Sub1 local41 = (Class1_Sub13_Sub1) this.aClass183_10.method5053(local24);
		if (local41 != null) {
			return local41;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(59) Class19 local59 = Static356.method468(this.aClass162_95, arg2, arg1);
			if (local59 == null) {
				return null;
			}
			local41 = local59.method467();
			this.aClass183_10.method5055(local24, local41);
			if (arg0 != null) {
				arg0[0] -= local41.aByteArray68.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[I)Lclient!ok;")
	public Class1_Sub13_Sub1 method2380(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass162_94.method4633() == 1) {
			return this.method2376(0, arg0, arg1);
		} else if (this.aClass162_94.method4640(arg0) == 1) {
			return this.method2376(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B[II)Lclient!ok;")
	public Class1_Sub13_Sub1 method2383(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass162_95.method4633() == 1) {
			return this.method2378(arg0, arg1, 0);
		} else if (this.aClass162_95.method4640(arg1) == 1) {
			return this.method2378(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
