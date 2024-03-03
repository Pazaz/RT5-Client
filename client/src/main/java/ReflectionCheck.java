import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@OriginalClass("client!wf")
public final class ReflectionCheck extends Node {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!ld;")
	public static LinkedList queue = new LinkedList();
	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "[Lclient!cc;")
	public PrivilegedRequest[] fieldRequests;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "[I")
	public int[] errors;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "[Lclient!cc;")
	public PrivilegedRequest[] methodRequests;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "[I")
	public int[] fieldValues;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "[I")
	public int[] types;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "[[[B")
	public byte[][][] methodArguments;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!qg;I)V")
	public static void mainLogic(@OriginalArg(1) PacketBit arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(16) ReflectionCheck local16 = (ReflectionCheck) queue.head();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.size; local23++) {
				if (local16.fieldRequests[local23] != null) {
					if (local16.fieldRequests[local23].status == 2) {
						local16.errors[local23] = -5;
					}
					if (local16.fieldRequests[local23].status == 0) {
						local21 = true;
					}
				}
				if (local16.methodRequests[local23] != null) {
					if (local16.methodRequests[local23].status == 2) {
						local16.errors[local23] = -6;
					}
					if (local16.methodRequests[local23].status == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			arg0.p1isaac(arg1);
			arg0.p1(0);
			@Pc(106) int local106 = arg0.pos;
			arg0.p4(local16.id);
			for (@Pc(113) int local113 = 0; local113 < local16.size; local113++) {
				if (local16.errors[local113] == 0) {
					try {
						@Pc(137) int local137 = local16.types[local113];
						@Pc(146) Field local146;
						@Pc(150) int local150;
						if (local137 == 0) {
							local146 = (Field) local16.fieldRequests[local113].result;
							local150 = local146.getInt(null);
							arg0.p1(0);
							arg0.p4(local150);
						} else if (local137 == 1) {
							local146 = (Field) local16.fieldRequests[local113].result;
							local146.setInt(null, local16.fieldValues[local113]);
							arg0.p1(0);
						} else if (local137 == 2) {
							local146 = (Field) local16.fieldRequests[local113].result;
							local150 = local146.getModifiers();
							arg0.p1(0);
							arg0.p4(local150);
						}
						@Pc(218) Method local218;
						if (local137 == 3) {
							local218 = (Method) local16.methodRequests[local113].result;
							@Pc(223) byte[][] local223 = local16.methodArguments[local113];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(260) Object local260 = local218.invoke(null, local227);
							if (local260 == null) {
								arg0.p1(0);
							} else if (local260 instanceof Number) {
								arg0.p1(1);
								arg0.p8(((Number) local260).longValue());
							} else if (local260 instanceof String) {
								arg0.p1(2);
								arg0.pjstr((String) local260);
							} else {
								arg0.p1(4);
							}
						} else if (local137 == 4) {
							local218 = (Method) local16.methodRequests[local113].result;
							local150 = local218.getModifiers();
							arg0.p1(0);
							arg0.p4(local150);
						}
					} catch (@Pc(328) ClassNotFoundException local328) {
						arg0.p1(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg0.p1(-11);
					} catch (@Pc(340) StreamCorruptedException local340) {
						arg0.p1(-12);
					} catch (@Pc(348) OptionalDataException local348) {
						arg0.p1(-13);
					} catch (@Pc(354) IllegalAccessException local354) {
						arg0.p1(-14);
					} catch (@Pc(362) IllegalArgumentException local362) {
						arg0.p1(-15);
					} catch (@Pc(368) InvocationTargetException local368) {
						arg0.p1(-16);
					} catch (@Pc(374) SecurityException local374) {
						arg0.p1(-17);
					} catch (@Pc(380) IOException local380) {
						arg0.p1(-18);
					} catch (@Pc(386) NullPointerException local386) {
						arg0.p1(-19);
					} catch (@Pc(392) Exception local392) {
						arg0.p1(-20);
					} catch (@Pc(398) Throwable local398) {
						arg0.p1(-21);
					}
				} else {
					arg0.p1(local16.errors[local113]);
				}
			}
			arg0.addcrc(local106);
			arg0.psize1(arg0.pos - local106);
			local16.unlink();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ml;IILclient!bt;)V")
	public static void push(@OriginalArg(0) Signlink arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Packet arg2) {
		@Pc(9) ReflectionCheck local9 = new ReflectionCheck();
		local9.size = arg2.g1();
		local9.id = arg2.g4();
		local9.errors = new int[local9.size];
		local9.types = new int[local9.size];
		local9.fieldRequests = new PrivilegedRequest[local9.size];
		local9.methodArguments = new byte[local9.size][][];
		local9.fieldValues = new int[local9.size];
		local9.methodRequests = new PrivilegedRequest[local9.size];
		for (@Pc(56) int local56 = 0; local56 < local9.size; local56++) {
			try {
				@Pc(62) int local62 = arg2.g1();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local78 = arg2.gjstr();
					local82 = arg2.gjstr();
					local84 = 0;
					if (local62 == 1) {
						local84 = arg2.g4();
					}
					local9.types[local56] = local62;
					local9.fieldValues[local56] = local84;
					local9.fieldRequests[local56] = arg0.getDeclaredField(Static17.method4212(local78), local82);
				} else if (local62 == 3 || local62 == 4) {
					local78 = arg2.gjstr();
					local82 = arg2.gjstr();
					local84 = arg2.g1();
					@Pc(139) String[] local139 = new String[local84];
					for (@Pc(141) int local141 = 0; local141 < local84; local141++) {
						local139[local141] = arg2.gjstr();
					}
					@Pc(156) byte[][] local156 = new byte[local84][];
					@Pc(167) int local167;
					if (local62 == 3) {
						for (@Pc(161) int local161 = 0; local161 < local84; local161++) {
							local167 = arg2.g4();
							local156[local161] = new byte[local167];
							arg2.gdata(local156[local161], local167);
						}
					}
					local9.types[local56] = local62;
					@Pc(192) Class[] local192 = new Class[local84];
					for (local167 = 0; local167 < local84; local167++) {
						local192[local167] = Static17.method4212(local139[local167]);
					}
					local9.methodRequests[local56] = arg0.getDeclaredMethod(Static17.method4212(local78), local82, local192);
					local9.methodArguments[local56] = local156;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local9.errors[local56] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local9.errors[local56] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local9.errors[local56] = -3;
			} catch (@Pc(252) Exception local252) {
				local9.errors[local56] = -4;
			} catch (@Pc(259) Throwable local259) {
				local9.errors[local56] = -5;
			}
		}
		queue.addTail(local9);
	}

}
