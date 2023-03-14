import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class LoginProt {

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "Lclient!vr;")
	public static final LoginProt LOGIN = new LoginProt(14, 1);
	@OriginalMember(owner = "client!ck", name = "K", descriptor = "Lclient!vr;")
	public static final LoginProt JS5 = new LoginProt(15, 4);
	@OriginalMember(owner = "client!ck", name = "L", descriptor = "Lclient!vr;")
	public static final LoginProt WORLD_CONNECT = new LoginProt(16, -2);
	@OriginalMember(owner = "client!ck", name = "M", descriptor = "Lclient!vr;")
	public static final LoginProt aClass242_4 = new LoginProt(17, 0);
	@OriginalMember(owner = "client!ck", name = "N", descriptor = "Lclient!vr;")
	public static final LoginProt WORLD_RECONNECT = new LoginProt(18, -2);
	@OriginalMember(owner = "client!ck", name = "O", descriptor = "Lclient!vr;")
	public static final LoginProt REGISTER_STEP1 = new LoginProt(20, 6);
	@OriginalMember(owner = "client!ck", name = "P", descriptor = "Lclient!vr;")
	public static final LoginProt VALIDATE_USERNAME = new LoginProt(21, 8);
	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lclient!vr;")
	public static final LoginProt REGISTER_STEP2 = new LoginProt(22, -2);
	@OriginalMember(owner = "client!ck", name = "R", descriptor = "Lclient!vr;")
	public static final LoginProt GET_WORLDLIST = new LoginProt(23, 4);
	@OriginalMember(owner = "client!ck", name = "S", descriptor = "Lclient!vr;")
	public static final LoginProt aClass242_10 = new LoginProt(24, -1);
	@OriginalMember(owner = "client!ck", name = "T", descriptor = "[Lclient!vr;")
	static final LoginProt[] aClass242Array1;
	@OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
	public final int opcode;

	static {
		aClass242Array1 = new LoginProt[32];
		@Pc(80) LoginProt[] packet = LoginProt.getAll();
		for (@Pc(82) int i = 0; i < packet.length; i++) {
			aClass242Array1[packet[i].opcode] = packet[i];
		}
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(II)V")
	public LoginProt(@OriginalArg(0) int opcode, @OriginalArg(1) int length) {
		this.opcode = opcode;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)[Lclient!vr;")
	public static LoginProt[] getAll() {
		return new LoginProt[] { LOGIN, JS5, WORLD_CONNECT, aClass242_4, WORLD_RECONNECT, REGISTER_STEP1, VALIDATE_USERNAME, REGISTER_STEP2, GET_WORLDLIST, aClass242_10 };
	}

	@OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
