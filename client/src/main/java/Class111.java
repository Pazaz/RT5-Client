import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class111 {

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public int anInt3862;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public int anInt3863;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
	public boolean aBoolean272;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public int anInt3866;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	public int anInt3870;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public int anInt3860 = 8;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	public int anInt3872 = 16777215;

	static {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			aRectangleArray2[local8] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!il;IZ)V")
	private void method3336(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt3860 = arg1.method5749();
		} else if (arg2 == 2) {
			this.aBoolean272 = true;
		} else if (arg2 == 3) {
			this.anInt3862 = arg1.method5762();
			this.anInt3866 = arg1.method5762();
			this.anInt3864 = arg1.method5762();
		} else if (arg2 == 4) {
			this.anInt3870 = arg1.method5761();
		} else if (arg2 == 5) {
			this.anInt3863 = arg1.method5749();
		} else if (arg2 == 6) {
			this.anInt3872 = arg1.method5755();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!il;B)V")
	public void method3339(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5761();
			if (local5 == 0) {
				return;
			}
			this.method3336(arg0, arg1, local5);
		}
	}
}
