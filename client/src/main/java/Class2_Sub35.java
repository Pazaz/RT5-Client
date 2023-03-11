import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "J")
	public long aLong183;

	static {
		new Class79("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(J)V")
	public Class2_Sub35(@OriginalArg(0) long arg0) {
		this.aLong183 = arg0;
	}
}
