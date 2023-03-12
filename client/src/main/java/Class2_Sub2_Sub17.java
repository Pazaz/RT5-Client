import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class2_Sub2_Sub17 extends SecondaryNode {

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
	public int anInt6864 = -1;

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
	public int anInt6863 = 12800;

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
	public int anInt6874 = 0;

	@OriginalMember(owner = "client!vj", name = "U", descriptor = "Z")
	public boolean aBoolean466 = true;

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
	public int anInt6870 = 12800;

	@OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
	public int anInt6875 = -1;

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
	public int anInt6868 = 0;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
	public final int anInt6869;

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
	public final int anInt6872;

	@OriginalMember(owner = "client!vj", name = "R", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "Lclient!ld;")
	public final LinkedList aClass135_41;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6869 = arg0;
		this.aBoolean466 = arg5;
		this.anInt6875 = arg6;
		this.aString66 = arg2;
		this.anInt6864 = arg4;
		this.anInt6872 = arg3;
		this.aString67 = arg1;
		if (this.anInt6875 == 255) {
			this.anInt6875 = 0;
		}
		this.aClass135_41 = new LinkedList();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[III)Z")
	public boolean method6145(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(17) Class2_Sub31 local17 = (Class2_Sub31) this.aClass135_41.head(); local17 != null; local17 = (Class2_Sub31) this.aClass135_41.next()) {
			if (local17.method5063(arg0, arg3, arg2)) {
				local17.method5059(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z")
	public boolean method6147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub31 local11 = (Class2_Sub31) this.aClass135_41.head(); local11 != null; local11 = (Class2_Sub31) this.aClass135_41.next()) {
			if (local11.method5066(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIII)Z")
	public boolean method6149(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class2_Sub31 local11 = (Class2_Sub31) this.aClass135_41.head(); local11 != null; local11 = (Class2_Sub31) this.aClass135_41.next()) {
			if (local11.method5060(arg1, arg2)) {
				local11.method5061(arg2, arg0, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	public void method6150() {
		this.anInt6870 = 12800;
		this.anInt6863 = 12800;
		this.anInt6868 = 0;
		this.anInt6874 = 0;
		for (@Pc(28) Class2_Sub31 local28 = (Class2_Sub31) this.aClass135_41.head(); local28 != null; local28 = (Class2_Sub31) this.aClass135_41.next()) {
			if (this.anInt6874 < local28.anInt5537) {
				this.anInt6874 = local28.anInt5537;
			}
			if (local28.anInt5547 < this.anInt6863) {
				this.anInt6863 = local28.anInt5547;
			}
			if (this.anInt6868 < local28.anInt5542) {
				this.anInt6868 = local28.anInt5542;
			}
			if (this.anInt6870 > local28.anInt5534) {
				this.anInt6870 = local28.anInt5534;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII[I)Z")
	public boolean method6151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(16) Class2_Sub31 local16 = (Class2_Sub31) this.aClass135_41.head(); local16 != null; local16 = (Class2_Sub31) this.aClass135_41.next()) {
			if (local16.method5066(arg1, arg0)) {
				local16.method5059(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
