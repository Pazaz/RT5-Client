import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public abstract class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vw", name = "y", descriptor = "[J")
	public static final long[] aLongArray21 = new long[256];

	@OriginalMember(owner = "client!vw", name = "w", descriptor = "I")
	public final int anInt10683;

	static {
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(53) long local53 = (long) local49;
			for (@Pc(55) int local55 = 0; local55 < 8; local55++) {
				if ((local53 & 0x1L) == 1L) {
					local53 = local53 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local53 >>>= 0x1;
				}
			}
			aLongArray21[local49] = local53;
		}
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub2_Sub14(@OriginalArg(0) int arg0) {
		this.anInt10683 = arg0;
	}

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method9268();

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "(I)Z")
	public abstract boolean method9270();
}
