import jaggl.opengl;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class200 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!pq;")
	private Class184 aClass184_1;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!al;")
	private Class8_Sub1 aClass8_Sub1_4;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	private int anInt5603 = -1;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	private int anInt5605 = -1;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	private int anInt5604 = 0;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	private int anInt5606 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!ld;")
	private final LinkedList aClass135_33 = new LinkedList();

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	private int anInt5607 = -1;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Z")
	private boolean aBoolean394 = true;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Z")
	private boolean aBoolean395 = true;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
	private int anInt5608 = 0;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "[Lclient!al;")
	private Class8_Sub1[] aClass8_Sub1Array3 = new Class8_Sub1[2];

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Z")
	private boolean aBoolean396 = false;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Z")
	private boolean aBoolean397 = true;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_32;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!ua;")
	private Class228 aClass228_2;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class200(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_32 = arg0;
		if (this.aClass19_Sub1_32.aBoolean36 && this.aClass19_Sub1_32.aBoolean41) {
			this.aClass228_2 = new Class228(this.aClass19_Sub1_32);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!uk;)Z")
	public boolean method5115(@OriginalArg(0) Class2_Sub38 arg0) {
		if (this.aClass228_2 != null) {
			if (arg0.method6308() || arg0.method6300()) {
				if (this.anInt5603 != -1 && this.anInt5605 != -1) {
					arg0.method6306(this.anInt5603, this.anInt5605);
				}
				arg0.aBoolean479 = true;
				this.aClass135_33.addTail(arg0);
				this.method5116();
				return true;
			}
			arg0.method6305();
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
	private void method5116() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class2_Sub38 local11 = (Class2_Sub38) this.aClass135_33.head(); local11 != null; local11 = (Class2_Sub38) this.aClass135_33.next()) {
			local16 = local11.method6301();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method6303();
			local5 |= local11.method6302();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt5607) {
			this.anInt5607 = local45;
			this.aBoolean397 = true;
		}
		local16 = this.anInt5608 > 2 ? 2 : this.anInt5608;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean394 = this.aBoolean397 = true;
		}
		if (local5 != this.aBoolean396) {
			this.aBoolean396 = local5;
			this.aBoolean395 = true;
		}
		this.anInt5608 = local3;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
	public void method5117() {
		if (!this.method5119()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass19_Sub1_32.gl;
		this.aClass19_Sub1_32.method824();
		this.aClass19_Sub1_32.method779(0);
		this.aClass19_Sub1_32.method2898();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class2_Sub38 local35;
		for (@Pc(27) Class2_Sub38 local27 = (Class2_Sub38) this.aClass135_33.head(); local27 != null; local27 = local35) {
			local35 = (Class2_Sub38) this.aClass135_33.next();
			@Pc(39) int local39 = local27.method6303();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method6309(local41, this.aClass8_Sub1Array3[local19], this.aClass8_Sub1_4);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass19_Sub1_32.method830(this.aClass228_2);
					this.aClass19_Sub1_32.method843(0, 0);
					local7.glBegin(GL.GL_QUADS);
					local7.glTexCoord2f(0.0F, (float) this.anInt5605);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5606, this.anInt5604);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5606, this.anInt5604 + this.anInt5605);
					local7.glTexCoord2f((float) this.anInt5603, 0.0F);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5606 + this.anInt5603, this.anInt5604 + this.anInt5605);
					local7.glTexCoord2f((float) this.anInt5603, (float) this.anInt5605);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5606 + this.anInt5603, this.anInt5604);
					local7.glEnd();
				} else {
					this.aClass228_2.method5796(local21);
					local7.glBegin(GL.GL_QUADS);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5605);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5605);
					local7.glTexCoord2f((float) this.anInt5603, (float) this.anInt5605);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5603, this.anInt5605);
					local7.glTexCoord2f((float) this.anInt5603, 0.0F);
					local7.glMultiTexCoord2f(GL.GL_TEXTURE1, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5603, 0);
					local7.glEnd();
				}
				local27.method6307(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!uk;Z)V")
	private void method5118(@OriginalArg(0) Class2_Sub38 arg0) {
		arg0.method6305();
		arg0.aBoolean479 = false;
		arg0.unlink();
		this.method5116();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()Z")
	private boolean method5119() {
		return this.aClass19_Sub1_32.method821() == this.aClass228_2;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	public void method5120() {
		if (this.aClass228_2 != null) {
			this.aClass228_2 = null;
			this.aClass8_Sub1Array3 = null;
			this.aClass184_1 = null;
			this.aClass8_Sub1_4 = null;
			this.aBoolean397 = true;
			this.aBoolean395 = true;
			this.aBoolean394 = true;
			if (!this.aClass135_33.method3550()) {
				for (@Pc(33) Node local33 = this.aClass135_33.head(); local33 != this.aClass135_33.aClass2_130; local33 = local33.next) {
					((Class2_Sub38) local33).method6305();
				}
			}
		}
		this.anInt5603 = this.anInt5605 = -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)Z")
	public boolean method5121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass228_2 == null || this.aClass135_33.method3550()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5603 != arg2 || this.anInt5605 != arg3) {
			this.anInt5603 = arg2;
			this.anInt5605 = arg3;
			for (@Pc(30) Node local30 = this.aClass135_33.head(); local30 != this.aClass135_33.aClass2_130; local30 = local30.next) {
				((Class2_Sub38) local30).method6306(this.anInt5603, this.anInt5605);
			}
			this.aBoolean397 = true;
			this.aBoolean395 = true;
		}
		if (this.aBoolean395) {
			if (this.aClass184_1 != null) {
				this.aClass184_1.method4650();
				this.aClass184_1 = null;
			}
			if (this.aClass8_Sub1_4 != null) {
				this.aClass8_Sub1_4.method6156();
				this.aClass8_Sub1_4 = null;
			}
			if (this.aBoolean396) {
				this.aClass8_Sub1_4 = new Class8_Sub1(this.aClass19_Sub1_32, 34037, 6402, this.anInt5603, this.anInt5605);
			} else {
				this.aClass184_1 = new Class184(this.aClass19_Sub1_32, 6402, this.anInt5603, this.anInt5605);
			}
			this.aBoolean394 = true;
			this.aBoolean395 = false;
			local11 = true;
		}
		if (this.aBoolean397) {
			if (this.aClass8_Sub1Array3[0] != null) {
				this.aClass8_Sub1Array3[0].method6156();
				this.aClass8_Sub1Array3[0] = null;
			}
			if (this.aClass8_Sub1Array3[1] != null) {
				this.aClass8_Sub1Array3[1].method6156();
				this.aClass8_Sub1Array3[1] = null;
			}
			this.aClass8_Sub1Array3[0] = new Class8_Sub1(this.aClass19_Sub1_32, 34037, this.anInt5607, this.anInt5603, this.anInt5605);
			this.aClass8_Sub1Array3[1] = this.anInt5608 > 1 ? new Class8_Sub1(this.aClass19_Sub1_32, 34037, this.anInt5607, this.anInt5603, this.anInt5605) : null;
			this.aBoolean394 = true;
			this.aBoolean397 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass19_Sub1_32.method821().method5793();
		this.aClass19_Sub1_32.method808(this.aClass228_2);
		if (this.aBoolean394) {
			this.aClass228_2.method5798(0);
			this.aClass228_2.method5798(1);
			this.aClass228_2.method5798(8);
			if (this.aClass8_Sub1Array3[0] != null) {
				this.aClass228_2.method5794(0, this.aClass8_Sub1Array3[0]);
			}
			if (this.aClass8_Sub1Array3[1] != null) {
				this.aClass228_2.method5794(1, this.aClass8_Sub1Array3[1]);
			}
			if (this.aClass8_Sub1_4 != null) {
				this.aClass228_2.method5794(8, this.aClass8_Sub1_4);
			}
			if (this.aClass184_1 != null) {
				this.aClass228_2.method5800(this.aClass184_1);
			}
			this.aClass228_2.method5796(0);
			this.aBoolean394 = false;
			local11 = true;
		}
		if (!local11 || this.aClass228_2.method5799()) {
			this.anInt5606 = arg0;
			this.anInt5604 = arg1;
			this.aClass19_Sub1_32.method843(-this.anInt5606, this.anInt5604 + this.anInt5605 - local194);
			return true;
		}
		this.aClass19_Sub1_32.method830(this.aClass228_2);
		this.aBoolean397 = true;
		this.aBoolean395 = true;
		this.aBoolean394 = true;
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!uk;)V")
	public void method5122(@OriginalArg(0) Class2_Sub38 arg0) {
		this.method5118(arg0);
	}
}
