import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class68 {

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	private int anInt2411 = 0;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	private int anInt2410 = -1;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!mi;")
	private Class130 aClass130_8 = new Class130();

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	private final int anInt2412;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	private final int anInt2413;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "[Lclient!sk;")
	private Class1_Sub33[] aClass1_Sub33Array1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2412 = arg0;
		this.anInt2413 = arg1;
		this.anIntArrayArrayArray2 = new int[this.anInt2412][3][arg2];
		this.aClass1_Sub33Array1 = new Class1_Sub33[this.anInt2413];
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[[I")
	public int[][] method2002(@OriginalArg(0) int arg0) {
		if (this.anInt2412 == this.anInt2413) {
			this.aBoolean157 = this.aClass1_Sub33Array1[arg0] == null;
			this.aClass1_Sub33Array1[arg0] = Static259.aClass1_Sub33_3;
			return this.anIntArrayArrayArray2[arg0];
		} else if (this.anInt2412 == 1) {
			this.aBoolean157 = this.anInt2410 != arg0;
			this.anInt2410 = arg0;
			return this.anIntArrayArrayArray2[0];
		} else {
			@Pc(50) Class1_Sub33 local50 = this.aClass1_Sub33Array1[arg0];
			if (local50 == null) {
				this.aBoolean157 = true;
				if (this.anInt2412 <= this.anInt2411) {
					@Pc(70) Class1_Sub33 local70 = (Class1_Sub33) this.aClass130_8.method3759();
					local50 = new Class1_Sub33(arg0, local70.anInt6052);
					this.aClass1_Sub33Array1[local70.anInt6049] = null;
					local70.method6172();
				} else {
					local50 = new Class1_Sub33(arg0, this.anInt2411);
					this.anInt2411++;
				}
				this.aClass1_Sub33Array1[arg0] = local50;
			} else {
				this.aBoolean157 = false;
			}
			this.aClass130_8.method3758(local50);
			return this.anIntArrayArrayArray2[local50.anInt6052];
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public void method2007() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2412; local3++) {
			this.anIntArrayArrayArray2[local3][0] = null;
			this.anIntArrayArrayArray2[local3][1] = null;
			this.anIntArrayArrayArray2[local3][2] = null;
			this.anIntArrayArrayArray2[local3] = null;
		}
		this.aClass1_Sub33Array1 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass130_8.method3754();
		this.aClass130_8 = null;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)[[[I")
	public int[][][] method2008() {
		if (this.anInt2412 != this.anInt2413) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt2412; local26++) {
			this.aClass1_Sub33Array1[local26] = Static259.aClass1_Sub33_3;
		}
		return this.anIntArrayArrayArray2;
	}
}
