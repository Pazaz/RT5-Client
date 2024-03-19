import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class201 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
	private int anInt6505 = -1;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	private int anInt6513 = 0;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!mi;")
	private Class130 aClass130_38 = new Class130();

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "Z")
	public boolean aBoolean471 = false;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	private final int anInt6510;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	private final int anInt6511;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "[Lclient!wq;")
	private Class1_Sub43[] aClass1_Sub43Array1;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
	public Class201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6510 = arg1;
		this.anInt6511 = arg0;
		this.anIntArrayArray45 = new int[this.anInt6511][arg2];
		this.aClass1_Sub43Array1 = new Class1_Sub43[this.anInt6510];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[I")
	public int[] method5513(@OriginalArg(0) int arg0) {
		if (this.anInt6510 == this.anInt6511) {
			this.aBoolean471 = this.aClass1_Sub43Array1[arg0] == null;
			this.aClass1_Sub43Array1[arg0] = Static298.aClass1_Sub43_1;
			return this.anIntArrayArray45[arg0];
		} else if (this.anInt6511 == 1) {
			this.aBoolean471 = this.anInt6505 != arg0;
			this.anInt6505 = arg0;
			return this.anIntArrayArray45[0];
		} else {
			@Pc(53) Class1_Sub43 local53 = this.aClass1_Sub43Array1[arg0];
			if (local53 == null) {
				this.aBoolean471 = true;
				if (this.anInt6511 > this.anInt6513) {
					local53 = new Class1_Sub43(arg0, this.anInt6513);
					this.anInt6513++;
				} else {
					@Pc(88) Class1_Sub43 local88 = (Class1_Sub43) this.aClass130_38.method3759();
					local53 = new Class1_Sub43(arg0, local88.anInt7381);
					this.aClass1_Sub43Array1[local88.anInt7383] = null;
					local88.method6172();
				}
				this.aClass1_Sub43Array1[arg0] = local53;
			} else {
				this.aBoolean471 = false;
			}
			this.aClass130_38.method3758(local53);
			return this.anIntArrayArray45[local53.anInt7381];
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)[[I")
	public int[][] method5514() {
		if (this.anInt6511 != this.anInt6510) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6511; local25++) {
			this.aClass1_Sub43Array1[local25] = Static298.aClass1_Sub43_1;
		}
		return this.anIntArrayArray45;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	public void method5515() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6511; local9++) {
			this.anIntArrayArray45[local9] = null;
		}
		this.aClass1_Sub43Array1 = null;
		this.anIntArrayArray45 = null;
		this.aClass130_38.method3754();
		this.aClass130_38 = null;
	}
}
