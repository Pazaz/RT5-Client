import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public abstract class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
	private final int anInt9579;

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
	private final int anInt9582;

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "F")
	protected float aFloat206;

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
	protected int anInt9583;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
	protected int anInt9581;

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
	protected int anInt9585;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt9579 = arg3;
		this.anInt9582 = arg4;
		this.aFloat206 = arg5;
		this.anInt9583 = arg0;
		this.anInt9581 = arg2;
		this.anInt9585 = arg1;
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)I")
	public final int method8425() {
		return this.anInt9585;
	}

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "(I)I")
	public final int method8426() {
		return this.anInt9583;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)V")
	public abstract void method8427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)F")
	public final float method8428() {
		return this.aFloat206;
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)I")
	public final int method8429() {
		return this.anInt9581;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)I")
	public final int method8431() {
		return this.anInt9582;
	}

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)I")
	public final int method8432() {
		return this.anInt9579;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BF)V")
	public abstract void method8433(@OriginalArg(1) float arg0);
}
