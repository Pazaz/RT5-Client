import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.math.BigInteger;

public class Protocol {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!qg;")
	public static final Packet outboundBuffer = new Packet(5000);
	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger MODULUS = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger EXPONENT = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!qg;")
	public static final Packet inboundBuffer = new Packet(5000);
	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_18 = new InboundPacket(18, -2);
	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_75 = new InboundPacket(75, 0);
	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_93 = new InboundPacket(93, 5);
	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_48 = new InboundPacket(48, 5);
	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_91 = new InboundPacket(91, 2);
	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_66 = new InboundPacket(66, 10);
	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_82 = new InboundPacket(82, 0);
	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_30 = new InboundPacket(30, 2);
	@OriginalMember(owner = "client!bp", name = "r", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_76 = new InboundPacket(76, -1);
	@OriginalMember(owner = "client!pk", name = "jb", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_0 = new InboundPacket(0, 10);
	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_36 = new InboundPacket(36, 8);
	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_12 = new InboundPacket(12, 3);
	@OriginalMember(owner = "client!ip", name = "g", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_72 = new InboundPacket(72, -2);
	@OriginalMember(owner = "client!wh", name = "v", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_77 = new InboundPacket(77, 12);
	@OriginalMember(owner = "client!vo", name = "p", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_89 = new InboundPacket(89, 6);
	@OriginalMember(owner = "client!fl", name = "o", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_52 = new InboundPacket(52, 9);
	@OriginalMember(owner = "client!wm", name = "q", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_20 = new InboundPacket(20, 6);
	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_25 = new InboundPacket(25, 8);
	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_70 = new InboundPacket(70, -2);
	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_7 = new InboundPacket(7, 2);
	@OriginalMember(owner = "client!mq", name = "o", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_55 = new InboundPacket(55, -1);
	@OriginalMember(owner = "client!ej", name = "C", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_43 = new InboundPacket(43, -1);
	@OriginalMember(owner = "client!aj", name = "R", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_58 = new InboundPacket(58, 0);
	@OriginalMember(owner = "client!js", name = "J", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_73 = new InboundPacket(73, 6);
	@OriginalMember(owner = "client!vp", name = "m", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_5 = new InboundPacket(5, 8);
	@OriginalMember(owner = "client!fu", name = "X", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_17 = new InboundPacket(17, 2);
	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_1 = new InboundPacket(1, 6);
	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_97 = new InboundPacket(97, 7);
	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_103 = new InboundPacket(103, 0);
	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_8 = new InboundPacket(8, 2);
	@OriginalMember(owner = "client!pg", name = "T", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_92 = new InboundPacket(92, 6);
	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_31 = new InboundPacket(31, 8);
	@OriginalMember(owner = "client!ct", name = "j", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_39 = new InboundPacket(39, 17);
	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_101 = new InboundPacket(101, 14);
	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_15 = new InboundPacket(15, 10);
	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_24 = new InboundPacket(24, 12);
	@OriginalMember(owner = "client!em", name = "f", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_35 = new InboundPacket(35, -2);
	@OriginalMember(owner = "client!wt", name = "X", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_26 = new InboundPacket(26, 28);
	@OriginalMember(owner = "client!wi", name = "x", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_71 = new InboundPacket(71, 20);
	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_10 = new InboundPacket(10, -1);
	@OriginalMember(owner = "client!ui", name = "l", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_104 = new InboundPacket(104, 4);
	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_83 = new InboundPacket(83, 7);
	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_40 = new InboundPacket(40, 1);
	@OriginalMember(owner = "client!jo", name = "p", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_23 = new InboundPacket(23, 8);
	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_56 = new InboundPacket(56, -1);
	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_94 = new InboundPacket(94, 3);
	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_42 = new InboundPacket(42, 3);
	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_105 = new InboundPacket(105, -1);
	@OriginalMember(owner = "client!gg", name = "O", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_41 = new InboundPacket(41, 3);
	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_19 = new InboundPacket(19, 0);
	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_38 = new InboundPacket(38, 14);
	@OriginalMember(owner = "client!wt", name = "bb", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_6 = new InboundPacket(6, -2);
	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_46 = new InboundPacket(46, -1);
	@OriginalMember(owner = "client!hq", name = "x", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_14 = new InboundPacket(14, 6);
	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_54 = new InboundPacket(54, 12);
	@OriginalMember(owner = "client!eq", name = "u", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_37 = new InboundPacket(37, -2);
	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_67 = new InboundPacket(67, -1);
	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_99 = new InboundPacket(99, -1);
	@OriginalMember(owner = "client!ck", name = "B", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_34 = new InboundPacket(34, 15);
	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_68 = new InboundPacket(68, 4);
	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_2 = new InboundPacket(2, 2);
	@OriginalMember(owner = "client!mr", name = "Ub", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_64 = new InboundPacket(64, 3);
	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_27 = new InboundPacket(27, 8);
	@OriginalMember(owner = "client!el", name = "o", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_80 = new InboundPacket(80, 2);
	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_4 = new InboundPacket(4, 1);
	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_44 = new InboundPacket(44, 8);
	@OriginalMember(owner = "client!ot", name = "I", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_47 = new InboundPacket(47, 6);
	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_50 = new InboundPacket(50, -1);
	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_85 = new InboundPacket(85, -2);
	@OriginalMember(owner = "client!hl", name = "I", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_61 = new InboundPacket(61, 4);
	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_62 = new InboundPacket(62, 6);
	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_84 = new InboundPacket(84, -1);
	@OriginalMember(owner = "client!sn", name = "E", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_100 = new InboundPacket(100, -2);
	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_81 = new InboundPacket(81, 8);
	@OriginalMember(owner = "client!bs", name = "s", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_74 = new InboundPacket(74, 4);
	@OriginalMember(owner = "client!so", name = "d", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_60 = new InboundPacket(60, -2);
	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_63 = new InboundPacket(63, -1);
	@OriginalMember(owner = "client!jl", name = "db", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_86 = new InboundPacket(86, 10);
	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_32 = new InboundPacket(32, -2);
	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_98 = new InboundPacket(98, -2);
	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_45 = new InboundPacket(45, 1);
	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_21 = new InboundPacket(21, 3);
	@OriginalMember(owner = "client!ak", name = "d", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_95 = new InboundPacket(95, 8);
	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_29 = new InboundPacket(29, 3);
	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_49 = new InboundPacket(49, -1);
	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_90 = new InboundPacket(90, 12);
	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_51 = new InboundPacket(51, -1);
	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_3 = new InboundPacket(3, 3);
	@OriginalMember(owner = "client!pk", name = "hb", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_78 = new InboundPacket(78, 6);
	@OriginalMember(owner = "client!wq", name = "o", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_69 = new InboundPacket(69, -2);
	@OriginalMember(owner = "client!ek", name = "X", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_65 = new InboundPacket(65, 5);
	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_22 = new InboundPacket(22, 8);
	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_11 = new InboundPacket(11, -1);
	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_88 = new InboundPacket(88, -2);
	@OriginalMember(owner = "client!vo", name = "z", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_33 = new InboundPacket(33, 15);
	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_53 = new InboundPacket(53, -1);
	@OriginalMember(owner = "client!un", name = "p", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_57 = new InboundPacket(57, 12);
	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_13 = new InboundPacket(13, 5);
	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_16 = new InboundPacket(16, 7);
	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_59 = new InboundPacket(59, -2);
	@OriginalMember(owner = "client!ne", name = "H", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_102 = new InboundPacket(102, 12);
	@OriginalMember(owner = "client!jl", name = "V", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_79 = new InboundPacket(79, 7);
	@OriginalMember(owner = "client!io", name = "p", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_87 = new InboundPacket(87, -2);
	@OriginalMember(owner = "client!lq", name = "t", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_28 = new InboundPacket(28, 6);
	@OriginalMember(owner = "client!od", name = "Bb", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_96 = new InboundPacket(96, 6);
	@OriginalMember(owner = "client!fk", name = "P", descriptor = "Lclient!h;")
	public static final InboundPacket PACKET_9 = new InboundPacket(9, 8);
	@OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
	public static final int[] removedIds = new int[1000];
	@OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
	public static final int[] extendedIds = new int[250];

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!cc;")
	public static PrivilegedRequest socketRequest = null;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!cc;")
	public static PrivilegedRequest socketRequest2;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "Lclient!iu;")
	public static Class111 socket;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
	public static int verifyId = 0;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!h;")
	public static InboundPacket packet = null;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public static int packetSize = 0;
	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	public static int totalRead;
	@OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
	public static boolean aBoolean129 = true;
	@OriginalMember(owner = "client!dr", name = "O", descriptor = "Lclient!h;")
	public static InboundPacket packet2;
	@OriginalMember(owner = "client!th", name = "F", descriptor = "Lclient!h;")
	public static InboundPacket packet1;
	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	public static int anInt4955 = 0;
	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!h;")
	public static InboundPacket packet3;
	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	public static int removedCount = 0;
	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	public static int extendedCount = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)[Lclient!h;")
	public static InboundPacket[] INCOMING_WORLD() {
		return new InboundPacket[] { PACKET_0, PACKET_1, PACKET_2, PACKET_3, PACKET_4, PACKET_5, PACKET_6, PACKET_7, PACKET_8, PACKET_9, PACKET_10, PACKET_11, PACKET_12, PACKET_13, PACKET_14, PACKET_15, PACKET_16, PACKET_17, PACKET_18, PACKET_19, PACKET_20, PACKET_21, PACKET_22, PACKET_23, PACKET_24, PACKET_25, PACKET_26, PACKET_27, PACKET_28, PACKET_29, PACKET_30, PACKET_31, PACKET_32, PACKET_33, PACKET_34, PACKET_35, PACKET_36, PACKET_37, PACKET_38, PACKET_39, PACKET_40, PACKET_41, PACKET_42, PACKET_43, PACKET_44, PACKET_45, PACKET_46, PACKET_47, PACKET_48, PACKET_49, PACKET_50, PACKET_51, PACKET_52, PACKET_53, PACKET_54, PACKET_55, PACKET_56, PACKET_57, PACKET_58, PACKET_59, PACKET_60, PACKET_61, PACKET_62, PACKET_63, PACKET_64, PACKET_65, PACKET_66, PACKET_67, PACKET_68, PACKET_69, PACKET_70, PACKET_71, PACKET_72, PACKET_73, PACKET_74, PACKET_75, PACKET_76, PACKET_77, PACKET_78, PACKET_79, PACKET_80, PACKET_81, PACKET_82, PACKET_83, PACKET_84, PACKET_85, PACKET_86, PACKET_87, PACKET_88, PACKET_89, PACKET_90, PACKET_91, PACKET_92, PACKET_93, PACKET_94, PACKET_95, PACKET_96, PACKET_97, PACKET_98, PACKET_99, PACKET_100, PACKET_101, PACKET_102, PACKET_103, PACKET_104, PACKET_105 };
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
	public static boolean readPacketInternal() throws IOException {
		if (socket == null) {
			return false;
		}
		@Pc(15) int available = socket.available();
		if (available == 0) {
			return false;
		}
		@Pc(74) int local74;
		if (packet == null) {
			if (aBoolean129) {
				available--;
				socket.read(inboundBuffer.data, 1, 0);
				totalRead++;
				aBoolean129 = false;
			}
			inboundBuffer.pos = 0;
			if (inboundBuffer.peek1isaac()) {
				if (available == 0) {
					return false;
				}
				socket.read(inboundBuffer.data, 1, 1);
				available--;
				totalRead++;
			}
			aBoolean129 = true;
			@Pc(70) InboundPacket[] incoming = INCOMING_WORLD();
			local74 = inboundBuffer.gsmart_isaac();
			if (local74 < 0 || incoming.length <= local74) {
				throw new IOException("invo:" + local74);
			}
			packet = incoming[local74];
			packetSize = packet.size;
		}
		if (packetSize == -1) {
			if (available <= 0) {
				return false;
			}
			socket.read(inboundBuffer.data, 1, 0);
			totalRead++;
			packetSize = inboundBuffer.data[0] & 0xFF;
			available--;
		}
		if (packetSize == -2) {
			if (available <= 1) {
				return false;
			}
			socket.read(inboundBuffer.data, 2, 0);
			inboundBuffer.pos = 0;
			available -= 2;
			packetSize = inboundBuffer.g2();
			totalRead += 2;
		}
		if (packetSize > available) {
			return false;
		}
		inboundBuffer.pos = 0;
		socket.read(inboundBuffer.data, packetSize, 0);
		anInt4955 = 0;
		packet3 = packet2;
		totalRead += packetSize;
		packet2 = packet1;
		packet1 = packet;
		if (PACKET_18 == packet) {
			Static235.method3339(GameShell.signlink, packetSize, inboundBuffer);
			packet = null;
			return true;
		} else if (packet == PACKET_75) {
			Static214.aClass226_1.method5781();
			packet = null;
			Static12.anInt269 += 32;
			return true;
		} else {
			@Pc(228) int local228;
			@Pc(249) int local249;
			@Pc(220) int local220;
			if (packet == PACKET_93) {
				local220 = inboundBuffer.g1();
				local74 = inboundBuffer.ig2();
				local228 = inboundBuffer.ig2();
				if (Static378.method6314(local228)) {
					if (local220 == 2) {
						Static90.method5953();
					}
					Static139.anInt2595 = local74;
					Static160.method2957(local74);
					Static60.method891(false);
					Static198.method3598(Static139.anInt2595);
					for (local249 = 0; local249 < 100; local249++) {
						Static357.aBooleanArray59[local249] = true;
					}
				}
				packet = null;
				return true;
			}
			@Pc(272) byte local272;
			if (packet == PACKET_48) {
				local272 = inboundBuffer.g1badd();
				local74 = inboundBuffer.g2add();
				local228 = inboundBuffer.ig2add();
				if (Static378.method6314(local74)) {
					Static322.method5481(local228, local272);
				}
				packet = null;
				return true;
			} else if (PACKET_91 == packet) {
				local220 = inboundBuffer.g2();
				if (Static378.method6314(local220)) {
					Static117.method2369();
				}
				packet = null;
				return true;
			} else {
				@Pc(344) Class2_Sub7 local344;
				if (packet == PACKET_66) {
					local220 = inboundBuffer.mg4();
					local74 = inboundBuffer.mg4();
					local228 = inboundBuffer.ig2();
					if (Static378.method6314(local228)) {
						@Pc(335) Class2_Sub7 local335 = (Class2_Sub7) Static329.aClass4_130.method90((long) local220);
						local344 = (Class2_Sub7) Static329.aClass4_130.method90((long) local74);
						if (local344 != null) {
							Static276.method4655(false, local344, local335 == null || local344.anInt1370 != local335.anInt1370);
						}
						if (local335 != null) {
							local335.method6468();
							Static329.aClass4_130.method87(local335, (long) local74);
						}
						@Pc(375) Class161 local375 = Static6.method140(local220);
						if (local375 != null) {
							Static200.method3645(local375);
						}
						local375 = Static6.method140(local74);
						if (local375 != null) {
							Static200.method3645(local375);
							Static85.method1911(true, local375);
						}
						if (Static139.anInt2595 != -1) {
							Static392.method6460(Static139.anInt2595, 1);
						}
					}
					packet = null;
					return true;
				} else if (PACKET_82 == packet) {
					if (Static139.anInt2595 != -1) {
						Static392.method6460(Static139.anInt2595, 0);
					}
					packet = null;
					return true;
				} else if (packet == PACKET_30) {
					local220 = inboundBuffer.g2();
					if (Static378.method6314(local220)) {
						Static351.method5859();
					}
					packet = null;
					return true;
				} else {
					@Pc(452) String local452;
					@Pc(444) String local444;
					if (PACKET_76 == packet) {
						local444 = inboundBuffer.gjstr();
						local452 = Static153.method2772(Static308.method5276(inboundBuffer));
						Static33.method4200(local444, 0, local452, 6, local444);
						packet = null;
						return true;
					}
					@Pc(506) int local506;
					@Pc(512) int local512;
					@Pc(536) int local536;
					@Pc(542) int local542;
					@Pc(638) int local638;
					@Pc(497) int local497;
					@Pc(604) boolean local604;
					if (PACKET_0 == packet) {
						local220 = inboundBuffer.g2add();
						local74 = inboundBuffer.g2add();
						local228 = inboundBuffer.g4();
						local249 = inboundBuffer.ig2();
						if (local228 >> 30 == 0) {
							@Pc(621) Class91 local621;
							@Pc(692) Class157 local692;
							@Pc(684) Class157 local684;
							@Pc(667) Class91 local667;
							@Pc(635) Class157 local635;
							if (local228 >> 29 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(790) Npc local790 = NpcList.npcs[local497];
								if (local790 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local790.anInt4594 != -1) {
										if (local790.anInt4594 == local220) {
											local621 = Static322.aClass211_2.method5407(local220);
											if (local621.aBoolean177 && local621.anInt2448 != -1) {
												local635 = Static39.aClass85_1.method2371(local621.anInt2448);
												local638 = local635.anInt4022;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static322.aClass211_2.method5407(local220);
											local667 = Static322.aClass211_2.method5407(local790.anInt4594);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = Static39.aClass85_1.method2371(local621.anInt2448);
												local692 = Static39.aClass85_1.method2371(local667.anInt2448);
												if (local692.anInt4023 > local684.anInt4023) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local790.anInt4594 = local220;
										local790.anInt4620 = 0;
										local790.anInt4582 = 0;
										local790.anInt4595 = local74 + client.cycle;
										local790.anInt4639 = local249;
										local790.anInt4612 = 1;
										if (client.cycle < local790.anInt4595) {
											local790.anInt4582 = -1;
										}
										if (local790.anInt4594 != -1 && local790.anInt4595 == client.cycle) {
											local536 = Static322.aClass211_2.method5407(local790.anInt4594).anInt2448;
											if (local536 != -1) {
												local635 = Static39.aClass85_1.method2371(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, false, local790.aByte78, local790.xFine, local790.zFine, 0);
												}
											}
										}
									}
								}
							} else if (local228 >> 28 != 0) {
								local497 = local228 & 0xFFFF;
								@Pc(589) Player local589;
								if (PlayerList.selfId == local497) {
									local589 = Static17.aClass11_Sub5_Sub2_Sub1_3;
								} else {
									local589 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local497];
								}
								if (local589 != null) {
									if (local220 == 65535) {
										local220 = -1;
									}
									local604 = true;
									if (local220 != -1 && local589.anInt4594 != -1) {
										if (local220 == local589.anInt4594) {
											local621 = Static322.aClass211_2.method5407(local220);
											if (local621.aBoolean177 && local621.anInt2448 != -1) {
												local635 = Static39.aClass85_1.method2371(local621.anInt2448);
												local638 = local635.anInt4022;
												if (local638 == 0 || local638 == 2) {
													local604 = false;
												} else if (local638 == 1) {
													local604 = true;
												}
											}
										} else {
											local621 = Static322.aClass211_2.method5407(local220);
											local667 = Static322.aClass211_2.method5407(local589.anInt4594);
											if (local621.anInt2448 != -1 && local667.anInt2448 != -1) {
												local684 = Static39.aClass85_1.method2371(local621.anInt2448);
												local692 = Static39.aClass85_1.method2371(local667.anInt2448);
												if (local692.anInt4023 > local684.anInt4023) {
													local604 = false;
												}
											}
										}
									}
									if (local604) {
										local589.anInt4620 = 0;
										local589.anInt4582 = 0;
										local589.anInt4612 = 1;
										local589.anInt4639 = local249;
										local589.anInt4594 = local220;
										local589.anInt4595 = local74 + client.cycle;
										if (local589.anInt4594 == 65535) {
											local589.anInt4594 = -1;
										}
										if (client.cycle < local589.anInt4595) {
											local589.anInt4582 = -1;
										}
										if (local589.anInt4594 != -1 && client.cycle == local589.anInt4595) {
											local536 = Static322.aClass211_2.method5407(local589.anInt4594).anInt2448;
											if (local536 != -1) {
												local635 = Static39.aClass85_1.method2371(local536);
												if (local635 != null && local635.anIntArray262 != null) {
													Static1.method4(local635, Static17.aClass11_Sub5_Sub2_Sub1_3 == local589, local589.aByte78, local589.xFine, local589.zFine, 0);
												}
											}
										}
									}
								}
							}
						} else {
							local497 = local228 >> 28 & 0x3;
							local506 = (local228 >> 14 & 0x3FFF) - Static164.anInt3140;
							local512 = (local228 & 0x3FFF) - Static148.anInt2719;
							if (local506 >= 0 && local512 >= 0 && Static373.anInt7033 > local506 && Static242.anInt4449 > local512) {
								local536 = local506 * 128 + 64;
								local542 = local512 * 128 + 64;
								@Pc(563) Class11_Sub5_Sub4 local563 = new Class11_Sub5_Sub4(local220, 0, client.cycle, local497, local536, Static386.method6032(local536, local542, local497) - local249, local542, local506, local506, local512, local512);
								Static129.aClass135_20.method3540(new Class2_Sub2_Sub1(local563));
							}
						}
						packet = null;
						return true;
					} else if (PACKET_36 == packet) {
						local220 = inboundBuffer.ig2add();
						local74 = inboundBuffer.img4();
						local228 = inboundBuffer.g2add();
						if (Static378.method6314(local228)) {
							Static7.method6469(local220, local74);
						}
						packet = null;
						return true;
					} else if (PACKET_12 == packet) {
						local220 = inboundBuffer.g2add();
						local74 = inboundBuffer.g1bneg();
						if (Static378.method6314(local220)) {
							Static114.anInt2344 = local74;
						}
						packet = null;
						return true;
					} else if (packet == PACKET_72) {
						readPlayerInfo(inboundBuffer, packetSize);
						packet = null;
						return true;
					} else {
						@Pc(1101) long local1101;
						@Pc(1118) Class2_Sub10 local1118;
						@Pc(1109) Class2_Sub10 local1109;
						if (packet == PACKET_77) {
							local220 = inboundBuffer.g2();
							if (local220 == 65535) {
								local220 = -1;
							}
							local74 = inboundBuffer.ig2();
							local228 = inboundBuffer.g2add();
							if (local228 == 65535) {
								local228 = -1;
							}
							local249 = inboundBuffer.g2();
							local497 = inboundBuffer.img4();
							if (Static378.method6314(local249)) {
								for (local506 = local220; local506 <= local228; local506++) {
									local1101 = (long) local506 + ((long) local497 << 32);
									local1109 = (Class2_Sub10) Static327.aClass4_127.method90(local1101);
									if (local1109 != null) {
										local1118 = new Class2_Sub10(local1109.anInt1758, local74);
										local1109.method6468();
									} else if (local506 == -1) {
										local1118 = new Class2_Sub10(Static6.method140(local497).aClass2_Sub10_1.anInt1758, local74);
									} else {
										local1118 = new Class2_Sub10(0, local74);
									}
									Static327.aClass4_127.method87(local1118, local1101);
								}
							}
							packet = null;
							return true;
						} else if (packet == PACKET_89) {
							local220 = inboundBuffer.ig4();
							local74 = inboundBuffer.ig2add();
							if (Static378.method6314(local74)) {
								Static190.method3501(-1, -1, 3, local220);
							}
							packet = null;
							return true;
						} else if (PACKET_52 == packet) {
							local220 = inboundBuffer.g2add();
							local74 = inboundBuffer.g1sub();
							local228 = inboundBuffer.ig4();
							local249 = inboundBuffer.g2();
							if (Static378.method6314(local220)) {
								local344 = (Class2_Sub7) Static329.aClass4_130.method90((long) local228);
								if (local344 != null) {
									Static276.method4655(false, local344, local249 != local344.anInt1370);
								}
								Static382.method6365(local228, local74, false, local249);
							}
							packet = null;
							return true;
						} else if (PACKET_20 == packet) {
							local220 = inboundBuffer.g4();
							local74 = inboundBuffer.g1bneg();
							local228 = inboundBuffer.g1sub();
							Static80.anIntArray464[local74] = local220;
							Static268.anIntArray338[local74] = local228;
							Static325.anIntArray414[local74] = 1;
							local249 = Static287.anIntArray369[local74] - 1;
							for (local497 = 0; local497 < local249; local497++) {
								if (local220 >= Class12_Sub1_Sub1.anIntArray292[local497]) {
									Static325.anIntArray414[local74] = local497 + 2;
								}
							}
							Static208.anIntArray226[Static381.anInt7117++ & 0x1F] = local74;
							packet = null;
							return true;
						} else if (packet == PACKET_25) {
							local220 = inboundBuffer.g2();
							local74 = inboundBuffer.g1();
							local228 = inboundBuffer.g1();
							local249 = inboundBuffer.g2();
							local497 = inboundBuffer.g1();
							local506 = inboundBuffer.g1();
							if (Static378.method6314(local220)) {
								Static51.method1545(local228, local497, local506, true, local249, local74);
							}
							packet = null;
							return true;
						} else {
							@Pc(1371) boolean local1371;
							@Pc(1381) String local1381;
							@Pc(1627) String local1627;
							@Pc(1391) String local1391;
							@Pc(1663) String local1663;
							if (PACKET_70 == packet) {
								while (inboundBuffer.pos < packetSize) {
									local1371 = inboundBuffer.g1() == 1;
									local452 = inboundBuffer.gjstr();
									local1381 = inboundBuffer.gjstr();
									local249 = inboundBuffer.g2();
									local497 = inboundBuffer.g1();
									local1391 = "";
									local604 = false;
									if (local249 > 0) {
										local1391 = inboundBuffer.gjstr();
										local604 = inboundBuffer.g1() == 1;
									}
									for (local536 = 0; local536 < Static384.anInt7178; local536++) {
										if (local1371) {
											if (local1381.equals(Static17.aStringArray43[local536])) {
												Static17.aStringArray43[local536] = local452;
												Static319.aStringArray54[local536] = local1381;
												local452 = null;
												break;
											}
										} else if (local452.equals(Static17.aStringArray43[local536])) {
											if (Static265.anIntArray333[local536] != local249) {
												Static265.anIntArray333[local536] = local249;
												if (local249 > 0) {
													Static33.method4200("", 0, local452 + Static282.aClass79_112.method2267(client.language), 5, "");
												}
												if (local249 == 0) {
													Static33.method4200("", 0, local452 + Static359.aClass79_140.method2267(client.language), 5, "");
												}
											}
											Static319.aStringArray54[local536] = local1381;
											Static209.aStringArray32[local536] = local1391;
											Static114.anIntArray148[local536] = local497;
											local452 = null;
											Static302.aBooleanArray13[local536] = local604;
											break;
										}
									}
									if (local452 != null && Static384.anInt7178 < 200) {
										Static17.aStringArray43[Static384.anInt7178] = local452;
										Static319.aStringArray54[Static384.anInt7178] = local1381;
										Static265.anIntArray333[Static384.anInt7178] = local249;
										Static209.aStringArray32[Static384.anInt7178] = local1391;
										Static114.anIntArray148[Static384.anInt7178] = local497;
										Static302.aBooleanArray13[Static384.anInt7178] = local604;
										Static384.anInt7178++;
									}
								}
								Static235.anInt3363 = 2;
								Static53.anInt3971 = Static88.anInt1876;
								local74 = Static384.anInt7178;
								while (local74 > 0) {
									local1371 = true;
									local74--;
									for (local228 = 0; local228 < local74; local228++) {
										if (Static265.anIntArray333[local228] != client.worldId && client.worldId == Static265.anIntArray333[local228 + 1] || Static265.anIntArray333[local228] == 0 && Static265.anIntArray333[local228 + 1] != 0) {
											local249 = Static265.anIntArray333[local228];
											Static265.anIntArray333[local228] = Static265.anIntArray333[local228 + 1];
											Static265.anIntArray333[local228 + 1] = local249;
											local1627 = Static209.aStringArray32[local228];
											Static209.aStringArray32[local228] = Static209.aStringArray32[local228 + 1];
											Static209.aStringArray32[local228 + 1] = local1627;
											local1391 = Static17.aStringArray43[local228];
											Static17.aStringArray43[local228] = Static17.aStringArray43[local228 + 1];
											Static17.aStringArray43[local228 + 1] = local1391;
											local1663 = Static319.aStringArray54[local228];
											Static319.aStringArray54[local228] = Static319.aStringArray54[local228 + 1];
											Static319.aStringArray54[local228 + 1] = local1663;
											local536 = Static114.anIntArray148[local228];
											Static114.anIntArray148[local228] = Static114.anIntArray148[local228 + 1];
											Static114.anIntArray148[local228 + 1] = local536;
											@Pc(1699) boolean local1699 = Static302.aBooleanArray13[local228];
											Static302.aBooleanArray13[local228] = Static302.aBooleanArray13[local228 + 1];
											local1371 = false;
											Static302.aBooleanArray13[local228 + 1] = local1699;
										}
									}
									if (local1371) {
										break;
									}
								}
								packet = null;
								return true;
							} else if (packet == PACKET_7) {
								Static41.anInt1048 = inboundBuffer.g2b();
								Static93.anInt1950 = Static88.anInt1876;
								packet = null;
								return true;
							} else {
								@Pc(1780) long local1780;
								@Pc(1785) long local1785;
								if (packet == PACKET_55) {
									local1371 = inboundBuffer.g1() == 1;
									local452 = inboundBuffer.gjstr();
									local1381 = local452;
									if (local1371) {
										local1381 = inboundBuffer.gjstr();
									}
									local1780 = inboundBuffer.g2();
									local1785 = inboundBuffer.ig3();
									local536 = inboundBuffer.g1();
									@Pc(1796) long local1796 = (local1780 << 32) + local1785;
									@Pc(1798) boolean local1798 = false;
									@Pc(1800) int local1800 = 0;
									while (true) {
										if (local1800 >= 100) {
											if (local536 <= 1) {
												if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
													local1798 = true;
												} else if (Static105.method2208(local1381)) {
													local1798 = true;
												}
											}
											break;
										}
										if (local1796 == Static358.aLongArray11[local1800]) {
											local1798 = true;
											break;
										}
										local1800++;
									}
									if (!local1798 && Static212.anInt3785 == 0) {
										Static358.aLongArray11[Static193.anInt3555] = local1796;
										Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
										@Pc(1866) String local1866 = Static153.method2772(Static308.method5276(inboundBuffer));
										if (local536 == 2) {
											Static220.method3874(0, null, local1866, -1, 7, "<img=1>" + local1381, "<img=1>" + local452);
										} else if (local536 == 1) {
											Static220.method3874(0, null, local1866, -1, 7, "<img=0>" + local1381, "<img=0>" + local452);
										} else {
											Static220.method3874(0, null, local1866, -1, 3, local1381, local452);
										}
									}
									packet = null;
									return true;
								} else if (packet == PACKET_43) {
									local444 = inboundBuffer.gjstr();
									local74 = inboundBuffer.g2();
									local1381 = Static146.method2699(local74).method5602(inboundBuffer);
									Static220.method3874(0, null, local1381, local74, 19, local444, local444);
									packet = null;
									return true;
								} else if (packet == PACKET_58) {
									Static99.logout();
									packet = null;
									return false;
								} else if (packet == PACKET_73) {
									local220 = inboundBuffer.ig2add();
									local74 = inboundBuffer.ig4();
									Static214.aClass226_1.method5785(local74, local220);
									packet = null;
									return true;
								} else if (packet == PACKET_5) {
									local220 = inboundBuffer.g2();
									local74 = inboundBuffer.g1();
									local228 = inboundBuffer.g1();
									local249 = inboundBuffer.g2();
									local497 = inboundBuffer.g1();
									local506 = inboundBuffer.g1();
									if (Static378.method6314(local220)) {
										Static33.method4203(local497, local249, local228, local506, local74);
									}
									packet = null;
									return true;
								} else if (PACKET_17 == packet) {
									local220 = inboundBuffer.g1bneg();
									local74 = inboundBuffer.g1sub();
									if (local220 == 255) {
										local74 = -1;
										local220 = -1;
									}
									Static283.method4875(local220, local74);
									packet = null;
									return true;
								} else if (packet == PACKET_1) {
									Static330.method5656(Static333.aClass210_17);
									packet = null;
									return true;
								} else if (PACKET_97 == packet) {
									local220 = inboundBuffer.ig2add();
									local74 = inboundBuffer.ig4();
									local228 = inboundBuffer.g1sub();
									if (Static378.method6314(local220)) {
										Static17.method4208(local74, local228);
									}
									packet = null;
									return true;
								} else if (PACKET_103 == packet) {
									for (local220 = 0; local220 < Static12.aClass11_Sub5_Sub2_Sub1Array1.length; local220++) {
										if (Static12.aClass11_Sub5_Sub2_Sub1Array1[local220] != null) {
											Static12.aClass11_Sub5_Sub2_Sub1Array1[local220].anInt4597 = -1;
										}
									}
									for (local74 = 0; local74 < NpcList.npcs.length; local74++) {
										if (NpcList.npcs[local74] != null) {
											NpcList.npcs[local74].anInt4597 = -1;
										}
									}
									packet = null;
									return true;
								} else if (PACKET_8 == packet) {
									Static151.anInt2773 = inboundBuffer.g2() * 30;
									packet = null;
									Static93.anInt1950 = Static88.anInt1876;
									return true;
								} else if (packet == PACKET_92) {
									local220 = inboundBuffer.g2();
									if (local220 == 65535) {
										local220 = -1;
									}
									local74 = inboundBuffer.g1();
									local228 = inboundBuffer.g2();
									local249 = inboundBuffer.g1();
									Static29.method939(local74, local249, local228, local220);
									packet = null;
									return true;
								} else if (PACKET_31 == packet) {
									local220 = inboundBuffer.g4();
									local74 = inboundBuffer.ig2();
									local228 = inboundBuffer.g2add();
									if (Static378.method6314(local74)) {
										Static120.method2383(local228, local220);
									}
									packet = null;
									return true;
								} else if (packet == PACKET_39) {
									Static330.method5656(Static374.aClass210_16);
									packet = null;
									return true;
								} else if (PACKET_101 == packet) {
									Static330.method5656(Static359.aClass210_14);
									packet = null;
									return true;
								} else if (packet == PACKET_15) {
									local220 = inboundBuffer.ig2add();
									local74 = inboundBuffer.img4();
									local228 = inboundBuffer.g2();
									local249 = inboundBuffer.ig2add();
									if (Static378.method6314(local228)) {
										Static375.method6282(local220 + (local249 << 16), local74);
									}
									packet = null;
									return true;
								} else if (PACKET_24 == packet) {
									local220 = inboundBuffer.g4();
									local74 = inboundBuffer.img4();
									local228 = inboundBuffer.g2add();
									local249 = inboundBuffer.ig2();
									if (Static378.method6314(local228)) {
										Static190.method3501(local249, local74, 5, local220);
									}
									packet = null;
									return true;
								} else {
									@Pc(2522) Class214 local2522;
									if (packet == PACKET_35) {
										Static285.anInt5370 = Static88.anInt1876;
										if (packetSize == 0) {
											Static389.aString53 = null;
											Static186.anInt3730 = 0;
											Static169.aString25 = null;
											packet = null;
											Static47.aClass214Array1 = null;
											return true;
										}
										Static169.aString25 = inboundBuffer.gjstr();
										local1371 = inboundBuffer.g1() == 1;
										if (local1371) {
											inboundBuffer.gjstr();
										}
										@Pc(2364) long local2364 = inboundBuffer.g8();
										Static389.aString53 = StringUtils.fromBase37(local2364);
										Static265.aByte54 = inboundBuffer.g1b();
										local249 = inboundBuffer.g1();
										if (local249 == 255) {
											packet = null;
											return true;
										}
										Static186.anInt3730 = local249;
										@Pc(2392) Class214[] local2392 = new Class214[100];
										for (local506 = 0; local506 < Static186.anInt3730; local506++) {
											local2392[local506] = new Class214();
											local2392[local506].aString58 = inboundBuffer.gjstr();
											local1371 = inboundBuffer.g1() == 1;
											if (local1371) {
												local2392[local506].aString60 = inboundBuffer.gjstr();
											} else {
												local2392[local506].aString60 = local2392[local506].aString58;
											}
											local2392[local506].aString59 = Static135.method2537(local2392[local506].aString60);
											local2392[local506].anInt5978 = inboundBuffer.g2();
											local2392[local506].aByte65 = inboundBuffer.g1b();
											local2392[local506].aString61 = inboundBuffer.gjstr();
											if (local2392[local506].aString60.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
												Static119.aByte25 = local2392[local506].aByte65;
											}
										}
										local542 = Static186.anInt3730;
										while (local542 > 0) {
											local542--;
											local604 = true;
											for (local638 = 0; local638 < local542; local638++) {
												if (local2392[local638].aString59.compareTo(local2392[local638 + 1].aString59) > 0) {
													local2522 = local2392[local638];
													local2392[local638] = local2392[local638 + 1];
													local2392[local638 + 1] = local2522;
													local604 = false;
												}
											}
											if (local604) {
												break;
											}
										}
										Static47.aClass214Array1 = local2392;
										packet = null;
										return true;
									} else if (packet == PACKET_26) {
										inboundBuffer.pos += 28;
										if (inboundBuffer.checkcrc()) {
											Static294.method5065(inboundBuffer, inboundBuffer.pos - 28);
										}
										packet = null;
										return true;
									} else if (PACKET_71 == packet) {
										local220 = inboundBuffer.g1();
										if (inboundBuffer.g1() == 0) {
											Static290.aClass187Array1[local220] = new Class187();
										} else {
											inboundBuffer.pos--;
											Static290.aClass187Array1[local220] = new Class187(inboundBuffer);
										}
										packet = null;
										Static177.anInt3381 = Static88.anInt1876;
										return true;
									} else if (packet == PACKET_10) {
										local220 = inboundBuffer.g2();
										local74 = inboundBuffer.g2();
										local228 = inboundBuffer.g2();
										local249 = inboundBuffer.g2();
										if (Static378.method6314(local220) && Static26.aClass161ArrayArray1[local74] != null) {
											for (local497 = local228; local497 < local249; local497++) {
												local506 = inboundBuffer.ig3();
												if (local497 < Static26.aClass161ArrayArray1[local74].length && Static26.aClass161ArrayArray1[local74][local497] != null) {
													Static26.aClass161ArrayArray1[local74][local497].anInt4246 = local506;
												}
											}
										}
										packet = null;
										return true;
									} else if (PACKET_104 == packet) {
										Static330.method5656(Static143.aClass210_7);
										packet = null;
										return true;
									} else if (packet == PACKET_83) {
										Static330.method5656(Static285.aClass210_12);
										packet = null;
										return true;
									} else if (PACKET_40 == packet) {
										Static146.anInt2703 = inboundBuffer.g1();
										packet = null;
										return true;
									} else if (PACKET_23 == packet) {
										local220 = inboundBuffer.g2();
										local74 = inboundBuffer.g1();
										local228 = inboundBuffer.g1();
										local249 = inboundBuffer.g1();
										local497 = inboundBuffer.g1();
										local506 = inboundBuffer.g2();
										if (Static378.method6314(local220)) {
											Static189.aBooleanArray33[local74] = true;
											Static134.anIntArray164[local74] = local228;
											Static105.anIntArray134[local74] = local249;
											Static43.anIntArray87[local74] = local497;
											Static116.anIntArray149[local74] = local506;
										}
										packet = null;
										return true;
									} else if (packet == PACKET_56) {
										if (Static363.frame != null) {
											Static143.method2677(-1, client.preferences.anInt4894, false, -1);
										}
										@Pc(2782) byte[] local2782 = new byte[packetSize];
										inboundBuffer.gisaac(local2782, packetSize);
										local452 = Cp1252Charset.decodeString(0, local2782, packetSize);
										Static280.method4765(local452, GameShell.signlink, Static77.anInt1762 == 1, true);
										packet = null;
										return true;
									} else if (PACKET_94 == packet) {
										Static330.method5656(Static72.aClass210_3);
										packet = null;
										return true;
									} else if (PACKET_42 == packet) {
										Static67.anInt1637 = inboundBuffer.g1();
										Static7.anInt7240 = inboundBuffer.g1bneg();
										Static243.anInt4502 = inboundBuffer.g1add();
										for (@Pc(2839) Class2_Sub32 local2839 = (Class2_Sub32) Static120.aClass4_49.method80(); local2839 != null; local2839 = (Class2_Sub32) Static120.aClass4_49.method79()) {
											local74 = (int) (local2839.aLong232 & 0x3FFFL);
											local228 = (int) (local2839.aLong232 >> 14 & 0x3FFFL);
											local249 = (int) (local2839.aLong232 >> 28 & 0x3L);
											if (Static243.anInt4502 == local249 && Static67.anInt1637 <= local74 && Static67.anInt1637 + 8 > local74 && local228 >= Static7.anInt7240 && local228 < Static7.anInt7240 + 8) {
												local2839.method6468();
												Static165.method3154(local74, Static243.anInt4502, local228);
											}
										}
										for (@Pc(2914) Class2_Sub37 local2914 = (Class2_Sub37) Static207.aClass135_26.method3551(); local2914 != null; local2914 = (Class2_Sub37) Static207.aClass135_26.method3552()) {
											if (local2914.anInt6484 >= Static67.anInt1637 && local2914.anInt6484 < Static67.anInt1637 + 8 && local2914.anInt6486 >= Static7.anInt7240 && local2914.anInt6486 < Static7.anInt7240 + 8 && Static243.anInt4502 == local2914.anInt6481) {
												local2914.anInt6485 = 0;
											}
										}
										packet = null;
										return true;
									} else if (packet == PACKET_105) {
										local1371 = inboundBuffer.g1() == 1;
										local452 = inboundBuffer.gjstr();
										local1381 = local452;
										if (local1371) {
											local1381 = inboundBuffer.gjstr();
										}
										local1780 = inboundBuffer.g2();
										local1785 = inboundBuffer.ig3();
										local536 = inboundBuffer.g1();
										local542 = inboundBuffer.g2();
										@Pc(3014) long local3014 = local1785 + (local1780 << 32);
										@Pc(3016) boolean local3016 = false;
										@Pc(3018) int local3018 = 0;
										while (true) {
											if (local3018 >= 100) {
												if (local536 <= 1 && Static105.method2208(local1381)) {
													local3016 = true;
												}
												break;
											}
											if (local3014 == Static358.aLongArray11[local3018]) {
												local3016 = true;
												break;
											}
											local3018++;
										}
										if (!local3016 && Static212.anInt3785 == 0) {
											Static358.aLongArray11[Static193.anInt3555] = local3014;
											Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
											@Pc(3071) String local3071 = Static146.method2699(local542).method5602(inboundBuffer);
											if (local536 == 2) {
												Static220.method3874(0, null, local3071, local542, 18, "<img=1>" + local1381, "<img=1>" + local452);
											} else if (local536 == 1) {
												Static220.method3874(0, null, local3071, local542, 18, "<img=0>" + local1381, "<img=0>" + local452);
											} else {
												Static220.method3874(0, null, local3071, local542, 18, local1381, local452);
											}
										}
										packet = null;
										return true;
									} else if (packet == PACKET_41) {
										Static243.anInt4502 = inboundBuffer.g1add();
										Static7.anInt7240 = inboundBuffer.g1bneg();
										Static67.anInt1637 = inboundBuffer.g1sub();
										packet = null;
										return true;
									} else if (PACKET_19 == packet) {
										Static235.anInt3363 = 1;
										Static53.anInt3971 = Static88.anInt1876;
										packet = null;
										return true;
									} else if (PACKET_38 == packet) {
										local220 = inboundBuffer.img4();
										local74 = inboundBuffer.ig2();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = inboundBuffer.mg4();
										local249 = inboundBuffer.g2add();
										if (local249 == 65535) {
											local249 = -1;
										}
										local497 = inboundBuffer.ig2();
										if (Static378.method6314(local497)) {
											for (local506 = local74; local506 <= local249; local506++) {
												local1101 = ((long) local220 << 32) + ((long) local506);
												local1109 = (Class2_Sub10) Static327.aClass4_127.method90(local1101);
												if (local1109 != null) {
													local1118 = new Class2_Sub10(local228, local1109.anInt1759);
													local1109.method6468();
												} else if (local506 == -1) {
													local1118 = new Class2_Sub10(local228, Static6.method140(local220).aClass2_Sub10_1.anInt1759);
												} else {
													local1118 = new Class2_Sub10(local228, -1);
												}
												Static327.aClass4_127.method87(local1118, local1101);
											}
										}
										packet = null;
										return true;
									} else if (PACKET_6 == packet) {
										Static301.anInt5700 = inboundBuffer.g1();
										for (local220 = 0; local220 < Static301.anInt5700; local220++) {
											Static226.aStringArray35[local220] = inboundBuffer.gjstr();
											Static234.aStringArray39[local220] = inboundBuffer.gjstr();
											if (Static234.aStringArray39[local220].equals("")) {
												Static234.aStringArray39[local220] = Static226.aStringArray35[local220];
											}
											Static371.aStringArray66[local220] = inboundBuffer.gjstr();
											Static190.aStringArray28[local220] = inboundBuffer.gjstr();
											if (Static190.aStringArray28[local220].equals("")) {
												Static190.aStringArray28[local220] = Static371.aStringArray66[local220];
											}
											Static196.aBooleanArray31[local220] = false;
										}
										packet = null;
										Static53.anInt3971 = Static88.anInt1876;
										return true;
									} else if (packet == PACKET_46) {
										local444 = inboundBuffer.gjstr();
										local74 = inboundBuffer.g2add();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = inboundBuffer.g1sub();
										local249 = inboundBuffer.g1sub();
										if (local228 >= 1 && local228 <= 8) {
											if (local444.equalsIgnoreCase("null")) {
												local444 = null;
											}
											Static243.aStringArray44[local228 - 1] = local444;
											Static207.anIntArray225[local228 - 1] = local74;
											Static44.aBooleanArray11[local228 - 1] = local249 == 0;
										}
										packet = null;
										return true;
									} else if (PACKET_14 == packet) {
										local220 = inboundBuffer.g2();
										local74 = inboundBuffer.g2add();
										local228 = inboundBuffer.g2add();
										if (Static378.method6314(local74)) {
											Static231.method4022(local220, local228);
										}
										packet = null;
										return true;
									} else if (PACKET_54 == packet) {
										local220 = inboundBuffer.ig2add();
										local74 = inboundBuffer.ig2();
										if (local74 == 65535) {
											local74 = -1;
										}
										local228 = inboundBuffer.mg4();
										local249 = inboundBuffer.img4();
										if (Static378.method6314(local220)) {
											Static216.method3774(local74, local249, local228);
											@Pc(3499) Class188 local3499 = Static313.ObjTypeList.get(local74);
											Static277.method4680(local3499.anInt5215, local3499.anInt5245, local249, local3499.anInt5241);
											Static376.method6287(local249, local3499.anInt5249, local3499.anInt5252, local3499.anInt5232);
										}
										packet = null;
										return true;
									} else if (packet == PACKET_37) {
										readNpcInfoPacket(true);
										packet = null;
										return true;
									} else {
										@Pc(3551) boolean local3551;
										if (packet == PACKET_67) {
											local444 = inboundBuffer.gjstr();
											local3551 = inboundBuffer.g1() == 1;
											if (local3551) {
												local452 = inboundBuffer.gjstr();
											} else {
												local452 = local444;
											}
											local249 = inboundBuffer.g2();
											@Pc(3569) byte local3569 = inboundBuffer.g1b();
											@Pc(3571) boolean local3571 = false;
											if (local3569 == -128) {
												local3571 = true;
											}
											if (local3571) {
												if (Static186.anInt3730 == 0) {
													packet = null;
													return true;
												}
												for (local512 = 0; local512 < Static186.anInt3730 && (!Static47.aClass214Array1[local512].aString60.equals(local452) || Static47.aClass214Array1[local512].anInt5978 != local249); local512++) {
												}
												if (local512 < Static186.anInt3730) {
													while (local512 < Static186.anInt3730 - 1) {
														Static47.aClass214Array1[local512] = Static47.aClass214Array1[local512 + 1];
														local512++;
													}
													Static186.anInt3730--;
													Static47.aClass214Array1[Static186.anInt3730] = null;
												}
											} else {
												local1663 = inboundBuffer.gjstr();
												local2522 = new Class214();
												local2522.aString58 = local444;
												local2522.aString60 = local452;
												local2522.aString59 = Static135.method2537(local2522.aString60);
												local2522.aByte65 = local3569;
												local2522.aString61 = local1663;
												local2522.anInt5978 = local249;
												for (local542 = Static186.anInt3730 - 1; local542 >= 0; local542--) {
													local638 = Static47.aClass214Array1[local542].aString59.compareTo(local2522.aString59);
													if (local638 == 0) {
														Static47.aClass214Array1[local542].anInt5978 = local249;
														Static47.aClass214Array1[local542].aByte65 = local3569;
														Static47.aClass214Array1[local542].aString61 = local1663;
														if (local452.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
															Static119.aByte25 = local3569;
														}
														Static285.anInt5370 = Static88.anInt1876;
														packet = null;
														return true;
													}
													if (local638 < 0) {
														break;
													}
												}
												if (Static186.anInt3730 >= Static47.aClass214Array1.length) {
													packet = null;
													return true;
												}
												for (local638 = Static186.anInt3730 - 1; local638 > local542; local638--) {
													Static47.aClass214Array1[local638 + 1] = Static47.aClass214Array1[local638];
												}
												if (Static186.anInt3730 == 0) {
													Static47.aClass214Array1 = new Class214[100];
												}
												Static47.aClass214Array1[local542 + 1] = local2522;
												Static186.anInt3730++;
												if (local452.equals(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
													Static119.aByte25 = local3569;
												}
											}
											packet = null;
											Static285.anInt5370 = Static88.anInt1876;
											return true;
										}
										@Pc(3809) String local3809;
										if (PACKET_99 == packet) {
											local220 = inboundBuffer.gsmart();
											local74 = inboundBuffer.g4();
											local228 = inboundBuffer.g1();
											local3809 = "";
											local1627 = local3809;
											if ((local228 & 0x1) != 0) {
												local3809 = inboundBuffer.gjstr();
												if ((local228 & 0x2) == 0) {
													local1627 = local3809;
												} else {
													local1627 = inboundBuffer.gjstr();
												}
											}
											local1391 = inboundBuffer.gjstr();
											if (local220 == 99) {
												Static158.method2940(local1391);
											} else if (local1627.equals("") || !Static105.method2208(local1627)) {
												Static33.method4200(local3809, local74, local1391, local220, local1627);
											} else {
												packet = null;
												return true;
											}
											packet = null;
											return true;
										} else if (packet == PACKET_34) {
											Static330.method5656(Static272.aClass210_11);
											packet = null;
											return true;
										} else if (packet == PACKET_68) {
											local220 = inboundBuffer.g4();
											Static354.aClass32_5 = GameShell.signlink.getReverseDns(local220);
											packet = null;
											return true;
										} else if (PACKET_2 == packet) {
											Static20.anInt545 = inboundBuffer.g1add();
											Static331.anInt6206 = inboundBuffer.g1sub();
											packet = null;
											return true;
										} else if (PACKET_64 == packet) {
											local220 = inboundBuffer.g1();
											local74 = inboundBuffer.ig2();
											Static214.aClass226_1.method5786(local74, local220);
											packet = null;
											return true;
										} else if (PACKET_27 == packet) {
											local220 = inboundBuffer.ig2();
											local74 = inboundBuffer.mg4();
											local228 = inboundBuffer.ig2();
											if (local228 == 65535) {
												local228 = -1;
											}
											if (Static378.method6314(local220)) {
												Static139.method2595(local74, local228);
											}
											packet = null;
											return true;
										} else if (packet == PACKET_80) {
											Static330.method5656(Static242.aClass210_10);
											packet = null;
											return true;
										} else if (PACKET_4 == packet) {
											Static96.anInt2002 = inboundBuffer.g1();
											Static93.anInt1950 = Static88.anInt1876;
											packet = null;
											return true;
										} else if (PACKET_44 == packet) {
											local220 = inboundBuffer.g4();
											local74 = inboundBuffer.ig2add();
											local228 = inboundBuffer.g2();
											if (Static378.method6314(local228)) {
												Static150.method2737(local220, local74);
											}
											packet = null;
											return true;
										} else if (packet == PACKET_47) {
											local220 = inboundBuffer.ig4();
											local74 = inboundBuffer.ig2();
											Static214.aClass226_1.method5786(local74, local220);
											packet = null;
											return true;
										} else if (packet == PACKET_50) {
											local220 = inboundBuffer.g1();
											@Pc(4068) boolean local4068 = (local220 & 0x1) == 1;
											local1381 = inboundBuffer.gjstr();
											local3809 = inboundBuffer.gjstr();
											if (local3809.equals("")) {
												local3809 = local1381;
											}
											local1627 = inboundBuffer.gjstr();
											local1391 = inboundBuffer.gjstr();
											if (local1391.equals("")) {
												local1391 = local1627;
											}
											if (local4068) {
												for (local512 = 0; local512 < Static301.anInt5700; local512++) {
													if (Static234.aStringArray39[local512].equals(local1391)) {
														Static226.aStringArray35[local512] = local1381;
														Static234.aStringArray39[local512] = local3809;
														Static371.aStringArray66[local512] = local1627;
														Static190.aStringArray28[local512] = local1391;
														break;
													}
												}
											} else {
												Static226.aStringArray35[Static301.anInt5700] = local1381;
												Static234.aStringArray39[Static301.anInt5700] = local3809;
												Static371.aStringArray66[Static301.anInt5700] = local1627;
												Static190.aStringArray28[Static301.anInt5700] = local1391;
												Static196.aBooleanArray31[Static301.anInt5700] = (local220 & 0x2) == 2;
												Static301.anInt5700++;
											}
											packet = null;
											Static53.anInt3971 = Static88.anInt1876;
											return true;
										} else if (PACKET_85 == packet) {
											local444 = inboundBuffer.gjstr();
											local74 = inboundBuffer.ig2add();
											local228 = inboundBuffer.ig2();
											if (Static378.method6314(local228)) {
												Static10.method239(local74, local444);
											}
											packet = null;
											return true;
										} else if (packet == PACKET_61) {
											local220 = inboundBuffer.g1sub();
											local74 = inboundBuffer.ig2();
											if (local74 == 65535) {
												local74 = -1;
											}
											local228 = inboundBuffer.g1sub();
											Static138.method2578(local220, local228, local74);
											packet = null;
											return true;
										} else if (packet == PACKET_62) {
											local220 = inboundBuffer.g1add();
											local74 = inboundBuffer.ig3();
											local228 = inboundBuffer.g2();
											if (local228 == 65535) {
												local228 = -1;
											}
											Static175.method3324(local228, local74, local220);
											packet = null;
											return true;
										} else {
											@Pc(4300) long local4300;
											if (PACKET_84 == packet) {
												local1371 = inboundBuffer.g1() == 1;
												local452 = inboundBuffer.gjstr();
												local1381 = local452;
												if (local1371) {
													local1381 = inboundBuffer.gjstr();
												}
												local1780 = inboundBuffer.g8();
												local1785 = inboundBuffer.g2();
												local4300 = inboundBuffer.ig3();
												local638 = inboundBuffer.g1();
												@Pc(4310) long local4310 = (local1785 << 32) + local4300;
												@Pc(4312) boolean local4312 = false;
												@Pc(4314) int local4314 = 0;
												while (true) {
													if (local4314 >= 100) {
														if (local638 <= 1) {
															if (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat) {
																local4312 = true;
															} else if (Static105.method2208(local1381)) {
																local4312 = true;
															}
														}
														break;
													}
													if (Static358.aLongArray11[local4314] == local4310) {
														local4312 = true;
														break;
													}
													local4314++;
												}
												if (!local4312 && Static212.anInt3785 == 0) {
													Static358.aLongArray11[Static193.anInt3555] = local4310;
													Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
													@Pc(4372) String local4372 = Static153.method2772(Static308.method5276(inboundBuffer));
													if (local638 == 2 || local638 == 3) {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.method3874(0, Static170.method3229(local1780), local4372, -1, 9, local1381, local452);
													}
												}
												packet = null;
												return true;
											} else if (packet == PACKET_100) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g1();
												local3551 = (local74 & 0x1) == 1;
												while (packetSize > inboundBuffer.pos) {
													local249 = inboundBuffer.gsmart();
													local497 = inboundBuffer.g2();
													local506 = 0;
													if (local497 != 0) {
														local506 = inboundBuffer.g1();
														if (local506 == 255) {
															local506 = inboundBuffer.g4();
														}
													}
													Static62.method2391(local249, local506, local220, local497 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												packet = null;
												return true;
											} else if (PACKET_81 == packet) {
												local220 = inboundBuffer.img4();
												local74 = inboundBuffer.ig2add();
												local228 = inboundBuffer.g2();
												if (local228 == 65535) {
													local228 = -1;
												}
												if (Static378.method6314(local74)) {
													Static190.method3501(local228, -1, 1, local220);
												}
												packet = null;
												return true;
											} else if (packet == PACKET_74) {
												Static330.method5656(Static200.aClass210_9);
												packet = null;
												return true;
											} else if (PACKET_60 == packet) {
												local444 = inboundBuffer.gjstr();
												local74 = inboundBuffer.ig2();
												local228 = inboundBuffer.img4();
												if (Static378.method6314(local74)) {
													Static319.method5432(local228, local444);
												}
												packet = null;
												return true;
											} else if (PACKET_63 == packet) {
												Static330.method5656(Static110.aClass210_5);
												packet = null;
												return true;
											} else if (packet == PACKET_32) {
												readNpcInfoPacket(false);
												packet = null;
												return true;
											} else if (PACKET_86 == packet) {
												local220 = inboundBuffer.ig4();
												local74 = inboundBuffer.ig2();
												local228 = inboundBuffer.ig2b();
												local249 = inboundBuffer.g2bsub();
												if (Static378.method6314(local74)) {
													Static129.method2438(local249, local228, local220);
												}
												packet = null;
												return true;
											} else if (PACKET_98 == packet) {
												Static181.mapLoadDecoder(false);
												packet = null;
												return false;
											} else if (packet == PACKET_45) {
												Static154.aClass170_2 = Static335.method5695(inboundBuffer.g1());
												packet = null;
												return true;
											} else if (PACKET_21 == packet) {
												local220 = inboundBuffer.g1bneg();
												local74 = inboundBuffer.ig2add();
												local3551 = (local220 & 0x1) == 1;
												Static166.method3186(local3551, local74);
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local74;
												packet = null;
												return true;
											} else if (PACKET_95 == packet) {
												local220 = inboundBuffer.img4();
												local74 = inboundBuffer.g2add();
												if (local74 == 65535) {
													local74 = -1;
												}
												local228 = inboundBuffer.ig2add();
												if (Static378.method6314(local228)) {
													Static190.method3501(local74, -1, 2, local220);
												}
												packet = null;
												return true;
											} else if (packet == PACKET_29) {
												local272 = inboundBuffer.g1neg();
												local74 = inboundBuffer.g2();
												Static214.aClass226_1.method5785(local272, local74);
												packet = null;
												return true;
											} else if (packet == PACKET_49) {
												Static383.method6379(inboundBuffer.gjstr());
												packet = null;
												return true;
											} else if (packet == PACKET_90) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g2();
												local228 = inboundBuffer.g2();
												local249 = inboundBuffer.ig2add();
												local497 = inboundBuffer.ig4();
												if (Static378.method6314(local74)) {
													Static190.method3501(local228 | local249 << 16, local220, 7, local497);
												}
												packet = null;
												return true;
											} else if (PACKET_51 == packet) {
												local1371 = inboundBuffer.g1() == 1;
												local452 = inboundBuffer.gjstr();
												local1381 = local452;
												if (local1371) {
													local1381 = inboundBuffer.gjstr();
												}
												local1780 = inboundBuffer.g8();
												local1785 = inboundBuffer.g2();
												local4300 = inboundBuffer.ig3();
												local638 = inboundBuffer.g1();
												@Pc(4892) int local4892 = inboundBuffer.g2();
												@Pc(4898) long local4898 = local4300 + (local1785 << 32);
												@Pc(4900) boolean local4900 = false;
												@Pc(4902) int local4902 = 0;
												while (true) {
													if (local4902 >= 100) {
														if (local638 <= 1 && Static105.method2208(local1381)) {
															local4900 = true;
														}
														break;
													}
													if (Static358.aLongArray11[local4902] == local4898) {
														local4900 = true;
														break;
													}
													local4902++;
												}
												if (!local4900 && Static212.anInt3785 == 0) {
													Static358.aLongArray11[Static193.anInt3555] = local4898;
													Static193.anInt3555 = (Static193.anInt3555 + 1) % 100;
													@Pc(4955) String local4955 = Static146.method2699(local4892).method5602(inboundBuffer);
													if (local638 == 2) {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, "<img=1>" + local1381, "<img=1>" + local452);
													} else if (local638 == 1) {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, "<img=0>" + local1381, "<img=0>" + local452);
													} else {
														Static220.method3874(0, Static170.method3229(local1780), local4955, local4892, 20, local1381, local452);
													}
												}
												packet = null;
												return true;
											} else if (packet == PACKET_3) {
												Static330.method5656(Static27.aClass210_2);
												packet = null;
												return true;
											} else if (packet == PACKET_78) {
												local220 = inboundBuffer.g2add();
												local74 = inboundBuffer.img4();
												if (Static378.method6314(local220)) {
													Static190.method3501(PlayerList.selfId, 0, 5, local74);
												}
												packet = null;
												return true;
											} else if (PACKET_69 == packet) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g1();
												local3551 = (local74 & 0x1) == 1;
												Static286.method4925(local3551, local220);
												local249 = inboundBuffer.g2();
												for (local497 = 0; local497 < local249; local497++) {
													local506 = inboundBuffer.ig2();
													local512 = inboundBuffer.g1();
													if (local512 == 255) {
														local512 = inboundBuffer.mg4();
													}
													Static62.method2391(local497, local512, local220, local506 - 1, local3551);
												}
												Static106.anIntArray135[Static54.anInt1417++ & 0x1F] = local220;
												packet = null;
												return true;
											} else if (PACKET_65 == packet) {
												local220 = inboundBuffer.ig2();
												local74 = inboundBuffer.g1();
												local228 = inboundBuffer.g2add();
												@Pc(5170) Npc local5170 = NpcList.npcs[local220];
												if (local5170 != null) {
													Static307.method5256(local228, local5170, local74);
												}
												packet = null;
												return true;
											} else if (PACKET_22 == packet) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g4();
												local228 = inboundBuffer.ig2();
												if (Static378.method6314(local220)) {
													Static322.method5481(local228, local74);
												}
												packet = null;
												return true;
											} else if (PACKET_11 == packet) {
												if (packetSize == 0) {
													Static330.aString62 = Static66.aClass79_34.method2267(client.language);
												} else {
													Static330.aString62 = inboundBuffer.gjstr();
												}
												packet = null;
												return true;
											} else if (packet == PACKET_88) {
												Static181.mapLoadDecoder(true);
												packet = null;
												return false;
											} else if (packet == PACKET_33) {
												Static330.method5656(Static19.aClass210_1);
												packet = null;
												return true;
											} else if (PACKET_53 == packet) {
												local220 = inboundBuffer.g2();
												local452 = inboundBuffer.gjstr();
												local228 = inboundBuffer.ig2();
												if (Static378.method6314(local228)) {
													Static10.method239(local220, local452);
												}
												packet = null;
												return true;
											} else if (packet == PACKET_57) {
												local220 = inboundBuffer.mg4();
												local74 = inboundBuffer.ig2add();
												local228 = inboundBuffer.g2add();
												local249 = inboundBuffer.g2add();
												local497 = inboundBuffer.g2add();
												if (Static378.method6314(local74)) {
													Static277.method4680(local497, local249, local220, local228);
												}
												packet = null;
												return true;
											} else if (PACKET_13 == packet) {
												Static330.method5656(Static109.aClass210_4);
												packet = null;
												return true;
											} else if (packet == PACKET_16) {
												local220 = inboundBuffer.g1add();
												local74 = local220 >> 2;
												local228 = local220 & 0x3;
												local249 = Static150.anIntArray174[local74];
												local497 = inboundBuffer.mg4();
												local506 = local497 >> 28 & 0x3;
												local512 = local497 >> 14 & 0x3FFF;
												local536 = local497 & 0x3FFF;
												local542 = inboundBuffer.ig2add();
												@Pc(5371) int local5371 = local536 - Static148.anInt2719;
												if (local542 == 65535) {
													local542 = -1;
												}
												local512 -= Static164.anInt3140;
												Static391.method6452(local74, local542, local5371, local249, local228, local512, local506);
												packet = null;
												return true;
											} else if (PACKET_59 == packet) {
												Static67.anInt1637 = inboundBuffer.g1sub();
												Static243.anInt4502 = inboundBuffer.g1();
												Static7.anInt7240 = inboundBuffer.g1bneg();
												while (inboundBuffer.pos < packetSize) {
													@Pc(5421) Class210 local5421 = Static324.method5539()[inboundBuffer.g1()];
													Static330.method5656(local5421);
												}
												packet = null;
												return true;
											} else if (PACKET_102 == packet) {
												local220 = inboundBuffer.g1();
												local74 = local220 >> 5;
												local228 = local220 & 0x1F;
												if (local228 == 0) {
													Static50.aClass84Array1[local74] = null;
													packet = null;
													return true;
												}
												@Pc(5468) Class84 local5468 = new Class84();
												local5468.anInt2355 = local228;
												local5468.anInt2363 = inboundBuffer.g1();
												if (local5468.anInt2363 >= 0 && local5468.anInt2363 < Static230.aClass13Array16.length) {
													if (local5468.anInt2355 == 1 || local5468.anInt2355 == 10) {
														local5468.anInt2354 = inboundBuffer.g2();
														inboundBuffer.pos += 6;
													} else if (local5468.anInt2355 >= 2 && local5468.anInt2355 <= 6) {
														if (local5468.anInt2355 == 2) {
															local5468.anInt2350 = 64;
															local5468.anInt2356 = 64;
														}
														if (local5468.anInt2355 == 3) {
															local5468.anInt2356 = 64;
															local5468.anInt2350 = 0;
														}
														if (local5468.anInt2355 == 4) {
															local5468.anInt2356 = 64;
															local5468.anInt2350 = 128;
														}
														if (local5468.anInt2355 == 5) {
															local5468.anInt2356 = 0;
															local5468.anInt2350 = 64;
														}
														if (local5468.anInt2355 == 6) {
															local5468.anInt2350 = 64;
															local5468.anInt2356 = 128;
														}
														local5468.anInt2355 = 2;
														local5468.anInt2359 = inboundBuffer.g1();
														local5468.anInt2352 = inboundBuffer.g2();
														local5468.anInt2364 = inboundBuffer.g2();
														local5468.anInt2362 = inboundBuffer.g1();
														local5468.anInt2349 = inboundBuffer.g2();
													}
													local5468.anInt2361 = inboundBuffer.g2();
													if (local5468.anInt2361 == 65535) {
														local5468.anInt2361 = -1;
													}
													Static50.aClass84Array1[local74] = local5468;
												}
												packet = null;
												return true;
											} else if (packet == PACKET_79) {
												Static330.method5656(Static140.aClass210_6);
												packet = null;
												return true;
											} else if (packet == PACKET_87) {
												local220 = inboundBuffer.g2();
												local452 = inboundBuffer.gjstr();
												@Pc(5648) Object[] local5648 = new Object[local452.length() + 1];
												for (local249 = local452.length() - 1; local249 >= 0; local249--) {
													if (local452.charAt(local249) == 's') {
														local5648[local249 + 1] = inboundBuffer.gjstr();
													} else {
														local5648[local249 + 1] = Integer.valueOf(inboundBuffer.g4());
													}
												}
												local5648[0] = Integer.valueOf(inboundBuffer.g4());
												if (Static378.method6314(local220)) {
													@Pc(5704) Class2_Sub13 local5704 = new Class2_Sub13();
													local5704.anObjectArray4 = local5648;
													Static198.method3591(local5704);
												}
												packet = null;
												return true;
											} else if (PACKET_28 == packet) {
												local220 = inboundBuffer.g2();
												local74 = inboundBuffer.g4();
												if (Static378.method6314(local220)) {
													@Pc(5735) Class2_Sub7 local5735 = (Class2_Sub7) Static329.aClass4_130.method90((long) local74);
													if (local5735 != null) {
														Static276.method4655(false, local5735, true);
													}
													if (Static192.aClass161_8 != null) {
														Static200.method3645(Static192.aClass161_8);
														Static192.aClass161_8 = null;
													}
												}
												packet = null;
												return true;
											} else if (packet == PACKET_96) {
												Static330.method5656(Static164.aClass210_8);
												packet = null;
												return true;
											} else if (packet == PACKET_9) {
												local220 = inboundBuffer.g4();
												local74 = inboundBuffer.ig2();
												local228 = inboundBuffer.ig2badd();
												if (Static378.method6314(local74)) {
													Static53.method3952(local228, local220);
												}
												packet = null;
												return true;
											} else {
												Static262.report(null, "T1 - " + (packet == null ? -1 : packet.getOpcode()) + "," + (packet2 == null ? -1 : packet2.getOpcode()) + "," + (packet3 == null ? -1 : packet3.getOpcode()) + " - " + packetSize);
												Static99.logout();
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
	public static boolean readPacket() {
		try {
			return readPacketInternal();
		} catch (@Pc(16) IOException local16) {
			Static211.method3725();
			return true;
		} catch (@Pc(21) Exception ex) {
			@Pc(81) String local81 = "T2 - " + (packet == null ? -1 : packet.getOpcode()) + "," + (packet2 == null ? -1 : packet2.getOpcode()) + "," + (packet3 == null ? -1 : packet3.getOpcode()) + " - " + packetSize + "," + (Static164.anInt3140 + Static17.aClass11_Sub5_Sub2_Sub1_3.movementQueueX[0]) + "," + (Static148.anInt2719 + Static17.aClass11_Sub5_Sub2_Sub1_3.movementQueueZ[0]) + " - ";
			for (@Pc(83) int local83 = 0; local83 < packetSize && local83 < 50; local83++) {
				local81 = local81 + inboundBuffer.data[local83] + ",";
			}
			ex.printStackTrace();
			Static262.report(ex, local81);
			Static99.logout();
			return true;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void readNpcInfo() {
		inboundBuffer.accessBits();
		@Pc(13) int size = inboundBuffer.gBit(8);
		@Pc(18) int i;
		if (size < NpcList.size) {
			for (i = size; i < NpcList.size; i++) {
				removedIds[removedCount++] = NpcList.ids[i];
			}
		}
		if (NpcList.size < size) {
			throw new RuntimeException("gnpov1");
		}
		NpcList.size = 0;
		for (i = 0; i < size; i++) {
			@Pc(64) int id = NpcList.ids[i];
			@Pc(68) Npc npc = NpcList.npcs[id];
			@Pc(73) int updated = inboundBuffer.gBit(1);
			if (updated == 0) {
				NpcList.ids[NpcList.size++] = id;
				npc.lastCycle = client.cycle;
			} else {
				@Pc(96) int type = inboundBuffer.gBit(2);
				if (type == 0) {
					NpcList.ids[NpcList.size++] = id;
					npc.lastCycle = client.cycle;
					extendedIds[extendedCount++] = id;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (type == 1) {
						NpcList.ids[NpcList.size++] = id;
						npc.lastCycle = client.cycle;
						local140 = inboundBuffer.gBit(3);
						npc.move(1, local140);
						local150 = inboundBuffer.gBit(1);
						if (local150 == 1) {
							extendedIds[extendedCount++] = id;
						}
					} else if (type == 2) {
						NpcList.ids[NpcList.size++] = id;
						npc.lastCycle = client.cycle;
						if (inboundBuffer.gBit(1) == 1) {
							local140 = inboundBuffer.gBit(3);
							npc.move(2, local140);
							local150 = inboundBuffer.gBit(3);
							npc.move(2, local150);
						} else {
							local140 = inboundBuffer.gBit(3);
							npc.move(0, local140);
						}
						local140 = inboundBuffer.gBit(1);
						if (local140 == 1) {
							extendedIds[extendedCount++] = id;
						}
					} else if (type == 3) {
						removedIds[removedCount++] = id;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V")
	public static void readNpcInfoPacket(@OriginalArg(1) boolean arg0) {
		removedCount = 0;
		extendedCount = 0;
		readNpcInfo();
		readNewNpcInfo(arg0);
		readExtendedNpcInfo();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < removedCount; local18++) {
			local24 = removedIds[local18];
			if (client.cycle != NpcList.npcs[local24].lastCycle) {
				if (NpcList.npcs[local24].type.hasAreaSound()) {
					AreaSoundManager.remove(NpcList.npcs[local24]);
				}
				NpcList.npcs[local24].setType(null);
				NpcList.npcs[local24] = null;
			}
		}
		if (inboundBuffer.pos != packetSize) {
			throw new RuntimeException("gnp1 pos:" + inboundBuffer.pos + " psize:" + packetSize);
		}
		for (local24 = 0; local24 < NpcList.size; local24++) {
			if (NpcList.npcs[NpcList.ids[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + NpcList.size);
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZZ)V")
	public static void readNewNpcInfo(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (inboundBuffer.availableBits(packetSize) >= 15) {
				@Pc(16) int id = inboundBuffer.gBit(15);
				if (id != 32767) {
					@Pc(21) boolean local21 = false;
					if (NpcList.npcs[id] == null) {
						NpcList.npcs[id] = new Npc();
						NpcList.npcs[id].anInt4619 = id;
						local21 = true;
					}
					@Pc(42) Npc local42 = NpcList.npcs[id];
					NpcList.ids[NpcList.size++] = id;
					local42.lastCycle = client.cycle;
					if (local42.type != null && local42.type.hasAreaSound()) {
						AreaSoundManager.remove(local42);
					}
					@Pc(71) int local71;
					if (arg0) {
						local71 = inboundBuffer.gBit(8);
						if (local71 > 127) {
							local71 -= 256;
						}
					} else {
						local71 = inboundBuffer.gBit(5);
						if (local71 > 15) {
							local71 -= 32;
						}
					}
					@Pc(97) int local97;
					if (arg0) {
						local97 = inboundBuffer.gBit(8);
						if (local97 > 127) {
							local97 -= 256;
						}
					} else {
						local97 = inboundBuffer.gBit(5);
						if (local97 > 15) {
							local97 -= 32;
						}
					}
					@Pc(119) int local119 = inboundBuffer.gBit(1);
					if (local119 == 1) {
						extendedIds[extendedCount++] = id;
					}
					local42.setType(Static6.NpcTypeList.method5570(inboundBuffer.gBit(14)));
					@Pc(151) int local151 = inboundBuffer.gBit(3) + 4 << 11 & 0x3929;
					@Pc(156) int local156 = inboundBuffer.gBit(2);
					@Pc(161) int local161 = inboundBuffer.gBit(1);
					local42.setSize(local42.type.size);
					local42.anInt4604 = local42.type.anInt2044 << 3;
					if (local42.anInt4604 == 0) {
						local42.method4330(0);
					} else if (local21) {
						local42.method4330(local151);
					}
					local42.teleport(local42.getSize(), local156, Static17.aClass11_Sub5_Sub2_Sub1_3.movementQueueX[0] + local97, local161 == 1, Static17.aClass11_Sub5_Sub2_Sub1_3.movementQueueZ[0] + local71);
					if (local42.type.hasAreaSound()) {
						AreaSoundManager.add(null, local42.movementQueueZ[0], 0, null, local42, local42.movementQueueX[0], local42.aByte78);
					}
					continue;
				}
			}
			inboundBuffer.accessBytes();
			return;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public static void readExtendedNpcInfo() {
		for (@Pc(7) int local7 = 0; local7 < extendedCount; local7++) {
			@Pc(21) int local21 = extendedIds[local7];
			@Pc(25) Npc local25 = NpcList.npcs[local21];
			@Pc(29) int local29 = inboundBuffer.g1();
			if ((local29 & 0x40) != 0) {
				local29 += inboundBuffer.g1() << 8;
			}
			@Pc(55) int local55;
			if ((local29 & 0x400) != 0) {
				local55 = inboundBuffer.g2add();
				local25.anInt4578 = inboundBuffer.g1sub();
				local25.anInt4591 = inboundBuffer.g1sub();
				local25.anInt4623 = local55 & 0x7FFF;
				local25.aBoolean319 = (local55 & 0x8000) != 0;
				local25.anInt4621 = client.cycle + local25.anInt4623 + local25.anInt4578;
			}
			@Pc(107) int local107;
			if ((local29 & 0x2) != 0) {
				local55 = inboundBuffer.gsmart();
				local107 = inboundBuffer.g1bneg();
				local25.method4334(local107, local55, client.cycle);
				local25.anInt4606 = client.cycle + 300;
				local25.anInt4631 = inboundBuffer.g1();
			}
			if ((local29 & 0x8) != 0) {
				local55 = inboundBuffer.g2();
				if (local55 == 65535) {
					local55 = -1;
				}
				local107 = inboundBuffer.g1sub();
				Static307.method5256(local55, local25, local107);
			}
			if ((local29 & 0x80) != 0) {
				local25.aString50 = inboundBuffer.gjstr();
				local25.anInt4636 = 100;
			}
			@Pc(224) int local224;
			if ((local29 & 0x4) != 0) {
				local55 = inboundBuffer.ig2add();
				local107 = inboundBuffer.ig4();
				if (local55 == 65535) {
					local55 = -1;
				}
				@Pc(186) boolean local186 = true;
				@Pc(221) Class157 local221;
				if (local55 != -1 && local25.anInt4594 != -1) {
					@Pc(207) Class91 local207;
					if (local55 == local25.anInt4594) {
						local207 = Static322.aClass211_2.method5407(local55);
						if (local207.aBoolean177 && local207.anInt2448 != -1) {
							local221 = Static39.aClass85_1.method2371(local207.anInt2448);
							local224 = local221.anInt4022;
							if (local224 == 0) {
								local186 = false;
							} else if (local224 == 1) {
								local186 = true;
							} else if (local224 == 2) {
								local25.anInt4598 = 0;
								local186 = false;
							}
						}
					} else {
						local207 = Static322.aClass211_2.method5407(local55);
						@Pc(262) Class91 local262 = Static322.aClass211_2.method5407(local25.anInt4594);
						if (local207.anInt2448 != -1 && local262.anInt2448 != -1) {
							@Pc(277) Class157 local277 = Static39.aClass85_1.method2371(local207.anInt2448);
							@Pc(283) Class157 local283 = Static39.aClass85_1.method2371(local262.anInt2448);
							if (local277.anInt4023 < local283.anInt4023) {
								local186 = false;
							}
						}
					}
				}
				if (local186) {
					local25.anInt4620 = 0;
					local25.anInt4594 = local55;
					local25.anInt4582 = 0;
					local25.anInt4639 = local107 >> 16;
					local25.anInt4612 = 1;
					local25.anInt4595 = client.cycle + (local107 & 0xFFFF);
					if (client.cycle < local25.anInt4595) {
						local25.anInt4582 = -1;
					}
					if (local25.anInt4594 != -1 && client.cycle == local25.anInt4595) {
						@Pc(340) int local340 = Static322.aClass211_2.method5407(local25.anInt4594).anInt2448;
						if (local340 != -1) {
							local221 = Static39.aClass85_1.method2371(local340);
							if (local221 != null && local221.anIntArray262 != null) {
								Static1.method4(local221, false, local25.aByte78, local25.xFine, local25.zFine, 0);
							}
						}
					}
				}
			}
			if ((local29 & 0x20) != 0) {
				local25.anInt4611 = inboundBuffer.g2();
				if (local25.anInt4611 == 65535) {
					local25.anInt4611 = -1;
				}
			}
			if ((local29 & 0x1) != 0) {
				local55 = inboundBuffer.gsmart();
				local107 = inboundBuffer.g1bneg();
				local25.method4334(local107, local55, client.cycle);
			}
			if ((local29 & 0x100) != 0) {
				local55 = inboundBuffer.g1sub();
				@Pc(411) int[] local411 = new int[local55];
				@Pc(414) int[] local414 = new int[local55];
				@Pc(417) int[] local417 = new int[local55];
				for (@Pc(419) int local419 = 0; local419 < local55; local419++) {
					local224 = inboundBuffer.g2add();
					if (local224 == 65535) {
						local224 = -1;
					}
					local411[local419] = local224;
					local414[local419] = inboundBuffer.g1bneg();
					local417[local419] = inboundBuffer.g2();
				}
				Static92.method1966(local411, local417, local25, local414);
			}
			if ((local29 & 0x200) != 0) {
				local25.anInt4663 = inboundBuffer.g2();
				local25.anInt4657 = inboundBuffer.ig2();
			}
			if ((local29 & 0x10) != 0) {
				if (local25.type.hasAreaSound()) {
					AreaSoundManager.remove(local25);
				}
				local25.setType(Static6.NpcTypeList.method5570(inboundBuffer.ig2()));
				local25.setSize(local25.type.size);
				local25.anInt4604 = local25.type.anInt2044 << 3;
				if (local25.type.hasAreaSound()) {
					AreaSoundManager.add(null, local25.movementQueueZ[0], 0, null, local25, local25.movementQueueX[0], local25.aByte78);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qg;BI)V")
	public static void readPlayerInfo(@OriginalArg(0) Packet packet, @OriginalArg(2) int size) {
		Static112.debugGpi = false;
		Static325.anInt6079 = 0;
		readPlayerGpi(packet);
		readPlayerUpdateMasks(packet);
		if (Static112.debugGpi) {
			System.out.println("---endgpp---");
		}
		if (packet.pos != size) {
			throw new RuntimeException("gpi1 pos:" + packet.pos + " psize:" + size);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!qg;I)V")
	public static void readPlayerGpi(@OriginalArg(0) Packet buffer) {
		// active players:

		@Pc(7) int local7 = 0;
		buffer.accessBits();
		@Pc(20) int local20;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < PlayerList.anInt751; local14++) {
			local20 = PlayerList.anIntArray121[local14];
			if ((PlayerList.aByteArray7[local20] & 0x1) == 0) {
				if (local7 > 0) {
					PlayerList.aByteArray7[local20] = (byte) (PlayerList.aByteArray7[local20] | 0x2);
					local7--;
				} else {
					local48 = buffer.gBit(1);
					if (local48 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local20] = (byte) (PlayerList.aByteArray7[local20] | 0x2);
					} else {
						method6464(buffer, local20);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}

		//

		buffer.accessBits();
		@Pc(126) int local126;
		for (local20 = 0; local20 < PlayerList.anInt751; local20++) {
			local48 = PlayerList.anIntArray121[local20];
			if ((PlayerList.aByteArray7[local48] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					PlayerList.aByteArray7[local48] = (byte) (PlayerList.aByteArray7[local48] | 0x2);
				} else {
					local126 = buffer.gBit(1);
					if (local126 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local48] = (byte) (PlayerList.aByteArray7[local48] | 0x2);
					} else {
						method6464(buffer, local48);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}

		// inactive players:

		buffer.accessBits();
		@Pc(210) int local210;
		for (local48 = 0; local48 < PlayerList.anInt3547; local48++) {
			local126 = PlayerList.anIntArray284[local48];
			if ((PlayerList.aByteArray7[local126] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					PlayerList.aByteArray7[local126] = (byte) (PlayerList.aByteArray7[local126] | 0x2);
				} else {
					local210 = buffer.gBit(1);
					if (local210 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local126] = (byte) (PlayerList.aByteArray7[local126] | 0x2);
					} else if (method6033(buffer, local126)) {
						PlayerList.aByteArray7[local126] = (byte) (PlayerList.aByteArray7[local126] | 0x2);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}

		//

		buffer.accessBits();
		for (local126 = 0; local126 < PlayerList.anInt3547; local126++) {
			local210 = PlayerList.anIntArray284[local126];
			if ((PlayerList.aByteArray7[local210] & 0x1) == 0) {
				if (local7 > 0) {
					PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] | 0x2);
					local7--;
				} else {
					@Pc(301) int local301 = buffer.gBit(1);
					if (local301 == 0) {
						local7 = method2161(buffer);
						PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] | 0x2);
					} else if (method6033(buffer, local210)) {
						PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] | 0x2);
					}
				}
			}
		}
		buffer.accessBytes();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}

		//

		PlayerList.anInt751 = 0;
		PlayerList.anInt3547 = 0;
		for (local210 = 1; local210 < 2048; local210++) {
			PlayerList.aByteArray7[local210] = (byte) (PlayerList.aByteArray7[local210] >> 1);
			@Pc(366) Player local366 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local210];
			if (local366 == null) {
				PlayerList.anIntArray284[PlayerList.anInt3547++] = local210;
			} else {
				PlayerList.anIntArray121[PlayerList.anInt751++] = local210;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!qg;)V")
	public static void readPlayerUpdateMasks(@OriginalArg(1) Packet buffer) {
		for (@Pc(15) int local15 = 0; local15 < Static325.anInt6079; local15++) {
			@Pc(21) int local21 = Static52.anIntArray100[local15];
			@Pc(25) Player local25 = Static12.aClass11_Sub5_Sub2_Sub1Array1[local21];
			@Pc(29) int opcode = buffer.g1();
			if ((opcode & 0x2) != 0) {
				opcode += buffer.g1() << 8;
			}
			readPlayerUpdateMask(buffer, local21, local25, opcode);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!qg;BILclient!nh;I)V")
	public static void readPlayerUpdateMask(@OriginalArg(0) Packet buffer, @OriginalArg(2) int arg1, @OriginalArg(3) Player arg2, @OriginalArg(4) int arg3) {
		@Pc(11) byte local11 = -1;
		if ((arg3 & 0x20) != 0) {
			Static335.aByteArray92[arg1] = buffer.g1badd();
		}
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(43) int local43;
		if ((arg3 & 0x8) != 0) {
			local32 = buffer.g2add();
			local36 = buffer.g1bneg();
			local40 = buffer.g1();
			local43 = buffer.pos;
			@Pc(51) boolean local51 = (local32 & 0x8000) != 0;
			if (arg2.aString41 != null && arg2.appearance != null) {
				@Pc(59) boolean local59 = false;
				if (local36 <= 1) {
					if (!local51 && (LoginManager.playerUnderage && !LoginManager.parentalChatConsent || LoginManager.mapQuickChat)) {
						local59 = true;
					} else if (Static105.method2208(arg2.aString41)) {
						local59 = true;
					}
				}
				if (!local59 && Static212.anInt3785 == 0) {
					Static89.aClass2_Sub4_2.pos = 0;
					buffer.ipadata(Static89.aClass2_Sub4_2.data, local40);
					Static89.aClass2_Sub4_2.pos = 0;
					@Pc(107) int local107 = -1;
					@Pc(117) String local117;
					if (local51) {
						local32 &= 0x7FFF;
						@Pc(127) Class86 local127 = Static290.method5027(Static89.aClass2_Sub4_2);
						local107 = local127.anInt2377;
						local117 = local127.aClass2_Sub2_Sub16_1.method5602(Static89.aClass2_Sub4_2);
					} else {
						local117 = Static153.method2772(Static308.method5276(Static89.aClass2_Sub4_2));
					}
					arg2.aString50 = local117.trim();
					arg2.anInt4600 = local32 & 0xFF;
					arg2.anInt4618 = local32 >> 8;
					arg2.anInt4636 = 150;
					@Pc(167) int local167;
					if (local36 == 1 || local36 == 2) {
						local167 = local51 ? 17 : 1;
					} else {
						local167 = local51 ? 17 : 2;
					}
					if (local36 == 2) {
						Static220.method3874(0, null, local117, local107, local167, "<img=1>" + arg2.method4070(), "<img=1>" + arg2.method4072());
					} else if (local36 == 1) {
						Static220.method3874(0, null, local117, local107, local167, "<img=0>" + arg2.method4070(), "<img=0>" + arg2.method4072());
					} else {
						Static220.method3874(0, null, local117, local107, local167, arg2.method4070(), arg2.method4072());
					}
				}
			}
			buffer.pos = local43 + local40;
		}
		@Pc(283) int local283;
		@Pc(289) int local289;
		if ((arg3 & 0x400) != 0) {
			local32 = buffer.g1sub();
			@Pc(275) int[] local275 = new int[local32];
			@Pc(278) int[] local278 = new int[local32];
			@Pc(281) int[] local281 = new int[local32];
			for (local283 = 0; local283 < local32; local283++) {
				local289 = buffer.ig2();
				if (local289 == 65535) {
					local289 = -1;
				}
				local275[local283] = local289;
				local278[local283] = buffer.g1bneg();
				local281[local283] = buffer.ig2();
			}
			Static154.method2785(local275, local281, local278, arg2);
		}
		if ((arg3 & 0x1) != 0) {
			local32 = buffer.g1sub();
			@Pc(337) byte[] local337 = new byte[local32];
			@Pc(342) Buffer local342 = new Buffer(local337);
			buffer.igdata(local337, local32);
			Static231.aClass2_Sub4Array1[arg1] = local342;
			arg2.decodeAppearance(local342);
		}
		if ((arg3 & 0x10) != 0) {
			local32 = buffer.g2add();
			if (local32 == 65535) {
				local32 = -1;
			}
			arg2.anInt4611 = local32;
		}
		if ((arg3 & 0x4) != 0) {
			local32 = buffer.ig2add();
			if (local32 == 65535) {
				local32 = -1;
			}
			local36 = buffer.g1add();
			Static337.method5707(arg2, local36, local32);
		}
		if ((arg3 & 0x100) != 0) {
			arg2.anInt4615 = buffer.g1badd();
			arg2.anInt4588 = buffer.g1badd();
			arg2.anInt4577 = buffer.g1bsub();
			arg2.anInt4599 = buffer.g1b();
			arg2.anInt4622 = buffer.g2add() + client.cycle;
			arg2.anInt4584 = buffer.g2add() + client.cycle;
			arg2.anInt4614 = buffer.g1bneg();
			arg2.anInt4642 = 0;
			if (arg2.aBoolean276) {
				arg2.anInt4577 += arg2.anInt4169;
				arg2.anInt4615 += arg2.anInt4169;
				arg2.anInt4588 += arg2.anInt4181;
				arg2.anInt4643 = 0;
				arg2.anInt4599 += arg2.anInt4181;
			} else {
				arg2.anInt4588 += arg2.movementQueueZ[0];
				arg2.anInt4599 += arg2.movementQueueZ[0];
				arg2.anInt4643 = 1;
				arg2.anInt4577 += arg2.movementQueueX[0];
				arg2.anInt4615 += arg2.movementQueueX[0];
			}
		}
		if ((arg3 & 0x1000) != 0) {
			local32 = buffer.g2();
			arg2.anInt4578 = buffer.g1add();
			arg2.anInt4591 = buffer.g1sub();
			arg2.anInt4623 = local32 & 0x7FFF;
			arg2.aBoolean319 = (local32 & 0x8000) != 0;
			arg2.anInt4621 = arg2.anInt4623 + client.cycle + arg2.anInt4578;
		}
		if ((arg3 & 0x80) != 0) {
			arg2.anInt4174 = buffer.g2();
			if (arg2.anInt4643 == 0) {
				arg2.method4325(arg2.anInt4174);
				arg2.anInt4174 = -1;
			}
		}
		if ((arg3 & 0x200) != 0) {
			arg2.aString50 = buffer.gjstr();
			if (arg2.aString50.charAt(0) == '~') {
				arg2.aString50 = arg2.aString50.substring(1);
				Static33.method4200(arg2.method4072(), 0, arg2.aString50, 2, arg2.method4070());
			} else if (Static17.aClass11_Sub5_Sub2_Sub1_3 == arg2) {
				Static33.method4200(arg2.method4072(), 0, arg2.aString50, 2, arg2.method4070());
			}
			arg2.anInt4600 = 0;
			arg2.anInt4618 = 0;
			arg2.anInt4636 = 150;
		}
		if ((arg3 & 0x2000) != 0) {
			local32 = buffer.ig2add();
			local36 = buffer.g4();
			if (local32 == 65535) {
				local32 = -1;
			}
			@Pc(690) boolean local690 = true;
			@Pc(780) Class157 local780;
			if (local32 != -1 && arg2.anInt4594 != -1) {
				@Pc(707) Class91 local707;
				if (local32 == arg2.anInt4594) {
					local707 = Static322.aClass211_2.method5407(local32);
					if (local707.aBoolean177 && local707.anInt2448 != -1) {
						@Pc(723) Class157 local723 = Static39.aClass85_1.method2371(local707.anInt2448);
						local289 = local723.anInt4022;
						if (local289 == 0) {
							local690 = false;
						} else if (local289 == 1) {
							local690 = true;
						} else if (local289 == 2) {
							arg2.anInt4598 = 0;
							local690 = false;
						}
					}
				} else {
					local707 = Static322.aClass211_2.method5407(local32);
					@Pc(763) Class91 local763 = Static322.aClass211_2.method5407(arg2.anInt4594);
					if (local707.anInt2448 != -1 && local763.anInt2448 != -1) {
						local780 = Static39.aClass85_1.method2371(local707.anInt2448);
						@Pc(786) Class157 local786 = Static39.aClass85_1.method2371(local763.anInt2448);
						if (local780.anInt4023 < local786.anInt4023) {
							local690 = false;
						}
					}
				}
			}
			if (local690) {
				arg2.anInt4639 = local36 >> 16;
				local43 = client.cycle;
				arg2.anInt4594 = local32;
				arg2.anInt4595 = (local36 & 0xFFFF) + local43;
				arg2.anInt4582 = 0;
				arg2.anInt4620 = 0;
				arg2.anInt4612 = 1;
				if (arg2.anInt4595 > local43) {
					arg2.anInt4582 = -1;
				}
				if (arg2.anInt4594 != -1 && local43 == arg2.anInt4595) {
					local283 = Static322.aClass211_2.method5407(arg2.anInt4594).anInt2448;
					if (local283 != -1) {
						local780 = Static39.aClass85_1.method2371(local283);
						if (local780 != null && local780.anIntArray262 != null) {
							Static1.method4(local780, arg2 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg2.aByte78, arg2.xFine, arg2.zFine, 0);
						}
					}
				}
			}
		}
		if ((arg3 & 0x40) != 0) {
			local32 = buffer.gsmart();
			local36 = buffer.g1sub();
			arg2.method4334(local36, local32, client.cycle);
			arg2.anInt4606 = client.cycle + 300;
			arg2.anInt4631 = buffer.g1bneg();
		}
		if ((arg3 & 0x800) != 0) {
			local32 = client.cycle;
			local36 = buffer.gsmart();
			local40 = buffer.g1sub();
			arg2.method4334(local40, local36, local32);
		}
		if ((arg3 & 0x4000) != 0) {
			local11 = buffer.g1bsub();
		}
		if (!arg2.aBoolean276) {
			return;
		}
		if (local11 == 127) {
			arg2.method4064(arg2.anInt4169, arg2.anInt4181);
			return;
		}
		@Pc(964) byte local964;
		if (local11 == -1) {
			local964 = Static335.aByteArray92[arg1];
		} else {
			local964 = local11;
		}
		arg2.method4068(arg2.anInt4181, arg2.anInt4169, local964);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!qg;B)I")
	public static int method2161(@OriginalArg(0) Packet arg0) {
		@Pc(10) int local10 = arg0.gBit(2);
		@Pc(22) int local22;
		if (local10 == 0) {
			local22 = 0;
		} else if (local10 == 1) {
			local22 = arg0.gBit(5);
		} else if (local10 == 2) {
			local22 = arg0.gBit(8);
		} else {
			local22 = arg0.gBit(11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!qg;II)V")
	public static void method6464(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.gBit(1) == 1;
		if (local15) {
			Static52.anIntArray100[Static325.anInt6079++] = arg1;
		}
		@Pc(30) int local30 = arg0.gBit(2);
		@Pc(34) Player local34 = Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(146) int local146;
			if (local30 == 1) {
				local136 = arg0.gBit(3);
				local141 = local34.movementQueueX[0];
				local146 = local34.movementQueueZ[0];
				if (local136 == 0) {
					local146--;
					local141--;
				} else if (local136 == 1) {
					local146--;
				} else if (local136 == 2) {
					local146--;
					local141++;
				} else if (local136 == 3) {
					local141--;
				} else if (local136 == 4) {
					local141++;
				} else if (local136 == 5) {
					local146++;
					local141--;
				} else if (local136 == 6) {
					local146++;
				} else if (local136 == 7) {
					local141++;
					local146++;
				}
				if (local15) {
					local34.anInt4169 = local141;
					local34.anInt4181 = local146;
					local34.aBoolean276 = true;
				} else {
					local34.method4068(local146, local141, Static335.aByteArray92[arg1]);
				}
			} else if (local30 == 2) {
				local136 = arg0.gBit(4);
				local141 = local34.movementQueueX[0];
				local146 = local34.movementQueueZ[0];
				if (local136 == 0) {
					local141 -= 2;
					local146 -= 2;
				} else if (local136 == 1) {
					local141--;
					local146 -= 2;
				} else if (local136 == 2) {
					local146 -= 2;
				} else if (local136 == 3) {
					local141++;
					local146 -= 2;
				} else if (local136 == 4) {
					local141 += 2;
					local146 -= 2;
				} else if (local136 == 5) {
					local146--;
					local141 -= 2;
				} else if (local136 == 6) {
					local146--;
					local141 += 2;
				} else if (local136 == 7) {
					local141 -= 2;
				} else if (local136 == 8) {
					local141 += 2;
				} else if (local136 == 9) {
					local146++;
					local141 -= 2;
				} else if (local136 == 10) {
					local146++;
					local141 += 2;
				} else if (local136 == 11) {
					local141 -= 2;
					local146 += 2;
				} else if (local136 == 12) {
					local141--;
					local146 += 2;
				} else if (local136 == 13) {
					local146 += 2;
				} else if (local136 == 14) {
					local146 += 2;
					local141++;
				} else if (local136 == 15) {
					local146 += 2;
					local141 += 2;
				}
				if (local15) {
					local34.anInt4181 = local146;
					local34.aBoolean276 = true;
					local34.anInt4169 = local141;
				} else {
					local34.method4068(local146, local141, Static335.aByteArray92[arg1]);
				}
			} else {
				local136 = arg0.gBit(1);
				@Pc(411) int local411;
				@Pc(419) int local419;
				@Pc(432) int local432;
				@Pc(439) int local439;
				if (local136 == 0) {
					local141 = arg0.gBit(12);
					local146 = local141 >> 10;
					local411 = local141 >> 5 & 0x1F;
					if (local411 > 15) {
						local411 -= 32;
					}
					local419 = local141 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local432 = local411 + local34.movementQueueX[0];
					local439 = local419 + local34.movementQueueZ[0];
					if (local15) {
						local34.anInt4181 = local439;
						local34.aBoolean276 = true;
						local34.anInt4169 = local432;
					} else {
						local34.method4068(local439, local432, Static335.aByteArray92[arg1]);
					}
					local34.aByte78 = (byte) (local146 + local34.aByte78 & 0x3);
					if (arg1 == PlayerList.selfId) {
						Static355.anInt6585 = local34.aByte78;
					}
				} else {
					local141 = arg0.gBit(30);
					local146 = local141 >> 28;
					local411 = local141 >> 14 & 0x3FFF;
					local419 = local141 & 0x3FFF;
					local432 = (local411 + Static164.anInt3140 + local34.movementQueueX[0] & 0x3FFF) - Static164.anInt3140;
					local439 = (local34.movementQueueZ[0] + Static148.anInt2719 + local419 & 0x3FFF) - Static148.anInt2719;
					if (local15) {
						local34.aBoolean276 = true;
						local34.anInt4181 = local439;
						local34.anInt4169 = local432;
					} else {
						local34.method4068(local439, local432, Static335.aByteArray92[arg1]);
					}
					local34.aByte78 = (byte) (local34.aByte78 + local146 & 0x3);
					if (PlayerList.selfId == arg1) {
						Static355.anInt6585 = local34.aByte78;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean276 = false;
		} else if (arg1 == PlayerList.selfId) {
			throw new RuntimeException("s:lr");
		} else {
			Static360.anIntArray422[arg1] = (Static164.anInt3140 + local34.movementQueueX[0] >> 6 << 14) + (local34.aByte78 << 28) + (Static148.anInt2719 + local34.movementQueueZ[0] >> 6);
			if (local34.anInt4174 == -1) {
				Static324.anIntArray410[arg1] = local34.aClass248_7.method6441();
			} else {
				Static324.anIntArray410[arg1] = local34.anInt4174;
			}
			Static225.anIntArray260[arg1] = local34.anInt4611;
			if (local34.soundRadius > 0) {
				AreaSoundManager.remove(local34);
			}
			Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1] = null;
			if (arg0.gBit(1) != 0) {
				method6033(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!qg;ZI)Z")
	public static boolean method6033(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.gBit(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (local8 == 0) {
			if (arg0.gBit(1) != 0) {
				method6033(arg0, arg1);
			}
			local31 = arg0.gBit(6);
			local36 = arg0.gBit(6);
			@Pc(48) boolean local48 = arg0.gBit(1) == 1;
			if (local48) {
				Static52.anIntArray100[Static325.anInt6079++] = arg1;
			}
			if (Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Player local75 = Static12.aClass11_Sub5_Sub2_Sub1Array1[arg1] = new Player();
			local75.anInt4619 = arg1;
			if (Static231.aClass2_Sub4Array1[arg1] != null) {
				local75.decodeAppearance(Static231.aClass2_Sub4Array1[arg1]);
			}
			local75.method4330(Static324.anIntArray410[arg1]);
			local75.anInt4611 = Static225.anIntArray260[arg1];
			local103 = Static360.anIntArray422[arg1];
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local117 = local103 & 0xFF;
			local75.aByteArray51[0] = Static335.aByteArray92[arg1];
			local75.aByte78 = (byte) local107;
			local75.method4064(local31 + (local113 << 6) - Static164.anInt3140, -Static148.anInt2719 + local36 + (local117 << 6));
			local75.aBoolean276 = false;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.gBit(2);
			local36 = Static360.anIntArray422[arg1];
			Static360.anIntArray422[arg1] = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(201) int local201;
			@Pc(205) int local205;
			if (local8 != 2) {
				local31 = arg0.gBit(18);
				local36 = local31 >> 16;
				local201 = local31 >> 8 & 0xFF;
				local205 = local31 & 0xFF;
				local103 = Static360.anIntArray422[arg1];
				local107 = local36 + (local103 >> 28) & 0x3;
				local113 = local201 + (local103 >> 14) & 0xFF;
				local117 = local205 + local103 & 0xFF;
				Static360.anIntArray422[arg1] = (local113 << 14) + (local107 << 28) + local117;
				return false;
			}
			local31 = arg0.gBit(5);
			local36 = local31 >> 3;
			local201 = local31 & 0x7;
			local205 = Static360.anIntArray422[arg1];
			local103 = (local205 >> 28) + local36 & 0x3;
			local107 = local205 >> 14 & 0xFF;
			local113 = local205 & 0xFF;
			if (local201 == 0) {
				local107--;
				local113--;
			}
			if (local201 == 1) {
				local113--;
			}
			if (local201 == 2) {
				local113--;
				local107++;
			}
			if (local201 == 3) {
				local107--;
			}
			if (local201 == 4) {
				local107++;
			}
			if (local201 == 5) {
				local107--;
				local113++;
			}
			if (local201 == 6) {
				local113++;
			}
			if (local201 == 7) {
				local107++;
				local113++;
			}
			Static360.anIntArray422[arg1] = (local107 << 14) + (local103 << 28) + local113;
			return false;
		}
	}

}
