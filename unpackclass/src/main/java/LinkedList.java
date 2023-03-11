import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!f")
public final class LinkedList {

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "Lunpackclass!w;")
	private Node aClass264_6;

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "Lunpackclass!w;")
	private final Node aClass264_5 = new Node();

	@OriginalMember(owner = "unpackclass!f", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.aClass264_5.aClass264_7 = this.aClass264_5;
		this.aClass264_5.aClass264_8 = this.aClass264_5;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "(Lunpackclass!w;)V")
	public void method6593(@OriginalArg(0) Node arg0) {
		if (arg0.aClass264_8 != null) {
			arg0.method6609();
		}
		arg0.aClass264_8 = this.aClass264_5.aClass264_8;
		arg0.aClass264_7 = this.aClass264_5;
		arg0.aClass264_8.aClass264_7 = arg0;
		arg0.aClass264_7.aClass264_8 = arg0;
	}

	@OriginalMember(owner = "unpackclass!f", name = "a", descriptor = "()Lunpackclass!w;")
	public Node method6594() {
		@Pc(3) Node local3 = this.aClass264_5.aClass264_7;
		if (local3 == this.aClass264_5) {
			this.aClass264_6 = null;
			return null;
		} else {
			this.aClass264_6 = local3.aClass264_7;
			return local3;
		}
	}

	@OriginalMember(owner = "unpackclass!f", name = "b", descriptor = "()Lunpackclass!w;")
	public Node method6595() {
		@Pc(2) Node local2 = this.aClass264_6;
		if (local2 == this.aClass264_5) {
			this.aClass264_6 = null;
			return null;
		} else {
			this.aClass264_6 = local2.aClass264_7;
			return local2;
		}
	}
}
