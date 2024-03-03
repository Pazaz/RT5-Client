import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Lclient!gd;")
	public static final LocalizedString aClass79_74 = new LocalizedString("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt3408 = 0;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	public static final int anInt3410 = 205;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZIILclient!r;)V")
	public static void method3367(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Js5 arg3) {
		Static384.aBoolean485 = false;
		MusicPlayer.songArchive = arg3;
		Static105.anInt2183 = arg0;
		Static341.anInt6376 = 0;
		Static356.anInt6641 = arg2;
		MusicPlayer.state = 1;
		MusicPlayer.volumeFadeRate = MusicPlayer.stream.getVolume() / arg1;
		if (MusicPlayer.volumeFadeRate < 1) {
			MusicPlayer.volumeFadeRate = 1;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!bt;)V")
	public static void method3368(@OriginalArg(1) Packet arg0) {
		if (arg0.data.length - arg0.pos < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.g1();
		if (local21 < 0 || local21 > 1 || arg0.data.length - arg0.pos < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.g2();
		if (arg0.data.length - arg0.pos != local43 * 6) {
			return;
		}
		while (true) {
			@Pc(59) int local59;
			@Pc(63) int local63;
			do {
				do {
					do {
						if (arg0.pos >= arg0.data.length) {
							return;
						}
						local59 = arg0.g2();
						local63 = arg0.g4();
					} while (VarcDomain.varcs.length <= local59);
				} while (!Static89.aBooleanArray18[local59]);
			} while (client.VarcTypes.get(local59).aChar2 == '1' && (local63 < -1 || local63 > 1));
			VarcDomain.varcs[local59] = local63;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public static void method3370() {
		Static133.aClass98_17.clean(5);
	}

}
