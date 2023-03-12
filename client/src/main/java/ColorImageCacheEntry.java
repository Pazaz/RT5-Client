import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class ColorImageCacheEntry extends Node {

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "[Lclient!cm;")
	public static final Class36[] aClass36Array1 = new Class36[5];

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	public final int row;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public final int index;

	static {
		for (@Pc(14) int local14 = 0; local14 < aClass36Array1.length; local14++) {
			aClass36Array1[local14] = new Class36();
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V")
	public ColorImageCacheEntry(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.row = arg1;
		this.index = arg0;
	}
}
