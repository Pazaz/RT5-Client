import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class59 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public int anInt2063;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public int anInt2067;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!il;I)V")
	public void method1740(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method1747(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIILclient!nr;)Lclient!qa;")
	public Class29 method1744(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt3191 << 19 | (arg0 ? 262144 : 0) | arg1 << 16 | this.anInt2063);
		@Pc(30) Class29 local30 = (Class29) Static160.aClass215_100.method6057(local24);
		if (local30 != null) {
			return local30;
		} else if (Static288.aClass162_211.method4615(this.anInt2063)) {
			@Pc(48) Class133 local48 = Static363.method3886(Static288.aClass162_211, this.anInt2063, 0);
			if (local48 != null) {
				local48.anInt4517 = local48.anInt4519 = local48.anInt4516 = local48.anInt4514 = 0;
				if (arg0) {
					local48.method3879();
				}
				for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
					local48.method3885();
				}
			}
			local30 = arg2.method2722(local48);
			if (local30 != null) {
				Static160.aClass215_100.method6050(local30, local24);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	public boolean method1745() {
		return Static288.aClass162_211.method4615(this.anInt2063);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIBLclient!il;)V")
	private void method1747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub16 arg2) {
		if (arg0 == 1) {
			this.anInt2063 = arg2.method5749();
		} else if (arg0 == 2) {
			this.anInt2067 = arg2.method5755();
		} else if (arg0 == 3) {
			this.aBoolean139 = true;
		} else if (arg0 == 4) {
			this.anInt2063 = -1;
		}
	}
}
