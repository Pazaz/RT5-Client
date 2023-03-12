import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class173_Sub1 extends Class173 {

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
	private final int anInt4779;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
	private final int anInt4785;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	private final int anInt4781;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
	private final int anInt4780;

	static {
		new LocalizedString("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIII)V")
	public Class173_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4779 = arg1;
		this.anInt4785 = arg2;
		this.anInt4781 = arg0;
		this.anInt4780 = arg3;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V")
	@Override
	public void method6250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4781 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4785 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4779 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4780 >> 12;
		Static384.method6416(local31, local17, local10, local24, super.anInt6996);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(III)V")
	@Override
	public void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
