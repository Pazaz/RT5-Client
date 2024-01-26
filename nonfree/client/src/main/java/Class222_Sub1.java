import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class222_Sub1 extends Class222 {

	@OriginalMember(owner = "client!wea", name = "I", descriptor = "[I")
	private int[] anIntArray834;

	@OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
	private int anInt10596;

	@OriginalMember(owner = "client!wea", name = "N", descriptor = "[[B")
	private byte[][] aByteArrayArray37 = new byte[10][];

	@OriginalMember(owner = "client!wea", name = "S", descriptor = "Lclient!ge;")
	private final Class2_Sub21 aClass2_Sub21_16 = new Class2_Sub21((byte[]) null);

	@OriginalMember(owner = "client!wea", name = "O", descriptor = "Lclient!ge;")
	private final Class2_Sub21 aClass2_Sub21_17 = new Class2_Sub21((byte[]) null);

	@OriginalMember(owner = "client!wea", name = "L", descriptor = "Lclient!sb;")
	private final Class330 aClass330_126;

	@OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
	private final int anInt10594;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(ILclient!sb;I)V")
	public Class222_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass330_126 = arg1;
		this.anInt10594 = arg2;
	}

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "(I)V")
	public void method9193(@OriginalArg(0) int arg0) {
		if (this.anIntArray834 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 10 && local12 + this.anInt10596 < this.anIntArray834.length; local12++) {
			if (this.aByteArrayArray37[local12] == null && this.aClass330_126.method7586(0, this.anIntArray834[this.anInt10596 + local12])) {
				this.aByteArrayArray37[local12] = this.aClass330_126.method7595(0, this.anIntArray834[this.anInt10596 + local12]);
			}
		}
		if (arg0 < 93) {
			this.aByteArrayArray37 = null;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "([BI)I")
	@Override
	protected int method9186(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (this.anIntArray834 == null) {
			if (!this.aClass330_126.method7586(0, this.anInt10594)) {
				return 0;
			}
			@Pc(29) byte[] local29 = this.aClass330_126.method7595(0, this.anInt10594);
			if (local29 == null) {
				throw new IllegalStateException("");
			}
			this.aClass2_Sub21_17.aByteArray93 = local29;
			this.aClass2_Sub21_17.anInt8388 = 0;
			local50 = local29.length >> 1;
			this.anIntArray834 = new int[local50];
			for (local56 = 0; local56 < local50; local56++) {
				this.anIntArray834[local56] = this.aClass2_Sub21_17.method7382();
			}
		}
		if (this.anInt10596 >= this.anIntArray834.length) {
			return -1;
		}
		this.method9193(103);
		this.aClass2_Sub21_17.aByteArray93 = arg0;
		this.aClass2_Sub21_17.anInt8388 = 0;
		do {
			if (this.aClass2_Sub21_17.anInt8388 >= this.aClass2_Sub21_17.aByteArray93.length) {
				this.aClass2_Sub21_17.aByteArray93 = null;
				return arg0.length;
			}
			if (this.aClass2_Sub21_16.aByteArray93 == null) {
				if (this.aByteArrayArray37[0] == null) {
					this.aClass2_Sub21_17.aByteArray93 = null;
					return this.aClass2_Sub21_17.anInt8388;
				}
				this.aClass2_Sub21_16.aByteArray93 = this.aByteArrayArray37[0];
			}
			@Pc(143) int local143 = this.aClass2_Sub21_17.aByteArray93.length - this.aClass2_Sub21_17.anInt8388;
			local50 = this.aClass2_Sub21_16.aByteArray93.length - this.aClass2_Sub21_16.anInt8388;
			if (local50 > local143) {
				this.aClass2_Sub21_16.method7344(this.aClass2_Sub21_17.anInt8388, local143, this.aClass2_Sub21_17.aByteArray93);
				this.aClass2_Sub21_17.aByteArray93 = null;
				return arg0.length;
			}
			this.aClass2_Sub21_17.method7386(local50, this.aClass2_Sub21_16.aByteArray93, this.aClass2_Sub21_16.anInt8388);
			this.aClass2_Sub21_16.anInt8388 = 0;
			this.anInt10596++;
			this.aClass2_Sub21_16.aByteArray93 = null;
			for (local56 = 0; local56 < 9; local56++) {
				this.aByteArrayArray37[local56] = this.aByteArrayArray37[local56 + 1];
			}
			this.aByteArrayArray37[9] = null;
		} while (this.anIntArray834.length > this.anInt10596);
		this.aClass2_Sub21_17.aByteArray93 = null;
		return this.aClass2_Sub21_17.anInt8388;
	}
}
