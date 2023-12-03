import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class QuickChatPhraseType extends SecondaryNode {

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray56;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
	public int[] automaticResponses;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Z")
	public boolean aBoolean413 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method5594(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray56 = Static200.method3643('<', arg0.gjstr());
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg1 == 2) {
			local23 = arg0.g1();
			this.automaticResponses = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.automaticResponses[local29] = arg0.g2();
			}
		} else if (arg1 == 3) {
			local23 = arg0.g1();
			this.anIntArray417 = new int[local23];
			this.anIntArrayArray52 = new int[local23][];
			for (local29 = 0; local29 < local23; local29++) {
				@Pc(81) int local81 = arg0.g2();
				this.anIntArray417[local29] = local81;
				this.anIntArrayArray52[local29] = new int[Static41.anIntArray86[local81]];
				for (@Pc(96) int local96 = 0; local96 < Static41.anIntArray86[local81]; local96++) {
					this.anIntArrayArray52[local29][local96] = arg0.g2();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean413 = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
	public int getDynamicCommand(@OriginalArg(1) int arg0) {
		return this.anIntArray417 == null || arg0 < 0 || this.anIntArray417.length < arg0 ? -1 : this.anIntArray417[arg0];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bt;I[I)V")
	public void encodeMessage(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray417 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray417.length; local19++) {
			if (arg1.length <= local19) {
				return;
			}
			@Pc(28) int local28 = Static115.anIntArray234[this.getDynamicCommand(local19)];
			if (local28 > 0) {
				arg0.pVarLong(local28, (long) arg1[local19]);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!bt;)V")
	public void method5599(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method5594(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)I")
	public int getDynamicCommandParam(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray417 == null || arg0 < 0 || this.anIntArray417.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray52[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray52[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray52[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String getText() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray56 == null) {
			return "";
		}
		local10.append(this.aStringArray56[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray56.length; local29++) {
			local10.append("...");
			local10.append(this.aStringArray56[local29]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bt;B)Ljava/lang/String;")
	public String method5602(@OriginalArg(0) Buffer arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray417 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray417.length; local15++) {
				local10.append(this.aStringArray56[local15]);
				local10.append(QuickChatPhraseTypeList.method5770(this.anIntArrayArray52[local15], this.anIntArray417[local15], arg0.gVarLong(Static25.anIntArray33[this.anIntArray417[local15]])));
			}
		}
		local10.append(this.aStringArray56[this.aStringArray56.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(B)I")
	public int getDynamicCommandCount() {
		return this.anIntArray417 == null ? 0 : this.anIntArray417.length;
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(B)V")
	public void method5604() {
		if (this.automaticResponses != null) {
			for (@Pc(11) int local11 = 0; local11 < this.automaticResponses.length; local11++) {
				this.automaticResponses[local11] |= 0x8000;
			}
		}
	}
}
