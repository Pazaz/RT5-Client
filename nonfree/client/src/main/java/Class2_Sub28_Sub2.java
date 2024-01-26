import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class2_Sub28_Sub2 extends Class2_Sub28 {

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class2_Sub28_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
	@Override
	public void method8560() {
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8558(@OriginalArg(1) OggPacket arg0) {
	}
}
