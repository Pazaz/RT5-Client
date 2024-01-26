import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class53 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!av;")
	private Class28 aClass28_9;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	private int anInt1142;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
	private int anInt1144;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "Ljava/lang/String;")
	private String aString5 = "null";

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1221(@OriginalArg(0) String arg0) {
		if (this.anObject3 == null) {
			return false;
		}
		if (this.aClass28_9 == null) {
			this.method1226();
		}
		for (@Pc(30) Class2_Sub46 local30 = (Class2_Sub46) this.aClass28_9.method738(Static203.method3071(arg0)); local30 != null; local30 = (Class2_Sub46) this.aClass28_9.method744()) {
			if (local30.aString100.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!ge;)V")
	public void method1222(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7396();
			if (local12 == 0) {
				return;
			}
			this.method1234(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lclient!nw;")
	public Class2_Sub40 method1223(@OriginalArg(1) int arg0) {
		if (this.anObject3 == null) {
			return null;
		} else {
			if (this.aClass28_9 == null) {
				this.method1236();
			}
			return (Class2_Sub40) this.aClass28_9.method738((long) arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	private void method1226() {
		@Pc(58) Class2_Sub46 local58;
		if (this.anObject3 instanceof Class28) {
			@Pc(203) Class28 local203 = (Class28) this.anObject3;
			this.aClass28_9 = new Class28(local203.method742());
			@Pc(218) Class28 local218 = new Class28(local203.method742());
			for (@Pc(223) Class2_Sub24 local223 = (Class2_Sub24) local203.method736(); local223 != null; local223 = (Class2_Sub24) local203.method740()) {
				@Pc(229) long local229 = Static203.method3071(local223.aString46);
				@Pc(235) Class2_Sub46 local235;
				for (local235 = (Class2_Sub46) local218.method738(local229); local235 != null && !local235.aString100.equals(local223.aString46); local235 = (Class2_Sub46) local218.method744()) {
				}
				if (local235 == null) {
					local235 = new Class2_Sub46(local223.aString46, 0);
					local218.method735(local229, local235);
				}
				local235.anInt8241++;
			}
			for (@Pc(283) Class2_Sub24 local283 = (Class2_Sub24) local203.method736(); local283 != null; local283 = (Class2_Sub24) local203.method740()) {
				@Pc(289) long local289 = Static203.method3071(local283.aString46);
				@Pc(296) Class2_Sub26 local296;
				for (local296 = (Class2_Sub26) this.aClass28_9.method738(local289); local296 != null && !local296.aString47.equals(local283.aString46); local296 = (Class2_Sub26) this.aClass28_9.method744()) {
				}
				for (local58 = (Class2_Sub46) local218.method738(local289); local58 != null && !local58.aString100.equals(local283.aString46); local58 = (Class2_Sub46) local218.method744()) {
				}
				@Pc(339) int local339 = local58.anInt8241--;
				if (local296 == null) {
					local296 = new Class2_Sub26(local283.aString46, local339);
					this.aClass28_9.method735(local289, local296);
				}
				local296.anIntArray318[local296.anIntArray318.length - local339] = (int) local283.aLong328;
			}
			return;
		}
		@Pc(21) String[] local21 = (String[]) this.anObject3;
		@Pc(26) int local26 = Static440.method5962(local21.length);
		this.aClass28_9 = new Class28(local26);
		@Pc(37) Class28 local37 = new Class28(local26);
		for (@Pc(39) int local39 = 0; local39 < local21.length; local39++) {
			if (local21[local39] != null) {
				@Pc(48) String local48 = local21[local39];
				@Pc(52) long local52 = Static203.method3071(local48);
				for (local58 = (Class2_Sub46) local37.method738(local52); local58 != null && !local58.aString100.equals(local48); local58 = (Class2_Sub46) local37.method744()) {
				}
				if (local58 == null) {
					local58 = new Class2_Sub46(local48, 0);
					local37.method735(local52, local58);
				}
				local58.anInt8241++;
			}
		}
		for (@Pc(103) int local103 = 0; local103 < local21.length; local103++) {
			if (local21[local103] != null) {
				@Pc(112) String local112 = local21[local103];
				@Pc(116) long local116 = Static203.method3071(local112);
				@Pc(123) Class2_Sub26 local123;
				for (local123 = (Class2_Sub26) this.aClass28_9.method738(local116); local123 != null && !local123.aString47.equals(local112); local123 = (Class2_Sub26) this.aClass28_9.method744()) {
				}
				@Pc(143) Class2_Sub46 local143;
				for (local143 = (Class2_Sub46) local37.method738(local116); local143 != null && !local143.aString100.equals(local112); local143 = (Class2_Sub46) local37.method744()) {
				}
				@Pc(164) int local164 = local143.anInt8241--;
				if (local123 == null) {
					local123 = new Class2_Sub26(local112, local164);
					this.aClass28_9.method735(local116, local123);
				}
				local123.anIntArray318[local123.anIntArray318.length - local164] = local103;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
	public int method1227(@OriginalArg(0) int arg0) {
		if (this.anObject3 == null) {
			return this.anInt1142;
		} else if (this.anObject3 instanceof Class28) {
			@Pc(30) Class2_Sub38 local30 = (Class2_Sub38) ((Class28) this.anObject3).method738((long) arg0);
			return local30 == null ? this.anInt1142 : local30.anInt6379;
		} else {
			@Pc(43) Integer[] local43 = (Integer[]) this.anObject3;
			if (arg0 >= 0 && arg0 < local43.length) {
				@Pc(66) Integer local66 = local43[arg0];
				return local66 == null ? this.anInt1142 : local66;
			} else {
				return this.anInt1142;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)I")
	public int method1228() {
		return this.anInt1144;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)Ljava/lang/String;")
	public String method1229(@OriginalArg(1) int arg0) {
		if (this.anObject3 == null) {
			return this.aString5;
		} else if (this.anObject3 instanceof Class28) {
			@Pc(31) Class2_Sub24 local31 = (Class2_Sub24) ((Class28) this.anObject3).method738((long) arg0);
			return local31 == null ? this.aString5 : local31.aString46;
		} else {
			@Pc(44) String[] local44 = (String[]) this.anObject3;
			if (arg0 >= 0 && local44.length > arg0) {
				@Pc(64) String local64 = local44[arg0];
				return local64 == null ? this.aString5 : local64;
			} else {
				return this.aString5;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)Z")
	public boolean method1233(@OriginalArg(1) int arg0) {
		if (this.anObject3 == null) {
			return false;
		} else {
			if (this.aClass28_9 == null) {
				this.method1236();
			}
			return this.aClass28_9.method738((long) arg0) != null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!ge;)V")
	private void method1234(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static346.method5084(arg1.method7377());
		} else if (arg0 == 2) {
			this.aChar1 = Static346.method5084(arg1.method7377());
		} else if (arg0 == 3) {
			this.aString5 = arg1.method7358();
		} else if (arg0 == 4) {
			this.anInt1142 = arg1.method7349();
		} else {
			@Pc(69) int local69;
			if (arg0 == 5 || arg0 == 6) {
				this.anInt1144 = arg1.method7382();
				@Pc(62) Class28 local62 = new Class28(Static440.method5962(this.anInt1144));
				for (@Pc(64) int local64 = 0; local64 < this.anInt1144; local64++) {
					local69 = arg1.method7349();
					@Pc(79) Class2 local79;
					if (arg0 == 5) {
						local79 = new Class2_Sub24(arg1.method7358());
					} else {
						local79 = new Class2_Sub38(arg1.method7349());
					}
					local62.method735((long) local69, local79);
				}
				this.anObject3 = local62;
			} else {
				@Pc(114) int local114;
				@Pc(131) int local131;
				if (arg0 == 7) {
					local114 = arg1.method7382();
					this.anInt1144 = arg1.method7382();
					@Pc(124) String[] local124 = new String[local114];
					for (local69 = 0; local69 < this.anInt1144; local69++) {
						local131 = arg1.method7382();
						local124[local131] = arg1.method7358();
					}
					this.anObject3 = local124;
				} else if (arg0 == 8) {
					local114 = arg1.method7382();
					this.anInt1144 = arg1.method7382();
					@Pc(164) Integer[] local164 = new Integer[local114];
					for (local69 = 0; local69 < this.anInt1144; local69++) {
						local131 = arg1.method7382();
						local164[local131] = Integer.valueOf(arg1.method7349());
					}
					this.anObject3 = local164;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
	private void method1236() {
		@Pc(101) int local101;
		if (this.anObject3 instanceof Class28) {
			@Pc(16) Class28 local16 = (Class28) this.anObject3;
			this.aClass28_9 = new Class28(local16.method742());
			@Pc(31) Class28 local31 = new Class28(local16.method742());
			@Pc(45) Class2_Sub38 local45;
			for (@Pc(36) Class2_Sub38 local36 = (Class2_Sub38) local16.method736(); local36 != null; local36 = (Class2_Sub38) local16.method740()) {
				local45 = (Class2_Sub38) local31.method738((long) local36.anInt6379);
				if (local45 == null) {
					local45 = new Class2_Sub38(0);
					local31.method735((long) local36.anInt6379, local45);
				}
				local45.anInt6379++;
			}
			for (local45 = (Class2_Sub38) local16.method736(); local45 != null; local45 = (Class2_Sub38) local16.method740()) {
				@Pc(87) Class2_Sub40 local87 = (Class2_Sub40) this.aClass28_9.method738((long) local45.anInt6379);
				local101 = ((Class2_Sub38) local31.method738((long) local45.anInt6379)).anInt6379--;
				if (local87 == null) {
					local87 = new Class2_Sub40(local101);
					this.aClass28_9.method735((long) local45.anInt6379, local87);
				}
				local87.anIntArray531[local87.anIntArray531.length - local101] = (int) local45.aLong328;
			}
			return;
		}
		@Pc(140) Integer[] local140 = (Integer[]) this.anObject3;
		@Pc(145) int local145 = Static440.method5962(local140.length);
		this.aClass28_9 = new Class28(local145);
		@Pc(156) Class28 local156 = new Class28(local145);
		@Pc(168) int local168;
		for (@Pc(158) int local158 = 0; local158 < local140.length; local158++) {
			if (local140[local158] != null) {
				local168 = local140[local158];
				@Pc(175) Class2_Sub38 local175 = (Class2_Sub38) local156.method738((long) local168);
				if (local175 == null) {
					local175 = new Class2_Sub38(0);
					local156.method735((long) local168, local175);
				}
				local175.anInt6379++;
			}
		}
		for (local168 = 0; local168 < local140.length; local168++) {
			if (local140[local168] != null) {
				local101 = local140[local168];
				@Pc(223) Class2_Sub40 local223 = (Class2_Sub40) this.aClass28_9.method738((long) local101);
				@Pc(236) int local236 = ((Class2_Sub38) local156.method738((long) local101)).anInt6379--;
				if (local223 == null) {
					local223 = new Class2_Sub40(local236);
					this.aClass28_9.method735((long) local101, local223);
				}
				local223.anIntArray531[local223.anIntArray531.length - local236] = local168;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!hu;")
	public Class2_Sub26 method1237(@OriginalArg(0) String arg0) {
		if (this.anObject3 == null) {
			return null;
		}
		if (this.aClass28_9 == null) {
			this.method1226();
		}
		@Pc(26) Class2_Sub26 local26;
		for (local26 = (Class2_Sub26) this.aClass28_9.method738(Static203.method3071(arg0)); local26 != null && !local26.aString47.equals(arg0); local26 = (Class2_Sub26) this.aClass28_9.method744()) {
		}
		return local26;
	}
}
