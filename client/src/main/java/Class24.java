import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class24 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!o;")
	private Class1 aClass1_39;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	private int anInt895 = 0;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Lclient!sf;")
	private final Class183 aClass183_4;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class24(@OriginalArg(0) Class183 arg0) {
		this.aClass183_4 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Lclient!o;")
	public Class1 method659() {
		@Pc(23) Class1 local23;
		if (this.anInt895 > 0 && this.aClass183_4.aClass1Array1[this.anInt895 - 1] != this.aClass1_39) {
			local23 = this.aClass1_39;
			this.aClass1_39 = local23.aClass1_247;
			return local23;
		}
		while (this.anInt895 < this.aClass183_4.anInt5989) {
			local23 = this.aClass183_4.aClass1Array1[this.anInt895++].aClass1_247;
			if (this.aClass183_4.aClass1Array1[this.anInt895 - 1] != local23) {
				this.aClass1_39 = local23.aClass1_247;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lclient!o;")
	public Class1 method660() {
		this.anInt895 = 0;
		return this.method659();
	}
}
