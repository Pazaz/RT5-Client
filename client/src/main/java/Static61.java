import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lclient!hu;")
	public static final LruHashTable aClass98_5 = new LruHashTable(8);

	@OriginalMember(owner = "client!dj", name = "bb", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[JI[II)V")
	public static void method1671(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 + (long) (local46 & 0x1) > arg0[local46]) {
				@Pc(64) long local64 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local64;
				@Pc(78) int local78 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local78;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method1671(arg0, local16 - 1, arg2, arg3);
		method1671(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBLclient!r;)Lclient!vj;")
	public static Map method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Js5 arg2) {
		@Pc(14) Buffer local14 = new Buffer(arg2.fetchFile(arg0, arg1));
		@Pc(54) Map local54 = new Map(arg0, local14.gjstr(), local14.gjstr(), local14.g4(), local14.g4(), local14.g1() == 1, local14.g1(), local14.g1());
		@Pc(58) int local58 = local14.g1();
		for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
			local54.aClass135_41.addTail(new Class2_Sub31(local14.g1(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2(), local14.g2()));
		}
		local54.method6150();
		return local54;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
	public static void method1673() {
		for (@Pc(5) int local5 = 0; local5 < NpcList.size; local5++) {
			@Pc(13) int local13 = NpcList.ids[local5];
			@Pc(17) Npc local17 = NpcList.npcs[local13];
			if (local17 != null) {
				Static93.method1999(local17, local17.type.size);
			}
		}
	}
}
