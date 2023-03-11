import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!c")
public final class BufferPool {

	@OriginalMember(owner = "unpackclass!c", name = "a", descriptor = "I")
	private static int anInt7282;

	@OriginalMember(owner = "unpackclass!c", name = "b", descriptor = "I")
	private static int anInt7283;

	@OriginalMember(owner = "unpackclass!c", name = "c", descriptor = "I")
	private static int anInt7284;

	@OriginalMember(owner = "unpackclass!c", name = "d", descriptor = "[[B")
	private static final byte[][] aByteArrayArray23 = new byte[1000][];

	@OriginalMember(owner = "unpackclass!c", name = "e", descriptor = "[[B")
	private static final byte[][] aByteArrayArray24 = new byte[250][];

	@OriginalMember(owner = "unpackclass!c", name = "f", descriptor = "[[B")
	private static final byte[][] aByteArrayArray25 = new byte[50][];

	@OriginalMember(owner = "unpackclass!c", name = "a", descriptor = "(I)[B")
	public static synchronized byte[] method6573(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12;
		if (arg0 == 100 && anInt7282 > 0) {
			local12 = aByteArrayArray23[--anInt7282];
			aByteArrayArray23[anInt7282] = null;
			return local12;
		} else if (arg0 == 5000 && anInt7283 > 0) {
			local12 = aByteArrayArray24[--anInt7283];
			aByteArrayArray24[anInt7283] = null;
			return local12;
		} else if (arg0 == 30000 && anInt7284 > 0) {
			local12 = aByteArrayArray25[--anInt7284];
			aByteArrayArray25[anInt7284] = null;
			return local12;
		} else {
			return new byte[arg0];
		}
	}
}
