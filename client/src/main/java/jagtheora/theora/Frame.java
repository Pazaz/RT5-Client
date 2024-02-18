package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/Frame")
public final class Frame extends SimplePeer {

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "b", descriptor = "I")
	public final int b;

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "a", descriptor = "I")
	public final int a;

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "pixels", descriptor = "[I")
	public final int[] pixels;

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "init", descriptor = "()V")
	protected native void init();

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "<init>", descriptor = "(II)V")
	public Frame(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.b = arg0;
		this.a = arg1;
		this.pixels = new int[this.a * this.b];
	}

	@OriginalMember(owner = "client!jagtheora/theora/Frame", name = "clear", descriptor = "()V")
	protected native void clear();
}
