package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/DecoderContext")
public final class DecoderContext extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "<init>", descriptor = "(Lclient!jagtheora/theora/TheoraInfo;Lclient!jagtheora/theora/SetupInfo;)V")
	public DecoderContext(@OriginalArg(0) TheoraInfo arg0, @OriginalArg(1) SetupInfo arg1) {
		this.init(arg0, arg1);
		if (this.b()) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "granuleTime", descriptor = "(Lclient!jagtheora/theora/GranulePos;)D")
	public native double granuleTime(@OriginalArg(0) GranulePos arg0);

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "decodePacketIn", descriptor = "(Lclient!jagtheora/ogg/OggPacket;Lclient!jagtheora/theora/GranulePos;)I")
	public native int decodePacketIn(@OriginalArg(0) OggPacket arg0, @OriginalArg(1) GranulePos arg1);

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "getMaxPostProcessingLevel", descriptor = "()I")
	public native int getMaxPostProcessingLevel();

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "granuleFrame", descriptor = "(Lclient!jagtheora/theora/GranulePos;)J")
	public native long granuleFrame(@OriginalArg(0) GranulePos arg0);

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "setPostProcessingLevel", descriptor = "(I)I")
	public native int setPostProcessingLevel(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "setGranulePosition", descriptor = "(J)I")
	private native int setGranulePosition(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "decodeFrame", descriptor = "(Lclient!jagtheora/theora/Frame;)I")
	public native int decodeFrame(@OriginalArg(0) Frame arg0);

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "init", descriptor = "(Lclient!jagtheora/theora/TheoraInfo;Lclient!jagtheora/theora/SetupInfo;)V")
	private native void init(@OriginalArg(0) TheoraInfo arg0, @OriginalArg(1) SetupInfo arg1);

	@OriginalMember(owner = "client!jagtheora/theora/DecoderContext", name = "clear", descriptor = "()V")
	protected native void clear();
}
