import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class249 {

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public int anInt6249;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	public int anInt6250;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	public int anInt6252;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "Lclient!mn;")
	public Class249 aClass249_2;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Lclient!tt;")
	public Class73 aClass73_6;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
	public final int anInt6248;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	public final int anInt6247;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II)V")
	public Class249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6248 = arg0;
		this.anInt6247 = arg1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lclient!ok;")
	public Class278 method5590() {
		return Static66.method1487(this.anInt6248);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)Lclient!mn;")
	public Class249 method5593(@OriginalArg(1) int arg0) {
		return new Class249(this.anInt6248, arg0);
	}
}
