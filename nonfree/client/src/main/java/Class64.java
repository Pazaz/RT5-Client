import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cha")
public final class Class64 implements Interface15 {

	@OriginalMember(owner = "client!cha", name = "g", descriptor = "Z")
	private boolean aBoolean138;

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString12;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class64(@OriginalArg(0) String arg0) {
		this.aString12 = arg0;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)I")
	@Override
	public int method6465() {
		if (this.aBoolean138) {
			return 100;
		}
		@Pc(14) int local14 = Static53.method1168(this.aString12);
		if (local14 >= 0 && local14 <= 100) {
			return local14;
		} else {
			this.aBoolean138 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!cha", name = "c", descriptor = "(I)Z")
	public boolean method1554() {
		return this.aBoolean138;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)Lclient!kf;")
	@Override
	public Class206 method6464() {
		return Static326.aClass206_4;
	}
}
