import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class43 {

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "[Lclient!fla;")
	public static final Class130[] aClass130Array1 = new Class130[5];

	static {
		for (@Pc(25) int local25 = 0; local25 < aClass130Array1.length; local25++) {
			aClass130Array1[local25] = new Class130();
		}
	}
}
