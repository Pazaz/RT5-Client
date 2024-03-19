import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "Ljava/lang/String;")
	public static final String aString223 = "purple:";

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "Ljava/lang/String;")
	public static final String aString224 = "flash2:";

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method5123(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(19) byte[] local19 = (byte[]) arg1;
			return arg0 ? Static342.method6042(local19) : local19;
		} else if (arg1 instanceof Class152) {
			@Pc(33) Class152 local33 = (Class152) arg1;
			return local33.method4436();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!vg;I)V")
	public static void method5124(@OriginalArg(1) Class1_Sub16_Sub2 arg0) {
		while (true) {
			@Pc(15) Class1_Sub8 local15 = (Class1_Sub8) Static92.aClass130_7.method3749();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2058; local22++) {
				if (local15.aClass145Array2[local22] != null) {
					if (local15.aClass145Array2[local22].anInt5065 == 2) {
						local15.anIntArray133[local22] = -5;
					}
					if (local15.aClass145Array2[local22].anInt5065 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass145Array1[local22] != null) {
					if (local15.aClass145Array1[local22].anInt5065 == 2) {
						local15.anIntArray133[local22] = -6;
					}
					if (local15.aClass145Array1[local22].anInt5065 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method5793(218);
			arg0.method5771(0);
			@Pc(97) int local97 = arg0.anInt6813;
			arg0.method5768(local15.anInt2056);
			for (@Pc(104) int local104 = 0; local104 < local15.anInt2058; local104++) {
				if (local15.anIntArray133[local104] == 0) {
					try {
						@Pc(128) int local128 = local15.anIntArray131[local104];
						@Pc(145) Field local145;
						@Pc(175) int local175;
						if (local128 == 0) {
							local145 = (Field) local15.aClass145Array2[local104].anObject6;
							local175 = local145.getInt(null);
							arg0.method5771(0);
							arg0.method5768(local175);
						} else if (local128 == 1) {
							local145 = (Field) local15.aClass145Array2[local104].anObject6;
							local145.setInt(null, local15.anIntArray134[local104]);
							arg0.method5771(0);
						} else if (local128 == 2) {
							local145 = (Field) local15.aClass145Array2[local104].anObject6;
							local175 = local145.getModifiers();
							arg0.method5771(0);
							arg0.method5768(local175);
						}
						@Pc(219) Method local219;
						if (local128 == 3) {
							local219 = (Method) local15.aClass145Array1[local104].anObject6;
							@Pc(244) byte[][] local244 = local15.aByteArrayArrayArray4[local104];
							@Pc(248) Object[] local248 = new Object[local244.length];
							for (@Pc(250) int local250 = 0; local250 < local244.length; local250++) {
								@Pc(262) ObjectInputStream local262 = new ObjectInputStream(new ByteArrayInputStream(local244[local250]));
								local248[local250] = local262.readObject();
							}
							@Pc(281) Object local281 = local219.invoke(null, local248);
							if (local281 == null) {
								arg0.method5771(0);
							} else if (local281 instanceof Number) {
								arg0.method5771(1);
								arg0.method5753(((Number) local281).longValue());
							} else if (local281 instanceof String) {
								arg0.method5771(2);
								arg0.method5726((String) local281);
							} else {
								arg0.method5771(4);
							}
						} else if (local128 == 4) {
							local219 = (Method) local15.aClass145Array1[local104].anObject6;
							local175 = local219.getModifiers();
							arg0.method5771(0);
							arg0.method5768(local175);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method5771(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method5771(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method5771(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method5771(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method5771(-14);
					} catch (@Pc(358) IllegalArgumentException local358) {
						arg0.method5771(-15);
					} catch (@Pc(364) InvocationTargetException local364) {
						arg0.method5771(-16);
					} catch (@Pc(370) SecurityException local370) {
						arg0.method5771(-17);
					} catch (@Pc(378) IOException local378) {
						arg0.method5771(-18);
					} catch (@Pc(386) NullPointerException local386) {
						arg0.method5771(-19);
					} catch (@Pc(392) Exception local392) {
						arg0.method5771(-20);
					} catch (@Pc(398) Throwable local398) {
						arg0.method5771(-21);
					}
				} else {
					arg0.method5771(local15.anIntArray133[local104]);
				}
			}
			arg0.method5741(local97);
			arg0.method5733(arg0.anInt6813 - local97);
			local15.method6172();
		}
	}
}
