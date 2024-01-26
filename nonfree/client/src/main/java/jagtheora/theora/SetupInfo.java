package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/SetupInfo")
public final class SetupInfo extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/SetupInfo", name = "clear", descriptor = "()V")
	protected native void clear();

	@OriginalMember(owner = "client!jagtheora/theora/SetupInfo", name = "decodeHeader", descriptor = "(Lclient!jagtheora/theora/TheoraInfo;Lclient!jagtheora/theora/TheoraComment;Lclient!jagtheora/ogg/OggPacket;)I")
	public native int decodeHeader(@OriginalArg(0) TheoraInfo arg0, @OriginalArg(1) TheoraComment arg1, @OriginalArg(2) OggPacket arg2);
}
