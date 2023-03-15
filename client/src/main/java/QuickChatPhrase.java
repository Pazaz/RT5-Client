import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class QuickChatPhrase {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "[I")
	public int[] values;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!tb;")
	public QuickChatPhraseType type;
}
