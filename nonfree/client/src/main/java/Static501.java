import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "[I")
	public static int[] anIntArray606;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Z")
	public static boolean aBoolean576;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	public static int anInt7568 = 104;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "[Lclient!lca;")
	public static final Class2_Sub7[] aClass2_Sub7Array4 = new Class2_Sub7[8];

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
	public static boolean method6714() {
		@Pc(7) Hashtable local7 = new Hashtable();
		@Pc(10) Enumeration local10 = Static137.aHashtable2.keys();
		while (local10.hasMoreElements()) {
			@Pc(14) Object local14 = local10.nextElement();
			local7.put(local14, Static137.aHashtable2.get(local14));
		}
		try {
			@Pc(35) Class local35 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(40) Class local40 = Class.forName("java.lang.ClassLoader");
			@Pc(46) Field local46 = local40.getDeclaredField("nativeLibraries");
			@Pc(58) Method local58 = local35.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local58.invoke(local46, Boolean.TRUE);
			try {
				local10 = Static137.aHashtable2.keys();
				while (local10.hasMoreElements()) {
					@Pc(76) String local76 = (String) local10.nextElement();
					try {
						@Pc(81) File local81 = (File) Static154.aHashtable3.get(local76);
						@Pc(86) Class local86 = (Class) Static137.aHashtable2.get(local76);
						@Pc(92) Vector local92 = (Vector) local46.get(local86.getClassLoader());
						for (@Pc(94) int local94 = 0; local92.size() > local94; local94++) {
							try {
								@Pc(99) Object local99 = local92.elementAt(local94);
								@Pc(106) Field local106 = local99.getClass().getDeclaredField("name");
								local58.invoke(local106, Boolean.TRUE);
								try {
									@Pc(121) String local121 = (String) local106.get(local99);
									if (local121 != null && local121.equalsIgnoreCase(local81.getCanonicalPath())) {
										@Pc(137) Field local137 = local99.getClass().getDeclaredField("handle");
										@Pc(146) Method local146 = local99.getClass().getDeclaredMethod("finalize");
										local58.invoke(local137, Boolean.TRUE);
										local58.invoke(local146, Boolean.TRUE);
										try {
											local146.invoke(local99);
											local137.set(local99, Integer.valueOf(0));
											local7.remove(local76);
										} catch (@Pc(185) Throwable local185) {
										}
										local58.invoke(local146, Boolean.FALSE);
										local58.invoke(local137, Boolean.FALSE);
									}
								} catch (@Pc(207) Throwable local207) {
								}
								local58.invoke(local106, Boolean.FALSE);
							} catch (@Pc(219) Throwable local219) {
							}
						}
					} catch (@Pc(227) Throwable local227) {
					}
				}
			} catch (@Pc(233) Throwable local233) {
			}
			local58.invoke(local46, Boolean.FALSE);
		} catch (@Pc(245) Throwable local245) {
		}
		Static137.aHashtable2 = local7;
		return Static137.aHashtable2.isEmpty();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)Z")
	public static boolean method6715(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V")
	public static void method6716(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static329.anInt1752;
		@Pc(7) int local7 = Static32.anInt775;
		if (arg0 && Static504.aBoolean579) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static163.aClass19_17.f(local7, local5);
	}
}
