import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!es", name = "q", descriptor = "[I")
	public static final int[] anIntArray132 = new int[256];

	@OriginalMember(owner = "client!es", name = "n", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!es", name = "r", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "I")
	public int anInt2056;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "I")
	public int anInt2058;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "[Lclient!or;")
	public Class145[] aClass145Array1;

	@OriginalMember(owner = "client!es", name = "A", descriptor = "[Lclient!or;")
	public Class145[] aClass145Array2;

	@OriginalMember(owner = "client!es", name = "C", descriptor = "[I")
	public int[] anIntArray134;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray132[local8] = local11;
		}
	}
}
