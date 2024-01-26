import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static670 {

	@OriginalMember(owner = "client!vda", name = "O", descriptor = "I")
	public static int anInt10024;

	@OriginalMember(owner = "client!vda", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("9fc5323834b21985bca85a933ed06a3bdb20b6969785718c3b2b8209ea0c112e340b76bdd04107f6ced8eb4190da07545a78b324a1b674d92e60b8a57981f547c984b7053aa1408b2e44584f790acc69c989433f35b1d88a3d65362da265a6d21c0d150591f747937bb3f9604c73b2a7529a0b15e7565511846b75feb658403b411eb90131a7d12a0ad5b70541da3e4b99f5f4857e837f23b832d09440dd53980a83f8c87926fc836a08cc44527ac2ef81429496125635f62b5023d02a3eeabde611fe4bea2c32ebacad31853a22e1222a32d0fade2416c8dc161f241652f6ec9d29788485f5a7f1ceb9e1a2356440f6701105967877347819bb074167e3ad35a56687af7a6dad566a070d779efed4a79b985422fa5d20d7065f065c4d1025dd4fb7861e24ba3a7472830ff483bec283d9984c421873d7a02e2040808e34ef97ad0065f8495350a2a8832e9c6546316dd3e90f76fabb680fde262208f1414b614451c84d8075e6717ddc0e729c06b38963be0c1bc821c00f1e21ceaee3763b43f2d132c1eacfd2f242d348fd6c87582dfe9dcfc0cbe60bc4eb2e91c5d02fc65360e923cad580004c304bcd9bc9f31e9db59315456b1c7c79cd5b956a63fb090de858fa41780f5e2212a827865385b7716a5bbb1ddd458d52ec630f4ce72c265627a7916a7026af650b85f42f4dcb4730d92a72b0047a3f09b17a1d2b96124e3f", 16);

	@OriginalMember(owner = "client!vda", name = "Q", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_245 = new Class225(29, 6);

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIII)I")
	public static int method8732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg0) {
			return arg1 < arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V")
	public static void method8735() {
		if (Static265.aByteArray44 != null) {
			Static619.method1512(Static470.anInt7113);
		} else if (Static129.anInt2409 == -1) {
			Static192.method2877(Static59.aString63, Static470.anInt7113, Static449.aString75);
		} else {
			Static113.method2119(Static470.anInt7113);
		}
	}
}
