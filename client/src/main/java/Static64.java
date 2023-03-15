import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
	public static boolean method1704() {
		return MusicPlayer.state == 0 ? MusicPlayer.stream.isValid() : true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!r;Lclient!r;)I")
	public static int method1707(@OriginalArg(1) Js5 arg0, @OriginalArg(2) Js5 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.isFileReady(Sprites.p11FullId)) {
			local5++;
		}
		if (arg1.isFileReady(Sprites.p12FullId)) {
			local5++;
		}
		if (arg1.isFileReady(Sprites.b12FullId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.p11FullId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.p12FullId)) {
			local5++;
		}
		if (arg0.isFileReady(Sprites.b12FullId)) {
			local5++;
		}
		return local5;
	}
}
