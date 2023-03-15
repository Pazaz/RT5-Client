import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class127 {

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public final int anInt3427;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class127(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3427 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)[Lclient!kk;")
	public static Class127[] method2740() {
		return new Class127[] { client.MODE_WHERE_LIVE, Static125.aClass127_8, Static27.aClass127_1, Static45.aClass127_2, client.MODE_WHERE_LOCAL, Static48.aClass127_3 };
	}

	@OriginalMember(owner = "client!kk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
