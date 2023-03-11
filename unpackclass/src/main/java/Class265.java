import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!f")
public final class Class265 {

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "Lunpackclass!w;")
	private Class264 aClass264_6;

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "Lunpackclass!w;")
	private final Class264 aClass264_5 = new Class264();

	@OriginalMember(owner = "unpackclass!f", name = "<init>", descriptor = "()V")
	public Class265() {
		this.aClass264_5.aClass264_7 = this.aClass264_5;
		this.aClass264_5.aClass264_8 = this.aClass264_5;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "(Lunpackclass!w;)V")
	public void method6593(@OriginalArg(0) Class264 arg0) {
		if (arg0.aClass264_8 != null) {
			arg0.method6609();
		}
		arg0.aClass264_8 = this.aClass264_5.aClass264_8;
		arg0.aClass264_7 = this.aClass264_5;
		arg0.aClass264_8.aClass264_7 = arg0;
		arg0.aClass264_7.aClass264_8 = arg0;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "()Lunpackclass!w;")
	public Class264 method6594() {
		@Pc(3) Class264 local3 = this.aClass264_5.aClass264_7;
		if (local3 == this.aClass264_5) {
			this.aClass264_6 = null;
			return null;
		} else {
			this.aClass264_6 = local3.aClass264_7;
			return local3;
		}
	}

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "()Lunpackclass!w;")
	public Class264 method6595() {
		@Pc(2) Class264 local2 = this.aClass264_6;
		if (local2 == this.aClass264_5) {
			this.aClass264_6 = null;
			return null;
		} else {
			this.aClass264_6 = local2.aClass264_7;
			return local2;
		}
	}
}
