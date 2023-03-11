import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("unpackclass!w")
public class Class264 {

	@OriginalMember(owner = "unpackclass!w", name = "a", descriptor = "Lunpackclass!w;")
	public Class264 aClass264_7;

	@OriginalMember(owner = "unpackclass!w", name = "b", descriptor = "Lunpackclass!w;")
	public Class264 aClass264_8;

	@OriginalMember(owner = "unpackclass!w", name = "a", descriptor = "()V")
	public final void method6609() {
		if (this.aClass264_8 != null) {
			this.aClass264_8.aClass264_7 = this.aClass264_7;
			this.aClass264_7.aClass264_8 = this.aClass264_8;
			this.aClass264_7 = null;
			this.aClass264_8 = null;
		}
	}

	@OriginalMember(owner = "unpackclass!w", name = "b", descriptor = "()Z")
	public final boolean method6610() {
		return this.aClass264_8 != null;
	}
}
