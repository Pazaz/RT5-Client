import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!s", name = "q", descriptor = "[B")
	public static final byte[] aByteArray36 = new byte[32896];

	@OriginalMember(owner = "client!s", name = "u", descriptor = "[J")
	public static final long[] aLongArray5;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public static int anInt3948;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Z")
	public boolean aBoolean277 = false;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "Z")
	public boolean aBoolean278 = false;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	protected final int anInt3947;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	protected int anInt3944;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	protected int anInt3946;

	static {
		@Pc(4) int local4 = 0;
		@Pc(9) int local9;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (local9 = 0; local9 <= local6; local9++) {
				aByteArray36[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
		aLongArray5 = new long[256];
		anInt3948 = 1;
		for (local9 = 0; local9 < 256; local9++) {
			@Pc(57) long local57 = (long) local9;
			for (@Pc(59) int local59 = 0; local59 < 8; local59++) {
				if ((local57 & 0x1L) == 1L) {
					local57 = local57 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local57 >>>= 0x1;
				}
			}
			aLongArray5[local9] = local57;
		}
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class7_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3947 = arg1;
		this.anInt3944 = arg2;
		this.aBoolean277 = arg3;
		this.anInt3946 = arg0;
		this.aBoolean278 = arg4;
	}
}
