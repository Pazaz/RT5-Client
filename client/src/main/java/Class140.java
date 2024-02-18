import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class140 {

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
	private final int anInt3267;

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "Lclient!bba;")
	public final Class32 aClass32_63;

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
	public final int anInt3270;

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
	public final int anInt3271;

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "Z")
	public final boolean aBoolean263;

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "Lclient!bba;")
	public final Class32 aClass32_64;

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "Z")
	public final boolean aBoolean264;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(ILclient!bba;I)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(ILclient!bba;Lclient!bba;II)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(ILclient!bba;Lclient!bba;IIZZ)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3271 = arg3;
		this.aBoolean263 = arg5;
		this.anInt3270 = arg4;
		this.aBoolean264 = arg6;
		this.aClass32_64 = arg2;
		this.aClass32_63 = arg1;
		this.anInt3267 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)I")
	public int method2952() {
		return this.anInt3267;
	}
}
