import org.openrs2.deob.annotation.OriginalMember;

public class VarcDomain {

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
	public static final int[] updatedVarcs = new int[32];
	@OriginalMember(owner = "client!ud", name = "z", descriptor = "[I")
	public static final int[] anIntArray444 = new int[32];
	@OriginalMember(owner = "client!ef", name = "w", descriptor = "[I")
	public static int[] varcs;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
	public static int updatedVarcsWriterIndex = 0;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	public static int updatedVarcstrsWriterIndex = 0;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] varcstrs;

}
