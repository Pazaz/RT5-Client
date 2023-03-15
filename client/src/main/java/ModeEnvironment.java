import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class ModeEnvironment {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
	public final int offset;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public ModeEnvironment(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.offset = arg1;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)[Lclient!rt;")
	public static ModeEnvironment[] getAll() {
		return new ModeEnvironment[] { client.MODE_ENV_LIVE, client.MODE_ENV_RC, client.MODE_ENV_WIP };
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lclient!rt;")
	public static ModeEnvironment get(@OriginalArg(0) int arg0) {
		@Pc(8) ModeEnvironment[] local8 = getAll();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) ModeEnvironment local21 = local8[local15];
			if (local21.offset == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
	public int getOffset() {
		return this.offset;
	}

	@OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
