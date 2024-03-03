import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class AnimBase extends Node {

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	public final int transforms;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
	public final int[] parts;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "[Z")
	public final boolean[] shadow;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "[[I")
	public final int[][] bones;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
	public final int[] types;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[B)V")
	public AnimBase(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.id = arg0;
		@Pc(11) Packet local11 = new Packet(arg1);
		this.transforms = local11.g1();
		this.parts = new int[this.transforms];
		this.shadow = new boolean[this.transforms];
		this.bones = new int[this.transforms][];
		this.types = new int[this.transforms];
		for (@Pc(38) int local38 = 0; local38 < this.transforms; local38++) {
			this.types[local38] = local11.g1();
		}
		for (@Pc(58) int local58 = 0; local58 < this.transforms; local58++) {
			this.shadow[local58] = local11.g1() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.transforms; local85++) {
			this.parts[local85] = local11.g2();
		}
		for (@Pc(101) int local101 = 0; local101 < this.transforms; local101++) {
			this.bones[local101] = new int[local11.g1()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.transforms; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.bones[local118].length; local122++) {
				this.bones[local118][local122] = local11.g1();
			}
		}
	}
}
