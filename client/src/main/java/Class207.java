import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class207 {

	@OriginalMember(owner = "client!up", name = "b", descriptor = "[[Lclient!in;")
	private Class91[][] aClass91ArrayArray1;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Lclient!ms;")
	private final Class77_Sub1 aClass77_Sub1_3;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!ih;")
	private final Class40_Sub2 aClass40_Sub2_38;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "I")
	public final int anInt6626;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "I")
	private final int anInt6623;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "I")
	private final int anInt6624;

	@OriginalMember(owner = "client!up", name = "d", descriptor = "[B")
	public final byte[] aByteArray83;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "I")
	private final int anInt6622;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "I")
	private final int anInt6625;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!ih;Lclient!ms;)V")
	public Class207(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) Class77_Sub1 arg1) {
		this.aClass77_Sub1_3 = arg1;
		this.aClass40_Sub2_38 = arg0;
		this.anInt6626 = (this.aClass77_Sub1_3.anInt4630 * this.aClass77_Sub1_3.anInt4510 >> this.aClass40_Sub2_38.anInt3198) + 2;
		this.anInt6623 = (this.aClass77_Sub1_3.anInt4510 * this.aClass77_Sub1_3.anInt4625 >> this.aClass40_Sub2_38.anInt3198) + 2;
		this.anInt6624 = this.aClass40_Sub2_38.anInt3198 + 7 - this.aClass77_Sub1_3.anInt4506;
		this.aByteArray83 = new byte[this.anInt6626 * this.anInt6623];
		this.anInt6622 = this.aClass77_Sub1_3.anInt4630 >> this.anInt6624;
		this.anInt6625 = this.aClass77_Sub1_3.anInt4625 >> this.anInt6624;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!oc;II)V")
	public void method5639(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub1_Sub6_Sub1 local2 = (Class1_Sub1_Sub6_Sub1) arg1;
		arg0 += local2.anInt1930 + 1;
		arg2 += local2.anInt1931 + 1;
		@Pc(23) int local23 = arg2 * this.anInt6626 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt1929;
		@Pc(31) int local31 = local2.anInt1932;
		@Pc(37) int local37 = this.anInt6626 - local31;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local28 -= local47;
			local23 += this.anInt6626 * local47;
			arg2 = 1;
			local25 = local47 * local31;
		}
		@Pc(68) int local68 = 0;
		if (arg2 + local28 >= this.anInt6623) {
			local47 = arg2 + local28 + 1 - this.anInt6623;
			local28 -= local47;
		}
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local25 += local47;
			local31 -= local47;
			local37 += local47;
			local68 = local47;
			local23 += local47;
			arg0 = 1;
		}
		if (arg0 + local31 >= this.anInt6626) {
			local47 = local31 + arg0 + 1 - this.anInt6626;
			local37 += local47;
			local31 -= local47;
			local68 += local47;
		}
		if (local31 > 0 && local28 > 0) {
			Static369.method5638(this.aByteArray83, local2.aByteArray10, local28, local23, local68, local25, local31, local37);
			this.method5643(arg2, local31, local28, arg0);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILclient!oc;)Z")
	public boolean method5640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub6 arg2) {
		@Pc(2) Class1_Sub1_Sub6_Sub1 local2 = (Class1_Sub1_Sub6_Sub1) arg2;
		arg1 += local2.anInt1931 + 1;
		arg0 += local2.anInt1930 + 1;
		@Pc(24) int local24 = arg0 + arg1 * this.anInt6626;
		@Pc(27) int local27 = local2.anInt1929;
		@Pc(30) int local30 = local2.anInt1932;
		@Pc(38) int local38;
		if (arg1 <= 0) {
			local38 = 1 - arg1;
			local27 -= local38;
			arg1 = 1;
			local24 += local38 * this.anInt6626;
		}
		@Pc(57) int local57 = this.anInt6626 - local30;
		if (arg1 + local27 >= this.anInt6623) {
			local38 = local27 + arg1 + 1 - this.anInt6623;
			local27 -= local38;
		}
		if (arg0 <= 0) {
			local38 = 1 - arg0;
			local57 += local38;
			local24 += local38;
			arg0 = 1;
			local30 -= local38;
		}
		if (arg0 + local30 >= this.anInt6626) {
			local38 = arg0 + local30 + 1 - this.anInt6626;
			local30 -= local38;
			local57 += local38;
		}
		if (local30 > 0 && local27 > 0) {
			local57 += this.anInt6626 * 7;
			return Static369.method5646(local30, local24, this.aByteArray83, local27, local57);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(ILclient!oc;II)V")
	public void method5642(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub1_Sub6_Sub1 local2 = (Class1_Sub1_Sub6_Sub1) arg1;
		arg0 += local2.anInt1930 + 1;
		arg2 += local2.anInt1931 + 1;
		@Pc(23) int local23 = this.anInt6626 * arg2 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt1929;
		@Pc(31) int local31 = local2.anInt1932;
		@Pc(37) int local37 = this.anInt6626 - local31;
		@Pc(46) int local46;
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local23 += local46 * this.anInt6626;
			arg2 = 1;
			local28 -= local46;
			local25 = local46 * local31;
		}
		@Pc(67) int local67 = 0;
		if (arg2 + local28 >= this.anInt6623) {
			local46 = arg2 + local28 + 1 - this.anInt6623;
			local28 -= local46;
		}
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			arg0 = 1;
			local31 -= local46;
			local67 = local46;
			local37 += local46;
			local23 += local46;
			local25 += local46;
		}
		if (this.anInt6626 <= local31 + arg0) {
			local46 = local31 + arg0 + 1 - this.anInt6626;
			local67 += local46;
			local31 -= local46;
			local37 += local46;
		}
		if (local31 > 0 && local28 > 0) {
			Static369.method5641(this.aByteArray83, local67, local23, local2.aByteArray10, local37, local25, local28, local31);
			this.method5643(arg2, local31, local28, arg0);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIII)V")
	private void method5643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass91ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg3 - 1 >> 7;
		@Pc(19) int local19 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(25) int local25 = arg0 - 1 >> 7;
		@Pc(33) int local33 = arg2 + arg0 - 2 >> 7;
		for (@Pc(35) int local35 = local9; local35 <= local19; local35++) {
			@Pc(43) Class91[] local43 = this.aClass91ArrayArray1[local35];
			for (@Pc(45) int local45 = local25; local45 <= local33; local45++) {
				local43[local45].aBoolean233 = true;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIZ[[ZI)V")
	public void method5644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) opengl local3 = this.aClass40_Sub2_38.anOpengl1;
		this.aClass40_Sub2_38.method2883();
		this.aClass40_Sub2_38.method2860(false);
		this.aClass40_Sub2_38.method2880(false);
		this.aClass40_Sub2_38.method2857();
		this.aClass40_Sub2_38.method2877(0);
		this.aClass40_Sub2_38.method2819(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass40_Sub2_38.anInt3193 * 128);
		@Pc(39) int local39;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(82) int local82;
		@Pc(84) int local84;
		if (arg2) {
			for (local39 = 0; local39 < this.anInt6625; local39++) {
				local52 = local39 << this.anInt6624;
				local59 = local39 + 1 << this.anInt6624;
				label83: for (local61 = 0; local61 < this.anInt6622; local61++) {
					local67 = local61 << this.anInt6624;
					local72 = local61 + 1 << this.anInt6624;
					for (local82 = local67; local82 < local72; local82++) {
						if (-arg0 <= local82 - arg1 && local82 - arg1 <= arg0) {
							for (local84 = local52; local84 < local59; local84++) {
								if (local84 - arg4 >= -arg0 && local84 - arg4 <= arg0 && arg3[arg0 + local82 - arg1][arg0 + local84 - arg4]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass91ArrayArray1[local61][local39].method2968();
									continue label83;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt6625; local39++) {
				local52 = local39 << this.anInt6624;
				local59 = local39 + 1 << this.anInt6624;
				for (local61 = 0; local61 < this.anInt6622; local61++) {
					local67 = 0;
					local72 = local61 << this.anInt6624;
					Static196.aClass1_Sub16_4.anInt6813 = 0;
					local82 = local61 + 1 << this.anInt6624;
					for (local84 = local52; local84 < local59; local84++) {
						if (local84 - arg4 >= -arg0 && arg0 >= local84 - arg4) {
							@Pc(112) int local112 = local72 + this.aClass77_Sub1_3.anInt4630 * local84;
							for (@Pc(114) int local114 = local72; local114 < local82; local114++) {
								if (local114 - arg1 >= -arg0 && arg0 >= local114 - arg1 && arg3[local114 + arg0 - arg1][local84 + arg0 - arg4]) {
									@Pc(153) short[] local153 = this.aClass77_Sub1_3.aShortArrayArray4[local112];
									if (local153 != null) {
										@Pc(161) int local161;
										if (this.aClass40_Sub2_38.aBoolean216) {
											for (local161 = 0; local161 < local153.length; local161++) {
												Static196.aClass1_Sub16_4.method5757(local153[local161]);
												local67++;
											}
										} else {
											for (local161 = 0; local161 < local153.length; local161++) {
												local67++;
												Static196.aClass1_Sub16_4.method5779(local153[local161]);
											}
										}
									}
								}
								local112++;
							}
						}
					}
					if (local67 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass40_Sub2_38.anInterface7_3.method6094(Static196.aClass1_Sub16_4.aByteArray86, local67 * 2);
						this.aClass91ArrayArray1[local61][local39].method2969(local67, this.aClass40_Sub2_38.anInterface7_3);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	public void method5645() {
		this.aClass91ArrayArray1 = new Class91[this.anInt6622][this.anInt6625];
		for (@Pc(8) int local8 = 0; local8 < this.anInt6625; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt6622; local14++) {
				this.aClass91ArrayArray1[local14][local8] = new Class91(this.aClass40_Sub2_38, this, this.aClass77_Sub1_3, local14, local8, this.anInt6624, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}
}
