import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public abstract class Class222 {

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Z")
	private boolean aBoolean799;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "Lclient!un;")
	private Class2_Sub28_Sub4 aClass2_Sub28_Sub4_2;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
	private boolean aBoolean800;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "Z")
	private boolean aBoolean801;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
	private boolean aBoolean802;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!ik;")
	private Class2_Sub28_Sub1 aClass2_Sub28_Sub1_2;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "Lclient!mda;")
	private Class2_Sub28_Sub3 aClass2_Sub28_Sub3_2;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Ljava/lang/String;")
	private String aString127;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "[B")
	private final byte[] aByteArray110;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "Lclient!jagtheora/ogg/OggSyncState;")
	private final OggSyncState anOggSyncState2;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Lclient!jagtheora/ogg/OggPage;")
	private final OggPage anOggPage2;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "Lclient!jagtheora/ogg/OggPacket;")
	private final OggPacket anOggPacket2;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "Lclient!av;")
	private final Class28 aClass28_45;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	protected Class222(@OriginalArg(0) int arg0) {
		if (!Static14.method179("jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		this.aByteArray110 = new byte[arg0];
		this.anOggSyncState2 = new OggSyncState();
		this.anOggPage2 = new OggPage();
		this.anOggPacket2 = new OggPacket();
		this.aClass28_45 = new Class28(8);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Lclient!kb;")
	private Class2_Sub28 method9172() throws IOException {
		if (this.aBoolean800) {
			throw new IllegalStateException();
		} else if (this.aBoolean799) {
			return null;
		} else {
			@Pc(25) int local25;
			while (this.anOggSyncState2.pageOut(this.anOggPage2) <= 0) {
				local25 = this.method9186(this.aByteArray110);
				if (local25 == -1) {
					this.aBoolean799 = true;
					return null;
				}
				if (local25 == 0) {
					return null;
				}
				if (!this.anOggSyncState2.write(this.aByteArray110, local25)) {
					throw new RuntimeException("");
				}
			}
			local25 = this.anOggPage2.getSerialNumber();
			if (!this.anOggPage2.isBOS()) {
				@Pc(81) Class2_Sub28 local81 = (Class2_Sub28) this.aClass28_45.method738((long) local25);
				if (!local81.anOggStreamState5.pageIn(this.anOggPage2)) {
					throw new IllegalStateException();
				}
				return local81;
			}
			@Pc(99) OggStreamState local99 = new OggStreamState(local25);
			if (!local99.pageIn(this.anOggPage2)) {
				throw new IllegalStateException();
			} else if (local99.packetPeek(this.anOggPacket2) == 1) {
				@Pc(188) Class2_Sub28 local188;
				if (this.aClass2_Sub28_Sub3_2 == null && this.anOggPacket2.isTheora()) {
					this.aClass2_Sub28_Sub3_2 = new Class2_Sub28_Sub3(local99);
					local188 = this.aClass2_Sub28_Sub3_2;
				} else if (this.aClass2_Sub28_Sub1_2 == null && this.anOggPacket2.isVorbis()) {
					this.aClass2_Sub28_Sub1_2 = new Class2_Sub28_Sub1(local99);
					local188 = this.aClass2_Sub28_Sub1_2;
				} else {
					@Pc(144) byte[] local144 = this.anOggPacket2.getData();
					@Pc(148) StringBuffer local148 = new StringBuffer();
					for (@Pc(150) int local150 = 1; local144.length > local150 && Character.isLetterOrDigit((char) local144[local150]); local150++) {
						local148.append((char) local144[local150]);
					}
					@Pc(175) String local175 = local148.toString();
					if (local175.equals("kate")) {
						local188 = new Class2_Sub28_Sub4(local99);
					} else {
						local188 = new Class2_Sub28_Sub2(local99);
					}
				}
				this.aClass28_45.method735((long) local25, local188);
				return local188;
			} else {
				throw new IllegalStateException();
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public final void method9174(@OriginalArg(0) boolean arg0) {
		if (this.aClass2_Sub28_Sub1_2 != null) {
			@Pc(7) Class2_Sub6_Sub5 local7 = this.aClass2_Sub28_Sub1_2.method3960();
			if (local7 != null) {
				local7.method9146(arg0);
			}
		}
		this.aBoolean802 = !this.aBoolean802;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	private void method9175() throws IOException {
		while (this.aClass2_Sub28_Sub3_2.anOggStreamState5.packetOut(this.anOggPacket2) != 1) {
			@Pc(11) Class2_Sub28 local11 = this.method9172();
			if (local11 == null) {
				if (this.aBoolean799) {
					this.method9188();
				}
				return;
			}
			if (local11 == this.aClass2_Sub28_Sub4_2) {
				this.method9180((byte) -97);
			}
		}
		this.aClass2_Sub28_Sub3_2.method8556(this.anOggPacket2);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
	private boolean method9176() {
		if (this.aClass2_Sub28_Sub1_2 == null) {
			@Pc(42) double local42 = (double) this.aClass2_Sub28_Sub3_2.method5488();
			return local42 == 0.0D || (double) Static588.method7715() >= 1000.0D / local42 + (double) this.aClass2_Sub28_Sub3_2.method5496();
		} else {
			return !this.aClass2_Sub28_Sub3_2.method5498() || this.method9185() > this.aClass2_Sub28_Sub3_2.method5497();
		}
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)Z")
	public final boolean method9177() {
		if (this.aBoolean800 || this.aBoolean799) {
			return this.aClass2_Sub28_Sub1_2 == null || this.aClass2_Sub28_Sub1_2.method3965() <= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Lclient!un;")
	public final Class2_Sub28_Sub4 method9178() {
		return this.aClass2_Sub28_Sub4_2;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public final void method9179() throws IOException {
		if (this.aBoolean802) {
			return;
		}
		while (!this.aBoolean800) {
			@Pc(26) Class2_Sub28 local26;
			if (this.aBoolean801) {
				local26 = (Class2_Sub28) this.aClass28_45.method738((long) this.anOggPage2.getSerialNumber());
			} else {
				local26 = this.method9172();
				if (local26 == null) {
					if (this.aBoolean799) {
						this.method9188();
					}
					return;
				}
				if (local26 == null) {
					throw new IllegalStateException();
				}
				this.aBoolean801 = true;
			}
			if (local26 == this.aClass2_Sub28_Sub1_2) {
				if (this.aClass2_Sub28_Sub1_2.method3965() >= 50) {
					return;
				}
				while (this.aClass2_Sub28_Sub1_2.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					this.aClass2_Sub28_Sub1_2.method8556(this.anOggPacket2);
					this.method9180((byte) -94);
					if (this.aClass2_Sub28_Sub3_2 != null) {
						@Pc(185) double local185 = this.aClass2_Sub28_Sub3_2.method5497();
						for (@Pc(187) int local187 = 0; local187 < 10 && this.method9176(); local187++) {
							this.method9175();
							if (this.aBoolean800) {
								return;
							}
						}
						if (this.aClass2_Sub28_Sub3_2.method5497() > local185) {
							return;
						}
					}
					if (this.aClass2_Sub28_Sub1_2.method3965() >= 50) {
						return;
					}
				}
			} else if (local26 instanceof Class2_Sub28_Sub4) {
				this.method9180((byte) -106);
			} else if (this.aClass2_Sub28_Sub3_2 != local26) {
				while (local26.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					if (local26.anInt9753 == 1 && local26 instanceof Class2_Sub28_Sub4) {
						this.method9183(this.aString127);
					}
					local26.method8556(this.anOggPacket2);
				}
			} else if (this.aClass2_Sub28_Sub1_2 == null && !this.aBoolean802) {
				for (@Pc(88) int local88 = 0; local88 < 10 && this.method9176(); local88++) {
					this.method9175();
					if (this.aBoolean800) {
						return;
					}
				}
				return;
			}
			this.aBoolean801 = false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	private void method9180(@OriginalArg(0) byte arg0) {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass28_45.method736(); local11 != null; local11 = (Class2_Sub28) this.aClass28_45.method740()) {
			if (local11 instanceof Class2_Sub28_Sub4) {
				@Pc(21) Class2_Sub28_Sub4 local21 = (Class2_Sub28_Sub4) local11;
				while ((local21.anInt9753 <= 8 || this.method9185() > (double) local21.method8566()) && local21.anOggStreamState5.packetOut(this.anOggPacket2) == 1) {
					local21.method8556(this.anOggPacket2);
				}
			}
		}
		this.method9183(this.aString127);
		if (arg0 >= -91) {
			this.aBoolean800 = false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
	public final void method9181() {
		if (this.aBoolean800) {
			return;
		}
		for (@Pc(14) Class2_Sub28 local14 = (Class2_Sub28) this.aClass28_45.method736(); local14 != null; local14 = (Class2_Sub28) this.aClass28_45.method740()) {
			local14.method8560();
			local14.anOggStreamState5.a();
		}
		this.anOggPacket2.a();
		this.anOggPage2.a();
		this.anOggSyncState2.a();
		this.aBoolean800 = true;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method9183(@OriginalArg(1) String arg0) {
		this.aString127 = arg0;
		if (this.aString127 == null) {
			this.aClass2_Sub28_Sub4_2 = null;
			return;
		}
		if (this.aClass2_Sub28_Sub4_2 != null && !this.aString127.equals(this.aClass2_Sub28_Sub4_2.method8563())) {
			this.aClass2_Sub28_Sub4_2 = null;
		}
		if (this.aClass2_Sub28_Sub4_2 != null) {
			return;
		}
		for (@Pc(50) Class2_Sub28 local50 = (Class2_Sub28) this.aClass28_45.method736(); local50 != null; local50 = (Class2_Sub28) this.aClass28_45.method740()) {
			if (local50 instanceof Class2_Sub28_Sub4) {
				@Pc(57) Class2_Sub28_Sub4 local57 = (Class2_Sub28_Sub4) local50;
				if (this.aString127.equals(local57.method8563())) {
					this.aClass2_Sub28_Sub4_2 = local57;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)D")
	public final double method9185() {
		if (this.aClass2_Sub28_Sub1_2 == null) {
			return this.aClass2_Sub28_Sub3_2 == null ? 0.0D : this.aClass2_Sub28_Sub3_2.method5497();
		} else {
			return this.aClass2_Sub28_Sub1_2.method3963();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([BI)I")
	protected abstract int method9186(@OriginalArg(0) byte[] arg0) throws IOException;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)Lclient!mda;")
	public final Class2_Sub28_Sub3 method9187() {
		return this.aClass2_Sub28_Sub3_2;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	private void method9188() {
		for (@Pc(7) Class2_Sub28 local7 = (Class2_Sub28) this.aClass28_45.method736(); local7 != null; local7 = (Class2_Sub28) this.aClass28_45.method740()) {
			if (local7 != this.aClass2_Sub28_Sub3_2) {
				while (local7.anOggStreamState5.packetOut() == 1) {
					local7.method8556(this.anOggPacket2);
				}
			}
		}
		if (this.aClass2_Sub28_Sub3_2 == null) {
			return;
		}
		for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
			if (!this.method9176()) {
				return;
			}
			if (this.aClass2_Sub28_Sub3_2.anOggStreamState5.packetOut() != 1) {
				this.method9181();
				return;
			}
			this.aClass2_Sub28_Sub3_2.method8556(this.anOggPacket2);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Lclient!ik;")
	public final Class2_Sub28_Sub1 method9189() {
		return this.aClass2_Sub28_Sub1_2;
	}
}
