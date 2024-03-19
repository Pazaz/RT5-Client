import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class137 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	public int anInt4860;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public int anInt4861;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public int anInt4862;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	public int anInt4863;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class137() {
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ob;)V")
	public Class137(@OriginalArg(0) Class137 arg0) {
		this.anInt4861 = arg0.anInt4861;
		this.anInt4862 = arg0.anInt4862;
		this.anInt4863 = arg0.anInt4863;
		this.anInt4860 = arg0.anInt4860;
	}
}
