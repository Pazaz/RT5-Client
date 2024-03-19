import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!of", name = "B", descriptor = "Lclient!sf;")
	private Class183 aClass183_26;

	@OriginalMember(owner = "client!of", name = "F", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!of", name = "N", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "Lclient!sf;")
	public Class183 aClass183_27;

	@OriginalMember(owner = "client!of", name = "R", descriptor = "I")
	private int anInt4906;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "Ljava/lang/String;")
	private String aString175 = "null";

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!il;I)V")
	private void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static344.method6059(arg1.method5772());
		} else if (arg0 == 2) {
			this.aChar4 = Static344.method6059(arg1.method5772());
		} else if (arg0 == 3) {
			this.aString175 = arg1.method5776();
		} else if (arg0 == 4) {
			this.anInt4906 = arg1.method5730();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(52) int local52 = arg1.method5749();
			this.aClass183_27 = new Class183(Static162.method3414(local52));
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				@Pc(68) int local68 = arg1.method5730();
				@Pc(78) Class1 local78;
				if (arg0 == 5) {
					local78 = new Class1_Sub31(arg1.method5776());
				} else {
					local78 = new Class1_Sub26(arg1.method5730());
				}
				this.aClass183_27.method5055((long) local68, local78);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4206(@OriginalArg(1) String arg0) {
		if (this.aClass183_27 == null) {
			return false;
		}
		if (this.aClass183_26 == null) {
			this.method4207();
		}
		for (@Pc(27) Class1_Sub5 local27 = (Class1_Sub5) this.aClass183_26.method5053(Static15.method449(arg0)); local27 != null; local27 = (Class1_Sub5) this.aClass183_26.method5048()) {
			if (local27.aString32.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
	private void method4207() {
		this.aClass183_26 = new Class183(this.aClass183_27.method5057());
		for (@Pc(22) Class1_Sub31 local22 = (Class1_Sub31) this.aClass183_27.method5052(); local22 != null; local22 = (Class1_Sub31) this.aClass183_27.method5050()) {
			@Pc(33) Class1_Sub5 local33 = new Class1_Sub5(local22.aString205, (int) local22.aLong235);
			this.aClass183_26.method5055(Static15.method449(local22.aString205), local33);
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
	private void method4209() {
		this.aClass183_26 = new Class183(this.aClass183_27.method5057());
		for (@Pc(26) Class1_Sub26 local26 = (Class1_Sub26) this.aClass183_27.method5052(); local26 != null; local26 = (Class1_Sub26) this.aClass183_27.method5050()) {
			@Pc(35) Class1_Sub26 local35 = new Class1_Sub26((int) local26.aLong235);
			this.aClass183_26.method5055((long) local26.anInt4811, local35);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)Z")
	public boolean method4210(@OriginalArg(0) int arg0) {
		if (this.aClass183_27 == null) {
			return false;
		}
		if (this.aClass183_26 == null) {
			this.method4209();
		}
		@Pc(22) Class1_Sub26 local22 = (Class1_Sub26) this.aClass183_26.method5053((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method4212(@OriginalArg(1) int arg0) {
		if (this.aClass183_27 == null) {
			return this.aString175;
		} else {
			@Pc(25) Class1_Sub31 local25 = (Class1_Sub31) this.aClass183_27.method5053((long) arg0);
			return local25 == null ? this.aString175 : local25.aString205;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!il;I)V")
	public void method4214(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5761();
			if (local5 == 0) {
				return;
			}
			this.method4205(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)I")
	public int method4216(@OriginalArg(0) int arg0) {
		if (this.aClass183_27 == null) {
			return this.anInt4906;
		} else {
			@Pc(23) Class1_Sub26 local23 = (Class1_Sub26) this.aClass183_27.method5053((long) arg0);
			return local23 == null ? this.anInt4906 : local23.anInt4811;
		}
	}
}
