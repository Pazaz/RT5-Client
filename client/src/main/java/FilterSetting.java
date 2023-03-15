import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class FilterSetting {

	@OriginalMember(owner = "client!jt", name = "eb", descriptor = "Lclient!oj;")
	public static final FilterSetting FILTER_0 = new FilterSetting(0);
	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!oj;")
	public static final FilterSetting FILTER_1 = new FilterSetting(1);
	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!oj;")
	public static final FilterSetting FILTER_2 = new FilterSetting(2);
	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public final int setting;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V")
	public FilterSetting(@OriginalArg(0) int arg0) {
		this.setting = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)Lclient!oj;")
	public static FilterSetting fromInt(@OriginalArg(1) int arg0) {
		@Pc(13) FilterSetting[] local13 = getall();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) FilterSetting local21 = local13[local15];
			if (local21.setting == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)[Lclient!oj;")
	public static FilterSetting[] getall() {
		return new FilterSetting[] { FILTER_0, FILTER_1, FILTER_2 };
	}

	@OriginalMember(owner = "client!oj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
