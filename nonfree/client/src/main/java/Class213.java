import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class213 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Lclient!fla;")
	public final Class130 aClass130_8 = new Class130();

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Z")
	public boolean aBoolean426 = false;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Z)V")
	public Class213(@OriginalArg(0) boolean arg0) {
		this.aBoolean426 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!pea;)V")
	public void method5008(@OriginalArg(1) Class8_Sub7 arg0) {
		@Pc(6) Class8_Sub2 local6 = arg0.aClass8_Sub2_18;
		@Pc(8) boolean local8 = true;
		@Pc(11) Class8_Sub6[] local11 = arg0.aClass8_Sub6Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			if (local11[local13].aBoolean352) {
				local8 = false;
				break;
			}
		}
		if (local8) {
			return;
		}
		@Pc(42) Class8_Sub7 local42;
		if (this.aBoolean426) {
			for (local42 = (Class8_Sub7) this.aClass130_8.method2790(); local42 != null; local42 = (Class8_Sub7) this.aClass130_8.method2785()) {
				if (local42.aClass8_Sub2_18 == local6) {
					local42.method9274();
					Static281.method4092(local42);
				}
			}
		}
		for (local42 = (Class8_Sub7) this.aClass130_8.method2790(); local42 != null; local42 = (Class8_Sub7) this.aClass130_8.method2785()) {
			if (local6.anInt10697 >= local42.aClass8_Sub2_18.anInt10697) {
				Static370.method5282(arg0, local42);
				return;
			}
		}
		this.aClass130_8.method2787(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public void method5010() {
		while (true) {
			@Pc(5) Class8_Sub7 local5 = (Class8_Sub7) this.aClass130_8.method2783();
			if (local5 == null) {
				return;
			}
			local5.method9274();
			Static281.method4092(local5);
		}
	}
}
