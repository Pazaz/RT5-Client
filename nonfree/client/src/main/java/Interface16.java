import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public interface Interface16 extends Interface21 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Z")
	boolean method3153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	void method8538();

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
	boolean method3154();

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method3155();
}
