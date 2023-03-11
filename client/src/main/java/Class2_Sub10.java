import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	public final int anInt1759;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
	public final int anInt1758;

	static {
		new Class79("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V")
	public Class2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1759 = arg1;
		this.anInt1758 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)I")
	public int method1850() {
		return this.anInt1758 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)Z")
	public boolean method1851() {
		return (this.anInt1758 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)I")
	public int method1852() {
		return Static13.method346(this.anInt1758);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Z")
	public boolean method1853() {
		return (this.anInt1758 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Z")
	public boolean method1854(@OriginalArg(0) int arg0) {
		return (this.anInt1758 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Z")
	public boolean method1855() {
		return (this.anInt1758 & 0x1) != 0;
	}
}
