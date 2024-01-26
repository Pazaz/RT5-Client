import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public interface Interface7 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
	int method4094(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
	void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZLjava/awt/Component;B)V")
	void method4096(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V")
	void method4097(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[I)V")
	void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)V")
	void method4099(@OriginalArg(0) int arg0);
}
