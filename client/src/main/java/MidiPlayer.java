import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public class MidiPlayer {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!r;Lclient!r;Lclient!r;Lclient!od;I)Z")
	public static boolean init(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) MidiPcmStream arg3) {
		Static91.aClass2_Sub12_Sub3_1 = arg3;
		Static123.aClass197_30 = arg2;
		Static177.aClass197_48 = arg0;
		Static111.aClass197_25 = arg1;
		return true;
	}

}
