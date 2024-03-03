import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class QuickChatCatType extends SecondaryNode {

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
	public int[] phrases;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "[C")
	public char[] subcategoryShortcuts;

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "[I")
	public int[] subcategories;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "[C")
	public char[] phraseShortcuts;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	public void method3793() {
		@Pc(10) int local10;
		if (this.phrases != null) {
			for (local10 = 0; local10 < this.phrases.length; local10++) {
				this.phrases[local10] |= 0x8000;
			}
		}
		if (this.subcategories != null) {
			for (local10 = 0; local10 < this.subcategories.length; local10++) {
				this.subcategories[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(CZ)I")
	public int getSubcategoryByShortcut(@OriginalArg(0) char arg0) {
		if (this.subcategories == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.subcategories.length; local20++) {
			if (this.subcategoryShortcuts[local20] == arg0) {
				return this.subcategories[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILclient!bt;)V")
	private void method3796(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 1) {
			this.aString37 = arg1.gjstr();
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		@Pc(39) byte local39;
		if (arg0 == 2) {
			local16 = arg1.g1();
			this.subcategories = new int[local16];
			this.subcategoryShortcuts = new char[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.subcategories[local26] = arg1.g2();
				local39 = arg1.g1b();
				this.subcategoryShortcuts[local26] = local39 == 0 ? 0 : Static78.forCharKey(local39);
			}
		} else if (arg0 == 3) {
			local16 = arg1.g1();
			this.phraseShortcuts = new char[local16];
			this.phrases = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.phrases[local26] = arg1.g2();
				local39 = arg1.g1b();
				this.phraseShortcuts[local26] = local39 == 0 ? 0 : Static78.forCharKey(local39);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method3797(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method3796(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZC)I")
	public int getPhraseByShortcut(@OriginalArg(1) char arg0) {
		if (this.phrases == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.phrases.length; local17++) {
			if (this.phraseShortcuts[local17] == arg0) {
				return this.phrases[local17];
			}
		}
		return -1;
	}
}
