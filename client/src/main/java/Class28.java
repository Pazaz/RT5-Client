import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class Class28 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public abstract void method709(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public abstract void method712(@OriginalArg(1) Component arg0);

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
	public abstract int method713();
}
