package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/sja")
public final class sja extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/sja", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public sja(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jagdx/sja", name = "<init>", descriptor = "()V")
	public sja() {
	}
}
