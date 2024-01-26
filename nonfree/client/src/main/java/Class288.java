import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class288 implements Interface15 {

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "Lclient!sb;")
	private final Class330 aClass330_94;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString83;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!sb;Ljava/lang/String;)V")
	public Class288(@OriginalArg(0) Class330 arg0, @OriginalArg(1) String arg1) {
		this.aClass330_94 = arg0;
		this.aString83 = arg1;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)I")
	@Override
	public int method6465() {
		return this.aClass330_94.method7578(this.aString83) ? 100 : 0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Lclient!kf;")
	@Override
	public Class206 method6464() {
		return Static326.aClass206_2;
	}
}
