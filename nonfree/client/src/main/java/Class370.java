import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class370 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
	public static final int[] anIntArray752 = new int[128];

	static {
		for (@Pc(49) int local49 = 0; local49 < anIntArray752.length; local49++) {
			anIntArray752[local49] = -1;
		}
		for (@Pc(61) int local61 = 65; local61 <= 90; local61++) {
			anIntArray752[local61] = local61 - 65;
		}
		for (@Pc(76) int local76 = 97; local76 <= 122; local76++) {
			anIntArray752[local76] = local76 - 71;
		}
		for (@Pc(91) int local91 = 48; local91 <= 57; local91++) {
			anIntArray752[local91] = local91 + 4;
		}
		anIntArray752[42] = anIntArray752[43] = 62;
		anIntArray752[45] = anIntArray752[47] = 63;
	}

	@OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
