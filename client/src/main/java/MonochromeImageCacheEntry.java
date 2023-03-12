import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class MonochromeImageCacheEntry extends Node {

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	public final int index;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	public final int row;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
	public MonochromeImageCacheEntry(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.index = arg1;
		this.row = arg0;
	}
}
