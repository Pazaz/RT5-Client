import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class ModeWhere {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_LIVE = new ModeWhere("LIVE", 0);
	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!kk;")
	public static final ModeWhere aClass127_8 = new ModeWhere("WTRC", 1);
	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!kk;")
	public static final ModeWhere aClass127_1 = new ModeWhere("WTQA", 2);
	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!kk;")
	public static final ModeWhere aClass127_2 = new ModeWhere("WTWIP", 3);
	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!kk;")
	public static final ModeWhere aClass127_3 = new ModeWhere("WTI", 5);
	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!kk;")
	public static final ModeWhere MODE_WHERE_LOCAL = new ModeWhere("LOCAL", 4);
	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public final int anInt3427;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public ModeWhere(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3427 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)[Lclient!kk;")
	public static ModeWhere[] getAll() {
		return new ModeWhere[] { MODE_WHERE_LIVE, aClass127_8, aClass127_1, aClass127_2, MODE_WHERE_LOCAL, aClass127_3 };
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lclient!kk;")
	public static ModeWhere get(@OriginalArg(0) int arg0) {
		@Pc(13) ModeWhere[] local13 = getAll();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) ModeWhere local21 = local13[local15];
			if (local21.anInt3427 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!kk;)Z")
	public static boolean isExternalMode(@OriginalArg(1) ModeWhere arg0) {
		return aClass127_8 == arg0 || aClass127_1 == arg0 || aClass127_2 == arg0 || aClass127_3 == arg0;
	}

	@OriginalMember(owner = "client!kk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
