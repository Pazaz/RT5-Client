import java.net.URL;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class ClassLoader_Sub1 extends ClassLoader implements Interface28 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable8 = new Hashtable();

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Lloader!unpack;")
	private final unpack anUnpack1;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/security/ProtectionDomain;")
	private final ProtectionDomain aProtectionDomain1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Lloader!unpack;)V")
	public ClassLoader_Sub1(@OriginalArg(0) unpack arg0) {
		this.anUnpack1 = arg0;
		@Pc(18) CodeSource local18 = new CodeSource((URL) null, (Certificate[]) null);
		@Pc(22) Permissions local22 = new Permissions();
		local22.add(new AllPermission());
		this.aProtectionDomain1 = new ProtectionDomain(local18, local22);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)V")
	@Override
	public void method9465(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		this.aHashtable8.put(arg0, arg1);
	}

	@OriginalMember(owner = "loader!a", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	@Override
	public synchronized Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException {
		@Pc(5) Class local5 = (Class) this.aHashtable8.get(arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = this.anUnpack1.method9467(arg0);
		if (local16 == null) {
			return super.findSystemClass(arg0);
		}
		local5 = this.defineClass(arg0, local16, 0, local16.length, this.aProtectionDomain1);
		if (arg1) {
			this.resolveClass(local5);
		}
		this.aHashtable8.put(arg0, local5);
		return local5;
	}
}
