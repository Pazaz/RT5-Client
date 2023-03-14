import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class ModeEnvironment {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
	public final int anInt5803;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public ModeEnvironment(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5803 = arg1;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)[Lclient!rt;")
	public static ModeEnvironment[] getMoveEnvironments() {
		return new ModeEnvironment[] { client.MODE_ENV_LIVE, client.MODE_ENV_RC, client.MODE_ENV_WIP };
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
	public int method5282() {
		return this.anInt5803;
	}

	@OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
