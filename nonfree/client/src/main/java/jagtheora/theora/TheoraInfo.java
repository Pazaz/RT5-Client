package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/TheoraInfo")
public final class TheoraInfo extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "frameWidth", descriptor = "I")
	public int frameWidth;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picX", descriptor = "I")
	private int picX;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "pixelFormat", descriptor = "I")
	private int pixelFormat;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picHeight", descriptor = "I")
	private int picHeight;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "frameHeight", descriptor = "I")
	public int frameHeight;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "fpsDenominator", descriptor = "I")
	public int fpsDenominator;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picY", descriptor = "I")
	private int picY;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionSubMinor", descriptor = "B")
	private byte versionSubMinor;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "fpsNumerator", descriptor = "I")
	public int fpsNumerator;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "aspectDenominator", descriptor = "I")
	private int aspectDenominator;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "colourSpace", descriptor = "I")
	private int colourSpace;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionMinor", descriptor = "B")
	private byte versionMinor;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionMajor", descriptor = "B")
	private byte versionMajor;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picWidth", descriptor = "I")
	private int picWidth;

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "aspectNumerator", descriptor = "I")
	private int aspectNumerator;

	static {
		initFields();
	}

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "initFields", descriptor = "()V")
	private static native void initFields();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "<init>", descriptor = "()V")
	public TheoraInfo() {
		this.init();
		if (this.b()) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "init", descriptor = "()V")
	protected native void init();

	@OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "clear", descriptor = "()V")
	protected native void clear();
}
